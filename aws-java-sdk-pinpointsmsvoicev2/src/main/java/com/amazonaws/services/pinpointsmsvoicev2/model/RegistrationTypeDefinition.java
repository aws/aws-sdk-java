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
 * Provides information on the supported registration type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RegistrationTypeDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationTypeDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of registration form. The list of <b>RegistrationTypes</b> can be found using the
     * <a>DescribeRegistrationTypeDefinitions</a> action.
     * </p>
     */
    private String registrationType;
    /**
     * <p>
     * The supported association behavior for the registration type.
     * </p>
     */
    private java.util.List<SupportedAssociation> supportedAssociations;
    /**
     * <p>
     * Provides help information on the registration.
     * </p>
     */
    private RegistrationTypeDisplayHints displayHints;

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

    public RegistrationTypeDefinition withRegistrationType(String registrationType) {
        setRegistrationType(registrationType);
        return this;
    }

    /**
     * <p>
     * The supported association behavior for the registration type.
     * </p>
     * 
     * @return The supported association behavior for the registration type.
     */

    public java.util.List<SupportedAssociation> getSupportedAssociations() {
        return supportedAssociations;
    }

    /**
     * <p>
     * The supported association behavior for the registration type.
     * </p>
     * 
     * @param supportedAssociations
     *        The supported association behavior for the registration type.
     */

    public void setSupportedAssociations(java.util.Collection<SupportedAssociation> supportedAssociations) {
        if (supportedAssociations == null) {
            this.supportedAssociations = null;
            return;
        }

        this.supportedAssociations = new java.util.ArrayList<SupportedAssociation>(supportedAssociations);
    }

    /**
     * <p>
     * The supported association behavior for the registration type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedAssociations(java.util.Collection)} or
     * {@link #withSupportedAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedAssociations
     *        The supported association behavior for the registration type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationTypeDefinition withSupportedAssociations(SupportedAssociation... supportedAssociations) {
        if (this.supportedAssociations == null) {
            setSupportedAssociations(new java.util.ArrayList<SupportedAssociation>(supportedAssociations.length));
        }
        for (SupportedAssociation ele : supportedAssociations) {
            this.supportedAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported association behavior for the registration type.
     * </p>
     * 
     * @param supportedAssociations
     *        The supported association behavior for the registration type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationTypeDefinition withSupportedAssociations(java.util.Collection<SupportedAssociation> supportedAssociations) {
        setSupportedAssociations(supportedAssociations);
        return this;
    }

    /**
     * <p>
     * Provides help information on the registration.
     * </p>
     * 
     * @param displayHints
     *        Provides help information on the registration.
     */

    public void setDisplayHints(RegistrationTypeDisplayHints displayHints) {
        this.displayHints = displayHints;
    }

    /**
     * <p>
     * Provides help information on the registration.
     * </p>
     * 
     * @return Provides help information on the registration.
     */

    public RegistrationTypeDisplayHints getDisplayHints() {
        return this.displayHints;
    }

    /**
     * <p>
     * Provides help information on the registration.
     * </p>
     * 
     * @param displayHints
     *        Provides help information on the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationTypeDefinition withDisplayHints(RegistrationTypeDisplayHints displayHints) {
        setDisplayHints(displayHints);
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
        if (getRegistrationType() != null)
            sb.append("RegistrationType: ").append(getRegistrationType()).append(",");
        if (getSupportedAssociations() != null)
            sb.append("SupportedAssociations: ").append(getSupportedAssociations()).append(",");
        if (getDisplayHints() != null)
            sb.append("DisplayHints: ").append(getDisplayHints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistrationTypeDefinition == false)
            return false;
        RegistrationTypeDefinition other = (RegistrationTypeDefinition) obj;
        if (other.getRegistrationType() == null ^ this.getRegistrationType() == null)
            return false;
        if (other.getRegistrationType() != null && other.getRegistrationType().equals(this.getRegistrationType()) == false)
            return false;
        if (other.getSupportedAssociations() == null ^ this.getSupportedAssociations() == null)
            return false;
        if (other.getSupportedAssociations() != null && other.getSupportedAssociations().equals(this.getSupportedAssociations()) == false)
            return false;
        if (other.getDisplayHints() == null ^ this.getDisplayHints() == null)
            return false;
        if (other.getDisplayHints() != null && other.getDisplayHints().equals(this.getDisplayHints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationType() == null) ? 0 : getRegistrationType().hashCode());
        hashCode = prime * hashCode + ((getSupportedAssociations() == null) ? 0 : getSupportedAssociations().hashCode());
        hashCode = prime * hashCode + ((getDisplayHints() == null) ? 0 : getDisplayHints().hashCode());
        return hashCode;
    }

    @Override
    public RegistrationTypeDefinition clone() {
        try {
            return (RegistrationTypeDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.RegistrationTypeDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
