/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a deployment lifecycle event.
 * </p>
 */
public class LifecycleEvent implements Serializable {

    /**
     * The deployment lifecycle event name, such as ApplicationStop,
     * BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
     */
    private String lifecycleEventName;

    /**
     * Diagnostic information about the deployment lifecycle event.
     */
    private Diagnostics diagnostics;

    /**
     * A timestamp indicating when the deployment lifecycle event started.
     */
    private java.util.Date startTime;

    /**
     * A timestamp indicating when the deployment lifecycle event ended.
     */
    private java.util.Date endTime;

    /**
     * The deployment lifecycle event status: <ul> <li>Pending: The
     * deployment lifecycle event is pending.</li> <li>InProgress: The
     * deployment lifecycle event is in progress.</li> <li>Succeeded: The
     * deployment lifecycle event has succeeded.</li> <li>Failed: The
     * deployment lifecycle event has failed.</li> <li>Skipped: The
     * deployment lifecycle event has been skipped.</li> <li>Unknown: The
     * deployment lifecycle event is unknown.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     */
    private String status;

    /**
     * The deployment lifecycle event name, such as ApplicationStop,
     * BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
     *
     * @return The deployment lifecycle event name, such as ApplicationStop,
     *         BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
     */
    public String getLifecycleEventName() {
        return lifecycleEventName;
    }
    
    /**
     * The deployment lifecycle event name, such as ApplicationStop,
     * BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
     *
     * @param lifecycleEventName The deployment lifecycle event name, such as ApplicationStop,
     *         BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
     */
    public void setLifecycleEventName(String lifecycleEventName) {
        this.lifecycleEventName = lifecycleEventName;
    }
    
    /**
     * The deployment lifecycle event name, such as ApplicationStop,
     * BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lifecycleEventName The deployment lifecycle event name, such as ApplicationStop,
     *         BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleEvent withLifecycleEventName(String lifecycleEventName) {
        this.lifecycleEventName = lifecycleEventName;
        return this;
    }

    /**
     * Diagnostic information about the deployment lifecycle event.
     *
     * @return Diagnostic information about the deployment lifecycle event.
     */
    public Diagnostics getDiagnostics() {
        return diagnostics;
    }
    
    /**
     * Diagnostic information about the deployment lifecycle event.
     *
     * @param diagnostics Diagnostic information about the deployment lifecycle event.
     */
    public void setDiagnostics(Diagnostics diagnostics) {
        this.diagnostics = diagnostics;
    }
    
    /**
     * Diagnostic information about the deployment lifecycle event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diagnostics Diagnostic information about the deployment lifecycle event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleEvent withDiagnostics(Diagnostics diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }

    /**
     * A timestamp indicating when the deployment lifecycle event started.
     *
     * @return A timestamp indicating when the deployment lifecycle event started.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * A timestamp indicating when the deployment lifecycle event started.
     *
     * @param startTime A timestamp indicating when the deployment lifecycle event started.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * A timestamp indicating when the deployment lifecycle event started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime A timestamp indicating when the deployment lifecycle event started.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleEvent withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * A timestamp indicating when the deployment lifecycle event ended.
     *
     * @return A timestamp indicating when the deployment lifecycle event ended.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * A timestamp indicating when the deployment lifecycle event ended.
     *
     * @param endTime A timestamp indicating when the deployment lifecycle event ended.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * A timestamp indicating when the deployment lifecycle event ended.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime A timestamp indicating when the deployment lifecycle event ended.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleEvent withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The deployment lifecycle event status: <ul> <li>Pending: The
     * deployment lifecycle event is pending.</li> <li>InProgress: The
     * deployment lifecycle event is in progress.</li> <li>Succeeded: The
     * deployment lifecycle event has succeeded.</li> <li>Failed: The
     * deployment lifecycle event has failed.</li> <li>Skipped: The
     * deployment lifecycle event has been skipped.</li> <li>Unknown: The
     * deployment lifecycle event is unknown.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     *
     * @return The deployment lifecycle event status: <ul> <li>Pending: The
     *         deployment lifecycle event is pending.</li> <li>InProgress: The
     *         deployment lifecycle event is in progress.</li> <li>Succeeded: The
     *         deployment lifecycle event has succeeded.</li> <li>Failed: The
     *         deployment lifecycle event has failed.</li> <li>Skipped: The
     *         deployment lifecycle event has been skipped.</li> <li>Unknown: The
     *         deployment lifecycle event is unknown.</li> </ul>
     *
     * @see LifecycleEventStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The deployment lifecycle event status: <ul> <li>Pending: The
     * deployment lifecycle event is pending.</li> <li>InProgress: The
     * deployment lifecycle event is in progress.</li> <li>Succeeded: The
     * deployment lifecycle event has succeeded.</li> <li>Failed: The
     * deployment lifecycle event has failed.</li> <li>Skipped: The
     * deployment lifecycle event has been skipped.</li> <li>Unknown: The
     * deployment lifecycle event is unknown.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     *
     * @param status The deployment lifecycle event status: <ul> <li>Pending: The
     *         deployment lifecycle event is pending.</li> <li>InProgress: The
     *         deployment lifecycle event is in progress.</li> <li>Succeeded: The
     *         deployment lifecycle event has succeeded.</li> <li>Failed: The
     *         deployment lifecycle event has failed.</li> <li>Skipped: The
     *         deployment lifecycle event has been skipped.</li> <li>Unknown: The
     *         deployment lifecycle event is unknown.</li> </ul>
     *
     * @see LifecycleEventStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The deployment lifecycle event status: <ul> <li>Pending: The
     * deployment lifecycle event is pending.</li> <li>InProgress: The
     * deployment lifecycle event is in progress.</li> <li>Succeeded: The
     * deployment lifecycle event has succeeded.</li> <li>Failed: The
     * deployment lifecycle event has failed.</li> <li>Skipped: The
     * deployment lifecycle event has been skipped.</li> <li>Unknown: The
     * deployment lifecycle event is unknown.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     *
     * @param status The deployment lifecycle event status: <ul> <li>Pending: The
     *         deployment lifecycle event is pending.</li> <li>InProgress: The
     *         deployment lifecycle event is in progress.</li> <li>Succeeded: The
     *         deployment lifecycle event has succeeded.</li> <li>Failed: The
     *         deployment lifecycle event has failed.</li> <li>Skipped: The
     *         deployment lifecycle event has been skipped.</li> <li>Unknown: The
     *         deployment lifecycle event is unknown.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LifecycleEventStatus
     */
    public LifecycleEvent withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The deployment lifecycle event status: <ul> <li>Pending: The
     * deployment lifecycle event is pending.</li> <li>InProgress: The
     * deployment lifecycle event is in progress.</li> <li>Succeeded: The
     * deployment lifecycle event has succeeded.</li> <li>Failed: The
     * deployment lifecycle event has failed.</li> <li>Skipped: The
     * deployment lifecycle event has been skipped.</li> <li>Unknown: The
     * deployment lifecycle event is unknown.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     *
     * @param status The deployment lifecycle event status: <ul> <li>Pending: The
     *         deployment lifecycle event is pending.</li> <li>InProgress: The
     *         deployment lifecycle event is in progress.</li> <li>Succeeded: The
     *         deployment lifecycle event has succeeded.</li> <li>Failed: The
     *         deployment lifecycle event has failed.</li> <li>Skipped: The
     *         deployment lifecycle event has been skipped.</li> <li>Unknown: The
     *         deployment lifecycle event is unknown.</li> </ul>
     *
     * @see LifecycleEventStatus
     */
    public void setStatus(LifecycleEventStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The deployment lifecycle event status: <ul> <li>Pending: The
     * deployment lifecycle event is pending.</li> <li>InProgress: The
     * deployment lifecycle event is in progress.</li> <li>Succeeded: The
     * deployment lifecycle event has succeeded.</li> <li>Failed: The
     * deployment lifecycle event has failed.</li> <li>Skipped: The
     * deployment lifecycle event has been skipped.</li> <li>Unknown: The
     * deployment lifecycle event is unknown.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     *
     * @param status The deployment lifecycle event status: <ul> <li>Pending: The
     *         deployment lifecycle event is pending.</li> <li>InProgress: The
     *         deployment lifecycle event is in progress.</li> <li>Succeeded: The
     *         deployment lifecycle event has succeeded.</li> <li>Failed: The
     *         deployment lifecycle event has failed.</li> <li>Skipped: The
     *         deployment lifecycle event has been skipped.</li> <li>Unknown: The
     *         deployment lifecycle event is unknown.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LifecycleEventStatus
     */
    public LifecycleEvent withStatus(LifecycleEventStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLifecycleEventName() != null) sb.append("LifecycleEventName: " + getLifecycleEventName() + ",");
        if (getDiagnostics() != null) sb.append("Diagnostics: " + getDiagnostics() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LifecycleEvent == false) return false;
        LifecycleEvent other = (LifecycleEvent)obj;
        
        if (other.getLifecycleEventName() == null ^ this.getLifecycleEventName() == null) return false;
        if (other.getLifecycleEventName() != null && other.getLifecycleEventName().equals(this.getLifecycleEventName()) == false) return false; 
        if (other.getDiagnostics() == null ^ this.getDiagnostics() == null) return false;
        if (other.getDiagnostics() != null && other.getDiagnostics().equals(this.getDiagnostics()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    