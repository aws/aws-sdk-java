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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistrationAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRegistrationAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     */
    private String registrationArn;
    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     */
    private String registrationId;
    /**
     * <p>
     * The type of registration form. The list of <b>RegistrationTypes</b> can be found using the
     * <a>DescribeRegistrationTypeDefinitions</a> action.
     * </p>
     */
    private String registrationType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the origination identity that is associated with the registration.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The unique identifier for the origination identity. For example this could be a <b>PhoneNumberId</b> or
     * <b>SenderId</b>.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The registration type or origination identity type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     */
    private String isoCountryCode;
    /**
     * <p>
     * The phone number associated with the registration in E.164 format.
     * </p>
     */
    private String phoneNumber;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @param registrationArn
     *        The Amazon Resource Name (ARN) for the registration.
     */

    public void setRegistrationArn(String registrationArn) {
        this.registrationArn = registrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the registration.
     */

    public String getRegistrationArn() {
        return this.registrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @param registrationArn
     *        The Amazon Resource Name (ARN) for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAssociationResult withRegistrationArn(String registrationArn) {
        setRegistrationArn(registrationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     */

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @return The unique identifier for the registration.
     */

    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAssociationResult withRegistrationId(String registrationId) {
        setRegistrationId(registrationId);
        return this;
    }

    /**
     * <p>
     * The type of registration form. The list of <b>RegistrationTypes</b> can be found using the
     * <a>DescribeRegistrationTypeDefinitions</a> action.
     * </p>
     * 
     * @param registrationType
     *        The type of registration form. The list of <b>RegistrationTypes</b> can be found using the
     *        <a>DescribeRegistrationTypeDefinitions</a> action.
     */

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }

    /**
     * <p>
     * The type of registration form. The list of <b>RegistrationTypes</b> can be found using the
     * <a>DescribeRegistrationTypeDefinitions</a> action.
     * </p>
     * 
     * @return The type of registration form. The list of <b>RegistrationTypes</b> can be found using the
     *         <a>DescribeRegistrationTypeDefinitions</a> action.
     */

    public String getRegistrationType() {
        return this.registrationType;
    }

    /**
     * <p>
     * The type of registration form. The list of <b>RegistrationTypes</b> can be found using the
     * <a>DescribeRegistrationTypeDefinitions</a> action.
     * </p>
     * 
     * @param registrationType
     *        The type of registration form. The list of <b>RegistrationTypes</b> can be found using the
     *        <a>DescribeRegistrationTypeDefinitions</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAssociationResult withRegistrationType(String registrationType) {
        setRegistrationType(registrationType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the origination identity that is associated with the registration.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the origination identity that is associated with the registration.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the origination identity that is associated with the registration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the origination identity that is associated with the registration.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the origination identity that is associated with the registration.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the origination identity that is associated with the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAssociationResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the origination identity. For example this could be a <b>PhoneNumberId</b> or
     * <b>SenderId</b>.
     * </p>
     * 
     * @param resourceId
     *        The unique identifier for the origination identity. For example this could be a <b>PhoneNumberId</b> or
     *        <b>SenderId</b>.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The unique identifier for the origination identity. For example this could be a <b>PhoneNumberId</b> or
     * <b>SenderId</b>.
     * </p>
     * 
     * @return The unique identifier for the origination identity. For example this could be a <b>PhoneNumberId</b> or
     *         <b>SenderId</b>.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The unique identifier for the origination identity. For example this could be a <b>PhoneNumberId</b> or
     * <b>SenderId</b>.
     * </p>
     * 
     * @param resourceId
     *        The unique identifier for the origination identity. For example this could be a <b>PhoneNumberId</b> or
     *        <b>SenderId</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAssociationResult withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The registration type or origination identity type.
     * </p>
     * 
     * @param resourceType
     *        The registration type or origination identity type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The registration type or origination identity type.
     * </p>
     * 
     * @return The registration type or origination identity type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The registration type or origination identity type.
     * </p>
     * 
     * @param resourceType
     *        The registration type or origination identity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAssociationResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @return The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAssociationResult withIsoCountryCode(String isoCountryCode) {
        setIsoCountryCode(isoCountryCode);
        return this;
    }

    /**
     * <p>
     * The phone number associated with the registration in E.164 format.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number associated with the registration in E.164 format.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number associated with the registration in E.164 format.
     * </p>
     * 
     * @return The phone number associated with the registration in E.164 format.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number associated with the registration in E.164 format.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number associated with the registration in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAssociationResult withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
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
        if (getRegistrationArn() != null)
            sb.append("RegistrationArn: ").append(getRegistrationArn()).append(",");
        if (getRegistrationId() != null)
            sb.append("RegistrationId: ").append(getRegistrationId()).append(",");
        if (getRegistrationType() != null)
            sb.append("RegistrationType: ").append(getRegistrationType()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: ").append(getIsoCountryCode()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRegistrationAssociationResult == false)
            return false;
        CreateRegistrationAssociationResult other = (CreateRegistrationAssociationResult) obj;
        if (other.getRegistrationArn() == null ^ this.getRegistrationArn() == null)
            return false;
        if (other.getRegistrationArn() != null && other.getRegistrationArn().equals(this.getRegistrationArn()) == false)
            return false;
        if (other.getRegistrationId() == null ^ this.getRegistrationId() == null)
            return false;
        if (other.getRegistrationId() != null && other.getRegistrationId().equals(this.getRegistrationId()) == false)
            return false;
        if (other.getRegistrationType() == null ^ this.getRegistrationType() == null)
            return false;
        if (other.getRegistrationType() != null && other.getRegistrationType().equals(this.getRegistrationType()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationArn() == null) ? 0 : getRegistrationArn().hashCode());
        hashCode = prime * hashCode + ((getRegistrationId() == null) ? 0 : getRegistrationId().hashCode());
        hashCode = prime * hashCode + ((getRegistrationType() == null) ? 0 : getRegistrationType().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public CreateRegistrationAssociationResult clone() {
        try {
            return (CreateRegistrationAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
