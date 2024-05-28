/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetRuleSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRuleSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of an existing rule set to be retrieved.
     * </p>
     */
    private String ruleSetId;

    /**
     * <p>
     * The identifier of an existing rule set to be retrieved.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of an existing rule set to be retrieved.
     */

    public void setRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
    }

    /**
     * <p>
     * The identifier of an existing rule set to be retrieved.
     * </p>
     * 
     * @return The identifier of an existing rule set to be retrieved.
     */

    public String getRuleSetId() {
        return this.ruleSetId;
    }

    /**
     * <p>
     * The identifier of an existing rule set to be retrieved.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of an existing rule set to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleSetRequest withRuleSetId(String ruleSetId) {
        setRuleSetId(ruleSetId);
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
        if (getRuleSetId() != null)
            sb.append("RuleSetId: ").append(getRuleSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRuleSetRequest == false)
            return false;
        GetRuleSetRequest other = (GetRuleSetRequest) obj;
        if (other.getRuleSetId() == null ^ this.getRuleSetId() == null)
            return false;
        if (other.getRuleSetId() != null && other.getRuleSetId().equals(this.getRuleSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleSetId() == null) ? 0 : getRuleSetId().hashCode());
        return hashCode;
    }

    @Override
    public GetRuleSetRequest clone() {
        return (GetRuleSetRequest) super.clone();
    }

}
