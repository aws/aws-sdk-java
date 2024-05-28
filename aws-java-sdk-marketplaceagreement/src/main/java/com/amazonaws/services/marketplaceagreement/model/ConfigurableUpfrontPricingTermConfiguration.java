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
 * Defines a prepaid payment model that allows buyers to configure the entitlements they want to purchase and the
 * duration.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/ConfigurableUpfrontPricingTermConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurableUpfrontPricingTermConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the dimensions that the acceptor has purchased from the overall set of dimensions presented in the rate
     * card.
     * </p>
     */
    private java.util.List<Dimension> dimensions;
    /**
     * <p>
     * Defines the length of time for which the particular pricing/dimension is being purchased by the acceptor.
     * </p>
     */
    private String selectorValue;

    /**
     * <p>
     * Defines the dimensions that the acceptor has purchased from the overall set of dimensions presented in the rate
     * card.
     * </p>
     * 
     * @return Defines the dimensions that the acceptor has purchased from the overall set of dimensions presented in
     *         the rate card.
     */

    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * Defines the dimensions that the acceptor has purchased from the overall set of dimensions presented in the rate
     * card.
     * </p>
     * 
     * @param dimensions
     *        Defines the dimensions that the acceptor has purchased from the overall set of dimensions presented in the
     *        rate card.
     */

    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<Dimension>(dimensions);
    }

    /**
     * <p>
     * Defines the dimensions that the acceptor has purchased from the overall set of dimensions presented in the rate
     * card.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        Defines the dimensions that the acceptor has purchased from the overall set of dimensions presented in the
     *        rate card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableUpfrontPricingTermConfiguration withDimensions(Dimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new java.util.ArrayList<Dimension>(dimensions.length));
        }
        for (Dimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the dimensions that the acceptor has purchased from the overall set of dimensions presented in the rate
     * card.
     * </p>
     * 
     * @param dimensions
     *        Defines the dimensions that the acceptor has purchased from the overall set of dimensions presented in the
     *        rate card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableUpfrontPricingTermConfiguration withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * Defines the length of time for which the particular pricing/dimension is being purchased by the acceptor.
     * </p>
     * 
     * @param selectorValue
     *        Defines the length of time for which the particular pricing/dimension is being purchased by the acceptor.
     */

    public void setSelectorValue(String selectorValue) {
        this.selectorValue = selectorValue;
    }

    /**
     * <p>
     * Defines the length of time for which the particular pricing/dimension is being purchased by the acceptor.
     * </p>
     * 
     * @return Defines the length of time for which the particular pricing/dimension is being purchased by the acceptor.
     */

    public String getSelectorValue() {
        return this.selectorValue;
    }

    /**
     * <p>
     * Defines the length of time for which the particular pricing/dimension is being purchased by the acceptor.
     * </p>
     * 
     * @param selectorValue
     *        Defines the length of time for which the particular pricing/dimension is being purchased by the acceptor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableUpfrontPricingTermConfiguration withSelectorValue(String selectorValue) {
        setSelectorValue(selectorValue);
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getSelectorValue() != null)
            sb.append("SelectorValue: ").append(getSelectorValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurableUpfrontPricingTermConfiguration == false)
            return false;
        ConfigurableUpfrontPricingTermConfiguration other = (ConfigurableUpfrontPricingTermConfiguration) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getSelectorValue() == null ^ this.getSelectorValue() == null)
            return false;
        if (other.getSelectorValue() != null && other.getSelectorValue().equals(this.getSelectorValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getSelectorValue() == null) ? 0 : getSelectorValue().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurableUpfrontPricingTermConfiguration clone() {
        try {
            return (ConfigurableUpfrontPricingTermConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.ConfigurableUpfrontPricingTermConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
