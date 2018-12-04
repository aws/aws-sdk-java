/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * A complex type that contains the list of SSL/TLS protocols that you want
 * CloudFront to use when communicating with your origin over HTTPS.
 */
public class OriginSslProtocols implements Serializable, Cloneable {

    /**
     * The number of SSL/TLS protocols that you want to allow CloudFront to use
     * when establishing an HTTPS connection with this origin.
     */
    private Integer quantity;
    /**
     * A complex type that contains one SslProtocol element for each SSL/TLS
     * protocol that you want to allow CloudFront to use when establishing an
     * HTTPS connection with this origin.
     */
    private com.amazonaws.internal.SdkInternalList<String> items;

    /**
     * The number of SSL/TLS protocols that you want to allow CloudFront to use
     * when establishing an HTTPS connection with this origin.
     * 
     * @param quantity
     *        The number of SSL/TLS protocols that you want to allow CloudFront
     *        to use when establishing an HTTPS connection with this origin.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * The number of SSL/TLS protocols that you want to allow CloudFront to use
     * when establishing an HTTPS connection with this origin.
     * 
     * @return The number of SSL/TLS protocols that you want to allow CloudFront
     *         to use when establishing an HTTPS connection with this origin.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * The number of SSL/TLS protocols that you want to allow CloudFront to use
     * when establishing an HTTPS connection with this origin.
     * 
     * @param quantity
     *        The number of SSL/TLS protocols that you want to allow CloudFront
     *        to use when establishing an HTTPS connection with this origin.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OriginSslProtocols withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * A complex type that contains one SslProtocol element for each SSL/TLS
     * protocol that you want to allow CloudFront to use when establishing an
     * HTTPS connection with this origin.
     * 
     * @return A complex type that contains one SslProtocol element for each
     *         SSL/TLS protocol that you want to allow CloudFront to use when
     *         establishing an HTTPS connection with this origin.
     * @see SslProtocol
     */

    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * A complex type that contains one SslProtocol element for each SSL/TLS
     * protocol that you want to allow CloudFront to use when establishing an
     * HTTPS connection with this origin.
     * 
     * @param items
     *        A complex type that contains one SslProtocol element for each
     *        SSL/TLS protocol that you want to allow CloudFront to use when
     *        establishing an HTTPS connection with this origin.
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
     * A complex type that contains one SslProtocol element for each SSL/TLS
     * protocol that you want to allow CloudFront to use when establishing an
     * HTTPS connection with this origin.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setItems(java.util.Collection)} or
     * {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A complex type that contains one SslProtocol element for each
     *        SSL/TLS protocol that you want to allow CloudFront to use when
     *        establishing an HTTPS connection with this origin.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SslProtocol
     */

    public OriginSslProtocols withItems(String... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<String>(
                    items.length));
        }
        for (String ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * A complex type that contains one SslProtocol element for each SSL/TLS
     * protocol that you want to allow CloudFront to use when establishing an
     * HTTPS connection with this origin.
     * 
     * @param items
     *        A complex type that contains one SslProtocol element for each
     *        SSL/TLS protocol that you want to allow CloudFront to use when
     *        establishing an HTTPS connection with this origin.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SslProtocol
     */

    public OriginSslProtocols withItems(java.util.Collection<String> items) {
        setItems(items);
        return this;
    }

    /**
     * A complex type that contains one SslProtocol element for each SSL/TLS
     * protocol that you want to allow CloudFront to use when establishing an
     * HTTPS connection with this origin.
     * 
     * @param items
     *        A complex type that contains one SslProtocol element for each
     *        SSL/TLS protocol that you want to allow CloudFront to use when
     *        establishing an HTTPS connection with this origin.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SslProtocol
     */

    public OriginSslProtocols withItems(SslProtocol... items) {
        com.amazonaws.internal.SdkInternalList<String> itemsCopy = new com.amazonaws.internal.SdkInternalList<String>(
                items.length);
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
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Quantity: " + getQuantity() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems());
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
        if (other.getQuantity() != null
                && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null
                && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode
                + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public OriginSslProtocols clone() {
        try {
            return (OriginSslProtocols) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
