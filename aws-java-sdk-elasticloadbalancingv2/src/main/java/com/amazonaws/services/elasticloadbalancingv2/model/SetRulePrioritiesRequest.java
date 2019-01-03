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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetRulePriorities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetRulePrioritiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The rule priorities.
     * </p>
     */
    private java.util.List<RulePriorityPair> rulePriorities;

    /**
     * <p>
     * The rule priorities.
     * </p>
     * 
     * @return The rule priorities.
     */

    public java.util.List<RulePriorityPair> getRulePriorities() {
        return rulePriorities;
    }

    /**
     * <p>
     * The rule priorities.
     * </p>
     * 
     * @param rulePriorities
     *        The rule priorities.
     */

    public void setRulePriorities(java.util.Collection<RulePriorityPair> rulePriorities) {
        if (rulePriorities == null) {
            this.rulePriorities = null;
            return;
        }

        this.rulePriorities = new java.util.ArrayList<RulePriorityPair>(rulePriorities);
    }

    /**
     * <p>
     * The rule priorities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRulePriorities(java.util.Collection)} or {@link #withRulePriorities(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param rulePriorities
     *        The rule priorities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetRulePrioritiesRequest withRulePriorities(RulePriorityPair... rulePriorities) {
        if (this.rulePriorities == null) {
            setRulePriorities(new java.util.ArrayList<RulePriorityPair>(rulePriorities.length));
        }
        for (RulePriorityPair ele : rulePriorities) {
            this.rulePriorities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rule priorities.
     * </p>
     * 
     * @param rulePriorities
     *        The rule priorities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetRulePrioritiesRequest withRulePriorities(java.util.Collection<RulePriorityPair> rulePriorities) {
        setRulePriorities(rulePriorities);
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
        if (getRulePriorities() != null)
            sb.append("RulePriorities: ").append(getRulePriorities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetRulePrioritiesRequest == false)
            return false;
        SetRulePrioritiesRequest other = (SetRulePrioritiesRequest) obj;
        if (other.getRulePriorities() == null ^ this.getRulePriorities() == null)
            return false;
        if (other.getRulePriorities() != null && other.getRulePriorities().equals(this.getRulePriorities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRulePriorities() == null) ? 0 : getRulePriorities().hashCode());
        return hashCode;
    }

    @Override
    public SetRulePrioritiesRequest clone() {
        return (SetRulePrioritiesRequest) super.clone();
    }

}
