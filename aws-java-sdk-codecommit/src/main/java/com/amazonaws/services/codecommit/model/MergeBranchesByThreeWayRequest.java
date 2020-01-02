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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesByThreeWay" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergeBranchesByThreeWayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository where you want to merge two branches.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     */
    private String sourceCommitSpecifier;
    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     */
    private String destinationCommitSpecifier;
    /**
     * <p>
     * The branch where the merge is applied.
     * </p>
     */
    private String targetBranch;
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
     * The commit message to include in the commit information for the merge.
     * </p>
     */
    private String commitMessage;
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
     * The name of the repository where you want to merge two branches.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to merge two branches.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to merge two branches.
     * </p>
     * 
     * @return The name of the repository where you want to merge two branches.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to merge two branches.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to merge two branches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeBranchesByThreeWayRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param sourceCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     */

    public void setSourceCommitSpecifier(String sourceCommitSpecifier) {
        this.sourceCommitSpecifier = sourceCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @return The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a
     *         branch name or a full commit ID).
     */

    public String getSourceCommitSpecifier() {
        return this.sourceCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param sourceCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeBranchesByThreeWayRequest withSourceCommitSpecifier(String sourceCommitSpecifier) {
        setSourceCommitSpecifier(sourceCommitSpecifier);
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param destinationCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     */

    public void setDestinationCommitSpecifier(String destinationCommitSpecifier) {
        this.destinationCommitSpecifier = destinationCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @return The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a
     *         branch name or a full commit ID).
     */

    public String getDestinationCommitSpecifier() {
        return this.destinationCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param destinationCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeBranchesByThreeWayRequest withDestinationCommitSpecifier(String destinationCommitSpecifier) {
        setDestinationCommitSpecifier(destinationCommitSpecifier);
        return this;
    }

    /**
     * <p>
     * The branch where the merge is applied.
     * </p>
     * 
     * @param targetBranch
     *        The branch where the merge is applied.
     */

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    /**
     * <p>
     * The branch where the merge is applied.
     * </p>
     * 
     * @return The branch where the merge is applied.
     */

    public String getTargetBranch() {
        return this.targetBranch;
    }

    /**
     * <p>
     * The branch where the merge is applied.
     * </p>
     * 
     * @param targetBranch
     *        The branch where the merge is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeBranchesByThreeWayRequest withTargetBranch(String targetBranch) {
        setTargetBranch(targetBranch);
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

    public MergeBranchesByThreeWayRequest withConflictDetailLevel(String conflictDetailLevel) {
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

    public MergeBranchesByThreeWayRequest withConflictDetailLevel(ConflictDetailLevelTypeEnum conflictDetailLevel) {
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

    public MergeBranchesByThreeWayRequest withConflictResolutionStrategy(String conflictResolutionStrategy) {
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

    public MergeBranchesByThreeWayRequest withConflictResolutionStrategy(ConflictResolutionStrategyTypeEnum conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy.toString();
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

    public MergeBranchesByThreeWayRequest withAuthorName(String authorName) {
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

    public MergeBranchesByThreeWayRequest withEmail(String email) {
        setEmail(email);
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

    public MergeBranchesByThreeWayRequest withCommitMessage(String commitMessage) {
        setCommitMessage(commitMessage);
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

    public MergeBranchesByThreeWayRequest withKeepEmptyFolders(Boolean keepEmptyFolders) {
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

    public MergeBranchesByThreeWayRequest withConflictResolution(ConflictResolution conflictResolution) {
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getSourceCommitSpecifier() != null)
            sb.append("SourceCommitSpecifier: ").append(getSourceCommitSpecifier()).append(",");
        if (getDestinationCommitSpecifier() != null)
            sb.append("DestinationCommitSpecifier: ").append(getDestinationCommitSpecifier()).append(",");
        if (getTargetBranch() != null)
            sb.append("TargetBranch: ").append(getTargetBranch()).append(",");
        if (getConflictDetailLevel() != null)
            sb.append("ConflictDetailLevel: ").append(getConflictDetailLevel()).append(",");
        if (getConflictResolutionStrategy() != null)
            sb.append("ConflictResolutionStrategy: ").append(getConflictResolutionStrategy()).append(",");
        if (getAuthorName() != null)
            sb.append("AuthorName: ").append(getAuthorName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getCommitMessage() != null)
            sb.append("CommitMessage: ").append(getCommitMessage()).append(",");
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

        if (obj instanceof MergeBranchesByThreeWayRequest == false)
            return false;
        MergeBranchesByThreeWayRequest other = (MergeBranchesByThreeWayRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getSourceCommitSpecifier() == null ^ this.getSourceCommitSpecifier() == null)
            return false;
        if (other.getSourceCommitSpecifier() != null && other.getSourceCommitSpecifier().equals(this.getSourceCommitSpecifier()) == false)
            return false;
        if (other.getDestinationCommitSpecifier() == null ^ this.getDestinationCommitSpecifier() == null)
            return false;
        if (other.getDestinationCommitSpecifier() != null && other.getDestinationCommitSpecifier().equals(this.getDestinationCommitSpecifier()) == false)
            return false;
        if (other.getTargetBranch() == null ^ this.getTargetBranch() == null)
            return false;
        if (other.getTargetBranch() != null && other.getTargetBranch().equals(this.getTargetBranch()) == false)
            return false;
        if (other.getConflictDetailLevel() == null ^ this.getConflictDetailLevel() == null)
            return false;
        if (other.getConflictDetailLevel() != null && other.getConflictDetailLevel().equals(this.getConflictDetailLevel()) == false)
            return false;
        if (other.getConflictResolutionStrategy() == null ^ this.getConflictResolutionStrategy() == null)
            return false;
        if (other.getConflictResolutionStrategy() != null && other.getConflictResolutionStrategy().equals(this.getConflictResolutionStrategy()) == false)
            return false;
        if (other.getAuthorName() == null ^ this.getAuthorName() == null)
            return false;
        if (other.getAuthorName() != null && other.getAuthorName().equals(this.getAuthorName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null && other.getCommitMessage().equals(this.getCommitMessage()) == false)
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

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getSourceCommitSpecifier() == null) ? 0 : getSourceCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommitSpecifier() == null) ? 0 : getDestinationCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getTargetBranch() == null) ? 0 : getTargetBranch().hashCode());
        hashCode = prime * hashCode + ((getConflictDetailLevel() == null) ? 0 : getConflictDetailLevel().hashCode());
        hashCode = prime * hashCode + ((getConflictResolutionStrategy() == null) ? 0 : getConflictResolutionStrategy().hashCode());
        hashCode = prime * hashCode + ((getAuthorName() == null) ? 0 : getAuthorName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode + ((getKeepEmptyFolders() == null) ? 0 : getKeepEmptyFolders().hashCode());
        hashCode = prime * hashCode + ((getConflictResolution() == null) ? 0 : getConflictResolution().hashCode());
        return hashCode;
    }

    @Override
    public MergeBranchesByThreeWayRequest clone() {
        return (MergeBranchesByThreeWayRequest) super.clone();
    }

}
