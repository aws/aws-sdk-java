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
package com.amazonaws.services.simplesystemsmanagement;

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

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.services.simplesystemsmanagement.model.transform.*;

/**
 * Client for accessing Amazon SSM. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon EC2 Simple Systems Manager (SSM) enables you to configure and manage
 * your EC2 instances. You can create a configuration document and then
 * associate it with one or more running instances.
 * </p>
 * <p>
 * You can use a configuration document to automate the following tasks for your
 * Windows instances:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Join an AWS Directory
 * </p>
 * </li>
 * <li>
 * <p>
 * Install, repair, or uninstall software using an MSI package
 * </p>
 * </li>
 * <li>
 * <p>
 * Run PowerShell scripts
 * </p>
 * </li>
 * <li>
 * <p>
 * Configure CloudWatch Logs to monitor applications and systems
 * </p>
 * </li>
 * </ul>
 * <p>
 * Note that configuration documents are not supported on Linux instances.
 * </p>
 */
public class AWSSimpleSystemsManagementClient extends AmazonWebServiceClient
        implements AWSSimpleSystemsManagement {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AWSSimpleSystemsManagement.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ssm";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "ssm";

    /**
     * List of exception unmarshallers for all Amazon SSM exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Amazon SSM. A
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
    public AWSSimpleSystemsManagementClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM. A
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
     *        connects to Amazon SSM (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSSimpleSystemsManagementClient(
            ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the
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
    public AWSSimpleSystemsManagementClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the
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
     *        connects to Amazon SSM (ex: proxy settings, retry counts, etc.).
     */
    public AWSSimpleSystemsManagementClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the
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
    public AWSSimpleSystemsManagementClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the
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
     *        connects to Amazon SSM (ex: proxy settings, retry counts, etc.).
     */
    public AWSSimpleSystemsManagementClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the
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
     *        connects to Amazon SSM (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSSimpleSystemsManagementClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentContentException.class,
                        "InvalidDocumentContent"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.AssociationDoesNotExistException.class,
                        "AssociationDoesNotExist"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.InvalidNextTokenException.class,
                        "InvalidNextToken"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.TooManyUpdatesException.class,
                        "TooManyUpdates"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.AssociatedInstancesException.class,
                        "AssociatedInstances"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException.class,
                        "InternalServerError"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.AssociationLimitExceededException.class,
                        "AssociationLimitExceeded"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.DuplicateInstanceIdException.class,
                        "DuplicateInstanceId"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.MaxDocumentSizeExceededException.class,
                        "MaxDocumentSizeExceeded"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.AssociationAlreadyExistsException.class,
                        "AssociationAlreadyExists"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.InvalidInstanceIdException.class,
                        "InvalidInstanceId"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentException.class,
                        "InvalidDocument"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.DocumentAlreadyExistsException.class,
                        "DocumentAlreadyExists"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.DocumentLimitExceededException.class,
                        "DocumentLimitExceeded"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.simplesystemsmanagement.model.StatusUnchangedException.class,
                        "StatusUnchanged"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://ssm.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/simplesystemsmanagement/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/simplesystemsmanagement/request.handler2s"));
    }

    /**
     * <p>
     * Associates the specified configuration document with the specified
     * instance.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration document
     * and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that already
     * has an associated configuration document, we replace the current
     * configuration document with the new configuration document.
     * </p>
     * 
     * @param createAssociationRequest
     * @return Result of the CreateAssociation operation returned by the
     *         service.
     * @throws AssociationAlreadyExistsException
     *         The specified association already exists.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws InvalidInstanceIdException
     *         You must specify the ID of a running instance.
     */
    @Override
    public CreateAssociationResult createAssociation(
            CreateAssociationRequest createAssociationRequest) {
        ExecutionContext executionContext = createExecutionContext(createAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssociationRequest> request = null;
        Response<CreateAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssociationRequestMarshaller()
                        .marshall(createAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateAssociationResult> responseHandler = new JsonResponseHandler<CreateAssociationResult>(
                    new CreateAssociationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified configuration documents with the specified
     * instances.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration document
     * and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that already
     * has an associated configuration document, we replace the current
     * configuration document with the new configuration document.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @return Result of the CreateAssociationBatch operation returned by the
     *         service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws InvalidInstanceIdException
     *         You must specify the ID of a running instance.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     */
    @Override
    public CreateAssociationBatchResult createAssociationBatch(
            CreateAssociationBatchRequest createAssociationBatchRequest) {
        ExecutionContext executionContext = createExecutionContext(createAssociationBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssociationBatchRequest> request = null;
        Response<CreateAssociationBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssociationBatchRequestMarshaller()
                        .marshall(createAssociationBatchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateAssociationBatchResult> responseHandler = new JsonResponseHandler<CreateAssociationBatchResult>(
                    new CreateAssociationBatchResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a configuration document.
     * </p>
     * <p>
     * After you create a configuration document, you can use
     * <a>CreateAssociation</a> to associate it with one or more running
     * instances.
     * </p>
     * 
     * @param createDocumentRequest
     * @return Result of the CreateDocument operation returned by the service.
     * @throws DocumentAlreadyExistsException
     *         The specified configuration document already exists.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of a configuration document is 64 KB.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentContentException
     *         The content for the configuration document is not valid.
     * @throws DocumentLimitExceededException
     *         You can have at most 100 active configuration documents.
     */
    @Override
    public CreateDocumentResult createDocument(
            CreateDocumentRequest createDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(createDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDocumentRequest> request = null;
        Response<CreateDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDocumentRequestMarshaller()
                        .marshall(createDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateDocumentResult> responseHandler = new JsonResponseHandler<CreateDocumentResult>(
                    new CreateDocumentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified configuration document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a configuration document from an instance, it does
     * not change the configuration of the instance. To change the configuration
     * state of an instance after you disassociate a configuration document, you
     * must create a new configuration document with the desired configuration
     * and associate it with the instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return Result of the DeleteAssociation operation returned by the
     *         service.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws InvalidInstanceIdException
     *         You must specify the ID of a running instance.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one
     *         update at a time.
     */
    @Override
    public DeleteAssociationResult deleteAssociation(
            DeleteAssociationRequest deleteAssociationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssociationRequest> request = null;
        Response<DeleteAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssociationRequestMarshaller()
                        .marshall(deleteAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteAssociationResult> responseHandler = new JsonResponseHandler<DeleteAssociationResult>(
                    new DeleteAssociationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified configuration document.
     * </p>
     * <p>
     * You must use <a>DeleteAssociation</a> to disassociate all instances that
     * are associated with the configuration document before you can delete it.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return Result of the DeleteDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws AssociatedInstancesException
     *         You must disassociate a configuration document from all instances
     *         before you can delete it.
     */
    @Override
    public DeleteDocumentResult deleteDocument(
            DeleteDocumentRequest deleteDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentRequest> request = null;
        Response<DeleteDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentRequestMarshaller()
                        .marshall(deleteDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteDocumentResult> responseHandler = new JsonResponseHandler<DeleteDocumentResult>(
                    new DeleteDocumentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the associations for the specified configuration document or
     * instance.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return Result of the DescribeAssociation operation returned by the
     *         service.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws InvalidInstanceIdException
     *         You must specify the ID of a running instance.
     */
    @Override
    public DescribeAssociationResult describeAssociation(
            DescribeAssociationRequest describeAssociationRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssociationRequest> request = null;
        Response<DescribeAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssociationRequestMarshaller()
                        .marshall(describeAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeAssociationResult> responseHandler = new JsonResponseHandler<DescribeAssociationResult>(
                    new DescribeAssociationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified configuration document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return Result of the DescribeDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     */
    @Override
    public DescribeDocumentResult describeDocument(
            DescribeDocumentRequest describeDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentRequest> request = null;
        Response<DescribeDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentRequestMarshaller()
                        .marshall(describeDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeDocumentResult> responseHandler = new JsonResponseHandler<DescribeDocumentResult>(
                    new DescribeDocumentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the contents of the specified configuration document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return Result of the GetDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     */
    @Override
    public GetDocumentResult getDocument(GetDocumentRequest getDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(getDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentRequest> request = null;
        Response<GetDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentRequestMarshaller()
                        .marshall(getDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDocumentResult> responseHandler = new JsonResponseHandler<GetDocumentResult>(
                    new GetDocumentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the associations for the specified configuration document or
     * instance.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return Result of the ListAssociations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     */
    @Override
    public ListAssociationsResult listAssociations(
            ListAssociationsRequest listAssociationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociationsRequest> request = null;
        Response<ListAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociationsRequestMarshaller()
                        .marshall(listAssociationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAssociationsResult> responseHandler = new JsonResponseHandler<ListAssociationsResult>(
                    new ListAssociationsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more of your configuration documents.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return Result of the ListDocuments operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     */
    @Override
    public ListDocumentsResult listDocuments(
            ListDocumentsRequest listDocumentsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDocumentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentsRequest> request = null;
        Response<ListDocumentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentsRequestMarshaller()
                        .marshall(listDocumentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListDocumentsResult> responseHandler = new JsonResponseHandler<ListDocumentsResult>(
                    new ListDocumentsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListDocumentsResult listDocuments() {
        return listDocuments(new ListDocumentsRequest());
    }

    /**
     * <p>
     * Updates the status of the configuration document associated with the
     * specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return Result of the UpdateAssociationStatus operation returned by the
     *         service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         You must specify the ID of a running instance.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws StatusUnchangedException
     *         The updated status is the same as the current status.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one
     *         update at a time.
     */
    @Override
    public UpdateAssociationStatusResult updateAssociationStatus(
            UpdateAssociationStatusRequest updateAssociationStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAssociationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssociationStatusRequest> request = null;
        Response<UpdateAssociationStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssociationStatusRequestMarshaller()
                        .marshall(updateAssociationStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateAssociationStatusResult> responseHandler = new JsonResponseHandler<UpdateAssociationStatusResult>(
                    new UpdateAssociationStatusResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

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
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
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

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
