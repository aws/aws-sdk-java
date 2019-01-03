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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabases" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object describing the result of your get relational databases request.
     * </p>
     */
    private java.util.List<RelationalDatabase> relationalDatabases;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational databases request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An object describing the result of your get relational databases request.
     * </p>
     * 
     * @return An object describing the result of your get relational databases request.
     */

    public java.util.List<RelationalDatabase> getRelationalDatabases() {
        return relationalDatabases;
    }

    /**
     * <p>
     * An object describing the result of your get relational databases request.
     * </p>
     * 
     * @param relationalDatabases
     *        An object describing the result of your get relational databases request.
     */

    public void setRelationalDatabases(java.util.Collection<RelationalDatabase> relationalDatabases) {
        if (relationalDatabases == null) {
            this.relationalDatabases = null;
            return;
        }

        this.relationalDatabases = new java.util.ArrayList<RelationalDatabase>(relationalDatabases);
    }

    /**
     * <p>
     * An object describing the result of your get relational databases request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelationalDatabases(java.util.Collection)} or {@link #withRelationalDatabases(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param relationalDatabases
     *        An object describing the result of your get relational databases request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabasesResult withRelationalDatabases(RelationalDatabase... relationalDatabases) {
        if (this.relationalDatabases == null) {
            setRelationalDatabases(new java.util.ArrayList<RelationalDatabase>(relationalDatabases.length));
        }
        for (RelationalDatabase ele : relationalDatabases) {
            this.relationalDatabases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational databases request.
     * </p>
     * 
     * @param relationalDatabases
     *        An object describing the result of your get relational databases request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabasesResult withRelationalDatabases(java.util.Collection<RelationalDatabase> relationalDatabases) {
        setRelationalDatabases(relationalDatabases);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational databases request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get relational databases request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational databases request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get relational databases request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational databases request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get relational databases request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabasesResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getRelationalDatabases() != null)
            sb.append("RelationalDatabases: ").append(getRelationalDatabases()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabasesResult == false)
            return false;
        GetRelationalDatabasesResult other = (GetRelationalDatabasesResult) obj;
        if (other.getRelationalDatabases() == null ^ this.getRelationalDatabases() == null)
            return false;
        if (other.getRelationalDatabases() != null && other.getRelationalDatabases().equals(this.getRelationalDatabases()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabases() == null) ? 0 : getRelationalDatabases().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabasesResult clone() {
        try {
            return (GetRelationalDatabasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
