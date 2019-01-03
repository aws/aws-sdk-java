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
 * A complex type that lists the AWS accounts, if any, that you included in the <code>TrustedSigners</code> complex type
 * for this distribution. These are the accounts that you want to allow to create signed URLs for private content.
 * </p>
 * <p>
 * The <code>Signer</code> complex type lists the AWS account number of the trusted signer or <code>self</code> if the
 * signer is the AWS account that created the distribution. The <code>Signer</code> element also includes the IDs of any
 * active CloudFront key pairs that are associated with the trusted signer's AWS account. If no <code>KeyPairId</code>
 * element appears for a <code>Signer</code>, that signer can't create signed URLs.
 * </p>
 * <p>
 * For more information, see <a
 * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private Content
 * through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ActiveTrustedSigners" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActiveTrustedSigners implements Serializable, Cloneable {

    /**
     * <p>
     * Enabled is <code>true</code> if any of the AWS accounts listed in the <code>TrustedSigners</code> complex type
     * for this RTMP distribution have active CloudFront key pairs. If not, <code>Enabled</code> is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for each trusted signer specified in the
     * <code>TrustedSigners</code> complex type.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for each trusted signer that is specified in
     * the <code>TrustedSigners</code> complex type.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Signer> items;

    /**
     * Default constructor for ActiveTrustedSigners object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ActiveTrustedSigners() {
    }

    /**
     * Constructs a new ActiveTrustedSigners object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param items
     *        A complex type that contains one <code>Signer</code> complex type for each trusted signer that is
     *        specified in the <code>TrustedSigners</code> complex type.</p>
     *        <p>
     *        For more information, see <a>ActiveTrustedSigners</a>.
     */
    public ActiveTrustedSigners(java.util.List<Signer> items) {
        setItems(items);
    }

    /**
     * <p>
     * Enabled is <code>true</code> if any of the AWS accounts listed in the <code>TrustedSigners</code> complex type
     * for this RTMP distribution have active CloudFront key pairs. If not, <code>Enabled</code> is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     * 
     * @param enabled
     *        Enabled is <code>true</code> if any of the AWS accounts listed in the <code>TrustedSigners</code> complex
     *        type for this RTMP distribution have active CloudFront key pairs. If not, <code>Enabled</code> is
     *        <code>false</code>.</p>
     *        <p>
     *        For more information, see <a>ActiveTrustedSigners</a>.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enabled is <code>true</code> if any of the AWS accounts listed in the <code>TrustedSigners</code> complex type
     * for this RTMP distribution have active CloudFront key pairs. If not, <code>Enabled</code> is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     * 
     * @return Enabled is <code>true</code> if any of the AWS accounts listed in the <code>TrustedSigners</code> complex
     *         type for this RTMP distribution have active CloudFront key pairs. If not, <code>Enabled</code> is
     *         <code>false</code>.</p>
     *         <p>
     *         For more information, see <a>ActiveTrustedSigners</a>.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enabled is <code>true</code> if any of the AWS accounts listed in the <code>TrustedSigners</code> complex type
     * for this RTMP distribution have active CloudFront key pairs. If not, <code>Enabled</code> is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     * 
     * @param enabled
     *        Enabled is <code>true</code> if any of the AWS accounts listed in the <code>TrustedSigners</code> complex
     *        type for this RTMP distribution have active CloudFront key pairs. If not, <code>Enabled</code> is
     *        <code>false</code>.</p>
     *        <p>
     *        For more information, see <a>ActiveTrustedSigners</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveTrustedSigners withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Enabled is <code>true</code> if any of the AWS accounts listed in the <code>TrustedSigners</code> complex type
     * for this RTMP distribution have active CloudFront key pairs. If not, <code>Enabled</code> is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     * 
     * @return Enabled is <code>true</code> if any of the AWS accounts listed in the <code>TrustedSigners</code> complex
     *         type for this RTMP distribution have active CloudFront key pairs. If not, <code>Enabled</code> is
     *         <code>false</code>.</p>
     *         <p>
     *         For more information, see <a>ActiveTrustedSigners</a>.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for each trusted signer specified in the
     * <code>TrustedSigners</code> complex type.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     * 
     * @param quantity
     *        A complex type that contains one <code>Signer</code> complex type for each trusted signer specified in the
     *        <code>TrustedSigners</code> complex type.</p>
     *        <p>
     *        For more information, see <a>ActiveTrustedSigners</a>.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for each trusted signer specified in the
     * <code>TrustedSigners</code> complex type.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     * 
     * @return A complex type that contains one <code>Signer</code> complex type for each trusted signer specified in
     *         the <code>TrustedSigners</code> complex type.</p>
     *         <p>
     *         For more information, see <a>ActiveTrustedSigners</a>.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for each trusted signer specified in the
     * <code>TrustedSigners</code> complex type.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     * 
     * @param quantity
     *        A complex type that contains one <code>Signer</code> complex type for each trusted signer specified in the
     *        <code>TrustedSigners</code> complex type.</p>
     *        <p>
     *        For more information, see <a>ActiveTrustedSigners</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveTrustedSigners withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for each trusted signer that is specified in
     * the <code>TrustedSigners</code> complex type.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     * 
     * @return A complex type that contains one <code>Signer</code> complex type for each trusted signer that is
     *         specified in the <code>TrustedSigners</code> complex type.</p>
     *         <p>
     *         For more information, see <a>ActiveTrustedSigners</a>.
     */

    public java.util.List<Signer> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<Signer>();
        }
        return items;
    }

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for each trusted signer that is specified in
     * the <code>TrustedSigners</code> complex type.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     * 
     * @param items
     *        A complex type that contains one <code>Signer</code> complex type for each trusted signer that is
     *        specified in the <code>TrustedSigners</code> complex type.</p>
     *        <p>
     *        For more information, see <a>ActiveTrustedSigners</a>.
     */

    public void setItems(java.util.Collection<Signer> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<Signer>(items);
    }

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for each trusted signer that is specified in
     * the <code>TrustedSigners</code> complex type.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A complex type that contains one <code>Signer</code> complex type for each trusted signer that is
     *        specified in the <code>TrustedSigners</code> complex type.</p>
     *        <p>
     *        For more information, see <a>ActiveTrustedSigners</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveTrustedSigners withItems(Signer... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<Signer>(items.length));
        }
        for (Signer ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for each trusted signer that is specified in
     * the <code>TrustedSigners</code> complex type.
     * </p>
     * <p>
     * For more information, see <a>ActiveTrustedSigners</a>.
     * </p>
     * 
     * @param items
     *        A complex type that contains one <code>Signer</code> complex type for each trusted signer that is
     *        specified in the <code>TrustedSigners</code> complex type.</p>
     *        <p>
     *        For more information, see <a>ActiveTrustedSigners</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveTrustedSigners withItems(java.util.Collection<Signer> items) {
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

        if (obj instanceof ActiveTrustedSigners == false)
            return false;
        ActiveTrustedSigners other = (ActiveTrustedSigners) obj;
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
    public ActiveTrustedSigners clone() {
        try {
            return (ActiveTrustedSigners) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
