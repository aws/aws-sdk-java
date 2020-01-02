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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a filter to apply to the list of returned event types. You can filter by resource type or service
 * name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListEventTypesFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventTypesFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-generated name of the filter type you want to filter by.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the resource type (for example, pipeline) or service name (for example, CodePipeline) that you want
     * to filter by.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The system-generated name of the filter type you want to filter by.
     * </p>
     * 
     * @param name
     *        The system-generated name of the filter type you want to filter by.
     * @see ListEventTypesFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The system-generated name of the filter type you want to filter by.
     * </p>
     * 
     * @return The system-generated name of the filter type you want to filter by.
     * @see ListEventTypesFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The system-generated name of the filter type you want to filter by.
     * </p>
     * 
     * @param name
     *        The system-generated name of the filter type you want to filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListEventTypesFilterName
     */

    public ListEventTypesFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The system-generated name of the filter type you want to filter by.
     * </p>
     * 
     * @param name
     *        The system-generated name of the filter type you want to filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListEventTypesFilterName
     */

    public ListEventTypesFilter withName(ListEventTypesFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The name of the resource type (for example, pipeline) or service name (for example, CodePipeline) that you want
     * to filter by.
     * </p>
     * 
     * @param value
     *        The name of the resource type (for example, pipeline) or service name (for example, CodePipeline) that you
     *        want to filter by.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The name of the resource type (for example, pipeline) or service name (for example, CodePipeline) that you want
     * to filter by.
     * </p>
     * 
     * @return The name of the resource type (for example, pipeline) or service name (for example, CodePipeline) that
     *         you want to filter by.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The name of the resource type (for example, pipeline) or service name (for example, CodePipeline) that you want
     * to filter by.
     * </p>
     * 
     * @param value
     *        The name of the resource type (for example, pipeline) or service name (for example, CodePipeline) that you
     *        want to filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventTypesFilter withValue(String value) {
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

        if (obj instanceof ListEventTypesFilter == false)
            return false;
        ListEventTypesFilter other = (ListEventTypesFilter) obj;
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
    public ListEventTypesFilter clone() {
        try {
            return (ListEventTypesFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestarnotifications.model.transform.ListEventTypesFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
