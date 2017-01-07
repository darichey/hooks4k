package com.darichey.github.objects

data class Branch(val label: String,
				  val ref: String,
				  val sha: String,
				  val user: Sender,
				  val repo: Repository)

data class ShortBranch(val name: String,
					   val commit: Commit)