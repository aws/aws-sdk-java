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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/StartSimulationJobBatch" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSimulationJobBatchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (arn) of the batch.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the simulation job batch.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The simulation job batch request is pending.
     * </p>
     * </dd>
     * <dt>InProgress</dt>
     * <dd>
     * <p>
     * The simulation job batch is in progress.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The simulation job batch failed. One or more simulation job requests could not be completed due to an internal
     * failure (like <code>InternalServiceError</code>). See <code>failureCode</code> and <code>failureReason</code> for
     * more information.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The simulation batch job completed. A batch is complete when (1) there are no pending simulation job requests in
     * the batch and none of the failed simulation job requests are due to <code>InternalServiceError</code> and (2)
     * when all created simulation jobs have reached a terminal state (for example, <code>Completed</code> or
     * <code>Failed</code>).
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The simulation batch job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The simulation batch job is being cancelled.
     * </p>
     * </dd>
     * <dt>Completing</dt>
     * <dd>
     * <p>
     * The simulation batch job is completing.
     * </p>
     * </dd>
     * <dt>TimingOut</dt>
     * <dd>
     * <p>
     * The simulation job batch is timing out.
     * </p>
     * <p>
     * If a batch timing out, and there are pending requests that were failing due to an internal failure (like
     * <code>InternalServiceError</code>), the batch status will be <code>Failed</code>. If there are no such failing
     * request, the batch status will be <code>TimedOut</code>.
     * </p>
     * </dd>
     * <dt>TimedOut</dt>
     * <dd>
     * <p>
     * The simulation batch job timed out.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The batch policy.
     * </p>
     */
    private BatchPolicy batchPolicy;
    /**
     * <p>
     * The failure code if the simulation job batch failed.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The reason the simulation job batch failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * A list of failed simulation job requests. The request failed to be created into a simulation job. Failed requests
     * do not have a simulation job ID.
     * </p>
     */
    private java.util.List<FailedCreateSimulationJobRequest> failedRequests;
    /**
     * <p>
     * A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
     * </p>
     */
    private java.util.List<SimulationJobRequest> pendingRequests;
    /**
     * <p>
     * A list of created simulation job request summaries.
     * </p>
     */
    private java.util.List<SimulationJobSummary> createdRequests;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job batch.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (arn) of the batch.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (arn) of the batch.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the batch.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of the batch.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the batch.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (arn) of the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the simulation job batch.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The simulation job batch request is pending.
     * </p>
     * </dd>
     * <dt>InProgress</dt>
     * <dd>
     * <p>
     * The simulation job batch is in progress.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The simulation job batch failed. One or more simulation job requests could not be completed due to an internal
     * failure (like <code>InternalServiceError</code>). See <code>failureCode</code> and <code>failureReason</code> for
     * more information.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The simulation batch job completed. A batch is complete when (1) there are no pending simulation job requests in
     * the batch and none of the failed simulation job requests are due to <code>InternalServiceError</code> and (2)
     * when all created simulation jobs have reached a terminal state (for example, <code>Completed</code> or
     * <code>Failed</code>).
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The simulation batch job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The simulation batch job is being cancelled.
     * </p>
     * </dd>
     * <dt>Completing</dt>
     * <dd>
     * <p>
     * The simulation batch job is completing.
     * </p>
     * </dd>
     * <dt>TimingOut</dt>
     * <dd>
     * <p>
     * The simulation job batch is timing out.
     * </p>
     * <p>
     * If a batch timing out, and there are pending requests that were failing due to an internal failure (like
     * <code>InternalServiceError</code>), the batch status will be <code>Failed</code>. If there are no such failing
     * request, the batch status will be <code>TimedOut</code>.
     * </p>
     * </dd>
     * <dt>TimedOut</dt>
     * <dd>
     * <p>
     * The simulation batch job timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the simulation job batch.</p>
     *        <dl>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch request is pending.
     *        </p>
     *        </dd>
     *        <dt>InProgress</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch is in progress.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch failed. One or more simulation job requests could not be completed due to an
     *        internal failure (like <code>InternalServiceError</code>). See <code>failureCode</code> and
     *        <code>failureReason</code> for more information.
     *        </p>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job completed. A batch is complete when (1) there are no pending simulation job
     *        requests in the batch and none of the failed simulation job requests are due to
     *        <code>InternalServiceError</code> and (2) when all created simulation jobs have reached a terminal state
     *        (for example, <code>Completed</code> or <code>Failed</code>).
     *        </p>
     *        </dd>
     *        <dt>Canceled</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job was cancelled.
     *        </p>
     *        </dd>
     *        <dt>Canceling</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job is being cancelled.
     *        </p>
     *        </dd>
     *        <dt>Completing</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job is completing.
     *        </p>
     *        </dd>
     *        <dt>TimingOut</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch is timing out.
     *        </p>
     *        <p>
     *        If a batch timing out, and there are pending requests that were failing due to an internal failure (like
     *        <code>InternalServiceError</code>), the batch status will be <code>Failed</code>. If there are no such
     *        failing request, the batch status will be <code>TimedOut</code>.
     *        </p>
     *        </dd>
     *        <dt>TimedOut</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job timed out.
     *        </p>
     *        </dd>
     * @see SimulationJobBatchStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the simulation job batch.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The simulation job batch request is pending.
     * </p>
     * </dd>
     * <dt>InProgress</dt>
     * <dd>
     * <p>
     * The simulation job batch is in progress.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The simulation job batch failed. One or more simulation job requests could not be completed due to an internal
     * failure (like <code>InternalServiceError</code>). See <code>failureCode</code> and <code>failureReason</code> for
     * more information.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The simulation batch job completed. A batch is complete when (1) there are no pending simulation job requests in
     * the batch and none of the failed simulation job requests are due to <code>InternalServiceError</code> and (2)
     * when all created simulation jobs have reached a terminal state (for example, <code>Completed</code> or
     * <code>Failed</code>).
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The simulation batch job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The simulation batch job is being cancelled.
     * </p>
     * </dd>
     * <dt>Completing</dt>
     * <dd>
     * <p>
     * The simulation batch job is completing.
     * </p>
     * </dd>
     * <dt>TimingOut</dt>
     * <dd>
     * <p>
     * The simulation job batch is timing out.
     * </p>
     * <p>
     * If a batch timing out, and there are pending requests that were failing due to an internal failure (like
     * <code>InternalServiceError</code>), the batch status will be <code>Failed</code>. If there are no such failing
     * request, the batch status will be <code>TimedOut</code>.
     * </p>
     * </dd>
     * <dt>TimedOut</dt>
     * <dd>
     * <p>
     * The simulation batch job timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The status of the simulation job batch.</p>
     *         <dl>
     *         <dt>Pending</dt>
     *         <dd>
     *         <p>
     *         The simulation job batch request is pending.
     *         </p>
     *         </dd>
     *         <dt>InProgress</dt>
     *         <dd>
     *         <p>
     *         The simulation job batch is in progress.
     *         </p>
     *         </dd>
     *         <dt>Failed</dt>
     *         <dd>
     *         <p>
     *         The simulation job batch failed. One or more simulation job requests could not be completed due to an
     *         internal failure (like <code>InternalServiceError</code>). See <code>failureCode</code> and
     *         <code>failureReason</code> for more information.
     *         </p>
     *         </dd>
     *         <dt>Completed</dt>
     *         <dd>
     *         <p>
     *         The simulation batch job completed. A batch is complete when (1) there are no pending simulation job
     *         requests in the batch and none of the failed simulation job requests are due to
     *         <code>InternalServiceError</code> and (2) when all created simulation jobs have reached a terminal state
     *         (for example, <code>Completed</code> or <code>Failed</code>).
     *         </p>
     *         </dd>
     *         <dt>Canceled</dt>
     *         <dd>
     *         <p>
     *         The simulation batch job was cancelled.
     *         </p>
     *         </dd>
     *         <dt>Canceling</dt>
     *         <dd>
     *         <p>
     *         The simulation batch job is being cancelled.
     *         </p>
     *         </dd>
     *         <dt>Completing</dt>
     *         <dd>
     *         <p>
     *         The simulation batch job is completing.
     *         </p>
     *         </dd>
     *         <dt>TimingOut</dt>
     *         <dd>
     *         <p>
     *         The simulation job batch is timing out.
     *         </p>
     *         <p>
     *         If a batch timing out, and there are pending requests that were failing due to an internal failure (like
     *         <code>InternalServiceError</code>), the batch status will be <code>Failed</code>. If there are no such
     *         failing request, the batch status will be <code>TimedOut</code>.
     *         </p>
     *         </dd>
     *         <dt>TimedOut</dt>
     *         <dd>
     *         <p>
     *         The simulation batch job timed out.
     *         </p>
     *         </dd>
     * @see SimulationJobBatchStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the simulation job batch.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The simulation job batch request is pending.
     * </p>
     * </dd>
     * <dt>InProgress</dt>
     * <dd>
     * <p>
     * The simulation job batch is in progress.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The simulation job batch failed. One or more simulation job requests could not be completed due to an internal
     * failure (like <code>InternalServiceError</code>). See <code>failureCode</code> and <code>failureReason</code> for
     * more information.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The simulation batch job completed. A batch is complete when (1) there are no pending simulation job requests in
     * the batch and none of the failed simulation job requests are due to <code>InternalServiceError</code> and (2)
     * when all created simulation jobs have reached a terminal state (for example, <code>Completed</code> or
     * <code>Failed</code>).
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The simulation batch job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The simulation batch job is being cancelled.
     * </p>
     * </dd>
     * <dt>Completing</dt>
     * <dd>
     * <p>
     * The simulation batch job is completing.
     * </p>
     * </dd>
     * <dt>TimingOut</dt>
     * <dd>
     * <p>
     * The simulation job batch is timing out.
     * </p>
     * <p>
     * If a batch timing out, and there are pending requests that were failing due to an internal failure (like
     * <code>InternalServiceError</code>), the batch status will be <code>Failed</code>. If there are no such failing
     * request, the batch status will be <code>TimedOut</code>.
     * </p>
     * </dd>
     * <dt>TimedOut</dt>
     * <dd>
     * <p>
     * The simulation batch job timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the simulation job batch.</p>
     *        <dl>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch request is pending.
     *        </p>
     *        </dd>
     *        <dt>InProgress</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch is in progress.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch failed. One or more simulation job requests could not be completed due to an
     *        internal failure (like <code>InternalServiceError</code>). See <code>failureCode</code> and
     *        <code>failureReason</code> for more information.
     *        </p>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job completed. A batch is complete when (1) there are no pending simulation job
     *        requests in the batch and none of the failed simulation job requests are due to
     *        <code>InternalServiceError</code> and (2) when all created simulation jobs have reached a terminal state
     *        (for example, <code>Completed</code> or <code>Failed</code>).
     *        </p>
     *        </dd>
     *        <dt>Canceled</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job was cancelled.
     *        </p>
     *        </dd>
     *        <dt>Canceling</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job is being cancelled.
     *        </p>
     *        </dd>
     *        <dt>Completing</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job is completing.
     *        </p>
     *        </dd>
     *        <dt>TimingOut</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch is timing out.
     *        </p>
     *        <p>
     *        If a batch timing out, and there are pending requests that were failing due to an internal failure (like
     *        <code>InternalServiceError</code>), the batch status will be <code>Failed</code>. If there are no such
     *        failing request, the batch status will be <code>TimedOut</code>.
     *        </p>
     *        </dd>
     *        <dt>TimedOut</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job timed out.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobBatchStatus
     */

    public StartSimulationJobBatchResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the simulation job batch.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The simulation job batch request is pending.
     * </p>
     * </dd>
     * <dt>InProgress</dt>
     * <dd>
     * <p>
     * The simulation job batch is in progress.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The simulation job batch failed. One or more simulation job requests could not be completed due to an internal
     * failure (like <code>InternalServiceError</code>). See <code>failureCode</code> and <code>failureReason</code> for
     * more information.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The simulation batch job completed. A batch is complete when (1) there are no pending simulation job requests in
     * the batch and none of the failed simulation job requests are due to <code>InternalServiceError</code> and (2)
     * when all created simulation jobs have reached a terminal state (for example, <code>Completed</code> or
     * <code>Failed</code>).
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The simulation batch job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The simulation batch job is being cancelled.
     * </p>
     * </dd>
     * <dt>Completing</dt>
     * <dd>
     * <p>
     * The simulation batch job is completing.
     * </p>
     * </dd>
     * <dt>TimingOut</dt>
     * <dd>
     * <p>
     * The simulation job batch is timing out.
     * </p>
     * <p>
     * If a batch timing out, and there are pending requests that were failing due to an internal failure (like
     * <code>InternalServiceError</code>), the batch status will be <code>Failed</code>. If there are no such failing
     * request, the batch status will be <code>TimedOut</code>.
     * </p>
     * </dd>
     * <dt>TimedOut</dt>
     * <dd>
     * <p>
     * The simulation batch job timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the simulation job batch.</p>
     *        <dl>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch request is pending.
     *        </p>
     *        </dd>
     *        <dt>InProgress</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch is in progress.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch failed. One or more simulation job requests could not be completed due to an
     *        internal failure (like <code>InternalServiceError</code>). See <code>failureCode</code> and
     *        <code>failureReason</code> for more information.
     *        </p>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job completed. A batch is complete when (1) there are no pending simulation job
     *        requests in the batch and none of the failed simulation job requests are due to
     *        <code>InternalServiceError</code> and (2) when all created simulation jobs have reached a terminal state
     *        (for example, <code>Completed</code> or <code>Failed</code>).
     *        </p>
     *        </dd>
     *        <dt>Canceled</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job was cancelled.
     *        </p>
     *        </dd>
     *        <dt>Canceling</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job is being cancelled.
     *        </p>
     *        </dd>
     *        <dt>Completing</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job is completing.
     *        </p>
     *        </dd>
     *        <dt>TimingOut</dt>
     *        <dd>
     *        <p>
     *        The simulation job batch is timing out.
     *        </p>
     *        <p>
     *        If a batch timing out, and there are pending requests that were failing due to an internal failure (like
     *        <code>InternalServiceError</code>), the batch status will be <code>Failed</code>. If there are no such
     *        failing request, the batch status will be <code>TimedOut</code>.
     *        </p>
     *        </dd>
     *        <dt>TimedOut</dt>
     *        <dd>
     *        <p>
     *        The simulation batch job timed out.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobBatchStatus
     */

    public StartSimulationJobBatchResult withStatus(SimulationJobBatchStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the simulation job batch was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the simulation job batch was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the simulation job batch was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The batch policy.
     * </p>
     * 
     * @param batchPolicy
     *        The batch policy.
     */

    public void setBatchPolicy(BatchPolicy batchPolicy) {
        this.batchPolicy = batchPolicy;
    }

    /**
     * <p>
     * The batch policy.
     * </p>
     * 
     * @return The batch policy.
     */

    public BatchPolicy getBatchPolicy() {
        return this.batchPolicy;
    }

    /**
     * <p>
     * The batch policy.
     * </p>
     * 
     * @param batchPolicy
     *        The batch policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withBatchPolicy(BatchPolicy batchPolicy) {
        setBatchPolicy(batchPolicy);
        return this;
    }

    /**
     * <p>
     * The failure code if the simulation job batch failed.
     * </p>
     * 
     * @param failureCode
     *        The failure code if the simulation job batch failed.
     * @see SimulationJobBatchErrorCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code if the simulation job batch failed.
     * </p>
     * 
     * @return The failure code if the simulation job batch failed.
     * @see SimulationJobBatchErrorCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code if the simulation job batch failed.
     * </p>
     * 
     * @param failureCode
     *        The failure code if the simulation job batch failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobBatchErrorCode
     */

    public StartSimulationJobBatchResult withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure code if the simulation job batch failed.
     * </p>
     * 
     * @param failureCode
     *        The failure code if the simulation job batch failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobBatchErrorCode
     */

    public StartSimulationJobBatchResult withFailureCode(SimulationJobBatchErrorCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * <p>
     * The reason the simulation job batch failed.
     * </p>
     * 
     * @param failureReason
     *        The reason the simulation job batch failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason the simulation job batch failed.
     * </p>
     * 
     * @return The reason the simulation job batch failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason the simulation job batch failed.
     * </p>
     * 
     * @param failureReason
     *        The reason the simulation job batch failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * A list of failed simulation job requests. The request failed to be created into a simulation job. Failed requests
     * do not have a simulation job ID.
     * </p>
     * 
     * @return A list of failed simulation job requests. The request failed to be created into a simulation job. Failed
     *         requests do not have a simulation job ID.
     */

    public java.util.List<FailedCreateSimulationJobRequest> getFailedRequests() {
        return failedRequests;
    }

    /**
     * <p>
     * A list of failed simulation job requests. The request failed to be created into a simulation job. Failed requests
     * do not have a simulation job ID.
     * </p>
     * 
     * @param failedRequests
     *        A list of failed simulation job requests. The request failed to be created into a simulation job. Failed
     *        requests do not have a simulation job ID.
     */

    public void setFailedRequests(java.util.Collection<FailedCreateSimulationJobRequest> failedRequests) {
        if (failedRequests == null) {
            this.failedRequests = null;
            return;
        }

        this.failedRequests = new java.util.ArrayList<FailedCreateSimulationJobRequest>(failedRequests);
    }

    /**
     * <p>
     * A list of failed simulation job requests. The request failed to be created into a simulation job. Failed requests
     * do not have a simulation job ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedRequests(java.util.Collection)} or {@link #withFailedRequests(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failedRequests
     *        A list of failed simulation job requests. The request failed to be created into a simulation job. Failed
     *        requests do not have a simulation job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withFailedRequests(FailedCreateSimulationJobRequest... failedRequests) {
        if (this.failedRequests == null) {
            setFailedRequests(new java.util.ArrayList<FailedCreateSimulationJobRequest>(failedRequests.length));
        }
        for (FailedCreateSimulationJobRequest ele : failedRequests) {
            this.failedRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of failed simulation job requests. The request failed to be created into a simulation job. Failed requests
     * do not have a simulation job ID.
     * </p>
     * 
     * @param failedRequests
     *        A list of failed simulation job requests. The request failed to be created into a simulation job. Failed
     *        requests do not have a simulation job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withFailedRequests(java.util.Collection<FailedCreateSimulationJobRequest> failedRequests) {
        setFailedRequests(failedRequests);
        return this;
    }

    /**
     * <p>
     * A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
     * </p>
     * 
     * @return A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
     */

    public java.util.List<SimulationJobRequest> getPendingRequests() {
        return pendingRequests;
    }

    /**
     * <p>
     * A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
     * </p>
     * 
     * @param pendingRequests
     *        A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
     */

    public void setPendingRequests(java.util.Collection<SimulationJobRequest> pendingRequests) {
        if (pendingRequests == null) {
            this.pendingRequests = null;
            return;
        }

        this.pendingRequests = new java.util.ArrayList<SimulationJobRequest>(pendingRequests);
    }

    /**
     * <p>
     * A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPendingRequests(java.util.Collection)} or {@link #withPendingRequests(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pendingRequests
     *        A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withPendingRequests(SimulationJobRequest... pendingRequests) {
        if (this.pendingRequests == null) {
            setPendingRequests(new java.util.ArrayList<SimulationJobRequest>(pendingRequests.length));
        }
        for (SimulationJobRequest ele : pendingRequests) {
            this.pendingRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
     * </p>
     * 
     * @param pendingRequests
     *        A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withPendingRequests(java.util.Collection<SimulationJobRequest> pendingRequests) {
        setPendingRequests(pendingRequests);
        return this;
    }

    /**
     * <p>
     * A list of created simulation job request summaries.
     * </p>
     * 
     * @return A list of created simulation job request summaries.
     */

    public java.util.List<SimulationJobSummary> getCreatedRequests() {
        return createdRequests;
    }

    /**
     * <p>
     * A list of created simulation job request summaries.
     * </p>
     * 
     * @param createdRequests
     *        A list of created simulation job request summaries.
     */

    public void setCreatedRequests(java.util.Collection<SimulationJobSummary> createdRequests) {
        if (createdRequests == null) {
            this.createdRequests = null;
            return;
        }

        this.createdRequests = new java.util.ArrayList<SimulationJobSummary>(createdRequests);
    }

    /**
     * <p>
     * A list of created simulation job request summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreatedRequests(java.util.Collection)} or {@link #withCreatedRequests(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param createdRequests
     *        A list of created simulation job request summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withCreatedRequests(SimulationJobSummary... createdRequests) {
        if (this.createdRequests == null) {
            setCreatedRequests(new java.util.ArrayList<SimulationJobSummary>(createdRequests.length));
        }
        for (SimulationJobSummary ele : createdRequests) {
            this.createdRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of created simulation job request summaries.
     * </p>
     * 
     * @param createdRequests
     *        A list of created simulation job request summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withCreatedRequests(java.util.Collection<SimulationJobSummary> createdRequests) {
        setCreatedRequests(createdRequests);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job batch.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the deployment job batch.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job batch.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the deployment job batch.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job batch.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the deployment job batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartSimulationJobBatchResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getBatchPolicy() != null)
            sb.append("BatchPolicy: ").append(getBatchPolicy()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getFailedRequests() != null)
            sb.append("FailedRequests: ").append(getFailedRequests()).append(",");
        if (getPendingRequests() != null)
            sb.append("PendingRequests: ").append(getPendingRequests()).append(",");
        if (getCreatedRequests() != null)
            sb.append("CreatedRequests: ").append(getCreatedRequests()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSimulationJobBatchResult == false)
            return false;
        StartSimulationJobBatchResult other = (StartSimulationJobBatchResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getBatchPolicy() == null ^ this.getBatchPolicy() == null)
            return false;
        if (other.getBatchPolicy() != null && other.getBatchPolicy().equals(this.getBatchPolicy()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getFailedRequests() == null ^ this.getFailedRequests() == null)
            return false;
        if (other.getFailedRequests() != null && other.getFailedRequests().equals(this.getFailedRequests()) == false)
            return false;
        if (other.getPendingRequests() == null ^ this.getPendingRequests() == null)
            return false;
        if (other.getPendingRequests() != null && other.getPendingRequests().equals(this.getPendingRequests()) == false)
            return false;
        if (other.getCreatedRequests() == null ^ this.getCreatedRequests() == null)
            return false;
        if (other.getCreatedRequests() != null && other.getCreatedRequests().equals(this.getCreatedRequests()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getBatchPolicy() == null) ? 0 : getBatchPolicy().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getFailedRequests() == null) ? 0 : getFailedRequests().hashCode());
        hashCode = prime * hashCode + ((getPendingRequests() == null) ? 0 : getPendingRequests().hashCode());
        hashCode = prime * hashCode + ((getCreatedRequests() == null) ? 0 : getCreatedRequests().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartSimulationJobBatchResult clone() {
        try {
            return (StartSimulationJobBatchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
