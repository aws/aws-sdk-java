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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that filters a system instance search. Multiple filters function as OR criteria in the search. For example
 * a search that includes a GREENGRASS_GROUP_NAME and a STATUS filter searches for system instances in the specified
 * Greengrass group that have the specified status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SystemInstanceFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemInstanceFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the search filter field.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
     * </p>
     */
    private java.util.List<String> value;

    /**
     * <p>
     * The name of the search filter field.
     * </p>
     * 
     * @param name
     *        The name of the search filter field.
     * @see SystemInstanceFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the search filter field.
     * </p>
     * 
     * @return The name of the search filter field.
     * @see SystemInstanceFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the search filter field.
     * </p>
     * 
     * @param name
     *        The name of the search filter field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SystemInstanceFilterName
     */

    public SystemInstanceFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the search filter field.
     * </p>
     * 
     * @param name
     *        The name of the search filter field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SystemInstanceFilterName
     */

    public SystemInstanceFilter withName(SystemInstanceFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
     * </p>
     * 
     * @return An array of string values for the search filter field. Multiple values function as AND criteria in the
     *         search.
     */

    public java.util.List<String> getValue() {
        return value;
    }

    /**
     * <p>
     * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
     * </p>
     * 
     * @param value
     *        An array of string values for the search filter field. Multiple values function as AND criteria in the
     *        search.
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
     * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValue(java.util.Collection)} or {@link #withValue(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param value
     *        An array of string values for the search filter field. Multiple values function as AND criteria in the
     *        search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceFilter withValue(String... value) {
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
     * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
     * </p>
     * 
     * @param value
     *        An array of string values for the search filter field. Multiple values function as AND criteria in the
     *        search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceFilter withValue(java.util.Collection<String> value) {
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

        if (obj instanceof SystemInstanceFilter == false)
            return false;
        SystemInstanceFilter other = (SystemInstanceFilter) obj;
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
    public SystemInstanceFilter clone() {
        try {
            return (SystemInstanceFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotthingsgraph.model.transform.SystemInstanceFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
