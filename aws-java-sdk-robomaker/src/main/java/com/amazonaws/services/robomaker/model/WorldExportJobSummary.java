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
 * Information about a world export job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/WorldExportJobSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorldExportJobSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The world export job failed. See <code>failureCode</code> for more information.
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
     * A list of worlds.
     * </p>
     */
    private java.util.List<String> worlds;

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

    public WorldExportJobSummary withArn(String arn) {
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
     * The world export job failed. See <code>failureCode</code> for more information.
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
     *        The world export job failed. See <code>failureCode</code> for more information.
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
     * The world export job failed. See <code>failureCode</code> for more information.
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
     *         The world export job failed. See <code>failureCode</code> for more information.
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
     * The world export job failed. See <code>failureCode</code> for more information.
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
     *        The world export job failed. See <code>failureCode</code> for more information.
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

    public WorldExportJobSummary withStatus(String status) {
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
     * The world export job failed. See <code>failureCode</code> for more information.
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
     *        The world export job failed. See <code>failureCode</code> for more information.
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

    public WorldExportJobSummary withStatus(WorldExportJobStatus status) {
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

    public WorldExportJobSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A list of worlds.
     * </p>
     * 
     * @return A list of worlds.
     */

    public java.util.List<String> getWorlds() {
        return worlds;
    }

    /**
     * <p>
     * A list of worlds.
     * </p>
     * 
     * @param worlds
     *        A list of worlds.
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
     * A list of worlds.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorlds(java.util.Collection)} or {@link #withWorlds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param worlds
     *        A list of worlds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldExportJobSummary withWorlds(String... worlds) {
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
     * A list of worlds.
     * </p>
     * 
     * @param worlds
     *        A list of worlds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldExportJobSummary withWorlds(java.util.Collection<String> worlds) {
        setWorlds(worlds);
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
        if (getWorlds() != null)
            sb.append("Worlds: ").append(getWorlds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorldExportJobSummary == false)
            return false;
        WorldExportJobSummary other = (WorldExportJobSummary) obj;
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
        if (other.getWorlds() == null ^ this.getWorlds() == null)
            return false;
        if (other.getWorlds() != null && other.getWorlds().equals(this.getWorlds()) == false)
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
        hashCode = prime * hashCode + ((getWorlds() == null) ? 0 : getWorlds().hashCode());
        return hashCode;
    }

    @Override
    public WorldExportJobSummary clone() {
        try {
            return (WorldExportJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.WorldExportJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
