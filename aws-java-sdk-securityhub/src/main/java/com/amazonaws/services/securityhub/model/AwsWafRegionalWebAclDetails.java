/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the web access control list (web ACL). The web ACL contains the rules that identify the
 * requests that you want to allow, block, or count.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafRegionalWebAclDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafRegionalWebAclDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action to perform if none of the rules contained in the web ACL match.
     * </p>
     */
    private String defaultAction;
    /**
     * <p>
     * A name for the metrics for this web ACL.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * A descriptive name for the web ACL.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An array that contains the action for each rule in a web ACL, the priority of the rule, and the ID of the rule.
     * </p>
     */
    private java.util.List<AwsWafRegionalWebAclRulesListDetails> rulesList;
    /**
     * <p>
     * The ID of the web ACL.
     * </p>
     */
    private String webAclId;

    /**
     * <p>
     * The action to perform if none of the rules contained in the web ACL match.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the rules contained in the web ACL match.
     */

    public void setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the rules contained in the web ACL match.
     * </p>
     * 
     * @return The action to perform if none of the rules contained in the web ACL match.
     */

    public String getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the rules contained in the web ACL match.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the rules contained in the web ACL match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclDetails withDefaultAction(String defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * A name for the metrics for this web ACL.
     * </p>
     * 
     * @param metricName
     *        A name for the metrics for this web ACL.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A name for the metrics for this web ACL.
     * </p>
     * 
     * @return A name for the metrics for this web ACL.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * A name for the metrics for this web ACL.
     * </p>
     * 
     * @param metricName
     *        A name for the metrics for this web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclDetails withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * A descriptive name for the web ACL.
     * </p>
     * 
     * @param name
     *        A descriptive name for the web ACL.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive name for the web ACL.
     * </p>
     * 
     * @return A descriptive name for the web ACL.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive name for the web ACL.
     * </p>
     * 
     * @param name
     *        A descriptive name for the web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An array that contains the action for each rule in a web ACL, the priority of the rule, and the ID of the rule.
     * </p>
     * 
     * @return An array that contains the action for each rule in a web ACL, the priority of the rule, and the ID of the
     *         rule.
     */

    public java.util.List<AwsWafRegionalWebAclRulesListDetails> getRulesList() {
        return rulesList;
    }

    /**
     * <p>
     * An array that contains the action for each rule in a web ACL, the priority of the rule, and the ID of the rule.
     * </p>
     * 
     * @param rulesList
     *        An array that contains the action for each rule in a web ACL, the priority of the rule, and the ID of the
     *        rule.
     */

    public void setRulesList(java.util.Collection<AwsWafRegionalWebAclRulesListDetails> rulesList) {
        if (rulesList == null) {
            this.rulesList = null;
            return;
        }

        this.rulesList = new java.util.ArrayList<AwsWafRegionalWebAclRulesListDetails>(rulesList);
    }

    /**
     * <p>
     * An array that contains the action for each rule in a web ACL, the priority of the rule, and the ID of the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRulesList(java.util.Collection)} or {@link #withRulesList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param rulesList
     *        An array that contains the action for each rule in a web ACL, the priority of the rule, and the ID of the
     *        rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclDetails withRulesList(AwsWafRegionalWebAclRulesListDetails... rulesList) {
        if (this.rulesList == null) {
            setRulesList(new java.util.ArrayList<AwsWafRegionalWebAclRulesListDetails>(rulesList.length));
        }
        for (AwsWafRegionalWebAclRulesListDetails ele : rulesList) {
            this.rulesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the action for each rule in a web ACL, the priority of the rule, and the ID of the rule.
     * </p>
     * 
     * @param rulesList
     *        An array that contains the action for each rule in a web ACL, the priority of the rule, and the ID of the
     *        rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclDetails withRulesList(java.util.Collection<AwsWafRegionalWebAclRulesListDetails> rulesList) {
        setRulesList(rulesList);
        return this;
    }

    /**
     * <p>
     * The ID of the web ACL.
     * </p>
     * 
     * @param webAclId
     *        The ID of the web ACL.
     */

    public void setWebAclId(String webAclId) {
        this.webAclId = webAclId;
    }

    /**
     * <p>
     * The ID of the web ACL.
     * </p>
     * 
     * @return The ID of the web ACL.
     */

    public String getWebAclId() {
        return this.webAclId;
    }

    /**
     * <p>
     * The ID of the web ACL.
     * </p>
     * 
     * @param webAclId
     *        The ID of the web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclDetails withWebAclId(String webAclId) {
        setWebAclId(webAclId);
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
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRulesList() != null)
            sb.append("RulesList: ").append(getRulesList()).append(",");
        if (getWebAclId() != null)
            sb.append("WebAclId: ").append(getWebAclId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafRegionalWebAclDetails == false)
            return false;
        AwsWafRegionalWebAclDetails other = (AwsWafRegionalWebAclDetails) obj;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRulesList() == null ^ this.getRulesList() == null)
            return false;
        if (other.getRulesList() != null && other.getRulesList().equals(this.getRulesList()) == false)
            return false;
        if (other.getWebAclId() == null ^ this.getWebAclId() == null)
            return false;
        if (other.getWebAclId() != null && other.getWebAclId().equals(this.getWebAclId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRulesList() == null) ? 0 : getRulesList().hashCode());
        hashCode = prime * hashCode + ((getWebAclId() == null) ? 0 : getWebAclId().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafRegionalWebAclDetails clone() {
        try {
            return (AwsWafRegionalWebAclDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafRegionalWebAclDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
