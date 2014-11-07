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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about the health check status
 * for the current observation.
 * </p>
 */
public class StatusReport implements Serializable {

    /**
     * The observed health check status.
     */
    private String status;

    /**
     * The date and time the health check status was observed, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     * standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     * the time indicates that the time is listed in Coordinated Universal
     * Time (UTC), which is synonymous with Greenwich Mean Time in this
     * context.
     */
    private java.util.Date checkedTime;

    /**
     * The observed health check status.
     *
     * @return The observed health check status.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The observed health check status.
     *
     * @param status The observed health check status.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The observed health check status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The observed health check status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StatusReport withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The date and time the health check status was observed, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     * standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     * the time indicates that the time is listed in Coordinated Universal
     * Time (UTC), which is synonymous with Greenwich Mean Time in this
     * context.
     *
     * @return The date and time the health check status was observed, in the format
     *         <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     *         standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     *         the time indicates that the time is listed in Coordinated Universal
     *         Time (UTC), which is synonymous with Greenwich Mean Time in this
     *         context.
     */
    public java.util.Date getCheckedTime() {
        return checkedTime;
    }
    
    /**
     * The date and time the health check status was observed, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     * standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     * the time indicates that the time is listed in Coordinated Universal
     * Time (UTC), which is synonymous with Greenwich Mean Time in this
     * context.
     *
     * @param checkedTime The date and time the health check status was observed, in the format
     *         <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     *         standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     *         the time indicates that the time is listed in Coordinated Universal
     *         Time (UTC), which is synonymous with Greenwich Mean Time in this
     *         context.
     */
    public void setCheckedTime(java.util.Date checkedTime) {
        this.checkedTime = checkedTime;
    }
    
    /**
     * The date and time the health check status was observed, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     * standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     * the time indicates that the time is listed in Coordinated Universal
     * Time (UTC), which is synonymous with Greenwich Mean Time in this
     * context.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checkedTime The date and time the health check status was observed, in the format
     *         <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     *         standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     *         the time indicates that the time is listed in Coordinated Universal
     *         Time (UTC), which is synonymous with Greenwich Mean Time in this
     *         context.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StatusReport withCheckedTime(java.util.Date checkedTime) {
        this.checkedTime = checkedTime;
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getCheckedTime() != null) sb.append("CheckedTime: " + getCheckedTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getCheckedTime() == null) ? 0 : getCheckedTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StatusReport == false) return false;
        StatusReport other = (StatusReport)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getCheckedTime() == null ^ this.getCheckedTime() == null) return false;
        if (other.getCheckedTime() != null && other.getCheckedTime().equals(this.getCheckedTime()) == false) return false; 
        return true;
    }
    
}
    