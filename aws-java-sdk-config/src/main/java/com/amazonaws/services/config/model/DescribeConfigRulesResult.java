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

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details about your AWS Config rules.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigRule> configRules;
    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The details about your AWS Config rules.
     * </p>
     * 
     * @return The details about your AWS Config rules.
     */

    public java.util.List<ConfigRule> getConfigRules() {
        if (configRules == null) {
            configRules = new com.amazonaws.internal.SdkInternalList<ConfigRule>();
        }
        return configRules;
    }

    /**
     * <p>
     * The details about your AWS Config rules.
     * </p>
     * 
     * @param configRules
     *        The details about your AWS Config rules.
     */

    public void setConfigRules(java.util.Collection<ConfigRule> configRules) {
        if (configRules == null) {
            this.configRules = null;
            return;
        }

        this.configRules = new com.amazonaws.internal.SdkInternalList<ConfigRule>(configRules);
    }

    /**
     * <p>
     * The details about your AWS Config rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigRules(java.util.Collection)} or {@link #withConfigRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param configRules
     *        The details about your AWS Config rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRulesResult withConfigRules(ConfigRule... configRules) {
        if (this.configRules == null) {
            setConfigRules(new com.amazonaws.internal.SdkInternalList<ConfigRule>(configRules.length));
        }
        for (ConfigRule ele : configRules) {
            this.configRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details about your AWS Config rules.
     * </p>
     * 
     * @param configRules
     *        The details about your AWS Config rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRulesResult withConfigRules(java.util.Collection<ConfigRule> configRules) {
        setConfigRules(configRules);
        return this;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @return The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRulesResult withNextToken(String nextToken) {
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
        if (getConfigRules() != null)
            sb.append("ConfigRules: ").append(getConfigRules()).append(",");
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

        if (obj instanceof DescribeConfigRulesResult == false)
            return false;
        DescribeConfigRulesResult other = (DescribeConfigRulesResult) obj;
        if (other.getConfigRules() == null ^ this.getConfigRules() == null)
            return false;
        if (other.getConfigRules() != null && other.getConfigRules().equals(this.getConfigRules()) == false)
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

        hashCode = prime * hashCode + ((getConfigRules() == null) ? 0 : getConfigRules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigRulesResult clone() {
        try {
            return (DescribeConfigRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
