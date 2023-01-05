/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about pricing bundle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/BundleInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BundleInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bundle names.
     * </p>
     */
    private java.util.List<String> bundleNames;
    /**
     * <p>
     * The pricing tier.
     * </p>
     */
    private String pricingTier;

    /**
     * <p>
     * The bundle names.
     * </p>
     * 
     * @return The bundle names.
     */

    public java.util.List<String> getBundleNames() {
        return bundleNames;
    }

    /**
     * <p>
     * The bundle names.
     * </p>
     * 
     * @param bundleNames
     *        The bundle names.
     */

    public void setBundleNames(java.util.Collection<String> bundleNames) {
        if (bundleNames == null) {
            this.bundleNames = null;
            return;
        }

        this.bundleNames = new java.util.ArrayList<String>(bundleNames);
    }

    /**
     * <p>
     * The bundle names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBundleNames(java.util.Collection)} or {@link #withBundleNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bundleNames
     *        The bundle names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleInformation withBundleNames(String... bundleNames) {
        if (this.bundleNames == null) {
            setBundleNames(new java.util.ArrayList<String>(bundleNames.length));
        }
        for (String ele : bundleNames) {
            this.bundleNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The bundle names.
     * </p>
     * 
     * @param bundleNames
     *        The bundle names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleInformation withBundleNames(java.util.Collection<String> bundleNames) {
        setBundleNames(bundleNames);
        return this;
    }

    /**
     * <p>
     * The pricing tier.
     * </p>
     * 
     * @param pricingTier
     *        The pricing tier.
     * @see PricingTier
     */

    public void setPricingTier(String pricingTier) {
        this.pricingTier = pricingTier;
    }

    /**
     * <p>
     * The pricing tier.
     * </p>
     * 
     * @return The pricing tier.
     * @see PricingTier
     */

    public String getPricingTier() {
        return this.pricingTier;
    }

    /**
     * <p>
     * The pricing tier.
     * </p>
     * 
     * @param pricingTier
     *        The pricing tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingTier
     */

    public BundleInformation withPricingTier(String pricingTier) {
        setPricingTier(pricingTier);
        return this;
    }

    /**
     * <p>
     * The pricing tier.
     * </p>
     * 
     * @param pricingTier
     *        The pricing tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingTier
     */

    public BundleInformation withPricingTier(PricingTier pricingTier) {
        this.pricingTier = pricingTier.toString();
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
        if (getBundleNames() != null)
            sb.append("BundleNames: ").append(getBundleNames()).append(",");
        if (getPricingTier() != null)
            sb.append("PricingTier: ").append(getPricingTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BundleInformation == false)
            return false;
        BundleInformation other = (BundleInformation) obj;
        if (other.getBundleNames() == null ^ this.getBundleNames() == null)
            return false;
        if (other.getBundleNames() != null && other.getBundleNames().equals(this.getBundleNames()) == false)
            return false;
        if (other.getPricingTier() == null ^ this.getPricingTier() == null)
            return false;
        if (other.getPricingTier() != null && other.getPricingTier().equals(this.getPricingTier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleNames() == null) ? 0 : getBundleNames().hashCode());
        hashCode = prime * hashCode + ((getPricingTier() == null) ? 0 : getPricingTier().hashCode());
        return hashCode;
    }

    @Override
    public BundleInformation clone() {
        try {
            return (BundleInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.BundleInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
