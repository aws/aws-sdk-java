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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateWorldGenerationJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorldGenerationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world generator job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the world generator job.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The world generator job request is pending.
     * </p>
     * </dd>
     * <dt>Running</dt>
     * <dd>
     * <p>
     * The world generator job is running.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The world generator job completed.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The world generator job failed. See <code>failureCode</code> for more information.
     * </p>
     * </dd>
     * <dt>PartialFailed</dt>
     * <dd>
     * <p>
     * Some worlds did not generate.
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The world generator job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The world generator job is being cancelled.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world generator job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The failure code of the world generator job if it failed:
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
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     */
    private String template;
    /**
     * <p>
     * Information about the world count.
     * </p>
     */
    private WorldCount worldCount;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world generator job.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the generated worlds.
     * </p>
     */
    private java.util.Map<String, String> worldTags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world generator job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the world generator job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world generator job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the world generator job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world generator job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the world generator job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the world generator job.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The world generator job request is pending.
     * </p>
     * </dd>
     * <dt>Running</dt>
     * <dd>
     * <p>
     * The world generator job is running.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The world generator job completed.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The world generator job failed. See <code>failureCode</code> for more information.
     * </p>
     * </dd>
     * <dt>PartialFailed</dt>
     * <dd>
     * <p>
     * Some worlds did not generate.
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The world generator job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The world generator job is being cancelled.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the world generator job.</p>
     *        <dl>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The world generator job request is pending.
     *        </p>
     *        </dd>
     *        <dt>Running</dt>
     *        <dd>
     *        <p>
     *        The world generator job is running.
     *        </p>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <p>
     *        The world generator job completed.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The world generator job failed. See <code>failureCode</code> for more information.
     *        </p>
     *        </dd>
     *        <dt>PartialFailed</dt>
     *        <dd>
     *        <p>
     *        Some worlds did not generate.
     *        </p>
     *        </dd>
     *        <dt>Canceled</dt>
     *        <dd>
     *        <p>
     *        The world generator job was cancelled.
     *        </p>
     *        </dd>
     *        <dt>Canceling</dt>
     *        <dd>
     *        <p>
     *        The world generator job is being cancelled.
     *        </p>
     *        </dd>
     * @see WorldGenerationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the world generator job.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The world generator job request is pending.
     * </p>
     * </dd>
     * <dt>Running</dt>
     * <dd>
     * <p>
     * The world generator job is running.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The world generator job completed.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The world generator job failed. See <code>failureCode</code> for more information.
     * </p>
     * </dd>
     * <dt>PartialFailed</dt>
     * <dd>
     * <p>
     * Some worlds did not generate.
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The world generator job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The world generator job is being cancelled.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The status of the world generator job.</p>
     *         <dl>
     *         <dt>Pending</dt>
     *         <dd>
     *         <p>
     *         The world generator job request is pending.
     *         </p>
     *         </dd>
     *         <dt>Running</dt>
     *         <dd>
     *         <p>
     *         The world generator job is running.
     *         </p>
     *         </dd>
     *         <dt>Completed</dt>
     *         <dd>
     *         <p>
     *         The world generator job completed.
     *         </p>
     *         </dd>
     *         <dt>Failed</dt>
     *         <dd>
     *         <p>
     *         The world generator job failed. See <code>failureCode</code> for more information.
     *         </p>
     *         </dd>
     *         <dt>PartialFailed</dt>
     *         <dd>
     *         <p>
     *         Some worlds did not generate.
     *         </p>
     *         </dd>
     *         <dt>Canceled</dt>
     *         <dd>
     *         <p>
     *         The world generator job was cancelled.
     *         </p>
     *         </dd>
     *         <dt>Canceling</dt>
     *         <dd>
     *         <p>
     *         The world generator job is being cancelled.
     *         </p>
     *         </dd>
     * @see WorldGenerationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the world generator job.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The world generator job request is pending.
     * </p>
     * </dd>
     * <dt>Running</dt>
     * <dd>
     * <p>
     * The world generator job is running.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The world generator job completed.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The world generator job failed. See <code>failureCode</code> for more information.
     * </p>
     * </dd>
     * <dt>PartialFailed</dt>
     * <dd>
     * <p>
     * Some worlds did not generate.
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The world generator job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The world generator job is being cancelled.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the world generator job.</p>
     *        <dl>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The world generator job request is pending.
     *        </p>
     *        </dd>
     *        <dt>Running</dt>
     *        <dd>
     *        <p>
     *        The world generator job is running.
     *        </p>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <p>
     *        The world generator job completed.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The world generator job failed. See <code>failureCode</code> for more information.
     *        </p>
     *        </dd>
     *        <dt>PartialFailed</dt>
     *        <dd>
     *        <p>
     *        Some worlds did not generate.
     *        </p>
     *        </dd>
     *        <dt>Canceled</dt>
     *        <dd>
     *        <p>
     *        The world generator job was cancelled.
     *        </p>
     *        </dd>
     *        <dt>Canceling</dt>
     *        <dd>
     *        <p>
     *        The world generator job is being cancelled.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorldGenerationJobStatus
     */

    public CreateWorldGenerationJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the world generator job.
     * </p>
     * <dl>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The world generator job request is pending.
     * </p>
     * </dd>
     * <dt>Running</dt>
     * <dd>
     * <p>
     * The world generator job is running.
     * </p>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <p>
     * The world generator job completed.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The world generator job failed. See <code>failureCode</code> for more information.
     * </p>
     * </dd>
     * <dt>PartialFailed</dt>
     * <dd>
     * <p>
     * Some worlds did not generate.
     * </p>
     * </dd>
     * <dt>Canceled</dt>
     * <dd>
     * <p>
     * The world generator job was cancelled.
     * </p>
     * </dd>
     * <dt>Canceling</dt>
     * <dd>
     * <p>
     * The world generator job is being cancelled.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the world generator job.</p>
     *        <dl>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The world generator job request is pending.
     *        </p>
     *        </dd>
     *        <dt>Running</dt>
     *        <dd>
     *        <p>
     *        The world generator job is running.
     *        </p>
     *        </dd>
     *        <dt>Completed</dt>
     *        <dd>
     *        <p>
     *        The world generator job completed.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The world generator job failed. See <code>failureCode</code> for more information.
     *        </p>
     *        </dd>
     *        <dt>PartialFailed</dt>
     *        <dd>
     *        <p>
     *        Some worlds did not generate.
     *        </p>
     *        </dd>
     *        <dt>Canceled</dt>
     *        <dd>
     *        <p>
     *        The world generator job was cancelled.
     *        </p>
     *        </dd>
     *        <dt>Canceling</dt>
     *        <dd>
     *        <p>
     *        The world generator job is being cancelled.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorldGenerationJobStatus
     */

    public CreateWorldGenerationJobResult withStatus(WorldGenerationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world generator job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the world generator job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world generator job was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the world generator job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world generator job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the world generator job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The failure code of the world generator job if it failed:
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
     *        The failure code of the world generator job if it failed:</p>
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
     * @see WorldGenerationJobErrorCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code of the world generator job if it failed:
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
     * @return The failure code of the world generator job if it failed:</p>
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
     * @see WorldGenerationJobErrorCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code of the world generator job if it failed:
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
     *        The failure code of the world generator job if it failed:</p>
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
     * @see WorldGenerationJobErrorCode
     */

    public CreateWorldGenerationJobResult withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure code of the world generator job if it failed:
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
     *        The failure code of the world generator job if it failed:</p>
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
     * @see WorldGenerationJobErrorCode
     */

    public CreateWorldGenerationJobResult withFailureCode(WorldGenerationJobErrorCode failureCode) {
        this.failureCode = failureCode.toString();
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

    public CreateWorldGenerationJobResult withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     * 
     * @param template
     *        The Amazon Resource Name (arn) of the world template.
     */

    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of the world template.
     */

    public String getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     * 
     * @param template
     *        The Amazon Resource Name (arn) of the world template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobResult withTemplate(String template) {
        setTemplate(template);
        return this;
    }

    /**
     * <p>
     * Information about the world count.
     * </p>
     * 
     * @param worldCount
     *        Information about the world count.
     */

    public void setWorldCount(WorldCount worldCount) {
        this.worldCount = worldCount;
    }

    /**
     * <p>
     * Information about the world count.
     * </p>
     * 
     * @return Information about the world count.
     */

    public WorldCount getWorldCount() {
        return this.worldCount;
    }

    /**
     * <p>
     * Information about the world count.
     * </p>
     * 
     * @param worldCount
     *        Information about the world count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobResult withWorldCount(WorldCount worldCount) {
        setWorldCount(worldCount);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world generator job.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the world generator job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world generator job.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the world generator job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world generator job.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the world generator job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorldGenerationJobResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobResult addTagsEntry(String key, String value) {
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

    public CreateWorldGenerationJobResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the generated worlds.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the generated worlds.
     */

    public java.util.Map<String, String> getWorldTags() {
        return worldTags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the generated worlds.
     * </p>
     * 
     * @param worldTags
     *        A map that contains tag keys and tag values that are attached to the generated worlds.
     */

    public void setWorldTags(java.util.Map<String, String> worldTags) {
        this.worldTags = worldTags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the generated worlds.
     * </p>
     * 
     * @param worldTags
     *        A map that contains tag keys and tag values that are attached to the generated worlds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobResult withWorldTags(java.util.Map<String, String> worldTags) {
        setWorldTags(worldTags);
        return this;
    }

    /**
     * Add a single WorldTags entry
     *
     * @see CreateWorldGenerationJobResult#withWorldTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobResult addWorldTagsEntry(String key, String value) {
        if (null == this.worldTags) {
            this.worldTags = new java.util.HashMap<String, String>();
        }
        if (this.worldTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.worldTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into WorldTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobResult clearWorldTagsEntries() {
        this.worldTags = null;
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate()).append(",");
        if (getWorldCount() != null)
            sb.append("WorldCount: ").append(getWorldCount()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWorldTags() != null)
            sb.append("WorldTags: ").append(getWorldTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorldGenerationJobResult == false)
            return false;
        CreateWorldGenerationJobResult other = (CreateWorldGenerationJobResult) obj;
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
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getWorldCount() == null ^ this.getWorldCount() == null)
            return false;
        if (other.getWorldCount() != null && other.getWorldCount().equals(this.getWorldCount()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWorldTags() == null ^ this.getWorldTags() == null)
            return false;
        if (other.getWorldTags() != null && other.getWorldTags().equals(this.getWorldTags()) == false)
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
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getWorldCount() == null) ? 0 : getWorldCount().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWorldTags() == null) ? 0 : getWorldTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorldGenerationJobResult clone() {
        try {
            return (CreateWorldGenerationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
