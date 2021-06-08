/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Ebu Tt DDestination Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/EbuTtDDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbuTtDDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. Complete this field
     * if you want to include the name of the copyright holder in the copyright metadata tag in the TTML
     */
    private String copyrightHolder;
    /**
     * Specifies how to handle the gap between the lines (in multi-line captions).
     * 
     * - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave the
     * gap unfilled.
     */
    private String fillLineGap;
    /**
     * Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if styleControl
     * is set to include. If you leave this field empty, the font family is set to "monospaced". (If styleControl is set
     * to exclude, the font family is always set to "monospaced".)
     * 
     * You specify only the font family. All other style information (color, bold, position and so on) is copied from
     * the input captions. The size is always set to 100% to allow the downstream player to choose the size.
     * 
     * - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name can be
     * a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let the downstream
     * player choose the font). - Leave blank to set the family to “monospace”.
     */
    private String fontFamily;
    /**
     * Specifies the style information (font color, font position, and so on) to include in the font data that is
     * attached to the EBU-TT captions.
     * 
     * - include: Take the style information (font color, font position, and so on) from the source captions and include
     * that information in the font data attached to the EBU-TT captions. This option is valid only if the source
     * captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions, set the font
     * family to "monospaced". Do not include any other style information.
     */
    private String styleControl;

    /**
     * Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. Complete this field
     * if you want to include the name of the copyright holder in the copyright metadata tag in the TTML
     * 
     * @param copyrightHolder
     *        Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. Complete this
     *        field if you want to include the name of the copyright holder in the copyright metadata tag in the TTML
     */

    public void setCopyrightHolder(String copyrightHolder) {
        this.copyrightHolder = copyrightHolder;
    }

    /**
     * Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. Complete this field
     * if you want to include the name of the copyright holder in the copyright metadata tag in the TTML
     * 
     * @return Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. Complete this
     *         field if you want to include the name of the copyright holder in the copyright metadata tag in the TTML
     */

    public String getCopyrightHolder() {
        return this.copyrightHolder;
    }

    /**
     * Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. Complete this field
     * if you want to include the name of the copyright holder in the copyright metadata tag in the TTML
     * 
     * @param copyrightHolder
     *        Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. Complete this
     *        field if you want to include the name of the copyright holder in the copyright metadata tag in the TTML
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbuTtDDestinationSettings withCopyrightHolder(String copyrightHolder) {
        setCopyrightHolder(copyrightHolder);
        return this;
    }

    /**
     * Specifies how to handle the gap between the lines (in multi-line captions).
     * 
     * - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave the
     * gap unfilled.
     * 
     * @param fillLineGap
     *        Specifies how to handle the gap between the lines (in multi-line captions).
     * 
     *        - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave
     *        the gap unfilled.
     * @see EbuTtDFillLineGapControl
     */

    public void setFillLineGap(String fillLineGap) {
        this.fillLineGap = fillLineGap;
    }

    /**
     * Specifies how to handle the gap between the lines (in multi-line captions).
     * 
     * - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave the
     * gap unfilled.
     * 
     * @return Specifies how to handle the gap between the lines (in multi-line captions).
     * 
     *         - enabled: Fill with the captions background color (as specified in the input captions). - disabled:
     *         Leave the gap unfilled.
     * @see EbuTtDFillLineGapControl
     */

    public String getFillLineGap() {
        return this.fillLineGap;
    }

    /**
     * Specifies how to handle the gap between the lines (in multi-line captions).
     * 
     * - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave the
     * gap unfilled.
     * 
     * @param fillLineGap
     *        Specifies how to handle the gap between the lines (in multi-line captions).
     * 
     *        - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave
     *        the gap unfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EbuTtDFillLineGapControl
     */

    public EbuTtDDestinationSettings withFillLineGap(String fillLineGap) {
        setFillLineGap(fillLineGap);
        return this;
    }

    /**
     * Specifies how to handle the gap between the lines (in multi-line captions).
     * 
     * - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave the
     * gap unfilled.
     * 
     * @param fillLineGap
     *        Specifies how to handle the gap between the lines (in multi-line captions).
     * 
     *        - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave
     *        the gap unfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EbuTtDFillLineGapControl
     */

    public EbuTtDDestinationSettings withFillLineGap(EbuTtDFillLineGapControl fillLineGap) {
        this.fillLineGap = fillLineGap.toString();
        return this;
    }

    /**
     * Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if styleControl
     * is set to include. If you leave this field empty, the font family is set to "monospaced". (If styleControl is set
     * to exclude, the font family is always set to "monospaced".)
     * 
     * You specify only the font family. All other style information (color, bold, position and so on) is copied from
     * the input captions. The size is always set to 100% to allow the downstream player to choose the size.
     * 
     * - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name can be
     * a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let the downstream
     * player choose the font). - Leave blank to set the family to “monospace”.
     * 
     * @param fontFamily
     *        Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if
     *        styleControl is set to include. If you leave this field empty, the font family is set to "monospaced". (If
     *        styleControl is set to exclude, the font family is always set to "monospaced".)
     * 
     *        You specify only the font family. All other style information (color, bold, position and so on) is copied
     *        from the input captions. The size is always set to 100% to allow the downstream player to choose the size.
     * 
     *        - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name
     *        can be a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let
     *        the downstream player choose the font). - Leave blank to set the family to “monospace”.
     */

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if styleControl
     * is set to include. If you leave this field empty, the font family is set to "monospaced". (If styleControl is set
     * to exclude, the font family is always set to "monospaced".)
     * 
     * You specify only the font family. All other style information (color, bold, position and so on) is copied from
     * the input captions. The size is always set to 100% to allow the downstream player to choose the size.
     * 
     * - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name can be
     * a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let the downstream
     * player choose the font). - Leave blank to set the family to “monospace”.
     * 
     * @return Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if
     *         styleControl is set to include. If you leave this field empty, the font family is set to "monospaced".
     *         (If styleControl is set to exclude, the font family is always set to "monospaced".)
     * 
     *         You specify only the font family. All other style information (color, bold, position and so on) is copied
     *         from the input captions. The size is always set to 100% to allow the downstream player to choose the
     *         size.
     * 
     *         - Enter a list of font families, as a comma-separated list of font names, in order of preference. The
     *         name can be a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to
     *         let the downstream player choose the font). - Leave blank to set the family to “monospace”.
     */

    public String getFontFamily() {
        return this.fontFamily;
    }

    /**
     * Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if styleControl
     * is set to include. If you leave this field empty, the font family is set to "monospaced". (If styleControl is set
     * to exclude, the font family is always set to "monospaced".)
     * 
     * You specify only the font family. All other style information (color, bold, position and so on) is copied from
     * the input captions. The size is always set to 100% to allow the downstream player to choose the size.
     * 
     * - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name can be
     * a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let the downstream
     * player choose the font). - Leave blank to set the family to “monospace”.
     * 
     * @param fontFamily
     *        Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if
     *        styleControl is set to include. If you leave this field empty, the font family is set to "monospaced". (If
     *        styleControl is set to exclude, the font family is always set to "monospaced".)
     * 
     *        You specify only the font family. All other style information (color, bold, position and so on) is copied
     *        from the input captions. The size is always set to 100% to allow the downstream player to choose the size.
     * 
     *        - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name
     *        can be a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let
     *        the downstream player choose the font). - Leave blank to set the family to “monospace”.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbuTtDDestinationSettings withFontFamily(String fontFamily) {
        setFontFamily(fontFamily);
        return this;
    }

    /**
     * Specifies the style information (font color, font position, and so on) to include in the font data that is
     * attached to the EBU-TT captions.
     * 
     * - include: Take the style information (font color, font position, and so on) from the source captions and include
     * that information in the font data attached to the EBU-TT captions. This option is valid only if the source
     * captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions, set the font
     * family to "monospaced". Do not include any other style information.
     * 
     * @param styleControl
     *        Specifies the style information (font color, font position, and so on) to include in the font data that is
     *        attached to the EBU-TT captions.
     * 
     *        - include: Take the style information (font color, font position, and so on) from the source captions and
     *        include that information in the font data attached to the EBU-TT captions. This option is valid only if
     *        the source captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions,
     *        set the font family to "monospaced". Do not include any other style information.
     * @see EbuTtDDestinationStyleControl
     */

    public void setStyleControl(String styleControl) {
        this.styleControl = styleControl;
    }

    /**
     * Specifies the style information (font color, font position, and so on) to include in the font data that is
     * attached to the EBU-TT captions.
     * 
     * - include: Take the style information (font color, font position, and so on) from the source captions and include
     * that information in the font data attached to the EBU-TT captions. This option is valid only if the source
     * captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions, set the font
     * family to "monospaced". Do not include any other style information.
     * 
     * @return Specifies the style information (font color, font position, and so on) to include in the font data that
     *         is attached to the EBU-TT captions.
     * 
     *         - include: Take the style information (font color, font position, and so on) from the source captions and
     *         include that information in the font data attached to the EBU-TT captions. This option is valid only if
     *         the source captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT
     *         captions, set the font family to "monospaced". Do not include any other style information.
     * @see EbuTtDDestinationStyleControl
     */

    public String getStyleControl() {
        return this.styleControl;
    }

    /**
     * Specifies the style information (font color, font position, and so on) to include in the font data that is
     * attached to the EBU-TT captions.
     * 
     * - include: Take the style information (font color, font position, and so on) from the source captions and include
     * that information in the font data attached to the EBU-TT captions. This option is valid only if the source
     * captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions, set the font
     * family to "monospaced". Do not include any other style information.
     * 
     * @param styleControl
     *        Specifies the style information (font color, font position, and so on) to include in the font data that is
     *        attached to the EBU-TT captions.
     * 
     *        - include: Take the style information (font color, font position, and so on) from the source captions and
     *        include that information in the font data attached to the EBU-TT captions. This option is valid only if
     *        the source captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions,
     *        set the font family to "monospaced". Do not include any other style information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EbuTtDDestinationStyleControl
     */

    public EbuTtDDestinationSettings withStyleControl(String styleControl) {
        setStyleControl(styleControl);
        return this;
    }

    /**
     * Specifies the style information (font color, font position, and so on) to include in the font data that is
     * attached to the EBU-TT captions.
     * 
     * - include: Take the style information (font color, font position, and so on) from the source captions and include
     * that information in the font data attached to the EBU-TT captions. This option is valid only if the source
     * captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions, set the font
     * family to "monospaced". Do not include any other style information.
     * 
     * @param styleControl
     *        Specifies the style information (font color, font position, and so on) to include in the font data that is
     *        attached to the EBU-TT captions.
     * 
     *        - include: Take the style information (font color, font position, and so on) from the source captions and
     *        include that information in the font data attached to the EBU-TT captions. This option is valid only if
     *        the source captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions,
     *        set the font family to "monospaced". Do not include any other style information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EbuTtDDestinationStyleControl
     */

    public EbuTtDDestinationSettings withStyleControl(EbuTtDDestinationStyleControl styleControl) {
        this.styleControl = styleControl.toString();
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
        if (getCopyrightHolder() != null)
            sb.append("CopyrightHolder: ").append(getCopyrightHolder()).append(",");
        if (getFillLineGap() != null)
            sb.append("FillLineGap: ").append(getFillLineGap()).append(",");
        if (getFontFamily() != null)
            sb.append("FontFamily: ").append(getFontFamily()).append(",");
        if (getStyleControl() != null)
            sb.append("StyleControl: ").append(getStyleControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbuTtDDestinationSettings == false)
            return false;
        EbuTtDDestinationSettings other = (EbuTtDDestinationSettings) obj;
        if (other.getCopyrightHolder() == null ^ this.getCopyrightHolder() == null)
            return false;
        if (other.getCopyrightHolder() != null && other.getCopyrightHolder().equals(this.getCopyrightHolder()) == false)
            return false;
        if (other.getFillLineGap() == null ^ this.getFillLineGap() == null)
            return false;
        if (other.getFillLineGap() != null && other.getFillLineGap().equals(this.getFillLineGap()) == false)
            return false;
        if (other.getFontFamily() == null ^ this.getFontFamily() == null)
            return false;
        if (other.getFontFamily() != null && other.getFontFamily().equals(this.getFontFamily()) == false)
            return false;
        if (other.getStyleControl() == null ^ this.getStyleControl() == null)
            return false;
        if (other.getStyleControl() != null && other.getStyleControl().equals(this.getStyleControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyrightHolder() == null) ? 0 : getCopyrightHolder().hashCode());
        hashCode = prime * hashCode + ((getFillLineGap() == null) ? 0 : getFillLineGap().hashCode());
        hashCode = prime * hashCode + ((getFontFamily() == null) ? 0 : getFontFamily().hashCode());
        hashCode = prime * hashCode + ((getStyleControl() == null) ? 0 : getStyleControl().hashCode());
        return hashCode;
    }

    @Override
    public EbuTtDDestinationSettings clone() {
        try {
            return (EbuTtDDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.EbuTtDDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
