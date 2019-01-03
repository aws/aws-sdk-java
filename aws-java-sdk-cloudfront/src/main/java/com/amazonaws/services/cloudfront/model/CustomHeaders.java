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
 * A complex type that contains the list of Custom Headers for each origin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CustomHeaders" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomHeaders implements Serializable, Cloneable {

    /**
     * <p>
     * The number of custom headers, if any, for this distribution.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * <b>Optional</b>: A list that contains one <code>OriginCustomHeader</code> element for each custom header that you
     * want CloudFront to forward to the origin. If Quantity is <code>0</code>, omit <code>Items</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OriginCustomHeader> items;

    /**
     * <p>
     * The number of custom headers, if any, for this distribution.
     * </p>
     * 
     * @param quantity
     *        The number of custom headers, if any, for this distribution.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of custom headers, if any, for this distribution.
     * </p>
     * 
     * @return The number of custom headers, if any, for this distribution.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of custom headers, if any, for this distribution.
     * </p>
     * 
     * @param quantity
     *        The number of custom headers, if any, for this distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomHeaders withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * <b>Optional</b>: A list that contains one <code>OriginCustomHeader</code> element for each custom header that you
     * want CloudFront to forward to the origin. If Quantity is <code>0</code>, omit <code>Items</code>.
     * </p>
     * 
     * @return <b>Optional</b>: A list that contains one <code>OriginCustomHeader</code> element for each custom header
     *         that you want CloudFront to forward to the origin. If Quantity is <code>0</code>, omit <code>Items</code>
     *         .
     */

    public java.util.List<OriginCustomHeader> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<OriginCustomHeader>();
        }
        return items;
    }

    /**
     * <p>
     * <b>Optional</b>: A list that contains one <code>OriginCustomHeader</code> element for each custom header that you
     * want CloudFront to forward to the origin. If Quantity is <code>0</code>, omit <code>Items</code>.
     * </p>
     * 
     * @param items
     *        <b>Optional</b>: A list that contains one <code>OriginCustomHeader</code> element for each custom header
     *        that you want CloudFront to forward to the origin. If Quantity is <code>0</code>, omit <code>Items</code>.
     */

    public void setItems(java.util.Collection<OriginCustomHeader> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<OriginCustomHeader>(items);
    }

    /**
     * <p>
     * <b>Optional</b>: A list that contains one <code>OriginCustomHeader</code> element for each custom header that you
     * want CloudFront to forward to the origin. If Quantity is <code>0</code>, omit <code>Items</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        <b>Optional</b>: A list that contains one <code>OriginCustomHeader</code> element for each custom header
     *        that you want CloudFront to forward to the origin. If Quantity is <code>0</code>, omit <code>Items</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomHeaders withItems(OriginCustomHeader... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<OriginCustomHeader>(items.length));
        }
        for (OriginCustomHeader ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>Optional</b>: A list that contains one <code>OriginCustomHeader</code> element for each custom header that you
     * want CloudFront to forward to the origin. If Quantity is <code>0</code>, omit <code>Items</code>.
     * </p>
     * 
     * @param items
     *        <b>Optional</b>: A list that contains one <code>OriginCustomHeader</code> element for each custom header
     *        that you want CloudFront to forward to the origin. If Quantity is <code>0</code>, omit <code>Items</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomHeaders withItems(java.util.Collection<OriginCustomHeader> items) {
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

        if (obj instanceof CustomHeaders == false)
            return false;
        CustomHeaders other = (CustomHeaders) obj;
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
    public CustomHeaders clone() {
        try {
            return (CustomHeaders) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
