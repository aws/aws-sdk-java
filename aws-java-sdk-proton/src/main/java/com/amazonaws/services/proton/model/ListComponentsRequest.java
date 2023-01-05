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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListComponents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an environment for result list filtering. Proton returns components associated with the environment
     * or attached to service instances running in it.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The maximum number of components to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token that indicates the location of the next component in the array of components, after the list of
     * components that was previously requested.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name of a service instance for result list filtering. Proton returns the component attached to the service
     * instance, if any.
     * </p>
     */
    private String serviceInstanceName;
    /**
     * <p>
     * The name of a service for result list filtering. Proton returns components attached to service instances of the
     * service.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of an environment for result list filtering. Proton returns components associated with the environment
     * or attached to service instances running in it.
     * </p>
     * 
     * @param environmentName
     *        The name of an environment for result list filtering. Proton returns components associated with the
     *        environment or attached to service instances running in it.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of an environment for result list filtering. Proton returns components associated with the environment
     * or attached to service instances running in it.
     * </p>
     * 
     * @return The name of an environment for result list filtering. Proton returns components associated with the
     *         environment or attached to service instances running in it.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of an environment for result list filtering. Proton returns components associated with the environment
     * or attached to service instances running in it.
     * </p>
     * 
     * @param environmentName
     *        The name of an environment for result list filtering. Proton returns components associated with the
     *        environment or attached to service instances running in it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The maximum number of components to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of components to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of components to list.
     * </p>
     * 
     * @return The maximum number of components to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of components to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of components to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token that indicates the location of the next component in the array of components, after the list of
     * components that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next component in the array of components, after the list of
     *        components that was previously requested.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next component in the array of components, after the list of
     * components that was previously requested.
     * </p>
     * 
     * @return A token that indicates the location of the next component in the array of components, after the list of
     *         components that was previously requested.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next component in the array of components, after the list of
     * components that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next component in the array of components, after the list of
     *        components that was previously requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of a service instance for result list filtering. Proton returns the component attached to the service
     * instance, if any.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of a service instance for result list filtering. Proton returns the component attached to the
     *        service instance, if any.
     */

    public void setServiceInstanceName(String serviceInstanceName) {
        this.serviceInstanceName = serviceInstanceName;
    }

    /**
     * <p>
     * The name of a service instance for result list filtering. Proton returns the component attached to the service
     * instance, if any.
     * </p>
     * 
     * @return The name of a service instance for result list filtering. Proton returns the component attached to the
     *         service instance, if any.
     */

    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    /**
     * <p>
     * The name of a service instance for result list filtering. Proton returns the component attached to the service
     * instance, if any.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of a service instance for result list filtering. Proton returns the component attached to the
     *        service instance, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withServiceInstanceName(String serviceInstanceName) {
        setServiceInstanceName(serviceInstanceName);
        return this;
    }

    /**
     * <p>
     * The name of a service for result list filtering. Proton returns components attached to service instances of the
     * service.
     * </p>
     * 
     * @param serviceName
     *        The name of a service for result list filtering. Proton returns components attached to service instances
     *        of the service.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of a service for result list filtering. Proton returns components attached to service instances of the
     * service.
     * </p>
     * 
     * @return The name of a service for result list filtering. Proton returns components attached to service instances
     *         of the service.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of a service for result list filtering. Proton returns components attached to service instances of the
     * service.
     * </p>
     * 
     * @param serviceName
     *        The name of a service for result list filtering. Proton returns components attached to service instances
     *        of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServiceInstanceName() != null)
            sb.append("ServiceInstanceName: ").append(getServiceInstanceName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListComponentsRequest == false)
            return false;
        ListComponentsRequest other = (ListComponentsRequest) obj;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServiceInstanceName() == null ^ this.getServiceInstanceName() == null)
            return false;
        if (other.getServiceInstanceName() != null && other.getServiceInstanceName().equals(this.getServiceInstanceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServiceInstanceName() == null) ? 0 : getServiceInstanceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public ListComponentsRequest clone() {
        return (ListComponentsRequest) super.clone();
    }

}
