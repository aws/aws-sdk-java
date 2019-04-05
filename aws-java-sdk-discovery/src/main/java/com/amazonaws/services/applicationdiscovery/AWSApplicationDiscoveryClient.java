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
package com.amazonaws.services.applicationdiscovery;

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

import com.amazonaws.services.applicationdiscovery.AWSApplicationDiscoveryClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.services.applicationdiscovery.model.transform.*;

/**
 * Client for accessing AWS Application Discovery Service. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * <fullname>AWS Application Discovery Service</fullname>
 * <p>
 * AWS Application Discovery Service helps you plan application migration projects by automatically identifying servers,
 * virtual machines (VMs), software, and software dependencies running in your on-premises data centers. Application
 * Discovery Service also collects application performance data, which can help you assess the outcome of your
 * migration. The data collected by Application Discovery Service is securely retained in an AWS-hosted and managed
 * database in the cloud. You can export the data as a CSV or XML file into your preferred visualization tool or
 * cloud-migration solution to plan your migration. For more information, see <a
 * href="http://aws.amazon.com/application-discovery/faqs/">AWS Application Discovery Service FAQ</a>.
 * </p>
 * <p>
 * Application Discovery Service offers two modes of operation:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Agentless discovery</b> mode is recommended for environments that use VMware vCenter Server. This mode doesn't
 * require you to install an agent on each host. Agentless discovery gathers server information regardless of the
 * operating systems, which minimizes the time required for initial on-premises infrastructure assessment. Agentless
 * discovery doesn't collect information about software and software dependencies. It also doesn't work in non-VMware
 * environments.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Agent-based discovery</b> mode collects a richer set of data than agentless discovery by using the AWS Application
 * Discovery Agent, which you install on one or more hosts in your data center. The agent captures infrastructure and
 * application information, including an inventory of installed software applications, system and process performance,
 * resource utilization, and network dependencies between workloads. The information collected by agents is secured at
 * rest and in transit to the Application Discovery Service database in the cloud.
 * </p>
 * </li>
 * </ul>
 * <p>
 * We recommend that you use agent-based discovery for non-VMware environments and to collect information about software
 * and software dependencies. You can also run agent-based and agentless discovery simultaneously. Use agentless
 * discovery to quickly complete the initial infrastructure assessment and then install agents on select hosts.
 * </p>
 * <p>
 * Application Discovery Service integrates with application discovery solutions from AWS Partner Network (APN)
 * partners. Third-party application discovery tools can query Application Discovery Service and write to the
 * Application Discovery Service database using a public API. You can then import the data into either a visualization
 * tool or cloud-migration solution.
 * </p>
 * <important>
 * <p>
 * Application Discovery Service doesn't gather sensitive information. All data is handled according to the <a
 * href="http://aws.amazon.com/privacy/">AWS Privacy Policy</a>. You can operate Application Discovery Service offline
 * to inspect collected data before it is shared with the service.
 * </p>
 * </important>
 * <p>
 * This API reference provides descriptions, syntax, and usage examples for each of the actions and data types for
 * Application Discovery Service. The topic for each action shows the API request parameters and the response.
 * Alternatively, you can use one of the AWS SDKs to access an API that is tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <p>
 * This guide is intended for use with the <a href="http://docs.aws.amazon.com/application-discovery/latest/userguide/">
 * <i>AWS Application Discovery Service User Guide</i> </a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSApplicationDiscoveryClient extends AmazonWebServiceClient implements AWSApplicationDiscovery {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSApplicationDiscovery.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "discovery";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServerInternalErrorException").withModeledClass(
                                    com.amazonaws.services.applicationdiscovery.model.ServerInternalErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.applicationdiscovery.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withModeledClass(
                                    com.amazonaws.services.applicationdiscovery.model.InvalidParameterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.applicationdiscovery.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.applicationdiscovery.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictErrorException").withModeledClass(
                                    com.amazonaws.services.applicationdiscovery.model.ConflictErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotPermittedException").withModeledClass(
                                    com.amazonaws.services.applicationdiscovery.model.OperationNotPermittedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AuthorizationErrorException").withModeledClass(
                                    com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.applicationdiscovery.model.AWSApplicationDiscoveryException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSApplicationDiscoveryClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSApplicationDiscoveryClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS Application Discovery Service
     *        (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSApplicationDiscoveryClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSApplicationDiscoveryClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified AWS
     * account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSApplicationDiscoveryClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSApplicationDiscoveryClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSApplicationDiscoveryClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified AWS
     * account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Application Discovery Service
     *        (ex: proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSApplicationDiscoveryClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationDiscoveryClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSApplicationDiscoveryClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified AWS
     * account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSApplicationDiscoveryClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSApplicationDiscoveryClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified AWS
     * account credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Application Discovery Service
     *        (ex: proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSApplicationDiscoveryClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationDiscoveryClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSApplicationDiscoveryClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified AWS
     * account credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Application Discovery Service
     *        (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSApplicationDiscoveryClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationDiscoveryClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSApplicationDiscoveryClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSApplicationDiscoveryClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSApplicationDiscoveryClientBuilder builder() {
        return AWSApplicationDiscoveryClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSApplicationDiscoveryClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSApplicationDiscoveryClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://discovery.us-west-2.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/applicationdiscovery/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/applicationdiscovery/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates one or more configuration items with an application.
     * </p>
     * 
     * @param associateConfigurationItemsToApplicationRequest
     * @return Result of the AssociateConfigurationItemsToApplication operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.AssociateConfigurationItemsToApplication
     */
    @Override
    public AssociateConfigurationItemsToApplicationResult associateConfigurationItemsToApplication(AssociateConfigurationItemsToApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateConfigurationItemsToApplication(request);
    }

    @SdkInternalApi
    final AssociateConfigurationItemsToApplicationResult executeAssociateConfigurationItemsToApplication(
            AssociateConfigurationItemsToApplicationRequest associateConfigurationItemsToApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(associateConfigurationItemsToApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateConfigurationItemsToApplicationRequest> request = null;
        Response<AssociateConfigurationItemsToApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateConfigurationItemsToApplicationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateConfigurationItemsToApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateConfigurationItemsToApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateConfigurationItemsToApplicationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateConfigurationItemsToApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes one or more import tasks, each identified by their import ID. Each import task has a number of records
     * that can identify servers or applications.
     * </p>
     * <p>
     * AWS Application Discovery Service has built-in matching logic that will identify when discovered servers match
     * existing entries that you've previously discovered, the information for the already-existing discovered server is
     * updated. When you delete an import task that contains records that were used to match, the information in those
     * matched records that comes from the deleted records will also be deleted.
     * </p>
     * 
     * @param batchDeleteImportDataRequest
     * @return Result of the BatchDeleteImportData operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.BatchDeleteImportData
     */
    @Override
    public BatchDeleteImportDataResult batchDeleteImportData(BatchDeleteImportDataRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteImportData(request);
    }

    @SdkInternalApi
    final BatchDeleteImportDataResult executeBatchDeleteImportData(BatchDeleteImportDataRequest batchDeleteImportDataRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteImportDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteImportDataRequest> request = null;
        Response<BatchDeleteImportDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteImportDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteImportDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteImportData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteImportDataResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchDeleteImportDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an application with the given name and description.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.CreateApplication
     */
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API
     * accepts a list of multiple configuration items.
     * </p>
     * 
     * @param createTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.CreateTags
     */
    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTags(request);
    }

    @SdkInternalApi
    final CreateTagsResult executeCreateTags(CreateTagsRequest createTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagsRequest> request = null;
        Response<CreateTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a list of applications and their associations with configuration items.
     * </p>
     * 
     * @param deleteApplicationsRequest
     * @return Result of the DeleteApplications operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DeleteApplications
     */
    @Override
    public DeleteApplicationsResult deleteApplications(DeleteApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplications(request);
    }

    @SdkInternalApi
    final DeleteApplicationsResult executeDeleteApplications(DeleteApplicationsRequest deleteApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationsRequest> request = null;
        Response<DeleteApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple
     * configuration items.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DeleteTags
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTags(request);
    }

    @SdkInternalApi
    final DeleteTagsResult executeDeleteTags(DeleteTagsRequest deleteTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists agents or connectors as specified by ID or other filters. All agents/connectors associated with your user
     * account can be listed if you call <code>DescribeAgents</code> as is without passing any parameters.
     * </p>
     * 
     * @param describeAgentsRequest
     * @return Result of the DescribeAgents operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeAgents
     */
    @Override
    public DescribeAgentsResult describeAgents(DescribeAgentsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAgents(request);
    }

    @SdkInternalApi
    final DescribeAgentsResult executeDescribeAgents(DescribeAgentsRequest describeAgentsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAgentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAgentsRequest> request = null;
        Response<DescribeAgentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAgentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAgentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAgents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAgentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAgentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves attributes for a list of configuration item IDs.
     * </p>
     * <note>
     * <p>
     * All of the supplied IDs must be for the same asset type from one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * server
     * </p>
     * </li>
     * <li>
     * <p>
     * application
     * </p>
     * </li>
     * <li>
     * <p>
     * process
     * </p>
     * </li>
     * <li>
     * <p>
     * connection
     * </p>
     * </li>
     * </ul>
     * <p>
     * Output fields are specific to the asset type specified. For example, the output for a <i>server</i> configuration
     * item includes a list of attributes about the server, such as host name, operating system, number of network
     * cards, etc.
     * </p>
     * <p>
     * For a complete list of outputs for each asset type, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#DescribeConfigurations"
     * >Using the DescribeConfigurations Action</a>.
     * </p>
     * </note>
     * 
     * @param describeConfigurationsRequest
     * @return Result of the DescribeConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeConfigurations
     */
    @Override
    public DescribeConfigurationsResult describeConfigurations(DescribeConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigurations(request);
    }

    @SdkInternalApi
    final DescribeConfigurationsResult executeDescribeConfigurations(DescribeConfigurationsRequest describeConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationsRequest> request = null;
        Response<DescribeConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists exports as specified by ID. All continuous exports associated with your user account can be listed if you
     * call <code>DescribeContinuousExports</code> as is without passing any parameters.
     * </p>
     * 
     * @param describeContinuousExportsRequest
     * @return Result of the DescribeContinuousExports operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @throws OperationNotPermittedException
     *         This operation is not permitted.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @sample AWSApplicationDiscovery.DescribeContinuousExports
     */
    @Override
    public DescribeContinuousExportsResult describeContinuousExports(DescribeContinuousExportsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeContinuousExports(request);
    }

    @SdkInternalApi
    final DescribeContinuousExportsResult executeDescribeContinuousExports(DescribeContinuousExportsRequest describeContinuousExportsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeContinuousExportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeContinuousExportsRequest> request = null;
        Response<DescribeContinuousExportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeContinuousExportsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeContinuousExportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeContinuousExports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeContinuousExportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeContinuousExportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * <code>DescribeExportConfigurations</code> is deprecated. Use <a
     * href="https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportTasks.html"
     * >DescribeImportTasks</a>, instead.
     * </p>
     * 
     * @param describeExportConfigurationsRequest
     * @return Result of the DescribeExportConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeExportConfigurations
     */
    @Override
    @Deprecated
    public DescribeExportConfigurationsResult describeExportConfigurations(DescribeExportConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExportConfigurations(request);
    }

    @SdkInternalApi
    final DescribeExportConfigurationsResult executeDescribeExportConfigurations(DescribeExportConfigurationsRequest describeExportConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExportConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExportConfigurationsRequest> request = null;
        Response<DescribeExportConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExportConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeExportConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExportConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExportConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeExportConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return Result of the DescribeExportTasks operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeExportTasks
     */
    @Override
    public DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExportTasks(request);
    }

    @SdkInternalApi
    final DescribeExportTasksResult executeDescribeExportTasks(DescribeExportTasksRequest describeExportTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExportTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExportTasksRequest> request = null;
        Response<DescribeExportTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExportTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExportTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExportTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExportTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeExportTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of import tasks for your account, including status information, times, IDs, the Amazon S3 Object
     * URL for the import file, and more.
     * </p>
     * 
     * @param describeImportTasksRequest
     * @return Result of the DescribeImportTasks operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeImportTasks
     */
    @Override
    public DescribeImportTasksResult describeImportTasks(DescribeImportTasksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeImportTasks(request);
    }

    @SdkInternalApi
    final DescribeImportTasksResult executeDescribeImportTasks(DescribeImportTasksRequest describeImportTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeImportTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImportTasksRequest> request = null;
        Response<DescribeImportTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImportTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeImportTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeImportTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeImportTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeImportTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of configuration items that have tags as specified by the key-value pairs, name and value,
     * passed to the optional parameter <code>filters</code>.
     * </p>
     * <p>
     * There are three valid tag filter names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * tagKey
     * </p>
     * </li>
     * <li>
     * <p>
     * tagValue
     * </p>
     * </li>
     * <li>
     * <p>
     * configurationId
     * </p>
     * </li>
     * </ul>
     * <p>
     * Also, all configuration items associated with your user account that have tags can be listed if you call
     * <code>DescribeTags</code> as is without passing any parameters.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeTags
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTags(request);
    }

    @SdkInternalApi
    final DescribeTagsResult executeDescribeTags(DescribeTagsRequest describeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates one or more configuration items from an application.
     * </p>
     * 
     * @param disassociateConfigurationItemsFromApplicationRequest
     * @return Result of the DisassociateConfigurationItemsFromApplication operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DisassociateConfigurationItemsFromApplication
     */
    @Override
    public DisassociateConfigurationItemsFromApplicationResult disassociateConfigurationItemsFromApplication(
            DisassociateConfigurationItemsFromApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateConfigurationItemsFromApplication(request);
    }

    @SdkInternalApi
    final DisassociateConfigurationItemsFromApplicationResult executeDisassociateConfigurationItemsFromApplication(
            DisassociateConfigurationItemsFromApplicationRequest disassociateConfigurationItemsFromApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateConfigurationItemsFromApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateConfigurationItemsFromApplicationRequest> request = null;
        Response<DisassociateConfigurationItemsFromApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateConfigurationItemsFromApplicationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateConfigurationItemsFromApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateConfigurationItemsFromApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateConfigurationItemsFromApplicationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateConfigurationItemsFromApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecated. Use <code>StartExportTask</code> instead.
     * </p>
     * <p>
     * Exports all discovered configuration data to an Amazon S3 bucket or an application that enables you to view and
     * evaluate the data. Data includes tags and tag associations, processes, connections, servers, and system
     * performance. This API returns an export ID that you can query using the <i>DescribeExportConfigurations</i> API.
     * The system imposes a limit of two configuration exports in six hours.
     * </p>
     * 
     * @param exportConfigurationsRequest
     * @return Result of the ExportConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @throws OperationNotPermittedException
     *         This operation is not permitted.
     * @sample AWSApplicationDiscovery.ExportConfigurations
     */
    @Override
    @Deprecated
    public ExportConfigurationsResult exportConfigurations(ExportConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeExportConfigurations(request);
    }

    @SdkInternalApi
    final ExportConfigurationsResult executeExportConfigurations(ExportConfigurationsRequest exportConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(exportConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportConfigurationsRequest> request = null;
        Response<ExportConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a short summary of discovered assets.
     * </p>
     * <p>
     * This API operation takes no request parameters and is called as is at the command prompt as shown in the example.
     * </p>
     * 
     * @param getDiscoverySummaryRequest
     * @return Result of the GetDiscoverySummary operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.GetDiscoverySummary
     */
    @Override
    public GetDiscoverySummaryResult getDiscoverySummary(GetDiscoverySummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetDiscoverySummary(request);
    }

    @SdkInternalApi
    final GetDiscoverySummaryResult executeGetDiscoverySummary(GetDiscoverySummaryRequest getDiscoverySummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getDiscoverySummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDiscoverySummaryRequest> request = null;
        Response<GetDiscoverySummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDiscoverySummaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDiscoverySummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDiscoverySummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDiscoverySummaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDiscoverySummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of configuration items as specified by the value passed to the required paramater
     * <code>configurationType</code>. Optional filtering may be applied to refine search results.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @return Result of the ListConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.ListConfigurations
     */
    @Override
    public ListConfigurationsResult listConfigurations(ListConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListConfigurations(request);
    }

    @SdkInternalApi
    final ListConfigurationsResult executeListConfigurations(ListConfigurationsRequest listConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationsRequest> request = null;
        Response<ListConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of servers that are one network hop away from a specified server.
     * </p>
     * 
     * @param listServerNeighborsRequest
     * @return Result of the ListServerNeighbors operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.ListServerNeighbors
     */
    @Override
    public ListServerNeighborsResult listServerNeighbors(ListServerNeighborsRequest request) {
        request = beforeClientExecution(request);
        return executeListServerNeighbors(request);
    }

    @SdkInternalApi
    final ListServerNeighborsResult executeListServerNeighbors(ListServerNeighborsRequest listServerNeighborsRequest) {

        ExecutionContext executionContext = createExecutionContext(listServerNeighborsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServerNeighborsRequest> request = null;
        Response<ListServerNeighborsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServerNeighborsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServerNeighborsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServerNeighbors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServerNeighborsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServerNeighborsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Start the continuous flow of agent's discovered data into Amazon Athena.
     * </p>
     * 
     * @param startContinuousExportRequest
     * @return Result of the StartContinuousExport operation returned by the service.
     * @throws ConflictErrorException
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @throws OperationNotPermittedException
     *         This operation is not permitted.
     * @throws ResourceInUseException
     *         This issue occurs when the same <code>clientRequestToken</code> is used with the
     *         <code>StartImportTask</code> action, but with different parameters. For example, you use the same request
     *         token but have two different import URLs, you can encounter this issue. If the import tasks are meant to
     *         be different, use a different <code>clientRequestToken</code>, and try again.
     * @sample AWSApplicationDiscovery.StartContinuousExport
     */
    @Override
    public StartContinuousExportResult startContinuousExport(StartContinuousExportRequest request) {
        request = beforeClientExecution(request);
        return executeStartContinuousExport(request);
    }

    @SdkInternalApi
    final StartContinuousExportResult executeStartContinuousExport(StartContinuousExportRequest startContinuousExportRequest) {

        ExecutionContext executionContext = createExecutionContext(startContinuousExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartContinuousExportRequest> request = null;
        Response<StartContinuousExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartContinuousExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startContinuousExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartContinuousExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartContinuousExportResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartContinuousExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Instructs the specified agents or connectors to start collecting data.
     * </p>
     * 
     * @param startDataCollectionByAgentIdsRequest
     * @return Result of the StartDataCollectionByAgentIds operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.StartDataCollectionByAgentIds
     */
    @Override
    public StartDataCollectionByAgentIdsResult startDataCollectionByAgentIds(StartDataCollectionByAgentIdsRequest request) {
        request = beforeClientExecution(request);
        return executeStartDataCollectionByAgentIds(request);
    }

    @SdkInternalApi
    final StartDataCollectionByAgentIdsResult executeStartDataCollectionByAgentIds(StartDataCollectionByAgentIdsRequest startDataCollectionByAgentIdsRequest) {

        ExecutionContext executionContext = createExecutionContext(startDataCollectionByAgentIdsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDataCollectionByAgentIdsRequest> request = null;
        Response<StartDataCollectionByAgentIdsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDataCollectionByAgentIdsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startDataCollectionByAgentIdsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDataCollectionByAgentIds");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDataCollectionByAgentIdsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartDataCollectionByAgentIdsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Begins the export of discovered data to an S3 bucket.
     * </p>
     * <p>
     * If you specify <code>agentIds</code> in a filter, the task exports up to 72 hours of detailed data collected by
     * the identified Application Discovery Agent, including network, process, and performance details. A time range for
     * exported agent data may be set by using <code>startTime</code> and <code>endTime</code>. Export of detailed agent
     * data is limited to five concurrently running exports.
     * </p>
     * <p>
     * If you do not include an <code>agentIds</code> filter, summary data is exported that includes both AWS Agentless
     * Discovery Connector data and summary data from AWS Discovery Agents. Export of summary data is limited to two
     * exports per day.
     * </p>
     * 
     * @param startExportTaskRequest
     * @return Result of the StartExportTask operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @throws OperationNotPermittedException
     *         This operation is not permitted.
     * @sample AWSApplicationDiscovery.StartExportTask
     */
    @Override
    public StartExportTaskResult startExportTask(StartExportTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartExportTask(request);
    }

    @SdkInternalApi
    final StartExportTaskResult executeStartExportTask(StartExportTaskRequest startExportTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startExportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartExportTaskRequest> request = null;
        Response<StartExportTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartExportTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startExportTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartExportTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartExportTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartExportTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an import task, which allows you to import details of your on-premises environment directly into AWS
     * without having to use the Application Discovery Service (ADS) tools such as the Discovery Connector or Discovery
     * Agent. This gives you the option to perform migration assessment and planning directly from your imported data,
     * including the ability to group your devices as applications and track their migration status.
     * </p>
     * <p>
     * To start an import request, do this:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Download the specially formatted comma separated value (CSV) import template, which you can find here: <a
     * href="https://s3-us-west-2.amazonaws.com/templates-7cffcf56-bd96-4b1c-b45b-a5b42f282e46/import_template.csv"
     * >https://s3-us-west-2.amazonaws.com/templates-7cffcf56-bd96-4b1c-b45b-a5b42f282e46/import_template.csv</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fill out the template with your server and application data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Upload your import file to an Amazon S3 bucket, and make a note of it's Object URL. Your import file must be in
     * the CSV format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the console or the <code>StartImportTask</code> command with the AWS CLI or one of the AWS SDKs to import the
     * records from your file.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, including step-by-step procedures, see <a
     * href="https://docs.aws.amazon.com/application-discovery/latest/userguide/discovery-import.html">Migration Hub
     * Import</a> in the <i>AWS Application Discovery Service User Guide</i>.
     * </p>
     * <note>
     * <p>
     * There are limits to the number of import tasks you can create (and delete) in an AWS account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/application-discovery/latest/userguide/ads_service_limits.html">AWS Application
     * Discovery Service Limits</a> in the <i>AWS Application Discovery Service User Guide</i>.
     * </p>
     * </note>
     * 
     * @param startImportTaskRequest
     * @return Result of the StartImportTask operation returned by the service.
     * @throws ResourceInUseException
     *         This issue occurs when the same <code>clientRequestToken</code> is used with the
     *         <code>StartImportTask</code> action, but with different parameters. For example, you use the same request
     *         token but have two different import URLs, you can encounter this issue. If the import tasks are meant to
     *         be different, use a different <code>clientRequestToken</code>, and try again.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.StartImportTask
     */
    @Override
    public StartImportTaskResult startImportTask(StartImportTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartImportTask(request);
    }

    @SdkInternalApi
    final StartImportTaskResult executeStartImportTask(StartImportTaskRequest startImportTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startImportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartImportTaskRequest> request = null;
        Response<StartImportTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartImportTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startImportTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartImportTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartImportTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartImportTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stop the continuous flow of agent's discovered data into Amazon Athena.
     * </p>
     * 
     * @param stopContinuousExportRequest
     * @return Result of the StopContinuousExport operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @throws OperationNotPermittedException
     *         This operation is not permitted.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws ResourceInUseException
     *         This issue occurs when the same <code>clientRequestToken</code> is used with the
     *         <code>StartImportTask</code> action, but with different parameters. For example, you use the same request
     *         token but have two different import URLs, you can encounter this issue. If the import tasks are meant to
     *         be different, use a different <code>clientRequestToken</code>, and try again.
     * @sample AWSApplicationDiscovery.StopContinuousExport
     */
    @Override
    public StopContinuousExportResult stopContinuousExport(StopContinuousExportRequest request) {
        request = beforeClientExecution(request);
        return executeStopContinuousExport(request);
    }

    @SdkInternalApi
    final StopContinuousExportResult executeStopContinuousExport(StopContinuousExportRequest stopContinuousExportRequest) {

        ExecutionContext executionContext = createExecutionContext(stopContinuousExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopContinuousExportRequest> request = null;
        Response<StopContinuousExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopContinuousExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopContinuousExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopContinuousExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopContinuousExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopContinuousExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Instructs the specified agents or connectors to stop collecting data.
     * </p>
     * 
     * @param stopDataCollectionByAgentIdsRequest
     * @return Result of the StopDataCollectionByAgentIds operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.StopDataCollectionByAgentIds
     */
    @Override
    public StopDataCollectionByAgentIdsResult stopDataCollectionByAgentIds(StopDataCollectionByAgentIdsRequest request) {
        request = beforeClientExecution(request);
        return executeStopDataCollectionByAgentIds(request);
    }

    @SdkInternalApi
    final StopDataCollectionByAgentIdsResult executeStopDataCollectionByAgentIds(StopDataCollectionByAgentIdsRequest stopDataCollectionByAgentIdsRequest) {

        ExecutionContext executionContext = createExecutionContext(stopDataCollectionByAgentIdsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDataCollectionByAgentIdsRequest> request = null;
        Response<StopDataCollectionByAgentIdsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDataCollectionByAgentIdsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopDataCollectionByAgentIdsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopDataCollectionByAgentIds");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopDataCollectionByAgentIdsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopDataCollectionByAgentIdsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates metadata about an application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.UpdateApplication
     */
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplication(request);
    }

    @SdkInternalApi
    final UpdateApplicationResult executeUpdateApplication(UpdateApplicationRequest updateApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Discovery Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApplicationResultJsonUnmarshaller());
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
