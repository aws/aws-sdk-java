/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListServiceVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the service for which you're requesting supported versions.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * A list of names and versions of dependant services of the requested service.
     * </p>
     */
    private java.util.List<DependentService> dependentServices;
    /**
     * <p>
     * The maximum number of <code>ListServiceVersions</code> objects to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for the next list of returned
     * <code>ListServiceVersionsRequest</code> versions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the service for which you're requesting supported versions.
     * </p>
     * 
     * @param serviceName
     *        The name of the service for which you're requesting supported versions.
     * @see ServiceName
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service for which you're requesting supported versions.
     * </p>
     * 
     * @return The name of the service for which you're requesting supported versions.
     * @see ServiceName
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service for which you're requesting supported versions.
     * </p>
     * 
     * @param serviceName
     *        The name of the service for which you're requesting supported versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceName
     */

    public ListServiceVersionsRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The name of the service for which you're requesting supported versions.
     * </p>
     * 
     * @param serviceName
     *        The name of the service for which you're requesting supported versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceName
     */

    public ListServiceVersionsRequest withServiceName(ServiceName serviceName) {
        this.serviceName = serviceName.toString();
        return this;
    }

    /**
     * <p>
     * A list of names and versions of dependant services of the requested service.
     * </p>
     * 
     * @return A list of names and versions of dependant services of the requested service.
     */

    public java.util.List<DependentService> getDependentServices() {
        return dependentServices;
    }

    /**
     * <p>
     * A list of names and versions of dependant services of the requested service.
     * </p>
     * 
     * @param dependentServices
     *        A list of names and versions of dependant services of the requested service.
     */

    public void setDependentServices(java.util.Collection<DependentService> dependentServices) {
        if (dependentServices == null) {
            this.dependentServices = null;
            return;
        }

        this.dependentServices = new java.util.ArrayList<DependentService>(dependentServices);
    }

    /**
     * <p>
     * A list of names and versions of dependant services of the requested service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependentServices(java.util.Collection)} or {@link #withDependentServices(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dependentServices
     *        A list of names and versions of dependant services of the requested service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceVersionsRequest withDependentServices(DependentService... dependentServices) {
        if (this.dependentServices == null) {
            setDependentServices(new java.util.ArrayList<DependentService>(dependentServices.length));
        }
        for (DependentService ele : dependentServices) {
            this.dependentServices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names and versions of dependant services of the requested service.
     * </p>
     * 
     * @param dependentServices
     *        A list of names and versions of dependant services of the requested service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceVersionsRequest withDependentServices(java.util.Collection<DependentService> dependentServices) {
        setDependentServices(dependentServices);
        return this;
    }

    /**
     * <p>
     * The maximum number of <code>ListServiceVersions</code> objects to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of <code>ListServiceVersions</code> objects to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of <code>ListServiceVersions</code> objects to return.
     * </p>
     * 
     * @return The maximum number of <code>ListServiceVersions</code> objects to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of <code>ListServiceVersions</code> objects to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of <code>ListServiceVersions</code> objects to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for the next list of returned
     * <code>ListServiceVersionsRequest</code> versions.
     * </p>
     * 
     * @param nextToken
     *        Because HTTP requests are stateless, this is the starting point for the next list of returned
     *        <code>ListServiceVersionsRequest</code> versions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for the next list of returned
     * <code>ListServiceVersionsRequest</code> versions.
     * </p>
     * 
     * @return Because HTTP requests are stateless, this is the starting point for the next list of returned
     *         <code>ListServiceVersionsRequest</code> versions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for the next list of returned
     * <code>ListServiceVersionsRequest</code> versions.
     * </p>
     * 
     * @param nextToken
     *        Because HTTP requests are stateless, this is the starting point for the next list of returned
     *        <code>ListServiceVersionsRequest</code> versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getDependentServices() != null)
            sb.append("DependentServices: ").append(getDependentServices()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceVersionsRequest == false)
            return false;
        ListServiceVersionsRequest other = (ListServiceVersionsRequest) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getDependentServices() == null ^ this.getDependentServices() == null)
            return false;
        if (other.getDependentServices() != null && other.getDependentServices().equals(this.getDependentServices()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getDependentServices() == null) ? 0 : getDependentServices().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceVersionsRequest clone() {
        return (ListServiceVersionsRequest) super.clone();
    }

}
