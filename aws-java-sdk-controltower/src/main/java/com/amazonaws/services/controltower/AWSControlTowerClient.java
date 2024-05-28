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
package com.amazonaws.services.controltower;

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

import com.amazonaws.services.controltower.AWSControlTowerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.controltower.model.*;

import com.amazonaws.services.controltower.model.transform.*;

/**
 * Client for accessing AWS Control Tower. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Web Services Control Tower offers application programming interface (API) operations that support programmatic
 * interaction with these types of resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls.html"> <i>controls</i> </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/lz-api-launch.html"> <i>landing zones</i> </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/types-of-baselines.html"> <i>baselines</i> </a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about these types of resources, see the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/what-is-control-tower.html"> <i>Amazon Web Services
 * Control Tower User Guide</i> </a>.
 * </p>
 * <p>
 * <b>About control APIs</b>
 * </p>
 * <p>
 * These interfaces allow you to apply the Amazon Web Services library of pre-defined <i>controls</i> to your
 * organizational units, programmatically. In Amazon Web Services Control Tower, the terms "control" and "guardrail" are
 * synonyms.
 * </p>
 * <p>
 * To call these APIs, you'll need to know:
 * </p>
 * <ul>
 * <li>
 * <p>
 * the <code>controlIdentifier</code> for the control--or guardrail--you are targeting.
 * </p>
 * </li>
 * <li>
 * <p>
 * the ARN associated with the target organizational unit (OU), which we call the <code>targetIdentifier</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * the ARN associated with a resource that you wish to tag or untag.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>To get the <code>controlIdentifier</code> for your Amazon Web Services Control Tower control:</b>
 * </p>
 * <p>
 * The <code>controlIdentifier</code> is an ARN that is specified for each control. You can view the
 * <code>controlIdentifier</code> in the console on the <b>Control details</b> page, as well as in the documentation.
 * </p>
 * <p>
 * The <code>controlIdentifier</code> is unique in each Amazon Web Services Region for each control. You can find the
 * <code>controlIdentifier</code> for each Region and control in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-metadata-tables.html">Tables of control
 * metadata</a> or the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-region-tables.html">Control availability by
 * Region tables</a> in the <i>Amazon Web Services Control Tower User Guide.</i>
 * </p>
 * <p>
 * A quick-reference list of control identifers for the Amazon Web Services Control Tower legacy <i>Strongly
 * recommended</i> and <i>Elective</i> controls is given in <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html.html">Resource identifiers
 * for APIs and controls</a> in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">Controls reference guide
 * section</a> of the <i>Amazon Web Services Control Tower User Guide</i>. Remember that <i>Mandatory</i> controls
 * cannot be added or removed.
 * </p>
 * <note>
 * <p>
 * <b>ARN format:</b> <code>arn:aws:controltower:{REGION}::control/{CONTROL_NAME}</code>
 * </p>
 * <p>
 * <b>Example:</b>
 * </p>
 * <p>
 * <code>arn:aws:controltower:us-west-2::control/AWS-GR_AUTOSCALING_LAUNCH_CONFIG_PUBLIC_IP_DISABLED</code>
 * </p>
 * </note>
 * <p>
 * <b>To get the <code>targetIdentifier</code>:</b>
 * </p>
 * <p>
 * The <code>targetIdentifier</code> is the ARN for an OU.
 * </p>
 * <p>
 * In the Amazon Web Services Organizations console, you can find the ARN for the OU on the <b>Organizational unit
 * details</b> page associated with that OU.
 * </p>
 * <note>
 * <p>
 * <b>OU ARN format:</b>
 * </p>
 * <p>
 * <code>arn:${Partition}:organizations::${MasterAccountId}:ou/o-${OrganizationId}/ou-${OrganizationalUnitId}</code>
 * </p>
 * </note>
 * <p>
 * <b> About landing zone APIs</b>
 * </p>
 * <p>
 * You can configure and launch an Amazon Web Services Control Tower landing zone with APIs. For an introduction and
 * steps, see <a href="https://docs.aws.amazon.com/controltower/latest/userguide/getting-started-apis.html">Getting
 * started with Amazon Web Services Control Tower using APIs</a>.
 * </p>
 * <p>
 * For an overview of landing zone API operations, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/2023-all.html#landing-zone-apis"> Amazon Web Services
 * Control Tower supports landing zone APIs</a>. The individual API operations for landing zones are detailed in this
 * document, the <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/API_Operations.html">API
 * reference manual</a>, in the "Actions" section.
 * </p>
 * <p>
 * <b>About baseline APIs</b>
 * </p>
 * <p>
 * You can apply the <code>AWSControlTowerBaseline</code> baseline to an organizational unit (OU) as a way to register
 * the OU with Amazon Web Services Control Tower, programmatically. For a general overview of this capability, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/2024-all.html#baseline-apis">Amazon Web Services
 * Control Tower supports APIs for OU registration and configuration with baselines</a>.
 * </p>
 * <p>
 * You can call the baseline API operations to view the baselines that Amazon Web Services Control Tower enables for
 * your landing zone, on your behalf, when setting up the landing zone. These baselines are read-only baselines.
 * </p>
 * <p>
 * The individual API operations for baselines are detailed in this document, the <a
 * href="https://docs.aws.amazon.com/controltower/latest/APIReference/API_Operations.html">API reference manual</a>, in
 * the "Actions" section. For usage examples, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html">Baseline API input and
 * output examples with CLI</a>.
 * </p>
 * <p class="title">
 * <b>Details and examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html">Control API input
 * and output examples with CLI</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html">Baseline API input and
 * output examples with CLI</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/enable-controls.html">Enable controls with
 * CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/lz-apis-cfn-setup.html">Launch a landing zone with
 * CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-metadata-tables.html">Control metadata
 * tables (large page)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-region-tables.html">Control availability
 * by Region tables (large page)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">List of identifiers for
 * legacy controls</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls.html">Controls reference guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls-reference.html">Controls library
 * groupings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/creating-resources-with-cloudformation.html">
 * Creating Amazon Web Services Control Tower resources with Amazon Web Services CloudFormation</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * To view the open source resource repository on GitHub, see <a
 * href="https://github.com/aws-cloudformation/aws-cloudformation-resource-providers-controltower"
 * >aws-cloudformation/aws-cloudformation-resource-providers-controltower</a>
 * </p>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * Amazon Web Services Control Tower supports Amazon Web Services CloudTrail, a service that records Amazon Web Services
 * API calls for your Amazon Web Services account and delivers log files to an Amazon S3 bucket. By using information
 * collected by CloudTrail, you can determine which requests the Amazon Web Services Control Tower service received, who
 * made the request and when, and so on. For more about Amazon Web Services Control Tower and its support for
 * CloudTrail, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/logging-using-cloudtrail.html">Logging Amazon Web
 * Services Control Tower Actions with Amazon Web Services CloudTrail</a> in the Amazon Web Services Control Tower User
 * Guide. To learn more about CloudTrail, including how to turn it on and find your log files, see the Amazon Web
 * Services CloudTrail User Guide.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSControlTowerClient extends AmazonWebServiceClient implements AWSControlTower {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSControlTower.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "controltower";

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
                                    com.amazonaws.services.controltower.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.controltower.model.AWSControlTowerException.class));

    public static AWSControlTowerClientBuilder builder() {
        return AWSControlTowerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Control Tower using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSControlTowerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Control Tower using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSControlTowerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("controltower.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/controltower/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/controltower/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Decommissions a landing zone. This API call starts an asynchronous operation that deletes Amazon Web Services
     * Control Tower resources deployed in accounts managed by Amazon Web Services Control Tower.
     * </p>
     * 
     * @param deleteLandingZoneRequest
     * @return Result of the DeleteLandingZone operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.DeleteLandingZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DeleteLandingZone" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteLandingZoneResult deleteLandingZone(DeleteLandingZoneRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLandingZone(request);
    }

    @SdkInternalApi
    final DeleteLandingZoneResult executeDeleteLandingZone(DeleteLandingZoneRequest deleteLandingZoneRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLandingZoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLandingZoneRequest> request = null;
        Response<DeleteLandingZoneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLandingZoneRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLandingZoneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLandingZone");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLandingZoneResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLandingZoneResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disable an <code>EnabledBaseline</code> resource on the specified Target. This API starts an asynchronous
     * operation to remove all resources deployed as part of the baseline enablement. The resource will vary depending
     * on the enabled baseline. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param disableBaselineRequest
     * @return Result of the DisableBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.DisableBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DisableBaseline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisableBaselineResult disableBaseline(DisableBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeDisableBaseline(request);
    }

    @SdkInternalApi
    final DisableBaselineResult executeDisableBaseline(DisableBaselineRequest disableBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(disableBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableBaselineRequest> request = null;
        Response<DisableBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableBaselineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableBaselineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API call turns off a control. It starts an asynchronous operation that deletes AWS resources on the
     * specified organizational unit and the accounts it contains. The resources will vary according to the control that
     * you specify. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param disableControlRequest
     * @return Result of the DisableControl operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.DisableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DisableControl" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisableControlResult disableControl(DisableControlRequest request) {
        request = beforeClientExecution(request);
        return executeDisableControl(request);
    }

    @SdkInternalApi
    final DisableControlResult executeDisableControl(DisableControlRequest disableControlRequest) {

        ExecutionContext executionContext = createExecutionContext(disableControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableControlRequest> request = null;
        Response<DisableControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enable (apply) a <code>Baseline</code> to a Target. This API starts an asynchronous operation to deploy resources
     * specified by the <code>Baseline</code> to the specified Target. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param enableBaselineRequest
     * @return Result of the EnableBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.EnableBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnableBaseline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public EnableBaselineResult enableBaseline(EnableBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeEnableBaseline(request);
    }

    @SdkInternalApi
    final EnableBaselineResult executeEnableBaseline(EnableBaselineRequest enableBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(enableBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableBaselineRequest> request = null;
        Response<EnableBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableBaselineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableBaselineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API call activates a control. It starts an asynchronous operation that creates Amazon Web Services resources
     * on the specified organizational unit and the accounts it contains. The resources created will vary according to
     * the control that you specify. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param enableControlRequest
     * @return Result of the EnableControl operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.EnableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnableControl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableControlResult enableControl(EnableControlRequest request) {
        request = beforeClientExecution(request);
        return executeEnableControl(request);
    }

    @SdkInternalApi
    final EnableControlResult executeEnableControl(EnableControlRequest enableControlRequest) {

        ExecutionContext executionContext = createExecutionContext(enableControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableControlRequest> request = null;
        Response<EnableControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve details about an existing <code>Baseline</code> resource by specifying its identifier. For usage
     * examples, see <a href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html">
     * <i>the Amazon Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param getBaselineRequest
     * @return Result of the GetBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBaselineResult getBaseline(GetBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeGetBaseline(request);
    }

    @SdkInternalApi
    final GetBaselineResult executeGetBaseline(GetBaselineRequest getBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(getBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBaselineRequest> request = null;
        Response<GetBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBaselineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBaselineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of an asynchronous baseline operation, as initiated by any of these APIs:
     * <code>EnableBaseline</code>, <code>DisableBaseline</code>, <code>UpdateEnabledBaseline</code>,
     * <code>ResetEnabledBaseline</code>. A status message is displayed in case of operation failure. For usage
     * examples, see <a href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html">
     * <i>the Amazon Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param getBaselineOperationRequest
     * @return Result of the GetBaselineOperation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetBaselineOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetBaselineOperation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBaselineOperationResult getBaselineOperation(GetBaselineOperationRequest request) {
        request = beforeClientExecution(request);
        return executeGetBaselineOperation(request);
    }

    @SdkInternalApi
    final GetBaselineOperationResult executeGetBaselineOperation(GetBaselineOperationRequest getBaselineOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(getBaselineOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBaselineOperationRequest> request = null;
        Response<GetBaselineOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBaselineOperationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBaselineOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBaselineOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBaselineOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBaselineOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the status of a particular <code>EnableControl</code> or <code>DisableControl</code> operation. Displays
     * a message in case of error. Details for an operation are available for 90 days. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param getControlOperationRequest
     * @return Result of the GetControlOperation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetControlOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetControlOperation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetControlOperationResult getControlOperation(GetControlOperationRequest request) {
        request = beforeClientExecution(request);
        return executeGetControlOperation(request);
    }

    @SdkInternalApi
    final GetControlOperationResult executeGetControlOperation(GetControlOperationRequest getControlOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(getControlOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetControlOperationRequest> request = null;
        Response<GetControlOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetControlOperationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getControlOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetControlOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetControlOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetControlOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve details of an <code>EnabledBaseline</code> resource by specifying its identifier.
     * </p>
     * 
     * @param getEnabledBaselineRequest
     * @return Result of the GetEnabledBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetEnabledBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetEnabledBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEnabledBaselineResult getEnabledBaseline(GetEnabledBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnabledBaseline(request);
    }

    @SdkInternalApi
    final GetEnabledBaselineResult executeGetEnabledBaseline(GetEnabledBaselineRequest getEnabledBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnabledBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnabledBaselineRequest> request = null;
        Response<GetEnabledBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnabledBaselineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEnabledBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnabledBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnabledBaselineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEnabledBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about an enabled control. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param getEnabledControlRequest
     * @return Result of the GetEnabledControl operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetEnabledControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetEnabledControl" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetEnabledControlResult getEnabledControl(GetEnabledControlRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnabledControl(request);
    }

    @SdkInternalApi
    final GetEnabledControlResult executeGetEnabledControl(GetEnabledControlRequest getEnabledControlRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnabledControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnabledControlRequest> request = null;
        Response<GetEnabledControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnabledControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEnabledControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnabledControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnabledControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEnabledControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the status of the specified landing zone operation. Details for an operation are available for 90 days.
     * </p>
     * 
     * @param getLandingZoneOperationRequest
     * @return Result of the GetLandingZoneOperation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetLandingZoneOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetLandingZoneOperation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLandingZoneOperationResult getLandingZoneOperation(GetLandingZoneOperationRequest request) {
        request = beforeClientExecution(request);
        return executeGetLandingZoneOperation(request);
    }

    @SdkInternalApi
    final GetLandingZoneOperationResult executeGetLandingZoneOperation(GetLandingZoneOperationRequest getLandingZoneOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(getLandingZoneOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLandingZoneOperationRequest> request = null;
        Response<GetLandingZoneOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLandingZoneOperationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLandingZoneOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLandingZoneOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLandingZoneOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLandingZoneOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a summary list of all available baselines. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param listBaselinesRequest
     * @return Result of the ListBaselines operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSControlTower.ListBaselines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListBaselines" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBaselinesResult listBaselines(ListBaselinesRequest request) {
        request = beforeClientExecution(request);
        return executeListBaselines(request);
    }

    @SdkInternalApi
    final ListBaselinesResult executeListBaselines(ListBaselinesRequest listBaselinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listBaselinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBaselinesRequest> request = null;
        Response<ListBaselinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBaselinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBaselinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBaselines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBaselinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBaselinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of operations in progress or queued.
     * </p>
     * 
     * @param listControlOperationsRequest
     * @return Result of the ListControlOperations operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSControlTower.ListControlOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListControlOperations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListControlOperationsResult listControlOperations(ListControlOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeListControlOperations(request);
    }

    @SdkInternalApi
    final ListControlOperationsResult executeListControlOperations(ListControlOperationsRequest listControlOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listControlOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListControlOperationsRequest> request = null;
        Response<ListControlOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListControlOperationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listControlOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListControlOperations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListControlOperationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListControlOperationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of summaries describing <code>EnabledBaseline</code> resources. You can filter the list by the
     * corresponding <code>Baseline</code> or <code>Target</code> of the <code>EnabledBaseline</code> resources. For
     * usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param listEnabledBaselinesRequest
     * @return Result of the ListEnabledBaselines operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSControlTower.ListEnabledBaselines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListEnabledBaselines"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnabledBaselinesResult listEnabledBaselines(ListEnabledBaselinesRequest request) {
        request = beforeClientExecution(request);
        return executeListEnabledBaselines(request);
    }

    @SdkInternalApi
    final ListEnabledBaselinesResult executeListEnabledBaselines(ListEnabledBaselinesRequest listEnabledBaselinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnabledBaselinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnabledBaselinesRequest> request = null;
        Response<ListEnabledBaselinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnabledBaselinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEnabledBaselinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnabledBaselines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnabledBaselinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEnabledBaselinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the controls enabled by Amazon Web Services Control Tower on the specified organizational unit and the
     * accounts it contains. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param listEnabledControlsRequest
     * @return Result of the ListEnabledControls operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.ListEnabledControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListEnabledControls"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnabledControlsResult listEnabledControls(ListEnabledControlsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnabledControls(request);
    }

    @SdkInternalApi
    final ListEnabledControlsResult executeListEnabledControls(ListEnabledControlsRequest listEnabledControlsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnabledControlsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnabledControlsRequest> request = null;
        Response<ListEnabledControlsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnabledControlsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEnabledControlsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnabledControls");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnabledControlsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEnabledControlsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the landing zone ARN for the landing zone deployed in your managed account. This API also creates an ARN
     * for existing accounts that do not yet have a landing zone ARN.
     * </p>
     * <p>
     * Returns one landing zone ARN.
     * </p>
     * 
     * @param listLandingZonesRequest
     * @return Result of the ListLandingZones operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSControlTower.ListLandingZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListLandingZones" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListLandingZonesResult listLandingZones(ListLandingZonesRequest request) {
        request = beforeClientExecution(request);
        return executeListLandingZones(request);
    }

    @SdkInternalApi
    final ListLandingZonesResult executeListLandingZones(ListLandingZonesRequest listLandingZonesRequest) {

        ExecutionContext executionContext = createExecutionContext(listLandingZonesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLandingZonesRequest> request = null;
        Response<ListLandingZonesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLandingZonesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLandingZonesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLandingZones");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLandingZonesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLandingZonesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags associated with the resource. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
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
     * Re-enables an <code>EnabledBaseline</code> resource. For example, this API can re-apply the existing
     * <code>Baseline</code> after a new member account is moved to the target OU. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param resetEnabledBaselineRequest
     * @return Result of the ResetEnabledBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.ResetEnabledBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ResetEnabledBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResetEnabledBaselineResult resetEnabledBaseline(ResetEnabledBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeResetEnabledBaseline(request);
    }

    @SdkInternalApi
    final ResetEnabledBaselineResult executeResetEnabledBaseline(ResetEnabledBaselineRequest resetEnabledBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(resetEnabledBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetEnabledBaselineRequest> request = null;
        Response<ResetEnabledBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetEnabledBaselineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetEnabledBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetEnabledBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetEnabledBaselineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResetEnabledBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API call resets a landing zone. It starts an asynchronous operation that resets the landing zone to the
     * parameters specified in its original configuration.
     * </p>
     * 
     * @param resetLandingZoneRequest
     * @return Result of the ResetLandingZone operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.ResetLandingZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ResetLandingZone" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ResetLandingZoneResult resetLandingZone(ResetLandingZoneRequest request) {
        request = beforeClientExecution(request);
        return executeResetLandingZone(request);
    }

    @SdkInternalApi
    final ResetLandingZoneResult executeResetLandingZone(ResetLandingZoneRequest resetLandingZoneRequest) {

        ExecutionContext executionContext = createExecutionContext(resetLandingZoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetLandingZoneRequest> request = null;
        Response<ResetLandingZoneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetLandingZoneRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetLandingZoneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetLandingZone");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetLandingZoneResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResetLandingZoneResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies tags to a resource. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
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
     * Removes tags from a resource. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
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
     * Updates an <code>EnabledBaseline</code> resource's applied parameters or version. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param updateEnabledBaselineRequest
     * @return Result of the UpdateEnabledBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.UpdateEnabledBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/UpdateEnabledBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEnabledBaselineResult updateEnabledBaseline(UpdateEnabledBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnabledBaseline(request);
    }

    @SdkInternalApi
    final UpdateEnabledBaselineResult executeUpdateEnabledBaseline(UpdateEnabledBaselineRequest updateEnabledBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnabledBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnabledBaselineRequest> request = null;
        Response<UpdateEnabledBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnabledBaselineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEnabledBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnabledBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnabledBaselineResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateEnabledBaselineResultJsonUnmarshaller());
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
