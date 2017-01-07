package com.darichey.github.objects

data class PageBuild(val url: String,
					 val status: String,
					 val error: BuildError,
					 val pusher: Sender,
					 val commit: String,
					 val duration: Int,
					 val created_at: String,
					 val updated_at: String)

data class BuildError(val message: String)
