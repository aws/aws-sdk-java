/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the <code>Rules</code> that identify the requests that you want to allow, block, or count. In a
 * <code>WebACL</code>, you also specify a default action (<code>ALLOW</code> or <code>BLOCK</code>), and the action for
 * each <code>Rule</code> that you add to a <code>WebACL</code>, for example, block requests from specified IP addresses
 * or block requests from specified referrers. You also associate the <code>WebACL</code> with a CloudFront distribution
 * to identify the requests that you want AWS WAF to filter. If you add more than one <code>Rule</code> to a
 * <code>WebACL</code>, a request needs to match only one of the specifications to be allowed, blocked, or counted. For
 * more information, see <a>UpdateWebACL</a>.
 * </p>
 */
public class WebACL implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for a <code>WebACL</code>. You use <code>WebACLId</code> to get information about a
     * <code>WebACL</code> (see <a>GetWebACL</a>), update a <code>WebACL</code> (see <a>UpdateWebACL</a>), and delete a
     * <code>WebACL</code> from AWS WAF (see <a>DeleteWebACL</a>).
     * </p>
     * <p>
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     * </p>
     */
    private String webACLId;
    /**
     * <p>
     * A friendly name or description of the <code>WebACL</code>. You can't change the name of a <code>WebACL</code>
     * after you create it.
     * </p>
     */
    private String name;

    private String metricName;
    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match. The action is
     * specified by the <a>WafAction</a> object.
     * </p>
     */
    private WafAction defaultAction;
    /**
     * <p>
     * An array that contains the action for each <code>Rule</code> in a <code>WebACL</code>, the priority of the
     * <code>Rule</code>, and the ID of the <code>Rule</code>.
     * </p>
     */
    private java.util.List<ActivatedRule> rules;

    /**
     * <p>
     * A unique identifier for a <code>WebACL</code>. You use <code>WebACLId</code> to get information about a
     * <code>WebACL</code> (see <a>GetWebACL</a>), update a <code>WebACL</code> (see <a>UpdateWebACL</a>), and delete a
     * <code>WebACL</code> from AWS WAF (see <a>DeleteWebACL</a>).
     * </p>
     * <p>
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     * </p>
     * 
     * @param webACLId
     *        A unique identifier for a <code>WebACL</code>. You use <code>WebACLId</code> to get information about a
     *        <code>WebACL</code> (see <a>GetWebACL</a>), update a <code>WebACL</code> (see <a>UpdateWebACL</a>), and
     *        delete a <code>WebACL</code> from AWS WAF (see <a>DeleteWebACL</a>).</p>
     *        <p>
     *        <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * A unique identifier for a <code>WebACL</code>. You use <code>WebACLId</code> to get information about a
     * <code>WebACL</code> (see <a>GetWebACL</a>), update a <code>WebACL</code> (see <a>UpdateWebACL</a>), and delete a
     * <code>WebACL</code> from AWS WAF (see <a>DeleteWebACL</a>).
     * </p>
     * <p>
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     * </p>
     * 
     * @return A unique identifier for a <code>WebACL</code>. You use <code>WebACLId</code> to get information about a
     *         <code>WebACL</code> (see <a>GetWebACL</a>), update a <code>WebACL</code> (see <a>UpdateWebACL</a>), and
     *         delete a <code>WebACL</code> from AWS WAF (see <a>DeleteWebACL</a>).</p>
     *         <p>
     *         <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * <p>
     * A unique identifier for a <code>WebACL</code>. You use <code>WebACLId</code> to get information about a
     * <code>WebACL</code> (see <a>GetWebACL</a>), update a <code>WebACL</code> (see <a>UpdateWebACL</a>), and delete a
     * <code>WebACL</code> from AWS WAF (see <a>DeleteWebACL</a>).
     * </p>
     * <p>
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     * </p>
     * 
     * @param webACLId
     *        A unique identifier for a <code>WebACL</code>. You use <code>WebACLId</code> to get information about a
     *        <code>WebACL</code> (see <a>GetWebACL</a>), update a <code>WebACL</code> (see <a>UpdateWebACL</a>), and
     *        delete a <code>WebACL</code> from AWS WAF (see <a>DeleteWebACL</a>).</p>
     *        <p>
     *        <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withWebACLId(String webACLId) {
        setWebACLId(webACLId);
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <code>WebACL</code>. You can't change the name of a <code>WebACL</code>
     * after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <code>WebACL</code>. You can't change the name of a
     *        <code>WebACL</code> after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <code>WebACL</code>. You can't change the name of a <code>WebACL</code>
     * after you create it.
     * </p>
     * 
     * @return A friendly name or description of the <code>WebACL</code>. You can't change the name of a
     *         <code>WebACL</code> after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <code>WebACL</code>. You can't change the name of a <code>WebACL</code>
     * after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <code>WebACL</code>. You can't change the name of a
     *        <code>WebACL</code> after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param metricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * @return
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @param metricName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match. The action is
     * specified by the <a>WafAction</a> object.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match. The
     *        action is specified by the <a>WafAction</a> object.
     */

    public void setDefaultAction(WafAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match. The action is
     * specified by the <a>WafAction</a> object.
     * </p>
     * 
     * @return The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match. The
     *         action is specified by the <a>WafAction</a> object.
     */

    public WafAction getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match. The action is
     * specified by the <a>WafAction</a> object.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match. The
     *        action is specified by the <a>WafAction</a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withDefaultAction(WafAction defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * An array that contains the action for each <code>Rule</code> in a <code>WebACL</code>, the priority of the
     * <code>Rule</code>, and the ID of the <code>Rule</code>.
     * </p>
     * 
     * @return An array that contains the action for each <code>Rule</code> in a <code>WebACL</code>, the priority of
     *         the <code>Rule</code>, and the ID of the <code>Rule</code>.
     */

    public java.util.List<ActivatedRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * An array that contains the action for each <code>Rule</code> in a <code>WebACL</code>, the priority of the
     * <code>Rule</code>, and the ID of the <code>Rule</code>.
     * </p>
     * 
     * @param rules
     *        An array that contains the action for each <code>Rule</code> in a <code>WebACL</code>, the priority of the
     *        <code>Rule</code>, and the ID of the <code>Rule</code>.
     */

    public void setRules(java.util.Collection<ActivatedRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<ActivatedRule>(rules);
    }

    /**
     * <p>
     * An array that contains the action for each <code>Rule</code> in a <code>WebACL</code>, the priority of the
     * <code>Rule</code>, and the ID of the <code>Rule</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        An array that contains the action for each <code>Rule</code> in a <code>WebACL</code>, the priority of the
     *        <code>Rule</code>, and the ID of the <code>Rule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withRules(ActivatedRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<ActivatedRule>(rules.length));
        }
        for (ActivatedRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the action for each <code>Rule</code> in a <code>WebACL</code>, the priority of the
     * <code>Rule</code>, and the ID of the <code>Rule</code>.
     * </p>
     * 
     * @param rules
     *        An array that contains the action for each <code>Rule</code> in a <code>WebACL</code>, the priority of the
     *        <code>Rule</code>, and the ID of the <code>Rule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withRules(java.util.Collection<ActivatedRule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("WebACLId: " + getWebACLId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: " + getDefaultAction() + ",");
        if (getRules() != null)
            sb.append("Rules: " + getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebACL == false)
            return false;
        WebACL other = (WebACL) obj;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
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

        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public WebACL clone() {
        try {
            return (WebACL) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
