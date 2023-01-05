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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateMonitoringAlert" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMonitoringAlertRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     */
    private String monitoringScheduleName;
    /**
     * <p>
     * The name of a monitoring alert.
     * </p>
     */
    private String monitoringAlertName;
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
     * The name of a monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of a monitoring schedule.
     */

    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     * 
     * @return The name of a monitoring schedule.
     */

    public String getMonitoringScheduleName() {
        return this.monitoringScheduleName;
    }

    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of a monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitoringAlertRequest withMonitoringScheduleName(String monitoringScheduleName) {
        setMonitoringScheduleName(monitoringScheduleName);
        return this;
    }

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

    public UpdateMonitoringAlertRequest withMonitoringAlertName(String monitoringAlertName) {
        setMonitoringAlertName(monitoringAlertName);
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

    public UpdateMonitoringAlertRequest withDatapointsToAlert(Integer datapointsToAlert) {
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

    public UpdateMonitoringAlertRequest withEvaluationPeriod(Integer evaluationPeriod) {
        setEvaluationPeriod(evaluationPeriod);
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
        if (getMonitoringScheduleName() != null)
            sb.append("MonitoringScheduleName: ").append(getMonitoringScheduleName()).append(",");
        if (getMonitoringAlertName() != null)
            sb.append("MonitoringAlertName: ").append(getMonitoringAlertName()).append(",");
        if (getDatapointsToAlert() != null)
            sb.append("DatapointsToAlert: ").append(getDatapointsToAlert()).append(",");
        if (getEvaluationPeriod() != null)
            sb.append("EvaluationPeriod: ").append(getEvaluationPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMonitoringAlertRequest == false)
            return false;
        UpdateMonitoringAlertRequest other = (UpdateMonitoringAlertRequest) obj;
        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getMonitoringAlertName() == null ^ this.getMonitoringAlertName() == null)
            return false;
        if (other.getMonitoringAlertName() != null && other.getMonitoringAlertName().equals(this.getMonitoringAlertName()) == false)
            return false;
        if (other.getDatapointsToAlert() == null ^ this.getDatapointsToAlert() == null)
            return false;
        if (other.getDatapointsToAlert() != null && other.getDatapointsToAlert().equals(this.getDatapointsToAlert()) == false)
            return false;
        if (other.getEvaluationPeriod() == null ^ this.getEvaluationPeriod() == null)
            return false;
        if (other.getEvaluationPeriod() != null && other.getEvaluationPeriod().equals(this.getEvaluationPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName().hashCode());
        hashCode = prime * hashCode + ((getMonitoringAlertName() == null) ? 0 : getMonitoringAlertName().hashCode());
        hashCode = prime * hashCode + ((getDatapointsToAlert() == null) ? 0 : getDatapointsToAlert().hashCode());
        hashCode = prime * hashCode + ((getEvaluationPeriod() == null) ? 0 : getEvaluationPeriod().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMonitoringAlertRequest clone() {
        return (UpdateMonitoringAlertRequest) super.clone();
    }

}
