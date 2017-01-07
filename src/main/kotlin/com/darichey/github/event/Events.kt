package com.darichey.github.event

import com.darichey.github.objects.*

open class GithubEvent : Event {
	lateinit var sender: Sender
	lateinit var repository: Repository
}

class CommitCommentEvent(val action: String,
						 val comment: Comment) : GithubEvent()

class CreateEvent(val ref_type: String,
				  val ref: String,
				  val master_branch: String,
				  val description: String,
				  val pusher_type: String) : GithubEvent()

class DeleteEvent(val ref_type: String,
				  val ref: String,
				  val pusher_type: String) : GithubEvent()

class DeploymentEvent(val deployment: Deployment) : GithubEvent()

class DeploymentStatusEvent(val deployment_status: DeploymentStatus,
							val deployment: Deployment) : GithubEvent()

class ForkEvent(val forkee: Repository) : GithubEvent()

class GollumEvent(val pages: List<Page>) : GithubEvent()

class IssueCommentEvent(val action: String,
						val issue: Issue,
						val comment: Comment) : GithubEvent() // TODO: Changes

class IssuesEvent(val action: String,
				  val issue: Issue,
				  val assignee: Sender,
				  val label: Label) : GithubEvent() // TODO: Changes

class LabelEvent(val action: String,
				 val label: Label,
				 val organization: Organization) : GithubEvent() // TODO: Changes

class MemberEvent(val member: Sender,
				  val action: String) : GithubEvent() // TODO: Changes


class MilestoneEvent(val action: String,
					 val milestone: Milestone,
					 val organization: Organization) : GithubEvent() // TODO: Changes

class PageBuildEvent(val id: Long,
					 val build: PageBuild) : GithubEvent()

class PublicEvent : GithubEvent()

class PullRequestReviewCommentEvent(val action: String,
									val pull_request: PullRequest,
									val comment: Comment) : GithubEvent() // TODO: Changes

class PullRequestReviewEvent(val action: String,
							 val pull_request: PullRequest,
							 val review: Review) : GithubEvent()

class PullRequestEvent(val action: String,
					   val number: Int,
					   val pull_request: PullRequest) : GithubEvent() // TODO: Changes

class PushEvent(val ref: String,
				val before: String,
				val after: String,
				val created: Boolean,
				val deleted: Boolean,
				val forced: Boolean,
				val base_ref: String,
				val compare: String,
				val commits: List<Commit>,
				val head_commit: Commit,
				val pusher: Sender) : GithubEvent()

class RepositoryEvent(val action: String,
					  val organization: Organization) : GithubEvent()

class ReleaseEvent(val action: String,
				   val release: Release) : GithubEvent()

class StatusEvent(val id: Long,
				  val name: String,
				  val context: String,
				  val sha: String,
				  val state: String,
				  val description: String,
				  val target_url: String,
				  val branches: List<Branch>) : GithubEvent()

class WatchEvent(val action: String) : GithubEvent()

class PingEvent(val zen: String,
				val hook_id: String,
				val hook: Hook) : GithubEvent()