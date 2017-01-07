package com.darichey.github.objects

data class Review(val id: Long,
				  val user: Sender,
				  val body: String,
				  val submitted_at: String,
				  val state: String,
				  val html_url: String,
				  val pull_request_url: String,
				  val _links: Links)