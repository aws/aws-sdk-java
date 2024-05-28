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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for time-shifted viewing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/TimeShiftConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeShiftConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum time delay for time-shifted viewing. The minimum allowed maximum time delay is 0 seconds, and the
     * maximum allowed maximum time delay is 21600 seconds (6 hours).
     * </p>
     */
    private Integer maxTimeDelaySeconds;

    /**
     * <p>
     * The maximum time delay for time-shifted viewing. The minimum allowed maximum time delay is 0 seconds, and the
     * maximum allowed maximum time delay is 21600 seconds (6 hours).
     * </p>
     * 
     * @param maxTimeDelaySeconds
     *        The maximum time delay for time-shifted viewing. The minimum allowed maximum time delay is 0 seconds, and
     *        the maximum allowed maximum time delay is 21600 seconds (6 hours).
     */

    public void setMaxTimeDelaySeconds(Integer maxTimeDelaySeconds) {
        this.maxTimeDelaySeconds = maxTimeDelaySeconds;
    }

    /**
     * <p>
     * The maximum time delay for time-shifted viewing. The minimum allowed maximum time delay is 0 seconds, and the
     * maximum allowed maximum time delay is 21600 seconds (6 hours).
     * </p>
     * 
     * @return The maximum time delay for time-shifted viewing. The minimum allowed maximum time delay is 0 seconds, and
     *         the maximum allowed maximum time delay is 21600 seconds (6 hours).
     */

    public Integer getMaxTimeDelaySeconds() {
        return this.maxTimeDelaySeconds;
    }

    /**
     * <p>
     * The maximum time delay for time-shifted viewing. The minimum allowed maximum time delay is 0 seconds, and the
     * maximum allowed maximum time delay is 21600 seconds (6 hours).
     * </p>
     * 
     * @param maxTimeDelaySeconds
     *        The maximum time delay for time-shifted viewing. The minimum allowed maximum time delay is 0 seconds, and
     *        the maximum allowed maximum time delay is 21600 seconds (6 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeShiftConfiguration withMaxTimeDelaySeconds(Integer maxTimeDelaySeconds) {
        setMaxTimeDelaySeconds(maxTimeDelaySeconds);
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
        if (getMaxTimeDelaySeconds() != null)
            sb.append("MaxTimeDelaySeconds: ").append(getMaxTimeDelaySeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeShiftConfiguration == false)
            return false;
        TimeShiftConfiguration other = (TimeShiftConfiguration) obj;
        if (other.getMaxTimeDelaySeconds() == null ^ this.getMaxTimeDelaySeconds() == null)
            return false;
        if (other.getMaxTimeDelaySeconds() != null && other.getMaxTimeDelaySeconds().equals(this.getMaxTimeDelaySeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxTimeDelaySeconds() == null) ? 0 : getMaxTimeDelaySeconds().hashCode());
        return hashCode;
    }

    @Override
    public TimeShiftConfiguration clone() {
        try {
            return (TimeShiftConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.TimeShiftConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
