/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * Represents an event that affects the status of an Amazon EC2 instance.
 * </p>
 */
public class InstanceStatusEvent implements Serializable {

    /**
     * The associated code of the event. Valid values: instance-reboot,
     * system-reboot, instance-retirement
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot, system-maintenance, instance-retirement, instance-stop
     */
    private String code;

    /**
     * A description of the event.
     */
    private String description;

    /**
     * The earliest scheduled start time for the event.
     */
    private java.util.Date notBefore;

    /**
     * The latest scheduled end time for the event.
     */
    private java.util.Date notAfter;

    /**
     * The associated code of the event. Valid values: instance-reboot,
     * system-reboot, instance-retirement
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot, system-maintenance, instance-retirement, instance-stop
     *
     * @return The associated code of the event. Valid values: instance-reboot,
     *         system-reboot, instance-retirement
     *
     * @see EventCode
     */
    public String getCode() {
        return code;
    }
    
    /**
     * The associated code of the event. Valid values: instance-reboot,
     * system-reboot, instance-retirement
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot, system-maintenance, instance-retirement, instance-stop
     *
     * @param code The associated code of the event. Valid values: instance-reboot,
     *         system-reboot, instance-retirement
     *
     * @see EventCode
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * The associated code of the event. Valid values: instance-reboot,
     * system-reboot, instance-retirement
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot, system-maintenance, instance-retirement, instance-stop
     *
     * @param code The associated code of the event. Valid values: instance-reboot,
     *         system-reboot, instance-retirement
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see EventCode
     */
    public InstanceStatusEvent withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * The associated code of the event. Valid values: instance-reboot,
     * system-reboot, instance-retirement
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot, system-maintenance, instance-retirement, instance-stop
     *
     * @param code The associated code of the event. Valid values: instance-reboot,
     *         system-reboot, instance-retirement
     *
     * @see EventCode
     */
    public void setCode(EventCode code) {
        this.code = code.toString();
    }
    
    /**
     * The associated code of the event. Valid values: instance-reboot,
     * system-reboot, instance-retirement
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot, system-maintenance, instance-retirement, instance-stop
     *
     * @param code The associated code of the event. Valid values: instance-reboot,
     *         system-reboot, instance-retirement
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see EventCode
     */
    public InstanceStatusEvent withCode(EventCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * A description of the event.
     *
     * @return A description of the event.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the event.
     *
     * @param description A description of the event.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description of the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatusEvent withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The earliest scheduled start time for the event.
     *
     * @return The earliest scheduled start time for the event.
     */
    public java.util.Date getNotBefore() {
        return notBefore;
    }
    
    /**
     * The earliest scheduled start time for the event.
     *
     * @param notBefore The earliest scheduled start time for the event.
     */
    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }
    
    /**
     * The earliest scheduled start time for the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notBefore The earliest scheduled start time for the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatusEvent withNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * The latest scheduled end time for the event.
     *
     * @return The latest scheduled end time for the event.
     */
    public java.util.Date getNotAfter() {
        return notAfter;
    }
    
    /**
     * The latest scheduled end time for the event.
     *
     * @param notAfter The latest scheduled end time for the event.
     */
    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }
    
    /**
     * The latest scheduled end time for the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notAfter The latest scheduled end time for the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatusEvent withNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
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
        if (getCode() != null) sb.append("Code: " + getCode() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getNotBefore() != null) sb.append("NotBefore: " + getNotBefore() + ",");
        if (getNotAfter() != null) sb.append("NotAfter: " + getNotAfter() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode()); 
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceStatusEvent == false) return false;
        InstanceStatusEvent other = (InstanceStatusEvent)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getNotBefore() == null ^ this.getNotBefore() == null) return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false) return false; 
        if (other.getNotAfter() == null ^ this.getNotAfter() == null) return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false) return false; 
        return true;
    }
    
}
    