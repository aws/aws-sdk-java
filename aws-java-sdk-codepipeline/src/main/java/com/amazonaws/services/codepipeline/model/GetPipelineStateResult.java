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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a GetPipelineState action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetPipelineState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPipelineStateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline for which you want to get the state.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The version number of the pipeline.
     * </p>
     * <note>
     * <p>
     * A newly-created pipeline is always assigned a version number of <code>1</code>.
     * </p>
     * </note>
     */
    private Integer pipelineVersion;
    /**
     * <p>
     * A list of the pipeline stage output information, including stage name, state, most recent run details, whether
     * the stage is disabled, and other data.
     * </p>
     */
    private java.util.List<StageState> stageStates;
    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The date and time the pipeline was last updated, in timestamp format.
     * </p>
     */
    private java.util.Date updated;

    /**
     * <p>
     * The name of the pipeline for which you want to get the state.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline for which you want to get the state.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline for which you want to get the state.
     * </p>
     * 
     * @return The name of the pipeline for which you want to get the state.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline for which you want to get the state.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline for which you want to get the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineStateResult withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The version number of the pipeline.
     * </p>
     * <note>
     * <p>
     * A newly-created pipeline is always assigned a version number of <code>1</code>.
     * </p>
     * </note>
     * 
     * @param pipelineVersion
     *        The version number of the pipeline.</p> <note>
     *        <p>
     *        A newly-created pipeline is always assigned a version number of <code>1</code>.
     *        </p>
     */

    public void setPipelineVersion(Integer pipelineVersion) {
        this.pipelineVersion = pipelineVersion;
    }

    /**
     * <p>
     * The version number of the pipeline.
     * </p>
     * <note>
     * <p>
     * A newly-created pipeline is always assigned a version number of <code>1</code>.
     * </p>
     * </note>
     * 
     * @return The version number of the pipeline.</p> <note>
     *         <p>
     *         A newly-created pipeline is always assigned a version number of <code>1</code>.
     *         </p>
     */

    public Integer getPipelineVersion() {
        return this.pipelineVersion;
    }

    /**
     * <p>
     * The version number of the pipeline.
     * </p>
     * <note>
     * <p>
     * A newly-created pipeline is always assigned a version number of <code>1</code>.
     * </p>
     * </note>
     * 
     * @param pipelineVersion
     *        The version number of the pipeline.</p> <note>
     *        <p>
     *        A newly-created pipeline is always assigned a version number of <code>1</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineStateResult withPipelineVersion(Integer pipelineVersion) {
        setPipelineVersion(pipelineVersion);
        return this;
    }

    /**
     * <p>
     * A list of the pipeline stage output information, including stage name, state, most recent run details, whether
     * the stage is disabled, and other data.
     * </p>
     * 
     * @return A list of the pipeline stage output information, including stage name, state, most recent run details,
     *         whether the stage is disabled, and other data.
     */

    public java.util.List<StageState> getStageStates() {
        return stageStates;
    }

    /**
     * <p>
     * A list of the pipeline stage output information, including stage name, state, most recent run details, whether
     * the stage is disabled, and other data.
     * </p>
     * 
     * @param stageStates
     *        A list of the pipeline stage output information, including stage name, state, most recent run details,
     *        whether the stage is disabled, and other data.
     */

    public void setStageStates(java.util.Collection<StageState> stageStates) {
        if (stageStates == null) {
            this.stageStates = null;
            return;
        }

        this.stageStates = new java.util.ArrayList<StageState>(stageStates);
    }

    /**
     * <p>
     * A list of the pipeline stage output information, including stage name, state, most recent run details, whether
     * the stage is disabled, and other data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStageStates(java.util.Collection)} or {@link #withStageStates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stageStates
     *        A list of the pipeline stage output information, including stage name, state, most recent run details,
     *        whether the stage is disabled, and other data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineStateResult withStageStates(StageState... stageStates) {
        if (this.stageStates == null) {
            setStageStates(new java.util.ArrayList<StageState>(stageStates.length));
        }
        for (StageState ele : stageStates) {
            this.stageStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the pipeline stage output information, including stage name, state, most recent run details, whether
     * the stage is disabled, and other data.
     * </p>
     * 
     * @param stageStates
     *        A list of the pipeline stage output information, including stage name, state, most recent run details,
     *        whether the stage is disabled, and other data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineStateResult withStageStates(java.util.Collection<StageState> stageStates) {
        setStageStates(stageStates);
        return this;
    }

    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time the pipeline was created, in timestamp format.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     * 
     * @return The date and time the pipeline was created, in timestamp format.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time the pipeline was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineStateResult withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The date and time the pipeline was last updated, in timestamp format.
     * </p>
     * 
     * @param updated
     *        The date and time the pipeline was last updated, in timestamp format.
     */

    public void setUpdated(java.util.Date updated) {
        this.updated = updated;
    }

    /**
     * <p>
     * The date and time the pipeline was last updated, in timestamp format.
     * </p>
     * 
     * @return The date and time the pipeline was last updated, in timestamp format.
     */

    public java.util.Date getUpdated() {
        return this.updated;
    }

    /**
     * <p>
     * The date and time the pipeline was last updated, in timestamp format.
     * </p>
     * 
     * @param updated
     *        The date and time the pipeline was last updated, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineStateResult withUpdated(java.util.Date updated) {
        setUpdated(updated);
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
        if (getPipelineVersion() != null)
            sb.append("PipelineVersion: ").append(getPipelineVersion()).append(",");
        if (getStageStates() != null)
            sb.append("StageStates: ").append(getStageStates()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getUpdated() != null)
            sb.append("Updated: ").append(getUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPipelineStateResult == false)
            return false;
        GetPipelineStateResult other = (GetPipelineStateResult) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineVersion() == null ^ this.getPipelineVersion() == null)
            return false;
        if (other.getPipelineVersion() != null && other.getPipelineVersion().equals(this.getPipelineVersion()) == false)
            return false;
        if (other.getStageStates() == null ^ this.getStageStates() == null)
            return false;
        if (other.getStageStates() != null && other.getStageStates().equals(this.getStageStates()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getUpdated() == null ^ this.getUpdated() == null)
            return false;
        if (other.getUpdated() != null && other.getUpdated().equals(this.getUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineVersion() == null) ? 0 : getPipelineVersion().hashCode());
        hashCode = prime * hashCode + ((getStageStates() == null) ? 0 : getStageStates().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        return hashCode;
    }

    @Override
    public GetPipelineStateResult clone() {
        try {
            return (GetPipelineStateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
