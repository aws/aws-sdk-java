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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the minimum number of healthy instances per Availability Zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/MinimumHealthyHostsPerZone"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MinimumHealthyHostsPerZone implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>type</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The <code>value</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * </p>
     */
    private Integer value;

    /**
     * <p>
     * The <code>type</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * </p>
     * 
     * @param type
     *        The <code>type</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * @see MinimumHealthyHostsPerZoneType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The <code>type</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * </p>
     * 
     * @return The <code>type</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * @see MinimumHealthyHostsPerZoneType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The <code>type</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * </p>
     * 
     * @param type
     *        The <code>type</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MinimumHealthyHostsPerZoneType
     */

    public MinimumHealthyHostsPerZone withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The <code>type</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * </p>
     * 
     * @param type
     *        The <code>type</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MinimumHealthyHostsPerZoneType
     */

    public MinimumHealthyHostsPerZone withType(MinimumHealthyHostsPerZoneType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The <code>value</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * </p>
     * 
     * @param value
     *        The <code>value</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * The <code>value</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * </p>
     * 
     * @return The <code>value</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * The <code>value</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * </p>
     * 
     * @param value
     *        The <code>value</code> associated with the <code>MinimumHealthyHostsPerZone</code> option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MinimumHealthyHostsPerZone withValue(Integer value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MinimumHealthyHostsPerZone == false)
            return false;
        MinimumHealthyHostsPerZone other = (MinimumHealthyHostsPerZone) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public MinimumHealthyHostsPerZone clone() {
        try {
            return (MinimumHealthyHostsPerZone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.MinimumHealthyHostsPerZoneMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
