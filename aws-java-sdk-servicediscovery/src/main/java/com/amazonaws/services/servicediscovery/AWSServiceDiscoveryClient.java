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
package com.amazonaws.services.servicediscovery;

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

import com.amazonaws.services.servicediscovery.AWSServiceDiscoveryClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.servicediscovery.model.*;
import com.amazonaws.services.servicediscovery.model.transform.*;

/**
 * Client for accessing ServiceDiscovery. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Cloud Map lets you configure public DNS, private DNS, or HTTP namespaces that your microservice applications run
 * in. When an instance of the service becomes available, you can call the AWS Cloud Map API to register the instance
 * with AWS Cloud Map. For public or private DNS namespaces, AWS Cloud Map automatically creates DNS records and an
 * optional health check. Clients that submit public or private DNS queries, or HTTP requests, for the service receive
 * an answer that contains up to eight healthy records.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSServiceDiscoveryClient extends AmazonWebServiceClient implements AWSServiceDiscovery {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSServiceDiscovery.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "servicediscovery";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotFound").withModeledClass(
                                    com.amazonaws.services.servicediscovery.model.OperationNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUse").withModeledClass(
                                    com.amazonaws.services.servicediscovery.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateRequest").withModeledClass(
                                    com.amazonaws.services.servicediscovery.model.DuplicateRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInput").withModeledClass(
                                    com.amazonaws.services.servicediscovery.model.InvalidInputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceAlreadyExists").withModeledClass(
                                    com.amazonaws.services.servicediscovery.model.ServiceAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceNotFound").withModeledClass(
                                    com.amazonaws.services.servicediscovery.model.ServiceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NamespaceAlreadyExists").withModeledClass(
                                    com.amazonaws.services.servicediscovery.model.NamespaceAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InstanceNotFound").withModeledClass(
                                    com.amazonaws.services.servicediscovery.model.InstanceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NamespaceNotFound").withModeledClass(
                                    com.amazonaws.services.servicediscovery.model.NamespaceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CustomHealthNotFound").withModeledClass(
                                    com.amazonaws.services.servicediscovery.model.CustomHealthNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceeded").withModeledClass(
                                    com.amazonaws.services.servicediscovery.model.ResourceLimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.servicediscovery.model.AWSServiceDiscoveryException.class));

    public static AWSServiceDiscoveryClientBuilder builder() {
        return AWSServiceDiscoveryClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on ServiceDiscovery using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSServiceDiscoveryClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on ServiceDiscovery using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSServiceDiscoveryClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("servicediscovery.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/servicediscovery/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/servicediscovery/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an HTTP namespace. Service instances that you register using an HTTP namespace can be discovered using a
     * <code>DiscoverInstances</code> request but can't be discovered using DNS.
     * </p>
     * <p>
     * For the current limit on the number of namespaces that you can create using the same AWS account, see <a
     * href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map Limits</a> in the
     * <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createHttpNamespaceRequest
     * @return Result of the CreateHttpNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws NamespaceAlreadyExistsException
     *         The namespace that you're trying to create already exists.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @sample AWSServiceDiscovery.CreateHttpNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreateHttpNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateHttpNamespaceResult createHttpNamespace(CreateHttpNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHttpNamespace(request);
    }

    @SdkInternalApi
    final CreateHttpNamespaceResult executeCreateHttpNamespace(CreateHttpNamespaceRequest createHttpNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createHttpNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHttpNamespaceRequest> request = null;
        Response<CreateHttpNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHttpNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createHttpNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHttpNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateHttpNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateHttpNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace
     * defines your service naming scheme. For example, if you name your namespace <code>example.com</code> and name
     * your service <code>backend</code>, the resulting DNS name for the service will be
     * <code>backend.example.com</code>. For the current limit on the number of namespaces that you can create using the
     * same AWS account, see <a href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud
     * Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createPrivateDnsNamespaceRequest
     * @return Result of the CreatePrivateDnsNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws NamespaceAlreadyExistsException
     *         The namespace that you're trying to create already exists.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @sample AWSServiceDiscovery.CreatePrivateDnsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePrivateDnsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePrivateDnsNamespaceResult createPrivateDnsNamespace(CreatePrivateDnsNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePrivateDnsNamespace(request);
    }

    @SdkInternalApi
    final CreatePrivateDnsNamespaceResult executeCreatePrivateDnsNamespace(CreatePrivateDnsNamespaceRequest createPrivateDnsNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createPrivateDnsNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePrivateDnsNamespaceRequest> request = null;
        Response<CreatePrivateDnsNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePrivateDnsNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPrivateDnsNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePrivateDnsNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePrivateDnsNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePrivateDnsNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your
     * service naming scheme. For example, if you name your namespace <code>example.com</code> and name your service
     * <code>backend</code>, the resulting DNS name for the service will be <code>backend.example.com</code>. For the
     * current limit on the number of namespaces that you can create using the same AWS account, see <a
     * href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map Limits</a> in the
     * <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createPublicDnsNamespaceRequest
     * @return Result of the CreatePublicDnsNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws NamespaceAlreadyExistsException
     *         The namespace that you're trying to create already exists.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @sample AWSServiceDiscovery.CreatePublicDnsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePublicDnsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePublicDnsNamespaceResult createPublicDnsNamespace(CreatePublicDnsNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePublicDnsNamespace(request);
    }

    @SdkInternalApi
    final CreatePublicDnsNamespaceResult executeCreatePublicDnsNamespace(CreatePublicDnsNamespaceRequest createPublicDnsNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createPublicDnsNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePublicDnsNamespaceRequest> request = null;
        Response<CreatePublicDnsNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePublicDnsNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPublicDnsNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePublicDnsNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePublicDnsNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePublicDnsNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a service, which defines the configuration for the following entities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private DNS namespaces, one of the following combinations of DNS records in Amazon Route 53:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * A and AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Optionally, a health check
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you create the service, you can submit a <a>RegisterInstance</a> request, and AWS Cloud Map uses the values
     * in the configuration to create the specified entities.
     * </p>
     * <p>
     * For the current limit on the number of instances that you can register using the same namespace and using the
     * same service, see <a href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map
     * Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createServiceRequest
     * @return Result of the CreateService operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws NamespaceNotFoundException
     *         No namespace exists with the specified ID.
     * @throws ServiceAlreadyExistsException
     *         The service can't be created because a service with the same name already exists.
     * @sample AWSServiceDiscovery.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreateService" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
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
     * Deletes a namespace from the current account. If the namespace still contains one or more services, the request
     * fails.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return Result of the DeleteNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws NamespaceNotFoundException
     *         No namespace exists with the specified ID.
     * @throws ResourceInUseException
     *         The specified resource can't be deleted because it contains other resources. For example, you can't
     *         delete a service that contains any instances.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @sample AWSServiceDiscovery.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeleteNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteNamespaceResult deleteNamespace(DeleteNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNamespace(request);
    }

    @SdkInternalApi
    final DeleteNamespaceResult executeDeleteNamespace(DeleteNamespaceRequest deleteNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNamespaceRequest> request = null;
        Response<DeleteNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return Result of the DeleteService operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @throws ResourceInUseException
     *         The specified resource can't be deleted because it contains other resources. For example, you can't
     *         delete a service that contains any instances.
     * @sample AWSServiceDiscovery.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeleteService" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
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
     * Deletes the Amazon Route 53 DNS records and health check, if any, that AWS Cloud Map created for the specified
     * instance.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @return Result of the DeregisterInstance operation returned by the service.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws InstanceNotFoundException
     *         No instance exists with the specified ID, or the instance was recently registered, and information about
     *         the instance hasn't propagated yet.
     * @throws ResourceInUseException
     *         The specified resource can't be deleted because it contains other resources. For example, you can't
     *         delete a service that contains any instances.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.DeregisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeregisterInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterInstanceResult deregisterInstance(DeregisterInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterInstance(request);
    }

    @SdkInternalApi
    final DeregisterInstanceResult executeDeregisterInstance(DeregisterInstanceRequest deregisterInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterInstanceRequest> request = null;
        Response<DeregisterInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeregisterInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Discovers registered instances for a specified namespace and service.
     * </p>
     * 
     * @param discoverInstancesRequest
     * @return Result of the DiscoverInstances operation returned by the service.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @throws NamespaceNotFoundException
     *         No namespace exists with the specified ID.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @sample AWSServiceDiscovery.DiscoverInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DiscoverInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DiscoverInstancesResult discoverInstances(DiscoverInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDiscoverInstances(request);
    }

    @SdkInternalApi
    final DiscoverInstancesResult executeDiscoverInstances(DiscoverInstancesRequest discoverInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(discoverInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DiscoverInstancesRequest> request = null;
        Response<DiscoverInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DiscoverInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(discoverInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DiscoverInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "data-";
                String resolvedHostPrefix = String.format("data-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DiscoverInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DiscoverInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specified instance.
     * </p>
     * 
     * @param getInstanceRequest
     * @return Result of the GetInstance operation returned by the service.
     * @throws InstanceNotFoundException
     *         No instance exists with the specified ID, or the instance was recently registered, and information about
     *         the instance hasn't propagated yet.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetInstanceResult getInstance(GetInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstance(request);
    }

    @SdkInternalApi
    final GetInstanceResult executeGetInstance(GetInstanceRequest getInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceRequest> request = null;
        Response<GetInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the current health status (<code>Healthy</code>, <code>Unhealthy</code>, or <code>Unknown</code>) of one or
     * more instances that are associated with a specified service.
     * </p>
     * <note>
     * <p>
     * There is a brief delay between when you register an instance and when the health status for the instance is
     * available.
     * </p>
     * </note>
     * 
     * @param getInstancesHealthStatusRequest
     * @return Result of the GetInstancesHealthStatus operation returned by the service.
     * @throws InstanceNotFoundException
     *         No instance exists with the specified ID, or the instance was recently registered, and information about
     *         the instance hasn't propagated yet.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.GetInstancesHealthStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetInstancesHealthStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInstancesHealthStatusResult getInstancesHealthStatus(GetInstancesHealthStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstancesHealthStatus(request);
    }

    @SdkInternalApi
    final GetInstancesHealthStatusResult executeGetInstancesHealthStatus(GetInstancesHealthStatusRequest getInstancesHealthStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstancesHealthStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstancesHealthStatusRequest> request = null;
        Response<GetInstancesHealthStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstancesHealthStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getInstancesHealthStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstancesHealthStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstancesHealthStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetInstancesHealthStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a namespace.
     * </p>
     * 
     * @param getNamespaceRequest
     * @return Result of the GetNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws NamespaceNotFoundException
     *         No namespace exists with the specified ID.
     * @sample AWSServiceDiscovery.GetNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetNamespaceResult getNamespace(GetNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeGetNamespace(request);
    }

    @SdkInternalApi
    final GetNamespaceResult executeGetNamespace(GetNamespaceRequest getNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(getNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNamespaceRequest> request = null;
        Response<GetNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about any operation that returns an operation ID in the response, such as a
     * <code>CreateService</code> request.
     * </p>
     * <note>
     * <p>
     * To get a list of operations that match specified criteria, see <a>ListOperations</a>.
     * </p>
     * </note>
     * 
     * @param getOperationRequest
     * @return Result of the GetOperation operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws OperationNotFoundException
     *         No operation exists with the specified ID.
     * @sample AWSServiceDiscovery.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetOperation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetOperationResult getOperation(GetOperationRequest request) {
        request = beforeClientExecution(request);
        return executeGetOperation(request);
    }

    @SdkInternalApi
    final GetOperationResult executeGetOperation(GetOperationRequest getOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(getOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationRequest> request = null;
        Response<GetOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the settings for a specified service.
     * </p>
     * 
     * @param getServiceRequest
     * @return Result of the GetService operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetService" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetServiceResult getService(GetServiceRequest request) {
        request = beforeClientExecution(request);
        return executeGetService(request);
    }

    @SdkInternalApi
    final GetServiceResult executeGetService(GetServiceRequest getServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceRequest> request = null;
        Response<GetServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists summary information about the instances that you registered by using a specified service.
     * </p>
     * 
     * @param listInstancesRequest
     * @return Result of the ListInstances operation returned by the service.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @sample AWSServiceDiscovery.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListInstancesResult listInstances(ListInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListInstances(request);
    }

    @SdkInternalApi
    final ListInstancesResult executeListInstances(ListInstancesRequest listInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstancesRequest> request = null;
        Response<ListInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists summary information about the namespaces that were created by the current AWS account.
     * </p>
     * 
     * @param listNamespacesRequest
     * @return Result of the ListNamespaces operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @sample AWSServiceDiscovery.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListNamespaces"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNamespacesResult listNamespaces(ListNamespacesRequest request) {
        request = beforeClientExecution(request);
        return executeListNamespaces(request);
    }

    @SdkInternalApi
    final ListNamespacesResult executeListNamespaces(ListNamespacesRequest listNamespacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNamespacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNamespacesRequest> request = null;
        Response<ListNamespacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNamespacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNamespacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNamespaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNamespacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNamespacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists operations that match the criteria that you specify.
     * </p>
     * 
     * @param listOperationsRequest
     * @return Result of the ListOperations operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @sample AWSServiceDiscovery.ListOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListOperations"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
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
     * Lists summary information for all the services that are associated with one or more specified namespaces.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @sample AWSServiceDiscovery.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListServices" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
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
     * Creates or updates one or more records and, optionally, creates a health check based on the settings in a
     * specified service. When you submit a <code>RegisterInstance</code> request, the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each DNS record that you define in the service that is specified by <code>ServiceId</code>, a record is
     * created or updated in the hosted zone that is associated with the corresponding namespace.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, a health check is created based on the settings in the
     * health check configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * The health check, if any, is associated with each of the new or updated records.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * One <code>RegisterInstance</code> request must complete before you can submit another request and specify the
     * same service ID and instance ID.
     * </p>
     * </important>
     * <p>
     * For more information, see <a>CreateService</a>.
     * </p>
     * <p>
     * When AWS Cloud Map receives a DNS query for the specified DNS name, it returns the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If the health check is healthy</b>: returns all the records
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If the health check is unhealthy</b>: returns the applicable value for the last healthy instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you didn't specify a health check configuration</b>: returns all the records
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the current limit on the number of instances that you can register using the same namespace and using the
     * same service, see <a href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map
     * Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param registerInstanceRequest
     * @return Result of the RegisterInstance operation returned by the service.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws ResourceInUseException
     *         The specified resource can't be deleted because it contains other resources. For example, you can't
     *         delete a service that contains any instances.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.RegisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/RegisterInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterInstanceResult registerInstance(RegisterInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterInstance(request);
    }

    @SdkInternalApi
    final RegisterInstanceResult executeRegisterInstance(RegisterInstanceRequest registerInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(registerInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterInstanceRequest> request = null;
        Response<RegisterInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Submits a request to change the health status of a custom health check to healthy or unhealthy.
     * </p>
     * <p>
     * You can use <code>UpdateInstanceCustomHealthStatus</code> to change the status only for custom health checks,
     * which you define using <code>HealthCheckCustomConfig</code> when you create a service. You can't use it to change
     * the status for Route 53 health checks, which you define using <code>HealthCheckConfig</code>.
     * </p>
     * <p>
     * For more information, see <a>HealthCheckCustomConfig</a>.
     * </p>
     * 
     * @param updateInstanceCustomHealthStatusRequest
     * @return Result of the UpdateInstanceCustomHealthStatus operation returned by the service.
     * @throws InstanceNotFoundException
     *         No instance exists with the specified ID, or the instance was recently registered, and information about
     *         the instance hasn't propagated yet.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @throws CustomHealthNotFoundException
     *         The health check for the instance that is specified by <code>ServiceId</code> and <code>InstanceId</code>
     *         is not a custom health check.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @sample AWSServiceDiscovery.UpdateInstanceCustomHealthStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/UpdateInstanceCustomHealthStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateInstanceCustomHealthStatusResult updateInstanceCustomHealthStatus(UpdateInstanceCustomHealthStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInstanceCustomHealthStatus(request);
    }

    @SdkInternalApi
    final UpdateInstanceCustomHealthStatusResult executeUpdateInstanceCustomHealthStatus(
            UpdateInstanceCustomHealthStatusRequest updateInstanceCustomHealthStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInstanceCustomHealthStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInstanceCustomHealthStatusRequest> request = null;
        Response<UpdateInstanceCustomHealthStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInstanceCustomHealthStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateInstanceCustomHealthStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInstanceCustomHealthStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInstanceCustomHealthStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateInstanceCustomHealthStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Submits a request to perform the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Add or delete <code>DnsRecords</code> configurations
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the TTL setting for existing <code>DnsRecords</code> configurations
     * </p>
     * </li>
     * <li>
     * <p>
     * Add, update, or delete <code>HealthCheckConfig</code> for a specified service
     * </p>
     * </li>
     * </ul>
     * <p>
     * For public and private DNS namespaces, you must specify all <code>DnsRecords</code> configurations (and,
     * optionally, <code>HealthCheckConfig</code>) that you want to appear in the updated service. Any current
     * configurations that don't appear in an <code>UpdateService</code> request are deleted.
     * </p>
     * <p>
     * When you update the TTL setting for a service, AWS Cloud Map also updates the corresponding settings in all the
     * records and health checks that were created by using the specified service.
     * </p>
     * 
     * @param updateServiceRequest
     * @return Result of the UpdateService operation returned by the service.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/UpdateService" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServiceDiscovery");
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

}
