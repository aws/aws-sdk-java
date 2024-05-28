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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListComponents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The workspace ID.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The ID for the entity whose metadata (component/properties) is returned by the operation.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * This string specifies the path to the composite component, starting from the top-level component.
     * </p>
     */
    private String componentPath;
    /**
     * <p>
     * The maximum number of results returned at one time. The default is 25.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The workspace ID.
     * </p>
     * 
     * @param workspaceId
     *        The workspace ID.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The workspace ID.
     * </p>
     * 
     * @return The workspace ID.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The workspace ID.
     * </p>
     * 
     * @param workspaceId
     *        The workspace ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The ID for the entity whose metadata (component/properties) is returned by the operation.
     * </p>
     * 
     * @param entityId
     *        The ID for the entity whose metadata (component/properties) is returned by the operation.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The ID for the entity whose metadata (component/properties) is returned by the operation.
     * </p>
     * 
     * @return The ID for the entity whose metadata (component/properties) is returned by the operation.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The ID for the entity whose metadata (component/properties) is returned by the operation.
     * </p>
     * 
     * @param entityId
     *        The ID for the entity whose metadata (component/properties) is returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * This string specifies the path to the composite component, starting from the top-level component.
     * </p>
     * 
     * @param componentPath
     *        This string specifies the path to the composite component, starting from the top-level component.
     */

    public void setComponentPath(String componentPath) {
        this.componentPath = componentPath;
    }

    /**
     * <p>
     * This string specifies the path to the composite component, starting from the top-level component.
     * </p>
     * 
     * @return This string specifies the path to the composite component, starting from the top-level component.
     */

    public String getComponentPath() {
        return this.componentPath;
    }

    /**
     * <p>
     * This string specifies the path to the composite component, starting from the top-level component.
     * </p>
     * 
     * @param componentPath
     *        This string specifies the path to the composite component, starting from the top-level component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withComponentPath(String componentPath) {
        setComponentPath(componentPath);
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned at one time. The default is 25.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned at one time. The default is 25.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned at one time. The default is 25.
     * </p>
     * 
     * @return The maximum number of results returned at one time. The default is 25.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned at one time. The default is 25.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned at one time. The default is 25.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withNextToken(String nextToken) {
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getComponentPath() != null)
            sb.append("ComponentPath: ").append(getComponentPath()).append(",");
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

        if (obj instanceof ListComponentsRequest == false)
            return false;
        ListComponentsRequest other = (ListComponentsRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getComponentPath() == null ^ this.getComponentPath() == null)
            return false;
        if (other.getComponentPath() != null && other.getComponentPath().equals(this.getComponentPath()) == false)
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

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getComponentPath() == null) ? 0 : getComponentPath().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListComponentsRequest clone() {
        return (ListComponentsRequest) super.clone();
    }

}
