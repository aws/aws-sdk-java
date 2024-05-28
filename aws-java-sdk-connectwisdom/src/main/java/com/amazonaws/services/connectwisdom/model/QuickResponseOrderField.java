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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The quick response fields to order the quick response query results by.
 * </p>
 * <p>
 * The following is the list of supported field names.
 * </p>
 * <ul>
 * <li>
 * <p>
 * name
 * </p>
 * </li>
 * <li>
 * <p>
 * description
 * </p>
 * </li>
 * <li>
 * <p>
 * shortcutKey
 * </p>
 * </li>
 * <li>
 * <p>
 * isActive
 * </p>
 * </li>
 * <li>
 * <p>
 * channels
 * </p>
 * </li>
 * <li>
 * <p>
 * language
 * </p>
 * </li>
 * <li>
 * <p>
 * contentType
 * </p>
 * </li>
 * <li>
 * <p>
 * createdTime
 * </p>
 * </li>
 * <li>
 * <p>
 * lastModifiedTime
 * </p>
 * </li>
 * <li>
 * <p>
 * lastModifiedBy
 * </p>
 * </li>
 * <li>
 * <p>
 * groupingConfiguration.criteria
 * </p>
 * </li>
 * <li>
 * <p>
 * groupingConfiguration.values
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/QuickResponseOrderField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuickResponseOrderField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the attribute to order the quick response query results by.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The order at which the quick responses are sorted by.
     * </p>
     */
    private String order;

    /**
     * <p>
     * The name of the attribute to order the quick response query results by.
     * </p>
     * 
     * @param name
     *        The name of the attribute to order the quick response query results by.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute to order the quick response query results by.
     * </p>
     * 
     * @return The name of the attribute to order the quick response query results by.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the attribute to order the quick response query results by.
     * </p>
     * 
     * @param name
     *        The name of the attribute to order the quick response query results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseOrderField withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The order at which the quick responses are sorted by.
     * </p>
     * 
     * @param order
     *        The order at which the quick responses are sorted by.
     * @see Order
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * The order at which the quick responses are sorted by.
     * </p>
     * 
     * @return The order at which the quick responses are sorted by.
     * @see Order
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The order at which the quick responses are sorted by.
     * </p>
     * 
     * @param order
     *        The order at which the quick responses are sorted by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public QuickResponseOrderField withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The order at which the quick responses are sorted by.
     * </p>
     * 
     * @param order
     *        The order at which the quick responses are sorted by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public QuickResponseOrderField withOrder(Order order) {
        this.order = order.toString();
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
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuickResponseOrderField == false)
            return false;
        QuickResponseOrderField other = (QuickResponseOrderField) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public QuickResponseOrderField clone() {
        try {
            return (QuickResponseOrderField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.QuickResponseOrderFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
