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
 * Caption Rectangle
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CaptionRectangle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionRectangle implements Serializable, Cloneable, StructuredPojo {

    /**
     * See the description in leftOffset. For height, specify the entire height of the rectangle as a percentage of the
     * underlying frame height. For example, \"80\" means the rectangle height is 80% of the underlying frame height.
     * The topOffset and rectangleHeight must add up to 100% or less. This field corresponds to tts:extent - Y in the
     * TTML standard.
     */
    private Double height;
    /**
     * Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. (Make sure to leave
     * the default if you don't have either of these formats in the output.) You can define a display rectangle for the
     * captions that is smaller than the underlying video frame. You define the rectangle by specifying the position of
     * the left edge, top edge, bottom edge, and right edge of the rectangle, all within the underlying video frame. The
     * units for the measurements are percentages. If you specify a value for one of these fields, you must specify a
     * value for all of them. For leftOffset, specify the position of the left edge of the rectangle, as a percentage of
     * the underlying frame width, and relative to the left edge of the frame. For example, \"10\" means the measurement
     * is 10% of the underlying frame width. The rectangle left edge starts at that position from the left edge of the
     * frame. This field corresponds to tts:origin - X in the TTML standard.
     */
    private Double leftOffset;
    /**
     * See the description in leftOffset. For topOffset, specify the position of the top edge of the rectangle, as a
     * percentage of the underlying frame height, and relative to the top edge of the frame. For example, \"10\" means
     * the measurement is 10% of the underlying frame height. The rectangle top edge starts at that position from the top
     * edge of the frame. This field corresponds to tts:origin - Y in the TTML standard.
     */
    private Double topOffset;
    /**
     * See the description in leftOffset. For width, specify the entire width of the rectangle as a percentage of the
     * underlying frame width. For example, \"80\" means the rectangle width is 80% of the underlying frame width. The
     * leftOffset and rectangleWidth must add up to 100% or less. This field corresponds to tts:extent - X in the TTML
     * standard.
     */
    private Double width;

    /**
     * See the description in leftOffset. For height, specify the entire height of the rectangle as a percentage of the
     * underlying frame height. For example, \"80\" means the rectangle height is 80% of the underlying frame height.
     * The topOffset and rectangleHeight must add up to 100% or less. This field corresponds to tts:extent - Y in the
     * TTML standard.
     * 
     * @param height
     *        See the description in leftOffset. For height, specify the entire height of the rectangle as a percentage
     *        of the underlying frame height. For example, \"80\" means the rectangle height is 80% of the underlying
     *        frame height. The topOffset and rectangleHeight must add up to 100% or less. This field corresponds to
     *        tts:extent - Y in the TTML standard.
     */

    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * See the description in leftOffset. For height, specify the entire height of the rectangle as a percentage of the
     * underlying frame height. For example, \"80\" means the rectangle height is 80% of the underlying frame height.
     * The topOffset and rectangleHeight must add up to 100% or less. This field corresponds to tts:extent - Y in the
     * TTML standard.
     * 
     * @return See the description in leftOffset. For height, specify the entire height of the rectangle as a percentage
     *         of the underlying frame height. For example, \"80\" means the rectangle height is 80% of the underlying
     *         frame height. The topOffset and rectangleHeight must add up to 100% or less. This field corresponds to
     *         tts:extent - Y in the TTML standard.
     */

    public Double getHeight() {
        return this.height;
    }

    /**
     * See the description in leftOffset. For height, specify the entire height of the rectangle as a percentage of the
     * underlying frame height. For example, \"80\" means the rectangle height is 80% of the underlying frame height.
     * The topOffset and rectangleHeight must add up to 100% or less. This field corresponds to tts:extent - Y in the
     * TTML standard.
     * 
     * @param height
     *        See the description in leftOffset. For height, specify the entire height of the rectangle as a percentage
     *        of the underlying frame height. For example, \"80\" means the rectangle height is 80% of the underlying
     *        frame height. The topOffset and rectangleHeight must add up to 100% or less. This field corresponds to
     *        tts:extent - Y in the TTML standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionRectangle withHeight(Double height) {
        setHeight(height);
        return this;
    }

    /**
     * Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. (Make sure to leave
     * the default if you don't have either of these formats in the output.) You can define a display rectangle for the
     * captions that is smaller than the underlying video frame. You define the rectangle by specifying the position of
     * the left edge, top edge, bottom edge, and right edge of the rectangle, all within the underlying video frame. The
     * units for the measurements are percentages. If you specify a value for one of these fields, you must specify a
     * value for all of them. For leftOffset, specify the position of the left edge of the rectangle, as a percentage of
     * the underlying frame width, and relative to the left edge of the frame. For example, \"10\" means the measurement
     * is 10% of the underlying frame width. The rectangle left edge starts at that position from the left edge of the
     * frame. This field corresponds to tts:origin - X in the TTML standard.
     * 
     * @param leftOffset
     *        Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. (Make sure to
     *        leave the default if you don't have either of these formats in the output.) You can define a display
     *        rectangle for the captions that is smaller than the underlying video frame. You define the rectangle by
     *        specifying the position of the left edge, top edge, bottom edge, and right edge of the rectangle, all
     *        within the underlying video frame. The units for the measurements are percentages. If you specify a value
     *        for one of these fields, you must specify a value for all of them. For leftOffset, specify the position of
     *        the left edge of the rectangle, as a percentage of the underlying frame width, and relative to the left
     *        edge of the frame. For example, \"10\" means the measurement is 10% of the underlying frame width. The
     *        rectangle left edge starts at that position from the left edge of the frame. This field corresponds to
     *        tts:origin - X in the TTML standard.
     */

    public void setLeftOffset(Double leftOffset) {
        this.leftOffset = leftOffset;
    }

    /**
     * Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. (Make sure to leave
     * the default if you don't have either of these formats in the output.) You can define a display rectangle for the
     * captions that is smaller than the underlying video frame. You define the rectangle by specifying the position of
     * the left edge, top edge, bottom edge, and right edge of the rectangle, all within the underlying video frame. The
     * units for the measurements are percentages. If you specify a value for one of these fields, you must specify a
     * value for all of them. For leftOffset, specify the position of the left edge of the rectangle, as a percentage of
     * the underlying frame width, and relative to the left edge of the frame. For example, \"10\" means the measurement
     * is 10% of the underlying frame width. The rectangle left edge starts at that position from the left edge of the
     * frame. This field corresponds to tts:origin - X in the TTML standard.
     * 
     * @return Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. (Make sure to
     *         leave the default if you don't have either of these formats in the output.) You can define a display
     *         rectangle for the captions that is smaller than the underlying video frame. You define the rectangle by
     *         specifying the position of the left edge, top edge, bottom edge, and right edge of the rectangle, all
     *         within the underlying video frame. The units for the measurements are percentages. If you specify a value
     *         for one of these fields, you must specify a value for all of them. For leftOffset, specify the position
     *         of the left edge of the rectangle, as a percentage of the underlying frame width, and relative to the
     *         left edge of the frame. For example, \"10\" means the measurement is 10% of the underlying frame width.
     *         The rectangle left edge starts at that position from the left edge of the frame. This field corresponds
     *         to tts:origin - X in the TTML standard.
     */

    public Double getLeftOffset() {
        return this.leftOffset;
    }

    /**
     * Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. (Make sure to leave
     * the default if you don't have either of these formats in the output.) You can define a display rectangle for the
     * captions that is smaller than the underlying video frame. You define the rectangle by specifying the position of
     * the left edge, top edge, bottom edge, and right edge of the rectangle, all within the underlying video frame. The
     * units for the measurements are percentages. If you specify a value for one of these fields, you must specify a
     * value for all of them. For leftOffset, specify the position of the left edge of the rectangle, as a percentage of
     * the underlying frame width, and relative to the left edge of the frame. For example, \"10\" means the measurement
     * is 10% of the underlying frame width. The rectangle left edge starts at that position from the left edge of the
     * frame. This field corresponds to tts:origin - X in the TTML standard.
     * 
     * @param leftOffset
     *        Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. (Make sure to
     *        leave the default if you don't have either of these formats in the output.) You can define a display
     *        rectangle for the captions that is smaller than the underlying video frame. You define the rectangle by
     *        specifying the position of the left edge, top edge, bottom edge, and right edge of the rectangle, all
     *        within the underlying video frame. The units for the measurements are percentages. If you specify a value
     *        for one of these fields, you must specify a value for all of them. For leftOffset, specify the position of
     *        the left edge of the rectangle, as a percentage of the underlying frame width, and relative to the left
     *        edge of the frame. For example, \"10\" means the measurement is 10% of the underlying frame width. The
     *        rectangle left edge starts at that position from the left edge of the frame. This field corresponds to
     *        tts:origin - X in the TTML standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionRectangle withLeftOffset(Double leftOffset) {
        setLeftOffset(leftOffset);
        return this;
    }

    /**
     * See the description in leftOffset. For topOffset, specify the position of the top edge of the rectangle, as a
     * percentage of the underlying frame height, and relative to the top edge of the frame. For example, \"10\" means
     * the measurement is 10% of the underlying frame height. The rectangle top edge starts at that position from the top
     * edge of the frame. This field corresponds to tts:origin - Y in the TTML standard.
     * 
     * @param topOffset
     *        See the description in leftOffset. For topOffset, specify the position of the top edge of the rectangle,
     *        as a percentage of the underlying frame height, and relative to the top edge of the frame. For example,
     *        \"10\" means the measurement is 10% of the underlying frame height. The rectangle top edge starts at that
     *        position from the top edge of the frame. This field corresponds to tts:origin - Y in the TTML standard.
     */

    public void setTopOffset(Double topOffset) {
        this.topOffset = topOffset;
    }

    /**
     * See the description in leftOffset. For topOffset, specify the position of the top edge of the rectangle, as a
     * percentage of the underlying frame height, and relative to the top edge of the frame. For example, \"10\" means
     * the measurement is 10% of the underlying frame height. The rectangle top edge starts at that position from the top
     * edge of the frame. This field corresponds to tts:origin - Y in the TTML standard.
     * 
     * @return See the description in leftOffset. For topOffset, specify the position of the top edge of the rectangle,
     *         as a percentage of the underlying frame height, and relative to the top edge of the frame. For example,
     *         \"10\" means the measurement is 10% of the underlying frame height. The rectangle top edge starts at that
     *         position from the top edge of the frame. This field corresponds to tts:origin - Y in the TTML standard.
     */

    public Double getTopOffset() {
        return this.topOffset;
    }

    /**
     * See the description in leftOffset. For topOffset, specify the position of the top edge of the rectangle, as a
     * percentage of the underlying frame height, and relative to the top edge of the frame. For example, \"10\" means
     * the measurement is 10% of the underlying frame height. The rectangle top edge starts at that position from the top
     * edge of the frame. This field corresponds to tts:origin - Y in the TTML standard.
     * 
     * @param topOffset
     *        See the description in leftOffset. For topOffset, specify the position of the top edge of the rectangle,
     *        as a percentage of the underlying frame height, and relative to the top edge of the frame. For example,
     *        \"10\" means the measurement is 10% of the underlying frame height. The rectangle top edge starts at that
     *        position from the top edge of the frame. This field corresponds to tts:origin - Y in the TTML standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionRectangle withTopOffset(Double topOffset) {
        setTopOffset(topOffset);
        return this;
    }

    /**
     * See the description in leftOffset. For width, specify the entire width of the rectangle as a percentage of the
     * underlying frame width. For example, \"80\" means the rectangle width is 80% of the underlying frame width. The
     * leftOffset and rectangleWidth must add up to 100% or less. This field corresponds to tts:extent - X in the TTML
     * standard.
     * 
     * @param width
     *        See the description in leftOffset. For width, specify the entire width of the rectangle as a percentage of
     *        the underlying frame width. For example, \"80\" means the rectangle width is 80% of the underlying frame
     *        width. The leftOffset and rectangleWidth must add up to 100% or less. This field corresponds to tts:extent
     *        - X in the TTML standard.
     */

    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * See the description in leftOffset. For width, specify the entire width of the rectangle as a percentage of the
     * underlying frame width. For example, \"80\" means the rectangle width is 80% of the underlying frame width. The
     * leftOffset and rectangleWidth must add up to 100% or less. This field corresponds to tts:extent - X in the TTML
     * standard.
     * 
     * @return See the description in leftOffset. For width, specify the entire width of the rectangle as a percentage
     *         of the underlying frame width. For example, \"80\" means the rectangle width is 80% of the underlying
     *         frame width. The leftOffset and rectangleWidth must add up to 100% or less. This field corresponds to
     *         tts:extent - X in the TTML standard.
     */

    public Double getWidth() {
        return this.width;
    }

    /**
     * See the description in leftOffset. For width, specify the entire width of the rectangle as a percentage of the
     * underlying frame width. For example, \"80\" means the rectangle width is 80% of the underlying frame width. The
     * leftOffset and rectangleWidth must add up to 100% or less. This field corresponds to tts:extent - X in the TTML
     * standard.
     * 
     * @param width
     *        See the description in leftOffset. For width, specify the entire width of the rectangle as a percentage of
     *        the underlying frame width. For example, \"80\" means the rectangle width is 80% of the underlying frame
     *        width. The leftOffset and rectangleWidth must add up to 100% or less. This field corresponds to tts:extent
     *        - X in the TTML standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionRectangle withWidth(Double width) {
        setWidth(width);
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
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getLeftOffset() != null)
            sb.append("LeftOffset: ").append(getLeftOffset()).append(",");
        if (getTopOffset() != null)
            sb.append("TopOffset: ").append(getTopOffset()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionRectangle == false)
            return false;
        CaptionRectangle other = (CaptionRectangle) obj;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getLeftOffset() == null ^ this.getLeftOffset() == null)
            return false;
        if (other.getLeftOffset() != null && other.getLeftOffset().equals(this.getLeftOffset()) == false)
            return false;
        if (other.getTopOffset() == null ^ this.getTopOffset() == null)
            return false;
        if (other.getTopOffset() != null && other.getTopOffset().equals(this.getTopOffset()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getLeftOffset() == null) ? 0 : getLeftOffset().hashCode());
        hashCode = prime * hashCode + ((getTopOffset() == null) ? 0 : getTopOffset().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public CaptionRectangle clone() {
        try {
            return (CaptionRectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.CaptionRectangleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
