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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the compliance against the resiliency policy for a disruption.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DisruptionCompliance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisruptionCompliance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Recovery Point Objective (RPO) that is achievable, in seconds.
     * </p>
     */
    private Integer achievableRpoInSecs;
    /**
     * <p>
     * The Recovery Time Objective (RTO) that is achievable, in seconds
     * </p>
     */
    private Integer achievableRtoInSecs;
    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     */
    private String complianceStatus;
    /**
     * <p>
     * The current RPO, in seconds.
     * </p>
     */
    private Integer currentRpoInSecs;
    /**
     * <p>
     * The current RTO, in seconds.
     * </p>
     */
    private Integer currentRtoInSecs;
    /**
     * <p>
     * The disruption compliance message.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The RPO description.
     * </p>
     */
    private String rpoDescription;
    /**
     * <p>
     * The RPO reference identifier.
     * </p>
     */
    private String rpoReferenceId;
    /**
     * <p>
     * The RTO description.
     * </p>
     */
    private String rtoDescription;
    /**
     * <p>
     * The RTO reference identifier.
     * </p>
     */
    private String rtoReferenceId;

    /**
     * <p>
     * The Recovery Point Objective (RPO) that is achievable, in seconds.
     * </p>
     * 
     * @param achievableRpoInSecs
     *        The Recovery Point Objective (RPO) that is achievable, in seconds.
     */

    public void setAchievableRpoInSecs(Integer achievableRpoInSecs) {
        this.achievableRpoInSecs = achievableRpoInSecs;
    }

    /**
     * <p>
     * The Recovery Point Objective (RPO) that is achievable, in seconds.
     * </p>
     * 
     * @return The Recovery Point Objective (RPO) that is achievable, in seconds.
     */

    public Integer getAchievableRpoInSecs() {
        return this.achievableRpoInSecs;
    }

    /**
     * <p>
     * The Recovery Point Objective (RPO) that is achievable, in seconds.
     * </p>
     * 
     * @param achievableRpoInSecs
     *        The Recovery Point Objective (RPO) that is achievable, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisruptionCompliance withAchievableRpoInSecs(Integer achievableRpoInSecs) {
        setAchievableRpoInSecs(achievableRpoInSecs);
        return this;
    }

    /**
     * <p>
     * The Recovery Time Objective (RTO) that is achievable, in seconds
     * </p>
     * 
     * @param achievableRtoInSecs
     *        The Recovery Time Objective (RTO) that is achievable, in seconds
     */

    public void setAchievableRtoInSecs(Integer achievableRtoInSecs) {
        this.achievableRtoInSecs = achievableRtoInSecs;
    }

    /**
     * <p>
     * The Recovery Time Objective (RTO) that is achievable, in seconds
     * </p>
     * 
     * @return The Recovery Time Objective (RTO) that is achievable, in seconds
     */

    public Integer getAchievableRtoInSecs() {
        return this.achievableRtoInSecs;
    }

    /**
     * <p>
     * The Recovery Time Objective (RTO) that is achievable, in seconds
     * </p>
     * 
     * @param achievableRtoInSecs
     *        The Recovery Time Objective (RTO) that is achievable, in seconds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisruptionCompliance withAchievableRtoInSecs(Integer achievableRtoInSecs) {
        setAchievableRtoInSecs(achievableRtoInSecs);
        return this;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of compliance for the resiliency policy.
     * @see ComplianceStatus
     */

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @return The current status of compliance for the resiliency policy.
     * @see ComplianceStatus
     */

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public DisruptionCompliance withComplianceStatus(String complianceStatus) {
        setComplianceStatus(complianceStatus);
        return this;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public DisruptionCompliance withComplianceStatus(ComplianceStatus complianceStatus) {
        this.complianceStatus = complianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The current RPO, in seconds.
     * </p>
     * 
     * @param currentRpoInSecs
     *        The current RPO, in seconds.
     */

    public void setCurrentRpoInSecs(Integer currentRpoInSecs) {
        this.currentRpoInSecs = currentRpoInSecs;
    }

    /**
     * <p>
     * The current RPO, in seconds.
     * </p>
     * 
     * @return The current RPO, in seconds.
     */

    public Integer getCurrentRpoInSecs() {
        return this.currentRpoInSecs;
    }

    /**
     * <p>
     * The current RPO, in seconds.
     * </p>
     * 
     * @param currentRpoInSecs
     *        The current RPO, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisruptionCompliance withCurrentRpoInSecs(Integer currentRpoInSecs) {
        setCurrentRpoInSecs(currentRpoInSecs);
        return this;
    }

    /**
     * <p>
     * The current RTO, in seconds.
     * </p>
     * 
     * @param currentRtoInSecs
     *        The current RTO, in seconds.
     */

    public void setCurrentRtoInSecs(Integer currentRtoInSecs) {
        this.currentRtoInSecs = currentRtoInSecs;
    }

    /**
     * <p>
     * The current RTO, in seconds.
     * </p>
     * 
     * @return The current RTO, in seconds.
     */

    public Integer getCurrentRtoInSecs() {
        return this.currentRtoInSecs;
    }

    /**
     * <p>
     * The current RTO, in seconds.
     * </p>
     * 
     * @param currentRtoInSecs
     *        The current RTO, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisruptionCompliance withCurrentRtoInSecs(Integer currentRtoInSecs) {
        setCurrentRtoInSecs(currentRtoInSecs);
        return this;
    }

    /**
     * <p>
     * The disruption compliance message.
     * </p>
     * 
     * @param message
     *        The disruption compliance message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The disruption compliance message.
     * </p>
     * 
     * @return The disruption compliance message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The disruption compliance message.
     * </p>
     * 
     * @param message
     *        The disruption compliance message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisruptionCompliance withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The RPO description.
     * </p>
     * 
     * @param rpoDescription
     *        The RPO description.
     */

    public void setRpoDescription(String rpoDescription) {
        this.rpoDescription = rpoDescription;
    }

    /**
     * <p>
     * The RPO description.
     * </p>
     * 
     * @return The RPO description.
     */

    public String getRpoDescription() {
        return this.rpoDescription;
    }

    /**
     * <p>
     * The RPO description.
     * </p>
     * 
     * @param rpoDescription
     *        The RPO description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisruptionCompliance withRpoDescription(String rpoDescription) {
        setRpoDescription(rpoDescription);
        return this;
    }

    /**
     * <p>
     * The RPO reference identifier.
     * </p>
     * 
     * @param rpoReferenceId
     *        The RPO reference identifier.
     */

    public void setRpoReferenceId(String rpoReferenceId) {
        this.rpoReferenceId = rpoReferenceId;
    }

    /**
     * <p>
     * The RPO reference identifier.
     * </p>
     * 
     * @return The RPO reference identifier.
     */

    public String getRpoReferenceId() {
        return this.rpoReferenceId;
    }

    /**
     * <p>
     * The RPO reference identifier.
     * </p>
     * 
     * @param rpoReferenceId
     *        The RPO reference identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisruptionCompliance withRpoReferenceId(String rpoReferenceId) {
        setRpoReferenceId(rpoReferenceId);
        return this;
    }

    /**
     * <p>
     * The RTO description.
     * </p>
     * 
     * @param rtoDescription
     *        The RTO description.
     */

    public void setRtoDescription(String rtoDescription) {
        this.rtoDescription = rtoDescription;
    }

    /**
     * <p>
     * The RTO description.
     * </p>
     * 
     * @return The RTO description.
     */

    public String getRtoDescription() {
        return this.rtoDescription;
    }

    /**
     * <p>
     * The RTO description.
     * </p>
     * 
     * @param rtoDescription
     *        The RTO description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisruptionCompliance withRtoDescription(String rtoDescription) {
        setRtoDescription(rtoDescription);
        return this;
    }

    /**
     * <p>
     * The RTO reference identifier.
     * </p>
     * 
     * @param rtoReferenceId
     *        The RTO reference identifier.
     */

    public void setRtoReferenceId(String rtoReferenceId) {
        this.rtoReferenceId = rtoReferenceId;
    }

    /**
     * <p>
     * The RTO reference identifier.
     * </p>
     * 
     * @return The RTO reference identifier.
     */

    public String getRtoReferenceId() {
        return this.rtoReferenceId;
    }

    /**
     * <p>
     * The RTO reference identifier.
     * </p>
     * 
     * @param rtoReferenceId
     *        The RTO reference identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisruptionCompliance withRtoReferenceId(String rtoReferenceId) {
        setRtoReferenceId(rtoReferenceId);
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
        if (getAchievableRpoInSecs() != null)
            sb.append("AchievableRpoInSecs: ").append(getAchievableRpoInSecs()).append(",");
        if (getAchievableRtoInSecs() != null)
            sb.append("AchievableRtoInSecs: ").append(getAchievableRtoInSecs()).append(",");
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: ").append(getComplianceStatus()).append(",");
        if (getCurrentRpoInSecs() != null)
            sb.append("CurrentRpoInSecs: ").append(getCurrentRpoInSecs()).append(",");
        if (getCurrentRtoInSecs() != null)
            sb.append("CurrentRtoInSecs: ").append(getCurrentRtoInSecs()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getRpoDescription() != null)
            sb.append("RpoDescription: ").append(getRpoDescription()).append(",");
        if (getRpoReferenceId() != null)
            sb.append("RpoReferenceId: ").append(getRpoReferenceId()).append(",");
        if (getRtoDescription() != null)
            sb.append("RtoDescription: ").append(getRtoDescription()).append(",");
        if (getRtoReferenceId() != null)
            sb.append("RtoReferenceId: ").append(getRtoReferenceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisruptionCompliance == false)
            return false;
        DisruptionCompliance other = (DisruptionCompliance) obj;
        if (other.getAchievableRpoInSecs() == null ^ this.getAchievableRpoInSecs() == null)
            return false;
        if (other.getAchievableRpoInSecs() != null && other.getAchievableRpoInSecs().equals(this.getAchievableRpoInSecs()) == false)
            return false;
        if (other.getAchievableRtoInSecs() == null ^ this.getAchievableRtoInSecs() == null)
            return false;
        if (other.getAchievableRtoInSecs() != null && other.getAchievableRtoInSecs().equals(this.getAchievableRtoInSecs()) == false)
            return false;
        if (other.getComplianceStatus() == null ^ this.getComplianceStatus() == null)
            return false;
        if (other.getComplianceStatus() != null && other.getComplianceStatus().equals(this.getComplianceStatus()) == false)
            return false;
        if (other.getCurrentRpoInSecs() == null ^ this.getCurrentRpoInSecs() == null)
            return false;
        if (other.getCurrentRpoInSecs() != null && other.getCurrentRpoInSecs().equals(this.getCurrentRpoInSecs()) == false)
            return false;
        if (other.getCurrentRtoInSecs() == null ^ this.getCurrentRtoInSecs() == null)
            return false;
        if (other.getCurrentRtoInSecs() != null && other.getCurrentRtoInSecs().equals(this.getCurrentRtoInSecs()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getRpoDescription() == null ^ this.getRpoDescription() == null)
            return false;
        if (other.getRpoDescription() != null && other.getRpoDescription().equals(this.getRpoDescription()) == false)
            return false;
        if (other.getRpoReferenceId() == null ^ this.getRpoReferenceId() == null)
            return false;
        if (other.getRpoReferenceId() != null && other.getRpoReferenceId().equals(this.getRpoReferenceId()) == false)
            return false;
        if (other.getRtoDescription() == null ^ this.getRtoDescription() == null)
            return false;
        if (other.getRtoDescription() != null && other.getRtoDescription().equals(this.getRtoDescription()) == false)
            return false;
        if (other.getRtoReferenceId() == null ^ this.getRtoReferenceId() == null)
            return false;
        if (other.getRtoReferenceId() != null && other.getRtoReferenceId().equals(this.getRtoReferenceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAchievableRpoInSecs() == null) ? 0 : getAchievableRpoInSecs().hashCode());
        hashCode = prime * hashCode + ((getAchievableRtoInSecs() == null) ? 0 : getAchievableRtoInSecs().hashCode());
        hashCode = prime * hashCode + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        hashCode = prime * hashCode + ((getCurrentRpoInSecs() == null) ? 0 : getCurrentRpoInSecs().hashCode());
        hashCode = prime * hashCode + ((getCurrentRtoInSecs() == null) ? 0 : getCurrentRtoInSecs().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getRpoDescription() == null) ? 0 : getRpoDescription().hashCode());
        hashCode = prime * hashCode + ((getRpoReferenceId() == null) ? 0 : getRpoReferenceId().hashCode());
        hashCode = prime * hashCode + ((getRtoDescription() == null) ? 0 : getRtoDescription().hashCode());
        hashCode = prime * hashCode + ((getRtoReferenceId() == null) ? 0 : getRtoReferenceId().hashCode());
        return hashCode;
    }

    @Override
    public DisruptionCompliance clone() {
        try {
            return (DisruptionCompliance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.DisruptionComplianceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
