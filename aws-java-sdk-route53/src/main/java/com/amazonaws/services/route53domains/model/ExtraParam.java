/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

/**
 * <p>
 * ExtraParam includes the following elements.
 * </p>
 */
public class ExtraParam implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>DUNS_NUMBER</code> | <code>BRAND_NUMBER</code> | <code>BIRTH_DEPARTMENT</code> |
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code> | <code>BIRTH_COUNTRY</code> | <code>BIRTH_CITY</code> |
     * <code>DOCUMENT_NUMBER</code> | <code>AU_ID_NUMBER</code> | <code>AU_ID_TYPE</code> | <code>CA_LEGAL_TYPE</code> |
     * <code>CA_BUSINESS_ENTITY_TYPE</code> |<code>ES_IDENTIFICATION</code> | <code>ES_IDENTIFICATION_TYPE</code> |
     * <code>ES_LEGAL_FORM</code> | <code>FI_BUSINESS_NUMBER</code> | <code>FI_ID_NUMBER</code> | <code>IT_PIN</code> |
     * <code>RU_PASSPORT_DATA</code> | <code>SE_ID_NUMBER</code> | <code>SG_ID_NUMBER</code> | <code>VAT_NUMBER</code>
     * </p>
     * <p>
     * Parent: <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String name;
    /**
     * <p>
     * Values corresponding to the additional parameter names required by some top-level domains.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 2048 characters.
     * </p>
     * <p>
     * Parent: <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String value;

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>DUNS_NUMBER</code> | <code>BRAND_NUMBER</code> | <code>BIRTH_DEPARTMENT</code> |
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code> | <code>BIRTH_COUNTRY</code> | <code>BIRTH_CITY</code> |
     * <code>DOCUMENT_NUMBER</code> | <code>AU_ID_NUMBER</code> | <code>AU_ID_TYPE</code> | <code>CA_LEGAL_TYPE</code> |
     * <code>CA_BUSINESS_ENTITY_TYPE</code> |<code>ES_IDENTIFICATION</code> | <code>ES_IDENTIFICATION_TYPE</code> |
     * <code>ES_LEGAL_FORM</code> | <code>FI_BUSINESS_NUMBER</code> | <code>FI_ID_NUMBER</code> | <code>IT_PIN</code> |
     * <code>RU_PASSPORT_DATA</code> | <code>SE_ID_NUMBER</code> | <code>SG_ID_NUMBER</code> | <code>VAT_NUMBER</code>
     * </p>
     * <p>
     * Parent: <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param name
     *        Name of the additional parameter required by the top-level domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: <code>DUNS_NUMBER</code> | <code>BRAND_NUMBER</code> | <code>BIRTH_DEPARTMENT</code> |
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code> | <code>BIRTH_COUNTRY</code> | <code>BIRTH_CITY</code> |
     *        <code>DOCUMENT_NUMBER</code> | <code>AU_ID_NUMBER</code> | <code>AU_ID_TYPE</code> |
     *        <code>CA_LEGAL_TYPE</code> | <code>CA_BUSINESS_ENTITY_TYPE</code> |<code>ES_IDENTIFICATION</code> |
     *        <code>ES_IDENTIFICATION_TYPE</code> | <code>ES_LEGAL_FORM</code> | <code>FI_BUSINESS_NUMBER</code> |
     *        <code>FI_ID_NUMBER</code> | <code>IT_PIN</code> | <code>RU_PASSPORT_DATA</code> |
     *        <code>SE_ID_NUMBER</code> | <code>SG_ID_NUMBER</code> | <code>VAT_NUMBER</code>
     *        </p>
     *        <p>
     *        Parent: <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @see ExtraParamName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>DUNS_NUMBER</code> | <code>BRAND_NUMBER</code> | <code>BIRTH_DEPARTMENT</code> |
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code> | <code>BIRTH_COUNTRY</code> | <code>BIRTH_CITY</code> |
     * <code>DOCUMENT_NUMBER</code> | <code>AU_ID_NUMBER</code> | <code>AU_ID_TYPE</code> | <code>CA_LEGAL_TYPE</code> |
     * <code>CA_BUSINESS_ENTITY_TYPE</code> |<code>ES_IDENTIFICATION</code> | <code>ES_IDENTIFICATION_TYPE</code> |
     * <code>ES_LEGAL_FORM</code> | <code>FI_BUSINESS_NUMBER</code> | <code>FI_ID_NUMBER</code> | <code>IT_PIN</code> |
     * <code>RU_PASSPORT_DATA</code> | <code>SE_ID_NUMBER</code> | <code>SG_ID_NUMBER</code> | <code>VAT_NUMBER</code>
     * </p>
     * <p>
     * Parent: <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Name of the additional parameter required by the top-level domain.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Valid values: <code>DUNS_NUMBER</code> | <code>BRAND_NUMBER</code> | <code>BIRTH_DEPARTMENT</code> |
     *         <code>BIRTH_DATE_IN_YYYY_MM_DD</code> | <code>BIRTH_COUNTRY</code> | <code>BIRTH_CITY</code> |
     *         <code>DOCUMENT_NUMBER</code> | <code>AU_ID_NUMBER</code> | <code>AU_ID_TYPE</code> |
     *         <code>CA_LEGAL_TYPE</code> | <code>CA_BUSINESS_ENTITY_TYPE</code> |<code>ES_IDENTIFICATION</code> |
     *         <code>ES_IDENTIFICATION_TYPE</code> | <code>ES_LEGAL_FORM</code> | <code>FI_BUSINESS_NUMBER</code> |
     *         <code>FI_ID_NUMBER</code> | <code>IT_PIN</code> | <code>RU_PASSPORT_DATA</code> |
     *         <code>SE_ID_NUMBER</code> | <code>SG_ID_NUMBER</code> | <code>VAT_NUMBER</code>
     *         </p>
     *         <p>
     *         Parent: <code>ExtraParams</code>
     *         </p>
     *         <p>
     *         Required: Yes
     * @see ExtraParamName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>DUNS_NUMBER</code> | <code>BRAND_NUMBER</code> | <code>BIRTH_DEPARTMENT</code> |
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code> | <code>BIRTH_COUNTRY</code> | <code>BIRTH_CITY</code> |
     * <code>DOCUMENT_NUMBER</code> | <code>AU_ID_NUMBER</code> | <code>AU_ID_TYPE</code> | <code>CA_LEGAL_TYPE</code> |
     * <code>CA_BUSINESS_ENTITY_TYPE</code> |<code>ES_IDENTIFICATION</code> | <code>ES_IDENTIFICATION_TYPE</code> |
     * <code>ES_LEGAL_FORM</code> | <code>FI_BUSINESS_NUMBER</code> | <code>FI_ID_NUMBER</code> | <code>IT_PIN</code> |
     * <code>RU_PASSPORT_DATA</code> | <code>SE_ID_NUMBER</code> | <code>SG_ID_NUMBER</code> | <code>VAT_NUMBER</code>
     * </p>
     * <p>
     * Parent: <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param name
     *        Name of the additional parameter required by the top-level domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: <code>DUNS_NUMBER</code> | <code>BRAND_NUMBER</code> | <code>BIRTH_DEPARTMENT</code> |
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code> | <code>BIRTH_COUNTRY</code> | <code>BIRTH_CITY</code> |
     *        <code>DOCUMENT_NUMBER</code> | <code>AU_ID_NUMBER</code> | <code>AU_ID_TYPE</code> |
     *        <code>CA_LEGAL_TYPE</code> | <code>CA_BUSINESS_ENTITY_TYPE</code> |<code>ES_IDENTIFICATION</code> |
     *        <code>ES_IDENTIFICATION_TYPE</code> | <code>ES_LEGAL_FORM</code> | <code>FI_BUSINESS_NUMBER</code> |
     *        <code>FI_ID_NUMBER</code> | <code>IT_PIN</code> | <code>RU_PASSPORT_DATA</code> |
     *        <code>SE_ID_NUMBER</code> | <code>SG_ID_NUMBER</code> | <code>VAT_NUMBER</code>
     *        </p>
     *        <p>
     *        Parent: <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtraParamName
     */

    public ExtraParam withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>DUNS_NUMBER</code> | <code>BRAND_NUMBER</code> | <code>BIRTH_DEPARTMENT</code> |
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code> | <code>BIRTH_COUNTRY</code> | <code>BIRTH_CITY</code> |
     * <code>DOCUMENT_NUMBER</code> | <code>AU_ID_NUMBER</code> | <code>AU_ID_TYPE</code> | <code>CA_LEGAL_TYPE</code> |
     * <code>CA_BUSINESS_ENTITY_TYPE</code> |<code>ES_IDENTIFICATION</code> | <code>ES_IDENTIFICATION_TYPE</code> |
     * <code>ES_LEGAL_FORM</code> | <code>FI_BUSINESS_NUMBER</code> | <code>FI_ID_NUMBER</code> | <code>IT_PIN</code> |
     * <code>RU_PASSPORT_DATA</code> | <code>SE_ID_NUMBER</code> | <code>SG_ID_NUMBER</code> | <code>VAT_NUMBER</code>
     * </p>
     * <p>
     * Parent: <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param name
     *        Name of the additional parameter required by the top-level domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: <code>DUNS_NUMBER</code> | <code>BRAND_NUMBER</code> | <code>BIRTH_DEPARTMENT</code> |
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code> | <code>BIRTH_COUNTRY</code> | <code>BIRTH_CITY</code> |
     *        <code>DOCUMENT_NUMBER</code> | <code>AU_ID_NUMBER</code> | <code>AU_ID_TYPE</code> |
     *        <code>CA_LEGAL_TYPE</code> | <code>CA_BUSINESS_ENTITY_TYPE</code> |<code>ES_IDENTIFICATION</code> |
     *        <code>ES_IDENTIFICATION_TYPE</code> | <code>ES_LEGAL_FORM</code> | <code>FI_BUSINESS_NUMBER</code> |
     *        <code>FI_ID_NUMBER</code> | <code>IT_PIN</code> | <code>RU_PASSPORT_DATA</code> |
     *        <code>SE_ID_NUMBER</code> | <code>SG_ID_NUMBER</code> | <code>VAT_NUMBER</code>
     *        </p>
     *        <p>
     *        Parent: <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @see ExtraParamName
     */

    public void setName(ExtraParamName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * Name of the additional parameter required by the top-level domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>DUNS_NUMBER</code> | <code>BRAND_NUMBER</code> | <code>BIRTH_DEPARTMENT</code> |
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code> | <code>BIRTH_COUNTRY</code> | <code>BIRTH_CITY</code> |
     * <code>DOCUMENT_NUMBER</code> | <code>AU_ID_NUMBER</code> | <code>AU_ID_TYPE</code> | <code>CA_LEGAL_TYPE</code> |
     * <code>CA_BUSINESS_ENTITY_TYPE</code> |<code>ES_IDENTIFICATION</code> | <code>ES_IDENTIFICATION_TYPE</code> |
     * <code>ES_LEGAL_FORM</code> | <code>FI_BUSINESS_NUMBER</code> | <code>FI_ID_NUMBER</code> | <code>IT_PIN</code> |
     * <code>RU_PASSPORT_DATA</code> | <code>SE_ID_NUMBER</code> | <code>SG_ID_NUMBER</code> | <code>VAT_NUMBER</code>
     * </p>
     * <p>
     * Parent: <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param name
     *        Name of the additional parameter required by the top-level domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: <code>DUNS_NUMBER</code> | <code>BRAND_NUMBER</code> | <code>BIRTH_DEPARTMENT</code> |
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code> | <code>BIRTH_COUNTRY</code> | <code>BIRTH_CITY</code> |
     *        <code>DOCUMENT_NUMBER</code> | <code>AU_ID_NUMBER</code> | <code>AU_ID_TYPE</code> |
     *        <code>CA_LEGAL_TYPE</code> | <code>CA_BUSINESS_ENTITY_TYPE</code> |<code>ES_IDENTIFICATION</code> |
     *        <code>ES_IDENTIFICATION_TYPE</code> | <code>ES_LEGAL_FORM</code> | <code>FI_BUSINESS_NUMBER</code> |
     *        <code>FI_ID_NUMBER</code> | <code>IT_PIN</code> | <code>RU_PASSPORT_DATA</code> |
     *        <code>SE_ID_NUMBER</code> | <code>SG_ID_NUMBER</code> | <code>VAT_NUMBER</code>
     *        </p>
     *        <p>
     *        Parent: <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtraParamName
     */

    public ExtraParam withName(ExtraParamName name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Values corresponding to the additional parameter names required by some top-level domains.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 2048 characters.
     * </p>
     * <p>
     * Parent: <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param value
     *        Values corresponding to the additional parameter names required by some top-level domains.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 2048 characters.
     *        </p>
     *        <p>
     *        Parent: <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Values corresponding to the additional parameter names required by some top-level domains.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 2048 characters.
     * </p>
     * <p>
     * Parent: <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Values corresponding to the additional parameter names required by some top-level domains.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 2048 characters.
     *         </p>
     *         <p>
     *         Parent: <code>ExtraParams</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Values corresponding to the additional parameter names required by some top-level domains.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 2048 characters.
     * </p>
     * <p>
     * Parent: <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param value
     *        Values corresponding to the additional parameter names required by some top-level domains.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 2048 characters.
     *        </p>
     *        <p>
     *        Parent: <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtraParam withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtraParam == false)
            return false;
        ExtraParam other = (ExtraParam) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ExtraParam clone() {
        try {
            return (ExtraParam) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
