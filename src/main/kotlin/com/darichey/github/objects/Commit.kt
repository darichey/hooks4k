package com.darichey.github.objects

data class Commit(val id: String,
				  val tree_id: String,
				  val distinct: Boolean,
				  val message: String,
				  val timestamp: String,
				  val url: String,
				  val author: CommitUser,
				  val committer: CommitUser,
				  val added: List<String>,
				  val removed: List<String>,
				  val modified: List<String>)

data class CommitUser(val name: String,
					  val email: String,
					  val username: String)