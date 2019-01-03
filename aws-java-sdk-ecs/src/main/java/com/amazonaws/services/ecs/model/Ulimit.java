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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>ulimit</code> settings to pass to the container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Ulimit" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ulimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The soft limit for the ulimit type.
     * </p>
     */
    private Integer softLimit;
    /**
     * <p>
     * The hard limit for the ulimit type.
     * </p>
     */
    private Integer hardLimit;

    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     * 
     * @param name
     *        The <code>type</code> of the <code>ulimit</code>.
     * @see UlimitName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     * 
     * @return The <code>type</code> of the <code>ulimit</code>.
     * @see UlimitName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     * 
     * @param name
     *        The <code>type</code> of the <code>ulimit</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UlimitName
     */

    public Ulimit withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     * 
     * @param name
     *        The <code>type</code> of the <code>ulimit</code>.
     * @see UlimitName
     */

    public void setName(UlimitName name) {
        withName(name);
    }

    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     * 
     * @param name
     *        The <code>type</code> of the <code>ulimit</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UlimitName
     */

    public Ulimit withName(UlimitName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The soft limit for the ulimit type.
     * </p>
     * 
     * @param softLimit
     *        The soft limit for the ulimit type.
     */

    public void setSoftLimit(Integer softLimit) {
        this.softLimit = softLimit;
    }

    /**
     * <p>
     * The soft limit for the ulimit type.
     * </p>
     * 
     * @return The soft limit for the ulimit type.
     */

    public Integer getSoftLimit() {
        return this.softLimit;
    }

    /**
     * <p>
     * The soft limit for the ulimit type.
     * </p>
     * 
     * @param softLimit
     *        The soft limit for the ulimit type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ulimit withSoftLimit(Integer softLimit) {
        setSoftLimit(softLimit);
        return this;
    }

    /**
     * <p>
     * The hard limit for the ulimit type.
     * </p>
     * 
     * @param hardLimit
     *        The hard limit for the ulimit type.
     */

    public void setHardLimit(Integer hardLimit) {
        this.hardLimit = hardLimit;
    }

    /**
     * <p>
     * The hard limit for the ulimit type.
     * </p>
     * 
     * @return The hard limit for the ulimit type.
     */

    public Integer getHardLimit() {
        return this.hardLimit;
    }

    /**
     * <p>
     * The hard limit for the ulimit type.
     * </p>
     * 
     * @param hardLimit
     *        The hard limit for the ulimit type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ulimit withHardLimit(Integer hardLimit) {
        setHardLimit(hardLimit);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSoftLimit() != null)
            sb.append("SoftLimit: ").append(getSoftLimit()).append(",");
        if (getHardLimit() != null)
            sb.append("HardLimit: ").append(getHardLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ulimit == false)
            return false;
        Ulimit other = (Ulimit) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSoftLimit() == null ^ this.getSoftLimit() == null)
            return false;
        if (other.getSoftLimit() != null && other.getSoftLimit().equals(this.getSoftLimit()) == false)
            return false;
        if (other.getHardLimit() == null ^ this.getHardLimit() == null)
            return false;
        if (other.getHardLimit() != null && other.getHardLimit().equals(this.getHardLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSoftLimit() == null) ? 0 : getSoftLimit().hashCode());
        hashCode = prime * hashCode + ((getHardLimit() == null) ? 0 : getHardLimit().hashCode());
        return hashCode;
    }

    @Override
    public Ulimit clone() {
        try {
            return (Ulimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.UlimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
