package com.darichey.github.objects

data class Milestone(val url: String,
					 val html_url: String,
					 val labels_url: String,
					 val id: Long,
					 val number: Int,
					 val state: String,
					 val title: String,
					 val description: String,
					 val creator: Sender,
					 val open_issues: Int,
					 val closed_issues: Int,
					 val created_at: String,
					 val updated_at: String,
					 val closed_at: String,
					 val due_on: String)