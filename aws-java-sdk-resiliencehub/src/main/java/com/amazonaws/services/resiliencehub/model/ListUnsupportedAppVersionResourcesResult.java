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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListUnsupportedAppVersionResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUnsupportedAppVersionResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier for a specific resolution.
     * </p>
     */
    private String resolutionId;
    /**
     * <p>
     * The unsupported resources for the application.
     * </p>
     */
    private java.util.List<UnsupportedResource> unsupportedResources;

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

    public ListUnsupportedAppVersionResourcesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public ListUnsupportedAppVersionResourcesResult withResolutionId(String resolutionId) {
        setResolutionId(resolutionId);
        return this;
    }

    /**
     * <p>
     * The unsupported resources for the application.
     * </p>
     * 
     * @return The unsupported resources for the application.
     */

    public java.util.List<UnsupportedResource> getUnsupportedResources() {
        return unsupportedResources;
    }

    /**
     * <p>
     * The unsupported resources for the application.
     * </p>
     * 
     * @param unsupportedResources
     *        The unsupported resources for the application.
     */

    public void setUnsupportedResources(java.util.Collection<UnsupportedResource> unsupportedResources) {
        if (unsupportedResources == null) {
            this.unsupportedResources = null;
            return;
        }

        this.unsupportedResources = new java.util.ArrayList<UnsupportedResource>(unsupportedResources);
    }

    /**
     * <p>
     * The unsupported resources for the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsupportedResources(java.util.Collection)} or {@link #withUnsupportedResources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unsupportedResources
     *        The unsupported resources for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUnsupportedAppVersionResourcesResult withUnsupportedResources(UnsupportedResource... unsupportedResources) {
        if (this.unsupportedResources == null) {
            setUnsupportedResources(new java.util.ArrayList<UnsupportedResource>(unsupportedResources.length));
        }
        for (UnsupportedResource ele : unsupportedResources) {
            this.unsupportedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unsupported resources for the application.
     * </p>
     * 
     * @param unsupportedResources
     *        The unsupported resources for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUnsupportedAppVersionResourcesResult withUnsupportedResources(java.util.Collection<UnsupportedResource> unsupportedResources) {
        setUnsupportedResources(unsupportedResources);
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
        if (getResolutionId() != null)
            sb.append("ResolutionId: ").append(getResolutionId()).append(",");
        if (getUnsupportedResources() != null)
            sb.append("UnsupportedResources: ").append(getUnsupportedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUnsupportedAppVersionResourcesResult == false)
            return false;
        ListUnsupportedAppVersionResourcesResult other = (ListUnsupportedAppVersionResourcesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResolutionId() == null ^ this.getResolutionId() == null)
            return false;
        if (other.getResolutionId() != null && other.getResolutionId().equals(this.getResolutionId()) == false)
            return false;
        if (other.getUnsupportedResources() == null ^ this.getUnsupportedResources() == null)
            return false;
        if (other.getUnsupportedResources() != null && other.getUnsupportedResources().equals(this.getUnsupportedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResolutionId() == null) ? 0 : getResolutionId().hashCode());
        hashCode = prime * hashCode + ((getUnsupportedResources() == null) ? 0 : getUnsupportedResources().hashCode());
        return hashCode;
    }

    @Override
    public ListUnsupportedAppVersionResourcesResult clone() {
        try {
            return (ListUnsupportedAppVersionResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
