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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A filter name and value pair that is used to return a more specific list of results from a describe operation.
 * Filters can be used to match a set of resources by specific criteria, such as tags, attributes, or IDs. The filters
 * supported by a describe operation are documented with the describe operation. For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeAvailabilityZones</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeImages</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeInstances</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeKeyPairs</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeSecurityGroups</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeSnapshots</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeSubnets</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeTags</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeVolumes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeVpcs</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Filter" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The filter values. Filter values are case-sensitive.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * Default constructor for Filter object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Filter() {
    }

    /**
     * Constructs a new Filter object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param name
     *        The name of the filter. Filter names are case-sensitive.
     */
    public Filter(String name) {
        setName(name);
    }

    /**
     * Constructs a new Filter object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param name
     *        The name of the filter. Filter names are case-sensitive.
     * @param values
     *        The filter values. Filter values are case-sensitive.
     */
    public Filter(String name, java.util.List<String> values) {
        setName(name);
        setValues(values);
    }

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     * 
     * @param name
     *        The name of the filter. Filter names are case-sensitive.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     * 
     * @return The name of the filter. Filter names are case-sensitive.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     * 
     * @param name
     *        The name of the filter. Filter names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The filter values. Filter values are case-sensitive.
     * </p>
     * 
     * @return The filter values. Filter values are case-sensitive.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The filter values. Filter values are case-sensitive.
     * </p>
     * 
     * @param values
     *        The filter values. Filter values are case-sensitive.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * The filter values. Filter values are case-sensitive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The filter values. Filter values are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filter values. Filter values are case-sensitive.
     * </p>
     * 
     * @param values
     *        The filter values. Filter values are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
