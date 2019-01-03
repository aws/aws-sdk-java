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
 * The configuration for a field-level encryption content type-profile mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ContentTypeProfileConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentTypeProfileConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The setting in a field-level encryption content type-profile mapping that specifies what to do when an unknown
     * content type is provided for the profile. If true, content is forwarded without being encrypted when the content
     * type is unknown. If false (the default), an error is returned when the content type is unknown.
     * </p>
     */
    private Boolean forwardWhenContentTypeIsUnknown;
    /**
     * <p>
     * The configuration for a field-level encryption content type-profile.
     * </p>
     */
    private ContentTypeProfiles contentTypeProfiles;

    /**
     * <p>
     * The setting in a field-level encryption content type-profile mapping that specifies what to do when an unknown
     * content type is provided for the profile. If true, content is forwarded without being encrypted when the content
     * type is unknown. If false (the default), an error is returned when the content type is unknown.
     * </p>
     * 
     * @param forwardWhenContentTypeIsUnknown
     *        The setting in a field-level encryption content type-profile mapping that specifies what to do when an
     *        unknown content type is provided for the profile. If true, content is forwarded without being encrypted
     *        when the content type is unknown. If false (the default), an error is returned when the content type is
     *        unknown.
     */

    public void setForwardWhenContentTypeIsUnknown(Boolean forwardWhenContentTypeIsUnknown) {
        this.forwardWhenContentTypeIsUnknown = forwardWhenContentTypeIsUnknown;
    }

    /**
     * <p>
     * The setting in a field-level encryption content type-profile mapping that specifies what to do when an unknown
     * content type is provided for the profile. If true, content is forwarded without being encrypted when the content
     * type is unknown. If false (the default), an error is returned when the content type is unknown.
     * </p>
     * 
     * @return The setting in a field-level encryption content type-profile mapping that specifies what to do when an
     *         unknown content type is provided for the profile. If true, content is forwarded without being encrypted
     *         when the content type is unknown. If false (the default), an error is returned when the content type is
     *         unknown.
     */

    public Boolean getForwardWhenContentTypeIsUnknown() {
        return this.forwardWhenContentTypeIsUnknown;
    }

    /**
     * <p>
     * The setting in a field-level encryption content type-profile mapping that specifies what to do when an unknown
     * content type is provided for the profile. If true, content is forwarded without being encrypted when the content
     * type is unknown. If false (the default), an error is returned when the content type is unknown.
     * </p>
     * 
     * @param forwardWhenContentTypeIsUnknown
     *        The setting in a field-level encryption content type-profile mapping that specifies what to do when an
     *        unknown content type is provided for the profile. If true, content is forwarded without being encrypted
     *        when the content type is unknown. If false (the default), an error is returned when the content type is
     *        unknown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentTypeProfileConfig withForwardWhenContentTypeIsUnknown(Boolean forwardWhenContentTypeIsUnknown) {
        setForwardWhenContentTypeIsUnknown(forwardWhenContentTypeIsUnknown);
        return this;
    }

    /**
     * <p>
     * The setting in a field-level encryption content type-profile mapping that specifies what to do when an unknown
     * content type is provided for the profile. If true, content is forwarded without being encrypted when the content
     * type is unknown. If false (the default), an error is returned when the content type is unknown.
     * </p>
     * 
     * @return The setting in a field-level encryption content type-profile mapping that specifies what to do when an
     *         unknown content type is provided for the profile. If true, content is forwarded without being encrypted
     *         when the content type is unknown. If false (the default), an error is returned when the content type is
     *         unknown.
     */

    public Boolean isForwardWhenContentTypeIsUnknown() {
        return this.forwardWhenContentTypeIsUnknown;
    }

    /**
     * <p>
     * The configuration for a field-level encryption content type-profile.
     * </p>
     * 
     * @param contentTypeProfiles
     *        The configuration for a field-level encryption content type-profile.
     */

    public void setContentTypeProfiles(ContentTypeProfiles contentTypeProfiles) {
        this.contentTypeProfiles = contentTypeProfiles;
    }

    /**
     * <p>
     * The configuration for a field-level encryption content type-profile.
     * </p>
     * 
     * @return The configuration for a field-level encryption content type-profile.
     */

    public ContentTypeProfiles getContentTypeProfiles() {
        return this.contentTypeProfiles;
    }

    /**
     * <p>
     * The configuration for a field-level encryption content type-profile.
     * </p>
     * 
     * @param contentTypeProfiles
     *        The configuration for a field-level encryption content type-profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentTypeProfileConfig withContentTypeProfiles(ContentTypeProfiles contentTypeProfiles) {
        setContentTypeProfiles(contentTypeProfiles);
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
        if (getForwardWhenContentTypeIsUnknown() != null)
            sb.append("ForwardWhenContentTypeIsUnknown: ").append(getForwardWhenContentTypeIsUnknown()).append(",");
        if (getContentTypeProfiles() != null)
            sb.append("ContentTypeProfiles: ").append(getContentTypeProfiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentTypeProfileConfig == false)
            return false;
        ContentTypeProfileConfig other = (ContentTypeProfileConfig) obj;
        if (other.getForwardWhenContentTypeIsUnknown() == null ^ this.getForwardWhenContentTypeIsUnknown() == null)
            return false;
        if (other.getForwardWhenContentTypeIsUnknown() != null
                && other.getForwardWhenContentTypeIsUnknown().equals(this.getForwardWhenContentTypeIsUnknown()) == false)
            return false;
        if (other.getContentTypeProfiles() == null ^ this.getContentTypeProfiles() == null)
            return false;
        if (other.getContentTypeProfiles() != null && other.getContentTypeProfiles().equals(this.getContentTypeProfiles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForwardWhenContentTypeIsUnknown() == null) ? 0 : getForwardWhenContentTypeIsUnknown().hashCode());
        hashCode = prime * hashCode + ((getContentTypeProfiles() == null) ? 0 : getContentTypeProfiles().hashCode());
        return hashCode;
    }

    @Override
    public ContentTypeProfileConfig clone() {
        try {
            return (ContentTypeProfileConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
