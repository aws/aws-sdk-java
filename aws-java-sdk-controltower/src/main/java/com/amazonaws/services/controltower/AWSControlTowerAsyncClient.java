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
package com.amazonaws.services.controltower;

import javax.annotation.Generated;

import com.amazonaws.services.controltower.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Control Tower asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * These interfaces allow you to apply the AWS library of pre-defined <i>controls</i> to your organizational units,
 * programmatically. In this context, controls are the same as AWS Control Tower guardrails.
 * </p>
 * <p>
 * To call these APIs, you'll need to know:
 * </p>
 * <ul>
 * <li>
 * <p>
 * the <code>ControlARN</code> for the control--that is, the guardrail--you are targeting,
 * </p>
 * </li>
 * <li>
 * <p>
 * and the ARN associated with the target organizational unit (OU).
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>To get the <code>ControlARN</code> for your AWS Control Tower guardrail:</b>
 * </p>
 * <p>
 * The <code>ControlARN</code> contains the control name which is specified in each guardrail. For a list of control
 * names for <i>Strongly recommended</i> and <i>Elective</i> guardrails, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html.html">Resource identifiers
 * for APIs and guardrails</a> in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/automating-tasks.html">Automating tasks section</a>
 * of the AWS Control Tower User Guide. Remember that <i>Mandatory</i> guardrails cannot be added or removed.
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
 * <b>To get the ARN for an OU:</b>
 * </p>
 * <p>
 * In the AWS Organizations console, you can find the ARN for the OU on the <b>Organizational unit details</b> page
 * associated with that OU.
 * </p>
 * <note>
 * <p>
 * <b>OU ARN format:</b>
 * </p>
 * <p>
 * <code>arn:${Partition}:organizations::${MasterAccountId}:ou/o-${OrganizationId}/ou-${OrganizationalUnitId}</code>
 * </p>
 * </note>
 * <p class="title">
 * <b>Details and examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">List of resource
 * identifiers for APIs and guardrails</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/guardrail-api-examples-short.html">Guardrail API
 * examples (CLI)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/enable-controls.html">Enable controls with AWS
 * CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/creating-resources-with-cloudformation.html">
 * Creating AWS Control Tower resources with AWS CloudFormation</a>
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
 * AWS Control Tower supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers log
 * files to an Amazon S3 bucket. By using information collected by CloudTrail, you can determine which requests the AWS
 * Control Tower service received, who made the request and when, and so on. For more about AWS Control Tower and its
 * support for CloudTrail, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/logging-using-cloudtrail.html">Logging AWS Control
 * Tower Actions with AWS CloudTrail</a> in the AWS Control Tower User Guide. To learn more about CloudTrail, including
 * how to turn it on and find your log files, see the AWS CloudTrail User Guide.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSControlTowerAsyncClient extends AWSControlTowerClient implements AWSControlTowerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSControlTowerAsyncClientBuilder asyncBuilder() {
        return AWSControlTowerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Control Tower using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSControlTowerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Control Tower using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSControlTowerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<DisableControlResult> disableControlAsync(DisableControlRequest request) {

        return disableControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableControlResult> disableControlAsync(final DisableControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableControlRequest, DisableControlResult> asyncHandler) {
        final DisableControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableControlResult>() {
            @Override
            public DisableControlResult call() throws Exception {
                DisableControlResult result = null;

                try {
                    result = executeDisableControl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EnableControlResult> enableControlAsync(EnableControlRequest request) {

        return enableControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableControlResult> enableControlAsync(final EnableControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableControlRequest, EnableControlResult> asyncHandler) {
        final EnableControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableControlResult>() {
            @Override
            public EnableControlResult call() throws Exception {
                EnableControlResult result = null;

                try {
                    result = executeEnableControl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetControlOperationResult> getControlOperationAsync(GetControlOperationRequest request) {

        return getControlOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetControlOperationResult> getControlOperationAsync(final GetControlOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetControlOperationRequest, GetControlOperationResult> asyncHandler) {
        final GetControlOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetControlOperationResult>() {
            @Override
            public GetControlOperationResult call() throws Exception {
                GetControlOperationResult result = null;

                try {
                    result = executeGetControlOperation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEnabledControlsResult> listEnabledControlsAsync(ListEnabledControlsRequest request) {

        return listEnabledControlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnabledControlsResult> listEnabledControlsAsync(final ListEnabledControlsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnabledControlsRequest, ListEnabledControlsResult> asyncHandler) {
        final ListEnabledControlsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnabledControlsResult>() {
            @Override
            public ListEnabledControlsResult call() throws Exception {
                ListEnabledControlsResult result = null;

                try {
                    result = executeListEnabledControls(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
