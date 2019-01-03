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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> that you want to update. <code>RuleId</code> is returned by
     * <code>CreateRule</code> and by <a>ListRules</a>.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;
    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>Rule</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RuleUpdate</a>: Contains <code>Action</code> and <code>Predicate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<RuleUpdate> updates;

    /**
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> that you want to update. <code>RuleId</code> is returned by
     * <code>CreateRule</code> and by <a>ListRules</a>.
     * </p>
     * 
     * @param ruleId
     *        The <code>RuleId</code> of the <code>Rule</code> that you want to update. <code>RuleId</code> is returned
     *        by <code>CreateRule</code> and by <a>ListRules</a>.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> that you want to update. <code>RuleId</code> is returned by
     * <code>CreateRule</code> and by <a>ListRules</a>.
     * </p>
     * 
     * @return The <code>RuleId</code> of the <code>Rule</code> that you want to update. <code>RuleId</code> is returned
     *         by <code>CreateRule</code> and by <a>ListRules</a>.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> that you want to update. <code>RuleId</code> is returned by
     * <code>CreateRule</code> and by <a>ListRules</a>.
     * </p>
     * 
     * @param ruleId
     *        The <code>RuleId</code> of the <code>Rule</code> that you want to update. <code>RuleId</code> is returned
     *        by <code>CreateRule</code> and by <a>ListRules</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @return The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public String getChangeToken() {
        return this.changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
        return this;
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>Rule</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RuleUpdate</a>: Contains <code>Action</code> and <code>Predicate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>Rule</a>.
     *         For more information, see the applicable data types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>RuleUpdate</a>: Contains <code>Action</code> and <code>Predicate</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and <code>Type</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *         </p>
     *         </li>
     */

    public java.util.List<RuleUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>Rule</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RuleUpdate</a>: Contains <code>Action</code> and <code>Predicate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updates
     *        An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>Rule</a>. For
     *        more information, see the applicable data types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>RuleUpdate</a>: Contains <code>Action</code> and <code>Predicate</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and <code>Type</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     */

    public void setUpdates(java.util.Collection<RuleUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<RuleUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>Rule</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RuleUpdate</a>: Contains <code>Action</code> and <code>Predicate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdates(java.util.Collection)} or {@link #withUpdates(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param updates
     *        An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>Rule</a>. For
     *        more information, see the applicable data types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>RuleUpdate</a>: Contains <code>Action</code> and <code>Predicate</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and <code>Type</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withUpdates(RuleUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<RuleUpdate>(updates.length));
        }
        for (RuleUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>Rule</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RuleUpdate</a>: Contains <code>Action</code> and <code>Predicate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updates
     *        An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>Rule</a>. For
     *        more information, see the applicable data types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>RuleUpdate</a>: Contains <code>Action</code> and <code>Predicate</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and <code>Type</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withUpdates(java.util.Collection<RuleUpdate> updates) {
        setUpdates(updates);
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
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: ").append(getChangeToken()).append(",");
        if (getUpdates() != null)
            sb.append("Updates: ").append(getUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRuleRequest == false)
            return false;
        UpdateRuleRequest other = (UpdateRuleRequest) obj;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRuleRequest clone() {
        return (UpdateRuleRequest) super.clone();
    }

}
