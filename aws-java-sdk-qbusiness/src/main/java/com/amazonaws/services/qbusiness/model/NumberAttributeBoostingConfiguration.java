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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information on boosting <code>NUMBER</code> type document attributes.
 * </p>
 * <p>
 * For more information on how boosting document attributes work in Amazon Q Business, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/metadata-boosting.html">Boosting using document
 * attributes</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/NumberAttributeBoostingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumberAttributeBoostingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the duration, in seconds, of a boost applies to a <code>NUMBER</code> type document attribute.
     * </p>
     */
    private String boostingLevel;
    /**
     * <p>
     * Specifies how much a document attribute is boosted.
     * </p>
     */
    private String boostingType;

    /**
     * <p>
     * Specifies the duration, in seconds, of a boost applies to a <code>NUMBER</code> type document attribute.
     * </p>
     * 
     * @param boostingLevel
     *        Specifies the duration, in seconds, of a boost applies to a <code>NUMBER</code> type document attribute.
     * @see DocumentAttributeBoostingLevel
     */

    public void setBoostingLevel(String boostingLevel) {
        this.boostingLevel = boostingLevel;
    }

    /**
     * <p>
     * Specifies the duration, in seconds, of a boost applies to a <code>NUMBER</code> type document attribute.
     * </p>
     * 
     * @return Specifies the duration, in seconds, of a boost applies to a <code>NUMBER</code> type document attribute.
     * @see DocumentAttributeBoostingLevel
     */

    public String getBoostingLevel() {
        return this.boostingLevel;
    }

    /**
     * <p>
     * Specifies the duration, in seconds, of a boost applies to a <code>NUMBER</code> type document attribute.
     * </p>
     * 
     * @param boostingLevel
     *        Specifies the duration, in seconds, of a boost applies to a <code>NUMBER</code> type document attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentAttributeBoostingLevel
     */

    public NumberAttributeBoostingConfiguration withBoostingLevel(String boostingLevel) {
        setBoostingLevel(boostingLevel);
        return this;
    }

    /**
     * <p>
     * Specifies the duration, in seconds, of a boost applies to a <code>NUMBER</code> type document attribute.
     * </p>
     * 
     * @param boostingLevel
     *        Specifies the duration, in seconds, of a boost applies to a <code>NUMBER</code> type document attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentAttributeBoostingLevel
     */

    public NumberAttributeBoostingConfiguration withBoostingLevel(DocumentAttributeBoostingLevel boostingLevel) {
        this.boostingLevel = boostingLevel.toString();
        return this;
    }

    /**
     * <p>
     * Specifies how much a document attribute is boosted.
     * </p>
     * 
     * @param boostingType
     *        Specifies how much a document attribute is boosted.
     * @see NumberAttributeBoostingType
     */

    public void setBoostingType(String boostingType) {
        this.boostingType = boostingType;
    }

    /**
     * <p>
     * Specifies how much a document attribute is boosted.
     * </p>
     * 
     * @return Specifies how much a document attribute is boosted.
     * @see NumberAttributeBoostingType
     */

    public String getBoostingType() {
        return this.boostingType;
    }

    /**
     * <p>
     * Specifies how much a document attribute is boosted.
     * </p>
     * 
     * @param boostingType
     *        Specifies how much a document attribute is boosted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberAttributeBoostingType
     */

    public NumberAttributeBoostingConfiguration withBoostingType(String boostingType) {
        setBoostingType(boostingType);
        return this;
    }

    /**
     * <p>
     * Specifies how much a document attribute is boosted.
     * </p>
     * 
     * @param boostingType
     *        Specifies how much a document attribute is boosted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberAttributeBoostingType
     */

    public NumberAttributeBoostingConfiguration withBoostingType(NumberAttributeBoostingType boostingType) {
        this.boostingType = boostingType.toString();
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
        if (getBoostingLevel() != null)
            sb.append("BoostingLevel: ").append(getBoostingLevel()).append(",");
        if (getBoostingType() != null)
            sb.append("BoostingType: ").append(getBoostingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumberAttributeBoostingConfiguration == false)
            return false;
        NumberAttributeBoostingConfiguration other = (NumberAttributeBoostingConfiguration) obj;
        if (other.getBoostingLevel() == null ^ this.getBoostingLevel() == null)
            return false;
        if (other.getBoostingLevel() != null && other.getBoostingLevel().equals(this.getBoostingLevel()) == false)
            return false;
        if (other.getBoostingType() == null ^ this.getBoostingType() == null)
            return false;
        if (other.getBoostingType() != null && other.getBoostingType().equals(this.getBoostingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoostingLevel() == null) ? 0 : getBoostingLevel().hashCode());
        hashCode = prime * hashCode + ((getBoostingType() == null) ? 0 : getBoostingType().hashCode());
        return hashCode;
    }

    @Override
    public NumberAttributeBoostingConfiguration clone() {
        try {
            return (NumberAttributeBoostingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.NumberAttributeBoostingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
