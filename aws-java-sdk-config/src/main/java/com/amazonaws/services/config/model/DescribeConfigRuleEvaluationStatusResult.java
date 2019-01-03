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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRuleEvaluationStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigRuleEvaluationStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Status information about your AWS managed Config rules.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigRuleEvaluationStatus> configRulesEvaluationStatus;
    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Status information about your AWS managed Config rules.
     * </p>
     * 
     * @return Status information about your AWS managed Config rules.
     */

    public java.util.List<ConfigRuleEvaluationStatus> getConfigRulesEvaluationStatus() {
        if (configRulesEvaluationStatus == null) {
            configRulesEvaluationStatus = new com.amazonaws.internal.SdkInternalList<ConfigRuleEvaluationStatus>();
        }
        return configRulesEvaluationStatus;
    }

    /**
     * <p>
     * Status information about your AWS managed Config rules.
     * </p>
     * 
     * @param configRulesEvaluationStatus
     *        Status information about your AWS managed Config rules.
     */

    public void setConfigRulesEvaluationStatus(java.util.Collection<ConfigRuleEvaluationStatus> configRulesEvaluationStatus) {
        if (configRulesEvaluationStatus == null) {
            this.configRulesEvaluationStatus = null;
            return;
        }

        this.configRulesEvaluationStatus = new com.amazonaws.internal.SdkInternalList<ConfigRuleEvaluationStatus>(configRulesEvaluationStatus);
    }

    /**
     * <p>
     * Status information about your AWS managed Config rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigRulesEvaluationStatus(java.util.Collection)} or
     * {@link #withConfigRulesEvaluationStatus(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configRulesEvaluationStatus
     *        Status information about your AWS managed Config rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRuleEvaluationStatusResult withConfigRulesEvaluationStatus(ConfigRuleEvaluationStatus... configRulesEvaluationStatus) {
        if (this.configRulesEvaluationStatus == null) {
            setConfigRulesEvaluationStatus(new com.amazonaws.internal.SdkInternalList<ConfigRuleEvaluationStatus>(configRulesEvaluationStatus.length));
        }
        for (ConfigRuleEvaluationStatus ele : configRulesEvaluationStatus) {
            this.configRulesEvaluationStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Status information about your AWS managed Config rules.
     * </p>
     * 
     * @param configRulesEvaluationStatus
     *        Status information about your AWS managed Config rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigRuleEvaluationStatusResult withConfigRulesEvaluationStatus(java.util.Collection<ConfigRuleEvaluationStatus> configRulesEvaluationStatus) {
        setConfigRulesEvaluationStatus(configRulesEvaluationStatus);
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

    public DescribeConfigRuleEvaluationStatusResult withNextToken(String nextToken) {
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
        if (getConfigRulesEvaluationStatus() != null)
            sb.append("ConfigRulesEvaluationStatus: ").append(getConfigRulesEvaluationStatus()).append(",");
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

        if (obj instanceof DescribeConfigRuleEvaluationStatusResult == false)
            return false;
        DescribeConfigRuleEvaluationStatusResult other = (DescribeConfigRuleEvaluationStatusResult) obj;
        if (other.getConfigRulesEvaluationStatus() == null ^ this.getConfigRulesEvaluationStatus() == null)
            return false;
        if (other.getConfigRulesEvaluationStatus() != null && other.getConfigRulesEvaluationStatus().equals(this.getConfigRulesEvaluationStatus()) == false)
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

        hashCode = prime * hashCode + ((getConfigRulesEvaluationStatus() == null) ? 0 : getConfigRulesEvaluationStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigRuleEvaluationStatusResult clone() {
        try {
            return (DescribeConfigRuleEvaluationStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
