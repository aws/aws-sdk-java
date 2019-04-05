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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLoadBalancersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of LoadBalancer objects describing your load balancers.
     * </p>
     */
    private java.util.List<LoadBalancer> loadBalancers;
    /**
     * <p>
     * A token used for advancing to the next page of results from your GetLoadBalancers request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of LoadBalancer objects describing your load balancers.
     * </p>
     * 
     * @return An array of LoadBalancer objects describing your load balancers.
     */

    public java.util.List<LoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * <p>
     * An array of LoadBalancer objects describing your load balancers.
     * </p>
     * 
     * @param loadBalancers
     *        An array of LoadBalancer objects describing your load balancers.
     */

    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new java.util.ArrayList<LoadBalancer>(loadBalancers);
    }

    /**
     * <p>
     * An array of LoadBalancer objects describing your load balancers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancers(java.util.Collection)} or {@link #withLoadBalancers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param loadBalancers
     *        An array of LoadBalancer objects describing your load balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoadBalancersResult withLoadBalancers(LoadBalancer... loadBalancers) {
        if (this.loadBalancers == null) {
            setLoadBalancers(new java.util.ArrayList<LoadBalancer>(loadBalancers.length));
        }
        for (LoadBalancer ele : loadBalancers) {
            this.loadBalancers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of LoadBalancer objects describing your load balancers.
     * </p>
     * 
     * @param loadBalancers
     *        An array of LoadBalancer objects describing your load balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoadBalancersResult withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your GetLoadBalancers request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your GetLoadBalancers request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your GetLoadBalancers request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your GetLoadBalancers request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your GetLoadBalancers request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your GetLoadBalancers request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoadBalancersResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getLoadBalancers() != null)
            sb.append("LoadBalancers: ").append(getLoadBalancers()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLoadBalancersResult == false)
            return false;
        GetLoadBalancersResult other = (GetLoadBalancersResult) obj;
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetLoadBalancersResult clone() {
        try {
            return (GetLoadBalancersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
