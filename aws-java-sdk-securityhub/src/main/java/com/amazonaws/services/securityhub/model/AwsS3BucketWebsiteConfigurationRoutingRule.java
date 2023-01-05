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
 * A rule for redirecting requests to the website.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketWebsiteConfigurationRoutingRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketWebsiteConfigurationRoutingRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides the condition that must be met in order to apply the routing rule.
     * </p>
     */
    private AwsS3BucketWebsiteConfigurationRoutingRuleCondition condition;
    /**
     * <p>
     * Provides the rules to redirect the request if the condition in <code>Condition</code> is met.
     * </p>
     */
    private AwsS3BucketWebsiteConfigurationRoutingRuleRedirect redirect;

    /**
     * <p>
     * Provides the condition that must be met in order to apply the routing rule.
     * </p>
     * 
     * @param condition
     *        Provides the condition that must be met in order to apply the routing rule.
     */

    public void setCondition(AwsS3BucketWebsiteConfigurationRoutingRuleCondition condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * Provides the condition that must be met in order to apply the routing rule.
     * </p>
     * 
     * @return Provides the condition that must be met in order to apply the routing rule.
     */

    public AwsS3BucketWebsiteConfigurationRoutingRuleCondition getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * Provides the condition that must be met in order to apply the routing rule.
     * </p>
     * 
     * @param condition
     *        Provides the condition that must be met in order to apply the routing rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfigurationRoutingRule withCondition(AwsS3BucketWebsiteConfigurationRoutingRuleCondition condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * Provides the rules to redirect the request if the condition in <code>Condition</code> is met.
     * </p>
     * 
     * @param redirect
     *        Provides the rules to redirect the request if the condition in <code>Condition</code> is met.
     */

    public void setRedirect(AwsS3BucketWebsiteConfigurationRoutingRuleRedirect redirect) {
        this.redirect = redirect;
    }

    /**
     * <p>
     * Provides the rules to redirect the request if the condition in <code>Condition</code> is met.
     * </p>
     * 
     * @return Provides the rules to redirect the request if the condition in <code>Condition</code> is met.
     */

    public AwsS3BucketWebsiteConfigurationRoutingRuleRedirect getRedirect() {
        return this.redirect;
    }

    /**
     * <p>
     * Provides the rules to redirect the request if the condition in <code>Condition</code> is met.
     * </p>
     * 
     * @param redirect
     *        Provides the rules to redirect the request if the condition in <code>Condition</code> is met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfigurationRoutingRule withRedirect(AwsS3BucketWebsiteConfigurationRoutingRuleRedirect redirect) {
        setRedirect(redirect);
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
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getRedirect() != null)
            sb.append("Redirect: ").append(getRedirect());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketWebsiteConfigurationRoutingRule == false)
            return false;
        AwsS3BucketWebsiteConfigurationRoutingRule other = (AwsS3BucketWebsiteConfigurationRoutingRule) obj;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getRedirect() == null ^ this.getRedirect() == null)
            return false;
        if (other.getRedirect() != null && other.getRedirect().equals(this.getRedirect()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getRedirect() == null) ? 0 : getRedirect().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketWebsiteConfigurationRoutingRule clone() {
        try {
            return (AwsS3BucketWebsiteConfigurationRoutingRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketWebsiteConfigurationRoutingRuleMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
