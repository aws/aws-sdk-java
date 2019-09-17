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
package com.amazonaws.services.servicequotas;

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

import com.amazonaws.services.servicequotas.AWSServiceQuotasClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.servicequotas.model.*;
import com.amazonaws.services.servicequotas.model.transform.*;

/**
 * Client for accessing Service Quotas. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Service Quotas is a web service that you can use to manage many of your AWS service quotas. Quotas, also referred to
 * as limits, are the maximum values for a resource, item, or operation. This guide provide descriptions of the Service
 * Quotas actions that you can call from an API. For the Service Quotas user guide, which explains how to use Service
 * Quotas from the console, see <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">What is
 * Service Quotas</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for programming languages and platforms (Java, Ruby,
 * .NET, iOS, Android, etc...,). The SDKs provide a convenient way to create programmatic access to Service Quotas and
 * AWS. For information about the AWS SDKs, including how to download and install them, see the <a
 * href="https://docs.aws.amazon.com/aws.amazon.com/tools">Tools for Amazon Web Services</a> page.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSServiceQuotasClient extends AmazonWebServiceClient implements AWSServiceQuotas {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSServiceQuotas.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "servicequotas";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.InvalidResourceStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IllegalArgumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.IllegalArgumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.ServiceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationNotInAllFeaturesModeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.OrganizationNotInAllFeaturesModeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependencyAccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.DependencyAccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchResourceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.NoSuchResourceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AWSServiceAccessNotEnabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.AWSServiceAccessNotEnabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("QuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.QuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoAvailableOrganizationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.NoAvailableOrganizationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TemplatesNotAvailableInRegionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.TemplatesNotAvailableInRegionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.InvalidPaginationTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaTemplateNotInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.servicequotas.model.transform.ServiceQuotaTemplateNotInUseExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.servicequotas.model.AWSServiceQuotasException.class));

    public static AWSServiceQuotasClientBuilder builder() {
        return AWSServiceQuotasClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Service Quotas using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSServiceQuotasClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Service Quotas using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSServiceQuotasClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("servicequotas.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/servicequotas/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/servicequotas/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates the Service Quotas template with your organization so that when new accounts are created in your
     * organization, the template submits increase requests for the specified service quotas. Use the Service Quotas
     * template to request an increase for any adjustable quota value. After you define the Service Quotas template, use
     * this operation to associate, or enable, the template.
     * </p>
     * 
     * @param associateServiceQuotaTemplateRequest
     * @return Result of the AssociateServiceQuotaTemplate operation returned by the service.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws OrganizationNotInAllFeaturesModeException
     *         The organization that your account belongs to, is not in All Features mode. To enable all features mode,
     *         see <a href="https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnableAllFeatures.html">
     *         EnableAllFeatures</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.AssociateServiceQuotaTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/AssociateServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateServiceQuotaTemplateResult associateServiceQuotaTemplate(AssociateServiceQuotaTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateServiceQuotaTemplate(request);
    }

    @SdkInternalApi
    final AssociateServiceQuotaTemplateResult executeAssociateServiceQuotaTemplate(AssociateServiceQuotaTemplateRequest associateServiceQuotaTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(associateServiceQuotaTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateServiceQuotaTemplateRequest> request = null;
        Response<AssociateServiceQuotaTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateServiceQuotaTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateServiceQuotaTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateServiceQuotaTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateServiceQuotaTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateServiceQuotaTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a service quota increase request from the Service Quotas template.
     * </p>
     * 
     * @param deleteServiceQuotaIncreaseRequestFromTemplateRequest
     * @return Result of the DeleteServiceQuotaIncreaseRequestFromTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.DeleteServiceQuotaIncreaseRequestFromTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/DeleteServiceQuotaIncreaseRequestFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteServiceQuotaIncreaseRequestFromTemplateResult deleteServiceQuotaIncreaseRequestFromTemplate(
            DeleteServiceQuotaIncreaseRequestFromTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServiceQuotaIncreaseRequestFromTemplate(request);
    }

    @SdkInternalApi
    final DeleteServiceQuotaIncreaseRequestFromTemplateResult executeDeleteServiceQuotaIncreaseRequestFromTemplate(
            DeleteServiceQuotaIncreaseRequestFromTemplateRequest deleteServiceQuotaIncreaseRequestFromTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceQuotaIncreaseRequestFromTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceQuotaIncreaseRequestFromTemplateRequest> request = null;
        Response<DeleteServiceQuotaIncreaseRequestFromTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceQuotaIncreaseRequestFromTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteServiceQuotaIncreaseRequestFromTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServiceQuotaIncreaseRequestFromTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceQuotaIncreaseRequestFromTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteServiceQuotaIncreaseRequestFromTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the Service Quotas template. Once the template is disabled, it does not request quota increases for new
     * accounts in your organization. Disabling the quota template does not apply the quota increase requests from the
     * template.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To enable the quota template, call <a>AssociateServiceQuotaTemplate</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete a specific service quota from the template, use <a>DeleteServiceQuotaIncreaseRequestFromTemplate</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociateServiceQuotaTemplateRequest
     * @return Result of the DisassociateServiceQuotaTemplate operation returned by the service.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceQuotaTemplateNotInUseException
     *         The quota request template is not associated with your organization. </p>
     *         <p>
     *         To use the template, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.DisassociateServiceQuotaTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/DisassociateServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateServiceQuotaTemplateResult disassociateServiceQuotaTemplate(DisassociateServiceQuotaTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateServiceQuotaTemplate(request);
    }

    @SdkInternalApi
    final DisassociateServiceQuotaTemplateResult executeDisassociateServiceQuotaTemplate(
            DisassociateServiceQuotaTemplateRequest disassociateServiceQuotaTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateServiceQuotaTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateServiceQuotaTemplateRequest> request = null;
        Response<DisassociateServiceQuotaTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateServiceQuotaTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateServiceQuotaTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateServiceQuotaTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateServiceQuotaTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateServiceQuotaTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the default service quotas values. The Value returned for each quota is the AWS default value, even if
     * the quotas have been increased..
     * </p>
     * 
     * @param getAWSDefaultServiceQuotaRequest
     * @return Result of the GetAWSDefaultServiceQuota operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.GetAWSDefaultServiceQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetAWSDefaultServiceQuota"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAWSDefaultServiceQuotaResult getAWSDefaultServiceQuota(GetAWSDefaultServiceQuotaRequest request) {
        request = beforeClientExecution(request);
        return executeGetAWSDefaultServiceQuota(request);
    }

    @SdkInternalApi
    final GetAWSDefaultServiceQuotaResult executeGetAWSDefaultServiceQuota(GetAWSDefaultServiceQuotaRequest getAWSDefaultServiceQuotaRequest) {

        ExecutionContext executionContext = createExecutionContext(getAWSDefaultServiceQuotaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAWSDefaultServiceQuotaRequest> request = null;
        Response<GetAWSDefaultServiceQuotaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAWSDefaultServiceQuotaRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAWSDefaultServiceQuotaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAWSDefaultServiceQuota");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAWSDefaultServiceQuotaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAWSDefaultServiceQuotaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the <code>ServiceQuotaTemplateAssociationStatus</code> value from the service. Use this action to
     * determine if the Service Quota template is associated, or enabled.
     * </p>
     * 
     * @param getAssociationForServiceQuotaTemplateRequest
     * @return Result of the GetAssociationForServiceQuotaTemplate operation returned by the service.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceQuotaTemplateNotInUseException
     *         The quota request template is not associated with your organization. </p>
     *         <p>
     *         To use the template, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.GetAssociationForServiceQuotaTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetAssociationForServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAssociationForServiceQuotaTemplateResult getAssociationForServiceQuotaTemplate(GetAssociationForServiceQuotaTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssociationForServiceQuotaTemplate(request);
    }

    @SdkInternalApi
    final GetAssociationForServiceQuotaTemplateResult executeGetAssociationForServiceQuotaTemplate(
            GetAssociationForServiceQuotaTemplateRequest getAssociationForServiceQuotaTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssociationForServiceQuotaTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssociationForServiceQuotaTemplateRequest> request = null;
        Response<GetAssociationForServiceQuotaTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssociationForServiceQuotaTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAssociationForServiceQuotaTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssociationForServiceQuotaTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssociationForServiceQuotaTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAssociationForServiceQuotaTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details for a particular increase request.
     * </p>
     * 
     * @param getRequestedServiceQuotaChangeRequest
     * @return Result of the GetRequestedServiceQuotaChange operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.GetRequestedServiceQuotaChange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetRequestedServiceQuotaChange"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRequestedServiceQuotaChangeResult getRequestedServiceQuotaChange(GetRequestedServiceQuotaChangeRequest request) {
        request = beforeClientExecution(request);
        return executeGetRequestedServiceQuotaChange(request);
    }

    @SdkInternalApi
    final GetRequestedServiceQuotaChangeResult executeGetRequestedServiceQuotaChange(GetRequestedServiceQuotaChangeRequest getRequestedServiceQuotaChangeRequest) {

        ExecutionContext executionContext = createExecutionContext(getRequestedServiceQuotaChangeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRequestedServiceQuotaChangeRequest> request = null;
        Response<GetRequestedServiceQuotaChangeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRequestedServiceQuotaChangeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRequestedServiceQuotaChangeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRequestedServiceQuotaChange");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRequestedServiceQuotaChangeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRequestedServiceQuotaChangeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details for the specified service quota. This operation provides a different Value than the
     * <code>GetAWSDefaultServiceQuota</code> operation. This operation returns the applied value for each quota.
     * <code>GetAWSDefaultServiceQuota</code> returns the default AWS value for each quota.
     * </p>
     * 
     * @param getServiceQuotaRequest
     * @return Result of the GetServiceQuota operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.GetServiceQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuota" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetServiceQuotaResult getServiceQuota(GetServiceQuotaRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceQuota(request);
    }

    @SdkInternalApi
    final GetServiceQuotaResult executeGetServiceQuota(GetServiceQuotaRequest getServiceQuotaRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceQuotaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceQuotaRequest> request = null;
        Response<GetServiceQuotaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceQuotaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceQuotaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceQuota");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceQuotaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceQuotaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of the service quota increase request in your template.
     * </p>
     * 
     * @param getServiceQuotaIncreaseRequestFromTemplateRequest
     * @return Result of the GetServiceQuotaIncreaseRequestFromTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.GetServiceQuotaIncreaseRequestFromTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuotaIncreaseRequestFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceQuotaIncreaseRequestFromTemplateResult getServiceQuotaIncreaseRequestFromTemplate(GetServiceQuotaIncreaseRequestFromTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceQuotaIncreaseRequestFromTemplate(request);
    }

    @SdkInternalApi
    final GetServiceQuotaIncreaseRequestFromTemplateResult executeGetServiceQuotaIncreaseRequestFromTemplate(
            GetServiceQuotaIncreaseRequestFromTemplateRequest getServiceQuotaIncreaseRequestFromTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceQuotaIncreaseRequestFromTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceQuotaIncreaseRequestFromTemplateRequest> request = null;
        Response<GetServiceQuotaIncreaseRequestFromTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceQuotaIncreaseRequestFromTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getServiceQuotaIncreaseRequestFromTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceQuotaIncreaseRequestFromTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceQuotaIncreaseRequestFromTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetServiceQuotaIncreaseRequestFromTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all default service quotas for the specified AWS service or all AWS services. ListAWSDefaultServiceQuotas
     * is similar to <a>ListServiceQuotas</a> except for the Value object. The Value object returned by
     * <code>ListAWSDefaultServiceQuotas</code> is the default value assigned by AWS. This request returns a list of all
     * service quotas for the specified service. The listing of each you'll see the default values are the values that
     * AWS provides for the quotas.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations.
     * These operations can return an unexpected list of results, even when there are more results available. When this
     * happens, the <code>NextToken</code> response parameter contains a value to pass the next call to the same API to
     * request the next part of the list.
     * </p>
     * </note>
     * 
     * @param listAWSDefaultServiceQuotasRequest
     * @return Result of the ListAWSDefaultServiceQuotas operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidPaginationTokenException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.ListAWSDefaultServiceQuotas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListAWSDefaultServiceQuotas"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAWSDefaultServiceQuotasResult listAWSDefaultServiceQuotas(ListAWSDefaultServiceQuotasRequest request) {
        request = beforeClientExecution(request);
        return executeListAWSDefaultServiceQuotas(request);
    }

    @SdkInternalApi
    final ListAWSDefaultServiceQuotasResult executeListAWSDefaultServiceQuotas(ListAWSDefaultServiceQuotasRequest listAWSDefaultServiceQuotasRequest) {

        ExecutionContext executionContext = createExecutionContext(listAWSDefaultServiceQuotasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAWSDefaultServiceQuotasRequest> request = null;
        Response<ListAWSDefaultServiceQuotasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAWSDefaultServiceQuotasRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAWSDefaultServiceQuotasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAWSDefaultServiceQuotas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAWSDefaultServiceQuotasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAWSDefaultServiceQuotasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests a list of the changes to quotas for a service.
     * </p>
     * 
     * @param listRequestedServiceQuotaChangeHistoryRequest
     * @return Result of the ListRequestedServiceQuotaChangeHistory operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidPaginationTokenException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.ListRequestedServiceQuotaChangeHistory
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRequestedServiceQuotaChangeHistoryResult listRequestedServiceQuotaChangeHistory(ListRequestedServiceQuotaChangeHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeListRequestedServiceQuotaChangeHistory(request);
    }

    @SdkInternalApi
    final ListRequestedServiceQuotaChangeHistoryResult executeListRequestedServiceQuotaChangeHistory(
            ListRequestedServiceQuotaChangeHistoryRequest listRequestedServiceQuotaChangeHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(listRequestedServiceQuotaChangeHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRequestedServiceQuotaChangeHistoryRequest> request = null;
        Response<ListRequestedServiceQuotaChangeHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRequestedServiceQuotaChangeHistoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRequestedServiceQuotaChangeHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRequestedServiceQuotaChangeHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRequestedServiceQuotaChangeHistoryResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListRequestedServiceQuotaChangeHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests a list of the changes to specific service quotas. This command provides additional granularity over the
     * <code>ListRequestedServiceQuotaChangeHistory</code> command. Once a quota change request has reached
     * <code>CASE_CLOSED, APPROVED,</code> or <code>DENIED</code>, the history has been kept for 90 days.
     * </p>
     * 
     * @param listRequestedServiceQuotaChangeHistoryByQuotaRequest
     * @return Result of the ListRequestedServiceQuotaChangeHistoryByQuota operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidPaginationTokenException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.ListRequestedServiceQuotaChangeHistoryByQuota
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistoryByQuota"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRequestedServiceQuotaChangeHistoryByQuotaResult listRequestedServiceQuotaChangeHistoryByQuota(
            ListRequestedServiceQuotaChangeHistoryByQuotaRequest request) {
        request = beforeClientExecution(request);
        return executeListRequestedServiceQuotaChangeHistoryByQuota(request);
    }

    @SdkInternalApi
    final ListRequestedServiceQuotaChangeHistoryByQuotaResult executeListRequestedServiceQuotaChangeHistoryByQuota(
            ListRequestedServiceQuotaChangeHistoryByQuotaRequest listRequestedServiceQuotaChangeHistoryByQuotaRequest) {

        ExecutionContext executionContext = createExecutionContext(listRequestedServiceQuotaChangeHistoryByQuotaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRequestedServiceQuotaChangeHistoryByQuotaRequest> request = null;
        Response<ListRequestedServiceQuotaChangeHistoryByQuotaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRequestedServiceQuotaChangeHistoryByQuotaRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRequestedServiceQuotaChangeHistoryByQuotaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRequestedServiceQuotaChangeHistoryByQuota");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRequestedServiceQuotaChangeHistoryByQuotaResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListRequestedServiceQuotaChangeHistoryByQuotaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the quota increase requests in the template.
     * </p>
     * 
     * @param listServiceQuotaIncreaseRequestsInTemplateRequest
     * @return Result of the ListServiceQuotaIncreaseRequestsInTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.ListServiceQuotaIncreaseRequestsInTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServiceQuotaIncreaseRequestsInTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceQuotaIncreaseRequestsInTemplateResult listServiceQuotaIncreaseRequestsInTemplate(ListServiceQuotaIncreaseRequestsInTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceQuotaIncreaseRequestsInTemplate(request);
    }

    @SdkInternalApi
    final ListServiceQuotaIncreaseRequestsInTemplateResult executeListServiceQuotaIncreaseRequestsInTemplate(
            ListServiceQuotaIncreaseRequestsInTemplateRequest listServiceQuotaIncreaseRequestsInTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceQuotaIncreaseRequestsInTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceQuotaIncreaseRequestsInTemplateRequest> request = null;
        Response<ListServiceQuotaIncreaseRequestsInTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceQuotaIncreaseRequestsInTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listServiceQuotaIncreaseRequestsInTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceQuotaIncreaseRequestsInTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceQuotaIncreaseRequestsInTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListServiceQuotaIncreaseRequestsInTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all service quotas for the specified AWS service. This request returns a list of the service quotas for the
     * specified service. you'll see the default values are the values that AWS provides for the quotas.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations.
     * These operations can return an unexpected list of results, even when there are more results available. When this
     * happens, the <code>NextToken</code> response parameter contains a value to pass the next call to the same API to
     * request the next part of the list.
     * </p>
     * </note>
     * 
     * @param listServiceQuotasRequest
     * @return Result of the ListServiceQuotas operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidPaginationTokenException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.ListServiceQuotas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServiceQuotas"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceQuotasResult listServiceQuotas(ListServiceQuotasRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceQuotas(request);
    }

    @SdkInternalApi
    final ListServiceQuotasResult executeListServiceQuotas(ListServiceQuotasRequest listServiceQuotasRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceQuotasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceQuotasRequest> request = null;
        Response<ListServiceQuotasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceQuotasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServiceQuotasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceQuotas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceQuotasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServiceQuotasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the AWS services available in Service Quotas. Not all AWS services are available in Service Quotas. To list
     * the see the list of the service quotas for a specific service, use <a>ListServiceQuotas</a>.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidPaginationTokenException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServices" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
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
     * Defines and adds a quota to the service quota template. To add a quota to the template, you must provide the
     * <code>ServiceCode</code>, <code>QuotaCode</code>, <code>AwsRegion</code>, and <code>DesiredValue</code>. Once you
     * add a quota to the template, use <a>ListServiceQuotaIncreaseRequestsInTemplate</a> to see the list of quotas in
     * the template.
     * </p>
     * 
     * @param putServiceQuotaIncreaseRequestIntoTemplateRequest
     * @return Result of the PutServiceQuotaIncreaseRequestIntoTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws QuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.PutServiceQuotaIncreaseRequestIntoTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/PutServiceQuotaIncreaseRequestIntoTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutServiceQuotaIncreaseRequestIntoTemplateResult putServiceQuotaIncreaseRequestIntoTemplate(PutServiceQuotaIncreaseRequestIntoTemplateRequest request) {
        request = beforeClientExecution(request);
        return executePutServiceQuotaIncreaseRequestIntoTemplate(request);
    }

    @SdkInternalApi
    final PutServiceQuotaIncreaseRequestIntoTemplateResult executePutServiceQuotaIncreaseRequestIntoTemplate(
            PutServiceQuotaIncreaseRequestIntoTemplateRequest putServiceQuotaIncreaseRequestIntoTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(putServiceQuotaIncreaseRequestIntoTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutServiceQuotaIncreaseRequestIntoTemplateRequest> request = null;
        Response<PutServiceQuotaIncreaseRequestIntoTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutServiceQuotaIncreaseRequestIntoTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putServiceQuotaIncreaseRequestIntoTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutServiceQuotaIncreaseRequestIntoTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutServiceQuotaIncreaseRequestIntoTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutServiceQuotaIncreaseRequestIntoTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of a service quota increase request. The response to this command provides the details in
     * the <a>RequestedServiceQuotaChange</a> object.
     * </p>
     * 
     * @param requestServiceQuotaIncreaseRequest
     * @return Result of the RequestServiceQuotaIncrease operation returned by the service.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws QuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidResourceStateException
     *         Invalid input was provided for the .
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.RequestServiceQuotaIncrease
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/RequestServiceQuotaIncrease"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RequestServiceQuotaIncreaseResult requestServiceQuotaIncrease(RequestServiceQuotaIncreaseRequest request) {
        request = beforeClientExecution(request);
        return executeRequestServiceQuotaIncrease(request);
    }

    @SdkInternalApi
    final RequestServiceQuotaIncreaseResult executeRequestServiceQuotaIncrease(RequestServiceQuotaIncreaseRequest requestServiceQuotaIncreaseRequest) {

        ExecutionContext executionContext = createExecutionContext(requestServiceQuotaIncreaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestServiceQuotaIncreaseRequest> request = null;
        Response<RequestServiceQuotaIncreaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RequestServiceQuotaIncreaseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(requestServiceQuotaIncreaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Quotas");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RequestServiceQuotaIncrease");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RequestServiceQuotaIncreaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RequestServiceQuotaIncreaseResultJsonUnmarshaller());
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
