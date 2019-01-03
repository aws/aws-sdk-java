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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over videos that
 * are transcoded using this preset. You can specify settings for up to four watermarks. Watermarks appear in the
 * specified size and location, and with the specified opacity for the duration of the transcoded video.
 * </p>
 * <p>
 * Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the .png
 * format, which supports transparency.
 * </p>
 * <p>
 * When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic Transcoder
 * to include in the transcoded videos. You can specify fewer graphics in the job than you specify watermark settings in
 * the preset, which allows you to use the same preset for up to four watermarks that have different dimensions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PresetWatermark implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the settings for one watermark. The value of <code>Id</code> can be up to 40 characters
     * long.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The maximum width of the watermark in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     * <code>MaxWidth</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to specify
     * whether you want Elastic Transcoder to include the black bars that are added by Elastic Transcoder, if any, in
     * the calculation.
     * </p>
     * <p>
     * If you specify the value in pixels, it must be less than or equal to the value of <code>MaxWidth</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String maxWidth;
    /**
     * <p>
     * The maximum height of the watermark in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to specify
     * whether you want Elastic Transcoder to include the black bars that are added by Elastic Transcoder, if any, in
     * the calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the value in pixels, it must be less than or equal to the value of <code>MaxHeight</code>.
     * </p>
     */
    private String maxHeight;
    /**
     * <p>
     * A value that controls scaling of the watermark:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Fit</b>: Elastic Transcoder scales the watermark so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stretch</b>: Elastic Transcoder stretches the watermark to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the watermark and the values of
     * <code>MaxWidth</code> and <code>MaxHeight</code> are different, the watermark will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down so that its dimensions match the values that you
     * specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either value. If
     * you specify this option, Elastic Transcoder does not scale the watermark up.
     * </p>
     * </li>
     * </ul>
     */
    private String sizingPolicy;
    /**
     * <p>
     * The horizontal position of the watermark unless you specify a non-zero value for <code>HorizontalOffset</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Left</b>: The left edge of the watermark is aligned with the left border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Right</b>: The right edge of the watermark is aligned with the right border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Center</b>: The watermark is centered between the left and right borders.
     * </p>
     * </li>
     * </ul>
     */
    private String horizontalAlign;
    /**
     * <p>
     * The amount by which you want the horizontal position of the watermark to be offset from the position specified by
     * HorizontalAlign:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of MaxWidth.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if you specify Left for <code>HorizontalAlign</code> and 5px for <code>HorizontalOffset</code>, the
     * left side of the watermark appears 5 pixels from the left border of the output video.
     * </p>
     * <p>
     * <code>HorizontalOffset</code> is only valid when the value of <code>HorizontalAlign</code> is <code>Left</code>
     * or <code>Right</code>. If you specify an offset that causes the watermark to extend beyond the left or right
     * border and Elastic Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added
     * black bars, the watermark extends into the black bars. If the watermark extends beyond the black bars, it is
     * cropped.
     * </p>
     * <p>
     * Use the value of <code>Target</code> to specify whether you want to include the black bars that are added by
     * Elastic Transcoder, if any, in the offset calculation.
     * </p>
     */
    private String horizontalOffset;
    /**
     * <p>
     * The vertical position of the watermark unless you specify a non-zero value for <code>VerticalOffset</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Top</b>: The top edge of the watermark is aligned with the top border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Bottom</b>: The bottom edge of the watermark is aligned with the bottom border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Center</b>: The watermark is centered between the top and bottom borders.
     * </p>
     * </li>
     * </ul>
     */
    private String verticalAlign;
    /**
     * <p>
     * <code>VerticalOffset</code>
     * </p>
     * <p>
     * The amount by which you want the vertical position of the watermark to be offset from the position specified by
     * VerticalAlign:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if you specify <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code> for
     * <code>VerticalOffset</code>, the top of the watermark appears 5 pixels from the top border of the output video.
     * </p>
     * <p>
     * <code>VerticalOffset</code> is only valid when the value of VerticalAlign is Top or Bottom.
     * </p>
     * <p>
     * If you specify an offset that causes the watermark to extend beyond the top or bottom border and Elastic
     * Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added black bars, the
     * watermark extends into the black bars. If the watermark extends beyond the black bars, it is cropped.
     * </p>
     * <p>
     * Use the value of <code>Target</code> to specify whether you want Elastic Transcoder to include the black bars
     * that are added by Elastic Transcoder, if any, in the offset calculation.
     * </p>
     */
    private String verticalOffset;
    /**
     * <p>
     * A percentage that indicates how much you want a watermark to obscure the video in the location where it appears.
     * Valid values are 0 (the watermark is invisible) to 100 (the watermark completely obscures the video in the
     * specified location). The datatype of <code>Opacity</code> is float.
     * </p>
     * <p>
     * Elastic Transcoder supports transparent .png graphics. If you use a transparent .png, the transparent portion of
     * the video appears as if you had specified a value of 0 for <code>Opacity</code>. The .jpg file format doesn't
     * support transparency.
     * </p>
     */
    private String opacity;
    /**
     * <p>
     * A value that determines how Elastic Transcoder interprets values that you specified for
     * <code>HorizontalOffset</code>, <code>VerticalOffset</code>, <code>MaxWidth</code>, and <code>MaxHeight</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Content</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based on the
     * borders of the video excluding black bars added by Elastic Transcoder, if any. In addition, <code>MaxWidth</code>
     * and <code>MaxHeight</code>, if specified as a percentage, are calculated based on the borders of the video
     * excluding black bars added by Elastic Transcoder, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Frame</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based on the
     * borders of the video including black bars added by Elastic Transcoder, if any. In addition, <code>MaxWidth</code>
     * and <code>MaxHeight</code>, if specified as a percentage, are calculated based on the borders of the video
     * including black bars added by Elastic Transcoder, if any.
     * </p>
     * </li>
     * </ul>
     */
    private String target;

    /**
     * <p>
     * A unique identifier for the settings for one watermark. The value of <code>Id</code> can be up to 40 characters
     * long.
     * </p>
     * 
     * @param id
     *        A unique identifier for the settings for one watermark. The value of <code>Id</code> can be up to 40
     *        characters long.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the settings for one watermark. The value of <code>Id</code> can be up to 40 characters
     * long.
     * </p>
     * 
     * @return A unique identifier for the settings for one watermark. The value of <code>Id</code> can be up to 40
     *         characters long.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the settings for one watermark. The value of <code>Id</code> can be up to 40 characters
     * long.
     * </p>
     * 
     * @param id
     *        A unique identifier for the settings for one watermark. The value of <code>Id</code> can be up to 40
     *        characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetWatermark withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The maximum width of the watermark in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     * <code>MaxWidth</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to specify
     * whether you want Elastic Transcoder to include the black bars that are added by Elastic Transcoder, if any, in
     * the calculation.
     * </p>
     * <p>
     * If you specify the value in pixels, it must be less than or equal to the value of <code>MaxWidth</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxWidth
     *        The maximum width of the watermark in one of the following formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     *        <code>MaxWidth</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to
     *        specify whether you want Elastic Transcoder to include the black bars that are added by Elastic
     *        Transcoder, if any, in the calculation.
     *        </p>
     *        <p>
     *        If you specify the value in pixels, it must be less than or equal to the value of <code>MaxWidth</code>.
     *        </p>
     *        </li>
     */

    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }

    /**
     * <p>
     * The maximum width of the watermark in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     * <code>MaxWidth</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to specify
     * whether you want Elastic Transcoder to include the black bars that are added by Elastic Transcoder, if any, in
     * the calculation.
     * </p>
     * <p>
     * If you specify the value in pixels, it must be less than or equal to the value of <code>MaxWidth</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The maximum width of the watermark in one of the following formats: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     *         <code>MaxWidth</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to
     *         specify whether you want Elastic Transcoder to include the black bars that are added by Elastic
     *         Transcoder, if any, in the calculation.
     *         </p>
     *         <p>
     *         If you specify the value in pixels, it must be less than or equal to the value of <code>MaxWidth</code>.
     *         </p>
     *         </li>
     */

    public String getMaxWidth() {
        return this.maxWidth;
    }

    /**
     * <p>
     * The maximum width of the watermark in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     * <code>MaxWidth</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to specify
     * whether you want Elastic Transcoder to include the black bars that are added by Elastic Transcoder, if any, in
     * the calculation.
     * </p>
     * <p>
     * If you specify the value in pixels, it must be less than or equal to the value of <code>MaxWidth</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxWidth
     *        The maximum width of the watermark in one of the following formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     *        <code>MaxWidth</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to
     *        specify whether you want Elastic Transcoder to include the black bars that are added by Elastic
     *        Transcoder, if any, in the calculation.
     *        </p>
     *        <p>
     *        If you specify the value in pixels, it must be less than or equal to the value of <code>MaxWidth</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetWatermark withMaxWidth(String maxWidth) {
        setMaxWidth(maxWidth);
        return this;
    }

    /**
     * <p>
     * The maximum height of the watermark in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to specify
     * whether you want Elastic Transcoder to include the black bars that are added by Elastic Transcoder, if any, in
     * the calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the value in pixels, it must be less than or equal to the value of <code>MaxHeight</code>.
     * </p>
     * 
     * @param maxHeight
     *        The maximum height of the watermark in one of the following formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     *        <code>MaxHeight</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to
     *        specify whether you want Elastic Transcoder to include the black bars that are added by Elastic
     *        Transcoder, if any, in the calculation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify the value in pixels, it must be less than or equal to the value of <code>MaxHeight</code>.
     */

    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }

    /**
     * <p>
     * The maximum height of the watermark in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to specify
     * whether you want Elastic Transcoder to include the black bars that are added by Elastic Transcoder, if any, in
     * the calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the value in pixels, it must be less than or equal to the value of <code>MaxHeight</code>.
     * </p>
     * 
     * @return The maximum height of the watermark in one of the following formats: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     *         <code>MaxHeight</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to
     *         specify whether you want Elastic Transcoder to include the black bars that are added by Elastic
     *         Transcoder, if any, in the calculation.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify the value in pixels, it must be less than or equal to the value of <code>MaxHeight</code>.
     */

    public String getMaxHeight() {
        return this.maxHeight;
    }

    /**
     * <p>
     * The maximum height of the watermark in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to specify
     * whether you want Elastic Transcoder to include the black bars that are added by Elastic Transcoder, if any, in
     * the calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the value in pixels, it must be less than or equal to the value of <code>MaxHeight</code>.
     * </p>
     * 
     * @param maxHeight
     *        The maximum height of the watermark in one of the following formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of
     *        <code>MaxHeight</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        integer percentage (%): The range of valid values is 0 to 100. Use the value of <code>Target</code> to
     *        specify whether you want Elastic Transcoder to include the black bars that are added by Elastic
     *        Transcoder, if any, in the calculation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify the value in pixels, it must be less than or equal to the value of <code>MaxHeight</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetWatermark withMaxHeight(String maxHeight) {
        setMaxHeight(maxHeight);
        return this;
    }

    /**
     * <p>
     * A value that controls scaling of the watermark:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Fit</b>: Elastic Transcoder scales the watermark so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stretch</b>: Elastic Transcoder stretches the watermark to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the watermark and the values of
     * <code>MaxWidth</code> and <code>MaxHeight</code> are different, the watermark will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down so that its dimensions match the values that you
     * specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either value. If
     * you specify this option, Elastic Transcoder does not scale the watermark up.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sizingPolicy
     *        A value that controls scaling of the watermark: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Fit</b>: Elastic Transcoder scales the watermark so it matches the value that you specified in either
     *        <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Stretch</b>: Elastic Transcoder stretches the watermark to match the values that you specified for
     *        <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the watermark and the
     *        values of <code>MaxWidth</code> and <code>MaxHeight</code> are different, the watermark will be distorted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down so that its dimensions match the values
     *        that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     *        either value. If you specify this option, Elastic Transcoder does not scale the watermark up.
     *        </p>
     *        </li>
     */

    public void setSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
    }

    /**
     * <p>
     * A value that controls scaling of the watermark:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Fit</b>: Elastic Transcoder scales the watermark so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stretch</b>: Elastic Transcoder stretches the watermark to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the watermark and the values of
     * <code>MaxWidth</code> and <code>MaxHeight</code> are different, the watermark will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down so that its dimensions match the values that you
     * specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either value. If
     * you specify this option, Elastic Transcoder does not scale the watermark up.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A value that controls scaling of the watermark: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Fit</b>: Elastic Transcoder scales the watermark so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Stretch</b>: Elastic Transcoder stretches the watermark to match the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the watermark and the
     *         values of <code>MaxWidth</code> and <code>MaxHeight</code> are different, the watermark will be
     *         distorted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down so that its dimensions match the values
     *         that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     *         either value. If you specify this option, Elastic Transcoder does not scale the watermark up.
     *         </p>
     *         </li>
     */

    public String getSizingPolicy() {
        return this.sizingPolicy;
    }

    /**
     * <p>
     * A value that controls scaling of the watermark:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Fit</b>: Elastic Transcoder scales the watermark so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stretch</b>: Elastic Transcoder stretches the watermark to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the watermark and the values of
     * <code>MaxWidth</code> and <code>MaxHeight</code> are different, the watermark will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down so that its dimensions match the values that you
     * specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either value. If
     * you specify this option, Elastic Transcoder does not scale the watermark up.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sizingPolicy
     *        A value that controls scaling of the watermark: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Fit</b>: Elastic Transcoder scales the watermark so it matches the value that you specified in either
     *        <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Stretch</b>: Elastic Transcoder stretches the watermark to match the values that you specified for
     *        <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the watermark and the
     *        values of <code>MaxWidth</code> and <code>MaxHeight</code> are different, the watermark will be distorted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ShrinkToFit</b>: Elastic Transcoder scales the watermark down so that its dimensions match the values
     *        that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     *        either value. If you specify this option, Elastic Transcoder does not scale the watermark up.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetWatermark withSizingPolicy(String sizingPolicy) {
        setSizingPolicy(sizingPolicy);
        return this;
    }

    /**
     * <p>
     * The horizontal position of the watermark unless you specify a non-zero value for <code>HorizontalOffset</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Left</b>: The left edge of the watermark is aligned with the left border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Right</b>: The right edge of the watermark is aligned with the right border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Center</b>: The watermark is centered between the left and right borders.
     * </p>
     * </li>
     * </ul>
     * 
     * @param horizontalAlign
     *        The horizontal position of the watermark unless you specify a non-zero value for
     *        <code>HorizontalOffset</code>: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Left</b>: The left edge of the watermark is aligned with the left border of the video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Right</b>: The right edge of the watermark is aligned with the right border of the video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Center</b>: The watermark is centered between the left and right borders.
     *        </p>
     *        </li>
     */

    public void setHorizontalAlign(String horizontalAlign) {
        this.horizontalAlign = horizontalAlign;
    }

    /**
     * <p>
     * The horizontal position of the watermark unless you specify a non-zero value for <code>HorizontalOffset</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Left</b>: The left edge of the watermark is aligned with the left border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Right</b>: The right edge of the watermark is aligned with the right border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Center</b>: The watermark is centered between the left and right borders.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The horizontal position of the watermark unless you specify a non-zero value for
     *         <code>HorizontalOffset</code>: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Left</b>: The left edge of the watermark is aligned with the left border of the video.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Right</b>: The right edge of the watermark is aligned with the right border of the video.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Center</b>: The watermark is centered between the left and right borders.
     *         </p>
     *         </li>
     */

    public String getHorizontalAlign() {
        return this.horizontalAlign;
    }

    /**
     * <p>
     * The horizontal position of the watermark unless you specify a non-zero value for <code>HorizontalOffset</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Left</b>: The left edge of the watermark is aligned with the left border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Right</b>: The right edge of the watermark is aligned with the right border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Center</b>: The watermark is centered between the left and right borders.
     * </p>
     * </li>
     * </ul>
     * 
     * @param horizontalAlign
     *        The horizontal position of the watermark unless you specify a non-zero value for
     *        <code>HorizontalOffset</code>: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Left</b>: The left edge of the watermark is aligned with the left border of the video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Right</b>: The right edge of the watermark is aligned with the right border of the video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Center</b>: The watermark is centered between the left and right borders.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetWatermark withHorizontalAlign(String horizontalAlign) {
        setHorizontalAlign(horizontalAlign);
        return this;
    }

    /**
     * <p>
     * The amount by which you want the horizontal position of the watermark to be offset from the position specified by
     * HorizontalAlign:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of MaxWidth.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if you specify Left for <code>HorizontalAlign</code> and 5px for <code>HorizontalOffset</code>, the
     * left side of the watermark appears 5 pixels from the left border of the output video.
     * </p>
     * <p>
     * <code>HorizontalOffset</code> is only valid when the value of <code>HorizontalAlign</code> is <code>Left</code>
     * or <code>Right</code>. If you specify an offset that causes the watermark to extend beyond the left or right
     * border and Elastic Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added
     * black bars, the watermark extends into the black bars. If the watermark extends beyond the black bars, it is
     * cropped.
     * </p>
     * <p>
     * Use the value of <code>Target</code> to specify whether you want to include the black bars that are added by
     * Elastic Transcoder, if any, in the offset calculation.
     * </p>
     * 
     * @param horizontalOffset
     *        The amount by which you want the horizontal position of the watermark to be offset from the position
     *        specified by HorizontalAlign: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of MaxWidth.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        integer percentage (%): The range of valid values is 0 to 100.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if you specify Left for <code>HorizontalAlign</code> and 5px for
     *        <code>HorizontalOffset</code>, the left side of the watermark appears 5 pixels from the left border of the
     *        output video.
     *        </p>
     *        <p>
     *        <code>HorizontalOffset</code> is only valid when the value of <code>HorizontalAlign</code> is
     *        <code>Left</code> or <code>Right</code>. If you specify an offset that causes the watermark to extend
     *        beyond the left or right border and Elastic Transcoder has not added black bars, the watermark is cropped.
     *        If Elastic Transcoder has added black bars, the watermark extends into the black bars. If the watermark
     *        extends beyond the black bars, it is cropped.
     *        </p>
     *        <p>
     *        Use the value of <code>Target</code> to specify whether you want to include the black bars that are added
     *        by Elastic Transcoder, if any, in the offset calculation.
     */

    public void setHorizontalOffset(String horizontalOffset) {
        this.horizontalOffset = horizontalOffset;
    }

    /**
     * <p>
     * The amount by which you want the horizontal position of the watermark to be offset from the position specified by
     * HorizontalAlign:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of MaxWidth.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if you specify Left for <code>HorizontalAlign</code> and 5px for <code>HorizontalOffset</code>, the
     * left side of the watermark appears 5 pixels from the left border of the output video.
     * </p>
     * <p>
     * <code>HorizontalOffset</code> is only valid when the value of <code>HorizontalAlign</code> is <code>Left</code>
     * or <code>Right</code>. If you specify an offset that causes the watermark to extend beyond the left or right
     * border and Elastic Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added
     * black bars, the watermark extends into the black bars. If the watermark extends beyond the black bars, it is
     * cropped.
     * </p>
     * <p>
     * Use the value of <code>Target</code> to specify whether you want to include the black bars that are added by
     * Elastic Transcoder, if any, in the offset calculation.
     * </p>
     * 
     * @return The amount by which you want the horizontal position of the watermark to be offset from the position
     *         specified by HorizontalAlign: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of MaxWidth.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         integer percentage (%): The range of valid values is 0 to 100.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, if you specify Left for <code>HorizontalAlign</code> and 5px for
     *         <code>HorizontalOffset</code>, the left side of the watermark appears 5 pixels from the left border of
     *         the output video.
     *         </p>
     *         <p>
     *         <code>HorizontalOffset</code> is only valid when the value of <code>HorizontalAlign</code> is
     *         <code>Left</code> or <code>Right</code>. If you specify an offset that causes the watermark to extend
     *         beyond the left or right border and Elastic Transcoder has not added black bars, the watermark is
     *         cropped. If Elastic Transcoder has added black bars, the watermark extends into the black bars. If the
     *         watermark extends beyond the black bars, it is cropped.
     *         </p>
     *         <p>
     *         Use the value of <code>Target</code> to specify whether you want to include the black bars that are added
     *         by Elastic Transcoder, if any, in the offset calculation.
     */

    public String getHorizontalOffset() {
        return this.horizontalOffset;
    }

    /**
     * <p>
     * The amount by which you want the horizontal position of the watermark to be offset from the position specified by
     * HorizontalAlign:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of MaxWidth.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if you specify Left for <code>HorizontalAlign</code> and 5px for <code>HorizontalOffset</code>, the
     * left side of the watermark appears 5 pixels from the left border of the output video.
     * </p>
     * <p>
     * <code>HorizontalOffset</code> is only valid when the value of <code>HorizontalAlign</code> is <code>Left</code>
     * or <code>Right</code>. If you specify an offset that causes the watermark to extend beyond the left or right
     * border and Elastic Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added
     * black bars, the watermark extends into the black bars. If the watermark extends beyond the black bars, it is
     * cropped.
     * </p>
     * <p>
     * Use the value of <code>Target</code> to specify whether you want to include the black bars that are added by
     * Elastic Transcoder, if any, in the offset calculation.
     * </p>
     * 
     * @param horizontalOffset
     *        The amount by which you want the horizontal position of the watermark to be offset from the position
     *        specified by HorizontalAlign: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of MaxWidth.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        integer percentage (%): The range of valid values is 0 to 100.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if you specify Left for <code>HorizontalAlign</code> and 5px for
     *        <code>HorizontalOffset</code>, the left side of the watermark appears 5 pixels from the left border of the
     *        output video.
     *        </p>
     *        <p>
     *        <code>HorizontalOffset</code> is only valid when the value of <code>HorizontalAlign</code> is
     *        <code>Left</code> or <code>Right</code>. If you specify an offset that causes the watermark to extend
     *        beyond the left or right border and Elastic Transcoder has not added black bars, the watermark is cropped.
     *        If Elastic Transcoder has added black bars, the watermark extends into the black bars. If the watermark
     *        extends beyond the black bars, it is cropped.
     *        </p>
     *        <p>
     *        Use the value of <code>Target</code> to specify whether you want to include the black bars that are added
     *        by Elastic Transcoder, if any, in the offset calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetWatermark withHorizontalOffset(String horizontalOffset) {
        setHorizontalOffset(horizontalOffset);
        return this;
    }

    /**
     * <p>
     * The vertical position of the watermark unless you specify a non-zero value for <code>VerticalOffset</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Top</b>: The top edge of the watermark is aligned with the top border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Bottom</b>: The bottom edge of the watermark is aligned with the bottom border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Center</b>: The watermark is centered between the top and bottom borders.
     * </p>
     * </li>
     * </ul>
     * 
     * @param verticalAlign
     *        The vertical position of the watermark unless you specify a non-zero value for <code>VerticalOffset</code>
     *        : </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Top</b>: The top edge of the watermark is aligned with the top border of the video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Bottom</b>: The bottom edge of the watermark is aligned with the bottom border of the video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Center</b>: The watermark is centered between the top and bottom borders.
     *        </p>
     *        </li>
     */

    public void setVerticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
    }

    /**
     * <p>
     * The vertical position of the watermark unless you specify a non-zero value for <code>VerticalOffset</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Top</b>: The top edge of the watermark is aligned with the top border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Bottom</b>: The bottom edge of the watermark is aligned with the bottom border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Center</b>: The watermark is centered between the top and bottom borders.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The vertical position of the watermark unless you specify a non-zero value for
     *         <code>VerticalOffset</code>: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Top</b>: The top edge of the watermark is aligned with the top border of the video.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Bottom</b>: The bottom edge of the watermark is aligned with the bottom border of the video.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Center</b>: The watermark is centered between the top and bottom borders.
     *         </p>
     *         </li>
     */

    public String getVerticalAlign() {
        return this.verticalAlign;
    }

    /**
     * <p>
     * The vertical position of the watermark unless you specify a non-zero value for <code>VerticalOffset</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Top</b>: The top edge of the watermark is aligned with the top border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Bottom</b>: The bottom edge of the watermark is aligned with the bottom border of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Center</b>: The watermark is centered between the top and bottom borders.
     * </p>
     * </li>
     * </ul>
     * 
     * @param verticalAlign
     *        The vertical position of the watermark unless you specify a non-zero value for <code>VerticalOffset</code>
     *        : </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Top</b>: The top edge of the watermark is aligned with the top border of the video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Bottom</b>: The bottom edge of the watermark is aligned with the bottom border of the video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Center</b>: The watermark is centered between the top and bottom borders.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetWatermark withVerticalAlign(String verticalAlign) {
        setVerticalAlign(verticalAlign);
        return this;
    }

    /**
     * <p>
     * <code>VerticalOffset</code>
     * </p>
     * <p>
     * The amount by which you want the vertical position of the watermark to be offset from the position specified by
     * VerticalAlign:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if you specify <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code> for
     * <code>VerticalOffset</code>, the top of the watermark appears 5 pixels from the top border of the output video.
     * </p>
     * <p>
     * <code>VerticalOffset</code> is only valid when the value of VerticalAlign is Top or Bottom.
     * </p>
     * <p>
     * If you specify an offset that causes the watermark to extend beyond the top or bottom border and Elastic
     * Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added black bars, the
     * watermark extends into the black bars. If the watermark extends beyond the black bars, it is cropped.
     * </p>
     * <p>
     * Use the value of <code>Target</code> to specify whether you want Elastic Transcoder to include the black bars
     * that are added by Elastic Transcoder, if any, in the offset calculation.
     * </p>
     * 
     * @param verticalOffset
     *        <code>VerticalOffset</code> </p>
     *        <p>
     *        The amount by which you want the vertical position of the watermark to be offset from the position
     *        specified by VerticalAlign:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of
     *        <code>MaxHeight</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        integer percentage (%): The range of valid values is 0 to 100.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if you specify <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code> for
     *        <code>VerticalOffset</code>, the top of the watermark appears 5 pixels from the top border of the output
     *        video.
     *        </p>
     *        <p>
     *        <code>VerticalOffset</code> is only valid when the value of VerticalAlign is Top or Bottom.
     *        </p>
     *        <p>
     *        If you specify an offset that causes the watermark to extend beyond the top or bottom border and Elastic
     *        Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added black bars,
     *        the watermark extends into the black bars. If the watermark extends beyond the black bars, it is cropped.
     *        </p>
     *        <p>
     *        Use the value of <code>Target</code> to specify whether you want Elastic Transcoder to include the black
     *        bars that are added by Elastic Transcoder, if any, in the offset calculation.
     */

    public void setVerticalOffset(String verticalOffset) {
        this.verticalOffset = verticalOffset;
    }

    /**
     * <p>
     * <code>VerticalOffset</code>
     * </p>
     * <p>
     * The amount by which you want the vertical position of the watermark to be offset from the position specified by
     * VerticalAlign:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if you specify <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code> for
     * <code>VerticalOffset</code>, the top of the watermark appears 5 pixels from the top border of the output video.
     * </p>
     * <p>
     * <code>VerticalOffset</code> is only valid when the value of VerticalAlign is Top or Bottom.
     * </p>
     * <p>
     * If you specify an offset that causes the watermark to extend beyond the top or bottom border and Elastic
     * Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added black bars, the
     * watermark extends into the black bars. If the watermark extends beyond the black bars, it is cropped.
     * </p>
     * <p>
     * Use the value of <code>Target</code> to specify whether you want Elastic Transcoder to include the black bars
     * that are added by Elastic Transcoder, if any, in the offset calculation.
     * </p>
     * 
     * @return <code>VerticalOffset</code> </p>
     *         <p>
     *         The amount by which you want the vertical position of the watermark to be offset from the position
     *         specified by VerticalAlign:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of
     *         <code>MaxHeight</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         integer percentage (%): The range of valid values is 0 to 100.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, if you specify <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code> for
     *         <code>VerticalOffset</code>, the top of the watermark appears 5 pixels from the top border of the output
     *         video.
     *         </p>
     *         <p>
     *         <code>VerticalOffset</code> is only valid when the value of VerticalAlign is Top or Bottom.
     *         </p>
     *         <p>
     *         If you specify an offset that causes the watermark to extend beyond the top or bottom border and Elastic
     *         Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added black
     *         bars, the watermark extends into the black bars. If the watermark extends beyond the black bars, it is
     *         cropped.
     *         </p>
     *         <p>
     *         Use the value of <code>Target</code> to specify whether you want Elastic Transcoder to include the black
     *         bars that are added by Elastic Transcoder, if any, in the offset calculation.
     */

    public String getVerticalOffset() {
        return this.verticalOffset;
    }

    /**
     * <p>
     * <code>VerticalOffset</code>
     * </p>
     * <p>
     * The amount by which you want the vertical position of the watermark to be offset from the position specified by
     * VerticalAlign:
     * </p>
     * <ul>
     * <li>
     * <p>
     * number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of
     * <code>MaxHeight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * integer percentage (%): The range of valid values is 0 to 100.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if you specify <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code> for
     * <code>VerticalOffset</code>, the top of the watermark appears 5 pixels from the top border of the output video.
     * </p>
     * <p>
     * <code>VerticalOffset</code> is only valid when the value of VerticalAlign is Top or Bottom.
     * </p>
     * <p>
     * If you specify an offset that causes the watermark to extend beyond the top or bottom border and Elastic
     * Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added black bars, the
     * watermark extends into the black bars. If the watermark extends beyond the black bars, it is cropped.
     * </p>
     * <p>
     * Use the value of <code>Target</code> to specify whether you want Elastic Transcoder to include the black bars
     * that are added by Elastic Transcoder, if any, in the offset calculation.
     * </p>
     * 
     * @param verticalOffset
     *        <code>VerticalOffset</code> </p>
     *        <p>
     *        The amount by which you want the vertical position of the watermark to be offset from the position
     *        specified by VerticalAlign:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of
     *        <code>MaxHeight</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        integer percentage (%): The range of valid values is 0 to 100.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if you specify <code>Top</code> for <code>VerticalAlign</code> and <code>5px</code> for
     *        <code>VerticalOffset</code>, the top of the watermark appears 5 pixels from the top border of the output
     *        video.
     *        </p>
     *        <p>
     *        <code>VerticalOffset</code> is only valid when the value of VerticalAlign is Top or Bottom.
     *        </p>
     *        <p>
     *        If you specify an offset that causes the watermark to extend beyond the top or bottom border and Elastic
     *        Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added black bars,
     *        the watermark extends into the black bars. If the watermark extends beyond the black bars, it is cropped.
     *        </p>
     *        <p>
     *        Use the value of <code>Target</code> to specify whether you want Elastic Transcoder to include the black
     *        bars that are added by Elastic Transcoder, if any, in the offset calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetWatermark withVerticalOffset(String verticalOffset) {
        setVerticalOffset(verticalOffset);
        return this;
    }

    /**
     * <p>
     * A percentage that indicates how much you want a watermark to obscure the video in the location where it appears.
     * Valid values are 0 (the watermark is invisible) to 100 (the watermark completely obscures the video in the
     * specified location). The datatype of <code>Opacity</code> is float.
     * </p>
     * <p>
     * Elastic Transcoder supports transparent .png graphics. If you use a transparent .png, the transparent portion of
     * the video appears as if you had specified a value of 0 for <code>Opacity</code>. The .jpg file format doesn't
     * support transparency.
     * </p>
     * 
     * @param opacity
     *        A percentage that indicates how much you want a watermark to obscure the video in the location where it
     *        appears. Valid values are 0 (the watermark is invisible) to 100 (the watermark completely obscures the
     *        video in the specified location). The datatype of <code>Opacity</code> is float.</p>
     *        <p>
     *        Elastic Transcoder supports transparent .png graphics. If you use a transparent .png, the transparent
     *        portion of the video appears as if you had specified a value of 0 for <code>Opacity</code>. The .jpg file
     *        format doesn't support transparency.
     */

    public void setOpacity(String opacity) {
        this.opacity = opacity;
    }

    /**
     * <p>
     * A percentage that indicates how much you want a watermark to obscure the video in the location where it appears.
     * Valid values are 0 (the watermark is invisible) to 100 (the watermark completely obscures the video in the
     * specified location). The datatype of <code>Opacity</code> is float.
     * </p>
     * <p>
     * Elastic Transcoder supports transparent .png graphics. If you use a transparent .png, the transparent portion of
     * the video appears as if you had specified a value of 0 for <code>Opacity</code>. The .jpg file format doesn't
     * support transparency.
     * </p>
     * 
     * @return A percentage that indicates how much you want a watermark to obscure the video in the location where it
     *         appears. Valid values are 0 (the watermark is invisible) to 100 (the watermark completely obscures the
     *         video in the specified location). The datatype of <code>Opacity</code> is float.</p>
     *         <p>
     *         Elastic Transcoder supports transparent .png graphics. If you use a transparent .png, the transparent
     *         portion of the video appears as if you had specified a value of 0 for <code>Opacity</code>. The .jpg file
     *         format doesn't support transparency.
     */

    public String getOpacity() {
        return this.opacity;
    }

    /**
     * <p>
     * A percentage that indicates how much you want a watermark to obscure the video in the location where it appears.
     * Valid values are 0 (the watermark is invisible) to 100 (the watermark completely obscures the video in the
     * specified location). The datatype of <code>Opacity</code> is float.
     * </p>
     * <p>
     * Elastic Transcoder supports transparent .png graphics. If you use a transparent .png, the transparent portion of
     * the video appears as if you had specified a value of 0 for <code>Opacity</code>. The .jpg file format doesn't
     * support transparency.
     * </p>
     * 
     * @param opacity
     *        A percentage that indicates how much you want a watermark to obscure the video in the location where it
     *        appears. Valid values are 0 (the watermark is invisible) to 100 (the watermark completely obscures the
     *        video in the specified location). The datatype of <code>Opacity</code> is float.</p>
     *        <p>
     *        Elastic Transcoder supports transparent .png graphics. If you use a transparent .png, the transparent
     *        portion of the video appears as if you had specified a value of 0 for <code>Opacity</code>. The .jpg file
     *        format doesn't support transparency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetWatermark withOpacity(String opacity) {
        setOpacity(opacity);
        return this;
    }

    /**
     * <p>
     * A value that determines how Elastic Transcoder interprets values that you specified for
     * <code>HorizontalOffset</code>, <code>VerticalOffset</code>, <code>MaxWidth</code>, and <code>MaxHeight</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Content</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based on the
     * borders of the video excluding black bars added by Elastic Transcoder, if any. In addition, <code>MaxWidth</code>
     * and <code>MaxHeight</code>, if specified as a percentage, are calculated based on the borders of the video
     * excluding black bars added by Elastic Transcoder, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Frame</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based on the
     * borders of the video including black bars added by Elastic Transcoder, if any. In addition, <code>MaxWidth</code>
     * and <code>MaxHeight</code>, if specified as a percentage, are calculated based on the borders of the video
     * including black bars added by Elastic Transcoder, if any.
     * </p>
     * </li>
     * </ul>
     * 
     * @param target
     *        A value that determines how Elastic Transcoder interprets values that you specified for
     *        <code>HorizontalOffset</code>, <code>VerticalOffset</code>, <code>MaxWidth</code>, and
     *        <code>MaxHeight</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Content</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based
     *        on the borders of the video excluding black bars added by Elastic Transcoder, if any. In addition,
     *        <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a percentage, are calculated based on
     *        the borders of the video excluding black bars added by Elastic Transcoder, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Frame</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based on
     *        the borders of the video including black bars added by Elastic Transcoder, if any. In addition,
     *        <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a percentage, are calculated based on
     *        the borders of the video including black bars added by Elastic Transcoder, if any.
     *        </p>
     *        </li>
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * A value that determines how Elastic Transcoder interprets values that you specified for
     * <code>HorizontalOffset</code>, <code>VerticalOffset</code>, <code>MaxWidth</code>, and <code>MaxHeight</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Content</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based on the
     * borders of the video excluding black bars added by Elastic Transcoder, if any. In addition, <code>MaxWidth</code>
     * and <code>MaxHeight</code>, if specified as a percentage, are calculated based on the borders of the video
     * excluding black bars added by Elastic Transcoder, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Frame</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based on the
     * borders of the video including black bars added by Elastic Transcoder, if any. In addition, <code>MaxWidth</code>
     * and <code>MaxHeight</code>, if specified as a percentage, are calculated based on the borders of the video
     * including black bars added by Elastic Transcoder, if any.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A value that determines how Elastic Transcoder interprets values that you specified for
     *         <code>HorizontalOffset</code>, <code>VerticalOffset</code>, <code>MaxWidth</code>, and
     *         <code>MaxHeight</code>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Content</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based
     *         on the borders of the video excluding black bars added by Elastic Transcoder, if any. In addition,
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a percentage, are calculated based on
     *         the borders of the video excluding black bars added by Elastic Transcoder, if any.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Frame</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based
     *         on the borders of the video including black bars added by Elastic Transcoder, if any. In addition,
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a percentage, are calculated based on
     *         the borders of the video including black bars added by Elastic Transcoder, if any.
     *         </p>
     *         </li>
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * A value that determines how Elastic Transcoder interprets values that you specified for
     * <code>HorizontalOffset</code>, <code>VerticalOffset</code>, <code>MaxWidth</code>, and <code>MaxHeight</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Content</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based on the
     * borders of the video excluding black bars added by Elastic Transcoder, if any. In addition, <code>MaxWidth</code>
     * and <code>MaxHeight</code>, if specified as a percentage, are calculated based on the borders of the video
     * excluding black bars added by Elastic Transcoder, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Frame</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based on the
     * borders of the video including black bars added by Elastic Transcoder, if any. In addition, <code>MaxWidth</code>
     * and <code>MaxHeight</code>, if specified as a percentage, are calculated based on the borders of the video
     * including black bars added by Elastic Transcoder, if any.
     * </p>
     * </li>
     * </ul>
     * 
     * @param target
     *        A value that determines how Elastic Transcoder interprets values that you specified for
     *        <code>HorizontalOffset</code>, <code>VerticalOffset</code>, <code>MaxWidth</code>, and
     *        <code>MaxHeight</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Content</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based
     *        on the borders of the video excluding black bars added by Elastic Transcoder, if any. In addition,
     *        <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a percentage, are calculated based on
     *        the borders of the video excluding black bars added by Elastic Transcoder, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Frame</b>: <code>HorizontalOffset</code> and <code>VerticalOffset</code> values are calculated based on
     *        the borders of the video including black bars added by Elastic Transcoder, if any. In addition,
     *        <code>MaxWidth</code> and <code>MaxHeight</code>, if specified as a percentage, are calculated based on
     *        the borders of the video including black bars added by Elastic Transcoder, if any.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetWatermark withTarget(String target) {
        setTarget(target);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMaxWidth() != null)
            sb.append("MaxWidth: ").append(getMaxWidth()).append(",");
        if (getMaxHeight() != null)
            sb.append("MaxHeight: ").append(getMaxHeight()).append(",");
        if (getSizingPolicy() != null)
            sb.append("SizingPolicy: ").append(getSizingPolicy()).append(",");
        if (getHorizontalAlign() != null)
            sb.append("HorizontalAlign: ").append(getHorizontalAlign()).append(",");
        if (getHorizontalOffset() != null)
            sb.append("HorizontalOffset: ").append(getHorizontalOffset()).append(",");
        if (getVerticalAlign() != null)
            sb.append("VerticalAlign: ").append(getVerticalAlign()).append(",");
        if (getVerticalOffset() != null)
            sb.append("VerticalOffset: ").append(getVerticalOffset()).append(",");
        if (getOpacity() != null)
            sb.append("Opacity: ").append(getOpacity()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PresetWatermark == false)
            return false;
        PresetWatermark other = (PresetWatermark) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMaxWidth() == null ^ this.getMaxWidth() == null)
            return false;
        if (other.getMaxWidth() != null && other.getMaxWidth().equals(this.getMaxWidth()) == false)
            return false;
        if (other.getMaxHeight() == null ^ this.getMaxHeight() == null)
            return false;
        if (other.getMaxHeight() != null && other.getMaxHeight().equals(this.getMaxHeight()) == false)
            return false;
        if (other.getSizingPolicy() == null ^ this.getSizingPolicy() == null)
            return false;
        if (other.getSizingPolicy() != null && other.getSizingPolicy().equals(this.getSizingPolicy()) == false)
            return false;
        if (other.getHorizontalAlign() == null ^ this.getHorizontalAlign() == null)
            return false;
        if (other.getHorizontalAlign() != null && other.getHorizontalAlign().equals(this.getHorizontalAlign()) == false)
            return false;
        if (other.getHorizontalOffset() == null ^ this.getHorizontalOffset() == null)
            return false;
        if (other.getHorizontalOffset() != null && other.getHorizontalOffset().equals(this.getHorizontalOffset()) == false)
            return false;
        if (other.getVerticalAlign() == null ^ this.getVerticalAlign() == null)
            return false;
        if (other.getVerticalAlign() != null && other.getVerticalAlign().equals(this.getVerticalAlign()) == false)
            return false;
        if (other.getVerticalOffset() == null ^ this.getVerticalOffset() == null)
            return false;
        if (other.getVerticalOffset() != null && other.getVerticalOffset().equals(this.getVerticalOffset()) == false)
            return false;
        if (other.getOpacity() == null ^ this.getOpacity() == null)
            return false;
        if (other.getOpacity() != null && other.getOpacity().equals(this.getOpacity()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
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
    public PresetWatermark clone() {
        try {
            return (PresetWatermark) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.PresetWatermarkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
