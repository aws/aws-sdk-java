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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of an ML Detect behavior model.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BehaviorModelTrainingSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the security profile.
     * </p>
     */
    private String securityProfileName;
    /**
     * <p>
     * The name of the behavior.
     * </p>
     */
    private String behaviorName;
    /**
     * <p>
     * The date a training model started collecting data.
     * </p>
     */
    private java.util.Date trainingDataCollectionStartDate;
    /**
     * <p>
     * The status of the behavior model.
     * </p>
     */
    private String modelStatus;
    /**
     * <p>
     * The percentage of datapoints collected.
     * </p>
     */
    private Double datapointsCollectionPercentage;
    /**
     * <p>
     * The date the model was last refreshed.
     * </p>
     */
    private java.util.Date lastModelRefreshDate;

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @return The name of the security profile.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BehaviorModelTrainingSummary withSecurityProfileName(String securityProfileName) {
        setSecurityProfileName(securityProfileName);
        return this;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * 
     * @param behaviorName
     *        The name of the behavior.
     */

    public void setBehaviorName(String behaviorName) {
        this.behaviorName = behaviorName;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * 
     * @return The name of the behavior.
     */

    public String getBehaviorName() {
        return this.behaviorName;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * 
     * @param behaviorName
     *        The name of the behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BehaviorModelTrainingSummary withBehaviorName(String behaviorName) {
        setBehaviorName(behaviorName);
        return this;
    }

    /**
     * <p>
     * The date a training model started collecting data.
     * </p>
     * 
     * @param trainingDataCollectionStartDate
     *        The date a training model started collecting data.
     */

    public void setTrainingDataCollectionStartDate(java.util.Date trainingDataCollectionStartDate) {
        this.trainingDataCollectionStartDate = trainingDataCollectionStartDate;
    }

    /**
     * <p>
     * The date a training model started collecting data.
     * </p>
     * 
     * @return The date a training model started collecting data.
     */

    public java.util.Date getTrainingDataCollectionStartDate() {
        return this.trainingDataCollectionStartDate;
    }

    /**
     * <p>
     * The date a training model started collecting data.
     * </p>
     * 
     * @param trainingDataCollectionStartDate
     *        The date a training model started collecting data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BehaviorModelTrainingSummary withTrainingDataCollectionStartDate(java.util.Date trainingDataCollectionStartDate) {
        setTrainingDataCollectionStartDate(trainingDataCollectionStartDate);
        return this;
    }

    /**
     * <p>
     * The status of the behavior model.
     * </p>
     * 
     * @param modelStatus
     *        The status of the behavior model.
     * @see ModelStatus
     */

    public void setModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
    }

    /**
     * <p>
     * The status of the behavior model.
     * </p>
     * 
     * @return The status of the behavior model.
     * @see ModelStatus
     */

    public String getModelStatus() {
        return this.modelStatus;
    }

    /**
     * <p>
     * The status of the behavior model.
     * </p>
     * 
     * @param modelStatus
     *        The status of the behavior model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public BehaviorModelTrainingSummary withModelStatus(String modelStatus) {
        setModelStatus(modelStatus);
        return this;
    }

    /**
     * <p>
     * The status of the behavior model.
     * </p>
     * 
     * @param modelStatus
     *        The status of the behavior model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public BehaviorModelTrainingSummary withModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
        return this;
    }

    /**
     * <p>
     * The percentage of datapoints collected.
     * </p>
     * 
     * @param datapointsCollectionPercentage
     *        The percentage of datapoints collected.
     */

    public void setDatapointsCollectionPercentage(Double datapointsCollectionPercentage) {
        this.datapointsCollectionPercentage = datapointsCollectionPercentage;
    }

    /**
     * <p>
     * The percentage of datapoints collected.
     * </p>
     * 
     * @return The percentage of datapoints collected.
     */

    public Double getDatapointsCollectionPercentage() {
        return this.datapointsCollectionPercentage;
    }

    /**
     * <p>
     * The percentage of datapoints collected.
     * </p>
     * 
     * @param datapointsCollectionPercentage
     *        The percentage of datapoints collected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BehaviorModelTrainingSummary withDatapointsCollectionPercentage(Double datapointsCollectionPercentage) {
        setDatapointsCollectionPercentage(datapointsCollectionPercentage);
        return this;
    }

    /**
     * <p>
     * The date the model was last refreshed.
     * </p>
     * 
     * @param lastModelRefreshDate
     *        The date the model was last refreshed.
     */

    public void setLastModelRefreshDate(java.util.Date lastModelRefreshDate) {
        this.lastModelRefreshDate = lastModelRefreshDate;
    }

    /**
     * <p>
     * The date the model was last refreshed.
     * </p>
     * 
     * @return The date the model was last refreshed.
     */

    public java.util.Date getLastModelRefreshDate() {
        return this.lastModelRefreshDate;
    }

    /**
     * <p>
     * The date the model was last refreshed.
     * </p>
     * 
     * @param lastModelRefreshDate
     *        The date the model was last refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BehaviorModelTrainingSummary withLastModelRefreshDate(java.util.Date lastModelRefreshDate) {
        setLastModelRefreshDate(lastModelRefreshDate);
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
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: ").append(getSecurityProfileName()).append(",");
        if (getBehaviorName() != null)
            sb.append("BehaviorName: ").append(getBehaviorName()).append(",");
        if (getTrainingDataCollectionStartDate() != null)
            sb.append("TrainingDataCollectionStartDate: ").append(getTrainingDataCollectionStartDate()).append(",");
        if (getModelStatus() != null)
            sb.append("ModelStatus: ").append(getModelStatus()).append(",");
        if (getDatapointsCollectionPercentage() != null)
            sb.append("DatapointsCollectionPercentage: ").append(getDatapointsCollectionPercentage()).append(",");
        if (getLastModelRefreshDate() != null)
            sb.append("LastModelRefreshDate: ").append(getLastModelRefreshDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BehaviorModelTrainingSummary == false)
            return false;
        BehaviorModelTrainingSummary other = (BehaviorModelTrainingSummary) obj;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getBehaviorName() == null ^ this.getBehaviorName() == null)
            return false;
        if (other.getBehaviorName() != null && other.getBehaviorName().equals(this.getBehaviorName()) == false)
            return false;
        if (other.getTrainingDataCollectionStartDate() == null ^ this.getTrainingDataCollectionStartDate() == null)
            return false;
        if (other.getTrainingDataCollectionStartDate() != null
                && other.getTrainingDataCollectionStartDate().equals(this.getTrainingDataCollectionStartDate()) == false)
            return false;
        if (other.getModelStatus() == null ^ this.getModelStatus() == null)
            return false;
        if (other.getModelStatus() != null && other.getModelStatus().equals(this.getModelStatus()) == false)
            return false;
        if (other.getDatapointsCollectionPercentage() == null ^ this.getDatapointsCollectionPercentage() == null)
            return false;
        if (other.getDatapointsCollectionPercentage() != null
                && other.getDatapointsCollectionPercentage().equals(this.getDatapointsCollectionPercentage()) == false)
            return false;
        if (other.getLastModelRefreshDate() == null ^ this.getLastModelRefreshDate() == null)
            return false;
        if (other.getLastModelRefreshDate() != null && other.getLastModelRefreshDate().equals(this.getLastModelRefreshDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode + ((getBehaviorName() == null) ? 0 : getBehaviorName().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataCollectionStartDate() == null) ? 0 : getTrainingDataCollectionStartDate().hashCode());
        hashCode = prime * hashCode + ((getModelStatus() == null) ? 0 : getModelStatus().hashCode());
        hashCode = prime * hashCode + ((getDatapointsCollectionPercentage() == null) ? 0 : getDatapointsCollectionPercentage().hashCode());
        hashCode = prime * hashCode + ((getLastModelRefreshDate() == null) ? 0 : getLastModelRefreshDate().hashCode());
        return hashCode;
    }

    @Override
    public BehaviorModelTrainingSummary clone() {
        try {
            return (BehaviorModelTrainingSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.BehaviorModelTrainingSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
