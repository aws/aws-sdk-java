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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A custom 10-hour, low-traffic window during which OpenSearch Service can perform mandatory configuration changes on
 * the domain. These actions can include scheduled service software updates and blue/green Auto-Tune enhancements.
 * OpenSearch Service will schedule these actions during the window that you specify.
 * </p>
 * <p>
 * If you don't specify a window start time, it defaults to 10:00 P.M. local time.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/off-peak.html">Defining off-peak
 * maintenance windows for Amazon OpenSearch Service</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OffPeakWindow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A custom start time for the off-peak window, in Coordinated Universal Time (UTC). The window length will always
     * be 10 hours, so you can't specify an end time. For example, if you specify 11:00 P.M. UTC as a start time, the
     * end time will automatically be set to 9:00 A.M.
     * </p>
     */
    private WindowStartTime windowStartTime;

    /**
     * <p>
     * A custom start time for the off-peak window, in Coordinated Universal Time (UTC). The window length will always
     * be 10 hours, so you can't specify an end time. For example, if you specify 11:00 P.M. UTC as a start time, the
     * end time will automatically be set to 9:00 A.M.
     * </p>
     * 
     * @param windowStartTime
     *        A custom start time for the off-peak window, in Coordinated Universal Time (UTC). The window length will
     *        always be 10 hours, so you can't specify an end time. For example, if you specify 11:00 P.M. UTC as a
     *        start time, the end time will automatically be set to 9:00 A.M.
     */

    public void setWindowStartTime(WindowStartTime windowStartTime) {
        this.windowStartTime = windowStartTime;
    }

    /**
     * <p>
     * A custom start time for the off-peak window, in Coordinated Universal Time (UTC). The window length will always
     * be 10 hours, so you can't specify an end time. For example, if you specify 11:00 P.M. UTC as a start time, the
     * end time will automatically be set to 9:00 A.M.
     * </p>
     * 
     * @return A custom start time for the off-peak window, in Coordinated Universal Time (UTC). The window length will
     *         always be 10 hours, so you can't specify an end time. For example, if you specify 11:00 P.M. UTC as a
     *         start time, the end time will automatically be set to 9:00 A.M.
     */

    public WindowStartTime getWindowStartTime() {
        return this.windowStartTime;
    }

    /**
     * <p>
     * A custom start time for the off-peak window, in Coordinated Universal Time (UTC). The window length will always
     * be 10 hours, so you can't specify an end time. For example, if you specify 11:00 P.M. UTC as a start time, the
     * end time will automatically be set to 9:00 A.M.
     * </p>
     * 
     * @param windowStartTime
     *        A custom start time for the off-peak window, in Coordinated Universal Time (UTC). The window length will
     *        always be 10 hours, so you can't specify an end time. For example, if you specify 11:00 P.M. UTC as a
     *        start time, the end time will automatically be set to 9:00 A.M.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OffPeakWindow withWindowStartTime(WindowStartTime windowStartTime) {
        setWindowStartTime(windowStartTime);
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
        if (getWindowStartTime() != null)
            sb.append("WindowStartTime: ").append(getWindowStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OffPeakWindow == false)
            return false;
        OffPeakWindow other = (OffPeakWindow) obj;
        if (other.getWindowStartTime() == null ^ this.getWindowStartTime() == null)
            return false;
        if (other.getWindowStartTime() != null && other.getWindowStartTime().equals(this.getWindowStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowStartTime() == null) ? 0 : getWindowStartTime().hashCode());
        return hashCode;
    }

    @Override
    public OffPeakWindow clone() {
        try {
            return (OffPeakWindow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.OffPeakWindowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
