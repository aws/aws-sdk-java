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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Specifies a particular video stream within an input source. An input may have only a single video selector.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/VideoSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specifies the colorspace of an input. This setting works in tandem with colorSpaceConversion to determine if any
     * conversion will be performed.
     */
    private String colorSpace;
    /**
     * Applies only if colorSpace is a value other than follow. This field controls how the value in the colorSpace
     * field will be used. fallback means that when the input does include color space data, that data will be used, but
     * when the input has no color space data, the value in colorSpace will be used. Choose fallback if your input is
     * sometimes missing color space data, but when it does have color space data, that data is correct. force means to
     * always use the value in colorSpace. Choose force if your input usually has no color space data or might have
     * unreliable color space data.
     */
    private String colorSpaceUsage;
    /** The video selector settings. */
    private VideoSelectorSettings selectorSettings;

    /**
     * Specifies the colorspace of an input. This setting works in tandem with colorSpaceConversion to determine if any
     * conversion will be performed.
     * 
     * @param colorSpace
     *        Specifies the colorspace of an input. This setting works in tandem with colorSpaceConversion to determine
     *        if any conversion will be performed.
     * @see VideoSelectorColorSpace
     */

    public void setColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
    }

    /**
     * Specifies the colorspace of an input. This setting works in tandem with colorSpaceConversion to determine if any
     * conversion will be performed.
     * 
     * @return Specifies the colorspace of an input. This setting works in tandem with colorSpaceConversion to determine
     *         if any conversion will be performed.
     * @see VideoSelectorColorSpace
     */

    public String getColorSpace() {
        return this.colorSpace;
    }

    /**
     * Specifies the colorspace of an input. This setting works in tandem with colorSpaceConversion to determine if any
     * conversion will be performed.
     * 
     * @param colorSpace
     *        Specifies the colorspace of an input. This setting works in tandem with colorSpaceConversion to determine
     *        if any conversion will be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoSelectorColorSpace
     */

    public VideoSelector withColorSpace(String colorSpace) {
        setColorSpace(colorSpace);
        return this;
    }

    /**
     * Specifies the colorspace of an input. This setting works in tandem with colorSpaceConversion to determine if any
     * conversion will be performed.
     * 
     * @param colorSpace
     *        Specifies the colorspace of an input. This setting works in tandem with colorSpaceConversion to determine
     *        if any conversion will be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoSelectorColorSpace
     */

    public VideoSelector withColorSpace(VideoSelectorColorSpace colorSpace) {
        this.colorSpace = colorSpace.toString();
        return this;
    }

    /**
     * Applies only if colorSpace is a value other than follow. This field controls how the value in the colorSpace
     * field will be used. fallback means that when the input does include color space data, that data will be used, but
     * when the input has no color space data, the value in colorSpace will be used. Choose fallback if your input is
     * sometimes missing color space data, but when it does have color space data, that data is correct. force means to
     * always use the value in colorSpace. Choose force if your input usually has no color space data or might have
     * unreliable color space data.
     * 
     * @param colorSpaceUsage
     *        Applies only if colorSpace is a value other than follow. This field controls how the value in the
     *        colorSpace field will be used. fallback means that when the input does include color space data, that data
     *        will be used, but when the input has no color space data, the value in colorSpace will be used. Choose
     *        fallback if your input is sometimes missing color space data, but when it does have color space data, that
     *        data is correct. force means to always use the value in colorSpace. Choose force if your input usually has
     *        no color space data or might have unreliable color space data.
     * @see VideoSelectorColorSpaceUsage
     */

    public void setColorSpaceUsage(String colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage;
    }

    /**
     * Applies only if colorSpace is a value other than follow. This field controls how the value in the colorSpace
     * field will be used. fallback means that when the input does include color space data, that data will be used, but
     * when the input has no color space data, the value in colorSpace will be used. Choose fallback if your input is
     * sometimes missing color space data, but when it does have color space data, that data is correct. force means to
     * always use the value in colorSpace. Choose force if your input usually has no color space data or might have
     * unreliable color space data.
     * 
     * @return Applies only if colorSpace is a value other than follow. This field controls how the value in the
     *         colorSpace field will be used. fallback means that when the input does include color space data, that
     *         data will be used, but when the input has no color space data, the value in colorSpace will be used.
     *         Choose fallback if your input is sometimes missing color space data, but when it does have color space
     *         data, that data is correct. force means to always use the value in colorSpace. Choose force if your input
     *         usually has no color space data or might have unreliable color space data.
     * @see VideoSelectorColorSpaceUsage
     */

    public String getColorSpaceUsage() {
        return this.colorSpaceUsage;
    }

    /**
     * Applies only if colorSpace is a value other than follow. This field controls how the value in the colorSpace
     * field will be used. fallback means that when the input does include color space data, that data will be used, but
     * when the input has no color space data, the value in colorSpace will be used. Choose fallback if your input is
     * sometimes missing color space data, but when it does have color space data, that data is correct. force means to
     * always use the value in colorSpace. Choose force if your input usually has no color space data or might have
     * unreliable color space data.
     * 
     * @param colorSpaceUsage
     *        Applies only if colorSpace is a value other than follow. This field controls how the value in the
     *        colorSpace field will be used. fallback means that when the input does include color space data, that data
     *        will be used, but when the input has no color space data, the value in colorSpace will be used. Choose
     *        fallback if your input is sometimes missing color space data, but when it does have color space data, that
     *        data is correct. force means to always use the value in colorSpace. Choose force if your input usually has
     *        no color space data or might have unreliable color space data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoSelectorColorSpaceUsage
     */

    public VideoSelector withColorSpaceUsage(String colorSpaceUsage) {
        setColorSpaceUsage(colorSpaceUsage);
        return this;
    }

    /**
     * Applies only if colorSpace is a value other than follow. This field controls how the value in the colorSpace
     * field will be used. fallback means that when the input does include color space data, that data will be used, but
     * when the input has no color space data, the value in colorSpace will be used. Choose fallback if your input is
     * sometimes missing color space data, but when it does have color space data, that data is correct. force means to
     * always use the value in colorSpace. Choose force if your input usually has no color space data or might have
     * unreliable color space data.
     * 
     * @param colorSpaceUsage
     *        Applies only if colorSpace is a value other than follow. This field controls how the value in the
     *        colorSpace field will be used. fallback means that when the input does include color space data, that data
     *        will be used, but when the input has no color space data, the value in colorSpace will be used. Choose
     *        fallback if your input is sometimes missing color space data, but when it does have color space data, that
     *        data is correct. force means to always use the value in colorSpace. Choose force if your input usually has
     *        no color space data or might have unreliable color space data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoSelectorColorSpaceUsage
     */

    public VideoSelector withColorSpaceUsage(VideoSelectorColorSpaceUsage colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage.toString();
        return this;
    }

    /**
     * The video selector settings.
     * 
     * @param selectorSettings
     *        The video selector settings.
     */

    public void setSelectorSettings(VideoSelectorSettings selectorSettings) {
        this.selectorSettings = selectorSettings;
    }

    /**
     * The video selector settings.
     * 
     * @return The video selector settings.
     */

    public VideoSelectorSettings getSelectorSettings() {
        return this.selectorSettings;
    }

    /**
     * The video selector settings.
     * 
     * @param selectorSettings
     *        The video selector settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoSelector withSelectorSettings(VideoSelectorSettings selectorSettings) {
        setSelectorSettings(selectorSettings);
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
        if (getColorSpace() != null)
            sb.append("ColorSpace: ").append(getColorSpace()).append(",");
        if (getColorSpaceUsage() != null)
            sb.append("ColorSpaceUsage: ").append(getColorSpaceUsage()).append(",");
        if (getSelectorSettings() != null)
            sb.append("SelectorSettings: ").append(getSelectorSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoSelector == false)
            return false;
        VideoSelector other = (VideoSelector) obj;
        if (other.getColorSpace() == null ^ this.getColorSpace() == null)
            return false;
        if (other.getColorSpace() != null && other.getColorSpace().equals(this.getColorSpace()) == false)
            return false;
        if (other.getColorSpaceUsage() == null ^ this.getColorSpaceUsage() == null)
            return false;
        if (other.getColorSpaceUsage() != null && other.getColorSpaceUsage().equals(this.getColorSpaceUsage()) == false)
            return false;
        if (other.getSelectorSettings() == null ^ this.getSelectorSettings() == null)
            return false;
        if (other.getSelectorSettings() != null && other.getSelectorSettings().equals(this.getSelectorSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColorSpace() == null) ? 0 : getColorSpace().hashCode());
        hashCode = prime * hashCode + ((getColorSpaceUsage() == null) ? 0 : getColorSpaceUsage().hashCode());
        hashCode = prime * hashCode + ((getSelectorSettings() == null) ? 0 : getSelectorSettings().hashCode());
        return hashCode;
    }

    @Override
    public VideoSelector clone() {
        try {
            return (VideoSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.VideoSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
