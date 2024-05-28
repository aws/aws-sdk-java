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
 * Provides the reason a registration was rejected.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RegistrationDeniedReasonInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationDeniedReasonInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reason a registration was rejected.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * A short description of the rejection reason.
     * </p>
     */
    private String shortDescription;
    /**
     * <p>
     * A long description of the rejection reason.
     * </p>
     */
    private String longDescription;
    /**
     * <p>
     * The title of the document.
     * </p>
     */
    private String documentationTitle;
    /**
     * <p>
     * The link to the document.
     * </p>
     */
    private String documentationLink;

    /**
     * <p>
     * The reason a registration was rejected.
     * </p>
     * 
     * @param reason
     *        The reason a registration was rejected.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason a registration was rejected.
     * </p>
     * 
     * @return The reason a registration was rejected.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason a registration was rejected.
     * </p>
     * 
     * @param reason
     *        The reason a registration was rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationDeniedReasonInformation withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A short description of the rejection reason.
     * </p>
     * 
     * @param shortDescription
     *        A short description of the rejection reason.
     */

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * <p>
     * A short description of the rejection reason.
     * </p>
     * 
     * @return A short description of the rejection reason.
     */

    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * <p>
     * A short description of the rejection reason.
     * </p>
     * 
     * @param shortDescription
     *        A short description of the rejection reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationDeniedReasonInformation withShortDescription(String shortDescription) {
        setShortDescription(shortDescription);
        return this;
    }

    /**
     * <p>
     * A long description of the rejection reason.
     * </p>
     * 
     * @param longDescription
     *        A long description of the rejection reason.
     */

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * <p>
     * A long description of the rejection reason.
     * </p>
     * 
     * @return A long description of the rejection reason.
     */

    public String getLongDescription() {
        return this.longDescription;
    }

    /**
     * <p>
     * A long description of the rejection reason.
     * </p>
     * 
     * @param longDescription
     *        A long description of the rejection reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationDeniedReasonInformation withLongDescription(String longDescription) {
        setLongDescription(longDescription);
        return this;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @param documentationTitle
     *        The title of the document.
     */

    public void setDocumentationTitle(String documentationTitle) {
        this.documentationTitle = documentationTitle;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @return The title of the document.
     */

    public String getDocumentationTitle() {
        return this.documentationTitle;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @param documentationTitle
     *        The title of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationDeniedReasonInformation withDocumentationTitle(String documentationTitle) {
        setDocumentationTitle(documentationTitle);
        return this;
    }

    /**
     * <p>
     * The link to the document.
     * </p>
     * 
     * @param documentationLink
     *        The link to the document.
     */

    public void setDocumentationLink(String documentationLink) {
        this.documentationLink = documentationLink;
    }

    /**
     * <p>
     * The link to the document.
     * </p>
     * 
     * @return The link to the document.
     */

    public String getDocumentationLink() {
        return this.documentationLink;
    }

    /**
     * <p>
     * The link to the document.
     * </p>
     * 
     * @param documentationLink
     *        The link to the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationDeniedReasonInformation withDocumentationLink(String documentationLink) {
        setDocumentationLink(documentationLink);
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getShortDescription() != null)
            sb.append("ShortDescription: ").append(getShortDescription()).append(",");
        if (getLongDescription() != null)
            sb.append("LongDescription: ").append(getLongDescription()).append(",");
        if (getDocumentationTitle() != null)
            sb.append("DocumentationTitle: ").append(getDocumentationTitle()).append(",");
        if (getDocumentationLink() != null)
            sb.append("DocumentationLink: ").append(getDocumentationLink());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistrationDeniedReasonInformation == false)
            return false;
        RegistrationDeniedReasonInformation other = (RegistrationDeniedReasonInformation) obj;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getShortDescription() == null ^ this.getShortDescription() == null)
            return false;
        if (other.getShortDescription() != null && other.getShortDescription().equals(this.getShortDescription()) == false)
            return false;
        if (other.getLongDescription() == null ^ this.getLongDescription() == null)
            return false;
        if (other.getLongDescription() != null && other.getLongDescription().equals(this.getLongDescription()) == false)
            return false;
        if (other.getDocumentationTitle() == null ^ this.getDocumentationTitle() == null)
            return false;
        if (other.getDocumentationTitle() != null && other.getDocumentationTitle().equals(this.getDocumentationTitle()) == false)
            return false;
        if (other.getDocumentationLink() == null ^ this.getDocumentationLink() == null)
            return false;
        if (other.getDocumentationLink() != null && other.getDocumentationLink().equals(this.getDocumentationLink()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getShortDescription() == null) ? 0 : getShortDescription().hashCode());
        hashCode = prime * hashCode + ((getLongDescription() == null) ? 0 : getLongDescription().hashCode());
        hashCode = prime * hashCode + ((getDocumentationTitle() == null) ? 0 : getDocumentationTitle().hashCode());
        hashCode = prime * hashCode + ((getDocumentationLink() == null) ? 0 : getDocumentationLink().hashCode());
        return hashCode;
    }

    @Override
    public RegistrationDeniedReasonInformation clone() {
        try {
            return (RegistrationDeniedReasonInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.RegistrationDeniedReasonInformationMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
