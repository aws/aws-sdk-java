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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListMeshes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMeshesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of existing service meshes.
     * </p>
     */
    private java.util.List<MeshRef> meshes;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListMeshes</code> request. When the results of a
     * <code>ListMeshes</code> request exceed <code>limit</code>, you can use this value to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of existing service meshes.
     * </p>
     * 
     * @return The list of existing service meshes.
     */

    public java.util.List<MeshRef> getMeshes() {
        return meshes;
    }

    /**
     * <p>
     * The list of existing service meshes.
     * </p>
     * 
     * @param meshes
     *        The list of existing service meshes.
     */

    public void setMeshes(java.util.Collection<MeshRef> meshes) {
        if (meshes == null) {
            this.meshes = null;
            return;
        }

        this.meshes = new java.util.ArrayList<MeshRef>(meshes);
    }

    /**
     * <p>
     * The list of existing service meshes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMeshes(java.util.Collection)} or {@link #withMeshes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param meshes
     *        The list of existing service meshes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMeshesResult withMeshes(MeshRef... meshes) {
        if (this.meshes == null) {
            setMeshes(new java.util.ArrayList<MeshRef>(meshes.length));
        }
        for (MeshRef ele : meshes) {
            this.meshes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of existing service meshes.
     * </p>
     * 
     * @param meshes
     *        The list of existing service meshes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMeshesResult withMeshes(java.util.Collection<MeshRef> meshes) {
        setMeshes(meshes);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListMeshes</code> request. When the results of a
     * <code>ListMeshes</code> request exceed <code>limit</code>, you can use this value to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListMeshes</code> request. When the results
     *        of a <code>ListMeshes</code> request exceed <code>limit</code>, you can use this value to retrieve the
     *        next page of results. This value is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListMeshes</code> request. When the results of a
     * <code>ListMeshes</code> request exceed <code>limit</code>, you can use this value to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListMeshes</code> request. When the results
     *         of a <code>ListMeshes</code> request exceed <code>limit</code>, you can use this value to retrieve the
     *         next page of results. This value is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListMeshes</code> request. When the results of a
     * <code>ListMeshes</code> request exceed <code>limit</code>, you can use this value to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListMeshes</code> request. When the results
     *        of a <code>ListMeshes</code> request exceed <code>limit</code>, you can use this value to retrieve the
     *        next page of results. This value is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMeshesResult withNextToken(String nextToken) {
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
        if (getMeshes() != null)
            sb.append("Meshes: ").append(getMeshes()).append(",");
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

        if (obj instanceof ListMeshesResult == false)
            return false;
        ListMeshesResult other = (ListMeshesResult) obj;
        if (other.getMeshes() == null ^ this.getMeshes() == null)
            return false;
        if (other.getMeshes() != null && other.getMeshes().equals(this.getMeshes()) == false)
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

        hashCode = prime * hashCode + ((getMeshes() == null) ? 0 : getMeshes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMeshesResult clone() {
        try {
            return (ListMeshesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
