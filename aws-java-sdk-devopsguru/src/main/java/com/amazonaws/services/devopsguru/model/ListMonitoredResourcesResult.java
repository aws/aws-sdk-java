/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListMonitoredResources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMonitoredResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the resource that is being monitored, including the name of the resource, the type of resource,
     * and whether or not permission is given to DevOps Guru to access that resource.
     * </p>
     */
    private java.util.List<MonitoredResourceIdentifier> monitoredResourceIdentifiers;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the resource that is being monitored, including the name of the resource, the type of resource,
     * and whether or not permission is given to DevOps Guru to access that resource.
     * </p>
     * 
     * @return Information about the resource that is being monitored, including the name of the resource, the type of
     *         resource, and whether or not permission is given to DevOps Guru to access that resource.
     */

    public java.util.List<MonitoredResourceIdentifier> getMonitoredResourceIdentifiers() {
        return monitoredResourceIdentifiers;
    }

    /**
     * <p>
     * Information about the resource that is being monitored, including the name of the resource, the type of resource,
     * and whether or not permission is given to DevOps Guru to access that resource.
     * </p>
     * 
     * @param monitoredResourceIdentifiers
     *        Information about the resource that is being monitored, including the name of the resource, the type of
     *        resource, and whether or not permission is given to DevOps Guru to access that resource.
     */

    public void setMonitoredResourceIdentifiers(java.util.Collection<MonitoredResourceIdentifier> monitoredResourceIdentifiers) {
        if (monitoredResourceIdentifiers == null) {
            this.monitoredResourceIdentifiers = null;
            return;
        }

        this.monitoredResourceIdentifiers = new java.util.ArrayList<MonitoredResourceIdentifier>(monitoredResourceIdentifiers);
    }

    /**
     * <p>
     * Information about the resource that is being monitored, including the name of the resource, the type of resource,
     * and whether or not permission is given to DevOps Guru to access that resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitoredResourceIdentifiers(java.util.Collection)} or
     * {@link #withMonitoredResourceIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param monitoredResourceIdentifiers
     *        Information about the resource that is being monitored, including the name of the resource, the type of
     *        resource, and whether or not permission is given to DevOps Guru to access that resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoredResourcesResult withMonitoredResourceIdentifiers(MonitoredResourceIdentifier... monitoredResourceIdentifiers) {
        if (this.monitoredResourceIdentifiers == null) {
            setMonitoredResourceIdentifiers(new java.util.ArrayList<MonitoredResourceIdentifier>(monitoredResourceIdentifiers.length));
        }
        for (MonitoredResourceIdentifier ele : monitoredResourceIdentifiers) {
            this.monitoredResourceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource that is being monitored, including the name of the resource, the type of resource,
     * and whether or not permission is given to DevOps Guru to access that resource.
     * </p>
     * 
     * @param monitoredResourceIdentifiers
     *        Information about the resource that is being monitored, including the name of the resource, the type of
     *        resource, and whether or not permission is given to DevOps Guru to access that resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoredResourcesResult withMonitoredResourceIdentifiers(java.util.Collection<MonitoredResourceIdentifier> monitoredResourceIdentifiers) {
        setMonitoredResourceIdentifiers(monitoredResourceIdentifiers);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoredResourcesResult withNextToken(String nextToken) {
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
        if (getMonitoredResourceIdentifiers() != null)
            sb.append("MonitoredResourceIdentifiers: ").append(getMonitoredResourceIdentifiers()).append(",");
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

        if (obj instanceof ListMonitoredResourcesResult == false)
            return false;
        ListMonitoredResourcesResult other = (ListMonitoredResourcesResult) obj;
        if (other.getMonitoredResourceIdentifiers() == null ^ this.getMonitoredResourceIdentifiers() == null)
            return false;
        if (other.getMonitoredResourceIdentifiers() != null && other.getMonitoredResourceIdentifiers().equals(this.getMonitoredResourceIdentifiers()) == false)
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

        hashCode = prime * hashCode + ((getMonitoredResourceIdentifiers() == null) ? 0 : getMonitoredResourceIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMonitoredResourcesResult clone() {
        try {
            return (ListMonitoredResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
