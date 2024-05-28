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
 * Defines limits on how the term can be configured by acceptors.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/Constraints" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Constraints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines if buyers are allowed to select multiple dimensions in the rate card. The possible values are
     * <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     * </p>
     */
    private String multipleDimensionSelection;
    /**
     * <p>
     * Determines if acceptors are allowed to configure quantity for each dimension in rate card. The possible values
     * are <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     * </p>
     */
    private String quantityConfiguration;

    /**
     * <p>
     * Determines if buyers are allowed to select multiple dimensions in the rate card. The possible values are
     * <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     * </p>
     * 
     * @param multipleDimensionSelection
     *        Determines if buyers are allowed to select multiple dimensions in the rate card. The possible values are
     *        <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     */

    public void setMultipleDimensionSelection(String multipleDimensionSelection) {
        this.multipleDimensionSelection = multipleDimensionSelection;
    }

    /**
     * <p>
     * Determines if buyers are allowed to select multiple dimensions in the rate card. The possible values are
     * <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     * </p>
     * 
     * @return Determines if buyers are allowed to select multiple dimensions in the rate card. The possible values are
     *         <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     */

    public String getMultipleDimensionSelection() {
        return this.multipleDimensionSelection;
    }

    /**
     * <p>
     * Determines if buyers are allowed to select multiple dimensions in the rate card. The possible values are
     * <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     * </p>
     * 
     * @param multipleDimensionSelection
     *        Determines if buyers are allowed to select multiple dimensions in the rate card. The possible values are
     *        <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Constraints withMultipleDimensionSelection(String multipleDimensionSelection) {
        setMultipleDimensionSelection(multipleDimensionSelection);
        return this;
    }

    /**
     * <p>
     * Determines if acceptors are allowed to configure quantity for each dimension in rate card. The possible values
     * are <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     * </p>
     * 
     * @param quantityConfiguration
     *        Determines if acceptors are allowed to configure quantity for each dimension in rate card. The possible
     *        values are <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     */

    public void setQuantityConfiguration(String quantityConfiguration) {
        this.quantityConfiguration = quantityConfiguration;
    }

    /**
     * <p>
     * Determines if acceptors are allowed to configure quantity for each dimension in rate card. The possible values
     * are <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     * </p>
     * 
     * @return Determines if acceptors are allowed to configure quantity for each dimension in rate card. The possible
     *         values are <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     */

    public String getQuantityConfiguration() {
        return this.quantityConfiguration;
    }

    /**
     * <p>
     * Determines if acceptors are allowed to configure quantity for each dimension in rate card. The possible values
     * are <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     * </p>
     * 
     * @param quantityConfiguration
     *        Determines if acceptors are allowed to configure quantity for each dimension in rate card. The possible
     *        values are <code>Allowed</code> and <code>Disallowed</code>. The default value is <code>Allowed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Constraints withQuantityConfiguration(String quantityConfiguration) {
        setQuantityConfiguration(quantityConfiguration);
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
        if (getMultipleDimensionSelection() != null)
            sb.append("MultipleDimensionSelection: ").append(getMultipleDimensionSelection()).append(",");
        if (getQuantityConfiguration() != null)
            sb.append("QuantityConfiguration: ").append(getQuantityConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Constraints == false)
            return false;
        Constraints other = (Constraints) obj;
        if (other.getMultipleDimensionSelection() == null ^ this.getMultipleDimensionSelection() == null)
            return false;
        if (other.getMultipleDimensionSelection() != null && other.getMultipleDimensionSelection().equals(this.getMultipleDimensionSelection()) == false)
            return false;
        if (other.getQuantityConfiguration() == null ^ this.getQuantityConfiguration() == null)
            return false;
        if (other.getQuantityConfiguration() != null && other.getQuantityConfiguration().equals(this.getQuantityConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultipleDimensionSelection() == null) ? 0 : getMultipleDimensionSelection().hashCode());
        hashCode = prime * hashCode + ((getQuantityConfiguration() == null) ? 0 : getQuantityConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Constraints clone() {
        try {
            return (Constraints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.ConstraintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
