package com.darichey.github.objects

data class Team(val id: Long,
				val url: String,
				val slug: String,
				val description: String,
				val privacy: String,
				val permission: String,
				val members_url: String,
				val repositories_url: String,
				val members_count: Int,
				val repos_count: Int,
				val organization: Organization)