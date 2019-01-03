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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/ListContainers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContainersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the containers.
     * </p>
     */
    private java.util.List<Container> containers;
    /**
     * <p>
     * <code>NextToken</code> is the token to use in the next call to <code>ListContainers</code>. This token is
     * returned only if you included the <code>MaxResults</code> tag in the original command, and only if there are
     * still containers to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of the containers.
     * </p>
     * 
     * @return The names of the containers.
     */

    public java.util.List<Container> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The names of the containers.
     * </p>
     * 
     * @param containers
     *        The names of the containers.
     */

    public void setContainers(java.util.Collection<Container> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<Container>(containers);
    }

    /**
     * <p>
     * The names of the containers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        The names of the containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainersResult withContainers(Container... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<Container>(containers.length));
        }
        for (Container ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the containers.
     * </p>
     * 
     * @param containers
     *        The names of the containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainersResult withContainers(java.util.Collection<Container> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * <code>NextToken</code> is the token to use in the next call to <code>ListContainers</code>. This token is
     * returned only if you included the <code>MaxResults</code> tag in the original command, and only if there are
     * still containers to return.
     * </p>
     * 
     * @param nextToken
     *        <code>NextToken</code> is the token to use in the next call to <code>ListContainers</code>. This token is
     *        returned only if you included the <code>MaxResults</code> tag in the original command, and only if there
     *        are still containers to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is the token to use in the next call to <code>ListContainers</code>. This token is
     * returned only if you included the <code>MaxResults</code> tag in the original command, and only if there are
     * still containers to return.
     * </p>
     * 
     * @return <code>NextToken</code> is the token to use in the next call to <code>ListContainers</code>. This token is
     *         returned only if you included the <code>MaxResults</code> tag in the original command, and only if there
     *         are still containers to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is the token to use in the next call to <code>ListContainers</code>. This token is
     * returned only if you included the <code>MaxResults</code> tag in the original command, and only if there are
     * still containers to return.
     * </p>
     * 
     * @param nextToken
     *        <code>NextToken</code> is the token to use in the next call to <code>ListContainers</code>. This token is
     *        returned only if you included the <code>MaxResults</code> tag in the original command, and only if there
     *        are still containers to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainersResult withNextToken(String nextToken) {
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
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
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

        if (obj instanceof ListContainersResult == false)
            return false;
        ListContainersResult other = (ListContainersResult) obj;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
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

        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContainersResult clone() {
        try {
            return (ListContainersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
