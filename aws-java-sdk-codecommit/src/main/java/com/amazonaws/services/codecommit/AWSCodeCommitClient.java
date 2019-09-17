/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.codecommit.AWSCodeCommitClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.services.codecommit.model.transform.*;

/**
 * Client for accessing CodeCommit. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS CodeCommit</fullname>
 * <p>
 * This is the <i>AWS CodeCommit API Reference</i>. This reference provides descriptions of the operations and data
 * types for AWS CodeCommit API along with usage examples.
 * </p>
 * <p>
 * You can use the AWS CodeCommit API to work with the following objects:
 * </p>
 * <p>
 * Repositories, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchGetRepositories</a>, which returns information about one or more repositories associated with your AWS
 * account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateRepository</a>, which creates an AWS CodeCommit repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteRepository</a>, which deletes an AWS CodeCommit repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetRepository</a>, which returns information about a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRepositories</a>, which lists all AWS CodeCommit repositories associated with your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRepositoryDescription</a>, which sets or updates the description of the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRepositoryName</a>, which changes the name of the repository. If you change the name of a repository, no
 * other users of that repository will be able to access it until you send them the new HTTPS or SSH URL to use.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Branches, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateBranch</a>, which creates a new branch in a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBranch</a>, which deletes the specified branch in a repository unless it is the default branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBranch</a>, which returns information about a specified branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListBranches</a>, which lists all branches for a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateDefaultBranch</a>, which changes the default branch for a repository.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Files, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteFile</a>, which deletes the content of a specified file from a specified branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBlob</a>, which returns the base-64 encoded content of an individual Git blob object within a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetFile</a>, which returns the base-64 encoded content of a specified file.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetFolder</a>, which returns the contents of a specified folder or directory.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutFile</a>, which adds or modifies a single file in a specified repository and branch.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Commits, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchGetCommits</a>, which returns information about one or more commits in a repository
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateCommit</a>, which creates a commit for changes to a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommit</a>, which returns information about a commit, including commit messages and author and committer
 * information.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetDifferences</a>, which returns information about the differences in a valid commit specifier (such as a branch,
 * tag, HEAD, commit ID or other fully qualified reference).
 * </p>
 * </li>
 * </ul>
 * <p>
 * Merges, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchDescribeMergeConflicts</a>, which returns information about conflicts in a merge between commits in a
 * repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateUnreferencedMergeCommit</a>, which creates an unreferenced commit between two branches or commits for the
 * purpose of comparing them and identifying any potential conflicts.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMergeConflicts</a>, which returns information about merge conflicts between the base, source, and
 * destination versions of a file in a potential merge.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMergeCommit</a>, which returns information about the merge between a source and destination commit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMergeConflicts</a>, which returns information about merge conflicts between the source and destination branch
 * in a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMergeOptions</a>, which returns information about the available merge options between two branches or commit
 * specifiers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesByFastForward</a>, which merges two branches using the fast-forward merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesBySquash</a>, which merges two branches using the squash merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesByThreeWay</a>, which merges two branches using the three-way merge option.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Pull requests, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePullRequest</a>, which creates a pull request in a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribePullRequestEvents</a>, which returns information about one or more pull request events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommentsForPullRequest</a>, which returns information about comments on a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPullRequest</a>, which returns information about a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPullRequests</a>, which lists all pull requests for a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergePullRequestByFastForward</a>, which merges the source destination branch of a pull request into the specified
 * destination branch for that pull request using the fast-forward merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergePullRequestBySquash</a>, which merges the source destination branch of a pull request into the specified
 * destination branch for that pull request using the squash merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergePullRequestByThreeWay</a>. which merges the source destination branch of a pull request into the specified
 * destination branch for that pull request using the three-way merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentForPullRequest</a>, which posts a comment to a pull request at the specified line, file, or request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestDescription</a>, which updates the description of a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestStatus</a>, which updates the status of a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestTitle</a>, which updates the title of a pull request.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Comments in a repository, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteCommentContent</a>, which deletes the content of a comment on a commit in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetComment</a>, which returns information about a comment on a commit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommentsForComparedCommit</a>, which returns information about comments on the comparison between two commit
 * specifiers in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentForComparedCommit</a>, which creates a comment on the comparison between two commit specifiers in a
 * repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentReply</a>, which creates a reply to a comment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateComment</a>, which updates the content of a comment on a commit in a repository.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Tags used to tag resources in AWS CodeCommit (not Git tags), by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS
 * CodeCommit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which adds or updates tags for a resource in AWS CodeCommit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes tags for a resource in AWS CodeCommit.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Triggers, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetRepositoryTriggers</a>, which returns information about triggers configured for a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutRepositoryTriggers</a>, which replaces all triggers for a repository and can be used to create or delete
 * triggers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TestRepositoryTriggers</a>, which tests the functionality of a repository trigger by sending data to the trigger
 * target.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeCommit, see the <a
 * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodeCommitClient extends AmazonWebServiceClient implements AWSCodeCommit {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodeCommit.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codecommit";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TargetsRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.TargetsRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.RepositoryLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileContentRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.FileContentRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BranchNameIsTagNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.BranchNameIsTagNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommitIdRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommitIdRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommentDeletedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommentDeletedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaximumItemsToCompareExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.MaximumItemsToCompareExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TitleRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.TitleRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidBlobIdException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidBlobIdExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryDescriptionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidRepositoryDescriptionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTargetsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidTargetsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerDestinationArnException")
                                    .withExceptionUnmarshaller(
                                            com.amazonaws.services.codecommit.model.transform.InvalidRepositoryTriggerDestinationArnExceptionUnmarshaller
                                                    .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommentDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommentDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaximumRepositoryTriggersExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.MaximumRepositoryTriggersExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidConflictDetailLevelException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidConflictDetailLevelExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BlobIdRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.BlobIdRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidReplacementTypeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidReplacementTypeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryNamesRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.RepositoryNamesRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AuthorDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.AuthorDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFilePositionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidFilePositionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileNameConflictsWithDirectoryNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.FileNameConflictsWithDirectoryNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceArnException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidResourceArnExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EncryptionKeyAccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.EncryptionKeyAccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BeforeCommitIdAndAfterCommitIdAreSameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.BeforeCommitIdAndAfterCommitIdAreSameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BranchDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.BranchDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PullRequestDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.PullRequestDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReferenceTypeNotSupportedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ReferenceTypeNotSupportedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FilePathConflictsWithSubmodulePathException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.FilePathConflictsWithSubmodulePathExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryTriggerEventsListRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.RepositoryTriggerEventsListRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileModeRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.FileModeRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommitDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommitDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceArnRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ResourceArnRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerCustomDataException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidRepositoryTriggerCustomDataExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerEventsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidRepositoryTriggerEventsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryNotAssociatedWithPullRequestException")
                                    .withExceptionUnmarshaller(
                                            com.amazonaws.services.codecommit.model.transform.RepositoryNotAssociatedWithPullRequestExceptionUnmarshaller
                                                    .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaximumRepositoryNamesExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.MaximumRepositoryNamesExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.RepositoryDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFileLocationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidFileLocationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaximumOpenPullRequestsExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.MaximumOpenPullRequestsExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DefaultBranchCannotBeDeletedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.DefaultBranchCannotBeDeletedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaximumBranchesExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.MaximumBranchesExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EncryptionKeyNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.EncryptionKeyNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPathException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidPathExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRelativeFileVersionEnumException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidRelativeFileVersionEnumExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagKeysListRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.TagKeysListRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidConflictResolutionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidConflictResolutionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidClientRequestTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidClientRequestTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FolderContentSizeLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.FolderContentSizeLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryNameRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.RepositoryNameRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidReferenceNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidReferenceNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryTriggerDestinationArnRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.RepositoryTriggerDestinationArnRequiredExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidConflictResolutionStrategyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidConflictResolutionStrategyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAuthorArnException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidAuthorArnExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommentContentRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommentContentRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagKeysListException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidTagKeysListExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTargetBranchException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidTargetBranchExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagsMapRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.TagsMapRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PathRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.PathRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSystemTagUsageException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidSystemTagUsageExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReplacementTypeRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ReplacementTypeRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryTriggerNameRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.RepositoryTriggerNameRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommitIdDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommitIdDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPullRequestStatusException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidPullRequestStatusExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParentCommitIdException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidParentCommitIdExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReferenceNameRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ReferenceNameRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPullRequestStatusUpdateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidPullRequestStatusUpdateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMaxConflictFilesException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidMaxConflictFilesExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParentCommitIdRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ParentCommitIdRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCommentIdException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidCommentIdExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPullRequestEventTypeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidPullRequestEventTypeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCommitException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidCommitExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ActorDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ActorDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotencyParameterMismatchException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.IdempotencyParameterMismatchExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoChangeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.NoChangeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaximumFileContentToLoadExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.MaximumFileContentToLoadExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDescriptionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidDescriptionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MultipleRepositoriesInPullRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.MultipleRepositoriesInPullRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BlobIdDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.BlobIdDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MergeOptionRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.MergeOptionRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FolderDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.FolderDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPullRequestIdException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidPullRequestIdExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PullRequestIdRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.PullRequestIdRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.FileDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryNameExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.RepositoryNameExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PathDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.PathDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TipOfSourceReferenceIsDifferentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.TipOfSourceReferenceIsDifferentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BranchNameExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.BranchNameExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryTriggersListRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.RepositoryTriggersListRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidReplacementContentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidReplacementContentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EncryptionIntegrityChecksFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.EncryptionIntegrityChecksFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommitMessageLengthExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommitMessageLengthExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMaxMergeHunksException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidMaxMergeHunksExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCommitIdException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidCommitIdExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOrderException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidOrderExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEmailException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidEmailExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PullRequestAlreadyClosedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.PullRequestAlreadyClosedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BranchNameRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.BranchNameRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeletionParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidDeletionParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SourceFileOrContentRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.SourceFileOrContentRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommentIdRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommentIdRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidRepositoryTriggerNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMergeOptionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidMergeOptionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParentCommitIdOutdatedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ParentCommitIdOutdatedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommitIdsListRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommitIdsListRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidContinuationTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidContinuationTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommitRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommitRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaximumFileEntriesExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.MaximumFileEntriesExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientRequestTokenRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ClientRequestTokenRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NameLengthExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.NameLengthExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaximumConflictResolutionEntriesExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.MaximumConflictResolutionEntriesExceededExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EncryptionKeyDisabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.EncryptionKeyDisabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MultipleConflictResolutionEntriesException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.MultipleConflictResolutionEntriesExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommentNotCreatedByCallerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommentNotCreatedByCallerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileContentSizeLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.FileContentSizeLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TargetRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.TargetRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagsMapException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidTagsMapExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RestrictedSourceFileException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.RestrictedSourceFileExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileTooLargeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.FileTooLargeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ManualMergeRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ManualMergeRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PutFileEntryConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.PutFileEntryConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerBranchNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidRepositoryTriggerBranchNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileContentAndSourceFileSpecifiedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.FileContentAndSourceFileSpecifiedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PullRequestStatusRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.PullRequestStatusRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentReferenceUpdateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ConcurrentReferenceUpdateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SamePathRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.SamePathRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TipsDivergenceExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.TipsDivergenceExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSortByException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidSortByExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SameFileContentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.SameFileContentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTargetException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidTargetExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerRegionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidRepositoryTriggerRegionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReferenceDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ReferenceDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommentContentSizeLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommentContentSizeLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMaxResultsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidMaxResultsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParentCommitDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ParentCommitDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileEntryRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.FileEntryRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidActorArnException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidActorArnExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CommitIdsLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.CommitIdsLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDestinationCommitSpecifierException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidDestinationCommitSpecifierExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagPolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.TagPolicyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryTriggerBranchNameListRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.RepositoryTriggerBranchNameListRequiredExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFileModeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidFileModeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSourceCommitSpecifierException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidSourceCommitSpecifierExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectoryNameConflictsWithFileNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.DirectoryNameConflictsWithFileNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SourceAndDestinationAreSameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.SourceAndDestinationAreSameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTitleException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidTitleExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EncryptionKeyUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.EncryptionKeyUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidRepositoryNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReplacementContentRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.ReplacementContentRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidBranchNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codecommit.model.transform.InvalidBranchNameExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.codecommit.model.AWSCodeCommitException.class));

    /**
     * Constructs a new client to invoke service methods on CodeCommit. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSCodeCommitClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSCodeCommitClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodeCommit (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSCodeCommitClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodeCommitClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSCodeCommitClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSCodeCommitClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSCodeCommitClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodeCommit (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSCodeCommitClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeCommitClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodeCommitClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSCodeCommitClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCodeCommitClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodeCommit (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSCodeCommitClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeCommitClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodeCommitClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodeCommit (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSCodeCommitClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeCommitClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCodeCommitClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSCodeCommitClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSCodeCommitClientBuilder builder() {
        return AWSCodeCommitClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeCommitClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeCommitClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://codecommit.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codecommit/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codecommit/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
     * squash or three-way merge strategy.
     * </p>
     * 
     * @param batchDescribeMergeConflictsRequest
     * @return Result of the BatchDescribeMergeConflicts operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws MergeOptionRequiredException
     *         A merge option or stategy is required, and none was provided.
     * @throws InvalidMergeOptionException
     *         The specified merge option is not valid for this operation. Not all merge strategies are supported for
     *         all operations.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws InvalidMaxConflictFilesException
     *         The specified value for the number of conflict files to return is not valid.
     * @throws InvalidMaxMergeHunksException
     *         The specified value for the number of merge hunks to return is not valid.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The maximum number of items to compare between the source or destination branches and the merge base has
     *         exceeded the maximum allowed.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.BatchDescribeMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchDescribeMergeConflicts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDescribeMergeConflictsResult batchDescribeMergeConflicts(BatchDescribeMergeConflictsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDescribeMergeConflicts(request);
    }

    @SdkInternalApi
    final BatchDescribeMergeConflictsResult executeBatchDescribeMergeConflicts(BatchDescribeMergeConflictsRequest batchDescribeMergeConflictsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDescribeMergeConflictsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDescribeMergeConflictsRequest> request = null;
        Response<BatchDescribeMergeConflictsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDescribeMergeConflictsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDescribeMergeConflictsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDescribeMergeConflicts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDescribeMergeConflictsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDescribeMergeConflictsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the contents of one or more commits in a repository.
     * </p>
     * 
     * @param batchGetCommitsRequest
     * @return Result of the BatchGetCommits operation returned by the service.
     * @throws CommitIdsListRequiredException
     * @throws CommitIdsLimitExceededException
     *         The maximum number of allowed commit IDs in a batch request is 100. Verify that your batch requests
     *         contains no more than 100 commit IDs, and then try again.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.BatchGetCommits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetCommits" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetCommitsResult batchGetCommits(BatchGetCommitsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetCommits(request);
    }

    @SdkInternalApi
    final BatchGetCommitsResult executeBatchGetCommits(BatchGetCommitsRequest batchGetCommitsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetCommitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetCommitsRequest> request = null;
        Response<BatchGetCommitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetCommitsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetCommitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetCommits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetCommitsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetCommitsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about one or more repositories.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param batchGetRepositoriesRequest
     *        Represents the input of a batch get repositories operation.
     * @return Result of the BatchGetRepositories operation returned by the service.
     * @throws RepositoryNamesRequiredException
     *         A repository names object is required but was not specified.
     * @throws MaximumRepositoryNamesExceededException
     *         The maximum number of allowed repository names was exceeded. Currently, this number is 25.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.BatchGetRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetRepositoriesResult batchGetRepositories(BatchGetRepositoriesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetRepositories(request);
    }

    @SdkInternalApi
    final BatchGetRepositoriesResult executeBatchGetRepositories(BatchGetRepositoriesRequest batchGetRepositoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetRepositoriesRequest> request = null;
        Response<BatchGetRepositoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetRepositoriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetRepositoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetRepositories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetRepositoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetRepositoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new branch in a repository and points the branch to a commit.
     * </p>
     * <note>
     * <p>
     * Calling the create branch operation does not set a repository's default branch. To do this, call the update
     * default branch operation.
     * </p>
     * </note>
     * 
     * @param createBranchRequest
     *        Represents the input of a create branch operation.
     * @return Result of the CreateBranch operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws BranchNameExistsException
     *         The specified branch name already exists.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBranchResult createBranch(CreateBranchRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBranch(request);
    }

    @SdkInternalApi
    final CreateBranchResult executeCreateBranch(CreateBranchRequest createBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(createBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBranchRequest> request = null;
        Response<CreateBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBranchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a commit for a repository on the tip of a specified branch.
     * </p>
     * 
     * @param createCommitRequest
     * @return Result of the CreateCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws ParentCommitIdRequiredException
     *         A parent commit ID is required. To view the full commit ID of a branch in a repository, use
     *         <a>GetBranch</a> or a Git command (for example, git pull or git log).
     * @throws InvalidParentCommitIdException
     *         The parent commit ID is not valid. The commit ID cannot be empty, and must match the head commit ID for
     *         the branch of the repository where you want to add or update a file.
     * @throws ParentCommitDoesNotExistException
     *         The parent commit ID is not valid because it does not exist. The specified parent commit ID does not
     *         exist in the specified branch of the repository.
     * @throws ParentCommitIdOutdatedException
     *         The file could not be added because the provided parent commit ID is not the current tip of the specified
     *         branch. To view the full commit ID of the current head of the branch, use <a>GetBranch</a>.
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Type the name of a current branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws FileEntryRequiredException
     *         The commit cannot be created because no files have been specified as added, updated, or changed (PutFile
     *         or DeleteFile) for the commit.
     * @throws MaximumFileEntriesExceededException
     *         The number of specified files to change as part of this commit exceeds the maximum number of files that
     *         can be changed in a single commit. Consider using a Git client for these changes.
     * @throws PutFileEntryConflictException
     *         The commit cannot be created because one or more files specified in the commit reference both a file and
     *         a folder.
     * @throws SourceFileOrContentRequiredException
     *         The commit cannot be created because no source files or file content have been specified for the commit.
     * @throws FileContentAndSourceFileSpecifiedException
     *         The commit cannot be created because both a source file and file content have been specified for the same
     *         file. You cannot provide both. Either specify a source file, or provide the file content directly.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws SamePathRequestException
     *         The commit cannot be created because one or more changes in this commit duplicate actions in the same
     *         file path. For example, you cannot make the same delete request to the same file in the same file path
     *         twice, or make a delete request and a move request to the same file as part of the same commit.
     * @throws FileDoesNotExistException
     *         The specified file does not exist. Verify that you have provided the correct name of the file, including
     *         its full path and extension.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size that can be added is 6 MB, and
     *         the combined file content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws InvalidDeletionParameterException
     *         The specified deletion parameter is not valid.
     * @throws RestrictedSourceFileException
     *         The commit cannot be created because one of the changes specifies copying or moving a .gitkeep file.
     * @throws FileModeRequiredException
     *         The commit cannot be created because a file mode is required to update mode permissions for an existing
     *         file, but no file mode has been specified.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws NoChangeException
     *         The commit cannot be created because no changes will be made to the repository as a result of this
     *         commit. A commit must contain at least one change.
     * @throws FileNameConflictsWithDirectoryNameException
     *         A file cannot be added to the repository because the specified file name has the same name as a directory
     *         in this repository. Either provide another name for the file, or add the file in a directory that does
     *         not match the file name.
     * @throws DirectoryNameConflictsWithFileNameException
     *         A file cannot be added to the repository because the specified path name has the same name as a file that
     *         already exists in this repository. Either provide a different name for the file, or specify a different
     *         path for the file.
     * @throws FilePathConflictsWithSubmodulePathException
     *         The commit cannot be created because a specified file path points to a submodule. Verify that the
     *         destination files have valid file paths that do not point to a submodule.
     * @sample AWSCodeCommit.CreateCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateCommit" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateCommitResult createCommit(CreateCommitRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCommit(request);
    }

    @SdkInternalApi
    final CreateCommitResult executeCreateCommit(CreateCommitRequest createCommitRequest) {

        ExecutionContext executionContext = createExecutionContext(createCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCommitRequest> request = null;
        Response<CreateCommitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCommitRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCommitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCommit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCommitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCommitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a pull request in the specified repository.
     * </p>
     * 
     * @param createPullRequestRequest
     * @return Result of the CreatePullRequest operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws ClientRequestTokenRequiredException
     *         A client request token is required. A client request token is an unique, client-generated idempotency
     *         token that when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request will return
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be re-used.
     * @throws ReferenceNameRequiredException
     *         A reference name is required, but none was provided.
     * @throws InvalidReferenceNameException
     *         The specified reference name format is not valid. Reference names must conform to the Git references
     *         format, for example refs/heads/master. For more information, see <a
     *         href="https://git-scm.com/book/en/v2/Git-Internals-Git-References">Git Internals - Git References</a> or
     *         consult your Git documentation.
     * @throws ReferenceDoesNotExistException
     *         The specified reference does not exist. You must provide a full commit ID.
     * @throws ReferenceTypeNotSupportedException
     *         The specified reference is not a supported type.
     * @throws TitleRequiredException
     *         A pull request title is required. It cannot be empty or null.
     * @throws InvalidTitleException
     *         The title of the pull request is not valid. Pull request titles cannot exceed 100 characters in length.
     * @throws InvalidDescriptionException
     *         The pull request description is not valid. Descriptions are limited to 1,000 characters in length.
     * @throws TargetsRequiredException
     *         An array of target objects is required. It cannot be empty or null.
     * @throws InvalidTargetsException
     *         The targets for the pull request is not valid or not in a valid format. Targets are a list of target
     *         objects. Each target object must contain the full values for the repository name, source branch, and
     *         destination branch for a pull request.
     * @throws TargetRequiredException
     *         A pull request target is required. It cannot be empty or null. A pull request target must contain the
     *         full values for the repository name, source branch, and destination branch for the pull request.
     * @throws InvalidTargetException
     *         The target for the pull request is not valid. A target must contain the full values for the repository
     *         name, source branch, and destination branch for the pull request.
     * @throws MultipleRepositoriesInPullRequestException
     *         You cannot include more than one repository in a pull request. Make sure you have specified only one
     *         repository name in your request, and then try again.
     * @throws MaximumOpenPullRequestsExceededException
     *         You cannot create the pull request because the repository has too many open pull requests. The maximum
     *         number of open pull requests for a repository is 1,000. Close one or more open pull requests, and then
     *         try again.
     * @throws SourceAndDestinationAreSameException
     *         The source branch and the destination branch for the pull request are the same. You must specify
     *         different branches for the source and destination.
     * @sample AWSCodeCommit.CreatePullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreatePullRequest" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePullRequestResult createPullRequest(CreatePullRequestRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePullRequest(request);
    }

    @SdkInternalApi
    final CreatePullRequestResult executeCreatePullRequest(CreatePullRequestRequest createPullRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(createPullRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePullRequestRequest> request = null;
        Response<CreatePullRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePullRequestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPullRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePullRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePullRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePullRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new, empty repository.
     * </p>
     * 
     * @param createRepositoryRequest
     *        Represents the input of a create repository operation.
     * @return Result of the CreateRepository operation returned by the service.
     * @throws RepositoryNameExistsException
     *         The specified repository name already exists.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws InvalidRepositoryDescriptionException
     *         The specified repository description is not valid.
     * @throws RepositoryLimitExceededException
     *         A repository resource limit was exceeded.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws InvalidTagsMapException
     *         The map of tags is not valid.
     * @throws TooManyTagsException
     *         The maximum number of tags for an AWS CodeCommit resource has been exceeded.
     * @throws InvalidSystemTagUsageException
     *         The specified tag is not valid. Key names cannot be prefixed with aws:.
     * @throws TagPolicyException
     *         The tag policy is not valid.
     * @sample AWSCodeCommit.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateRepositoryResult createRepository(CreateRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRepository(request);
    }

    @SdkInternalApi
    final CreateRepositoryResult executeCreateRepository(CreateRepositoryRequest createRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(createRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRepositoryRequest> request = null;
        Response<CreateRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an unreferenced commit that represents the result of merging two branches using a specified merge
     * strategy. This can help you determine the outcome of a potential merge. This API cannot be used with the
     * fast-forward merge strategy, as that strategy does not create a merge commit.
     * </p>
     * <note>
     * <p>
     * This unreferenced merge commit can only be accessed using the GetCommit API or through git commands such as git
     * fetch. To retrieve this commit, you must specify its commit ID or otherwise reference it.
     * </p>
     * </note>
     * 
     * @param createUnreferencedMergeCommitRequest
     * @return Result of the CreateUnreferencedMergeCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws MergeOptionRequiredException
     *         A merge option or stategy is required, and none was provided.
     * @throws InvalidMergeOptionException
     *         The specified merge option is not valid for this operation. Not all merge strategies are supported for
     *         all operations.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws InvalidConflictResolutionException
     *         The specified conflict resolution list is not valid.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws MaximumConflictResolutionEntriesExceededException
     *         The number of allowed conflict resolution entries was exceeded.
     * @throws MultipleConflictResolutionEntriesException
     *         More than one conflict resolution entries exists for the conflict. A conflict can have only one conflict
     *         resolution entry.
     * @throws ReplacementTypeRequiredException
     *         A replacement type is required.
     * @throws InvalidReplacementTypeException
     *         Automerge was specified for resolving the conflict, but the specified replacement type is not valid.
     * @throws ReplacementContentRequiredException
     *         USE_NEW_CONTENT was specified but no replacement content has been provided.
     * @throws InvalidReplacementContentException
     *         Automerge was specified for resolving the conflict, but the replacement type is not valid or content is
     *         missing.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size that can be added is 6 MB, and
     *         the combined file content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The maximum number of items to compare between the source or destination branches and the merge base has
     *         exceeded the maximum allowed.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws FileModeRequiredException
     *         The commit cannot be created because a file mode is required to update mode permissions for an existing
     *         file, but no file mode has been specified.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.CreateUnreferencedMergeCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateUnreferencedMergeCommit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateUnreferencedMergeCommitResult createUnreferencedMergeCommit(CreateUnreferencedMergeCommitRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUnreferencedMergeCommit(request);
    }

    @SdkInternalApi
    final CreateUnreferencedMergeCommitResult executeCreateUnreferencedMergeCommit(CreateUnreferencedMergeCommitRequest createUnreferencedMergeCommitRequest) {

        ExecutionContext executionContext = createExecutionContext(createUnreferencedMergeCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUnreferencedMergeCommitRequest> request = null;
        Response<CreateUnreferencedMergeCommitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUnreferencedMergeCommitRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createUnreferencedMergeCommitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUnreferencedMergeCommit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUnreferencedMergeCommitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateUnreferencedMergeCommitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a branch from a repository, unless that branch is the default branch for the repository.
     * </p>
     * 
     * @param deleteBranchRequest
     *        Represents the input of a delete branch operation.
     * @return Result of the DeleteBranch operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws DefaultBranchCannotBeDeletedException
     *         The specified branch is the default branch for the repository, and cannot be deleted. To delete this
     *         branch, you must first set another branch as the default branch.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBranchResult deleteBranch(DeleteBranchRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBranch(request);
    }

    @SdkInternalApi
    final DeleteBranchResult executeDeleteBranch(DeleteBranchRequest deleteBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBranchRequest> request = null;
        Response<DeleteBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBranchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * 
     * @param deleteCommentContentRequest
     * @return Result of the DeleteCommentContent operation returned by the service.
     * @throws CommentDoesNotExistException
     *         No comment exists with the provided ID. Verify that you have provided the correct ID, and then try again.
     * @throws CommentIdRequiredException
     *         The comment ID is missing or null. A comment ID is required.
     * @throws InvalidCommentIdException
     *         The comment ID is not in a valid format. Make sure that you have provided the full comment ID.
     * @throws CommentDeletedException
     *         This comment has already been deleted. You cannot edit or delete a deleted comment.
     * @sample AWSCodeCommit.DeleteCommentContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteCommentContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCommentContentResult deleteCommentContent(DeleteCommentContentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCommentContent(request);
    }

    @SdkInternalApi
    final DeleteCommentContentResult executeDeleteCommentContent(DeleteCommentContentRequest deleteCommentContentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCommentContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCommentContentRequest> request = null;
        Response<DeleteCommentContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCommentContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCommentContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCommentContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCommentContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCommentContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision.
     * The file will still exist in the commits prior to the commit that contains the deletion.
     * </p>
     * 
     * @param deleteFileRequest
     * @return Result of the DeleteFile operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws ParentCommitIdRequiredException
     *         A parent commit ID is required. To view the full commit ID of a branch in a repository, use
     *         <a>GetBranch</a> or a Git command (for example, git pull or git log).
     * @throws InvalidParentCommitIdException
     *         The parent commit ID is not valid. The commit ID cannot be empty, and must match the head commit ID for
     *         the branch of the repository where you want to add or update a file.
     * @throws ParentCommitDoesNotExistException
     *         The parent commit ID is not valid because it does not exist. The specified parent commit ID does not
     *         exist in the specified branch of the repository.
     * @throws ParentCommitIdOutdatedException
     *         The file could not be added because the provided parent commit ID is not the current tip of the specified
     *         branch. To view the full commit ID of the current head of the branch, use <a>GetBranch</a>.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileDoesNotExistException
     *         The specified file does not exist. Verify that you have provided the correct name of the file, including
     *         its full path and extension.
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Type the name of a current branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.DeleteFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteFile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFileResult deleteFile(DeleteFileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFile(request);
    }

    @SdkInternalApi
    final DeleteFileResult executeDeleteFile(DeleteFileRequest deleteFileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFileRequest> request = null;
        Response<DeleteFileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFileResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.
     * </p>
     * <important>
     * <p>
     * Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future
     * push calls to the deleted repository will fail.
     * </p>
     * </important>
     * 
     * @param deleteRepositoryRequest
     *        Represents the input of a delete repository operation.
     * @return Result of the DeleteRepository operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRepository(request);
    }

    @SdkInternalApi
    final DeleteRepositoryResult executeDeleteRepository(DeleteRepositoryRequest deleteRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryRequest> request = null;
        Response<DeleteRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
     * squash or three-way merge strategy. If the merge option for the attempted merge is specified as
     * FAST_FORWARD_MERGE, an exception will be thrown.
     * </p>
     * 
     * @param describeMergeConflictsRequest
     * @return Result of the DescribeMergeConflicts operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws MergeOptionRequiredException
     *         A merge option or stategy is required, and none was provided.
     * @throws InvalidMergeOptionException
     *         The specified merge option is not valid for this operation. Not all merge strategies are supported for
     *         all operations.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileDoesNotExistException
     *         The specified file does not exist. Verify that you have provided the correct name of the file, including
     *         its full path and extension.
     * @throws InvalidMaxMergeHunksException
     *         The specified value for the number of merge hunks to return is not valid.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The maximum number of items to compare between the source or destination branches and the merge base has
     *         exceeded the maximum allowed.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.DescribeMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribeMergeConflicts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMergeConflictsResult describeMergeConflicts(DescribeMergeConflictsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMergeConflicts(request);
    }

    @SdkInternalApi
    final DescribeMergeConflictsResult executeDescribeMergeConflicts(DescribeMergeConflictsRequest describeMergeConflictsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMergeConflictsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMergeConflictsRequest> request = null;
        Response<DescribeMergeConflictsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMergeConflictsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMergeConflictsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMergeConflicts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMergeConflictsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMergeConflictsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about one or more pull request events.
     * </p>
     * 
     * @param describePullRequestEventsRequest
     * @return Result of the DescribePullRequestEvents operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidPullRequestEventTypeException
     *         The pull request event type is not valid.
     * @throws InvalidActorArnException
     *         The Amazon Resource Name (ARN) is not valid. Make sure that you have provided the full ARN for the user
     *         who initiated the change for the pull request, and then try again.
     * @throws ActorDoesNotExistException
     *         The specified Amazon Resource Name (ARN) does not exist in the AWS account.
     * @throws InvalidMaxResultsException
     *         The specified number of maximum results is not valid.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.DescribePullRequestEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribePullRequestEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePullRequestEventsResult describePullRequestEvents(DescribePullRequestEventsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePullRequestEvents(request);
    }

    @SdkInternalApi
    final DescribePullRequestEventsResult executeDescribePullRequestEvents(DescribePullRequestEventsRequest describePullRequestEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(describePullRequestEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePullRequestEventsRequest> request = null;
        Response<DescribePullRequestEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePullRequestEventsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePullRequestEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePullRequestEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePullRequestEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePullRequestEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the base-64 encoded content of an individual blob within a repository.
     * </p>
     * 
     * @param getBlobRequest
     *        Represents the input of a get blob operation.
     * @return Result of the GetBlob operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws BlobIdRequiredException
     *         A blob ID is required but was not specified.
     * @throws InvalidBlobIdException
     *         The specified blob is not valid.
     * @throws BlobIdDoesNotExistException
     *         The specified blob does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws FileTooLargeException
     *         The specified file exceeds the file size limit for AWS CodeCommit. For more information about limits in
     *         AWS CodeCommit, see <a href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS
     *         CodeCommit User Guide</a>.
     * @sample AWSCodeCommit.GetBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBlob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBlobResult getBlob(GetBlobRequest request) {
        request = beforeClientExecution(request);
        return executeGetBlob(request);
    }

    @SdkInternalApi
    final GetBlobResult executeGetBlob(GetBlobRequest getBlobRequest) {

        ExecutionContext executionContext = createExecutionContext(getBlobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBlobRequest> request = null;
        Response<GetBlobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBlobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBlobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBlob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBlobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBlobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a repository branch, including its name and the last commit ID.
     * </p>
     * 
     * @param getBranchRequest
     *        Represents the input of a get branch operation.
     * @return Result of the GetBranch operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBranchResult getBranch(GetBranchRequest request) {
        request = beforeClientExecution(request);
        return executeGetBranch(request);
    }

    @SdkInternalApi
    final GetBranchResult executeGetBranch(GetBranchRequest getBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(getBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBranchRequest> request = null;
        Response<GetBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBranchResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * 
     * @param getCommentRequest
     * @return Result of the GetComment operation returned by the service.
     * @throws CommentDoesNotExistException
     *         No comment exists with the provided ID. Verify that you have provided the correct ID, and then try again.
     * @throws CommentIdRequiredException
     *         The comment ID is missing or null. A comment ID is required.
     * @throws InvalidCommentIdException
     *         The comment ID is not in a valid format. Make sure that you have provided the full comment ID.
     * @throws CommentDeletedException
     *         This comment has already been deleted. You cannot edit or delete a deleted comment.
     * @sample AWSCodeCommit.GetComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetComment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCommentResult getComment(GetCommentRequest request) {
        request = beforeClientExecution(request);
        return executeGetComment(request);
    }

    @SdkInternalApi
    final GetCommentResult executeGetComment(GetCommentRequest getCommentRequest) {

        ExecutionContext executionContext = createExecutionContext(getCommentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommentRequest> request = null;
        Response<GetCommentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCommentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCommentResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCommentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about comments made on the comparison between two commits.
     * </p>
     * 
     * @param getCommentsForComparedCommitRequest
     * @return Result of the GetCommentsForComparedCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidMaxResultsException
     *         The specified number of maximum results is not valid.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetCommentsForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCommentsForComparedCommitResult getCommentsForComparedCommit(GetCommentsForComparedCommitRequest request) {
        request = beforeClientExecution(request);
        return executeGetCommentsForComparedCommit(request);
    }

    @SdkInternalApi
    final GetCommentsForComparedCommitResult executeGetCommentsForComparedCommit(GetCommentsForComparedCommitRequest getCommentsForComparedCommitRequest) {

        ExecutionContext executionContext = createExecutionContext(getCommentsForComparedCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommentsForComparedCommitRequest> request = null;
        Response<GetCommentsForComparedCommitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommentsForComparedCommitRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCommentsForComparedCommitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCommentsForComparedCommit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCommentsForComparedCommitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCommentsForComparedCommitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns comments made on a pull request.
     * </p>
     * 
     * @param getCommentsForPullRequestRequest
     * @return Result of the GetCommentsForPullRequest operation returned by the service.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidMaxResultsException
     *         The specified number of maximum results is not valid.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws RepositoryNotAssociatedWithPullRequestException
     *         The repository does not contain any pull requests with that pull request ID. Use GetPullRequest to verify
     *         the correct repository name for the pull request ID.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetCommentsForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCommentsForPullRequestResult getCommentsForPullRequest(GetCommentsForPullRequestRequest request) {
        request = beforeClientExecution(request);
        return executeGetCommentsForPullRequest(request);
    }

    @SdkInternalApi
    final GetCommentsForPullRequestResult executeGetCommentsForPullRequest(GetCommentsForPullRequestRequest getCommentsForPullRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(getCommentsForPullRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommentsForPullRequestRequest> request = null;
        Response<GetCommentsForPullRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommentsForPullRequestRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCommentsForPullRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCommentsForPullRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCommentsForPullRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCommentsForPullRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a commit, including commit message and committer information.
     * </p>
     * 
     * @param getCommitRequest
     *        Represents the input of a get commit operation.
     * @return Result of the GetCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws CommitIdDoesNotExistException
     *         The specified commit ID does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommit" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCommitResult getCommit(GetCommitRequest request) {
        request = beforeClientExecution(request);
        return executeGetCommit(request);
    }

    @SdkInternalApi
    final GetCommitResult executeGetCommit(GetCommitRequest getCommitRequest) {

        ExecutionContext executionContext = createExecutionContext(getCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommitRequest> request = null;
        Response<GetCommitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommitRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCommitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCommit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCommitResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCommitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or
     * other fully qualified reference). Results can be limited to a specified path.
     * </p>
     * 
     * @param getDifferencesRequest
     * @return Result of the GetDifferences operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws InvalidMaxResultsException
     *         The specified number of maximum results is not valid.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws PathDoesNotExistException
     *         The specified path does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetDifferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetDifferences" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDifferencesResult getDifferences(GetDifferencesRequest request) {
        request = beforeClientExecution(request);
        return executeGetDifferences(request);
    }

    @SdkInternalApi
    final GetDifferencesResult executeGetDifferences(GetDifferencesRequest getDifferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(getDifferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDifferencesRequest> request = null;
        Response<GetDifferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDifferencesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDifferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDifferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDifferencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDifferencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the base-64 encoded contents of a specified file and its metadata.
     * </p>
     * 
     * @param getFileRequest
     * @return Result of the GetFile operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileDoesNotExistException
     *         The specified file does not exist. Verify that you have provided the correct name of the file, including
     *         its full path and extension.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws FileTooLargeException
     *         The specified file exceeds the file size limit for AWS CodeCommit. For more information about limits in
     *         AWS CodeCommit, see <a href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS
     *         CodeCommit User Guide</a>.
     * @sample AWSCodeCommit.GetFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFileResult getFile(GetFileRequest request) {
        request = beforeClientExecution(request);
        return executeGetFile(request);
    }

    @SdkInternalApi
    final GetFileResult executeGetFile(GetFileRequest getFileRequest) {

        ExecutionContext executionContext = createExecutionContext(getFileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFileRequest> request = null;
        Response<GetFileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFileResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the contents of a specified folder in a repository.
     * </p>
     * 
     * @param getFolderRequest
     * @return Result of the GetFolder operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FolderDoesNotExistException
     *         The specified folder does not exist. Either the folder name is not correct, or you did not provide the
     *         full path to the folder.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFolder" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFolderResult getFolder(GetFolderRequest request) {
        request = beforeClientExecution(request);
        return executeGetFolder(request);
    }

    @SdkInternalApi
    final GetFolderResult executeGetFolder(GetFolderRequest getFolderRequest) {

        ExecutionContext executionContext = createExecutionContext(getFolderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFolderRequest> request = null;
        Response<GetFolderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFolderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFolderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFolder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFolderResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFolderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specified merge commit.
     * </p>
     * 
     * @param getMergeCommitRequest
     * @return Result of the GetMergeCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetMergeCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeCommit" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMergeCommitResult getMergeCommit(GetMergeCommitRequest request) {
        request = beforeClientExecution(request);
        return executeGetMergeCommit(request);
    }

    @SdkInternalApi
    final GetMergeCommitResult executeGetMergeCommit(GetMergeCommitRequest getMergeCommitRequest) {

        ExecutionContext executionContext = createExecutionContext(getMergeCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMergeCommitRequest> request = null;
        Response<GetMergeCommitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMergeCommitRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMergeCommitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMergeCommit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMergeCommitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMergeCommitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about merge conflicts between the before and after commit IDs for a pull request in a
     * repository.
     * </p>
     * 
     * @param getMergeConflictsRequest
     * @return Result of the GetMergeConflicts operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws MergeOptionRequiredException
     *         A merge option or stategy is required, and none was provided.
     * @throws InvalidMergeOptionException
     *         The specified merge option is not valid for this operation. Not all merge strategies are supported for
     *         all operations.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws InvalidMaxConflictFilesException
     *         The specified value for the number of conflict files to return is not valid.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidDestinationCommitSpecifierException
     *         The destination commit specifier is not valid. You must provide a valid branch name, tag, or full commit
     *         ID.
     * @throws InvalidSourceCommitSpecifierException
     *         The source commit specifier is not valid. You must provide a valid branch name, tag, or full commit ID.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The maximum number of items to compare between the source or destination branches and the merge base has
     *         exceeded the maximum allowed.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeConflicts" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMergeConflictsResult getMergeConflicts(GetMergeConflictsRequest request) {
        request = beforeClientExecution(request);
        return executeGetMergeConflicts(request);
    }

    @SdkInternalApi
    final GetMergeConflictsResult executeGetMergeConflicts(GetMergeConflictsRequest getMergeConflictsRequest) {

        ExecutionContext executionContext = createExecutionContext(getMergeConflictsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMergeConflictsRequest> request = null;
        Response<GetMergeConflictsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMergeConflictsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMergeConflictsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMergeConflicts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMergeConflictsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMergeConflictsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the merge options available for merging two specified branches. For details about why a
     * particular merge option is not available, use GetMergeConflicts or DescribeMergeConflicts.
     * </p>
     * 
     * @param getMergeOptionsRequest
     * @return Result of the GetMergeOptions operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The maximum number of items to compare between the source or destination branches and the merge base has
     *         exceeded the maximum allowed.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetMergeOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeOptions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMergeOptionsResult getMergeOptions(GetMergeOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetMergeOptions(request);
    }

    @SdkInternalApi
    final GetMergeOptionsResult executeGetMergeOptions(GetMergeOptionsRequest getMergeOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getMergeOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMergeOptionsRequest> request = null;
        Response<GetMergeOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMergeOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMergeOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMergeOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMergeOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMergeOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a pull request in a specified repository.
     * </p>
     * 
     * @param getPullRequestRequest
     * @return Result of the GetPullRequest operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequest" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPullRequestResult getPullRequest(GetPullRequestRequest request) {
        request = beforeClientExecution(request);
        return executeGetPullRequest(request);
    }

    @SdkInternalApi
    final GetPullRequestResult executeGetPullRequest(GetPullRequestRequest getPullRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(getPullRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPullRequestRequest> request = null;
        Response<GetPullRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPullRequestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPullRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPullRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPullRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPullRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param getRepositoryRequest
     *        Represents the input of a get repository operation.
     * @return Result of the GetRepository operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepository" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRepositoryResult getRepository(GetRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetRepository(request);
    }

    @SdkInternalApi
    final GetRepositoryResult executeGetRepository(GetRepositoryRequest getRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryRequest> request = null;
        Response<GetRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about triggers configured for a repository.
     * </p>
     * 
     * @param getRepositoryTriggersRequest
     *        Represents the input of a get repository triggers operation.
     * @return Result of the GetRepositoryTriggers operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRepositoryTriggersResult getRepositoryTriggers(GetRepositoryTriggersRequest request) {
        request = beforeClientExecution(request);
        return executeGetRepositoryTriggers(request);
    }

    @SdkInternalApi
    final GetRepositoryTriggersResult executeGetRepositoryTriggers(GetRepositoryTriggersRequest getRepositoryTriggersRequest) {

        ExecutionContext executionContext = createExecutionContext(getRepositoryTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryTriggersRequest> request = null;
        Response<GetRepositoryTriggersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryTriggersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRepositoryTriggersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRepositoryTriggers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRepositoryTriggersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetRepositoryTriggersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more branches in a repository.
     * </p>
     * 
     * @param listBranchesRequest
     *        Represents the input of a list branches operation.
     * @return Result of the ListBranches operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @sample AWSCodeCommit.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBranchesResult listBranches(ListBranchesRequest request) {
        request = beforeClientExecution(request);
        return executeListBranches(request);
    }

    @SdkInternalApi
    final ListBranchesResult executeListBranches(ListBranchesRequest listBranchesRequest) {

        ExecutionContext executionContext = createExecutionContext(listBranchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBranchesRequest> request = null;
        Response<ListBranchesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBranchesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBranchesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBranches");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBranchesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBranchesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status
     * or pull request author ARN.
     * </p>
     * 
     * @param listPullRequestsRequest
     * @return Result of the ListPullRequests operation returned by the service.
     * @throws InvalidPullRequestStatusException
     *         The pull request status is not valid. The only valid values are <code>OPEN</code> and <code>CLOSED</code>
     *         .
     * @throws InvalidAuthorArnException
     *         The Amazon Resource Name (ARN) is not valid. Make sure that you have provided the full ARN for the author
     *         of the pull request, and then try again.
     * @throws AuthorDoesNotExistException
     *         The specified Amazon Resource Name (ARN) does not exist in the AWS account.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidMaxResultsException
     *         The specified number of maximum results is not valid.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.ListPullRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListPullRequests" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPullRequestsResult listPullRequests(ListPullRequestsRequest request) {
        request = beforeClientExecution(request);
        return executeListPullRequests(request);
    }

    @SdkInternalApi
    final ListPullRequestsResult executeListPullRequests(ListPullRequestsRequest listPullRequestsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPullRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPullRequestsRequest> request = null;
        Response<ListPullRequestsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPullRequestsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPullRequestsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPullRequests");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPullRequestsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPullRequestsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * 
     * @param listRepositoriesRequest
     *        Represents the input of a list repositories operation.
     * @return Result of the ListRepositories operation returned by the service.
     * @throws InvalidSortByException
     *         The specified sort by value is not valid.
     * @throws InvalidOrderException
     *         The specified sort order is not valid.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @sample AWSCodeCommit.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRepositoriesResult listRepositories(ListRepositoriesRequest request) {
        request = beforeClientExecution(request);
        return executeListRepositories(request);
    }

    @SdkInternalApi
    final ListRepositoriesResult executeListRepositories(ListRepositoriesRequest listRepositoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositoriesRequest> request = null;
        Response<ListRepositoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositoriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRepositoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRepositories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRepositoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRepositoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS CodeCommit. For a list of valid
     * resources in AWS CodeCommit, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ResourceArnRequiredException
     *         A valid Amazon Resource Name (ARN) for an AWS CodeCommit resource is required. For a list of valid
     *         resources in AWS CodeCommit, see <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @throws InvalidResourceArnException
     *         The value for the resource ARN is not valid. For more information about resources in AWS CodeCommit, see
     *         <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @sample AWSCodeCommit.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Merges two branches using the fast-forward merge strategy.
     * </p>
     * 
     * @param mergeBranchesByFastForwardRequest
     * @return Result of the MergeBranchesByFastForward operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidTargetBranchException
     *         The specified target branch is not valid.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Type the name of a current branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.MergeBranchesByFastForward
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesByFastForward"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public MergeBranchesByFastForwardResult mergeBranchesByFastForward(MergeBranchesByFastForwardRequest request) {
        request = beforeClientExecution(request);
        return executeMergeBranchesByFastForward(request);
    }

    @SdkInternalApi
    final MergeBranchesByFastForwardResult executeMergeBranchesByFastForward(MergeBranchesByFastForwardRequest mergeBranchesByFastForwardRequest) {

        ExecutionContext executionContext = createExecutionContext(mergeBranchesByFastForwardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeBranchesByFastForwardRequest> request = null;
        Response<MergeBranchesByFastForwardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeBranchesByFastForwardRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(mergeBranchesByFastForwardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MergeBranchesByFastForward");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MergeBranchesByFastForwardResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new MergeBranchesByFastForwardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Merges two branches using the squash merge strategy.
     * </p>
     * 
     * @param mergeBranchesBySquashRequest
     * @return Result of the MergeBranchesBySquash operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidTargetBranchException
     *         The specified target branch is not valid.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Type the name of a current branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws InvalidConflictResolutionException
     *         The specified conflict resolution list is not valid.
     * @throws MaximumConflictResolutionEntriesExceededException
     *         The number of allowed conflict resolution entries was exceeded.
     * @throws MultipleConflictResolutionEntriesException
     *         More than one conflict resolution entries exists for the conflict. A conflict can have only one conflict
     *         resolution entry.
     * @throws ReplacementTypeRequiredException
     *         A replacement type is required.
     * @throws InvalidReplacementTypeException
     *         Automerge was specified for resolving the conflict, but the specified replacement type is not valid.
     * @throws ReplacementContentRequiredException
     *         USE_NEW_CONTENT was specified but no replacement content has been provided.
     * @throws InvalidReplacementContentException
     *         Automerge was specified for resolving the conflict, but the replacement type is not valid or content is
     *         missing.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size that can be added is 6 MB, and
     *         the combined file content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The maximum number of items to compare between the source or destination branches and the merge base has
     *         exceeded the maximum allowed.
     * @throws FileModeRequiredException
     *         The commit cannot be created because a file mode is required to update mode permissions for an existing
     *         file, but no file mode has been specified.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.MergeBranchesBySquash
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesBySquash"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public MergeBranchesBySquashResult mergeBranchesBySquash(MergeBranchesBySquashRequest request) {
        request = beforeClientExecution(request);
        return executeMergeBranchesBySquash(request);
    }

    @SdkInternalApi
    final MergeBranchesBySquashResult executeMergeBranchesBySquash(MergeBranchesBySquashRequest mergeBranchesBySquashRequest) {

        ExecutionContext executionContext = createExecutionContext(mergeBranchesBySquashRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeBranchesBySquashRequest> request = null;
        Response<MergeBranchesBySquashResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeBranchesBySquashRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(mergeBranchesBySquashRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MergeBranchesBySquash");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MergeBranchesBySquashResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new MergeBranchesBySquashResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Merges two specified branches using the three-way merge strategy.
     * </p>
     * 
     * @param mergeBranchesByThreeWayRequest
     * @return Result of the MergeBranchesByThreeWay operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidTargetBranchException
     *         The specified target branch is not valid.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Type the name of a current branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws InvalidConflictResolutionException
     *         The specified conflict resolution list is not valid.
     * @throws MaximumConflictResolutionEntriesExceededException
     *         The number of allowed conflict resolution entries was exceeded.
     * @throws MultipleConflictResolutionEntriesException
     *         More than one conflict resolution entries exists for the conflict. A conflict can have only one conflict
     *         resolution entry.
     * @throws ReplacementTypeRequiredException
     *         A replacement type is required.
     * @throws InvalidReplacementTypeException
     *         Automerge was specified for resolving the conflict, but the specified replacement type is not valid.
     * @throws ReplacementContentRequiredException
     *         USE_NEW_CONTENT was specified but no replacement content has been provided.
     * @throws InvalidReplacementContentException
     *         Automerge was specified for resolving the conflict, but the replacement type is not valid or content is
     *         missing.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size that can be added is 6 MB, and
     *         the combined file content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The maximum number of items to compare between the source or destination branches and the merge base has
     *         exceeded the maximum allowed.
     * @throws FileModeRequiredException
     *         The commit cannot be created because a file mode is required to update mode permissions for an existing
     *         file, but no file mode has been specified.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.MergeBranchesByThreeWay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesByThreeWay"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public MergeBranchesByThreeWayResult mergeBranchesByThreeWay(MergeBranchesByThreeWayRequest request) {
        request = beforeClientExecution(request);
        return executeMergeBranchesByThreeWay(request);
    }

    @SdkInternalApi
    final MergeBranchesByThreeWayResult executeMergeBranchesByThreeWay(MergeBranchesByThreeWayRequest mergeBranchesByThreeWayRequest) {

        ExecutionContext executionContext = createExecutionContext(mergeBranchesByThreeWayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeBranchesByThreeWayRequest> request = null;
        Response<MergeBranchesByThreeWayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeBranchesByThreeWayRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(mergeBranchesByThreeWayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MergeBranchesByThreeWay");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MergeBranchesByThreeWayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new MergeBranchesByThreeWayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the fast-forward merge strategy. If the merge is successful, it closes the pull
     * request.
     * </p>
     * 
     * @param mergePullRequestByFastForwardRequest
     * @return Result of the MergePullRequestByFastForward operation returned by the service.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws TipOfSourceReferenceIsDifferentException
     *         The tip of the source branch in the destination repository does not match the tip of the source branch
     *         specified in your request. The pull request might have been updated. Make sure that you have the latest
     *         changes.
     * @throws ReferenceDoesNotExistException
     *         The specified reference does not exist. You must provide a full commit ID.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws RepositoryNotAssociatedWithPullRequestException
     *         The repository does not contain any pull requests with that pull request ID. Use GetPullRequest to verify
     *         the correct repository name for the pull request ID.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.MergePullRequestByFastForward
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByFastForward"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public MergePullRequestByFastForwardResult mergePullRequestByFastForward(MergePullRequestByFastForwardRequest request) {
        request = beforeClientExecution(request);
        return executeMergePullRequestByFastForward(request);
    }

    @SdkInternalApi
    final MergePullRequestByFastForwardResult executeMergePullRequestByFastForward(MergePullRequestByFastForwardRequest mergePullRequestByFastForwardRequest) {

        ExecutionContext executionContext = createExecutionContext(mergePullRequestByFastForwardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergePullRequestByFastForwardRequest> request = null;
        Response<MergePullRequestByFastForwardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergePullRequestByFastForwardRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(mergePullRequestByFastForwardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MergePullRequestByFastForward");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MergePullRequestByFastForwardResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new MergePullRequestByFastForwardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the squash merge strategy. If the merge is successful, it closes the pull request.
     * </p>
     * 
     * @param mergePullRequestBySquashRequest
     * @return Result of the MergePullRequestBySquash operation returned by the service.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws TipOfSourceReferenceIsDifferentException
     *         The tip of the source branch in the destination repository does not match the tip of the source branch
     *         specified in your request. The pull request might have been updated. Make sure that you have the latest
     *         changes.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws InvalidConflictResolutionException
     *         The specified conflict resolution list is not valid.
     * @throws ReplacementTypeRequiredException
     *         A replacement type is required.
     * @throws InvalidReplacementTypeException
     *         Automerge was specified for resolving the conflict, but the specified replacement type is not valid.
     * @throws MultipleConflictResolutionEntriesException
     *         More than one conflict resolution entries exists for the conflict. A conflict can have only one conflict
     *         resolution entry.
     * @throws ReplacementContentRequiredException
     *         USE_NEW_CONTENT was specified but no replacement content has been provided.
     * @throws MaximumConflictResolutionEntriesExceededException
     *         The number of allowed conflict resolution entries was exceeded.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws InvalidReplacementContentException
     *         Automerge was specified for resolving the conflict, but the replacement type is not valid or content is
     *         missing.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size that can be added is 6 MB, and
     *         the combined file content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The maximum number of items to compare between the source or destination branches and the merge base has
     *         exceeded the maximum allowed.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNotAssociatedWithPullRequestException
     *         The repository does not contain any pull requests with that pull request ID. Use GetPullRequest to verify
     *         the correct repository name for the pull request ID.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.MergePullRequestBySquash
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestBySquash"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public MergePullRequestBySquashResult mergePullRequestBySquash(MergePullRequestBySquashRequest request) {
        request = beforeClientExecution(request);
        return executeMergePullRequestBySquash(request);
    }

    @SdkInternalApi
    final MergePullRequestBySquashResult executeMergePullRequestBySquash(MergePullRequestBySquashRequest mergePullRequestBySquashRequest) {

        ExecutionContext executionContext = createExecutionContext(mergePullRequestBySquashRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergePullRequestBySquashRequest> request = null;
        Response<MergePullRequestBySquashResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergePullRequestBySquashRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(mergePullRequestBySquashRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MergePullRequestBySquash");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MergePullRequestBySquashResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new MergePullRequestBySquashResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the three-way merge strategy. If the merge is successful, it closes the pull
     * request.
     * </p>
     * 
     * @param mergePullRequestByThreeWayRequest
     * @return Result of the MergePullRequestByThreeWay operation returned by the service.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws TipOfSourceReferenceIsDifferentException
     *         The tip of the source branch in the destination repository does not match the tip of the source branch
     *         specified in your request. The pull request might have been updated. Make sure that you have the latest
     *         changes.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws InvalidConflictResolutionException
     *         The specified conflict resolution list is not valid.
     * @throws ReplacementTypeRequiredException
     *         A replacement type is required.
     * @throws InvalidReplacementTypeException
     *         Automerge was specified for resolving the conflict, but the specified replacement type is not valid.
     * @throws MultipleConflictResolutionEntriesException
     *         More than one conflict resolution entries exists for the conflict. A conflict can have only one conflict
     *         resolution entry.
     * @throws ReplacementContentRequiredException
     *         USE_NEW_CONTENT was specified but no replacement content has been provided.
     * @throws MaximumConflictResolutionEntriesExceededException
     *         The number of allowed conflict resolution entries was exceeded.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws InvalidReplacementContentException
     *         Automerge was specified for resolving the conflict, but the replacement type is not valid or content is
     *         missing.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size that can be added is 6 MB, and
     *         the combined file content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The maximum number of items to compare between the source or destination branches and the merge base has
     *         exceeded the maximum allowed.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNotAssociatedWithPullRequestException
     *         The repository does not contain any pull requests with that pull request ID. Use GetPullRequest to verify
     *         the correct repository name for the pull request ID.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.MergePullRequestByThreeWay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByThreeWay"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public MergePullRequestByThreeWayResult mergePullRequestByThreeWay(MergePullRequestByThreeWayRequest request) {
        request = beforeClientExecution(request);
        return executeMergePullRequestByThreeWay(request);
    }

    @SdkInternalApi
    final MergePullRequestByThreeWayResult executeMergePullRequestByThreeWay(MergePullRequestByThreeWayRequest mergePullRequestByThreeWayRequest) {

        ExecutionContext executionContext = createExecutionContext(mergePullRequestByThreeWayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergePullRequestByThreeWayRequest> request = null;
        Response<MergePullRequestByThreeWayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergePullRequestByThreeWayRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(mergePullRequestByThreeWayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MergePullRequestByThreeWay");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MergePullRequestByThreeWayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new MergePullRequestByThreeWayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Posts a comment on the comparison between two commits.
     * </p>
     * 
     * @param postCommentForComparedCommitRequest
     * @return Result of the PostCommentForComparedCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ClientRequestTokenRequiredException
     *         A client request token is required. A client request token is an unique, client-generated idempotency
     *         token that when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request will return
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be re-used.
     * @throws CommentContentRequiredException
     *         The comment is empty. You must provide some content for a comment. The content cannot be null.
     * @throws CommentContentSizeLimitExceededException
     *         The comment is too large. Comments are limited to 1,000 characters.
     * @throws InvalidFileLocationException
     *         The location of the file is not valid. Make sure that you include the extension of the file as well as
     *         the file name.
     * @throws InvalidRelativeFileVersionEnumException
     *         Either the enum is not in a valid format, or the specified file version enum is not valid in respect to
     *         the current file version.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidFilePositionException
     *         The position is not valid. Make sure that the line number exists in the version of the file you want to
     *         comment on.
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws BeforeCommitIdAndAfterCommitIdAreSameException
     *         The before commit ID and the after commit ID are the same, which is not valid. The before commit ID and
     *         the after commit ID must be different commit IDs.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws PathDoesNotExistException
     *         The specified path does not exist.
     * @sample AWSCodeCommit.PostCommentForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostCommentForComparedCommitResult postCommentForComparedCommit(PostCommentForComparedCommitRequest request) {
        request = beforeClientExecution(request);
        return executePostCommentForComparedCommit(request);
    }

    @SdkInternalApi
    final PostCommentForComparedCommitResult executePostCommentForComparedCommit(PostCommentForComparedCommitRequest postCommentForComparedCommitRequest) {

        ExecutionContext executionContext = createExecutionContext(postCommentForComparedCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostCommentForComparedCommitRequest> request = null;
        Response<PostCommentForComparedCommitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostCommentForComparedCommitRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(postCommentForComparedCommitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PostCommentForComparedCommit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PostCommentForComparedCommitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PostCommentForComparedCommitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Posts a comment on a pull request.
     * </p>
     * 
     * @param postCommentForPullRequestRequest
     * @return Result of the PostCommentForPullRequest operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws RepositoryNotAssociatedWithPullRequestException
     *         The repository does not contain any pull requests with that pull request ID. Use GetPullRequest to verify
     *         the correct repository name for the pull request ID.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ClientRequestTokenRequiredException
     *         A client request token is required. A client request token is an unique, client-generated idempotency
     *         token that when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request will return
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be re-used.
     * @throws CommentContentRequiredException
     *         The comment is empty. You must provide some content for a comment. The content cannot be null.
     * @throws CommentContentSizeLimitExceededException
     *         The comment is too large. Comments are limited to 1,000 characters.
     * @throws InvalidFileLocationException
     *         The location of the file is not valid. Make sure that you include the extension of the file as well as
     *         the file name.
     * @throws InvalidRelativeFileVersionEnumException
     *         Either the enum is not in a valid format, or the specified file version enum is not valid in respect to
     *         the current file version.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidFilePositionException
     *         The position is not valid. Make sure that the line number exists in the version of the file you want to
     *         comment on.
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws PathDoesNotExistException
     *         The specified path does not exist.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws BeforeCommitIdAndAfterCommitIdAreSameException
     *         The before commit ID and the after commit ID are the same, which is not valid. The before commit ID and
     *         the after commit ID must be different commit IDs.
     * @sample AWSCodeCommit.PostCommentForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostCommentForPullRequestResult postCommentForPullRequest(PostCommentForPullRequestRequest request) {
        request = beforeClientExecution(request);
        return executePostCommentForPullRequest(request);
    }

    @SdkInternalApi
    final PostCommentForPullRequestResult executePostCommentForPullRequest(PostCommentForPullRequestRequest postCommentForPullRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(postCommentForPullRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostCommentForPullRequestRequest> request = null;
        Response<PostCommentForPullRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostCommentForPullRequestRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(postCommentForPullRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PostCommentForPullRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PostCommentForPullRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PostCommentForPullRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
     * </p>
     * 
     * @param postCommentReplyRequest
     * @return Result of the PostCommentReply operation returned by the service.
     * @throws ClientRequestTokenRequiredException
     *         A client request token is required. A client request token is an unique, client-generated idempotency
     *         token that when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request will return
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be re-used.
     * @throws CommentContentRequiredException
     *         The comment is empty. You must provide some content for a comment. The content cannot be null.
     * @throws CommentContentSizeLimitExceededException
     *         The comment is too large. Comments are limited to 1,000 characters.
     * @throws CommentDoesNotExistException
     *         No comment exists with the provided ID. Verify that you have provided the correct ID, and then try again.
     * @throws CommentIdRequiredException
     *         The comment ID is missing or null. A comment ID is required.
     * @throws InvalidCommentIdException
     *         The comment ID is not in a valid format. Make sure that you have provided the full comment ID.
     * @sample AWSCodeCommit.PostCommentReply
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentReply" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PostCommentReplyResult postCommentReply(PostCommentReplyRequest request) {
        request = beforeClientExecution(request);
        return executePostCommentReply(request);
    }

    @SdkInternalApi
    final PostCommentReplyResult executePostCommentReply(PostCommentReplyRequest postCommentReplyRequest) {

        ExecutionContext executionContext = createExecutionContext(postCommentReplyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostCommentReplyRequest> request = null;
        Response<PostCommentReplyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostCommentReplyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(postCommentReplyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PostCommentReply");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PostCommentReplyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PostCommentReplyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in
     * the specified branch.
     * </p>
     * 
     * @param putFileRequest
     * @return Result of the PutFile operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws ParentCommitIdRequiredException
     *         A parent commit ID is required. To view the full commit ID of a branch in a repository, use
     *         <a>GetBranch</a> or a Git command (for example, git pull or git log).
     * @throws InvalidParentCommitIdException
     *         The parent commit ID is not valid. The commit ID cannot be empty, and must match the head commit ID for
     *         the branch of the repository where you want to add or update a file.
     * @throws ParentCommitDoesNotExistException
     *         The parent commit ID is not valid because it does not exist. The specified parent commit ID does not
     *         exist in the specified branch of the repository.
     * @throws ParentCommitIdOutdatedException
     *         The file could not be added because the provided parent commit ID is not the current tip of the specified
     *         branch. To view the full commit ID of the current head of the branch, use <a>GetBranch</a>.
     * @throws FileContentRequiredException
     *         The file cannot be added because it is empty. Empty files cannot be added to the repository with this
     *         API.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size that can be added is 6 MB, and
     *         the combined file content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Type the name of a current branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws InvalidDeletionParameterException
     *         The specified deletion parameter is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws SameFileContentException
     *         The file was not added or updated because the content of the file is exactly the same as the content of
     *         that file in the repository and branch that you specified.
     * @throws FileNameConflictsWithDirectoryNameException
     *         A file cannot be added to the repository because the specified file name has the same name as a directory
     *         in this repository. Either provide another name for the file, or add the file in a directory that does
     *         not match the file name.
     * @throws DirectoryNameConflictsWithFileNameException
     *         A file cannot be added to the repository because the specified path name has the same name as a file that
     *         already exists in this repository. Either provide a different name for the file, or specify a different
     *         path for the file.
     * @throws FilePathConflictsWithSubmodulePathException
     *         The commit cannot be created because a specified file path points to a submodule. Verify that the
     *         destination files have valid file paths that do not point to a submodule.
     * @sample AWSCodeCommit.PutFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutFile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutFileResult putFile(PutFileRequest request) {
        request = beforeClientExecution(request);
        return executePutFile(request);
    }

    @SdkInternalApi
    final PutFileResult executePutFile(PutFileRequest putFileRequest) {

        ExecutionContext executionContext = createExecutionContext(putFileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutFileRequest> request = null;
        Response<PutFileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutFileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putFileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutFile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutFileResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutFileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replaces all triggers for a repository. This can be used to create or delete triggers.
     * </p>
     * 
     * @param putRepositoryTriggersRequest
     *        Represents the input ofa put repository triggers operation.
     * @return Result of the PutRepositoryTriggers operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryTriggersListRequiredException
     *         The list of triggers for the repository is required but was not specified.
     * @throws MaximumRepositoryTriggersExceededException
     *         The number of triggers allowed for the repository was exceeded.
     * @throws InvalidRepositoryTriggerNameException
     *         The name of the trigger is not valid.
     * @throws InvalidRepositoryTriggerDestinationArnException
     *         The Amazon Resource Name (ARN) for the trigger is not valid for the specified destination. The most
     *         common reason for this error is that the ARN does not meet the requirements for the service type.
     * @throws InvalidRepositoryTriggerRegionException
     *         The region for the trigger target does not match the region for the repository. Triggers must be created
     *         in the same region as the target for the trigger.
     * @throws InvalidRepositoryTriggerCustomDataException
     *         The custom data provided for the trigger is not valid.
     * @throws MaximumBranchesExceededException
     *         The number of branches for the trigger was exceeded.
     * @throws InvalidRepositoryTriggerBranchNameException
     *         One or more branch names specified for the trigger is not valid.
     * @throws InvalidRepositoryTriggerEventsException
     *         One or more events specified for the trigger is not valid. Check to make sure that all events specified
     *         match the requirements for allowed events.
     * @throws RepositoryTriggerNameRequiredException
     *         A name for the trigger is required but was not specified.
     * @throws RepositoryTriggerDestinationArnRequiredException
     *         A destination ARN for the target service for the trigger is required but was not specified.
     * @throws RepositoryTriggerBranchNameListRequiredException
     *         At least one branch name is required but was not specified in the trigger configuration.
     * @throws RepositoryTriggerEventsListRequiredException
     *         At least one event for the trigger is required but was not specified.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.PutRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutRepositoryTriggersResult putRepositoryTriggers(PutRepositoryTriggersRequest request) {
        request = beforeClientExecution(request);
        return executePutRepositoryTriggers(request);
    }

    @SdkInternalApi
    final PutRepositoryTriggersResult executePutRepositoryTriggers(PutRepositoryTriggersRequest putRepositoryTriggersRequest) {

        ExecutionContext executionContext = createExecutionContext(putRepositoryTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRepositoryTriggersRequest> request = null;
        Response<PutRepositoryTriggersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRepositoryTriggersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRepositoryTriggersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRepositoryTriggers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRepositoryTriggersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutRepositoryTriggersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see <a
     * href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ResourceArnRequiredException
     *         A valid Amazon Resource Name (ARN) for an AWS CodeCommit resource is required. For a list of valid
     *         resources in AWS CodeCommit, see <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @throws InvalidResourceArnException
     *         The value for the resource ARN is not valid. For more information about resources in AWS CodeCommit, see
     *         <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @throws TagsMapRequiredException
     *         A map of tags is required.
     * @throws InvalidTagsMapException
     *         The map of tags is not valid.
     * @throws TooManyTagsException
     *         The maximum number of tags for an AWS CodeCommit resource has been exceeded.
     * @throws InvalidSystemTagUsageException
     *         The specified tag is not valid. Key names cannot be prefixed with aws:.
     * @throws TagPolicyException
     *         The tag policy is not valid.
     * @sample AWSCodeCommit.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tests the functionality of repository triggers by sending information to the trigger target. If real data is
     * available in the repository, the test will send data from the last commit. If no data is available, sample data
     * will be generated.
     * </p>
     * 
     * @param testRepositoryTriggersRequest
     *        Represents the input of a test repository triggers operation.
     * @return Result of the TestRepositoryTriggers operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryTriggersListRequiredException
     *         The list of triggers for the repository is required but was not specified.
     * @throws MaximumRepositoryTriggersExceededException
     *         The number of triggers allowed for the repository was exceeded.
     * @throws InvalidRepositoryTriggerNameException
     *         The name of the trigger is not valid.
     * @throws InvalidRepositoryTriggerDestinationArnException
     *         The Amazon Resource Name (ARN) for the trigger is not valid for the specified destination. The most
     *         common reason for this error is that the ARN does not meet the requirements for the service type.
     * @throws InvalidRepositoryTriggerRegionException
     *         The region for the trigger target does not match the region for the repository. Triggers must be created
     *         in the same region as the target for the trigger.
     * @throws InvalidRepositoryTriggerCustomDataException
     *         The custom data provided for the trigger is not valid.
     * @throws MaximumBranchesExceededException
     *         The number of branches for the trigger was exceeded.
     * @throws InvalidRepositoryTriggerBranchNameException
     *         One or more branch names specified for the trigger is not valid.
     * @throws InvalidRepositoryTriggerEventsException
     *         One or more events specified for the trigger is not valid. Check to make sure that all events specified
     *         match the requirements for allowed events.
     * @throws RepositoryTriggerNameRequiredException
     *         A name for the trigger is required but was not specified.
     * @throws RepositoryTriggerDestinationArnRequiredException
     *         A destination ARN for the target service for the trigger is required but was not specified.
     * @throws RepositoryTriggerBranchNameListRequiredException
     *         At least one branch name is required but was not specified in the trigger configuration.
     * @throws RepositoryTriggerEventsListRequiredException
     *         At least one event for the trigger is required but was not specified.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.TestRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/TestRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TestRepositoryTriggersResult testRepositoryTriggers(TestRepositoryTriggersRequest request) {
        request = beforeClientExecution(request);
        return executeTestRepositoryTriggers(request);
    }

    @SdkInternalApi
    final TestRepositoryTriggersResult executeTestRepositoryTriggers(TestRepositoryTriggersRequest testRepositoryTriggersRequest) {

        ExecutionContext executionContext = createExecutionContext(testRepositoryTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestRepositoryTriggersRequest> request = null;
        Response<TestRepositoryTriggersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestRepositoryTriggersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testRepositoryTriggersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestRepositoryTriggers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestRepositoryTriggersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new TestRepositoryTriggersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ResourceArnRequiredException
     *         A valid Amazon Resource Name (ARN) for an AWS CodeCommit resource is required. For a list of valid
     *         resources in AWS CodeCommit, see <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @throws InvalidResourceArnException
     *         The value for the resource ARN is not valid. For more information about resources in AWS CodeCommit, see
     *         <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @throws TagKeysListRequiredException
     *         A list of tag keys is required. The list cannot be empty or null.
     * @throws InvalidTagKeysListException
     *         The list of tags is not valid.
     * @throws TooManyTagsException
     *         The maximum number of tags for an AWS CodeCommit resource has been exceeded.
     * @throws InvalidSystemTagUsageException
     *         The specified tag is not valid. Key names cannot be prefixed with aws:.
     * @throws TagPolicyException
     *         The tag policy is not valid.
     * @sample AWSCodeCommit.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replaces the contents of a comment.
     * </p>
     * 
     * @param updateCommentRequest
     * @return Result of the UpdateComment operation returned by the service.
     * @throws CommentContentRequiredException
     *         The comment is empty. You must provide some content for a comment. The content cannot be null.
     * @throws CommentContentSizeLimitExceededException
     *         The comment is too large. Comments are limited to 1,000 characters.
     * @throws CommentDoesNotExistException
     *         No comment exists with the provided ID. Verify that you have provided the correct ID, and then try again.
     * @throws CommentIdRequiredException
     *         The comment ID is missing or null. A comment ID is required.
     * @throws InvalidCommentIdException
     *         The comment ID is not in a valid format. Make sure that you have provided the full comment ID.
     * @throws CommentNotCreatedByCallerException
     *         You cannot modify or delete this comment. Only comment authors can modify or delete their comments.
     * @throws CommentDeletedException
     *         This comment has already been deleted. You cannot edit or delete a deleted comment.
     * @sample AWSCodeCommit.UpdateComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateComment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateCommentResult updateComment(UpdateCommentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateComment(request);
    }

    @SdkInternalApi
    final UpdateCommentResult executeUpdateComment(UpdateCommentRequest updateCommentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCommentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCommentRequest> request = null;
        Response<UpdateCommentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCommentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCommentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateComment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCommentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCommentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets or changes the default branch name for the specified repository.
     * </p>
     * <note>
     * <p>
     * If you use this operation to change the default branch name to the current default branch name, a success message
     * is returned even though the default branch did not change.
     * </p>
     * </note>
     * 
     * @param updateDefaultBranchRequest
     *        Represents the input of an update default branch operation.
     * @return Result of the UpdateDefaultBranch operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.UpdateDefaultBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateDefaultBranch" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDefaultBranchResult updateDefaultBranch(UpdateDefaultBranchRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDefaultBranch(request);
    }

    @SdkInternalApi
    final UpdateDefaultBranchResult executeUpdateDefaultBranch(UpdateDefaultBranchRequest updateDefaultBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDefaultBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDefaultBranchRequest> request = null;
        Response<UpdateDefaultBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDefaultBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDefaultBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDefaultBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDefaultBranchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDefaultBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replaces the contents of the description of a pull request.
     * </p>
     * 
     * @param updatePullRequestDescriptionRequest
     * @return Result of the UpdatePullRequestDescription operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidDescriptionException
     *         The pull request description is not valid. Descriptions are limited to 1,000 characters in length.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @sample AWSCodeCommit.UpdatePullRequestDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestDescription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePullRequestDescriptionResult updatePullRequestDescription(UpdatePullRequestDescriptionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePullRequestDescription(request);
    }

    @SdkInternalApi
    final UpdatePullRequestDescriptionResult executeUpdatePullRequestDescription(UpdatePullRequestDescriptionRequest updatePullRequestDescriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePullRequestDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePullRequestDescriptionRequest> request = null;
        Response<UpdatePullRequestDescriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePullRequestDescriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updatePullRequestDescriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePullRequestDescription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePullRequestDescriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePullRequestDescriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of a pull request.
     * </p>
     * 
     * @param updatePullRequestStatusRequest
     * @return Result of the UpdatePullRequestStatus operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidPullRequestStatusUpdateException
     *         The pull request status update is not valid. The only valid update is from <code>OPEN</code> to
     *         <code>CLOSED</code>.
     * @throws InvalidPullRequestStatusException
     *         The pull request status is not valid. The only valid values are <code>OPEN</code> and <code>CLOSED</code>
     *         .
     * @throws PullRequestStatusRequiredException
     *         A pull request status is required, but none was provided.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.UpdatePullRequestStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePullRequestStatusResult updatePullRequestStatus(UpdatePullRequestStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePullRequestStatus(request);
    }

    @SdkInternalApi
    final UpdatePullRequestStatusResult executeUpdatePullRequestStatus(UpdatePullRequestStatusRequest updatePullRequestStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePullRequestStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePullRequestStatusRequest> request = null;
        Response<UpdatePullRequestStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePullRequestStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updatePullRequestStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePullRequestStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePullRequestStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePullRequestStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replaces the title of a pull request.
     * </p>
     * 
     * @param updatePullRequestTitleRequest
     * @return Result of the UpdatePullRequestTitle operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws TitleRequiredException
     *         A pull request title is required. It cannot be empty or null.
     * @throws InvalidTitleException
     *         The title of the pull request is not valid. Pull request titles cannot exceed 100 characters in length.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @sample AWSCodeCommit.UpdatePullRequestTitle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestTitle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePullRequestTitleResult updatePullRequestTitle(UpdatePullRequestTitleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePullRequestTitle(request);
    }

    @SdkInternalApi
    final UpdatePullRequestTitleResult executeUpdatePullRequestTitle(UpdatePullRequestTitleRequest updatePullRequestTitleRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePullRequestTitleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePullRequestTitleRequest> request = null;
        Response<UpdatePullRequestTitleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePullRequestTitleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePullRequestTitleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePullRequestTitle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePullRequestTitleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePullRequestTitleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets or changes the comment or description for a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param updateRepositoryDescriptionRequest
     *        Represents the input of an update repository description operation.
     * @return Result of the UpdateRepositoryDescription operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws InvalidRepositoryDescriptionException
     *         The specified repository description is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.UpdateRepositoryDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryDescription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRepositoryDescriptionResult updateRepositoryDescription(UpdateRepositoryDescriptionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRepositoryDescription(request);
    }

    @SdkInternalApi
    final UpdateRepositoryDescriptionResult executeUpdateRepositoryDescription(UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRepositoryDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRepositoryDescriptionRequest> request = null;
        Response<UpdateRepositoryDescriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRepositoryDescriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRepositoryDescriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRepositoryDescription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRepositoryDescriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRepositoryDescriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository
     * names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters.
     * The suffix ".git" is prohibited. For a full description of the limits on repository names, see <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">Limits</a> in the AWS CodeCommit User
     * Guide.
     * </p>
     * 
     * @param updateRepositoryNameRequest
     *        Represents the input of an update repository description operation.
     * @return Result of the UpdateRepositoryName operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNameExistsException
     *         The specified repository name already exists.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @sample AWSCodeCommit.UpdateRepositoryName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryName"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRepositoryNameResult updateRepositoryName(UpdateRepositoryNameRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRepositoryName(request);
    }

    @SdkInternalApi
    final UpdateRepositoryNameResult executeUpdateRepositoryName(UpdateRepositoryNameRequest updateRepositoryNameRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRepositoryNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRepositoryNameRequest> request = null;
        Response<UpdateRepositoryNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRepositoryNameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRepositoryNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeCommit");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRepositoryName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRepositoryNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRepositoryNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
