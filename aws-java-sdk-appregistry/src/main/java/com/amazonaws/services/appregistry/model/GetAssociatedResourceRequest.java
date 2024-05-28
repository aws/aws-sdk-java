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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/GetAssociatedResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssociatedResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name, ID, or ARN of the application.
     * </p>
     */
    private String application;
    /**
     * <p>
     * The type of resource associated with the application.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The name or ID of the resource associated with the application.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * A unique pagination token for each page of results. Make the call again with the returned token to retrieve the
     * next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * States whether an application tag is applied, not applied, in the process of being applied, or skipped.
     * </p>
     */
    private java.util.List<String> resourceTagStatus;
    /**
     * <p>
     * The maximum number of results to return. If the parameter is omitted, it defaults to 25. The value is optional.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name, ID, or ARN of the application.
     * </p>
     * 
     * @param application
     *        The name, ID, or ARN of the application.
     */

    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * The name, ID, or ARN of the application.
     * </p>
     * 
     * @return The name, ID, or ARN of the application.
     */

    public String getApplication() {
        return this.application;
    }

    /**
     * <p>
     * The name, ID, or ARN of the application.
     * </p>
     * 
     * @param application
     *        The name, ID, or ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedResourceRequest withApplication(String application) {
        setApplication(application);
        return this;
    }

    /**
     * <p>
     * The type of resource associated with the application.
     * </p>
     * 
     * @param resourceType
     *        The type of resource associated with the application.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource associated with the application.
     * </p>
     * 
     * @return The type of resource associated with the application.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource associated with the application.
     * </p>
     * 
     * @param resourceType
     *        The type of resource associated with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetAssociatedResourceRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource associated with the application.
     * </p>
     * 
     * @param resourceType
     *        The type of resource associated with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetAssociatedResourceRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The name or ID of the resource associated with the application.
     * </p>
     * 
     * @param resource
     *        The name or ID of the resource associated with the application.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The name or ID of the resource associated with the application.
     * </p>
     * 
     * @return The name or ID of the resource associated with the application.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The name or ID of the resource associated with the application.
     * </p>
     * 
     * @param resource
     *        The name or ID of the resource associated with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedResourceRequest withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * A unique pagination token for each page of results. Make the call again with the returned token to retrieve the
     * next page of results.
     * </p>
     * 
     * @param nextToken
     *        A unique pagination token for each page of results. Make the call again with the returned token to
     *        retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A unique pagination token for each page of results. Make the call again with the returned token to retrieve the
     * next page of results.
     * </p>
     * 
     * @return A unique pagination token for each page of results. Make the call again with the returned token to
     *         retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A unique pagination token for each page of results. Make the call again with the returned token to retrieve the
     * next page of results.
     * </p>
     * 
     * @param nextToken
     *        A unique pagination token for each page of results. Make the call again with the returned token to
     *        retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedResourceRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * States whether an application tag is applied, not applied, in the process of being applied, or skipped.
     * </p>
     * 
     * @return States whether an application tag is applied, not applied, in the process of being applied, or skipped.
     * @see ResourceItemStatus
     */

    public java.util.List<String> getResourceTagStatus() {
        return resourceTagStatus;
    }

    /**
     * <p>
     * States whether an application tag is applied, not applied, in the process of being applied, or skipped.
     * </p>
     * 
     * @param resourceTagStatus
     *        States whether an application tag is applied, not applied, in the process of being applied, or skipped.
     * @see ResourceItemStatus
     */

    public void setResourceTagStatus(java.util.Collection<String> resourceTagStatus) {
        if (resourceTagStatus == null) {
            this.resourceTagStatus = null;
            return;
        }

        this.resourceTagStatus = new java.util.ArrayList<String>(resourceTagStatus);
    }

    /**
     * <p>
     * States whether an application tag is applied, not applied, in the process of being applied, or skipped.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTagStatus(java.util.Collection)} or {@link #withResourceTagStatus(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceTagStatus
     *        States whether an application tag is applied, not applied, in the process of being applied, or skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceItemStatus
     */

    public GetAssociatedResourceRequest withResourceTagStatus(String... resourceTagStatus) {
        if (this.resourceTagStatus == null) {
            setResourceTagStatus(new java.util.ArrayList<String>(resourceTagStatus.length));
        }
        for (String ele : resourceTagStatus) {
            this.resourceTagStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * States whether an application tag is applied, not applied, in the process of being applied, or skipped.
     * </p>
     * 
     * @param resourceTagStatus
     *        States whether an application tag is applied, not applied, in the process of being applied, or skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceItemStatus
     */

    public GetAssociatedResourceRequest withResourceTagStatus(java.util.Collection<String> resourceTagStatus) {
        setResourceTagStatus(resourceTagStatus);
        return this;
    }

    /**
     * <p>
     * States whether an application tag is applied, not applied, in the process of being applied, or skipped.
     * </p>
     * 
     * @param resourceTagStatus
     *        States whether an application tag is applied, not applied, in the process of being applied, or skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceItemStatus
     */

    public GetAssociatedResourceRequest withResourceTagStatus(ResourceItemStatus... resourceTagStatus) {
        java.util.ArrayList<String> resourceTagStatusCopy = new java.util.ArrayList<String>(resourceTagStatus.length);
        for (ResourceItemStatus value : resourceTagStatus) {
            resourceTagStatusCopy.add(value.toString());
        }
        if (getResourceTagStatus() == null) {
            setResourceTagStatus(resourceTagStatusCopy);
        } else {
            getResourceTagStatus().addAll(resourceTagStatusCopy);
        }
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return. If the parameter is omitted, it defaults to 25. The value is optional.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return. If the parameter is omitted, it defaults to 25. The value is
     *        optional.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return. If the parameter is omitted, it defaults to 25. The value is optional.
     * </p>
     * 
     * @return The maximum number of results to return. If the parameter is omitted, it defaults to 25. The value is
     *         optional.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return. If the parameter is omitted, it defaults to 25. The value is optional.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return. If the parameter is omitted, it defaults to 25. The value is
     *        optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedResourceRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getApplication() != null)
            sb.append("Application: ").append(getApplication()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResourceTagStatus() != null)
            sb.append("ResourceTagStatus: ").append(getResourceTagStatus()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssociatedResourceRequest == false)
            return false;
        GetAssociatedResourceRequest other = (GetAssociatedResourceRequest) obj;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceTagStatus() == null ^ this.getResourceTagStatus() == null)
            return false;
        if (other.getResourceTagStatus() != null && other.getResourceTagStatus().equals(this.getResourceTagStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourceTagStatus() == null) ? 0 : getResourceTagStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetAssociatedResourceRequest clone() {
        return (GetAssociatedResourceRequest) super.clone();
    }

}
