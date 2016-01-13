/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * A complex type that contains information about the health check status for
 * the current observation.
 * </p>
 */
public class StatusReport implements Serializable, Cloneable {

    /**
     * <p>
     * The observed health check status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time the health check status was observed, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601 standard
     * (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after the time
     * indicates that the time is listed in Coordinated Universal Time (UTC).
     * </p>
     */
    private java.util.Date checkedTime;

    /**
     * <p>
     * The observed health check status.
     * </p>
     * 
     * @param status
     *        The observed health check status.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The observed health check status.
     * </p>
     * 
     * @return The observed health check status.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The observed health check status.
     * </p>
     * 
     * @param status
     *        The observed health check status.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public StatusReport withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time the health check status was observed, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601 standard
     * (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after the time
     * indicates that the time is listed in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param checkedTime
     *        The date and time the health check status was observed, in the
     *        format <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO
     *        8601 standard (for example, 2009-11-19T19:37:58Z). The
     *        <code>Z</code> after the time indicates that the time is listed in
     *        Coordinated Universal Time (UTC).
     */
    public void setCheckedTime(java.util.Date checkedTime) {
        this.checkedTime = checkedTime;
    }

    /**
     * <p>
     * The date and time the health check status was observed, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601 standard
     * (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after the time
     * indicates that the time is listed in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time the health check status was observed, in the
     *         format <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO
     *         8601 standard (for example, 2009-11-19T19:37:58Z). The
     *         <code>Z</code> after the time indicates that the time is listed
     *         in Coordinated Universal Time (UTC).
     */
    public java.util.Date getCheckedTime() {
        return this.checkedTime;
    }

    /**
     * <p>
     * The date and time the health check status was observed, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601 standard
     * (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after the time
     * indicates that the time is listed in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param checkedTime
     *        The date and time the health check status was observed, in the
     *        format <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO
     *        8601 standard (for example, 2009-11-19T19:37:58Z). The
     *        <code>Z</code> after the time indicates that the time is listed in
     *        Coordinated Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public StatusReport withCheckedTime(java.util.Date checkedTime) {
        setCheckedTime(checkedTime);
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCheckedTime() != null)
            sb.append("CheckedTime: " + getCheckedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatusReport == false)
            return false;
        StatusReport other = (StatusReport) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCheckedTime() == null ^ this.getCheckedTime() == null)
            return false;
        if (other.getCheckedTime() != null
                && other.getCheckedTime().equals(this.getCheckedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getCheckedTime() == null) ? 0 : getCheckedTime().hashCode());
        return hashCode;
    }

    @Override
    public StatusReport clone() {
        try {
            return (StatusReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}