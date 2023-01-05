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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListGroupResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of ARNs. These ARNs are for the canaries that are associated with the group.
     * </p>
     */
    private java.util.List<String> resources;
    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>ListGroupResources</code> operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of ARNs. These ARNs are for the canaries that are associated with the group.
     * </p>
     * 
     * @return An array of ARNs. These ARNs are for the canaries that are associated with the group.
     */

    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * An array of ARNs. These ARNs are for the canaries that are associated with the group.
     * </p>
     * 
     * @param resources
     *        An array of ARNs. These ARNs are for the canaries that are associated with the group.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * An array of ARNs. These ARNs are for the canaries that are associated with the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        An array of ARNs. These ARNs are for the canaries that are associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesResult withResources(String... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of ARNs. These ARNs are for the canaries that are associated with the group.
     * </p>
     * 
     * @param resources
     *        An array of ARNs. These ARNs are for the canaries that are associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesResult withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>ListGroupResources</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>ListGroupResources</code> operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>ListGroupResources</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that indicates that there is more data available. You can use this token in a subsequent
     *         <code>ListGroupResources</code> operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>ListGroupResources</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>ListGroupResources</code> operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesResult withNextToken(String nextToken) {
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
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
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

        if (obj instanceof ListGroupResourcesResult == false)
            return false;
        ListGroupResourcesResult other = (ListGroupResourcesResult) obj;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
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

        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupResourcesResult clone() {
        try {
            return (ListGroupResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
