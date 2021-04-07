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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Source server CPU information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CPU" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CPU implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of CPU cores on the source server.
     * </p>
     */
    private Long cores;
    /**
     * <p>
     * The source server's CPU model name.
     * </p>
     */
    private String modelName;

    /**
     * <p>
     * The number of CPU cores on the source server.
     * </p>
     * 
     * @param cores
     *        The number of CPU cores on the source server.
     */

    public void setCores(Long cores) {
        this.cores = cores;
    }

    /**
     * <p>
     * The number of CPU cores on the source server.
     * </p>
     * 
     * @return The number of CPU cores on the source server.
     */

    public Long getCores() {
        return this.cores;
    }

    /**
     * <p>
     * The number of CPU cores on the source server.
     * </p>
     * 
     * @param cores
     *        The number of CPU cores on the source server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPU withCores(Long cores) {
        setCores(cores);
        return this;
    }

    /**
     * <p>
     * The source server's CPU model name.
     * </p>
     * 
     * @param modelName
     *        The source server's CPU model name.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The source server's CPU model name.
     * </p>
     * 
     * @return The source server's CPU model name.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The source server's CPU model name.
     * </p>
     * 
     * @param modelName
     *        The source server's CPU model name.
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
        com.amazonaws.services.mgn.model.transform.CPUMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
