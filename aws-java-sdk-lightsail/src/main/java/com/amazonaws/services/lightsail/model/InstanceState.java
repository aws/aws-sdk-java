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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the virtual private server (or <i>instance</i>) status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/InstanceState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status code for the instance.
     * </p>
     */
    private Integer code;
    /**
     * <p>
     * The state of the instance (e.g., <code>running</code> or <code>pending</code>).
     * </p>
     */
    private String name;

    /**
     * <p>
     * The status code for the instance.
     * </p>
     * 
     * @param code
     *        The status code for the instance.
     */

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * <p>
     * The status code for the instance.
     * </p>
     * 
     * @return The status code for the instance.
     */

    public Integer getCode() {
        return this.code;
    }

    /**
     * <p>
     * The status code for the instance.
     * </p>
     * 
     * @param code
     *        The status code for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceState withCode(Integer code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The state of the instance (e.g., <code>running</code> or <code>pending</code>).
     * </p>
     * 
     * @param name
     *        The state of the instance (e.g., <code>running</code> or <code>pending</code>).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The state of the instance (e.g., <code>running</code> or <code>pending</code>).
     * </p>
     * 
     * @return The state of the instance (e.g., <code>running</code> or <code>pending</code>).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The state of the instance (e.g., <code>running</code> or <code>pending</code>).
     * </p>
     * 
     * @param name
     *        The state of the instance (e.g., <code>running</code> or <code>pending</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceState withName(String name) {
        setName(name);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceState == false)
            return false;
        InstanceState other = (InstanceState) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public InstanceState clone() {
        try {
            return (InstanceState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InstanceStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
