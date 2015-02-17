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

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.services.simplesystemsmanagement.model.transform.*;

/**
 * Client for accessing AWSSimpleSystemsManagement.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * AWS Simple Systems Management enables you to configure and manage your
 * EC2 instances. You can create a configuration document and then
 * associate it with one or more running instances.
 * </p>
 * <p>
 * You can use a configuration document to automate the following tasks
 * for your Windows instances:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Install, repair, or uninstall software using an MSI package
 * </p>
 * </li>
 * <li> <p>
 * Run PowerShell scripts
 * </p>
 * </li>
 * <li> <p>
 * Join an AWS Directory
 * </p>
 * </li>
 * <li> <p>
 * Configure CloudWatch Logs to monitor applications and systems
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Note that configuration documents are not supported on Linux
 * instances.
 * </p>
 */
public class AWSSimpleSystemsManagementClient extends AmazonWebServiceClient implements AWSSimpleSystemsManagement {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSimpleSystemsManagement.class);

    /**
     * List of exception unmarshallers for all AWSSimpleSystemsManagement exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSSimpleSystemsManagement.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSSimpleSystemsManagementClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSimpleSystemsManagement.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSimpleSystemsManagement
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSSimpleSystemsManagementClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSSimpleSystemsManagementClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSimpleSystemsManagement
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSSimpleSystemsManagementClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSSimpleSystemsManagementClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSimpleSystemsManagement
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSSimpleSystemsManagementClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSimpleSystemsManagement
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AWSSimpleSystemsManagementClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AssociatedInstancesExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DocumentLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DocumentAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaxDocumentSizeExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AssociationAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyUpdatesExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AssociationLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDocumentContentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AssociationDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateInstanceIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInstanceIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDocumentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new StatusUnchangedExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("ssm.us-east-1.amazonaws.com/");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/simplesystemsmanagement/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/simplesystemsmanagement/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * Deletes the specified configuration document.
     * </p>
     * <p>
     * You must use DeleteAssociation to disassociate all instances that are
     * associated with the configuration document before you can delete it.
     * </p>
     *
     * @param deleteDocumentRequest Container for the necessary parameters to
     *           execute the DeleteDocument service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the DeleteDocument service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws AssociatedInstancesException
     * @throws InvalidDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDocumentResult deleteDocument(DeleteDocumentRequest deleteDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentRequest> request = null;
        Response<DeleteDocumentResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentRequestMarshaller().marshall(deleteDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDocumentResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteDocumentResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDocumentResult> responseHandler =
                new JsonResponseHandler<DeleteDocumentResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the associations for the specified configuration document
     * or instance.
     * </p>
     *
     * @param describeAssociationRequest Container for the necessary
     *           parameters to execute the DescribeAssociation service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the DescribeAssociation service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws AssociationDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAssociationResult describeAssociation(DescribeAssociationRequest describeAssociationRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssociationRequest> request = null;
        Response<DescribeAssociationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssociationRequestMarshaller().marshall(describeAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAssociationResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeAssociationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAssociationResult> responseHandler =
                new JsonResponseHandler<DescribeAssociationResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Associates the specified configuration document with the specified
     * instance.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration
     * document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that
     * already has an associated configuration document, we replace the
     * current configuration document with the new configuration document.
     * </p>
     *
     * @param createAssociationRequest Container for the necessary parameters
     *           to execute the CreateAssociation service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the CreateAssociation service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws AssociationLimitExceededException
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws AssociationAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAssociationResult createAssociation(CreateAssociationRequest createAssociationRequest) {
        ExecutionContext executionContext = createExecutionContext(createAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssociationRequest> request = null;
        Response<CreateAssociationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssociationRequestMarshaller().marshall(createAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAssociationResult, JsonUnmarshallerContext> unmarshaller =
                new CreateAssociationResultJsonUnmarshaller();
            JsonResponseHandler<CreateAssociationResult> responseHandler =
                new JsonResponseHandler<CreateAssociationResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Associates the specified configuration documents with the specified
     * instances.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration
     * document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that
     * already has an associated configuration document, we replace the
     * current configuration document with the new configuration document.
     * </p>
     *
     * @param createAssociationBatchRequest Container for the necessary
     *           parameters to execute the CreateAssociationBatch service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the CreateAssociationBatch service method,
     *         as returned by AWSSimpleSystemsManagement.
     * 
     * @throws DuplicateInstanceIdException
     * @throws InternalServerErrorException
     * @throws AssociationLimitExceededException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAssociationBatchResult createAssociationBatch(CreateAssociationBatchRequest createAssociationBatchRequest) {
        ExecutionContext executionContext = createExecutionContext(createAssociationBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssociationBatchRequest> request = null;
        Response<CreateAssociationBatchResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssociationBatchRequestMarshaller().marshall(createAssociationBatchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAssociationBatchResult, JsonUnmarshallerContext> unmarshaller =
                new CreateAssociationBatchResultJsonUnmarshaller();
            JsonResponseHandler<CreateAssociationBatchResult> responseHandler =
                new JsonResponseHandler<CreateAssociationBatchResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the specified configuration document.
     * </p>
     *
     * @param describeDocumentRequest Container for the necessary parameters
     *           to execute the DescribeDocument service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the DescribeDocument service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDocumentResult describeDocument(DescribeDocumentRequest describeDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentRequest> request = null;
        Response<DescribeDocumentResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentRequestMarshaller().marshall(describeDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDocumentResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeDocumentResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDocumentResult> responseHandler =
                new JsonResponseHandler<DescribeDocumentResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the status of the configuration document associated with the
     * specified instance.
     * </p>
     *
     * @param updateAssociationStatusRequest Container for the necessary
     *           parameters to execute the UpdateAssociationStatus service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the UpdateAssociationStatus service method,
     *         as returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws StatusUnchangedException
     * @throws TooManyUpdatesException
     * @throws AssociationDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateAssociationStatusResult updateAssociationStatus(UpdateAssociationStatusRequest updateAssociationStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAssociationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssociationStatusRequest> request = null;
        Response<UpdateAssociationStatusResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssociationStatusRequestMarshaller().marshall(updateAssociationStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAssociationStatusResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateAssociationStatusResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAssociationStatusResult> responseHandler =
                new JsonResponseHandler<UpdateAssociationStatusResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the associations for the specified configuration document or
     * instance.
     * </p>
     *
     * @param listAssociationsRequest Container for the necessary parameters
     *           to execute the ListAssociations service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the ListAssociations service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAssociationsResult listAssociations(ListAssociationsRequest listAssociationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociationsRequest> request = null;
        Response<ListAssociationsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociationsRequestMarshaller().marshall(listAssociationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAssociationsResult, JsonUnmarshallerContext> unmarshaller =
                new ListAssociationsResultJsonUnmarshaller();
            JsonResponseHandler<ListAssociationsResult> responseHandler =
                new JsonResponseHandler<ListAssociationsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes one or more of your configuration documents.
     * </p>
     *
     * @param listDocumentsRequest Container for the necessary parameters to
     *           execute the ListDocuments service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the ListDocuments service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDocumentsResult listDocuments(ListDocumentsRequest listDocumentsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDocumentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentsRequest> request = null;
        Response<ListDocumentsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentsRequestMarshaller().marshall(listDocumentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDocumentsResult, JsonUnmarshallerContext> unmarshaller =
                new ListDocumentsResultJsonUnmarshaller();
            JsonResponseHandler<ListDocumentsResult> responseHandler =
                new JsonResponseHandler<ListDocumentsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disassociates the specified configuration document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a configuration document from an instance, it
     * does not change the configuration of the instance. To change the
     * configuration state of an instance after you disassociate a
     * configuration document, you must create a new configuration document
     * with the desired configuration and associate it with the instance.
     * </p>
     *
     * @param deleteAssociationRequest Container for the necessary parameters
     *           to execute the DeleteAssociation service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the DeleteAssociation service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws TooManyUpdatesException
     * @throws AssociationDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteAssociationResult deleteAssociation(DeleteAssociationRequest deleteAssociationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssociationRequest> request = null;
        Response<DeleteAssociationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssociationRequestMarshaller().marshall(deleteAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAssociationResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteAssociationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAssociationResult> responseHandler =
                new JsonResponseHandler<DeleteAssociationResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a configuration document.
     * </p>
     * <p>
     * After you create a configuration document, you can use
     * CreateAssociation to associate it with one or more running instances.
     * </p>
     *
     * @param createDocumentRequest Container for the necessary parameters to
     *           execute the CreateDocument service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the CreateDocument service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws DocumentAlreadyExistsException
     * @throws MaxDocumentSizeExceededException
     * @throws InvalidDocumentContentException
     * @throws DocumentLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDocumentResult createDocument(CreateDocumentRequest createDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(createDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDocumentRequest> request = null;
        Response<CreateDocumentResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDocumentRequestMarshaller().marshall(createDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDocumentResult, JsonUnmarshallerContext> unmarshaller =
                new CreateDocumentResultJsonUnmarshaller();
            JsonResponseHandler<CreateDocumentResult> responseHandler =
                new JsonResponseHandler<CreateDocumentResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the contents of the specified configuration document.
     * </p>
     *
     * @param getDocumentRequest Container for the necessary parameters to
     *           execute the GetDocument service method on AWSSimpleSystemsManagement.
     * 
     * @return The response from the GetDocument service method, as returned
     *         by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDocumentResult getDocument(GetDocumentRequest getDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(getDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentRequest> request = null;
        Response<GetDocumentResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentRequestMarshaller().marshall(getDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDocumentResult, JsonUnmarshallerContext> unmarshaller =
                new GetDocumentResultJsonUnmarshaller();
            JsonResponseHandler<GetDocumentResult> responseHandler =
                new JsonResponseHandler<GetDocumentResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes one or more of your configuration documents.
     * </p>
     * 
     * @return The response from the ListDocuments service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDocumentsResult listDocuments() throws AmazonServiceException, AmazonClientException {
        return listDocuments(new ListDocumentsRequest());
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        