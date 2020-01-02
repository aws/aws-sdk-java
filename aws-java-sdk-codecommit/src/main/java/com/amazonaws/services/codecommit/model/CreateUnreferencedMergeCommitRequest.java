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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateUnreferencedMergeCommit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUnreferencedMergeCommitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository where you want to create the unreferenced merge commit.
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
     * The merge option or strategy you want to use to merge the code.
     * </p>
     */
    private String mergeOption;
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
     * The name of the author who created the unreferenced commit. This information is used as both the author and
     * committer for the commit.
     * </p>
     */
    private String authorName;
    /**
     * <p>
     * The email address for the person who created the unreferenced commit.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The commit message for the unreferenced commit.
     * </p>
     */
    private String commitMessage;
    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is false.
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
     * The name of the repository where you want to create the unreferenced merge commit.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to create the unreferenced merge commit.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to create the unreferenced merge commit.
     * </p>
     * 
     * @return The name of the repository where you want to create the unreferenced merge commit.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to create the unreferenced merge commit.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to create the unreferenced merge commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUnreferencedMergeCommitRequest withRepositoryName(String repositoryName) {
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

    public CreateUnreferencedMergeCommitRequest withSourceCommitSpecifier(String sourceCommitSpecifier) {
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

    public CreateUnreferencedMergeCommitRequest withDestinationCommitSpecifier(String destinationCommitSpecifier) {
        setDestinationCommitSpecifier(destinationCommitSpecifier);
        return this;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * 
     * @param mergeOption
     *        The merge option or strategy you want to use to merge the code.
     * @see MergeOptionTypeEnum
     */

    public void setMergeOption(String mergeOption) {
        this.mergeOption = mergeOption;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * 
     * @return The merge option or strategy you want to use to merge the code.
     * @see MergeOptionTypeEnum
     */

    public String getMergeOption() {
        return this.mergeOption;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * 
     * @param mergeOption
     *        The merge option or strategy you want to use to merge the code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeOptionTypeEnum
     */

    public CreateUnreferencedMergeCommitRequest withMergeOption(String mergeOption) {
        setMergeOption(mergeOption);
        return this;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code.
     * </p>
     * 
     * @param mergeOption
     *        The merge option or strategy you want to use to merge the code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeOptionTypeEnum
     */

    public CreateUnreferencedMergeCommitRequest withMergeOption(MergeOptionTypeEnum mergeOption) {
        this.mergeOption = mergeOption.toString();
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

    public CreateUnreferencedMergeCommitRequest withConflictDetailLevel(String conflictDetailLevel) {
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

    public CreateUnreferencedMergeCommitRequest withConflictDetailLevel(ConflictDetailLevelTypeEnum conflictDetailLevel) {
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

    public CreateUnreferencedMergeCommitRequest withConflictResolutionStrategy(String conflictResolutionStrategy) {
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

    public CreateUnreferencedMergeCommitRequest withConflictResolutionStrategy(ConflictResolutionStrategyTypeEnum conflictResolutionStrategy) {
        this.conflictResolutionStrategy = conflictResolutionStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The name of the author who created the unreferenced commit. This information is used as both the author and
     * committer for the commit.
     * </p>
     * 
     * @param authorName
     *        The name of the author who created the unreferenced commit. This information is used as both the author
     *        and committer for the commit.
     */

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * <p>
     * The name of the author who created the unreferenced commit. This information is used as both the author and
     * committer for the commit.
     * </p>
     * 
     * @return The name of the author who created the unreferenced commit. This information is used as both the author
     *         and committer for the commit.
     */

    public String getAuthorName() {
        return this.authorName;
    }

    /**
     * <p>
     * The name of the author who created the unreferenced commit. This information is used as both the author and
     * committer for the commit.
     * </p>
     * 
     * @param authorName
     *        The name of the author who created the unreferenced commit. This information is used as both the author
     *        and committer for the commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUnreferencedMergeCommitRequest withAuthorName(String authorName) {
        setAuthorName(authorName);
        return this;
    }

    /**
     * <p>
     * The email address for the person who created the unreferenced commit.
     * </p>
     * 
     * @param email
     *        The email address for the person who created the unreferenced commit.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address for the person who created the unreferenced commit.
     * </p>
     * 
     * @return The email address for the person who created the unreferenced commit.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address for the person who created the unreferenced commit.
     * </p>
     * 
     * @param email
     *        The email address for the person who created the unreferenced commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUnreferencedMergeCommitRequest withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The commit message for the unreferenced commit.
     * </p>
     * 
     * @param commitMessage
     *        The commit message for the unreferenced commit.
     */

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * The commit message for the unreferenced commit.
     * </p>
     * 
     * @return The commit message for the unreferenced commit.
     */

    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * <p>
     * The commit message for the unreferenced commit.
     * </p>
     * 
     * @param commitMessage
     *        The commit message for the unreferenced commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUnreferencedMergeCommitRequest withCommitMessage(String commitMessage) {
        setCommitMessage(commitMessage);
        return this;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     * 
     * @param keepEmptyFolders
     *        If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *        folders empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is
     *        false.
     */

    public void setKeepEmptyFolders(Boolean keepEmptyFolders) {
        this.keepEmptyFolders = keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     * 
     * @return If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *         folders empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is
     *         false.
     */

    public Boolean getKeepEmptyFolders() {
        return this.keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     * 
     * @param keepEmptyFolders
     *        If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *        folders empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is
     *        false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUnreferencedMergeCommitRequest withKeepEmptyFolders(Boolean keepEmptyFolders) {
        setKeepEmptyFolders(keepEmptyFolders);
        return this;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is false.
     * </p>
     * 
     * @return If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *         folders empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is
     *         false.
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

    public CreateUnreferencedMergeCommitRequest withConflictResolution(ConflictResolution conflictResolution) {
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
        if (getMergeOption() != null)
            sb.append("MergeOption: ").append(getMergeOption()).append(",");
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

        if (obj instanceof CreateUnreferencedMergeCommitRequest == false)
            return false;
        CreateUnreferencedMergeCommitRequest other = (CreateUnreferencedMergeCommitRequest) obj;
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
        if (other.getMergeOption() == null ^ this.getMergeOption() == null)
            return false;
        if (other.getMergeOption() != null && other.getMergeOption().equals(this.getMergeOption()) == false)
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
        hashCode = prime * hashCode + ((getMergeOption() == null) ? 0 : getMergeOption().hashCode());
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
    public CreateUnreferencedMergeCommitRequest clone() {
        return (CreateUnreferencedMergeCommitRequest) super.clone();
    }

}
