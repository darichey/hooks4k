package com.darichey.github.objects

data class Comment(val url: String,
				   val html_url: String,
				   val id: Long,
				   val user: Sender,
				   val position: Int,
				   val line: Int,
				   val path: String,
				   val commit_id: String,
				   val created_at: String,
				   val updated_at: String,
				   val body: String,
				   val _links: Links)