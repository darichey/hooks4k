package com.darichey.github.objects

data class Links(val self: Link,
				 val html: Link,
				 val issue: Link,
				 val comments: Link,
				 val review_comments: Link,
				 val review_comment: Link,
				 val commits: Link,
				 val statuses: Link)

data class Link(val href: String)