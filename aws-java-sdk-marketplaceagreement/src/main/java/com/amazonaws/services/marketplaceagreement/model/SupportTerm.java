/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the customer support available for the acceptors when they purchase the software.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/SupportTerm" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupportTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Free-text field about the refund policy description that will be shown to customers as is on the website and
     * console.
     * </p>
     */
    private String refundPolicy;
    /**
     * <p>
     * Category of the term being updated.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Free-text field about the refund policy description that will be shown to customers as is on the website and
     * console.
     * </p>
     * 
     * @param refundPolicy
     *        Free-text field about the refund policy description that will be shown to customers as is on the website
     *        and console.
     */

    public void setRefundPolicy(String refundPolicy) {
        this.refundPolicy = refundPolicy;
    }

    /**
     * <p>
     * Free-text field about the refund policy description that will be shown to customers as is on the website and
     * console.
     * </p>
     * 
     * @return Free-text field about the refund policy description that will be shown to customers as is on the website
     *         and console.
     */

    public String getRefundPolicy() {
        return this.refundPolicy;
    }

    /**
     * <p>
     * Free-text field about the refund policy description that will be shown to customers as is on the website and
     * console.
     * </p>
     * 
     * @param refundPolicy
     *        Free-text field about the refund policy description that will be shown to customers as is on the website
     *        and console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportTerm withRefundPolicy(String refundPolicy) {
        setRefundPolicy(refundPolicy);
        return this;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @param type
     *        Category of the term being updated.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @return Category of the term being updated.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @param type
     *        Category of the term being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportTerm withType(String type) {
        setType(type);
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
        if (getRefundPolicy() != null)
            sb.append("RefundPolicy: ").append(getRefundPolicy()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportTerm == false)
            return false;
        SupportTerm other = (SupportTerm) obj;
        if (other.getRefundPolicy() == null ^ this.getRefundPolicy() == null)
            return false;
        if (other.getRefundPolicy() != null && other.getRefundPolicy().equals(this.getRefundPolicy()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRefundPolicy() == null) ? 0 : getRefundPolicy().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SupportTerm clone() {
        try {
            return (SupportTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.SupportTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
