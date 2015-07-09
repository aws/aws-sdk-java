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
package com.amazonaws.service.codecommit;

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
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.service.codecommit.model.*;
import com.amazonaws.service.codecommit.model.transform.*;

/**
 * Client for accessing CodeCommit. All service calls made using this client are
 * blocking, and will not return until the service call completes.
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
public class AWSCodeCommitClient extends AmazonWebServiceClient implements
        AWSCodeCommit {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodeCommit.class);

    /**
     * List of exception unmarshallers for all CodeCommit exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on CodeCommit. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCodeCommitClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CodeCommit (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCodeCommitClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the
     * specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSCodeCommitClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the
     * specified AWS account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CodeCommit (ex: proxy settings, retry counts, etc.).
     */
    public AWSCodeCommitClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the
     * specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSCodeCommitClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the
     * specified AWS account credentials provider and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CodeCommit (ex: proxy settings, retry counts, etc.).
     */
    public AWSCodeCommitClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CodeCommit using the
     * specified AWS account credentials provider, client configuration options,
     * and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CodeCommit (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSCodeCommitClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration),
                requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.EncryptionKeyNotFoundException.class,
                        "EncryptionKeyNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.InvalidRepositoryNameException.class,
                        "InvalidRepositoryNameException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.InvalidSortByException.class,
                        "InvalidSortByException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.RepositoryDoesNotExistException.class,
                        "RepositoryDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.EncryptionKeyDisabledException.class,
                        "EncryptionKeyDisabledException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.BranchNameExistsException.class,
                        "BranchNameExistsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.InvalidContinuationTokenException.class,
                        "InvalidContinuationTokenException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.InvalidRepositoryDescriptionException.class,
                        "InvalidRepositoryDescriptionException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.EncryptionIntegrityChecksFailedException.class,
                        "EncryptionIntegrityChecksFailedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.BranchNameRequiredException.class,
                        "BranchNameRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.EncryptionKeyAccessDeniedException.class,
                        "EncryptionKeyAccessDeniedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.CommitDoesNotExistException.class,
                        "CommitDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.RepositoryNamesRequiredException.class,
                        "RepositoryNamesRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.RepositoryNameExistsException.class,
                        "RepositoryNameExistsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.RepositoryLimitExceededException.class,
                        "RepositoryLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.InvalidOrderException.class,
                        "InvalidOrderException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.CommitIdRequiredException.class,
                        "CommitIdRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.MaximumRepositoryNamesExceededException.class,
                        "MaximumRepositoryNamesExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.InvalidCommitIdException.class,
                        "InvalidCommitIdException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.RepositoryNameRequiredException.class,
                        "RepositoryNameRequiredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.InvalidBranchNameException.class,
                        "InvalidBranchNameException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.EncryptionKeyUnavailableException.class,
                        "EncryptionKeyUnavailableException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.service.codecommit.model.BranchDoesNotExistException.class,
                        "BranchDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://codecommit.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/service/codecommit/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/service/codecommit/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(
            ClientConfiguration orig) {
        ClientConfiguration config = orig;
        return config;
    }

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
     * @return Result of the BatchGetRepositories operation returned by the
     *         service.
     * @throws RepositoryNamesRequiredException
     *         A repository names object is required but was not specified.
     * @throws MaximumRepositoryNamesExceededException
     *         The maximum number of allowed repository names was exceeded.
     *         Currently, this number is 25.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p>
     *         <note>This exception only occurs when a specified repository name
     *         is not valid. Other exceptions occur when a required repository
     *         parameter is missing, or when a specified repository does not
     *         exist.
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
     */
    @Override
    public BatchGetRepositoriesResult batchGetRepositories(
            BatchGetRepositoriesRequest batchGetRepositoriesRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetRepositoriesRequest> request = null;
        Response<BatchGetRepositoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetRepositoriesRequestMarshaller()
                        .marshall(batchGetRepositoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new BatchGetRepositoriesResultJsonUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p>
     *         <note>This exception only occurs when a specified repository name
     *         is not valid. Other exceptions occur when a required repository
     *         parameter is missing, or when a specified repository does not
     *         exist.
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
     *         The specified commit does not exist or no commit was specified,
     *         and the specified repository has no default branch.
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
     */
    @Override
    public void createBranch(CreateBranchRequest createBranchRequest) {
        ExecutionContext executionContext = createExecutionContext(createBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBranchRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBranchRequestMarshaller()
                        .marshall(createBranchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

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
     *         At least one specified repository name is not valid.</p>
     *         <note>This exception only occurs when a specified repository name
     *         is not valid. Other exceptions occur when a required repository
     *         parameter is missing, or when a specified repository does not
     *         exist.
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
     */
    @Override
    public CreateRepositoryResult createRepository(
            CreateRepositoryRequest createRepositoryRequest) {
        ExecutionContext executionContext = createExecutionContext(createRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRepositoryRequest> request = null;
        Response<CreateRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRepositoryRequestMarshaller()
                        .marshall(createRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new CreateRepositoryResultJsonUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the DeleteRepository operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p>
     *         <note>This exception only occurs when a specified repository name
     *         is not valid. Other exceptions occur when a required repository
     *         parameter is missing, or when a specified repository does not
     *         exist.
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
     */
    @Override
    public DeleteRepositoryResult deleteRepository(
            DeleteRepositoryRequest deleteRepositoryRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryRequest> request = null;
        Response<DeleteRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryRequestMarshaller()
                        .marshall(deleteRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new DeleteRepositoryResultJsonUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a repository branch, including its name and
     * the last commit ID.
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
     *         At least one specified repository name is not valid.</p>
     *         <note>This exception only occurs when a specified repository name
     *         is not valid. Other exceptions occur when a required repository
     *         parameter is missing, or when a specified repository does not
     *         exist.
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
     */
    @Override
    public GetBranchResult getBranch(GetBranchRequest getBranchRequest) {
        ExecutionContext executionContext = createExecutionContext(getBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBranchRequest> request = null;
        Response<GetBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBranchRequestMarshaller()
                        .marshall(getBranchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetBranchResultJsonUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the GetRepository operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p>
     *         <note>This exception only occurs when a specified repository name
     *         is not valid. Other exceptions occur when a required repository
     *         parameter is missing, or when a specified repository does not
     *         exist.
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
     */
    @Override
    public GetRepositoryResult getRepository(
            GetRepositoryRequest getRepositoryRequest) {
        ExecutionContext executionContext = createExecutionContext(getRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryRequest> request = null;
        Response<GetRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryRequestMarshaller()
                        .marshall(getRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new GetRepositoryResultJsonUnmarshaller(), executionContext);

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
     *         At least one specified repository name is not valid.</p>
     *         <note>This exception only occurs when a specified repository name
     *         is not valid. Other exceptions occur when a required repository
     *         parameter is missing, or when a specified repository does not
     *         exist.
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
     */
    @Override
    public ListBranchesResult listBranches(
            ListBranchesRequest listBranchesRequest) {
        ExecutionContext executionContext = createExecutionContext(listBranchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBranchesRequest> request = null;
        Response<ListBranchesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBranchesRequestMarshaller()
                        .marshall(listBranchesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new ListBranchesResultJsonUnmarshaller(), executionContext);

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
     */
    @Override
    public ListRepositoriesResult listRepositories(
            ListRepositoriesRequest listRepositoriesRequest) {
        ExecutionContext executionContext = createExecutionContext(listRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositoriesRequest> request = null;
        Response<ListRepositoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositoriesRequestMarshaller()
                        .marshall(listRepositoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new ListRepositoriesResultJsonUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p>
     *         <note>This exception only occurs when a specified repository name
     *         is not valid. Other exceptions occur when a required repository
     *         parameter is missing, or when a specified repository does not
     *         exist.
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
     */
    @Override
    public void updateDefaultBranch(
            UpdateDefaultBranchRequest updateDefaultBranchRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDefaultBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDefaultBranchRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDefaultBranchRequestMarshaller()
                        .marshall(updateDefaultBranchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

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
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p>
     *         <note>This exception only occurs when a specified repository name
     *         is not valid. Other exceptions occur when a required repository
     *         parameter is missing, or when a specified repository does not
     *         exist.
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
     */
    @Override
    public void updateRepositoryDescription(
            UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRepositoryDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRepositoryDescriptionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRepositoryDescriptionRequestMarshaller()
                        .marshall(updateRepositoryDescriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Renames a repository.
     * </p>
     * 
     * @param updateRepositoryNameRequest
     *        Represents the input of an update repository description
     *        operation.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNameExistsException
     *         The specified repository name already exists.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p>
     *         <note>This exception only occurs when a specified repository name
     *         is not valid. Other exceptions occur when a required repository
     *         parameter is missing, or when a specified repository does not
     *         exist.
     */
    @Override
    public void updateRepositoryName(
            UpdateRepositoryNameRequest updateRepositoryNameRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRepositoryNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRepositoryNameRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRepositoryNameRequestMarshaller()
                        .marshall(updateRepositoryNameRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            Unmarshaller<X, JsonUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonResponseHandler<X> responseHandler = new JsonResponseHandler<X>(
                unmarshaller);
        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
