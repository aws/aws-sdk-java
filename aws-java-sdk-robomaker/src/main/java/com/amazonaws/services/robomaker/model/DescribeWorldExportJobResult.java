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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeWorldExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorldExportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world export job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the world export job.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The world export job request is pending.
     * </p>
     * </dd>
     * <dt>Running</dt>
     * <dd>
     * <p>
     * The world export job is running.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The world export job completed.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The world export job failed. See <code>failureCode</code> and <code>failureReason</code> for more information.
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The world export job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The world export job is being cancelled.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world export job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The failure code of the world export job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>LimitExceeded</dt>
     * <dd>
     * <p>
     * The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds
     * the maximum number allowed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * The specified resource could not be found.
     * </p>
     * </dd>
     * <dt>RequestThrottled</dt>
     * <dd>
     * <p>
     * The request was throttled.
     * </p>
     * </dd>
     * <dt>InvalidInput</dt>
     * <dd>
     * <p>
     * An input parameter in the request is not valid.
     * </p>
     * </dd>
     * </dl>
     */
    private String failureCode;
    /**
     * <p>
     * The reason why the world export job failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to be exported.
     * </p>
     */
    private java.util.List<String> worlds;

    private OutputLocation outputLocation;
    /**
     * <p>
     * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     * </p>
     */
    private String iamRole;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world export job.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world export job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the world export job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world export job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the world export job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world export job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the world export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorldExportJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the world export job.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The world export job request is pending.
     * </p>
     * </dd>
     * <dt>Running</dt>
     * <dd>
     * <p>
     * The world export job is running.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The world export job completed.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The world export job failed. See <code>failureCode</code> and <code>failureReason</code> for more information.
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The world export job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The world export job is being cancelled.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the world export job.</p>
     *        <dl>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The world export job request is pending.
     *        </p>
     *        </dd>
     *        <dt>Running</dt>
     *        <dd>
     *        <p>
     *        The world export job is running.
     *        </p>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <p>
     *        The world export job completed.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The world export job failed. See <code>failureCode</code> and <code>failureReason</code> for more
     *        information.
     *        </p>
     *        </dd>
     *        <dt>Canceled</dt>
     *        <dd>
     *        <p>
     *        The world export job was cancelled.
     *        </p>
     *        </dd>
     *        <dt>Canceling</dt>
     *        <dd>
     *        <p>
     *        The world export job is being cancelled.
     *        </p>
     *        </dd>
     * @see WorldExportJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the world export job.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The world export job request is pending.
     * </p>
     * </dd>
     * <dt>Running</dt>
     * <dd>
     * <p>
     * The world export job is running.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The world export job completed.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The world export job failed. See <code>failureCode</code> and <code>failureReason</code> for more information.
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The world export job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The world export job is being cancelled.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The status of the world export job.</p>
     *         <dl>
     *         <dt>Pending</dt>
     *         <dd>
     *         <p>
     *         The world export job request is pending.
     *         </p>
     *         </dd>
     *         <dt>Running</dt>
     *         <dd>
     *         <p>
     *         The world export job is running.
     *         </p>
     *         </dd>
     *         <dt>Completed</dt>
     *         <dd>
     *         <p>
     *         The world export job completed.
     *         </p>
     *         </dd>
     *         <dt>Failed</dt>
     *         <dd>
     *         <p>
     *         The world export job failed. See <code>failureCode</code> and <code>failureReason</code> for more
     *         information.
     *         </p>
     *         </dd>
     *         <dt>Canceled</dt>
     *         <dd>
     *         <p>
     *         The world export job was cancelled.
     *         </p>
     *         </dd>
     *         <dt>Canceling</dt>
     *         <dd>
     *         <p>
     *         The world export job is being cancelled.
     *         </p>
     *         </dd>
     * @see WorldExportJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the world export job.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The world export job request is pending.
     * </p>
     * </dd>
     * <dt>Running</dt>
     * <dd>
     * <p>
     * The world export job is running.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The world export job completed.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The world export job failed. See <code>failureCode</code> and <code>failureReason</code> for more information.
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The world export job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The world export job is being cancelled.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the world export job.</p>
     *        <dl>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The world export job request is pending.
     *        </p>
     *        </dd>
     *        <dt>Running</dt>
     *        <dd>
     *        <p>
     *        The world export job is running.
     *        </p>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <p>
     *        The world export job completed.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The world export job failed. See <code>failureCode</code> and <code>failureReason</code> for more
     *        information.
     *        </p>
     *        </dd>
     *        <dt>Canceled</dt>
     *        <dd>
     *        <p>
     *        The world export job was cancelled.
     *        </p>
     *        </dd>
     *        <dt>Canceling</dt>
     *        <dd>
     *        <p>
     *        The world export job is being cancelled.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorldExportJobStatus
     */

    public DescribeWorldExportJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the world export job.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The world export job request is pending.
     * </p>
     * </dd>
     * <dt>Running</dt>
     * <dd>
     * <p>
     * The world export job is running.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The world export job completed.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The world export job failed. See <code>failureCode</code> and <code>failureReason</code> for more information.
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The world export job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The world export job is being cancelled.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the world export job.</p>
     *        <dl>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The world export job request is pending.
     *        </p>
     *        </dd>
     *        <dt>Running</dt>
     *        <dd>
     *        <p>
     *        The world export job is running.
     *        </p>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <p>
     *        The world export job completed.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The world export job failed. See <code>failureCode</code> and <code>failureReason</code> for more
     *        information.
     *        </p>
     *        </dd>
     *        <dt>Canceled</dt>
     *        <dd>
     *        <p>
     *        The world export job was cancelled.
     *        </p>
     *        </dd>
     *        <dt>Canceling</dt>
     *        <dd>
     *        <p>
     *        The world export job is being cancelled.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorldExportJobStatus
     */

    public DescribeWorldExportJobResult withStatus(WorldExportJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world export job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the world export job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world export job was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the world export job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world export job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the world export job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorldExportJobResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The failure code of the world export job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>LimitExceeded</dt>
     * <dd>
     * <p>
     * The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds
     * the maximum number allowed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * The specified resource could not be found.
     * </p>
     * </dd>
     * <dt>RequestThrottled</dt>
     * <dd>
     * <p>
     * The request was throttled.
     * </p>
     * </dd>
     * <dt>InvalidInput</dt>
     * <dd>
     * <p>
     * An input parameter in the request is not valid.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the world export job if it failed:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>LimitExceeded</dt>
     *        <dd>
     *        <p>
     *        The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *        exceeds the maximum number allowed.
     *        </p>
     *        </dd>
     *        <dt>ResourceNotFound</dt>
     *        <dd>
     *        <p>
     *        The specified resource could not be found.
     *        </p>
     *        </dd>
     *        <dt>RequestThrottled</dt>
     *        <dd>
     *        <p>
     *        The request was throttled.
     *        </p>
     *        </dd>
     *        <dt>InvalidInput</dt>
     *        <dd>
     *        <p>
     *        An input parameter in the request is not valid.
     *        </p>
     *        </dd>
     * @see WorldExportJobErrorCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code of the world export job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>LimitExceeded</dt>
     * <dd>
     * <p>
     * The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds
     * the maximum number allowed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * The specified resource could not be found.
     * </p>
     * </dd>
     * <dt>RequestThrottled</dt>
     * <dd>
     * <p>
     * The request was throttled.
     * </p>
     * </dd>
     * <dt>InvalidInput</dt>
     * <dd>
     * <p>
     * An input parameter in the request is not valid.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The failure code of the world export job if it failed:</p>
     *         <dl>
     *         <dt>InternalServiceError</dt>
     *         <dd>
     *         <p>
     *         Internal service error.
     *         </p>
     *         </dd>
     *         <dt>LimitExceeded</dt>
     *         <dd>
     *         <p>
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     *         </p>
     *         </dd>
     *         <dt>ResourceNotFound</dt>
     *         <dd>
     *         <p>
     *         The specified resource could not be found.
     *         </p>
     *         </dd>
     *         <dt>RequestThrottled</dt>
     *         <dd>
     *         <p>
     *         The request was throttled.
     *         </p>
     *         </dd>
     *         <dt>InvalidInput</dt>
     *         <dd>
     *         <p>
     *         An input parameter in the request is not valid.
     *         </p>
     *         </dd>
     * @see WorldExportJobErrorCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code of the world export job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>LimitExceeded</dt>
     * <dd>
     * <p>
     * The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds
     * the maximum number allowed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * The specified resource could not be found.
     * </p>
     * </dd>
     * <dt>RequestThrottled</dt>
     * <dd>
     * <p>
     * The request was throttled.
     * </p>
     * </dd>
     * <dt>InvalidInput</dt>
     * <dd>
     * <p>
     * An input parameter in the request is not valid.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the world export job if it failed:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>LimitExceeded</dt>
     *        <dd>
     *        <p>
     *        The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *        exceeds the maximum number allowed.
     *        </p>
     *        </dd>
     *        <dt>ResourceNotFound</dt>
     *        <dd>
     *        <p>
     *        The specified resource could not be found.
     *        </p>
     *        </dd>
     *        <dt>RequestThrottled</dt>
     *        <dd>
     *        <p>
     *        The request was throttled.
     *        </p>
     *        </dd>
     *        <dt>InvalidInput</dt>
     *        <dd>
     *        <p>
     *        An input parameter in the request is not valid.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorldExportJobErrorCode
     */

    public DescribeWorldExportJobResult withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure code of the world export job if it failed:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>LimitExceeded</dt>
     * <dd>
     * <p>
     * The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds
     * the maximum number allowed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * The specified resource could not be found.
     * </p>
     * </dd>
     * <dt>RequestThrottled</dt>
     * <dd>
     * <p>
     * The request was throttled.
     * </p>
     * </dd>
     * <dt>InvalidInput</dt>
     * <dd>
     * <p>
     * An input parameter in the request is not valid.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the world export job if it failed:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>LimitExceeded</dt>
     *        <dd>
     *        <p>
     *        The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *        exceeds the maximum number allowed.
     *        </p>
     *        </dd>
     *        <dt>ResourceNotFound</dt>
     *        <dd>
     *        <p>
     *        The specified resource could not be found.
     *        </p>
     *        </dd>
     *        <dt>RequestThrottled</dt>
     *        <dd>
     *        <p>
     *        The request was throttled.
     *        </p>
     *        </dd>
     *        <dt>InvalidInput</dt>
     *        <dd>
     *        <p>
     *        An input parameter in the request is not valid.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorldExportJobErrorCode
     */

    public DescribeWorldExportJobResult withFailureCode(WorldExportJobErrorCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * <p>
     * The reason why the world export job failed.
     * </p>
     * 
     * @param failureReason
     *        The reason why the world export job failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why the world export job failed.
     * </p>
     * 
     * @return The reason why the world export job failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason why the world export job failed.
     * </p>
     * 
     * @param failureReason
     *        The reason why the world export job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorldExportJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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

    public DescribeWorldExportJobResult withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to be exported.
     * </p>
     * 
     * @return A list of Amazon Resource Names (arns) that correspond to worlds to be exported.
     */

    public java.util.List<String> getWorlds() {
        return worlds;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to be exported.
     * </p>
     * 
     * @param worlds
     *        A list of Amazon Resource Names (arns) that correspond to worlds to be exported.
     */

    public void setWorlds(java.util.Collection<String> worlds) {
        if (worlds == null) {
            this.worlds = null;
            return;
        }

        this.worlds = new java.util.ArrayList<String>(worlds);
    }

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to be exported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorlds(java.util.Collection)} or {@link #withWorlds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param worlds
     *        A list of Amazon Resource Names (arns) that correspond to worlds to be exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorldExportJobResult withWorlds(String... worlds) {
        if (this.worlds == null) {
            setWorlds(new java.util.ArrayList<String>(worlds.length));
        }
        for (String ele : worlds) {
            this.worlds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to be exported.
     * </p>
     * 
     * @param worlds
     *        A list of Amazon Resource Names (arns) that correspond to worlds to be exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorldExportJobResult withWorlds(java.util.Collection<String> worlds) {
        setWorlds(worlds);
        return this;
    }

    /**
     * @param outputLocation
     */

    public void setOutputLocation(OutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * @return
     */

    public OutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * @param outputLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorldExportJobResult withOutputLocation(OutputLocation outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     * </p>
     * 
     * @param iamRole
     *        The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     * </p>
     * 
     * @return The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     * </p>
     * 
     * @param iamRole
     *        The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorldExportJobResult withIamRole(String iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world export job.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the world export job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world export job.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the world export job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world export job.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the world export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorldExportJobResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeWorldExportJobResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorldExportJobResult addTagsEntry(String key, String value) {
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

    public DescribeWorldExportJobResult clearTagsEntries() {
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
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getWorlds() != null)
            sb.append("Worlds: ").append(getWorlds()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
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

        if (obj instanceof DescribeWorldExportJobResult == false)
            return false;
        DescribeWorldExportJobResult other = (DescribeWorldExportJobResult) obj;
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
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getWorlds() == null ^ this.getWorlds() == null)
            return false;
        if (other.getWorlds() != null && other.getWorlds().equals(this.getWorlds()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
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
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getWorlds() == null) ? 0 : getWorlds().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorldExportJobResult clone() {
        try {
            return (DescribeWorldExportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
