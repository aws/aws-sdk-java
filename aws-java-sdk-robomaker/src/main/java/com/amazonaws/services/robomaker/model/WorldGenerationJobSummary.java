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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a world generator job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/WorldGenerationJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorldGenerationJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world generator job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     */
    private String template;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world generator job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The status of the world generator job:
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
     * Information about the world count.
     * </p>
     */
    private WorldCount worldCount;
    /**
     * <p>
     * The number of worlds that were generated.
     * </p>
     */
    private Integer succeededWorldCount;
    /**
     * <p>
     * The number of worlds that failed.
     * </p>
     */
    private Integer failedWorldCount;

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

    public WorldGenerationJobSummary withArn(String arn) {
        setArn(arn);
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

    public WorldGenerationJobSummary withTemplate(String template) {
        setTemplate(template);
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

    public WorldGenerationJobSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The status of the world generator job:
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
     *        The status of the world generator job:</p>
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
     * The status of the world generator job:
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
     * @return The status of the world generator job:</p>
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
     * The status of the world generator job:
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
     *        The status of the world generator job:</p>
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

    public WorldGenerationJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the world generator job:
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
     *        The status of the world generator job:</p>
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

    public WorldGenerationJobSummary withStatus(WorldGenerationJobStatus status) {
        this.status = status.toString();
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

    public WorldGenerationJobSummary withWorldCount(WorldCount worldCount) {
        setWorldCount(worldCount);
        return this;
    }

    /**
     * <p>
     * The number of worlds that were generated.
     * </p>
     * 
     * @param succeededWorldCount
     *        The number of worlds that were generated.
     */

    public void setSucceededWorldCount(Integer succeededWorldCount) {
        this.succeededWorldCount = succeededWorldCount;
    }

    /**
     * <p>
     * The number of worlds that were generated.
     * </p>
     * 
     * @return The number of worlds that were generated.
     */

    public Integer getSucceededWorldCount() {
        return this.succeededWorldCount;
    }

    /**
     * <p>
     * The number of worlds that were generated.
     * </p>
     * 
     * @param succeededWorldCount
     *        The number of worlds that were generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldGenerationJobSummary withSucceededWorldCount(Integer succeededWorldCount) {
        setSucceededWorldCount(succeededWorldCount);
        return this;
    }

    /**
     * <p>
     * The number of worlds that failed.
     * </p>
     * 
     * @param failedWorldCount
     *        The number of worlds that failed.
     */

    public void setFailedWorldCount(Integer failedWorldCount) {
        this.failedWorldCount = failedWorldCount;
    }

    /**
     * <p>
     * The number of worlds that failed.
     * </p>
     * 
     * @return The number of worlds that failed.
     */

    public Integer getFailedWorldCount() {
        return this.failedWorldCount;
    }

    /**
     * <p>
     * The number of worlds that failed.
     * </p>
     * 
     * @param failedWorldCount
     *        The number of worlds that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldGenerationJobSummary withFailedWorldCount(Integer failedWorldCount) {
        setFailedWorldCount(failedWorldCount);
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
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getWorldCount() != null)
            sb.append("WorldCount: ").append(getWorldCount()).append(",");
        if (getSucceededWorldCount() != null)
            sb.append("SucceededWorldCount: ").append(getSucceededWorldCount()).append(",");
        if (getFailedWorldCount() != null)
            sb.append("FailedWorldCount: ").append(getFailedWorldCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorldGenerationJobSummary == false)
            return false;
        WorldGenerationJobSummary other = (WorldGenerationJobSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getWorldCount() == null ^ this.getWorldCount() == null)
            return false;
        if (other.getWorldCount() != null && other.getWorldCount().equals(this.getWorldCount()) == false)
            return false;
        if (other.getSucceededWorldCount() == null ^ this.getSucceededWorldCount() == null)
            return false;
        if (other.getSucceededWorldCount() != null && other.getSucceededWorldCount().equals(this.getSucceededWorldCount()) == false)
            return false;
        if (other.getFailedWorldCount() == null ^ this.getFailedWorldCount() == null)
            return false;
        if (other.getFailedWorldCount() != null && other.getFailedWorldCount().equals(this.getFailedWorldCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWorldCount() == null) ? 0 : getWorldCount().hashCode());
        hashCode = prime * hashCode + ((getSucceededWorldCount() == null) ? 0 : getSucceededWorldCount().hashCode());
        hashCode = prime * hashCode + ((getFailedWorldCount() == null) ? 0 : getFailedWorldCount().hashCode());
        return hashCode;
    }

    @Override
    public WorldGenerationJobSummary clone() {
        try {
            return (WorldGenerationJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.WorldGenerationJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
