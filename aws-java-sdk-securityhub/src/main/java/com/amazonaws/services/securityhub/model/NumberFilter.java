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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A number filter for querying findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/NumberFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumberFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The greater-than-equal condition to be applied to a single field when querying for findings.
     * </p>
     */
    private Double gte;
    /**
     * <p>
     * The less-than-equal condition to be applied to a single field when querying for findings.
     * </p>
     */
    private Double lte;
    /**
     * <p>
     * The greater-than condition to be applied to a single field when querying for findings.
     * </p>
     */
    private Double gt;
    /**
     * <p>
     * The less-than condition to be applied to a single field when querying for findings.
     * </p>
     */
    private Double lt;
    /**
     * <p>
     * The equal-to condition to be applied to a single field when querying for findings.
     * </p>
     */
    private Double eq;

    /**
     * <p>
     * The greater-than-equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param gte
     *        The greater-than-equal condition to be applied to a single field when querying for findings.
     */

    public void setGte(Double gte) {
        this.gte = gte;
    }

    /**
     * <p>
     * The greater-than-equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return The greater-than-equal condition to be applied to a single field when querying for findings.
     */

    public Double getGte() {
        return this.gte;
    }

    /**
     * <p>
     * The greater-than-equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param gte
     *        The greater-than-equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberFilter withGte(Double gte) {
        setGte(gte);
        return this;
    }

    /**
     * <p>
     * The less-than-equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lte
     *        The less-than-equal condition to be applied to a single field when querying for findings.
     */

    public void setLte(Double lte) {
        this.lte = lte;
    }

    /**
     * <p>
     * The less-than-equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return The less-than-equal condition to be applied to a single field when querying for findings.
     */

    public Double getLte() {
        return this.lte;
    }

    /**
     * <p>
     * The less-than-equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lte
     *        The less-than-equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberFilter withLte(Double lte) {
        setLte(lte);
        return this;
    }

    /**
     * <p>
     * The greater-than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param gt
     *        The greater-than condition to be applied to a single field when querying for findings.
     */

    public void setGt(Double gt) {
        this.gt = gt;
    }

    /**
     * <p>
     * The greater-than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return The greater-than condition to be applied to a single field when querying for findings.
     */

    public Double getGt() {
        return this.gt;
    }

    /**
     * <p>
     * The greater-than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param gt
     *        The greater-than condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberFilter withGt(Double gt) {
        setGt(gt);
        return this;
    }

    /**
     * <p>
     * The less-than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lt
     *        The less-than condition to be applied to a single field when querying for findings.
     */

    public void setLt(Double lt) {
        this.lt = lt;
    }

    /**
     * <p>
     * The less-than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return The less-than condition to be applied to a single field when querying for findings.
     */

    public Double getLt() {
        return this.lt;
    }

    /**
     * <p>
     * The less-than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lt
     *        The less-than condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberFilter withLt(Double lt) {
        setLt(lt);
        return this;
    }

    /**
     * <p>
     * The equal-to condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param eq
     *        The equal-to condition to be applied to a single field when querying for findings.
     */

    public void setEq(Double eq) {
        this.eq = eq;
    }

    /**
     * <p>
     * The equal-to condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return The equal-to condition to be applied to a single field when querying for findings.
     */

    public Double getEq() {
        return this.eq;
    }

    /**
     * <p>
     * The equal-to condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param eq
     *        The equal-to condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberFilter withEq(Double eq) {
        setEq(eq);
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
        if (getGte() != null)
            sb.append("Gte: ").append(getGte()).append(",");
        if (getLte() != null)
            sb.append("Lte: ").append(getLte()).append(",");
        if (getGt() != null)
            sb.append("Gt: ").append(getGt()).append(",");
        if (getLt() != null)
            sb.append("Lt: ").append(getLt()).append(",");
        if (getEq() != null)
            sb.append("Eq: ").append(getEq());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumberFilter == false)
            return false;
        NumberFilter other = (NumberFilter) obj;
        if (other.getGte() == null ^ this.getGte() == null)
            return false;
        if (other.getGte() != null && other.getGte().equals(this.getGte()) == false)
            return false;
        if (other.getLte() == null ^ this.getLte() == null)
            return false;
        if (other.getLte() != null && other.getLte().equals(this.getLte()) == false)
            return false;
        if (other.getGt() == null ^ this.getGt() == null)
            return false;
        if (other.getGt() != null && other.getGt().equals(this.getGt()) == false)
            return false;
        if (other.getLt() == null ^ this.getLt() == null)
            return false;
        if (other.getLt() != null && other.getLt().equals(this.getLt()) == false)
            return false;
        if (other.getEq() == null ^ this.getEq() == null)
            return false;
        if (other.getEq() != null && other.getEq().equals(this.getEq()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGte() == null) ? 0 : getGte().hashCode());
        hashCode = prime * hashCode + ((getLte() == null) ? 0 : getLte().hashCode());
        hashCode = prime * hashCode + ((getGt() == null) ? 0 : getGt().hashCode());
        hashCode = prime * hashCode + ((getLt() == null) ? 0 : getLt().hashCode());
        hashCode = prime * hashCode + ((getEq() == null) ? 0 : getEq().hashCode());
        return hashCode;
    }

    @Override
    public NumberFilter clone() {
        try {
            return (NumberFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.NumberFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
