package com.darichey.github.objects

data class Label(val id: Long,
				 val url: String,
				 val name: String,
				 val color: String,
				 val default: Boolean)