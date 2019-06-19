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
 * Dvb Sub Destination Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DvbSubDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DvbSubDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions at the
     * bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the
     * output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified
     * (either left or centered) relative to those coordinates. Selecting "smart" justification will left-justify live
     * subtitles and center-justify pre-recorded subtitles. This option is not valid for source captions that are STL or
     * 608/embedded. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     */
    private String alignment;
    /** Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must match. */
    private String backgroundColor;
    /**
     * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank
     * is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     */
    private Integer backgroundOpacity;
    /**
     * External font file used for caption burn-in. File extension must be 'ttf' or 'tte'. Although the user can select
     * output fonts for many different types of input captions, embedded, STL and teletext sources use a strict grid
     * system. Using external fonts with these caption sources could cause unexpected display of proportional fonts. All
     * burn-in and DVB-Sub font settings must match.
     */
    private InputLocation font;
    /**
     * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL,
     * 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     */
    private String fontColor;
    /**
     * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent. All burn-in and DVB-Sub font
     * settings must match.
     */
    private Integer fontOpacity;
    /** Font resolution in DPI (dots per inch); default is 96 dpi. All burn-in and DVB-Sub font settings must match. */
    private Integer fontResolution;
    /**
     * When set to auto fontSize will scale depending on the size of the output. Giving a positive integer will specify
     * the exact font size in points. All burn-in and DVB-Sub font settings must match.
     */
    private String fontSize;
    /**
     * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or
     * teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     */
    private String outlineColor;
    /**
     * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded
     * or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     */
    private Integer outlineSize;
    /** Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match. */
    private String shadowColor;
    /**
     * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent
     * to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     */
    private Integer shadowOpacity;
    /**
     * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
     */
    private Integer shadowXOffset;
    /**
     * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
     */
    private Integer shadowYOffset;
    /**
     * Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable for
     * Teletext inputs and DVB-Sub/Burn-in outputs.
     */
    private String teletextGridControl;
    /**
     * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10
     * would result in the captions starting 10 pixels from the left of the output. If no explicit xPosition is
     * provided, the horizontal caption position will be determined by the alignment parameter. This option is not valid
     * for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the
     * caption stream. All burn-in and DVB-Sub font settings must match.
     */
    private Integer xPosition;
    /**
     * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would
     * result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is provided, the
     * caption will be positioned towards the bottom of the output. This option is not valid for source captions that are
     * STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in
     * and DVB-Sub font settings must match.
     */
    private Integer yPosition;

    /**
     * If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions at the
     * bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the
     * output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified
     * (either left or centered) relative to those coordinates. Selecting "smart" justification will left-justify live
     * subtitles and center-justify pre-recorded subtitles. This option is not valid for source captions that are STL or
     * 608/embedded. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @param alignment
     *        If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions
     *        at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom
     *        left of the output. If x and y positions are given in conjunction with the alignment parameter, the font
     *        will be justified (either left or centered) relative to those coordinates. Selecting "smart" justification
     *        will left-justify live subtitles and center-justify pre-recorded subtitles. This option is not valid for
     *        source captions that are STL or 608/embedded. These source settings are already pre-defined by the caption
     *        stream. All burn-in and DVB-Sub font settings must match.
     * @see DvbSubDestinationAlignment
     */

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    /**
     * If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions at the
     * bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the
     * output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified
     * (either left or centered) relative to those coordinates. Selecting "smart" justification will left-justify live
     * subtitles and center-justify pre-recorded subtitles. This option is not valid for source captions that are STL or
     * 608/embedded. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @return If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions
     *         at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom
     *         left of the output. If x and y positions are given in conjunction with the alignment parameter, the font
     *         will be justified (either left or centered) relative to those coordinates. Selecting "smart"
     *         justification will left-justify live subtitles and center-justify pre-recorded subtitles. This option is
     *         not valid for source captions that are STL or 608/embedded. These source settings are already pre-defined
     *         by the caption stream. All burn-in and DVB-Sub font settings must match.
     * @see DvbSubDestinationAlignment
     */

    public String getAlignment() {
        return this.alignment;
    }

    /**
     * If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions at the
     * bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the
     * output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified
     * (either left or centered) relative to those coordinates. Selecting "smart" justification will left-justify live
     * subtitles and center-justify pre-recorded subtitles. This option is not valid for source captions that are STL or
     * 608/embedded. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @param alignment
     *        If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions
     *        at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom
     *        left of the output. If x and y positions are given in conjunction with the alignment parameter, the font
     *        will be justified (either left or centered) relative to those coordinates. Selecting "smart" justification
     *        will left-justify live subtitles and center-justify pre-recorded subtitles. This option is not valid for
     *        source captions that are STL or 608/embedded. These source settings are already pre-defined by the caption
     *        stream. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationAlignment
     */

    public DvbSubDestinationSettings withAlignment(String alignment) {
        setAlignment(alignment);
        return this;
    }

    /**
     * If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions at the
     * bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the
     * output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified
     * (either left or centered) relative to those coordinates. Selecting "smart" justification will left-justify live
     * subtitles and center-justify pre-recorded subtitles. This option is not valid for source captions that are STL or
     * 608/embedded. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @param alignment
     *        If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions
     *        at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom
     *        left of the output. If x and y positions are given in conjunction with the alignment parameter, the font
     *        will be justified (either left or centered) relative to those coordinates. Selecting "smart" justification
     *        will left-justify live subtitles and center-justify pre-recorded subtitles. This option is not valid for
     *        source captions that are STL or 608/embedded. These source settings are already pre-defined by the caption
     *        stream. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationAlignment
     */

    public DvbSubDestinationSettings withAlignment(DvbSubDestinationAlignment alignment) {
        this.alignment = alignment.toString();
        return this;
    }

    /**
     * Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must match.
     * 
     * @param backgroundColor
     *        Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must
     *        match.
     * @see DvbSubDestinationBackgroundColor
     */

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must match.
     * 
     * @return Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must
     *         match.
     * @see DvbSubDestinationBackgroundColor
     */

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must match.
     * 
     * @param backgroundColor
     *        Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationBackgroundColor
     */

    public DvbSubDestinationSettings withBackgroundColor(String backgroundColor) {
        setBackgroundColor(backgroundColor);
        return this;
    }

    /**
     * Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must match.
     * 
     * @param backgroundColor
     *        Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationBackgroundColor
     */

    public DvbSubDestinationSettings withBackgroundColor(DvbSubDestinationBackgroundColor backgroundColor) {
        this.backgroundColor = backgroundColor.toString();
        return this;
    }

    /**
     * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank
     * is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     * 
     * @param backgroundOpacity
     *        Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter
     *        blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     */

    public void setBackgroundOpacity(Integer backgroundOpacity) {
        this.backgroundOpacity = backgroundOpacity;
    }

    /**
     * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank
     * is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     * 
     * @return Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this
     *         parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings
     *         must match.
     */

    public Integer getBackgroundOpacity() {
        return this.backgroundOpacity;
    }

    /**
     * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank
     * is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     * 
     * @param backgroundOpacity
     *        Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter
     *        blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withBackgroundOpacity(Integer backgroundOpacity) {
        setBackgroundOpacity(backgroundOpacity);
        return this;
    }

    /**
     * External font file used for caption burn-in. File extension must be 'ttf' or 'tte'. Although the user can select
     * output fonts for many different types of input captions, embedded, STL and teletext sources use a strict grid
     * system. Using external fonts with these caption sources could cause unexpected display of proportional fonts. All
     * burn-in and DVB-Sub font settings must match.
     * 
     * @param font
     *        External font file used for caption burn-in. File extension must be 'ttf' or 'tte'. Although the user can
     *        select output fonts for many different types of input captions, embedded, STL and teletext sources use a
     *        strict grid system. Using external fonts with these caption sources could cause unexpected display of
     *        proportional fonts. All burn-in and DVB-Sub font settings must match.
     */

    public void setFont(InputLocation font) {
        this.font = font;
    }

    /**
     * External font file used for caption burn-in. File extension must be 'ttf' or 'tte'. Although the user can select
     * output fonts for many different types of input captions, embedded, STL and teletext sources use a strict grid
     * system. Using external fonts with these caption sources could cause unexpected display of proportional fonts. All
     * burn-in and DVB-Sub font settings must match.
     * 
     * @return External font file used for caption burn-in. File extension must be 'ttf' or 'tte'. Although the user can
     *         select output fonts for many different types of input captions, embedded, STL and teletext sources use a
     *         strict grid system. Using external fonts with these caption sources could cause unexpected display of
     *         proportional fonts. All burn-in and DVB-Sub font settings must match.
     */

    public InputLocation getFont() {
        return this.font;
    }

    /**
     * External font file used for caption burn-in. File extension must be 'ttf' or 'tte'. Although the user can select
     * output fonts for many different types of input captions, embedded, STL and teletext sources use a strict grid
     * system. Using external fonts with these caption sources could cause unexpected display of proportional fonts. All
     * burn-in and DVB-Sub font settings must match.
     * 
     * @param font
     *        External font file used for caption burn-in. File extension must be 'ttf' or 'tte'. Although the user can
     *        select output fonts for many different types of input captions, embedded, STL and teletext sources use a
     *        strict grid system. Using external fonts with these caption sources could cause unexpected display of
     *        proportional fonts. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withFont(InputLocation font) {
        setFont(font);
        return this;
    }

    /**
     * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL,
     * 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * 
     * @param fontColor
     *        Specifies the color of the burned-in captions. This option is not valid for source captions that are STL,
     *        608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in
     *        and DVB-Sub font settings must match.
     * @see DvbSubDestinationFontColor
     */

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL,
     * 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * 
     * @return Specifies the color of the burned-in captions. This option is not valid for source captions that are STL,
     *         608/embedded or teletext. These source settings are already pre-defined by the caption stream. All
     *         burn-in and DVB-Sub font settings must match.
     * @see DvbSubDestinationFontColor
     */

    public String getFontColor() {
        return this.fontColor;
    }

    /**
     * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL,
     * 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * 
     * @param fontColor
     *        Specifies the color of the burned-in captions. This option is not valid for source captions that are STL,
     *        608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in
     *        and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationFontColor
     */

    public DvbSubDestinationSettings withFontColor(String fontColor) {
        setFontColor(fontColor);
        return this;
    }

    /**
     * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL,
     * 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * 
     * @param fontColor
     *        Specifies the color of the burned-in captions. This option is not valid for source captions that are STL,
     *        608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in
     *        and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationFontColor
     */

    public DvbSubDestinationSettings withFontColor(DvbSubDestinationFontColor fontColor) {
        this.fontColor = fontColor.toString();
        return this;
    }

    /**
     * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @param fontOpacity
     *        Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent. All burn-in and DVB-Sub
     *        font settings must match.
     */

    public void setFontOpacity(Integer fontOpacity) {
        this.fontOpacity = fontOpacity;
    }

    /**
     * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @return Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent. All burn-in and DVB-Sub
     *         font settings must match.
     */

    public Integer getFontOpacity() {
        return this.fontOpacity;
    }

    /**
     * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @param fontOpacity
     *        Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent. All burn-in and DVB-Sub
     *        font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withFontOpacity(Integer fontOpacity) {
        setFontOpacity(fontOpacity);
        return this;
    }

    /**
     * Font resolution in DPI (dots per inch); default is 96 dpi. All burn-in and DVB-Sub font settings must match.
     * 
     * @param fontResolution
     *        Font resolution in DPI (dots per inch); default is 96 dpi. All burn-in and DVB-Sub font settings must
     *        match.
     */

    public void setFontResolution(Integer fontResolution) {
        this.fontResolution = fontResolution;
    }

    /**
     * Font resolution in DPI (dots per inch); default is 96 dpi. All burn-in and DVB-Sub font settings must match.
     * 
     * @return Font resolution in DPI (dots per inch); default is 96 dpi. All burn-in and DVB-Sub font settings must
     *         match.
     */

    public Integer getFontResolution() {
        return this.fontResolution;
    }

    /**
     * Font resolution in DPI (dots per inch); default is 96 dpi. All burn-in and DVB-Sub font settings must match.
     * 
     * @param fontResolution
     *        Font resolution in DPI (dots per inch); default is 96 dpi. All burn-in and DVB-Sub font settings must
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withFontResolution(Integer fontResolution) {
        setFontResolution(fontResolution);
        return this;
    }

    /**
     * When set to auto fontSize will scale depending on the size of the output. Giving a positive integer will specify
     * the exact font size in points. All burn-in and DVB-Sub font settings must match.
     * 
     * @param fontSize
     *        When set to auto fontSize will scale depending on the size of the output. Giving a positive integer will
     *        specify the exact font size in points. All burn-in and DVB-Sub font settings must match.
     */

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * When set to auto fontSize will scale depending on the size of the output. Giving a positive integer will specify
     * the exact font size in points. All burn-in and DVB-Sub font settings must match.
     * 
     * @return When set to auto fontSize will scale depending on the size of the output. Giving a positive integer will
     *         specify the exact font size in points. All burn-in and DVB-Sub font settings must match.
     */

    public String getFontSize() {
        return this.fontSize;
    }

    /**
     * When set to auto fontSize will scale depending on the size of the output. Giving a positive integer will specify
     * the exact font size in points. All burn-in and DVB-Sub font settings must match.
     * 
     * @param fontSize
     *        When set to auto fontSize will scale depending on the size of the output. Giving a positive integer will
     *        specify the exact font size in points. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withFontSize(String fontSize) {
        setFontSize(fontSize);
        return this;
    }

    /**
     * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or
     * teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @param outlineColor
     *        Specifies font outline color. This option is not valid for source captions that are either 608/embedded or
     *        teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub
     *        font settings must match.
     * @see DvbSubDestinationOutlineColor
     */

    public void setOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    /**
     * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or
     * teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @return Specifies font outline color. This option is not valid for source captions that are either 608/embedded
     *         or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub
     *         font settings must match.
     * @see DvbSubDestinationOutlineColor
     */

    public String getOutlineColor() {
        return this.outlineColor;
    }

    /**
     * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or
     * teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @param outlineColor
     *        Specifies font outline color. This option is not valid for source captions that are either 608/embedded or
     *        teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub
     *        font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationOutlineColor
     */

    public DvbSubDestinationSettings withOutlineColor(String outlineColor) {
        setOutlineColor(outlineColor);
        return this;
    }

    /**
     * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or
     * teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @param outlineColor
     *        Specifies font outline color. This option is not valid for source captions that are either 608/embedded or
     *        teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub
     *        font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationOutlineColor
     */

    public DvbSubDestinationSettings withOutlineColor(DvbSubDestinationOutlineColor outlineColor) {
        this.outlineColor = outlineColor.toString();
        return this;
    }

    /**
     * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded
     * or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @param outlineSize
     *        Specifies font outline size in pixels. This option is not valid for source captions that are either
     *        608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in
     *        and DVB-Sub font settings must match.
     */

    public void setOutlineSize(Integer outlineSize) {
        this.outlineSize = outlineSize;
    }

    /**
     * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded
     * or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @return Specifies font outline size in pixels. This option is not valid for source captions that are either
     *         608/embedded or teletext. These source settings are already pre-defined by the caption stream. All
     *         burn-in and DVB-Sub font settings must match.
     */

    public Integer getOutlineSize() {
        return this.outlineSize;
    }

    /**
     * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded
     * or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font
     * settings must match.
     * 
     * @param outlineSize
     *        Specifies font outline size in pixels. This option is not valid for source captions that are either
     *        608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in
     *        and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withOutlineSize(Integer outlineSize) {
        setOutlineSize(outlineSize);
        return this;
    }

    /**
     * Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
     * 
     * @param shadowColor
     *        Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
     * @see DvbSubDestinationShadowColor
     */

    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    /**
     * Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
     * 
     * @return Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
     * @see DvbSubDestinationShadowColor
     */

    public String getShadowColor() {
        return this.shadowColor;
    }

    /**
     * Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
     * 
     * @param shadowColor
     *        Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationShadowColor
     */

    public DvbSubDestinationSettings withShadowColor(String shadowColor) {
        setShadowColor(shadowColor);
        return this;
    }

    /**
     * Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
     * 
     * @param shadowColor
     *        Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationShadowColor
     */

    public DvbSubDestinationSettings withShadowColor(DvbSubDestinationShadowColor shadowColor) {
        this.shadowColor = shadowColor.toString();
        return this;
    }

    /**
     * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent
     * to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     * 
     * @param shadowOpacity
     *        Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is
     *        equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     */

    public void setShadowOpacity(Integer shadowOpacity) {
        this.shadowOpacity = shadowOpacity;
    }

    /**
     * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent
     * to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     * 
     * @return Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is
     *         equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     */

    public Integer getShadowOpacity() {
        return this.shadowOpacity;
    }

    /**
     * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent
     * to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     * 
     * @param shadowOpacity
     *        Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is
     *        equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withShadowOpacity(Integer shadowOpacity) {
        setShadowOpacity(shadowOpacity);
        return this;
    }

    /**
     * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
     * 
     * @param shadowXOffset
     *        Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would
     *        result in a shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
     */

    public void setShadowXOffset(Integer shadowXOffset) {
        this.shadowXOffset = shadowXOffset;
    }

    /**
     * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
     * 
     * @return Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would
     *         result in a shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
     */

    public Integer getShadowXOffset() {
        return this.shadowXOffset;
    }

    /**
     * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
     * 
     * @param shadowXOffset
     *        Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would
     *        result in a shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withShadowXOffset(Integer shadowXOffset) {
        setShadowXOffset(shadowXOffset);
        return this;
    }

    /**
     * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
     * 
     * @param shadowYOffset
     *        Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result
     *        in a shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
     */

    public void setShadowYOffset(Integer shadowYOffset) {
        this.shadowYOffset = shadowYOffset;
    }

    /**
     * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
     * 
     * @return Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would
     *         result in a shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
     */

    public Integer getShadowYOffset() {
        return this.shadowYOffset;
    }

    /**
     * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
     * 
     * @param shadowYOffset
     *        Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result
     *        in a shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withShadowYOffset(Integer shadowYOffset) {
        setShadowYOffset(shadowYOffset);
        return this;
    }

    /**
     * Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable for
     * Teletext inputs and DVB-Sub/Burn-in outputs.
     * 
     * @param teletextGridControl
     *        Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable
     *        for Teletext inputs and DVB-Sub/Burn-in outputs.
     * @see DvbSubDestinationTeletextGridControl
     */

    public void setTeletextGridControl(String teletextGridControl) {
        this.teletextGridControl = teletextGridControl;
    }

    /**
     * Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable for
     * Teletext inputs and DVB-Sub/Burn-in outputs.
     * 
     * @return Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable
     *         for Teletext inputs and DVB-Sub/Burn-in outputs.
     * @see DvbSubDestinationTeletextGridControl
     */

    public String getTeletextGridControl() {
        return this.teletextGridControl;
    }

    /**
     * Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable for
     * Teletext inputs and DVB-Sub/Burn-in outputs.
     * 
     * @param teletextGridControl
     *        Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable
     *        for Teletext inputs and DVB-Sub/Burn-in outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationTeletextGridControl
     */

    public DvbSubDestinationSettings withTeletextGridControl(String teletextGridControl) {
        setTeletextGridControl(teletextGridControl);
        return this;
    }

    /**
     * Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable for
     * Teletext inputs and DVB-Sub/Burn-in outputs.
     * 
     * @param teletextGridControl
     *        Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable
     *        for Teletext inputs and DVB-Sub/Burn-in outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubDestinationTeletextGridControl
     */

    public DvbSubDestinationSettings withTeletextGridControl(DvbSubDestinationTeletextGridControl teletextGridControl) {
        this.teletextGridControl = teletextGridControl.toString();
        return this;
    }

    /**
     * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10
     * would result in the captions starting 10 pixels from the left of the output. If no explicit xPosition is
     * provided, the horizontal caption position will be determined by the alignment parameter. This option is not valid
     * for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the
     * caption stream. All burn-in and DVB-Sub font settings must match.
     * 
     * @param xPosition
     *        Specifies the horizontal position of the caption relative to the left side of the output in pixels. A
     *        value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit
     *        xPosition is provided, the horizontal caption position will be determined by the alignment parameter. This
     *        option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are
     *        already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
     */

    public void setXPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10
     * would result in the captions starting 10 pixels from the left of the output. If no explicit xPosition is
     * provided, the horizontal caption position will be determined by the alignment parameter. This option is not valid
     * for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the
     * caption stream. All burn-in and DVB-Sub font settings must match.
     * 
     * @return Specifies the horizontal position of the caption relative to the left side of the output in pixels. A
     *         value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit
     *         xPosition is provided, the horizontal caption position will be determined by the alignment parameter.
     *         This option is not valid for source captions that are STL, 608/embedded or teletext. These source
     *         settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
     */

    public Integer getXPosition() {
        return this.xPosition;
    }

    /**
     * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10
     * would result in the captions starting 10 pixels from the left of the output. If no explicit xPosition is
     * provided, the horizontal caption position will be determined by the alignment parameter. This option is not valid
     * for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the
     * caption stream. All burn-in and DVB-Sub font settings must match.
     * 
     * @param xPosition
     *        Specifies the horizontal position of the caption relative to the left side of the output in pixels. A
     *        value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit
     *        xPosition is provided, the horizontal caption position will be determined by the alignment parameter. This
     *        option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are
     *        already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withXPosition(Integer xPosition) {
        setXPosition(xPosition);
        return this;
    }

    /**
     * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would
     * result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is provided, the
     * caption will be positioned towards the bottom of the output. This option is not valid for source captions that are
     * STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in
     * and DVB-Sub font settings must match.
     * 
     * @param yPosition
     *        Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10
     *        would result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is
     *        provided, the caption will be positioned towards the bottom of the output. This option is not valid for
     *        source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by
     *        the caption stream. All burn-in and DVB-Sub font settings must match.
     */

    public void setYPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would
     * result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is provided, the
     * caption will be positioned towards the bottom of the output. This option is not valid for source captions that are
     * STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in
     * and DVB-Sub font settings must match.
     * 
     * @return Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10
     *         would result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is
     *         provided, the caption will be positioned towards the bottom of the output. This option is not valid for
     *         source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by
     *         the caption stream. All burn-in and DVB-Sub font settings must match.
     */

    public Integer getYPosition() {
        return this.yPosition;
    }

    /**
     * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would
     * result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is provided, the
     * caption will be positioned towards the bottom of the output. This option is not valid for source captions that are
     * STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in
     * and DVB-Sub font settings must match.
     * 
     * @param yPosition
     *        Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10
     *        would result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is
     *        provided, the caption will be positioned towards the bottom of the output. This option is not valid for
     *        source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by
     *        the caption stream. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withYPosition(Integer yPosition) {
        setYPosition(yPosition);
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
        if (getAlignment() != null)
            sb.append("Alignment: ").append(getAlignment()).append(",");
        if (getBackgroundColor() != null)
            sb.append("BackgroundColor: ").append(getBackgroundColor()).append(",");
        if (getBackgroundOpacity() != null)
            sb.append("BackgroundOpacity: ").append(getBackgroundOpacity()).append(",");
        if (getFont() != null)
            sb.append("Font: ").append(getFont()).append(",");
        if (getFontColor() != null)
            sb.append("FontColor: ").append(getFontColor()).append(",");
        if (getFontOpacity() != null)
            sb.append("FontOpacity: ").append(getFontOpacity()).append(",");
        if (getFontResolution() != null)
            sb.append("FontResolution: ").append(getFontResolution()).append(",");
        if (getFontSize() != null)
            sb.append("FontSize: ").append(getFontSize()).append(",");
        if (getOutlineColor() != null)
            sb.append("OutlineColor: ").append(getOutlineColor()).append(",");
        if (getOutlineSize() != null)
            sb.append("OutlineSize: ").append(getOutlineSize()).append(",");
        if (getShadowColor() != null)
            sb.append("ShadowColor: ").append(getShadowColor()).append(",");
        if (getShadowOpacity() != null)
            sb.append("ShadowOpacity: ").append(getShadowOpacity()).append(",");
        if (getShadowXOffset() != null)
            sb.append("ShadowXOffset: ").append(getShadowXOffset()).append(",");
        if (getShadowYOffset() != null)
            sb.append("ShadowYOffset: ").append(getShadowYOffset()).append(",");
        if (getTeletextGridControl() != null)
            sb.append("TeletextGridControl: ").append(getTeletextGridControl()).append(",");
        if (getXPosition() != null)
            sb.append("XPosition: ").append(getXPosition()).append(",");
        if (getYPosition() != null)
            sb.append("YPosition: ").append(getYPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DvbSubDestinationSettings == false)
            return false;
        DvbSubDestinationSettings other = (DvbSubDestinationSettings) obj;
        if (other.getAlignment() == null ^ this.getAlignment() == null)
            return false;
        if (other.getAlignment() != null && other.getAlignment().equals(this.getAlignment()) == false)
            return false;
        if (other.getBackgroundColor() == null ^ this.getBackgroundColor() == null)
            return false;
        if (other.getBackgroundColor() != null && other.getBackgroundColor().equals(this.getBackgroundColor()) == false)
            return false;
        if (other.getBackgroundOpacity() == null ^ this.getBackgroundOpacity() == null)
            return false;
        if (other.getBackgroundOpacity() != null && other.getBackgroundOpacity().equals(this.getBackgroundOpacity()) == false)
            return false;
        if (other.getFont() == null ^ this.getFont() == null)
            return false;
        if (other.getFont() != null && other.getFont().equals(this.getFont()) == false)
            return false;
        if (other.getFontColor() == null ^ this.getFontColor() == null)
            return false;
        if (other.getFontColor() != null && other.getFontColor().equals(this.getFontColor()) == false)
            return false;
        if (other.getFontOpacity() == null ^ this.getFontOpacity() == null)
            return false;
        if (other.getFontOpacity() != null && other.getFontOpacity().equals(this.getFontOpacity()) == false)
            return false;
        if (other.getFontResolution() == null ^ this.getFontResolution() == null)
            return false;
        if (other.getFontResolution() != null && other.getFontResolution().equals(this.getFontResolution()) == false)
            return false;
        if (other.getFontSize() == null ^ this.getFontSize() == null)
            return false;
        if (other.getFontSize() != null && other.getFontSize().equals(this.getFontSize()) == false)
            return false;
        if (other.getOutlineColor() == null ^ this.getOutlineColor() == null)
            return false;
        if (other.getOutlineColor() != null && other.getOutlineColor().equals(this.getOutlineColor()) == false)
            return false;
        if (other.getOutlineSize() == null ^ this.getOutlineSize() == null)
            return false;
        if (other.getOutlineSize() != null && other.getOutlineSize().equals(this.getOutlineSize()) == false)
            return false;
        if (other.getShadowColor() == null ^ this.getShadowColor() == null)
            return false;
        if (other.getShadowColor() != null && other.getShadowColor().equals(this.getShadowColor()) == false)
            return false;
        if (other.getShadowOpacity() == null ^ this.getShadowOpacity() == null)
            return false;
        if (other.getShadowOpacity() != null && other.getShadowOpacity().equals(this.getShadowOpacity()) == false)
            return false;
        if (other.getShadowXOffset() == null ^ this.getShadowXOffset() == null)
            return false;
        if (other.getShadowXOffset() != null && other.getShadowXOffset().equals(this.getShadowXOffset()) == false)
            return false;
        if (other.getShadowYOffset() == null ^ this.getShadowYOffset() == null)
            return false;
        if (other.getShadowYOffset() != null && other.getShadowYOffset().equals(this.getShadowYOffset()) == false)
            return false;
        if (other.getTeletextGridControl() == null ^ this.getTeletextGridControl() == null)
            return false;
        if (other.getTeletextGridControl() != null && other.getTeletextGridControl().equals(this.getTeletextGridControl()) == false)
            return false;
        if (other.getXPosition() == null ^ this.getXPosition() == null)
            return false;
        if (other.getXPosition() != null && other.getXPosition().equals(this.getXPosition()) == false)
            return false;
        if (other.getYPosition() == null ^ this.getYPosition() == null)
            return false;
        if (other.getYPosition() != null && other.getYPosition().equals(this.getYPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlignment() == null) ? 0 : getAlignment().hashCode());
        hashCode = prime * hashCode + ((getBackgroundColor() == null) ? 0 : getBackgroundColor().hashCode());
        hashCode = prime * hashCode + ((getBackgroundOpacity() == null) ? 0 : getBackgroundOpacity().hashCode());
        hashCode = prime * hashCode + ((getFont() == null) ? 0 : getFont().hashCode());
        hashCode = prime * hashCode + ((getFontColor() == null) ? 0 : getFontColor().hashCode());
        hashCode = prime * hashCode + ((getFontOpacity() == null) ? 0 : getFontOpacity().hashCode());
        hashCode = prime * hashCode + ((getFontResolution() == null) ? 0 : getFontResolution().hashCode());
        hashCode = prime * hashCode + ((getFontSize() == null) ? 0 : getFontSize().hashCode());
        hashCode = prime * hashCode + ((getOutlineColor() == null) ? 0 : getOutlineColor().hashCode());
        hashCode = prime * hashCode + ((getOutlineSize() == null) ? 0 : getOutlineSize().hashCode());
        hashCode = prime * hashCode + ((getShadowColor() == null) ? 0 : getShadowColor().hashCode());
        hashCode = prime * hashCode + ((getShadowOpacity() == null) ? 0 : getShadowOpacity().hashCode());
        hashCode = prime * hashCode + ((getShadowXOffset() == null) ? 0 : getShadowXOffset().hashCode());
        hashCode = prime * hashCode + ((getShadowYOffset() == null) ? 0 : getShadowYOffset().hashCode());
        hashCode = prime * hashCode + ((getTeletextGridControl() == null) ? 0 : getTeletextGridControl().hashCode());
        hashCode = prime * hashCode + ((getXPosition() == null) ? 0 : getXPosition().hashCode());
        hashCode = prime * hashCode + ((getYPosition() == null) ? 0 : getYPosition().hashCode());
        return hashCode;
    }

    @Override
    public DvbSubDestinationSettings clone() {
        try {
            return (DvbSubDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.DvbSubDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
