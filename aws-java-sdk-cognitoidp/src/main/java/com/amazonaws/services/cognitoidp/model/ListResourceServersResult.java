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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListResourceServers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceServersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resource servers.
     * </p>
     */
    private java.util.List<ResourceServerType> resourceServers;
    /**
     * <p>
     * A pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The resource servers.
     * </p>
     * 
     * @return The resource servers.
     */

    public java.util.List<ResourceServerType> getResourceServers() {
        return resourceServers;
    }

    /**
     * <p>
     * The resource servers.
     * </p>
     * 
     * @param resourceServers
     *        The resource servers.
     */

    public void setResourceServers(java.util.Collection<ResourceServerType> resourceServers) {
        if (resourceServers == null) {
            this.resourceServers = null;
            return;
        }

        this.resourceServers = new java.util.ArrayList<ResourceServerType>(resourceServers);
    }

    /**
     * <p>
     * The resource servers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceServers(java.util.Collection)} or {@link #withResourceServers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceServers
     *        The resource servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceServersResult withResourceServers(ResourceServerType... resourceServers) {
        if (this.resourceServers == null) {
            setResourceServers(new java.util.ArrayList<ResourceServerType>(resourceServers.length));
        }
        for (ResourceServerType ele : resourceServers) {
            this.resourceServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource servers.
     * </p>
     * 
     * @param resourceServers
     *        The resource servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceServersResult withResourceServers(java.util.Collection<ResourceServerType> resourceServers) {
        setResourceServers(resourceServers);
        return this;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @return A pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceServersResult withNextToken(String nextToken) {
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
        if (getResourceServers() != null)
            sb.append("ResourceServers: ").append(getResourceServers()).append(",");
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

        if (obj instanceof ListResourceServersResult == false)
            return false;
        ListResourceServersResult other = (ListResourceServersResult) obj;
        if (other.getResourceServers() == null ^ this.getResourceServers() == null)
            return false;
        if (other.getResourceServers() != null && other.getResourceServers().equals(this.getResourceServers()) == false)
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

        hashCode = prime * hashCode + ((getResourceServers() == null) ? 0 : getResourceServers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceServersResult clone() {
        try {
            return (ListResourceServersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
