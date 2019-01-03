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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeElasticLoadBalancers</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeElasticLoadBalancers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeElasticLoadBalancersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>ElasticLoadBalancer</code> objects that describe the specified Elastic Load Balancing instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ElasticLoadBalancer> elasticLoadBalancers;

    /**
     * <p>
     * A list of <code>ElasticLoadBalancer</code> objects that describe the specified Elastic Load Balancing instances.
     * </p>
     * 
     * @return A list of <code>ElasticLoadBalancer</code> objects that describe the specified Elastic Load Balancing
     *         instances.
     */

    public java.util.List<ElasticLoadBalancer> getElasticLoadBalancers() {
        if (elasticLoadBalancers == null) {
            elasticLoadBalancers = new com.amazonaws.internal.SdkInternalList<ElasticLoadBalancer>();
        }
        return elasticLoadBalancers;
    }

    /**
     * <p>
     * A list of <code>ElasticLoadBalancer</code> objects that describe the specified Elastic Load Balancing instances.
     * </p>
     * 
     * @param elasticLoadBalancers
     *        A list of <code>ElasticLoadBalancer</code> objects that describe the specified Elastic Load Balancing
     *        instances.
     */

    public void setElasticLoadBalancers(java.util.Collection<ElasticLoadBalancer> elasticLoadBalancers) {
        if (elasticLoadBalancers == null) {
            this.elasticLoadBalancers = null;
            return;
        }

        this.elasticLoadBalancers = new com.amazonaws.internal.SdkInternalList<ElasticLoadBalancer>(elasticLoadBalancers);
    }

    /**
     * <p>
     * A list of <code>ElasticLoadBalancer</code> objects that describe the specified Elastic Load Balancing instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticLoadBalancers(java.util.Collection)} or {@link #withElasticLoadBalancers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param elasticLoadBalancers
     *        A list of <code>ElasticLoadBalancer</code> objects that describe the specified Elastic Load Balancing
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticLoadBalancersResult withElasticLoadBalancers(ElasticLoadBalancer... elasticLoadBalancers) {
        if (this.elasticLoadBalancers == null) {
            setElasticLoadBalancers(new com.amazonaws.internal.SdkInternalList<ElasticLoadBalancer>(elasticLoadBalancers.length));
        }
        for (ElasticLoadBalancer ele : elasticLoadBalancers) {
            this.elasticLoadBalancers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ElasticLoadBalancer</code> objects that describe the specified Elastic Load Balancing instances.
     * </p>
     * 
     * @param elasticLoadBalancers
     *        A list of <code>ElasticLoadBalancer</code> objects that describe the specified Elastic Load Balancing
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticLoadBalancersResult withElasticLoadBalancers(java.util.Collection<ElasticLoadBalancer> elasticLoadBalancers) {
        setElasticLoadBalancers(elasticLoadBalancers);
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
        if (getElasticLoadBalancers() != null)
            sb.append("ElasticLoadBalancers: ").append(getElasticLoadBalancers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticLoadBalancersResult == false)
            return false;
        DescribeElasticLoadBalancersResult other = (DescribeElasticLoadBalancersResult) obj;
        if (other.getElasticLoadBalancers() == null ^ this.getElasticLoadBalancers() == null)
            return false;
        if (other.getElasticLoadBalancers() != null && other.getElasticLoadBalancers().equals(this.getElasticLoadBalancers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElasticLoadBalancers() == null) ? 0 : getElasticLoadBalancers().hashCode());
        return hashCode;
    }

    @Override
    public DescribeElasticLoadBalancersResult clone() {
        try {
            return (DescribeElasticLoadBalancersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
