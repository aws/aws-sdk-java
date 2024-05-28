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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the request parameters to the <code>StartServiceSoftwareUpdate</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartServiceSoftwareUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that you want to update to the latest service software.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * When to start the service software update.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOW</code> - Immediately schedules the update to happen in the current hour if there's capacity available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMESTAMP</code> - Lets you specify a custom date and time to apply the update. If you specify this value,
     * you must also provide a value for <code>DesiredStartTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFF_PEAK_WINDOW</code> - Marks the update to be picked up during an upcoming off-peak window. There's no
     * guarantee that the update will happen during the next immediate window. Depending on capacity, it might happen in
     * subsequent days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>NOW</code> if you don't specify a value for <code>DesiredStartTime</code>, and
     * <code>TIMESTAMP</code> if you do.
     * </p>
     */
    private String scheduleAt;
    /**
     * <p>
     * The Epoch timestamp when you want the service software update to start. You only need to specify this parameter
     * if you set <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     * </p>
     */
    private Long desiredStartTime;

    /**
     * <p>
     * The name of the domain that you want to update to the latest service software.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to update to the latest service software.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to update to the latest service software.
     * </p>
     * 
     * @return The name of the domain that you want to update to the latest service software.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to update to the latest service software.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to update to the latest service software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartServiceSoftwareUpdateRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * When to start the service software update.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOW</code> - Immediately schedules the update to happen in the current hour if there's capacity available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMESTAMP</code> - Lets you specify a custom date and time to apply the update. If you specify this value,
     * you must also provide a value for <code>DesiredStartTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFF_PEAK_WINDOW</code> - Marks the update to be picked up during an upcoming off-peak window. There's no
     * guarantee that the update will happen during the next immediate window. Depending on capacity, it might happen in
     * subsequent days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>NOW</code> if you don't specify a value for <code>DesiredStartTime</code>, and
     * <code>TIMESTAMP</code> if you do.
     * </p>
     * 
     * @param scheduleAt
     *        When to start the service software update.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOW</code> - Immediately schedules the update to happen in the current hour if there's capacity
     *        available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMESTAMP</code> - Lets you specify a custom date and time to apply the update. If you specify this
     *        value, you must also provide a value for <code>DesiredStartTime</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFF_PEAK_WINDOW</code> - Marks the update to be picked up during an upcoming off-peak window.
     *        There's no guarantee that the update will happen during the next immediate window. Depending on capacity,
     *        it might happen in subsequent days.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>NOW</code> if you don't specify a value for <code>DesiredStartTime</code>, and
     *        <code>TIMESTAMP</code> if you do.
     * @see ScheduleAt
     */

    public void setScheduleAt(String scheduleAt) {
        this.scheduleAt = scheduleAt;
    }

    /**
     * <p>
     * When to start the service software update.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOW</code> - Immediately schedules the update to happen in the current hour if there's capacity available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMESTAMP</code> - Lets you specify a custom date and time to apply the update. If you specify this value,
     * you must also provide a value for <code>DesiredStartTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFF_PEAK_WINDOW</code> - Marks the update to be picked up during an upcoming off-peak window. There's no
     * guarantee that the update will happen during the next immediate window. Depending on capacity, it might happen in
     * subsequent days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>NOW</code> if you don't specify a value for <code>DesiredStartTime</code>, and
     * <code>TIMESTAMP</code> if you do.
     * </p>
     * 
     * @return When to start the service software update.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NOW</code> - Immediately schedules the update to happen in the current hour if there's capacity
     *         available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TIMESTAMP</code> - Lets you specify a custom date and time to apply the update. If you specify this
     *         value, you must also provide a value for <code>DesiredStartTime</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OFF_PEAK_WINDOW</code> - Marks the update to be picked up during an upcoming off-peak window.
     *         There's no guarantee that the update will happen during the next immediate window. Depending on capacity,
     *         it might happen in subsequent days.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>NOW</code> if you don't specify a value for <code>DesiredStartTime</code>, and
     *         <code>TIMESTAMP</code> if you do.
     * @see ScheduleAt
     */

    public String getScheduleAt() {
        return this.scheduleAt;
    }

    /**
     * <p>
     * When to start the service software update.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOW</code> - Immediately schedules the update to happen in the current hour if there's capacity available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMESTAMP</code> - Lets you specify a custom date and time to apply the update. If you specify this value,
     * you must also provide a value for <code>DesiredStartTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFF_PEAK_WINDOW</code> - Marks the update to be picked up during an upcoming off-peak window. There's no
     * guarantee that the update will happen during the next immediate window. Depending on capacity, it might happen in
     * subsequent days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>NOW</code> if you don't specify a value for <code>DesiredStartTime</code>, and
     * <code>TIMESTAMP</code> if you do.
     * </p>
     * 
     * @param scheduleAt
     *        When to start the service software update.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOW</code> - Immediately schedules the update to happen in the current hour if there's capacity
     *        available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMESTAMP</code> - Lets you specify a custom date and time to apply the update. If you specify this
     *        value, you must also provide a value for <code>DesiredStartTime</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFF_PEAK_WINDOW</code> - Marks the update to be picked up during an upcoming off-peak window.
     *        There's no guarantee that the update will happen during the next immediate window. Depending on capacity,
     *        it might happen in subsequent days.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>NOW</code> if you don't specify a value for <code>DesiredStartTime</code>, and
     *        <code>TIMESTAMP</code> if you do.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleAt
     */

    public StartServiceSoftwareUpdateRequest withScheduleAt(String scheduleAt) {
        setScheduleAt(scheduleAt);
        return this;
    }

    /**
     * <p>
     * When to start the service software update.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOW</code> - Immediately schedules the update to happen in the current hour if there's capacity available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMESTAMP</code> - Lets you specify a custom date and time to apply the update. If you specify this value,
     * you must also provide a value for <code>DesiredStartTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFF_PEAK_WINDOW</code> - Marks the update to be picked up during an upcoming off-peak window. There's no
     * guarantee that the update will happen during the next immediate window. Depending on capacity, it might happen in
     * subsequent days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>NOW</code> if you don't specify a value for <code>DesiredStartTime</code>, and
     * <code>TIMESTAMP</code> if you do.
     * </p>
     * 
     * @param scheduleAt
     *        When to start the service software update.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOW</code> - Immediately schedules the update to happen in the current hour if there's capacity
     *        available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMESTAMP</code> - Lets you specify a custom date and time to apply the update. If you specify this
     *        value, you must also provide a value for <code>DesiredStartTime</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFF_PEAK_WINDOW</code> - Marks the update to be picked up during an upcoming off-peak window.
     *        There's no guarantee that the update will happen during the next immediate window. Depending on capacity,
     *        it might happen in subsequent days.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>NOW</code> if you don't specify a value for <code>DesiredStartTime</code>, and
     *        <code>TIMESTAMP</code> if you do.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleAt
     */

    public StartServiceSoftwareUpdateRequest withScheduleAt(ScheduleAt scheduleAt) {
        this.scheduleAt = scheduleAt.toString();
        return this;
    }

    /**
     * <p>
     * The Epoch timestamp when you want the service software update to start. You only need to specify this parameter
     * if you set <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     * </p>
     * 
     * @param desiredStartTime
     *        The Epoch timestamp when you want the service software update to start. You only need to specify this
     *        parameter if you set <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     */

    public void setDesiredStartTime(Long desiredStartTime) {
        this.desiredStartTime = desiredStartTime;
    }

    /**
     * <p>
     * The Epoch timestamp when you want the service software update to start. You only need to specify this parameter
     * if you set <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     * </p>
     * 
     * @return The Epoch timestamp when you want the service software update to start. You only need to specify this
     *         parameter if you set <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     */

    public Long getDesiredStartTime() {
        return this.desiredStartTime;
    }

    /**
     * <p>
     * The Epoch timestamp when you want the service software update to start. You only need to specify this parameter
     * if you set <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     * </p>
     * 
     * @param desiredStartTime
     *        The Epoch timestamp when you want the service software update to start. You only need to specify this
     *        parameter if you set <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartServiceSoftwareUpdateRequest withDesiredStartTime(Long desiredStartTime) {
        setDesiredStartTime(desiredStartTime);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getScheduleAt() != null)
            sb.append("ScheduleAt: ").append(getScheduleAt()).append(",");
        if (getDesiredStartTime() != null)
            sb.append("DesiredStartTime: ").append(getDesiredStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartServiceSoftwareUpdateRequest == false)
            return false;
        StartServiceSoftwareUpdateRequest other = (StartServiceSoftwareUpdateRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getScheduleAt() == null ^ this.getScheduleAt() == null)
            return false;
        if (other.getScheduleAt() != null && other.getScheduleAt().equals(this.getScheduleAt()) == false)
            return false;
        if (other.getDesiredStartTime() == null ^ this.getDesiredStartTime() == null)
            return false;
        if (other.getDesiredStartTime() != null && other.getDesiredStartTime().equals(this.getDesiredStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getScheduleAt() == null) ? 0 : getScheduleAt().hashCode());
        hashCode = prime * hashCode + ((getDesiredStartTime() == null) ? 0 : getDesiredStartTime().hashCode());
        return hashCode;
    }

    @Override
    public StartServiceSoftwareUpdateRequest clone() {
        return (StartServiceSoftwareUpdateRequest) super.clone();
    }

}
