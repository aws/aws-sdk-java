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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteSamplingRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSamplingRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     */
    private String ruleARN;

    /**
     * <p>
     * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @param ruleName
     *        The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @return The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @param ruleName
     *        The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSamplingRuleRequest withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @param ruleARN
     *        The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     */

    public void setRuleARN(String ruleARN) {
        this.ruleARN = ruleARN;
    }

    /**
     * <p>
     * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @return The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     */

    public String getRuleARN() {
        return this.ruleARN;
    }

    /**
     * <p>
     * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @param ruleARN
     *        The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSamplingRuleRequest withRuleARN(String ruleARN) {
        setRuleARN(ruleARN);
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getRuleARN() != null)
            sb.append("RuleARN: ").append(getRuleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSamplingRuleRequest == false)
            return false;
        DeleteSamplingRuleRequest other = (DeleteSamplingRuleRequest) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getRuleARN() == null ^ this.getRuleARN() == null)
            return false;
        if (other.getRuleARN() != null && other.getRuleARN().equals(this.getRuleARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getRuleARN() == null) ? 0 : getRuleARN().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSamplingRuleRequest clone() {
        return (DeleteSamplingRuleRequest) super.clone();
    }

}
