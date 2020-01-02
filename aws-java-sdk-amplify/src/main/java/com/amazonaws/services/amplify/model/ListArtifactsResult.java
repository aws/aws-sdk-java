/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result structure for the list artifacts request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListArtifacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListArtifactsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of artifacts.
     * </p>
     */
    private java.util.List<Artifact> artifacts;
    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of artifacts.
     * </p>
     * 
     * @return List of artifacts.
     */

    public java.util.List<Artifact> getArtifacts() {
        return artifacts;
    }

    /**
     * <p>
     * List of artifacts.
     * </p>
     * 
     * @param artifacts
     *        List of artifacts.
     */

    public void setArtifacts(java.util.Collection<Artifact> artifacts) {
        if (artifacts == null) {
            this.artifacts = null;
            return;
        }

        this.artifacts = new java.util.ArrayList<Artifact>(artifacts);
    }

    /**
     * <p>
     * List of artifacts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArtifacts(java.util.Collection)} or {@link #withArtifacts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param artifacts
     *        List of artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsResult withArtifacts(Artifact... artifacts) {
        if (this.artifacts == null) {
            setArtifacts(new java.util.ArrayList<Artifact>(artifacts.length));
        }
        for (Artifact ele : artifacts) {
            this.artifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of artifacts.
     * </p>
     * 
     * @param artifacts
     *        List of artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsResult withArtifacts(java.util.Collection<Artifact> artifacts) {
        setArtifacts(artifacts);
        return this;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *        request to fetch more entries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @return Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *         request to fetch more entries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *        request to fetch more entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsResult withNextToken(String nextToken) {
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
        if (getArtifacts() != null)
            sb.append("Artifacts: ").append(getArtifacts()).append(",");
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

        if (obj instanceof ListArtifactsResult == false)
            return false;
        ListArtifactsResult other = (ListArtifactsResult) obj;
        if (other.getArtifacts() == null ^ this.getArtifacts() == null)
            return false;
        if (other.getArtifacts() != null && other.getArtifacts().equals(this.getArtifacts()) == false)
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

        hashCode = prime * hashCode + ((getArtifacts() == null) ? 0 : getArtifacts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListArtifactsResult clone() {
        try {
            return (ListArtifactsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
