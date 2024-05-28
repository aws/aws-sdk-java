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
 * Provides help information on the registration type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RegistrationTypeDisplayHints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationTypeDisplayHints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The title of the display hint.
     * </p>
     */
    private String title;
    /**
     * <p>
     * A short description of the display hint.
     * </p>
     */
    private String shortDescription;
    /**
     * <p>
     * A full description of the display hint.
     * </p>
     */
    private String longDescription;
    /**
     * <p>
     * The title of the document the display hint is associated with.
     * </p>
     */
    private String documentationTitle;
    /**
     * <p>
     * The link to the document the display hint is associated with.
     * </p>
     */
    private String documentationLink;

    /**
     * <p>
     * The title of the display hint.
     * </p>
     * 
     * @param title
     *        The title of the display hint.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the display hint.
     * </p>
     * 
     * @return The title of the display hint.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the display hint.
     * </p>
     * 
     * @param title
     *        The title of the display hint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationTypeDisplayHints withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * A short description of the display hint.
     * </p>
     * 
     * @param shortDescription
     *        A short description of the display hint.
     */

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * <p>
     * A short description of the display hint.
     * </p>
     * 
     * @return A short description of the display hint.
     */

    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * <p>
     * A short description of the display hint.
     * </p>
     * 
     * @param shortDescription
     *        A short description of the display hint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationTypeDisplayHints withShortDescription(String shortDescription) {
        setShortDescription(shortDescription);
        return this;
    }

    /**
     * <p>
     * A full description of the display hint.
     * </p>
     * 
     * @param longDescription
     *        A full description of the display hint.
     */

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * <p>
     * A full description of the display hint.
     * </p>
     * 
     * @return A full description of the display hint.
     */

    public String getLongDescription() {
        return this.longDescription;
    }

    /**
     * <p>
     * A full description of the display hint.
     * </p>
     * 
     * @param longDescription
     *        A full description of the display hint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationTypeDisplayHints withLongDescription(String longDescription) {
        setLongDescription(longDescription);
        return this;
    }

    /**
     * <p>
     * The title of the document the display hint is associated with.
     * </p>
     * 
     * @param documentationTitle
     *        The title of the document the display hint is associated with.
     */

    public void setDocumentationTitle(String documentationTitle) {
        this.documentationTitle = documentationTitle;
    }

    /**
     * <p>
     * The title of the document the display hint is associated with.
     * </p>
     * 
     * @return The title of the document the display hint is associated with.
     */

    public String getDocumentationTitle() {
        return this.documentationTitle;
    }

    /**
     * <p>
     * The title of the document the display hint is associated with.
     * </p>
     * 
     * @param documentationTitle
     *        The title of the document the display hint is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationTypeDisplayHints withDocumentationTitle(String documentationTitle) {
        setDocumentationTitle(documentationTitle);
        return this;
    }

    /**
     * <p>
     * The link to the document the display hint is associated with.
     * </p>
     * 
     * @param documentationLink
     *        The link to the document the display hint is associated with.
     */

    public void setDocumentationLink(String documentationLink) {
        this.documentationLink = documentationLink;
    }

    /**
     * <p>
     * The link to the document the display hint is associated with.
     * </p>
     * 
     * @return The link to the document the display hint is associated with.
     */

    public String getDocumentationLink() {
        return this.documentationLink;
    }

    /**
     * <p>
     * The link to the document the display hint is associated with.
     * </p>
     * 
     * @param documentationLink
     *        The link to the document the display hint is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationTypeDisplayHints withDocumentationLink(String documentationLink) {
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
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

        if (obj instanceof RegistrationTypeDisplayHints == false)
            return false;
        RegistrationTypeDisplayHints other = (RegistrationTypeDisplayHints) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
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

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getShortDescription() == null) ? 0 : getShortDescription().hashCode());
        hashCode = prime * hashCode + ((getLongDescription() == null) ? 0 : getLongDescription().hashCode());
        hashCode = prime * hashCode + ((getDocumentationTitle() == null) ? 0 : getDocumentationTitle().hashCode());
        hashCode = prime * hashCode + ((getDocumentationLink() == null) ? 0 : getDocumentationLink().hashCode());
        return hashCode;
    }

    @Override
    public RegistrationTypeDisplayHints clone() {
        try {
            return (RegistrationTypeDisplayHints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.RegistrationTypeDisplayHintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
