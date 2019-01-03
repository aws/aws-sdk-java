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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListTargetsByRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTargetsByRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The targets assigned to the rule.
     * </p>
     */
    private java.util.List<Target> targets;
    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The targets assigned to the rule.
     * </p>
     * 
     * @return The targets assigned to the rule.
     */

    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets assigned to the rule.
     * </p>
     * 
     * @param targets
     *        The targets assigned to the rule.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * The targets assigned to the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets assigned to the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetsByRuleResult withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets assigned to the rule.
     * </p>
     * 
     * @param targets
     *        The targets assigned to the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetsByRuleResult withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
     * </p>
     * 
     * @param nextToken
     *        Indicates whether there are additional results to retrieve. If there are no more results, the value is
     *        null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
     * </p>
     * 
     * @return Indicates whether there are additional results to retrieve. If there are no more results, the value is
     *         null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
     * </p>
     * 
     * @param nextToken
     *        Indicates whether there are additional results to retrieve. If there are no more results, the value is
     *        null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetsByRuleResult withNextToken(String nextToken) {
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
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
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

        if (obj instanceof ListTargetsByRuleResult == false)
            return false;
        ListTargetsByRuleResult other = (ListTargetsByRuleResult) obj;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
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

        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTargetsByRuleResult clone() {
        try {
            return (ListTargetsByRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
