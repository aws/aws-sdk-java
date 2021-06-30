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
     * The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of the
     * <code>Properties</code> member of the namespace.
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
     * Filters to scope the results based on custom attributes for the instance (for example,
     * <code>{version=v1, az=1a}</code>). Only instances that match all the specified key-value pairs are returned.
     * </p>
     */
    private java.util.Map<String, String> queryParameters;
    /**
     * <p>
     * Opportunistic filters to scope the results based on custom attributes. If there are instances that match both the
     * filters specified in both the <code>QueryParameters</code> parameter and this parameter, all of these instances
     * are returned. Otherwise, the filters are ignored, and only instances that match the filters that are specified in
     * the <code>QueryParameters</code> parameter are returned.
     * </p>
     */
    private java.util.Map<String, String> optionalParameters;
    /**
     * <p>
     * The health status of the instances that you want to discover. This parameter is ignored for services that don't
     * have a health check configured, and all instances are returned.
     * </p>
     * <dl>
     * <dt>HEALTHY</dt>
     * <dd>
     * <p>
     * Returns healthy instances.
     * </p>
     * </dd>
     * <dt>UNHEALTHY</dt>
     * <dd>
     * <p>
     * Returns unhealthy instances.
     * </p>
     * </dd>
     * <dt>ALL</dt>
     * <dd>
     * <p>
     * Returns all instances.
     * </p>
     * </dd>
     * <dt>HEALTHY_OR_ELSE_ALL</dt>
     * <dd>
     * <p>
     * Returns healthy instances, unless none are reporting a healthy state. In that case, return all instances. This is
     * also called failing open.
     * </p>
     * </dd>
     * </dl>
     */
    private String healthStatus;

    /**
     * <p>
     * The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of the
     * <code>Properties</code> member of the namespace.
     * </p>
     * 
     * @param namespaceName
     *        The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of
     *        the <code>Properties</code> member of the namespace.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of the
     * <code>Properties</code> member of the namespace.
     * </p>
     * 
     * @return The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of
     *         the <code>Properties</code> member of the namespace.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of the
     * <code>Properties</code> member of the namespace.
     * </p>
     * 
     * @param namespaceName
     *        The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of
     *        the <code>Properties</code> member of the namespace.
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
     * Filters to scope the results based on custom attributes for the instance (for example,
     * <code>{version=v1, az=1a}</code>). Only instances that match all the specified key-value pairs are returned.
     * </p>
     * 
     * @return Filters to scope the results based on custom attributes for the instance (for example,
     *         <code>{version=v1, az=1a}</code>). Only instances that match all the specified key-value pairs are
     *         returned.
     */

    public java.util.Map<String, String> getQueryParameters() {
        return queryParameters;
    }

    /**
     * <p>
     * Filters to scope the results based on custom attributes for the instance (for example,
     * <code>{version=v1, az=1a}</code>). Only instances that match all the specified key-value pairs are returned.
     * </p>
     * 
     * @param queryParameters
     *        Filters to scope the results based on custom attributes for the instance (for example,
     *        <code>{version=v1, az=1a}</code>). Only instances that match all the specified key-value pairs are
     *        returned.
     */

    public void setQueryParameters(java.util.Map<String, String> queryParameters) {
        this.queryParameters = queryParameters;
    }

    /**
     * <p>
     * Filters to scope the results based on custom attributes for the instance (for example,
     * <code>{version=v1, az=1a}</code>). Only instances that match all the specified key-value pairs are returned.
     * </p>
     * 
     * @param queryParameters
     *        Filters to scope the results based on custom attributes for the instance (for example,
     *        <code>{version=v1, az=1a}</code>). Only instances that match all the specified key-value pairs are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRequest withQueryParameters(java.util.Map<String, String> queryParameters) {
        setQueryParameters(queryParameters);
        return this;
    }

    /**
     * Add a single QueryParameters entry
     *
     * @see DiscoverInstancesRequest#withQueryParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

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
     * Opportunistic filters to scope the results based on custom attributes. If there are instances that match both the
     * filters specified in both the <code>QueryParameters</code> parameter and this parameter, all of these instances
     * are returned. Otherwise, the filters are ignored, and only instances that match the filters that are specified in
     * the <code>QueryParameters</code> parameter are returned.
     * </p>
     * 
     * @return Opportunistic filters to scope the results based on custom attributes. If there are instances that match
     *         both the filters specified in both the <code>QueryParameters</code> parameter and this parameter, all of
     *         these instances are returned. Otherwise, the filters are ignored, and only instances that match the
     *         filters that are specified in the <code>QueryParameters</code> parameter are returned.
     */

    public java.util.Map<String, String> getOptionalParameters() {
        return optionalParameters;
    }

    /**
     * <p>
     * Opportunistic filters to scope the results based on custom attributes. If there are instances that match both the
     * filters specified in both the <code>QueryParameters</code> parameter and this parameter, all of these instances
     * are returned. Otherwise, the filters are ignored, and only instances that match the filters that are specified in
     * the <code>QueryParameters</code> parameter are returned.
     * </p>
     * 
     * @param optionalParameters
     *        Opportunistic filters to scope the results based on custom attributes. If there are instances that match
     *        both the filters specified in both the <code>QueryParameters</code> parameter and this parameter, all of
     *        these instances are returned. Otherwise, the filters are ignored, and only instances that match the
     *        filters that are specified in the <code>QueryParameters</code> parameter are returned.
     */

    public void setOptionalParameters(java.util.Map<String, String> optionalParameters) {
        this.optionalParameters = optionalParameters;
    }

    /**
     * <p>
     * Opportunistic filters to scope the results based on custom attributes. If there are instances that match both the
     * filters specified in both the <code>QueryParameters</code> parameter and this parameter, all of these instances
     * are returned. Otherwise, the filters are ignored, and only instances that match the filters that are specified in
     * the <code>QueryParameters</code> parameter are returned.
     * </p>
     * 
     * @param optionalParameters
     *        Opportunistic filters to scope the results based on custom attributes. If there are instances that match
     *        both the filters specified in both the <code>QueryParameters</code> parameter and this parameter, all of
     *        these instances are returned. Otherwise, the filters are ignored, and only instances that match the
     *        filters that are specified in the <code>QueryParameters</code> parameter are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRequest withOptionalParameters(java.util.Map<String, String> optionalParameters) {
        setOptionalParameters(optionalParameters);
        return this;
    }

    /**
     * Add a single OptionalParameters entry
     *
     * @see DiscoverInstancesRequest#withOptionalParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRequest addOptionalParametersEntry(String key, String value) {
        if (null == this.optionalParameters) {
            this.optionalParameters = new java.util.HashMap<String, String>();
        }
        if (this.optionalParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.optionalParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OptionalParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRequest clearOptionalParametersEntries() {
        this.optionalParameters = null;
        return this;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover. This parameter is ignored for services that don't
     * have a health check configured, and all instances are returned.
     * </p>
     * <dl>
     * <dt>HEALTHY</dt>
     * <dd>
     * <p>
     * Returns healthy instances.
     * </p>
     * </dd>
     * <dt>UNHEALTHY</dt>
     * <dd>
     * <p>
     * Returns unhealthy instances.
     * </p>
     * </dd>
     * <dt>ALL</dt>
     * <dd>
     * <p>
     * Returns all instances.
     * </p>
     * </dd>
     * <dt>HEALTHY_OR_ELSE_ALL</dt>
     * <dd>
     * <p>
     * Returns healthy instances, unless none are reporting a healthy state. In that case, return all instances. This is
     * also called failing open.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param healthStatus
     *        The health status of the instances that you want to discover. This parameter is ignored for services that
     *        don't have a health check configured, and all instances are returned.</p>
     *        <dl>
     *        <dt>HEALTHY</dt>
     *        <dd>
     *        <p>
     *        Returns healthy instances.
     *        </p>
     *        </dd>
     *        <dt>UNHEALTHY</dt>
     *        <dd>
     *        <p>
     *        Returns unhealthy instances.
     *        </p>
     *        </dd>
     *        <dt>ALL</dt>
     *        <dd>
     *        <p>
     *        Returns all instances.
     *        </p>
     *        </dd>
     *        <dt>HEALTHY_OR_ELSE_ALL</dt>
     *        <dd>
     *        <p>
     *        Returns healthy instances, unless none are reporting a healthy state. In that case, return all instances.
     *        This is also called failing open.
     *        </p>
     *        </dd>
     * @see HealthStatusFilter
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover. This parameter is ignored for services that don't
     * have a health check configured, and all instances are returned.
     * </p>
     * <dl>
     * <dt>HEALTHY</dt>
     * <dd>
     * <p>
     * Returns healthy instances.
     * </p>
     * </dd>
     * <dt>UNHEALTHY</dt>
     * <dd>
     * <p>
     * Returns unhealthy instances.
     * </p>
     * </dd>
     * <dt>ALL</dt>
     * <dd>
     * <p>
     * Returns all instances.
     * </p>
     * </dd>
     * <dt>HEALTHY_OR_ELSE_ALL</dt>
     * <dd>
     * <p>
     * Returns healthy instances, unless none are reporting a healthy state. In that case, return all instances. This is
     * also called failing open.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The health status of the instances that you want to discover. This parameter is ignored for services that
     *         don't have a health check configured, and all instances are returned.</p>
     *         <dl>
     *         <dt>HEALTHY</dt>
     *         <dd>
     *         <p>
     *         Returns healthy instances.
     *         </p>
     *         </dd>
     *         <dt>UNHEALTHY</dt>
     *         <dd>
     *         <p>
     *         Returns unhealthy instances.
     *         </p>
     *         </dd>
     *         <dt>ALL</dt>
     *         <dd>
     *         <p>
     *         Returns all instances.
     *         </p>
     *         </dd>
     *         <dt>HEALTHY_OR_ELSE_ALL</dt>
     *         <dd>
     *         <p>
     *         Returns healthy instances, unless none are reporting a healthy state. In that case, return all instances.
     *         This is also called failing open.
     *         </p>
     *         </dd>
     * @see HealthStatusFilter
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover. This parameter is ignored for services that don't
     * have a health check configured, and all instances are returned.
     * </p>
     * <dl>
     * <dt>HEALTHY</dt>
     * <dd>
     * <p>
     * Returns healthy instances.
     * </p>
     * </dd>
     * <dt>UNHEALTHY</dt>
     * <dd>
     * <p>
     * Returns unhealthy instances.
     * </p>
     * </dd>
     * <dt>ALL</dt>
     * <dd>
     * <p>
     * Returns all instances.
     * </p>
     * </dd>
     * <dt>HEALTHY_OR_ELSE_ALL</dt>
     * <dd>
     * <p>
     * Returns healthy instances, unless none are reporting a healthy state. In that case, return all instances. This is
     * also called failing open.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param healthStatus
     *        The health status of the instances that you want to discover. This parameter is ignored for services that
     *        don't have a health check configured, and all instances are returned.</p>
     *        <dl>
     *        <dt>HEALTHY</dt>
     *        <dd>
     *        <p>
     *        Returns healthy instances.
     *        </p>
     *        </dd>
     *        <dt>UNHEALTHY</dt>
     *        <dd>
     *        <p>
     *        Returns unhealthy instances.
     *        </p>
     *        </dd>
     *        <dt>ALL</dt>
     *        <dd>
     *        <p>
     *        Returns all instances.
     *        </p>
     *        </dd>
     *        <dt>HEALTHY_OR_ELSE_ALL</dt>
     *        <dd>
     *        <p>
     *        Returns healthy instances, unless none are reporting a healthy state. In that case, return all instances.
     *        This is also called failing open.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthStatusFilter
     */

    public DiscoverInstancesRequest withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover. This parameter is ignored for services that don't
     * have a health check configured, and all instances are returned.
     * </p>
     * <dl>
     * <dt>HEALTHY</dt>
     * <dd>
     * <p>
     * Returns healthy instances.
     * </p>
     * </dd>
     * <dt>UNHEALTHY</dt>
     * <dd>
     * <p>
     * Returns unhealthy instances.
     * </p>
     * </dd>
     * <dt>ALL</dt>
     * <dd>
     * <p>
     * Returns all instances.
     * </p>
     * </dd>
     * <dt>HEALTHY_OR_ELSE_ALL</dt>
     * <dd>
     * <p>
     * Returns healthy instances, unless none are reporting a healthy state. In that case, return all instances. This is
     * also called failing open.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param healthStatus
     *        The health status of the instances that you want to discover. This parameter is ignored for services that
     *        don't have a health check configured, and all instances are returned.</p>
     *        <dl>
     *        <dt>HEALTHY</dt>
     *        <dd>
     *        <p>
     *        Returns healthy instances.
     *        </p>
     *        </dd>
     *        <dt>UNHEALTHY</dt>
     *        <dd>
     *        <p>
     *        Returns unhealthy instances.
     *        </p>
     *        </dd>
     *        <dt>ALL</dt>
     *        <dd>
     *        <p>
     *        Returns all instances.
     *        </p>
     *        </dd>
     *        <dt>HEALTHY_OR_ELSE_ALL</dt>
     *        <dd>
     *        <p>
     *        Returns healthy instances, unless none are reporting a healthy state. In that case, return all instances.
     *        This is also called failing open.
     *        </p>
     *        </dd>
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
        if (getOptionalParameters() != null)
            sb.append("OptionalParameters: ").append(getOptionalParameters()).append(",");
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
        if (other.getOptionalParameters() == null ^ this.getOptionalParameters() == null)
            return false;
        if (other.getOptionalParameters() != null && other.getOptionalParameters().equals(this.getOptionalParameters()) == false)
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
        hashCode = prime * hashCode + ((getOptionalParameters() == null) ? 0 : getOptionalParameters().hashCode());
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        return hashCode;
    }

    @Override
    public DiscoverInstancesRequest clone() {
        return (DiscoverInstancesRequest) super.clone();
    }

}
