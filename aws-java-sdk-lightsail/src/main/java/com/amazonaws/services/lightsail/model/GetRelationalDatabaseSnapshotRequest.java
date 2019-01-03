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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database snapshot for which to get information.
     * </p>
     */
    private String relationalDatabaseSnapshotName;

    /**
     * <p>
     * The name of the database snapshot for which to get information.
     * </p>
     * 
     * @param relationalDatabaseSnapshotName
     *        The name of the database snapshot for which to get information.
     */

    public void setRelationalDatabaseSnapshotName(String relationalDatabaseSnapshotName) {
        this.relationalDatabaseSnapshotName = relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of the database snapshot for which to get information.
     * </p>
     * 
     * @return The name of the database snapshot for which to get information.
     */

    public String getRelationalDatabaseSnapshotName() {
        return this.relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of the database snapshot for which to get information.
     * </p>
     * 
     * @param relationalDatabaseSnapshotName
     *        The name of the database snapshot for which to get information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseSnapshotRequest withRelationalDatabaseSnapshotName(String relationalDatabaseSnapshotName) {
        setRelationalDatabaseSnapshotName(relationalDatabaseSnapshotName);
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
        if (getRelationalDatabaseSnapshotName() != null)
            sb.append("RelationalDatabaseSnapshotName: ").append(getRelationalDatabaseSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseSnapshotRequest == false)
            return false;
        GetRelationalDatabaseSnapshotRequest other = (GetRelationalDatabaseSnapshotRequest) obj;
        if (other.getRelationalDatabaseSnapshotName() == null ^ this.getRelationalDatabaseSnapshotName() == null)
            return false;
        if (other.getRelationalDatabaseSnapshotName() != null
                && other.getRelationalDatabaseSnapshotName().equals(this.getRelationalDatabaseSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabaseSnapshotName() == null) ? 0 : getRelationalDatabaseSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabaseSnapshotRequest clone() {
        return (GetRelationalDatabaseSnapshotRequest) super.clone();
    }

}
