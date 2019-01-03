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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMatchmakingConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a matchmaking configuration(s) to retrieve. To request all existing configurations, leave
     * this parameter empty.
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * Unique identifier for a matchmaking rule set. Use this parameter to retrieve all matchmaking configurations that
     * use this rule set.
     * </p>
     */
    private String ruleSetName;
    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages. This parameter is limited to 10.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Unique identifier for a matchmaking configuration(s) to retrieve. To request all existing configurations, leave
     * this parameter empty.
     * </p>
     * 
     * @return Unique identifier for a matchmaking configuration(s) to retrieve. To request all existing configurations,
     *         leave this parameter empty.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking configuration(s) to retrieve. To request all existing configurations, leave
     * this parameter empty.
     * </p>
     * 
     * @param names
     *        Unique identifier for a matchmaking configuration(s) to retrieve. To request all existing configurations,
     *        leave this parameter empty.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * Unique identifier for a matchmaking configuration(s) to retrieve. To request all existing configurations, leave
     * this parameter empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        Unique identifier for a matchmaking configuration(s) to retrieve. To request all existing configurations,
     *        leave this parameter empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMatchmakingConfigurationsRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking configuration(s) to retrieve. To request all existing configurations, leave
     * this parameter empty.
     * </p>
     * 
     * @param names
     *        Unique identifier for a matchmaking configuration(s) to retrieve. To request all existing configurations,
     *        leave this parameter empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMatchmakingConfigurationsRequest withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking rule set. Use this parameter to retrieve all matchmaking configurations that
     * use this rule set.
     * </p>
     * 
     * @param ruleSetName
     *        Unique identifier for a matchmaking rule set. Use this parameter to retrieve all matchmaking
     *        configurations that use this rule set.
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking rule set. Use this parameter to retrieve all matchmaking configurations that
     * use this rule set.
     * </p>
     * 
     * @return Unique identifier for a matchmaking rule set. Use this parameter to retrieve all matchmaking
     *         configurations that use this rule set.
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking rule set. Use this parameter to retrieve all matchmaking configurations that
     * use this rule set.
     * </p>
     * 
     * @param ruleSetName
     *        Unique identifier for a matchmaking rule set. Use this parameter to retrieve all matchmaking
     *        configurations that use this rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMatchmakingConfigurationsRequest withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages. This parameter is limited to 10.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages. This parameter is limited to 10.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages. This parameter is limited to 10.
     * </p>
     * 
     * @return Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *         set of sequential pages. This parameter is limited to 10.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages. This parameter is limited to 10.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages. This parameter is limited to 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMatchmakingConfigurationsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token that indicates the start of the next sequential page of results. Use the token that is returned with
     *        a previous call to this action. To start at the beginning of the result set, do not specify a value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @return Token that indicates the start of the next sequential page of results. Use the token that is returned
     *         with a previous call to this action. To start at the beginning of the result set, do not specify a value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token that indicates the start of the next sequential page of results. Use the token that is returned with
     *        a previous call to this action. To start at the beginning of the result set, do not specify a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMatchmakingConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNames() != null)
            sb.append("Names: ").append(getNames()).append(",");
        if (getRuleSetName() != null)
            sb.append("RuleSetName: ").append(getRuleSetName()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMatchmakingConfigurationsRequest == false)
            return false;
        DescribeMatchmakingConfigurationsRequest other = (DescribeMatchmakingConfigurationsRequest) obj;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMatchmakingConfigurationsRequest clone() {
        return (DescribeMatchmakingConfigurationsRequest) super.clone();
    }

}
