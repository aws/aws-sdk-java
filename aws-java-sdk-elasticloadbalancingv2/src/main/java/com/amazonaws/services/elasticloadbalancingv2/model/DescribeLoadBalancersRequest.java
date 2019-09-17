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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeLoadBalancers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoadBalancersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
     * </p>
     */
    private java.util.List<String> loadBalancerArns;
    /**
     * <p>
     * The names of the load balancers.
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of results to return with this call.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a
     *         single call.
     */

    public java.util.List<String> getLoadBalancerArns() {
        return loadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
     * </p>
     * 
     * @param loadBalancerArns
     *        The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single
     *        call.
     */

    public void setLoadBalancerArns(java.util.Collection<String> loadBalancerArns) {
        if (loadBalancerArns == null) {
            this.loadBalancerArns = null;
            return;
        }

        this.loadBalancerArns = new java.util.ArrayList<String>(loadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancerArns(java.util.Collection)} or {@link #withLoadBalancerArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param loadBalancerArns
     *        The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single
     *        call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancersRequest withLoadBalancerArns(String... loadBalancerArns) {
        if (this.loadBalancerArns == null) {
            setLoadBalancerArns(new java.util.ArrayList<String>(loadBalancerArns.length));
        }
        for (String ele : loadBalancerArns) {
            this.loadBalancerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
     * </p>
     * 
     * @param loadBalancerArns
     *        The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single
     *        call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancersRequest withLoadBalancerArns(java.util.Collection<String> loadBalancerArns) {
        setLoadBalancerArns(loadBalancerArns);
        return this;
    }

    /**
     * <p>
     * The names of the load balancers.
     * </p>
     * 
     * @return The names of the load balancers.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * The names of the load balancers.
     * </p>
     * 
     * @param names
     *        The names of the load balancers.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * The names of the load balancers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        The names of the load balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancersRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the load balancers.
     * </p>
     * 
     * @param names
     *        The names of the load balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancersRequest withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. (You received this marker from a previous call.)
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @return The marker for the next set of results. (You received this marker from a previous call.)
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. (You received this marker from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancersRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of results to return with this call.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of results to return with this call.
     * </p>
     * 
     * @return The maximum number of results to return with this call.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of results to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of results to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancersRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
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
        if (getLoadBalancerArns() != null)
            sb.append("LoadBalancerArns: ").append(getLoadBalancerArns()).append(",");
        if (getNames() != null)
            sb.append("Names: ").append(getNames()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancersRequest == false)
            return false;
        DescribeLoadBalancersRequest other = (DescribeLoadBalancersRequest) obj;
        if (other.getLoadBalancerArns() == null ^ this.getLoadBalancerArns() == null)
            return false;
        if (other.getLoadBalancerArns() != null && other.getLoadBalancerArns().equals(this.getLoadBalancerArns()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerArns() == null) ? 0 : getLoadBalancerArns().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLoadBalancersRequest clone() {
        return (DescribeLoadBalancersRequest) super.clone();
    }

}
