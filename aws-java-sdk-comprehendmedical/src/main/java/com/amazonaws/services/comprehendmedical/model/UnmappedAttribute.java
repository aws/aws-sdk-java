/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An attribute that we extracted, but were unable to relate to an entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/UnmappedAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnmappedAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     * "TEST_AND_TREATMENT_PROCEDURE" or "PERSONAL_HEALTH_INFORMATION".
     * </p>
     */
    private String type;
    /**
     * <p>
     * The specific attribute that has been extracted but not mapped to an entity.
     * </p>
     */
    private Attribute attribute;

    /**
     * <p>
     * The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     * "TEST_AND_TREATMENT_PROCEDURE" or "PERSONAL_HEALTH_INFORMATION".
     * </p>
     * 
     * @param type
     *        The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION",
     *        "ANATOMY", "TEST_AND_TREATMENT_PROCEDURE" or "PERSONAL_HEALTH_INFORMATION".
     * @see EntityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     * "TEST_AND_TREATMENT_PROCEDURE" or "PERSONAL_HEALTH_INFORMATION".
     * </p>
     * 
     * @return The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION",
     *         "ANATOMY", "TEST_AND_TREATMENT_PROCEDURE" or "PERSONAL_HEALTH_INFORMATION".
     * @see EntityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     * "TEST_AND_TREATMENT_PROCEDURE" or "PERSONAL_HEALTH_INFORMATION".
     * </p>
     * 
     * @param type
     *        The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION",
     *        "ANATOMY", "TEST_AND_TREATMENT_PROCEDURE" or "PERSONAL_HEALTH_INFORMATION".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public UnmappedAttribute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     * "TEST_AND_TREATMENT_PROCEDURE" or "PERSONAL_HEALTH_INFORMATION".
     * </p>
     * 
     * @param type
     *        The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION",
     *        "ANATOMY", "TEST_AND_TREATMENT_PROCEDURE" or "PERSONAL_HEALTH_INFORMATION".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public UnmappedAttribute withType(EntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The specific attribute that has been extracted but not mapped to an entity.
     * </p>
     * 
     * @param attribute
     *        The specific attribute that has been extracted but not mapped to an entity.
     */

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The specific attribute that has been extracted but not mapped to an entity.
     * </p>
     * 
     * @return The specific attribute that has been extracted but not mapped to an entity.
     */

    public Attribute getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The specific attribute that has been extracted but not mapped to an entity.
     * </p>
     * 
     * @param attribute
     *        The specific attribute that has been extracted but not mapped to an entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnmappedAttribute withAttribute(Attribute attribute) {
        setAttribute(attribute);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnmappedAttribute == false)
            return false;
        UnmappedAttribute other = (UnmappedAttribute) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        return hashCode;
    }

    @Override
    public UnmappedAttribute clone() {
        try {
            return (UnmappedAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehendmedical.model.transform.UnmappedAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
