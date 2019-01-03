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
 * A complex type that controls:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning
 * the response to the viewer.
 * </p>
 * </li>
 * <li>
 * <p>
 * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about custom error pages, see <a
 * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html">Customizing Error
 * Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CustomErrorResponses" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomErrorResponses implements Serializable, Cloneable {

    /**
     * <p>
     * The number of HTTP status codes for which you want to specify a custom error page and/or a caching duration. If
     * <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * A complex type that contains a <code>CustomErrorResponse</code> element for each HTTP status code for which you
     * want to specify a custom error page and/or a caching duration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CustomErrorResponse> items;

    /**
     * <p>
     * The number of HTTP status codes for which you want to specify a custom error page and/or a caching duration. If
     * <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * 
     * @param quantity
     *        The number of HTTP status codes for which you want to specify a custom error page and/or a caching
     *        duration. If <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of HTTP status codes for which you want to specify a custom error page and/or a caching duration. If
     * <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * 
     * @return The number of HTTP status codes for which you want to specify a custom error page and/or a caching
     *         duration. If <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of HTTP status codes for which you want to specify a custom error page and/or a caching duration. If
     * <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * 
     * @param quantity
     *        The number of HTTP status codes for which you want to specify a custom error page and/or a caching
     *        duration. If <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomErrorResponses withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A complex type that contains a <code>CustomErrorResponse</code> element for each HTTP status code for which you
     * want to specify a custom error page and/or a caching duration.
     * </p>
     * 
     * @return A complex type that contains a <code>CustomErrorResponse</code> element for each HTTP status code for
     *         which you want to specify a custom error page and/or a caching duration.
     */

    public java.util.List<CustomErrorResponse> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<CustomErrorResponse>();
        }
        return items;
    }

    /**
     * <p>
     * A complex type that contains a <code>CustomErrorResponse</code> element for each HTTP status code for which you
     * want to specify a custom error page and/or a caching duration.
     * </p>
     * 
     * @param items
     *        A complex type that contains a <code>CustomErrorResponse</code> element for each HTTP status code for
     *        which you want to specify a custom error page and/or a caching duration.
     */

    public void setItems(java.util.Collection<CustomErrorResponse> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<CustomErrorResponse>(items);
    }

    /**
     * <p>
     * A complex type that contains a <code>CustomErrorResponse</code> element for each HTTP status code for which you
     * want to specify a custom error page and/or a caching duration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A complex type that contains a <code>CustomErrorResponse</code> element for each HTTP status code for
     *        which you want to specify a custom error page and/or a caching duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomErrorResponses withItems(CustomErrorResponse... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<CustomErrorResponse>(items.length));
        }
        for (CustomErrorResponse ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains a <code>CustomErrorResponse</code> element for each HTTP status code for which you
     * want to specify a custom error page and/or a caching duration.
     * </p>
     * 
     * @param items
     *        A complex type that contains a <code>CustomErrorResponse</code> element for each HTTP status code for
     *        which you want to specify a custom error page and/or a caching duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomErrorResponses withItems(java.util.Collection<CustomErrorResponse> items) {
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

        if (obj instanceof CustomErrorResponses == false)
            return false;
        CustomErrorResponses other = (CustomErrorResponses) obj;
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
    public CustomErrorResponses clone() {
        try {
            return (CustomErrorResponses) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
