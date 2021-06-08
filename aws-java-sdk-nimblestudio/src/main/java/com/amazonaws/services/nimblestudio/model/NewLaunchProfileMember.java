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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/NewLaunchProfileMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewLaunchProfileMember implements Serializable, Cloneable, StructuredPojo {

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

    public NewLaunchProfileMember withPersona(String persona) {
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

    public NewLaunchProfileMember withPersona(LaunchProfilePersona persona) {
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

    public NewLaunchProfileMember withPrincipalId(String principalId) {
        setPrincipalId(principalId);
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
        if (getPersona() != null)
            sb.append("Persona: ").append(getPersona()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewLaunchProfileMember == false)
            return false;
        NewLaunchProfileMember other = (NewLaunchProfileMember) obj;
        if (other.getPersona() == null ^ this.getPersona() == null)
            return false;
        if (other.getPersona() != null && other.getPersona().equals(this.getPersona()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPersona() == null) ? 0 : getPersona().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        return hashCode;
    }

    @Override
    public NewLaunchProfileMember clone() {
        try {
            return (NewLaunchProfileMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.NewLaunchProfileMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
