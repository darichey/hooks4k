package com.darichey.github.objects

data class Sender(val login: String,
				  val id: Long,
				  val avatar_url: String,
				  val gravatar_url: String,
				  val url: String,
				  val html_url: String,
				  val followers_url: String,
				  val following_url: String,
				  val gists_url: String,
				  val starred_url: String,
				  val subscriptions_url: String,
				  val organizations_url: String,
				  val repos_url: String,
				  val events_url: String,
				  val received_events_url: String,
				  val type: String,
				  val site_admin: Boolean)