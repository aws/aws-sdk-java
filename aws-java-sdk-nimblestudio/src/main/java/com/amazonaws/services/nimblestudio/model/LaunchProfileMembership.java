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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Studio admins can use launch profile membership to delegate launch profile access to studio users in the Nimble
 * Studio portal without writing or maintaining complex IAM policies. A launch profile member is a user association from
 * your studio identity source who is granted permissions to a launch profile.
 * </p>
 * <p>
 * A launch profile member (type USER) provides the following permissions to that launch profile:
 * </p>
 * <ul>
 * <li>
 * <p>
 * GetLaunchProfile
 * </p>
 * </li>
 * <li>
 * <p>
 * GetLaunchProfileInitialization
 * </p>
 * </li>
 * <li>
 * <p>
 * GetLaunchProfileMembers
 * </p>
 * </li>
 * <li>
 * <p>
 * GetLaunchProfileMember
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateStreamingSession
 * </p>
 * </li>
 * <li>
 * <p>
 * GetLaunchProfileDetails
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/LaunchProfileMembership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchProfileMembership implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the identity store.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * The persona.
     * </p>
     */
    private String persona;
    /**
     * <p>
     * The principal ID.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The Active Directory Security Identifier for this user, if available.
     * </p>
     */
    private String sid;

    /**
     * <p>
     * The ID of the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The ID of the identity store.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The ID of the identity store.
     * </p>
     * 
     * @return The ID of the identity store.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The ID of the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The ID of the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileMembership withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * The persona.
     * </p>
     * 
     * @param persona
     *        The persona.
     * @see LaunchProfilePersona
     */

    public void setPersona(String persona) {
        this.persona = persona;
    }

    /**
     * <p>
     * The persona.
     * </p>
     * 
     * @return The persona.
     * @see LaunchProfilePersona
     */

    public String getPersona() {
        return this.persona;
    }

    /**
     * <p>
     * The persona.
     * </p>
     * 
     * @param persona
     *        The persona.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfilePersona
     */

    public LaunchProfileMembership withPersona(String persona) {
        setPersona(persona);
        return this;
    }

    /**
     * <p>
     * The persona.
     * </p>
     * 
     * @param persona
     *        The persona.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfilePersona
     */

    public LaunchProfileMembership withPersona(LaunchProfilePersona persona) {
        this.persona = persona.toString();
        return this;
    }

    /**
     * <p>
     * The principal ID.
     * </p>
     * 
     * @param principalId
     *        The principal ID.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The principal ID.
     * </p>
     * 
     * @return The principal ID.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The principal ID.
     * </p>
     * 
     * @param principalId
     *        The principal ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileMembership withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The Active Directory Security Identifier for this user, if available.
     * </p>
     * 
     * @param sid
     *        The Active Directory Security Identifier for this user, if available.
     */

    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * <p>
     * The Active Directory Security Identifier for this user, if available.
     * </p>
     * 
     * @return The Active Directory Security Identifier for this user, if available.
     */

    public String getSid() {
        return this.sid;
    }

    /**
     * <p>
     * The Active Directory Security Identifier for this user, if available.
     * </p>
     * 
     * @param sid
     *        The Active Directory Security Identifier for this user, if available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileMembership withSid(String sid) {
        setSid(sid);
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
        if (getIdentityStoreId() != null)
            sb.append("IdentityStoreId: ").append(getIdentityStoreId()).append(",");
        if (getPersona() != null)
            sb.append("Persona: ").append(getPersona()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getSid() != null)
            sb.append("Sid: ").append(getSid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchProfileMembership == false)
            return false;
        LaunchProfileMembership other = (LaunchProfileMembership) obj;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        if (other.getPersona() == null ^ this.getPersona() == null)
            return false;
        if (other.getPersona() != null && other.getPersona().equals(this.getPersona()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getSid() == null ^ this.getSid() == null)
            return false;
        if (other.getSid() != null && other.getSid().equals(this.getSid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        hashCode = prime * hashCode + ((getPersona() == null) ? 0 : getPersona().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getSid() == null) ? 0 : getSid().hashCode());
        return hashCode;
    }

    @Override
    public LaunchProfileMembership clone() {
        try {
            return (LaunchProfileMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.LaunchProfileMembershipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
