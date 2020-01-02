/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A set of elements to filter the returned scheduled actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ScheduledActionFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledActionFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The type of element to filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * List of values. Compare if the value (of type defined by <code>Name</code>) equals an item in the list of
     * scheduled actions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The type of element to filter.
     * </p>
     * 
     * @param name
     *        The type of element to filter.
     * @see ScheduledActionFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The type of element to filter.
     * </p>
     * 
     * @return The type of element to filter.
     * @see ScheduledActionFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The type of element to filter.
     * </p>
     * 
     * @param name
     *        The type of element to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledActionFilterName
     */

    public ScheduledActionFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of element to filter.
     * </p>
     * 
     * @param name
     *        The type of element to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledActionFilterName
     */

    public ScheduledActionFilter withName(ScheduledActionFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * List of values. Compare if the value (of type defined by <code>Name</code>) equals an item in the list of
     * scheduled actions.
     * </p>
     * 
     * @return List of values. Compare if the value (of type defined by <code>Name</code>) equals an item in the list of
     *         scheduled actions.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * List of values. Compare if the value (of type defined by <code>Name</code>) equals an item in the list of
     * scheduled actions.
     * </p>
     * 
     * @param values
     *        List of values. Compare if the value (of type defined by <code>Name</code>) equals an item in the list of
     *        scheduled actions.
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
     * List of values. Compare if the value (of type defined by <code>Name</code>) equals an item in the list of
     * scheduled actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        List of values. Compare if the value (of type defined by <code>Name</code>) equals an item in the list of
     *        scheduled actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionFilter withValues(String... values) {
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
     * List of values. Compare if the value (of type defined by <code>Name</code>) equals an item in the list of
     * scheduled actions.
     * </p>
     * 
     * @param values
     *        List of values. Compare if the value (of type defined by <code>Name</code>) equals an item in the list of
     *        scheduled actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionFilter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof ScheduledActionFilter == false)
            return false;
        ScheduledActionFilter other = (ScheduledActionFilter) obj;
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
    public ScheduledActionFilter clone() {
        try {
            return (ScheduledActionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
