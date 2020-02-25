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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a simulation job batch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/SimulationJobBatchSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulationJobBatchSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch was created.
     * </p>
     */
    private java.util.Date createdAt;
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
     * The number of failed simulation job requests.
     * </p>
     */
    private Integer failedRequestCount;
    /**
     * <p>
     * The number of pending simulation job requests.
     * </p>
     */
    private Integer pendingRequestCount;
    /**
     * <p>
     * The number of created simulation job requests.
     * </p>
     */
    private Integer createdRequestCount;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the batch.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the batch.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobBatchSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the simulation job batch was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the simulation job batch was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the simulation job batch was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobBatchSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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

    public SimulationJobBatchSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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

    public SimulationJobBatchSummary withStatus(String status) {
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

    public SimulationJobBatchSummary withStatus(SimulationJobBatchStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The number of failed simulation job requests.
     * </p>
     * 
     * @param failedRequestCount
     *        The number of failed simulation job requests.
     */

    public void setFailedRequestCount(Integer failedRequestCount) {
        this.failedRequestCount = failedRequestCount;
    }

    /**
     * <p>
     * The number of failed simulation job requests.
     * </p>
     * 
     * @return The number of failed simulation job requests.
     */

    public Integer getFailedRequestCount() {
        return this.failedRequestCount;
    }

    /**
     * <p>
     * The number of failed simulation job requests.
     * </p>
     * 
     * @param failedRequestCount
     *        The number of failed simulation job requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobBatchSummary withFailedRequestCount(Integer failedRequestCount) {
        setFailedRequestCount(failedRequestCount);
        return this;
    }

    /**
     * <p>
     * The number of pending simulation job requests.
     * </p>
     * 
     * @param pendingRequestCount
     *        The number of pending simulation job requests.
     */

    public void setPendingRequestCount(Integer pendingRequestCount) {
        this.pendingRequestCount = pendingRequestCount;
    }

    /**
     * <p>
     * The number of pending simulation job requests.
     * </p>
     * 
     * @return The number of pending simulation job requests.
     */

    public Integer getPendingRequestCount() {
        return this.pendingRequestCount;
    }

    /**
     * <p>
     * The number of pending simulation job requests.
     * </p>
     * 
     * @param pendingRequestCount
     *        The number of pending simulation job requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobBatchSummary withPendingRequestCount(Integer pendingRequestCount) {
        setPendingRequestCount(pendingRequestCount);
        return this;
    }

    /**
     * <p>
     * The number of created simulation job requests.
     * </p>
     * 
     * @param createdRequestCount
     *        The number of created simulation job requests.
     */

    public void setCreatedRequestCount(Integer createdRequestCount) {
        this.createdRequestCount = createdRequestCount;
    }

    /**
     * <p>
     * The number of created simulation job requests.
     * </p>
     * 
     * @return The number of created simulation job requests.
     */

    public Integer getCreatedRequestCount() {
        return this.createdRequestCount;
    }

    /**
     * <p>
     * The number of created simulation job requests.
     * </p>
     * 
     * @param createdRequestCount
     *        The number of created simulation job requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobBatchSummary withCreatedRequestCount(Integer createdRequestCount) {
        setCreatedRequestCount(createdRequestCount);
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
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailedRequestCount() != null)
            sb.append("FailedRequestCount: ").append(getFailedRequestCount()).append(",");
        if (getPendingRequestCount() != null)
            sb.append("PendingRequestCount: ").append(getPendingRequestCount()).append(",");
        if (getCreatedRequestCount() != null)
            sb.append("CreatedRequestCount: ").append(getCreatedRequestCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimulationJobBatchSummary == false)
            return false;
        SimulationJobBatchSummary other = (SimulationJobBatchSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailedRequestCount() == null ^ this.getFailedRequestCount() == null)
            return false;
        if (other.getFailedRequestCount() != null && other.getFailedRequestCount().equals(this.getFailedRequestCount()) == false)
            return false;
        if (other.getPendingRequestCount() == null ^ this.getPendingRequestCount() == null)
            return false;
        if (other.getPendingRequestCount() != null && other.getPendingRequestCount().equals(this.getPendingRequestCount()) == false)
            return false;
        if (other.getCreatedRequestCount() == null ^ this.getCreatedRequestCount() == null)
            return false;
        if (other.getCreatedRequestCount() != null && other.getCreatedRequestCount().equals(this.getCreatedRequestCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailedRequestCount() == null) ? 0 : getFailedRequestCount().hashCode());
        hashCode = prime * hashCode + ((getPendingRequestCount() == null) ? 0 : getPendingRequestCount().hashCode());
        hashCode = prime * hashCode + ((getCreatedRequestCount() == null) ? 0 : getCreatedRequestCount().hashCode());
        return hashCode;
    }

    @Override
    public SimulationJobBatchSummary clone() {
        try {
            return (SimulationJobBatchSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.SimulationJobBatchSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
