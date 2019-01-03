/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status information for your AWS managed Config rules. The status includes information such as the last time the rule
 * ran, the last time it failed, and the related error for the last failure.
 * </p>
 * <p>
 * This action does not return status information about custom AWS Config rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigRuleEvaluationStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigRuleEvaluationStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     * </p>
     */
    private String configRuleArn;
    /**
     * <p>
     * The ID of the AWS Config rule.
     * </p>
     */
    private String configRuleId;
    /**
     * <p>
     * The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
     * </p>
     */
    private java.util.Date lastSuccessfulInvocationTime;
    /**
     * <p>
     * The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
     * </p>
     */
    private java.util.Date lastFailedInvocationTime;
    /**
     * <p>
     * The time that AWS Config last successfully evaluated your AWS resources against the rule.
     * </p>
     */
    private java.util.Date lastSuccessfulEvaluationTime;
    /**
     * <p>
     * The time that AWS Config last failed to evaluate your AWS resources against the rule.
     * </p>
     */
    private java.util.Date lastFailedEvaluationTime;
    /**
     * <p>
     * The time that you first activated the AWS Config rule.
     * </p>
     */
    private java.util.Date firstActivatedTime;
    /**
     * <p>
     * The error code that AWS Config returned when the rule last failed.
     * </p>
     */
    private String lastErrorCode;
    /**
     * <p>
     * The error message that AWS Config returned when the rule last failed.
     * </p>
     */
    private String lastErrorMessage;
    /**
     * <p>
     * Indicates whether AWS Config has evaluated your resources against the rule at least once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> - AWS Config has evaluated your AWS resources against the rule at least once.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> - AWS Config has not once finished evaluating your AWS resources against the rule.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean firstEvaluationStarted;

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     * 
     * @return The name of the AWS Config rule.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     * </p>
     * 
     * @param configRuleArn
     *        The Amazon Resource Name (ARN) of the AWS Config rule.
     */

    public void setConfigRuleArn(String configRuleArn) {
        this.configRuleArn = configRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Config rule.
     */

    public String getConfigRuleArn() {
        return this.configRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     * </p>
     * 
     * @param configRuleArn
     *        The Amazon Resource Name (ARN) of the AWS Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withConfigRuleArn(String configRuleArn) {
        setConfigRuleArn(configRuleArn);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Config rule.
     * </p>
     * 
     * @param configRuleId
     *        The ID of the AWS Config rule.
     */

    public void setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
    }

    /**
     * <p>
     * The ID of the AWS Config rule.
     * </p>
     * 
     * @return The ID of the AWS Config rule.
     */

    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * <p>
     * The ID of the AWS Config rule.
     * </p>
     * 
     * @param configRuleId
     *        The ID of the AWS Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withConfigRuleId(String configRuleId) {
        setConfigRuleId(configRuleId);
        return this;
    }

    /**
     * <p>
     * The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
     * </p>
     * 
     * @param lastSuccessfulInvocationTime
     *        The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
     */

    public void setLastSuccessfulInvocationTime(java.util.Date lastSuccessfulInvocationTime) {
        this.lastSuccessfulInvocationTime = lastSuccessfulInvocationTime;
    }

    /**
     * <p>
     * The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
     * </p>
     * 
     * @return The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
     */

    public java.util.Date getLastSuccessfulInvocationTime() {
        return this.lastSuccessfulInvocationTime;
    }

    /**
     * <p>
     * The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
     * </p>
     * 
     * @param lastSuccessfulInvocationTime
     *        The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastSuccessfulInvocationTime(java.util.Date lastSuccessfulInvocationTime) {
        setLastSuccessfulInvocationTime(lastSuccessfulInvocationTime);
        return this;
    }

    /**
     * <p>
     * The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
     * </p>
     * 
     * @param lastFailedInvocationTime
     *        The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
     */

    public void setLastFailedInvocationTime(java.util.Date lastFailedInvocationTime) {
        this.lastFailedInvocationTime = lastFailedInvocationTime;
    }

    /**
     * <p>
     * The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
     * </p>
     * 
     * @return The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
     */

    public java.util.Date getLastFailedInvocationTime() {
        return this.lastFailedInvocationTime;
    }

    /**
     * <p>
     * The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
     * </p>
     * 
     * @param lastFailedInvocationTime
     *        The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastFailedInvocationTime(java.util.Date lastFailedInvocationTime) {
        setLastFailedInvocationTime(lastFailedInvocationTime);
        return this;
    }

    /**
     * <p>
     * The time that AWS Config last successfully evaluated your AWS resources against the rule.
     * </p>
     * 
     * @param lastSuccessfulEvaluationTime
     *        The time that AWS Config last successfully evaluated your AWS resources against the rule.
     */

    public void setLastSuccessfulEvaluationTime(java.util.Date lastSuccessfulEvaluationTime) {
        this.lastSuccessfulEvaluationTime = lastSuccessfulEvaluationTime;
    }

    /**
     * <p>
     * The time that AWS Config last successfully evaluated your AWS resources against the rule.
     * </p>
     * 
     * @return The time that AWS Config last successfully evaluated your AWS resources against the rule.
     */

    public java.util.Date getLastSuccessfulEvaluationTime() {
        return this.lastSuccessfulEvaluationTime;
    }

    /**
     * <p>
     * The time that AWS Config last successfully evaluated your AWS resources against the rule.
     * </p>
     * 
     * @param lastSuccessfulEvaluationTime
     *        The time that AWS Config last successfully evaluated your AWS resources against the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastSuccessfulEvaluationTime(java.util.Date lastSuccessfulEvaluationTime) {
        setLastSuccessfulEvaluationTime(lastSuccessfulEvaluationTime);
        return this;
    }

    /**
     * <p>
     * The time that AWS Config last failed to evaluate your AWS resources against the rule.
     * </p>
     * 
     * @param lastFailedEvaluationTime
     *        The time that AWS Config last failed to evaluate your AWS resources against the rule.
     */

    public void setLastFailedEvaluationTime(java.util.Date lastFailedEvaluationTime) {
        this.lastFailedEvaluationTime = lastFailedEvaluationTime;
    }

    /**
     * <p>
     * The time that AWS Config last failed to evaluate your AWS resources against the rule.
     * </p>
     * 
     * @return The time that AWS Config last failed to evaluate your AWS resources against the rule.
     */

    public java.util.Date getLastFailedEvaluationTime() {
        return this.lastFailedEvaluationTime;
    }

    /**
     * <p>
     * The time that AWS Config last failed to evaluate your AWS resources against the rule.
     * </p>
     * 
     * @param lastFailedEvaluationTime
     *        The time that AWS Config last failed to evaluate your AWS resources against the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastFailedEvaluationTime(java.util.Date lastFailedEvaluationTime) {
        setLastFailedEvaluationTime(lastFailedEvaluationTime);
        return this;
    }

    /**
     * <p>
     * The time that you first activated the AWS Config rule.
     * </p>
     * 
     * @param firstActivatedTime
     *        The time that you first activated the AWS Config rule.
     */

    public void setFirstActivatedTime(java.util.Date firstActivatedTime) {
        this.firstActivatedTime = firstActivatedTime;
    }

    /**
     * <p>
     * The time that you first activated the AWS Config rule.
     * </p>
     * 
     * @return The time that you first activated the AWS Config rule.
     */

    public java.util.Date getFirstActivatedTime() {
        return this.firstActivatedTime;
    }

    /**
     * <p>
     * The time that you first activated the AWS Config rule.
     * </p>
     * 
     * @param firstActivatedTime
     *        The time that you first activated the AWS Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withFirstActivatedTime(java.util.Date firstActivatedTime) {
        setFirstActivatedTime(firstActivatedTime);
        return this;
    }

    /**
     * <p>
     * The error code that AWS Config returned when the rule last failed.
     * </p>
     * 
     * @param lastErrorCode
     *        The error code that AWS Config returned when the rule last failed.
     */

    public void setLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
    }

    /**
     * <p>
     * The error code that AWS Config returned when the rule last failed.
     * </p>
     * 
     * @return The error code that AWS Config returned when the rule last failed.
     */

    public String getLastErrorCode() {
        return this.lastErrorCode;
    }

    /**
     * <p>
     * The error code that AWS Config returned when the rule last failed.
     * </p>
     * 
     * @param lastErrorCode
     *        The error code that AWS Config returned when the rule last failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastErrorCode(String lastErrorCode) {
        setLastErrorCode(lastErrorCode);
        return this;
    }

    /**
     * <p>
     * The error message that AWS Config returned when the rule last failed.
     * </p>
     * 
     * @param lastErrorMessage
     *        The error message that AWS Config returned when the rule last failed.
     */

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    /**
     * <p>
     * The error message that AWS Config returned when the rule last failed.
     * </p>
     * 
     * @return The error message that AWS Config returned when the rule last failed.
     */

    public String getLastErrorMessage() {
        return this.lastErrorMessage;
    }

    /**
     * <p>
     * The error message that AWS Config returned when the rule last failed.
     * </p>
     * 
     * @param lastErrorMessage
     *        The error message that AWS Config returned when the rule last failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastErrorMessage(String lastErrorMessage) {
        setLastErrorMessage(lastErrorMessage);
        return this;
    }

    /**
     * <p>
     * Indicates whether AWS Config has evaluated your resources against the rule at least once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> - AWS Config has evaluated your AWS resources against the rule at least once.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> - AWS Config has not once finished evaluating your AWS resources against the rule.
     * </p>
     * </li>
     * </ul>
     * 
     * @param firstEvaluationStarted
     *        Indicates whether AWS Config has evaluated your resources against the rule at least once.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code> - AWS Config has evaluated your AWS resources against the rule at least once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code> - AWS Config has not once finished evaluating your AWS resources against the rule.
     *        </p>
     *        </li>
     */

    public void setFirstEvaluationStarted(Boolean firstEvaluationStarted) {
        this.firstEvaluationStarted = firstEvaluationStarted;
    }

    /**
     * <p>
     * Indicates whether AWS Config has evaluated your resources against the rule at least once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> - AWS Config has evaluated your AWS resources against the rule at least once.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> - AWS Config has not once finished evaluating your AWS resources against the rule.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether AWS Config has evaluated your resources against the rule at least once.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> - AWS Config has evaluated your AWS resources against the rule at least once.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> - AWS Config has not once finished evaluating your AWS resources against the rule.
     *         </p>
     *         </li>
     */

    public Boolean getFirstEvaluationStarted() {
        return this.firstEvaluationStarted;
    }

    /**
     * <p>
     * Indicates whether AWS Config has evaluated your resources against the rule at least once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> - AWS Config has evaluated your AWS resources against the rule at least once.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> - AWS Config has not once finished evaluating your AWS resources against the rule.
     * </p>
     * </li>
     * </ul>
     * 
     * @param firstEvaluationStarted
     *        Indicates whether AWS Config has evaluated your resources against the rule at least once.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code> - AWS Config has evaluated your AWS resources against the rule at least once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code> - AWS Config has not once finished evaluating your AWS resources against the rule.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withFirstEvaluationStarted(Boolean firstEvaluationStarted) {
        setFirstEvaluationStarted(firstEvaluationStarted);
        return this;
    }

    /**
     * <p>
     * Indicates whether AWS Config has evaluated your resources against the rule at least once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> - AWS Config has evaluated your AWS resources against the rule at least once.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> - AWS Config has not once finished evaluating your AWS resources against the rule.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether AWS Config has evaluated your resources against the rule at least once.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> - AWS Config has evaluated your AWS resources against the rule at least once.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> - AWS Config has not once finished evaluating your AWS resources against the rule.
     *         </p>
     *         </li>
     */

    public Boolean isFirstEvaluationStarted() {
        return this.firstEvaluationStarted;
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
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: ").append(getConfigRuleName()).append(",");
        if (getConfigRuleArn() != null)
            sb.append("ConfigRuleArn: ").append(getConfigRuleArn()).append(",");
        if (getConfigRuleId() != null)
            sb.append("ConfigRuleId: ").append(getConfigRuleId()).append(",");
        if (getLastSuccessfulInvocationTime() != null)
            sb.append("LastSuccessfulInvocationTime: ").append(getLastSuccessfulInvocationTime()).append(",");
        if (getLastFailedInvocationTime() != null)
            sb.append("LastFailedInvocationTime: ").append(getLastFailedInvocationTime()).append(",");
        if (getLastSuccessfulEvaluationTime() != null)
            sb.append("LastSuccessfulEvaluationTime: ").append(getLastSuccessfulEvaluationTime()).append(",");
        if (getLastFailedEvaluationTime() != null)
            sb.append("LastFailedEvaluationTime: ").append(getLastFailedEvaluationTime()).append(",");
        if (getFirstActivatedTime() != null)
            sb.append("FirstActivatedTime: ").append(getFirstActivatedTime()).append(",");
        if (getLastErrorCode() != null)
            sb.append("LastErrorCode: ").append(getLastErrorCode()).append(",");
        if (getLastErrorMessage() != null)
            sb.append("LastErrorMessage: ").append(getLastErrorMessage()).append(",");
        if (getFirstEvaluationStarted() != null)
            sb.append("FirstEvaluationStarted: ").append(getFirstEvaluationStarted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigRuleEvaluationStatus == false)
            return false;
        ConfigRuleEvaluationStatus other = (ConfigRuleEvaluationStatus) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getConfigRuleArn() == null ^ this.getConfigRuleArn() == null)
            return false;
        if (other.getConfigRuleArn() != null && other.getConfigRuleArn().equals(this.getConfigRuleArn()) == false)
            return false;
        if (other.getConfigRuleId() == null ^ this.getConfigRuleId() == null)
            return false;
        if (other.getConfigRuleId() != null && other.getConfigRuleId().equals(this.getConfigRuleId()) == false)
            return false;
        if (other.getLastSuccessfulInvocationTime() == null ^ this.getLastSuccessfulInvocationTime() == null)
            return false;
        if (other.getLastSuccessfulInvocationTime() != null && other.getLastSuccessfulInvocationTime().equals(this.getLastSuccessfulInvocationTime()) == false)
            return false;
        if (other.getLastFailedInvocationTime() == null ^ this.getLastFailedInvocationTime() == null)
            return false;
        if (other.getLastFailedInvocationTime() != null && other.getLastFailedInvocationTime().equals(this.getLastFailedInvocationTime()) == false)
            return false;
        if (other.getLastSuccessfulEvaluationTime() == null ^ this.getLastSuccessfulEvaluationTime() == null)
            return false;
        if (other.getLastSuccessfulEvaluationTime() != null && other.getLastSuccessfulEvaluationTime().equals(this.getLastSuccessfulEvaluationTime()) == false)
            return false;
        if (other.getLastFailedEvaluationTime() == null ^ this.getLastFailedEvaluationTime() == null)
            return false;
        if (other.getLastFailedEvaluationTime() != null && other.getLastFailedEvaluationTime().equals(this.getLastFailedEvaluationTime()) == false)
            return false;
        if (other.getFirstActivatedTime() == null ^ this.getFirstActivatedTime() == null)
            return false;
        if (other.getFirstActivatedTime() != null && other.getFirstActivatedTime().equals(this.getFirstActivatedTime()) == false)
            return false;
        if (other.getLastErrorCode() == null ^ this.getLastErrorCode() == null)
            return false;
        if (other.getLastErrorCode() != null && other.getLastErrorCode().equals(this.getLastErrorCode()) == false)
            return false;
        if (other.getLastErrorMessage() == null ^ this.getLastErrorMessage() == null)
            return false;
        if (other.getLastErrorMessage() != null && other.getLastErrorMessage().equals(this.getLastErrorMessage()) == false)
            return false;
        if (other.getFirstEvaluationStarted() == null ^ this.getFirstEvaluationStarted() == null)
            return false;
        if (other.getFirstEvaluationStarted() != null && other.getFirstEvaluationStarted().equals(this.getFirstEvaluationStarted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getConfigRuleArn() == null) ? 0 : getConfigRuleArn().hashCode());
        hashCode = prime * hashCode + ((getConfigRuleId() == null) ? 0 : getConfigRuleId().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulInvocationTime() == null) ? 0 : getLastSuccessfulInvocationTime().hashCode());
        hashCode = prime * hashCode + ((getLastFailedInvocationTime() == null) ? 0 : getLastFailedInvocationTime().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulEvaluationTime() == null) ? 0 : getLastSuccessfulEvaluationTime().hashCode());
        hashCode = prime * hashCode + ((getLastFailedEvaluationTime() == null) ? 0 : getLastFailedEvaluationTime().hashCode());
        hashCode = prime * hashCode + ((getFirstActivatedTime() == null) ? 0 : getFirstActivatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastErrorCode() == null) ? 0 : getLastErrorCode().hashCode());
        hashCode = prime * hashCode + ((getLastErrorMessage() == null) ? 0 : getLastErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getFirstEvaluationStarted() == null) ? 0 : getFirstEvaluationStarted().hashCode());
        return hashCode;
    }

    @Override
    public ConfigRuleEvaluationStatus clone() {
        try {
            return (ConfigRuleEvaluationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigRuleEvaluationStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
