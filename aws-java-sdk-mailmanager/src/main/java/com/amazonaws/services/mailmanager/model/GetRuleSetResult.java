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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetRuleSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRuleSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date of when then rule set was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date of when the rule set was last modified.
     * </p>
     */
    private java.util.Date lastModificationDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule set resource.
     * </p>
     */
    private String ruleSetArn;
    /**
     * <p>
     * The identifier of the rule set resource.
     * </p>
     */
    private String ruleSetId;
    /**
     * <p>
     * A user-friendly name for the rule set resource.
     * </p>
     */
    private String ruleSetName;
    /**
     * <p>
     * The rules contained in the rule set.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * The date of when then rule set was created.
     * </p>
     * 
     * @param createdDate
     *        The date of when then rule set was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date of when then rule set was created.
     * </p>
     * 
     * @return The date of when then rule set was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date of when then rule set was created.
     * </p>
     * 
     * @param createdDate
     *        The date of when then rule set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleSetResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date of when the rule set was last modified.
     * </p>
     * 
     * @param lastModificationDate
     *        The date of when the rule set was last modified.
     */

    public void setLastModificationDate(java.util.Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    /**
     * <p>
     * The date of when the rule set was last modified.
     * </p>
     * 
     * @return The date of when the rule set was last modified.
     */

    public java.util.Date getLastModificationDate() {
        return this.lastModificationDate;
    }

    /**
     * <p>
     * The date of when the rule set was last modified.
     * </p>
     * 
     * @param lastModificationDate
     *        The date of when the rule set was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleSetResult withLastModificationDate(java.util.Date lastModificationDate) {
        setLastModificationDate(lastModificationDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule set resource.
     * </p>
     * 
     * @param ruleSetArn
     *        The Amazon Resource Name (ARN) of the rule set resource.
     */

    public void setRuleSetArn(String ruleSetArn) {
        this.ruleSetArn = ruleSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule set resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule set resource.
     */

    public String getRuleSetArn() {
        return this.ruleSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule set resource.
     * </p>
     * 
     * @param ruleSetArn
     *        The Amazon Resource Name (ARN) of the rule set resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleSetResult withRuleSetArn(String ruleSetArn) {
        setRuleSetArn(ruleSetArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the rule set resource.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of the rule set resource.
     */

    public void setRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
    }

    /**
     * <p>
     * The identifier of the rule set resource.
     * </p>
     * 
     * @return The identifier of the rule set resource.
     */

    public String getRuleSetId() {
        return this.ruleSetId;
    }

    /**
     * <p>
     * The identifier of the rule set resource.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of the rule set resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleSetResult withRuleSetId(String ruleSetId) {
        setRuleSetId(ruleSetId);
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the rule set resource.
     * </p>
     * 
     * @param ruleSetName
     *        A user-friendly name for the rule set resource.
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * A user-friendly name for the rule set resource.
     * </p>
     * 
     * @return A user-friendly name for the rule set resource.
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * A user-friendly name for the rule set resource.
     * </p>
     * 
     * @param ruleSetName
     *        A user-friendly name for the rule set resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleSetResult withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
        return this;
    }

    /**
     * <p>
     * The rules contained in the rule set.
     * </p>
     * 
     * @return The rules contained in the rule set.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules contained in the rule set.
     * </p>
     * 
     * @param rules
     *        The rules contained in the rule set.
     */

    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * The rules contained in the rule set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules contained in the rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleSetResult withRules(Rule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<Rule>(rules.length));
        }
        for (Rule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules contained in the rule set.
     * </p>
     * 
     * @param rules
     *        The rules contained in the rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleSetResult withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getLastModificationDate() != null)
            sb.append("LastModificationDate: ").append(getLastModificationDate()).append(",");
        if (getRuleSetArn() != null)
            sb.append("RuleSetArn: ").append(getRuleSetArn()).append(",");
        if (getRuleSetId() != null)
            sb.append("RuleSetId: ").append(getRuleSetId()).append(",");
        if (getRuleSetName() != null)
            sb.append("RuleSetName: ").append(getRuleSetName()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRuleSetResult == false)
            return false;
        GetRuleSetResult other = (GetRuleSetResult) obj;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastModificationDate() == null ^ this.getLastModificationDate() == null)
            return false;
        if (other.getLastModificationDate() != null && other.getLastModificationDate().equals(this.getLastModificationDate()) == false)
            return false;
        if (other.getRuleSetArn() == null ^ this.getRuleSetArn() == null)
            return false;
        if (other.getRuleSetArn() != null && other.getRuleSetArn().equals(this.getRuleSetArn()) == false)
            return false;
        if (other.getRuleSetId() == null ^ this.getRuleSetId() == null)
            return false;
        if (other.getRuleSetId() != null && other.getRuleSetId().equals(this.getRuleSetId()) == false)
            return false;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastModificationDate() == null) ? 0 : getLastModificationDate().hashCode());
        hashCode = prime * hashCode + ((getRuleSetArn() == null) ? 0 : getRuleSetArn().hashCode());
        hashCode = prime * hashCode + ((getRuleSetId() == null) ? 0 : getRuleSetId().hashCode());
        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public GetRuleSetResult clone() {
        try {
            return (GetRuleSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
