package com.darichey.github

import com.darichey.github.event.*
import com.github.salomonbrys.kotson.typeToken
import com.google.gson.Gson
import io.netty.handler.codec.http.HttpContent
import org.wasabifx.wasabi.app.AppConfiguration
import org.wasabifx.wasabi.app.AppServer
import org.wasabifx.wasabi.routing.RouteHandler

class Webhooks(val route: String, config: AppConfiguration = AppConfiguration()) {

	val events = EventBus()
	val gson = Gson()

	private val server = AppServer(config)

	val handlePost: RouteHandler.() -> Unit = {
		val content = String((request.httpRequest as HttpContent).content().copy().array())
		when (request.rawHeaders["x-github-event"]) {
			"commit_comment" -> post<CommitCommentEvent>(content)
			"create" -> post<CreateEvent>(content)
			"delete" -> post<DeleteEvent>(content)
			"deployment" -> post<DeploymentEvent>(content)
			"deployment_status" -> post<DeploymentStatusEvent>(content)
			"fork" -> post<ForkEvent>(content)
			"gollum" -> post<GollumEvent>(content)
			"issue_comment" -> post<IssueCommentEvent>(content)
			"issues" -> post<IssuesEvent>(content)
			"label" -> post<LabelEvent>(content)
			"member" -> post<MemberEvent>(content)
			"membership" -> post<MembershipEvent>(content)
			"milestone" -> post<MilestoneEvent>(content)
			"organization" -> post<OrganizationEvent>(content)
			"page_build" -> post<PageBuildEvent>(content)
			"public" -> post<PublicEvent>(content)
			"pull_request_review_comment" -> post<PullRequestReviewCommentEvent>(content)
			"pull_request_review" -> post<PullRequestReviewEvent>(content)
			"pull_request" -> post<PullRequestEvent>(content)
			"push" -> post<PushEvent>(content)
			"repository" -> post<RepositoryEvent>(content)
			"release" -> post<ReleaseEvent>(content)
			"status" -> post<StatusEvent>(content)
			"watch" -> post<WatchEvent>(content)
			else -> {
				error("Everything is broken please send help. Unhandled: $content")
			}
		}
	}

	init {
		server.post(route, handlePost)
	}

	fun start(wait: Boolean = true) = server.start(wait)

	inline fun <reified T : Event> post(content: String) {
		events.post(gson.fromJson(content, typeToken<T>()))
	}
}