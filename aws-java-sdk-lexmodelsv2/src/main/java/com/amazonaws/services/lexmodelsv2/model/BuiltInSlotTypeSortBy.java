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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies attributes for sorting a list of built-in slot types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BuiltInSlotTypeSortBy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuiltInSlotTypeSortBy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attribute to use to sort the list of built-in intents.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The order to sort the list. You can choose ascending or descending.
     * </p>
     */
    private String order;

    /**
     * <p>
     * The attribute to use to sort the list of built-in intents.
     * </p>
     * 
     * @param attribute
     *        The attribute to use to sort the list of built-in intents.
     * @see BuiltInSlotTypeSortAttribute
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The attribute to use to sort the list of built-in intents.
     * </p>
     * 
     * @return The attribute to use to sort the list of built-in intents.
     * @see BuiltInSlotTypeSortAttribute
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The attribute to use to sort the list of built-in intents.
     * </p>
     * 
     * @param attribute
     *        The attribute to use to sort the list of built-in intents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BuiltInSlotTypeSortAttribute
     */

    public BuiltInSlotTypeSortBy withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The attribute to use to sort the list of built-in intents.
     * </p>
     * 
     * @param attribute
     *        The attribute to use to sort the list of built-in intents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BuiltInSlotTypeSortAttribute
     */

    public BuiltInSlotTypeSortBy withAttribute(BuiltInSlotTypeSortAttribute attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The order to sort the list. You can choose ascending or descending.
     * </p>
     * 
     * @param order
     *        The order to sort the list. You can choose ascending or descending.
     * @see SortOrder
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * The order to sort the list. You can choose ascending or descending.
     * </p>
     * 
     * @return The order to sort the list. You can choose ascending or descending.
     * @see SortOrder
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The order to sort the list. You can choose ascending or descending.
     * </p>
     * 
     * @param order
     *        The order to sort the list. You can choose ascending or descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public BuiltInSlotTypeSortBy withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The order to sort the list. You can choose ascending or descending.
     * </p>
     * 
     * @param order
     *        The order to sort the list. You can choose ascending or descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public BuiltInSlotTypeSortBy withOrder(SortOrder order) {
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

        if (obj instanceof BuiltInSlotTypeSortBy == false)
            return false;
        BuiltInSlotTypeSortBy other = (BuiltInSlotTypeSortBy) obj;
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
    public BuiltInSlotTypeSortBy clone() {
        try {
            return (BuiltInSlotTypeSortBy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BuiltInSlotTypeSortByMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
