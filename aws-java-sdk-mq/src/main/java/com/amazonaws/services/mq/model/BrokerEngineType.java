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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Types of broker engines.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/BrokerEngineType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrokerEngineType implements Serializable, Cloneable, StructuredPojo {

    /** The type of broker engine. */
    private String engineType;
    /** The list of engine versions. */
    private java.util.List<EngineVersion> engineVersions;

    /**
     * The type of broker engine.
     * 
     * @param engineType
     *        The type of broker engine.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * The type of broker engine.
     * 
     * @return The type of broker engine.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * The type of broker engine.
     * 
     * @param engineType
     *        The type of broker engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public BrokerEngineType withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * The type of broker engine.
     * 
     * @param engineType
     *        The type of broker engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public BrokerEngineType withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * The list of engine versions.
     * 
     * @return The list of engine versions.
     */

    public java.util.List<EngineVersion> getEngineVersions() {
        return engineVersions;
    }

    /**
     * The list of engine versions.
     * 
     * @param engineVersions
     *        The list of engine versions.
     */

    public void setEngineVersions(java.util.Collection<EngineVersion> engineVersions) {
        if (engineVersions == null) {
            this.engineVersions = null;
            return;
        }

        this.engineVersions = new java.util.ArrayList<EngineVersion>(engineVersions);
    }

    /**
     * The list of engine versions.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEngineVersions(java.util.Collection)} or {@link #withEngineVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param engineVersions
     *        The list of engine versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerEngineType withEngineVersions(EngineVersion... engineVersions) {
        if (this.engineVersions == null) {
            setEngineVersions(new java.util.ArrayList<EngineVersion>(engineVersions.length));
        }
        for (EngineVersion ele : engineVersions) {
            this.engineVersions.add(ele);
        }
        return this;
    }

    /**
     * The list of engine versions.
     * 
     * @param engineVersions
     *        The list of engine versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerEngineType withEngineVersions(java.util.Collection<EngineVersion> engineVersions) {
        setEngineVersions(engineVersions);
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
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEngineVersions() != null)
            sb.append("EngineVersions: ").append(getEngineVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerEngineType == false)
            return false;
        BrokerEngineType other = (BrokerEngineType) obj;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getEngineVersions() == null ^ this.getEngineVersions() == null)
            return false;
        if (other.getEngineVersions() != null && other.getEngineVersions().equals(this.getEngineVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersions() == null) ? 0 : getEngineVersions().hashCode());
        return hashCode;
    }

    @Override
    public BrokerEngineType clone() {
        try {
            return (BrokerEngineType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.BrokerEngineTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
