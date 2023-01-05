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
 * Burn-in is a captions delivery method, rather than a captions format. Burn-in writes the captions directly on your
 * video frames, replacing pixels of video content with the captions. Set up burn-in captions in the same output as your
 * video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/burn-in-output-captions.html.
 * When you work directly in your JSON job specification, include this object and any required children when you set
 * destinationType to BURN_IN.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/BurninDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BurninDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will
     * placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to
     * the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the
     * font will be justified (either left or centered) relative to those coordinates.
     */
    private String alignment;
    /**
     * Ignore this setting unless Style passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set
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
     * blank to use a value of 0 and remove all backgrounds from your output captions.
     */
    private Integer backgroundOpacity;
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
     * Specify the color of the burned-in captions text. Leave Font color (FontColor) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the font color data from your input captions, if present.
     */
    private String fontColor;
    /** Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent. */
    private Integer fontOpacity;
    /** Specify the Font resolution (FontResolution) in DPI (dots per inch). */
    private Integer fontResolution;
    /**
     * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine
     * the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT)
     * if your input font script uses Simplified or Traditional Chinese.
     */
    private String fontScript;
    /**
     * Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for automatic
     * font size.
     */
    private Integer fontSize;
    /**
     * Ignore this setting unless your Font color is set to Hex. Enter either six or eight hexidecimal digits,
     * representing red, green, and blue, with two optional extra digits for alpha. For example a value of 1122AABB is a
     * red value of 0x11, a green value of 0x22, a blue value of 0xAA, and an alpha value of 0xBB.
     */
    private String hexFontColor;
    /**
     * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough)
     * to enabled to use the font outline color data from your input captions, if present.
     */
    private String outlineColor;
    /**
     * Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set Style
     * passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if present.
     */
    private Integer outlineSize;
    /**
     * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     * passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present.
     */
    private String shadowColor;
    /**
     * Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If
     * Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to pass
     * through the shadow style information in your input captions to your output captions. If Style passthrough is set
     * to disabled, leave blank to use a value of 0 and remove all shadows from your output captions.
     */
    private Integer shadowOpacity;
    /**
     * Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left.
     */
    private Integer shadowXOffset;
    /**
     * Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if present.
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
     * Specify whether the text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     * depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions
     * file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions.
     */
    private String teletextSpacing;
    /**
     * Specify the horizontal position (XPosition) of the captions, relative to the left side of the output in pixels. A
     * value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit
     * x_position is provided, the horizontal caption position will be determined by the alignment parameter.
     */
    private Integer xPosition;
    /**
     * Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A value
     * of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is
     * provided, the caption will be positioned towards the bottom of the output.
     */
    private Integer yPosition;

    /**
     * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will
     * placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to
     * the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the
     * font will be justified (either left or centered) relative to those coordinates.
     * 
     * @param alignment
     *        Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to
     *        centered will placethe captions at the bottom center of the output. Similarly, setting a left alignment
     *        willalign captions to the bottom left of the output. If x and y positions are given in conjunction with
     *        the alignment parameter, the font will be justified (either left or centered) relative to those
     *        coordinates.
     * @see BurninSubtitleAlignment
     */

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    /**
     * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will
     * placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to
     * the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the
     * font will be justified (either left or centered) relative to those coordinates.
     * 
     * @return Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to
     *         centered will placethe captions at the bottom center of the output. Similarly, setting a left alignment
     *         willalign captions to the bottom left of the output. If x and y positions are given in conjunction with
     *         the alignment parameter, the font will be justified (either left or centered) relative to those
     *         coordinates.
     * @see BurninSubtitleAlignment
     */

    public String getAlignment() {
        return this.alignment;
    }

    /**
     * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will
     * placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to
     * the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the
     * font will be justified (either left or centered) relative to those coordinates.
     * 
     * @param alignment
     *        Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to
     *        centered will placethe captions at the bottom center of the output. Similarly, setting a left alignment
     *        willalign captions to the bottom left of the output. If x and y positions are given in conjunction with
     *        the alignment parameter, the font will be justified (either left or centered) relative to those
     *        coordinates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleAlignment
     */

    public BurninDestinationSettings withAlignment(String alignment) {
        setAlignment(alignment);
        return this;
    }

    /**
     * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will
     * placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to
     * the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the
     * font will be justified (either left or centered) relative to those coordinates.
     * 
     * @param alignment
     *        Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to
     *        centered will placethe captions at the bottom center of the output. Similarly, setting a left alignment
     *        willalign captions to the bottom left of the output. If x and y positions are given in conjunction with
     *        the alignment parameter, the font will be justified (either left or centered) relative to those
     *        coordinates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleAlignment
     */

    public BurninDestinationSettings withAlignment(BurninSubtitleAlignment alignment) {
        this.alignment = alignment.toString();
        return this;
    }

    /**
     * Ignore this setting unless Style passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set
     * to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color
     * controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies
     * to white text in your input captions. For example, if your font color setting is Yellow, and your input captions
     * have red and white text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font
     * color setting applies to all of your output captions text.
     * 
     * @param applyFontColor
     *        Ignore this setting unless Style passthrough (StylePassthrough) is set to Enabled and Font color
     *        (FontColor) set to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for
     *        additional font color controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your
     *        font color setting only applies to white text in your input captions. For example, if your font color
     *        setting is Yellow, and your input captions have red and white text, your output captions will have red and
     *        yellow text. When you choose ALL_TEXT, your font color setting applies to all of your output captions
     *        text.
     * @see BurninSubtitleApplyFontColor
     */

    public void setApplyFontColor(String applyFontColor) {
        this.applyFontColor = applyFontColor;
    }

    /**
     * Ignore this setting unless Style passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set
     * to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color
     * controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies
     * to white text in your input captions. For example, if your font color setting is Yellow, and your input captions
     * have red and white text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font
     * color setting applies to all of your output captions text.
     * 
     * @return Ignore this setting unless Style passthrough (StylePassthrough) is set to Enabled and Font color
     *         (FontColor) set to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for
     *         additional font color controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your
     *         font color setting only applies to white text in your input captions. For example, if your font color
     *         setting is Yellow, and your input captions have red and white text, your output captions will have red
     *         and yellow text. When you choose ALL_TEXT, your font color setting applies to all of your output captions
     *         text.
     * @see BurninSubtitleApplyFontColor
     */

    public String getApplyFontColor() {
        return this.applyFontColor;
    }

    /**
     * Ignore this setting unless Style passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set
     * to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color
     * controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies
     * to white text in your input captions. For example, if your font color setting is Yellow, and your input captions
     * have red and white text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font
     * color setting applies to all of your output captions text.
     * 
     * @param applyFontColor
     *        Ignore this setting unless Style passthrough (StylePassthrough) is set to Enabled and Font color
     *        (FontColor) set to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for
     *        additional font color controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your
     *        font color setting only applies to white text in your input captions. For example, if your font color
     *        setting is Yellow, and your input captions have red and white text, your output captions will have red and
     *        yellow text. When you choose ALL_TEXT, your font color setting applies to all of your output captions
     *        text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleApplyFontColor
     */

    public BurninDestinationSettings withApplyFontColor(String applyFontColor) {
        setApplyFontColor(applyFontColor);
        return this;
    }

    /**
     * Ignore this setting unless Style passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set
     * to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color
     * controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies
     * to white text in your input captions. For example, if your font color setting is Yellow, and your input captions
     * have red and white text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font
     * color setting applies to all of your output captions text.
     * 
     * @param applyFontColor
     *        Ignore this setting unless Style passthrough (StylePassthrough) is set to Enabled and Font color
     *        (FontColor) set to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for
     *        additional font color controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your
     *        font color setting only applies to white text in your input captions. For example, if your font color
     *        setting is Yellow, and your input captions have red and white text, your output captions will have red and
     *        yellow text. When you choose ALL_TEXT, your font color setting applies to all of your output captions
     *        text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleApplyFontColor
     */

    public BurninDestinationSettings withApplyFontColor(BurninSubtitleApplyFontColor applyFontColor) {
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
     * @see BurninSubtitleBackgroundColor
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
     * @see BurninSubtitleBackgroundColor
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
     * @see BurninSubtitleBackgroundColor
     */

    public BurninDestinationSettings withBackgroundColor(String backgroundColor) {
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
     * @see BurninSubtitleBackgroundColor
     */

    public BurninDestinationSettings withBackgroundColor(BurninSubtitleBackgroundColor backgroundColor) {
        this.backgroundColor = backgroundColor.toString();
        return this;
    }

    /**
     * Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and 255 is
     * opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the background
     * style information in your input captions to your output captions. If Style passthrough is set to disabled, leave
     * blank to use a value of 0 and remove all backgrounds from your output captions.
     * 
     * @param backgroundOpacity
     *        Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and
     *        255 is opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the
     *        background style information in your input captions to your output captions. If Style passthrough is set
     *        to disabled, leave blank to use a value of 0 and remove all backgrounds from your output captions.
     */

    public void setBackgroundOpacity(Integer backgroundOpacity) {
        this.backgroundOpacity = backgroundOpacity;
    }

    /**
     * Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and 255 is
     * opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the background
     * style information in your input captions to your output captions. If Style passthrough is set to disabled, leave
     * blank to use a value of 0 and remove all backgrounds from your output captions.
     * 
     * @return Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and
     *         255 is opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the
     *         background style information in your input captions to your output captions. If Style passthrough is set
     *         to disabled, leave blank to use a value of 0 and remove all backgrounds from your output captions.
     */

    public Integer getBackgroundOpacity() {
        return this.backgroundOpacity;
    }

    /**
     * Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and 255 is
     * opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the background
     * style information in your input captions to your output captions. If Style passthrough is set to disabled, leave
     * blank to use a value of 0 and remove all backgrounds from your output captions.
     * 
     * @param backgroundOpacity
     *        Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and
     *        255 is opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the
     *        background style information in your input captions to your output captions. If Style passthrough is set
     *        to disabled, leave blank to use a value of 0 and remove all backgrounds from your output captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BurninDestinationSettings withBackgroundOpacity(Integer backgroundOpacity) {
        setBackgroundOpacity(backgroundOpacity);
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
     * @see BurninSubtitleFallbackFont
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
     * @see BurninSubtitleFallbackFont
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
     * @see BurninSubtitleFallbackFont
     */

    public BurninDestinationSettings withFallbackFont(String fallbackFont) {
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
     * @see BurninSubtitleFallbackFont
     */

    public BurninDestinationSettings withFallbackFont(BurninSubtitleFallbackFont fallbackFont) {
        this.fallbackFont = fallbackFont.toString();
        return this;
    }

    /**
     * Specify the color of the burned-in captions text. Leave Font color (FontColor) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the font color data from your input captions, if present.
     * 
     * @param fontColor
     *        Specify the color of the burned-in captions text. Leave Font color (FontColor) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the font color data from your input captions, if present.
     * @see BurninSubtitleFontColor
     */

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * Specify the color of the burned-in captions text. Leave Font color (FontColor) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the font color data from your input captions, if present.
     * 
     * @return Specify the color of the burned-in captions text. Leave Font color (FontColor) blank and set Style
     *         passthrough (StylePassthrough) to enabled to use the font color data from your input captions, if
     *         present.
     * @see BurninSubtitleFontColor
     */

    public String getFontColor() {
        return this.fontColor;
    }

    /**
     * Specify the color of the burned-in captions text. Leave Font color (FontColor) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the font color data from your input captions, if present.
     * 
     * @param fontColor
     *        Specify the color of the burned-in captions text. Leave Font color (FontColor) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the font color data from your input captions, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleFontColor
     */

    public BurninDestinationSettings withFontColor(String fontColor) {
        setFontColor(fontColor);
        return this;
    }

    /**
     * Specify the color of the burned-in captions text. Leave Font color (FontColor) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the font color data from your input captions, if present.
     * 
     * @param fontColor
     *        Specify the color of the burned-in captions text. Leave Font color (FontColor) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the font color data from your input captions, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleFontColor
     */

    public BurninDestinationSettings withFontColor(BurninSubtitleFontColor fontColor) {
        this.fontColor = fontColor.toString();
        return this;
    }

    /**
     * Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
     * 
     * @param fontOpacity
     *        Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
     */

    public void setFontOpacity(Integer fontOpacity) {
        this.fontOpacity = fontOpacity;
    }

    /**
     * Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
     * 
     * @return Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
     */

    public Integer getFontOpacity() {
        return this.fontOpacity;
    }

    /**
     * Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
     * 
     * @param fontOpacity
     *        Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BurninDestinationSettings withFontOpacity(Integer fontOpacity) {
        setFontOpacity(fontOpacity);
        return this;
    }

    /**
     * Specify the Font resolution (FontResolution) in DPI (dots per inch).
     * 
     * @param fontResolution
     *        Specify the Font resolution (FontResolution) in DPI (dots per inch).
     */

    public void setFontResolution(Integer fontResolution) {
        this.fontResolution = fontResolution;
    }

    /**
     * Specify the Font resolution (FontResolution) in DPI (dots per inch).
     * 
     * @return Specify the Font resolution (FontResolution) in DPI (dots per inch).
     */

    public Integer getFontResolution() {
        return this.fontResolution;
    }

    /**
     * Specify the Font resolution (FontResolution) in DPI (dots per inch).
     * 
     * @param fontResolution
     *        Specify the Font resolution (FontResolution) in DPI (dots per inch).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BurninDestinationSettings withFontResolution(Integer fontResolution) {
        setFontResolution(fontResolution);
        return this;
    }

    /**
     * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine
     * the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT)
     * if your input font script uses Simplified or Traditional Chinese.
     * 
     * @param fontScript
     *        Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically
     *        determine the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or
     *        Traditional Chinese (HANT) if your input font script uses Simplified or Traditional Chinese.
     * @see FontScript
     */

    public void setFontScript(String fontScript) {
        this.fontScript = fontScript;
    }

    /**
     * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine
     * the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT)
     * if your input font script uses Simplified or Traditional Chinese.
     * 
     * @return Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically
     *         determine the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or
     *         Traditional Chinese (HANT) if your input font script uses Simplified or Traditional Chinese.
     * @see FontScript
     */

    public String getFontScript() {
        return this.fontScript;
    }

    /**
     * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine
     * the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT)
     * if your input font script uses Simplified or Traditional Chinese.
     * 
     * @param fontScript
     *        Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically
     *        determine the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or
     *        Traditional Chinese (HANT) if your input font script uses Simplified or Traditional Chinese.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FontScript
     */

    public BurninDestinationSettings withFontScript(String fontScript) {
        setFontScript(fontScript);
        return this;
    }

    /**
     * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine
     * the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT)
     * if your input font script uses Simplified or Traditional Chinese.
     * 
     * @param fontScript
     *        Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically
     *        determine the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or
     *        Traditional Chinese (HANT) if your input font script uses Simplified or Traditional Chinese.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FontScript
     */

    public BurninDestinationSettings withFontScript(FontScript fontScript) {
        this.fontScript = fontScript.toString();
        return this;
    }

    /**
     * Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for automatic
     * font size.
     * 
     * @param fontSize
     *        Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for
     *        automatic font size.
     */

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for automatic
     * font size.
     * 
     * @return Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for
     *         automatic font size.
     */

    public Integer getFontSize() {
        return this.fontSize;
    }

    /**
     * Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for automatic
     * font size.
     * 
     * @param fontSize
     *        Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for
     *        automatic font size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BurninDestinationSettings withFontSize(Integer fontSize) {
        setFontSize(fontSize);
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

    public BurninDestinationSettings withHexFontColor(String hexFontColor) {
        setHexFontColor(hexFontColor);
        return this;
    }

    /**
     * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough)
     * to enabled to use the font outline color data from your input captions, if present.
     * 
     * @param outlineColor
     *        Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough
     *        (StylePassthrough) to enabled to use the font outline color data from your input captions, if present.
     * @see BurninSubtitleOutlineColor
     */

    public void setOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    /**
     * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough)
     * to enabled to use the font outline color data from your input captions, if present.
     * 
     * @return Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough
     *         (StylePassthrough) to enabled to use the font outline color data from your input captions, if present.
     * @see BurninSubtitleOutlineColor
     */

    public String getOutlineColor() {
        return this.outlineColor;
    }

    /**
     * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough)
     * to enabled to use the font outline color data from your input captions, if present.
     * 
     * @param outlineColor
     *        Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough
     *        (StylePassthrough) to enabled to use the font outline color data from your input captions, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleOutlineColor
     */

    public BurninDestinationSettings withOutlineColor(String outlineColor) {
        setOutlineColor(outlineColor);
        return this;
    }

    /**
     * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough)
     * to enabled to use the font outline color data from your input captions, if present.
     * 
     * @param outlineColor
     *        Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough
     *        (StylePassthrough) to enabled to use the font outline color data from your input captions, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleOutlineColor
     */

    public BurninDestinationSettings withOutlineColor(BurninSubtitleOutlineColor outlineColor) {
        this.outlineColor = outlineColor.toString();
        return this;
    }

    /**
     * Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set Style
     * passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if present.
     * 
     * @param outlineSize
     *        Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set
     *        Style passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if
     *        present.
     */

    public void setOutlineSize(Integer outlineSize) {
        this.outlineSize = outlineSize;
    }

    /**
     * Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set Style
     * passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if present.
     * 
     * @return Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set
     *         Style passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if
     *         present.
     */

    public Integer getOutlineSize() {
        return this.outlineSize;
    }

    /**
     * Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set Style
     * passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if present.
     * 
     * @param outlineSize
     *        Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set
     *        Style passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if
     *        present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BurninDestinationSettings withOutlineSize(Integer outlineSize) {
        setOutlineSize(outlineSize);
        return this;
    }

    /**
     * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     * passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present.
     * 
     * @param shadowColor
     *        Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if
     *        present.
     * @see BurninSubtitleShadowColor
     */

    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    /**
     * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     * passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present.
     * 
     * @return Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set
     *         Style passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if
     *         present.
     * @see BurninSubtitleShadowColor
     */

    public String getShadowColor() {
        return this.shadowColor;
    }

    /**
     * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     * passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present.
     * 
     * @param shadowColor
     *        Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if
     *        present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleShadowColor
     */

    public BurninDestinationSettings withShadowColor(String shadowColor) {
        setShadowColor(shadowColor);
        return this;
    }

    /**
     * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     * passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present.
     * 
     * @param shadowColor
     *        Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if
     *        present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleShadowColor
     */

    public BurninDestinationSettings withShadowColor(BurninSubtitleShadowColor shadowColor) {
        this.shadowColor = shadowColor.toString();
        return this;
    }

    /**
     * Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If
     * Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to pass
     * through the shadow style information in your input captions to your output captions. If Style passthrough is set
     * to disabled, leave blank to use a value of 0 and remove all shadows from your output captions.
     * 
     * @param shadowOpacity
     *        Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque.
     *        If Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to
     *        pass through the shadow style information in your input captions to your output captions. If Style
     *        passthrough is set to disabled, leave blank to use a value of 0 and remove all shadows from your output
     *        captions.
     */

    public void setShadowOpacity(Integer shadowOpacity) {
        this.shadowOpacity = shadowOpacity;
    }

    /**
     * Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If
     * Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to pass
     * through the shadow style information in your input captions to your output captions. If Style passthrough is set
     * to disabled, leave blank to use a value of 0 and remove all shadows from your output captions.
     * 
     * @return Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque.
     *         If Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to
     *         pass through the shadow style information in your input captions to your output captions. If Style
     *         passthrough is set to disabled, leave blank to use a value of 0 and remove all shadows from your output
     *         captions.
     */

    public Integer getShadowOpacity() {
        return this.shadowOpacity;
    }

    /**
     * Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If
     * Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to pass
     * through the shadow style information in your input captions to your output captions. If Style passthrough is set
     * to disabled, leave blank to use a value of 0 and remove all shadows from your output captions.
     * 
     * @param shadowOpacity
     *        Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque.
     *        If Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to
     *        pass through the shadow style information in your input captions to your output captions. If Style
     *        passthrough is set to disabled, leave blank to use a value of 0 and remove all shadows from your output
     *        captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BurninDestinationSettings withShadowOpacity(Integer shadowOpacity) {
        setShadowOpacity(shadowOpacity);
        return this;
    }

    /**
     * Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left.
     * 
     * @param shadowXOffset
     *        Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would
     *        result in a shadow offset 2 pixels to the left.
     */

    public void setShadowXOffset(Integer shadowXOffset) {
        this.shadowXOffset = shadowXOffset;
    }

    /**
     * Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left.
     * 
     * @return Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would
     *         result in a shadow offset 2 pixels to the left.
     */

    public Integer getShadowXOffset() {
        return this.shadowXOffset;
    }

    /**
     * Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels to the left.
     * 
     * @param shadowXOffset
     *        Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would
     *        result in a shadow offset 2 pixels to the left.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BurninDestinationSettings withShadowXOffset(Integer shadowXOffset) {
        setShadowXOffset(shadowXOffset);
        return this;
    }

    /**
     * Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if present.
     * 
     * @param shadowYOffset
     *        Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result
     *        in a shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if
     *        present.
     */

    public void setShadowYOffset(Integer shadowYOffset) {
        this.shadowYOffset = shadowYOffset;
    }

    /**
     * Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if present.
     * 
     * @return Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result
     *         in a shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style
     *         passthrough (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if
     *         present.
     */

    public Integer getShadowYOffset() {
        return this.shadowYOffset;
    }

    /**
     * Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a
     * shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style passthrough
     * (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if present.
     * 
     * @param shadowYOffset
     *        Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result
     *        in a shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style
     *        passthrough (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if
     *        present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BurninDestinationSettings withShadowYOffset(Integer shadowYOffset) {
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
     * @see BurnInSubtitleStylePassthrough
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
     * @see BurnInSubtitleStylePassthrough
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
     * @see BurnInSubtitleStylePassthrough
     */

    public BurninDestinationSettings withStylePassthrough(String stylePassthrough) {
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
     * @see BurnInSubtitleStylePassthrough
     */

    public BurninDestinationSettings withStylePassthrough(BurnInSubtitleStylePassthrough stylePassthrough) {
        this.stylePassthrough = stylePassthrough.toString();
        return this;
    }

    /**
     * Specify whether the text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     * depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions
     * file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions.
     * 
     * @param teletextSpacing
     *        Specify whether the text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     *        depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the
     *        captions file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for
     *        closed captions.
     * @see BurninSubtitleTeletextSpacing
     */

    public void setTeletextSpacing(String teletextSpacing) {
        this.teletextSpacing = teletextSpacing;
    }

    /**
     * Specify whether the text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     * depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions
     * file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions.
     * 
     * @return Specify whether the text spacing (TeletextSpacing) in your captions is set by the captions grid, or
     *         varies depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in
     *         the captions file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for
     *         closed captions.
     * @see BurninSubtitleTeletextSpacing
     */

    public String getTeletextSpacing() {
        return this.teletextSpacing;
    }

    /**
     * Specify whether the text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     * depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions
     * file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions.
     * 
     * @param teletextSpacing
     *        Specify whether the text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     *        depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the
     *        captions file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for
     *        closed captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleTeletextSpacing
     */

    public BurninDestinationSettings withTeletextSpacing(String teletextSpacing) {
        setTeletextSpacing(teletextSpacing);
        return this;
    }

    /**
     * Specify whether the text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     * depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions
     * file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions.
     * 
     * @param teletextSpacing
     *        Specify whether the text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies
     *        depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the
     *        captions file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for
     *        closed captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurninSubtitleTeletextSpacing
     */

    public BurninDestinationSettings withTeletextSpacing(BurninSubtitleTeletextSpacing teletextSpacing) {
        this.teletextSpacing = teletextSpacing.toString();
        return this;
    }

    /**
     * Specify the horizontal position (XPosition) of the captions, relative to the left side of the output in pixels. A
     * value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit
     * x_position is provided, the horizontal caption position will be determined by the alignment parameter.
     * 
     * @param xPosition
     *        Specify the horizontal position (XPosition) of the captions, relative to the left side of the output in
     *        pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no
     *        explicit x_position is provided, the horizontal caption position will be determined by the alignment
     *        parameter.
     */

    public void setXPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * Specify the horizontal position (XPosition) of the captions, relative to the left side of the output in pixels. A
     * value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit
     * x_position is provided, the horizontal caption position will be determined by the alignment parameter.
     * 
     * @return Specify the horizontal position (XPosition) of the captions, relative to the left side of the output in
     *         pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no
     *         explicit x_position is provided, the horizontal caption position will be determined by the alignment
     *         parameter.
     */

    public Integer getXPosition() {
        return this.xPosition;
    }

    /**
     * Specify the horizontal position (XPosition) of the captions, relative to the left side of the output in pixels. A
     * value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit
     * x_position is provided, the horizontal caption position will be determined by the alignment parameter.
     * 
     * @param xPosition
     *        Specify the horizontal position (XPosition) of the captions, relative to the left side of the output in
     *        pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no
     *        explicit x_position is provided, the horizontal caption position will be determined by the alignment
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BurninDestinationSettings withXPosition(Integer xPosition) {
        setXPosition(xPosition);
        return this;
    }

    /**
     * Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A value
     * of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is
     * provided, the caption will be positioned towards the bottom of the output.
     * 
     * @param yPosition
     *        Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A
     *        value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit
     *        y_position is provided, the caption will be positioned towards the bottom of the output.
     */

    public void setYPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A value
     * of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is
     * provided, the caption will be positioned towards the bottom of the output.
     * 
     * @return Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A
     *         value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit
     *         y_position is provided, the caption will be positioned towards the bottom of the output.
     */

    public Integer getYPosition() {
        return this.yPosition;
    }

    /**
     * Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A value
     * of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is
     * provided, the caption will be positioned towards the bottom of the output.
     * 
     * @param yPosition
     *        Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A
     *        value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit
     *        y_position is provided, the caption will be positioned towards the bottom of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BurninDestinationSettings withYPosition(Integer yPosition) {
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
        if (getTeletextSpacing() != null)
            sb.append("TeletextSpacing: ").append(getTeletextSpacing()).append(",");
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

        if (obj instanceof BurninDestinationSettings == false)
            return false;
        BurninDestinationSettings other = (BurninDestinationSettings) obj;
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
        if (other.getTeletextSpacing() == null ^ this.getTeletextSpacing() == null)
            return false;
        if (other.getTeletextSpacing() != null && other.getTeletextSpacing().equals(this.getTeletextSpacing()) == false)
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
        hashCode = prime * hashCode + ((getFallbackFont() == null) ? 0 : getFallbackFont().hashCode());
        hashCode = prime * hashCode + ((getFontColor() == null) ? 0 : getFontColor().hashCode());
        hashCode = prime * hashCode + ((getFontOpacity() == null) ? 0 : getFontOpacity().hashCode());
        hashCode = prime * hashCode + ((getFontResolution() == null) ? 0 : getFontResolution().hashCode());
        hashCode = prime * hashCode + ((getFontScript() == null) ? 0 : getFontScript().hashCode());
        hashCode = prime * hashCode + ((getFontSize() == null) ? 0 : getFontSize().hashCode());
        hashCode = prime * hashCode + ((getHexFontColor() == null) ? 0 : getHexFontColor().hashCode());
        hashCode = prime * hashCode + ((getOutlineColor() == null) ? 0 : getOutlineColor().hashCode());
        hashCode = prime * hashCode + ((getOutlineSize() == null) ? 0 : getOutlineSize().hashCode());
        hashCode = prime * hashCode + ((getShadowColor() == null) ? 0 : getShadowColor().hashCode());
        hashCode = prime * hashCode + ((getShadowOpacity() == null) ? 0 : getShadowOpacity().hashCode());
        hashCode = prime * hashCode + ((getShadowXOffset() == null) ? 0 : getShadowXOffset().hashCode());
        hashCode = prime * hashCode + ((getShadowYOffset() == null) ? 0 : getShadowYOffset().hashCode());
        hashCode = prime * hashCode + ((getStylePassthrough() == null) ? 0 : getStylePassthrough().hashCode());
        hashCode = prime * hashCode + ((getTeletextSpacing() == null) ? 0 : getTeletextSpacing().hashCode());
        hashCode = prime * hashCode + ((getXPosition() == null) ? 0 : getXPosition().hashCode());
        hashCode = prime * hashCode + ((getYPosition() == null) ? 0 : getYPosition().hashCode());
        return hashCode;
    }

    @Override
    public BurninDestinationSettings clone() {
        try {
            return (BurninDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.BurninDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
