/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration parameters for PII entity redaction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/RedactionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedactionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
     * </p>
     */
    private java.util.List<String> piiEntityTypes;
    /**
     * <p>
     * Specifies whether the PII entity is redacted with the mask character or the entity type.
     * </p>
     */
    private String maskMode;
    /**
     * <p>
     * A character that replaces each character in the redacted PII entity.
     * </p>
     */
    private String maskCharacter;

    /**
     * <p>
     * An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
     * </p>
     * 
     * @return An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
     * @see PiiEntityType
     */

    public java.util.List<String> getPiiEntityTypes() {
        return piiEntityTypes;
    }

    /**
     * <p>
     * An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
     * </p>
     * 
     * @param piiEntityTypes
     *        An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
     * @see PiiEntityType
     */

    public void setPiiEntityTypes(java.util.Collection<String> piiEntityTypes) {
        if (piiEntityTypes == null) {
            this.piiEntityTypes = null;
            return;
        }

        this.piiEntityTypes = new java.util.ArrayList<String>(piiEntityTypes);
    }

    /**
     * <p>
     * An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPiiEntityTypes(java.util.Collection)} or {@link #withPiiEntityTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param piiEntityTypes
     *        An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public RedactionConfig withPiiEntityTypes(String... piiEntityTypes) {
        if (this.piiEntityTypes == null) {
            setPiiEntityTypes(new java.util.ArrayList<String>(piiEntityTypes.length));
        }
        for (String ele : piiEntityTypes) {
            this.piiEntityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
     * </p>
     * 
     * @param piiEntityTypes
     *        An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public RedactionConfig withPiiEntityTypes(java.util.Collection<String> piiEntityTypes) {
        setPiiEntityTypes(piiEntityTypes);
        return this;
    }

    /**
     * <p>
     * An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
     * </p>
     * 
     * @param piiEntityTypes
     *        An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public RedactionConfig withPiiEntityTypes(PiiEntityType... piiEntityTypes) {
        java.util.ArrayList<String> piiEntityTypesCopy = new java.util.ArrayList<String>(piiEntityTypes.length);
        for (PiiEntityType value : piiEntityTypes) {
            piiEntityTypesCopy.add(value.toString());
        }
        if (getPiiEntityTypes() == null) {
            setPiiEntityTypes(piiEntityTypesCopy);
        } else {
            getPiiEntityTypes().addAll(piiEntityTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether the PII entity is redacted with the mask character or the entity type.
     * </p>
     * 
     * @param maskMode
     *        Specifies whether the PII entity is redacted with the mask character or the entity type.
     * @see PiiEntitiesDetectionMaskMode
     */

    public void setMaskMode(String maskMode) {
        this.maskMode = maskMode;
    }

    /**
     * <p>
     * Specifies whether the PII entity is redacted with the mask character or the entity type.
     * </p>
     * 
     * @return Specifies whether the PII entity is redacted with the mask character or the entity type.
     * @see PiiEntitiesDetectionMaskMode
     */

    public String getMaskMode() {
        return this.maskMode;
    }

    /**
     * <p>
     * Specifies whether the PII entity is redacted with the mask character or the entity type.
     * </p>
     * 
     * @param maskMode
     *        Specifies whether the PII entity is redacted with the mask character or the entity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntitiesDetectionMaskMode
     */

    public RedactionConfig withMaskMode(String maskMode) {
        setMaskMode(maskMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether the PII entity is redacted with the mask character or the entity type.
     * </p>
     * 
     * @param maskMode
     *        Specifies whether the PII entity is redacted with the mask character or the entity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntitiesDetectionMaskMode
     */

    public RedactionConfig withMaskMode(PiiEntitiesDetectionMaskMode maskMode) {
        this.maskMode = maskMode.toString();
        return this;
    }

    /**
     * <p>
     * A character that replaces each character in the redacted PII entity.
     * </p>
     * 
     * @param maskCharacter
     *        A character that replaces each character in the redacted PII entity.
     */

    public void setMaskCharacter(String maskCharacter) {
        this.maskCharacter = maskCharacter;
    }

    /**
     * <p>
     * A character that replaces each character in the redacted PII entity.
     * </p>
     * 
     * @return A character that replaces each character in the redacted PII entity.
     */

    public String getMaskCharacter() {
        return this.maskCharacter;
    }

    /**
     * <p>
     * A character that replaces each character in the redacted PII entity.
     * </p>
     * 
     * @param maskCharacter
     *        A character that replaces each character in the redacted PII entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedactionConfig withMaskCharacter(String maskCharacter) {
        setMaskCharacter(maskCharacter);
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
        if (getPiiEntityTypes() != null)
            sb.append("PiiEntityTypes: ").append(getPiiEntityTypes()).append(",");
        if (getMaskMode() != null)
            sb.append("MaskMode: ").append(getMaskMode()).append(",");
        if (getMaskCharacter() != null)
            sb.append("MaskCharacter: ").append(getMaskCharacter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedactionConfig == false)
            return false;
        RedactionConfig other = (RedactionConfig) obj;
        if (other.getPiiEntityTypes() == null ^ this.getPiiEntityTypes() == null)
            return false;
        if (other.getPiiEntityTypes() != null && other.getPiiEntityTypes().equals(this.getPiiEntityTypes()) == false)
            return false;
        if (other.getMaskMode() == null ^ this.getMaskMode() == null)
            return false;
        if (other.getMaskMode() != null && other.getMaskMode().equals(this.getMaskMode()) == false)
            return false;
        if (other.getMaskCharacter() == null ^ this.getMaskCharacter() == null)
            return false;
        if (other.getMaskCharacter() != null && other.getMaskCharacter().equals(this.getMaskCharacter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPiiEntityTypes() == null) ? 0 : getPiiEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getMaskMode() == null) ? 0 : getMaskMode().hashCode());
        hashCode = prime * hashCode + ((getMaskCharacter() == null) ? 0 : getMaskCharacter().hashCode());
        return hashCode;
    }

    @Override
    public RedactionConfig clone() {
        try {
            return (RedactionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.RedactionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
