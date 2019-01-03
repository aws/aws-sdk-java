/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * One page of the organization's resource representation.
     * </p>
     */
    private java.util.List<Resource> resources;
    /**
     * <p>
     * The token used to paginate through all the organization's resources. While results are still available, it has an
     * associated value. When the last page is reached, the token is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One page of the organization's resource representation.
     * </p>
     * 
     * @return One page of the organization's resource representation.
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * <p>
     * One page of the organization's resource representation.
     * </p>
     * 
     * @param resources
     *        One page of the organization's resource representation.
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * <p>
     * One page of the organization's resource representation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        One page of the organization's resource representation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesResult withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One page of the organization's resource representation.
     * </p>
     * 
     * @param resources
     *        One page of the organization's resource representation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesResult withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The token used to paginate through all the organization's resources. While results are still available, it has an
     * associated value. When the last page is reached, the token is empty.
     * </p>
     * 
     * @param nextToken
     *        The token used to paginate through all the organization's resources. While results are still available, it
     *        has an associated value. When the last page is reached, the token is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to paginate through all the organization's resources. While results are still available, it has an
     * associated value. When the last page is reached, the token is empty.
     * </p>
     * 
     * @return The token used to paginate through all the organization's resources. While results are still available,
     *         it has an associated value. When the last page is reached, the token is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to paginate through all the organization's resources. While results are still available, it has an
     * associated value. When the last page is reached, the token is empty.
     * </p>
     * 
     * @param nextToken
     *        The token used to paginate through all the organization's resources. While results are still available, it
     *        has an associated value. When the last page is reached, the token is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesResult withNextToken(String nextToken) {
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

        if (obj instanceof ListResourcesResult == false)
            return false;
        ListResourcesResult other = (ListResourcesResult) obj;
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
    public ListResourcesResult clone() {
        try {
            return (ListResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
