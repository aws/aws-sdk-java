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
 * Provides information on the specified section definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RegistrationSectionDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationSectionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     */
    private String sectionPath;
    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     */
    private RegistrationSectionDisplayHints displayHints;

    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     * 
     * @param sectionPath
     *        The path to the section of the registration.
     */

    public void setSectionPath(String sectionPath) {
        this.sectionPath = sectionPath;
    }

    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     * 
     * @return The path to the section of the registration.
     */

    public String getSectionPath() {
        return this.sectionPath;
    }

    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     * 
     * @param sectionPath
     *        The path to the section of the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationSectionDefinition withSectionPath(String sectionPath) {
        setSectionPath(sectionPath);
        return this;
    }

    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     * 
     * @param displayHints
     *        The path to the section of the registration.
     */

    public void setDisplayHints(RegistrationSectionDisplayHints displayHints) {
        this.displayHints = displayHints;
    }

    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     * 
     * @return The path to the section of the registration.
     */

    public RegistrationSectionDisplayHints getDisplayHints() {
        return this.displayHints;
    }

    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     * 
     * @param displayHints
     *        The path to the section of the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationSectionDefinition withDisplayHints(RegistrationSectionDisplayHints displayHints) {
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
        if (getSectionPath() != null)
            sb.append("SectionPath: ").append(getSectionPath()).append(",");
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

        if (obj instanceof RegistrationSectionDefinition == false)
            return false;
        RegistrationSectionDefinition other = (RegistrationSectionDefinition) obj;
        if (other.getSectionPath() == null ^ this.getSectionPath() == null)
            return false;
        if (other.getSectionPath() != null && other.getSectionPath().equals(this.getSectionPath()) == false)
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

        hashCode = prime * hashCode + ((getSectionPath() == null) ? 0 : getSectionPath().hashCode());
        hashCode = prime * hashCode + ((getDisplayHints() == null) ? 0 : getDisplayHints().hashCode());
        return hashCode;
    }

    @Override
    public RegistrationSectionDefinition clone() {
        try {
            return (RegistrationSectionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.RegistrationSectionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
