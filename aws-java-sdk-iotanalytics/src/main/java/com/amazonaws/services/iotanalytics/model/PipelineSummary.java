/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of information about a pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/PipelineSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * A summary of information about the pipeline reprocessing.
     * </p>
     */
    private java.util.List<ReprocessingSummary> reprocessingSummaries;
    /**
     * <p>
     * When the pipeline was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the pipeline was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;

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
     * A summary of information about the pipeline reprocessing.
     * </p>
     * 
     * @return A summary of information about the pipeline reprocessing.
     */

    public java.util.List<ReprocessingSummary> getReprocessingSummaries() {
        return reprocessingSummaries;
    }

    /**
     * <p>
     * A summary of information about the pipeline reprocessing.
     * </p>
     * 
     * @param reprocessingSummaries
     *        A summary of information about the pipeline reprocessing.
     */

    public void setReprocessingSummaries(java.util.Collection<ReprocessingSummary> reprocessingSummaries) {
        if (reprocessingSummaries == null) {
            this.reprocessingSummaries = null;
            return;
        }

        this.reprocessingSummaries = new java.util.ArrayList<ReprocessingSummary>(reprocessingSummaries);
    }

    /**
     * <p>
     * A summary of information about the pipeline reprocessing.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReprocessingSummaries(java.util.Collection)} or
     * {@link #withReprocessingSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reprocessingSummaries
     *        A summary of information about the pipeline reprocessing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withReprocessingSummaries(ReprocessingSummary... reprocessingSummaries) {
        if (this.reprocessingSummaries == null) {
            setReprocessingSummaries(new java.util.ArrayList<ReprocessingSummary>(reprocessingSummaries.length));
        }
        for (ReprocessingSummary ele : reprocessingSummaries) {
            this.reprocessingSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of information about the pipeline reprocessing.
     * </p>
     * 
     * @param reprocessingSummaries
     *        A summary of information about the pipeline reprocessing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withReprocessingSummaries(java.util.Collection<ReprocessingSummary> reprocessingSummaries) {
        setReprocessingSummaries(reprocessingSummaries);
        return this;
    }

    /**
     * <p>
     * When the pipeline was created.
     * </p>
     * 
     * @param creationTime
     *        When the pipeline was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the pipeline was created.
     * </p>
     * 
     * @return When the pipeline was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the pipeline was created.
     * </p>
     * 
     * @param creationTime
     *        When the pipeline was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the pipeline was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        When the pipeline was last updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * When the pipeline was last updated.
     * </p>
     * 
     * @return When the pipeline was last updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * When the pipeline was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        When the pipeline was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getReprocessingSummaries() != null)
            sb.append("ReprocessingSummaries: ").append(getReprocessingSummaries()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
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
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getReprocessingSummaries() == null ^ this.getReprocessingSummaries() == null)
            return false;
        if (other.getReprocessingSummaries() != null && other.getReprocessingSummaries().equals(this.getReprocessingSummaries()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getReprocessingSummaries() == null) ? 0 : getReprocessingSummaries().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
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
        com.amazonaws.services.iotanalytics.model.transform.PipelineSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
