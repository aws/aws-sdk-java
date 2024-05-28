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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Schedule configuration parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateProgramScheduleConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProgramScheduleConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Program clip range configuration.
     * </p>
     */
    private ClipRange clipRange;
    /**
     * <p>
     * Program transition configuration.
     * </p>
     */
    private UpdateProgramTransition transition;

    /**
     * <p>
     * Program clip range configuration.
     * </p>
     * 
     * @param clipRange
     *        Program clip range configuration.
     */

    public void setClipRange(ClipRange clipRange) {
        this.clipRange = clipRange;
    }

    /**
     * <p>
     * Program clip range configuration.
     * </p>
     * 
     * @return Program clip range configuration.
     */

    public ClipRange getClipRange() {
        return this.clipRange;
    }

    /**
     * <p>
     * Program clip range configuration.
     * </p>
     * 
     * @param clipRange
     *        Program clip range configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramScheduleConfiguration withClipRange(ClipRange clipRange) {
        setClipRange(clipRange);
        return this;
    }

    /**
     * <p>
     * Program transition configuration.
     * </p>
     * 
     * @param transition
     *        Program transition configuration.
     */

    public void setTransition(UpdateProgramTransition transition) {
        this.transition = transition;
    }

    /**
     * <p>
     * Program transition configuration.
     * </p>
     * 
     * @return Program transition configuration.
     */

    public UpdateProgramTransition getTransition() {
        return this.transition;
    }

    /**
     * <p>
     * Program transition configuration.
     * </p>
     * 
     * @param transition
     *        Program transition configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramScheduleConfiguration withTransition(UpdateProgramTransition transition) {
        setTransition(transition);
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
        if (getClipRange() != null)
            sb.append("ClipRange: ").append(getClipRange()).append(",");
        if (getTransition() != null)
            sb.append("Transition: ").append(getTransition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProgramScheduleConfiguration == false)
            return false;
        UpdateProgramScheduleConfiguration other = (UpdateProgramScheduleConfiguration) obj;
        if (other.getClipRange() == null ^ this.getClipRange() == null)
            return false;
        if (other.getClipRange() != null && other.getClipRange().equals(this.getClipRange()) == false)
            return false;
        if (other.getTransition() == null ^ this.getTransition() == null)
            return false;
        if (other.getTransition() != null && other.getTransition().equals(this.getTransition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClipRange() == null) ? 0 : getClipRange().hashCode());
        hashCode = prime * hashCode + ((getTransition() == null) ? 0 : getTransition().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProgramScheduleConfiguration clone() {
        try {
            return (UpdateProgramScheduleConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.UpdateProgramScheduleConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
