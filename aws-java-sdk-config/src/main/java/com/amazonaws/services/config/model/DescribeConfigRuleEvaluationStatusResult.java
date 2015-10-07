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
 * 
 */
public class DescribeConfigRuleEvaluationStatusResult implements Serializable, Cloneable {

    /**
     * Status information about your AWS managed Config rules.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRuleEvaluationStatus> configRulesEvaluationStatus;

    /**
     * Status information about your AWS managed Config rules.
     *
     * @return Status information about your AWS managed Config rules.
     */
    public java.util.List<ConfigRuleEvaluationStatus> getConfigRulesEvaluationStatus() {
        if (configRulesEvaluationStatus == null) {
              configRulesEvaluationStatus = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRuleEvaluationStatus>();
              configRulesEvaluationStatus.setAutoConstruct(true);
        }
        return configRulesEvaluationStatus;
    }
    
    /**
     * Status information about your AWS managed Config rules.
     *
     * @param configRulesEvaluationStatus Status information about your AWS managed Config rules.
     */
    public void setConfigRulesEvaluationStatus(java.util.Collection<ConfigRuleEvaluationStatus> configRulesEvaluationStatus) {
        if (configRulesEvaluationStatus == null) {
            this.configRulesEvaluationStatus = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRuleEvaluationStatus> configRulesEvaluationStatusCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRuleEvaluationStatus>(configRulesEvaluationStatus.size());
        configRulesEvaluationStatusCopy.addAll(configRulesEvaluationStatus);
        this.configRulesEvaluationStatus = configRulesEvaluationStatusCopy;
    }
    
    /**
     * Status information about your AWS managed Config rules.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link
     * #setConfigRulesEvaluationStatus(java.util.Collection)} or {@link
     * #withConfigRulesEvaluationStatus(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configRulesEvaluationStatus Status information about your AWS managed Config rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigRuleEvaluationStatusResult withConfigRulesEvaluationStatus(ConfigRuleEvaluationStatus... configRulesEvaluationStatus) {
        if (getConfigRulesEvaluationStatus() == null) setConfigRulesEvaluationStatus(new java.util.ArrayList<ConfigRuleEvaluationStatus>(configRulesEvaluationStatus.length));
        for (ConfigRuleEvaluationStatus value : configRulesEvaluationStatus) {
            getConfigRulesEvaluationStatus().add(value);
        }
        return this;
    }
    
    /**
     * Status information about your AWS managed Config rules.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configRulesEvaluationStatus Status information about your AWS managed Config rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigRuleEvaluationStatusResult withConfigRulesEvaluationStatus(java.util.Collection<ConfigRuleEvaluationStatus> configRulesEvaluationStatus) {
        if (configRulesEvaluationStatus == null) {
            this.configRulesEvaluationStatus = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRuleEvaluationStatus> configRulesEvaluationStatusCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRuleEvaluationStatus>(configRulesEvaluationStatus.size());
            configRulesEvaluationStatusCopy.addAll(configRulesEvaluationStatus);
            this.configRulesEvaluationStatus = configRulesEvaluationStatusCopy;
        }

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
        if (getConfigRulesEvaluationStatus() != null) sb.append("ConfigRulesEvaluationStatus: " + getConfigRulesEvaluationStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigRulesEvaluationStatus() == null) ? 0 : getConfigRulesEvaluationStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeConfigRuleEvaluationStatusResult == false) return false;
        DescribeConfigRuleEvaluationStatusResult other = (DescribeConfigRuleEvaluationStatusResult)obj;
        
        if (other.getConfigRulesEvaluationStatus() == null ^ this.getConfigRulesEvaluationStatus() == null) return false;
        if (other.getConfigRulesEvaluationStatus() != null && other.getConfigRulesEvaluationStatus().equals(this.getConfigRulesEvaluationStatus()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeConfigRuleEvaluationStatusResult clone() {
        try {
            return (DescribeConfigRuleEvaluationStatusResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    