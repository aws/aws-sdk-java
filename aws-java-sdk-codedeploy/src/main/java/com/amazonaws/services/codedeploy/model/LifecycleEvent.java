/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a deployment lifecycle event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/LifecycleEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall, ApplicationStart, or
     * ValidateService.
     * </p>
     */
    private String lifecycleEventName;
    /**
     * <p>
     * Diagnostic information about the deployment lifecycle event.
     * </p>
     */
    private Diagnostics diagnostics;
    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall, ApplicationStart, or
     * ValidateService.
     * </p>
     * 
     * @param lifecycleEventName
     *        The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall,
     *        ApplicationStart, or ValidateService.
     */

    public void setLifecycleEventName(String lifecycleEventName) {
        this.lifecycleEventName = lifecycleEventName;
    }

    /**
     * <p>
     * The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall, ApplicationStart, or
     * ValidateService.
     * </p>
     * 
     * @return The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall,
     *         ApplicationStart, or ValidateService.
     */

    public String getLifecycleEventName() {
        return this.lifecycleEventName;
    }

    /**
     * <p>
     * The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall, ApplicationStart, or
     * ValidateService.
     * </p>
     * 
     * @param lifecycleEventName
     *        The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall,
     *        ApplicationStart, or ValidateService.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleEvent withLifecycleEventName(String lifecycleEventName) {
        setLifecycleEventName(lifecycleEventName);
        return this;
    }

    /**
     * <p>
     * Diagnostic information about the deployment lifecycle event.
     * </p>
     * 
     * @param diagnostics
     *        Diagnostic information about the deployment lifecycle event.
     */

    public void setDiagnostics(Diagnostics diagnostics) {
        this.diagnostics = diagnostics;
    }

    /**
     * <p>
     * Diagnostic information about the deployment lifecycle event.
     * </p>
     * 
     * @return Diagnostic information about the deployment lifecycle event.
     */

    public Diagnostics getDiagnostics() {
        return this.diagnostics;
    }

    /**
     * <p>
     * Diagnostic information about the deployment lifecycle event.
     * </p>
     * 
     * @param diagnostics
     *        Diagnostic information about the deployment lifecycle event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleEvent withDiagnostics(Diagnostics diagnostics) {
        setDiagnostics(diagnostics);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event started.
     * </p>
     * 
     * @param startTime
     *        A timestamp that indicates when the deployment lifecycle event started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event started.
     * </p>
     * 
     * @return A timestamp that indicates when the deployment lifecycle event started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event started.
     * </p>
     * 
     * @param startTime
     *        A timestamp that indicates when the deployment lifecycle event started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleEvent withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event ended.
     * </p>
     * 
     * @param endTime
     *        A timestamp that indicates when the deployment lifecycle event ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event ended.
     * </p>
     * 
     * @return A timestamp that indicates when the deployment lifecycle event ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event ended.
     * </p>
     * 
     * @param endTime
     *        A timestamp that indicates when the deployment lifecycle event ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleEvent withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment lifecycle event status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The deployment lifecycle event is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: The deployment lifecycle event is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The deployment lifecycle event ran successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The deployment lifecycle event has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: The deployment lifecycle event has been skipped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: The deployment lifecycle event is unknown.
     *        </p>
     *        </li>
     * @see LifecycleEventStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The deployment lifecycle event status:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending: The deployment lifecycle event is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         InProgress: The deployment lifecycle event is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Succeeded: The deployment lifecycle event ran successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: The deployment lifecycle event has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Skipped: The deployment lifecycle event has been skipped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Unknown: The deployment lifecycle event is unknown.
     *         </p>
     *         </li>
     * @see LifecycleEventStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment lifecycle event status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The deployment lifecycle event is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: The deployment lifecycle event is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The deployment lifecycle event ran successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The deployment lifecycle event has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: The deployment lifecycle event has been skipped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: The deployment lifecycle event is unknown.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecycleEventStatus
     */

    public LifecycleEvent withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment lifecycle event status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The deployment lifecycle event is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: The deployment lifecycle event is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The deployment lifecycle event ran successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The deployment lifecycle event has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: The deployment lifecycle event has been skipped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: The deployment lifecycle event is unknown.
     *        </p>
     *        </li>
     * @see LifecycleEventStatus
     */

    public void setStatus(LifecycleEventStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment lifecycle event status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The deployment lifecycle event is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: The deployment lifecycle event is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The deployment lifecycle event ran successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The deployment lifecycle event has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: The deployment lifecycle event has been skipped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: The deployment lifecycle event is unknown.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecycleEventStatus
     */

    public LifecycleEvent withStatus(LifecycleEventStatus status) {
        this.status = status.toString();
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
        if (getLifecycleEventName() != null)
            sb.append("LifecycleEventName: ").append(getLifecycleEventName()).append(",");
        if (getDiagnostics() != null)
            sb.append("Diagnostics: ").append(getDiagnostics()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleEvent == false)
            return false;
        LifecycleEvent other = (LifecycleEvent) obj;
        if (other.getLifecycleEventName() == null ^ this.getLifecycleEventName() == null)
            return false;
        if (other.getLifecycleEventName() != null && other.getLifecycleEventName().equals(this.getLifecycleEventName()) == false)
            return false;
        if (other.getDiagnostics() == null ^ this.getDiagnostics() == null)
            return false;
        if (other.getDiagnostics() != null && other.getDiagnostics().equals(this.getDiagnostics()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycleEventName() == null) ? 0 : getLifecycleEventName().hashCode());
        hashCode = prime * hashCode + ((getDiagnostics() == null) ? 0 : getDiagnostics().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleEvent clone() {
        try {
            return (LifecycleEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.LifecycleEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
