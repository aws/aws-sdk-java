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
 * A filter that allows you to control the black frame detection by specifying the black levels and pixel coverage of
 * black pixels in a frame. As videos can come from multiple sources, formats, and time periods, they may contain
 * different standards and varying noise levels for black frames that need to be accounted for. For more information,
 * see <a>StartSegmentDetection</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlackFrame implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A threshold used to determine the maximum luminance value for a pixel to be considered black. In a full color
     * range video, luminance values range from 0-255. A pixel value of 0 is pure black, and the most strict filter. The
     * maximum black pixel value is computed as follows: max_black_pixel_value = minimum_luminance + MaxPixelThreshold
     * *luminance_range.
     * </p>
     * <p>
     * For example, for a full range video with BlackPixelThreshold = 0.1, max_black_pixel_value is 0 + 0.1 * (255-0) =
     * 25.5.
     * </p>
     * <p>
     * The default value of MaxPixelThreshold is 0.2, which maps to a max_black_pixel_value of 51 for a full range
     * video. You can lower this threshold to be more strict on black levels.
     * </p>
     */
    private Float maxPixelThreshold;
    /**
     * <p>
     * The minimum percentage of pixels in a frame that need to have a luminance below the max_black_pixel_value for a
     * frame to be considered a black frame. Luminance is calculated using the BT.709 matrix.
     * </p>
     * <p>
     * The default value is 99, which means at least 99% of all pixels in the frame are black pixels as per the
     * <code>MaxPixelThreshold</code> set. You can reduce this value to allow more noise on the black frame.
     * </p>
     */
    private Float minCoveragePercentage;

    /**
     * <p>
     * A threshold used to determine the maximum luminance value for a pixel to be considered black. In a full color
     * range video, luminance values range from 0-255. A pixel value of 0 is pure black, and the most strict filter. The
     * maximum black pixel value is computed as follows: max_black_pixel_value = minimum_luminance + MaxPixelThreshold
     * *luminance_range.
     * </p>
     * <p>
     * For example, for a full range video with BlackPixelThreshold = 0.1, max_black_pixel_value is 0 + 0.1 * (255-0) =
     * 25.5.
     * </p>
     * <p>
     * The default value of MaxPixelThreshold is 0.2, which maps to a max_black_pixel_value of 51 for a full range
     * video. You can lower this threshold to be more strict on black levels.
     * </p>
     * 
     * @param maxPixelThreshold
     *        A threshold used to determine the maximum luminance value for a pixel to be considered black. In a full
     *        color range video, luminance values range from 0-255. A pixel value of 0 is pure black, and the most
     *        strict filter. The maximum black pixel value is computed as follows: max_black_pixel_value =
     *        minimum_luminance + MaxPixelThreshold *luminance_range. </p>
     *        <p>
     *        For example, for a full range video with BlackPixelThreshold = 0.1, max_black_pixel_value is 0 + 0.1 *
     *        (255-0) = 25.5.
     *        </p>
     *        <p>
     *        The default value of MaxPixelThreshold is 0.2, which maps to a max_black_pixel_value of 51 for a full
     *        range video. You can lower this threshold to be more strict on black levels.
     */

    public void setMaxPixelThreshold(Float maxPixelThreshold) {
        this.maxPixelThreshold = maxPixelThreshold;
    }

    /**
     * <p>
     * A threshold used to determine the maximum luminance value for a pixel to be considered black. In a full color
     * range video, luminance values range from 0-255. A pixel value of 0 is pure black, and the most strict filter. The
     * maximum black pixel value is computed as follows: max_black_pixel_value = minimum_luminance + MaxPixelThreshold
     * *luminance_range.
     * </p>
     * <p>
     * For example, for a full range video with BlackPixelThreshold = 0.1, max_black_pixel_value is 0 + 0.1 * (255-0) =
     * 25.5.
     * </p>
     * <p>
     * The default value of MaxPixelThreshold is 0.2, which maps to a max_black_pixel_value of 51 for a full range
     * video. You can lower this threshold to be more strict on black levels.
     * </p>
     * 
     * @return A threshold used to determine the maximum luminance value for a pixel to be considered black. In a full
     *         color range video, luminance values range from 0-255. A pixel value of 0 is pure black, and the most
     *         strict filter. The maximum black pixel value is computed as follows: max_black_pixel_value =
     *         minimum_luminance + MaxPixelThreshold *luminance_range. </p>
     *         <p>
     *         For example, for a full range video with BlackPixelThreshold = 0.1, max_black_pixel_value is 0 + 0.1 *
     *         (255-0) = 25.5.
     *         </p>
     *         <p>
     *         The default value of MaxPixelThreshold is 0.2, which maps to a max_black_pixel_value of 51 for a full
     *         range video. You can lower this threshold to be more strict on black levels.
     */

    public Float getMaxPixelThreshold() {
        return this.maxPixelThreshold;
    }

    /**
     * <p>
     * A threshold used to determine the maximum luminance value for a pixel to be considered black. In a full color
     * range video, luminance values range from 0-255. A pixel value of 0 is pure black, and the most strict filter. The
     * maximum black pixel value is computed as follows: max_black_pixel_value = minimum_luminance + MaxPixelThreshold
     * *luminance_range.
     * </p>
     * <p>
     * For example, for a full range video with BlackPixelThreshold = 0.1, max_black_pixel_value is 0 + 0.1 * (255-0) =
     * 25.5.
     * </p>
     * <p>
     * The default value of MaxPixelThreshold is 0.2, which maps to a max_black_pixel_value of 51 for a full range
     * video. You can lower this threshold to be more strict on black levels.
     * </p>
     * 
     * @param maxPixelThreshold
     *        A threshold used to determine the maximum luminance value for a pixel to be considered black. In a full
     *        color range video, luminance values range from 0-255. A pixel value of 0 is pure black, and the most
     *        strict filter. The maximum black pixel value is computed as follows: max_black_pixel_value =
     *        minimum_luminance + MaxPixelThreshold *luminance_range. </p>
     *        <p>
     *        For example, for a full range video with BlackPixelThreshold = 0.1, max_black_pixel_value is 0 + 0.1 *
     *        (255-0) = 25.5.
     *        </p>
     *        <p>
     *        The default value of MaxPixelThreshold is 0.2, which maps to a max_black_pixel_value of 51 for a full
     *        range video. You can lower this threshold to be more strict on black levels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlackFrame withMaxPixelThreshold(Float maxPixelThreshold) {
        setMaxPixelThreshold(maxPixelThreshold);
        return this;
    }

    /**
     * <p>
     * The minimum percentage of pixels in a frame that need to have a luminance below the max_black_pixel_value for a
     * frame to be considered a black frame. Luminance is calculated using the BT.709 matrix.
     * </p>
     * <p>
     * The default value is 99, which means at least 99% of all pixels in the frame are black pixels as per the
     * <code>MaxPixelThreshold</code> set. You can reduce this value to allow more noise on the black frame.
     * </p>
     * 
     * @param minCoveragePercentage
     *        The minimum percentage of pixels in a frame that need to have a luminance below the max_black_pixel_value
     *        for a frame to be considered a black frame. Luminance is calculated using the BT.709 matrix. </p>
     *        <p>
     *        The default value is 99, which means at least 99% of all pixels in the frame are black pixels as per the
     *        <code>MaxPixelThreshold</code> set. You can reduce this value to allow more noise on the black frame.
     */

    public void setMinCoveragePercentage(Float minCoveragePercentage) {
        this.minCoveragePercentage = minCoveragePercentage;
    }

    /**
     * <p>
     * The minimum percentage of pixels in a frame that need to have a luminance below the max_black_pixel_value for a
     * frame to be considered a black frame. Luminance is calculated using the BT.709 matrix.
     * </p>
     * <p>
     * The default value is 99, which means at least 99% of all pixels in the frame are black pixels as per the
     * <code>MaxPixelThreshold</code> set. You can reduce this value to allow more noise on the black frame.
     * </p>
     * 
     * @return The minimum percentage of pixels in a frame that need to have a luminance below the max_black_pixel_value
     *         for a frame to be considered a black frame. Luminance is calculated using the BT.709 matrix. </p>
     *         <p>
     *         The default value is 99, which means at least 99% of all pixels in the frame are black pixels as per the
     *         <code>MaxPixelThreshold</code> set. You can reduce this value to allow more noise on the black frame.
     */

    public Float getMinCoveragePercentage() {
        return this.minCoveragePercentage;
    }

    /**
     * <p>
     * The minimum percentage of pixels in a frame that need to have a luminance below the max_black_pixel_value for a
     * frame to be considered a black frame. Luminance is calculated using the BT.709 matrix.
     * </p>
     * <p>
     * The default value is 99, which means at least 99% of all pixels in the frame are black pixels as per the
     * <code>MaxPixelThreshold</code> set. You can reduce this value to allow more noise on the black frame.
     * </p>
     * 
     * @param minCoveragePercentage
     *        The minimum percentage of pixels in a frame that need to have a luminance below the max_black_pixel_value
     *        for a frame to be considered a black frame. Luminance is calculated using the BT.709 matrix. </p>
     *        <p>
     *        The default value is 99, which means at least 99% of all pixels in the frame are black pixels as per the
     *        <code>MaxPixelThreshold</code> set. You can reduce this value to allow more noise on the black frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlackFrame withMinCoveragePercentage(Float minCoveragePercentage) {
        setMinCoveragePercentage(minCoveragePercentage);
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
        if (getMaxPixelThreshold() != null)
            sb.append("MaxPixelThreshold: ").append(getMaxPixelThreshold()).append(",");
        if (getMinCoveragePercentage() != null)
            sb.append("MinCoveragePercentage: ").append(getMinCoveragePercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlackFrame == false)
            return false;
        BlackFrame other = (BlackFrame) obj;
        if (other.getMaxPixelThreshold() == null ^ this.getMaxPixelThreshold() == null)
            return false;
        if (other.getMaxPixelThreshold() != null && other.getMaxPixelThreshold().equals(this.getMaxPixelThreshold()) == false)
            return false;
        if (other.getMinCoveragePercentage() == null ^ this.getMinCoveragePercentage() == null)
            return false;
        if (other.getMinCoveragePercentage() != null && other.getMinCoveragePercentage().equals(this.getMinCoveragePercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxPixelThreshold() == null) ? 0 : getMaxPixelThreshold().hashCode());
        hashCode = prime * hashCode + ((getMinCoveragePercentage() == null) ? 0 : getMinCoveragePercentage().hashCode());
        return hashCode;
    }

    @Override
    public BlackFrame clone() {
        try {
            return (BlackFrame) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.BlackFrameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
