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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopRelationalDatabase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopRelationalDatabaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your database to stop.
     * </p>
     */
    private String relationalDatabaseName;
    /**
     * <p>
     * The name of your new database snapshot to be created before stopping your database.
     * </p>
     */
    private String relationalDatabaseSnapshotName;

    /**
     * <p>
     * The name of your database to stop.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database to stop.
     */

    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database to stop.
     * </p>
     * 
     * @return The name of your database to stop.
     */

    public String getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database to stop.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopRelationalDatabaseRequest withRelationalDatabaseName(String relationalDatabaseName) {
        setRelationalDatabaseName(relationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name of your new database snapshot to be created before stopping your database.
     * </p>
     * 
     * @param relationalDatabaseSnapshotName
     *        The name of your new database snapshot to be created before stopping your database.
     */

    public void setRelationalDatabaseSnapshotName(String relationalDatabaseSnapshotName) {
        this.relationalDatabaseSnapshotName = relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of your new database snapshot to be created before stopping your database.
     * </p>
     * 
     * @return The name of your new database snapshot to be created before stopping your database.
     */

    public String getRelationalDatabaseSnapshotName() {
        return this.relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of your new database snapshot to be created before stopping your database.
     * </p>
     * 
     * @param relationalDatabaseSnapshotName
     *        The name of your new database snapshot to be created before stopping your database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopRelationalDatabaseRequest withRelationalDatabaseSnapshotName(String relationalDatabaseSnapshotName) {
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
        if (getRelationalDatabaseName() != null)
            sb.append("RelationalDatabaseName: ").append(getRelationalDatabaseName()).append(",");
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

        if (obj instanceof StopRelationalDatabaseRequest == false)
            return false;
        StopRelationalDatabaseRequest other = (StopRelationalDatabaseRequest) obj;
        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getRelationalDatabaseSnapshotName() == null) ? 0 : getRelationalDatabaseSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public StopRelationalDatabaseRequest clone() {
        return (StopRelationalDatabaseRequest) super.clone();
    }

}
