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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a data processing configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/ProcessingConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables or disables data processing.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The data processors.
     * </p>
     */
    private java.util.List<Processor> processors;

    /**
     * <p>
     * Enables or disables data processing.
     * </p>
     * 
     * @param enabled
     *        Enables or disables data processing.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enables or disables data processing.
     * </p>
     * 
     * @return Enables or disables data processing.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enables or disables data processing.
     * </p>
     * 
     * @param enabled
     *        Enables or disables data processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Enables or disables data processing.
     * </p>
     * 
     * @return Enables or disables data processing.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The data processors.
     * </p>
     * 
     * @return The data processors.
     */

    public java.util.List<Processor> getProcessors() {
        return processors;
    }

    /**
     * <p>
     * The data processors.
     * </p>
     * 
     * @param processors
     *        The data processors.
     */

    public void setProcessors(java.util.Collection<Processor> processors) {
        if (processors == null) {
            this.processors = null;
            return;
        }

        this.processors = new java.util.ArrayList<Processor>(processors);
    }

    /**
     * <p>
     * The data processors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessors(java.util.Collection)} or {@link #withProcessors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param processors
     *        The data processors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingConfiguration withProcessors(Processor... processors) {
        if (this.processors == null) {
            setProcessors(new java.util.ArrayList<Processor>(processors.length));
        }
        for (Processor ele : processors) {
            this.processors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data processors.
     * </p>
     * 
     * @param processors
     *        The data processors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingConfiguration withProcessors(java.util.Collection<Processor> processors) {
        setProcessors(processors);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getProcessors() != null)
            sb.append("Processors: ").append(getProcessors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingConfiguration == false)
            return false;
        ProcessingConfiguration other = (ProcessingConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getProcessors() == null ^ this.getProcessors() == null)
            return false;
        if (other.getProcessors() != null && other.getProcessors().equals(this.getProcessors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getProcessors() == null) ? 0 : getProcessors().hashCode());
        return hashCode;
    }

    @Override
    public ProcessingConfiguration clone() {
        try {
            return (ProcessingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.ProcessingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
