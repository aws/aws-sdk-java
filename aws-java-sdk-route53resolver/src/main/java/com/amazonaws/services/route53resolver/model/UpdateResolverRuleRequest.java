/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResolverRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resolver rule that you want to update.
     * </p>
     */
    private String resolverRuleId;
    /**
     * <p>
     * The new settings for the resolver rule.
     * </p>
     */
    private ResolverRuleConfig config;

    /**
     * <p>
     * The ID of the resolver rule that you want to update.
     * </p>
     * 
     * @param resolverRuleId
     *        The ID of the resolver rule that you want to update.
     */

    public void setResolverRuleId(String resolverRuleId) {
        this.resolverRuleId = resolverRuleId;
    }

    /**
     * <p>
     * The ID of the resolver rule that you want to update.
     * </p>
     * 
     * @return The ID of the resolver rule that you want to update.
     */

    public String getResolverRuleId() {
        return this.resolverRuleId;
    }

    /**
     * <p>
     * The ID of the resolver rule that you want to update.
     * </p>
     * 
     * @param resolverRuleId
     *        The ID of the resolver rule that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResolverRuleRequest withResolverRuleId(String resolverRuleId) {
        setResolverRuleId(resolverRuleId);
        return this;
    }

    /**
     * <p>
     * The new settings for the resolver rule.
     * </p>
     * 
     * @param config
     *        The new settings for the resolver rule.
     */

    public void setConfig(ResolverRuleConfig config) {
        this.config = config;
    }

    /**
     * <p>
     * The new settings for the resolver rule.
     * </p>
     * 
     * @return The new settings for the resolver rule.
     */

    public ResolverRuleConfig getConfig() {
        return this.config;
    }

    /**
     * <p>
     * The new settings for the resolver rule.
     * </p>
     * 
     * @param config
     *        The new settings for the resolver rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResolverRuleRequest withConfig(ResolverRuleConfig config) {
        setConfig(config);
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
        if (getResolverRuleId() != null)
            sb.append("ResolverRuleId: ").append(getResolverRuleId()).append(",");
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResolverRuleRequest == false)
            return false;
        UpdateResolverRuleRequest other = (UpdateResolverRuleRequest) obj;
        if (other.getResolverRuleId() == null ^ this.getResolverRuleId() == null)
            return false;
        if (other.getResolverRuleId() != null && other.getResolverRuleId().equals(this.getResolverRuleId()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverRuleId() == null) ? 0 : getResolverRuleId().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResolverRuleRequest clone() {
        return (UpdateResolverRuleRequest) super.clone();
    }

}
