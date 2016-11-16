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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codecommit.model.*;

/**
 * Interface for accessing CodeCommit.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codecommit.AbstractAWSCodeCommit} instead.
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
public interface AWSCodeCommit {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codecommit";

    /**
     * Overrides the default endpoint for this client ("https://codecommit.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "codecommit.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://codecommit.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "codecommit.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://codecommit.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCodeCommit#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
     */
    BatchGetRepositoriesResult batchGetRepositories(BatchGetRepositoriesRequest batchGetRepositoriesRequest);

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
     *         The specified branch name is not valid.
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
     */
    CreateBranchResult createBranch(CreateBranchRequest createBranchRequest);

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
     * @sample AWSCodeCommit.CreateRepository
     */
    CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.
     * </p>
     * <important>Deleting a repository also deletes all associated objects and metadata. After a repository is deleted,
     * all future push calls to the deleted repository will fail.</important>
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
     */
    DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest);

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
     *         The specified branch name is not valid.
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
     */
    GetBranchResult getBranch(GetBranchRequest getBranchRequest);

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
     */
    GetCommitResult getCommit(GetCommitRequest getCommitRequest);

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
     */
    GetRepositoryResult getRepository(GetRepositoryRequest getRepositoryRequest);

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
     */
    GetRepositoryTriggersResult getRepositoryTriggers(GetRepositoryTriggersRequest getRepositoryTriggersRequest);

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
     */
    ListBranchesResult listBranches(ListBranchesRequest listBranchesRequest);

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
     */
    ListRepositoriesResult listRepositories(ListRepositoriesRequest listRepositoriesRequest);

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
     */
    PutRepositoryTriggersResult putRepositoryTriggers(PutRepositoryTriggersRequest putRepositoryTriggersRequest);

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
     */
    TestRepositoryTriggersResult testRepositoryTriggers(TestRepositoryTriggersRequest testRepositoryTriggersRequest);

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
     *         The specified branch name is not valid.
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
     */
    UpdateDefaultBranchResult updateDefaultBranch(UpdateDefaultBranchRequest updateDefaultBranchRequest);

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
     */
    UpdateRepositoryDescriptionResult updateRepositoryDescription(UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest);

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
     */
    UpdateRepositoryNameResult updateRepositoryName(UpdateRepositoryNameRequest updateRepositoryNameRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
