package com.darichey.github.objects

data class Membership(val url: String,
					  val state: String,
					  val role: String,
					  val organization_url: String,
					  val user: Sender)