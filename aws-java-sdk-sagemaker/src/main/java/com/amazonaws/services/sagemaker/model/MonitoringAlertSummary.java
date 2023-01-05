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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information about a monitor alert.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringAlertSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringAlertSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a monitoring alert.
     * </p>
     */
    private String monitoringAlertName;
    /**
     * <p>
     * A timestamp that indicates when a monitor alert was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that indicates when a monitor alert was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The current status of an alert.
     * </p>
     */
    private String alertStatus;
    /**
     * <p>
     * Within <code>EvaluationPeriod</code>, how many execution failures will raise an alert.
     * </p>
     */
    private Integer datapointsToAlert;
    /**
     * <p>
     * The number of most recent monitoring executions to consider when evaluating alert status.
     * </p>
     */
    private Integer evaluationPeriod;
    /**
     * <p>
     * A list of alert actions taken in response to an alert going into <code>InAlert</code> status.
     * </p>
     */
    private MonitoringAlertActions actions;

    /**
     * <p>
     * The name of a monitoring alert.
     * </p>
     * 
     * @param monitoringAlertName
     *        The name of a monitoring alert.
     */

    public void setMonitoringAlertName(String monitoringAlertName) {
        this.monitoringAlertName = monitoringAlertName;
    }

    /**
     * <p>
     * The name of a monitoring alert.
     * </p>
     * 
     * @return The name of a monitoring alert.
     */

    public String getMonitoringAlertName() {
        return this.monitoringAlertName;
    }

    /**
     * <p>
     * The name of a monitoring alert.
     * </p>
     * 
     * @param monitoringAlertName
     *        The name of a monitoring alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAlertSummary withMonitoringAlertName(String monitoringAlertName) {
        setMonitoringAlertName(monitoringAlertName);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when a monitor alert was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when a monitor alert was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when a monitor alert was created.
     * </p>
     * 
     * @return A timestamp that indicates when a monitor alert was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when a monitor alert was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when a monitor alert was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAlertSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when a monitor alert was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates when a monitor alert was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when a monitor alert was last updated.
     * </p>
     * 
     * @return A timestamp that indicates when a monitor alert was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when a monitor alert was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates when a monitor alert was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAlertSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The current status of an alert.
     * </p>
     * 
     * @param alertStatus
     *        The current status of an alert.
     * @see MonitoringAlertStatus
     */

    public void setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
    }

    /**
     * <p>
     * The current status of an alert.
     * </p>
     * 
     * @return The current status of an alert.
     * @see MonitoringAlertStatus
     */

    public String getAlertStatus() {
        return this.alertStatus;
    }

    /**
     * <p>
     * The current status of an alert.
     * </p>
     * 
     * @param alertStatus
     *        The current status of an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringAlertStatus
     */

    public MonitoringAlertSummary withAlertStatus(String alertStatus) {
        setAlertStatus(alertStatus);
        return this;
    }

    /**
     * <p>
     * The current status of an alert.
     * </p>
     * 
     * @param alertStatus
     *        The current status of an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringAlertStatus
     */

    public MonitoringAlertSummary withAlertStatus(MonitoringAlertStatus alertStatus) {
        this.alertStatus = alertStatus.toString();
        return this;
    }

    /**
     * <p>
     * Within <code>EvaluationPeriod</code>, how many execution failures will raise an alert.
     * </p>
     * 
     * @param datapointsToAlert
     *        Within <code>EvaluationPeriod</code>, how many execution failures will raise an alert.
     */

    public void setDatapointsToAlert(Integer datapointsToAlert) {
        this.datapointsToAlert = datapointsToAlert;
    }

    /**
     * <p>
     * Within <code>EvaluationPeriod</code>, how many execution failures will raise an alert.
     * </p>
     * 
     * @return Within <code>EvaluationPeriod</code>, how many execution failures will raise an alert.
     */

    public Integer getDatapointsToAlert() {
        return this.datapointsToAlert;
    }

    /**
     * <p>
     * Within <code>EvaluationPeriod</code>, how many execution failures will raise an alert.
     * </p>
     * 
     * @param datapointsToAlert
     *        Within <code>EvaluationPeriod</code>, how many execution failures will raise an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAlertSummary withDatapointsToAlert(Integer datapointsToAlert) {
        setDatapointsToAlert(datapointsToAlert);
        return this;
    }

    /**
     * <p>
     * The number of most recent monitoring executions to consider when evaluating alert status.
     * </p>
     * 
     * @param evaluationPeriod
     *        The number of most recent monitoring executions to consider when evaluating alert status.
     */

    public void setEvaluationPeriod(Integer evaluationPeriod) {
        this.evaluationPeriod = evaluationPeriod;
    }

    /**
     * <p>
     * The number of most recent monitoring executions to consider when evaluating alert status.
     * </p>
     * 
     * @return The number of most recent monitoring executions to consider when evaluating alert status.
     */

    public Integer getEvaluationPeriod() {
        return this.evaluationPeriod;
    }

    /**
     * <p>
     * The number of most recent monitoring executions to consider when evaluating alert status.
     * </p>
     * 
     * @param evaluationPeriod
     *        The number of most recent monitoring executions to consider when evaluating alert status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAlertSummary withEvaluationPeriod(Integer evaluationPeriod) {
        setEvaluationPeriod(evaluationPeriod);
        return this;
    }

    /**
     * <p>
     * A list of alert actions taken in response to an alert going into <code>InAlert</code> status.
     * </p>
     * 
     * @param actions
     *        A list of alert actions taken in response to an alert going into <code>InAlert</code> status.
     */

    public void setActions(MonitoringAlertActions actions) {
        this.actions = actions;
    }

    /**
     * <p>
     * A list of alert actions taken in response to an alert going into <code>InAlert</code> status.
     * </p>
     * 
     * @return A list of alert actions taken in response to an alert going into <code>InAlert</code> status.
     */

    public MonitoringAlertActions getActions() {
        return this.actions;
    }

    /**
     * <p>
     * A list of alert actions taken in response to an alert going into <code>InAlert</code> status.
     * </p>
     * 
     * @param actions
     *        A list of alert actions taken in response to an alert going into <code>InAlert</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAlertSummary withActions(MonitoringAlertActions actions) {
        setActions(actions);
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
        if (getMonitoringAlertName() != null)
            sb.append("MonitoringAlertName: ").append(getMonitoringAlertName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getAlertStatus() != null)
            sb.append("AlertStatus: ").append(getAlertStatus()).append(",");
        if (getDatapointsToAlert() != null)
            sb.append("DatapointsToAlert: ").append(getDatapointsToAlert()).append(",");
        if (getEvaluationPeriod() != null)
            sb.append("EvaluationPeriod: ").append(getEvaluationPeriod()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringAlertSummary == false)
            return false;
        MonitoringAlertSummary other = (MonitoringAlertSummary) obj;
        if (other.getMonitoringAlertName() == null ^ this.getMonitoringAlertName() == null)
            return false;
        if (other.getMonitoringAlertName() != null && other.getMonitoringAlertName().equals(this.getMonitoringAlertName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getAlertStatus() == null ^ this.getAlertStatus() == null)
            return false;
        if (other.getAlertStatus() != null && other.getAlertStatus().equals(this.getAlertStatus()) == false)
            return false;
        if (other.getDatapointsToAlert() == null ^ this.getDatapointsToAlert() == null)
            return false;
        if (other.getDatapointsToAlert() != null && other.getDatapointsToAlert().equals(this.getDatapointsToAlert()) == false)
            return false;
        if (other.getEvaluationPeriod() == null ^ this.getEvaluationPeriod() == null)
            return false;
        if (other.getEvaluationPeriod() != null && other.getEvaluationPeriod().equals(this.getEvaluationPeriod()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringAlertName() == null) ? 0 : getMonitoringAlertName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getAlertStatus() == null) ? 0 : getAlertStatus().hashCode());
        hashCode = prime * hashCode + ((getDatapointsToAlert() == null) ? 0 : getDatapointsToAlert().hashCode());
        hashCode = prime * hashCode + ((getEvaluationPeriod() == null) ? 0 : getEvaluationPeriod().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringAlertSummary clone() {
        try {
            return (MonitoringAlertSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringAlertSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
