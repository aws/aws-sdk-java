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
    public java.util.concurrent.Future<DeleteLandingZoneResult> deleteLandingZoneAsync(DeleteLandingZoneRequest request) {

        return deleteLandingZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLandingZoneResult> deleteLandingZoneAsync(final DeleteLandingZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLandingZoneRequest, DeleteLandingZoneResult> asyncHandler) {
        final DeleteLandingZoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLandingZoneResult>() {
            @Override
            public DeleteLandingZoneResult call() throws Exception {
                DeleteLandingZoneResult result = null;

                try {
                    result = executeDeleteLandingZone(finalRequest);
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
    public java.util.concurrent.Future<DisableBaselineResult> disableBaselineAsync(DisableBaselineRequest request) {

        return disableBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableBaselineResult> disableBaselineAsync(final DisableBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableBaselineRequest, DisableBaselineResult> asyncHandler) {
        final DisableBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableBaselineResult>() {
            @Override
            public DisableBaselineResult call() throws Exception {
                DisableBaselineResult result = null;

                try {
                    result = executeDisableBaseline(finalRequest);
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
    public java.util.concurrent.Future<EnableBaselineResult> enableBaselineAsync(EnableBaselineRequest request) {

        return enableBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableBaselineResult> enableBaselineAsync(final EnableBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableBaselineRequest, EnableBaselineResult> asyncHandler) {
        final EnableBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableBaselineResult>() {
            @Override
            public EnableBaselineResult call() throws Exception {
                EnableBaselineResult result = null;

                try {
                    result = executeEnableBaseline(finalRequest);
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
    public java.util.concurrent.Future<GetBaselineResult> getBaselineAsync(GetBaselineRequest request) {

        return getBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBaselineResult> getBaselineAsync(final GetBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBaselineRequest, GetBaselineResult> asyncHandler) {
        final GetBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBaselineResult>() {
            @Override
            public GetBaselineResult call() throws Exception {
                GetBaselineResult result = null;

                try {
                    result = executeGetBaseline(finalRequest);
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
    public java.util.concurrent.Future<GetBaselineOperationResult> getBaselineOperationAsync(GetBaselineOperationRequest request) {

        return getBaselineOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBaselineOperationResult> getBaselineOperationAsync(final GetBaselineOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBaselineOperationRequest, GetBaselineOperationResult> asyncHandler) {
        final GetBaselineOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBaselineOperationResult>() {
            @Override
            public GetBaselineOperationResult call() throws Exception {
                GetBaselineOperationResult result = null;

                try {
                    result = executeGetBaselineOperation(finalRequest);
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
    public java.util.concurrent.Future<GetEnabledBaselineResult> getEnabledBaselineAsync(GetEnabledBaselineRequest request) {

        return getEnabledBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnabledBaselineResult> getEnabledBaselineAsync(final GetEnabledBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnabledBaselineRequest, GetEnabledBaselineResult> asyncHandler) {
        final GetEnabledBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnabledBaselineResult>() {
            @Override
            public GetEnabledBaselineResult call() throws Exception {
                GetEnabledBaselineResult result = null;

                try {
                    result = executeGetEnabledBaseline(finalRequest);
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
    public java.util.concurrent.Future<GetEnabledControlResult> getEnabledControlAsync(GetEnabledControlRequest request) {

        return getEnabledControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnabledControlResult> getEnabledControlAsync(final GetEnabledControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnabledControlRequest, GetEnabledControlResult> asyncHandler) {
        final GetEnabledControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnabledControlResult>() {
            @Override
            public GetEnabledControlResult call() throws Exception {
                GetEnabledControlResult result = null;

                try {
                    result = executeGetEnabledControl(finalRequest);
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
    public java.util.concurrent.Future<GetLandingZoneOperationResult> getLandingZoneOperationAsync(GetLandingZoneOperationRequest request) {

        return getLandingZoneOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLandingZoneOperationResult> getLandingZoneOperationAsync(final GetLandingZoneOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLandingZoneOperationRequest, GetLandingZoneOperationResult> asyncHandler) {
        final GetLandingZoneOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLandingZoneOperationResult>() {
            @Override
            public GetLandingZoneOperationResult call() throws Exception {
                GetLandingZoneOperationResult result = null;

                try {
                    result = executeGetLandingZoneOperation(finalRequest);
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
    public java.util.concurrent.Future<ListBaselinesResult> listBaselinesAsync(ListBaselinesRequest request) {

        return listBaselinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBaselinesResult> listBaselinesAsync(final ListBaselinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBaselinesRequest, ListBaselinesResult> asyncHandler) {
        final ListBaselinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBaselinesResult>() {
            @Override
            public ListBaselinesResult call() throws Exception {
                ListBaselinesResult result = null;

                try {
                    result = executeListBaselines(finalRequest);
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
    public java.util.concurrent.Future<ListControlOperationsResult> listControlOperationsAsync(ListControlOperationsRequest request) {

        return listControlOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListControlOperationsResult> listControlOperationsAsync(final ListControlOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListControlOperationsRequest, ListControlOperationsResult> asyncHandler) {
        final ListControlOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListControlOperationsResult>() {
            @Override
            public ListControlOperationsResult call() throws Exception {
                ListControlOperationsResult result = null;

                try {
                    result = executeListControlOperations(finalRequest);
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
    public java.util.concurrent.Future<ListEnabledBaselinesResult> listEnabledBaselinesAsync(ListEnabledBaselinesRequest request) {

        return listEnabledBaselinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnabledBaselinesResult> listEnabledBaselinesAsync(final ListEnabledBaselinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnabledBaselinesRequest, ListEnabledBaselinesResult> asyncHandler) {
        final ListEnabledBaselinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnabledBaselinesResult>() {
            @Override
            public ListEnabledBaselinesResult call() throws Exception {
                ListEnabledBaselinesResult result = null;

                try {
                    result = executeListEnabledBaselines(finalRequest);
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

    @Override
    public java.util.concurrent.Future<ListLandingZonesResult> listLandingZonesAsync(ListLandingZonesRequest request) {

        return listLandingZonesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLandingZonesResult> listLandingZonesAsync(final ListLandingZonesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLandingZonesRequest, ListLandingZonesResult> asyncHandler) {
        final ListLandingZonesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLandingZonesResult>() {
            @Override
            public ListLandingZonesResult call() throws Exception {
                ListLandingZonesResult result = null;

                try {
                    result = executeListLandingZones(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<ResetEnabledBaselineResult> resetEnabledBaselineAsync(ResetEnabledBaselineRequest request) {

        return resetEnabledBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetEnabledBaselineResult> resetEnabledBaselineAsync(final ResetEnabledBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetEnabledBaselineRequest, ResetEnabledBaselineResult> asyncHandler) {
        final ResetEnabledBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetEnabledBaselineResult>() {
            @Override
            public ResetEnabledBaselineResult call() throws Exception {
                ResetEnabledBaselineResult result = null;

                try {
                    result = executeResetEnabledBaseline(finalRequest);
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
    public java.util.concurrent.Future<ResetLandingZoneResult> resetLandingZoneAsync(ResetLandingZoneRequest request) {

        return resetLandingZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetLandingZoneResult> resetLandingZoneAsync(final ResetLandingZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetLandingZoneRequest, ResetLandingZoneResult> asyncHandler) {
        final ResetLandingZoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetLandingZoneResult>() {
            @Override
            public ResetLandingZoneResult call() throws Exception {
                ResetLandingZoneResult result = null;

                try {
                    result = executeResetLandingZone(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnabledBaselineResult> updateEnabledBaselineAsync(UpdateEnabledBaselineRequest request) {

        return updateEnabledBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnabledBaselineResult> updateEnabledBaselineAsync(final UpdateEnabledBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnabledBaselineRequest, UpdateEnabledBaselineResult> asyncHandler) {
        final UpdateEnabledBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnabledBaselineResult>() {
            @Override
            public UpdateEnabledBaselineResult call() throws Exception {
                UpdateEnabledBaselineResult result = null;

                try {
                    result = executeUpdateEnabledBaseline(finalRequest);
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
