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

import javax.annotation.Generated;

import com.amazonaws.services.codecommit.model.*;

/**
 * Interface for accessing CodeCommit asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codecommit.AbstractAWSCodeCommitAsync} instead.
 * </p>
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
 * <a>PutFile</a>, which adds or modifies a file in a specified repository and branch.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Information about committed code in a repository, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateCommit</a>, which creates a commit for changes to a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBlob</a>, which returns the base-64 encoded content of an individual Git blob object within a repository.
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
 * <a>GetMergeConflicts</a>, which returns information about merge conflicts between the source and destination branch
 * in a pull request.
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
 * Information about comments in a repository, by calling the following:
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
 * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCodeCommitAsync extends AWSCodeCommit {

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
     * @return A Java Future containing the result of the BatchGetRepositories operation returned by the service.
     * @sample AWSCodeCommitAsync.BatchGetRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(BatchGetRepositoriesRequest batchGetRepositoriesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetRepositories operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.BatchGetRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(BatchGetRepositoriesRequest batchGetRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetRepositoriesRequest, BatchGetRepositoriesResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateBranch operation returned by the service.
     * @sample AWSCodeCommitAsync.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest createBranchRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBranch operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest createBranchRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBranchRequest, CreateBranchResult> asyncHandler);

    /**
     * <p>
     * Creates a commit for a repository on the tip of a specified branch.
     * </p>
     * 
     * @param createCommitRequest
     * @return A Java Future containing the result of the CreateCommit operation returned by the service.
     * @sample AWSCodeCommitAsync.CreateCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateCommit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCommitResult> createCommitAsync(CreateCommitRequest createCommitRequest);

    /**
     * <p>
     * Creates a commit for a repository on the tip of a specified branch.
     * </p>
     * 
     * @param createCommitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCommit operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.CreateCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateCommit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCommitResult> createCommitAsync(CreateCommitRequest createCommitRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCommitRequest, CreateCommitResult> asyncHandler);

    /**
     * <p>
     * Creates a pull request in the specified repository.
     * </p>
     * 
     * @param createPullRequestRequest
     * @return A Java Future containing the result of the CreatePullRequest operation returned by the service.
     * @sample AWSCodeCommitAsync.CreatePullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreatePullRequest" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePullRequestResult> createPullRequestAsync(CreatePullRequestRequest createPullRequestRequest);

    /**
     * <p>
     * Creates a pull request in the specified repository.
     * </p>
     * 
     * @param createPullRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePullRequest operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.CreatePullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreatePullRequest" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePullRequestResult> createPullRequestAsync(CreatePullRequestRequest createPullRequestRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePullRequestRequest, CreatePullRequestResult> asyncHandler);

    /**
     * <p>
     * Creates a new, empty repository.
     * </p>
     * 
     * @param createRepositoryRequest
     *        Represents the input of a create repository operation.
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AWSCodeCommitAsync.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Creates a new, empty repository.
     * </p>
     * 
     * @param createRepositoryRequest
     *        Represents the input of a create repository operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler);

    /**
     * <p>
     * Deletes a branch from a repository, unless that branch is the default branch for the repository.
     * </p>
     * 
     * @param deleteBranchRequest
     *        Represents the input of a delete branch operation.
     * @return A Java Future containing the result of the DeleteBranch operation returned by the service.
     * @sample AWSCodeCommitAsync.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(DeleteBranchRequest deleteBranchRequest);

    /**
     * <p>
     * Deletes a branch from a repository, unless that branch is the default branch for the repository.
     * </p>
     * 
     * @param deleteBranchRequest
     *        Represents the input of a delete branch operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBranch operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(DeleteBranchRequest deleteBranchRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBranchRequest, DeleteBranchResult> asyncHandler);

    /**
     * <p>
     * Deletes the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * 
     * @param deleteCommentContentRequest
     * @return A Java Future containing the result of the DeleteCommentContent operation returned by the service.
     * @sample AWSCodeCommitAsync.DeleteCommentContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteCommentContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCommentContentResult> deleteCommentContentAsync(DeleteCommentContentRequest deleteCommentContentRequest);

    /**
     * <p>
     * Deletes the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * 
     * @param deleteCommentContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCommentContent operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DeleteCommentContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteCommentContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCommentContentResult> deleteCommentContentAsync(DeleteCommentContentRequest deleteCommentContentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCommentContentRequest, DeleteCommentContentResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision.
     * The file will still exist in the commits prior to the commit that contains the deletion.
     * </p>
     * 
     * @param deleteFileRequest
     * @return A Java Future containing the result of the DeleteFile operation returned by the service.
     * @sample AWSCodeCommitAsync.DeleteFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileResult> deleteFileAsync(DeleteFileRequest deleteFileRequest);

    /**
     * <p>
     * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision.
     * The file will still exist in the commits prior to the commit that contains the deletion.
     * </p>
     * 
     * @param deleteFileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFile operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DeleteFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileResult> deleteFileAsync(DeleteFileRequest deleteFileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFileRequest, DeleteFileResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AWSCodeCommitAsync.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler);

    /**
     * <p>
     * Returns information about one or more pull request events.
     * </p>
     * 
     * @param describePullRequestEventsRequest
     * @return A Java Future containing the result of the DescribePullRequestEvents operation returned by the service.
     * @sample AWSCodeCommitAsync.DescribePullRequestEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribePullRequestEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePullRequestEventsResult> describePullRequestEventsAsync(
            DescribePullRequestEventsRequest describePullRequestEventsRequest);

    /**
     * <p>
     * Returns information about one or more pull request events.
     * </p>
     * 
     * @param describePullRequestEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePullRequestEvents operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DescribePullRequestEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribePullRequestEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePullRequestEventsResult> describePullRequestEventsAsync(
            DescribePullRequestEventsRequest describePullRequestEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePullRequestEventsRequest, DescribePullRequestEventsResult> asyncHandler);

    /**
     * <p>
     * Returns the base-64 encoded content of an individual blob within a repository.
     * </p>
     * 
     * @param getBlobRequest
     *        Represents the input of a get blob operation.
     * @return A Java Future containing the result of the GetBlob operation returned by the service.
     * @sample AWSCodeCommitAsync.GetBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBlob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlobResult> getBlobAsync(GetBlobRequest getBlobRequest);

    /**
     * <p>
     * Returns the base-64 encoded content of an individual blob within a repository.
     * </p>
     * 
     * @param getBlobRequest
     *        Represents the input of a get blob operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBlob operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBlob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlobResult> getBlobAsync(GetBlobRequest getBlobRequest,
            com.amazonaws.handlers.AsyncHandler<GetBlobRequest, GetBlobResult> asyncHandler);

    /**
     * <p>
     * Returns information about a repository branch, including its name and the last commit ID.
     * </p>
     * 
     * @param getBranchRequest
     *        Represents the input of a get branch operation.
     * @return A Java Future containing the result of the GetBranch operation returned by the service.
     * @sample AWSCodeCommitAsync.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest getBranchRequest);

    /**
     * <p>
     * Returns information about a repository branch, including its name and the last commit ID.
     * </p>
     * 
     * @param getBranchRequest
     *        Represents the input of a get branch operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBranch operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest getBranchRequest,
            com.amazonaws.handlers.AsyncHandler<GetBranchRequest, GetBranchResult> asyncHandler);

    /**
     * <p>
     * Returns the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * 
     * @param getCommentRequest
     * @return A Java Future containing the result of the GetComment operation returned by the service.
     * @sample AWSCodeCommitAsync.GetComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCommentResult> getCommentAsync(GetCommentRequest getCommentRequest);

    /**
     * <p>
     * Returns the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * 
     * @param getCommentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComment operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCommentResult> getCommentAsync(GetCommentRequest getCommentRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommentRequest, GetCommentResult> asyncHandler);

    /**
     * <p>
     * Returns information about comments made on the comparison between two commits.
     * </p>
     * 
     * @param getCommentsForComparedCommitRequest
     * @return A Java Future containing the result of the GetCommentsForComparedCommit operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.GetCommentsForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCommentsForComparedCommitResult> getCommentsForComparedCommitAsync(
            GetCommentsForComparedCommitRequest getCommentsForComparedCommitRequest);

    /**
     * <p>
     * Returns information about comments made on the comparison between two commits.
     * </p>
     * 
     * @param getCommentsForComparedCommitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCommentsForComparedCommit operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.GetCommentsForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCommentsForComparedCommitResult> getCommentsForComparedCommitAsync(
            GetCommentsForComparedCommitRequest getCommentsForComparedCommitRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommentsForComparedCommitRequest, GetCommentsForComparedCommitResult> asyncHandler);

    /**
     * <p>
     * Returns comments made on a pull request.
     * </p>
     * 
     * @param getCommentsForPullRequestRequest
     * @return A Java Future containing the result of the GetCommentsForPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsync.GetCommentsForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCommentsForPullRequestResult> getCommentsForPullRequestAsync(
            GetCommentsForPullRequestRequest getCommentsForPullRequestRequest);

    /**
     * <p>
     * Returns comments made on a pull request.
     * </p>
     * 
     * @param getCommentsForPullRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCommentsForPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetCommentsForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCommentsForPullRequestResult> getCommentsForPullRequestAsync(
            GetCommentsForPullRequestRequest getCommentsForPullRequestRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommentsForPullRequestRequest, GetCommentsForPullRequestResult> asyncHandler);

    /**
     * <p>
     * Returns information about a commit, including commit message and committer information.
     * </p>
     * 
     * @param getCommitRequest
     *        Represents the input of a get commit operation.
     * @return A Java Future containing the result of the GetCommit operation returned by the service.
     * @sample AWSCodeCommitAsync.GetCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCommitResult> getCommitAsync(GetCommitRequest getCommitRequest);

    /**
     * <p>
     * Returns information about a commit, including commit message and committer information.
     * </p>
     * 
     * @param getCommitRequest
     *        Represents the input of a get commit operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCommit operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCommitResult> getCommitAsync(GetCommitRequest getCommitRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommitRequest, GetCommitResult> asyncHandler);

    /**
     * <p>
     * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or
     * other fully qualified reference). Results can be limited to a specified path.
     * </p>
     * 
     * @param getDifferencesRequest
     * @return A Java Future containing the result of the GetDifferences operation returned by the service.
     * @sample AWSCodeCommitAsync.GetDifferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetDifferences" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDifferencesResult> getDifferencesAsync(GetDifferencesRequest getDifferencesRequest);

    /**
     * <p>
     * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or
     * other fully qualified reference). Results can be limited to a specified path.
     * </p>
     * 
     * @param getDifferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDifferences operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetDifferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetDifferences" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDifferencesResult> getDifferencesAsync(GetDifferencesRequest getDifferencesRequest,
            com.amazonaws.handlers.AsyncHandler<GetDifferencesRequest, GetDifferencesResult> asyncHandler);

    /**
     * <p>
     * Returns the base-64 encoded contents of a specified file and its metadata.
     * </p>
     * 
     * @param getFileRequest
     * @return A Java Future containing the result of the GetFile operation returned by the service.
     * @sample AWSCodeCommitAsync.GetFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFileResult> getFileAsync(GetFileRequest getFileRequest);

    /**
     * <p>
     * Returns the base-64 encoded contents of a specified file and its metadata.
     * </p>
     * 
     * @param getFileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFile operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFileResult> getFileAsync(GetFileRequest getFileRequest,
            com.amazonaws.handlers.AsyncHandler<GetFileRequest, GetFileResult> asyncHandler);

    /**
     * <p>
     * Returns the contents of a specified folder in a repository.
     * </p>
     * 
     * @param getFolderRequest
     * @return A Java Future containing the result of the GetFolder operation returned by the service.
     * @sample AWSCodeCommitAsync.GetFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFolderResult> getFolderAsync(GetFolderRequest getFolderRequest);

    /**
     * <p>
     * Returns the contents of a specified folder in a repository.
     * </p>
     * 
     * @param getFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFolder operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFolderResult> getFolderAsync(GetFolderRequest getFolderRequest,
            com.amazonaws.handlers.AsyncHandler<GetFolderRequest, GetFolderResult> asyncHandler);

    /**
     * <p>
     * Returns information about merge conflicts between the before and after commit IDs for a pull request in a
     * repository.
     * </p>
     * 
     * @param getMergeConflictsRequest
     * @return A Java Future containing the result of the GetMergeConflicts operation returned by the service.
     * @sample AWSCodeCommitAsync.GetMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeConflicts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMergeConflictsResult> getMergeConflictsAsync(GetMergeConflictsRequest getMergeConflictsRequest);

    /**
     * <p>
     * Returns information about merge conflicts between the before and after commit IDs for a pull request in a
     * repository.
     * </p>
     * 
     * @param getMergeConflictsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMergeConflicts operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeConflicts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMergeConflictsResult> getMergeConflictsAsync(GetMergeConflictsRequest getMergeConflictsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMergeConflictsRequest, GetMergeConflictsResult> asyncHandler);

    /**
     * <p>
     * Gets information about a pull request in a specified repository.
     * </p>
     * 
     * @param getPullRequestRequest
     * @return A Java Future containing the result of the GetPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsync.GetPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequest" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPullRequestResult> getPullRequestAsync(GetPullRequestRequest getPullRequestRequest);

    /**
     * <p>
     * Gets information about a pull request in a specified repository.
     * </p>
     * 
     * @param getPullRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequest" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPullRequestResult> getPullRequestAsync(GetPullRequestRequest getPullRequestRequest,
            com.amazonaws.handlers.AsyncHandler<GetPullRequestRequest, GetPullRequestResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRepository operation returned by the service.
     * @sample AWSCodeCommitAsync.GetRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(GetRepositoryRequest getRepositoryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepository operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(GetRepositoryRequest getRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryRequest, GetRepositoryResult> asyncHandler);

    /**
     * <p>
     * Gets information about triggers configured for a repository.
     * </p>
     * 
     * @param getRepositoryTriggersRequest
     *        Represents the input of a get repository triggers operation.
     * @return A Java Future containing the result of the GetRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsync.GetRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryTriggersResult> getRepositoryTriggersAsync(GetRepositoryTriggersRequest getRepositoryTriggersRequest);

    /**
     * <p>
     * Gets information about triggers configured for a repository.
     * </p>
     * 
     * @param getRepositoryTriggersRequest
     *        Represents the input of a get repository triggers operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.GetRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryTriggersResult> getRepositoryTriggersAsync(GetRepositoryTriggersRequest getRepositoryTriggersRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryTriggersRequest, GetRepositoryTriggersResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more branches in a repository.
     * </p>
     * 
     * @param listBranchesRequest
     *        Represents the input of a list branches operation.
     * @return A Java Future containing the result of the ListBranches operation returned by the service.
     * @sample AWSCodeCommitAsync.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest listBranchesRequest);

    /**
     * <p>
     * Gets information about one or more branches in a repository.
     * </p>
     * 
     * @param listBranchesRequest
     *        Represents the input of a list branches operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBranches operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest listBranchesRequest,
            com.amazonaws.handlers.AsyncHandler<ListBranchesRequest, ListBranchesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status
     * or pull request author ARN.
     * </p>
     * 
     * @param listPullRequestsRequest
     * @return A Java Future containing the result of the ListPullRequests operation returned by the service.
     * @sample AWSCodeCommitAsync.ListPullRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListPullRequests" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPullRequestsResult> listPullRequestsAsync(ListPullRequestsRequest listPullRequestsRequest);

    /**
     * <p>
     * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status
     * or pull request author ARN.
     * </p>
     * 
     * @param listPullRequestsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPullRequests operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.ListPullRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListPullRequests" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPullRequestsResult> listPullRequestsAsync(ListPullRequestsRequest listPullRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPullRequestsRequest, ListPullRequestsResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * 
     * @param listRepositoriesRequest
     *        Represents the input of a list repositories operation.
     * @return A Java Future containing the result of the ListRepositories operation returned by the service.
     * @sample AWSCodeCommitAsync.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest listRepositoriesRequest);

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * 
     * @param listRepositoriesRequest
     *        Represents the input of a list repositories operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRepositories operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest listRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Closes a pull request and attempts to merge the source commit of a pull request into the specified destination
     * branch for that pull request at the specified commit using the fast-forward merge option.
     * </p>
     * 
     * @param mergePullRequestByFastForwardRequest
     * @return A Java Future containing the result of the MergePullRequestByFastForward operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.MergePullRequestByFastForward
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByFastForward"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergePullRequestByFastForwardResult> mergePullRequestByFastForwardAsync(
            MergePullRequestByFastForwardRequest mergePullRequestByFastForwardRequest);

    /**
     * <p>
     * Closes a pull request and attempts to merge the source commit of a pull request into the specified destination
     * branch for that pull request at the specified commit using the fast-forward merge option.
     * </p>
     * 
     * @param mergePullRequestByFastForwardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MergePullRequestByFastForward operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.MergePullRequestByFastForward
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByFastForward"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergePullRequestByFastForwardResult> mergePullRequestByFastForwardAsync(
            MergePullRequestByFastForwardRequest mergePullRequestByFastForwardRequest,
            com.amazonaws.handlers.AsyncHandler<MergePullRequestByFastForwardRequest, MergePullRequestByFastForwardResult> asyncHandler);

    /**
     * <p>
     * Posts a comment on the comparison between two commits.
     * </p>
     * 
     * @param postCommentForComparedCommitRequest
     * @return A Java Future containing the result of the PostCommentForComparedCommit operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.PostCommentForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentForComparedCommitResult> postCommentForComparedCommitAsync(
            PostCommentForComparedCommitRequest postCommentForComparedCommitRequest);

    /**
     * <p>
     * Posts a comment on the comparison between two commits.
     * </p>
     * 
     * @param postCommentForComparedCommitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PostCommentForComparedCommit operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.PostCommentForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentForComparedCommitResult> postCommentForComparedCommitAsync(
            PostCommentForComparedCommitRequest postCommentForComparedCommitRequest,
            com.amazonaws.handlers.AsyncHandler<PostCommentForComparedCommitRequest, PostCommentForComparedCommitResult> asyncHandler);

    /**
     * <p>
     * Posts a comment on a pull request.
     * </p>
     * 
     * @param postCommentForPullRequestRequest
     * @return A Java Future containing the result of the PostCommentForPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsync.PostCommentForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentForPullRequestResult> postCommentForPullRequestAsync(
            PostCommentForPullRequestRequest postCommentForPullRequestRequest);

    /**
     * <p>
     * Posts a comment on a pull request.
     * </p>
     * 
     * @param postCommentForPullRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PostCommentForPullRequest operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.PostCommentForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentForPullRequestResult> postCommentForPullRequestAsync(
            PostCommentForPullRequestRequest postCommentForPullRequestRequest,
            com.amazonaws.handlers.AsyncHandler<PostCommentForPullRequestRequest, PostCommentForPullRequestResult> asyncHandler);

    /**
     * <p>
     * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
     * </p>
     * 
     * @param postCommentReplyRequest
     * @return A Java Future containing the result of the PostCommentReply operation returned by the service.
     * @sample AWSCodeCommitAsync.PostCommentReply
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentReply" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentReplyResult> postCommentReplyAsync(PostCommentReplyRequest postCommentReplyRequest);

    /**
     * <p>
     * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
     * </p>
     * 
     * @param postCommentReplyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PostCommentReply operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.PostCommentReply
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentReply" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PostCommentReplyResult> postCommentReplyAsync(PostCommentReplyRequest postCommentReplyRequest,
            com.amazonaws.handlers.AsyncHandler<PostCommentReplyRequest, PostCommentReplyResult> asyncHandler);

    /**
     * <p>
     * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in
     * the specified branch.
     * </p>
     * 
     * @param putFileRequest
     * @return A Java Future containing the result of the PutFile operation returned by the service.
     * @sample AWSCodeCommitAsync.PutFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFileResult> putFileAsync(PutFileRequest putFileRequest);

    /**
     * <p>
     * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in
     * the specified branch.
     * </p>
     * 
     * @param putFileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFile operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.PutFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutFile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFileResult> putFileAsync(PutFileRequest putFileRequest,
            com.amazonaws.handlers.AsyncHandler<PutFileRequest, PutFileResult> asyncHandler);

    /**
     * <p>
     * Replaces all triggers for a repository. This can be used to create or delete triggers.
     * </p>
     * 
     * @param putRepositoryTriggersRequest
     *        Represents the input ofa put repository triggers operation.
     * @return A Java Future containing the result of the PutRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsync.PutRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRepositoryTriggersResult> putRepositoryTriggersAsync(PutRepositoryTriggersRequest putRepositoryTriggersRequest);

    /**
     * <p>
     * Replaces all triggers for a repository. This can be used to create or delete triggers.
     * </p>
     * 
     * @param putRepositoryTriggersRequest
     *        Represents the input ofa put repository triggers operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.PutRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRepositoryTriggersResult> putRepositoryTriggersAsync(PutRepositoryTriggersRequest putRepositoryTriggersRequest,
            com.amazonaws.handlers.AsyncHandler<PutRepositoryTriggersRequest, PutRepositoryTriggersResult> asyncHandler);

    /**
     * <p>
     * Tests the functionality of repository triggers by sending information to the trigger target. If real data is
     * available in the repository, the test will send data from the last commit. If no data is available, sample data
     * will be generated.
     * </p>
     * 
     * @param testRepositoryTriggersRequest
     *        Represents the input of a test repository triggers operation.
     * @return A Java Future containing the result of the TestRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsync.TestRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/TestRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TestRepositoryTriggersResult> testRepositoryTriggersAsync(TestRepositoryTriggersRequest testRepositoryTriggersRequest);

    /**
     * <p>
     * Tests the functionality of repository triggers by sending information to the trigger target. If real data is
     * available in the repository, the test will send data from the last commit. If no data is available, sample data
     * will be generated.
     * </p>
     * 
     * @param testRepositoryTriggersRequest
     *        Represents the input of a test repository triggers operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.TestRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/TestRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TestRepositoryTriggersResult> testRepositoryTriggersAsync(TestRepositoryTriggersRequest testRepositoryTriggersRequest,
            com.amazonaws.handlers.AsyncHandler<TestRepositoryTriggersRequest, TestRepositoryTriggersResult> asyncHandler);

    /**
     * <p>
     * Replaces the contents of a comment.
     * </p>
     * 
     * @param updateCommentRequest
     * @return A Java Future containing the result of the UpdateComment operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdateComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCommentResult> updateCommentAsync(UpdateCommentRequest updateCommentRequest);

    /**
     * <p>
     * Replaces the contents of a comment.
     * </p>
     * 
     * @param updateCommentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateComment operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdateComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCommentResult> updateCommentAsync(UpdateCommentRequest updateCommentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCommentRequest, UpdateCommentResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateDefaultBranch operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdateDefaultBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateDefaultBranch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDefaultBranchResult> updateDefaultBranchAsync(UpdateDefaultBranchRequest updateDefaultBranchRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDefaultBranch operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdateDefaultBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateDefaultBranch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDefaultBranchResult> updateDefaultBranchAsync(UpdateDefaultBranchRequest updateDefaultBranchRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDefaultBranchRequest, UpdateDefaultBranchResult> asyncHandler);

    /**
     * <p>
     * Replaces the contents of the description of a pull request.
     * </p>
     * 
     * @param updatePullRequestDescriptionRequest
     * @return A Java Future containing the result of the UpdatePullRequestDescription operation returned by the
     *         service.
     * @sample AWSCodeCommitAsync.UpdatePullRequestDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestDescription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestDescriptionResult> updatePullRequestDescriptionAsync(
            UpdatePullRequestDescriptionRequest updatePullRequestDescriptionRequest);

    /**
     * <p>
     * Replaces the contents of the description of a pull request.
     * </p>
     * 
     * @param updatePullRequestDescriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePullRequestDescription operation returned by the
     *         service.
     * @sample AWSCodeCommitAsyncHandler.UpdatePullRequestDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestDescription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestDescriptionResult> updatePullRequestDescriptionAsync(
            UpdatePullRequestDescriptionRequest updatePullRequestDescriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestDescriptionRequest, UpdatePullRequestDescriptionResult> asyncHandler);

    /**
     * <p>
     * Updates the status of a pull request.
     * </p>
     * 
     * @param updatePullRequestStatusRequest
     * @return A Java Future containing the result of the UpdatePullRequestStatus operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdatePullRequestStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestStatusResult> updatePullRequestStatusAsync(UpdatePullRequestStatusRequest updatePullRequestStatusRequest);

    /**
     * <p>
     * Updates the status of a pull request.
     * </p>
     * 
     * @param updatePullRequestStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePullRequestStatus operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdatePullRequestStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestStatusResult> updatePullRequestStatusAsync(UpdatePullRequestStatusRequest updatePullRequestStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestStatusRequest, UpdatePullRequestStatusResult> asyncHandler);

    /**
     * <p>
     * Replaces the title of a pull request.
     * </p>
     * 
     * @param updatePullRequestTitleRequest
     * @return A Java Future containing the result of the UpdatePullRequestTitle operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdatePullRequestTitle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestTitle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestTitleResult> updatePullRequestTitleAsync(UpdatePullRequestTitleRequest updatePullRequestTitleRequest);

    /**
     * <p>
     * Replaces the title of a pull request.
     * </p>
     * 
     * @param updatePullRequestTitleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePullRequestTitle operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdatePullRequestTitle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestTitle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePullRequestTitleResult> updatePullRequestTitleAsync(UpdatePullRequestTitleRequest updatePullRequestTitleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePullRequestTitleRequest, UpdatePullRequestTitleResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRepositoryDescription operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdateRepositoryDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryDescription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryDescriptionResult> updateRepositoryDescriptionAsync(
            UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRepositoryDescription operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdateRepositoryDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryDescription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryDescriptionResult> updateRepositoryDescriptionAsync(
            UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryDescriptionRequest, UpdateRepositoryDescriptionResult> asyncHandler);

    /**
     * <p>
     * Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository
     * names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters.
     * The suffix ".git" is prohibited. For a full description of the limits on repository names, see <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">Limits</a> in the AWS CodeCommit User
     * Guide.
     * </p>
     * 
     * @param updateRepositoryNameRequest
     *        Represents the input of an update repository description operation.
     * @return A Java Future containing the result of the UpdateRepositoryName operation returned by the service.
     * @sample AWSCodeCommitAsync.UpdateRepositoryName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryNameResult> updateRepositoryNameAsync(UpdateRepositoryNameRequest updateRepositoryNameRequest);

    /**
     * <p>
     * Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository
     * names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters.
     * The suffix ".git" is prohibited. For a full description of the limits on repository names, see <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">Limits</a> in the AWS CodeCommit User
     * Guide.
     * </p>
     * 
     * @param updateRepositoryNameRequest
     *        Represents the input of an update repository description operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRepositoryName operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.UpdateRepositoryName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryNameResult> updateRepositoryNameAsync(UpdateRepositoryNameRequest updateRepositoryNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryNameRequest, UpdateRepositoryNameResult> asyncHandler);

}
