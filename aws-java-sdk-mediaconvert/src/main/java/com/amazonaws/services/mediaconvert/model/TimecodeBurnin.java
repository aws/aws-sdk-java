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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/TimecodeBurnin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimecodeBurnin implements Serializable, Cloneable, StructuredPojo {

    /** Use Font Size (FontSize) to set the font size of any burned-in timecode. Valid values are 10, 16, 32, 48. */
    private Integer fontSize;
    /**
     * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in
     * timecode on output video.
     */
    private String position;
    /**
     * Use Prefix (Prefix) to place ASCII characters before any burned-in timecode. For example, a prefix of "EZ-" will
     * result in the timecode "EZ-00:00:00:00". Provide either the characters themselves or the ASCII code equivalents.
     * The supported range of characters is 0x20 through 0x7e. This includes letters, numbers, and all special characters
     * represented on a standard English keyboard.
     */
    private String prefix;

    /**
     * Use Font Size (FontSize) to set the font size of any burned-in timecode. Valid values are 10, 16, 32, 48.
     * 
     * @param fontSize
     *        Use Font Size (FontSize) to set the font size of any burned-in timecode. Valid values are 10, 16, 32, 48.
     */

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Use Font Size (FontSize) to set the font size of any burned-in timecode. Valid values are 10, 16, 32, 48.
     * 
     * @return Use Font Size (FontSize) to set the font size of any burned-in timecode. Valid values are 10, 16, 32, 48.
     */

    public Integer getFontSize() {
        return this.fontSize;
    }

    /**
     * Use Font Size (FontSize) to set the font size of any burned-in timecode. Valid values are 10, 16, 32, 48.
     * 
     * @param fontSize
     *        Use Font Size (FontSize) to set the font size of any burned-in timecode. Valid values are 10, 16, 32, 48.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimecodeBurnin withFontSize(Integer fontSize) {
        setFontSize(fontSize);
        return this;
    }

    /**
     * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in
     * timecode on output video.
     * 
     * @param position
     *        Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the
     *        burned-in timecode on output video.
     * @see TimecodeBurninPosition
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in
     * timecode on output video.
     * 
     * @return Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the
     *         burned-in timecode on output video.
     * @see TimecodeBurninPosition
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in
     * timecode on output video.
     * 
     * @param position
     *        Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the
     *        burned-in timecode on output video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimecodeBurninPosition
     */

    public TimecodeBurnin withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in
     * timecode on output video.
     * 
     * @param position
     *        Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the
     *        burned-in timecode on output video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimecodeBurninPosition
     */

    public TimecodeBurnin withPosition(TimecodeBurninPosition position) {
        this.position = position.toString();
        return this;
    }

    /**
     * Use Prefix (Prefix) to place ASCII characters before any burned-in timecode. For example, a prefix of "EZ-" will
     * result in the timecode "EZ-00:00:00:00". Provide either the characters themselves or the ASCII code equivalents.
     * The supported range of characters is 0x20 through 0x7e. This includes letters, numbers, and all special characters
     * represented on a standard English keyboard.
     * 
     * @param prefix
     *        Use Prefix (Prefix) to place ASCII characters before any burned-in timecode. For example, a prefix of
     *        "EZ-" will result in the timecode "EZ-00:00:00:00". Provide either the characters themselves or the ASCII
     *        code equivalents. The supported range of characters is 0x20 through 0x7e. This includes letters, numbers,
     *        and all special characters represented on a standard English keyboard.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Use Prefix (Prefix) to place ASCII characters before any burned-in timecode. For example, a prefix of "EZ-" will
     * result in the timecode "EZ-00:00:00:00". Provide either the characters themselves or the ASCII code equivalents.
     * The supported range of characters is 0x20 through 0x7e. This includes letters, numbers, and all special characters
     * represented on a standard English keyboard.
     * 
     * @return Use Prefix (Prefix) to place ASCII characters before any burned-in timecode. For example, a prefix of
     *         "EZ-" will result in the timecode "EZ-00:00:00:00". Provide either the characters themselves or the ASCII
     *         code equivalents. The supported range of characters is 0x20 through 0x7e. This includes letters, numbers,
     *         and all special characters represented on a standard English keyboard.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Use Prefix (Prefix) to place ASCII characters before any burned-in timecode. For example, a prefix of "EZ-" will
     * result in the timecode "EZ-00:00:00:00". Provide either the characters themselves or the ASCII code equivalents.
     * The supported range of characters is 0x20 through 0x7e. This includes letters, numbers, and all special characters
     * represented on a standard English keyboard.
     * 
     * @param prefix
     *        Use Prefix (Prefix) to place ASCII characters before any burned-in timecode. For example, a prefix of
     *        "EZ-" will result in the timecode "EZ-00:00:00:00". Provide either the characters themselves or the ASCII
     *        code equivalents. The supported range of characters is 0x20 through 0x7e. This includes letters, numbers,
     *        and all special characters represented on a standard English keyboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimecodeBurnin withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getFontSize() != null)
            sb.append("FontSize: ").append(getFontSize()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimecodeBurnin == false)
            return false;
        TimecodeBurnin other = (TimecodeBurnin) obj;
        if (other.getFontSize() == null ^ this.getFontSize() == null)
            return false;
        if (other.getFontSize() != null && other.getFontSize().equals(this.getFontSize()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFontSize() == null) ? 0 : getFontSize().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public TimecodeBurnin clone() {
        try {
            return (TimecodeBurnin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.TimecodeBurninMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
