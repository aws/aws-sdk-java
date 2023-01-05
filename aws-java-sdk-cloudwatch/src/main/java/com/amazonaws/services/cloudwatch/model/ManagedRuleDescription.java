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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about managed Contributor Insights rules, as returned by <code>ListManagedInsightRules</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ManagedRuleDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The template name for the managed rule. Used to enable managed rules using <code>PutManagedInsightRules</code>.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * If a managed rule is enabled, this is the ARN for the related Amazon Web Services resource.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * Describes the state of a managed rule. If present, it contains information about the Contributor Insights rule
     * that contains information about the related Amazon Web Services resource.
     * </p>
     */
    private ManagedRuleState ruleState;

    /**
     * <p>
     * The template name for the managed rule. Used to enable managed rules using <code>PutManagedInsightRules</code>.
     * </p>
     * 
     * @param templateName
     *        The template name for the managed rule. Used to enable managed rules using
     *        <code>PutManagedInsightRules</code>.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The template name for the managed rule. Used to enable managed rules using <code>PutManagedInsightRules</code>.
     * </p>
     * 
     * @return The template name for the managed rule. Used to enable managed rules using
     *         <code>PutManagedInsightRules</code>.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The template name for the managed rule. Used to enable managed rules using <code>PutManagedInsightRules</code>.
     * </p>
     * 
     * @param templateName
     *        The template name for the managed rule. Used to enable managed rules using
     *        <code>PutManagedInsightRules</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleDescription withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * If a managed rule is enabled, this is the ARN for the related Amazon Web Services resource.
     * </p>
     * 
     * @param resourceARN
     *        If a managed rule is enabled, this is the ARN for the related Amazon Web Services resource.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * If a managed rule is enabled, this is the ARN for the related Amazon Web Services resource.
     * </p>
     * 
     * @return If a managed rule is enabled, this is the ARN for the related Amazon Web Services resource.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * If a managed rule is enabled, this is the ARN for the related Amazon Web Services resource.
     * </p>
     * 
     * @param resourceARN
     *        If a managed rule is enabled, this is the ARN for the related Amazon Web Services resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleDescription withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * Describes the state of a managed rule. If present, it contains information about the Contributor Insights rule
     * that contains information about the related Amazon Web Services resource.
     * </p>
     * 
     * @param ruleState
     *        Describes the state of a managed rule. If present, it contains information about the Contributor Insights
     *        rule that contains information about the related Amazon Web Services resource.
     */

    public void setRuleState(ManagedRuleState ruleState) {
        this.ruleState = ruleState;
    }

    /**
     * <p>
     * Describes the state of a managed rule. If present, it contains information about the Contributor Insights rule
     * that contains information about the related Amazon Web Services resource.
     * </p>
     * 
     * @return Describes the state of a managed rule. If present, it contains information about the Contributor Insights
     *         rule that contains information about the related Amazon Web Services resource.
     */

    public ManagedRuleState getRuleState() {
        return this.ruleState;
    }

    /**
     * <p>
     * Describes the state of a managed rule. If present, it contains information about the Contributor Insights rule
     * that contains information about the related Amazon Web Services resource.
     * </p>
     * 
     * @param ruleState
     *        Describes the state of a managed rule. If present, it contains information about the Contributor Insights
     *        rule that contains information about the related Amazon Web Services resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleDescription withRuleState(ManagedRuleState ruleState) {
        setRuleState(ruleState);
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getRuleState() != null)
            sb.append("RuleState: ").append(getRuleState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedRuleDescription == false)
            return false;
        ManagedRuleDescription other = (ManagedRuleDescription) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getRuleState() == null ^ this.getRuleState() == null)
            return false;
        if (other.getRuleState() != null && other.getRuleState().equals(this.getRuleState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getRuleState() == null) ? 0 : getRuleState().hashCode());
        return hashCode;
    }

    @Override
    public ManagedRuleDescription clone() {
        try {
            return (ManagedRuleDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
