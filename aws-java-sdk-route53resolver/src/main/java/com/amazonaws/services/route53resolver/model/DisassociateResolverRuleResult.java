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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateResolverRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <code>DisassociateResolverRule</code> request, including the status of the request.
     * </p>
     */
    private ResolverRuleAssociation resolverRuleAssociation;

    /**
     * <p>
     * Information about the <code>DisassociateResolverRule</code> request, including the status of the request.
     * </p>
     * 
     * @param resolverRuleAssociation
     *        Information about the <code>DisassociateResolverRule</code> request, including the status of the request.
     */

    public void setResolverRuleAssociation(ResolverRuleAssociation resolverRuleAssociation) {
        this.resolverRuleAssociation = resolverRuleAssociation;
    }

    /**
     * <p>
     * Information about the <code>DisassociateResolverRule</code> request, including the status of the request.
     * </p>
     * 
     * @return Information about the <code>DisassociateResolverRule</code> request, including the status of the request.
     */

    public ResolverRuleAssociation getResolverRuleAssociation() {
        return this.resolverRuleAssociation;
    }

    /**
     * <p>
     * Information about the <code>DisassociateResolverRule</code> request, including the status of the request.
     * </p>
     * 
     * @param resolverRuleAssociation
     *        Information about the <code>DisassociateResolverRule</code> request, including the status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResolverRuleResult withResolverRuleAssociation(ResolverRuleAssociation resolverRuleAssociation) {
        setResolverRuleAssociation(resolverRuleAssociation);
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
        if (getResolverRuleAssociation() != null)
            sb.append("ResolverRuleAssociation: ").append(getResolverRuleAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateResolverRuleResult == false)
            return false;
        DisassociateResolverRuleResult other = (DisassociateResolverRuleResult) obj;
        if (other.getResolverRuleAssociation() == null ^ this.getResolverRuleAssociation() == null)
            return false;
        if (other.getResolverRuleAssociation() != null && other.getResolverRuleAssociation().equals(this.getResolverRuleAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverRuleAssociation() == null) ? 0 : getResolverRuleAssociation().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateResolverRuleResult clone() {
        try {
            return (DisassociateResolverRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
