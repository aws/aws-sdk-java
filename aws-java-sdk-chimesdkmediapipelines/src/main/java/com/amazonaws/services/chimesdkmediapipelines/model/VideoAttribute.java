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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the settings for a video tile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/VideoAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets the corner radius of all video tiles.
     * </p>
     */
    private Integer cornerRadius;
    /**
     * <p>
     * Defines the border color of all video tiles.
     * </p>
     */
    private String borderColor;
    /**
     * <p>
     * Defines the highlight color for the active video tile.
     * </p>
     */
    private String highlightColor;
    /**
     * <p>
     * Defines the border thickness for all video tiles.
     * </p>
     */
    private Integer borderThickness;

    /**
     * <p>
     * Sets the corner radius of all video tiles.
     * </p>
     * 
     * @param cornerRadius
     *        Sets the corner radius of all video tiles.
     */

    public void setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    /**
     * <p>
     * Sets the corner radius of all video tiles.
     * </p>
     * 
     * @return Sets the corner radius of all video tiles.
     */

    public Integer getCornerRadius() {
        return this.cornerRadius;
    }

    /**
     * <p>
     * Sets the corner radius of all video tiles.
     * </p>
     * 
     * @param cornerRadius
     *        Sets the corner radius of all video tiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoAttribute withCornerRadius(Integer cornerRadius) {
        setCornerRadius(cornerRadius);
        return this;
    }

    /**
     * <p>
     * Defines the border color of all video tiles.
     * </p>
     * 
     * @param borderColor
     *        Defines the border color of all video tiles.
     * @see BorderColor
     */

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * <p>
     * Defines the border color of all video tiles.
     * </p>
     * 
     * @return Defines the border color of all video tiles.
     * @see BorderColor
     */

    public String getBorderColor() {
        return this.borderColor;
    }

    /**
     * <p>
     * Defines the border color of all video tiles.
     * </p>
     * 
     * @param borderColor
     *        Defines the border color of all video tiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BorderColor
     */

    public VideoAttribute withBorderColor(String borderColor) {
        setBorderColor(borderColor);
        return this;
    }

    /**
     * <p>
     * Defines the border color of all video tiles.
     * </p>
     * 
     * @param borderColor
     *        Defines the border color of all video tiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BorderColor
     */

    public VideoAttribute withBorderColor(BorderColor borderColor) {
        this.borderColor = borderColor.toString();
        return this;
    }

    /**
     * <p>
     * Defines the highlight color for the active video tile.
     * </p>
     * 
     * @param highlightColor
     *        Defines the highlight color for the active video tile.
     * @see HighlightColor
     */

    public void setHighlightColor(String highlightColor) {
        this.highlightColor = highlightColor;
    }

    /**
     * <p>
     * Defines the highlight color for the active video tile.
     * </p>
     * 
     * @return Defines the highlight color for the active video tile.
     * @see HighlightColor
     */

    public String getHighlightColor() {
        return this.highlightColor;
    }

    /**
     * <p>
     * Defines the highlight color for the active video tile.
     * </p>
     * 
     * @param highlightColor
     *        Defines the highlight color for the active video tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HighlightColor
     */

    public VideoAttribute withHighlightColor(String highlightColor) {
        setHighlightColor(highlightColor);
        return this;
    }

    /**
     * <p>
     * Defines the highlight color for the active video tile.
     * </p>
     * 
     * @param highlightColor
     *        Defines the highlight color for the active video tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HighlightColor
     */

    public VideoAttribute withHighlightColor(HighlightColor highlightColor) {
        this.highlightColor = highlightColor.toString();
        return this;
    }

    /**
     * <p>
     * Defines the border thickness for all video tiles.
     * </p>
     * 
     * @param borderThickness
     *        Defines the border thickness for all video tiles.
     */

    public void setBorderThickness(Integer borderThickness) {
        this.borderThickness = borderThickness;
    }

    /**
     * <p>
     * Defines the border thickness for all video tiles.
     * </p>
     * 
     * @return Defines the border thickness for all video tiles.
     */

    public Integer getBorderThickness() {
        return this.borderThickness;
    }

    /**
     * <p>
     * Defines the border thickness for all video tiles.
     * </p>
     * 
     * @param borderThickness
     *        Defines the border thickness for all video tiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoAttribute withBorderThickness(Integer borderThickness) {
        setBorderThickness(borderThickness);
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
        if (getCornerRadius() != null)
            sb.append("CornerRadius: ").append(getCornerRadius()).append(",");
        if (getBorderColor() != null)
            sb.append("BorderColor: ").append(getBorderColor()).append(",");
        if (getHighlightColor() != null)
            sb.append("HighlightColor: ").append(getHighlightColor()).append(",");
        if (getBorderThickness() != null)
            sb.append("BorderThickness: ").append(getBorderThickness());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoAttribute == false)
            return false;
        VideoAttribute other = (VideoAttribute) obj;
        if (other.getCornerRadius() == null ^ this.getCornerRadius() == null)
            return false;
        if (other.getCornerRadius() != null && other.getCornerRadius().equals(this.getCornerRadius()) == false)
            return false;
        if (other.getBorderColor() == null ^ this.getBorderColor() == null)
            return false;
        if (other.getBorderColor() != null && other.getBorderColor().equals(this.getBorderColor()) == false)
            return false;
        if (other.getHighlightColor() == null ^ this.getHighlightColor() == null)
            return false;
        if (other.getHighlightColor() != null && other.getHighlightColor().equals(this.getHighlightColor()) == false)
            return false;
        if (other.getBorderThickness() == null ^ this.getBorderThickness() == null)
            return false;
        if (other.getBorderThickness() != null && other.getBorderThickness().equals(this.getBorderThickness()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCornerRadius() == null) ? 0 : getCornerRadius().hashCode());
        hashCode = prime * hashCode + ((getBorderColor() == null) ? 0 : getBorderColor().hashCode());
        hashCode = prime * hashCode + ((getHighlightColor() == null) ? 0 : getHighlightColor().hashCode());
        hashCode = prime * hashCode + ((getBorderThickness() == null) ? 0 : getBorderThickness().hashCode());
        return hashCode;
    }

    @Override
    public VideoAttribute clone() {
        try {
            return (VideoAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.VideoAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
