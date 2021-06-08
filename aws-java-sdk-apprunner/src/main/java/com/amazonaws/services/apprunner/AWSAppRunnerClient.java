/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apprunner;

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

import com.amazonaws.services.apprunner.AWSAppRunnerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.apprunner.model.*;
import com.amazonaws.services.apprunner.model.transform.*;

/**
 * Client for accessing AWS App Runner. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>AWS App Runner</fullname>
 * <p>
 * AWS App Runner is an application service that provides a fast, simple, and cost-effective way to go directly from an
 * existing container image or source code to a running service in the AWS cloud in seconds. You don't need to learn new
 * technologies, decide which compute service to use, or understand how to provision and configure AWS resources.
 * </p>
 * <p>
 * App Runner connects directly to your container registry or source code repository. It provides an automatic delivery
 * pipeline with fully managed operations, high performance, scalability, and security.
 * </p>
 * <p>
 * For more information about App Runner, see the <a href="https://docs.aws.amazon.com/apprunner/latest/dg/">AWS App
 * Runner Developer Guide</a>. For release information, see the <a
 * href="https://docs.aws.amazon.com/apprunner/latest/relnotes/">AWS App Runner Release Notes</a>.
 * </p>
 * <p>
 * To install the Software Development Kits (SDKs), Integrated Development Environment (IDE) Toolkits, and command line
 * tools that you can use to access the API, see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web
 * Services</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For a list of Region-specific endpoints that App Runner supports, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/apprunner.html">AWS App Runner endpoints and quotas</a> in the
 * <i>AWS General Reference</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAppRunnerClient extends AmazonWebServiceClient implements AWSAppRunner {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAppRunner.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "apprunner";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apprunner.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apprunner.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apprunner.model.transform.InternalServiceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apprunner.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apprunner.model.transform.InvalidStateExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.apprunner.model.AWSAppRunnerException.class));

    public static AWSAppRunnerClientBuilder builder() {
        return AWSAppRunnerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS App Runner using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppRunnerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS App Runner using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppRunnerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("apprunner.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/apprunner/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/apprunner/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associate your own domain name with the AWS App Runner subdomain URL of your App Runner service.
     * </p>
     * <p>
     * After you call <code>AssociateCustomDomain</code> and receive a successful response, use the information in the
     * <a>CustomDomain</a> record that's returned to add CNAME records to your Domain Name System (DNS). For each mapped
     * domain name, add a mapping to the target App Runner subdomain and one or more certificate validation records. App
     * Runner then performs DNS validation to verify that you own or control the domain name that you associated. App
     * Runner tracks domain validity in a certificate stored in <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide">AWS Certificate Manager (ACM)</a>.
     * </p>
     * 
     * @param associateCustomDomainRequest
     * @return Result of the AssociateCustomDomain operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.AssociateCustomDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/AssociateCustomDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateCustomDomainResult associateCustomDomain(AssociateCustomDomainRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateCustomDomain(request);
    }

    @SdkInternalApi
    final AssociateCustomDomainResult executeAssociateCustomDomain(AssociateCustomDomainRequest associateCustomDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(associateCustomDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateCustomDomainRequest> request = null;
        Response<AssociateCustomDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateCustomDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateCustomDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateCustomDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateCustomDomainResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateCustomDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create an AWS App Runner automatic scaling configuration resource. App Runner requires this resource when you
     * create App Runner services that require non-default auto scaling settings. You can share an auto scaling
     * configuration across multiple services.
     * </p>
     * <p>
     * Create multiple revisions of a configuration by using the same <code>AutoScalingConfigurationName</code> and
     * different <code>AutoScalingConfigurationRevision</code> values. When you create a service, you can set it to use
     * the latest active revision of an auto scaling configuration or a specific revision.
     * </p>
     * <p>
     * Configure a higher <code>MinSize</code> to increase the spread of your App Runner service over more Availability
     * Zones in the AWS Region. The tradeoff is a higher minimal cost.
     * </p>
     * <p>
     * Configure a lower <code>MaxSize</code> to control your cost. The tradeoff is lower responsiveness during peak
     * demand.
     * </p>
     * 
     * @param createAutoScalingConfigurationRequest
     * @return Result of the CreateAutoScalingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ServiceQuotaExceededException
     *         App Runner can't create this resource. You've reached your account quota for this resource type.</p>
     *         <p>
     *         For App Runner per-resource quotas, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/apprunner.html">AWS App Runner endpoints and
     *         quotas</a> in the <i>AWS General Reference</i>.
     * @sample AWSAppRunner.CreateAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAutoScalingConfigurationResult createAutoScalingConfiguration(CreateAutoScalingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAutoScalingConfiguration(request);
    }

    @SdkInternalApi
    final CreateAutoScalingConfigurationResult executeCreateAutoScalingConfiguration(CreateAutoScalingConfigurationRequest createAutoScalingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createAutoScalingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAutoScalingConfigurationRequest> request = null;
        Response<CreateAutoScalingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAutoScalingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAutoScalingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAutoScalingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAutoScalingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAutoScalingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create an AWS App Runner connection resource. App Runner requires a connection resource when you create App
     * Runner services that access private repositories from certain third-party providers. You can share a connection
     * across multiple services.
     * </p>
     * <p>
     * A connection resource is needed to access GitHub repositories. GitHub requires a user interface approval process
     * through the App Runner console before you can use the connection.
     * </p>
     * 
     * @param createConnectionRequest
     * @return Result of the CreateConnection operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ServiceQuotaExceededException
     *         App Runner can't create this resource. You've reached your account quota for this resource type.</p>
     *         <p>
     *         For App Runner per-resource quotas, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/apprunner.html">AWS App Runner endpoints and
     *         quotas</a> in the <i>AWS General Reference</i>.
     * @sample AWSAppRunner.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateConnectionResult createConnection(CreateConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConnection(request);
    }

    @SdkInternalApi
    final CreateConnectionResult executeCreateConnection(CreateConnectionRequest createConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectionRequest> request = null;
        Response<CreateConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create an AWS App Runner service. After the service is created, the action also automatically starts a
     * deployment.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a href="https://docs.aws.amazon.com/apprunner/latest/api/API_ListOperations.html">ListOperations</a> call to
     * track the operation's progress.
     * </p>
     * 
     * @param createServiceRequest
     * @return Result of the CreateService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ServiceQuotaExceededException
     *         App Runner can't create this resource. You've reached your account quota for this resource type.</p>
     *         <p>
     *         For App Runner per-resource quotas, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/apprunner.html">AWS App Runner endpoints and
     *         quotas</a> in the <i>AWS General Reference</i>.
     * @sample AWSAppRunner.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateServiceResult createService(CreateServiceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateService(request);
    }

    @SdkInternalApi
    final CreateServiceResult executeCreateService(CreateServiceRequest createServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceRequest> request = null;
        Response<CreateServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an AWS App Runner automatic scaling configuration resource. You can delete a specific revision or the
     * latest active revision. You can't delete a configuration that's used by one or more App Runner services.
     * </p>
     * 
     * @param deleteAutoScalingConfigurationRequest
     * @return Result of the DeleteAutoScalingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @sample AWSAppRunner.DeleteAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAutoScalingConfigurationResult deleteAutoScalingConfiguration(DeleteAutoScalingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAutoScalingConfiguration(request);
    }

    @SdkInternalApi
    final DeleteAutoScalingConfigurationResult executeDeleteAutoScalingConfiguration(DeleteAutoScalingConfigurationRequest deleteAutoScalingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAutoScalingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAutoScalingConfigurationRequest> request = null;
        Response<DeleteAutoScalingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAutoScalingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAutoScalingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAutoScalingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAutoScalingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAutoScalingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an AWS App Runner connection. You must first ensure that there are no running App Runner services that use
     * this connection. If there are any, the <code>DeleteConnection</code> action fails.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnection(request);
    }

    @SdkInternalApi
    final DeleteConnectionResult executeDeleteConnection(DeleteConnectionRequest deleteConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectionRequest> request = null;
        Response<DeleteConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an AWS App Runner service.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return Result of the DeleteService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteServiceResult deleteService(DeleteServiceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteService(request);
    }

    @SdkInternalApi
    final DeleteServiceResult executeDeleteService(DeleteServiceRequest deleteServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceRequest> request = null;
        Response<DeleteServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Return a full description of an AWS App Runner automatic scaling configuration resource.
     * </p>
     * 
     * @param describeAutoScalingConfigurationRequest
     * @return Result of the DescribeAutoScalingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @sample AWSAppRunner.DescribeAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAutoScalingConfigurationResult describeAutoScalingConfiguration(DescribeAutoScalingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAutoScalingConfiguration(request);
    }

    @SdkInternalApi
    final DescribeAutoScalingConfigurationResult executeDescribeAutoScalingConfiguration(
            DescribeAutoScalingConfigurationRequest describeAutoScalingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAutoScalingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutoScalingConfigurationRequest> request = null;
        Response<DescribeAutoScalingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAutoScalingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAutoScalingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAutoScalingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAutoScalingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAutoScalingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Return a description of custom domain names that are associated with an AWS App Runner service.
     * </p>
     * 
     * @param describeCustomDomainsRequest
     * @return Result of the DescribeCustomDomains operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @sample AWSAppRunner.DescribeCustomDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeCustomDomains"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCustomDomainsResult describeCustomDomains(DescribeCustomDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCustomDomains(request);
    }

    @SdkInternalApi
    final DescribeCustomDomainsResult executeDescribeCustomDomains(DescribeCustomDomainsRequest describeCustomDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCustomDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCustomDomainsRequest> request = null;
        Response<DescribeCustomDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCustomDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCustomDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCustomDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCustomDomainsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeCustomDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Return a full description of an AWS App Runner service.
     * </p>
     * 
     * @param describeServiceRequest
     * @return Result of the DescribeService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.DescribeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeServiceResult describeService(DescribeServiceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeService(request);
    }

    @SdkInternalApi
    final DescribeServiceResult executeDescribeService(DescribeServiceRequest describeServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceRequest> request = null;
        Response<DescribeServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociate a custom domain name from an AWS App Runner service.
     * </p>
     * <p>
     * Certificates tracking domain validity are associated with a custom domain and are stored in <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide">AWS Certificate Manager (ACM)</a>. These certificates
     * aren't deleted as part of this action. App Runner delays certificate deletion for 30 days after a domain is
     * disassociated from your service.
     * </p>
     * 
     * @param disassociateCustomDomainRequest
     * @return Result of the DisassociateCustomDomain operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.DisassociateCustomDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DisassociateCustomDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateCustomDomainResult disassociateCustomDomain(DisassociateCustomDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateCustomDomain(request);
    }

    @SdkInternalApi
    final DisassociateCustomDomainResult executeDisassociateCustomDomain(DisassociateCustomDomainRequest disassociateCustomDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateCustomDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateCustomDomainRequest> request = null;
        Response<DisassociateCustomDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateCustomDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateCustomDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateCustomDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateCustomDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateCustomDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of AWS App Runner automatic scaling configurations in your AWS account. You can query the
     * revisions for a specific configuration name or the revisions for all configurations in your account. You can
     * optionally query only the latest revision of each requested name.
     * </p>
     * 
     * @param listAutoScalingConfigurationsRequest
     * @return Result of the ListAutoScalingConfigurations operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.ListAutoScalingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListAutoScalingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAutoScalingConfigurationsResult listAutoScalingConfigurations(ListAutoScalingConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAutoScalingConfigurations(request);
    }

    @SdkInternalApi
    final ListAutoScalingConfigurationsResult executeListAutoScalingConfigurations(ListAutoScalingConfigurationsRequest listAutoScalingConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAutoScalingConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAutoScalingConfigurationsRequest> request = null;
        Response<ListAutoScalingConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAutoScalingConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAutoScalingConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAutoScalingConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAutoScalingConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAutoScalingConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of AWS App Runner connections that are associated with your AWS account.
     * </p>
     * 
     * @param listConnectionsRequest
     * @return Result of the ListConnections operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.ListConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListConnections" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListConnectionsResult listConnections(ListConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeListConnections(request);
    }

    @SdkInternalApi
    final ListConnectionsResult executeListConnections(ListConnectionsRequest listConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConnectionsRequest> request = null;
        Response<ListConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Return a list of operations that occurred on an AWS App Runner service.
     * </p>
     * <p>
     * The resulting list of <a>OperationSummary</a> objects is sorted in reverse chronological order. The first object
     * on the list represents the last started operation.
     * </p>
     * 
     * @param listOperationsRequest
     * @return Result of the ListOperations operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @sample AWSAppRunner.ListOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListOperations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListOperationsResult listOperations(ListOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeListOperations(request);
    }

    @SdkInternalApi
    final ListOperationsResult executeListOperations(ListOperationsRequest listOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOperationsRequest> request = null;
        Response<ListOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOperationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOperations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOperationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListOperationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of running AWS App Runner services in your AWS account.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListServicesResult listServices(ListServicesRequest request) {
        request = beforeClientExecution(request);
        return executeListServices(request);
    }

    @SdkInternalApi
    final ListServicesResult executeListServices(ListServicesRequest listServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServicesRequest> request = null;
        Response<ListServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List tags that are associated with for an AWS App Runner resource. The response contains a list of tag key-value
     * pairs.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
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
     * Pause an active AWS App Runner service. App Runner reduces compute capacity for the service to zero and loses
     * state (for example, ephemeral storage is removed).
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param pauseServiceRequest
     * @return Result of the PauseService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.PauseService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/PauseService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PauseServiceResult pauseService(PauseServiceRequest request) {
        request = beforeClientExecution(request);
        return executePauseService(request);
    }

    @SdkInternalApi
    final PauseServiceResult executePauseService(PauseServiceRequest pauseServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(pauseServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PauseServiceRequest> request = null;
        Response<PauseServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PauseServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(pauseServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PauseService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PauseServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PauseServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resume an active AWS App Runner service. App Runner provisions compute capacity for the service.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param resumeServiceRequest
     * @return Result of the ResumeService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.ResumeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ResumeService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResumeServiceResult resumeService(ResumeServiceRequest request) {
        request = beforeClientExecution(request);
        return executeResumeService(request);
    }

    @SdkInternalApi
    final ResumeServiceResult executeResumeService(ResumeServiceRequest resumeServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(resumeServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResumeServiceRequest> request = null;
        Response<ResumeServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResumeServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resumeServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResumeService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResumeServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResumeServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiate a manual deployment of the latest commit in a source code repository or the latest image in a source
     * image repository to an AWS App Runner service.
     * </p>
     * <p>
     * For a source code repository, App Runner retrieves the commit and builds a Docker image. For a source image
     * repository, App Runner retrieves the latest Docker image. In both cases, App Runner then deploys the new image to
     * your service and starts a new container instance.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param startDeploymentRequest
     * @return Result of the StartDeployment operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartDeploymentResult startDeployment(StartDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeStartDeployment(request);
    }

    @SdkInternalApi
    final StartDeploymentResult executeStartDeployment(StartDeploymentRequest startDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(startDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDeploymentRequest> request = null;
        Response<StartDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add tags to, or update the tag values of, an App Runner resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
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
     * Remove tags from an App Runner resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
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
     * Update an AWS App Runner service. You can update the source configuration and instance configuration of the
     * service. You can also update the ARN of the auto scaling configuration resource that's associated with the
     * service. However, you can't change the name or the encryption configuration of the service. These can be set only
     * when you create the service.
     * </p>
     * <p>
     * To update the tags applied to your service, use the separate actions <a>TagResource</a> and <a>UntagResource</a>.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param updateServiceRequest
     * @return Result of the UpdateService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateServiceResult updateService(UpdateServiceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateService(request);
    }

    @SdkInternalApi
    final UpdateServiceResult executeUpdateService(UpdateServiceRequest updateServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceRequest> request = null;
        Response<UpdateServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateServiceResultJsonUnmarshaller());
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

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
