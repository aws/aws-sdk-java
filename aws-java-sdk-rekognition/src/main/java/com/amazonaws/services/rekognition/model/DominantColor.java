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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A description of the dominant colors in an image.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DominantColor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Red RGB value for a dominant color.
     * </p>
     */
    private Integer red;
    /**
     * <p>
     * The Blue RGB value for a dominant color.
     * </p>
     */
    private Integer blue;
    /**
     * <p>
     * The Green RGB value for a dominant color.
     * </p>
     */
    private Integer green;
    /**
     * <p>
     * The Hex code equivalent of the RGB values for a dominant color.
     * </p>
     */
    private String hexCode;
    /**
     * <p>
     * The CSS color name of a dominant color.
     * </p>
     */
    private String cSSColor;
    /**
     * <p>
     * One of 12 simplified color names applied to a dominant color.
     * </p>
     */
    private String simplifiedColor;
    /**
     * <p>
     * The percentage of image pixels that have a given dominant color.
     * </p>
     */
    private Float pixelPercent;

    /**
     * <p>
     * The Red RGB value for a dominant color.
     * </p>
     * 
     * @param red
     *        The Red RGB value for a dominant color.
     */

    public void setRed(Integer red) {
        this.red = red;
    }

    /**
     * <p>
     * The Red RGB value for a dominant color.
     * </p>
     * 
     * @return The Red RGB value for a dominant color.
     */

    public Integer getRed() {
        return this.red;
    }

    /**
     * <p>
     * The Red RGB value for a dominant color.
     * </p>
     * 
     * @param red
     *        The Red RGB value for a dominant color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DominantColor withRed(Integer red) {
        setRed(red);
        return this;
    }

    /**
     * <p>
     * The Blue RGB value for a dominant color.
     * </p>
     * 
     * @param blue
     *        The Blue RGB value for a dominant color.
     */

    public void setBlue(Integer blue) {
        this.blue = blue;
    }

    /**
     * <p>
     * The Blue RGB value for a dominant color.
     * </p>
     * 
     * @return The Blue RGB value for a dominant color.
     */

    public Integer getBlue() {
        return this.blue;
    }

    /**
     * <p>
     * The Blue RGB value for a dominant color.
     * </p>
     * 
     * @param blue
     *        The Blue RGB value for a dominant color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DominantColor withBlue(Integer blue) {
        setBlue(blue);
        return this;
    }

    /**
     * <p>
     * The Green RGB value for a dominant color.
     * </p>
     * 
     * @param green
     *        The Green RGB value for a dominant color.
     */

    public void setGreen(Integer green) {
        this.green = green;
    }

    /**
     * <p>
     * The Green RGB value for a dominant color.
     * </p>
     * 
     * @return The Green RGB value for a dominant color.
     */

    public Integer getGreen() {
        return this.green;
    }

    /**
     * <p>
     * The Green RGB value for a dominant color.
     * </p>
     * 
     * @param green
     *        The Green RGB value for a dominant color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DominantColor withGreen(Integer green) {
        setGreen(green);
        return this;
    }

    /**
     * <p>
     * The Hex code equivalent of the RGB values for a dominant color.
     * </p>
     * 
     * @param hexCode
     *        The Hex code equivalent of the RGB values for a dominant color.
     */

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    /**
     * <p>
     * The Hex code equivalent of the RGB values for a dominant color.
     * </p>
     * 
     * @return The Hex code equivalent of the RGB values for a dominant color.
     */

    public String getHexCode() {
        return this.hexCode;
    }

    /**
     * <p>
     * The Hex code equivalent of the RGB values for a dominant color.
     * </p>
     * 
     * @param hexCode
     *        The Hex code equivalent of the RGB values for a dominant color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DominantColor withHexCode(String hexCode) {
        setHexCode(hexCode);
        return this;
    }

    /**
     * <p>
     * The CSS color name of a dominant color.
     * </p>
     * 
     * @param cSSColor
     *        The CSS color name of a dominant color.
     */

    public void setCSSColor(String cSSColor) {
        this.cSSColor = cSSColor;
    }

    /**
     * <p>
     * The CSS color name of a dominant color.
     * </p>
     * 
     * @return The CSS color name of a dominant color.
     */

    public String getCSSColor() {
        return this.cSSColor;
    }

    /**
     * <p>
     * The CSS color name of a dominant color.
     * </p>
     * 
     * @param cSSColor
     *        The CSS color name of a dominant color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DominantColor withCSSColor(String cSSColor) {
        setCSSColor(cSSColor);
        return this;
    }

    /**
     * <p>
     * One of 12 simplified color names applied to a dominant color.
     * </p>
     * 
     * @param simplifiedColor
     *        One of 12 simplified color names applied to a dominant color.
     */

    public void setSimplifiedColor(String simplifiedColor) {
        this.simplifiedColor = simplifiedColor;
    }

    /**
     * <p>
     * One of 12 simplified color names applied to a dominant color.
     * </p>
     * 
     * @return One of 12 simplified color names applied to a dominant color.
     */

    public String getSimplifiedColor() {
        return this.simplifiedColor;
    }

    /**
     * <p>
     * One of 12 simplified color names applied to a dominant color.
     * </p>
     * 
     * @param simplifiedColor
     *        One of 12 simplified color names applied to a dominant color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DominantColor withSimplifiedColor(String simplifiedColor) {
        setSimplifiedColor(simplifiedColor);
        return this;
    }

    /**
     * <p>
     * The percentage of image pixels that have a given dominant color.
     * </p>
     * 
     * @param pixelPercent
     *        The percentage of image pixels that have a given dominant color.
     */

    public void setPixelPercent(Float pixelPercent) {
        this.pixelPercent = pixelPercent;
    }

    /**
     * <p>
     * The percentage of image pixels that have a given dominant color.
     * </p>
     * 
     * @return The percentage of image pixels that have a given dominant color.
     */

    public Float getPixelPercent() {
        return this.pixelPercent;
    }

    /**
     * <p>
     * The percentage of image pixels that have a given dominant color.
     * </p>
     * 
     * @param pixelPercent
     *        The percentage of image pixels that have a given dominant color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DominantColor withPixelPercent(Float pixelPercent) {
        setPixelPercent(pixelPercent);
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
        if (getRed() != null)
            sb.append("Red: ").append(getRed()).append(",");
        if (getBlue() != null)
            sb.append("Blue: ").append(getBlue()).append(",");
        if (getGreen() != null)
            sb.append("Green: ").append(getGreen()).append(",");
        if (getHexCode() != null)
            sb.append("HexCode: ").append(getHexCode()).append(",");
        if (getCSSColor() != null)
            sb.append("CSSColor: ").append(getCSSColor()).append(",");
        if (getSimplifiedColor() != null)
            sb.append("SimplifiedColor: ").append(getSimplifiedColor()).append(",");
        if (getPixelPercent() != null)
            sb.append("PixelPercent: ").append(getPixelPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DominantColor == false)
            return false;
        DominantColor other = (DominantColor) obj;
        if (other.getRed() == null ^ this.getRed() == null)
            return false;
        if (other.getRed() != null && other.getRed().equals(this.getRed()) == false)
            return false;
        if (other.getBlue() == null ^ this.getBlue() == null)
            return false;
        if (other.getBlue() != null && other.getBlue().equals(this.getBlue()) == false)
            return false;
        if (other.getGreen() == null ^ this.getGreen() == null)
            return false;
        if (other.getGreen() != null && other.getGreen().equals(this.getGreen()) == false)
            return false;
        if (other.getHexCode() == null ^ this.getHexCode() == null)
            return false;
        if (other.getHexCode() != null && other.getHexCode().equals(this.getHexCode()) == false)
            return false;
        if (other.getCSSColor() == null ^ this.getCSSColor() == null)
            return false;
        if (other.getCSSColor() != null && other.getCSSColor().equals(this.getCSSColor()) == false)
            return false;
        if (other.getSimplifiedColor() == null ^ this.getSimplifiedColor() == null)
            return false;
        if (other.getSimplifiedColor() != null && other.getSimplifiedColor().equals(this.getSimplifiedColor()) == false)
            return false;
        if (other.getPixelPercent() == null ^ this.getPixelPercent() == null)
            return false;
        if (other.getPixelPercent() != null && other.getPixelPercent().equals(this.getPixelPercent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRed() == null) ? 0 : getRed().hashCode());
        hashCode = prime * hashCode + ((getBlue() == null) ? 0 : getBlue().hashCode());
        hashCode = prime * hashCode + ((getGreen() == null) ? 0 : getGreen().hashCode());
        hashCode = prime * hashCode + ((getHexCode() == null) ? 0 : getHexCode().hashCode());
        hashCode = prime * hashCode + ((getCSSColor() == null) ? 0 : getCSSColor().hashCode());
        hashCode = prime * hashCode + ((getSimplifiedColor() == null) ? 0 : getSimplifiedColor().hashCode());
        hashCode = prime * hashCode + ((getPixelPercent() == null) ? 0 : getPixelPercent().hashCode());
        return hashCode;
    }

    @Override
    public DominantColor clone() {
        try {
            return (DominantColor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DominantColorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
