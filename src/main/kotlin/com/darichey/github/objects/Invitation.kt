package com.darichey.github.objects

data class Invitation(val id: Long,
					  val repository: Repository,
					  val invitee: Sender,
					  val inviter: Sender,
					  val permissions: String,
					  val created_at: String,
					  val url: String,
					  val html_url: String)