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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListComponentVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of versions that exist for the component.
     * </p>
     */
    private java.util.List<ComponentVersionListItem> componentVersions;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of versions that exist for the component.
     * </p>
     * 
     * @return A list of versions that exist for the component.
     */

    public java.util.List<ComponentVersionListItem> getComponentVersions() {
        return componentVersions;
    }

    /**
     * <p>
     * A list of versions that exist for the component.
     * </p>
     * 
     * @param componentVersions
     *        A list of versions that exist for the component.
     */

    public void setComponentVersions(java.util.Collection<ComponentVersionListItem> componentVersions) {
        if (componentVersions == null) {
            this.componentVersions = null;
            return;
        }

        this.componentVersions = new java.util.ArrayList<ComponentVersionListItem>(componentVersions);
    }

    /**
     * <p>
     * A list of versions that exist for the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponentVersions(java.util.Collection)} or {@link #withComponentVersions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param componentVersions
     *        A list of versions that exist for the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentVersionsResult withComponentVersions(ComponentVersionListItem... componentVersions) {
        if (this.componentVersions == null) {
            setComponentVersions(new java.util.ArrayList<ComponentVersionListItem>(componentVersions.length));
        }
        for (ComponentVersionListItem ele : componentVersions) {
            this.componentVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of versions that exist for the component.
     * </p>
     * 
     * @param componentVersions
     *        A list of versions that exist for the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentVersionsResult withComponentVersions(java.util.Collection<ComponentVersionListItem> componentVersions) {
        setComponentVersions(componentVersions);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentVersionsResult withNextToken(String nextToken) {
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
        if (getComponentVersions() != null)
            sb.append("ComponentVersions: ").append(getComponentVersions()).append(",");
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

        if (obj instanceof ListComponentVersionsResult == false)
            return false;
        ListComponentVersionsResult other = (ListComponentVersionsResult) obj;
        if (other.getComponentVersions() == null ^ this.getComponentVersions() == null)
            return false;
        if (other.getComponentVersions() != null && other.getComponentVersions().equals(this.getComponentVersions()) == false)
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

        hashCode = prime * hashCode + ((getComponentVersions() == null) ? 0 : getComponentVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListComponentVersionsResult clone() {
        try {
            return (ListComponentVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
