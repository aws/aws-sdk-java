/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An Amazon CloudWatch log group that contains log anomalies and is used to generate an insight.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AnomalousLogGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalousLogGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the CloudWatch log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The time the anomalous log events began. The impact start time indicates the time of the first log anomaly event
     * that occurs.
     * </p>
     */
    private java.util.Date impactStartTime;
    /**
     * <p>
     * The time the anomalous log events stopped.
     * </p>
     */
    private java.util.Date impactEndTime;
    /**
     * <p>
     * The number of log lines that were scanned for anomalous log events.
     * </p>
     */
    private Integer numberOfLogLinesScanned;
    /**
     * <p>
     * The log anomalies in the log group. Each log anomaly displayed represents a cluster of similar anomalous log
     * events.
     * </p>
     */
    private java.util.List<LogAnomalyShowcase> logAnomalyShowcases;

    /**
     * <p>
     * The name of the CloudWatch log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the CloudWatch log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch log group.
     * </p>
     * 
     * @return The name of the CloudWatch log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the CloudWatch log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalousLogGroup withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The time the anomalous log events began. The impact start time indicates the time of the first log anomaly event
     * that occurs.
     * </p>
     * 
     * @param impactStartTime
     *        The time the anomalous log events began. The impact start time indicates the time of the first log anomaly
     *        event that occurs.
     */

    public void setImpactStartTime(java.util.Date impactStartTime) {
        this.impactStartTime = impactStartTime;
    }

    /**
     * <p>
     * The time the anomalous log events began. The impact start time indicates the time of the first log anomaly event
     * that occurs.
     * </p>
     * 
     * @return The time the anomalous log events began. The impact start time indicates the time of the first log
     *         anomaly event that occurs.
     */

    public java.util.Date getImpactStartTime() {
        return this.impactStartTime;
    }

    /**
     * <p>
     * The time the anomalous log events began. The impact start time indicates the time of the first log anomaly event
     * that occurs.
     * </p>
     * 
     * @param impactStartTime
     *        The time the anomalous log events began. The impact start time indicates the time of the first log anomaly
     *        event that occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalousLogGroup withImpactStartTime(java.util.Date impactStartTime) {
        setImpactStartTime(impactStartTime);
        return this;
    }

    /**
     * <p>
     * The time the anomalous log events stopped.
     * </p>
     * 
     * @param impactEndTime
     *        The time the anomalous log events stopped.
     */

    public void setImpactEndTime(java.util.Date impactEndTime) {
        this.impactEndTime = impactEndTime;
    }

    /**
     * <p>
     * The time the anomalous log events stopped.
     * </p>
     * 
     * @return The time the anomalous log events stopped.
     */

    public java.util.Date getImpactEndTime() {
        return this.impactEndTime;
    }

    /**
     * <p>
     * The time the anomalous log events stopped.
     * </p>
     * 
     * @param impactEndTime
     *        The time the anomalous log events stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalousLogGroup withImpactEndTime(java.util.Date impactEndTime) {
        setImpactEndTime(impactEndTime);
        return this;
    }

    /**
     * <p>
     * The number of log lines that were scanned for anomalous log events.
     * </p>
     * 
     * @param numberOfLogLinesScanned
     *        The number of log lines that were scanned for anomalous log events.
     */

    public void setNumberOfLogLinesScanned(Integer numberOfLogLinesScanned) {
        this.numberOfLogLinesScanned = numberOfLogLinesScanned;
    }

    /**
     * <p>
     * The number of log lines that were scanned for anomalous log events.
     * </p>
     * 
     * @return The number of log lines that were scanned for anomalous log events.
     */

    public Integer getNumberOfLogLinesScanned() {
        return this.numberOfLogLinesScanned;
    }

    /**
     * <p>
     * The number of log lines that were scanned for anomalous log events.
     * </p>
     * 
     * @param numberOfLogLinesScanned
     *        The number of log lines that were scanned for anomalous log events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalousLogGroup withNumberOfLogLinesScanned(Integer numberOfLogLinesScanned) {
        setNumberOfLogLinesScanned(numberOfLogLinesScanned);
        return this;
    }

    /**
     * <p>
     * The log anomalies in the log group. Each log anomaly displayed represents a cluster of similar anomalous log
     * events.
     * </p>
     * 
     * @return The log anomalies in the log group. Each log anomaly displayed represents a cluster of similar anomalous
     *         log events.
     */

    public java.util.List<LogAnomalyShowcase> getLogAnomalyShowcases() {
        return logAnomalyShowcases;
    }

    /**
     * <p>
     * The log anomalies in the log group. Each log anomaly displayed represents a cluster of similar anomalous log
     * events.
     * </p>
     * 
     * @param logAnomalyShowcases
     *        The log anomalies in the log group. Each log anomaly displayed represents a cluster of similar anomalous
     *        log events.
     */

    public void setLogAnomalyShowcases(java.util.Collection<LogAnomalyShowcase> logAnomalyShowcases) {
        if (logAnomalyShowcases == null) {
            this.logAnomalyShowcases = null;
            return;
        }

        this.logAnomalyShowcases = new java.util.ArrayList<LogAnomalyShowcase>(logAnomalyShowcases);
    }

    /**
     * <p>
     * The log anomalies in the log group. Each log anomaly displayed represents a cluster of similar anomalous log
     * events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogAnomalyShowcases(java.util.Collection)} or {@link #withLogAnomalyShowcases(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param logAnomalyShowcases
     *        The log anomalies in the log group. Each log anomaly displayed represents a cluster of similar anomalous
     *        log events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalousLogGroup withLogAnomalyShowcases(LogAnomalyShowcase... logAnomalyShowcases) {
        if (this.logAnomalyShowcases == null) {
            setLogAnomalyShowcases(new java.util.ArrayList<LogAnomalyShowcase>(logAnomalyShowcases.length));
        }
        for (LogAnomalyShowcase ele : logAnomalyShowcases) {
            this.logAnomalyShowcases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The log anomalies in the log group. Each log anomaly displayed represents a cluster of similar anomalous log
     * events.
     * </p>
     * 
     * @param logAnomalyShowcases
     *        The log anomalies in the log group. Each log anomaly displayed represents a cluster of similar anomalous
     *        log events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalousLogGroup withLogAnomalyShowcases(java.util.Collection<LogAnomalyShowcase> logAnomalyShowcases) {
        setLogAnomalyShowcases(logAnomalyShowcases);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getImpactStartTime() != null)
            sb.append("ImpactStartTime: ").append(getImpactStartTime()).append(",");
        if (getImpactEndTime() != null)
            sb.append("ImpactEndTime: ").append(getImpactEndTime()).append(",");
        if (getNumberOfLogLinesScanned() != null)
            sb.append("NumberOfLogLinesScanned: ").append(getNumberOfLogLinesScanned()).append(",");
        if (getLogAnomalyShowcases() != null)
            sb.append("LogAnomalyShowcases: ").append(getLogAnomalyShowcases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalousLogGroup == false)
            return false;
        AnomalousLogGroup other = (AnomalousLogGroup) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getImpactStartTime() == null ^ this.getImpactStartTime() == null)
            return false;
        if (other.getImpactStartTime() != null && other.getImpactStartTime().equals(this.getImpactStartTime()) == false)
            return false;
        if (other.getImpactEndTime() == null ^ this.getImpactEndTime() == null)
            return false;
        if (other.getImpactEndTime() != null && other.getImpactEndTime().equals(this.getImpactEndTime()) == false)
            return false;
        if (other.getNumberOfLogLinesScanned() == null ^ this.getNumberOfLogLinesScanned() == null)
            return false;
        if (other.getNumberOfLogLinesScanned() != null && other.getNumberOfLogLinesScanned().equals(this.getNumberOfLogLinesScanned()) == false)
            return false;
        if (other.getLogAnomalyShowcases() == null ^ this.getLogAnomalyShowcases() == null)
            return false;
        if (other.getLogAnomalyShowcases() != null && other.getLogAnomalyShowcases().equals(this.getLogAnomalyShowcases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getImpactStartTime() == null) ? 0 : getImpactStartTime().hashCode());
        hashCode = prime * hashCode + ((getImpactEndTime() == null) ? 0 : getImpactEndTime().hashCode());
        hashCode = prime * hashCode + ((getNumberOfLogLinesScanned() == null) ? 0 : getNumberOfLogLinesScanned().hashCode());
        hashCode = prime * hashCode + ((getLogAnomalyShowcases() == null) ? 0 : getLogAnomalyShowcases().hashCode());
        return hashCode;
    }

    @Override
    public AnomalousLogGroup clone() {
        try {
            return (AnomalousLogGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.AnomalousLogGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
