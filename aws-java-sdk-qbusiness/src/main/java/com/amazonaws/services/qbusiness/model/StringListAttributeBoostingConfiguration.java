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
 * Provides information on boosting <code>STRING_LIST</code> type document attributes.
 * </p>
 * <note>
 * <p>
 * For <code>STRING</code> and <code>STRING_LIST</code> type document attributes to be used for boosting on the console
 * and the API, they must be enabled for search using the <a
 * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeConfiguration.html"
 * >DocumentAttributeConfiguration</a> object of the <a
 * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_UpdateIndex.html">UpdateIndex</a> API. If you
 * haven't enabled searching on these attributes, you can't boost attributes of these data types on either the console
 * or the API.
 * </p>
 * </note>
 * <p>
 * For more information on how boosting document attributes work in Amazon Q Business, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/metadata-boosting.html">Boosting using document
 * attributes</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/StringListAttributeBoostingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringListAttributeBoostingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies how much a document attribute is boosted.
     * </p>
     */
    private String boostingLevel;

    /**
     * <p>
     * Specifies how much a document attribute is boosted.
     * </p>
     * 
     * @param boostingLevel
     *        Specifies how much a document attribute is boosted.
     * @see DocumentAttributeBoostingLevel
     */

    public void setBoostingLevel(String boostingLevel) {
        this.boostingLevel = boostingLevel;
    }

    /**
     * <p>
     * Specifies how much a document attribute is boosted.
     * </p>
     * 
     * @return Specifies how much a document attribute is boosted.
     * @see DocumentAttributeBoostingLevel
     */

    public String getBoostingLevel() {
        return this.boostingLevel;
    }

    /**
     * <p>
     * Specifies how much a document attribute is boosted.
     * </p>
     * 
     * @param boostingLevel
     *        Specifies how much a document attribute is boosted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentAttributeBoostingLevel
     */

    public StringListAttributeBoostingConfiguration withBoostingLevel(String boostingLevel) {
        setBoostingLevel(boostingLevel);
        return this;
    }

    /**
     * <p>
     * Specifies how much a document attribute is boosted.
     * </p>
     * 
     * @param boostingLevel
     *        Specifies how much a document attribute is boosted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentAttributeBoostingLevel
     */

    public StringListAttributeBoostingConfiguration withBoostingLevel(DocumentAttributeBoostingLevel boostingLevel) {
        this.boostingLevel = boostingLevel.toString();
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
            sb.append("BoostingLevel: ").append(getBoostingLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StringListAttributeBoostingConfiguration == false)
            return false;
        StringListAttributeBoostingConfiguration other = (StringListAttributeBoostingConfiguration) obj;
        if (other.getBoostingLevel() == null ^ this.getBoostingLevel() == null)
            return false;
        if (other.getBoostingLevel() != null && other.getBoostingLevel().equals(this.getBoostingLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoostingLevel() == null) ? 0 : getBoostingLevel().hashCode());
        return hashCode;
    }

    @Override
    public StringListAttributeBoostingConfiguration clone() {
        try {
            return (StringListAttributeBoostingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.StringListAttributeBoostingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
