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
package com.amazonaws.services.pricing;

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

import com.amazonaws.services.pricing.AWSPricingClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.pricing.model.*;
import com.amazonaws.services.pricing.model.transform.*;

/**
 * Client for accessing AWS Pricing. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * AWS Price List Service API (AWS Price List Service) is a centralized and convenient way to programmatically query
 * Amazon Web Services for services, products, and pricing information. The AWS Price List Service uses standardized
 * product attributes such as <code>Location</code>, <code>Storage Class</code>, and <code>Operating System</code>, and
 * provides prices at the SKU level. You can use the AWS Price List Service to build cost control and scenario planning
 * tools, reconcile billing data, forecast future spend for budgeting purposes, and provide cost benefit analysis that
 * compare your internal workloads with AWS.
 * </p>
 * <p>
 * Use <code>GetServices</code> without a service code to retrieve the service codes for all AWS services, then
 * <code>GetServices</code> with a service code to retreive the attribute names for that service. After you have the
 * service code and attribute names, you can use <code>GetAttributeValues</code> to see what values are available for an
 * attribute. With the service code and an attribute name and value, you can use <code>GetProducts</code> to find
 * specific products that you're interested in, such as an <code>AmazonEC2</code> instance, with a
 * <code>Provisioned IOPS</code> <code>volumeType</code>.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * AWS Price List Service API provides the following two endpoints:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://api.pricing.us-east-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * https://api.pricing.ap-south-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPricingClient extends AmazonWebServiceClient implements AWSPricing {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSPricing.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "pricing";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.pricing.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalErrorException").withModeledClass(
                                    com.amazonaws.services.pricing.model.InternalErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.pricing.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.pricing.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExpiredNextTokenException").withModeledClass(
                                    com.amazonaws.services.pricing.model.ExpiredNextTokenException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.pricing.model.AWSPricingException.class));

    public static AWSPricingClientBuilder builder() {
        return AWSPricingClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Pricing using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSPricingClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Pricing using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSPricingClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("api.pricing.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/pricing/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/pricing/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code
     * to get the service codes for all services. Use it with a service code, such as <code>AmazonEC2</code>, to get
     * information specific to that service, such as the attribute names available for that service. For example, some
     * of the attribute names available for EC2 are <code>volumeType</code>, <code>maxIopsVolume</code>,
     * <code>operation</code>, <code>locationType</code>, and <code>instanceCapacity10xlarge</code>.
     * </p>
     * 
     * @param describeServicesRequest
     * @return Result of the DescribeServices operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws NotFoundException
     *         The requested resource can't be found.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws ExpiredNextTokenException
     *         The pagination token expired. Try again without a pagination token.
     * @sample AWSPricing.DescribeServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/DescribeServices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeServicesResult describeServices(DescribeServicesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServices(request);
    }

    @SdkInternalApi
    final DescribeServicesResult executeDescribeServices(DescribeServicesRequest describeServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServicesRequest> request = null;
        Response<DescribeServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pricing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a
     * list of available attributes, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/reading-an-offer.html#pps-defs">Offer File
     * Definitions</a> in the <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-what-is.html">AWS Billing and Cost
     * Management User Guide</a>.
     * </p>
     * 
     * @param getAttributeValuesRequest
     * @return Result of the GetAttributeValues operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws NotFoundException
     *         The requested resource can't be found.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws ExpiredNextTokenException
     *         The pagination token expired. Try again without a pagination token.
     * @sample AWSPricing.GetAttributeValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetAttributeValues" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAttributeValuesResult getAttributeValues(GetAttributeValuesRequest request) {
        request = beforeClientExecution(request);
        return executeGetAttributeValues(request);
    }

    @SdkInternalApi
    final GetAttributeValuesResult executeGetAttributeValues(GetAttributeValuesRequest getAttributeValuesRequest) {

        ExecutionContext executionContext = createExecutionContext(getAttributeValuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAttributeValuesRequest> request = null;
        Response<GetAttributeValuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAttributeValuesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAttributeValuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pricing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAttributeValues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAttributeValuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAttributeValuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all products that match the filter criteria.
     * </p>
     * 
     * @param getProductsRequest
     * @return Result of the GetProducts operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws NotFoundException
     *         The requested resource can't be found.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws ExpiredNextTokenException
     *         The pagination token expired. Try again without a pagination token.
     * @sample AWSPricing.GetProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetProducts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetProductsResult getProducts(GetProductsRequest request) {
        request = beforeClientExecution(request);
        return executeGetProducts(request);
    }

    @SdkInternalApi
    final GetProductsResult executeGetProducts(GetProductsRequest getProductsRequest) {

        ExecutionContext executionContext = createExecutionContext(getProductsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProductsRequest> request = null;
        Response<GetProductsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProductsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProductsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pricing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProducts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProductsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProductsResultJsonUnmarshaller());
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
