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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that specifies how to interpolate data in a list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/InterpolationParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InterpolationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The interpolation type.
     * </p>
     */
    private String interpolationType;
    /**
     * <p>
     * The interpolation time interval in seconds.
     * </p>
     */
    private Long intervalInSeconds;

    /**
     * <p>
     * The interpolation type.
     * </p>
     * 
     * @param interpolationType
     *        The interpolation type.
     * @see InterpolationType
     */

    public void setInterpolationType(String interpolationType) {
        this.interpolationType = interpolationType;
    }

    /**
     * <p>
     * The interpolation type.
     * </p>
     * 
     * @return The interpolation type.
     * @see InterpolationType
     */

    public String getInterpolationType() {
        return this.interpolationType;
    }

    /**
     * <p>
     * The interpolation type.
     * </p>
     * 
     * @param interpolationType
     *        The interpolation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterpolationType
     */

    public InterpolationParameters withInterpolationType(String interpolationType) {
        setInterpolationType(interpolationType);
        return this;
    }

    /**
     * <p>
     * The interpolation type.
     * </p>
     * 
     * @param interpolationType
     *        The interpolation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterpolationType
     */

    public InterpolationParameters withInterpolationType(InterpolationType interpolationType) {
        this.interpolationType = interpolationType.toString();
        return this;
    }

    /**
     * <p>
     * The interpolation time interval in seconds.
     * </p>
     * 
     * @param intervalInSeconds
     *        The interpolation time interval in seconds.
     */

    public void setIntervalInSeconds(Long intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
    }

    /**
     * <p>
     * The interpolation time interval in seconds.
     * </p>
     * 
     * @return The interpolation time interval in seconds.
     */

    public Long getIntervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * <p>
     * The interpolation time interval in seconds.
     * </p>
     * 
     * @param intervalInSeconds
     *        The interpolation time interval in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InterpolationParameters withIntervalInSeconds(Long intervalInSeconds) {
        setIntervalInSeconds(intervalInSeconds);
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
        if (getInterpolationType() != null)
            sb.append("InterpolationType: ").append(getInterpolationType()).append(",");
        if (getIntervalInSeconds() != null)
            sb.append("IntervalInSeconds: ").append(getIntervalInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InterpolationParameters == false)
            return false;
        InterpolationParameters other = (InterpolationParameters) obj;
        if (other.getInterpolationType() == null ^ this.getInterpolationType() == null)
            return false;
        if (other.getInterpolationType() != null && other.getInterpolationType().equals(this.getInterpolationType()) == false)
            return false;
        if (other.getIntervalInSeconds() == null ^ this.getIntervalInSeconds() == null)
            return false;
        if (other.getIntervalInSeconds() != null && other.getIntervalInSeconds().equals(this.getIntervalInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterpolationType() == null) ? 0 : getInterpolationType().hashCode());
        hashCode = prime * hashCode + ((getIntervalInSeconds() == null) ? 0 : getIntervalInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public InterpolationParameters clone() {
        try {
            return (InterpolationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.InterpolationParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
