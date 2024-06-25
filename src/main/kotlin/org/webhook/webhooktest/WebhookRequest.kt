package org.webhook.webhooktest

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.LocalDateTime

data class WebhookRequest(
    val action: String,
    val comment: Comment,

)

data class Comment(
    val _links: CommentLinks?,
    val authorAssociation: AuthorAssociation?,
    val body: String?,
    val commitId: String?,
    val createdAt: LocalDateTime?,
    val diffHunk: String?,
    val htmlUrl: String?,
    val id: Int?,
    val inReplyToId: Int?,
    val line: Int?,
    val nodeId: String?,
    val originalCommitId: String?,
    val originalLine: Int?,
    val originalPosition: Int?,
    val originalStartLine: Int?,
    val path: String?,
    val position: Int?,
    val pullRequestReviewId: Int?,
    val pullRequestUrl: String?,
    val side: Side?,
    val startLine: Int?,
    val startSide: Side?,
    val subjectType: SubjectType?,
    val updatedAt: LocalDateTime?,
    val url: String?,
    val user: User?
)

data class CommentLinks(
    val html: Href?,
    val pullRequest: Href?,
    val self: Href?
)

data class Href(
    val href: String?
)

enum class AuthorAssociation {
    COLLABORATOR, CONTRIBUTOR, FIRST_TIMER, FIRST_TIME_CONTRIBUTOR, MANNEQUIN, MEMBER, NONE, OWNER
}


enum class Side {
    LEFT, RIGHT
}

enum class SubjectType {
    LINE, FILE
}

data class User(
    val avatarUrl: String?,
    val deleted: Boolean?,
    val email: String?,
    val eventsUrl: String?,
    val followersUrl: String?,
    val followingUrl: String?,
    val gistsUrl: String?,
    val gravatarId: String?,
    val htmlUrl: String?,
    val id: Int?,
    val login: String?,
    val name: String?,
    val nodeId: String?,
    val organizationsUrl: String?,
    val receivedEventsUrl: String?,
    val reposUrl: String?,
    val siteAdmin: Boolean?,
    val starredUrl: String?,
    val subscriptionsUrl: String?,
    val url: String?
)

