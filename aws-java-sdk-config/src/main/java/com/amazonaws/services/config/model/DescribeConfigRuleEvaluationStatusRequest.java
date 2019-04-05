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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRuleEvaluationStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigRuleEvaluationStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AWS managed Config rules for which you want status information. If you do not specify any names,
     * AWS Config returns status information for all AWS managed Config rules that you use.
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
     * The number of rule evaluation results that you want returned.
     * </p>
     * <p>
     * This parameter is required if the rule limit for your account is more than the default of 50 rules.
     * </p>
     * <p>
     * For information about requesting a rule limit increase, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_config">AWS Config Limits</a>
     * in the <i>AWS General Reference Guide</i>.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The name of the AWS managed Config rules for which you want status information. If you do not specify any names,
     * AWS Config returns status information for all AWS managed Config rules that you use.
     * </p>
     * 
     * @return The name of the AWS managed Config rules for which you want status information. If you do not specify any
     *         names, AWS Config returns status information for all AWS managed Config rules that you use.
     */

    public java.util.List<String> getConfigRuleNames() {
        if (configRuleNames == null) {
            configRuleNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configRuleNames;
    }

    /**
     * <p>
     * The name of the AWS managed Config rules for which you want status information. If you do not specify any names,
     * AWS Config returns status information for all AWS managed Config rules that you use.
     * </p>
     * 
     * @param configRuleNames
     *        The name of the AWS managed Config rules for which you want status information. If you do not specify any
     *        names, AWS Config returns status information for all AWS managed Config rules that you use.
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
     * The name of the AWS managed Config rules for which you want status information. If you do not specify any names,
     * AWS Config returns status information for all AWS managed Config rules that you use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigRuleNames(java.util.Collection)} or {@link #withConfigRuleNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param configRuleNames
     *        The name of the AWS managed Config rules for which you want status information. If you do not specify any
     *        names, AWS Config returns status information for all AWS managed Config rules that you use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRuleEvaluationStatusRequest withConfigRuleNames(String... configRuleNames) {
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
     * The name of the AWS managed Config rules for which you want status information. If you do not specify any names,
     * AWS Config returns status information for all AWS managed Config rules that you use.
     * </p>
     * 
     * @param configRuleNames
     *        The name of the AWS managed Config rules for which you want status information. If you do not specify any
     *        names, AWS Config returns status information for all AWS managed Config rules that you use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRuleEvaluationStatusRequest withConfigRuleNames(java.util.Collection<String> configRuleNames) {
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

    public DescribeConfigRuleEvaluationStatusRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of rule evaluation results that you want returned.
     * </p>
     * <p>
     * This parameter is required if the rule limit for your account is more than the default of 50 rules.
     * </p>
     * <p>
     * For information about requesting a rule limit increase, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_config">AWS Config Limits</a>
     * in the <i>AWS General Reference Guide</i>.
     * </p>
     * 
     * @param limit
     *        The number of rule evaluation results that you want returned.</p>
     *        <p>
     *        This parameter is required if the rule limit for your account is more than the default of 50 rules.
     *        </p>
     *        <p>
     *        For information about requesting a rule limit increase, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_config">AWS Config
     *        Limits</a> in the <i>AWS General Reference Guide</i>.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The number of rule evaluation results that you want returned.
     * </p>
     * <p>
     * This parameter is required if the rule limit for your account is more than the default of 50 rules.
     * </p>
     * <p>
     * For information about requesting a rule limit increase, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_config">AWS Config Limits</a>
     * in the <i>AWS General Reference Guide</i>.
     * </p>
     * 
     * @return The number of rule evaluation results that you want returned.</p>
     *         <p>
     *         This parameter is required if the rule limit for your account is more than the default of 50 rules.
     *         </p>
     *         <p>
     *         For information about requesting a rule limit increase, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_config">AWS Config
     *         Limits</a> in the <i>AWS General Reference Guide</i>.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The number of rule evaluation results that you want returned.
     * </p>
     * <p>
     * This parameter is required if the rule limit for your account is more than the default of 50 rules.
     * </p>
     * <p>
     * For information about requesting a rule limit increase, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_config">AWS Config Limits</a>
     * in the <i>AWS General Reference Guide</i>.
     * </p>
     * 
     * @param limit
     *        The number of rule evaluation results that you want returned.</p>
     *        <p>
     *        This parameter is required if the rule limit for your account is more than the default of 50 rules.
     *        </p>
     *        <p>
     *        For information about requesting a rule limit increase, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_config">AWS Config
     *        Limits</a> in the <i>AWS General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRuleEvaluationStatusRequest withLimit(Integer limit) {
        setLimit(limit);
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
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigRuleEvaluationStatusRequest == false)
            return false;
        DescribeConfigRuleEvaluationStatusRequest other = (DescribeConfigRuleEvaluationStatusRequest) obj;
        if (other.getConfigRuleNames() == null ^ this.getConfigRuleNames() == null)
            return false;
        if (other.getConfigRuleNames() != null && other.getConfigRuleNames().equals(this.getConfigRuleNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleNames() == null) ? 0 : getConfigRuleNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigRuleEvaluationStatusRequest clone() {
        return (DescribeConfigRuleEvaluationStatusRequest) super.clone();
    }

}
