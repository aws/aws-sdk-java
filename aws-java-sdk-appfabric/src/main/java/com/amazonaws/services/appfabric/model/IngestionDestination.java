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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an ingestion destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/IngestionDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestionDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion destination.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion.
     * </p>
     */
    private String ingestionArn;
    /**
     * <p>
     * Contains information about how ingested data is processed.
     * </p>
     */
    private ProcessingConfiguration processingConfiguration;
    /**
     * <p>
     * Contains information about the destination of ingested data.
     * </p>
     */
    private DestinationConfiguration destinationConfiguration;
    /**
     * <p>
     * The state of the ingestion destination.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The ingestion destination is active and is ready to be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The ingestion destination has failed. If the ingestion destination is in this state, you
     * should verify the ingestion destination configuration and try again.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The reason for the current status of the ingestion destination.
     * </p>
     * <p>
     * Only present when the <code>status</code> of ingestion destination is <code>Failed</code>.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The timestamp of when the ingestion destination was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp of when the ingestion destination was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion destination.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the ingestion destination.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion destination.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ingestion destination.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion destination.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the ingestion destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionDestination withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion.
     * </p>
     * 
     * @param ingestionArn
     *        The Amazon Resource Name (ARN) of the ingestion.
     */

    public void setIngestionArn(String ingestionArn) {
        this.ingestionArn = ingestionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ingestion.
     */

    public String getIngestionArn() {
        return this.ingestionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion.
     * </p>
     * 
     * @param ingestionArn
     *        The Amazon Resource Name (ARN) of the ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionDestination withIngestionArn(String ingestionArn) {
        setIngestionArn(ingestionArn);
        return this;
    }

    /**
     * <p>
     * Contains information about how ingested data is processed.
     * </p>
     * 
     * @param processingConfiguration
     *        Contains information about how ingested data is processed.
     */

    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    /**
     * <p>
     * Contains information about how ingested data is processed.
     * </p>
     * 
     * @return Contains information about how ingested data is processed.
     */

    public ProcessingConfiguration getProcessingConfiguration() {
        return this.processingConfiguration;
    }

    /**
     * <p>
     * Contains information about how ingested data is processed.
     * </p>
     * 
     * @param processingConfiguration
     *        Contains information about how ingested data is processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionDestination withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains information about the destination of ingested data.
     * </p>
     * 
     * @param destinationConfiguration
     *        Contains information about the destination of ingested data.
     */

    public void setDestinationConfiguration(DestinationConfiguration destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
    }

    /**
     * <p>
     * Contains information about the destination of ingested data.
     * </p>
     * 
     * @return Contains information about the destination of ingested data.
     */

    public DestinationConfiguration getDestinationConfiguration() {
        return this.destinationConfiguration;
    }

    /**
     * <p>
     * Contains information about the destination of ingested data.
     * </p>
     * 
     * @param destinationConfiguration
     *        Contains information about the destination of ingested data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionDestination withDestinationConfiguration(DestinationConfiguration destinationConfiguration) {
        setDestinationConfiguration(destinationConfiguration);
        return this;
    }

    /**
     * <p>
     * The state of the ingestion destination.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The ingestion destination is active and is ready to be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The ingestion destination has failed. If the ingestion destination is in this state, you
     * should verify the ingestion destination configuration and try again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of the ingestion destination.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>: The ingestion destination is active and is ready to be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: The ingestion destination has failed. If the ingestion destination is in this state,
     *        you should verify the ingestion destination configuration and try again.
     *        </p>
     *        </li>
     * @see IngestionDestinationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the ingestion destination.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The ingestion destination is active and is ready to be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The ingestion destination has failed. If the ingestion destination is in this state, you
     * should verify the ingestion destination configuration and try again.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the ingestion destination.</p>
     *         <p>
     *         The following states are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Active</code>: The ingestion destination is active and is ready to be used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code>: The ingestion destination has failed. If the ingestion destination is in this state,
     *         you should verify the ingestion destination configuration and try again.
     *         </p>
     *         </li>
     * @see IngestionDestinationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the ingestion destination.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The ingestion destination is active and is ready to be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The ingestion destination has failed. If the ingestion destination is in this state, you
     * should verify the ingestion destination configuration and try again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of the ingestion destination.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>: The ingestion destination is active and is ready to be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: The ingestion destination has failed. If the ingestion destination is in this state,
     *        you should verify the ingestion destination configuration and try again.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionDestinationStatus
     */

    public IngestionDestination withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the ingestion destination.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The ingestion destination is active and is ready to be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The ingestion destination has failed. If the ingestion destination is in this state, you
     * should verify the ingestion destination configuration and try again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of the ingestion destination.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>: The ingestion destination is active and is ready to be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: The ingestion destination has failed. If the ingestion destination is in this state,
     *        you should verify the ingestion destination configuration and try again.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionDestinationStatus
     */

    public IngestionDestination withStatus(IngestionDestinationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the current status of the ingestion destination.
     * </p>
     * <p>
     * Only present when the <code>status</code> of ingestion destination is <code>Failed</code>.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current status of the ingestion destination.</p>
     *        <p>
     *        Only present when the <code>status</code> of ingestion destination is <code>Failed</code>.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the current status of the ingestion destination.
     * </p>
     * <p>
     * Only present when the <code>status</code> of ingestion destination is <code>Failed</code>.
     * </p>
     * 
     * @return The reason for the current status of the ingestion destination.</p>
     *         <p>
     *         Only present when the <code>status</code> of ingestion destination is <code>Failed</code>.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the current status of the ingestion destination.
     * </p>
     * <p>
     * Only present when the <code>status</code> of ingestion destination is <code>Failed</code>.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current status of the ingestion destination.</p>
     *        <p>
     *        Only present when the <code>status</code> of ingestion destination is <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionDestination withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the ingestion destination was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the ingestion destination was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the ingestion destination was created.
     * </p>
     * 
     * @return The timestamp of when the ingestion destination was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the ingestion destination was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the ingestion destination was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionDestination withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the ingestion destination was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the ingestion destination was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the ingestion destination was last updated.
     * </p>
     * 
     * @return The timestamp of when the ingestion destination was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the ingestion destination was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the ingestion destination was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionDestination withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getIngestionArn() != null)
            sb.append("IngestionArn: ").append(getIngestionArn()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getDestinationConfiguration() != null)
            sb.append("DestinationConfiguration: ").append(getDestinationConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestionDestination == false)
            return false;
        IngestionDestination other = (IngestionDestination) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getIngestionArn() == null ^ this.getIngestionArn() == null)
            return false;
        if (other.getIngestionArn() != null && other.getIngestionArn().equals(this.getIngestionArn()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getDestinationConfiguration() == null ^ this.getDestinationConfiguration() == null)
            return false;
        if (other.getDestinationConfiguration() != null && other.getDestinationConfiguration().equals(this.getDestinationConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getIngestionArn() == null) ? 0 : getIngestionArn().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfiguration() == null) ? 0 : getDestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public IngestionDestination clone() {
        try {
            return (IngestionDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.IngestionDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
