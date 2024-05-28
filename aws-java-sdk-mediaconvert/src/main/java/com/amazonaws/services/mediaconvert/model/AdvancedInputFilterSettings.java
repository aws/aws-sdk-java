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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Optional settings for Advanced input filter when you set Advanced input filter to Enabled.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AdvancedInputFilterSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedInputFilterSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Add texture and detail to areas of your input video content that were lost after applying the Advanced input
     * filter. To adaptively add texture and reduce softness: Choose Enabled. To not add any texture: Keep the default
     * value, Disabled. We recommend that you choose Disabled for input video content that doesn't have texture,
     * including screen recordings, computer graphics, or cartoons.
     */
    private String addTexture;
    /**
     * Optionally specify the amount of sharpening to apply when you use the Advanced input filter. Sharpening adds
     * contrast to the edges of your video content and can reduce softness. To apply no sharpening: Keep the default
     * value, Off. To apply a minimal amount of sharpening choose Low, or for the maximum choose High.
     */
    private String sharpening;

    /**
     * Add texture and detail to areas of your input video content that were lost after applying the Advanced input
     * filter. To adaptively add texture and reduce softness: Choose Enabled. To not add any texture: Keep the default
     * value, Disabled. We recommend that you choose Disabled for input video content that doesn't have texture,
     * including screen recordings, computer graphics, or cartoons.
     * 
     * @param addTexture
     *        Add texture and detail to areas of your input video content that were lost after applying the Advanced
     *        input filter. To adaptively add texture and reduce softness: Choose Enabled. To not add any texture: Keep
     *        the default value, Disabled. We recommend that you choose Disabled for input video content that doesn't
     *        have texture, including screen recordings, computer graphics, or cartoons.
     * @see AdvancedInputFilterAddTexture
     */

    public void setAddTexture(String addTexture) {
        this.addTexture = addTexture;
    }

    /**
     * Add texture and detail to areas of your input video content that were lost after applying the Advanced input
     * filter. To adaptively add texture and reduce softness: Choose Enabled. To not add any texture: Keep the default
     * value, Disabled. We recommend that you choose Disabled for input video content that doesn't have texture,
     * including screen recordings, computer graphics, or cartoons.
     * 
     * @return Add texture and detail to areas of your input video content that were lost after applying the Advanced
     *         input filter. To adaptively add texture and reduce softness: Choose Enabled. To not add any texture: Keep
     *         the default value, Disabled. We recommend that you choose Disabled for input video content that doesn't
     *         have texture, including screen recordings, computer graphics, or cartoons.
     * @see AdvancedInputFilterAddTexture
     */

    public String getAddTexture() {
        return this.addTexture;
    }

    /**
     * Add texture and detail to areas of your input video content that were lost after applying the Advanced input
     * filter. To adaptively add texture and reduce softness: Choose Enabled. To not add any texture: Keep the default
     * value, Disabled. We recommend that you choose Disabled for input video content that doesn't have texture,
     * including screen recordings, computer graphics, or cartoons.
     * 
     * @param addTexture
     *        Add texture and detail to areas of your input video content that were lost after applying the Advanced
     *        input filter. To adaptively add texture and reduce softness: Choose Enabled. To not add any texture: Keep
     *        the default value, Disabled. We recommend that you choose Disabled for input video content that doesn't
     *        have texture, including screen recordings, computer graphics, or cartoons.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdvancedInputFilterAddTexture
     */

    public AdvancedInputFilterSettings withAddTexture(String addTexture) {
        setAddTexture(addTexture);
        return this;
    }

    /**
     * Add texture and detail to areas of your input video content that were lost after applying the Advanced input
     * filter. To adaptively add texture and reduce softness: Choose Enabled. To not add any texture: Keep the default
     * value, Disabled. We recommend that you choose Disabled for input video content that doesn't have texture,
     * including screen recordings, computer graphics, or cartoons.
     * 
     * @param addTexture
     *        Add texture and detail to areas of your input video content that were lost after applying the Advanced
     *        input filter. To adaptively add texture and reduce softness: Choose Enabled. To not add any texture: Keep
     *        the default value, Disabled. We recommend that you choose Disabled for input video content that doesn't
     *        have texture, including screen recordings, computer graphics, or cartoons.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdvancedInputFilterAddTexture
     */

    public AdvancedInputFilterSettings withAddTexture(AdvancedInputFilterAddTexture addTexture) {
        this.addTexture = addTexture.toString();
        return this;
    }

    /**
     * Optionally specify the amount of sharpening to apply when you use the Advanced input filter. Sharpening adds
     * contrast to the edges of your video content and can reduce softness. To apply no sharpening: Keep the default
     * value, Off. To apply a minimal amount of sharpening choose Low, or for the maximum choose High.
     * 
     * @param sharpening
     *        Optionally specify the amount of sharpening to apply when you use the Advanced input filter. Sharpening
     *        adds contrast to the edges of your video content and can reduce softness. To apply no sharpening: Keep the
     *        default value, Off. To apply a minimal amount of sharpening choose Low, or for the maximum choose High.
     * @see AdvancedInputFilterSharpen
     */

    public void setSharpening(String sharpening) {
        this.sharpening = sharpening;
    }

    /**
     * Optionally specify the amount of sharpening to apply when you use the Advanced input filter. Sharpening adds
     * contrast to the edges of your video content and can reduce softness. To apply no sharpening: Keep the default
     * value, Off. To apply a minimal amount of sharpening choose Low, or for the maximum choose High.
     * 
     * @return Optionally specify the amount of sharpening to apply when you use the Advanced input filter. Sharpening
     *         adds contrast to the edges of your video content and can reduce softness. To apply no sharpening: Keep
     *         the default value, Off. To apply a minimal amount of sharpening choose Low, or for the maximum choose
     *         High.
     * @see AdvancedInputFilterSharpen
     */

    public String getSharpening() {
        return this.sharpening;
    }

    /**
     * Optionally specify the amount of sharpening to apply when you use the Advanced input filter. Sharpening adds
     * contrast to the edges of your video content and can reduce softness. To apply no sharpening: Keep the default
     * value, Off. To apply a minimal amount of sharpening choose Low, or for the maximum choose High.
     * 
     * @param sharpening
     *        Optionally specify the amount of sharpening to apply when you use the Advanced input filter. Sharpening
     *        adds contrast to the edges of your video content and can reduce softness. To apply no sharpening: Keep the
     *        default value, Off. To apply a minimal amount of sharpening choose Low, or for the maximum choose High.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdvancedInputFilterSharpen
     */

    public AdvancedInputFilterSettings withSharpening(String sharpening) {
        setSharpening(sharpening);
        return this;
    }

    /**
     * Optionally specify the amount of sharpening to apply when you use the Advanced input filter. Sharpening adds
     * contrast to the edges of your video content and can reduce softness. To apply no sharpening: Keep the default
     * value, Off. To apply a minimal amount of sharpening choose Low, or for the maximum choose High.
     * 
     * @param sharpening
     *        Optionally specify the amount of sharpening to apply when you use the Advanced input filter. Sharpening
     *        adds contrast to the edges of your video content and can reduce softness. To apply no sharpening: Keep the
     *        default value, Off. To apply a minimal amount of sharpening choose Low, or for the maximum choose High.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdvancedInputFilterSharpen
     */

    public AdvancedInputFilterSettings withSharpening(AdvancedInputFilterSharpen sharpening) {
        this.sharpening = sharpening.toString();
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
        if (getAddTexture() != null)
            sb.append("AddTexture: ").append(getAddTexture()).append(",");
        if (getSharpening() != null)
            sb.append("Sharpening: ").append(getSharpening());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedInputFilterSettings == false)
            return false;
        AdvancedInputFilterSettings other = (AdvancedInputFilterSettings) obj;
        if (other.getAddTexture() == null ^ this.getAddTexture() == null)
            return false;
        if (other.getAddTexture() != null && other.getAddTexture().equals(this.getAddTexture()) == false)
            return false;
        if (other.getSharpening() == null ^ this.getSharpening() == null)
            return false;
        if (other.getSharpening() != null && other.getSharpening().equals(this.getSharpening()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddTexture() == null) ? 0 : getAddTexture().hashCode());
        hashCode = prime * hashCode + ((getSharpening() == null) ? 0 : getSharpening().hashCode());
        return hashCode;
    }

    @Override
    public AdvancedInputFilterSettings clone() {
        try {
            return (AdvancedInputFilterSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AdvancedInputFilterSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
