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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DeleteRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If this is a managed rule, created by an AWS service on your behalf, you must specify <code>Force</code> as
     * <code>True</code> to delete the rule. This parameter is ignored for rules that are not managed rules. You can
     * check whether a rule is a managed rule by using <code>DescribeRule</code> or <code>ListRules</code> and checking
     * the <code>ManagedBy</code> field of the response.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If this is a managed rule, created by an AWS service on your behalf, you must specify <code>Force</code> as
     * <code>True</code> to delete the rule. This parameter is ignored for rules that are not managed rules. You can
     * check whether a rule is a managed rule by using <code>DescribeRule</code> or <code>ListRules</code> and checking
     * the <code>ManagedBy</code> field of the response.
     * </p>
     * 
     * @param force
     *        If this is a managed rule, created by an AWS service on your behalf, you must specify <code>Force</code>
     *        as <code>True</code> to delete the rule. This parameter is ignored for rules that are not managed rules.
     *        You can check whether a rule is a managed rule by using <code>DescribeRule</code> or
     *        <code>ListRules</code> and checking the <code>ManagedBy</code> field of the response.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * If this is a managed rule, created by an AWS service on your behalf, you must specify <code>Force</code> as
     * <code>True</code> to delete the rule. This parameter is ignored for rules that are not managed rules. You can
     * check whether a rule is a managed rule by using <code>DescribeRule</code> or <code>ListRules</code> and checking
     * the <code>ManagedBy</code> field of the response.
     * </p>
     * 
     * @return If this is a managed rule, created by an AWS service on your behalf, you must specify <code>Force</code>
     *         as <code>True</code> to delete the rule. This parameter is ignored for rules that are not managed rules.
     *         You can check whether a rule is a managed rule by using <code>DescribeRule</code> or
     *         <code>ListRules</code> and checking the <code>ManagedBy</code> field of the response.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * If this is a managed rule, created by an AWS service on your behalf, you must specify <code>Force</code> as
     * <code>True</code> to delete the rule. This parameter is ignored for rules that are not managed rules. You can
     * check whether a rule is a managed rule by using <code>DescribeRule</code> or <code>ListRules</code> and checking
     * the <code>ManagedBy</code> field of the response.
     * </p>
     * 
     * @param force
     *        If this is a managed rule, created by an AWS service on your behalf, you must specify <code>Force</code>
     *        as <code>True</code> to delete the rule. This parameter is ignored for rules that are not managed rules.
     *        You can check whether a rule is a managed rule by using <code>DescribeRule</code> or
     *        <code>ListRules</code> and checking the <code>ManagedBy</code> field of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRuleRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * If this is a managed rule, created by an AWS service on your behalf, you must specify <code>Force</code> as
     * <code>True</code> to delete the rule. This parameter is ignored for rules that are not managed rules. You can
     * check whether a rule is a managed rule by using <code>DescribeRule</code> or <code>ListRules</code> and checking
     * the <code>ManagedBy</code> field of the response.
     * </p>
     * 
     * @return If this is a managed rule, created by an AWS service on your behalf, you must specify <code>Force</code>
     *         as <code>True</code> to delete the rule. This parameter is ignored for rules that are not managed rules.
     *         You can check whether a rule is a managed rule by using <code>DescribeRule</code> or
     *         <code>ListRules</code> and checking the <code>ManagedBy</code> field of the response.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRuleRequest == false)
            return false;
        DeleteRuleRequest other = (DeleteRuleRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRuleRequest clone() {
        return (DeleteRuleRequest) super.clone();
    }

}
