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
 * Details about an WAFv2 rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafv2RuleGroupDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafv2RuleGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     */
    private Long capacity;
    /**
     * <p>
     * A description of the rule group that helps with identification.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique identifier for the rule group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the rule group. You cannot change the name of a rule group after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes
     * one top-level statement that WAF uses to identify matching web requests, and parameters that govern how WAF
     * handles them.
     * </p>
     */
    private java.util.List<AwsWafv2RulesDetails> rules;
    /**
     * <p>
     * Specifies whether the rule group is for an Amazon CloudFront distribution or for a regional application. A
     * regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync
     * GraphQL API, or an Amazon Cognito user pool.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     */
    private AwsWafv2VisibilityConfigDetails visibilityConfig;

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) required for this rule group.
     */

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     * 
     * @return The web ACL capacity units (WCUs) required for this rule group.
     */

    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) required for this rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RuleGroupDetails withCapacity(Long capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * A description of the rule group that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the rule group that helps with identification.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the rule group that helps with identification.
     * </p>
     * 
     * @return A description of the rule group that helps with identification.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the rule group that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the rule group that helps with identification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RuleGroupDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the rule group.
     * </p>
     * 
     * @param id
     *        A unique identifier for the rule group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the rule group.
     * </p>
     * 
     * @return A unique identifier for the rule group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the rule group.
     * </p>
     * 
     * @param id
     *        A unique identifier for the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RuleGroupDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the rule group. You cannot change the name of a rule group after you create it.
     * </p>
     * 
     * @param name
     *        The name of the rule group. You cannot change the name of a rule group after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule group. You cannot change the name of a rule group after you create it.
     * </p>
     * 
     * @return The name of the rule group. You cannot change the name of a rule group after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule group. You cannot change the name of a rule group after you create it.
     * </p>
     * 
     * @param name
     *        The name of the rule group. You cannot change the name of a rule group after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RuleGroupDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the entity.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the entity.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RuleGroupDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes
     * one top-level statement that WAF uses to identify matching web requests, and parameters that govern how WAF
     * handles them.
     * </p>
     * 
     * @return The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule
     *         includes one top-level statement that WAF uses to identify matching web requests, and parameters that
     *         govern how WAF handles them.
     */

    public java.util.List<AwsWafv2RulesDetails> getRules() {
        return rules;
    }

    /**
     * <p>
     * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes
     * one top-level statement that WAF uses to identify matching web requests, and parameters that govern how WAF
     * handles them.
     * </p>
     * 
     * @param rules
     *        The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule
     *        includes one top-level statement that WAF uses to identify matching web requests, and parameters that
     *        govern how WAF handles them.
     */

    public void setRules(java.util.Collection<AwsWafv2RulesDetails> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<AwsWafv2RulesDetails>(rules);
    }

    /**
     * <p>
     * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes
     * one top-level statement that WAF uses to identify matching web requests, and parameters that govern how WAF
     * handles them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule
     *        includes one top-level statement that WAF uses to identify matching web requests, and parameters that
     *        govern how WAF handles them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RuleGroupDetails withRules(AwsWafv2RulesDetails... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<AwsWafv2RulesDetails>(rules.length));
        }
        for (AwsWafv2RulesDetails ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes
     * one top-level statement that WAF uses to identify matching web requests, and parameters that govern how WAF
     * handles them.
     * </p>
     * 
     * @param rules
     *        The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule
     *        includes one top-level statement that WAF uses to identify matching web requests, and parameters that
     *        govern how WAF handles them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RuleGroupDetails withRules(java.util.Collection<AwsWafv2RulesDetails> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule group is for an Amazon CloudFront distribution or for a regional application. A
     * regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync
     * GraphQL API, or an Amazon Cognito user pool.
     * </p>
     * 
     * @param scope
     *        Specifies whether the rule group is for an Amazon CloudFront distribution or for a regional application. A
     *        regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync
     *        GraphQL API, or an Amazon Cognito user pool.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Specifies whether the rule group is for an Amazon CloudFront distribution or for a regional application. A
     * regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync
     * GraphQL API, or an Amazon Cognito user pool.
     * </p>
     * 
     * @return Specifies whether the rule group is for an Amazon CloudFront distribution or for a regional application.
     *         A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an
     *         AppSync GraphQL API, or an Amazon Cognito user pool.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Specifies whether the rule group is for an Amazon CloudFront distribution or for a regional application. A
     * regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync
     * GraphQL API, or an Amazon Cognito user pool.
     * </p>
     * 
     * @param scope
     *        Specifies whether the rule group is for an Amazon CloudFront distribution or for a regional application. A
     *        regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync
     *        GraphQL API, or an Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RuleGroupDetails withScope(String scope) {
        setScope(scope);
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

    public void setVisibilityConfig(AwsWafv2VisibilityConfigDetails visibilityConfig) {
        this.visibilityConfig = visibilityConfig;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection.
     */

    public AwsWafv2VisibilityConfigDetails getVisibilityConfig() {
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

    public AwsWafv2RuleGroupDetails withVisibilityConfig(AwsWafv2VisibilityConfigDetails visibilityConfig) {
        setVisibilityConfig(visibilityConfig);
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
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getVisibilityConfig() != null)
            sb.append("VisibilityConfig: ").append(getVisibilityConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafv2RuleGroupDetails == false)
            return false;
        AwsWafv2RuleGroupDetails other = (AwsWafv2RuleGroupDetails) obj;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getVisibilityConfig() == null ^ this.getVisibilityConfig() == null)
            return false;
        if (other.getVisibilityConfig() != null && other.getVisibilityConfig().equals(this.getVisibilityConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getVisibilityConfig() == null) ? 0 : getVisibilityConfig().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafv2RuleGroupDetails clone() {
        try {
            return (AwsWafv2RuleGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafv2RuleGroupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
