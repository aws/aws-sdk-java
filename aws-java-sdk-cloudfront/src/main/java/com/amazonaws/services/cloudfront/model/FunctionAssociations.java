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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of CloudFront functions that are associated with a cache behavior in a CloudFront distribution. CloudFront
 * functions must be published to the <code>LIVE</code> stage to associate them with a cache behavior.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/FunctionAssociations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionAssociations implements Serializable, Cloneable {

    /**
     * <p>
     * The number of CloudFront functions in the list.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * The CloudFront functions that are associated with a cache behavior in a CloudFront distribution. CloudFront
     * functions must be published to the <code>LIVE</code> stage to associate them with a cache behavior.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FunctionAssociation> items;

    /**
     * <p>
     * The number of CloudFront functions in the list.
     * </p>
     * 
     * @param quantity
     *        The number of CloudFront functions in the list.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of CloudFront functions in the list.
     * </p>
     * 
     * @return The number of CloudFront functions in the list.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of CloudFront functions in the list.
     * </p>
     * 
     * @param quantity
     *        The number of CloudFront functions in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionAssociations withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * The CloudFront functions that are associated with a cache behavior in a CloudFront distribution. CloudFront
     * functions must be published to the <code>LIVE</code> stage to associate them with a cache behavior.
     * </p>
     * 
     * @return The CloudFront functions that are associated with a cache behavior in a CloudFront distribution.
     *         CloudFront functions must be published to the <code>LIVE</code> stage to associate them with a cache
     *         behavior.
     */

    public java.util.List<FunctionAssociation> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<FunctionAssociation>();
        }
        return items;
    }

    /**
     * <p>
     * The CloudFront functions that are associated with a cache behavior in a CloudFront distribution. CloudFront
     * functions must be published to the <code>LIVE</code> stage to associate them with a cache behavior.
     * </p>
     * 
     * @param items
     *        The CloudFront functions that are associated with a cache behavior in a CloudFront distribution.
     *        CloudFront functions must be published to the <code>LIVE</code> stage to associate them with a cache
     *        behavior.
     */

    public void setItems(java.util.Collection<FunctionAssociation> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<FunctionAssociation>(items);
    }

    /**
     * <p>
     * The CloudFront functions that are associated with a cache behavior in a CloudFront distribution. CloudFront
     * functions must be published to the <code>LIVE</code> stage to associate them with a cache behavior.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The CloudFront functions that are associated with a cache behavior in a CloudFront distribution.
     *        CloudFront functions must be published to the <code>LIVE</code> stage to associate them with a cache
     *        behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionAssociations withItems(FunctionAssociation... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<FunctionAssociation>(items.length));
        }
        for (FunctionAssociation ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CloudFront functions that are associated with a cache behavior in a CloudFront distribution. CloudFront
     * functions must be published to the <code>LIVE</code> stage to associate them with a cache behavior.
     * </p>
     * 
     * @param items
     *        The CloudFront functions that are associated with a cache behavior in a CloudFront distribution.
     *        CloudFront functions must be published to the <code>LIVE</code> stage to associate them with a cache
     *        behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionAssociations withItems(java.util.Collection<FunctionAssociation> items) {
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

        if (obj instanceof FunctionAssociations == false)
            return false;
        FunctionAssociations other = (FunctionAssociations) obj;
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
    public FunctionAssociations clone() {
        try {
            return (FunctionAssociations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
