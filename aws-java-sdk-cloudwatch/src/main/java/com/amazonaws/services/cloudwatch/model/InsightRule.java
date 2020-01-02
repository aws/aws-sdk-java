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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This structure contains the definition for a Contributor Insights rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/InsightRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightRule implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     */
    private String state;
    /**
     * <p>
     * For rules that you create, this is always <code>{"Name": "CloudWatchLogRule", "Version": 1}</code>. For built-in
     * rules, this is <code>{"Name": "ServiceLogRule", "Version": 1}</code>
     * </p>
     */
    private String schema;
    /**
     * <p>
     * The definition of the rule, as a JSON object. The definition contains the keywords used to define contributors,
     * the value to aggregate on if this rule returns a sum instead of a count, and the filters. For details on the
     * valid syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     * >Contributor Insights Rule Syntax</a>.
     * </p>
     */
    private String definition;

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

    public InsightRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Indicates whether the rule is enabled or disabled.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     * 
     * @return Indicates whether the rule is enabled or disabled.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Indicates whether the rule is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRule withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * For rules that you create, this is always <code>{"Name": "CloudWatchLogRule", "Version": 1}</code>. For built-in
     * rules, this is <code>{"Name": "ServiceLogRule", "Version": 1}</code>
     * </p>
     * 
     * @param schema
     *        For rules that you create, this is always <code>{"Name": "CloudWatchLogRule", "Version": 1}</code>. For
     *        built-in rules, this is <code>{"Name": "ServiceLogRule", "Version": 1}</code>
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * For rules that you create, this is always <code>{"Name": "CloudWatchLogRule", "Version": 1}</code>. For built-in
     * rules, this is <code>{"Name": "ServiceLogRule", "Version": 1}</code>
     * </p>
     * 
     * @return For rules that you create, this is always <code>{"Name": "CloudWatchLogRule", "Version": 1}</code>. For
     *         built-in rules, this is <code>{"Name": "ServiceLogRule", "Version": 1}</code>
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * For rules that you create, this is always <code>{"Name": "CloudWatchLogRule", "Version": 1}</code>. For built-in
     * rules, this is <code>{"Name": "ServiceLogRule", "Version": 1}</code>
     * </p>
     * 
     * @param schema
     *        For rules that you create, this is always <code>{"Name": "CloudWatchLogRule", "Version": 1}</code>. For
     *        built-in rules, this is <code>{"Name": "ServiceLogRule", "Version": 1}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRule withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The definition of the rule, as a JSON object. The definition contains the keywords used to define contributors,
     * the value to aggregate on if this rule returns a sum instead of a count, and the filters. For details on the
     * valid syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     * >Contributor Insights Rule Syntax</a>.
     * </p>
     * 
     * @param definition
     *        The definition of the rule, as a JSON object. The definition contains the keywords used to define
     *        contributors, the value to aggregate on if this rule returns a sum instead of a count, and the filters.
     *        For details on the valid syntax, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     *        >Contributor Insights Rule Syntax</a>.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The definition of the rule, as a JSON object. The definition contains the keywords used to define contributors,
     * the value to aggregate on if this rule returns a sum instead of a count, and the filters. For details on the
     * valid syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     * >Contributor Insights Rule Syntax</a>.
     * </p>
     * 
     * @return The definition of the rule, as a JSON object. The definition contains the keywords used to define
     *         contributors, the value to aggregate on if this rule returns a sum instead of a count, and the filters.
     *         For details on the valid syntax, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     *         >Contributor Insights Rule Syntax</a>.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The definition of the rule, as a JSON object. The definition contains the keywords used to define contributors,
     * the value to aggregate on if this rule returns a sum instead of a count, and the filters. For details on the
     * valid syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     * >Contributor Insights Rule Syntax</a>.
     * </p>
     * 
     * @param definition
     *        The definition of the rule, as a JSON object. The definition contains the keywords used to define
     *        contributors, the value to aggregate on if this rule returns a sum instead of a count, and the filters.
     *        For details on the valid syntax, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     *        >Contributor Insights Rule Syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRule withDefinition(String definition) {
        setDefinition(definition);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightRule == false)
            return false;
        InsightRule other = (InsightRule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        return hashCode;
    }

    @Override
    public InsightRule clone() {
        try {
            return (InsightRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
