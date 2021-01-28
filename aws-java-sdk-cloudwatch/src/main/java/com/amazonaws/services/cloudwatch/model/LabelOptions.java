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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This structure includes the <code>Timezone</code> parameter, which you can use to specify your time zone so that the
 * labels that are associated with returned metrics display the correct time for your time zone.
 * </p>
 * <p>
 * The <code>Timezone</code> value affects a label only if you have a time-based dynamic expression in the label. For
 * more information about dynamic expressions in labels, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html">Using Dynamic
 * Labels</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/LabelOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelOptions implements Serializable, Cloneable {

    /**
     * <p>
     * The time zone to use for metric data return in this operation. The format is <code>+</code> or <code>-</code>
     * followed by four digits. The first two digits indicate the number of hours ahead or behind of UTC, and the final
     * two digits are the number of minutes. For example, +0130 indicates a time zone that is 1 hour and 30 minutes
     * ahead of UTC. The default is +0000.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The time zone to use for metric data return in this operation. The format is <code>+</code> or <code>-</code>
     * followed by four digits. The first two digits indicate the number of hours ahead or behind of UTC, and the final
     * two digits are the number of minutes. For example, +0130 indicates a time zone that is 1 hour and 30 minutes
     * ahead of UTC. The default is +0000.
     * </p>
     * 
     * @param timezone
     *        The time zone to use for metric data return in this operation. The format is <code>+</code> or
     *        <code>-</code> followed by four digits. The first two digits indicate the number of hours ahead or behind
     *        of UTC, and the final two digits are the number of minutes. For example, +0130 indicates a time zone that
     *        is 1 hour and 30 minutes ahead of UTC. The default is +0000.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone to use for metric data return in this operation. The format is <code>+</code> or <code>-</code>
     * followed by four digits. The first two digits indicate the number of hours ahead or behind of UTC, and the final
     * two digits are the number of minutes. For example, +0130 indicates a time zone that is 1 hour and 30 minutes
     * ahead of UTC. The default is +0000.
     * </p>
     * 
     * @return The time zone to use for metric data return in this operation. The format is <code>+</code> or
     *         <code>-</code> followed by four digits. The first two digits indicate the number of hours ahead or behind
     *         of UTC, and the final two digits are the number of minutes. For example, +0130 indicates a time zone that
     *         is 1 hour and 30 minutes ahead of UTC. The default is +0000.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone to use for metric data return in this operation. The format is <code>+</code> or <code>-</code>
     * followed by four digits. The first two digits indicate the number of hours ahead or behind of UTC, and the final
     * two digits are the number of minutes. For example, +0130 indicates a time zone that is 1 hour and 30 minutes
     * ahead of UTC. The default is +0000.
     * </p>
     * 
     * @param timezone
     *        The time zone to use for metric data return in this operation. The format is <code>+</code> or
     *        <code>-</code> followed by four digits. The first two digits indicate the number of hours ahead or behind
     *        of UTC, and the final two digits are the number of minutes. For example, +0130 indicates a time zone that
     *        is 1 hour and 30 minutes ahead of UTC. The default is +0000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelOptions withTimezone(String timezone) {
        setTimezone(timezone);
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
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelOptions == false)
            return false;
        LabelOptions other = (LabelOptions) obj;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        return hashCode;
    }

    @Override
    public LabelOptions clone() {
        try {
            return (LabelOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
