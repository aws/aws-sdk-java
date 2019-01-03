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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshots"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An object describing the result of your get relational database snapshots request.
     * </p>
     */
    private java.util.List<RelationalDatabaseSnapshot> relationalDatabaseSnapshots;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database snapshots request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An object describing the result of your get relational database snapshots request.
     * </p>
     * 
     * @return An object describing the result of your get relational database snapshots request.
     */

    public java.util.List<RelationalDatabaseSnapshot> getRelationalDatabaseSnapshots() {
        return relationalDatabaseSnapshots;
    }

    /**
     * <p>
     * An object describing the result of your get relational database snapshots request.
     * </p>
     * 
     * @param relationalDatabaseSnapshots
     *        An object describing the result of your get relational database snapshots request.
     */

    public void setRelationalDatabaseSnapshots(java.util.Collection<RelationalDatabaseSnapshot> relationalDatabaseSnapshots) {
        if (relationalDatabaseSnapshots == null) {
            this.relationalDatabaseSnapshots = null;
            return;
        }

        this.relationalDatabaseSnapshots = new java.util.ArrayList<RelationalDatabaseSnapshot>(relationalDatabaseSnapshots);
    }

    /**
     * <p>
     * An object describing the result of your get relational database snapshots request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelationalDatabaseSnapshots(java.util.Collection)} or
     * {@link #withRelationalDatabaseSnapshots(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param relationalDatabaseSnapshots
     *        An object describing the result of your get relational database snapshots request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseSnapshotsResult withRelationalDatabaseSnapshots(RelationalDatabaseSnapshot... relationalDatabaseSnapshots) {
        if (this.relationalDatabaseSnapshots == null) {
            setRelationalDatabaseSnapshots(new java.util.ArrayList<RelationalDatabaseSnapshot>(relationalDatabaseSnapshots.length));
        }
        for (RelationalDatabaseSnapshot ele : relationalDatabaseSnapshots) {
            this.relationalDatabaseSnapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational database snapshots request.
     * </p>
     * 
     * @param relationalDatabaseSnapshots
     *        An object describing the result of your get relational database snapshots request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseSnapshotsResult withRelationalDatabaseSnapshots(java.util.Collection<RelationalDatabaseSnapshot> relationalDatabaseSnapshots) {
        setRelationalDatabaseSnapshots(relationalDatabaseSnapshots);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database snapshots request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get relational database snapshots
     *        request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database snapshots request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get relational database snapshots
     *         request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database snapshots request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get relational database snapshots
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseSnapshotsResult withNextPageToken(String nextPageToken) {
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
        if (getRelationalDatabaseSnapshots() != null)
            sb.append("RelationalDatabaseSnapshots: ").append(getRelationalDatabaseSnapshots()).append(",");
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

        if (obj instanceof GetRelationalDatabaseSnapshotsResult == false)
            return false;
        GetRelationalDatabaseSnapshotsResult other = (GetRelationalDatabaseSnapshotsResult) obj;
        if (other.getRelationalDatabaseSnapshots() == null ^ this.getRelationalDatabaseSnapshots() == null)
            return false;
        if (other.getRelationalDatabaseSnapshots() != null && other.getRelationalDatabaseSnapshots().equals(this.getRelationalDatabaseSnapshots()) == false)
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

        hashCode = prime * hashCode + ((getRelationalDatabaseSnapshots() == null) ? 0 : getRelationalDatabaseSnapshots().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabaseSnapshotsResult clone() {
        try {
            return (GetRelationalDatabaseSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
