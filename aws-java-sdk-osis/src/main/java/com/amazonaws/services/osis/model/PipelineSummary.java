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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for an OpenSearch Ingestion pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/PipelineSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current status of the pipeline.
     * </p>
     */
    private String status;

    private PipelineStatusReason statusReason;
    /**
     * <p>
     * The name of the pipeline.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     */
    private String pipelineArn;
    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     */
    private Integer minUnits;
    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     */
    private Integer maxUnits;
    /**
     * <p>
     * The date and time when the pipeline was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time when the pipeline was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * A list of destinations to which the pipeline writes data.
     * </p>
     */
    private java.util.List<PipelineDestination> destinations;
    /**
     * <p>
     * A list of tags associated with the given pipeline.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The current status of the pipeline.
     * </p>
     * 
     * @param status
     *        The current status of the pipeline.
     * @see PipelineStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the pipeline.
     * </p>
     * 
     * @return The current status of the pipeline.
     * @see PipelineStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the pipeline.
     * </p>
     * 
     * @param status
     *        The current status of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineStatus
     */

    public PipelineSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the pipeline.
     * </p>
     * 
     * @param status
     *        The current status of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineStatus
     */

    public PipelineSummary withStatus(PipelineStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param statusReason
     */

    public void setStatusReason(PipelineStatusReason statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * @return
     */

    public PipelineStatusReason getStatusReason() {
        return this.statusReason;
    }

    /**
     * @param statusReason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withStatusReason(PipelineStatusReason statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @return The name of the pipeline.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @param pipelineArn
     *        The Amazon Resource Name (ARN) of the pipeline.
     */

    public void setPipelineArn(String pipelineArn) {
        this.pipelineArn = pipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pipeline.
     */

    public String getPipelineArn() {
        return this.pipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @param pipelineArn
     *        The Amazon Resource Name (ARN) of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withPipelineArn(String pipelineArn) {
        setPipelineArn(pipelineArn);
        return this;
    }

    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param minUnits
     *        The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public void setMinUnits(Integer minUnits) {
        this.minUnits = minUnits;
    }

    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @return The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public Integer getMinUnits() {
        return this.minUnits;
    }

    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param minUnits
     *        The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withMinUnits(Integer minUnits) {
        setMinUnits(minUnits);
        return this;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param maxUnits
     *        The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public void setMaxUnits(Integer maxUnits) {
        this.maxUnits = maxUnits;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @return The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public Integer getMaxUnits() {
        return this.maxUnits;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param maxUnits
     *        The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withMaxUnits(Integer maxUnits) {
        setMaxUnits(maxUnits);
        return this;
    }

    /**
     * <p>
     * The date and time when the pipeline was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the pipeline was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the pipeline was created.
     * </p>
     * 
     * @return The date and time when the pipeline was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the pipeline was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the pipeline was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time when the pipeline was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the pipeline was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the pipeline was last updated.
     * </p>
     * 
     * @return The date and time when the pipeline was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the pipeline was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the pipeline was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * A list of destinations to which the pipeline writes data.
     * </p>
     * 
     * @return A list of destinations to which the pipeline writes data.
     */

    public java.util.List<PipelineDestination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * A list of destinations to which the pipeline writes data.
     * </p>
     * 
     * @param destinations
     *        A list of destinations to which the pipeline writes data.
     */

    public void setDestinations(java.util.Collection<PipelineDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<PipelineDestination>(destinations);
    }

    /**
     * <p>
     * A list of destinations to which the pipeline writes data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of destinations to which the pipeline writes data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withDestinations(PipelineDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<PipelineDestination>(destinations.length));
        }
        for (PipelineDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of destinations to which the pipeline writes data.
     * </p>
     * 
     * @param destinations
     *        A list of destinations to which the pipeline writes data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withDestinations(java.util.Collection<PipelineDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the given pipeline.
     * </p>
     * 
     * @return A list of tags associated with the given pipeline.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with the given pipeline.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the given pipeline.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags associated with the given pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the given pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the given pipeline.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the given pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getPipelineArn() != null)
            sb.append("PipelineArn: ").append(getPipelineArn()).append(",");
        if (getMinUnits() != null)
            sb.append("MinUnits: ").append(getMinUnits()).append(",");
        if (getMaxUnits() != null)
            sb.append("MaxUnits: ").append(getMaxUnits()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
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

        if (obj instanceof PipelineSummary == false)
            return false;
        PipelineSummary other = (PipelineSummary) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineArn() == null ^ this.getPipelineArn() == null)
            return false;
        if (other.getPipelineArn() != null && other.getPipelineArn().equals(this.getPipelineArn()) == false)
            return false;
        if (other.getMinUnits() == null ^ this.getMinUnits() == null)
            return false;
        if (other.getMinUnits() != null && other.getMinUnits().equals(this.getMinUnits()) == false)
            return false;
        if (other.getMaxUnits() == null ^ this.getMaxUnits() == null)
            return false;
        if (other.getMaxUnits() != null && other.getMaxUnits().equals(this.getMaxUnits()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineArn() == null) ? 0 : getPipelineArn().hashCode());
        hashCode = prime * hashCode + ((getMinUnits() == null) ? 0 : getMinUnits().hashCode());
        hashCode = prime * hashCode + ((getMaxUnits() == null) ? 0 : getMaxUnits().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PipelineSummary clone() {
        try {
            return (PipelineSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.osis.model.transform.PipelineSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
