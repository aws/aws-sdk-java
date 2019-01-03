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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRuleAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResolverRuleAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resolver rule association that you want to get information about.
     * </p>
     */
    private String resolverRuleAssociationId;

    /**
     * <p>
     * The ID of the resolver rule association that you want to get information about.
     * </p>
     * 
     * @param resolverRuleAssociationId
     *        The ID of the resolver rule association that you want to get information about.
     */

    public void setResolverRuleAssociationId(String resolverRuleAssociationId) {
        this.resolverRuleAssociationId = resolverRuleAssociationId;
    }

    /**
     * <p>
     * The ID of the resolver rule association that you want to get information about.
     * </p>
     * 
     * @return The ID of the resolver rule association that you want to get information about.
     */

    public String getResolverRuleAssociationId() {
        return this.resolverRuleAssociationId;
    }

    /**
     * <p>
     * The ID of the resolver rule association that you want to get information about.
     * </p>
     * 
     * @param resolverRuleAssociationId
     *        The ID of the resolver rule association that you want to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResolverRuleAssociationRequest withResolverRuleAssociationId(String resolverRuleAssociationId) {
        setResolverRuleAssociationId(resolverRuleAssociationId);
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
        if (getResolverRuleAssociationId() != null)
            sb.append("ResolverRuleAssociationId: ").append(getResolverRuleAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResolverRuleAssociationRequest == false)
            return false;
        GetResolverRuleAssociationRequest other = (GetResolverRuleAssociationRequest) obj;
        if (other.getResolverRuleAssociationId() == null ^ this.getResolverRuleAssociationId() == null)
            return false;
        if (other.getResolverRuleAssociationId() != null && other.getResolverRuleAssociationId().equals(this.getResolverRuleAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverRuleAssociationId() == null) ? 0 : getResolverRuleAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public GetResolverRuleAssociationRequest clone() {
        return (GetResolverRuleAssociationRequest) super.clone();
    }

}
