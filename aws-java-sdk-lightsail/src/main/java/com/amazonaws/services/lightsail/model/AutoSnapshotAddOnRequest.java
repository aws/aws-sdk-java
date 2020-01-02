/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a request to enable or modify the automatic snapshot add-on for an Amazon Lightsail instance or disk.
 * </p>
 * <p>
 * When you modify the automatic snapshot time for a resource, it is typically effective immediately except under the
 * following conditions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If an automatic snapshot has been created for the current day, and you change the snapshot time to a later time of
 * day, then the new snapshot time will be effective the following day. This ensures that two snapshots are not created
 * for the current day.
 * </p>
 * </li>
 * <li>
 * <p>
 * If an automatic snapshot has not yet been created for the current day, and you change the snapshot time to an earlier
 * time of day, then the new snapshot time will be effective the following day and a snapshot is automatically created
 * at the previously set time for the current day. This ensures that a snapshot is created for the current day.
 * </p>
 * </li>
 * <li>
 * <p>
 * If an automatic snapshot has not yet been created for the current day, and you change the snapshot time to a time
 * that is within 30 minutes from your current time, then the new snapshot time will be effective the following day and
 * a snapshot is automatically created at the previously set time for the current day. This ensures that a snapshot is
 * created for the current day, because 30 minutes is required between your current time and the new snapshot time that
 * you specify.
 * </p>
 * </li>
 * <li>
 * <p>
 * If an automatic snapshot is scheduled to be created within 30 minutes from your current time and you change the
 * snapshot time, then the new snapshot time will be effective the following day and a snapshot is automatically created
 * at the previously set time for the current day. This ensures that a snapshot is created for the current day, because
 * 30 minutes is required between your current time and the new snapshot time that you specify.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AutoSnapshotAddOnRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoSnapshotAddOnRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The daily time when an automatic snapshot will be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in <code>HH:00</code> format, and in an hourly increment.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * The snapshot will be automatically created between the time specified and up to 45 minutes after.
     * </p>
     * </li>
     * </ul>
     */
    private String snapshotTimeOfDay;

    /**
     * <p>
     * The daily time when an automatic snapshot will be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in <code>HH:00</code> format, and in an hourly increment.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * The snapshot will be automatically created between the time specified and up to 45 minutes after.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snapshotTimeOfDay
     *        The daily time when an automatic snapshot will be created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in <code>HH:00</code> format, and in an hourly increment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The snapshot will be automatically created between the time specified and up to 45 minutes after.
     *        </p>
     *        </li>
     */

    public void setSnapshotTimeOfDay(String snapshotTimeOfDay) {
        this.snapshotTimeOfDay = snapshotTimeOfDay;
    }

    /**
     * <p>
     * The daily time when an automatic snapshot will be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in <code>HH:00</code> format, and in an hourly increment.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * The snapshot will be automatically created between the time specified and up to 45 minutes after.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The daily time when an automatic snapshot will be created.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in <code>HH:00</code> format, and in an hourly increment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The snapshot will be automatically created between the time specified and up to 45 minutes after.
     *         </p>
     *         </li>
     */

    public String getSnapshotTimeOfDay() {
        return this.snapshotTimeOfDay;
    }

    /**
     * <p>
     * The daily time when an automatic snapshot will be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in <code>HH:00</code> format, and in an hourly increment.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * The snapshot will be automatically created between the time specified and up to 45 minutes after.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snapshotTimeOfDay
     *        The daily time when an automatic snapshot will be created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in <code>HH:00</code> format, and in an hourly increment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The snapshot will be automatically created between the time specified and up to 45 minutes after.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoSnapshotAddOnRequest withSnapshotTimeOfDay(String snapshotTimeOfDay) {
        setSnapshotTimeOfDay(snapshotTimeOfDay);
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
        if (getSnapshotTimeOfDay() != null)
            sb.append("SnapshotTimeOfDay: ").append(getSnapshotTimeOfDay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoSnapshotAddOnRequest == false)
            return false;
        AutoSnapshotAddOnRequest other = (AutoSnapshotAddOnRequest) obj;
        if (other.getSnapshotTimeOfDay() == null ^ this.getSnapshotTimeOfDay() == null)
            return false;
        if (other.getSnapshotTimeOfDay() != null && other.getSnapshotTimeOfDay().equals(this.getSnapshotTimeOfDay()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotTimeOfDay() == null) ? 0 : getSnapshotTimeOfDay().hashCode());
        return hashCode;
    }

    @Override
    public AutoSnapshotAddOnRequest clone() {
        try {
            return (AutoSnapshotAddOnRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.AutoSnapshotAddOnRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
