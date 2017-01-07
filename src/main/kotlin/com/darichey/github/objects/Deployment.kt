package com.darichey.github.objects

data class Deployment(val sha: String,
					  val payload: String,
					  val environment: String,
					  val description: String)


data class DeploymentStatus(val state: String,
							val target_url: String,
							val description: String)