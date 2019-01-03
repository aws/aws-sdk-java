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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config returns
     * details for all your rules.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> configRuleNames;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config returns
     * details for all your rules.
     * </p>
     * 
     * @return The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config
     *         returns details for all your rules.
     */

    public java.util.List<String> getConfigRuleNames() {
        if (configRuleNames == null) {
            configRuleNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configRuleNames;
    }

    /**
     * <p>
     * The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config returns
     * details for all your rules.
     * </p>
     * 
     * @param configRuleNames
     *        The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config
     *        returns details for all your rules.
     */

    public void setConfigRuleNames(java.util.Collection<String> configRuleNames) {
        if (configRuleNames == null) {
            this.configRuleNames = null;
            return;
        }

        this.configRuleNames = new com.amazonaws.internal.SdkInternalList<String>(configRuleNames);
    }

    /**
     * <p>
     * The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config returns
     * details for all your rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigRuleNames(java.util.Collection)} or {@link #withConfigRuleNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param configRuleNames
     *        The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config
     *        returns details for all your rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRulesRequest withConfigRuleNames(String... configRuleNames) {
        if (this.configRuleNames == null) {
            setConfigRuleNames(new com.amazonaws.internal.SdkInternalList<String>(configRuleNames.length));
        }
        for (String ele : configRuleNames) {
            this.configRuleNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config returns
     * details for all your rules.
     * </p>
     * 
     * @param configRuleNames
     *        The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config
     *        returns details for all your rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRulesRequest withConfigRuleNames(java.util.Collection<String> configRuleNames) {
        setConfigRuleNames(configRuleNames);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRulesRequest withNextToken(String nextToken) {
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
        if (getConfigRuleNames() != null)
            sb.append("ConfigRuleNames: ").append(getConfigRuleNames()).append(",");
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

        if (obj instanceof DescribeConfigRulesRequest == false)
            return false;
        DescribeConfigRulesRequest other = (DescribeConfigRulesRequest) obj;
        if (other.getConfigRuleNames() == null ^ this.getConfigRuleNames() == null)
            return false;
        if (other.getConfigRuleNames() != null && other.getConfigRuleNames().equals(this.getConfigRuleNames()) == false)
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

        hashCode = prime * hashCode + ((getConfigRuleNames() == null) ? 0 : getConfigRuleNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigRulesRequest clone() {
        return (DescribeConfigRulesRequest) super.clone();
    }

}
