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
 * Provides information on boosting supported Amazon Q Business document attribute types. When an end user chat query
 * matches document attributes that have been boosted, Amazon Q Business prioritizes generating responses from content
 * that matches the boosted document attributes.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DocumentAttributeBoostingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentAttributeBoostingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides information on boosting <code>NUMBER</code> type document attributes.
     * </p>
     */
    private NumberAttributeBoostingConfiguration numberConfiguration;
    /**
     * <p>
     * Provides information on boosting <code>STRING</code> type document attributes.
     * </p>
     */
    private StringAttributeBoostingConfiguration stringConfiguration;
    /**
     * <p>
     * Provides information on boosting <code>DATE</code> type document attributes.
     * </p>
     */
    private DateAttributeBoostingConfiguration dateConfiguration;
    /**
     * <p>
     * Provides information on boosting <code>STRING_LIST</code> type document attributes.
     * </p>
     */
    private StringListAttributeBoostingConfiguration stringListConfiguration;

    /**
     * <p>
     * Provides information on boosting <code>NUMBER</code> type document attributes.
     * </p>
     * 
     * @param numberConfiguration
     *        Provides information on boosting <code>NUMBER</code> type document attributes.
     */

    public void setNumberConfiguration(NumberAttributeBoostingConfiguration numberConfiguration) {
        this.numberConfiguration = numberConfiguration;
    }

    /**
     * <p>
     * Provides information on boosting <code>NUMBER</code> type document attributes.
     * </p>
     * 
     * @return Provides information on boosting <code>NUMBER</code> type document attributes.
     */

    public NumberAttributeBoostingConfiguration getNumberConfiguration() {
        return this.numberConfiguration;
    }

    /**
     * <p>
     * Provides information on boosting <code>NUMBER</code> type document attributes.
     * </p>
     * 
     * @param numberConfiguration
     *        Provides information on boosting <code>NUMBER</code> type document attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeBoostingConfiguration withNumberConfiguration(NumberAttributeBoostingConfiguration numberConfiguration) {
        setNumberConfiguration(numberConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides information on boosting <code>STRING</code> type document attributes.
     * </p>
     * 
     * @param stringConfiguration
     *        Provides information on boosting <code>STRING</code> type document attributes.
     */

    public void setStringConfiguration(StringAttributeBoostingConfiguration stringConfiguration) {
        this.stringConfiguration = stringConfiguration;
    }

    /**
     * <p>
     * Provides information on boosting <code>STRING</code> type document attributes.
     * </p>
     * 
     * @return Provides information on boosting <code>STRING</code> type document attributes.
     */

    public StringAttributeBoostingConfiguration getStringConfiguration() {
        return this.stringConfiguration;
    }

    /**
     * <p>
     * Provides information on boosting <code>STRING</code> type document attributes.
     * </p>
     * 
     * @param stringConfiguration
     *        Provides information on boosting <code>STRING</code> type document attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeBoostingConfiguration withStringConfiguration(StringAttributeBoostingConfiguration stringConfiguration) {
        setStringConfiguration(stringConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides information on boosting <code>DATE</code> type document attributes.
     * </p>
     * 
     * @param dateConfiguration
     *        Provides information on boosting <code>DATE</code> type document attributes.
     */

    public void setDateConfiguration(DateAttributeBoostingConfiguration dateConfiguration) {
        this.dateConfiguration = dateConfiguration;
    }

    /**
     * <p>
     * Provides information on boosting <code>DATE</code> type document attributes.
     * </p>
     * 
     * @return Provides information on boosting <code>DATE</code> type document attributes.
     */

    public DateAttributeBoostingConfiguration getDateConfiguration() {
        return this.dateConfiguration;
    }

    /**
     * <p>
     * Provides information on boosting <code>DATE</code> type document attributes.
     * </p>
     * 
     * @param dateConfiguration
     *        Provides information on boosting <code>DATE</code> type document attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeBoostingConfiguration withDateConfiguration(DateAttributeBoostingConfiguration dateConfiguration) {
        setDateConfiguration(dateConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides information on boosting <code>STRING_LIST</code> type document attributes.
     * </p>
     * 
     * @param stringListConfiguration
     *        Provides information on boosting <code>STRING_LIST</code> type document attributes.
     */

    public void setStringListConfiguration(StringListAttributeBoostingConfiguration stringListConfiguration) {
        this.stringListConfiguration = stringListConfiguration;
    }

    /**
     * <p>
     * Provides information on boosting <code>STRING_LIST</code> type document attributes.
     * </p>
     * 
     * @return Provides information on boosting <code>STRING_LIST</code> type document attributes.
     */

    public StringListAttributeBoostingConfiguration getStringListConfiguration() {
        return this.stringListConfiguration;
    }

    /**
     * <p>
     * Provides information on boosting <code>STRING_LIST</code> type document attributes.
     * </p>
     * 
     * @param stringListConfiguration
     *        Provides information on boosting <code>STRING_LIST</code> type document attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeBoostingConfiguration withStringListConfiguration(StringListAttributeBoostingConfiguration stringListConfiguration) {
        setStringListConfiguration(stringListConfiguration);
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
        if (getNumberConfiguration() != null)
            sb.append("NumberConfiguration: ").append(getNumberConfiguration()).append(",");
        if (getStringConfiguration() != null)
            sb.append("StringConfiguration: ").append(getStringConfiguration()).append(",");
        if (getDateConfiguration() != null)
            sb.append("DateConfiguration: ").append(getDateConfiguration()).append(",");
        if (getStringListConfiguration() != null)
            sb.append("StringListConfiguration: ").append(getStringListConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentAttributeBoostingConfiguration == false)
            return false;
        DocumentAttributeBoostingConfiguration other = (DocumentAttributeBoostingConfiguration) obj;
        if (other.getNumberConfiguration() == null ^ this.getNumberConfiguration() == null)
            return false;
        if (other.getNumberConfiguration() != null && other.getNumberConfiguration().equals(this.getNumberConfiguration()) == false)
            return false;
        if (other.getStringConfiguration() == null ^ this.getStringConfiguration() == null)
            return false;
        if (other.getStringConfiguration() != null && other.getStringConfiguration().equals(this.getStringConfiguration()) == false)
            return false;
        if (other.getDateConfiguration() == null ^ this.getDateConfiguration() == null)
            return false;
        if (other.getDateConfiguration() != null && other.getDateConfiguration().equals(this.getDateConfiguration()) == false)
            return false;
        if (other.getStringListConfiguration() == null ^ this.getStringListConfiguration() == null)
            return false;
        if (other.getStringListConfiguration() != null && other.getStringListConfiguration().equals(this.getStringListConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberConfiguration() == null) ? 0 : getNumberConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStringConfiguration() == null) ? 0 : getStringConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDateConfiguration() == null) ? 0 : getDateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStringListConfiguration() == null) ? 0 : getStringListConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DocumentAttributeBoostingConfiguration clone() {
        try {
            return (DocumentAttributeBoostingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.DocumentAttributeBoostingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
