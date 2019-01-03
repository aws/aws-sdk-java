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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A finding's severity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Severity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Severity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The native severity as defined by the security findings provider's solution that generated the finding.
     * </p>
     */
    private Double product;
    /**
     * <p>
     * The normalized severity of a finding.
     * </p>
     */
    private Integer normalized;

    /**
     * <p>
     * The native severity as defined by the security findings provider's solution that generated the finding.
     * </p>
     * 
     * @param product
     *        The native severity as defined by the security findings provider's solution that generated the finding.
     */

    public void setProduct(Double product) {
        this.product = product;
    }

    /**
     * <p>
     * The native severity as defined by the security findings provider's solution that generated the finding.
     * </p>
     * 
     * @return The native severity as defined by the security findings provider's solution that generated the finding.
     */

    public Double getProduct() {
        return this.product;
    }

    /**
     * <p>
     * The native severity as defined by the security findings provider's solution that generated the finding.
     * </p>
     * 
     * @param product
     *        The native severity as defined by the security findings provider's solution that generated the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Severity withProduct(Double product) {
        setProduct(product);
        return this;
    }

    /**
     * <p>
     * The normalized severity of a finding.
     * </p>
     * 
     * @param normalized
     *        The normalized severity of a finding.
     */

    public void setNormalized(Integer normalized) {
        this.normalized = normalized;
    }

    /**
     * <p>
     * The normalized severity of a finding.
     * </p>
     * 
     * @return The normalized severity of a finding.
     */

    public Integer getNormalized() {
        return this.normalized;
    }

    /**
     * <p>
     * The normalized severity of a finding.
     * </p>
     * 
     * @param normalized
     *        The normalized severity of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Severity withNormalized(Integer normalized) {
        setNormalized(normalized);
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
        if (getProduct() != null)
            sb.append("Product: ").append(getProduct()).append(",");
        if (getNormalized() != null)
            sb.append("Normalized: ").append(getNormalized());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Severity == false)
            return false;
        Severity other = (Severity) obj;
        if (other.getProduct() == null ^ this.getProduct() == null)
            return false;
        if (other.getProduct() != null && other.getProduct().equals(this.getProduct()) == false)
            return false;
        if (other.getNormalized() == null ^ this.getNormalized() == null)
            return false;
        if (other.getNormalized() != null && other.getNormalized().equals(this.getNormalized()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProduct() == null) ? 0 : getProduct().hashCode());
        hashCode = prime * hashCode + ((getNormalized() == null) ? 0 : getNormalized().hashCode());
        return hashCode;
    }

    @Override
    public Severity clone() {
        try {
            return (Severity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SeverityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
