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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token to indicate the location of the next service instance in the array of service instances, after the
     * current requested list of service instances.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of service instances with summaries of detail data.
     * </p>
     */
    private java.util.List<ServiceInstanceSummary> serviceInstances;

    /**
     * <p>
     * A token to indicate the location of the next service instance in the array of service instances, after the
     * current requested list of service instances.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next service instance in the array of service instances, after the
     *        current requested list of service instances.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next service instance in the array of service instances, after the
     * current requested list of service instances.
     * </p>
     * 
     * @return A token to indicate the location of the next service instance in the array of service instances, after
     *         the current requested list of service instances.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next service instance in the array of service instances, after the
     * current requested list of service instances.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next service instance in the array of service instances, after the
     *        current requested list of service instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceInstancesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of service instances with summaries of detail data.
     * </p>
     * 
     * @return An array of service instances with summaries of detail data.
     */

    public java.util.List<ServiceInstanceSummary> getServiceInstances() {
        return serviceInstances;
    }

    /**
     * <p>
     * An array of service instances with summaries of detail data.
     * </p>
     * 
     * @param serviceInstances
     *        An array of service instances with summaries of detail data.
     */

    public void setServiceInstances(java.util.Collection<ServiceInstanceSummary> serviceInstances) {
        if (serviceInstances == null) {
            this.serviceInstances = null;
            return;
        }

        this.serviceInstances = new java.util.ArrayList<ServiceInstanceSummary>(serviceInstances);
    }

    /**
     * <p>
     * An array of service instances with summaries of detail data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceInstances(java.util.Collection)} or {@link #withServiceInstances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param serviceInstances
     *        An array of service instances with summaries of detail data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceInstancesResult withServiceInstances(ServiceInstanceSummary... serviceInstances) {
        if (this.serviceInstances == null) {
            setServiceInstances(new java.util.ArrayList<ServiceInstanceSummary>(serviceInstances.length));
        }
        for (ServiceInstanceSummary ele : serviceInstances) {
            this.serviceInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of service instances with summaries of detail data.
     * </p>
     * 
     * @param serviceInstances
     *        An array of service instances with summaries of detail data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceInstancesResult withServiceInstances(java.util.Collection<ServiceInstanceSummary> serviceInstances) {
        setServiceInstances(serviceInstances);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServiceInstances() != null)
            sb.append("ServiceInstances: ").append(getServiceInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceInstancesResult == false)
            return false;
        ListServiceInstancesResult other = (ListServiceInstancesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServiceInstances() == null ^ this.getServiceInstances() == null)
            return false;
        if (other.getServiceInstances() != null && other.getServiceInstances().equals(this.getServiceInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServiceInstances() == null) ? 0 : getServiceInstances().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceInstancesResult clone() {
        try {
            return (ListServiceInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
