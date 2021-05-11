/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetReplicationSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReplicationSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details of the replication set.
     * </p>
     */
    private ReplicationSet replicationSet;

    /**
     * <p>
     * Details of the replication set.
     * </p>
     * 
     * @param replicationSet
     *        Details of the replication set.
     */

    public void setReplicationSet(ReplicationSet replicationSet) {
        this.replicationSet = replicationSet;
    }

    /**
     * <p>
     * Details of the replication set.
     * </p>
     * 
     * @return Details of the replication set.
     */

    public ReplicationSet getReplicationSet() {
        return this.replicationSet;
    }

    /**
     * <p>
     * Details of the replication set.
     * </p>
     * 
     * @param replicationSet
     *        Details of the replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationSetResult withReplicationSet(ReplicationSet replicationSet) {
        setReplicationSet(replicationSet);
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
        if (getReplicationSet() != null)
            sb.append("ReplicationSet: ").append(getReplicationSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReplicationSetResult == false)
            return false;
        GetReplicationSetResult other = (GetReplicationSetResult) obj;
        if (other.getReplicationSet() == null ^ this.getReplicationSet() == null)
            return false;
        if (other.getReplicationSet() != null && other.getReplicationSet().equals(this.getReplicationSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationSet() == null) ? 0 : getReplicationSet().hashCode());
        return hashCode;
    }

    @Override
    public GetReplicationSetResult clone() {
        try {
            return (GetReplicationSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
