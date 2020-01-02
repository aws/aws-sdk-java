/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Runtime details of a pipeline when a channel is running.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/PipelineDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineDetail implements Serializable, Cloneable, StructuredPojo {

    /** The name of the active input attachment currently being ingested by this pipeline. */
    private String activeInputAttachmentName;
    /**
     * The name of the input switch schedule action that occurred most recently and that resulted in the switch to the
     * current input attachment for this pipeline.
     */
    private String activeInputSwitchActionName;
    /** Pipeline ID */
    private String pipelineId;

    /**
     * The name of the active input attachment currently being ingested by this pipeline.
     * 
     * @param activeInputAttachmentName
     *        The name of the active input attachment currently being ingested by this pipeline.
     */

    public void setActiveInputAttachmentName(String activeInputAttachmentName) {
        this.activeInputAttachmentName = activeInputAttachmentName;
    }

    /**
     * The name of the active input attachment currently being ingested by this pipeline.
     * 
     * @return The name of the active input attachment currently being ingested by this pipeline.
     */

    public String getActiveInputAttachmentName() {
        return this.activeInputAttachmentName;
    }

    /**
     * The name of the active input attachment currently being ingested by this pipeline.
     * 
     * @param activeInputAttachmentName
     *        The name of the active input attachment currently being ingested by this pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDetail withActiveInputAttachmentName(String activeInputAttachmentName) {
        setActiveInputAttachmentName(activeInputAttachmentName);
        return this;
    }

    /**
     * The name of the input switch schedule action that occurred most recently and that resulted in the switch to the
     * current input attachment for this pipeline.
     * 
     * @param activeInputSwitchActionName
     *        The name of the input switch schedule action that occurred most recently and that resulted in the switch
     *        to the current input attachment for this pipeline.
     */

    public void setActiveInputSwitchActionName(String activeInputSwitchActionName) {
        this.activeInputSwitchActionName = activeInputSwitchActionName;
    }

    /**
     * The name of the input switch schedule action that occurred most recently and that resulted in the switch to the
     * current input attachment for this pipeline.
     * 
     * @return The name of the input switch schedule action that occurred most recently and that resulted in the switch
     *         to the current input attachment for this pipeline.
     */

    public String getActiveInputSwitchActionName() {
        return this.activeInputSwitchActionName;
    }

    /**
     * The name of the input switch schedule action that occurred most recently and that resulted in the switch to the
     * current input attachment for this pipeline.
     * 
     * @param activeInputSwitchActionName
     *        The name of the input switch schedule action that occurred most recently and that resulted in the switch
     *        to the current input attachment for this pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDetail withActiveInputSwitchActionName(String activeInputSwitchActionName) {
        setActiveInputSwitchActionName(activeInputSwitchActionName);
        return this;
    }

    /**
     * Pipeline ID
     * 
     * @param pipelineId
     *        Pipeline ID
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * Pipeline ID
     * 
     * @return Pipeline ID
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * Pipeline ID
     * 
     * @param pipelineId
     *        Pipeline ID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDetail withPipelineId(String pipelineId) {
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
        if (getActiveInputAttachmentName() != null)
            sb.append("ActiveInputAttachmentName: ").append(getActiveInputAttachmentName()).append(",");
        if (getActiveInputSwitchActionName() != null)
            sb.append("ActiveInputSwitchActionName: ").append(getActiveInputSwitchActionName()).append(",");
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

        if (obj instanceof PipelineDetail == false)
            return false;
        PipelineDetail other = (PipelineDetail) obj;
        if (other.getActiveInputAttachmentName() == null ^ this.getActiveInputAttachmentName() == null)
            return false;
        if (other.getActiveInputAttachmentName() != null && other.getActiveInputAttachmentName().equals(this.getActiveInputAttachmentName()) == false)
            return false;
        if (other.getActiveInputSwitchActionName() == null ^ this.getActiveInputSwitchActionName() == null)
            return false;
        if (other.getActiveInputSwitchActionName() != null && other.getActiveInputSwitchActionName().equals(this.getActiveInputSwitchActionName()) == false)
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

        hashCode = prime * hashCode + ((getActiveInputAttachmentName() == null) ? 0 : getActiveInputAttachmentName().hashCode());
        hashCode = prime * hashCode + ((getActiveInputSwitchActionName() == null) ? 0 : getActiveInputSwitchActionName().hashCode());
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        return hashCode;
    }

    @Override
    public PipelineDetail clone() {
        try {
            return (PipelineDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.PipelineDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
