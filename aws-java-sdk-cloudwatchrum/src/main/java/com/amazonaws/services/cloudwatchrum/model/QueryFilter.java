/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that defines a key and values that you can use to filter the results. The only performance events that
 * are returned are those that have values matching the ones that you specify in one of your <code>QueryFilter</code>
 * structures.
 * </p>
 * <p>
 * For example, you could specify <code>Browser</code> as the <code>Name</code> and specify <code>Chrome,Firefox</code>
 * as the <code>Values</code> to return events generated only from those browsers.
 * </p>
 * <p>
 * Specifying <code>Invert</code> as the <code>Name</code> works as a "not equal to" filter. For example, specify
 * <code>Invert</code> as the <code>Name</code> and specify <code>Chrome</code> as the value to return all events except
 * events from user sessions with the Chrome browser.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/QueryFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a key to search for. The filter returns only the events that match the <code>Name</code> and
     * <code>Values</code> that you specify.
     * </p>
     * <p>
     * Valid values for <code>Name</code> are <code>Browser</code> | <code>Device</code> | <code>Country</code> |
     * <code>Page</code> | <code>OS</code> | <code>EventType</code> | <code>Invert</code>
     * </p>
     */
    private String name;
    /**
     * <p>
     * The values of the <code>Name</code> that are to be be included in the returned results.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of a key to search for. The filter returns only the events that match the <code>Name</code> and
     * <code>Values</code> that you specify.
     * </p>
     * <p>
     * Valid values for <code>Name</code> are <code>Browser</code> | <code>Device</code> | <code>Country</code> |
     * <code>Page</code> | <code>OS</code> | <code>EventType</code> | <code>Invert</code>
     * </p>
     * 
     * @param name
     *        The name of a key to search for. The filter returns only the events that match the <code>Name</code> and
     *        <code>Values</code> that you specify. </p>
     *        <p>
     *        Valid values for <code>Name</code> are <code>Browser</code> | <code>Device</code> | <code>Country</code> |
     *        <code>Page</code> | <code>OS</code> | <code>EventType</code> | <code>Invert</code>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a key to search for. The filter returns only the events that match the <code>Name</code> and
     * <code>Values</code> that you specify.
     * </p>
     * <p>
     * Valid values for <code>Name</code> are <code>Browser</code> | <code>Device</code> | <code>Country</code> |
     * <code>Page</code> | <code>OS</code> | <code>EventType</code> | <code>Invert</code>
     * </p>
     * 
     * @return The name of a key to search for. The filter returns only the events that match the <code>Name</code> and
     *         <code>Values</code> that you specify. </p>
     *         <p>
     *         Valid values for <code>Name</code> are <code>Browser</code> | <code>Device</code> | <code>Country</code>
     *         | <code>Page</code> | <code>OS</code> | <code>EventType</code> | <code>Invert</code>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a key to search for. The filter returns only the events that match the <code>Name</code> and
     * <code>Values</code> that you specify.
     * </p>
     * <p>
     * Valid values for <code>Name</code> are <code>Browser</code> | <code>Device</code> | <code>Country</code> |
     * <code>Page</code> | <code>OS</code> | <code>EventType</code> | <code>Invert</code>
     * </p>
     * 
     * @param name
     *        The name of a key to search for. The filter returns only the events that match the <code>Name</code> and
     *        <code>Values</code> that you specify. </p>
     *        <p>
     *        Valid values for <code>Name</code> are <code>Browser</code> | <code>Device</code> | <code>Country</code> |
     *        <code>Page</code> | <code>OS</code> | <code>EventType</code> | <code>Invert</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The values of the <code>Name</code> that are to be be included in the returned results.
     * </p>
     * 
     * @return The values of the <code>Name</code> that are to be be included in the returned results.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values of the <code>Name</code> that are to be be included in the returned results.
     * </p>
     * 
     * @param values
     *        The values of the <code>Name</code> that are to be be included in the returned results.
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
     * The values of the <code>Name</code> that are to be be included in the returned results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values of the <code>Name</code> that are to be be included in the returned results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilter withValues(String... values) {
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
     * The values of the <code>Name</code> that are to be be included in the returned results.
     * </p>
     * 
     * @param values
     *        The values of the <code>Name</code> that are to be be included in the returned results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof QueryFilter == false)
            return false;
        QueryFilter other = (QueryFilter) obj;
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
    public QueryFilter clone() {
        try {
            return (QueryFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.QueryFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
