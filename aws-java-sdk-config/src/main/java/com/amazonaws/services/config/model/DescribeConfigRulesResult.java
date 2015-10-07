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
public class DescribeConfigRulesResult implements Serializable, Cloneable {

    /**
     * The details about your AWS Config rules.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRule> configRules;

    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     */
    private String nextToken;

    /**
     * The details about your AWS Config rules.
     *
     * @return The details about your AWS Config rules.
     */
    public java.util.List<ConfigRule> getConfigRules() {
        if (configRules == null) {
              configRules = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRule>();
              configRules.setAutoConstruct(true);
        }
        return configRules;
    }
    
    /**
     * The details about your AWS Config rules.
     *
     * @param configRules The details about your AWS Config rules.
     */
    public void setConfigRules(java.util.Collection<ConfigRule> configRules) {
        if (configRules == null) {
            this.configRules = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRule> configRulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRule>(configRules.size());
        configRulesCopy.addAll(configRules);
        this.configRules = configRulesCopy;
    }
    
    /**
     * The details about your AWS Config rules.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setConfigRules(java.util.Collection)} or {@link
     * #withConfigRules(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configRules The details about your AWS Config rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigRulesResult withConfigRules(ConfigRule... configRules) {
        if (getConfigRules() == null) setConfigRules(new java.util.ArrayList<ConfigRule>(configRules.length));
        for (ConfigRule value : configRules) {
            getConfigRules().add(value);
        }
        return this;
    }
    
    /**
     * The details about your AWS Config rules.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configRules The details about your AWS Config rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigRulesResult withConfigRules(java.util.Collection<ConfigRule> configRules) {
        if (configRules == null) {
            this.configRules = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRule> configRulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigRule>(configRules.size());
            configRulesCopy.addAll(configRules);
            this.configRules = configRulesCopy;
        }

        return this;
    }

    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     *
     * @return The string that you use in a subsequent request to get the next page
     *         of results in a paginated response.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     *
     * @param nextToken The string that you use in a subsequent request to get the next page
     *         of results in a paginated response.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The string that you use in a subsequent request to get the next page
     *         of results in a paginated response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigRulesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getConfigRules() != null) sb.append("ConfigRules: " + getConfigRules() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigRules() == null) ? 0 : getConfigRules().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeConfigRulesResult == false) return false;
        DescribeConfigRulesResult other = (DescribeConfigRulesResult)obj;
        
        if (other.getConfigRules() == null ^ this.getConfigRules() == null) return false;
        if (other.getConfigRules() != null && other.getConfigRules().equals(this.getConfigRules()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeConfigRulesResult clone() {
        try {
            return (DescribeConfigRulesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    