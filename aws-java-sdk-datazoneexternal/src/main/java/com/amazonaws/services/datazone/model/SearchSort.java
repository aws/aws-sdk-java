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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the way to sort search results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchSort" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchSort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attribute detail of the way to sort search results.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The order detail of the wya to sort search results.
     * </p>
     */
    private String order;

    /**
     * <p>
     * The attribute detail of the way to sort search results.
     * </p>
     * 
     * @param attribute
     *        The attribute detail of the way to sort search results.
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The attribute detail of the way to sort search results.
     * </p>
     * 
     * @return The attribute detail of the way to sort search results.
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The attribute detail of the way to sort search results.
     * </p>
     * 
     * @param attribute
     *        The attribute detail of the way to sort search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSort withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The order detail of the wya to sort search results.
     * </p>
     * 
     * @param order
     *        The order detail of the wya to sort search results.
     * @see SortOrder
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * The order detail of the wya to sort search results.
     * </p>
     * 
     * @return The order detail of the wya to sort search results.
     * @see SortOrder
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The order detail of the wya to sort search results.
     * </p>
     * 
     * @param order
     *        The order detail of the wya to sort search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SearchSort withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The order detail of the wya to sort search results.
     * </p>
     * 
     * @param order
     *        The order detail of the wya to sort search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SearchSort withOrder(SortOrder order) {
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
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

        if (obj instanceof SearchSort == false)
            return false;
        SearchSort other = (SearchSort) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
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

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public SearchSort clone() {
        try {
            return (SearchSort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SearchSortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
