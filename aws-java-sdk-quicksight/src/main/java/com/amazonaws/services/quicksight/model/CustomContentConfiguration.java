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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of a <code>CustomContentVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CustomContentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomContentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The input URL that links to the custom content that you want in the custom visual.
     * </p>
     */
    private String contentUrl;
    /**
     * <p>
     * The content type of the custom content visual. You can use this to have the visual render as an image.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The sizing options for the size of the custom content visual. This structure is required when the
     * <code>ContentType</code> of the visual is <code>'IMAGE'</code>.
     * </p>
     */
    private String imageScaling;

    /**
     * <p>
     * The input URL that links to the custom content that you want in the custom visual.
     * </p>
     * 
     * @param contentUrl
     *        The input URL that links to the custom content that you want in the custom visual.
     */

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    /**
     * <p>
     * The input URL that links to the custom content that you want in the custom visual.
     * </p>
     * 
     * @return The input URL that links to the custom content that you want in the custom visual.
     */

    public String getContentUrl() {
        return this.contentUrl;
    }

    /**
     * <p>
     * The input URL that links to the custom content that you want in the custom visual.
     * </p>
     * 
     * @param contentUrl
     *        The input URL that links to the custom content that you want in the custom visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomContentConfiguration withContentUrl(String contentUrl) {
        setContentUrl(contentUrl);
        return this;
    }

    /**
     * <p>
     * The content type of the custom content visual. You can use this to have the visual render as an image.
     * </p>
     * 
     * @param contentType
     *        The content type of the custom content visual. You can use this to have the visual render as an image.
     * @see CustomContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the custom content visual. You can use this to have the visual render as an image.
     * </p>
     * 
     * @return The content type of the custom content visual. You can use this to have the visual render as an image.
     * @see CustomContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the custom content visual. You can use this to have the visual render as an image.
     * </p>
     * 
     * @param contentType
     *        The content type of the custom content visual. You can use this to have the visual render as an image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomContentType
     */

    public CustomContentConfiguration withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The content type of the custom content visual. You can use this to have the visual render as an image.
     * </p>
     * 
     * @param contentType
     *        The content type of the custom content visual. You can use this to have the visual render as an image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomContentType
     */

    public CustomContentConfiguration withContentType(CustomContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * The sizing options for the size of the custom content visual. This structure is required when the
     * <code>ContentType</code> of the visual is <code>'IMAGE'</code>.
     * </p>
     * 
     * @param imageScaling
     *        The sizing options for the size of the custom content visual. This structure is required when the
     *        <code>ContentType</code> of the visual is <code>'IMAGE'</code>.
     * @see CustomContentImageScalingConfiguration
     */

    public void setImageScaling(String imageScaling) {
        this.imageScaling = imageScaling;
    }

    /**
     * <p>
     * The sizing options for the size of the custom content visual. This structure is required when the
     * <code>ContentType</code> of the visual is <code>'IMAGE'</code>.
     * </p>
     * 
     * @return The sizing options for the size of the custom content visual. This structure is required when the
     *         <code>ContentType</code> of the visual is <code>'IMAGE'</code>.
     * @see CustomContentImageScalingConfiguration
     */

    public String getImageScaling() {
        return this.imageScaling;
    }

    /**
     * <p>
     * The sizing options for the size of the custom content visual. This structure is required when the
     * <code>ContentType</code> of the visual is <code>'IMAGE'</code>.
     * </p>
     * 
     * @param imageScaling
     *        The sizing options for the size of the custom content visual. This structure is required when the
     *        <code>ContentType</code> of the visual is <code>'IMAGE'</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomContentImageScalingConfiguration
     */

    public CustomContentConfiguration withImageScaling(String imageScaling) {
        setImageScaling(imageScaling);
        return this;
    }

    /**
     * <p>
     * The sizing options for the size of the custom content visual. This structure is required when the
     * <code>ContentType</code> of the visual is <code>'IMAGE'</code>.
     * </p>
     * 
     * @param imageScaling
     *        The sizing options for the size of the custom content visual. This structure is required when the
     *        <code>ContentType</code> of the visual is <code>'IMAGE'</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomContentImageScalingConfiguration
     */

    public CustomContentConfiguration withImageScaling(CustomContentImageScalingConfiguration imageScaling) {
        this.imageScaling = imageScaling.toString();
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
        if (getContentUrl() != null)
            sb.append("ContentUrl: ").append(getContentUrl()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getImageScaling() != null)
            sb.append("ImageScaling: ").append(getImageScaling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomContentConfiguration == false)
            return false;
        CustomContentConfiguration other = (CustomContentConfiguration) obj;
        if (other.getContentUrl() == null ^ this.getContentUrl() == null)
            return false;
        if (other.getContentUrl() != null && other.getContentUrl().equals(this.getContentUrl()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getImageScaling() == null ^ this.getImageScaling() == null)
            return false;
        if (other.getImageScaling() != null && other.getImageScaling().equals(this.getImageScaling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentUrl() == null) ? 0 : getContentUrl().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getImageScaling() == null) ? 0 : getImageScaling().hashCode());
        return hashCode;
    }

    @Override
    public CustomContentConfiguration clone() {
        try {
            return (CustomContentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CustomContentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
