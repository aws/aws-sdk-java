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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListDeviceResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeviceResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the managed device that you are listing the resources of.
     * </p>
     */
    private String managedDeviceId;
    /**
     * <p>
     * The maximum number of resources per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A structure used to filter the results by type of resource.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ID of the managed device that you are listing the resources of.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the managed device that you are listing the resources of.
     */

    public void setManagedDeviceId(String managedDeviceId) {
        this.managedDeviceId = managedDeviceId;
    }

    /**
     * <p>
     * The ID of the managed device that you are listing the resources of.
     * </p>
     * 
     * @return The ID of the managed device that you are listing the resources of.
     */

    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }

    /**
     * <p>
     * The ID of the managed device that you are listing the resources of.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the managed device that you are listing the resources of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceResourcesRequest withManagedDeviceId(String managedDeviceId) {
        setManagedDeviceId(managedDeviceId);
        return this;
    }

    /**
     * <p>
     * The maximum number of resources per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resources per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of resources per page.
     * </p>
     * 
     * @return The maximum number of resources per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of resources per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resources per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of results.
     * </p>
     * 
     * @return A pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceResourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A structure used to filter the results by type of resource.
     * </p>
     * 
     * @param type
     *        A structure used to filter the results by type of resource.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * A structure used to filter the results by type of resource.
     * </p>
     * 
     * @return A structure used to filter the results by type of resource.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * A structure used to filter the results by type of resource.
     * </p>
     * 
     * @param type
     *        A structure used to filter the results by type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceResourcesRequest withType(String type) {
        setType(type);
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
        if (getManagedDeviceId() != null)
            sb.append("ManagedDeviceId: ").append(getManagedDeviceId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeviceResourcesRequest == false)
            return false;
        ListDeviceResourcesRequest other = (ListDeviceResourcesRequest) obj;
        if (other.getManagedDeviceId() == null ^ this.getManagedDeviceId() == null)
            return false;
        if (other.getManagedDeviceId() != null && other.getManagedDeviceId().equals(this.getManagedDeviceId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManagedDeviceId() == null) ? 0 : getManagedDeviceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListDeviceResourcesRequest clone() {
        return (ListDeviceResourcesRequest) super.clone();
    }

}
