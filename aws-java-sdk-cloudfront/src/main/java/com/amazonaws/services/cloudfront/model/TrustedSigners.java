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
 * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private
 * content.
 * </p>
 * <p>
 * If you want to require signed URLs in requests for objects in the target origin that match the
 * <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify the
 * applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see <a
 * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private Content
 * through CloudFront</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.
 * </p>
 * <p>
 * If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>, specify
 * <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>.
 * </p>
 * <p>
 * To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code> (if it's
 * currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of the trusted signers
 * that you want to include in the updated distribution.
 * </p>
 * <p>
 * For more information about updating the distribution configuration, see <a>DistributionConfig</a> .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/TrustedSigners" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustedSigners implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether you want to require viewers to use signed URLs to access the files specified by
     * <code>PathPattern</code> and <code>TargetOriginId</code>.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The number of trusted signers for this cache behavior.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * <b>Optional</b>: A complex type that contains trusted signers for this cache behavior. If <code>Quantity</code>
     * is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> items;

    /**
     * Default constructor for TrustedSigners object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public TrustedSigners() {
    }

    /**
     * Constructs a new TrustedSigners object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param items
     *        <b>Optional</b>: A complex type that contains trusted signers for this cache behavior. If
     *        <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     */
    public TrustedSigners(java.util.List<String> items) {
        setItems(items);
    }

    /**
     * <p>
     * Specifies whether you want to require viewers to use signed URLs to access the files specified by
     * <code>PathPattern</code> and <code>TargetOriginId</code>.
     * </p>
     * 
     * @param enabled
     *        Specifies whether you want to require viewers to use signed URLs to access the files specified by
     *        <code>PathPattern</code> and <code>TargetOriginId</code>.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether you want to require viewers to use signed URLs to access the files specified by
     * <code>PathPattern</code> and <code>TargetOriginId</code>.
     * </p>
     * 
     * @return Specifies whether you want to require viewers to use signed URLs to access the files specified by
     *         <code>PathPattern</code> and <code>TargetOriginId</code>.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether you want to require viewers to use signed URLs to access the files specified by
     * <code>PathPattern</code> and <code>TargetOriginId</code>.
     * </p>
     * 
     * @param enabled
     *        Specifies whether you want to require viewers to use signed URLs to access the files specified by
     *        <code>PathPattern</code> and <code>TargetOriginId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedSigners withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to require viewers to use signed URLs to access the files specified by
     * <code>PathPattern</code> and <code>TargetOriginId</code>.
     * </p>
     * 
     * @return Specifies whether you want to require viewers to use signed URLs to access the files specified by
     *         <code>PathPattern</code> and <code>TargetOriginId</code>.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The number of trusted signers for this cache behavior.
     * </p>
     * 
     * @param quantity
     *        The number of trusted signers for this cache behavior.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of trusted signers for this cache behavior.
     * </p>
     * 
     * @return The number of trusted signers for this cache behavior.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of trusted signers for this cache behavior.
     * </p>
     * 
     * @param quantity
     *        The number of trusted signers for this cache behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedSigners withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains trusted signers for this cache behavior. If <code>Quantity</code>
     * is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * 
     * @return <b>Optional</b>: A complex type that contains trusted signers for this cache behavior. If
     *         <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     */

    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains trusted signers for this cache behavior. If <code>Quantity</code>
     * is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * 
     * @param items
     *        <b>Optional</b>: A complex type that contains trusted signers for this cache behavior. If
     *        <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
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
     * <b>Optional</b>: A complex type that contains trusted signers for this cache behavior. If <code>Quantity</code>
     * is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        <b>Optional</b>: A complex type that contains trusted signers for this cache behavior. If
     *        <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedSigners withItems(String... items) {
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
     * <b>Optional</b>: A complex type that contains trusted signers for this cache behavior. If <code>Quantity</code>
     * is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * 
     * @param items
     *        <b>Optional</b>: A complex type that contains trusted signers for this cache behavior. If
     *        <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedSigners withItems(java.util.Collection<String> items) {
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

        if (obj instanceof TrustedSigners == false)
            return false;
        TrustedSigners other = (TrustedSigners) obj;
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
    public TrustedSigners clone() {
        try {
            return (TrustedSigners) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
