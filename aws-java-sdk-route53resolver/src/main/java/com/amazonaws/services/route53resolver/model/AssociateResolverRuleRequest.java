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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateResolverRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resolver rule that you want to associate with the VPC. To list the existing resolver rules, use
     * <a>ListResolverRules</a>.
     * </p>
     */
    private String resolverRuleId;
    /**
     * <p>
     * A name for the association that you're creating between a resolver rule and a VPC.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the VPC that you want to associate the resolver rule with.
     * </p>
     */
    private String vPCId;

    /**
     * <p>
     * The ID of the resolver rule that you want to associate with the VPC. To list the existing resolver rules, use
     * <a>ListResolverRules</a>.
     * </p>
     * 
     * @param resolverRuleId
     *        The ID of the resolver rule that you want to associate with the VPC. To list the existing resolver rules,
     *        use <a>ListResolverRules</a>.
     */

    public void setResolverRuleId(String resolverRuleId) {
        this.resolverRuleId = resolverRuleId;
    }

    /**
     * <p>
     * The ID of the resolver rule that you want to associate with the VPC. To list the existing resolver rules, use
     * <a>ListResolverRules</a>.
     * </p>
     * 
     * @return The ID of the resolver rule that you want to associate with the VPC. To list the existing resolver rules,
     *         use <a>ListResolverRules</a>.
     */

    public String getResolverRuleId() {
        return this.resolverRuleId;
    }

    /**
     * <p>
     * The ID of the resolver rule that you want to associate with the VPC. To list the existing resolver rules, use
     * <a>ListResolverRules</a>.
     * </p>
     * 
     * @param resolverRuleId
     *        The ID of the resolver rule that you want to associate with the VPC. To list the existing resolver rules,
     *        use <a>ListResolverRules</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResolverRuleRequest withResolverRuleId(String resolverRuleId) {
        setResolverRuleId(resolverRuleId);
        return this;
    }

    /**
     * <p>
     * A name for the association that you're creating between a resolver rule and a VPC.
     * </p>
     * 
     * @param name
     *        A name for the association that you're creating between a resolver rule and a VPC.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the association that you're creating between a resolver rule and a VPC.
     * </p>
     * 
     * @return A name for the association that you're creating between a resolver rule and a VPC.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the association that you're creating between a resolver rule and a VPC.
     * </p>
     * 
     * @param name
     *        A name for the association that you're creating between a resolver rule and a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResolverRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC that you want to associate the resolver rule with.
     * </p>
     * 
     * @param vPCId
     *        The ID of the VPC that you want to associate the resolver rule with.
     */

    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }

    /**
     * <p>
     * The ID of the VPC that you want to associate the resolver rule with.
     * </p>
     * 
     * @return The ID of the VPC that you want to associate the resolver rule with.
     */

    public String getVPCId() {
        return this.vPCId;
    }

    /**
     * <p>
     * The ID of the VPC that you want to associate the resolver rule with.
     * </p>
     * 
     * @param vPCId
     *        The ID of the VPC that you want to associate the resolver rule with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResolverRuleRequest withVPCId(String vPCId) {
        setVPCId(vPCId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVPCId() != null)
            sb.append("VPCId: ").append(getVPCId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateResolverRuleRequest == false)
            return false;
        AssociateResolverRuleRequest other = (AssociateResolverRuleRequest) obj;
        if (other.getResolverRuleId() == null ^ this.getResolverRuleId() == null)
            return false;
        if (other.getResolverRuleId() != null && other.getResolverRuleId().equals(this.getResolverRuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVPCId() == null ^ this.getVPCId() == null)
            return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverRuleId() == null) ? 0 : getResolverRuleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateResolverRuleRequest clone() {
        return (AssociateResolverRuleRequest) super.clone();
    }

}
