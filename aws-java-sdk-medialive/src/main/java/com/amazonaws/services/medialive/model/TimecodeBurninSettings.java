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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Timecode Burnin Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TimecodeBurninSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimecodeBurninSettings implements Serializable, Cloneable, StructuredPojo {

    /** Choose a timecode burn-in font size */
    private String fontSize;
    /** Choose a timecode burn-in output position */
    private String position;
    /** Create a timecode burn-in prefix (optional) */
    private String prefix;

    /**
     * Choose a timecode burn-in font size
     * 
     * @param fontSize
     *        Choose a timecode burn-in font size
     * @see TimecodeBurninFontSize
     */

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Choose a timecode burn-in font size
     * 
     * @return Choose a timecode burn-in font size
     * @see TimecodeBurninFontSize
     */

    public String getFontSize() {
        return this.fontSize;
    }

    /**
     * Choose a timecode burn-in font size
     * 
     * @param fontSize
     *        Choose a timecode burn-in font size
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimecodeBurninFontSize
     */

    public TimecodeBurninSettings withFontSize(String fontSize) {
        setFontSize(fontSize);
        return this;
    }

    /**
     * Choose a timecode burn-in font size
     * 
     * @param fontSize
     *        Choose a timecode burn-in font size
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimecodeBurninFontSize
     */

    public TimecodeBurninSettings withFontSize(TimecodeBurninFontSize fontSize) {
        this.fontSize = fontSize.toString();
        return this;
    }

    /**
     * Choose a timecode burn-in output position
     * 
     * @param position
     *        Choose a timecode burn-in output position
     * @see TimecodeBurninPosition
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Choose a timecode burn-in output position
     * 
     * @return Choose a timecode burn-in output position
     * @see TimecodeBurninPosition
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * Choose a timecode burn-in output position
     * 
     * @param position
     *        Choose a timecode burn-in output position
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimecodeBurninPosition
     */

    public TimecodeBurninSettings withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * Choose a timecode burn-in output position
     * 
     * @param position
     *        Choose a timecode burn-in output position
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimecodeBurninPosition
     */

    public TimecodeBurninSettings withPosition(TimecodeBurninPosition position) {
        this.position = position.toString();
        return this;
    }

    /**
     * Create a timecode burn-in prefix (optional)
     * 
     * @param prefix
     *        Create a timecode burn-in prefix (optional)
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Create a timecode burn-in prefix (optional)
     * 
     * @return Create a timecode burn-in prefix (optional)
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Create a timecode burn-in prefix (optional)
     * 
     * @param prefix
     *        Create a timecode burn-in prefix (optional)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimecodeBurninSettings withPrefix(String prefix) {
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

        if (obj instanceof TimecodeBurninSettings == false)
            return false;
        TimecodeBurninSettings other = (TimecodeBurninSettings) obj;
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
    public TimecodeBurninSettings clone() {
        try {
            return (TimecodeBurninSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.TimecodeBurninSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
