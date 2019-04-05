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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeSSLPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSSLPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the policies.
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
     * The names of the policies.
     * </p>
     * 
     * @return The names of the policies.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * The names of the policies.
     * </p>
     * 
     * @param names
     *        The names of the policies.
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
     * The names of the policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        The names of the policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSSLPoliciesRequest withNames(String... names) {
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
     * The names of the policies.
     * </p>
     * 
     * @param names
     *        The names of the policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSSLPoliciesRequest withNames(java.util.Collection<String> names) {
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

    public DescribeSSLPoliciesRequest withMarker(String marker) {
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

    public DescribeSSLPoliciesRequest withPageSize(Integer pageSize) {
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

        if (obj instanceof DescribeSSLPoliciesRequest == false)
            return false;
        DescribeSSLPoliciesRequest other = (DescribeSSLPoliciesRequest) obj;
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

        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSSLPoliciesRequest clone() {
        return (DescribeSSLPoliciesRequest) super.clone();
    }

}
