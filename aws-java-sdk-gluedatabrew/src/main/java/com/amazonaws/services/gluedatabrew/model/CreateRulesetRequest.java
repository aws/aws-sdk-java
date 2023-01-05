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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateRuleset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRulesetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ruleset to be created. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.),
     * and space.
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
     * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on a
     * DataBrew dataset.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * Metadata tags to apply to the ruleset.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the ruleset to be created. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.),
     * and space.
     * </p>
     * 
     * @param name
     *        The name of the ruleset to be created. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-),
     *        period (.), and space.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ruleset to be created. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.),
     * and space.
     * </p>
     * 
     * @return The name of the ruleset to be created. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-),
     *         period (.), and space.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ruleset to be created. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.),
     * and space.
     * </p>
     * 
     * @param name
     *        The name of the ruleset to be created. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-),
     *        period (.), and space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRulesetRequest withName(String name) {
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

    public CreateRulesetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRulesetRequest withTargetArn(String targetArn) {
        setTargetArn(targetArn);
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

    public CreateRulesetRequest withRules(Rule... rules) {
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

    public CreateRulesetRequest withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * Metadata tags to apply to the ruleset.
     * </p>
     * 
     * @return Metadata tags to apply to the ruleset.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags to apply to the ruleset.
     * </p>
     * 
     * @param tags
     *        Metadata tags to apply to the ruleset.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags to apply to the ruleset.
     * </p>
     * 
     * @param tags
     *        Metadata tags to apply to the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRulesetRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRulesetRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRulesetRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRulesetRequest clearTagsEntries() {
        this.tags = null;
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
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRulesetRequest == false)
            return false;
        CreateRulesetRequest other = (CreateRulesetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRulesetRequest clone() {
        return (CreateRulesetRequest) super.clone();
    }

}
