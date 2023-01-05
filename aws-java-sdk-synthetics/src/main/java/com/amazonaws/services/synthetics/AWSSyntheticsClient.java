/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.synthetics;

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

import com.amazonaws.services.synthetics.AWSSyntheticsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.services.synthetics.model.transform.*;

/**
 * Client for accessing Synthetics. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon CloudWatch Synthetics</fullname>
 * <p>
 * You can use Amazon CloudWatch Synthetics to continually monitor your services. You can create and manage
 * <i>canaries</i>, which are modular, lightweight scripts that monitor your endpoints and APIs from the outside-in. You
 * can set up your canaries to run 24 hours a day, once per minute. The canaries help you check the availability and
 * latency of your web services and troubleshoot anomalies by investigating load time data, screenshots of the UI, logs,
 * and metrics. The canaries seamlessly integrate with CloudWatch ServiceLens to help you trace the causes of impacted
 * nodes in your applications. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ServiceLens.html">Using ServiceLens to Monitor
 * the Health of Your Applications</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 * <p>
 * Before you create and manage canaries, be aware of the security considerations. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
 * Considerations for Synthetics Canaries</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSyntheticsClient extends AmazonWebServiceClient implements AWSSynthetics {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSynthetics.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "synthetics";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.synthetics.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.synthetics.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.synthetics.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.synthetics.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.synthetics.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestEntityTooLargeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.synthetics.model.transform.RequestEntityTooLargeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.synthetics.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.synthetics.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.synthetics.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.synthetics.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.synthetics.model.AWSSyntheticsException.class));

    public static AWSSyntheticsClientBuilder builder() {
        return AWSSyntheticsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Synthetics using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSyntheticsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Synthetics using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSyntheticsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("synthetics.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/synthetics/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/synthetics/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a canary with a group. Using groups can help you with managing and automating your canaries, and you
     * can also view aggregated run results and statistics for all canaries in a group.
     * </p>
     * <p>
     * You must run this operation in the Region where the canary exists.
     * </p>
     * 
     * @param associateResourceRequest
     * @return Result of the AssociateResource operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws ServiceQuotaExceededException
     *         The request exceeded a service quota value.
     * @sample AWSSynthetics.AssociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/AssociateResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateResourceResult associateResource(AssociateResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateResource(request);
    }

    @SdkInternalApi
    final AssociateResourceResult executeAssociateResource(AssociateResourceRequest associateResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(associateResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateResourceRequest> request = null;
        Response<AssociateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a canary. Canaries are scripts that monitor your endpoints and APIs from the outside-in. Canaries help
     * you check the availability and latency of your web services and troubleshoot anomalies by investigating load time
     * data, screenshots of the UI, logs, and metrics. You can set up a canary to run continuously or just once.
     * </p>
     * <p>
     * Do not use <code>CreateCanary</code> to modify an existing canary. Use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_UpdateCanary.html">UpdateCanary</a>
     * instead.
     * </p>
     * <p>
     * To create canaries, you must have the <code>CloudWatchSyntheticsFullAccess</code> policy. If you are creating a
     * new IAM role for the canary, you also need the <code>iam:CreateRole</code>, <code>iam:CreatePolicy</code> and
     * <code>iam:AttachRolePolicy</code> permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Roles"
     * >Necessary Roles and Permissions</a>.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names. The canary name makes up part of the
     * Amazon Resource Name (ARN) for the canary, and the ARN is included in outbound calls over the internet. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
     * Considerations for Synthetics Canaries</a>.
     * </p>
     * 
     * @param createCanaryRequest
     * @return Result of the CreateCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws RequestEntityTooLargeException
     *         One of the input resources is larger than is allowed.
     * @sample AWSSynthetics.CreateCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CreateCanary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateCanaryResult createCanary(CreateCanaryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCanary(request);
    }

    @SdkInternalApi
    final CreateCanaryResult executeCreateCanary(CreateCanaryRequest createCanaryRequest) {

        ExecutionContext executionContext = createExecutionContext(createCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCanaryRequest> request = null;
        Response<CreateCanaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCanaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCanaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCanary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCanaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCanaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a group which you can use to associate canaries with each other, including cross-Region canaries. Using
     * groups can help you with managing and automating your canaries, and you can also view aggregated run results and
     * statistics for all canaries in a group.
     * </p>
     * <p>
     * Groups are global resources. When you create a group, it is replicated across Amazon Web Services Regions, and
     * you can view it and add canaries to it from any Region. Although the group ARN format reflects the Region name
     * where it was created, a group is not constrained to any Region. This means that you can put canaries from
     * multiple Regions into the same group, and then use that group to view and manage all of those canaries in a
     * single view.
     * </p>
     * <p>
     * Groups are supported in all Regions except the Regions that are disabled by default. For more information about
     * these Regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a Region</a>.
     * </p>
     * <p>
     * Each group can contain as many as 10 canaries. You can have as many as 20 groups in your account. Any single
     * canary can be a member of up to 10 groups.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws ServiceQuotaExceededException
     *         The request exceeded a service quota value.
     * @sample AWSSynthetics.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGroupResult createGroup(CreateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGroup(request);
    }

    @SdkInternalApi
    final CreateGroupResult executeCreateGroup(CreateGroupRequest createGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupRequest> request = null;
        Response<CreateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes the specified canary.
     * </p>
     * <p>
     * If you specify <code>DeleteLambda</code> to <code>true</code>, CloudWatch Synthetics also deletes the Lambda
     * functions and layers that are used by the canary.
     * </p>
     * <p>
     * Other resources used and created by the canary are not automatically deleted. After you delete a canary that you
     * do not intend to use again, you should also delete the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The CloudWatch alarms created for this canary. These alarms have a name of
     * <code>Synthetics-SharpDrop-Alarm-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon S3 objects and buckets, such as the canary's artifact location.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM roles created for the canary. If they were created in the console, these roles have the name
     * <code> role/service-role/CloudWatchSyntheticsRole-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudWatch Logs log groups created for the canary. These logs groups have the name
     * <code>/aws/lambda/cwsyn-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Before you delete a canary, you might want to use <code>GetCanary</code> to display the information about this
     * canary. Make note of the information returned by this operation so that you can delete these resources after you
     * delete the canary.
     * </p>
     * 
     * @param deleteCanaryRequest
     * @return Result of the DeleteCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.DeleteCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DeleteCanary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteCanaryResult deleteCanary(DeleteCanaryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCanary(request);
    }

    @SdkInternalApi
    final DeleteCanaryResult executeDeleteCanary(DeleteCanaryRequest deleteCanaryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCanaryRequest> request = null;
        Response<DeleteCanaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCanaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCanaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCanary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCanaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCanaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a group. The group doesn't need to be empty to be deleted. If there are canaries in the group, they are
     * not deleted when you delete the group.
     * </p>
     * <p>
     * Groups are a global resource that appear in all Regions, but the request to delete a group must be made from its
     * home Region. You can find the home Region of a group within its ARN.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGroupResult deleteGroup(DeleteGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGroup(request);
    }

    @SdkInternalApi
    final DeleteGroupResult executeDeleteGroup(DeleteGroupRequest deleteGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupRequest> request = null;
        Response<DeleteGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns a list of the canaries in your account, along with full details about each canary.
     * </p>
     * <p>
     * This operation supports resource-level authorization using an IAM policy and the <code>Names</code> parameter. If
     * you specify the <code>Names</code> parameter, the operation is successful only if you have authorization to view
     * all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     * request fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * 
     * @param describeCanariesRequest
     * @return Result of the DescribeCanaries operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @sample AWSSynthetics.DescribeCanaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeCanaries" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeCanariesResult describeCanaries(DescribeCanariesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCanaries(request);
    }

    @SdkInternalApi
    final DescribeCanariesResult executeDescribeCanaries(DescribeCanariesRequest describeCanariesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCanariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCanariesRequest> request = null;
        Response<DescribeCanariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCanariesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCanariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCanaries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCanariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCanariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to see information from the most recent run of each canary that you have created.
     * </p>
     * <p>
     * This operation supports resource-level authorization using an IAM policy and the <code>Names</code> parameter. If
     * you specify the <code>Names</code> parameter, the operation is successful only if you have authorization to view
     * all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     * request fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * 
     * @param describeCanariesLastRunRequest
     * @return Result of the DescribeCanariesLastRun operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @sample AWSSynthetics.DescribeCanariesLastRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeCanariesLastRun"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCanariesLastRunResult describeCanariesLastRun(DescribeCanariesLastRunRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCanariesLastRun(request);
    }

    @SdkInternalApi
    final DescribeCanariesLastRunResult executeDescribeCanariesLastRun(DescribeCanariesLastRunRequest describeCanariesLastRunRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCanariesLastRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCanariesLastRunRequest> request = null;
        Response<DescribeCanariesLastRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCanariesLastRunRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCanariesLastRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCanariesLastRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCanariesLastRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCanariesLastRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Synthetics canary runtime versions. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @param describeRuntimeVersionsRequest
     * @return Result of the DescribeRuntimeVersions operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @sample AWSSynthetics.DescribeRuntimeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeRuntimeVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRuntimeVersionsResult describeRuntimeVersions(DescribeRuntimeVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRuntimeVersions(request);
    }

    @SdkInternalApi
    final DescribeRuntimeVersionsResult executeDescribeRuntimeVersions(DescribeRuntimeVersionsRequest describeRuntimeVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRuntimeVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRuntimeVersionsRequest> request = null;
        Response<DescribeRuntimeVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRuntimeVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRuntimeVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRuntimeVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRuntimeVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRuntimeVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a canary from a group. You must run this operation in the Region where the canary exists.
     * </p>
     * 
     * @param disassociateResourceRequest
     * @return Result of the DisassociateResource operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.DisassociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DisassociateResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateResourceResult disassociateResource(DisassociateResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateResource(request);
    }

    @SdkInternalApi
    final DisassociateResourceResult executeDisassociateResource(DisassociateResourceRequest disassociateResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateResourceRequest> request = null;
        Response<DisassociateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves complete information about one canary. You must specify the name of the canary that you want. To get a
     * list of canaries and their names, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     * >DescribeCanaries</a>.
     * </p>
     * 
     * @param getCanaryRequest
     * @return Result of the GetCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @sample AWSSynthetics.GetCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetCanary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCanaryResult getCanary(GetCanaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetCanary(request);
    }

    @SdkInternalApi
    final GetCanaryResult executeGetCanary(GetCanaryRequest getCanaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCanaryRequest> request = null;
        Response<GetCanaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCanaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCanaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCanary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCanaryResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCanaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of runs for a specified canary.
     * </p>
     * 
     * @param getCanaryRunsRequest
     * @return Result of the GetCanaryRuns operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @sample AWSSynthetics.GetCanaryRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetCanaryRuns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCanaryRunsResult getCanaryRuns(GetCanaryRunsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCanaryRuns(request);
    }

    @SdkInternalApi
    final GetCanaryRunsResult executeGetCanaryRuns(GetCanaryRunsRequest getCanaryRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCanaryRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCanaryRunsRequest> request = null;
        Response<GetCanaryRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCanaryRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCanaryRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCanaryRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCanaryRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCanaryRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about one group. Groups are a global resource, so you can use this operation from any Region.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGroupResult getGroup(GetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroup(request);
    }

    @SdkInternalApi
    final GetGroupResult executeGetGroup(GetGroupRequest getGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupRequest> request = null;
        Response<GetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGroupResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the groups that the specified canary is associated with. The canary that you specify must be in
     * the current Region.
     * </p>
     * 
     * @param listAssociatedGroupsRequest
     * @return Result of the ListAssociatedGroups operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @sample AWSSynthetics.ListAssociatedGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListAssociatedGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssociatedGroupsResult listAssociatedGroups(ListAssociatedGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssociatedGroups(request);
    }

    @SdkInternalApi
    final ListAssociatedGroupsResult executeListAssociatedGroups(ListAssociatedGroupsRequest listAssociatedGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssociatedGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociatedGroupsRequest> request = null;
        Response<ListAssociatedGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociatedGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssociatedGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssociatedGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociatedGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssociatedGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns a list of the ARNs of the canaries that are associated with the specified group.
     * </p>
     * 
     * @param listGroupResourcesRequest
     * @return Result of the ListGroupResources operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.ListGroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListGroupResources" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListGroupResourcesResult listGroupResources(ListGroupResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListGroupResources(request);
    }

    @SdkInternalApi
    final ListGroupResourcesResult executeListGroupResources(ListGroupResourcesRequest listGroupResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupResourcesRequest> request = null;
        Response<ListGroupResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroupResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroupResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroupResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all groups in the account, displaying their names, unique IDs, and ARNs. The groups from all
     * Regions are returned.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @sample AWSSynthetics.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGroupsResult listGroups(ListGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListGroups(request);
    }

    @SdkInternalApi
    final ListGroupsResult executeListGroups(ListGroupsRequest listGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsRequest> request = null;
        Response<ListGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the tags associated with a canary or group.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The request was not valid.
     * @throws NotFoundException
     *         The specified resource was not found.
     * @throws TooManyRequestsException
     *         There were too many simultaneous requests. Try the operation again.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws InternalFailureException
     *         An internal failure occurred. Try the operation again.
     * @sample AWSSynthetics.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
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
     * Use this operation to run a canary that has already been created. The frequency of the canary runs is determined
     * by the value of the canary's <code>Schedule</code>. To see a canary's schedule, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_GetCanary.html">GetCanary</a>.
     * </p>
     * 
     * @param startCanaryRequest
     * @return Result of the StartCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.StartCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/StartCanary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartCanaryResult startCanary(StartCanaryRequest request) {
        request = beforeClientExecution(request);
        return executeStartCanary(request);
    }

    @SdkInternalApi
    final StartCanaryResult executeStartCanary(StartCanaryRequest startCanaryRequest) {

        ExecutionContext executionContext = createExecutionContext(startCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCanaryRequest> request = null;
        Response<StartCanaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCanaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startCanaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartCanary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCanaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartCanaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the canary to prevent all future runs. If the canary is currently running,the run that is in progress
     * completes on its own, publishes metrics, and uploads artifacts, but it is not recorded in Synthetics as a
     * completed run.
     * </p>
     * <p>
     * You can use <code>StartCanary</code> to start it running again with the canary’s current schedule at any point in
     * the future.
     * </p>
     * 
     * @param stopCanaryRequest
     * @return Result of the StopCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.StopCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/StopCanary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopCanaryResult stopCanary(StopCanaryRequest request) {
        request = beforeClientExecution(request);
        return executeStopCanary(request);
    }

    @SdkInternalApi
    final StopCanaryResult executeStopCanary(StopCanaryRequest stopCanaryRequest) {

        ExecutionContext executionContext = createExecutionContext(stopCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCanaryRequest> request = null;
        Response<StopCanaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCanaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopCanaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopCanary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopCanaryResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopCanaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified canary or group.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag
     * key that is already associated with the resource, the new tag value that you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a canary or group.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The request was not valid.
     * @throws NotFoundException
     *         The specified resource was not found.
     * @throws TooManyRequestsException
     *         There were too many simultaneous requests. Try the operation again.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws InternalFailureException
     *         An internal failure occurred. Try the operation again.
     * @sample AWSSynthetics.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
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
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The request was not valid.
     * @throws NotFoundException
     *         The specified resource was not found.
     * @throws TooManyRequestsException
     *         There were too many simultaneous requests. Try the operation again.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws InternalFailureException
     *         An internal failure occurred. Try the operation again.
     * @sample AWSSynthetics.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
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
     * Updates the configuration of a canary that has already been created.
     * </p>
     * <p>
     * You can't use this operation to update the tags of an existing canary. To change the tags of an existing canary,
     * use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateCanaryRequest
     * @return Result of the UpdateCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws RequestEntityTooLargeException
     *         One of the input resources is larger than is allowed.
     * @sample AWSSynthetics.UpdateCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/UpdateCanary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateCanaryResult updateCanary(UpdateCanaryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCanary(request);
    }

    @SdkInternalApi
    final UpdateCanaryResult executeUpdateCanary(UpdateCanaryRequest updateCanaryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCanaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCanaryRequest> request = null;
        Response<UpdateCanaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCanaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCanaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "synthetics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCanary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCanaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCanaryResultJsonUnmarshaller());
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
