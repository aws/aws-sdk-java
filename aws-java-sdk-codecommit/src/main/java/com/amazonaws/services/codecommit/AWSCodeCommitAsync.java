/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * types for AWS CodeCommit API.
 * </p>
 * <p>
 * You can use the AWS CodeCommit API to work with the following objects:
 * </p>
 * <ul>
 * <li>Repositories, by calling the following:
 * <ul>
 * <li><a>BatchGetRepositories</a>, which returns information about one or more repositories associated with your AWS
 * account</li>
 * <li><a>CreateRepository</a>, which creates an AWS CodeCommit repository</li>
 * <li><a>DeleteRepository</a>, which deletes an AWS CodeCommit repository</li>
 * <li><a>GetRepository</a>, which returns information about a specified repository</li>
 * <li><a>ListRepositories</a>, which lists all AWS CodeCommit repositories associated with your AWS account</li>
 * <li><a>UpdateRepositoryDescription</a>, which sets or updates the description of the repository</li>
 * <li><a>UpdateRepositoryName</a>, which changes the name of the repository. If you change the name of a repository, no
 * other users of that repository will be able to access it until you send them the new HTTPS or SSH URL to use.</li>
 * </ul>
 * </li>
 * <li>Branches, by calling the following:
 * <ul>
 * <li><a>CreateBranch</a>, which creates a new branch in a specified repository</li>
 * <li><a>GetBranch</a>, which returns information about a specified branch</li>
 * <li><a>ListBranches</a>, which lists all branches for a specified repository</li>
 * <li><a>UpdateDefaultBranch</a>, which changes the default branch for a repository</li>
 * </ul>
 * </li>
 * <li>Information about committed code in a repository, by calling the following:
 * <ul>
 * <li><a>GetCommit</a>, which returns information about a commit, including commit messages and committer information.</li>
 * </ul>
 * </li>
 * <li>Triggers, by calling the following:
 * <ul>
 * <li><a>GetRepositoryTriggers</a>, which returns information about triggers configured for a repository</li>
 * <li><a>PutRepositoryTriggers</a>, which replaces all triggers for a repository and can be used to create or delete
 * triggers</li>
 * <li><a>TestRepositoryTriggers</a>, which tests the functionality of a repository trigger by sending data to the
 * trigger target</li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeCommit, see the <a
 * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit User Guide</a>.
 * </p>
 */
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
     */
    java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest createBranchRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBranchRequest, CreateBranchResult> asyncHandler);

    /**
     * <p>
     * Creates a new, empty repository.
     * </p>
     * 
     * @param createRepositoryRequest
     *        Represents the input of a create repository operation.
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AWSCodeCommitAsync.CreateRepository
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
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler);

    /**
     * <p>
     * Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.
     * </p>
     * <important>Deleting a repository also deletes all associated objects and metadata. After a repository is deleted,
     * all future push calls to the deleted repository will fail.</important>
     * 
     * @param deleteRepositoryRequest
     *        Represents the input of a delete repository operation.
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AWSCodeCommitAsync.DeleteRepository
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest);

    /**
     * <p>
     * Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.
     * </p>
     * <important>Deleting a repository also deletes all associated objects and metadata. After a repository is deleted,
     * all future push calls to the deleted repository will fail.</important>
     * 
     * @param deleteRepositoryRequest
     *        Represents the input of a delete repository operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AWSCodeCommitAsyncHandler.DeleteRepository
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler);

    /**
     * <p>
     * Returns information about a repository branch, including its name and the last commit ID.
     * </p>
     * 
     * @param getBranchRequest
     *        Represents the input of a get branch operation.
     * @return A Java Future containing the result of the GetBranch operation returned by the service.
     * @sample AWSCodeCommitAsync.GetBranch
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
     */
    java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest getBranchRequest,
            com.amazonaws.handlers.AsyncHandler<GetBranchRequest, GetBranchResult> asyncHandler);

    /**
     * <p>
     * Returns information about a commit, including commit message and committer information.
     * </p>
     * 
     * @param getCommitRequest
     *        Represents the input of a get commit operation.
     * @return A Java Future containing the result of the GetCommit operation returned by the service.
     * @sample AWSCodeCommitAsync.GetCommit
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
     */
    java.util.concurrent.Future<GetCommitResult> getCommitAsync(GetCommitRequest getCommitRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommitRequest, GetCommitResult> asyncHandler);

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
     */
    java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest listBranchesRequest,
            com.amazonaws.handlers.AsyncHandler<ListBranchesRequest, ListBranchesResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * 
     * @param listRepositoriesRequest
     *        Represents the input of a list repositories operation.
     * @return A Java Future containing the result of the ListRepositories operation returned by the service.
     * @sample AWSCodeCommitAsync.ListRepositories
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
     */
    java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest listRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Replaces all triggers for a repository. This can be used to create or delete triggers.
     * </p>
     * 
     * @param putRepositoryTriggersRequest
     *        Represents the input ofa put repository triggers operation.
     * @return A Java Future containing the result of the PutRepositoryTriggers operation returned by the service.
     * @sample AWSCodeCommitAsync.PutRepositoryTriggers
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
     */
    java.util.concurrent.Future<TestRepositoryTriggersResult> testRepositoryTriggersAsync(TestRepositoryTriggersRequest testRepositoryTriggersRequest,
            com.amazonaws.handlers.AsyncHandler<TestRepositoryTriggersRequest, TestRepositoryTriggersResult> asyncHandler);

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
     */
    java.util.concurrent.Future<UpdateDefaultBranchResult> updateDefaultBranchAsync(UpdateDefaultBranchRequest updateDefaultBranchRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDefaultBranchRequest, UpdateDefaultBranchResult> asyncHandler);

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
     */
    java.util.concurrent.Future<UpdateRepositoryNameResult> updateRepositoryNameAsync(UpdateRepositoryNameRequest updateRepositoryNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryNameRequest, UpdateRepositoryNameResult> asyncHandler);

}
