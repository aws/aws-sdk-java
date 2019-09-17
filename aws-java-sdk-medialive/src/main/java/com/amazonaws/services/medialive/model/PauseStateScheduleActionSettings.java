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
 * Settings for the action to set pause state of a channel.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/PauseStateScheduleActionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PauseStateScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<PipelinePauseStateSettings> pipelines;

    /**
     * @return
     */

    public java.util.List<PipelinePauseStateSettings> getPipelines() {
        return pipelines;
    }

    /**
     * @param pipelines
     */

    public void setPipelines(java.util.Collection<PipelinePauseStateSettings> pipelines) {
        if (pipelines == null) {
            this.pipelines = null;
            return;
        }

        this.pipelines = new java.util.ArrayList<PipelinePauseStateSettings>(pipelines);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelines(java.util.Collection)} or {@link #withPipelines(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pipelines
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PauseStateScheduleActionSettings withPipelines(PipelinePauseStateSettings... pipelines) {
        if (this.pipelines == null) {
            setPipelines(new java.util.ArrayList<PipelinePauseStateSettings>(pipelines.length));
        }
        for (PipelinePauseStateSettings ele : pipelines) {
            this.pipelines.add(ele);
        }
        return this;
    }

    /**
     * @param pipelines
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PauseStateScheduleActionSettings withPipelines(java.util.Collection<PipelinePauseStateSettings> pipelines) {
        setPipelines(pipelines);
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
        if (getPipelines() != null)
            sb.append("Pipelines: ").append(getPipelines());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PauseStateScheduleActionSettings == false)
            return false;
        PauseStateScheduleActionSettings other = (PauseStateScheduleActionSettings) obj;
        if (other.getPipelines() == null ^ this.getPipelines() == null)
            return false;
        if (other.getPipelines() != null && other.getPipelines().equals(this.getPipelines()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelines() == null) ? 0 : getPipelines().hashCode());
        return hashCode;
    }

    @Override
    public PauseStateScheduleActionSettings clone() {
        try {
            return (PauseStateScheduleActionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.PauseStateScheduleActionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
