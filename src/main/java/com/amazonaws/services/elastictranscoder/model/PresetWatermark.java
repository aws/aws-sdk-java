/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;


/**
 * <p>
 * Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over videos that are transcoded using this
 * preset. You can specify settings for up to four watermarks. Watermarks appear in the specified size and location, and with the specified opacity for
 * the duration of the transcoded video.
 * </p>
 * <p>
 * Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the .png format, which supports
 * transparency.
 * </p>
 * <p>
 * When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic Transcoder to include in the transcoded
 * videos. You can specify fewer graphics in the job than you specify watermark settings in the preset, which allows you to use the same preset for up to
 * four watermarks that have different dimensions.
 * </p>
 */
public class PresetWatermark implements Serializable {

    /**
     * A unique identifier for the settings for one watermark. The value of
     * <code>Id</code> can be up to 40 characters long.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String id;

    /**
     * The maximum width of the watermark in one of the following formats:
     * <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     * the maximum value is the value of <code>MaxWidth</code>.</li>
     * <li>integer percentage (%): The range of valid values is 0 to 100. Use
     * the value of <code>Target</code> to specify whether you want Elastic
     * Transcoder to include the black bars that are added by Elastic
     * Transcoder, if any, in the calculation.</li> If you specify the value
     * in pixels, it must be less than or equal to the value of
     * <code>MaxWidth</code>.</ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     */
    private String maxWidth;

    /**
     * The maximum height of the watermark in one of the following formats:
     * <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     * the maximum value is the value of <code>MaxHeight</code>.</li>
     * <li>integer percentage (%): The range of valid values is 0 to 100. Use
     * the value of <code>Target</code> to specify whether you want Elastic
     * Transcoder to include the black bars that are added by Elastic
     * Transcoder, if any, in the calculation.</li> </ul> If you specify the
     * value in pixels, it must be less than or equal to the value of
     * <code>MaxHeight</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     */
    private String maxHeight;

    /**
     * A value that controls scaling of the watermark: <ul> <li><b>Fit</b>:
     * Elastic Transcoder scales the watermark so it matches the value that
     * you specified in either <code>MaxWidth</code> or
     * <code>MaxHeight</code> without exceeding the other value.</li>
     * <li><b>Stretch</b>: Elastic Transcoder stretches the watermark to
     * match the values that you specified for <code>MaxWidth</code> and
     * <code>MaxHeight</code>. If the relative proportions of the watermark
     * and the values of <code>MaxWidth</code> and <code>MaxHeight</code> are
     * different, the watermark will be distorted.</li>
     * <li><b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down
     * so that its dimensions match the values that you specified for at
     * least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     * exceeding either value. If you specify this option, Elastic Transcoder
     * does not scale the watermark up.</li></ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Stretch$)|(^ShrinkToFit$)<br/>
     */
    private String sizingPolicy;

    /**
     * The horizontal position of the watermark unless you specify a non-zero
     * value for <code>HorizontalOffset</code>: <ul> <li><b>Left</b>: The
     * left edge of the watermark is aligned with the left border of the
     * video.</li> <li><b>Right</b>: The right edge of the watermark is
     * aligned with the right border of the video.</li> <li><b>Center</b>:
     * The watermark is centered between the left and right
     * borders.</li></ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Left$)|(^Right$)|(^Center$)<br/>
     */
    private String horizontalAlign;

    /**
     * The amount by which you want the horizontal position of the watermark
     * to be offset from the position specified by HorizontalAlign: <ul>
     * <li>number of pixels (px): The minimum value is 0 pixels, and the
     * maximum value is the value of MaxWidth.</li> <li>integer percentage
     * (%): The range of valid values is 0 to 100.</li> </ul>For example, if
     * you specify Left for <code>HorizontalAlign</code> and 5px for
     * <code>HorizontalOffset</code>, the left side of the watermark appears
     * 5 pixels from the left border of the output video.
     * <p><code>HorizontalOffset</code> is only valid when the value of
     * <code>HorizontalAlign</code> is <code>Left</code> or
     * <code>Right</code>. If you specify an offset that causes the watermark
     * to extend beyond the left or right border and Elastic Transcoder has
     * not added black bars, the watermark is cropped. If Elastic Transcoder
     * has added black bars, the watermark extends into the black bars. If
     * the watermark extends beyond the black bars, it is cropped. <p>Use the
     * value of <code>Target</code> to specify whether you want to include
     * the black bars that are added by Elastic Transcoder, if any, in the
     * offset calculation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     */
    private String horizontalOffset;

    /**
     * The vertical position of the watermark unless you specify a non-zero
     * value for <code>VerticalOffset</code>: <ul> <li><b>Top</b>: The top
     * edge of the watermark is aligned with the top border of the
     * video.</li> <li><b>Bottom</b>: The bottom edge of the watermark is
     * aligned with the bottom border of the video.</li> <li><b>Center</b>:
     * The watermark is centered between the top and bottom
     * borders.</li></ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Top$)|(^Bottom$)|(^Center$)<br/>
     */
    private String verticalAlign;

    /**
     * <code>VerticalOffset</code> <p>The amount by which you want the
     * vertical position of the watermark to be offset from the position
     * specified by VerticalAlign:<ul> <li>number of pixels (px): The minimum
     * value is 0 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.</li> <li>integer percentage (%): The range of
     * valid values is 0 to 100.</li> </ul> For example, if you specify
     * <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code>
     * for <code>VerticalOffset</code>, the top of the watermark appears 5
     * pixels from the top border of the output video.
     * <p><code>VerticalOffset</code> is only valid when the value of
     * VerticalAlign is Top or Bottom. <p>If you specify an offset that
     * causes the watermark to extend beyond the top or bottom border and
     * Elastic Transcoder has not added black bars, the watermark is cropped.
     * If Elastic Transcoder has added black bars, the watermark extends into
     * the black bars. If the watermark extends beyond the black bars, it is
     * cropped. <p>Use the value of <code>Target</code> to specify whether
     * you want Elastic Transcoder to include the black bars that are added
     * by Elastic Transcoder, if any, in the offset calculation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     */
    private String verticalOffset;

    /**
     * A percentage that indicates how much you want a watermark to obscure
     * the video in the location where it appears. Valid values are 0 (the
     * watermark is invisible) to 100 (the watermark completely obscures the
     * video in the specified location). The datatype of <code>Opacity</code>
     * is float. <p>Elastic Transcoder supports transparent .png graphics. If
     * you use a transparent .png, the transparent portion of the video
     * appears as if you had specified a value of 0 for <code>Opacity</code>.
     * The .jpg file format doesn't support transparency.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,3}([.]\d{0,20})?$<br/>
     */
    private String opacity;

    /**
     * A value that determines how Elastic Transcoder interprets values that
     * you specified for <code>HorizontalOffset</code>,
     * <code>VerticalOffset</code>, <code>MaxWidth</code>, and
     * <code>MaxHeight</code>: <ul><li><b>Content</b>:
     * <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     * are calculated based on the borders of the video excluding black bars
     * added by Elastic Transcoder, if any. In addition,
     * <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     * percentage, are calculated based on the borders of the video excluding
     * black bars added by Elastic Transcoder, if any.</li> <li><b>Frame</b>:
     * <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     * are calculated based on the borders of the video including black bars
     * added by Elastic Transcoder, if any.</li> In addition,
     * <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     * percentage, are calculated based on the borders of the video including
     * black bars added by Elastic Transcoder, if any.</ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Content$)|(^Frame$)<br/>
     */
    private String target;

    /**
     * A unique identifier for the settings for one watermark. The value of
     * <code>Id</code> can be up to 40 characters long.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return A unique identifier for the settings for one watermark. The value of
     *         <code>Id</code> can be up to 40 characters long.
     */
    public String getId() {
        return id;
    }
    
    /**
     * A unique identifier for the settings for one watermark. The value of
     * <code>Id</code> can be up to 40 characters long.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param id A unique identifier for the settings for one watermark. The value of
     *         <code>Id</code> can be up to 40 characters long.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * A unique identifier for the settings for one watermark. The value of
     * <code>Id</code> can be up to 40 characters long.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param id A unique identifier for the settings for one watermark. The value of
     *         <code>Id</code> can be up to 40 characters long.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PresetWatermark withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The maximum width of the watermark in one of the following formats:
     * <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     * the maximum value is the value of <code>MaxWidth</code>.</li>
     * <li>integer percentage (%): The range of valid values is 0 to 100. Use
     * the value of <code>Target</code> to specify whether you want Elastic
     * Transcoder to include the black bars that are added by Elastic
     * Transcoder, if any, in the calculation.</li> If you specify the value
     * in pixels, it must be less than or equal to the value of
     * <code>MaxWidth</code>.</ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @return The maximum width of the watermark in one of the following formats:
     *         <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     *         the maximum value is the value of <code>MaxWidth</code>.</li>
     *         <li>integer percentage (%): The range of valid values is 0 to 100. Use
     *         the value of <code>Target</code> to specify whether you want Elastic
     *         Transcoder to include the black bars that are added by Elastic
     *         Transcoder, if any, in the calculation.</li> If you specify the value
     *         in pixels, it must be less than or equal to the value of
     *         <code>MaxWidth</code>.</ul>
     */
    public String getMaxWidth() {
        return maxWidth;
    }
    
    /**
     * The maximum width of the watermark in one of the following formats:
     * <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     * the maximum value is the value of <code>MaxWidth</code>.</li>
     * <li>integer percentage (%): The range of valid values is 0 to 100. Use
     * the value of <code>Target</code> to specify whether you want Elastic
     * Transcoder to include the black bars that are added by Elastic
     * Transcoder, if any, in the calculation.</li> If you specify the value
     * in pixels, it must be less than or equal to the value of
     * <code>MaxWidth</code>.</ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @param maxWidth The maximum width of the watermark in one of the following formats:
     *         <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     *         the maximum value is the value of <code>MaxWidth</code>.</li>
     *         <li>integer percentage (%): The range of valid values is 0 to 100. Use
     *         the value of <code>Target</code> to specify whether you want Elastic
     *         Transcoder to include the black bars that are added by Elastic
     *         Transcoder, if any, in the calculation.</li> If you specify the value
     *         in pixels, it must be less than or equal to the value of
     *         <code>MaxWidth</code>.</ul>
     */
    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }
    
    /**
     * The maximum width of the watermark in one of the following formats:
     * <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     * the maximum value is the value of <code>MaxWidth</code>.</li>
     * <li>integer percentage (%): The range of valid values is 0 to 100. Use
     * the value of <code>Target</code> to specify whether you want Elastic
     * Transcoder to include the black bars that are added by Elastic
     * Transcoder, if any, in the calculation.</li> If you specify the value
     * in pixels, it must be less than or equal to the value of
     * <code>MaxWidth</code>.</ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @param maxWidth The maximum width of the watermark in one of the following formats:
     *         <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     *         the maximum value is the value of <code>MaxWidth</code>.</li>
     *         <li>integer percentage (%): The range of valid values is 0 to 100. Use
     *         the value of <code>Target</code> to specify whether you want Elastic
     *         Transcoder to include the black bars that are added by Elastic
     *         Transcoder, if any, in the calculation.</li> If you specify the value
     *         in pixels, it must be less than or equal to the value of
     *         <code>MaxWidth</code>.</ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PresetWatermark withMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    /**
     * The maximum height of the watermark in one of the following formats:
     * <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     * the maximum value is the value of <code>MaxHeight</code>.</li>
     * <li>integer percentage (%): The range of valid values is 0 to 100. Use
     * the value of <code>Target</code> to specify whether you want Elastic
     * Transcoder to include the black bars that are added by Elastic
     * Transcoder, if any, in the calculation.</li> </ul> If you specify the
     * value in pixels, it must be less than or equal to the value of
     * <code>MaxHeight</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @return The maximum height of the watermark in one of the following formats:
     *         <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     *         the maximum value is the value of <code>MaxHeight</code>.</li>
     *         <li>integer percentage (%): The range of valid values is 0 to 100. Use
     *         the value of <code>Target</code> to specify whether you want Elastic
     *         Transcoder to include the black bars that are added by Elastic
     *         Transcoder, if any, in the calculation.</li> </ul> If you specify the
     *         value in pixels, it must be less than or equal to the value of
     *         <code>MaxHeight</code>.
     */
    public String getMaxHeight() {
        return maxHeight;
    }
    
    /**
     * The maximum height of the watermark in one of the following formats:
     * <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     * the maximum value is the value of <code>MaxHeight</code>.</li>
     * <li>integer percentage (%): The range of valid values is 0 to 100. Use
     * the value of <code>Target</code> to specify whether you want Elastic
     * Transcoder to include the black bars that are added by Elastic
     * Transcoder, if any, in the calculation.</li> </ul> If you specify the
     * value in pixels, it must be less than or equal to the value of
     * <code>MaxHeight</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @param maxHeight The maximum height of the watermark in one of the following formats:
     *         <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     *         the maximum value is the value of <code>MaxHeight</code>.</li>
     *         <li>integer percentage (%): The range of valid values is 0 to 100. Use
     *         the value of <code>Target</code> to specify whether you want Elastic
     *         Transcoder to include the black bars that are added by Elastic
     *         Transcoder, if any, in the calculation.</li> </ul> If you specify the
     *         value in pixels, it must be less than or equal to the value of
     *         <code>MaxHeight</code>.
     */
    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }
    
    /**
     * The maximum height of the watermark in one of the following formats:
     * <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     * the maximum value is the value of <code>MaxHeight</code>.</li>
     * <li>integer percentage (%): The range of valid values is 0 to 100. Use
     * the value of <code>Target</code> to specify whether you want Elastic
     * Transcoder to include the black bars that are added by Elastic
     * Transcoder, if any, in the calculation.</li> </ul> If you specify the
     * value in pixels, it must be less than or equal to the value of
     * <code>MaxHeight</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @param maxHeight The maximum height of the watermark in one of the following formats:
     *         <ul> <li>number of pixels (px): The minimum value is 16 pixels, and
     *         the maximum value is the value of <code>MaxHeight</code>.</li>
     *         <li>integer percentage (%): The range of valid values is 0 to 100. Use
     *         the value of <code>Target</code> to specify whether you want Elastic
     *         Transcoder to include the black bars that are added by Elastic
     *         Transcoder, if any, in the calculation.</li> </ul> If you specify the
     *         value in pixels, it must be less than or equal to the value of
     *         <code>MaxHeight</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PresetWatermark withMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    /**
     * A value that controls scaling of the watermark: <ul> <li><b>Fit</b>:
     * Elastic Transcoder scales the watermark so it matches the value that
     * you specified in either <code>MaxWidth</code> or
     * <code>MaxHeight</code> without exceeding the other value.</li>
     * <li><b>Stretch</b>: Elastic Transcoder stretches the watermark to
     * match the values that you specified for <code>MaxWidth</code> and
     * <code>MaxHeight</code>. If the relative proportions of the watermark
     * and the values of <code>MaxWidth</code> and <code>MaxHeight</code> are
     * different, the watermark will be distorted.</li>
     * <li><b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down
     * so that its dimensions match the values that you specified for at
     * least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     * exceeding either value. If you specify this option, Elastic Transcoder
     * does not scale the watermark up.</li></ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Stretch$)|(^ShrinkToFit$)<br/>
     *
     * @return A value that controls scaling of the watermark: <ul> <li><b>Fit</b>:
     *         Elastic Transcoder scales the watermark so it matches the value that
     *         you specified in either <code>MaxWidth</code> or
     *         <code>MaxHeight</code> without exceeding the other value.</li>
     *         <li><b>Stretch</b>: Elastic Transcoder stretches the watermark to
     *         match the values that you specified for <code>MaxWidth</code> and
     *         <code>MaxHeight</code>. If the relative proportions of the watermark
     *         and the values of <code>MaxWidth</code> and <code>MaxHeight</code> are
     *         different, the watermark will be distorted.</li>
     *         <li><b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down
     *         so that its dimensions match the values that you specified for at
     *         least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *         exceeding either value. If you specify this option, Elastic Transcoder
     *         does not scale the watermark up.</li></ul>
     */
    public String getSizingPolicy() {
        return sizingPolicy;
    }
    
    /**
     * A value that controls scaling of the watermark: <ul> <li><b>Fit</b>:
     * Elastic Transcoder scales the watermark so it matches the value that
     * you specified in either <code>MaxWidth</code> or
     * <code>MaxHeight</code> without exceeding the other value.</li>
     * <li><b>Stretch</b>: Elastic Transcoder stretches the watermark to
     * match the values that you specified for <code>MaxWidth</code> and
     * <code>MaxHeight</code>. If the relative proportions of the watermark
     * and the values of <code>MaxWidth</code> and <code>MaxHeight</code> are
     * different, the watermark will be distorted.</li>
     * <li><b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down
     * so that its dimensions match the values that you specified for at
     * least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     * exceeding either value. If you specify this option, Elastic Transcoder
     * does not scale the watermark up.</li></ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Stretch$)|(^ShrinkToFit$)<br/>
     *
     * @param sizingPolicy A value that controls scaling of the watermark: <ul> <li><b>Fit</b>:
     *         Elastic Transcoder scales the watermark so it matches the value that
     *         you specified in either <code>MaxWidth</code> or
     *         <code>MaxHeight</code> without exceeding the other value.</li>
     *         <li><b>Stretch</b>: Elastic Transcoder stretches the watermark to
     *         match the values that you specified for <code>MaxWidth</code> and
     *         <code>MaxHeight</code>. If the relative proportions of the watermark
     *         and the values of <code>MaxWidth</code> and <code>MaxHeight</code> are
     *         different, the watermark will be distorted.</li>
     *         <li><b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down
     *         so that its dimensions match the values that you specified for at
     *         least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *         exceeding either value. If you specify this option, Elastic Transcoder
     *         does not scale the watermark up.</li></ul>
     */
    public void setSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
    }
    
    /**
     * A value that controls scaling of the watermark: <ul> <li><b>Fit</b>:
     * Elastic Transcoder scales the watermark so it matches the value that
     * you specified in either <code>MaxWidth</code> or
     * <code>MaxHeight</code> without exceeding the other value.</li>
     * <li><b>Stretch</b>: Elastic Transcoder stretches the watermark to
     * match the values that you specified for <code>MaxWidth</code> and
     * <code>MaxHeight</code>. If the relative proportions of the watermark
     * and the values of <code>MaxWidth</code> and <code>MaxHeight</code> are
     * different, the watermark will be distorted.</li>
     * <li><b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down
     * so that its dimensions match the values that you specified for at
     * least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     * exceeding either value. If you specify this option, Elastic Transcoder
     * does not scale the watermark up.</li></ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Stretch$)|(^ShrinkToFit$)<br/>
     *
     * @param sizingPolicy A value that controls scaling of the watermark: <ul> <li><b>Fit</b>:
     *         Elastic Transcoder scales the watermark so it matches the value that
     *         you specified in either <code>MaxWidth</code> or
     *         <code>MaxHeight</code> without exceeding the other value.</li>
     *         <li><b>Stretch</b>: Elastic Transcoder stretches the watermark to
     *         match the values that you specified for <code>MaxWidth</code> and
     *         <code>MaxHeight</code>. If the relative proportions of the watermark
     *         and the values of <code>MaxWidth</code> and <code>MaxHeight</code> are
     *         different, the watermark will be distorted.</li>
     *         <li><b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down
     *         so that its dimensions match the values that you specified for at
     *         least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *         exceeding either value. If you specify this option, Elastic Transcoder
     *         does not scale the watermark up.</li></ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PresetWatermark withSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
        return this;
    }

    /**
     * The horizontal position of the watermark unless you specify a non-zero
     * value for <code>HorizontalOffset</code>: <ul> <li><b>Left</b>: The
     * left edge of the watermark is aligned with the left border of the
     * video.</li> <li><b>Right</b>: The right edge of the watermark is
     * aligned with the right border of the video.</li> <li><b>Center</b>:
     * The watermark is centered between the left and right
     * borders.</li></ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Left$)|(^Right$)|(^Center$)<br/>
     *
     * @return The horizontal position of the watermark unless you specify a non-zero
     *         value for <code>HorizontalOffset</code>: <ul> <li><b>Left</b>: The
     *         left edge of the watermark is aligned with the left border of the
     *         video.</li> <li><b>Right</b>: The right edge of the watermark is
     *         aligned with the right border of the video.</li> <li><b>Center</b>:
     *         The watermark is centered between the left and right
     *         borders.</li></ul>
     */
    public String getHorizontalAlign() {
        return horizontalAlign;
    }
    
    /**
     * The horizontal position of the watermark unless you specify a non-zero
     * value for <code>HorizontalOffset</code>: <ul> <li><b>Left</b>: The
     * left edge of the watermark is aligned with the left border of the
     * video.</li> <li><b>Right</b>: The right edge of the watermark is
     * aligned with the right border of the video.</li> <li><b>Center</b>:
     * The watermark is centered between the left and right
     * borders.</li></ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Left$)|(^Right$)|(^Center$)<br/>
     *
     * @param horizontalAlign The horizontal position of the watermark unless you specify a non-zero
     *         value for <code>HorizontalOffset</code>: <ul> <li><b>Left</b>: The
     *         left edge of the watermark is aligned with the left border of the
     *         video.</li> <li><b>Right</b>: The right edge of the watermark is
     *         aligned with the right border of the video.</li> <li><b>Center</b>:
     *         The watermark is centered between the left and right
     *         borders.</li></ul>
     */
    public void setHorizontalAlign(String horizontalAlign) {
        this.horizontalAlign = horizontalAlign;
    }
    
    /**
     * The horizontal position of the watermark unless you specify a non-zero
     * value for <code>HorizontalOffset</code>: <ul> <li><b>Left</b>: The
     * left edge of the watermark is aligned with the left border of the
     * video.</li> <li><b>Right</b>: The right edge of the watermark is
     * aligned with the right border of the video.</li> <li><b>Center</b>:
     * The watermark is centered between the left and right
     * borders.</li></ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Left$)|(^Right$)|(^Center$)<br/>
     *
     * @param horizontalAlign The horizontal position of the watermark unless you specify a non-zero
     *         value for <code>HorizontalOffset</code>: <ul> <li><b>Left</b>: The
     *         left edge of the watermark is aligned with the left border of the
     *         video.</li> <li><b>Right</b>: The right edge of the watermark is
     *         aligned with the right border of the video.</li> <li><b>Center</b>:
     *         The watermark is centered between the left and right
     *         borders.</li></ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PresetWatermark withHorizontalAlign(String horizontalAlign) {
        this.horizontalAlign = horizontalAlign;
        return this;
    }

    /**
     * The amount by which you want the horizontal position of the watermark
     * to be offset from the position specified by HorizontalAlign: <ul>
     * <li>number of pixels (px): The minimum value is 0 pixels, and the
     * maximum value is the value of MaxWidth.</li> <li>integer percentage
     * (%): The range of valid values is 0 to 100.</li> </ul>For example, if
     * you specify Left for <code>HorizontalAlign</code> and 5px for
     * <code>HorizontalOffset</code>, the left side of the watermark appears
     * 5 pixels from the left border of the output video.
     * <p><code>HorizontalOffset</code> is only valid when the value of
     * <code>HorizontalAlign</code> is <code>Left</code> or
     * <code>Right</code>. If you specify an offset that causes the watermark
     * to extend beyond the left or right border and Elastic Transcoder has
     * not added black bars, the watermark is cropped. If Elastic Transcoder
     * has added black bars, the watermark extends into the black bars. If
     * the watermark extends beyond the black bars, it is cropped. <p>Use the
     * value of <code>Target</code> to specify whether you want to include
     * the black bars that are added by Elastic Transcoder, if any, in the
     * offset calculation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @return The amount by which you want the horizontal position of the watermark
     *         to be offset from the position specified by HorizontalAlign: <ul>
     *         <li>number of pixels (px): The minimum value is 0 pixels, and the
     *         maximum value is the value of MaxWidth.</li> <li>integer percentage
     *         (%): The range of valid values is 0 to 100.</li> </ul>For example, if
     *         you specify Left for <code>HorizontalAlign</code> and 5px for
     *         <code>HorizontalOffset</code>, the left side of the watermark appears
     *         5 pixels from the left border of the output video.
     *         <p><code>HorizontalOffset</code> is only valid when the value of
     *         <code>HorizontalAlign</code> is <code>Left</code> or
     *         <code>Right</code>. If you specify an offset that causes the watermark
     *         to extend beyond the left or right border and Elastic Transcoder has
     *         not added black bars, the watermark is cropped. If Elastic Transcoder
     *         has added black bars, the watermark extends into the black bars. If
     *         the watermark extends beyond the black bars, it is cropped. <p>Use the
     *         value of <code>Target</code> to specify whether you want to include
     *         the black bars that are added by Elastic Transcoder, if any, in the
     *         offset calculation.
     */
    public String getHorizontalOffset() {
        return horizontalOffset;
    }
    
    /**
     * The amount by which you want the horizontal position of the watermark
     * to be offset from the position specified by HorizontalAlign: <ul>
     * <li>number of pixels (px): The minimum value is 0 pixels, and the
     * maximum value is the value of MaxWidth.</li> <li>integer percentage
     * (%): The range of valid values is 0 to 100.</li> </ul>For example, if
     * you specify Left for <code>HorizontalAlign</code> and 5px for
     * <code>HorizontalOffset</code>, the left side of the watermark appears
     * 5 pixels from the left border of the output video.
     * <p><code>HorizontalOffset</code> is only valid when the value of
     * <code>HorizontalAlign</code> is <code>Left</code> or
     * <code>Right</code>. If you specify an offset that causes the watermark
     * to extend beyond the left or right border and Elastic Transcoder has
     * not added black bars, the watermark is cropped. If Elastic Transcoder
     * has added black bars, the watermark extends into the black bars. If
     * the watermark extends beyond the black bars, it is cropped. <p>Use the
     * value of <code>Target</code> to specify whether you want to include
     * the black bars that are added by Elastic Transcoder, if any, in the
     * offset calculation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @param horizontalOffset The amount by which you want the horizontal position of the watermark
     *         to be offset from the position specified by HorizontalAlign: <ul>
     *         <li>number of pixels (px): The minimum value is 0 pixels, and the
     *         maximum value is the value of MaxWidth.</li> <li>integer percentage
     *         (%): The range of valid values is 0 to 100.</li> </ul>For example, if
     *         you specify Left for <code>HorizontalAlign</code> and 5px for
     *         <code>HorizontalOffset</code>, the left side of the watermark appears
     *         5 pixels from the left border of the output video.
     *         <p><code>HorizontalOffset</code> is only valid when the value of
     *         <code>HorizontalAlign</code> is <code>Left</code> or
     *         <code>Right</code>. If you specify an offset that causes the watermark
     *         to extend beyond the left or right border and Elastic Transcoder has
     *         not added black bars, the watermark is cropped. If Elastic Transcoder
     *         has added black bars, the watermark extends into the black bars. If
     *         the watermark extends beyond the black bars, it is cropped. <p>Use the
     *         value of <code>Target</code> to specify whether you want to include
     *         the black bars that are added by Elastic Transcoder, if any, in the
     *         offset calculation.
     */
    public void setHorizontalOffset(String horizontalOffset) {
        this.horizontalOffset = horizontalOffset;
    }
    
    /**
     * The amount by which you want the horizontal position of the watermark
     * to be offset from the position specified by HorizontalAlign: <ul>
     * <li>number of pixels (px): The minimum value is 0 pixels, and the
     * maximum value is the value of MaxWidth.</li> <li>integer percentage
     * (%): The range of valid values is 0 to 100.</li> </ul>For example, if
     * you specify Left for <code>HorizontalAlign</code> and 5px for
     * <code>HorizontalOffset</code>, the left side of the watermark appears
     * 5 pixels from the left border of the output video.
     * <p><code>HorizontalOffset</code> is only valid when the value of
     * <code>HorizontalAlign</code> is <code>Left</code> or
     * <code>Right</code>. If you specify an offset that causes the watermark
     * to extend beyond the left or right border and Elastic Transcoder has
     * not added black bars, the watermark is cropped. If Elastic Transcoder
     * has added black bars, the watermark extends into the black bars. If
     * the watermark extends beyond the black bars, it is cropped. <p>Use the
     * value of <code>Target</code> to specify whether you want to include
     * the black bars that are added by Elastic Transcoder, if any, in the
     * offset calculation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @param horizontalOffset The amount by which you want the horizontal position of the watermark
     *         to be offset from the position specified by HorizontalAlign: <ul>
     *         <li>number of pixels (px): The minimum value is 0 pixels, and the
     *         maximum value is the value of MaxWidth.</li> <li>integer percentage
     *         (%): The range of valid values is 0 to 100.</li> </ul>For example, if
     *         you specify Left for <code>HorizontalAlign</code> and 5px for
     *         <code>HorizontalOffset</code>, the left side of the watermark appears
     *         5 pixels from the left border of the output video.
     *         <p><code>HorizontalOffset</code> is only valid when the value of
     *         <code>HorizontalAlign</code> is <code>Left</code> or
     *         <code>Right</code>. If you specify an offset that causes the watermark
     *         to extend beyond the left or right border and Elastic Transcoder has
     *         not added black bars, the watermark is cropped. If Elastic Transcoder
     *         has added black bars, the watermark extends into the black bars. If
     *         the watermark extends beyond the black bars, it is cropped. <p>Use the
     *         value of <code>Target</code> to specify whether you want to include
     *         the black bars that are added by Elastic Transcoder, if any, in the
     *         offset calculation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PresetWatermark withHorizontalOffset(String horizontalOffset) {
        this.horizontalOffset = horizontalOffset;
        return this;
    }

    /**
     * The vertical position of the watermark unless you specify a non-zero
     * value for <code>VerticalOffset</code>: <ul> <li><b>Top</b>: The top
     * edge of the watermark is aligned with the top border of the
     * video.</li> <li><b>Bottom</b>: The bottom edge of the watermark is
     * aligned with the bottom border of the video.</li> <li><b>Center</b>:
     * The watermark is centered between the top and bottom
     * borders.</li></ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Top$)|(^Bottom$)|(^Center$)<br/>
     *
     * @return The vertical position of the watermark unless you specify a non-zero
     *         value for <code>VerticalOffset</code>: <ul> <li><b>Top</b>: The top
     *         edge of the watermark is aligned with the top border of the
     *         video.</li> <li><b>Bottom</b>: The bottom edge of the watermark is
     *         aligned with the bottom border of the video.</li> <li><b>Center</b>:
     *         The watermark is centered between the top and bottom
     *         borders.</li></ul>
     */
    public String getVerticalAlign() {
        return verticalAlign;
    }
    
    /**
     * The vertical position of the watermark unless you specify a non-zero
     * value for <code>VerticalOffset</code>: <ul> <li><b>Top</b>: The top
     * edge of the watermark is aligned with the top border of the
     * video.</li> <li><b>Bottom</b>: The bottom edge of the watermark is
     * aligned with the bottom border of the video.</li> <li><b>Center</b>:
     * The watermark is centered between the top and bottom
     * borders.</li></ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Top$)|(^Bottom$)|(^Center$)<br/>
     *
     * @param verticalAlign The vertical position of the watermark unless you specify a non-zero
     *         value for <code>VerticalOffset</code>: <ul> <li><b>Top</b>: The top
     *         edge of the watermark is aligned with the top border of the
     *         video.</li> <li><b>Bottom</b>: The bottom edge of the watermark is
     *         aligned with the bottom border of the video.</li> <li><b>Center</b>:
     *         The watermark is centered between the top and bottom
     *         borders.</li></ul>
     */
    public void setVerticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
    }
    
    /**
     * The vertical position of the watermark unless you specify a non-zero
     * value for <code>VerticalOffset</code>: <ul> <li><b>Top</b>: The top
     * edge of the watermark is aligned with the top border of the
     * video.</li> <li><b>Bottom</b>: The bottom edge of the watermark is
     * aligned with the bottom border of the video.</li> <li><b>Center</b>:
     * The watermark is centered between the top and bottom
     * borders.</li></ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Top$)|(^Bottom$)|(^Center$)<br/>
     *
     * @param verticalAlign The vertical position of the watermark unless you specify a non-zero
     *         value for <code>VerticalOffset</code>: <ul> <li><b>Top</b>: The top
     *         edge of the watermark is aligned with the top border of the
     *         video.</li> <li><b>Bottom</b>: The bottom edge of the watermark is
     *         aligned with the bottom border of the video.</li> <li><b>Center</b>:
     *         The watermark is centered between the top and bottom
     *         borders.</li></ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PresetWatermark withVerticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    /**
     * <code>VerticalOffset</code> <p>The amount by which you want the
     * vertical position of the watermark to be offset from the position
     * specified by VerticalAlign:<ul> <li>number of pixels (px): The minimum
     * value is 0 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.</li> <li>integer percentage (%): The range of
     * valid values is 0 to 100.</li> </ul> For example, if you specify
     * <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code>
     * for <code>VerticalOffset</code>, the top of the watermark appears 5
     * pixels from the top border of the output video.
     * <p><code>VerticalOffset</code> is only valid when the value of
     * VerticalAlign is Top or Bottom. <p>If you specify an offset that
     * causes the watermark to extend beyond the top or bottom border and
     * Elastic Transcoder has not added black bars, the watermark is cropped.
     * If Elastic Transcoder has added black bars, the watermark extends into
     * the black bars. If the watermark extends beyond the black bars, it is
     * cropped. <p>Use the value of <code>Target</code> to specify whether
     * you want Elastic Transcoder to include the black bars that are added
     * by Elastic Transcoder, if any, in the offset calculation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @return <code>VerticalOffset</code> <p>The amount by which you want the
     *         vertical position of the watermark to be offset from the position
     *         specified by VerticalAlign:<ul> <li>number of pixels (px): The minimum
     *         value is 0 pixels, and the maximum value is the value of
     *         <code>MaxHeight</code>.</li> <li>integer percentage (%): The range of
     *         valid values is 0 to 100.</li> </ul> For example, if you specify
     *         <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code>
     *         for <code>VerticalOffset</code>, the top of the watermark appears 5
     *         pixels from the top border of the output video.
     *         <p><code>VerticalOffset</code> is only valid when the value of
     *         VerticalAlign is Top or Bottom. <p>If you specify an offset that
     *         causes the watermark to extend beyond the top or bottom border and
     *         Elastic Transcoder has not added black bars, the watermark is cropped.
     *         If Elastic Transcoder has added black bars, the watermark extends into
     *         the black bars. If the watermark extends beyond the black bars, it is
     *         cropped. <p>Use the value of <code>Target</code> to specify whether
     *         you want Elastic Transcoder to include the black bars that are added
     *         by Elastic Transcoder, if any, in the offset calculation.
     */
    public String getVerticalOffset() {
        return verticalOffset;
    }
    
    /**
     * <code>VerticalOffset</code> <p>The amount by which you want the
     * vertical position of the watermark to be offset from the position
     * specified by VerticalAlign:<ul> <li>number of pixels (px): The minimum
     * value is 0 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.</li> <li>integer percentage (%): The range of
     * valid values is 0 to 100.</li> </ul> For example, if you specify
     * <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code>
     * for <code>VerticalOffset</code>, the top of the watermark appears 5
     * pixels from the top border of the output video.
     * <p><code>VerticalOffset</code> is only valid when the value of
     * VerticalAlign is Top or Bottom. <p>If you specify an offset that
     * causes the watermark to extend beyond the top or bottom border and
     * Elastic Transcoder has not added black bars, the watermark is cropped.
     * If Elastic Transcoder has added black bars, the watermark extends into
     * the black bars. If the watermark extends beyond the black bars, it is
     * cropped. <p>Use the value of <code>Target</code> to specify whether
     * you want Elastic Transcoder to include the black bars that are added
     * by Elastic Transcoder, if any, in the offset calculation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @param verticalOffset <code>VerticalOffset</code> <p>The amount by which you want the
     *         vertical position of the watermark to be offset from the position
     *         specified by VerticalAlign:<ul> <li>number of pixels (px): The minimum
     *         value is 0 pixels, and the maximum value is the value of
     *         <code>MaxHeight</code>.</li> <li>integer percentage (%): The range of
     *         valid values is 0 to 100.</li> </ul> For example, if you specify
     *         <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code>
     *         for <code>VerticalOffset</code>, the top of the watermark appears 5
     *         pixels from the top border of the output video.
     *         <p><code>VerticalOffset</code> is only valid when the value of
     *         VerticalAlign is Top or Bottom. <p>If you specify an offset that
     *         causes the watermark to extend beyond the top or bottom border and
     *         Elastic Transcoder has not added black bars, the watermark is cropped.
     *         If Elastic Transcoder has added black bars, the watermark extends into
     *         the black bars. If the watermark extends beyond the black bars, it is
     *         cropped. <p>Use the value of <code>Target</code> to specify whether
     *         you want Elastic Transcoder to include the black bars that are added
     *         by Elastic Transcoder, if any, in the offset calculation.
     */
    public void setVerticalOffset(String verticalOffset) {
        this.verticalOffset = verticalOffset;
    }
    
    /**
     * <code>VerticalOffset</code> <p>The amount by which you want the
     * vertical position of the watermark to be offset from the position
     * specified by VerticalAlign:<ul> <li>number of pixels (px): The minimum
     * value is 0 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.</li> <li>integer percentage (%): The range of
     * valid values is 0 to 100.</li> </ul> For example, if you specify
     * <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code>
     * for <code>VerticalOffset</code>, the top of the watermark appears 5
     * pixels from the top border of the output video.
     * <p><code>VerticalOffset</code> is only valid when the value of
     * VerticalAlign is Top or Bottom. <p>If you specify an offset that
     * causes the watermark to extend beyond the top or bottom border and
     * Elastic Transcoder has not added black bars, the watermark is cropped.
     * If Elastic Transcoder has added black bars, the watermark extends into
     * the black bars. If the watermark extends beyond the black bars, it is
     * cropped. <p>Use the value of <code>Target</code> to specify whether
     * you want Elastic Transcoder to include the black bars that are added
     * by Elastic Transcoder, if any, in the offset calculation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,3}([.]\d{0,5})?%$)|(^\d{2,4}?px$)<br/>
     *
     * @param verticalOffset <code>VerticalOffset</code> <p>The amount by which you want the
     *         vertical position of the watermark to be offset from the position
     *         specified by VerticalAlign:<ul> <li>number of pixels (px): The minimum
     *         value is 0 pixels, and the maximum value is the value of
     *         <code>MaxHeight</code>.</li> <li>integer percentage (%): The range of
     *         valid values is 0 to 100.</li> </ul> For example, if you specify
     *         <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code>
     *         for <code>VerticalOffset</code>, the top of the watermark appears 5
     *         pixels from the top border of the output video.
     *         <p><code>VerticalOffset</code> is only valid when the value of
     *         VerticalAlign is Top or Bottom. <p>If you specify an offset that
     *         causes the watermark to extend beyond the top or bottom border and
     *         Elastic Transcoder has not added black bars, the watermark is cropped.
     *         If Elastic Transcoder has added black bars, the watermark extends into
     *         the black bars. If the watermark extends beyond the black bars, it is
     *         cropped. <p>Use the value of <code>Target</code> to specify whether
     *         you want Elastic Transcoder to include the black bars that are added
     *         by Elastic Transcoder, if any, in the offset calculation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PresetWatermark withVerticalOffset(String verticalOffset) {
        this.verticalOffset = verticalOffset;
        return this;
    }

    /**
     * A percentage that indicates how much you want a watermark to obscure
     * the video in the location where it appears. Valid values are 0 (the
     * watermark is invisible) to 100 (the watermark completely obscures the
     * video in the specified location). The datatype of <code>Opacity</code>
     * is float. <p>Elastic Transcoder supports transparent .png graphics. If
     * you use a transparent .png, the transparent portion of the video
     * appears as if you had specified a value of 0 for <code>Opacity</code>.
     * The .jpg file format doesn't support transparency.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,3}([.]\d{0,20})?$<br/>
     *
     * @return A percentage that indicates how much you want a watermark to obscure
     *         the video in the location where it appears. Valid values are 0 (the
     *         watermark is invisible) to 100 (the watermark completely obscures the
     *         video in the specified location). The datatype of <code>Opacity</code>
     *         is float. <p>Elastic Transcoder supports transparent .png graphics. If
     *         you use a transparent .png, the transparent portion of the video
     *         appears as if you had specified a value of 0 for <code>Opacity</code>.
     *         The .jpg file format doesn't support transparency.
     */
    public String getOpacity() {
        return opacity;
    }
    
    /**
     * A percentage that indicates how much you want a watermark to obscure
     * the video in the location where it appears. Valid values are 0 (the
     * watermark is invisible) to 100 (the watermark completely obscures the
     * video in the specified location). The datatype of <code>Opacity</code>
     * is float. <p>Elastic Transcoder supports transparent .png graphics. If
     * you use a transparent .png, the transparent portion of the video
     * appears as if you had specified a value of 0 for <code>Opacity</code>.
     * The .jpg file format doesn't support transparency.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,3}([.]\d{0,20})?$<br/>
     *
     * @param opacity A percentage that indicates how much you want a watermark to obscure
     *         the video in the location where it appears. Valid values are 0 (the
     *         watermark is invisible) to 100 (the watermark completely obscures the
     *         video in the specified location). The datatype of <code>Opacity</code>
     *         is float. <p>Elastic Transcoder supports transparent .png graphics. If
     *         you use a transparent .png, the transparent portion of the video
     *         appears as if you had specified a value of 0 for <code>Opacity</code>.
     *         The .jpg file format doesn't support transparency.
     */
    public void setOpacity(String opacity) {
        this.opacity = opacity;
    }
    
    /**
     * A percentage that indicates how much you want a watermark to obscure
     * the video in the location where it appears. Valid values are 0 (the
     * watermark is invisible) to 100 (the watermark completely obscures the
     * video in the specified location). The datatype of <code>Opacity</code>
     * is float. <p>Elastic Transcoder supports transparent .png graphics. If
     * you use a transparent .png, the transparent portion of the video
     * appears as if you had specified a value of 0 for <code>Opacity</code>.
     * The .jpg file format doesn't support transparency.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,3}([.]\d{0,20})?$<br/>
     *
     * @param opacity A percentage that indicates how much you want a watermark to obscure
     *         the video in the location where it appears. Valid values are 0 (the
     *         watermark is invisible) to 100 (the watermark completely obscures the
     *         video in the specified location). The datatype of <code>Opacity</code>
     *         is float. <p>Elastic Transcoder supports transparent .png graphics. If
     *         you use a transparent .png, the transparent portion of the video
     *         appears as if you had specified a value of 0 for <code>Opacity</code>.
     *         The .jpg file format doesn't support transparency.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PresetWatermark withOpacity(String opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * A value that determines how Elastic Transcoder interprets values that
     * you specified for <code>HorizontalOffset</code>,
     * <code>VerticalOffset</code>, <code>MaxWidth</code>, and
     * <code>MaxHeight</code>: <ul><li><b>Content</b>:
     * <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     * are calculated based on the borders of the video excluding black bars
     * added by Elastic Transcoder, if any. In addition,
     * <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     * percentage, are calculated based on the borders of the video excluding
     * black bars added by Elastic Transcoder, if any.</li> <li><b>Frame</b>:
     * <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     * are calculated based on the borders of the video including black bars
     * added by Elastic Transcoder, if any.</li> In addition,
     * <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     * percentage, are calculated based on the borders of the video including
     * black bars added by Elastic Transcoder, if any.</ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Content$)|(^Frame$)<br/>
     *
     * @return A value that determines how Elastic Transcoder interprets values that
     *         you specified for <code>HorizontalOffset</code>,
     *         <code>VerticalOffset</code>, <code>MaxWidth</code>, and
     *         <code>MaxHeight</code>: <ul><li><b>Content</b>:
     *         <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     *         are calculated based on the borders of the video excluding black bars
     *         added by Elastic Transcoder, if any. In addition,
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     *         percentage, are calculated based on the borders of the video excluding
     *         black bars added by Elastic Transcoder, if any.</li> <li><b>Frame</b>:
     *         <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     *         are calculated based on the borders of the video including black bars
     *         added by Elastic Transcoder, if any.</li> In addition,
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     *         percentage, are calculated based on the borders of the video including
     *         black bars added by Elastic Transcoder, if any.</ul>
     */
    public String getTarget() {
        return target;
    }
    
    /**
     * A value that determines how Elastic Transcoder interprets values that
     * you specified for <code>HorizontalOffset</code>,
     * <code>VerticalOffset</code>, <code>MaxWidth</code>, and
     * <code>MaxHeight</code>: <ul><li><b>Content</b>:
     * <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     * are calculated based on the borders of the video excluding black bars
     * added by Elastic Transcoder, if any. In addition,
     * <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     * percentage, are calculated based on the borders of the video excluding
     * black bars added by Elastic Transcoder, if any.</li> <li><b>Frame</b>:
     * <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     * are calculated based on the borders of the video including black bars
     * added by Elastic Transcoder, if any.</li> In addition,
     * <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     * percentage, are calculated based on the borders of the video including
     * black bars added by Elastic Transcoder, if any.</ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Content$)|(^Frame$)<br/>
     *
     * @param target A value that determines how Elastic Transcoder interprets values that
     *         you specified for <code>HorizontalOffset</code>,
     *         <code>VerticalOffset</code>, <code>MaxWidth</code>, and
     *         <code>MaxHeight</code>: <ul><li><b>Content</b>:
     *         <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     *         are calculated based on the borders of the video excluding black bars
     *         added by Elastic Transcoder, if any. In addition,
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     *         percentage, are calculated based on the borders of the video excluding
     *         black bars added by Elastic Transcoder, if any.</li> <li><b>Frame</b>:
     *         <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     *         are calculated based on the borders of the video including black bars
     *         added by Elastic Transcoder, if any.</li> In addition,
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     *         percentage, are calculated based on the borders of the video including
     *         black bars added by Elastic Transcoder, if any.</ul>
     */
    public void setTarget(String target) {
        this.target = target;
    }
    
    /**
     * A value that determines how Elastic Transcoder interprets values that
     * you specified for <code>HorizontalOffset</code>,
     * <code>VerticalOffset</code>, <code>MaxWidth</code>, and
     * <code>MaxHeight</code>: <ul><li><b>Content</b>:
     * <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     * are calculated based on the borders of the video excluding black bars
     * added by Elastic Transcoder, if any. In addition,
     * <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     * percentage, are calculated based on the borders of the video excluding
     * black bars added by Elastic Transcoder, if any.</li> <li><b>Frame</b>:
     * <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     * are calculated based on the borders of the video including black bars
     * added by Elastic Transcoder, if any.</li> In addition,
     * <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     * percentage, are calculated based on the borders of the video including
     * black bars added by Elastic Transcoder, if any.</ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Content$)|(^Frame$)<br/>
     *
     * @param target A value that determines how Elastic Transcoder interprets values that
     *         you specified for <code>HorizontalOffset</code>,
     *         <code>VerticalOffset</code>, <code>MaxWidth</code>, and
     *         <code>MaxHeight</code>: <ul><li><b>Content</b>:
     *         <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     *         are calculated based on the borders of the video excluding black bars
     *         added by Elastic Transcoder, if any. In addition,
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     *         percentage, are calculated based on the borders of the video excluding
     *         black bars added by Elastic Transcoder, if any.</li> <li><b>Frame</b>:
     *         <code>HorizontalOffset</code> and <code>VerticalOffset</code> values
     *         are calculated based on the borders of the video including black bars
     *         added by Elastic Transcoder, if any.</li> In addition,
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a
     *         percentage, are calculated based on the borders of the video including
     *         black bars added by Elastic Transcoder, if any.</ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PresetWatermark withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getMaxWidth() != null) sb.append("MaxWidth: " + getMaxWidth() + ",");
        if (getMaxHeight() != null) sb.append("MaxHeight: " + getMaxHeight() + ",");
        if (getSizingPolicy() != null) sb.append("SizingPolicy: " + getSizingPolicy() + ",");
        if (getHorizontalAlign() != null) sb.append("HorizontalAlign: " + getHorizontalAlign() + ",");
        if (getHorizontalOffset() != null) sb.append("HorizontalOffset: " + getHorizontalOffset() + ",");
        if (getVerticalAlign() != null) sb.append("VerticalAlign: " + getVerticalAlign() + ",");
        if (getVerticalOffset() != null) sb.append("VerticalOffset: " + getVerticalOffset() + ",");
        if (getOpacity() != null) sb.append("Opacity: " + getOpacity() + ",");
        if (getTarget() != null) sb.append("Target: " + getTarget() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getMaxWidth() == null) ? 0 : getMaxWidth().hashCode()); 
        hashCode = prime * hashCode + ((getMaxHeight() == null) ? 0 : getMaxHeight().hashCode()); 
        hashCode = prime * hashCode + ((getSizingPolicy() == null) ? 0 : getSizingPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getHorizontalAlign() == null) ? 0 : getHorizontalAlign().hashCode()); 
        hashCode = prime * hashCode + ((getHorizontalOffset() == null) ? 0 : getHorizontalOffset().hashCode()); 
        hashCode = prime * hashCode + ((getVerticalAlign() == null) ? 0 : getVerticalAlign().hashCode()); 
        hashCode = prime * hashCode + ((getVerticalOffset() == null) ? 0 : getVerticalOffset().hashCode()); 
        hashCode = prime * hashCode + ((getOpacity() == null) ? 0 : getOpacity().hashCode()); 
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PresetWatermark == false) return false;
        PresetWatermark other = (PresetWatermark)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getMaxWidth() == null ^ this.getMaxWidth() == null) return false;
        if (other.getMaxWidth() != null && other.getMaxWidth().equals(this.getMaxWidth()) == false) return false; 
        if (other.getMaxHeight() == null ^ this.getMaxHeight() == null) return false;
        if (other.getMaxHeight() != null && other.getMaxHeight().equals(this.getMaxHeight()) == false) return false; 
        if (other.getSizingPolicy() == null ^ this.getSizingPolicy() == null) return false;
        if (other.getSizingPolicy() != null && other.getSizingPolicy().equals(this.getSizingPolicy()) == false) return false; 
        if (other.getHorizontalAlign() == null ^ this.getHorizontalAlign() == null) return false;
        if (other.getHorizontalAlign() != null && other.getHorizontalAlign().equals(this.getHorizontalAlign()) == false) return false; 
        if (other.getHorizontalOffset() == null ^ this.getHorizontalOffset() == null) return false;
        if (other.getHorizontalOffset() != null && other.getHorizontalOffset().equals(this.getHorizontalOffset()) == false) return false; 
        if (other.getVerticalAlign() == null ^ this.getVerticalAlign() == null) return false;
        if (other.getVerticalAlign() != null && other.getVerticalAlign().equals(this.getVerticalAlign()) == false) return false; 
        if (other.getVerticalOffset() == null ^ this.getVerticalOffset() == null) return false;
        if (other.getVerticalOffset() != null && other.getVerticalOffset().equals(this.getVerticalOffset()) == false) return false; 
        if (other.getOpacity() == null ^ this.getOpacity() == null) return false;
        if (other.getOpacity() != null && other.getOpacity().equals(this.getOpacity()) == false) return false; 
        if (other.getTarget() == null ^ this.getTarget() == null) return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false) return false; 
        return true;
    }
    
}
    