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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#describeConfigRules(DescribeConfigRulesRequest) DescribeConfigRules operation}.
 * <p>
 * Returns details about your AWS Config rules.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#describeConfigRules(DescribeConfigRulesRequest)
 */
public class DescribeConfigRulesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The names of the AWS Config rules for which you want details. If you
     * do not specify any names, AWS Config returns details for all your
     * rules.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> configRuleNames;

    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     */
    private String nextToken;

    /**
     * The names of the AWS Config rules for which you want details. If you
     * do not specify any names, AWS Config returns details for all your
     * rules.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @return The names of the AWS Config rules for which you want details. If you
     *         do not specify any names, AWS Config returns details for all your
     *         rules.
     */
    public java.util.List<String> getConfigRuleNames() {
        if (configRuleNames == null) {
              configRuleNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              configRuleNames.setAutoConstruct(true);
        }
        return configRuleNames;
    }
    
    /**
     * The names of the AWS Config rules for which you want details. If you
     * do not specify any names, AWS Config returns details for all your
     * rules.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @param configRuleNames The names of the AWS Config rules for which you want details. If you
     *         do not specify any names, AWS Config returns details for all your
     *         rules.
     */
    public void setConfigRuleNames(java.util.Collection<String> configRuleNames) {
        if (configRuleNames == null) {
            this.configRuleNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> configRuleNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(configRuleNames.size());
        configRuleNamesCopy.addAll(configRuleNames);
        this.configRuleNames = configRuleNamesCopy;
    }
    
    /**
     * The names of the AWS Config rules for which you want details. If you
     * do not specify any names, AWS Config returns details for all your
     * rules.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setConfigRuleNames(java.util.Collection)} or {@link
     * #withConfigRuleNames(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @param configRuleNames The names of the AWS Config rules for which you want details. If you
     *         do not specify any names, AWS Config returns details for all your
     *         rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigRulesRequest withConfigRuleNames(String... configRuleNames) {
        if (getConfigRuleNames() == null) setConfigRuleNames(new java.util.ArrayList<String>(configRuleNames.length));
        for (String value : configRuleNames) {
            getConfigRuleNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of the AWS Config rules for which you want details. If you
     * do not specify any names, AWS Config returns details for all your
     * rules.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @param configRuleNames The names of the AWS Config rules for which you want details. If you
     *         do not specify any names, AWS Config returns details for all your
     *         rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigRulesRequest withConfigRuleNames(java.util.Collection<String> configRuleNames) {
        if (configRuleNames == null) {
            this.configRuleNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> configRuleNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(configRuleNames.size());
            configRuleNamesCopy.addAll(configRuleNames);
            this.configRuleNames = configRuleNamesCopy;
        }

        return this;
    }

    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     *
     * @return The <code>nextToken</code> string returned on a previous page that you
     *         use to get the next page of results in a paginated response.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     *
     * @param nextToken The <code>nextToken</code> string returned on a previous page that you
     *         use to get the next page of results in a paginated response.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The <code>nextToken</code> string returned on a previous page that you
     *         use to get the next page of results in a paginated response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeConfigRulesRequest withNextToken(String nextToken) {
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
        if (getConfigRuleNames() != null) sb.append("ConfigRuleNames: " + getConfigRuleNames() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigRuleNames() == null) ? 0 : getConfigRuleNames().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeConfigRulesRequest == false) return false;
        DescribeConfigRulesRequest other = (DescribeConfigRulesRequest)obj;
        
        if (other.getConfigRuleNames() == null ^ this.getConfigRuleNames() == null) return false;
        if (other.getConfigRuleNames() != null && other.getConfigRuleNames().equals(this.getConfigRuleNames()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeConfigRulesRequest clone() {
        
            return (DescribeConfigRulesRequest) super.clone();
    }

}
    