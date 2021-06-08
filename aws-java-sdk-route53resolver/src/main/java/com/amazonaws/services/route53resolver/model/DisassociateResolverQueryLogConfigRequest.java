/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverQueryLogConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateResolverQueryLogConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the query logging configuration that you want to disassociate a specified VPC from.
     * </p>
     */
    private String resolverQueryLogConfigId;
    /**
     * <p>
     * The ID of the Amazon VPC that you want to disassociate from a specified query logging configuration.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The ID of the query logging configuration that you want to disassociate a specified VPC from.
     * </p>
     * 
     * @param resolverQueryLogConfigId
     *        The ID of the query logging configuration that you want to disassociate a specified VPC from.
     */

    public void setResolverQueryLogConfigId(String resolverQueryLogConfigId) {
        this.resolverQueryLogConfigId = resolverQueryLogConfigId;
    }

    /**
     * <p>
     * The ID of the query logging configuration that you want to disassociate a specified VPC from.
     * </p>
     * 
     * @return The ID of the query logging configuration that you want to disassociate a specified VPC from.
     */

    public String getResolverQueryLogConfigId() {
        return this.resolverQueryLogConfigId;
    }

    /**
     * <p>
     * The ID of the query logging configuration that you want to disassociate a specified VPC from.
     * </p>
     * 
     * @param resolverQueryLogConfigId
     *        The ID of the query logging configuration that you want to disassociate a specified VPC from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResolverQueryLogConfigRequest withResolverQueryLogConfigId(String resolverQueryLogConfigId) {
        setResolverQueryLogConfigId(resolverQueryLogConfigId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that you want to disassociate from a specified query logging configuration.
     * </p>
     * 
     * @param resourceId
     *        The ID of the Amazon VPC that you want to disassociate from a specified query logging configuration.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that you want to disassociate from a specified query logging configuration.
     * </p>
     * 
     * @return The ID of the Amazon VPC that you want to disassociate from a specified query logging configuration.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that you want to disassociate from a specified query logging configuration.
     * </p>
     * 
     * @param resourceId
     *        The ID of the Amazon VPC that you want to disassociate from a specified query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResolverQueryLogConfigRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
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
        if (getResolverQueryLogConfigId() != null)
            sb.append("ResolverQueryLogConfigId: ").append(getResolverQueryLogConfigId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateResolverQueryLogConfigRequest == false)
            return false;
        DisassociateResolverQueryLogConfigRequest other = (DisassociateResolverQueryLogConfigRequest) obj;
        if (other.getResolverQueryLogConfigId() == null ^ this.getResolverQueryLogConfigId() == null)
            return false;
        if (other.getResolverQueryLogConfigId() != null && other.getResolverQueryLogConfigId().equals(this.getResolverQueryLogConfigId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverQueryLogConfigId() == null) ? 0 : getResolverQueryLogConfigId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateResolverQueryLogConfigRequest clone() {
        return (DisassociateResolverQueryLogConfigRequest) super.clone();
    }

}
