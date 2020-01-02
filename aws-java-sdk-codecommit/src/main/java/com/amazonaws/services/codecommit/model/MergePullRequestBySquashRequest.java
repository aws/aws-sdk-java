/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestBySquash"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergePullRequestBySquashRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you
     * want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
     * </p>
     */
    private String sourceCommitId;
    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     * not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is
     * considered not mergeable if the same file in both branches has differences on the same line.
     * </p>
     */
    private String conflictDetailLevel;
    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions
     * of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation
     * is successful.
     * </p>
     */
    private String conflictResolutionStrategy;
    /**
     * <p>
     * The commit message to include in the commit information for the merge.
     * </p>
     */
    private String commitMessage;
    /**
     * <p>
     * The name of the author who created the commit. This information is used as both the author and committer for the
     * commit.
     * </p>
     */
    private String authorName;
    /**
     * <p>
     * The email address of the person merging the branches. This information is used in the commit information for the
     * merge.
     * </p>
     */
    private String email;
    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     */
    private Boolean keepEmptyFolders;
    /**
     * <p>
     * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during a
     * merge.
     * </p>
     */
    private ConflictResolution conflictResolution;

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @return The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestBySquashRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the pull request was created.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * 
     * @return The name of the repository where the pull request was created.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the pull request was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestBySquashRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you
     * want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
     * </p>
     * 
     * @param sourceCommitId
     *        The full commit ID of the original or updated commit in the pull request source branch. Pass this value if
     *        you want an exception thrown if the current commit ID of the tip of the source branch does not match this
     *        commit ID.
     */

    public void setSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
    }

    /**
     * <p>
     * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you
     * want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
     * </p>
     * 
     * @return The full commit ID of the original or updated commit in the pull request source branch. Pass this value
     *         if you want an exception thrown if the current commit ID of the tip of the source branch does not match
     *         this commit ID.
     */

    public String getSourceCommitId() {
        return this.sourceCommitId;
    }

    /**
     * <p>
     * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you
     * want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
     * </p>
     * 
     * @param sourceCommitId
     *        The full commit ID of the original or updated commit in the pull request source branch. Pass this value if
     *        you want an exception thrown if the current commit ID of the tip of the source branch does not match this
     *        commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestBySquashRequest withSourceCommitId(String sourceCommitId) {
        setSourceCommitId(sourceCommitId);
        return this;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     * not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is
     * considered not mergeable if the same file in both branches has differences on the same line.
     * </p>
     * 
     * @param conflictDetailLevel
     *        The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     *        not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a
     *        conflict is considered not mergeable if the same file in both branches has differences on the same line.
     * @see ConflictDetailLevelTypeEnum
     */

    public void setConflictDetailLevel(String conflictDetailLevel) {
        this.conflictDetailLevel = conflictDetailLevel;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     * not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is
     * considered not mergeable if the same file in both branches has differences on the same line.
     * </p>
     * 
     * @return The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     *         not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a
     *         conflict is considered not mergeable if the same file in both branches has differences on the same line.
     * @see ConflictDetailLevelTypeEnum
     */

    public String getConflictDetailLevel() {
        return this.conflictDetailLevel;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     * not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is
     * considered not mergeable if the same file in both branches has differences on the same line.
     * </p>
     * 
     * @param conflictDetailLevel
     *        The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     *        not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a
     *        conflict is considered not mergeable if the same file in both branches has differences on the same line.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictDetailLevelTypeEnum
     */

    public MergePullRequestBySquashRequest withConflictDetailLevel(String conflictDetailLevel) {
        setConflictDetailLevel(conflictDetailLevel);
        return this;
    }

    /**
     * <p>
     * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     * not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is
     * considered not mergeable if the same file in both branches has differences on the same line.
     * </p>
     * 
     * @param conflictDetailLevel
     *        The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a
     *        not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a
     *        conflict is considered not mergeable if the same file in both branches has differences on the same line.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictDetailLevelTypeEnum
     */

    public MergePullRequestBySquashRequest withConflictDetailLevel(ConflictDetailLevelTypeEnum conflictDetailLevel) {
        this.conflictDetailLevel = conflictDetailLevel.toString();
        return this;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions
     * of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation
     * is successful.
     * </p>
     * 
     * @param conflictResolutionStrategy
     *        Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two
     *        versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the
     *        merge operation is successful.
     * @see ConflictResolutionStrategyTypeEnum
     */

    public void setConflictResolutionStrategy(String conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions
     * of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation
     * is successful.
     * </p>
     * 
     * @return Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two
     *         versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the
     *         merge operation is successful.
     * @see ConflictResolutionStrategyTypeEnum
     */

    public String getConflictResolutionStrategy() {
        return this.conflictResolutionStrategy;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions
     * of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation
     * is successful.
     * </p>
     * 
     * @param conflictResolutionStrategy
     *        Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two
     *        versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the
     *        merge operation is successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictResolutionStrategyTypeEnum
     */

    public MergePullRequestBySquashRequest withConflictResolutionStrategy(String conflictResolutionStrategy) {
        setConflictResolutionStrategy(conflictResolutionStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions
     * of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation
     * is successful.
     * </p>
     * 
     * @param conflictResolutionStrategy
     *        Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two
     *        versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the
     *        merge operation is successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictResolutionStrategyTypeEnum
     */

    public MergePullRequestBySquashRequest withConflictResolutionStrategy(ConflictResolutionStrategyTypeEnum conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The commit message to include in the commit information for the merge.
     * </p>
     * 
     * @param commitMessage
     *        The commit message to include in the commit information for the merge.
     */

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * The commit message to include in the commit information for the merge.
     * </p>
     * 
     * @return The commit message to include in the commit information for the merge.
     */

    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * <p>
     * The commit message to include in the commit information for the merge.
     * </p>
     * 
     * @param commitMessage
     *        The commit message to include in the commit information for the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestBySquashRequest withCommitMessage(String commitMessage) {
        setCommitMessage(commitMessage);
        return this;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information is used as both the author and committer for the
     * commit.
     * </p>
     * 
     * @param authorName
     *        The name of the author who created the commit. This information is used as both the author and committer
     *        for the commit.
     */

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information is used as both the author and committer for the
     * commit.
     * </p>
     * 
     * @return The name of the author who created the commit. This information is used as both the author and committer
     *         for the commit.
     */

    public String getAuthorName() {
        return this.authorName;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information is used as both the author and committer for the
     * commit.
     * </p>
     * 
     * @param authorName
     *        The name of the author who created the commit. This information is used as both the author and committer
     *        for the commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestBySquashRequest withAuthorName(String authorName) {
        setAuthorName(authorName);
        return this;
    }

    /**
     * <p>
     * The email address of the person merging the branches. This information is used in the commit information for the
     * merge.
     * </p>
     * 
     * @param email
     *        The email address of the person merging the branches. This information is used in the commit information
     *        for the merge.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the person merging the branches. This information is used in the commit information for the
     * merge.
     * </p>
     * 
     * @return The email address of the person merging the branches. This information is used in the commit information
     *         for the merge.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address of the person merging the branches. This information is used in the commit information for the
     * merge.
     * </p>
     * 
     * @param email
     *        The email address of the person merging the branches. This information is used in the commit information
     *        for the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestBySquashRequest withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     * 
     * @param keepEmptyFolders
     *        If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *        folders empty. If true, a .gitkeep file is created for empty folders. The default is false.
     */

    public void setKeepEmptyFolders(Boolean keepEmptyFolders) {
        this.keepEmptyFolders = keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     * 
     * @return If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *         folders empty. If true, a .gitkeep file is created for empty folders. The default is false.
     */

    public Boolean getKeepEmptyFolders() {
        return this.keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     * 
     * @param keepEmptyFolders
     *        If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *        folders empty. If true, a .gitkeep file is created for empty folders. The default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestBySquashRequest withKeepEmptyFolders(Boolean keepEmptyFolders) {
        setKeepEmptyFolders(keepEmptyFolders);
        return this;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     * 
     * @return If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *         folders empty. If true, a .gitkeep file is created for empty folders. The default is false.
     */

    public Boolean isKeepEmptyFolders() {
        return this.keepEmptyFolders;
    }

    /**
     * <p>
     * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during a
     * merge.
     * </p>
     * 
     * @param conflictResolution
     *        If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during
     *        a merge.
     */

    public void setConflictResolution(ConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    /**
     * <p>
     * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during a
     * merge.
     * </p>
     * 
     * @return If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during
     *         a merge.
     */

    public ConflictResolution getConflictResolution() {
        return this.conflictResolution;
    }

    /**
     * <p>
     * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during a
     * merge.
     * </p>
     * 
     * @param conflictResolution
     *        If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during
     *        a merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestBySquashRequest withConflictResolution(ConflictResolution conflictResolution) {
        setConflictResolution(conflictResolution);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPullRequestId() != null)
            sb.append("PullRequestId: ").append(getPullRequestId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getSourceCommitId() != null)
            sb.append("SourceCommitId: ").append(getSourceCommitId()).append(",");
        if (getConflictDetailLevel() != null)
            sb.append("ConflictDetailLevel: ").append(getConflictDetailLevel()).append(",");
        if (getConflictResolutionStrategy() != null)
            sb.append("ConflictResolutionStrategy: ").append(getConflictResolutionStrategy()).append(",");
        if (getCommitMessage() != null)
            sb.append("CommitMessage: ").append(getCommitMessage()).append(",");
        if (getAuthorName() != null)
            sb.append("AuthorName: ").append(getAuthorName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getKeepEmptyFolders() != null)
            sb.append("KeepEmptyFolders: ").append(getKeepEmptyFolders()).append(",");
        if (getConflictResolution() != null)
            sb.append("ConflictResolution: ").append(getConflictResolution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergePullRequestBySquashRequest == false)
            return false;
        MergePullRequestBySquashRequest other = (MergePullRequestBySquashRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getSourceCommitId() == null ^ this.getSourceCommitId() == null)
            return false;
        if (other.getSourceCommitId() != null && other.getSourceCommitId().equals(this.getSourceCommitId()) == false)
            return false;
        if (other.getConflictDetailLevel() == null ^ this.getConflictDetailLevel() == null)
            return false;
        if (other.getConflictDetailLevel() != null && other.getConflictDetailLevel().equals(this.getConflictDetailLevel()) == false)
            return false;
        if (other.getConflictResolutionStrategy() == null ^ this.getConflictResolutionStrategy() == null)
            return false;
        if (other.getConflictResolutionStrategy() != null && other.getConflictResolutionStrategy().equals(this.getConflictResolutionStrategy()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        if (other.getAuthorName() == null ^ this.getAuthorName() == null)
            return false;
        if (other.getAuthorName() != null && other.getAuthorName().equals(this.getAuthorName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getKeepEmptyFolders() == null ^ this.getKeepEmptyFolders() == null)
            return false;
        if (other.getKeepEmptyFolders() != null && other.getKeepEmptyFolders().equals(this.getKeepEmptyFolders()) == false)
            return false;
        if (other.getConflictResolution() == null ^ this.getConflictResolution() == null)
            return false;
        if (other.getConflictResolution() != null && other.getConflictResolution().equals(this.getConflictResolution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
        hashCode = prime * hashCode + ((getConflictDetailLevel() == null) ? 0 : getConflictDetailLevel().hashCode());
        hashCode = prime * hashCode + ((getConflictResolutionStrategy() == null) ? 0 : getConflictResolutionStrategy().hashCode());
        hashCode = prime * hashCode + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode + ((getAuthorName() == null) ? 0 : getAuthorName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getKeepEmptyFolders() == null) ? 0 : getKeepEmptyFolders().hashCode());
        hashCode = prime * hashCode + ((getConflictResolution() == null) ? 0 : getConflictResolution().hashCode());
        return hashCode;
    }

    @Override
    public MergePullRequestBySquashRequest clone() {
        return (MergePullRequestBySquashRequest) super.clone();
    }

}
