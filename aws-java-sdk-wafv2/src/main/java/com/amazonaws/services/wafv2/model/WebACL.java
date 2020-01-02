/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined
 * (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a default
 * action to take (allow, block) for any request that does not match any of the rules. The rules in a Web ACL can be a
 * combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a Web ACL with one
 * or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway API, or an
 * Application Load Balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/WebACL" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebACL implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     * commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     */
    private DefaultAction defaultAction;
    /**
     * <p>
     * A friendly description of the Web ACL. You cannot change the description of a Web ACL after you create it.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern
     * how AWS WAF handles them.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     */
    private VisibilityConfig visibilityConfig;
    /**
     * <p>
     * The web ACL capacity units (WCUs) currently being used by this web ACL.
     * </p>
     * <p>
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups,
     * and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each
     * rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power.
     * Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule
     * group. The WCU limit for web ACLs is 1,500.
     * </p>
     */
    private Long capacity;

    /**
     * <p>
     * A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @return A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     * commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     *        commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     * commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     * </p>
     * 
     * @return A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     *         commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     * commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the <code>WebACL</code>. This ID is returned in the responses to create and list
     *        commands. You use this ID to do things like get, update, and delete a <code>WebACL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     */

    public void setDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     * 
     * @return The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     */

    public DefaultAction getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withDefaultAction(DefaultAction defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * A friendly description of the Web ACL. You cannot change the description of a Web ACL after you create it.
     * </p>
     * 
     * @param description
     *        A friendly description of the Web ACL. You cannot change the description of a Web ACL after you create it.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A friendly description of the Web ACL. You cannot change the description of a Web ACL after you create it.
     * </p>
     * 
     * @return A friendly description of the Web ACL. You cannot change the description of a Web ACL after you create
     *         it.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A friendly description of the Web ACL. You cannot change the description of a Web ACL after you create it.
     * </p>
     * 
     * @param description
     *        A friendly description of the Web ACL. You cannot change the description of a Web ACL after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern
     * how AWS WAF handles them.
     * </p>
     * 
     * @return The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count.
     *         Each rule includes one top-level statement that AWS WAF uses to identify matching web requests, and
     *         parameters that govern how AWS WAF handles them.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern
     * how AWS WAF handles them.
     * </p>
     * 
     * @param rules
     *        The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each
     *        rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters
     *        that govern how AWS WAF handles them.
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
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern
     * how AWS WAF handles them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each
     *        rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters
     *        that govern how AWS WAF handles them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withRules(Rule... rules) {
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
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern
     * how AWS WAF handles them.
     * </p>
     * 
     * @param rules
     *        The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each
     *        rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters
     *        that govern how AWS WAF handles them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @param visibilityConfig
     *        Defines and enables Amazon CloudWatch metrics and web request sample collection.
     */

    public void setVisibilityConfig(VisibilityConfig visibilityConfig) {
        this.visibilityConfig = visibilityConfig;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection.
     */

    public VisibilityConfig getVisibilityConfig() {
        return this.visibilityConfig;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @param visibilityConfig
     *        Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withVisibilityConfig(VisibilityConfig visibilityConfig) {
        setVisibilityConfig(visibilityConfig);
        return this;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) currently being used by this web ACL.
     * </p>
     * <p>
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups,
     * and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each
     * rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power.
     * Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule
     * group. The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) currently being used by this web ACL. </p>
     *        <p>
     *        AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule
     *        groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative
     *        cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use
     *        more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU
     *        usage when they use a rule group. The WCU limit for web ACLs is 1,500.
     */

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) currently being used by this web ACL.
     * </p>
     * <p>
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups,
     * and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each
     * rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power.
     * Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule
     * group. The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @return The web ACL capacity units (WCUs) currently being used by this web ACL. </p>
     *         <p>
     *         AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule
     *         groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative
     *         cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use
     *         more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU
     *         usage when they use a rule group. The WCU limit for web ACLs is 1,500.
     */

    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) currently being used by this web ACL.
     * </p>
     * <p>
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups,
     * and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each
     * rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power.
     * Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule
     * group. The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) currently being used by this web ACL. </p>
     *        <p>
     *        AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule
     *        groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative
     *        cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use
     *        more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU
     *        usage when they use a rule group. The WCU limit for web ACLs is 1,500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACL withCapacity(Long capacity) {
        setCapacity(capacity);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getVisibilityConfig() != null)
            sb.append("VisibilityConfig: ").append(getVisibilityConfig()).append(",");
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getVisibilityConfig() == null ^ this.getVisibilityConfig() == null)
            return false;
        if (other.getVisibilityConfig() != null && other.getVisibilityConfig().equals(this.getVisibilityConfig()) == false)
            return false;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getVisibilityConfig() == null) ? 0 : getVisibilityConfig().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.WebACLMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
