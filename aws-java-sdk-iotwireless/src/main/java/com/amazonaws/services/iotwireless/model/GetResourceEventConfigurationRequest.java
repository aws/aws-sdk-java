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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourceEventConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceEventConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Resource identifier to opt in for event messaging.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     */
    private String identifierType;
    /**
     * <p>
     * Partner type of the resource if the identifier type is <code>PartnerAccountId</code>.
     * </p>
     */
    private String partnerType;

    /**
     * <p>
     * Resource identifier to opt in for event messaging.
     * </p>
     * 
     * @param identifier
     *        Resource identifier to opt in for event messaging.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Resource identifier to opt in for event messaging.
     * </p>
     * 
     * @return Resource identifier to opt in for event messaging.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Resource identifier to opt in for event messaging.
     * </p>
     * 
     * @param identifier
     *        Resource identifier to opt in for event messaging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceEventConfigurationRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @param identifierType
     *        Identifier type of the particular resource identifier for event configuration.
     * @see IdentifierType
     */

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @return Identifier type of the particular resource identifier for event configuration.
     * @see IdentifierType
     */

    public String getIdentifierType() {
        return this.identifierType;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @param identifierType
     *        Identifier type of the particular resource identifier for event configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentifierType
     */

    public GetResourceEventConfigurationRequest withIdentifierType(String identifierType) {
        setIdentifierType(identifierType);
        return this;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @param identifierType
     *        Identifier type of the particular resource identifier for event configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentifierType
     */

    public GetResourceEventConfigurationRequest withIdentifierType(IdentifierType identifierType) {
        this.identifierType = identifierType.toString();
        return this;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is <code>PartnerAccountId</code>.
     * </p>
     * 
     * @param partnerType
     *        Partner type of the resource if the identifier type is <code>PartnerAccountId</code>.
     * @see EventNotificationPartnerType
     */

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is <code>PartnerAccountId</code>.
     * </p>
     * 
     * @return Partner type of the resource if the identifier type is <code>PartnerAccountId</code>.
     * @see EventNotificationPartnerType
     */

    public String getPartnerType() {
        return this.partnerType;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is <code>PartnerAccountId</code>.
     * </p>
     * 
     * @param partnerType
     *        Partner type of the resource if the identifier type is <code>PartnerAccountId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationPartnerType
     */

    public GetResourceEventConfigurationRequest withPartnerType(String partnerType) {
        setPartnerType(partnerType);
        return this;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is <code>PartnerAccountId</code>.
     * </p>
     * 
     * @param partnerType
     *        Partner type of the resource if the identifier type is <code>PartnerAccountId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationPartnerType
     */

    public GetResourceEventConfigurationRequest withPartnerType(EventNotificationPartnerType partnerType) {
        this.partnerType = partnerType.toString();
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getIdentifierType() != null)
            sb.append("IdentifierType: ").append(getIdentifierType()).append(",");
        if (getPartnerType() != null)
            sb.append("PartnerType: ").append(getPartnerType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceEventConfigurationRequest == false)
            return false;
        GetResourceEventConfigurationRequest other = (GetResourceEventConfigurationRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getIdentifierType() == null ^ this.getIdentifierType() == null)
            return false;
        if (other.getIdentifierType() != null && other.getIdentifierType().equals(this.getIdentifierType()) == false)
            return false;
        if (other.getPartnerType() == null ^ this.getPartnerType() == null)
            return false;
        if (other.getPartnerType() != null && other.getPartnerType().equals(this.getPartnerType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifierType() == null) ? 0 : getIdentifierType().hashCode());
        hashCode = prime * hashCode + ((getPartnerType() == null) ? 0 : getPartnerType().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceEventConfigurationRequest clone() {
        return (GetResourceEventConfigurationRequest) super.clone();
    }

}
