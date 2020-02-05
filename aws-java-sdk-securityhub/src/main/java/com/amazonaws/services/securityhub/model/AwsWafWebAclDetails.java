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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a WAF WebACL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafWebAclDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafWebAclDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The action to perform if none of the Rules contained in the WebACL match.
     * </p>
     */
    private String defaultAction;
    /**
     * <p>
     * An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the rule.
     * </p>
     */
    private java.util.List<AwsWafWebAclRule> rules;
    /**
     * <p>
     * A unique identifier for a WebACL.
     * </p>
     */
    private String webAclId;

    /**
     * <p>
     * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
     * </p>
     * 
     * @return A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The action to perform if none of the Rules contained in the WebACL match.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the Rules contained in the WebACL match.
     */

    public void setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the Rules contained in the WebACL match.
     * </p>
     * 
     * @return The action to perform if none of the Rules contained in the WebACL match.
     */

    public String getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the Rules contained in the WebACL match.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the Rules contained in the WebACL match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclDetails withDefaultAction(String defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the rule.
     * </p>
     * 
     * @return An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the
     *         rule.
     */

    public java.util.List<AwsWafWebAclRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the rule.
     * </p>
     * 
     * @param rules
     *        An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the
     *        rule.
     */

    public void setRules(java.util.Collection<AwsWafWebAclRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<AwsWafWebAclRule>(rules);
    }

    /**
     * <p>
     * An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the
     *        rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclDetails withRules(AwsWafWebAclRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<AwsWafWebAclRule>(rules.length));
        }
        for (AwsWafWebAclRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the rule.
     * </p>
     * 
     * @param rules
     *        An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the
     *        rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclDetails withRules(java.util.Collection<AwsWafWebAclRule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a WebACL.
     * </p>
     * 
     * @param webAclId
     *        A unique identifier for a WebACL.
     */

    public void setWebAclId(String webAclId) {
        this.webAclId = webAclId;
    }

    /**
     * <p>
     * A unique identifier for a WebACL.
     * </p>
     * 
     * @return A unique identifier for a WebACL.
     */

    public String getWebAclId() {
        return this.webAclId;
    }

    /**
     * <p>
     * A unique identifier for a WebACL.
     * </p>
     * 
     * @param webAclId
     *        A unique identifier for a WebACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclDetails withWebAclId(String webAclId) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
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

        if (obj instanceof AwsWafWebAclDetails == false)
            return false;
        AwsWafWebAclDetails other = (AwsWafWebAclDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getWebAclId() == null) ? 0 : getWebAclId().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafWebAclDetails clone() {
        try {
            return (AwsWafWebAclDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafWebAclDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
