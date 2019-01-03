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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetInstancesHealthStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstancesHealthStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the service that the instance is associated with.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * An array that contains the IDs of all the instances that you want to get the health status for.
     * </p>
     * <p>
     * If you omit <code>Instances</code>, AWS Cloud Map returns the health status for all the instances that are
     * associated with the specified service.
     * </p>
     * <note>
     * <p>
     * To get the IDs for the instances that you've registered by using a specified service, submit a
     * <a>ListInstances</a> request.
     * </p>
     * </note>
     */
    private java.util.List<String> instances;
    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in the response to a
     * <code>GetInstancesHealthStatus</code> request. If you don't specify a value for <code>MaxResults</code>, AWS
     * Cloud Map returns up to 100 instances.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * For the first <code>GetInstancesHealthStatus</code> request, omit this value.
     * </p>
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the service that the instance is associated with.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service that the instance is associated with.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service that the instance is associated with.
     * </p>
     * 
     * @return The ID of the service that the instance is associated with.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service that the instance is associated with.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service that the instance is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstancesHealthStatusRequest withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * An array that contains the IDs of all the instances that you want to get the health status for.
     * </p>
     * <p>
     * If you omit <code>Instances</code>, AWS Cloud Map returns the health status for all the instances that are
     * associated with the specified service.
     * </p>
     * <note>
     * <p>
     * To get the IDs for the instances that you've registered by using a specified service, submit a
     * <a>ListInstances</a> request.
     * </p>
     * </note>
     * 
     * @return An array that contains the IDs of all the instances that you want to get the health status for.</p>
     *         <p>
     *         If you omit <code>Instances</code>, AWS Cloud Map returns the health status for all the instances that
     *         are associated with the specified service.
     *         </p>
     *         <note>
     *         <p>
     *         To get the IDs for the instances that you've registered by using a specified service, submit a
     *         <a>ListInstances</a> request.
     *         </p>
     */

    public java.util.List<String> getInstances() {
        return instances;
    }

    /**
     * <p>
     * An array that contains the IDs of all the instances that you want to get the health status for.
     * </p>
     * <p>
     * If you omit <code>Instances</code>, AWS Cloud Map returns the health status for all the instances that are
     * associated with the specified service.
     * </p>
     * <note>
     * <p>
     * To get the IDs for the instances that you've registered by using a specified service, submit a
     * <a>ListInstances</a> request.
     * </p>
     * </note>
     * 
     * @param instances
     *        An array that contains the IDs of all the instances that you want to get the health status for.</p>
     *        <p>
     *        If you omit <code>Instances</code>, AWS Cloud Map returns the health status for all the instances that are
     *        associated with the specified service.
     *        </p>
     *        <note>
     *        <p>
     *        To get the IDs for the instances that you've registered by using a specified service, submit a
     *        <a>ListInstances</a> request.
     *        </p>
     */

    public void setInstances(java.util.Collection<String> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<String>(instances);
    }

    /**
     * <p>
     * An array that contains the IDs of all the instances that you want to get the health status for.
     * </p>
     * <p>
     * If you omit <code>Instances</code>, AWS Cloud Map returns the health status for all the instances that are
     * associated with the specified service.
     * </p>
     * <note>
     * <p>
     * To get the IDs for the instances that you've registered by using a specified service, submit a
     * <a>ListInstances</a> request.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        An array that contains the IDs of all the instances that you want to get the health status for.</p>
     *        <p>
     *        If you omit <code>Instances</code>, AWS Cloud Map returns the health status for all the instances that are
     *        associated with the specified service.
     *        </p>
     *        <note>
     *        <p>
     *        To get the IDs for the instances that you've registered by using a specified service, submit a
     *        <a>ListInstances</a> request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstancesHealthStatusRequest withInstances(String... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<String>(instances.length));
        }
        for (String ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the IDs of all the instances that you want to get the health status for.
     * </p>
     * <p>
     * If you omit <code>Instances</code>, AWS Cloud Map returns the health status for all the instances that are
     * associated with the specified service.
     * </p>
     * <note>
     * <p>
     * To get the IDs for the instances that you've registered by using a specified service, submit a
     * <a>ListInstances</a> request.
     * </p>
     * </note>
     * 
     * @param instances
     *        An array that contains the IDs of all the instances that you want to get the health status for.</p>
     *        <p>
     *        If you omit <code>Instances</code>, AWS Cloud Map returns the health status for all the instances that are
     *        associated with the specified service.
     *        </p>
     *        <note>
     *        <p>
     *        To get the IDs for the instances that you've registered by using a specified service, submit a
     *        <a>ListInstances</a> request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstancesHealthStatusRequest withInstances(java.util.Collection<String> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in the response to a
     * <code>GetInstancesHealthStatus</code> request. If you don't specify a value for <code>MaxResults</code>, AWS
     * Cloud Map returns up to 100 instances.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of instances that you want AWS Cloud Map to return in the response to a
     *        <code>GetInstancesHealthStatus</code> request. If you don't specify a value for <code>MaxResults</code>,
     *        AWS Cloud Map returns up to 100 instances.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in the response to a
     * <code>GetInstancesHealthStatus</code> request. If you don't specify a value for <code>MaxResults</code>, AWS
     * Cloud Map returns up to 100 instances.
     * </p>
     * 
     * @return The maximum number of instances that you want AWS Cloud Map to return in the response to a
     *         <code>GetInstancesHealthStatus</code> request. If you don't specify a value for <code>MaxResults</code>,
     *         AWS Cloud Map returns up to 100 instances.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in the response to a
     * <code>GetInstancesHealthStatus</code> request. If you don't specify a value for <code>MaxResults</code>, AWS
     * Cloud Map returns up to 100 instances.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of instances that you want AWS Cloud Map to return in the response to a
     *        <code>GetInstancesHealthStatus</code> request. If you don't specify a value for <code>MaxResults</code>,
     *        AWS Cloud Map returns up to 100 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstancesHealthStatusRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * For the first <code>GetInstancesHealthStatus</code> request, omit this value.
     * </p>
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>GetInstancesHealthStatus</code> request, omit this value.</p>
     *        <p>
     *        If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     *        <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     *        <code>NextToken</code> from the previous response in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first <code>GetInstancesHealthStatus</code> request, omit this value.
     * </p>
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * 
     * @return For the first <code>GetInstancesHealthStatus</code> request, omit this value.</p>
     *         <p>
     *         If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     *         <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     *         <code>NextToken</code> from the previous response in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For the first <code>GetInstancesHealthStatus</code> request, omit this value.
     * </p>
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>GetInstancesHealthStatus</code> request, omit this value.</p>
     *        <p>
     *        If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     *        <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     *        <code>NextToken</code> from the previous response in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstancesHealthStatusRequest withNextToken(String nextToken) {
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
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
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

        if (obj instanceof GetInstancesHealthStatusRequest == false)
            return false;
        GetInstancesHealthStatusRequest other = (GetInstancesHealthStatusRequest) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
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

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInstancesHealthStatusRequest clone() {
        return (GetInstancesHealthStatusRequest) super.clone();
    }

}
