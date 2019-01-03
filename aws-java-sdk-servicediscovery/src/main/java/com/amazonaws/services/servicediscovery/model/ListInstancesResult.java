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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about the instances that are associated with the specified service.
     * </p>
     */
    private java.util.List<InstanceSummary> instances;
    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>ListInstances</code> request to get the next group of results. Specify the value of <code>NextToken</code>
     * from the previous response in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the instances that are associated with the specified service.
     * </p>
     * 
     * @return Summary information about the instances that are associated with the specified service.
     */

    public java.util.List<InstanceSummary> getInstances() {
        return instances;
    }

    /**
     * <p>
     * Summary information about the instances that are associated with the specified service.
     * </p>
     * 
     * @param instances
     *        Summary information about the instances that are associated with the specified service.
     */

    public void setInstances(java.util.Collection<InstanceSummary> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<InstanceSummary>(instances);
    }

    /**
     * <p>
     * Summary information about the instances that are associated with the specified service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        Summary information about the instances that are associated with the specified service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesResult withInstances(InstanceSummary... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<InstanceSummary>(instances.length));
        }
        for (InstanceSummary ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the instances that are associated with the specified service.
     * </p>
     * 
     * @param instances
     *        Summary information about the instances that are associated with the specified service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesResult withInstances(java.util.Collection<InstanceSummary> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>ListInstances</code> request to get the next group of results. Specify the value of <code>NextToken</code>
     * from the previous response in the next request.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     *        <code>ListInstances</code> request to get the next group of results. Specify the value of
     *        <code>NextToken</code> from the previous response in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>ListInstances</code> request to get the next group of results. Specify the value of <code>NextToken</code>
     * from the previous response in the next request.
     * </p>
     * 
     * @return If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     *         <code>ListInstances</code> request to get the next group of results. Specify the value of
     *         <code>NextToken</code> from the previous response in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>ListInstances</code> request to get the next group of results. Specify the value of <code>NextToken</code>
     * from the previous response in the next request.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     *        <code>ListInstances</code> request to get the next group of results. Specify the value of
     *        <code>NextToken</code> from the previous response in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesResult withNextToken(String nextToken) {
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
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
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

        if (obj instanceof ListInstancesResult == false)
            return false;
        ListInstancesResult other = (ListInstancesResult) obj;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
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

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInstancesResult clone() {
        try {
            return (ListInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
