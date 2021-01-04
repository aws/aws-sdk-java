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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filter to apply in <code>DescribePackage</code> response.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackagesFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Any field from <code>PackageDetails</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of values for the specified field.
     * </p>
     */
    private java.util.List<String> value;

    /**
     * <p>
     * Any field from <code>PackageDetails</code>.
     * </p>
     * 
     * @param name
     *        Any field from <code>PackageDetails</code>.
     * @see DescribePackagesFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Any field from <code>PackageDetails</code>.
     * </p>
     * 
     * @return Any field from <code>PackageDetails</code>.
     * @see DescribePackagesFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Any field from <code>PackageDetails</code>.
     * </p>
     * 
     * @param name
     *        Any field from <code>PackageDetails</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescribePackagesFilterName
     */

    public DescribePackagesFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Any field from <code>PackageDetails</code>.
     * </p>
     * 
     * @param name
     *        Any field from <code>PackageDetails</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescribePackagesFilterName
     */

    public DescribePackagesFilter withName(DescribePackagesFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * A list of values for the specified field.
     * </p>
     * 
     * @return A list of values for the specified field.
     */

    public java.util.List<String> getValue() {
        return value;
    }

    /**
     * <p>
     * A list of values for the specified field.
     * </p>
     * 
     * @param value
     *        A list of values for the specified field.
     */

    public void setValue(java.util.Collection<String> value) {
        if (value == null) {
            this.value = null;
            return;
        }

        this.value = new java.util.ArrayList<String>(value);
    }

    /**
     * <p>
     * A list of values for the specified field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValue(java.util.Collection)} or {@link #withValue(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param value
     *        A list of values for the specified field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagesFilter withValue(String... value) {
        if (this.value == null) {
            setValue(new java.util.ArrayList<String>(value.length));
        }
        for (String ele : value) {
            this.value.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of values for the specified field.
     * </p>
     * 
     * @param value
     *        A list of values for the specified field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagesFilter withValue(java.util.Collection<String> value) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof DescribePackagesFilter == false)
            return false;
        DescribePackagesFilter other = (DescribePackagesFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public DescribePackagesFilter clone() {
        try {
            return (DescribePackagesFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.DescribePackagesFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
