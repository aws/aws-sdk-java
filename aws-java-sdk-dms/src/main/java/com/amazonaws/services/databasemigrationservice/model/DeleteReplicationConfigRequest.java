/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReplicationConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The replication config to delete.
     * </p>
     */
    private String replicationConfigArn;

    /**
     * <p>
     * The replication config to delete.
     * </p>
     * 
     * @param replicationConfigArn
     *        The replication config to delete.
     */

    public void setReplicationConfigArn(String replicationConfigArn) {
        this.replicationConfigArn = replicationConfigArn;
    }

    /**
     * <p>
     * The replication config to delete.
     * </p>
     * 
     * @return The replication config to delete.
     */

    public String getReplicationConfigArn() {
        return this.replicationConfigArn;
    }

    /**
     * <p>
     * The replication config to delete.
     * </p>
     * 
     * @param replicationConfigArn
     *        The replication config to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicationConfigRequest withReplicationConfigArn(String replicationConfigArn) {
        setReplicationConfigArn(replicationConfigArn);
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
        if (getReplicationConfigArn() != null)
            sb.append("ReplicationConfigArn: ").append(getReplicationConfigArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReplicationConfigRequest == false)
            return false;
        DeleteReplicationConfigRequest other = (DeleteReplicationConfigRequest) obj;
        if (other.getReplicationConfigArn() == null ^ this.getReplicationConfigArn() == null)
            return false;
        if (other.getReplicationConfigArn() != null && other.getReplicationConfigArn().equals(this.getReplicationConfigArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationConfigArn() == null) ? 0 : getReplicationConfigArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReplicationConfigRequest clone() {
        return (DeleteReplicationConfigRequest) super.clone();
    }

}
