/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * 
 */
public class ListServicesResult implements Serializable, Cloneable {

    /**
     * The list of full Amazon Resource Name (ARN) entries for each service
     * associated with the specified cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceArns;

    /**
     * The <code>nextToken</code> value to include in a future
     * <code>ListServices</code> request. When the results of a
     * <code>ListServices</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * The list of full Amazon Resource Name (ARN) entries for each service
     * associated with the specified cluster.
     *
     * @return The list of full Amazon Resource Name (ARN) entries for each service
     *         associated with the specified cluster.
     */
    public java.util.List<String> getServiceArns() {
        if (serviceArns == null) {
              serviceArns = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              serviceArns.setAutoConstruct(true);
        }
        return serviceArns;
    }
    
    /**
     * The list of full Amazon Resource Name (ARN) entries for each service
     * associated with the specified cluster.
     *
     * @param serviceArns The list of full Amazon Resource Name (ARN) entries for each service
     *         associated with the specified cluster.
     */
    public void setServiceArns(java.util.Collection<String> serviceArns) {
        if (serviceArns == null) {
            this.serviceArns = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(serviceArns.size());
        serviceArnsCopy.addAll(serviceArns);
        this.serviceArns = serviceArnsCopy;
    }
    
    /**
     * The list of full Amazon Resource Name (ARN) entries for each service
     * associated with the specified cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceArns The list of full Amazon Resource Name (ARN) entries for each service
     *         associated with the specified cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListServicesResult withServiceArns(String... serviceArns) {
        if (getServiceArns() == null) setServiceArns(new java.util.ArrayList<String>(serviceArns.length));
        for (String value : serviceArns) {
            getServiceArns().add(value);
        }
        return this;
    }
    
    /**
     * The list of full Amazon Resource Name (ARN) entries for each service
     * associated with the specified cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceArns The list of full Amazon Resource Name (ARN) entries for each service
     *         associated with the specified cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListServicesResult withServiceArns(java.util.Collection<String> serviceArns) {
        if (serviceArns == null) {
            this.serviceArns = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(serviceArns.size());
            serviceArnsCopy.addAll(serviceArns);
            this.serviceArns = serviceArnsCopy;
        }

        return this;
    }

    /**
     * The <code>nextToken</code> value to include in a future
     * <code>ListServices</code> request. When the results of a
     * <code>ListServices</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The <code>nextToken</code> value to include in a future
     *         <code>ListServices</code> request. When the results of a
     *         <code>ListServices</code> request exceed <code>maxResults</code>, this
     *         value can be used to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <code>nextToken</code> value to include in a future
     * <code>ListServices</code> request. When the results of a
     * <code>ListServices</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The <code>nextToken</code> value to include in a future
     *         <code>ListServices</code> request. When the results of a
     *         <code>ListServices</code> request exceed <code>maxResults</code>, this
     *         value can be used to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <code>nextToken</code> value to include in a future
     * <code>ListServices</code> request. When the results of a
     * <code>ListServices</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The <code>nextToken</code> value to include in a future
     *         <code>ListServices</code> request. When the results of a
     *         <code>ListServices</code> request exceed <code>maxResults</code>, this
     *         value can be used to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListServicesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServiceArns() != null) sb.append("ServiceArns: " + getServiceArns() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getServiceArns() == null) ? 0 : getServiceArns().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListServicesResult == false) return false;
        ListServicesResult other = (ListServicesResult)obj;
        
        if (other.getServiceArns() == null ^ this.getServiceArns() == null) return false;
        if (other.getServiceArns() != null && other.getServiceArns().equals(this.getServiceArns()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListServicesResult clone() {
        try {
            return (ListServicesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    