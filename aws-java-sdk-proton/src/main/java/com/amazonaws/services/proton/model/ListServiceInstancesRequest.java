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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of service instances to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to indicate the location of the next service in the array of service instances, after the list of service
     * instances that was previously requested.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The maximum number of service instances to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of service instances to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of service instances to list.
     * </p>
     * 
     * @return The maximum number of service instances to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of service instances to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of service instances to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceInstancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to indicate the location of the next service in the array of service instances, after the list of service
     * instances that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next service in the array of service instances, after the list of
     *        service instances that was previously requested.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next service in the array of service instances, after the list of service
     * instances that was previously requested.
     * </p>
     * 
     * @return A token to indicate the location of the next service in the array of service instances, after the list of
     *         service instances that was previously requested.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next service in the array of service instances, after the list of service
     * instances that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next service in the array of service instances, after the list of
     *        service instances that was previously requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceInstancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance belongs to.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @return The name of the service that the service instance belongs to.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceInstancesRequest withServiceName(String serviceName) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof ListServiceInstancesRequest == false)
            return false;
        ListServiceInstancesRequest other = (ListServiceInstancesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceInstancesRequest clone() {
        return (ListServiceInstancesRequest) super.clone();
    }

}
