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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
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
@ThreadSafe
public class AWSCodeCommitClient extends AmazonWebServiceClient implements AWSCodeCommit {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodeCommit.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codecommit";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryLimitExceededException").withModeledClass(
                            com.amazonaws.services.codecommit.model.RepositoryLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("EncryptionKeyDisabledException").withModeledClass(
                            com.amazonaws.services.codecommit.model.EncryptionKeyDisabledException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("CommitIdRequiredException").withModeledClass(
                            com.amazonaws.services.codecommit.model.CommitIdRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("EncryptionKeyNotFoundException").withModeledClass(
                            com.amazonaws.services.codecommit.model.EncryptionKeyNotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryDescriptionException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidRepositoryDescriptionException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerDestinationArnException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidRepositoryTriggerDestinationArnException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("MaximumRepositoryTriggersExceededException").withModeledClass(
                            com.amazonaws.services.codecommit.model.MaximumRepositoryTriggersExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerBranchNameException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidRepositoryTriggerBranchNameException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidSortByException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidSortByException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryNamesRequiredException").withModeledClass(
                            com.amazonaws.services.codecommit.model.RepositoryNamesRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("EncryptionKeyAccessDeniedException").withModeledClass(
                            com.amazonaws.services.codecommit.model.EncryptionKeyAccessDeniedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryNameRequiredException").withModeledClass(
                            com.amazonaws.services.codecommit.model.RepositoryNameRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerRegionException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidRepositoryTriggerRegionException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryTriggerDestinationArnRequiredException").withModeledClass(
                            com.amazonaws.services.codecommit.model.RepositoryTriggerDestinationArnRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryNameExistsException").withModeledClass(
                            com.amazonaws.services.codecommit.model.RepositoryNameExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("BranchNameExistsException").withModeledClass(
                            com.amazonaws.services.codecommit.model.BranchNameExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryTriggersListRequiredException").withModeledClass(
                            com.amazonaws.services.codecommit.model.RepositoryTriggersListRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("BranchDoesNotExistException").withModeledClass(
                            com.amazonaws.services.codecommit.model.BranchDoesNotExistException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("EncryptionIntegrityChecksFailedException").withModeledClass(
                            com.amazonaws.services.codecommit.model.EncryptionIntegrityChecksFailedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryTriggerEventsListRequiredException").withModeledClass(
                            com.amazonaws.services.codecommit.model.RepositoryTriggerEventsListRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidCommitIdException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidCommitIdException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidOrderException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidOrderException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("CommitDoesNotExistException").withModeledClass(
                            com.amazonaws.services.codecommit.model.CommitDoesNotExistException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryTriggerBranchNameListRequiredException").withModeledClass(
                            com.amazonaws.services.codecommit.model.RepositoryTriggerBranchNameListRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerCustomDataException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidRepositoryTriggerCustomDataException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerEventsException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidRepositoryTriggerEventsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("BranchNameRequiredException").withModeledClass(
                            com.amazonaws.services.codecommit.model.BranchNameRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryTriggerNameRequiredException").withModeledClass(
                            com.amazonaws.services.codecommit.model.RepositoryTriggerNameRequiredException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryTriggerNameException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidRepositoryTriggerNameException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("CommitIdDoesNotExistException").withModeledClass(
                            com.amazonaws.services.codecommit.model.CommitIdDoesNotExistException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("EncryptionKeyUnavailableException").withModeledClass(
                            com.amazonaws.services.codecommit.model.EncryptionKeyUnavailableException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("MaximumRepositoryNamesExceededException").withModeledClass(
                            com.amazonaws.services.codecommit.model.MaximumRepositoryNamesExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidRepositoryNameException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidRepositoryNameException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryDoesNotExistException").withModeledClass(
                            com.amazonaws.services.codecommit.model.RepositoryDoesNotExistException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidContinuationTokenException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidContinuationTokenException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("MaximumBranchesExceededException").withModeledClass(
                            com.amazonaws.services.codecommit.model.MaximumBranchesExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidBranchNameException").withModeledClass(
                            com.amazonaws.services.codecommit.model.InvalidBranchNameException.class))
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
     */
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
     */
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
     */
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
     */
    public AWSCodeCommitClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AWSCodeCommitClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
     */
    @Override
    public BatchGetRepositoriesResult batchGetRepositories(BatchGetRepositoriesRequest batchGetRepositoriesRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetRepositoriesRequest> request = null;
        Response<BatchGetRepositoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetRepositoriesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetRepositoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public CreateBranchResult createBranch(CreateBranchRequest createBranchRequest) {
        ExecutionContext executionContext = createExecutionContext(createBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBranchRequest> request = null;
        Response<CreateBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBranchRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest) {
        ExecutionContext executionContext = createExecutionContext(createRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRepositoryRequest> request = null;
        Response<CreateRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRepositoryRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryRequest> request = null;
        Response<DeleteRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public GetBranchResult getBranch(GetBranchRequest getBranchRequest) {
        ExecutionContext executionContext = createExecutionContext(getBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBranchRequest> request = null;
        Response<GetBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBranchRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public GetCommitResult getCommit(GetCommitRequest getCommitRequest) {
        ExecutionContext executionContext = createExecutionContext(getCommitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommitRequest> request = null;
        Response<GetCommitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommitRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCommitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public GetRepositoryResult getRepository(GetRepositoryRequest getRepositoryRequest) {
        ExecutionContext executionContext = createExecutionContext(getRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryRequest> request = null;
        Response<GetRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public GetRepositoryTriggersResult getRepositoryTriggers(GetRepositoryTriggersRequest getRepositoryTriggersRequest) {
        ExecutionContext executionContext = createExecutionContext(getRepositoryTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryTriggersRequest> request = null;
        Response<GetRepositoryTriggersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryTriggersRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRepositoryTriggersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public ListBranchesResult listBranches(ListBranchesRequest listBranchesRequest) {
        ExecutionContext executionContext = createExecutionContext(listBranchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBranchesRequest> request = null;
        Response<ListBranchesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBranchesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBranchesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public ListRepositoriesResult listRepositories(ListRepositoriesRequest listRepositoriesRequest) {
        ExecutionContext executionContext = createExecutionContext(listRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositoriesRequest> request = null;
        Response<ListRepositoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositoriesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRepositoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public PutRepositoryTriggersResult putRepositoryTriggers(PutRepositoryTriggersRequest putRepositoryTriggersRequest) {
        ExecutionContext executionContext = createExecutionContext(putRepositoryTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRepositoryTriggersRequest> request = null;
        Response<PutRepositoryTriggersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRepositoryTriggersRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRepositoryTriggersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public TestRepositoryTriggersResult testRepositoryTriggers(TestRepositoryTriggersRequest testRepositoryTriggersRequest) {
        ExecutionContext executionContext = createExecutionContext(testRepositoryTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestRepositoryTriggersRequest> request = null;
        Response<TestRepositoryTriggersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestRepositoryTriggersRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(testRepositoryTriggersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public UpdateDefaultBranchResult updateDefaultBranch(UpdateDefaultBranchRequest updateDefaultBranchRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDefaultBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDefaultBranchRequest> request = null;
        Response<UpdateDefaultBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDefaultBranchRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDefaultBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public UpdateRepositoryDescriptionResult updateRepositoryDescription(UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRepositoryDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRepositoryDescriptionRequest> request = null;
        Response<UpdateRepositoryDescriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRepositoryDescriptionRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRepositoryDescriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
    @Override
    public UpdateRepositoryNameResult updateRepositoryName(UpdateRepositoryNameRequest updateRepositoryNameRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRepositoryNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRepositoryNameRequest> request = null;
        Response<UpdateRepositoryNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRepositoryNameRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRepositoryNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
