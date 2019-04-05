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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for pausing a pipeline.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/PipelinePauseStateSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelinePauseStateSettings implements Serializable, Cloneable, StructuredPojo {

    /** Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1"). */
    private String pipelineId;

    /**
     * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * 
     * @param pipelineId
     *        Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * @see PipelineId
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * 
     * @return Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * @see PipelineId
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * 
     * @param pipelineId
     *        Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineId
     */

    public PipelinePauseStateSettings withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * 
     * @param pipelineId
     *        Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineId
     */

    public PipelinePauseStateSettings withPipelineId(PipelineId pipelineId) {
        this.pipelineId = pipelineId.toString();
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
        if (getPipelineId() != null)
            sb.append("PipelineId: ").append(getPipelineId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelinePauseStateSettings == false)
            return false;
        PipelinePauseStateSettings other = (PipelinePauseStateSettings) obj;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        return hashCode;
    }

    @Override
    public PipelinePauseStateSettings clone() {
        try {
            return (PipelinePauseStateSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.PipelinePauseStateSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
