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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex data type for the origin groups specified for a distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/OriginGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginGroups implements Serializable, Cloneable {

    /**
     * <p>
     * The number of origin groups.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * The items (origin groups) in a distribution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OriginGroup> items;

    /**
     * <p>
     * The number of origin groups.
     * </p>
     * 
     * @param quantity
     *        The number of origin groups.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of origin groups.
     * </p>
     * 
     * @return The number of origin groups.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of origin groups.
     * </p>
     * 
     * @param quantity
     *        The number of origin groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginGroups withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * The items (origin groups) in a distribution.
     * </p>
     * 
     * @return The items (origin groups) in a distribution.
     */

    public java.util.List<OriginGroup> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<OriginGroup>();
        }
        return items;
    }

    /**
     * <p>
     * The items (origin groups) in a distribution.
     * </p>
     * 
     * @param items
     *        The items (origin groups) in a distribution.
     */

    public void setItems(java.util.Collection<OriginGroup> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<OriginGroup>(items);
    }

    /**
     * <p>
     * The items (origin groups) in a distribution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The items (origin groups) in a distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginGroups withItems(OriginGroup... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<OriginGroup>(items.length));
        }
        for (OriginGroup ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The items (origin groups) in a distribution.
     * </p>
     * 
     * @param items
     *        The items (origin groups) in a distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginGroups withItems(java.util.Collection<OriginGroup> items) {
        setItems(items);
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
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginGroups == false)
            return false;
        OriginGroups other = (OriginGroups) obj;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public OriginGroups clone() {
        try {
            return (OriginGroups) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
