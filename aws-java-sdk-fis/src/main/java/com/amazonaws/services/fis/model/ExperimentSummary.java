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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of an experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ExperimentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the experiment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     */
    private String experimentTemplateId;
    /**
     * <p>
     * The state of the experiment.
     * </p>
     */
    private ExperimentState state;
    /**
     * <p>
     * The time that the experiment was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The tags for the experiment.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the experiment.
     * </p>
     * 
     * @param id
     *        The ID of the experiment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the experiment.
     * </p>
     * 
     * @return The ID of the experiment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the experiment.
     * </p>
     * 
     * @param id
     *        The ID of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @param experimentTemplateId
     *        The ID of the experiment template.
     */

    public void setExperimentTemplateId(String experimentTemplateId) {
        this.experimentTemplateId = experimentTemplateId;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @return The ID of the experiment template.
     */

    public String getExperimentTemplateId() {
        return this.experimentTemplateId;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @param experimentTemplateId
     *        The ID of the experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary withExperimentTemplateId(String experimentTemplateId) {
        setExperimentTemplateId(experimentTemplateId);
        return this;
    }

    /**
     * <p>
     * The state of the experiment.
     * </p>
     * 
     * @param state
     *        The state of the experiment.
     */

    public void setState(ExperimentState state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the experiment.
     * </p>
     * 
     * @return The state of the experiment.
     */

    public ExperimentState getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the experiment.
     * </p>
     * 
     * @param state
     *        The state of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary withState(ExperimentState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The time that the experiment was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the experiment was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the experiment was created.
     * </p>
     * 
     * @return The time that the experiment was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the experiment was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the experiment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The tags for the experiment.
     * </p>
     * 
     * @return The tags for the experiment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the experiment.
     * </p>
     * 
     * @param tags
     *        The tags for the experiment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the experiment.
     * </p>
     * 
     * @param tags
     *        The tags for the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ExperimentSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary addTagsEntry(String key, String value) {
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

    public ExperimentSummary clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getExperimentTemplateId() != null)
            sb.append("ExperimentTemplateId: ").append(getExperimentTemplateId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof ExperimentSummary == false)
            return false;
        ExperimentSummary other = (ExperimentSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getExperimentTemplateId() == null ^ this.getExperimentTemplateId() == null)
            return false;
        if (other.getExperimentTemplateId() != null && other.getExperimentTemplateId().equals(this.getExperimentTemplateId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getExperimentTemplateId() == null) ? 0 : getExperimentTemplateId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentSummary clone() {
        try {
            return (ExperimentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.ExperimentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
