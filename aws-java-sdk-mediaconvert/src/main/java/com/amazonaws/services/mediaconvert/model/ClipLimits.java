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
 * Specify YUV limits and RGB tolerances when you set Sample range conversion to Limited range clip.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ClipLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClipLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the Maximum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values that,
     * when converted to RGB, would be outside the upper tolerance that you specify. Enter an integer from 90 to 105 as
     * an offset percentage to the maximum possible value. Leave blank to use the default value 100. When you specify a
     * value for Maximum RGB tolerance, you must set Sample range conversion to Limited range clip.
     */
    private Integer maximumRGBTolerance;
    /**
     * Specify the Maximum YUV color sample limit. MediaConvert conforms any pixels in your input above the value that
     * you specify to typical limited range bounds. Enter an integer from 920 to 1023. Leave blank to use the default
     * value 940. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert automatically scales
     * this value down. When you specify a value for Maximum YUV, you must set Sample range conversion to Limited range
     * clip.
     */
    private Integer maximumYUV;
    /**
     * Specify the Minimum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values that,
     * when converted to RGB, would be outside the lower tolerance that you specify. Enter an integer from -5 to 10 as
     * an offset percentage to the minimum possible value. Leave blank to use the default value 0. When you specify a
     * value for Minimum RGB tolerance, you must set Sample range conversion to Limited range clip.
     */
    private Integer minimumRGBTolerance;
    /**
     * Specify the Minimum YUV color sample limit. MediaConvert conforms any pixels in your input below the value that
     * you specify to typical limited range bounds. Enter an integer from 0 to 128. Leave blank to use the default value
     * 64. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert automatically scales this
     * value down. When you specify a value for Minumum YUV, you must set Sample range conversion to Limited range clip.
     */
    private Integer minimumYUV;

    /**
     * Specify the Maximum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values that,
     * when converted to RGB, would be outside the upper tolerance that you specify. Enter an integer from 90 to 105 as
     * an offset percentage to the maximum possible value. Leave blank to use the default value 100. When you specify a
     * value for Maximum RGB tolerance, you must set Sample range conversion to Limited range clip.
     * 
     * @param maximumRGBTolerance
     *        Specify the Maximum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values
     *        that, when converted to RGB, would be outside the upper tolerance that you specify. Enter an integer from
     *        90 to 105 as an offset percentage to the maximum possible value. Leave blank to use the default value 100.
     *        When you specify a value for Maximum RGB tolerance, you must set Sample range conversion to Limited range
     *        clip.
     */

    public void setMaximumRGBTolerance(Integer maximumRGBTolerance) {
        this.maximumRGBTolerance = maximumRGBTolerance;
    }

    /**
     * Specify the Maximum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values that,
     * when converted to RGB, would be outside the upper tolerance that you specify. Enter an integer from 90 to 105 as
     * an offset percentage to the maximum possible value. Leave blank to use the default value 100. When you specify a
     * value for Maximum RGB tolerance, you must set Sample range conversion to Limited range clip.
     * 
     * @return Specify the Maximum RGB color sample range tolerance for your output. MediaConvert corrects any YUV
     *         values that, when converted to RGB, would be outside the upper tolerance that you specify. Enter an
     *         integer from 90 to 105 as an offset percentage to the maximum possible value. Leave blank to use the
     *         default value 100. When you specify a value for Maximum RGB tolerance, you must set Sample range
     *         conversion to Limited range clip.
     */

    public Integer getMaximumRGBTolerance() {
        return this.maximumRGBTolerance;
    }

    /**
     * Specify the Maximum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values that,
     * when converted to RGB, would be outside the upper tolerance that you specify. Enter an integer from 90 to 105 as
     * an offset percentage to the maximum possible value. Leave blank to use the default value 100. When you specify a
     * value for Maximum RGB tolerance, you must set Sample range conversion to Limited range clip.
     * 
     * @param maximumRGBTolerance
     *        Specify the Maximum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values
     *        that, when converted to RGB, would be outside the upper tolerance that you specify. Enter an integer from
     *        90 to 105 as an offset percentage to the maximum possible value. Leave blank to use the default value 100.
     *        When you specify a value for Maximum RGB tolerance, you must set Sample range conversion to Limited range
     *        clip.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClipLimits withMaximumRGBTolerance(Integer maximumRGBTolerance) {
        setMaximumRGBTolerance(maximumRGBTolerance);
        return this;
    }

    /**
     * Specify the Maximum YUV color sample limit. MediaConvert conforms any pixels in your input above the value that
     * you specify to typical limited range bounds. Enter an integer from 920 to 1023. Leave blank to use the default
     * value 940. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert automatically scales
     * this value down. When you specify a value for Maximum YUV, you must set Sample range conversion to Limited range
     * clip.
     * 
     * @param maximumYUV
     *        Specify the Maximum YUV color sample limit. MediaConvert conforms any pixels in your input above the value
     *        that you specify to typical limited range bounds. Enter an integer from 920 to 1023. Leave blank to use
     *        the default value 940. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert
     *        automatically scales this value down. When you specify a value for Maximum YUV, you must set Sample range
     *        conversion to Limited range clip.
     */

    public void setMaximumYUV(Integer maximumYUV) {
        this.maximumYUV = maximumYUV;
    }

    /**
     * Specify the Maximum YUV color sample limit. MediaConvert conforms any pixels in your input above the value that
     * you specify to typical limited range bounds. Enter an integer from 920 to 1023. Leave blank to use the default
     * value 940. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert automatically scales
     * this value down. When you specify a value for Maximum YUV, you must set Sample range conversion to Limited range
     * clip.
     * 
     * @return Specify the Maximum YUV color sample limit. MediaConvert conforms any pixels in your input above the
     *         value that you specify to typical limited range bounds. Enter an integer from 920 to 1023. Leave blank to
     *         use the default value 940. The value that you enter applies to 10-bit ranges. For 8-bit ranges,
     *         MediaConvert automatically scales this value down. When you specify a value for Maximum YUV, you must set
     *         Sample range conversion to Limited range clip.
     */

    public Integer getMaximumYUV() {
        return this.maximumYUV;
    }

    /**
     * Specify the Maximum YUV color sample limit. MediaConvert conforms any pixels in your input above the value that
     * you specify to typical limited range bounds. Enter an integer from 920 to 1023. Leave blank to use the default
     * value 940. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert automatically scales
     * this value down. When you specify a value for Maximum YUV, you must set Sample range conversion to Limited range
     * clip.
     * 
     * @param maximumYUV
     *        Specify the Maximum YUV color sample limit. MediaConvert conforms any pixels in your input above the value
     *        that you specify to typical limited range bounds. Enter an integer from 920 to 1023. Leave blank to use
     *        the default value 940. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert
     *        automatically scales this value down. When you specify a value for Maximum YUV, you must set Sample range
     *        conversion to Limited range clip.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClipLimits withMaximumYUV(Integer maximumYUV) {
        setMaximumYUV(maximumYUV);
        return this;
    }

    /**
     * Specify the Minimum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values that,
     * when converted to RGB, would be outside the lower tolerance that you specify. Enter an integer from -5 to 10 as
     * an offset percentage to the minimum possible value. Leave blank to use the default value 0. When you specify a
     * value for Minimum RGB tolerance, you must set Sample range conversion to Limited range clip.
     * 
     * @param minimumRGBTolerance
     *        Specify the Minimum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values
     *        that, when converted to RGB, would be outside the lower tolerance that you specify. Enter an integer from
     *        -5 to 10 as an offset percentage to the minimum possible value. Leave blank to use the default value 0.
     *        When you specify a value for Minimum RGB tolerance, you must set Sample range conversion to Limited range
     *        clip.
     */

    public void setMinimumRGBTolerance(Integer minimumRGBTolerance) {
        this.minimumRGBTolerance = minimumRGBTolerance;
    }

    /**
     * Specify the Minimum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values that,
     * when converted to RGB, would be outside the lower tolerance that you specify. Enter an integer from -5 to 10 as
     * an offset percentage to the minimum possible value. Leave blank to use the default value 0. When you specify a
     * value for Minimum RGB tolerance, you must set Sample range conversion to Limited range clip.
     * 
     * @return Specify the Minimum RGB color sample range tolerance for your output. MediaConvert corrects any YUV
     *         values that, when converted to RGB, would be outside the lower tolerance that you specify. Enter an
     *         integer from -5 to 10 as an offset percentage to the minimum possible value. Leave blank to use the
     *         default value 0. When you specify a value for Minimum RGB tolerance, you must set Sample range conversion
     *         to Limited range clip.
     */

    public Integer getMinimumRGBTolerance() {
        return this.minimumRGBTolerance;
    }

    /**
     * Specify the Minimum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values that,
     * when converted to RGB, would be outside the lower tolerance that you specify. Enter an integer from -5 to 10 as
     * an offset percentage to the minimum possible value. Leave blank to use the default value 0. When you specify a
     * value for Minimum RGB tolerance, you must set Sample range conversion to Limited range clip.
     * 
     * @param minimumRGBTolerance
     *        Specify the Minimum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values
     *        that, when converted to RGB, would be outside the lower tolerance that you specify. Enter an integer from
     *        -5 to 10 as an offset percentage to the minimum possible value. Leave blank to use the default value 0.
     *        When you specify a value for Minimum RGB tolerance, you must set Sample range conversion to Limited range
     *        clip.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClipLimits withMinimumRGBTolerance(Integer minimumRGBTolerance) {
        setMinimumRGBTolerance(minimumRGBTolerance);
        return this;
    }

    /**
     * Specify the Minimum YUV color sample limit. MediaConvert conforms any pixels in your input below the value that
     * you specify to typical limited range bounds. Enter an integer from 0 to 128. Leave blank to use the default value
     * 64. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert automatically scales this
     * value down. When you specify a value for Minumum YUV, you must set Sample range conversion to Limited range clip.
     * 
     * @param minimumYUV
     *        Specify the Minimum YUV color sample limit. MediaConvert conforms any pixels in your input below the value
     *        that you specify to typical limited range bounds. Enter an integer from 0 to 128. Leave blank to use the
     *        default value 64. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert
     *        automatically scales this value down. When you specify a value for Minumum YUV, you must set Sample range
     *        conversion to Limited range clip.
     */

    public void setMinimumYUV(Integer minimumYUV) {
        this.minimumYUV = minimumYUV;
    }

    /**
     * Specify the Minimum YUV color sample limit. MediaConvert conforms any pixels in your input below the value that
     * you specify to typical limited range bounds. Enter an integer from 0 to 128. Leave blank to use the default value
     * 64. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert automatically scales this
     * value down. When you specify a value for Minumum YUV, you must set Sample range conversion to Limited range clip.
     * 
     * @return Specify the Minimum YUV color sample limit. MediaConvert conforms any pixels in your input below the
     *         value that you specify to typical limited range bounds. Enter an integer from 0 to 128. Leave blank to
     *         use the default value 64. The value that you enter applies to 10-bit ranges. For 8-bit ranges,
     *         MediaConvert automatically scales this value down. When you specify a value for Minumum YUV, you must set
     *         Sample range conversion to Limited range clip.
     */

    public Integer getMinimumYUV() {
        return this.minimumYUV;
    }

    /**
     * Specify the Minimum YUV color sample limit. MediaConvert conforms any pixels in your input below the value that
     * you specify to typical limited range bounds. Enter an integer from 0 to 128. Leave blank to use the default value
     * 64. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert automatically scales this
     * value down. When you specify a value for Minumum YUV, you must set Sample range conversion to Limited range clip.
     * 
     * @param minimumYUV
     *        Specify the Minimum YUV color sample limit. MediaConvert conforms any pixels in your input below the value
     *        that you specify to typical limited range bounds. Enter an integer from 0 to 128. Leave blank to use the
     *        default value 64. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert
     *        automatically scales this value down. When you specify a value for Minumum YUV, you must set Sample range
     *        conversion to Limited range clip.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClipLimits withMinimumYUV(Integer minimumYUV) {
        setMinimumYUV(minimumYUV);
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
        if (getMaximumRGBTolerance() != null)
            sb.append("MaximumRGBTolerance: ").append(getMaximumRGBTolerance()).append(",");
        if (getMaximumYUV() != null)
            sb.append("MaximumYUV: ").append(getMaximumYUV()).append(",");
        if (getMinimumRGBTolerance() != null)
            sb.append("MinimumRGBTolerance: ").append(getMinimumRGBTolerance()).append(",");
        if (getMinimumYUV() != null)
            sb.append("MinimumYUV: ").append(getMinimumYUV());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClipLimits == false)
            return false;
        ClipLimits other = (ClipLimits) obj;
        if (other.getMaximumRGBTolerance() == null ^ this.getMaximumRGBTolerance() == null)
            return false;
        if (other.getMaximumRGBTolerance() != null && other.getMaximumRGBTolerance().equals(this.getMaximumRGBTolerance()) == false)
            return false;
        if (other.getMaximumYUV() == null ^ this.getMaximumYUV() == null)
            return false;
        if (other.getMaximumYUV() != null && other.getMaximumYUV().equals(this.getMaximumYUV()) == false)
            return false;
        if (other.getMinimumRGBTolerance() == null ^ this.getMinimumRGBTolerance() == null)
            return false;
        if (other.getMinimumRGBTolerance() != null && other.getMinimumRGBTolerance().equals(this.getMinimumRGBTolerance()) == false)
            return false;
        if (other.getMinimumYUV() == null ^ this.getMinimumYUV() == null)
            return false;
        if (other.getMinimumYUV() != null && other.getMinimumYUV().equals(this.getMinimumYUV()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumRGBTolerance() == null) ? 0 : getMaximumRGBTolerance().hashCode());
        hashCode = prime * hashCode + ((getMaximumYUV() == null) ? 0 : getMaximumYUV().hashCode());
        hashCode = prime * hashCode + ((getMinimumRGBTolerance() == null) ? 0 : getMinimumRGBTolerance().hashCode());
        hashCode = prime * hashCode + ((getMinimumYUV() == null) ? 0 : getMinimumYUV().hashCode());
        return hashCode;
    }

    @Override
    public ClipLimits clone() {
        try {
            return (ClipLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.ClipLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
