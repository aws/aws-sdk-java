/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteRuleGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRuleGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The high-level properties of a rule group. This, along with the <a>RuleGroup</a>, define the rule group. You can
     * retrieve all objects for a rule group by calling <a>DescribeRuleGroup</a>.
     * </p>
     */
    private RuleGroupResponse ruleGroupResponse;

    /**
     * <p>
     * The high-level properties of a rule group. This, along with the <a>RuleGroup</a>, define the rule group. You can
     * retrieve all objects for a rule group by calling <a>DescribeRuleGroup</a>.
     * </p>
     * 
     * @param ruleGroupResponse
     *        The high-level properties of a rule group. This, along with the <a>RuleGroup</a>, define the rule group.
     *        You can retrieve all objects for a rule group by calling <a>DescribeRuleGroup</a>.
     */

    public void setRuleGroupResponse(RuleGroupResponse ruleGroupResponse) {
        this.ruleGroupResponse = ruleGroupResponse;
    }

    /**
     * <p>
     * The high-level properties of a rule group. This, along with the <a>RuleGroup</a>, define the rule group. You can
     * retrieve all objects for a rule group by calling <a>DescribeRuleGroup</a>.
     * </p>
     * 
     * @return The high-level properties of a rule group. This, along with the <a>RuleGroup</a>, define the rule group.
     *         You can retrieve all objects for a rule group by calling <a>DescribeRuleGroup</a>.
     */

    public RuleGroupResponse getRuleGroupResponse() {
        return this.ruleGroupResponse;
    }

    /**
     * <p>
     * The high-level properties of a rule group. This, along with the <a>RuleGroup</a>, define the rule group. You can
     * retrieve all objects for a rule group by calling <a>DescribeRuleGroup</a>.
     * </p>
     * 
     * @param ruleGroupResponse
     *        The high-level properties of a rule group. This, along with the <a>RuleGroup</a>, define the rule group.
     *        You can retrieve all objects for a rule group by calling <a>DescribeRuleGroup</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRuleGroupResult withRuleGroupResponse(RuleGroupResponse ruleGroupResponse) {
        setRuleGroupResponse(ruleGroupResponse);
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
        if (getRuleGroupResponse() != null)
            sb.append("RuleGroupResponse: ").append(getRuleGroupResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRuleGroupResult == false)
            return false;
        DeleteRuleGroupResult other = (DeleteRuleGroupResult) obj;
        if (other.getRuleGroupResponse() == null ^ this.getRuleGroupResponse() == null)
            return false;
        if (other.getRuleGroupResponse() != null && other.getRuleGroupResponse().equals(this.getRuleGroupResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleGroupResponse() == null) ? 0 : getRuleGroupResponse().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRuleGroupResult clone() {
        try {
            return (DeleteRuleGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
