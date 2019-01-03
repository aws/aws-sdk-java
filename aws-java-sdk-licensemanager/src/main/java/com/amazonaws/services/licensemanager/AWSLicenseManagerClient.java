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
package com.amazonaws.services.licensemanager;

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

import com.amazonaws.services.licensemanager.AWSLicenseManagerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.licensemanager.model.*;
import com.amazonaws.services.licensemanager.model.transform.*;

/**
 * Client for accessing AWS License Manager. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname> AWS License Manager </fullname>
 * <p>
 * <i>This is the AWS License Manager API Reference.</i> It provides descriptions, syntax, and usage examples for each
 * of the actions and data types for License Manager. The topic for each action shows the Query API request parameters
 * and the XML response. You can also view the XML request elements in the WSDL.
 * </p>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLicenseManagerClient extends AmazonWebServiceClient implements AWSLicenseManager {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSLicenseManager.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "license-manager";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FailedDependencyException").withModeledClass(
                                    com.amazonaws.services.licensemanager.model.FailedDependencyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.licensemanager.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AuthorizationException").withModeledClass(
                                    com.amazonaws.services.licensemanager.model.AuthorizationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withModeledClass(
                                    com.amazonaws.services.licensemanager.model.InvalidParameterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceStateException").withModeledClass(
                                    com.amazonaws.services.licensemanager.model.InvalidResourceStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RateLimitExceededException").withModeledClass(
                                    com.amazonaws.services.licensemanager.model.RateLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FilterLimitExceededException").withModeledClass(
                                    com.amazonaws.services.licensemanager.model.FilterLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServerInternalException").withModeledClass(
                                    com.amazonaws.services.licensemanager.model.ServerInternalException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LicenseUsageException").withModeledClass(
                                    com.amazonaws.services.licensemanager.model.LicenseUsageException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withModeledClass(
                                    com.amazonaws.services.licensemanager.model.ResourceLimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.licensemanager.model.AWSLicenseManagerException.class));

    public static AWSLicenseManagerClientBuilder builder() {
        return AWSLicenseManagerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS License Manager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLicenseManagerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS License Manager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLicenseManagerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("license-manager.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/licensemanager/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/licensemanager/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new license configuration object. A license configuration is an abstraction of a customer license
     * agreement that can be consumed and enforced by License Manager. Components include specifications for the license
     * type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance,
     * Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the
     * number of licenses purchased and used.
     * </p>
     * 
     * @param createLicenseConfigurationRequest
     * @return Result of the CreateLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.CreateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLicenseConfigurationResult createLicenseConfiguration(CreateLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLicenseConfiguration(request);
    }

    @SdkInternalApi
    final CreateLicenseConfigurationResult executeCreateLicenseConfiguration(CreateLicenseConfigurationRequest createLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLicenseConfigurationRequest> request = null;
        Response<CreateLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLicenseConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing license configuration. This action fails if the configuration is in use.
     * </p>
     * 
     * @param deleteLicenseConfigurationRequest
     * @return Result of the DeleteLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.DeleteLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLicenseConfigurationResult deleteLicenseConfiguration(DeleteLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLicenseConfiguration(request);
    }

    @SdkInternalApi
    final DeleteLicenseConfigurationResult executeDeleteLicenseConfiguration(DeleteLicenseConfigurationRequest deleteLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLicenseConfigurationRequest> request = null;
        Response<DeleteLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLicenseConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a detailed description of a license configuration.
     * </p>
     * 
     * @param getLicenseConfigurationRequest
     * @return Result of the GetLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.GetLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLicenseConfigurationResult getLicenseConfiguration(GetLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetLicenseConfiguration(request);
    }

    @SdkInternalApi
    final GetLicenseConfigurationResult executeGetLicenseConfiguration(GetLicenseConfigurationRequest getLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLicenseConfigurationRequest> request = null;
        Response<GetLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLicenseConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection.
     * </p>
     * 
     * @param getServiceSettingsRequest
     * @return Result of the GetServiceSettings operation returned by the service.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.GetServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceSettingsResult getServiceSettings(GetServiceSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceSettings(request);
    }

    @SdkInternalApi
    final GetServiceSettingsResult executeGetServiceSettings(GetServiceSettingsRequest getServiceSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceSettingsRequest> request = null;
        Response<GetServiceSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resource associations for a license configuration. Resource associations need not consume licenses from
     * a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the
     * license rules). Use this operation to find all resources associated with a license configuration.
     * </p>
     * 
     * @param listAssociationsForLicenseConfigurationRequest
     * @return Result of the ListAssociationsForLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListAssociationsForLicenseConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListAssociationsForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssociationsForLicenseConfigurationResult listAssociationsForLicenseConfiguration(ListAssociationsForLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeListAssociationsForLicenseConfiguration(request);
    }

    @SdkInternalApi
    final ListAssociationsForLicenseConfigurationResult executeListAssociationsForLicenseConfiguration(
            ListAssociationsForLicenseConfigurationRequest listAssociationsForLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssociationsForLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociationsForLicenseConfigurationRequest> request = null;
        Response<ListAssociationsForLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociationsForLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssociationsForLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssociationsForLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociationsForLicenseConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAssociationsForLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists license configuration objects for an account, each containing the name, description, license type, and
     * other license terms modeled from a license agreement.
     * </p>
     * 
     * @param listLicenseConfigurationsRequest
     * @return Result of the ListLicenseConfigurations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListLicenseConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLicenseConfigurationsResult listLicenseConfigurations(ListLicenseConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListLicenseConfigurations(request);
    }

    @SdkInternalApi
    final ListLicenseConfigurationsResult executeListLicenseConfigurations(ListLicenseConfigurationsRequest listLicenseConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLicenseConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLicenseConfigurationsRequest> request = null;
        Response<ListLicenseConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLicenseConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listLicenseConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLicenseConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLicenseConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListLicenseConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the license configuration for a resource.
     * </p>
     * 
     * @param listLicenseSpecificationsForResourceRequest
     * @return Result of the ListLicenseSpecificationsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLicenseSpecificationsForResourceResult listLicenseSpecificationsForResource(ListLicenseSpecificationsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListLicenseSpecificationsForResource(request);
    }

    @SdkInternalApi
    final ListLicenseSpecificationsForResourceResult executeListLicenseSpecificationsForResource(
            ListLicenseSpecificationsForResourceRequest listLicenseSpecificationsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listLicenseSpecificationsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLicenseSpecificationsForResourceRequest> request = null;
        Response<ListLicenseSpecificationsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLicenseSpecificationsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listLicenseSpecificationsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLicenseSpecificationsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLicenseSpecificationsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListLicenseSpecificationsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a detailed list of resources.
     * </p>
     * 
     * @param listResourceInventoryRequest
     * @return Result of the ListResourceInventory operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws FailedDependencyException
     *         A dependency required to run the API is missing.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListResourceInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListResourceInventory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResourceInventoryResult listResourceInventory(ListResourceInventoryRequest request) {
        request = beforeClientExecution(request);
        return executeListResourceInventory(request);
    }

    @SdkInternalApi
    final ListResourceInventoryResult executeListResourceInventory(ListResourceInventoryRequest listResourceInventoryRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourceInventoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceInventoryRequest> request = null;
        Response<ListResourceInventoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceInventoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourceInventoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourceInventory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourceInventoryResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListResourceInventoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists tags attached to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
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
     * Lists all license usage records for a license configuration, displaying license consumption details by resource
     * at a selected point in time. Use this action to audit the current license consumption for any license inventory
     * and configuration.
     * </p>
     * 
     * @param listUsageForLicenseConfigurationRequest
     * @return Result of the ListUsageForLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListUsageForLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListUsageForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListUsageForLicenseConfigurationResult listUsageForLicenseConfiguration(ListUsageForLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeListUsageForLicenseConfiguration(request);
    }

    @SdkInternalApi
    final ListUsageForLicenseConfigurationResult executeListUsageForLicenseConfiguration(
            ListUsageForLicenseConfigurationRequest listUsageForLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(listUsageForLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsageForLicenseConfigurationRequest> request = null;
        Response<ListUsageForLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsageForLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listUsageForLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsageForLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsageForLicenseConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListUsageForLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attach one of more tags to any resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
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
     * Remove tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
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
     * Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of
     * a customer license agreement that can be consumed and enforced by License Manager. Components include
     * specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host
     * affinity (how long a VM is associated with a host), the number of licenses purchased and used.
     * </p>
     * 
     * @param updateLicenseConfigurationRequest
     * @return Result of the UpdateLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UpdateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLicenseConfigurationResult updateLicenseConfiguration(UpdateLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLicenseConfiguration(request);
    }

    @SdkInternalApi
    final UpdateLicenseConfigurationResult executeUpdateLicenseConfiguration(UpdateLicenseConfigurationRequest updateLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLicenseConfigurationRequest> request = null;
        Response<UpdateLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLicenseConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or removes license configurations for a specified AWS resource. This operation currently supports updating
     * the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are
     * not managed from this operation as those resources send the license configurations directly to a resource
     * creation operation, such as <code>RunInstances</code>.
     * </p>
     * 
     * @param updateLicenseSpecificationsForResourceRequest
     * @return Result of the UpdateLicenseSpecificationsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         License Manager cannot allocate a license to a resource because of its state. </p>
     *         <p>
     *         For example, you cannot allocate a license to an instance in the process of shutting down.
     * @throws LicenseUsageException
     *         You do not have enough licenses available to support a new resource launch.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UpdateLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLicenseSpecificationsForResourceResult updateLicenseSpecificationsForResource(UpdateLicenseSpecificationsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLicenseSpecificationsForResource(request);
    }

    @SdkInternalApi
    final UpdateLicenseSpecificationsForResourceResult executeUpdateLicenseSpecificationsForResource(
            UpdateLicenseSpecificationsForResourceRequest updateLicenseSpecificationsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLicenseSpecificationsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLicenseSpecificationsForResourceRequest> request = null;
        Response<UpdateLicenseSpecificationsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLicenseSpecificationsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLicenseSpecificationsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLicenseSpecificationsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLicenseSpecificationsForResourceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateLicenseSpecificationsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates License Manager service settings.
     * </p>
     * 
     * @param updateServiceSettingsRequest
     * @return Result of the UpdateServiceSettings operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UpdateServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServiceSettingsResult updateServiceSettings(UpdateServiceSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceSettings(request);
    }

    @SdkInternalApi
    final UpdateServiceSettingsResult executeUpdateServiceSettings(UpdateServiceSettingsRequest updateServiceSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceSettingsRequest> request = null;
        Response<UpdateServiceSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateServiceSettingsResultJsonUnmarshaller());
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
