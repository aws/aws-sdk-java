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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRulePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResolverRulePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the resolver rule policy that you specified in a <code>GetResolverRulePolicy</code> request.
     * </p>
     */
    private String resolverRulePolicy;

    /**
     * <p>
     * Information about the resolver rule policy that you specified in a <code>GetResolverRulePolicy</code> request.
     * </p>
     * 
     * @param resolverRulePolicy
     *        Information about the resolver rule policy that you specified in a <code>GetResolverRulePolicy</code>
     *        request.
     */

    public void setResolverRulePolicy(String resolverRulePolicy) {
        this.resolverRulePolicy = resolverRulePolicy;
    }

    /**
     * <p>
     * Information about the resolver rule policy that you specified in a <code>GetResolverRulePolicy</code> request.
     * </p>
     * 
     * @return Information about the resolver rule policy that you specified in a <code>GetResolverRulePolicy</code>
     *         request.
     */

    public String getResolverRulePolicy() {
        return this.resolverRulePolicy;
    }

    /**
     * <p>
     * Information about the resolver rule policy that you specified in a <code>GetResolverRulePolicy</code> request.
     * </p>
     * 
     * @param resolverRulePolicy
     *        Information about the resolver rule policy that you specified in a <code>GetResolverRulePolicy</code>
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResolverRulePolicyResult withResolverRulePolicy(String resolverRulePolicy) {
        setResolverRulePolicy(resolverRulePolicy);
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
        if (getResolverRulePolicy() != null)
            sb.append("ResolverRulePolicy: ").append(getResolverRulePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResolverRulePolicyResult == false)
            return false;
        GetResolverRulePolicyResult other = (GetResolverRulePolicyResult) obj;
        if (other.getResolverRulePolicy() == null ^ this.getResolverRulePolicy() == null)
            return false;
        if (other.getResolverRulePolicy() != null && other.getResolverRulePolicy().equals(this.getResolverRulePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverRulePolicy() == null) ? 0 : getResolverRulePolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetResolverRulePolicyResult clone() {
        try {
            return (GetResolverRulePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
