/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.arczonalshift;

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

import com.amazonaws.services.arczonalshift.AWSARCZonalShiftClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.arczonalshift.model.*;

import com.amazonaws.services.arczonalshift.model.transform.*;

/**
 * Client for accessing AWS ARC - Zonal Shift. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Welcome to the Zonal Shift API Reference Guide for Amazon Route 53 Application Recovery Controller (Route 53 ARC).
 * </p>
 * <p>
 * You can start a zonal shift to move traffic for a load balancer resource away from an Availability Zone to help your
 * application recover quickly from an impairment in an Availability Zone. For example, you can recover your application
 * from a developer's bad code deployment or from an Amazon Web Services infrastructure failure in a single Availability
 * Zone.
 * </p>
 * <p>
 * You can also configure zonal autoshift for a load balancer resource. Zonal autoshift is a capability in Route 53 ARC
 * where Amazon Web Services shifts away application resource traffic from an Availability Zone, on your behalf, to help
 * reduce your time to recovery during events. Amazon Web Services shifts away traffic for resources that are enabled
 * for zonal autoshift whenever Amazon Web Services determines that there's an issue in the Availability Zone that could
 * potentially affect customers.
 * </p>
 * <p>
 * To ensure that zonal autoshift is safe for your application, you must also configure practice runs when you enable
 * zonal autoshift for a resource. Practice runs start weekly zonal shifts for a resource, to shift traffic for the
 * resource out of an Availability Zone. Practice runs make sure, on a regular basis, that you have enough capacity in
 * all the Availability Zones in an Amazon Web Services Region for your application to continue to operate normally when
 * traffic for a resource is shifted away from one Availability Zone.
 * </p>
 * <important>
 * <p>
 * You must prescale resource capacity in all Availability Zones in the Region where your application is deployed,
 * before you configure practice runs or enable zonal autoshift for a resource. You should not rely on scaling on demand
 * when an autoshift or practice run starts.
 * </p>
 * </important>
 * <p>
 * For more information about using zonal shift and zonal autoshift, see the <a
 * href="https://docs.aws.amazon.com/r53recovery/latest/dg/what-is-route53-recovery.html">Amazon Route 53 Application
 * Recovery Controller Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSARCZonalShiftClient extends AmazonWebServiceClient implements AWSARCZonalShift {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSARCZonalShift.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "arc-zonal-shift";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.arczonalshift.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.arczonalshift.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.arczonalshift.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.arczonalshift.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.arczonalshift.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.arczonalshift.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.arczonalshift.model.AWSARCZonalShiftException.class));

    public static AWSARCZonalShiftClientBuilder builder() {
        return AWSARCZonalShiftClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS ARC - Zonal Shift using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSARCZonalShiftClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS ARC - Zonal Shift using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSARCZonalShiftClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("arc-zonal-shift.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/arczonalshift/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/arczonalshift/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancel a zonal shift in Amazon Route 53 Application Recovery Controller. To cancel the zonal shift, specify the
     * zonal shift ID.
     * </p>
     * <p>
     * A zonal shift can be one that you've started for a resource in your Amazon Web Services account in an Amazon Web
     * Services Region, or it can be a zonal shift started by a practice run with zonal autoshift.
     * </p>
     * 
     * @param cancelZonalShiftRequest
     * @return Result of the CancelZonalShift operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.CancelZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/CancelZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelZonalShiftResult cancelZonalShift(CancelZonalShiftRequest request) {
        request = beforeClientExecution(request);
        return executeCancelZonalShift(request);
    }

    @SdkInternalApi
    final CancelZonalShiftResult executeCancelZonalShift(CancelZonalShiftRequest cancelZonalShiftRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelZonalShiftRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelZonalShiftRequest> request = null;
        Response<CancelZonalShiftResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelZonalShiftRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelZonalShiftRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ARC Zonal Shift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelZonalShift");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelZonalShiftResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelZonalShiftResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A practice run configuration for zonal autoshift is required when you enable zonal autoshift. A practice run
     * configuration includes specifications for blocked dates and blocked time windows, and for Amazon CloudWatch
     * alarms that you create to use with practice runs. The alarms that you specify are an <i>outcome alarm</i>, to
     * monitor application health during practice runs and, optionally, a <i>blocking alarm</i>, to block practice runs
     * from starting.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.considerations.html"> Considerations
     * when you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param createPracticeRunConfigurationRequest
     * @return Result of the CreatePracticeRunConfiguration operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.CreatePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/CreatePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePracticeRunConfigurationResult createPracticeRunConfiguration(CreatePracticeRunConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePracticeRunConfiguration(request);
    }

    @SdkInternalApi
    final CreatePracticeRunConfigurationResult executeCreatePracticeRunConfiguration(CreatePracticeRunConfigurationRequest createPracticeRunConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createPracticeRunConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePracticeRunConfigurationRequest> request = null;
        Response<CreatePracticeRunConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePracticeRunConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPracticeRunConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ARC Zonal Shift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePracticeRunConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePracticeRunConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePracticeRunConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the practice run configuration for a resource. Before you can delete a practice run configuration for a
     * resource., you must disable zonal autoshift for the resource. Practice runs must be configured for zonal
     * autoshift to be enabled.
     * </p>
     * 
     * @param deletePracticeRunConfigurationRequest
     * @return Result of the DeletePracticeRunConfiguration operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.DeletePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/DeletePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePracticeRunConfigurationResult deletePracticeRunConfiguration(DeletePracticeRunConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePracticeRunConfiguration(request);
    }

    @SdkInternalApi
    final DeletePracticeRunConfigurationResult executeDeletePracticeRunConfiguration(DeletePracticeRunConfigurationRequest deletePracticeRunConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePracticeRunConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePracticeRunConfigurationRequest> request = null;
        Response<DeletePracticeRunConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePracticeRunConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deletePracticeRunConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ARC Zonal Shift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePracticeRunConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePracticeRunConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePracticeRunConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get information about a resource that's been registered for zonal shifts with Amazon Route 53 Application
     * Recovery Controller in this Amazon Web Services Region. Resources that are registered for zonal shifts are
     * managed resources in Route 53 ARC. You can start zonal shifts and configure zonal autoshift for managed
     * resources.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift or configure zonal autoshift for Network Load Balancers and
     * Application Load Balancers with cross-zone load balancing turned off.
     * </p>
     * 
     * @param getManagedResourceRequest
     * @return Result of the GetManagedResource operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.GetManagedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/GetManagedResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetManagedResourceResult getManagedResource(GetManagedResourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetManagedResource(request);
    }

    @SdkInternalApi
    final GetManagedResourceResult executeGetManagedResource(GetManagedResourceRequest getManagedResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getManagedResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetManagedResourceRequest> request = null;
        Response<GetManagedResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetManagedResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getManagedResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ARC Zonal Shift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetManagedResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetManagedResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetManagedResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the active autoshifts for a specified resource.
     * </p>
     * 
     * @param listAutoshiftsRequest
     * @return Result of the ListAutoshifts operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.ListAutoshifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListAutoshifts" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAutoshiftsResult listAutoshifts(ListAutoshiftsRequest request) {
        request = beforeClientExecution(request);
        return executeListAutoshifts(request);
    }

    @SdkInternalApi
    final ListAutoshiftsResult executeListAutoshifts(ListAutoshiftsRequest listAutoshiftsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAutoshiftsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAutoshiftsRequest> request = null;
        Response<ListAutoshiftsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAutoshiftsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAutoshiftsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ARC Zonal Shift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAutoshifts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAutoshiftsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAutoshiftsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the resources in your Amazon Web Services account in this Amazon Web Services Region that are managed
     * for zonal shifts in Amazon Route 53 Application Recovery Controller, and information about them. The information
     * includes the zonal autoshift status for the resource, as well as the Amazon Resource Name (ARN), the Availability
     * Zones that each resource is deployed in, and the resource name.
     * </p>
     * 
     * @param listManagedResourcesRequest
     * @return Result of the ListManagedResources operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.ListManagedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListManagedResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListManagedResourcesResult listManagedResources(ListManagedResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListManagedResources(request);
    }

    @SdkInternalApi
    final ListManagedResourcesResult executeListManagedResources(ListManagedResourcesRequest listManagedResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listManagedResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListManagedResourcesRequest> request = null;
        Response<ListManagedResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListManagedResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listManagedResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ARC Zonal Shift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListManagedResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListManagedResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListManagedResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all active and completed zonal shifts in Amazon Route 53 Application Recovery Controller in your Amazon Web
     * Services account in this Amazon Web Services Region. <code>ListZonalShifts</code> returns customer-started zonal
     * shifts, as well as practice run zonal shifts that Route 53 ARC started on your behalf for zonal autoshift.
     * </p>
     * <p>
     * The <code>ListZonalShifts</code> operation does not list autoshifts. For more information about listing
     * autoshifts, see <a
     * href="https://docs.aws.amazon.com/arc-zonal-shift/latest/api/API_ListAutoshifts.html">"&gt;ListAutoshifts</a>.
     * </p>
     * 
     * @param listZonalShiftsRequest
     * @return Result of the ListZonalShifts operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.ListZonalShifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListZonalShifts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListZonalShiftsResult listZonalShifts(ListZonalShiftsRequest request) {
        request = beforeClientExecution(request);
        return executeListZonalShifts(request);
    }

    @SdkInternalApi
    final ListZonalShiftsResult executeListZonalShifts(ListZonalShiftsRequest listZonalShiftsRequest) {

        ExecutionContext executionContext = createExecutionContext(listZonalShiftsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListZonalShiftsRequest> request = null;
        Response<ListZonalShiftsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListZonalShiftsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listZonalShiftsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ARC Zonal Shift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListZonalShifts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListZonalShiftsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListZonalShiftsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You start a zonal shift to temporarily move load balancer traffic away from an Availability Zone in an Amazon Web
     * Services Region, to help your application recover immediately, for example, from a developer's bad code
     * deployment or from an Amazon Web Services infrastructure failure in a single Availability Zone. You can start a
     * zonal shift in Route 53 ARC only for managed resources in your Amazon Web Services account in an Amazon Web
     * Services Region. Resources are automatically registered with Route 53 ARC by Amazon Web Services services.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * <p>
     * When you start a zonal shift, traffic for the resource is no longer routed to the Availability Zone. The zonal
     * shift is created immediately in Route 53 ARC. However, it can take a short time, typically up to a few minutes,
     * for existing, in-progress connections in the Availability Zone to complete.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-shift.html">Zonal
     * shift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param startZonalShiftRequest
     * @return Result of the StartZonalShift operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.StartZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/StartZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartZonalShiftResult startZonalShift(StartZonalShiftRequest request) {
        request = beforeClientExecution(request);
        return executeStartZonalShift(request);
    }

    @SdkInternalApi
    final StartZonalShiftResult executeStartZonalShift(StartZonalShiftRequest startZonalShiftRequest) {

        ExecutionContext executionContext = createExecutionContext(startZonalShiftRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartZonalShiftRequest> request = null;
        Response<StartZonalShiftResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartZonalShiftRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startZonalShiftRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ARC Zonal Shift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartZonalShift");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartZonalShiftResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartZonalShiftResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a practice run configuration to change one or more of the following: add, change, or remove the blocking
     * alarm; change the outcome alarm; or add, change, or remove blocking dates or time windows.
     * </p>
     * 
     * @param updatePracticeRunConfigurationRequest
     * @return Result of the UpdatePracticeRunConfiguration operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.UpdatePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdatePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePracticeRunConfigurationResult updatePracticeRunConfiguration(UpdatePracticeRunConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePracticeRunConfiguration(request);
    }

    @SdkInternalApi
    final UpdatePracticeRunConfigurationResult executeUpdatePracticeRunConfiguration(UpdatePracticeRunConfigurationRequest updatePracticeRunConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePracticeRunConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePracticeRunConfigurationRequest> request = null;
        Response<UpdatePracticeRunConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePracticeRunConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updatePracticeRunConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ARC Zonal Shift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePracticeRunConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePracticeRunConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePracticeRunConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You can update the zonal autoshift status for a resource, to enable or disable zonal autoshift. When zonal
     * autoshift is <code>ENABLED</code>, Amazon Web Services shifts away resource traffic from an Availability Zone, on
     * your behalf, when Amazon Web Services determines that there's an issue in the Availability Zone that could
     * potentially affect customers.
     * </p>
     * 
     * @param updateZonalAutoshiftConfigurationRequest
     * @return Result of the UpdateZonalAutoshiftConfiguration operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.UpdateZonalAutoshiftConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdateZonalAutoshiftConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateZonalAutoshiftConfigurationResult updateZonalAutoshiftConfiguration(UpdateZonalAutoshiftConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateZonalAutoshiftConfiguration(request);
    }

    @SdkInternalApi
    final UpdateZonalAutoshiftConfigurationResult executeUpdateZonalAutoshiftConfiguration(
            UpdateZonalAutoshiftConfigurationRequest updateZonalAutoshiftConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateZonalAutoshiftConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateZonalAutoshiftConfigurationRequest> request = null;
        Response<UpdateZonalAutoshiftConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateZonalAutoshiftConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateZonalAutoshiftConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ARC Zonal Shift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateZonalAutoshiftConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateZonalAutoshiftConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateZonalAutoshiftConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update an active zonal shift in Amazon Route 53 Application Recovery Controller in your Amazon Web Services
     * account. You can update a zonal shift to set a new expiration, or edit or replace the comment for the zonal
     * shift.
     * </p>
     * 
     * @param updateZonalShiftRequest
     * @return Result of the UpdateZonalShift operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.UpdateZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdateZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateZonalShiftResult updateZonalShift(UpdateZonalShiftRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateZonalShift(request);
    }

    @SdkInternalApi
    final UpdateZonalShiftResult executeUpdateZonalShift(UpdateZonalShiftRequest updateZonalShiftRequest) {

        ExecutionContext executionContext = createExecutionContext(updateZonalShiftRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateZonalShiftRequest> request = null;
        Response<UpdateZonalShiftResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateZonalShiftRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateZonalShiftRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ARC Zonal Shift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateZonalShift");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateZonalShiftResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateZonalShiftResultJsonUnmarshaller());
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
