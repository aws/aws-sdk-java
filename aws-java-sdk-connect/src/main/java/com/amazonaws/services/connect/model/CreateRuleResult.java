/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     */
    private String ruleArn;
    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     */
    private String ruleId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param ruleArn
     *        The Amazon Resource Name (ARN) of the rule.
     */

    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule.
     */

    public String getRuleArn() {
        return this.ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param ruleArn
     *        The Amazon Resource Name (ARN) of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleResult withRuleArn(String ruleArn) {
        setRuleArn(ruleArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for the rule.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * 
     * @return A unique identifier for the rule.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleResult withRuleId(String ruleId) {
        setRuleId(ruleId);
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
        if (getRuleArn() != null)
            sb.append("RuleArn: ").append(getRuleArn()).append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRuleResult == false)
            return false;
        CreateRuleResult other = (CreateRuleResult) obj;
        if (other.getRuleArn() == null ^ this.getRuleArn() == null)
            return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        return hashCode;
    }

    @Override
    public CreateRuleResult clone() {
        try {
            return (CreateRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
