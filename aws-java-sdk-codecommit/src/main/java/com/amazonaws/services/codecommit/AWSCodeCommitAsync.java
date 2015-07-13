/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codecommit;

import com.amazonaws.services.codecommit.model.*;

/**
 * Interface for accessing CodeCommit asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CodeCommit</fullname>
 * <p>
 * This is the <i>AWS CodeCommit API Reference</i>. This reference provides
 * descriptions of the AWS CodeCommit API.
 * </p>
 * <p>
 * You can use the AWS CodeCommit API to work with the following objects:
 * </p>
 * <ul>
 * <li>Repositories</li>
 * <li>Branches</li>
 * <li>Commits</li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeCommit, see the <i>AWS CodeCommit
 * User Guide</i>.
 * </p>
 */
public interface AWSCodeCommitAsync extends AWSCodeCommit {

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a web page could expose users to
     * potentially malicious code. Make sure that you HTML-encode the
     * description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param batchGetRepositoriesRequest
     *        Represents the input of a batch get repositories operation.
     * @return A Java Future containing the result of the BatchGetRepositories
     *         operation returned by the service.
     */
    java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(
            BatchGetRepositoriesRequest batchGetRepositoriesRequest);

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a web page could expose users to
     * potentially malicious code. Make sure that you HTML-encode the
     * description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param batchGetRepositoriesRequest
     *        Represents the input of a batch get repositories operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetRepositories
     *         operation returned by the service.
     */
    java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(
            BatchGetRepositoriesRequest batchGetRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetRepositoriesRequest, BatchGetRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Creates a new branch in a repository and points the branch to a commit.
     * </p>
     * <note>Calling the create branch operation does not set a repository's
     * default branch. To do this, call the update default branch
     * operation.</note>
     * 
     * @param createBranchRequest
     *        Represents the input of a create branch operation.
     */
    java.util.concurrent.Future<Void> createBranchAsync(
            CreateBranchRequest createBranchRequest);

    /**
     * <p>
     * Creates a new branch in a repository and points the branch to a commit.
     * </p>
     * <note>Calling the create branch operation does not set a repository's
     * default branch. To do this, call the update default branch
     * operation.</note>
     * 
     * @param createBranchRequest
     *        Represents the input of a create branch operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> createBranchAsync(
            CreateBranchRequest createBranchRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBranchRequest, Void> asyncHandler);

    /**
     * <p>
     * Creates a new, empty repository.
     * </p>
     * 
     * @param createRepositoryRequest
     *        Represents the input of a create repository operation.
     * @return A Java Future containing the result of the CreateRepository
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(
            CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Creates a new, empty repository.
     * </p>
     * 
     * @param createRepositoryRequest
     *        Represents the input of a create repository operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRepository
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(
            CreateRepositoryRequest createRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler);

    /**
     * <p>
     * Deletes a repository. If a specified repository was already deleted, a
     * null repository ID will be returned.
     * </p>
     * <important>Deleting a repository also deletes all associated objects and
     * metadata. After a repository is deleted, all future push calls to the
     * deleted repository will fail.</important>
     * 
     * @param deleteRepositoryRequest
     *        Represents the input of a delete repository operation.
     * @return A Java Future containing the result of the DeleteRepository
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(
            DeleteRepositoryRequest deleteRepositoryRequest);

    /**
     * <p>
     * Deletes a repository. If a specified repository was already deleted, a
     * null repository ID will be returned.
     * </p>
     * <important>Deleting a repository also deletes all associated objects and
     * metadata. After a repository is deleted, all future push calls to the
     * deleted repository will fail.</important>
     * 
     * @param deleteRepositoryRequest
     *        Represents the input of a delete repository operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepository
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(
            DeleteRepositoryRequest deleteRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a repository branch, including its name and
     * the last commit ID.
     * </p>
     * 
     * @param getBranchRequest
     *        Represents the input of a get branch operation.
     * @return A Java Future containing the result of the GetBranch operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetBranchResult> getBranchAsync(
            GetBranchRequest getBranchRequest);

    /**
     * <p>
     * Retrieves information about a repository branch, including its name and
     * the last commit ID.
     * </p>
     * 
     * @param getBranchRequest
     *        Represents the input of a get branch operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBranch operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetBranchResult> getBranchAsync(
            GetBranchRequest getBranchRequest,
            com.amazonaws.handlers.AsyncHandler<GetBranchRequest, GetBranchResult> asyncHandler);

    /**
     * <p>
     * Gets information about a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a web page could expose users to
     * potentially malicious code. Make sure that you HTML-encode the
     * description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param getRepositoryRequest
     *        Represents the input of a get repository operation.
     * @return A Java Future containing the result of the GetRepository
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(
            GetRepositoryRequest getRepositoryRequest);

    /**
     * <p>
     * Gets information about a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a web page could expose users to
     * potentially malicious code. Make sure that you HTML-encode the
     * description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param getRepositoryRequest
     *        Represents the input of a get repository operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepository
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(
            GetRepositoryRequest getRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryRequest, GetRepositoryResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more branches in a repository.
     * </p>
     * 
     * @param listBranchesRequest
     *        Represents the input of a list branches operation.
     * @return A Java Future containing the result of the ListBranches operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(
            ListBranchesRequest listBranchesRequest);

    /**
     * <p>
     * Gets information about one or more branches in a repository.
     * </p>
     * 
     * @param listBranchesRequest
     *        Represents the input of a list branches operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBranches operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(
            ListBranchesRequest listBranchesRequest,
            com.amazonaws.handlers.AsyncHandler<ListBranchesRequest, ListBranchesResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * 
     * @param listRepositoriesRequest
     *        Represents the input of a list repositories operation.
     * @return A Java Future containing the result of the ListRepositories
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(
            ListRepositoriesRequest listRepositoriesRequest);

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * 
     * @param listRepositoriesRequest
     *        Represents the input of a list repositories operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRepositories
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(
            ListRepositoriesRequest listRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Sets or changes the default branch name for the specified repository.
     * </p>
     * <note>If you use this operation to change the default branch name to the
     * current default branch name, a success message is returned even though
     * the default branch did not change.</note>
     * 
     * @param updateDefaultBranchRequest
     *        Represents the input of an update default branch operation.
     */
    java.util.concurrent.Future<Void> updateDefaultBranchAsync(
            UpdateDefaultBranchRequest updateDefaultBranchRequest);

    /**
     * <p>
     * Sets or changes the default branch name for the specified repository.
     * </p>
     * <note>If you use this operation to change the default branch name to the
     * current default branch name, a success message is returned even though
     * the default branch did not change.</note>
     * 
     * @param updateDefaultBranchRequest
     *        Represents the input of an update default branch operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> updateDefaultBranchAsync(
            UpdateDefaultBranchRequest updateDefaultBranchRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDefaultBranchRequest, Void> asyncHandler);

    /**
     * <p>
     * Sets or changes the comment or description for a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a web page could expose users to
     * potentially malicious code. Make sure that you HTML-encode the
     * description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param updateRepositoryDescriptionRequest
     *        Represents the input of an update repository description
     *        operation.
     */
    java.util.concurrent.Future<Void> updateRepositoryDescriptionAsync(
            UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest);

    /**
     * <p>
     * Sets or changes the comment or description for a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a web page could expose users to
     * potentially malicious code. Make sure that you HTML-encode the
     * description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param updateRepositoryDescriptionRequest
     *        Represents the input of an update repository description
     *        operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> updateRepositoryDescriptionAsync(
            UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryDescriptionRequest, Void> asyncHandler);

    /**
     * <p>
     * Renames a repository.
     * </p>
     * 
     * @param updateRepositoryNameRequest
     *        Represents the input of an update repository description
     *        operation.
     */
    java.util.concurrent.Future<Void> updateRepositoryNameAsync(
            UpdateRepositoryNameRequest updateRepositoryNameRequest);

    /**
     * <p>
     * Renames a repository.
     * </p>
     * 
     * @param updateRepositoryNameRequest
     *        Represents the input of an update repository description
     *        operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> updateRepositoryNameAsync(
            UpdateRepositoryNameRequest updateRepositoryNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryNameRequest, Void> asyncHandler);
}
