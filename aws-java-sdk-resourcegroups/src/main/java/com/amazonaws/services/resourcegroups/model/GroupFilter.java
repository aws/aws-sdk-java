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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter name and value pair that is used to obtain more specific results from a list of groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GroupFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     */
    private String name;
    /**
     * <p>
     * One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     * 
     * @param name
     *        The name of the filter. Filter names are case-sensitive.
     * @see GroupFilterName
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
     * @see GroupFilterName
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
     * @see GroupFilterName
     */

    public GroupFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     * 
     * @param name
     *        The name of the filter. Filter names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupFilterName
     */

    public GroupFilter withName(GroupFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
     * </p>
     * 
     * @return One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
     * </p>
     * 
     * @param values
     *        One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
     * </p>
     * 
     * @param values
     *        One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupFilter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof GroupFilter == false)
            return false;
        GroupFilter other = (GroupFilter) obj;
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
    public GroupFilter clone() {
        try {
            return (GroupFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.GroupFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
