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
 * Describes the resources available for a container instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Resource" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the resource, such as <code>CPU</code>, <code>MEMORY</code>, <code>PORTS</code>,
     * <code>PORTS_UDP</code>, or a user-defined resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the resource, such as <code>INTEGER</code>, <code>DOUBLE</code>, <code>LONG</code>, or
     * <code>STRINGSET</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * When the <code>doubleValue</code> type is set, the value of the resource must be a double precision
     * floating-point type.
     * </p>
     */
    private Double doubleValue;
    /**
     * <p>
     * When the <code>longValue</code> type is set, the value of the resource must be an extended precision
     * floating-point type.
     * </p>
     */
    private Long longValue;
    /**
     * <p>
     * When the <code>integerValue</code> type is set, the value of the resource must be an integer.
     * </p>
     */
    private Integer integerValue;
    /**
     * <p>
     * When the <code>stringSetValue</code> type is set, the value of the resource must be a string type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> stringSetValue;

    /**
     * <p>
     * The name of the resource, such as <code>CPU</code>, <code>MEMORY</code>, <code>PORTS</code>,
     * <code>PORTS_UDP</code>, or a user-defined resource.
     * </p>
     * 
     * @param name
     *        The name of the resource, such as <code>CPU</code>, <code>MEMORY</code>, <code>PORTS</code>,
     *        <code>PORTS_UDP</code>, or a user-defined resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource, such as <code>CPU</code>, <code>MEMORY</code>, <code>PORTS</code>,
     * <code>PORTS_UDP</code>, or a user-defined resource.
     * </p>
     * 
     * @return The name of the resource, such as <code>CPU</code>, <code>MEMORY</code>, <code>PORTS</code>,
     *         <code>PORTS_UDP</code>, or a user-defined resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource, such as <code>CPU</code>, <code>MEMORY</code>, <code>PORTS</code>,
     * <code>PORTS_UDP</code>, or a user-defined resource.
     * </p>
     * 
     * @param name
     *        The name of the resource, such as <code>CPU</code>, <code>MEMORY</code>, <code>PORTS</code>,
     *        <code>PORTS_UDP</code>, or a user-defined resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the resource, such as <code>INTEGER</code>, <code>DOUBLE</code>, <code>LONG</code>, or
     * <code>STRINGSET</code>.
     * </p>
     * 
     * @param type
     *        The type of the resource, such as <code>INTEGER</code>, <code>DOUBLE</code>, <code>LONG</code>, or
     *        <code>STRINGSET</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the resource, such as <code>INTEGER</code>, <code>DOUBLE</code>, <code>LONG</code>, or
     * <code>STRINGSET</code>.
     * </p>
     * 
     * @return The type of the resource, such as <code>INTEGER</code>, <code>DOUBLE</code>, <code>LONG</code>, or
     *         <code>STRINGSET</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the resource, such as <code>INTEGER</code>, <code>DOUBLE</code>, <code>LONG</code>, or
     * <code>STRINGSET</code>.
     * </p>
     * 
     * @param type
     *        The type of the resource, such as <code>INTEGER</code>, <code>DOUBLE</code>, <code>LONG</code>, or
     *        <code>STRINGSET</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * When the <code>doubleValue</code> type is set, the value of the resource must be a double precision
     * floating-point type.
     * </p>
     * 
     * @param doubleValue
     *        When the <code>doubleValue</code> type is set, the value of the resource must be a double precision
     *        floating-point type.
     */

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * When the <code>doubleValue</code> type is set, the value of the resource must be a double precision
     * floating-point type.
     * </p>
     * 
     * @return When the <code>doubleValue</code> type is set, the value of the resource must be a double precision
     *         floating-point type.
     */

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * <p>
     * When the <code>doubleValue</code> type is set, the value of the resource must be a double precision
     * floating-point type.
     * </p>
     * 
     * @param doubleValue
     *        When the <code>doubleValue</code> type is set, the value of the resource must be a double precision
     *        floating-point type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withDoubleValue(Double doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * <p>
     * When the <code>longValue</code> type is set, the value of the resource must be an extended precision
     * floating-point type.
     * </p>
     * 
     * @param longValue
     *        When the <code>longValue</code> type is set, the value of the resource must be an extended precision
     *        floating-point type.
     */

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    /**
     * <p>
     * When the <code>longValue</code> type is set, the value of the resource must be an extended precision
     * floating-point type.
     * </p>
     * 
     * @return When the <code>longValue</code> type is set, the value of the resource must be an extended precision
     *         floating-point type.
     */

    public Long getLongValue() {
        return this.longValue;
    }

    /**
     * <p>
     * When the <code>longValue</code> type is set, the value of the resource must be an extended precision
     * floating-point type.
     * </p>
     * 
     * @param longValue
     *        When the <code>longValue</code> type is set, the value of the resource must be an extended precision
     *        floating-point type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withLongValue(Long longValue) {
        setLongValue(longValue);
        return this;
    }

    /**
     * <p>
     * When the <code>integerValue</code> type is set, the value of the resource must be an integer.
     * </p>
     * 
     * @param integerValue
     *        When the <code>integerValue</code> type is set, the value of the resource must be an integer.
     */

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * When the <code>integerValue</code> type is set, the value of the resource must be an integer.
     * </p>
     * 
     * @return When the <code>integerValue</code> type is set, the value of the resource must be an integer.
     */

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    /**
     * <p>
     * When the <code>integerValue</code> type is set, the value of the resource must be an integer.
     * </p>
     * 
     * @param integerValue
     *        When the <code>integerValue</code> type is set, the value of the resource must be an integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withIntegerValue(Integer integerValue) {
        setIntegerValue(integerValue);
        return this;
    }

    /**
     * <p>
     * When the <code>stringSetValue</code> type is set, the value of the resource must be a string type.
     * </p>
     * 
     * @return When the <code>stringSetValue</code> type is set, the value of the resource must be a string type.
     */

    public java.util.List<String> getStringSetValue() {
        if (stringSetValue == null) {
            stringSetValue = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return stringSetValue;
    }

    /**
     * <p>
     * When the <code>stringSetValue</code> type is set, the value of the resource must be a string type.
     * </p>
     * 
     * @param stringSetValue
     *        When the <code>stringSetValue</code> type is set, the value of the resource must be a string type.
     */

    public void setStringSetValue(java.util.Collection<String> stringSetValue) {
        if (stringSetValue == null) {
            this.stringSetValue = null;
            return;
        }

        this.stringSetValue = new com.amazonaws.internal.SdkInternalList<String>(stringSetValue);
    }

    /**
     * <p>
     * When the <code>stringSetValue</code> type is set, the value of the resource must be a string type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringSetValue(java.util.Collection)} or {@link #withStringSetValue(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stringSetValue
     *        When the <code>stringSetValue</code> type is set, the value of the resource must be a string type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withStringSetValue(String... stringSetValue) {
        if (this.stringSetValue == null) {
            setStringSetValue(new com.amazonaws.internal.SdkInternalList<String>(stringSetValue.length));
        }
        for (String ele : stringSetValue) {
            this.stringSetValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When the <code>stringSetValue</code> type is set, the value of the resource must be a string type.
     * </p>
     * 
     * @param stringSetValue
     *        When the <code>stringSetValue</code> type is set, the value of the resource must be a string type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withStringSetValue(java.util.Collection<String> stringSetValue) {
        setStringSetValue(stringSetValue);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDoubleValue() != null)
            sb.append("DoubleValue: ").append(getDoubleValue()).append(",");
        if (getLongValue() != null)
            sb.append("LongValue: ").append(getLongValue()).append(",");
        if (getIntegerValue() != null)
            sb.append("IntegerValue: ").append(getIntegerValue()).append(",");
        if (getStringSetValue() != null)
            sb.append("StringSetValue: ").append(getStringSetValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null)
            return false;
        if (other.getDoubleValue() != null && other.getDoubleValue().equals(this.getDoubleValue()) == false)
            return false;
        if (other.getLongValue() == null ^ this.getLongValue() == null)
            return false;
        if (other.getLongValue() != null && other.getLongValue().equals(this.getLongValue()) == false)
            return false;
        if (other.getIntegerValue() == null ^ this.getIntegerValue() == null)
            return false;
        if (other.getIntegerValue() != null && other.getIntegerValue().equals(this.getIntegerValue()) == false)
            return false;
        if (other.getStringSetValue() == null ^ this.getStringSetValue() == null)
            return false;
        if (other.getStringSetValue() != null && other.getStringSetValue().equals(this.getStringSetValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode + ((getLongValue() == null) ? 0 : getLongValue().hashCode());
        hashCode = prime * hashCode + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode());
        hashCode = prime * hashCode + ((getStringSetValue() == null) ? 0 : getStringSetValue().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
