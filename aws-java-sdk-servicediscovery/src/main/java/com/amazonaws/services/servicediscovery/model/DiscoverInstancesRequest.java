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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DiscoverInstances" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiscoverInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the namespace that you specified when you registered the instance.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The maximum number of instances that you want Cloud Map to return in the response to a
     * <code>DiscoverInstances</code> request. If you don't specify a value for <code>MaxResults</code>, Cloud Map
     * returns up to 100 instances.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute
     * that you specified when you registered the instance. Only instances that match all the specified key/value pairs
     * will be returned.
     * </p>
     */
    private java.util.Map<String, String> queryParameters;
    /**
     * <p>
     * The health status of the instances that you want to discover.
     * </p>
     */
    private String healthStatus;

    /**
     * <p>
     * The name of the namespace that you specified when you registered the instance.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace that you specified when you registered the instance.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace that you specified when you registered the instance.
     * </p>
     * 
     * @return The name of the namespace that you specified when you registered the instance.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace that you specified when you registered the instance.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace that you specified when you registered the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRequest withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that you specified when you registered the instance.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     * 
     * @return The name of the service that you specified when you registered the instance.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that you specified when you registered the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that you want Cloud Map to return in the response to a
     * <code>DiscoverInstances</code> request. If you don't specify a value for <code>MaxResults</code>, Cloud Map
     * returns up to 100 instances.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of instances that you want Cloud Map to return in the response to a
     *        <code>DiscoverInstances</code> request. If you don't specify a value for <code>MaxResults</code>, Cloud
     *        Map returns up to 100 instances.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of instances that you want Cloud Map to return in the response to a
     * <code>DiscoverInstances</code> request. If you don't specify a value for <code>MaxResults</code>, Cloud Map
     * returns up to 100 instances.
     * </p>
     * 
     * @return The maximum number of instances that you want Cloud Map to return in the response to a
     *         <code>DiscoverInstances</code> request. If you don't specify a value for <code>MaxResults</code>, Cloud
     *         Map returns up to 100 instances.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of instances that you want Cloud Map to return in the response to a
     * <code>DiscoverInstances</code> request. If you don't specify a value for <code>MaxResults</code>, Cloud Map
     * returns up to 100 instances.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of instances that you want Cloud Map to return in the response to a
     *        <code>DiscoverInstances</code> request. If you don't specify a value for <code>MaxResults</code>, Cloud
     *        Map returns up to 100 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute
     * that you specified when you registered the instance. Only instances that match all the specified key/value pairs
     * will be returned.
     * </p>
     * 
     * @return A string map that contains attributes with values that you can use to filter instances by any custom
     *         attribute that you specified when you registered the instance. Only instances that match all the
     *         specified key/value pairs will be returned.
     */

    public java.util.Map<String, String> getQueryParameters() {
        return queryParameters;
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute
     * that you specified when you registered the instance. Only instances that match all the specified key/value pairs
     * will be returned.
     * </p>
     * 
     * @param queryParameters
     *        A string map that contains attributes with values that you can use to filter instances by any custom
     *        attribute that you specified when you registered the instance. Only instances that match all the specified
     *        key/value pairs will be returned.
     */

    public void setQueryParameters(java.util.Map<String, String> queryParameters) {
        this.queryParameters = queryParameters;
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute
     * that you specified when you registered the instance. Only instances that match all the specified key/value pairs
     * will be returned.
     * </p>
     * 
     * @param queryParameters
     *        A string map that contains attributes with values that you can use to filter instances by any custom
     *        attribute that you specified when you registered the instance. Only instances that match all the specified
     *        key/value pairs will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRequest withQueryParameters(java.util.Map<String, String> queryParameters) {
        setQueryParameters(queryParameters);
        return this;
    }

    public DiscoverInstancesRequest addQueryParametersEntry(String key, String value) {
        if (null == this.queryParameters) {
            this.queryParameters = new java.util.HashMap<String, String>();
        }
        if (this.queryParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.queryParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into QueryParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRequest clearQueryParametersEntries() {
        this.queryParameters = null;
        return this;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover.
     * </p>
     * 
     * @param healthStatus
     *        The health status of the instances that you want to discover.
     * @see HealthStatusFilter
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover.
     * </p>
     * 
     * @return The health status of the instances that you want to discover.
     * @see HealthStatusFilter
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover.
     * </p>
     * 
     * @param healthStatus
     *        The health status of the instances that you want to discover.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthStatusFilter
     */

    public DiscoverInstancesRequest withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover.
     * </p>
     * 
     * @param healthStatus
     *        The health status of the instances that you want to discover.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthStatusFilter
     */

    public DiscoverInstancesRequest withHealthStatus(HealthStatusFilter healthStatus) {
        this.healthStatus = healthStatus.toString();
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
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getQueryParameters() != null)
            sb.append("QueryParameters: ").append(getQueryParameters()).append(",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: ").append(getHealthStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoverInstancesRequest == false)
            return false;
        DiscoverInstancesRequest other = (DiscoverInstancesRequest) obj;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getQueryParameters() == null ^ this.getQueryParameters() == null)
            return false;
        if (other.getQueryParameters() != null && other.getQueryParameters().equals(this.getQueryParameters()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getQueryParameters() == null) ? 0 : getQueryParameters().hashCode());
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        return hashCode;
    }

    @Override
    public DiscoverInstancesRequest clone() {
        return (DiscoverInstancesRequest) super.clone();
    }

}
