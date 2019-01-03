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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A field-level encryption content type profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ContentTypeProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentTypeProfile implements Serializable, Cloneable {

    /**
     * <p>
     * The format for a field-level encryption content type-profile mapping.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The profile ID for a field-level encryption content type-profile mapping.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * The content type for a field-level encryption content type-profile mapping.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The format for a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @param format
     *        The format for a field-level encryption content type-profile mapping.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format for a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @return The format for a field-level encryption content type-profile mapping.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format for a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @param format
     *        The format for a field-level encryption content type-profile mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public ContentTypeProfile withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format for a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @param format
     *        The format for a field-level encryption content type-profile mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public ContentTypeProfile withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The profile ID for a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @param profileId
     *        The profile ID for a field-level encryption content type-profile mapping.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * The profile ID for a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @return The profile ID for a field-level encryption content type-profile mapping.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * The profile ID for a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @param profileId
     *        The profile ID for a field-level encryption content type-profile mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentTypeProfile withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * The content type for a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @param contentType
     *        The content type for a field-level encryption content type-profile mapping.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type for a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @return The content type for a field-level encryption content type-profile mapping.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type for a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @param contentType
     *        The content type for a field-level encryption content type-profile mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentTypeProfile withContentType(String contentType) {
        setContentType(contentType);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentTypeProfile == false)
            return false;
        ContentTypeProfile other = (ContentTypeProfile) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public ContentTypeProfile clone() {
        try {
            return (ContentTypeProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
