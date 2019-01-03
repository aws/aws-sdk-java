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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateGlobalTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGlobalTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The global table name.
     * </p>
     */
    private String globalTableName;
    /**
     * <p>
     * A list of regions that should be added or removed from the global table.
     * </p>
     */
    private java.util.List<ReplicaUpdate> replicaUpdates;

    /**
     * <p>
     * The global table name.
     * </p>
     * 
     * @param globalTableName
     *        The global table name.
     */

    public void setGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
    }

    /**
     * <p>
     * The global table name.
     * </p>
     * 
     * @return The global table name.
     */

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    /**
     * <p>
     * The global table name.
     * </p>
     * 
     * @param globalTableName
     *        The global table name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalTableRequest withGlobalTableName(String globalTableName) {
        setGlobalTableName(globalTableName);
        return this;
    }

    /**
     * <p>
     * A list of regions that should be added or removed from the global table.
     * </p>
     * 
     * @return A list of regions that should be added or removed from the global table.
     */

    public java.util.List<ReplicaUpdate> getReplicaUpdates() {
        return replicaUpdates;
    }

    /**
     * <p>
     * A list of regions that should be added or removed from the global table.
     * </p>
     * 
     * @param replicaUpdates
     *        A list of regions that should be added or removed from the global table.
     */

    public void setReplicaUpdates(java.util.Collection<ReplicaUpdate> replicaUpdates) {
        if (replicaUpdates == null) {
            this.replicaUpdates = null;
            return;
        }

        this.replicaUpdates = new java.util.ArrayList<ReplicaUpdate>(replicaUpdates);
    }

    /**
     * <p>
     * A list of regions that should be added or removed from the global table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaUpdates(java.util.Collection)} or {@link #withReplicaUpdates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param replicaUpdates
     *        A list of regions that should be added or removed from the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalTableRequest withReplicaUpdates(ReplicaUpdate... replicaUpdates) {
        if (this.replicaUpdates == null) {
            setReplicaUpdates(new java.util.ArrayList<ReplicaUpdate>(replicaUpdates.length));
        }
        for (ReplicaUpdate ele : replicaUpdates) {
            this.replicaUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regions that should be added or removed from the global table.
     * </p>
     * 
     * @param replicaUpdates
     *        A list of regions that should be added or removed from the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalTableRequest withReplicaUpdates(java.util.Collection<ReplicaUpdate> replicaUpdates) {
        setReplicaUpdates(replicaUpdates);
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
        if (getGlobalTableName() != null)
            sb.append("GlobalTableName: ").append(getGlobalTableName()).append(",");
        if (getReplicaUpdates() != null)
            sb.append("ReplicaUpdates: ").append(getReplicaUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlobalTableRequest == false)
            return false;
        UpdateGlobalTableRequest other = (UpdateGlobalTableRequest) obj;
        if (other.getGlobalTableName() == null ^ this.getGlobalTableName() == null)
            return false;
        if (other.getGlobalTableName() != null && other.getGlobalTableName().equals(this.getGlobalTableName()) == false)
            return false;
        if (other.getReplicaUpdates() == null ^ this.getReplicaUpdates() == null)
            return false;
        if (other.getReplicaUpdates() != null && other.getReplicaUpdates().equals(this.getReplicaUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalTableName() == null) ? 0 : getGlobalTableName().hashCode());
        hashCode = prime * hashCode + ((getReplicaUpdates() == null) ? 0 : getReplicaUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGlobalTableRequest clone() {
        return (UpdateGlobalTableRequest) super.clone();
    }

}
