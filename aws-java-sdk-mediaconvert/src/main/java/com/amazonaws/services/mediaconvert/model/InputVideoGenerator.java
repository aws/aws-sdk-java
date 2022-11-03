/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * When you include Video generator, MediaConvert creates a video input with black frames. Use this setting if you do
 * not have a video input or if you want to add black video frames before, or after, other inputs. You can specify Video
 * generator, or you can specify an Input file, but you cannot specify both. For more information, see
 * https://docs.aws.amazon.com/mediaconvert/latest/ug/video-generator.html
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/InputVideoGenerator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputVideoGenerator implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify an integer value for Black video duration from 50 to 86400000 to generate a black video input for that
     * many milliseconds. Required when you include Video generator.
     */
    private Integer duration;

    /**
     * Specify an integer value for Black video duration from 50 to 86400000 to generate a black video input for that
     * many milliseconds. Required when you include Video generator.
     * 
     * @param duration
     *        Specify an integer value for Black video duration from 50 to 86400000 to generate a black video input for
     *        that many milliseconds. Required when you include Video generator.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Specify an integer value for Black video duration from 50 to 86400000 to generate a black video input for that
     * many milliseconds. Required when you include Video generator.
     * 
     * @return Specify an integer value for Black video duration from 50 to 86400000 to generate a black video input for
     *         that many milliseconds. Required when you include Video generator.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * Specify an integer value for Black video duration from 50 to 86400000 to generate a black video input for that
     * many milliseconds. Required when you include Video generator.
     * 
     * @param duration
     *        Specify an integer value for Black video duration from 50 to 86400000 to generate a black video input for
     *        that many milliseconds. Required when you include Video generator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputVideoGenerator withDuration(Integer duration) {
        setDuration(duration);
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
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputVideoGenerator == false)
            return false;
        InputVideoGenerator other = (InputVideoGenerator) obj;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        return hashCode;
    }

    @Override
    public InputVideoGenerator clone() {
        try {
            return (InputVideoGenerator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.InputVideoGeneratorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
