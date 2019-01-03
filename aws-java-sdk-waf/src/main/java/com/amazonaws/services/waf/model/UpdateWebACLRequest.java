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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateWebACL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWebACLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to update. <code>WebACLId</code> is returned by
     * <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     * </p>
     */
    private String webACLId;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;
    /**
     * <p>
     * An array of updates to make to the <a>WebACL</a>.
     * </p>
     * <p>
     * An array of <code>WebACLUpdate</code> objects that you want to insert into or delete from a <a>WebACL</a>. For
     * more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACLUpdate</a>: Contains <code>Action</code> and <code>ActivatedRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ActivatedRule</a>: Contains <code>Action</code>, <code>OverrideAction</code>, <code>Priority</code>,
     * <code>RuleId</code>, and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies only when updating
     * or adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case, you do not use
     * <code>ActivatedRule|Action</code>. For all other update requests, <code>ActivatedRule|Action</code> is used
     * instead of <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>WafAction</a>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<WebACLUpdate> updates;
    /**
     * <p>
     * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't
     * match the criteria in any of the rules in a web ACL.
     * </p>
     */
    private WafAction defaultAction;

    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to update. <code>WebACLId</code> is returned by
     * <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     * </p>
     * 
     * @param webACLId
     *        The <code>WebACLId</code> of the <a>WebACL</a> that you want to update. <code>WebACLId</code> is returned
     *        by <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to update. <code>WebACLId</code> is returned by
     * <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     * </p>
     * 
     * @return The <code>WebACLId</code> of the <a>WebACL</a> that you want to update. <code>WebACLId</code> is returned
     *         by <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to update. <code>WebACLId</code> is returned by
     * <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     * </p>
     * 
     * @param webACLId
     *        The <code>WebACLId</code> of the <a>WebACL</a> that you want to update. <code>WebACLId</code> is returned
     *        by <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withWebACLId(String webACLId) {
        setWebACLId(webACLId);
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

    public UpdateWebACLRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
        return this;
    }

    /**
     * <p>
     * An array of updates to make to the <a>WebACL</a>.
     * </p>
     * <p>
     * An array of <code>WebACLUpdate</code> objects that you want to insert into or delete from a <a>WebACL</a>. For
     * more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACLUpdate</a>: Contains <code>Action</code> and <code>ActivatedRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ActivatedRule</a>: Contains <code>Action</code>, <code>OverrideAction</code>, <code>Priority</code>,
     * <code>RuleId</code>, and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies only when updating
     * or adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case, you do not use
     * <code>ActivatedRule|Action</code>. For all other update requests, <code>ActivatedRule|Action</code> is used
     * instead of <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>WafAction</a>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of updates to make to the <a>WebACL</a>.</p>
     *         <p>
     *         An array of <code>WebACLUpdate</code> objects that you want to insert into or delete from a
     *         <a>WebACL</a>. For more information, see the applicable data types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>WebACLUpdate</a>: Contains <code>Action</code> and <code>ActivatedRule</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ActivatedRule</a>: Contains <code>Action</code>, <code>OverrideAction</code>, <code>Priority</code>,
     *         <code>RuleId</code>, and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies only when
     *         updating or adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case, you do not use
     *         <code>ActivatedRule|Action</code>. For all other update requests, <code>ActivatedRule|Action</code> is
     *         used instead of <code>ActivatedRule|OverrideAction</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>WafAction</a>: Contains <code>Type</code>
     *         </p>
     *         </li>
     */

    public java.util.List<WebACLUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of updates to make to the <a>WebACL</a>.
     * </p>
     * <p>
     * An array of <code>WebACLUpdate</code> objects that you want to insert into or delete from a <a>WebACL</a>. For
     * more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACLUpdate</a>: Contains <code>Action</code> and <code>ActivatedRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ActivatedRule</a>: Contains <code>Action</code>, <code>OverrideAction</code>, <code>Priority</code>,
     * <code>RuleId</code>, and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies only when updating
     * or adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case, you do not use
     * <code>ActivatedRule|Action</code>. For all other update requests, <code>ActivatedRule|Action</code> is used
     * instead of <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>WafAction</a>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updates
     *        An array of updates to make to the <a>WebACL</a>.</p>
     *        <p>
     *        An array of <code>WebACLUpdate</code> objects that you want to insert into or delete from a <a>WebACL</a>.
     *        For more information, see the applicable data types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>WebACLUpdate</a>: Contains <code>Action</code> and <code>ActivatedRule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivatedRule</a>: Contains <code>Action</code>, <code>OverrideAction</code>, <code>Priority</code>,
     *        <code>RuleId</code>, and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies only when
     *        updating or adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case, you do not use
     *        <code>ActivatedRule|Action</code>. For all other update requests, <code>ActivatedRule|Action</code> is
     *        used instead of <code>ActivatedRule|OverrideAction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>WafAction</a>: Contains <code>Type</code>
     *        </p>
     *        </li>
     */

    public void setUpdates(java.util.Collection<WebACLUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<WebACLUpdate>(updates);
    }

    /**
     * <p>
     * An array of updates to make to the <a>WebACL</a>.
     * </p>
     * <p>
     * An array of <code>WebACLUpdate</code> objects that you want to insert into or delete from a <a>WebACL</a>. For
     * more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACLUpdate</a>: Contains <code>Action</code> and <code>ActivatedRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ActivatedRule</a>: Contains <code>Action</code>, <code>OverrideAction</code>, <code>Priority</code>,
     * <code>RuleId</code>, and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies only when updating
     * or adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case, you do not use
     * <code>ActivatedRule|Action</code>. For all other update requests, <code>ActivatedRule|Action</code> is used
     * instead of <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>WafAction</a>: Contains <code>Type</code>
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
     *        An array of updates to make to the <a>WebACL</a>.</p>
     *        <p>
     *        An array of <code>WebACLUpdate</code> objects that you want to insert into or delete from a <a>WebACL</a>.
     *        For more information, see the applicable data types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>WebACLUpdate</a>: Contains <code>Action</code> and <code>ActivatedRule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivatedRule</a>: Contains <code>Action</code>, <code>OverrideAction</code>, <code>Priority</code>,
     *        <code>RuleId</code>, and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies only when
     *        updating or adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case, you do not use
     *        <code>ActivatedRule|Action</code>. For all other update requests, <code>ActivatedRule|Action</code> is
     *        used instead of <code>ActivatedRule|OverrideAction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>WafAction</a>: Contains <code>Type</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withUpdates(WebACLUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<WebACLUpdate>(updates.length));
        }
        for (WebACLUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of updates to make to the <a>WebACL</a>.
     * </p>
     * <p>
     * An array of <code>WebACLUpdate</code> objects that you want to insert into or delete from a <a>WebACL</a>. For
     * more information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACLUpdate</a>: Contains <code>Action</code> and <code>ActivatedRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ActivatedRule</a>: Contains <code>Action</code>, <code>OverrideAction</code>, <code>Priority</code>,
     * <code>RuleId</code>, and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies only when updating
     * or adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case, you do not use
     * <code>ActivatedRule|Action</code>. For all other update requests, <code>ActivatedRule|Action</code> is used
     * instead of <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>WafAction</a>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updates
     *        An array of updates to make to the <a>WebACL</a>.</p>
     *        <p>
     *        An array of <code>WebACLUpdate</code> objects that you want to insert into or delete from a <a>WebACL</a>.
     *        For more information, see the applicable data types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>WebACLUpdate</a>: Contains <code>Action</code> and <code>ActivatedRule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivatedRule</a>: Contains <code>Action</code>, <code>OverrideAction</code>, <code>Priority</code>,
     *        <code>RuleId</code>, and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies only when
     *        updating or adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case, you do not use
     *        <code>ActivatedRule|Action</code>. For all other update requests, <code>ActivatedRule|Action</code> is
     *        used instead of <code>ActivatedRule|OverrideAction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>WafAction</a>: Contains <code>Type</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withUpdates(java.util.Collection<WebACLUpdate> updates) {
        setUpdates(updates);
        return this;
    }

    /**
     * <p>
     * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't
     * match the criteria in any of the rules in a web ACL.
     * </p>
     * 
     * @param defaultAction
     *        A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request
     *        doesn't match the criteria in any of the rules in a web ACL.
     */

    public void setDefaultAction(WafAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't
     * match the criteria in any of the rules in a web ACL.
     * </p>
     * 
     * @return A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request
     *         doesn't match the criteria in any of the rules in a web ACL.
     */

    public WafAction getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't
     * match the criteria in any of the rules in a web ACL.
     * </p>
     * 
     * @param defaultAction
     *        A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request
     *        doesn't match the criteria in any of the rules in a web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withDefaultAction(WafAction defaultAction) {
        setDefaultAction(defaultAction);
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
        if (getWebACLId() != null)
            sb.append("WebACLId: ").append(getWebACLId()).append(",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: ").append(getChangeToken()).append(",");
        if (getUpdates() != null)
            sb.append("Updates: ").append(getUpdates()).append(",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWebACLRequest == false)
            return false;
        UpdateWebACLRequest other = (UpdateWebACLRequest) obj;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWebACLRequest clone() {
        return (UpdateWebACLRequest) super.clone();
    }

}
