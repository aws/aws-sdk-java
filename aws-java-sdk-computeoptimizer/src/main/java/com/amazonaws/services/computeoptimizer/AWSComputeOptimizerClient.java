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
package com.amazonaws.services.computeoptimizer;

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

import com.amazonaws.services.computeoptimizer.AWSComputeOptimizerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.computeoptimizer.model.*;
import com.amazonaws.services.computeoptimizer.model.transform.*;

/**
 * Client for accessing AWS Compute Optimizer. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * AWS Compute Optimizer is a service that analyzes the configuration and utilization metrics of your AWS compute
 * resources, such as EC2 instances, Auto Scaling groups, AWS Lambda functions, and Amazon EBS volumes. It reports
 * whether your resources are optimal, and generates optimization recommendations to reduce the cost and improve the
 * performance of your workloads. Compute Optimizer also provides recent utilization metric data, as well as projected
 * utilization metric data for the recommendations, which you can use to evaluate which recommendation provides the best
 * price-performance trade-off. The analysis of your usage patterns can help you decide when to move or resize your
 * running resources, and still meet your performance and capacity requirements. For more information about Compute
 * Optimizer, including the required permissions to use the service, see the <a
 * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/">AWS Compute Optimizer User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSComputeOptimizerClient extends AmazonWebServiceClient implements AWSComputeOptimizer {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSComputeOptimizer.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "compute-optimizer";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.computeoptimizer.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withExceptionUnmarshaller(
                                    com.amazonaws.services.computeoptimizer.model.transform.InvalidParameterValueExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.computeoptimizer.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingAuthenticationToken").withExceptionUnmarshaller(
                                    com.amazonaws.services.computeoptimizer.model.transform.MissingAuthenticationTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.computeoptimizer.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OptInRequiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.computeoptimizer.model.transform.OptInRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.computeoptimizer.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.computeoptimizer.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.computeoptimizer.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.computeoptimizer.model.AWSComputeOptimizerException.class));

    public static AWSComputeOptimizerClientBuilder builder() {
        return AWSComputeOptimizerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Compute Optimizer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSComputeOptimizerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Compute Optimizer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSComputeOptimizerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("compute-optimizer.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/computeoptimizer/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/computeoptimizer/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Describes recommendation export jobs created in the last seven days.
     * </p>
     * <p>
     * Use the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code>
     * actions to request an export of your recommendations. Then use the <code>DescribeRecommendationExportJobs</code>
     * action to view your export jobs.
     * </p>
     * 
     * @param describeRecommendationExportJobsRequest
     * @return Result of the DescribeRecommendationExportJobs operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.DescribeRecommendationExportJobs
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DescribeRecommendationExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRecommendationExportJobsResult describeRecommendationExportJobs(DescribeRecommendationExportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRecommendationExportJobs(request);
    }

    @SdkInternalApi
    final DescribeRecommendationExportJobsResult executeDescribeRecommendationExportJobs(
            DescribeRecommendationExportJobsRequest describeRecommendationExportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRecommendationExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecommendationExportJobsRequest> request = null;
        Response<DescribeRecommendationExportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecommendationExportJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRecommendationExportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Compute Optimizer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRecommendationExportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRecommendationExportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRecommendationExportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports optimization recommendations for Auto Scaling groups.
     * </p>
     * <p>
     * Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object
     * Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Auto Scaling group export job in progress per AWS Region.
     * </p>
     * 
     * @param exportAutoScalingGroupRecommendationsRequest
     * @return Result of the ExportAutoScalingGroupRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.ExportAutoScalingGroupRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportAutoScalingGroupRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExportAutoScalingGroupRecommendationsResult exportAutoScalingGroupRecommendations(ExportAutoScalingGroupRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeExportAutoScalingGroupRecommendations(request);
    }

    @SdkInternalApi
    final ExportAutoScalingGroupRecommendationsResult executeExportAutoScalingGroupRecommendations(
            ExportAutoScalingGroupRecommendationsRequest exportAutoScalingGroupRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(exportAutoScalingGroupRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportAutoScalingGroupRecommendationsRequest> request = null;
        Response<ExportAutoScalingGroupRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportAutoScalingGroupRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(exportAutoScalingGroupRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Compute Optimizer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportAutoScalingGroupRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportAutoScalingGroupRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ExportAutoScalingGroupRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports optimization recommendations for Amazon EC2 instances.
     * </p>
     * <p>
     * Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object
     * Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Amazon EC2 instance export job in progress per AWS Region.
     * </p>
     * 
     * @param exportEC2InstanceRecommendationsRequest
     * @return Result of the ExportEC2InstanceRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.ExportEC2InstanceRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportEC2InstanceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExportEC2InstanceRecommendationsResult exportEC2InstanceRecommendations(ExportEC2InstanceRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeExportEC2InstanceRecommendations(request);
    }

    @SdkInternalApi
    final ExportEC2InstanceRecommendationsResult executeExportEC2InstanceRecommendations(
            ExportEC2InstanceRecommendationsRequest exportEC2InstanceRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(exportEC2InstanceRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportEC2InstanceRecommendationsRequest> request = null;
        Response<ExportEC2InstanceRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportEC2InstanceRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(exportEC2InstanceRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Compute Optimizer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportEC2InstanceRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportEC2InstanceRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ExportEC2InstanceRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns Auto Scaling group recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer generates recommendations for Amazon EC2 Auto Scaling groups that meet a specific set of
     * requirements. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getAutoScalingGroupRecommendationsRequest
     * @return Result of the GetAutoScalingGroupRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetAutoScalingGroupRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetAutoScalingGroupRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAutoScalingGroupRecommendationsResult getAutoScalingGroupRecommendations(GetAutoScalingGroupRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAutoScalingGroupRecommendations(request);
    }

    @SdkInternalApi
    final GetAutoScalingGroupRecommendationsResult executeGetAutoScalingGroupRecommendations(
            GetAutoScalingGroupRecommendationsRequest getAutoScalingGroupRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAutoScalingGroupRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAutoScalingGroupRecommendationsRequest> request = null;
        Response<GetAutoScalingGroupRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAutoScalingGroupRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAutoScalingGroupRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Compute Optimizer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAutoScalingGroupRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAutoScalingGroupRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAutoScalingGroupRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns Amazon Elastic Block Store (Amazon EBS) volume recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer generates recommendations for Amazon EBS volumes that meet a specific set of requirements.
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getEBSVolumeRecommendationsRequest
     * @return Result of the GetEBSVolumeRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEBSVolumeRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEBSVolumeRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEBSVolumeRecommendationsResult getEBSVolumeRecommendations(GetEBSVolumeRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetEBSVolumeRecommendations(request);
    }

    @SdkInternalApi
    final GetEBSVolumeRecommendationsResult executeGetEBSVolumeRecommendations(GetEBSVolumeRecommendationsRequest getEBSVolumeRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getEBSVolumeRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEBSVolumeRecommendationsRequest> request = null;
        Response<GetEBSVolumeRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEBSVolumeRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEBSVolumeRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Compute Optimizer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEBSVolumeRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEBSVolumeRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEBSVolumeRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns Amazon EC2 instance recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) instances that meet
     * a specific set of requirements. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getEC2InstanceRecommendationsRequest
     * @return Result of the GetEC2InstanceRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEC2InstanceRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2InstanceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEC2InstanceRecommendationsResult getEC2InstanceRecommendations(GetEC2InstanceRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetEC2InstanceRecommendations(request);
    }

    @SdkInternalApi
    final GetEC2InstanceRecommendationsResult executeGetEC2InstanceRecommendations(GetEC2InstanceRecommendationsRequest getEC2InstanceRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getEC2InstanceRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEC2InstanceRecommendationsRequest> request = null;
        Response<GetEC2InstanceRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEC2InstanceRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEC2InstanceRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Compute Optimizer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEC2InstanceRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEC2InstanceRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEC2InstanceRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the projected utilization metrics of Amazon EC2 instance recommendations.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned when you
     * run this action. Additionally, the <code>Memory</code> metric is returned only for resources that have the
     * unified CloudWatch agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @param getEC2RecommendationProjectedMetricsRequest
     * @return Result of the GetEC2RecommendationProjectedMetrics operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEC2RecommendationProjectedMetrics
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2RecommendationProjectedMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEC2RecommendationProjectedMetricsResult getEC2RecommendationProjectedMetrics(GetEC2RecommendationProjectedMetricsRequest request) {
        request = beforeClientExecution(request);
        return executeGetEC2RecommendationProjectedMetrics(request);
    }

    @SdkInternalApi
    final GetEC2RecommendationProjectedMetricsResult executeGetEC2RecommendationProjectedMetrics(
            GetEC2RecommendationProjectedMetricsRequest getEC2RecommendationProjectedMetricsRequest) {

        ExecutionContext executionContext = createExecutionContext(getEC2RecommendationProjectedMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEC2RecommendationProjectedMetricsRequest> request = null;
        Response<GetEC2RecommendationProjectedMetricsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEC2RecommendationProjectedMetricsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEC2RecommendationProjectedMetricsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Compute Optimizer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEC2RecommendationProjectedMetrics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEC2RecommendationProjectedMetricsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEC2RecommendationProjectedMetricsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the enrollment (opt in) status of an account to the AWS Compute Optimizer service.
     * </p>
     * <p>
     * If the account is the management account of an organization, this action also confirms the enrollment status of
     * member accounts within the organization.
     * </p>
     * 
     * @param getEnrollmentStatusRequest
     * @return Result of the GetEnrollmentStatus operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEnrollmentStatusResult getEnrollmentStatus(GetEnrollmentStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnrollmentStatus(request);
    }

    @SdkInternalApi
    final GetEnrollmentStatusResult executeGetEnrollmentStatus(GetEnrollmentStatusRequest getEnrollmentStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnrollmentStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnrollmentStatusRequest> request = null;
        Response<GetEnrollmentStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnrollmentStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEnrollmentStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Compute Optimizer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnrollmentStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnrollmentStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEnrollmentStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns AWS Lambda function recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer generates recommendations for functions that meet a specific set of requirements. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getLambdaFunctionRecommendationsRequest
     * @return Result of the GetLambdaFunctionRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.GetLambdaFunctionRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetLambdaFunctionRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLambdaFunctionRecommendationsResult getLambdaFunctionRecommendations(GetLambdaFunctionRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetLambdaFunctionRecommendations(request);
    }

    @SdkInternalApi
    final GetLambdaFunctionRecommendationsResult executeGetLambdaFunctionRecommendations(
            GetLambdaFunctionRecommendationsRequest getLambdaFunctionRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getLambdaFunctionRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLambdaFunctionRecommendationsRequest> request = null;
        Response<GetLambdaFunctionRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLambdaFunctionRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLambdaFunctionRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Compute Optimizer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLambdaFunctionRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLambdaFunctionRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLambdaFunctionRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the optimization findings for an account.
     * </p>
     * <p>
     * For example, it returns the number of Amazon EC2 instances in an account that are under-provisioned,
     * over-provisioned, or optimized. It also returns the number of Auto Scaling groups in an account that are not
     * optimized, or optimized.
     * </p>
     * 
     * @param getRecommendationSummariesRequest
     * @return Result of the GetRecommendationSummaries operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to AWS Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetRecommendationSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRecommendationSummariesResult getRecommendationSummaries(GetRecommendationSummariesRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecommendationSummaries(request);
    }

    @SdkInternalApi
    final GetRecommendationSummariesResult executeGetRecommendationSummaries(GetRecommendationSummariesRequest getRecommendationSummariesRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecommendationSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecommendationSummariesRequest> request = null;
        Response<GetRecommendationSummariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecommendationSummariesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRecommendationSummariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Compute Optimizer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecommendationSummaries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecommendationSummariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRecommendationSummariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the enrollment (opt in and opt out) status of an account to the AWS Compute Optimizer service.
     * </p>
     * <p>
     * If the account is a management account of an organization, this action can also be used to enroll member accounts
     * within the organization.
     * </p>
     * <p>
     * You must have the appropriate permissions to opt in to Compute Optimizer, to view its recommendations, and to opt
     * out. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/ug/security-iam.html">Controlling access with AWS Identity
     * and Access Management</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * When you opt in, Compute Optimizer automatically creates a Service-Linked Role in your account to access its
     * data. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/ug/using-service-linked-roles.html">Using Service-Linked
     * Roles for AWS Compute Optimizer</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param updateEnrollmentStatusRequest
     * @return Result of the UpdateEnrollmentStatus operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.UpdateEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/UpdateEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEnrollmentStatusResult updateEnrollmentStatus(UpdateEnrollmentStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnrollmentStatus(request);
    }

    @SdkInternalApi
    final UpdateEnrollmentStatusResult executeUpdateEnrollmentStatus(UpdateEnrollmentStatusRequest updateEnrollmentStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnrollmentStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnrollmentStatusRequest> request = null;
        Response<UpdateEnrollmentStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnrollmentStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEnrollmentStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Compute Optimizer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnrollmentStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnrollmentStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEnrollmentStatusResultJsonUnmarshaller());
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
