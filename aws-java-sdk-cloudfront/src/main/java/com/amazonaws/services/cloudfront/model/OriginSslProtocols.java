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
 * A complex type that contains information about the SSL/TLS protocols that CloudFront can use when establishing an
 * HTTPS connection with your origin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/OriginSslProtocols" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginSslProtocols implements Serializable, Cloneable {

    /**
     * <p>
     * The number of SSL/TLS protocols that you want to allow CloudFront to use when establishing an HTTPS connection
     * with this origin.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * A list that contains allowed SSL/TLS protocols for this distribution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> items;

    /**
     * <p>
     * The number of SSL/TLS protocols that you want to allow CloudFront to use when establishing an HTTPS connection
     * with this origin.
     * </p>
     * 
     * @param quantity
     *        The number of SSL/TLS protocols that you want to allow CloudFront to use when establishing an HTTPS
     *        connection with this origin.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of SSL/TLS protocols that you want to allow CloudFront to use when establishing an HTTPS connection
     * with this origin.
     * </p>
     * 
     * @return The number of SSL/TLS protocols that you want to allow CloudFront to use when establishing an HTTPS
     *         connection with this origin.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of SSL/TLS protocols that you want to allow CloudFront to use when establishing an HTTPS connection
     * with this origin.
     * </p>
     * 
     * @param quantity
     *        The number of SSL/TLS protocols that you want to allow CloudFront to use when establishing an HTTPS
     *        connection with this origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginSslProtocols withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A list that contains allowed SSL/TLS protocols for this distribution.
     * </p>
     * 
     * @return A list that contains allowed SSL/TLS protocols for this distribution.
     * @see SslProtocol
     */

    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * <p>
     * A list that contains allowed SSL/TLS protocols for this distribution.
     * </p>
     * 
     * @param items
     *        A list that contains allowed SSL/TLS protocols for this distribution.
     * @see SslProtocol
     */

    public void setItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<String>(items);
    }

    /**
     * <p>
     * A list that contains allowed SSL/TLS protocols for this distribution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list that contains allowed SSL/TLS protocols for this distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SslProtocol
     */

    public OriginSslProtocols withItems(String... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<String>(items.length));
        }
        for (String ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains allowed SSL/TLS protocols for this distribution.
     * </p>
     * 
     * @param items
     *        A list that contains allowed SSL/TLS protocols for this distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SslProtocol
     */

    public OriginSslProtocols withItems(java.util.Collection<String> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * A list that contains allowed SSL/TLS protocols for this distribution.
     * </p>
     * 
     * @param items
     *        A list that contains allowed SSL/TLS protocols for this distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SslProtocol
     */

    public OriginSslProtocols withItems(SslProtocol... items) {
        com.amazonaws.internal.SdkInternalList<String> itemsCopy = new com.amazonaws.internal.SdkInternalList<String>(items.length);
        for (SslProtocol value : items) {
            itemsCopy.add(value.toString());
        }
        if (getItems() == null) {
            setItems(itemsCopy);
        } else {
            getItems().addAll(itemsCopy);
        }
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

        if (obj instanceof OriginSslProtocols == false)
            return false;
        OriginSslProtocols other = (OriginSslProtocols) obj;
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
    public OriginSslProtocols clone() {
        try {
            return (OriginSslProtocols) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
