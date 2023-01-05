/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a server's CPU.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CPU" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CPU implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of CPU cores.
     * </p>
     */
    private Long cores;
    /**
     * <p>
     * The model name of the CPU.
     * </p>
     */
    private String modelName;

    /**
     * <p>
     * The number of CPU cores.
     * </p>
     * 
     * @param cores
     *        The number of CPU cores.
     */

    public void setCores(Long cores) {
        this.cores = cores;
    }

    /**
     * <p>
     * The number of CPU cores.
     * </p>
     * 
     * @return The number of CPU cores.
     */

    public Long getCores() {
        return this.cores;
    }

    /**
     * <p>
     * The number of CPU cores.
     * </p>
     * 
     * @param cores
     *        The number of CPU cores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPU withCores(Long cores) {
        setCores(cores);
        return this;
    }

    /**
     * <p>
     * The model name of the CPU.
     * </p>
     * 
     * @param modelName
     *        The model name of the CPU.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The model name of the CPU.
     * </p>
     * 
     * @return The model name of the CPU.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The model name of the CPU.
     * </p>
     * 
     * @param modelName
     *        The model name of the CPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPU withModelName(String modelName) {
        setModelName(modelName);
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
        if (getCores() != null)
            sb.append("Cores: ").append(getCores()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CPU == false)
            return false;
        CPU other = (CPU) obj;
        if (other.getCores() == null ^ this.getCores() == null)
            return false;
        if (other.getCores() != null && other.getCores().equals(this.getCores()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCores() == null) ? 0 : getCores().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        return hashCode;
    }

    @Override
    public CPU clone() {
        try {
            return (CPU) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.CPUMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
