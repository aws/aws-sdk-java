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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateRuleset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRulesetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ruleset to be updated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the ruleset.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on a
     * DataBrew dataset.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * The name of the ruleset to be updated.
     * </p>
     * 
     * @param name
     *        The name of the ruleset to be updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ruleset to be updated.
     * </p>
     * 
     * @return The name of the ruleset to be updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ruleset to be updated.
     * </p>
     * 
     * @param name
     *        The name of the ruleset to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRulesetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the ruleset.
     * </p>
     * 
     * @param description
     *        The description of the ruleset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the ruleset.
     * </p>
     * 
     * @return The description of the ruleset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the ruleset.
     * </p>
     * 
     * @param description
     *        The description of the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRulesetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on a
     * DataBrew dataset.
     * </p>
     * 
     * @return A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on
     *         a DataBrew dataset.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on a
     * DataBrew dataset.
     * </p>
     * 
     * @param rules
     *        A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on a
     *        DataBrew dataset.
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
     * A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on a
     * DataBrew dataset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on a
     *        DataBrew dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRulesetRequest withRules(Rule... rules) {
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
     * A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on a
     * DataBrew dataset.
     * </p>
     * 
     * @param rules
     *        A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on a
     *        DataBrew dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRulesetRequest withRules(java.util.Collection<Rule> rules) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof UpdateRulesetRequest == false)
            return false;
        UpdateRulesetRequest other = (UpdateRulesetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRulesetRequest clone() {
        return (UpdateRulesetRequest) super.clone();
    }

}
