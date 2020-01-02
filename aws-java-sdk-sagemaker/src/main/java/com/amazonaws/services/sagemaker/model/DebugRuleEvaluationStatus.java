/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about the status of the rule evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DebugRuleEvaluationStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DebugRuleEvaluationStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule configuration
     * </p>
     */
    private String ruleConfigurationName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule evaluation job.
     * </p>
     */
    private String ruleEvaluationJobArn;
    /**
     * <p>
     * Status of the rule evaluation.
     * </p>
     */
    private String ruleEvaluationStatus;
    /**
     * <p>
     * Details from the rule evaluation.
     * </p>
     */
    private String statusDetails;
    /**
     * <p>
     * Timestamp when the rule evaluation status was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the rule configuration
     * </p>
     * 
     * @param ruleConfigurationName
     *        The name of the rule configuration
     */

    public void setRuleConfigurationName(String ruleConfigurationName) {
        this.ruleConfigurationName = ruleConfigurationName;
    }

    /**
     * <p>
     * The name of the rule configuration
     * </p>
     * 
     * @return The name of the rule configuration
     */

    public String getRuleConfigurationName() {
        return this.ruleConfigurationName;
    }

    /**
     * <p>
     * The name of the rule configuration
     * </p>
     * 
     * @param ruleConfigurationName
     *        The name of the rule configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleEvaluationStatus withRuleConfigurationName(String ruleConfigurationName) {
        setRuleConfigurationName(ruleConfigurationName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule evaluation job.
     * </p>
     * 
     * @param ruleEvaluationJobArn
     *        The Amazon Resource Name (ARN) of the rule evaluation job.
     */

    public void setRuleEvaluationJobArn(String ruleEvaluationJobArn) {
        this.ruleEvaluationJobArn = ruleEvaluationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule evaluation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule evaluation job.
     */

    public String getRuleEvaluationJobArn() {
        return this.ruleEvaluationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule evaluation job.
     * </p>
     * 
     * @param ruleEvaluationJobArn
     *        The Amazon Resource Name (ARN) of the rule evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleEvaluationStatus withRuleEvaluationJobArn(String ruleEvaluationJobArn) {
        setRuleEvaluationJobArn(ruleEvaluationJobArn);
        return this;
    }

    /**
     * <p>
     * Status of the rule evaluation.
     * </p>
     * 
     * @param ruleEvaluationStatus
     *        Status of the rule evaluation.
     * @see RuleEvaluationStatus
     */

    public void setRuleEvaluationStatus(String ruleEvaluationStatus) {
        this.ruleEvaluationStatus = ruleEvaluationStatus;
    }

    /**
     * <p>
     * Status of the rule evaluation.
     * </p>
     * 
     * @return Status of the rule evaluation.
     * @see RuleEvaluationStatus
     */

    public String getRuleEvaluationStatus() {
        return this.ruleEvaluationStatus;
    }

    /**
     * <p>
     * Status of the rule evaluation.
     * </p>
     * 
     * @param ruleEvaluationStatus
     *        Status of the rule evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleEvaluationStatus
     */

    public DebugRuleEvaluationStatus withRuleEvaluationStatus(String ruleEvaluationStatus) {
        setRuleEvaluationStatus(ruleEvaluationStatus);
        return this;
    }

    /**
     * <p>
     * Status of the rule evaluation.
     * </p>
     * 
     * @param ruleEvaluationStatus
     *        Status of the rule evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleEvaluationStatus
     */

    public DebugRuleEvaluationStatus withRuleEvaluationStatus(RuleEvaluationStatus ruleEvaluationStatus) {
        this.ruleEvaluationStatus = ruleEvaluationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Details from the rule evaluation.
     * </p>
     * 
     * @param statusDetails
     *        Details from the rule evaluation.
     */

    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * Details from the rule evaluation.
     * </p>
     * 
     * @return Details from the rule evaluation.
     */

    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * Details from the rule evaluation.
     * </p>
     * 
     * @param statusDetails
     *        Details from the rule evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleEvaluationStatus withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * Timestamp when the rule evaluation status was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        Timestamp when the rule evaluation status was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Timestamp when the rule evaluation status was last modified.
     * </p>
     * 
     * @return Timestamp when the rule evaluation status was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Timestamp when the rule evaluation status was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        Timestamp when the rule evaluation status was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleEvaluationStatus withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getRuleConfigurationName() != null)
            sb.append("RuleConfigurationName: ").append(getRuleConfigurationName()).append(",");
        if (getRuleEvaluationJobArn() != null)
            sb.append("RuleEvaluationJobArn: ").append(getRuleEvaluationJobArn()).append(",");
        if (getRuleEvaluationStatus() != null)
            sb.append("RuleEvaluationStatus: ").append(getRuleEvaluationStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DebugRuleEvaluationStatus == false)
            return false;
        DebugRuleEvaluationStatus other = (DebugRuleEvaluationStatus) obj;
        if (other.getRuleConfigurationName() == null ^ this.getRuleConfigurationName() == null)
            return false;
        if (other.getRuleConfigurationName() != null && other.getRuleConfigurationName().equals(this.getRuleConfigurationName()) == false)
            return false;
        if (other.getRuleEvaluationJobArn() == null ^ this.getRuleEvaluationJobArn() == null)
            return false;
        if (other.getRuleEvaluationJobArn() != null && other.getRuleEvaluationJobArn().equals(this.getRuleEvaluationJobArn()) == false)
            return false;
        if (other.getRuleEvaluationStatus() == null ^ this.getRuleEvaluationStatus() == null)
            return false;
        if (other.getRuleEvaluationStatus() != null && other.getRuleEvaluationStatus().equals(this.getRuleEvaluationStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleConfigurationName() == null) ? 0 : getRuleConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getRuleEvaluationJobArn() == null) ? 0 : getRuleEvaluationJobArn().hashCode());
        hashCode = prime * hashCode + ((getRuleEvaluationStatus() == null) ? 0 : getRuleEvaluationStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public DebugRuleEvaluationStatus clone() {
        try {
            return (DebugRuleEvaluationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DebugRuleEvaluationStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
