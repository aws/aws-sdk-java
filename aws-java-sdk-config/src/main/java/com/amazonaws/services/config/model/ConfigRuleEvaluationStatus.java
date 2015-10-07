/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * Status information for your AWS managed Config rules. The status
 * includes information such as the last time the rule ran, the last time
 * it failed, and the related error for the last failure.
 * </p>
 * <p>
 * This action does not return status information about customer managed
 * Config rules.
 * </p>
 */
public class ConfigRuleEvaluationStatus implements Serializable, Cloneable {

    /**
     * The name of the AWS Config rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String configRuleName;

    /**
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     */
    private String configRuleArn;

    /**
     * The ID of the AWS Config rule.
     */
    private String configRuleId;

    /**
     * The time that AWS Config last successfully invoked the AWS Config rule
     * to evaluate your AWS resources.
     */
    private java.util.Date lastSuccessfulInvocationTime;

    /**
     * The time that AWS Config last failed to invoke the AWS Config rule to
     * evaluate your AWS resources.
     */
    private java.util.Date lastFailedInvocationTime;

    /**
     * The time that you first activated the AWS Config rule.
     */
    private java.util.Date firstActivatedTime;

    /**
     * The error code that AWS Config returned when the rule last failed.
     */
    private String lastErrorCode;

    /**
     * The error message that AWS Config returned when the rule last failed.
     */
    private String lastErrorMessage;

    /**
     * The name of the AWS Config rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The name of the AWS Config rule.
     */
    public String getConfigRuleName() {
        return configRuleName;
    }
    
    /**
     * The name of the AWS Config rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configRuleName The name of the AWS Config rule.
     */
    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }
    
    /**
     * The name of the AWS Config rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configRuleName The name of the AWS Config rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRuleEvaluationStatus withConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     *
     * @return The Amazon Resource Name (ARN) of the AWS Config rule.
     */
    public String getConfigRuleArn() {
        return configRuleArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     *
     * @param configRuleArn The Amazon Resource Name (ARN) of the AWS Config rule.
     */
    public void setConfigRuleArn(String configRuleArn) {
        this.configRuleArn = configRuleArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the AWS Config rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configRuleArn The Amazon Resource Name (ARN) of the AWS Config rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRuleEvaluationStatus withConfigRuleArn(String configRuleArn) {
        this.configRuleArn = configRuleArn;
        return this;
    }

    /**
     * The ID of the AWS Config rule.
     *
     * @return The ID of the AWS Config rule.
     */
    public String getConfigRuleId() {
        return configRuleId;
    }
    
    /**
     * The ID of the AWS Config rule.
     *
     * @param configRuleId The ID of the AWS Config rule.
     */
    public void setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
    }
    
    /**
     * The ID of the AWS Config rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configRuleId The ID of the AWS Config rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRuleEvaluationStatus withConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }

    /**
     * The time that AWS Config last successfully invoked the AWS Config rule
     * to evaluate your AWS resources.
     *
     * @return The time that AWS Config last successfully invoked the AWS Config rule
     *         to evaluate your AWS resources.
     */
    public java.util.Date getLastSuccessfulInvocationTime() {
        return lastSuccessfulInvocationTime;
    }
    
    /**
     * The time that AWS Config last successfully invoked the AWS Config rule
     * to evaluate your AWS resources.
     *
     * @param lastSuccessfulInvocationTime The time that AWS Config last successfully invoked the AWS Config rule
     *         to evaluate your AWS resources.
     */
    public void setLastSuccessfulInvocationTime(java.util.Date lastSuccessfulInvocationTime) {
        this.lastSuccessfulInvocationTime = lastSuccessfulInvocationTime;
    }
    
    /**
     * The time that AWS Config last successfully invoked the AWS Config rule
     * to evaluate your AWS resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastSuccessfulInvocationTime The time that AWS Config last successfully invoked the AWS Config rule
     *         to evaluate your AWS resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRuleEvaluationStatus withLastSuccessfulInvocationTime(java.util.Date lastSuccessfulInvocationTime) {
        this.lastSuccessfulInvocationTime = lastSuccessfulInvocationTime;
        return this;
    }

    /**
     * The time that AWS Config last failed to invoke the AWS Config rule to
     * evaluate your AWS resources.
     *
     * @return The time that AWS Config last failed to invoke the AWS Config rule to
     *         evaluate your AWS resources.
     */
    public java.util.Date getLastFailedInvocationTime() {
        return lastFailedInvocationTime;
    }
    
    /**
     * The time that AWS Config last failed to invoke the AWS Config rule to
     * evaluate your AWS resources.
     *
     * @param lastFailedInvocationTime The time that AWS Config last failed to invoke the AWS Config rule to
     *         evaluate your AWS resources.
     */
    public void setLastFailedInvocationTime(java.util.Date lastFailedInvocationTime) {
        this.lastFailedInvocationTime = lastFailedInvocationTime;
    }
    
    /**
     * The time that AWS Config last failed to invoke the AWS Config rule to
     * evaluate your AWS resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastFailedInvocationTime The time that AWS Config last failed to invoke the AWS Config rule to
     *         evaluate your AWS resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRuleEvaluationStatus withLastFailedInvocationTime(java.util.Date lastFailedInvocationTime) {
        this.lastFailedInvocationTime = lastFailedInvocationTime;
        return this;
    }

    /**
     * The time that you first activated the AWS Config rule.
     *
     * @return The time that you first activated the AWS Config rule.
     */
    public java.util.Date getFirstActivatedTime() {
        return firstActivatedTime;
    }
    
    /**
     * The time that you first activated the AWS Config rule.
     *
     * @param firstActivatedTime The time that you first activated the AWS Config rule.
     */
    public void setFirstActivatedTime(java.util.Date firstActivatedTime) {
        this.firstActivatedTime = firstActivatedTime;
    }
    
    /**
     * The time that you first activated the AWS Config rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param firstActivatedTime The time that you first activated the AWS Config rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRuleEvaluationStatus withFirstActivatedTime(java.util.Date firstActivatedTime) {
        this.firstActivatedTime = firstActivatedTime;
        return this;
    }

    /**
     * The error code that AWS Config returned when the rule last failed.
     *
     * @return The error code that AWS Config returned when the rule last failed.
     */
    public String getLastErrorCode() {
        return lastErrorCode;
    }
    
    /**
     * The error code that AWS Config returned when the rule last failed.
     *
     * @param lastErrorCode The error code that AWS Config returned when the rule last failed.
     */
    public void setLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
    }
    
    /**
     * The error code that AWS Config returned when the rule last failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastErrorCode The error code that AWS Config returned when the rule last failed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRuleEvaluationStatus withLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
        return this;
    }

    /**
     * The error message that AWS Config returned when the rule last failed.
     *
     * @return The error message that AWS Config returned when the rule last failed.
     */
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
    
    /**
     * The error message that AWS Config returned when the rule last failed.
     *
     * @param lastErrorMessage The error message that AWS Config returned when the rule last failed.
     */
    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }
    
    /**
     * The error message that AWS Config returned when the rule last failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastErrorMessage The error message that AWS Config returned when the rule last failed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigRuleEvaluationStatus withLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
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
        if (getConfigRuleName() != null) sb.append("ConfigRuleName: " + getConfigRuleName() + ",");
        if (getConfigRuleArn() != null) sb.append("ConfigRuleArn: " + getConfigRuleArn() + ",");
        if (getConfigRuleId() != null) sb.append("ConfigRuleId: " + getConfigRuleId() + ",");
        if (getLastSuccessfulInvocationTime() != null) sb.append("LastSuccessfulInvocationTime: " + getLastSuccessfulInvocationTime() + ",");
        if (getLastFailedInvocationTime() != null) sb.append("LastFailedInvocationTime: " + getLastFailedInvocationTime() + ",");
        if (getFirstActivatedTime() != null) sb.append("FirstActivatedTime: " + getFirstActivatedTime() + ",");
        if (getLastErrorCode() != null) sb.append("LastErrorCode: " + getLastErrorCode() + ",");
        if (getLastErrorMessage() != null) sb.append("LastErrorMessage: " + getLastErrorMessage() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getFirstActivatedTime() == null) ? 0 : getFirstActivatedTime().hashCode()); 
        hashCode = prime * hashCode + ((getLastErrorCode() == null) ? 0 : getLastErrorCode().hashCode()); 
        hashCode = prime * hashCode + ((getLastErrorMessage() == null) ? 0 : getLastErrorMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfigRuleEvaluationStatus == false) return false;
        ConfigRuleEvaluationStatus other = (ConfigRuleEvaluationStatus)obj;
        
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null) return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false) return false; 
        if (other.getConfigRuleArn() == null ^ this.getConfigRuleArn() == null) return false;
        if (other.getConfigRuleArn() != null && other.getConfigRuleArn().equals(this.getConfigRuleArn()) == false) return false; 
        if (other.getConfigRuleId() == null ^ this.getConfigRuleId() == null) return false;
        if (other.getConfigRuleId() != null && other.getConfigRuleId().equals(this.getConfigRuleId()) == false) return false; 
        if (other.getLastSuccessfulInvocationTime() == null ^ this.getLastSuccessfulInvocationTime() == null) return false;
        if (other.getLastSuccessfulInvocationTime() != null && other.getLastSuccessfulInvocationTime().equals(this.getLastSuccessfulInvocationTime()) == false) return false; 
        if (other.getLastFailedInvocationTime() == null ^ this.getLastFailedInvocationTime() == null) return false;
        if (other.getLastFailedInvocationTime() != null && other.getLastFailedInvocationTime().equals(this.getLastFailedInvocationTime()) == false) return false; 
        if (other.getFirstActivatedTime() == null ^ this.getFirstActivatedTime() == null) return false;
        if (other.getFirstActivatedTime() != null && other.getFirstActivatedTime().equals(this.getFirstActivatedTime()) == false) return false; 
        if (other.getLastErrorCode() == null ^ this.getLastErrorCode() == null) return false;
        if (other.getLastErrorCode() != null && other.getLastErrorCode().equals(this.getLastErrorCode()) == false) return false; 
        if (other.getLastErrorMessage() == null ^ this.getLastErrorMessage() == null) return false;
        if (other.getLastErrorMessage() != null && other.getLastErrorMessage().equals(this.getLastErrorMessage()) == false) return false; 
        return true;
    }
    
    @Override
    public ConfigRuleEvaluationStatus clone() {
        try {
            return (ConfigRuleEvaluationStatus) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    