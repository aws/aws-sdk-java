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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListTestGridSessionArtifacts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestGridSessionArtifactsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of test grid session artifacts for a <a>TestGridSession</a>.
     * </p>
     */
    private java.util.List<TestGridSessionArtifact> artifacts;
    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of test grid session artifacts for a <a>TestGridSession</a>.
     * </p>
     * 
     * @return A list of test grid session artifacts for a <a>TestGridSession</a>.
     */

    public java.util.List<TestGridSessionArtifact> getArtifacts() {
        return artifacts;
    }

    /**
     * <p>
     * A list of test grid session artifacts for a <a>TestGridSession</a>.
     * </p>
     * 
     * @param artifacts
     *        A list of test grid session artifacts for a <a>TestGridSession</a>.
     */

    public void setArtifacts(java.util.Collection<TestGridSessionArtifact> artifacts) {
        if (artifacts == null) {
            this.artifacts = null;
            return;
        }

        this.artifacts = new java.util.ArrayList<TestGridSessionArtifact>(artifacts);
    }

    /**
     * <p>
     * A list of test grid session artifacts for a <a>TestGridSession</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArtifacts(java.util.Collection)} or {@link #withArtifacts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param artifacts
     *        A list of test grid session artifacts for a <a>TestGridSession</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionArtifactsResult withArtifacts(TestGridSessionArtifact... artifacts) {
        if (this.artifacts == null) {
            setArtifacts(new java.util.ArrayList<TestGridSessionArtifact>(artifacts.length));
        }
        for (TestGridSessionArtifact ele : artifacts) {
            this.artifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of test grid session artifacts for a <a>TestGridSession</a>.
     * </p>
     * 
     * @param artifacts
     *        A list of test grid session artifacts for a <a>TestGridSession</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionArtifactsResult withArtifacts(java.util.Collection<TestGridSessionArtifact> artifacts) {
        setArtifacts(artifacts);
        return this;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @return Pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionArtifactsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListTestGridSessionArtifactsResult == false)
            return false;
        ListTestGridSessionArtifactsResult other = (ListTestGridSessionArtifactsResult) obj;
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
    public ListTestGridSessionArtifactsResult clone() {
        try {
            return (ListTestGridSessionArtifactsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
