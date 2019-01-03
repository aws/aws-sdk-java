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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <a>ListObjectParentPaths</a> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchListObjectParentPathsResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListObjectParentPathsResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Returns the path to the <code>ObjectIdentifiers</code> that are associated with the directory.
     * </p>
     */
    private java.util.List<PathToObjectIdentifiers> pathToObjectIdentifiersList;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns the path to the <code>ObjectIdentifiers</code> that are associated with the directory.
     * </p>
     * 
     * @return Returns the path to the <code>ObjectIdentifiers</code> that are associated with the directory.
     */

    public java.util.List<PathToObjectIdentifiers> getPathToObjectIdentifiersList() {
        return pathToObjectIdentifiersList;
    }

    /**
     * <p>
     * Returns the path to the <code>ObjectIdentifiers</code> that are associated with the directory.
     * </p>
     * 
     * @param pathToObjectIdentifiersList
     *        Returns the path to the <code>ObjectIdentifiers</code> that are associated with the directory.
     */

    public void setPathToObjectIdentifiersList(java.util.Collection<PathToObjectIdentifiers> pathToObjectIdentifiersList) {
        if (pathToObjectIdentifiersList == null) {
            this.pathToObjectIdentifiersList = null;
            return;
        }

        this.pathToObjectIdentifiersList = new java.util.ArrayList<PathToObjectIdentifiers>(pathToObjectIdentifiersList);
    }

    /**
     * <p>
     * Returns the path to the <code>ObjectIdentifiers</code> that are associated with the directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPathToObjectIdentifiersList(java.util.Collection)} or
     * {@link #withPathToObjectIdentifiersList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pathToObjectIdentifiersList
     *        Returns the path to the <code>ObjectIdentifiers</code> that are associated with the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectParentPathsResponse withPathToObjectIdentifiersList(PathToObjectIdentifiers... pathToObjectIdentifiersList) {
        if (this.pathToObjectIdentifiersList == null) {
            setPathToObjectIdentifiersList(new java.util.ArrayList<PathToObjectIdentifiers>(pathToObjectIdentifiersList.length));
        }
        for (PathToObjectIdentifiers ele : pathToObjectIdentifiersList) {
            this.pathToObjectIdentifiersList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the path to the <code>ObjectIdentifiers</code> that are associated with the directory.
     * </p>
     * 
     * @param pathToObjectIdentifiersList
     *        Returns the path to the <code>ObjectIdentifiers</code> that are associated with the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectParentPathsResponse withPathToObjectIdentifiersList(java.util.Collection<PathToObjectIdentifiers> pathToObjectIdentifiersList) {
        setPathToObjectIdentifiersList(pathToObjectIdentifiersList);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectParentPathsResponse withNextToken(String nextToken) {
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
        if (getPathToObjectIdentifiersList() != null)
            sb.append("PathToObjectIdentifiersList: ").append(getPathToObjectIdentifiersList()).append(",");
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

        if (obj instanceof BatchListObjectParentPathsResponse == false)
            return false;
        BatchListObjectParentPathsResponse other = (BatchListObjectParentPathsResponse) obj;
        if (other.getPathToObjectIdentifiersList() == null ^ this.getPathToObjectIdentifiersList() == null)
            return false;
        if (other.getPathToObjectIdentifiersList() != null && other.getPathToObjectIdentifiersList().equals(this.getPathToObjectIdentifiersList()) == false)
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

        hashCode = prime * hashCode + ((getPathToObjectIdentifiersList() == null) ? 0 : getPathToObjectIdentifiersList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchListObjectParentPathsResponse clone() {
        try {
            return (BatchListObjectParentPathsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchListObjectParentPathsResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
