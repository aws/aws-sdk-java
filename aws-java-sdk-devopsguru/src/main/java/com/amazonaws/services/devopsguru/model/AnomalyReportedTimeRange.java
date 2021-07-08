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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A time range that specifies when DevOps Guru opens and then closes an anomaly. This is different from
 * <code>AnomalyTimeRange</code>, which specifies the time range when DevOps Guru actually observes the anomalous
 * behavior.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AnomalyReportedTimeRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyReportedTimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when an anomaly is opened.
     * </p>
     */
    private java.util.Date openTime;
    /**
     * <p>
     * The time when an anomaly is closed.
     * </p>
     */
    private java.util.Date closeTime;

    /**
     * <p>
     * The time when an anomaly is opened.
     * </p>
     * 
     * @param openTime
     *        The time when an anomaly is opened.
     */

    public void setOpenTime(java.util.Date openTime) {
        this.openTime = openTime;
    }

    /**
     * <p>
     * The time when an anomaly is opened.
     * </p>
     * 
     * @return The time when an anomaly is opened.
     */

    public java.util.Date getOpenTime() {
        return this.openTime;
    }

    /**
     * <p>
     * The time when an anomaly is opened.
     * </p>
     * 
     * @param openTime
     *        The time when an anomaly is opened.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyReportedTimeRange withOpenTime(java.util.Date openTime) {
        setOpenTime(openTime);
        return this;
    }

    /**
     * <p>
     * The time when an anomaly is closed.
     * </p>
     * 
     * @param closeTime
     *        The time when an anomaly is closed.
     */

    public void setCloseTime(java.util.Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * <p>
     * The time when an anomaly is closed.
     * </p>
     * 
     * @return The time when an anomaly is closed.
     */

    public java.util.Date getCloseTime() {
        return this.closeTime;
    }

    /**
     * <p>
     * The time when an anomaly is closed.
     * </p>
     * 
     * @param closeTime
     *        The time when an anomaly is closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyReportedTimeRange withCloseTime(java.util.Date closeTime) {
        setCloseTime(closeTime);
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
        if (getOpenTime() != null)
            sb.append("OpenTime: ").append(getOpenTime()).append(",");
        if (getCloseTime() != null)
            sb.append("CloseTime: ").append(getCloseTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyReportedTimeRange == false)
            return false;
        AnomalyReportedTimeRange other = (AnomalyReportedTimeRange) obj;
        if (other.getOpenTime() == null ^ this.getOpenTime() == null)
            return false;
        if (other.getOpenTime() != null && other.getOpenTime().equals(this.getOpenTime()) == false)
            return false;
        if (other.getCloseTime() == null ^ this.getCloseTime() == null)
            return false;
        if (other.getCloseTime() != null && other.getCloseTime().equals(this.getCloseTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpenTime() == null) ? 0 : getOpenTime().hashCode());
        hashCode = prime * hashCode + ((getCloseTime() == null) ? 0 : getCloseTime().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyReportedTimeRange clone() {
        try {
            return (AnomalyReportedTimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.AnomalyReportedTimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
