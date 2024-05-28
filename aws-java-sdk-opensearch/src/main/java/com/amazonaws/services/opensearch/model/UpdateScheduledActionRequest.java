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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateScheduledActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain to reschedule an action for.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The unique identifier of the action to reschedule. To retrieve this ID, send a <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     * >ListScheduledActions</a> request.
     * </p>
     */
    private String actionID;
    /**
     * <p>
     * The type of action to reschedule. Can be one of <code>SERVICE_SOFTWARE_UPDATE</code>,
     * <code>JVM_HEAP_SIZE_TUNING</code>, or <code>JVM_YOUNG_GEN_TUNING</code>. To retrieve this value, send a <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     * >ListScheduledActions</a> request.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * When to schedule the action.
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
     * <code>OFF_PEAK_WINDOW</code> - Marks the action to be picked up during an upcoming off-peak window. There's no
     * guarantee that the change will be implemented during the next immediate window. Depending on capacity, it might
     * happen in subsequent days.
     * </p>
     * </li>
     * </ul>
     */
    private String scheduleAt;
    /**
     * <p>
     * The time to implement the change, in Coordinated Universal Time (UTC). Only specify this parameter if you set
     * <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     * </p>
     */
    private Long desiredStartTime;

    /**
     * <p>
     * The name of the domain to reschedule an action for.
     * </p>
     * 
     * @param domainName
     *        The name of the domain to reschedule an action for.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain to reschedule an action for.
     * </p>
     * 
     * @return The name of the domain to reschedule an action for.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain to reschedule an action for.
     * </p>
     * 
     * @param domainName
     *        The name of the domain to reschedule an action for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the action to reschedule. To retrieve this ID, send a <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     * >ListScheduledActions</a> request.
     * </p>
     * 
     * @param actionID
     *        The unique identifier of the action to reschedule. To retrieve this ID, send a <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     *        >ListScheduledActions</a> request.
     */

    public void setActionID(String actionID) {
        this.actionID = actionID;
    }

    /**
     * <p>
     * The unique identifier of the action to reschedule. To retrieve this ID, send a <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     * >ListScheduledActions</a> request.
     * </p>
     * 
     * @return The unique identifier of the action to reschedule. To retrieve this ID, send a <a
     *         href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     *         >ListScheduledActions</a> request.
     */

    public String getActionID() {
        return this.actionID;
    }

    /**
     * <p>
     * The unique identifier of the action to reschedule. To retrieve this ID, send a <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     * >ListScheduledActions</a> request.
     * </p>
     * 
     * @param actionID
     *        The unique identifier of the action to reschedule. To retrieve this ID, send a <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     *        >ListScheduledActions</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionRequest withActionID(String actionID) {
        setActionID(actionID);
        return this;
    }

    /**
     * <p>
     * The type of action to reschedule. Can be one of <code>SERVICE_SOFTWARE_UPDATE</code>,
     * <code>JVM_HEAP_SIZE_TUNING</code>, or <code>JVM_YOUNG_GEN_TUNING</code>. To retrieve this value, send a <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     * >ListScheduledActions</a> request.
     * </p>
     * 
     * @param actionType
     *        The type of action to reschedule. Can be one of <code>SERVICE_SOFTWARE_UPDATE</code>,
     *        <code>JVM_HEAP_SIZE_TUNING</code>, or <code>JVM_YOUNG_GEN_TUNING</code>. To retrieve this value, send a <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html">
     *        ListScheduledActions</a> request.
     * @see ActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of action to reschedule. Can be one of <code>SERVICE_SOFTWARE_UPDATE</code>,
     * <code>JVM_HEAP_SIZE_TUNING</code>, or <code>JVM_YOUNG_GEN_TUNING</code>. To retrieve this value, send a <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     * >ListScheduledActions</a> request.
     * </p>
     * 
     * @return The type of action to reschedule. Can be one of <code>SERVICE_SOFTWARE_UPDATE</code>,
     *         <code>JVM_HEAP_SIZE_TUNING</code>, or <code>JVM_YOUNG_GEN_TUNING</code>. To retrieve this value, send a
     *         <a
     *         href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     *         >ListScheduledActions</a> request.
     * @see ActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of action to reschedule. Can be one of <code>SERVICE_SOFTWARE_UPDATE</code>,
     * <code>JVM_HEAP_SIZE_TUNING</code>, or <code>JVM_YOUNG_GEN_TUNING</code>. To retrieve this value, send a <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     * >ListScheduledActions</a> request.
     * </p>
     * 
     * @param actionType
     *        The type of action to reschedule. Can be one of <code>SERVICE_SOFTWARE_UPDATE</code>,
     *        <code>JVM_HEAP_SIZE_TUNING</code>, or <code>JVM_YOUNG_GEN_TUNING</code>. To retrieve this value, send a <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html">
     *        ListScheduledActions</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public UpdateScheduledActionRequest withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The type of action to reschedule. Can be one of <code>SERVICE_SOFTWARE_UPDATE</code>,
     * <code>JVM_HEAP_SIZE_TUNING</code>, or <code>JVM_YOUNG_GEN_TUNING</code>. To retrieve this value, send a <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html"
     * >ListScheduledActions</a> request.
     * </p>
     * 
     * @param actionType
     *        The type of action to reschedule. Can be one of <code>SERVICE_SOFTWARE_UPDATE</code>,
     *        <code>JVM_HEAP_SIZE_TUNING</code>, or <code>JVM_YOUNG_GEN_TUNING</code>. To retrieve this value, send a <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_ListScheduledActions.html">
     *        ListScheduledActions</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public UpdateScheduledActionRequest withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * When to schedule the action.
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
     * <code>OFF_PEAK_WINDOW</code> - Marks the action to be picked up during an upcoming off-peak window. There's no
     * guarantee that the change will be implemented during the next immediate window. Depending on capacity, it might
     * happen in subsequent days.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scheduleAt
     *        When to schedule the action.</p>
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
     *        <code>OFF_PEAK_WINDOW</code> - Marks the action to be picked up during an upcoming off-peak window.
     *        There's no guarantee that the change will be implemented during the next immediate window. Depending on
     *        capacity, it might happen in subsequent days.
     *        </p>
     *        </li>
     * @see ScheduleAt
     */

    public void setScheduleAt(String scheduleAt) {
        this.scheduleAt = scheduleAt;
    }

    /**
     * <p>
     * When to schedule the action.
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
     * <code>OFF_PEAK_WINDOW</code> - Marks the action to be picked up during an upcoming off-peak window. There's no
     * guarantee that the change will be implemented during the next immediate window. Depending on capacity, it might
     * happen in subsequent days.
     * </p>
     * </li>
     * </ul>
     * 
     * @return When to schedule the action.</p>
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
     *         <code>OFF_PEAK_WINDOW</code> - Marks the action to be picked up during an upcoming off-peak window.
     *         There's no guarantee that the change will be implemented during the next immediate window. Depending on
     *         capacity, it might happen in subsequent days.
     *         </p>
     *         </li>
     * @see ScheduleAt
     */

    public String getScheduleAt() {
        return this.scheduleAt;
    }

    /**
     * <p>
     * When to schedule the action.
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
     * <code>OFF_PEAK_WINDOW</code> - Marks the action to be picked up during an upcoming off-peak window. There's no
     * guarantee that the change will be implemented during the next immediate window. Depending on capacity, it might
     * happen in subsequent days.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scheduleAt
     *        When to schedule the action.</p>
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
     *        <code>OFF_PEAK_WINDOW</code> - Marks the action to be picked up during an upcoming off-peak window.
     *        There's no guarantee that the change will be implemented during the next immediate window. Depending on
     *        capacity, it might happen in subsequent days.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleAt
     */

    public UpdateScheduledActionRequest withScheduleAt(String scheduleAt) {
        setScheduleAt(scheduleAt);
        return this;
    }

    /**
     * <p>
     * When to schedule the action.
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
     * <code>OFF_PEAK_WINDOW</code> - Marks the action to be picked up during an upcoming off-peak window. There's no
     * guarantee that the change will be implemented during the next immediate window. Depending on capacity, it might
     * happen in subsequent days.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scheduleAt
     *        When to schedule the action.</p>
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
     *        <code>OFF_PEAK_WINDOW</code> - Marks the action to be picked up during an upcoming off-peak window.
     *        There's no guarantee that the change will be implemented during the next immediate window. Depending on
     *        capacity, it might happen in subsequent days.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleAt
     */

    public UpdateScheduledActionRequest withScheduleAt(ScheduleAt scheduleAt) {
        this.scheduleAt = scheduleAt.toString();
        return this;
    }

    /**
     * <p>
     * The time to implement the change, in Coordinated Universal Time (UTC). Only specify this parameter if you set
     * <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     * </p>
     * 
     * @param desiredStartTime
     *        The time to implement the change, in Coordinated Universal Time (UTC). Only specify this parameter if you
     *        set <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     */

    public void setDesiredStartTime(Long desiredStartTime) {
        this.desiredStartTime = desiredStartTime;
    }

    /**
     * <p>
     * The time to implement the change, in Coordinated Universal Time (UTC). Only specify this parameter if you set
     * <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     * </p>
     * 
     * @return The time to implement the change, in Coordinated Universal Time (UTC). Only specify this parameter if you
     *         set <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     */

    public Long getDesiredStartTime() {
        return this.desiredStartTime;
    }

    /**
     * <p>
     * The time to implement the change, in Coordinated Universal Time (UTC). Only specify this parameter if you set
     * <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     * </p>
     * 
     * @param desiredStartTime
     *        The time to implement the change, in Coordinated Universal Time (UTC). Only specify this parameter if you
     *        set <code>ScheduleAt</code> to <code>TIMESTAMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionRequest withDesiredStartTime(Long desiredStartTime) {
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
        if (getActionID() != null)
            sb.append("ActionID: ").append(getActionID()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
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

        if (obj instanceof UpdateScheduledActionRequest == false)
            return false;
        UpdateScheduledActionRequest other = (UpdateScheduledActionRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getActionID() == null ^ this.getActionID() == null)
            return false;
        if (other.getActionID() != null && other.getActionID().equals(this.getActionID()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
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
        hashCode = prime * hashCode + ((getActionID() == null) ? 0 : getActionID().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getScheduleAt() == null) ? 0 : getScheduleAt().hashCode());
        hashCode = prime * hashCode + ((getDesiredStartTime() == null) ? 0 : getDesiredStartTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateScheduledActionRequest clone() {
        return (UpdateScheduledActionRequest) super.clone();
    }

}
