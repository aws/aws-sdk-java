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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The CIS date filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisDateFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisDateFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CIS date filter's earliest scan start time.
     * </p>
     */
    private java.util.Date earliestScanStartTime;
    /**
     * <p>
     * The CIS date filter's latest scan start time.
     * </p>
     */
    private java.util.Date latestScanStartTime;

    /**
     * <p>
     * The CIS date filter's earliest scan start time.
     * </p>
     * 
     * @param earliestScanStartTime
     *        The CIS date filter's earliest scan start time.
     */

    public void setEarliestScanStartTime(java.util.Date earliestScanStartTime) {
        this.earliestScanStartTime = earliestScanStartTime;
    }

    /**
     * <p>
     * The CIS date filter's earliest scan start time.
     * </p>
     * 
     * @return The CIS date filter's earliest scan start time.
     */

    public java.util.Date getEarliestScanStartTime() {
        return this.earliestScanStartTime;
    }

    /**
     * <p>
     * The CIS date filter's earliest scan start time.
     * </p>
     * 
     * @param earliestScanStartTime
     *        The CIS date filter's earliest scan start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisDateFilter withEarliestScanStartTime(java.util.Date earliestScanStartTime) {
        setEarliestScanStartTime(earliestScanStartTime);
        return this;
    }

    /**
     * <p>
     * The CIS date filter's latest scan start time.
     * </p>
     * 
     * @param latestScanStartTime
     *        The CIS date filter's latest scan start time.
     */

    public void setLatestScanStartTime(java.util.Date latestScanStartTime) {
        this.latestScanStartTime = latestScanStartTime;
    }

    /**
     * <p>
     * The CIS date filter's latest scan start time.
     * </p>
     * 
     * @return The CIS date filter's latest scan start time.
     */

    public java.util.Date getLatestScanStartTime() {
        return this.latestScanStartTime;
    }

    /**
     * <p>
     * The CIS date filter's latest scan start time.
     * </p>
     * 
     * @param latestScanStartTime
     *        The CIS date filter's latest scan start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisDateFilter withLatestScanStartTime(java.util.Date latestScanStartTime) {
        setLatestScanStartTime(latestScanStartTime);
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
        if (getEarliestScanStartTime() != null)
            sb.append("EarliestScanStartTime: ").append(getEarliestScanStartTime()).append(",");
        if (getLatestScanStartTime() != null)
            sb.append("LatestScanStartTime: ").append(getLatestScanStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CisDateFilter == false)
            return false;
        CisDateFilter other = (CisDateFilter) obj;
        if (other.getEarliestScanStartTime() == null ^ this.getEarliestScanStartTime() == null)
            return false;
        if (other.getEarliestScanStartTime() != null && other.getEarliestScanStartTime().equals(this.getEarliestScanStartTime()) == false)
            return false;
        if (other.getLatestScanStartTime() == null ^ this.getLatestScanStartTime() == null)
            return false;
        if (other.getLatestScanStartTime() != null && other.getLatestScanStartTime().equals(this.getLatestScanStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEarliestScanStartTime() == null) ? 0 : getEarliestScanStartTime().hashCode());
        hashCode = prime * hashCode + ((getLatestScanStartTime() == null) ? 0 : getLatestScanStartTime().hashCode());
        return hashCode;
    }

    @Override
    public CisDateFilter clone() {
        try {
            return (CisDateFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisDateFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
