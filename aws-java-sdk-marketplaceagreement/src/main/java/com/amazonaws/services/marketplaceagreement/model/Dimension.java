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
 * Defines the dimensions that the acceptor has purchased from the overall set of dimensions presented in the rate card.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/Dimension" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Dimension implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of key value of the dimension.
     * </p>
     */
    private String dimensionKey;
    /**
     * <p>
     * The number of units of the dimension the acceptor has purchased.
     * </p>
     * <note>
     * <p>
     * For Agreements with <code>ConfigurableUpfrontPricingTerm</code>, the <code>RateCard</code> section will define
     * the prices and dimensions defined by the seller (proposer), whereas the <code>Configuration</code> section will
     * define the actual dimensions, prices, and units the buyer has chosen to accept.
     * </p>
     * </note>
     */
    private Integer dimensionValue;

    /**
     * <p>
     * The name of key value of the dimension.
     * </p>
     * 
     * @param dimensionKey
     *        The name of key value of the dimension.
     */

    public void setDimensionKey(String dimensionKey) {
        this.dimensionKey = dimensionKey;
    }

    /**
     * <p>
     * The name of key value of the dimension.
     * </p>
     * 
     * @return The name of key value of the dimension.
     */

    public String getDimensionKey() {
        return this.dimensionKey;
    }

    /**
     * <p>
     * The name of key value of the dimension.
     * </p>
     * 
     * @param dimensionKey
     *        The name of key value of the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dimension withDimensionKey(String dimensionKey) {
        setDimensionKey(dimensionKey);
        return this;
    }

    /**
     * <p>
     * The number of units of the dimension the acceptor has purchased.
     * </p>
     * <note>
     * <p>
     * For Agreements with <code>ConfigurableUpfrontPricingTerm</code>, the <code>RateCard</code> section will define
     * the prices and dimensions defined by the seller (proposer), whereas the <code>Configuration</code> section will
     * define the actual dimensions, prices, and units the buyer has chosen to accept.
     * </p>
     * </note>
     * 
     * @param dimensionValue
     *        The number of units of the dimension the acceptor has purchased.</p> <note>
     *        <p>
     *        For Agreements with <code>ConfigurableUpfrontPricingTerm</code>, the <code>RateCard</code> section will
     *        define the prices and dimensions defined by the seller (proposer), whereas the <code>Configuration</code>
     *        section will define the actual dimensions, prices, and units the buyer has chosen to accept.
     *        </p>
     */

    public void setDimensionValue(Integer dimensionValue) {
        this.dimensionValue = dimensionValue;
    }

    /**
     * <p>
     * The number of units of the dimension the acceptor has purchased.
     * </p>
     * <note>
     * <p>
     * For Agreements with <code>ConfigurableUpfrontPricingTerm</code>, the <code>RateCard</code> section will define
     * the prices and dimensions defined by the seller (proposer), whereas the <code>Configuration</code> section will
     * define the actual dimensions, prices, and units the buyer has chosen to accept.
     * </p>
     * </note>
     * 
     * @return The number of units of the dimension the acceptor has purchased.</p> <note>
     *         <p>
     *         For Agreements with <code>ConfigurableUpfrontPricingTerm</code>, the <code>RateCard</code> section will
     *         define the prices and dimensions defined by the seller (proposer), whereas the <code>Configuration</code>
     *         section will define the actual dimensions, prices, and units the buyer has chosen to accept.
     *         </p>
     */

    public Integer getDimensionValue() {
        return this.dimensionValue;
    }

    /**
     * <p>
     * The number of units of the dimension the acceptor has purchased.
     * </p>
     * <note>
     * <p>
     * For Agreements with <code>ConfigurableUpfrontPricingTerm</code>, the <code>RateCard</code> section will define
     * the prices and dimensions defined by the seller (proposer), whereas the <code>Configuration</code> section will
     * define the actual dimensions, prices, and units the buyer has chosen to accept.
     * </p>
     * </note>
     * 
     * @param dimensionValue
     *        The number of units of the dimension the acceptor has purchased.</p> <note>
     *        <p>
     *        For Agreements with <code>ConfigurableUpfrontPricingTerm</code>, the <code>RateCard</code> section will
     *        define the prices and dimensions defined by the seller (proposer), whereas the <code>Configuration</code>
     *        section will define the actual dimensions, prices, and units the buyer has chosen to accept.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dimension withDimensionValue(Integer dimensionValue) {
        setDimensionValue(dimensionValue);
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
        if (getDimensionKey() != null)
            sb.append("DimensionKey: ").append(getDimensionKey()).append(",");
        if (getDimensionValue() != null)
            sb.append("DimensionValue: ").append(getDimensionValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dimension == false)
            return false;
        Dimension other = (Dimension) obj;
        if (other.getDimensionKey() == null ^ this.getDimensionKey() == null)
            return false;
        if (other.getDimensionKey() != null && other.getDimensionKey().equals(this.getDimensionKey()) == false)
            return false;
        if (other.getDimensionValue() == null ^ this.getDimensionValue() == null)
            return false;
        if (other.getDimensionValue() != null && other.getDimensionValue().equals(this.getDimensionValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionKey() == null) ? 0 : getDimensionKey().hashCode());
        hashCode = prime * hashCode + ((getDimensionValue() == null) ? 0 : getDimensionValue().hashCode());
        return hashCode;
    }

    @Override
    public Dimension clone() {
        try {
            return (Dimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.DimensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
