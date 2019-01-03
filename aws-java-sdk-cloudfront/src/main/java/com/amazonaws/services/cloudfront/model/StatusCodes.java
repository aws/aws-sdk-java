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
 * A complex data type for the status codes that you specify that, when returned by a primary origin, trigger CloudFront
 * to failover to a second origin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/StatusCodes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatusCodes implements Serializable, Cloneable {

    /**
     * <p>
     * The number of status codes.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * The items (status codes) for an origin group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Integer> items;

    /**
     * <p>
     * The number of status codes.
     * </p>
     * 
     * @param quantity
     *        The number of status codes.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of status codes.
     * </p>
     * 
     * @return The number of status codes.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of status codes.
     * </p>
     * 
     * @param quantity
     *        The number of status codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusCodes withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * The items (status codes) for an origin group.
     * </p>
     * 
     * @return The items (status codes) for an origin group.
     */

    public java.util.List<Integer> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<Integer>();
        }
        return items;
    }

    /**
     * <p>
     * The items (status codes) for an origin group.
     * </p>
     * 
     * @param items
     *        The items (status codes) for an origin group.
     */

    public void setItems(java.util.Collection<Integer> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<Integer>(items);
    }

    /**
     * <p>
     * The items (status codes) for an origin group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The items (status codes) for an origin group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusCodes withItems(Integer... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<Integer>(items.length));
        }
        for (Integer ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The items (status codes) for an origin group.
     * </p>
     * 
     * @param items
     *        The items (status codes) for an origin group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusCodes withItems(java.util.Collection<Integer> items) {
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

        if (obj instanceof StatusCodes == false)
            return false;
        StatusCodes other = (StatusCodes) obj;
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
    public StatusCodes clone() {
        try {
            return (StatusCodes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
