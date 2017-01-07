package com.darichey.github.objects

data class Hook(val id: Int,
				val url: String,
				val test_url: String,
				val ping_url: String,
				val name: String,
				val events: List<String>,
				val active: Boolean,
				val config: Config,
				val updated_at: String,
				val created_at: String)

data class Config(val url: String,
				  val content_type: String,
				  val insecure_ssl: String)