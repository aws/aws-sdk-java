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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Determines the type of UTC timing included in the DASH Media Presentation Description (MPD).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DashUtcTiming" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashUtcTiming implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The UTC timing mode.
     * </p>
     */
    private String timingMode;
    /**
     * <p>
     * The the method that the player uses to synchronize to coordinated universal time (UTC) wall clock time.
     * </p>
     */
    private String timingSource;

    /**
     * <p>
     * The UTC timing mode.
     * </p>
     * 
     * @param timingMode
     *        The UTC timing mode.
     * @see DashUtcTimingMode
     */

    public void setTimingMode(String timingMode) {
        this.timingMode = timingMode;
    }

    /**
     * <p>
     * The UTC timing mode.
     * </p>
     * 
     * @return The UTC timing mode.
     * @see DashUtcTimingMode
     */

    public String getTimingMode() {
        return this.timingMode;
    }

    /**
     * <p>
     * The UTC timing mode.
     * </p>
     * 
     * @param timingMode
     *        The UTC timing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashUtcTimingMode
     */

    public DashUtcTiming withTimingMode(String timingMode) {
        setTimingMode(timingMode);
        return this;
    }

    /**
     * <p>
     * The UTC timing mode.
     * </p>
     * 
     * @param timingMode
     *        The UTC timing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashUtcTimingMode
     */

    public DashUtcTiming withTimingMode(DashUtcTimingMode timingMode) {
        this.timingMode = timingMode.toString();
        return this;
    }

    /**
     * <p>
     * The the method that the player uses to synchronize to coordinated universal time (UTC) wall clock time.
     * </p>
     * 
     * @param timingSource
     *        The the method that the player uses to synchronize to coordinated universal time (UTC) wall clock time.
     */

    public void setTimingSource(String timingSource) {
        this.timingSource = timingSource;
    }

    /**
     * <p>
     * The the method that the player uses to synchronize to coordinated universal time (UTC) wall clock time.
     * </p>
     * 
     * @return The the method that the player uses to synchronize to coordinated universal time (UTC) wall clock time.
     */

    public String getTimingSource() {
        return this.timingSource;
    }

    /**
     * <p>
     * The the method that the player uses to synchronize to coordinated universal time (UTC) wall clock time.
     * </p>
     * 
     * @param timingSource
     *        The the method that the player uses to synchronize to coordinated universal time (UTC) wall clock time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashUtcTiming withTimingSource(String timingSource) {
        setTimingSource(timingSource);
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
        if (getTimingMode() != null)
            sb.append("TimingMode: ").append(getTimingMode()).append(",");
        if (getTimingSource() != null)
            sb.append("TimingSource: ").append(getTimingSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashUtcTiming == false)
            return false;
        DashUtcTiming other = (DashUtcTiming) obj;
        if (other.getTimingMode() == null ^ this.getTimingMode() == null)
            return false;
        if (other.getTimingMode() != null && other.getTimingMode().equals(this.getTimingMode()) == false)
            return false;
        if (other.getTimingSource() == null ^ this.getTimingSource() == null)
            return false;
        if (other.getTimingSource() != null && other.getTimingSource().equals(this.getTimingSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimingMode() == null) ? 0 : getTimingMode().hashCode());
        hashCode = prime * hashCode + ((getTimingSource() == null) ? 0 : getTimingSource().hashCode());
        return hashCode;
    }

    @Override
    public DashUtcTiming clone() {
        try {
            return (DashUtcTiming) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.DashUtcTimingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
