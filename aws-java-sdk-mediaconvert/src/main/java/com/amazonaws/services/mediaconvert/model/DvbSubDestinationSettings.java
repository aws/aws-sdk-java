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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings related to DVB-Sub captions. Set up DVB-Sub captions in the same output as your video. For more information,
 * see https://docs.aws.amazon.com/mediaconvert/latest/ug/dvb-sub-output-captions.html. When you work directly in your
 * JSON job specification, include this object and any required children when you set destinationType to DVB_SUB.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DvbSubDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DvbSubDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will
     * placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to
     * the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the
     * font will be justified (either left or centered) relative to those coordinates. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     */
    private String alignment;
    /**
     * Ignore this setting unless Style Passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set
     * to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color
     * controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies
     * to white text in your input captions. For example, if your font color setting is Yellow, and your input captions
     * have red and white text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font
     * color setting applies to all of your output captions text.
     */
    private String applyFontColor;
    /**
     * Specify the color of the rectangle behind the captions. Leave background color (BackgroundColor) blank and set
     * Style passthrough (StylePassthrough) to enabled to use the background color data from your input captions, if
     * present.
     */
    private String backgroundColor;
    /**
     * Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and 255 is
     * opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the background
     * style information in your input captions to your output captions. If Style passthrough is set to disabled, leave
     * blank to use a value of 0 and remove all backgrounds from your output captions. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     */
    private Integer backgroundOpacity;
    /**
     * Specify how MediaConvert handles the display definition segment (DDS). Keep the default, None (NONE), to exclude
     * the DDS from this set of captions. Choose No display window (NO_DISPLAY_WINDOW) to have MediaConvert include the
     * DDS but not include display window data. In this case, MediaConvert writes that information to the page
     * composition segment (PCS) instead. Choose Specify (SPECIFIED) to have MediaConvert set up the display window based
     * on the values that you specify in related job settings. For video resolutions that are 576 pixels or smaller in
     * height, MediaConvert doesn't include the DDS, regardless of the value you choose for DDS handling (ddsHandling).
     * In this case, it doesn't write the display window data to the PCS either. Related settings: Use the settings DDS
     * x-coordinate (ddsXCoordinate) and DDS y-coordinate (ddsYCoordinate) to specify the offset between the top left
     * corner of the display window and the top left corner of the video frame. All burn-in and DVB-Sub font settings
     * must match.
     */
    private String ddsHandling;
    /**
     * Use this setting, along with DDS y-coordinate (ddsYCoordinate), to specify the upper left corner of the display
     * definition segment (DDS) display window. With this setting, specify the distance, in pixels, between the left
     * side of the frame and the left side of the DDS display window. Keep the default value, 0, to have MediaConvert
     * automatically choose this offset. Related setting: When you use this setting, you must set DDS handling
     * (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to determine whether to write page
     * position data to the DDS or to the page composition segment (PCS). All burn-in and DVB-Sub font settings must
     * match.
     */
    private Integer ddsXCoordinate;
    /**
     * Use this setting, along with DDS x-coordinate (ddsXCoordinate), to specify the upper left corner of the display
     * definition segment (DDS) display window. With this setting, specify the distance, in pixels, between the top of
     * the frame and the top of the DDS display window. Keep the default value, 0, to have MediaConvert automatically
     * choose this offset. Related setting: When you use this setting, you must set DDS handling (ddsHandling) to a value
     * other than None (NONE). MediaConvert uses these values to determine whether to write page position data to the DDS
     * or to the page composition segment (PCS). All burn-in and DVB-Sub font settings must match.
     */
    private Integer ddsYCoordinate;
    /**
     * Specify the font that you want the service to use for your burn in captions when your input captions specify a
     * font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match (BEST_MATCH), or
     * leave blank, MediaConvert uses a supported font that most closely matches the font that your input captions
     * specify. When there are multiple unsupported fonts in your input captions, MediaConvert matches each font with the
     * supported font that matches best. When you explicitly choose a replacement font, MediaConvert uses that font to
     * replace all unsupported fonts from your input.
     */
    private String fallbackFont;
    /**
     * Specify the color of the captions text. Leave Font color (FontColor) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the font color data from your input captions, if present. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     */
    private String fontColor;
    /**
     * Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     */
    private Integer fontOpacity;
    /**
     * Specify the Font resolution (FontResolution) in DPI (dots per inch). Within your job settings, all of your
     * DVB-Sub settings must be identical.
     */
    private Integer fontResolution;
    /**
     * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine
     * the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT)
     * if your input font script uses Simplified or Traditional Chinese. Within your job settings, all of your DVB-Sub
     * settings must be identical.
     */
    private String fontScript;
    /**
     * Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for automatic
     * font size. Within your job settings, all of your DVB-Sub settings must be identical.
     */
    private Integer fontSize;
    /**
     * Specify the height, in pixels, of this set of DVB-Sub captions. The default value is 576 pixels. Related setting:
     * When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). All burn-in
     * and DVB-Sub font settings must match.
     */
    private Integer height;
    /**
     * Ignore this setting unless your Font color is set to Hex. Enter either six or eight hexidecimal digits,
     * representing red, green, and blue, with two optional extra digits for alpha. For example a value of 1122AABB is a
     * red value of 0x11, a green value of 0x22, a blue value of 0xAA, and an alpha value of 0xBB.
     */
    private String hexFontColor;
    /**
     * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough)
     * to enabled to use the font outline color data from your input captions, if present. Within your job settings, all
     * of your DVB-Sub settings must be identical.
     */
    private String outlineColor;
    /**
     * Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set Style
     * passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if present.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     */
    private Integer outlineSize;
    /**
     * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     * passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     */
    private String shadowColor;
    /**
     * Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If
     * Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to pass
     * through the shadow style information in your input captions to your output captions. If Style passthrough is set
     * to disabled, leave blank to use a value of 0 and remove all shadows from your output captions. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     */
    private Integer shadowOpacity;
    /**
     * Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left. Within your job settings, all of your DVB-Sub settings must be identical.
     */
    private Integer shadowXOffset;
    /**
     * Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if present. Within your
     * job settings, all of your DVB-Sub settings must be identical.
     */
    private Integer shadowYOffset;
    /**
     * Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position information
     * from your input captions. MediaConvert uses default settings for any missing style and position information in
     * your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore the style and position
     * information from your input captions and use default settings: white text with black outlining, bottom-center
     * positioning, and automatic sizing. Whether you set Style passthrough to enabled or not, you can also choose to
     * manually override any of the individual style and position settings.
     */
    private String stylePassthrough;
    /**
     * Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your
     * subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
     */
    private String subtitlingType;
    /**
     * Specify whether the Text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     * depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions
     * file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     */
    private String teletextSpacing;
    /**
     * Specify the width, in pixels, of this set of DVB-Sub captions. The default value is 720 pixels. Related setting:
     * When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). All burn-in
     * and DVB-Sub font settings must match.
     */
    private Integer width;
    /**
     * Specify the horizontal position (XPosition) of the captions, relative to the left side of the outputin pixels. A
     * value of 10 would result in the captions starting 10 pixels from the left ofthe output. If no explicit x_position
     * is provided, the horizontal caption position will bedetermined by the alignment parameter. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     */
    private Integer xPosition;
    /**
     * Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A value
     * of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is
     * provided, the caption will be positioned towards the bottom of the output. Within your job settings, all of your
     * DVB-Sub settings must be identical.
     */
    private Integer yPosition;

    /**
     * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will
     * placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to
     * the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the
     * font will be justified (either left or centered) relative to those coordinates. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     * 
     * @param alignment
     *        Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to
     *        centered will placethe captions at the bottom center of the output. Similarly, setting a left alignment
     *        willalign captions to the bottom left of the output. If x and y positions are given in conjunction with
     *        the alignment parameter, the font will be justified (either left or centered) relative to those
     *        coordinates. Within your job settings, all of your DVB-Sub settings must be identical.
     * @see DvbSubtitleAlignment
     */

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    /**
     * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will
     * placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to
     * the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the
     * font will be justified (either left or centered) relative to those coordinates. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     * 
     * @return Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to
     *         centered will placethe captions at the bottom center of the output. Similarly, setting a left alignment
     *         willalign captions to the bottom left of the output. If x and y positions are given in conjunction with
     *         the alignment parameter, the font will be justified (either left or centered) relative to those
     *         coordinates. Within your job settings, all of your DVB-Sub settings must be identical.
     * @see DvbSubtitleAlignment
     */

    public String getAlignment() {
        return this.alignment;
    }

    /**
     * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will
     * placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to
     * the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the
     * font will be justified (either left or centered) relative to those coordinates. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     * 
     * @param alignment
     *        Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to
     *        centered will placethe captions at the bottom center of the output. Similarly, setting a left alignment
     *        willalign captions to the bottom left of the output. If x and y positions are given in conjunction with
     *        the alignment parameter, the font will be justified (either left or centered) relative to those
     *        coordinates. Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleAlignment
     */

    public DvbSubDestinationSettings withAlignment(String alignment) {
        setAlignment(alignment);
        return this;
    }

    /**
     * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will
     * placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to
     * the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the
     * font will be justified (either left or centered) relative to those coordinates. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     * 
     * @param alignment
     *        Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to
     *        centered will placethe captions at the bottom center of the output. Similarly, setting a left alignment
     *        willalign captions to the bottom left of the output. If x and y positions are given in conjunction with
     *        the alignment parameter, the font will be justified (either left or centered) relative to those
     *        coordinates. Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleAlignment
     */

    public DvbSubDestinationSettings withAlignment(DvbSubtitleAlignment alignment) {
        this.alignment = alignment.toString();
        return this;
    }

    /**
     * Ignore this setting unless Style Passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set
     * to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color
     * controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies
     * to white text in your input captions. For example, if your font color setting is Yellow, and your input captions
     * have red and white text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font
     * color setting applies to all of your output captions text.
     * 
     * @param applyFontColor
     *        Ignore this setting unless Style Passthrough (StylePassthrough) is set to Enabled and Font color
     *        (FontColor) set to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for
     *        additional font color controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your
     *        font color setting only applies to white text in your input captions. For example, if your font color
     *        setting is Yellow, and your input captions have red and white text, your output captions will have red and
     *        yellow text. When you choose ALL_TEXT, your font color setting applies to all of your output captions
     *        text.
     * @see DvbSubtitleApplyFontColor
     */

    public void setApplyFontColor(String applyFontColor) {
        this.applyFontColor = applyFontColor;
    }

    /**
     * Ignore this setting unless Style Passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set
     * to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color
     * controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies
     * to white text in your input captions. For example, if your font color setting is Yellow, and your input captions
     * have red and white text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font
     * color setting applies to all of your output captions text.
     * 
     * @return Ignore this setting unless Style Passthrough (StylePassthrough) is set to Enabled and Font color
     *         (FontColor) set to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for
     *         additional font color controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your
     *         font color setting only applies to white text in your input captions. For example, if your font color
     *         setting is Yellow, and your input captions have red and white text, your output captions will have red
     *         and yellow text. When you choose ALL_TEXT, your font color setting applies to all of your output captions
     *         text.
     * @see DvbSubtitleApplyFontColor
     */

    public String getApplyFontColor() {
        return this.applyFontColor;
    }

    /**
     * Ignore this setting unless Style Passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set
     * to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color
     * controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies
     * to white text in your input captions. For example, if your font color setting is Yellow, and your input captions
     * have red and white text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font
     * color setting applies to all of your output captions text.
     * 
     * @param applyFontColor
     *        Ignore this setting unless Style Passthrough (StylePassthrough) is set to Enabled and Font color
     *        (FontColor) set to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for
     *        additional font color controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your
     *        font color setting only applies to white text in your input captions. For example, if your font color
     *        setting is Yellow, and your input captions have red and white text, your output captions will have red and
     *        yellow text. When you choose ALL_TEXT, your font color setting applies to all of your output captions
     *        text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleApplyFontColor
     */

    public DvbSubDestinationSettings withApplyFontColor(String applyFontColor) {
        setApplyFontColor(applyFontColor);
        return this;
    }

    /**
     * Ignore this setting unless Style Passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set
     * to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color
     * controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies
     * to white text in your input captions. For example, if your font color setting is Yellow, and your input captions
     * have red and white text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font
     * color setting applies to all of your output captions text.
     * 
     * @param applyFontColor
     *        Ignore this setting unless Style Passthrough (StylePassthrough) is set to Enabled and Font color
     *        (FontColor) set to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for
     *        additional font color controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your
     *        font color setting only applies to white text in your input captions. For example, if your font color
     *        setting is Yellow, and your input captions have red and white text, your output captions will have red and
     *        yellow text. When you choose ALL_TEXT, your font color setting applies to all of your output captions
     *        text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleApplyFontColor
     */

    public DvbSubDestinationSettings withApplyFontColor(DvbSubtitleApplyFontColor applyFontColor) {
        this.applyFontColor = applyFontColor.toString();
        return this;
    }

    /**
     * Specify the color of the rectangle behind the captions. Leave background color (BackgroundColor) blank and set
     * Style passthrough (StylePassthrough) to enabled to use the background color data from your input captions, if
     * present.
     * 
     * @param backgroundColor
     *        Specify the color of the rectangle behind the captions. Leave background color (BackgroundColor) blank and
     *        set Style passthrough (StylePassthrough) to enabled to use the background color data from your input
     *        captions, if present.
     * @see DvbSubtitleBackgroundColor
     */

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * Specify the color of the rectangle behind the captions. Leave background color (BackgroundColor) blank and set
     * Style passthrough (StylePassthrough) to enabled to use the background color data from your input captions, if
     * present.
     * 
     * @return Specify the color of the rectangle behind the captions. Leave background color (BackgroundColor) blank
     *         and set Style passthrough (StylePassthrough) to enabled to use the background color data from your input
     *         captions, if present.
     * @see DvbSubtitleBackgroundColor
     */

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * Specify the color of the rectangle behind the captions. Leave background color (BackgroundColor) blank and set
     * Style passthrough (StylePassthrough) to enabled to use the background color data from your input captions, if
     * present.
     * 
     * @param backgroundColor
     *        Specify the color of the rectangle behind the captions. Leave background color (BackgroundColor) blank and
     *        set Style passthrough (StylePassthrough) to enabled to use the background color data from your input
     *        captions, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleBackgroundColor
     */

    public DvbSubDestinationSettings withBackgroundColor(String backgroundColor) {
        setBackgroundColor(backgroundColor);
        return this;
    }

    /**
     * Specify the color of the rectangle behind the captions. Leave background color (BackgroundColor) blank and set
     * Style passthrough (StylePassthrough) to enabled to use the background color data from your input captions, if
     * present.
     * 
     * @param backgroundColor
     *        Specify the color of the rectangle behind the captions. Leave background color (BackgroundColor) blank and
     *        set Style passthrough (StylePassthrough) to enabled to use the background color data from your input
     *        captions, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleBackgroundColor
     */

    public DvbSubDestinationSettings withBackgroundColor(DvbSubtitleBackgroundColor backgroundColor) {
        this.backgroundColor = backgroundColor.toString();
        return this;
    }

    /**
     * Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and 255 is
     * opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the background
     * style information in your input captions to your output captions. If Style passthrough is set to disabled, leave
     * blank to use a value of 0 and remove all backgrounds from your output captions. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     * 
     * @param backgroundOpacity
     *        Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and
     *        255 is opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the
     *        background style information in your input captions to your output captions. If Style passthrough is set
     *        to disabled, leave blank to use a value of 0 and remove all backgrounds from your output captions. Within
     *        your job settings, all of your DVB-Sub settings must be identical.
     */

    public void setBackgroundOpacity(Integer backgroundOpacity) {
        this.backgroundOpacity = backgroundOpacity;
    }

    /**
     * Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and 255 is
     * opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the background
     * style information in your input captions to your output captions. If Style passthrough is set to disabled, leave
     * blank to use a value of 0 and remove all backgrounds from your output captions. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     * 
     * @return Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and
     *         255 is opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the
     *         background style information in your input captions to your output captions. If Style passthrough is set
     *         to disabled, leave blank to use a value of 0 and remove all backgrounds from your output captions. Within
     *         your job settings, all of your DVB-Sub settings must be identical.
     */

    public Integer getBackgroundOpacity() {
        return this.backgroundOpacity;
    }

    /**
     * Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and 255 is
     * opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the background
     * style information in your input captions to your output captions. If Style passthrough is set to disabled, leave
     * blank to use a value of 0 and remove all backgrounds from your output captions. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     * 
     * @param backgroundOpacity
     *        Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and
     *        255 is opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the
     *        background style information in your input captions to your output captions. If Style passthrough is set
     *        to disabled, leave blank to use a value of 0 and remove all backgrounds from your output captions. Within
     *        your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withBackgroundOpacity(Integer backgroundOpacity) {
        setBackgroundOpacity(backgroundOpacity);
        return this;
    }

    /**
     * Specify how MediaConvert handles the display definition segment (DDS). Keep the default, None (NONE), to exclude
     * the DDS from this set of captions. Choose No display window (NO_DISPLAY_WINDOW) to have MediaConvert include the
     * DDS but not include display window data. In this case, MediaConvert writes that information to the page
     * composition segment (PCS) instead. Choose Specify (SPECIFIED) to have MediaConvert set up the display window based
     * on the values that you specify in related job settings. For video resolutions that are 576 pixels or smaller in
     * height, MediaConvert doesn't include the DDS, regardless of the value you choose for DDS handling (ddsHandling).
     * In this case, it doesn't write the display window data to the PCS either. Related settings: Use the settings DDS
     * x-coordinate (ddsXCoordinate) and DDS y-coordinate (ddsYCoordinate) to specify the offset between the top left
     * corner of the display window and the top left corner of the video frame. All burn-in and DVB-Sub font settings
     * must match.
     * 
     * @param ddsHandling
     *        Specify how MediaConvert handles the display definition segment (DDS). Keep the default, None (NONE), to
     *        exclude the DDS from this set of captions. Choose No display window (NO_DISPLAY_WINDOW) to have
     *        MediaConvert include the DDS but not include display window data. In this case, MediaConvert writes that
     *        information to the page composition segment (PCS) instead. Choose Specify (SPECIFIED) to have MediaConvert
     *        set up the display window based on the values that you specify in related job settings. For video
     *        resolutions that are 576 pixels or smaller in height, MediaConvert doesn't include the DDS, regardless of
     *        the value you choose for DDS handling (ddsHandling). In this case, it doesn't write the display window
     *        data to the PCS either. Related settings: Use the settings DDS x-coordinate (ddsXCoordinate) and DDS
     *        y-coordinate (ddsYCoordinate) to specify the offset between the top left corner of the display window and
     *        the top left corner of the video frame. All burn-in and DVB-Sub font settings must match.
     * @see DvbddsHandling
     */

    public void setDdsHandling(String ddsHandling) {
        this.ddsHandling = ddsHandling;
    }

    /**
     * Specify how MediaConvert handles the display definition segment (DDS). Keep the default, None (NONE), to exclude
     * the DDS from this set of captions. Choose No display window (NO_DISPLAY_WINDOW) to have MediaConvert include the
     * DDS but not include display window data. In this case, MediaConvert writes that information to the page
     * composition segment (PCS) instead. Choose Specify (SPECIFIED) to have MediaConvert set up the display window based
     * on the values that you specify in related job settings. For video resolutions that are 576 pixels or smaller in
     * height, MediaConvert doesn't include the DDS, regardless of the value you choose for DDS handling (ddsHandling).
     * In this case, it doesn't write the display window data to the PCS either. Related settings: Use the settings DDS
     * x-coordinate (ddsXCoordinate) and DDS y-coordinate (ddsYCoordinate) to specify the offset between the top left
     * corner of the display window and the top left corner of the video frame. All burn-in and DVB-Sub font settings
     * must match.
     * 
     * @return Specify how MediaConvert handles the display definition segment (DDS). Keep the default, None (NONE), to
     *         exclude the DDS from this set of captions. Choose No display window (NO_DISPLAY_WINDOW) to have
     *         MediaConvert include the DDS but not include display window data. In this case, MediaConvert writes that
     *         information to the page composition segment (PCS) instead. Choose Specify (SPECIFIED) to have
     *         MediaConvert set up the display window based on the values that you specify in related job settings. For
     *         video resolutions that are 576 pixels or smaller in height, MediaConvert doesn't include the DDS,
     *         regardless of the value you choose for DDS handling (ddsHandling). In this case, it doesn't write the
     *         display window data to the PCS either. Related settings: Use the settings DDS x-coordinate
     *         (ddsXCoordinate) and DDS y-coordinate (ddsYCoordinate) to specify the offset between the top left corner
     *         of the display window and the top left corner of the video frame. All burn-in and DVB-Sub font settings
     *         must match.
     * @see DvbddsHandling
     */

    public String getDdsHandling() {
        return this.ddsHandling;
    }

    /**
     * Specify how MediaConvert handles the display definition segment (DDS). Keep the default, None (NONE), to exclude
     * the DDS from this set of captions. Choose No display window (NO_DISPLAY_WINDOW) to have MediaConvert include the
     * DDS but not include display window data. In this case, MediaConvert writes that information to the page
     * composition segment (PCS) instead. Choose Specify (SPECIFIED) to have MediaConvert set up the display window based
     * on the values that you specify in related job settings. For video resolutions that are 576 pixels or smaller in
     * height, MediaConvert doesn't include the DDS, regardless of the value you choose for DDS handling (ddsHandling).
     * In this case, it doesn't write the display window data to the PCS either. Related settings: Use the settings DDS
     * x-coordinate (ddsXCoordinate) and DDS y-coordinate (ddsYCoordinate) to specify the offset between the top left
     * corner of the display window and the top left corner of the video frame. All burn-in and DVB-Sub font settings
     * must match.
     * 
     * @param ddsHandling
     *        Specify how MediaConvert handles the display definition segment (DDS). Keep the default, None (NONE), to
     *        exclude the DDS from this set of captions. Choose No display window (NO_DISPLAY_WINDOW) to have
     *        MediaConvert include the DDS but not include display window data. In this case, MediaConvert writes that
     *        information to the page composition segment (PCS) instead. Choose Specify (SPECIFIED) to have MediaConvert
     *        set up the display window based on the values that you specify in related job settings. For video
     *        resolutions that are 576 pixels or smaller in height, MediaConvert doesn't include the DDS, regardless of
     *        the value you choose for DDS handling (ddsHandling). In this case, it doesn't write the display window
     *        data to the PCS either. Related settings: Use the settings DDS x-coordinate (ddsXCoordinate) and DDS
     *        y-coordinate (ddsYCoordinate) to specify the offset between the top left corner of the display window and
     *        the top left corner of the video frame. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbddsHandling
     */

    public DvbSubDestinationSettings withDdsHandling(String ddsHandling) {
        setDdsHandling(ddsHandling);
        return this;
    }

    /**
     * Specify how MediaConvert handles the display definition segment (DDS). Keep the default, None (NONE), to exclude
     * the DDS from this set of captions. Choose No display window (NO_DISPLAY_WINDOW) to have MediaConvert include the
     * DDS but not include display window data. In this case, MediaConvert writes that information to the page
     * composition segment (PCS) instead. Choose Specify (SPECIFIED) to have MediaConvert set up the display window based
     * on the values that you specify in related job settings. For video resolutions that are 576 pixels or smaller in
     * height, MediaConvert doesn't include the DDS, regardless of the value you choose for DDS handling (ddsHandling).
     * In this case, it doesn't write the display window data to the PCS either. Related settings: Use the settings DDS
     * x-coordinate (ddsXCoordinate) and DDS y-coordinate (ddsYCoordinate) to specify the offset between the top left
     * corner of the display window and the top left corner of the video frame. All burn-in and DVB-Sub font settings
     * must match.
     * 
     * @param ddsHandling
     *        Specify how MediaConvert handles the display definition segment (DDS). Keep the default, None (NONE), to
     *        exclude the DDS from this set of captions. Choose No display window (NO_DISPLAY_WINDOW) to have
     *        MediaConvert include the DDS but not include display window data. In this case, MediaConvert writes that
     *        information to the page composition segment (PCS) instead. Choose Specify (SPECIFIED) to have MediaConvert
     *        set up the display window based on the values that you specify in related job settings. For video
     *        resolutions that are 576 pixels or smaller in height, MediaConvert doesn't include the DDS, regardless of
     *        the value you choose for DDS handling (ddsHandling). In this case, it doesn't write the display window
     *        data to the PCS either. Related settings: Use the settings DDS x-coordinate (ddsXCoordinate) and DDS
     *        y-coordinate (ddsYCoordinate) to specify the offset between the top left corner of the display window and
     *        the top left corner of the video frame. All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbddsHandling
     */

    public DvbSubDestinationSettings withDdsHandling(DvbddsHandling ddsHandling) {
        this.ddsHandling = ddsHandling.toString();
        return this;
    }

    /**
     * Use this setting, along with DDS y-coordinate (ddsYCoordinate), to specify the upper left corner of the display
     * definition segment (DDS) display window. With this setting, specify the distance, in pixels, between the left
     * side of the frame and the left side of the DDS display window. Keep the default value, 0, to have MediaConvert
     * automatically choose this offset. Related setting: When you use this setting, you must set DDS handling
     * (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to determine whether to write page
     * position data to the DDS or to the page composition segment (PCS). All burn-in and DVB-Sub font settings must
     * match.
     * 
     * @param ddsXCoordinate
     *        Use this setting, along with DDS y-coordinate (ddsYCoordinate), to specify the upper left corner of the
     *        display definition segment (DDS) display window. With this setting, specify the distance, in pixels,
     *        between the left side of the frame and the left side of the DDS display window. Keep the default value, 0,
     *        to have MediaConvert automatically choose this offset. Related setting: When you use this setting, you
     *        must set DDS handling (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to
     *        determine whether to write page position data to the DDS or to the page composition segment (PCS). All
     *        burn-in and DVB-Sub font settings must match.
     */

    public void setDdsXCoordinate(Integer ddsXCoordinate) {
        this.ddsXCoordinate = ddsXCoordinate;
    }

    /**
     * Use this setting, along with DDS y-coordinate (ddsYCoordinate), to specify the upper left corner of the display
     * definition segment (DDS) display window. With this setting, specify the distance, in pixels, between the left
     * side of the frame and the left side of the DDS display window. Keep the default value, 0, to have MediaConvert
     * automatically choose this offset. Related setting: When you use this setting, you must set DDS handling
     * (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to determine whether to write page
     * position data to the DDS or to the page composition segment (PCS). All burn-in and DVB-Sub font settings must
     * match.
     * 
     * @return Use this setting, along with DDS y-coordinate (ddsYCoordinate), to specify the upper left corner of the
     *         display definition segment (DDS) display window. With this setting, specify the distance, in pixels,
     *         between the left side of the frame and the left side of the DDS display window. Keep the default value,
     *         0, to have MediaConvert automatically choose this offset. Related setting: When you use this setting, you
     *         must set DDS handling (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to
     *         determine whether to write page position data to the DDS or to the page composition segment (PCS). All
     *         burn-in and DVB-Sub font settings must match.
     */

    public Integer getDdsXCoordinate() {
        return this.ddsXCoordinate;
    }

    /**
     * Use this setting, along with DDS y-coordinate (ddsYCoordinate), to specify the upper left corner of the display
     * definition segment (DDS) display window. With this setting, specify the distance, in pixels, between the left
     * side of the frame and the left side of the DDS display window. Keep the default value, 0, to have MediaConvert
     * automatically choose this offset. Related setting: When you use this setting, you must set DDS handling
     * (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to determine whether to write page
     * position data to the DDS or to the page composition segment (PCS). All burn-in and DVB-Sub font settings must
     * match.
     * 
     * @param ddsXCoordinate
     *        Use this setting, along with DDS y-coordinate (ddsYCoordinate), to specify the upper left corner of the
     *        display definition segment (DDS) display window. With this setting, specify the distance, in pixels,
     *        between the left side of the frame and the left side of the DDS display window. Keep the default value, 0,
     *        to have MediaConvert automatically choose this offset. Related setting: When you use this setting, you
     *        must set DDS handling (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to
     *        determine whether to write page position data to the DDS or to the page composition segment (PCS). All
     *        burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withDdsXCoordinate(Integer ddsXCoordinate) {
        setDdsXCoordinate(ddsXCoordinate);
        return this;
    }

    /**
     * Use this setting, along with DDS x-coordinate (ddsXCoordinate), to specify the upper left corner of the display
     * definition segment (DDS) display window. With this setting, specify the distance, in pixels, between the top of
     * the frame and the top of the DDS display window. Keep the default value, 0, to have MediaConvert automatically
     * choose this offset. Related setting: When you use this setting, you must set DDS handling (ddsHandling) to a value
     * other than None (NONE). MediaConvert uses these values to determine whether to write page position data to the DDS
     * or to the page composition segment (PCS). All burn-in and DVB-Sub font settings must match.
     * 
     * @param ddsYCoordinate
     *        Use this setting, along with DDS x-coordinate (ddsXCoordinate), to specify the upper left corner of the
     *        display definition segment (DDS) display window. With this setting, specify the distance, in pixels,
     *        between the top of the frame and the top of the DDS display window. Keep the default value, 0, to have
     *        MediaConvert automatically choose this offset. Related setting: When you use this setting, you must set
     *        DDS handling (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to determine
     *        whether to write page position data to the DDS or to the page composition segment (PCS). All burn-in and
     *        DVB-Sub font settings must match.
     */

    public void setDdsYCoordinate(Integer ddsYCoordinate) {
        this.ddsYCoordinate = ddsYCoordinate;
    }

    /**
     * Use this setting, along with DDS x-coordinate (ddsXCoordinate), to specify the upper left corner of the display
     * definition segment (DDS) display window. With this setting, specify the distance, in pixels, between the top of
     * the frame and the top of the DDS display window. Keep the default value, 0, to have MediaConvert automatically
     * choose this offset. Related setting: When you use this setting, you must set DDS handling (ddsHandling) to a value
     * other than None (NONE). MediaConvert uses these values to determine whether to write page position data to the DDS
     * or to the page composition segment (PCS). All burn-in and DVB-Sub font settings must match.
     * 
     * @return Use this setting, along with DDS x-coordinate (ddsXCoordinate), to specify the upper left corner of the
     *         display definition segment (DDS) display window. With this setting, specify the distance, in pixels,
     *         between the top of the frame and the top of the DDS display window. Keep the default value, 0, to have
     *         MediaConvert automatically choose this offset. Related setting: When you use this setting, you must set
     *         DDS handling (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to determine
     *         whether to write page position data to the DDS or to the page composition segment (PCS). All burn-in and
     *         DVB-Sub font settings must match.
     */

    public Integer getDdsYCoordinate() {
        return this.ddsYCoordinate;
    }

    /**
     * Use this setting, along with DDS x-coordinate (ddsXCoordinate), to specify the upper left corner of the display
     * definition segment (DDS) display window. With this setting, specify the distance, in pixels, between the top of
     * the frame and the top of the DDS display window. Keep the default value, 0, to have MediaConvert automatically
     * choose this offset. Related setting: When you use this setting, you must set DDS handling (ddsHandling) to a value
     * other than None (NONE). MediaConvert uses these values to determine whether to write page position data to the DDS
     * or to the page composition segment (PCS). All burn-in and DVB-Sub font settings must match.
     * 
     * @param ddsYCoordinate
     *        Use this setting, along with DDS x-coordinate (ddsXCoordinate), to specify the upper left corner of the
     *        display definition segment (DDS) display window. With this setting, specify the distance, in pixels,
     *        between the top of the frame and the top of the DDS display window. Keep the default value, 0, to have
     *        MediaConvert automatically choose this offset. Related setting: When you use this setting, you must set
     *        DDS handling (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to determine
     *        whether to write page position data to the DDS or to the page composition segment (PCS). All burn-in and
     *        DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withDdsYCoordinate(Integer ddsYCoordinate) {
        setDdsYCoordinate(ddsYCoordinate);
        return this;
    }

    /**
     * Specify the font that you want the service to use for your burn in captions when your input captions specify a
     * font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match (BEST_MATCH), or
     * leave blank, MediaConvert uses a supported font that most closely matches the font that your input captions
     * specify. When there are multiple unsupported fonts in your input captions, MediaConvert matches each font with the
     * supported font that matches best. When you explicitly choose a replacement font, MediaConvert uses that font to
     * replace all unsupported fonts from your input.
     * 
     * @param fallbackFont
     *        Specify the font that you want the service to use for your burn in captions when your input captions
     *        specify a font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match
     *        (BEST_MATCH), or leave blank, MediaConvert uses a supported font that most closely matches the font that
     *        your input captions specify. When there are multiple unsupported fonts in your input captions,
     *        MediaConvert matches each font with the supported font that matches best. When you explicitly choose a
     *        replacement font, MediaConvert uses that font to replace all unsupported fonts from your input.
     * @see DvbSubSubtitleFallbackFont
     */

    public void setFallbackFont(String fallbackFont) {
        this.fallbackFont = fallbackFont;
    }

    /**
     * Specify the font that you want the service to use for your burn in captions when your input captions specify a
     * font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match (BEST_MATCH), or
     * leave blank, MediaConvert uses a supported font that most closely matches the font that your input captions
     * specify. When there are multiple unsupported fonts in your input captions, MediaConvert matches each font with the
     * supported font that matches best. When you explicitly choose a replacement font, MediaConvert uses that font to
     * replace all unsupported fonts from your input.
     * 
     * @return Specify the font that you want the service to use for your burn in captions when your input captions
     *         specify a font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match
     *         (BEST_MATCH), or leave blank, MediaConvert uses a supported font that most closely matches the font that
     *         your input captions specify. When there are multiple unsupported fonts in your input captions,
     *         MediaConvert matches each font with the supported font that matches best. When you explicitly choose a
     *         replacement font, MediaConvert uses that font to replace all unsupported fonts from your input.
     * @see DvbSubSubtitleFallbackFont
     */

    public String getFallbackFont() {
        return this.fallbackFont;
    }

    /**
     * Specify the font that you want the service to use for your burn in captions when your input captions specify a
     * font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match (BEST_MATCH), or
     * leave blank, MediaConvert uses a supported font that most closely matches the font that your input captions
     * specify. When there are multiple unsupported fonts in your input captions, MediaConvert matches each font with the
     * supported font that matches best. When you explicitly choose a replacement font, MediaConvert uses that font to
     * replace all unsupported fonts from your input.
     * 
     * @param fallbackFont
     *        Specify the font that you want the service to use for your burn in captions when your input captions
     *        specify a font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match
     *        (BEST_MATCH), or leave blank, MediaConvert uses a supported font that most closely matches the font that
     *        your input captions specify. When there are multiple unsupported fonts in your input captions,
     *        MediaConvert matches each font with the supported font that matches best. When you explicitly choose a
     *        replacement font, MediaConvert uses that font to replace all unsupported fonts from your input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubSubtitleFallbackFont
     */

    public DvbSubDestinationSettings withFallbackFont(String fallbackFont) {
        setFallbackFont(fallbackFont);
        return this;
    }

    /**
     * Specify the font that you want the service to use for your burn in captions when your input captions specify a
     * font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match (BEST_MATCH), or
     * leave blank, MediaConvert uses a supported font that most closely matches the font that your input captions
     * specify. When there are multiple unsupported fonts in your input captions, MediaConvert matches each font with the
     * supported font that matches best. When you explicitly choose a replacement font, MediaConvert uses that font to
     * replace all unsupported fonts from your input.
     * 
     * @param fallbackFont
     *        Specify the font that you want the service to use for your burn in captions when your input captions
     *        specify a font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match
     *        (BEST_MATCH), or leave blank, MediaConvert uses a supported font that most closely matches the font that
     *        your input captions specify. When there are multiple unsupported fonts in your input captions,
     *        MediaConvert matches each font with the supported font that matches best. When you explicitly choose a
     *        replacement font, MediaConvert uses that font to replace all unsupported fonts from your input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubSubtitleFallbackFont
     */

    public DvbSubDestinationSettings withFallbackFont(DvbSubSubtitleFallbackFont fallbackFont) {
        this.fallbackFont = fallbackFont.toString();
        return this;
    }

    /**
     * Specify the color of the captions text. Leave Font color (FontColor) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the font color data from your input captions, if present. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     * 
     * @param fontColor
     *        Specify the color of the captions text. Leave Font color (FontColor) blank and set Style passthrough
     *        (StylePassthrough) to enabled to use the font color data from your input captions, if present. Within your
     *        job settings, all of your DVB-Sub settings must be identical.
     * @see DvbSubtitleFontColor
     */

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * Specify the color of the captions text. Leave Font color (FontColor) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the font color data from your input captions, if present. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     * 
     * @return Specify the color of the captions text. Leave Font color (FontColor) blank and set Style passthrough
     *         (StylePassthrough) to enabled to use the font color data from your input captions, if present. Within
     *         your job settings, all of your DVB-Sub settings must be identical.
     * @see DvbSubtitleFontColor
     */

    public String getFontColor() {
        return this.fontColor;
    }

    /**
     * Specify the color of the captions text. Leave Font color (FontColor) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the font color data from your input captions, if present. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     * 
     * @param fontColor
     *        Specify the color of the captions text. Leave Font color (FontColor) blank and set Style passthrough
     *        (StylePassthrough) to enabled to use the font color data from your input captions, if present. Within your
     *        job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleFontColor
     */

    public DvbSubDestinationSettings withFontColor(String fontColor) {
        setFontColor(fontColor);
        return this;
    }

    /**
     * Specify the color of the captions text. Leave Font color (FontColor) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the font color data from your input captions, if present. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     * 
     * @param fontColor
     *        Specify the color of the captions text. Leave Font color (FontColor) blank and set Style passthrough
     *        (StylePassthrough) to enabled to use the font color data from your input captions, if present. Within your
     *        job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleFontColor
     */

    public DvbSubDestinationSettings withFontColor(DvbSubtitleFontColor fontColor) {
        this.fontColor = fontColor.toString();
        return this;
    }

    /**
     * Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     * 
     * @param fontOpacity
     *        Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent. Within your job settings,
     *        all of your DVB-Sub settings must be identical.
     */

    public void setFontOpacity(Integer fontOpacity) {
        this.fontOpacity = fontOpacity;
    }

    /**
     * Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     * 
     * @return Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent. Within your job settings,
     *         all of your DVB-Sub settings must be identical.
     */

    public Integer getFontOpacity() {
        return this.fontOpacity;
    }

    /**
     * Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent. Within your job settings, all of
     * your DVB-Sub settings must be identical.
     * 
     * @param fontOpacity
     *        Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent. Within your job settings,
     *        all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withFontOpacity(Integer fontOpacity) {
        setFontOpacity(fontOpacity);
        return this;
    }

    /**
     * Specify the Font resolution (FontResolution) in DPI (dots per inch). Within your job settings, all of your
     * DVB-Sub settings must be identical.
     * 
     * @param fontResolution
     *        Specify the Font resolution (FontResolution) in DPI (dots per inch). Within your job settings, all of your
     *        DVB-Sub settings must be identical.
     */

    public void setFontResolution(Integer fontResolution) {
        this.fontResolution = fontResolution;
    }

    /**
     * Specify the Font resolution (FontResolution) in DPI (dots per inch). Within your job settings, all of your
     * DVB-Sub settings must be identical.
     * 
     * @return Specify the Font resolution (FontResolution) in DPI (dots per inch). Within your job settings, all of
     *         your DVB-Sub settings must be identical.
     */

    public Integer getFontResolution() {
        return this.fontResolution;
    }

    /**
     * Specify the Font resolution (FontResolution) in DPI (dots per inch). Within your job settings, all of your
     * DVB-Sub settings must be identical.
     * 
     * @param fontResolution
     *        Specify the Font resolution (FontResolution) in DPI (dots per inch). Within your job settings, all of your
     *        DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withFontResolution(Integer fontResolution) {
        setFontResolution(fontResolution);
        return this;
    }

    /**
     * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine
     * the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT)
     * if your input font script uses Simplified or Traditional Chinese. Within your job settings, all of your DVB-Sub
     * settings must be identical.
     * 
     * @param fontScript
     *        Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically
     *        determine the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or
     *        Traditional Chinese (HANT) if your input font script uses Simplified or Traditional Chinese. Within your
     *        job settings, all of your DVB-Sub settings must be identical.
     * @see FontScript
     */

    public void setFontScript(String fontScript) {
        this.fontScript = fontScript;
    }

    /**
     * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine
     * the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT)
     * if your input font script uses Simplified or Traditional Chinese. Within your job settings, all of your DVB-Sub
     * settings must be identical.
     * 
     * @return Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically
     *         determine the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or
     *         Traditional Chinese (HANT) if your input font script uses Simplified or Traditional Chinese. Within your
     *         job settings, all of your DVB-Sub settings must be identical.
     * @see FontScript
     */

    public String getFontScript() {
        return this.fontScript;
    }

    /**
     * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine
     * the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT)
     * if your input font script uses Simplified or Traditional Chinese. Within your job settings, all of your DVB-Sub
     * settings must be identical.
     * 
     * @param fontScript
     *        Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically
     *        determine the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or
     *        Traditional Chinese (HANT) if your input font script uses Simplified or Traditional Chinese. Within your
     *        job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FontScript
     */

    public DvbSubDestinationSettings withFontScript(String fontScript) {
        setFontScript(fontScript);
        return this;
    }

    /**
     * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine
     * the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT)
     * if your input font script uses Simplified or Traditional Chinese. Within your job settings, all of your DVB-Sub
     * settings must be identical.
     * 
     * @param fontScript
     *        Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically
     *        determine the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or
     *        Traditional Chinese (HANT) if your input font script uses Simplified or Traditional Chinese. Within your
     *        job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FontScript
     */

    public DvbSubDestinationSettings withFontScript(FontScript fontScript) {
        this.fontScript = fontScript.toString();
        return this;
    }

    /**
     * Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for automatic
     * font size. Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param fontSize
     *        Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for
     *        automatic font size. Within your job settings, all of your DVB-Sub settings must be identical.
     */

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for automatic
     * font size. Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @return Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for
     *         automatic font size. Within your job settings, all of your DVB-Sub settings must be identical.
     */

    public Integer getFontSize() {
        return this.fontSize;
    }

    /**
     * Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for automatic
     * font size. Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param fontSize
     *        Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for
     *        automatic font size. Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withFontSize(Integer fontSize) {
        setFontSize(fontSize);
        return this;
    }

    /**
     * Specify the height, in pixels, of this set of DVB-Sub captions. The default value is 576 pixels. Related setting:
     * When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). All burn-in
     * and DVB-Sub font settings must match.
     * 
     * @param height
     *        Specify the height, in pixels, of this set of DVB-Sub captions. The default value is 576 pixels. Related
     *        setting: When you use this setting, you must set DDS handling (ddsHandling) to a value other than None
     *        (NONE). All burn-in and DVB-Sub font settings must match.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Specify the height, in pixels, of this set of DVB-Sub captions. The default value is 576 pixels. Related setting:
     * When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). All burn-in
     * and DVB-Sub font settings must match.
     * 
     * @return Specify the height, in pixels, of this set of DVB-Sub captions. The default value is 576 pixels. Related
     *         setting: When you use this setting, you must set DDS handling (ddsHandling) to a value other than None
     *         (NONE). All burn-in and DVB-Sub font settings must match.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * Specify the height, in pixels, of this set of DVB-Sub captions. The default value is 576 pixels. Related setting:
     * When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). All burn-in
     * and DVB-Sub font settings must match.
     * 
     * @param height
     *        Specify the height, in pixels, of this set of DVB-Sub captions. The default value is 576 pixels. Related
     *        setting: When you use this setting, you must set DDS handling (ddsHandling) to a value other than None
     *        (NONE). All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * Ignore this setting unless your Font color is set to Hex. Enter either six or eight hexidecimal digits,
     * representing red, green, and blue, with two optional extra digits for alpha. For example a value of 1122AABB is a
     * red value of 0x11, a green value of 0x22, a blue value of 0xAA, and an alpha value of 0xBB.
     * 
     * @param hexFontColor
     *        Ignore this setting unless your Font color is set to Hex. Enter either six or eight hexidecimal digits,
     *        representing red, green, and blue, with two optional extra digits for alpha. For example a value of
     *        1122AABB is a red value of 0x11, a green value of 0x22, a blue value of 0xAA, and an alpha value of 0xBB.
     */

    public void setHexFontColor(String hexFontColor) {
        this.hexFontColor = hexFontColor;
    }

    /**
     * Ignore this setting unless your Font color is set to Hex. Enter either six or eight hexidecimal digits,
     * representing red, green, and blue, with two optional extra digits for alpha. For example a value of 1122AABB is a
     * red value of 0x11, a green value of 0x22, a blue value of 0xAA, and an alpha value of 0xBB.
     * 
     * @return Ignore this setting unless your Font color is set to Hex. Enter either six or eight hexidecimal digits,
     *         representing red, green, and blue, with two optional extra digits for alpha. For example a value of
     *         1122AABB is a red value of 0x11, a green value of 0x22, a blue value of 0xAA, and an alpha value of 0xBB.
     */

    public String getHexFontColor() {
        return this.hexFontColor;
    }

    /**
     * Ignore this setting unless your Font color is set to Hex. Enter either six or eight hexidecimal digits,
     * representing red, green, and blue, with two optional extra digits for alpha. For example a value of 1122AABB is a
     * red value of 0x11, a green value of 0x22, a blue value of 0xAA, and an alpha value of 0xBB.
     * 
     * @param hexFontColor
     *        Ignore this setting unless your Font color is set to Hex. Enter either six or eight hexidecimal digits,
     *        representing red, green, and blue, with two optional extra digits for alpha. For example a value of
     *        1122AABB is a red value of 0x11, a green value of 0x22, a blue value of 0xAA, and an alpha value of 0xBB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withHexFontColor(String hexFontColor) {
        setHexFontColor(hexFontColor);
        return this;
    }

    /**
     * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough)
     * to enabled to use the font outline color data from your input captions, if present. Within your job settings, all
     * of your DVB-Sub settings must be identical.
     * 
     * @param outlineColor
     *        Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough
     *        (StylePassthrough) to enabled to use the font outline color data from your input captions, if present.
     *        Within your job settings, all of your DVB-Sub settings must be identical.
     * @see DvbSubtitleOutlineColor
     */

    public void setOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    /**
     * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough)
     * to enabled to use the font outline color data from your input captions, if present. Within your job settings, all
     * of your DVB-Sub settings must be identical.
     * 
     * @return Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough
     *         (StylePassthrough) to enabled to use the font outline color data from your input captions, if present.
     *         Within your job settings, all of your DVB-Sub settings must be identical.
     * @see DvbSubtitleOutlineColor
     */

    public String getOutlineColor() {
        return this.outlineColor;
    }

    /**
     * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough)
     * to enabled to use the font outline color data from your input captions, if present. Within your job settings, all
     * of your DVB-Sub settings must be identical.
     * 
     * @param outlineColor
     *        Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough
     *        (StylePassthrough) to enabled to use the font outline color data from your input captions, if present.
     *        Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleOutlineColor
     */

    public DvbSubDestinationSettings withOutlineColor(String outlineColor) {
        setOutlineColor(outlineColor);
        return this;
    }

    /**
     * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough)
     * to enabled to use the font outline color data from your input captions, if present. Within your job settings, all
     * of your DVB-Sub settings must be identical.
     * 
     * @param outlineColor
     *        Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough
     *        (StylePassthrough) to enabled to use the font outline color data from your input captions, if present.
     *        Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleOutlineColor
     */

    public DvbSubDestinationSettings withOutlineColor(DvbSubtitleOutlineColor outlineColor) {
        this.outlineColor = outlineColor.toString();
        return this;
    }

    /**
     * Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set Style
     * passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if present.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param outlineSize
     *        Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set
     *        Style passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if
     *        present. Within your job settings, all of your DVB-Sub settings must be identical.
     */

    public void setOutlineSize(Integer outlineSize) {
        this.outlineSize = outlineSize;
    }

    /**
     * Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set Style
     * passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if present.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @return Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set
     *         Style passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if
     *         present. Within your job settings, all of your DVB-Sub settings must be identical.
     */

    public Integer getOutlineSize() {
        return this.outlineSize;
    }

    /**
     * Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set Style
     * passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if present.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param outlineSize
     *        Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set
     *        Style passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if
     *        present. Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withOutlineSize(Integer outlineSize) {
        setOutlineSize(outlineSize);
        return this;
    }

    /**
     * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     * passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param shadowColor
     *        Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if
     *        present. Within your job settings, all of your DVB-Sub settings must be identical.
     * @see DvbSubtitleShadowColor
     */

    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    /**
     * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     * passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @return Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set
     *         Style passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if
     *         present. Within your job settings, all of your DVB-Sub settings must be identical.
     * @see DvbSubtitleShadowColor
     */

    public String getShadowColor() {
        return this.shadowColor;
    }

    /**
     * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     * passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param shadowColor
     *        Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if
     *        present. Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleShadowColor
     */

    public DvbSubDestinationSettings withShadowColor(String shadowColor) {
        setShadowColor(shadowColor);
        return this;
    }

    /**
     * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     * passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param shadowColor
     *        Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if
     *        present. Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleShadowColor
     */

    public DvbSubDestinationSettings withShadowColor(DvbSubtitleShadowColor shadowColor) {
        this.shadowColor = shadowColor.toString();
        return this;
    }

    /**
     * Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If
     * Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to pass
     * through the shadow style information in your input captions to your output captions. If Style passthrough is set
     * to disabled, leave blank to use a value of 0 and remove all shadows from your output captions. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     * 
     * @param shadowOpacity
     *        Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque.
     *        If Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to
     *        pass through the shadow style information in your input captions to your output captions. If Style
     *        passthrough is set to disabled, leave blank to use a value of 0 and remove all shadows from your output
     *        captions. Within your job settings, all of your DVB-Sub settings must be identical.
     */

    public void setShadowOpacity(Integer shadowOpacity) {
        this.shadowOpacity = shadowOpacity;
    }

    /**
     * Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If
     * Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to pass
     * through the shadow style information in your input captions to your output captions. If Style passthrough is set
     * to disabled, leave blank to use a value of 0 and remove all shadows from your output captions. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     * 
     * @return Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque.
     *         If Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to
     *         pass through the shadow style information in your input captions to your output captions. If Style
     *         passthrough is set to disabled, leave blank to use a value of 0 and remove all shadows from your output
     *         captions. Within your job settings, all of your DVB-Sub settings must be identical.
     */

    public Integer getShadowOpacity() {
        return this.shadowOpacity;
    }

    /**
     * Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If
     * Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to pass
     * through the shadow style information in your input captions to your output captions. If Style passthrough is set
     * to disabled, leave blank to use a value of 0 and remove all shadows from your output captions. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     * 
     * @param shadowOpacity
     *        Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque.
     *        If Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to
     *        pass through the shadow style information in your input captions to your output captions. If Style
     *        passthrough is set to disabled, leave blank to use a value of 0 and remove all shadows from your output
     *        captions. Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withShadowOpacity(Integer shadowOpacity) {
        setShadowOpacity(shadowOpacity);
        return this;
    }

    /**
     * Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left. Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param shadowXOffset
     *        Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would
     *        result in a shadow offset 2 pixels to the left. Within your job settings, all of your DVB-Sub settings
     *        must be identical.
     */

    public void setShadowXOffset(Integer shadowXOffset) {
        this.shadowXOffset = shadowXOffset;
    }

    /**
     * Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left. Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @return Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would
     *         result in a shadow offset 2 pixels to the left. Within your job settings, all of your DVB-Sub settings
     *         must be identical.
     */

    public Integer getShadowXOffset() {
        return this.shadowXOffset;
    }

    /**
     * Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left. Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param shadowXOffset
     *        Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would
     *        result in a shadow offset 2 pixels to the left. Within your job settings, all of your DVB-Sub settings
     *        must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withShadowXOffset(Integer shadowXOffset) {
        setShadowXOffset(shadowXOffset);
        return this;
    }

    /**
     * Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if present. Within your
     * job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param shadowYOffset
     *        Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result
     *        in a shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if
     *        present. Within your job settings, all of your DVB-Sub settings must be identical.
     */

    public void setShadowYOffset(Integer shadowYOffset) {
        this.shadowYOffset = shadowYOffset;
    }

    /**
     * Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if present. Within your
     * job settings, all of your DVB-Sub settings must be identical.
     * 
     * @return Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result
     *         in a shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style
     *         passthrough (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if
     *         present. Within your job settings, all of your DVB-Sub settings must be identical.
     */

    public Integer getShadowYOffset() {
        return this.shadowYOffset;
    }

    /**
     * Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if present. Within your
     * job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param shadowYOffset
     *        Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result
     *        in a shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if
     *        present. Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withShadowYOffset(Integer shadowYOffset) {
        setShadowYOffset(shadowYOffset);
        return this;
    }

    /**
     * Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position information
     * from your input captions. MediaConvert uses default settings for any missing style and position information in
     * your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore the style and position
     * information from your input captions and use default settings: white text with black outlining, bottom-center
     * positioning, and automatic sizing. Whether you set Style passthrough to enabled or not, you can also choose to
     * manually override any of the individual style and position settings.
     * 
     * @param stylePassthrough
     *        Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position
     *        information from your input captions. MediaConvert uses default settings for any missing style and
     *        position information in your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore
     *        the style and position information from your input captions and use default settings: white text with
     *        black outlining, bottom-center positioning, and automatic sizing. Whether you set Style passthrough to
     *        enabled or not, you can also choose to manually override any of the individual style and position
     *        settings.
     * @see DvbSubtitleStylePassthrough
     */

    public void setStylePassthrough(String stylePassthrough) {
        this.stylePassthrough = stylePassthrough;
    }

    /**
     * Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position information
     * from your input captions. MediaConvert uses default settings for any missing style and position information in
     * your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore the style and position
     * information from your input captions and use default settings: white text with black outlining, bottom-center
     * positioning, and automatic sizing. Whether you set Style passthrough to enabled or not, you can also choose to
     * manually override any of the individual style and position settings.
     * 
     * @return Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position
     *         information from your input captions. MediaConvert uses default settings for any missing style and
     *         position information in your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore
     *         the style and position information from your input captions and use default settings: white text with
     *         black outlining, bottom-center positioning, and automatic sizing. Whether you set Style passthrough to
     *         enabled or not, you can also choose to manually override any of the individual style and position
     *         settings.
     * @see DvbSubtitleStylePassthrough
     */

    public String getStylePassthrough() {
        return this.stylePassthrough;
    }

    /**
     * Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position information
     * from your input captions. MediaConvert uses default settings for any missing style and position information in
     * your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore the style and position
     * information from your input captions and use default settings: white text with black outlining, bottom-center
     * positioning, and automatic sizing. Whether you set Style passthrough to enabled or not, you can also choose to
     * manually override any of the individual style and position settings.
     * 
     * @param stylePassthrough
     *        Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position
     *        information from your input captions. MediaConvert uses default settings for any missing style and
     *        position information in your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore
     *        the style and position information from your input captions and use default settings: white text with
     *        black outlining, bottom-center positioning, and automatic sizing. Whether you set Style passthrough to
     *        enabled or not, you can also choose to manually override any of the individual style and position
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleStylePassthrough
     */

    public DvbSubDestinationSettings withStylePassthrough(String stylePassthrough) {
        setStylePassthrough(stylePassthrough);
        return this;
    }

    /**
     * Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position information
     * from your input captions. MediaConvert uses default settings for any missing style and position information in
     * your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore the style and position
     * information from your input captions and use default settings: white text with black outlining, bottom-center
     * positioning, and automatic sizing. Whether you set Style passthrough to enabled or not, you can also choose to
     * manually override any of the individual style and position settings.
     * 
     * @param stylePassthrough
     *        Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position
     *        information from your input captions. MediaConvert uses default settings for any missing style and
     *        position information in your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore
     *        the style and position information from your input captions and use default settings: white text with
     *        black outlining, bottom-center positioning, and automatic sizing. Whether you set Style passthrough to
     *        enabled or not, you can also choose to manually override any of the individual style and position
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleStylePassthrough
     */

    public DvbSubDestinationSettings withStylePassthrough(DvbSubtitleStylePassthrough stylePassthrough) {
        this.stylePassthrough = stylePassthrough.toString();
        return this;
    }

    /**
     * Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your
     * subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
     * 
     * @param subtitlingType
     *        Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your
     *        subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only
     *        dialogue.
     * @see DvbSubtitlingType
     */

    public void setSubtitlingType(String subtitlingType) {
        this.subtitlingType = subtitlingType;
    }

    /**
     * Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your
     * subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
     * 
     * @return Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your
     *         subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only
     *         dialogue.
     * @see DvbSubtitlingType
     */

    public String getSubtitlingType() {
        return this.subtitlingType;
    }

    /**
     * Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your
     * subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
     * 
     * @param subtitlingType
     *        Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your
     *        subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only
     *        dialogue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitlingType
     */

    public DvbSubDestinationSettings withSubtitlingType(String subtitlingType) {
        setSubtitlingType(subtitlingType);
        return this;
    }

    /**
     * Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your
     * subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
     * 
     * @param subtitlingType
     *        Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your
     *        subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only
     *        dialogue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitlingType
     */

    public DvbSubDestinationSettings withSubtitlingType(DvbSubtitlingType subtitlingType) {
        this.subtitlingType = subtitlingType.toString();
        return this;
    }

    /**
     * Specify whether the Text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     * depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions
     * file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param teletextSpacing
     *        Specify whether the Text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     *        depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the
     *        captions file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for
     *        closed captions. Within your job settings, all of your DVB-Sub settings must be identical.
     * @see DvbSubtitleTeletextSpacing
     */

    public void setTeletextSpacing(String teletextSpacing) {
        this.teletextSpacing = teletextSpacing;
    }

    /**
     * Specify whether the Text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     * depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions
     * file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @return Specify whether the Text spacing (TeletextSpacing) in your captions is set by the captions grid, or
     *         varies depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in
     *         the captions file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for
     *         closed captions. Within your job settings, all of your DVB-Sub settings must be identical.
     * @see DvbSubtitleTeletextSpacing
     */

    public String getTeletextSpacing() {
        return this.teletextSpacing;
    }

    /**
     * Specify whether the Text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     * depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions
     * file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param teletextSpacing
     *        Specify whether the Text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     *        depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the
     *        captions file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for
     *        closed captions. Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleTeletextSpacing
     */

    public DvbSubDestinationSettings withTeletextSpacing(String teletextSpacing) {
        setTeletextSpacing(teletextSpacing);
        return this;
    }

    /**
     * Specify whether the Text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     * depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions
     * file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions.
     * Within your job settings, all of your DVB-Sub settings must be identical.
     * 
     * @param teletextSpacing
     *        Specify whether the Text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     *        depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the
     *        captions file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for
     *        closed captions. Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSubtitleTeletextSpacing
     */

    public DvbSubDestinationSettings withTeletextSpacing(DvbSubtitleTeletextSpacing teletextSpacing) {
        this.teletextSpacing = teletextSpacing.toString();
        return this;
    }

    /**
     * Specify the width, in pixels, of this set of DVB-Sub captions. The default value is 720 pixels. Related setting:
     * When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). All burn-in
     * and DVB-Sub font settings must match.
     * 
     * @param width
     *        Specify the width, in pixels, of this set of DVB-Sub captions. The default value is 720 pixels. Related
     *        setting: When you use this setting, you must set DDS handling (ddsHandling) to a value other than None
     *        (NONE). All burn-in and DVB-Sub font settings must match.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Specify the width, in pixels, of this set of DVB-Sub captions. The default value is 720 pixels. Related setting:
     * When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). All burn-in
     * and DVB-Sub font settings must match.
     * 
     * @return Specify the width, in pixels, of this set of DVB-Sub captions. The default value is 720 pixels. Related
     *         setting: When you use this setting, you must set DDS handling (ddsHandling) to a value other than None
     *         (NONE). All burn-in and DVB-Sub font settings must match.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * Specify the width, in pixels, of this set of DVB-Sub captions. The default value is 720 pixels. Related setting:
     * When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). All burn-in
     * and DVB-Sub font settings must match.
     * 
     * @param width
     *        Specify the width, in pixels, of this set of DVB-Sub captions. The default value is 720 pixels. Related
     *        setting: When you use this setting, you must set DDS handling (ddsHandling) to a value other than None
     *        (NONE). All burn-in and DVB-Sub font settings must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withWidth(Integer width) {
        setWidth(width);
        return this;
    }

    /**
     * Specify the horizontal position (XPosition) of the captions, relative to the left side of the outputin pixels. A
     * value of 10 would result in the captions starting 10 pixels from the left ofthe output. If no explicit x_position
     * is provided, the horizontal caption position will bedetermined by the alignment parameter. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     * 
     * @param xPosition
     *        Specify the horizontal position (XPosition) of the captions, relative to the left side of the outputin
     *        pixels. A value of 10 would result in the captions starting 10 pixels from the left ofthe output. If no
     *        explicit x_position is provided, the horizontal caption position will bedetermined by the alignment
     *        parameter. Within your job settings, all of your DVB-Sub settings must be identical.
     */

    public void setXPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * Specify the horizontal position (XPosition) of the captions, relative to the left side of the outputin pixels. A
     * value of 10 would result in the captions starting 10 pixels from the left ofthe output. If no explicit x_position
     * is provided, the horizontal caption position will bedetermined by the alignment parameter. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     * 
     * @return Specify the horizontal position (XPosition) of the captions, relative to the left side of the outputin
     *         pixels. A value of 10 would result in the captions starting 10 pixels from the left ofthe output. If no
     *         explicit x_position is provided, the horizontal caption position will bedetermined by the alignment
     *         parameter. Within your job settings, all of your DVB-Sub settings must be identical.
     */

    public Integer getXPosition() {
        return this.xPosition;
    }

    /**
     * Specify the horizontal position (XPosition) of the captions, relative to the left side of the outputin pixels. A
     * value of 10 would result in the captions starting 10 pixels from the left ofthe output. If no explicit x_position
     * is provided, the horizontal caption position will bedetermined by the alignment parameter. Within your job
     * settings, all of your DVB-Sub settings must be identical.
     * 
     * @param xPosition
     *        Specify the horizontal position (XPosition) of the captions, relative to the left side of the outputin
     *        pixels. A value of 10 would result in the captions starting 10 pixels from the left ofthe output. If no
     *        explicit x_position is provided, the horizontal caption position will bedetermined by the alignment
     *        parameter. Within your job settings, all of your DVB-Sub settings must be identical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubDestinationSettings withXPosition(Integer xPosition) {
        setXPosition(xPosition);
        return this;
    }

    /**
     * Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A value
     * of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is
     * provided, the caption will be positioned towards the bottom of the output. Within your job settings, all of your
     * DVB-Sub settings must be identical.
     * 
     * @param yPosition
     *        Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A
     *        value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit
     *        y_position is provided, the caption will be positioned towards the bottom of the output. Within your job
     *        settings, all of your DVB-Sub settings must be identical.
     */

    public void setYPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A value
     * of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is
     * provided, the caption will be positioned towards the bottom of the output. Within your job settings, all of your
     * DVB-Sub settings must be identical.
     * 
     * @return Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A
     *         value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit
     *         y_position is provided, the caption will be positioned towards the bottom of the output. Within your job
     *         settings, all of your DVB-Sub settings must be identical.
     */

    public Integer getYPosition() {
        return this.yPosition;
    }

    /**
     * Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A value
     * of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is
     * provided, the caption will be positioned towards the bottom of the output. Within your job settings, all of your
     * DVB-Sub settings must be identical.
     * 
     * @param yPosition
     *        Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A
     *        value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit
     *        y_position is provided, the caption will be positioned towards the bottom of the output. Within your job
     *        settings, all of your DVB-Sub settings must be identical.
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
        if (getApplyFontColor() != null)
            sb.append("ApplyFontColor: ").append(getApplyFontColor()).append(",");
        if (getBackgroundColor() != null)
            sb.append("BackgroundColor: ").append(getBackgroundColor()).append(",");
        if (getBackgroundOpacity() != null)
            sb.append("BackgroundOpacity: ").append(getBackgroundOpacity()).append(",");
        if (getDdsHandling() != null)
            sb.append("DdsHandling: ").append(getDdsHandling()).append(",");
        if (getDdsXCoordinate() != null)
            sb.append("DdsXCoordinate: ").append(getDdsXCoordinate()).append(",");
        if (getDdsYCoordinate() != null)
            sb.append("DdsYCoordinate: ").append(getDdsYCoordinate()).append(",");
        if (getFallbackFont() != null)
            sb.append("FallbackFont: ").append(getFallbackFont()).append(",");
        if (getFontColor() != null)
            sb.append("FontColor: ").append(getFontColor()).append(",");
        if (getFontOpacity() != null)
            sb.append("FontOpacity: ").append(getFontOpacity()).append(",");
        if (getFontResolution() != null)
            sb.append("FontResolution: ").append(getFontResolution()).append(",");
        if (getFontScript() != null)
            sb.append("FontScript: ").append(getFontScript()).append(",");
        if (getFontSize() != null)
            sb.append("FontSize: ").append(getFontSize()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getHexFontColor() != null)
            sb.append("HexFontColor: ").append(getHexFontColor()).append(",");
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
        if (getStylePassthrough() != null)
            sb.append("StylePassthrough: ").append(getStylePassthrough()).append(",");
        if (getSubtitlingType() != null)
            sb.append("SubtitlingType: ").append(getSubtitlingType()).append(",");
        if (getTeletextSpacing() != null)
            sb.append("TeletextSpacing: ").append(getTeletextSpacing()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth()).append(",");
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
        if (other.getApplyFontColor() == null ^ this.getApplyFontColor() == null)
            return false;
        if (other.getApplyFontColor() != null && other.getApplyFontColor().equals(this.getApplyFontColor()) == false)
            return false;
        if (other.getBackgroundColor() == null ^ this.getBackgroundColor() == null)
            return false;
        if (other.getBackgroundColor() != null && other.getBackgroundColor().equals(this.getBackgroundColor()) == false)
            return false;
        if (other.getBackgroundOpacity() == null ^ this.getBackgroundOpacity() == null)
            return false;
        if (other.getBackgroundOpacity() != null && other.getBackgroundOpacity().equals(this.getBackgroundOpacity()) == false)
            return false;
        if (other.getDdsHandling() == null ^ this.getDdsHandling() == null)
            return false;
        if (other.getDdsHandling() != null && other.getDdsHandling().equals(this.getDdsHandling()) == false)
            return false;
        if (other.getDdsXCoordinate() == null ^ this.getDdsXCoordinate() == null)
            return false;
        if (other.getDdsXCoordinate() != null && other.getDdsXCoordinate().equals(this.getDdsXCoordinate()) == false)
            return false;
        if (other.getDdsYCoordinate() == null ^ this.getDdsYCoordinate() == null)
            return false;
        if (other.getDdsYCoordinate() != null && other.getDdsYCoordinate().equals(this.getDdsYCoordinate()) == false)
            return false;
        if (other.getFallbackFont() == null ^ this.getFallbackFont() == null)
            return false;
        if (other.getFallbackFont() != null && other.getFallbackFont().equals(this.getFallbackFont()) == false)
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
        if (other.getFontScript() == null ^ this.getFontScript() == null)
            return false;
        if (other.getFontScript() != null && other.getFontScript().equals(this.getFontScript()) == false)
            return false;
        if (other.getFontSize() == null ^ this.getFontSize() == null)
            return false;
        if (other.getFontSize() != null && other.getFontSize().equals(this.getFontSize()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getHexFontColor() == null ^ this.getHexFontColor() == null)
            return false;
        if (other.getHexFontColor() != null && other.getHexFontColor().equals(this.getHexFontColor()) == false)
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
        if (other.getStylePassthrough() == null ^ this.getStylePassthrough() == null)
            return false;
        if (other.getStylePassthrough() != null && other.getStylePassthrough().equals(this.getStylePassthrough()) == false)
            return false;
        if (other.getSubtitlingType() == null ^ this.getSubtitlingType() == null)
            return false;
        if (other.getSubtitlingType() != null && other.getSubtitlingType().equals(this.getSubtitlingType()) == false)
            return false;
        if (other.getTeletextSpacing() == null ^ this.getTeletextSpacing() == null)
            return false;
        if (other.getTeletextSpacing() != null && other.getTeletextSpacing().equals(this.getTeletextSpacing()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
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
        hashCode = prime * hashCode + ((getApplyFontColor() == null) ? 0 : getApplyFontColor().hashCode());
        hashCode = prime * hashCode + ((getBackgroundColor() == null) ? 0 : getBackgroundColor().hashCode());
        hashCode = prime * hashCode + ((getBackgroundOpacity() == null) ? 0 : getBackgroundOpacity().hashCode());
        hashCode = prime * hashCode + ((getDdsHandling() == null) ? 0 : getDdsHandling().hashCode());
        hashCode = prime * hashCode + ((getDdsXCoordinate() == null) ? 0 : getDdsXCoordinate().hashCode());
        hashCode = prime * hashCode + ((getDdsYCoordinate() == null) ? 0 : getDdsYCoordinate().hashCode());
        hashCode = prime * hashCode + ((getFallbackFont() == null) ? 0 : getFallbackFont().hashCode());
        hashCode = prime * hashCode + ((getFontColor() == null) ? 0 : getFontColor().hashCode());
        hashCode = prime * hashCode + ((getFontOpacity() == null) ? 0 : getFontOpacity().hashCode());
        hashCode = prime * hashCode + ((getFontResolution() == null) ? 0 : getFontResolution().hashCode());
        hashCode = prime * hashCode + ((getFontScript() == null) ? 0 : getFontScript().hashCode());
        hashCode = prime * hashCode + ((getFontSize() == null) ? 0 : getFontSize().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getHexFontColor() == null) ? 0 : getHexFontColor().hashCode());
        hashCode = prime * hashCode + ((getOutlineColor() == null) ? 0 : getOutlineColor().hashCode());
        hashCode = prime * hashCode + ((getOutlineSize() == null) ? 0 : getOutlineSize().hashCode());
        hashCode = prime * hashCode + ((getShadowColor() == null) ? 0 : getShadowColor().hashCode());
        hashCode = prime * hashCode + ((getShadowOpacity() == null) ? 0 : getShadowOpacity().hashCode());
        hashCode = prime * hashCode + ((getShadowXOffset() == null) ? 0 : getShadowXOffset().hashCode());
        hashCode = prime * hashCode + ((getShadowYOffset() == null) ? 0 : getShadowYOffset().hashCode());
        hashCode = prime * hashCode + ((getStylePassthrough() == null) ? 0 : getStylePassthrough().hashCode());
        hashCode = prime * hashCode + ((getSubtitlingType() == null) ? 0 : getSubtitlingType().hashCode());
        hashCode = prime * hashCode + ((getTeletextSpacing() == null) ? 0 : getTeletextSpacing().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
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
        com.amazonaws.services.mediaconvert.model.transform.DvbSubDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
