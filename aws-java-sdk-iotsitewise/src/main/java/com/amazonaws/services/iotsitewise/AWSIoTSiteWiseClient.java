/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise;

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

import com.amazonaws.services.iotsitewise.AWSIoTSiteWiseClientBuilder;
import com.amazonaws.services.iotsitewise.waiters.AWSIoTSiteWiseWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.services.iotsitewise.model.transform.*;

/**
 * Client for accessing AWS IoT SiteWise. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Welcome to the AWS IoT SiteWise API Reference. AWS IoT SiteWise is an AWS service that connects <a
 * href="https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications">Industrial Internet of Things
 * (IIoT)</a> devices to the power of the AWS Cloud. For more information, see the <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/">AWS IoT SiteWise User Guide</a>. For information
 * about AWS IoT SiteWise quotas, see <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT SiteWise
 * User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTSiteWiseClient extends AmazonWebServiceClient implements AWSIoTSiteWise {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTSiteWise.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iotsitewise";

    private volatile AWSIoTSiteWiseWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotsitewise.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotsitewise.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotsitewise.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotsitewise.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotsitewise.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotsitewise.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotsitewise.model.transform.UnauthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotsitewise.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictingOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotsitewise.model.transform.ConflictingOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotsitewise.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iotsitewise.model.AWSIoTSiteWiseException.class));

    public static AWSIoTSiteWiseClientBuilder builder() {
        return AWSIoTSiteWiseClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT SiteWise using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTSiteWiseClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT SiteWise using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTSiteWiseClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("iotsitewise.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iotsitewise/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iotsitewise/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a child asset with the given parent asset through a hierarchy defined in the parent asset's model. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/add-associated-assets.html">Associating
     * assets</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param associateAssetsRequest
     * @return Result of the AssociateAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.AssociateAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssociateAssets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateAssetsResult associateAssets(AssociateAssetsRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateAssets(request);
    }

    @SdkInternalApi
    final AssociateAssetsResult executeAssociateAssets(AssociateAssetsRequest associateAssetsRequest) {

        ExecutionContext executionContext = createExecutionContext(associateAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAssetsRequest> request = null;
        Response<AssociateAssetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAssetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateAssetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateAssets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateAssetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateAssetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a group (batch) of assets with an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param batchAssociateProjectAssetsRequest
     * @return Result of the BatchAssociateProjectAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.BatchAssociateProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchAssociateProjectAssets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchAssociateProjectAssetsResult batchAssociateProjectAssets(BatchAssociateProjectAssetsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchAssociateProjectAssets(request);
    }

    @SdkInternalApi
    final BatchAssociateProjectAssetsResult executeBatchAssociateProjectAssets(BatchAssociateProjectAssetsRequest batchAssociateProjectAssetsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchAssociateProjectAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchAssociateProjectAssetsRequest> request = null;
        Response<BatchAssociateProjectAssetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchAssociateProjectAssetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchAssociateProjectAssetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchAssociateProjectAssets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchAssociateProjectAssetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchAssociateProjectAssetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a group (batch) of assets from an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param batchDisassociateProjectAssetsRequest
     * @return Result of the BatchDisassociateProjectAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.BatchDisassociateProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchDisassociateProjectAssets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDisassociateProjectAssetsResult batchDisassociateProjectAssets(BatchDisassociateProjectAssetsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDisassociateProjectAssets(request);
    }

    @SdkInternalApi
    final BatchDisassociateProjectAssetsResult executeBatchDisassociateProjectAssets(BatchDisassociateProjectAssetsRequest batchDisassociateProjectAssetsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDisassociateProjectAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisassociateProjectAssetsRequest> request = null;
        Response<BatchDisassociateProjectAssetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisassociateProjectAssetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDisassociateProjectAssetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDisassociateProjectAssets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDisassociateProjectAssetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDisassociateProjectAssetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a list of asset property values to AWS IoT SiteWise. Each value is a timestamp-quality-value (TQV) data
     * point. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/ingest-api.html">Ingesting data using the API</a>
     * in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * With respect to Unix epoch time, AWS IoT SiteWise accepts only TQVs that have a timestamp of no more than 7 days
     * in the past and no more than 5 minutes in the future. AWS IoT SiteWise rejects timestamps outside of the
     * inclusive range of [-7 days, +5 minutes] and returns a <code>TimestampOutOfRangeException</code> error.
     * </p>
     * <p>
     * For each asset property, AWS IoT SiteWise overwrites TQVs with duplicate timestamps unless the newer TQV has a
     * different quality. For example, if you store a TQV <code>{T1, GOOD, V1}</code>, then storing
     * <code>{T1, GOOD, V2}</code> replaces the existing TQV.
     * </p>
     * </important>
     * <p>
     * AWS IoT SiteWise authorizes access to each <code>BatchPutAssetPropertyValue</code> entry individually. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-id-based-policies-batchputassetpropertyvalue-action"
     * >BatchPutAssetPropertyValue authorization</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param batchPutAssetPropertyValueRequest
     * @return Result of the BatchPutAssetPropertyValue operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ServiceUnavailableException
     *         The requested service is unavailable.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.BatchPutAssetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchPutAssetPropertyValue"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchPutAssetPropertyValueResult batchPutAssetPropertyValue(BatchPutAssetPropertyValueRequest request) {
        request = beforeClientExecution(request);
        return executeBatchPutAssetPropertyValue(request);
    }

    @SdkInternalApi
    final BatchPutAssetPropertyValueResult executeBatchPutAssetPropertyValue(BatchPutAssetPropertyValueRequest batchPutAssetPropertyValueRequest) {

        ExecutionContext executionContext = createExecutionContext(batchPutAssetPropertyValueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutAssetPropertyValueRequest> request = null;
        Response<BatchPutAssetPropertyValueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutAssetPropertyValueRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchPutAssetPropertyValueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchPutAssetPropertyValue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "data.";
                String resolvedHostPrefix = String.format("data.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchPutAssetPropertyValueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchPutAssetPropertyValueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an access policy that grants the specified identity (AWS SSO user, AWS SSO group, or IAM user) access to
     * the specified AWS IoT SiteWise Monitor portal or project resource.
     * </p>
     * 
     * @param createAccessPolicyRequest
     * @return Result of the CreateAccessPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.CreateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAccessPolicyResult createAccessPolicy(CreateAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessPolicy(request);
    }

    @SdkInternalApi
    final CreateAccessPolicyResult executeCreateAccessPolicy(CreateAccessPolicyRequest createAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessPolicyRequest> request = null;
        Response<CreateAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an asset from an existing asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-assets.html">Creating assets</a> in the
     * <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetRequest
     * @return Result of the CreateAsset operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAssetResult createAsset(CreateAssetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAsset(request);
    }

    @SdkInternalApi
    final CreateAssetResult executeCreateAsset(CreateAssetRequest createAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssetRequest> request = null;
        Response<CreateAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an asset model from specified property and hierarchy definitions. You create assets from asset models.
     * With asset models, you can easily create assets of the same type that have standardized definitions. Each asset
     * created from a model inherits the asset model's property and hierarchy definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/define-models.html">Defining asset models</a> in
     * the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetModelRequest
     * @return Result of the CreateAssetModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.CreateAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAssetModelResult createAssetModel(CreateAssetModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssetModel(request);
    }

    @SdkInternalApi
    final CreateAssetModelResult executeCreateAssetModel(CreateAssetModelRequest createAssetModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssetModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssetModelRequest> request = null;
        Response<CreateAssetModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssetModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssetModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssetModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssetModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAssetModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a dashboard in an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param createDashboardRequest
     * @return Result of the CreateDashboard operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.CreateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDashboardResult createDashboard(CreateDashboardRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDashboard(request);
    }

    @SdkInternalApi
    final CreateDashboardResult executeCreateDashboard(CreateDashboardRequest createDashboardRequest) {

        ExecutionContext executionContext = createExecutionContext(createDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDashboardRequest> request = null;
        Response<CreateDashboardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDashboardRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDashboardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDashboard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDashboardResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDashboardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a gateway, which is a virtual or edge device that delivers industrial data streams from local servers to
     * AWS IoT SiteWise. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html">Ingesting data using a
     * gateway</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createGatewayRequest
     * @return Result of the CreateGateway operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.CreateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateGateway" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGatewayResult createGateway(CreateGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGateway(request);
    }

    @SdkInternalApi
    final CreateGatewayResult executeCreateGateway(CreateGatewayRequest createGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(createGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGatewayRequest> request = null;
        Response<CreateGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "edge.";
                String resolvedHostPrefix = String.format("edge.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a portal, which can contain projects and dashboards. AWS IoT SiteWise Monitor uses AWS SSO or IAM to
     * authenticate portal users and manage user permissions.
     * </p>
     * <note>
     * <p>
     * Before you can sign in to a new portal, you must add at least one identity to that portal. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/administer-portals.html#portal-change-admins"
     * >Adding or removing portal administrators</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createPortalRequest
     * @return Result of the CreatePortal operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.CreatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreatePortal" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePortalResult createPortal(CreatePortalRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePortal(request);
    }

    @SdkInternalApi
    final CreatePortalResult executeCreatePortal(CreatePortalRequest createPortalRequest) {

        ExecutionContext executionContext = createExecutionContext(createPortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePortalRequest> request = null;
        Response<CreatePortalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePortalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPortalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePortal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePortalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePortalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a project in the specified portal.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProjectResult createProject(CreateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProject(request);
    }

    @SdkInternalApi
    final CreateProjectResult executeCreateProject(CreateProjectRequest createProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an access policy that grants the specified identity access to the specified AWS IoT SiteWise Monitor
     * resource. You can use this operation to revoke access to an AWS IoT SiteWise Monitor resource.
     * </p>
     * 
     * @param deleteAccessPolicyRequest
     * @return Result of the DeleteAccessPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DeleteAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAccessPolicyResult deleteAccessPolicy(DeleteAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessPolicy(request);
    }

    @SdkInternalApi
    final DeleteAccessPolicyResult executeDeleteAccessPolicy(DeleteAccessPolicyRequest deleteAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPolicyRequest> request = null;
        Response<DeleteAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an asset. This action can't be undone. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html">Deleting assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can't delete an asset that's associated to another asset. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DisassociateAssets.html"
     * >DisassociateAssets</a>.
     * </p>
     * </note>
     * 
     * @param deleteAssetRequest
     * @return Result of the DeleteAsset operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAssetResult deleteAsset(DeleteAssetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAsset(request);
    }

    @SdkInternalApi
    final DeleteAssetResult executeDeleteAsset(DeleteAssetRequest deleteAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssetRequest> request = null;
        Response<DeleteAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an asset model. This action can't be undone. You must delete all assets created from an asset model
     * before you can delete the model. Also, you can't delete an asset model if a parent asset model exists that
     * contains a property formula expression that depends on the asset model that you want to delete. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html">Deleting assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param deleteAssetModelRequest
     * @return Result of the DeleteAssetModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.DeleteAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAssetModelResult deleteAssetModel(DeleteAssetModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssetModel(request);
    }

    @SdkInternalApi
    final DeleteAssetModelResult executeDeleteAssetModel(DeleteAssetModelRequest deleteAssetModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssetModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssetModelRequest> request = null;
        Response<DeleteAssetModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssetModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssetModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssetModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssetModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAssetModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a dashboard from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @return Result of the DeleteDashboard operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DeleteDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDashboardResult deleteDashboard(DeleteDashboardRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDashboard(request);
    }

    @SdkInternalApi
    final DeleteDashboardResult executeDeleteDashboard(DeleteDashboardRequest deleteDashboardRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDashboardRequest> request = null;
        Response<DeleteDashboardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDashboardRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDashboardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDashboard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDashboardResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDashboardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a gateway from AWS IoT SiteWise. When you delete a gateway, some of the gateway's files remain in your
     * gateway's file system.
     * </p>
     * 
     * @param deleteGatewayRequest
     * @return Result of the DeleteGateway operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteGateway" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGatewayResult deleteGateway(DeleteGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGateway(request);
    }

    @SdkInternalApi
    final DeleteGatewayResult executeDeleteGateway(DeleteGatewayRequest deleteGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayRequest> request = null;
        Response<DeleteGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "edge.";
                String resolvedHostPrefix = String.format("edge.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a portal from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deletePortalRequest
     * @return Result of the DeletePortal operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.DeletePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeletePortal" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePortalResult deletePortal(DeletePortalRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePortal(request);
    }

    @SdkInternalApi
    final DeletePortalResult executeDeletePortal(DeletePortalRequest deletePortalRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePortalRequest> request = null;
        Response<DeletePortalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePortalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePortalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePortal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePortalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePortalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a project from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProjectResult deleteProject(DeleteProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProject(request);
    }

    @SdkInternalApi
    final DeleteProjectResult executeDeleteProject(DeleteProjectRequest deleteProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an access policy, which specifies an identity's access to an AWS IoT SiteWise Monitor portal or
     * project.
     * </p>
     * 
     * @param describeAccessPolicyRequest
     * @return Result of the DescribeAccessPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccessPolicyResult describeAccessPolicy(DescribeAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccessPolicy(request);
    }

    @SdkInternalApi
    final DescribeAccessPolicyResult executeDescribeAccessPolicy(DescribeAccessPolicyRequest describeAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccessPolicyRequest> request = null;
        Response<DescribeAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an asset.
     * </p>
     * 
     * @param describeAssetRequest
     * @return Result of the DescribeAsset operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAsset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAssetResult describeAsset(DescribeAssetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAsset(request);
    }

    @SdkInternalApi
    final DescribeAssetResult executeDescribeAsset(DescribeAssetRequest describeAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssetRequest> request = null;
        Response<DescribeAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an asset model.
     * </p>
     * 
     * @param describeAssetModelRequest
     * @return Result of the DescribeAssetModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAssetModelResult describeAssetModel(DescribeAssetModelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAssetModel(request);
    }

    @SdkInternalApi
    final DescribeAssetModelResult executeDescribeAssetModel(DescribeAssetModelRequest describeAssetModelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAssetModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssetModelRequest> request = null;
        Response<DescribeAssetModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssetModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAssetModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAssetModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssetModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAssetModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an asset property.
     * </p>
     * <note>
     * <p>
     * When you call this operation for an attribute property, this response includes the default attribute value that
     * you define in the asset model. If you update the default value in the model, this operation's response includes
     * the new default value.
     * </p>
     * </note>
     * <p>
     * This operation doesn't return the value of the asset property. To get the value of an asset property, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_GetAssetPropertyValue.html">
     * GetAssetPropertyValue</a>.
     * </p>
     * 
     * @param describeAssetPropertyRequest
     * @return Result of the DescribeAssetProperty operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeAssetProperty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetProperty"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAssetPropertyResult describeAssetProperty(DescribeAssetPropertyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAssetProperty(request);
    }

    @SdkInternalApi
    final DescribeAssetPropertyResult executeDescribeAssetProperty(DescribeAssetPropertyRequest describeAssetPropertyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAssetPropertyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssetPropertyRequest> request = null;
        Response<DescribeAssetPropertyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssetPropertyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAssetPropertyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAssetProperty");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssetPropertyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAssetPropertyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @return Result of the DescribeDashboard operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDashboardResult describeDashboard(DescribeDashboardRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDashboard(request);
    }

    @SdkInternalApi
    final DescribeDashboardResult executeDescribeDashboard(DescribeDashboardRequest describeDashboardRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDashboardRequest> request = null;
        Response<DescribeDashboardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDashboardRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDashboardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDashboard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDashboardResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDashboardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the default encryption configuration for the AWS account in the default or specified
     * region. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/key-management.html">Key management</a> in the
     * <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param describeDefaultEncryptionConfigurationRequest
     * @return Result of the DescribeDefaultEncryptionConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeDefaultEncryptionConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeDefaultEncryptionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDefaultEncryptionConfigurationResult describeDefaultEncryptionConfiguration(DescribeDefaultEncryptionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDefaultEncryptionConfiguration(request);
    }

    @SdkInternalApi
    final DescribeDefaultEncryptionConfigurationResult executeDescribeDefaultEncryptionConfiguration(
            DescribeDefaultEncryptionConfigurationRequest describeDefaultEncryptionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDefaultEncryptionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDefaultEncryptionConfigurationRequest> request = null;
        Response<DescribeDefaultEncryptionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDefaultEncryptionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDefaultEncryptionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDefaultEncryptionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDefaultEncryptionConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeDefaultEncryptionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a gateway.
     * </p>
     * 
     * @param describeGatewayRequest
     * @return Result of the DescribeGateway operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeGatewayResult describeGateway(DescribeGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGateway(request);
    }

    @SdkInternalApi
    final DescribeGatewayResult executeDescribeGateway(DescribeGatewayRequest describeGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGatewayRequest> request = null;
        Response<DescribeGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "edge.";
                String resolvedHostPrefix = String.format("edge.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a gateway capability configuration. Each gateway capability defines data sources for
     * a gateway. A capability configuration can contain multiple data source configurations. If you define OPC-UA
     * sources for a gateway in the AWS IoT SiteWise console, all of your OPC-UA sources are stored in one capability
     * configuration. To list all capability configurations for a gateway, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGateway.html">DescribeGateway</a>.
     * </p>
     * 
     * @param describeGatewayCapabilityConfigurationRequest
     * @return Result of the DescribeGatewayCapabilityConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeGatewayCapabilityConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeGatewayCapabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeGatewayCapabilityConfigurationResult describeGatewayCapabilityConfiguration(DescribeGatewayCapabilityConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGatewayCapabilityConfiguration(request);
    }

    @SdkInternalApi
    final DescribeGatewayCapabilityConfigurationResult executeDescribeGatewayCapabilityConfiguration(
            DescribeGatewayCapabilityConfigurationRequest describeGatewayCapabilityConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGatewayCapabilityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGatewayCapabilityConfigurationRequest> request = null;
        Response<DescribeGatewayCapabilityConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGatewayCapabilityConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeGatewayCapabilityConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGatewayCapabilityConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "edge.";
                String resolvedHostPrefix = String.format("edge.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGatewayCapabilityConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeGatewayCapabilityConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current AWS IoT SiteWise logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return Result of the DescribeLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSIoTSiteWise.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoggingOptionsResult describeLoggingOptions(DescribeLoggingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoggingOptions(request);
    }

    @SdkInternalApi
    final DescribeLoggingOptionsResult executeDescribeLoggingOptions(DescribeLoggingOptionsRequest describeLoggingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoggingOptionsRequest> request = null;
        Response<DescribeLoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoggingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoggingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLoggingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLoggingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a portal.
     * </p>
     * 
     * @param describePortalRequest
     * @return Result of the DescribePortal operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribePortal" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribePortalResult describePortal(DescribePortalRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePortal(request);
    }

    @SdkInternalApi
    final DescribePortalResult executeDescribePortal(DescribePortalRequest describePortalRequest) {

        ExecutionContext executionContext = createExecutionContext(describePortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePortalRequest> request = null;
        Response<DescribePortalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePortalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePortalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePortal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePortalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePortalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @return Result of the DescribeProject operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeProject" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeProjectResult describeProject(DescribeProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProject(request);
    }

    @SdkInternalApi
    final DescribeProjectResult executeDescribeProject(DescribeProjectRequest describeProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProjectRequest> request = null;
        Response<DescribeProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a child asset from the given parent asset through a hierarchy defined in the parent asset's model.
     * </p>
     * 
     * @param disassociateAssetsRequest
     * @return Result of the DisassociateAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.DisassociateAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DisassociateAssets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateAssetsResult disassociateAssets(DisassociateAssetsRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateAssets(request);
    }

    @SdkInternalApi
    final DisassociateAssetsResult executeDisassociateAssets(DisassociateAssetsRequest disassociateAssetsRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateAssetsRequest> request = null;
        Response<DisassociateAssetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateAssetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateAssetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateAssets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateAssetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateAssetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets aggregated values for an asset property. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#aggregates">Querying
     * aggregates</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyAggregatesRequest
     * @return Result of the GetAssetPropertyAggregates operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ServiceUnavailableException
     *         The requested service is unavailable.
     * @sample AWSIoTSiteWise.GetAssetPropertyAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyAggregates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAssetPropertyAggregatesResult getAssetPropertyAggregates(GetAssetPropertyAggregatesRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssetPropertyAggregates(request);
    }

    @SdkInternalApi
    final GetAssetPropertyAggregatesResult executeGetAssetPropertyAggregates(GetAssetPropertyAggregatesRequest getAssetPropertyAggregatesRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssetPropertyAggregatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssetPropertyAggregatesRequest> request = null;
        Response<GetAssetPropertyAggregatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssetPropertyAggregatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAssetPropertyAggregatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssetPropertyAggregates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "data.";
                String resolvedHostPrefix = String.format("data.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssetPropertyAggregatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAssetPropertyAggregatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an asset property's current value. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#current-values"
     * >Querying current values</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyValueRequest
     * @return Result of the GetAssetPropertyValue operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ServiceUnavailableException
     *         The requested service is unavailable.
     * @sample AWSIoTSiteWise.GetAssetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyValue"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAssetPropertyValueResult getAssetPropertyValue(GetAssetPropertyValueRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssetPropertyValue(request);
    }

    @SdkInternalApi
    final GetAssetPropertyValueResult executeGetAssetPropertyValue(GetAssetPropertyValueRequest getAssetPropertyValueRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssetPropertyValueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssetPropertyValueRequest> request = null;
        Response<GetAssetPropertyValueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssetPropertyValueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssetPropertyValueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssetPropertyValue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "data.";
                String resolvedHostPrefix = String.format("data.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssetPropertyValueResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetAssetPropertyValueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the history of an asset property's values. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#historical-values"
     * >Querying historical values</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyValueHistoryRequest
     * @return Result of the GetAssetPropertyValueHistory operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ServiceUnavailableException
     *         The requested service is unavailable.
     * @sample AWSIoTSiteWise.GetAssetPropertyValueHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyValueHistory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAssetPropertyValueHistoryResult getAssetPropertyValueHistory(GetAssetPropertyValueHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssetPropertyValueHistory(request);
    }

    @SdkInternalApi
    final GetAssetPropertyValueHistoryResult executeGetAssetPropertyValueHistory(GetAssetPropertyValueHistoryRequest getAssetPropertyValueHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssetPropertyValueHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssetPropertyValueHistoryRequest> request = null;
        Response<GetAssetPropertyValueHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssetPropertyValueHistoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAssetPropertyValueHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssetPropertyValueHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "data.";
                String resolvedHostPrefix = String.format("data.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssetPropertyValueHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAssetPropertyValueHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of access policies for an identity (an AWS SSO user, an AWS SSO group, or an IAM user)
     * or an AWS IoT SiteWise Monitor resource (a portal or project).
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @return Result of the ListAccessPolicies operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAccessPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAccessPoliciesResult listAccessPolicies(ListAccessPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessPolicies(request);
    }

    @SdkInternalApi
    final ListAccessPoliciesResult executeListAccessPolicies(ListAccessPoliciesRequest listAccessPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessPoliciesRequest> request = null;
        Response<ListAccessPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccessPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccessPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAccessPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of summaries of all asset models.
     * </p>
     * 
     * @param listAssetModelsRequest
     * @return Result of the ListAssetModels operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListAssetModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetModels" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAssetModelsResult listAssetModels(ListAssetModelsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssetModels(request);
    }

    @SdkInternalApi
    final ListAssetModelsResult executeListAssetModels(ListAssetModelsRequest listAssetModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssetModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssetModelsRequest> request = null;
        Response<ListAssetModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssetModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssetModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssetModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssetModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssetModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of asset relationships for an asset. You can use this operation to identify an asset's
     * root asset and all associated assets between that asset and its root.
     * </p>
     * 
     * @param listAssetRelationshipsRequest
     * @return Result of the ListAssetRelationships operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListAssetRelationships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetRelationships"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssetRelationshipsResult listAssetRelationships(ListAssetRelationshipsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssetRelationships(request);
    }

    @SdkInternalApi
    final ListAssetRelationshipsResult executeListAssetRelationships(ListAssetRelationshipsRequest listAssetRelationshipsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssetRelationshipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssetRelationshipsRequest> request = null;
        Response<ListAssetRelationshipsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssetRelationshipsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssetRelationshipsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssetRelationships");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssetRelationshipsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssetRelationshipsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of asset summaries.
     * </p>
     * <p>
     * You can use this operation to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List assets based on a specific asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * List top-level assets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't use this operation to list all assets. To retrieve summaries for all of your assets, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_ListAssetModels.html">ListAssetModels</a>
     * to get all of your asset model IDs. Then, use ListAssets to get all assets for each asset model.
     * </p>
     * 
     * @param listAssetsRequest
     * @return Result of the ListAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAssetsResult listAssets(ListAssetsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssets(request);
    }

    @SdkInternalApi
    final ListAssetsResult executeListAssets(ListAssetsRequest listAssetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssetsRequest> request = null;
        Response<ListAssetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssetsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of associated assets.
     * </p>
     * <p>
     * You can use this operation to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List child assets associated to a parent asset by a hierarchy that you specify.
     * </p>
     * </li>
     * <li>
     * <p>
     * List an asset's parent asset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAssociatedAssetsRequest
     * @return Result of the ListAssociatedAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListAssociatedAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssociatedAssets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssociatedAssetsResult listAssociatedAssets(ListAssociatedAssetsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssociatedAssets(request);
    }

    @SdkInternalApi
    final ListAssociatedAssetsResult executeListAssociatedAssets(ListAssociatedAssetsRequest listAssociatedAssetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssociatedAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociatedAssetsRequest> request = null;
        Response<ListAssociatedAssetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociatedAssetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssociatedAssetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssociatedAssets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociatedAssetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssociatedAssetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of dashboards for an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param listDashboardsRequest
     * @return Result of the ListDashboards operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListDashboards" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDashboardsResult listDashboards(ListDashboardsRequest request) {
        request = beforeClientExecution(request);
        return executeListDashboards(request);
    }

    @SdkInternalApi
    final ListDashboardsResult executeListDashboards(ListDashboardsRequest listDashboardsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDashboardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDashboardsRequest> request = null;
        Response<ListDashboardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDashboardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDashboardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDashboards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDashboardsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDashboardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     * @return Result of the ListGateways operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListGateways" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGatewaysResult listGateways(ListGatewaysRequest request) {
        request = beforeClientExecution(request);
        return executeListGateways(request);
    }

    @SdkInternalApi
    final ListGatewaysResult executeListGateways(ListGatewaysRequest listGatewaysRequest) {

        ExecutionContext executionContext = createExecutionContext(listGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGatewaysRequest> request = null;
        Response<ListGatewaysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGatewaysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGatewaysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGateways");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "edge.";
                String resolvedHostPrefix = String.format("edge.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGatewaysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGatewaysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of AWS IoT SiteWise Monitor portals.
     * </p>
     * 
     * @param listPortalsRequest
     * @return Result of the ListPortals operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListPortals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListPortals" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPortalsResult listPortals(ListPortalsRequest request) {
        request = beforeClientExecution(request);
        return executeListPortals(request);
    }

    @SdkInternalApi
    final ListPortalsResult executeListPortals(ListPortalsRequest listPortalsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPortalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPortalsRequest> request = null;
        Response<ListPortalsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPortalsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPortalsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPortals");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPortalsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPortalsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of assets associated with an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param listProjectAssetsRequest
     * @return Result of the ListProjectAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListProjectAssets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListProjectAssetsResult listProjectAssets(ListProjectAssetsRequest request) {
        request = beforeClientExecution(request);
        return executeListProjectAssets(request);
    }

    @SdkInternalApi
    final ListProjectAssetsResult executeListProjectAssets(ListProjectAssetsRequest listProjectAssetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectAssetsRequest> request = null;
        Response<ListProjectAssetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectAssetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectAssetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProjectAssets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectAssetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProjectAssetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a paginated list of projects for an AWS IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProjectsResult listProjects(ListProjectsRequest request) {
        request = beforeClientExecution(request);
        return executeListProjects(request);
    }

    @SdkInternalApi
    final ListProjectsResult executeListProjects(ListProjectsRequest listProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectsRequest> request = null;
        Response<ListProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the list of tags for an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws UnauthorizedException
     *         You are not authorized.
     * @sample AWSIoTSiteWise.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
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
     * Sets the default encryption configuration for the AWS account. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/key-management.html">Key management</a> in the
     * <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param putDefaultEncryptionConfigurationRequest
     * @return Result of the PutDefaultEncryptionConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.PutDefaultEncryptionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutDefaultEncryptionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutDefaultEncryptionConfigurationResult putDefaultEncryptionConfiguration(PutDefaultEncryptionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutDefaultEncryptionConfiguration(request);
    }

    @SdkInternalApi
    final PutDefaultEncryptionConfigurationResult executePutDefaultEncryptionConfiguration(
            PutDefaultEncryptionConfigurationRequest putDefaultEncryptionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putDefaultEncryptionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDefaultEncryptionConfigurationRequest> request = null;
        Response<PutDefaultEncryptionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDefaultEncryptionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putDefaultEncryptionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDefaultEncryptionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDefaultEncryptionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutDefaultEncryptionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets logging options for AWS IoT SiteWise.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return Result of the PutLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSIoTSiteWise.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutLoggingOptionsResult putLoggingOptions(PutLoggingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executePutLoggingOptions(request);
    }

    @SdkInternalApi
    final PutLoggingOptionsResult executePutLoggingOptions(PutLoggingOptionsRequest putLoggingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(putLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLoggingOptionsRequest> request = null;
        Response<PutLoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLoggingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putLoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLoggingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutLoggingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutLoggingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to an AWS IoT SiteWise resource. If a tag already exists for the resource, this operation updates the
     * tag's value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws UnauthorizedException
     *         You are not authorized.
     * @throws TooManyTagsException
     *         You've reached the limit for the number of tags allowed for a resource. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag naming limits
     *         and requirements</a> in the <i>AWS General Reference</i>.
     * @sample AWSIoTSiteWise.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
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
     * Removes a tag from an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws UnauthorizedException
     *         You are not authorized.
     * @sample AWSIoTSiteWise.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
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
     * Updates an existing access policy that specifies an identity's access to an AWS IoT SiteWise Monitor portal or
     * project resource.
     * </p>
     * 
     * @param updateAccessPolicyRequest
     * @return Result of the UpdateAccessPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.UpdateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateAccessPolicyResult updateAccessPolicy(UpdateAccessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccessPolicy(request);
    }

    @SdkInternalApi
    final UpdateAccessPolicyResult executeUpdateAccessPolicy(UpdateAccessPolicyRequest updateAccessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccessPolicyRequest> request = null;
        Response<UpdateAccessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccessPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAccessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccessPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAccessPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an asset's name. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html">Updating assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param updateAssetRequest
     * @return Result of the UpdateAsset operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.UpdateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAssetResult updateAsset(UpdateAssetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAsset(request);
    }

    @SdkInternalApi
    final UpdateAssetResult executeUpdateAsset(UpdateAssetRequest updateAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssetRequest> request = null;
        Response<UpdateAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an asset model and all of the assets that were created from the model. Each asset created from the model
     * inherits the updated asset model's property and hierarchy definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html">Updating assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This operation overwrites the existing model with the provided model. To avoid deleting your asset model's
     * properties or hierarchies, you must include their IDs and definitions in the updated asset model payload. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html"
     * >DescribeAssetModel</a>.
     * </p>
     * <p>
     * If you remove a property from an asset model, AWS IoT SiteWise deletes all previous data for that property. If
     * you remove a hierarchy definition from an asset model, AWS IoT SiteWise disassociates every asset associated with
     * that hierarchy. You can't change the type or data type of an existing property.
     * </p>
     * </important>
     * 
     * @param updateAssetModelRequest
     * @return Result of the UpdateAssetModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.UpdateAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateAssetModelResult updateAssetModel(UpdateAssetModelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssetModel(request);
    }

    @SdkInternalApi
    final UpdateAssetModelResult executeUpdateAssetModel(UpdateAssetModelRequest updateAssetModelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssetModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssetModelRequest> request = null;
        Response<UpdateAssetModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssetModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAssetModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssetModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssetModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAssetModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an asset property's alias and notification state.
     * </p>
     * <important>
     * <p>
     * This operation overwrites the property's existing alias and notification state. To keep your existing property's
     * alias or notification state, you must include the existing values in the UpdateAssetProperty request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetProperty.html"
     * >DescribeAssetProperty</a>.
     * </p>
     * </important>
     * 
     * @param updateAssetPropertyRequest
     * @return Result of the UpdateAssetProperty operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.UpdateAssetProperty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetProperty"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAssetPropertyResult updateAssetProperty(UpdateAssetPropertyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssetProperty(request);
    }

    @SdkInternalApi
    final UpdateAssetPropertyResult executeUpdateAssetProperty(UpdateAssetPropertyRequest updateAssetPropertyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssetPropertyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssetPropertyRequest> request = null;
        Response<UpdateAssetPropertyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssetPropertyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAssetPropertyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssetProperty");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "model.";
                String resolvedHostPrefix = String.format("model.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssetPropertyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAssetPropertyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor dashboard.
     * </p>
     * 
     * @param updateDashboardRequest
     * @return Result of the UpdateDashboard operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.UpdateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDashboardResult updateDashboard(UpdateDashboardRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDashboard(request);
    }

    @SdkInternalApi
    final UpdateDashboardResult executeUpdateDashboard(UpdateDashboardRequest updateDashboardRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDashboardRequest> request = null;
        Response<UpdateDashboardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDashboardRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDashboardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDashboard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDashboardResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDashboardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a gateway's name.
     * </p>
     * 
     * @param updateGatewayRequest
     * @return Result of the UpdateGateway operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.UpdateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateGateway" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGatewayResult updateGateway(UpdateGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGateway(request);
    }

    @SdkInternalApi
    final UpdateGatewayResult executeUpdateGateway(UpdateGatewayRequest updateGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayRequest> request = null;
        Response<UpdateGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "edge.";
                String resolvedHostPrefix = String.format("edge.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a gateway capability configuration or defines a new capability configuration. Each gateway capability
     * defines data sources for a gateway. A capability configuration can contain multiple data source configurations.
     * If you define OPC-UA sources for a gateway in the AWS IoT SiteWise console, all of your OPC-UA sources are stored
     * in one capability configuration. To list all capability configurations for a gateway, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGateway.html">DescribeGateway</a>.
     * </p>
     * 
     * @param updateGatewayCapabilityConfigurationRequest
     * @return Result of the UpdateGatewayCapabilityConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.UpdateGatewayCapabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateGatewayCapabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGatewayCapabilityConfigurationResult updateGatewayCapabilityConfiguration(UpdateGatewayCapabilityConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGatewayCapabilityConfiguration(request);
    }

    @SdkInternalApi
    final UpdateGatewayCapabilityConfigurationResult executeUpdateGatewayCapabilityConfiguration(
            UpdateGatewayCapabilityConfigurationRequest updateGatewayCapabilityConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGatewayCapabilityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayCapabilityConfigurationRequest> request = null;
        Response<UpdateGatewayCapabilityConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayCapabilityConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateGatewayCapabilityConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGatewayCapabilityConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "edge.";
                String resolvedHostPrefix = String.format("edge.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGatewayCapabilityConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateGatewayCapabilityConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param updatePortalRequest
     * @return Result of the UpdatePortal operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.UpdatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdatePortal" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePortalResult updatePortal(UpdatePortalRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePortal(request);
    }

    @SdkInternalApi
    final UpdatePortalResult executeUpdatePortal(UpdatePortalRequest updatePortalRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePortalRequest> request = null;
        Response<UpdatePortalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePortalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePortalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePortal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePortalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePortalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateProjectResult updateProject(UpdateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProject(request);
    }

    @SdkInternalApi
    final UpdateProjectResult executeUpdateProject(UpdateProjectRequest updateProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectRequest> request = null;
        Response<UpdateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTSiteWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "monitor.";
                String resolvedHostPrefix = String.format("monitor.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

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
    public AWSIoTSiteWiseWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSIoTSiteWiseWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
