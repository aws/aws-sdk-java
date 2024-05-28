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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The processing rules for when a registration can be associated with an origination identity and disassociated from an
 * origination identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SupportedAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupportedAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the behavior of when an origination identity and registration can be associated with each other.
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
     * The association behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATE_BEFORE_SUBMIT</code> The origination identity has to be supplied when creating a registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSOCIATE_ON_APPROVAL</code> This applies to all short code registrations. The short code will be
     * automatically provisioned once the registration is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSOCIATE_AFTER_COMPLETE</code> This applies to phone number registrations when you must complete a
     * registration first, then associate one or more phone numbers later. For example 10DLC campaigns and long codes.
     * </p>
     * </li>
     * </ul>
     */
    private String associationBehavior;
    /**
     * <p>
     * The disassociation behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISASSOCIATE_ALL_CLOSES_REGISTRATION</code> All origination identities must be disassociated from the
     * registration before the registration can be closed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISASSOCIATE_ALL_ALLOWS_DELETE_REGISTRATION</code> All origination identities must be disassociated from
     * the registration before the registration can be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_REGISTRATION_DISASSOCIATES</code> The registration can be deleted and all origination identities
     * will be disasscoiated.
     * </p>
     * </li>
     * </ul>
     */
    private String disassociationBehavior;

    /**
     * <p>
     * Defines the behavior of when an origination identity and registration can be associated with each other.
     * </p>
     * 
     * @param resourceType
     *        Defines the behavior of when an origination identity and registration can be associated with each other.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Defines the behavior of when an origination identity and registration can be associated with each other.
     * </p>
     * 
     * @return Defines the behavior of when an origination identity and registration can be associated with each other.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Defines the behavior of when an origination identity and registration can be associated with each other.
     * </p>
     * 
     * @param resourceType
     *        Defines the behavior of when an origination identity and registration can be associated with each other.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedAssociation withResourceType(String resourceType) {
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

    public SupportedAssociation withIsoCountryCode(String isoCountryCode) {
        setIsoCountryCode(isoCountryCode);
        return this;
    }

    /**
     * <p>
     * The association behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATE_BEFORE_SUBMIT</code> The origination identity has to be supplied when creating a registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSOCIATE_ON_APPROVAL</code> This applies to all short code registrations. The short code will be
     * automatically provisioned once the registration is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSOCIATE_AFTER_COMPLETE</code> This applies to phone number registrations when you must complete a
     * registration first, then associate one or more phone numbers later. For example 10DLC campaigns and long codes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationBehavior
     *        The association behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASSOCIATE_BEFORE_SUBMIT</code> The origination identity has to be supplied when creating a
     *        registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSOCIATE_ON_APPROVAL</code> This applies to all short code registrations. The short code will be
     *        automatically provisioned once the registration is approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSOCIATE_AFTER_COMPLETE</code> This applies to phone number registrations when you must complete a
     *        registration first, then associate one or more phone numbers later. For example 10DLC campaigns and long
     *        codes.
     *        </p>
     *        </li>
     * @see RegistrationAssociationBehavior
     */

    public void setAssociationBehavior(String associationBehavior) {
        this.associationBehavior = associationBehavior;
    }

    /**
     * <p>
     * The association behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATE_BEFORE_SUBMIT</code> The origination identity has to be supplied when creating a registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSOCIATE_ON_APPROVAL</code> This applies to all short code registrations. The short code will be
     * automatically provisioned once the registration is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSOCIATE_AFTER_COMPLETE</code> This applies to phone number registrations when you must complete a
     * registration first, then associate one or more phone numbers later. For example 10DLC campaigns and long codes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The association behavior.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASSOCIATE_BEFORE_SUBMIT</code> The origination identity has to be supplied when creating a
     *         registration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASSOCIATE_ON_APPROVAL</code> This applies to all short code registrations. The short code will be
     *         automatically provisioned once the registration is approved.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASSOCIATE_AFTER_COMPLETE</code> This applies to phone number registrations when you must complete a
     *         registration first, then associate one or more phone numbers later. For example 10DLC campaigns and long
     *         codes.
     *         </p>
     *         </li>
     * @see RegistrationAssociationBehavior
     */

    public String getAssociationBehavior() {
        return this.associationBehavior;
    }

    /**
     * <p>
     * The association behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATE_BEFORE_SUBMIT</code> The origination identity has to be supplied when creating a registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSOCIATE_ON_APPROVAL</code> This applies to all short code registrations. The short code will be
     * automatically provisioned once the registration is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSOCIATE_AFTER_COMPLETE</code> This applies to phone number registrations when you must complete a
     * registration first, then associate one or more phone numbers later. For example 10DLC campaigns and long codes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationBehavior
     *        The association behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASSOCIATE_BEFORE_SUBMIT</code> The origination identity has to be supplied when creating a
     *        registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSOCIATE_ON_APPROVAL</code> This applies to all short code registrations. The short code will be
     *        automatically provisioned once the registration is approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSOCIATE_AFTER_COMPLETE</code> This applies to phone number registrations when you must complete a
     *        registration first, then associate one or more phone numbers later. For example 10DLC campaigns and long
     *        codes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationAssociationBehavior
     */

    public SupportedAssociation withAssociationBehavior(String associationBehavior) {
        setAssociationBehavior(associationBehavior);
        return this;
    }

    /**
     * <p>
     * The association behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATE_BEFORE_SUBMIT</code> The origination identity has to be supplied when creating a registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSOCIATE_ON_APPROVAL</code> This applies to all short code registrations. The short code will be
     * automatically provisioned once the registration is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSOCIATE_AFTER_COMPLETE</code> This applies to phone number registrations when you must complete a
     * registration first, then associate one or more phone numbers later. For example 10DLC campaigns and long codes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationBehavior
     *        The association behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASSOCIATE_BEFORE_SUBMIT</code> The origination identity has to be supplied when creating a
     *        registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSOCIATE_ON_APPROVAL</code> This applies to all short code registrations. The short code will be
     *        automatically provisioned once the registration is approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSOCIATE_AFTER_COMPLETE</code> This applies to phone number registrations when you must complete a
     *        registration first, then associate one or more phone numbers later. For example 10DLC campaigns and long
     *        codes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationAssociationBehavior
     */

    public SupportedAssociation withAssociationBehavior(RegistrationAssociationBehavior associationBehavior) {
        this.associationBehavior = associationBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The disassociation behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISASSOCIATE_ALL_CLOSES_REGISTRATION</code> All origination identities must be disassociated from the
     * registration before the registration can be closed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISASSOCIATE_ALL_ALLOWS_DELETE_REGISTRATION</code> All origination identities must be disassociated from
     * the registration before the registration can be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_REGISTRATION_DISASSOCIATES</code> The registration can be deleted and all origination identities
     * will be disasscoiated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociationBehavior
     *        The disassociation behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISASSOCIATE_ALL_CLOSES_REGISTRATION</code> All origination identities must be disassociated from
     *        the registration before the registration can be closed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISASSOCIATE_ALL_ALLOWS_DELETE_REGISTRATION</code> All origination identities must be disassociated
     *        from the registration before the registration can be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_REGISTRATION_DISASSOCIATES</code> The registration can be deleted and all origination
     *        identities will be disasscoiated.
     *        </p>
     *        </li>
     * @see RegistrationDisassociationBehavior
     */

    public void setDisassociationBehavior(String disassociationBehavior) {
        this.disassociationBehavior = disassociationBehavior;
    }

    /**
     * <p>
     * The disassociation behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISASSOCIATE_ALL_CLOSES_REGISTRATION</code> All origination identities must be disassociated from the
     * registration before the registration can be closed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISASSOCIATE_ALL_ALLOWS_DELETE_REGISTRATION</code> All origination identities must be disassociated from
     * the registration before the registration can be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_REGISTRATION_DISASSOCIATES</code> The registration can be deleted and all origination identities
     * will be disasscoiated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The disassociation behavior.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DISASSOCIATE_ALL_CLOSES_REGISTRATION</code> All origination identities must be disassociated from
     *         the registration before the registration can be closed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISASSOCIATE_ALL_ALLOWS_DELETE_REGISTRATION</code> All origination identities must be disassociated
     *         from the registration before the registration can be deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_REGISTRATION_DISASSOCIATES</code> The registration can be deleted and all origination
     *         identities will be disasscoiated.
     *         </p>
     *         </li>
     * @see RegistrationDisassociationBehavior
     */

    public String getDisassociationBehavior() {
        return this.disassociationBehavior;
    }

    /**
     * <p>
     * The disassociation behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISASSOCIATE_ALL_CLOSES_REGISTRATION</code> All origination identities must be disassociated from the
     * registration before the registration can be closed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISASSOCIATE_ALL_ALLOWS_DELETE_REGISTRATION</code> All origination identities must be disassociated from
     * the registration before the registration can be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_REGISTRATION_DISASSOCIATES</code> The registration can be deleted and all origination identities
     * will be disasscoiated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociationBehavior
     *        The disassociation behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISASSOCIATE_ALL_CLOSES_REGISTRATION</code> All origination identities must be disassociated from
     *        the registration before the registration can be closed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISASSOCIATE_ALL_ALLOWS_DELETE_REGISTRATION</code> All origination identities must be disassociated
     *        from the registration before the registration can be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_REGISTRATION_DISASSOCIATES</code> The registration can be deleted and all origination
     *        identities will be disasscoiated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationDisassociationBehavior
     */

    public SupportedAssociation withDisassociationBehavior(String disassociationBehavior) {
        setDisassociationBehavior(disassociationBehavior);
        return this;
    }

    /**
     * <p>
     * The disassociation behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISASSOCIATE_ALL_CLOSES_REGISTRATION</code> All origination identities must be disassociated from the
     * registration before the registration can be closed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISASSOCIATE_ALL_ALLOWS_DELETE_REGISTRATION</code> All origination identities must be disassociated from
     * the registration before the registration can be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_REGISTRATION_DISASSOCIATES</code> The registration can be deleted and all origination identities
     * will be disasscoiated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociationBehavior
     *        The disassociation behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISASSOCIATE_ALL_CLOSES_REGISTRATION</code> All origination identities must be disassociated from
     *        the registration before the registration can be closed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISASSOCIATE_ALL_ALLOWS_DELETE_REGISTRATION</code> All origination identities must be disassociated
     *        from the registration before the registration can be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_REGISTRATION_DISASSOCIATES</code> The registration can be deleted and all origination
     *        identities will be disasscoiated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationDisassociationBehavior
     */

    public SupportedAssociation withDisassociationBehavior(RegistrationDisassociationBehavior disassociationBehavior) {
        this.disassociationBehavior = disassociationBehavior.toString();
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: ").append(getIsoCountryCode()).append(",");
        if (getAssociationBehavior() != null)
            sb.append("AssociationBehavior: ").append(getAssociationBehavior()).append(",");
        if (getDisassociationBehavior() != null)
            sb.append("DisassociationBehavior: ").append(getDisassociationBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportedAssociation == false)
            return false;
        SupportedAssociation other = (SupportedAssociation) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
            return false;
        if (other.getAssociationBehavior() == null ^ this.getAssociationBehavior() == null)
            return false;
        if (other.getAssociationBehavior() != null && other.getAssociationBehavior().equals(this.getAssociationBehavior()) == false)
            return false;
        if (other.getDisassociationBehavior() == null ^ this.getDisassociationBehavior() == null)
            return false;
        if (other.getDisassociationBehavior() != null && other.getDisassociationBehavior().equals(this.getDisassociationBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        hashCode = prime * hashCode + ((getAssociationBehavior() == null) ? 0 : getAssociationBehavior().hashCode());
        hashCode = prime * hashCode + ((getDisassociationBehavior() == null) ? 0 : getDisassociationBehavior().hashCode());
        return hashCode;
    }

    @Override
    public SupportedAssociation clone() {
        try {
            return (SupportedAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.SupportedAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
