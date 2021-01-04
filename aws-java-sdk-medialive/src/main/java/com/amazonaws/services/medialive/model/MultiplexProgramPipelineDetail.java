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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The current source for one of the pipelines in the multiplex.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MultiplexProgramPipelineDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiplexProgramPipelineDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * Identifies the channel pipeline that is currently active for the pipeline (identified by PipelineId) in the
     * multiplex.
     */
    private String activeChannelPipeline;
    /** Identifies a specific pipeline in the multiplex. */
    private String pipelineId;

    /**
     * Identifies the channel pipeline that is currently active for the pipeline (identified by PipelineId) in the
     * multiplex.
     * 
     * @param activeChannelPipeline
     *        Identifies the channel pipeline that is currently active for the pipeline (identified by PipelineId) in
     *        the multiplex.
     */

    public void setActiveChannelPipeline(String activeChannelPipeline) {
        this.activeChannelPipeline = activeChannelPipeline;
    }

    /**
     * Identifies the channel pipeline that is currently active for the pipeline (identified by PipelineId) in the
     * multiplex.
     * 
     * @return Identifies the channel pipeline that is currently active for the pipeline (identified by PipelineId) in
     *         the multiplex.
     */

    public String getActiveChannelPipeline() {
        return this.activeChannelPipeline;
    }

    /**
     * Identifies the channel pipeline that is currently active for the pipeline (identified by PipelineId) in the
     * multiplex.
     * 
     * @param activeChannelPipeline
     *        Identifies the channel pipeline that is currently active for the pipeline (identified by PipelineId) in
     *        the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPipelineDetail withActiveChannelPipeline(String activeChannelPipeline) {
        setActiveChannelPipeline(activeChannelPipeline);
        return this;
    }

    /**
     * Identifies a specific pipeline in the multiplex.
     * 
     * @param pipelineId
     *        Identifies a specific pipeline in the multiplex.
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * Identifies a specific pipeline in the multiplex.
     * 
     * @return Identifies a specific pipeline in the multiplex.
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * Identifies a specific pipeline in the multiplex.
     * 
     * @param pipelineId
     *        Identifies a specific pipeline in the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPipelineDetail withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
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
        if (getActiveChannelPipeline() != null)
            sb.append("ActiveChannelPipeline: ").append(getActiveChannelPipeline()).append(",");
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

        if (obj instanceof MultiplexProgramPipelineDetail == false)
            return false;
        MultiplexProgramPipelineDetail other = (MultiplexProgramPipelineDetail) obj;
        if (other.getActiveChannelPipeline() == null ^ this.getActiveChannelPipeline() == null)
            return false;
        if (other.getActiveChannelPipeline() != null && other.getActiveChannelPipeline().equals(this.getActiveChannelPipeline()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getActiveChannelPipeline() == null) ? 0 : getActiveChannelPipeline().hashCode());
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        return hashCode;
    }

    @Override
    public MultiplexProgramPipelineDetail clone() {
        try {
            return (MultiplexProgramPipelineDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MultiplexProgramPipelineDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
