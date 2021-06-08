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
 * A list of key groups, and the public keys in each key group, that CloudFront can use to verify the signatures of
 * signed URLs and signed cookies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ActiveTrustedKeyGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActiveTrustedKeyGroups implements Serializable, Cloneable {

    /**
     * <p>
     * This field is <code>true</code> if any of the key groups have public keys that CloudFront can use to verify the
     * signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The number of key groups in the list.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * A list of key groups, including the identifiers of the public keys in each key group that CloudFront can use to
     * verify the signatures of signed URLs and signed cookies.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<KGKeyPairIds> items;

    /**
     * <p>
     * This field is <code>true</code> if any of the key groups have public keys that CloudFront can use to verify the
     * signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     * </p>
     * 
     * @param enabled
     *        This field is <code>true</code> if any of the key groups have public keys that CloudFront can use to
     *        verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * This field is <code>true</code> if any of the key groups have public keys that CloudFront can use to verify the
     * signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     * </p>
     * 
     * @return This field is <code>true</code> if any of the key groups have public keys that CloudFront can use to
     *         verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * This field is <code>true</code> if any of the key groups have public keys that CloudFront can use to verify the
     * signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     * </p>
     * 
     * @param enabled
     *        This field is <code>true</code> if any of the key groups have public keys that CloudFront can use to
     *        verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveTrustedKeyGroups withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * This field is <code>true</code> if any of the key groups have public keys that CloudFront can use to verify the
     * signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     * </p>
     * 
     * @return This field is <code>true</code> if any of the key groups have public keys that CloudFront can use to
     *         verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The number of key groups in the list.
     * </p>
     * 
     * @param quantity
     *        The number of key groups in the list.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of key groups in the list.
     * </p>
     * 
     * @return The number of key groups in the list.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of key groups in the list.
     * </p>
     * 
     * @param quantity
     *        The number of key groups in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveTrustedKeyGroups withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A list of key groups, including the identifiers of the public keys in each key group that CloudFront can use to
     * verify the signatures of signed URLs and signed cookies.
     * </p>
     * 
     * @return A list of key groups, including the identifiers of the public keys in each key group that CloudFront can
     *         use to verify the signatures of signed URLs and signed cookies.
     */

    public java.util.List<KGKeyPairIds> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<KGKeyPairIds>();
        }
        return items;
    }

    /**
     * <p>
     * A list of key groups, including the identifiers of the public keys in each key group that CloudFront can use to
     * verify the signatures of signed URLs and signed cookies.
     * </p>
     * 
     * @param items
     *        A list of key groups, including the identifiers of the public keys in each key group that CloudFront can
     *        use to verify the signatures of signed URLs and signed cookies.
     */

    public void setItems(java.util.Collection<KGKeyPairIds> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<KGKeyPairIds>(items);
    }

    /**
     * <p>
     * A list of key groups, including the identifiers of the public keys in each key group that CloudFront can use to
     * verify the signatures of signed URLs and signed cookies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list of key groups, including the identifiers of the public keys in each key group that CloudFront can
     *        use to verify the signatures of signed URLs and signed cookies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveTrustedKeyGroups withItems(KGKeyPairIds... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<KGKeyPairIds>(items.length));
        }
        for (KGKeyPairIds ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key groups, including the identifiers of the public keys in each key group that CloudFront can use to
     * verify the signatures of signed URLs and signed cookies.
     * </p>
     * 
     * @param items
     *        A list of key groups, including the identifiers of the public keys in each key group that CloudFront can
     *        use to verify the signatures of signed URLs and signed cookies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveTrustedKeyGroups withItems(java.util.Collection<KGKeyPairIds> items) {
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
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

        if (obj instanceof ActiveTrustedKeyGroups == false)
            return false;
        ActiveTrustedKeyGroups other = (ActiveTrustedKeyGroups) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public ActiveTrustedKeyGroups clone() {
        try {
            return (ActiveTrustedKeyGroups) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
