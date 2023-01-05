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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppVersionResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The physical resources in the application version.
     * </p>
     */
    private java.util.List<PhysicalResource> physicalResources;
    /**
     * <p>
     * The identifier for a specific resolution.
     * </p>
     */
    private String resolutionId;

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionResourcesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The physical resources in the application version.
     * </p>
     * 
     * @return The physical resources in the application version.
     */

    public java.util.List<PhysicalResource> getPhysicalResources() {
        return physicalResources;
    }

    /**
     * <p>
     * The physical resources in the application version.
     * </p>
     * 
     * @param physicalResources
     *        The physical resources in the application version.
     */

    public void setPhysicalResources(java.util.Collection<PhysicalResource> physicalResources) {
        if (physicalResources == null) {
            this.physicalResources = null;
            return;
        }

        this.physicalResources = new java.util.ArrayList<PhysicalResource>(physicalResources);
    }

    /**
     * <p>
     * The physical resources in the application version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhysicalResources(java.util.Collection)} or {@link #withPhysicalResources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param physicalResources
     *        The physical resources in the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionResourcesResult withPhysicalResources(PhysicalResource... physicalResources) {
        if (this.physicalResources == null) {
            setPhysicalResources(new java.util.ArrayList<PhysicalResource>(physicalResources.length));
        }
        for (PhysicalResource ele : physicalResources) {
            this.physicalResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The physical resources in the application version.
     * </p>
     * 
     * @param physicalResources
     *        The physical resources in the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionResourcesResult withPhysicalResources(java.util.Collection<PhysicalResource> physicalResources) {
        setPhysicalResources(physicalResources);
        return this;
    }

    /**
     * <p>
     * The identifier for a specific resolution.
     * </p>
     * 
     * @param resolutionId
     *        The identifier for a specific resolution.
     */

    public void setResolutionId(String resolutionId) {
        this.resolutionId = resolutionId;
    }

    /**
     * <p>
     * The identifier for a specific resolution.
     * </p>
     * 
     * @return The identifier for a specific resolution.
     */

    public String getResolutionId() {
        return this.resolutionId;
    }

    /**
     * <p>
     * The identifier for a specific resolution.
     * </p>
     * 
     * @param resolutionId
     *        The identifier for a specific resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionResourcesResult withResolutionId(String resolutionId) {
        setResolutionId(resolutionId);
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
        if (getPhysicalResources() != null)
            sb.append("PhysicalResources: ").append(getPhysicalResources()).append(",");
        if (getResolutionId() != null)
            sb.append("ResolutionId: ").append(getResolutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppVersionResourcesResult == false)
            return false;
        ListAppVersionResourcesResult other = (ListAppVersionResourcesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPhysicalResources() == null ^ this.getPhysicalResources() == null)
            return false;
        if (other.getPhysicalResources() != null && other.getPhysicalResources().equals(this.getPhysicalResources()) == false)
            return false;
        if (other.getResolutionId() == null ^ this.getResolutionId() == null)
            return false;
        if (other.getResolutionId() != null && other.getResolutionId().equals(this.getResolutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResources() == null) ? 0 : getPhysicalResources().hashCode());
        hashCode = prime * hashCode + ((getResolutionId() == null) ? 0 : getResolutionId().hashCode());
        return hashCode;
    }

    @Override
    public ListAppVersionResourcesResult clone() {
        try {
            return (ListAppVersionResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
