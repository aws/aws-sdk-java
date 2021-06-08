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
 * A list of key groups whose public keys CloudFront can use to verify the signatures of signed URLs and signed cookies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TrustedKeyGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustedKeyGroups implements Serializable, Cloneable {

    /**
     * <p>
     * This field is <code>true</code> if any of the key groups in the list have public keys that CloudFront can use to
     * verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
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
     * A list of key groups identifiers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> items;

    /**
     * <p>
     * This field is <code>true</code> if any of the key groups in the list have public keys that CloudFront can use to
     * verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     * </p>
     * 
     * @param enabled
     *        This field is <code>true</code> if any of the key groups in the list have public keys that CloudFront can
     *        use to verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * This field is <code>true</code> if any of the key groups in the list have public keys that CloudFront can use to
     * verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     * </p>
     * 
     * @return This field is <code>true</code> if any of the key groups in the list have public keys that CloudFront can
     *         use to verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * This field is <code>true</code> if any of the key groups in the list have public keys that CloudFront can use to
     * verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     * </p>
     * 
     * @param enabled
     *        This field is <code>true</code> if any of the key groups in the list have public keys that CloudFront can
     *        use to verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedKeyGroups withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * This field is <code>true</code> if any of the key groups in the list have public keys that CloudFront can use to
     * verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
     * </p>
     * 
     * @return This field is <code>true</code> if any of the key groups in the list have public keys that CloudFront can
     *         use to verify the signatures of signed URLs and signed cookies. If not, this field is <code>false</code>.
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

    public TrustedKeyGroups withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A list of key groups identifiers.
     * </p>
     * 
     * @return A list of key groups identifiers.
     */

    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * <p>
     * A list of key groups identifiers.
     * </p>
     * 
     * @param items
     *        A list of key groups identifiers.
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
     * A list of key groups identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list of key groups identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedKeyGroups withItems(String... items) {
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
     * A list of key groups identifiers.
     * </p>
     * 
     * @param items
     *        A list of key groups identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedKeyGroups withItems(java.util.Collection<String> items) {
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

        if (obj instanceof TrustedKeyGroups == false)
            return false;
        TrustedKeyGroups other = (TrustedKeyGroups) obj;
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
    public TrustedKeyGroups clone() {
        try {
            return (TrustedKeyGroups) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
