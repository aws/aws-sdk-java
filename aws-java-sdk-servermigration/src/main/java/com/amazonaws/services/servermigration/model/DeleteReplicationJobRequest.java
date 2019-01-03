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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteReplicationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReplicationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     */
    private String replicationJobId;

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     * 
     * @param replicationJobId
     *        The identifier of the replication job.
     */

    public void setReplicationJobId(String replicationJobId) {
        this.replicationJobId = replicationJobId;
    }

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     * 
     * @return The identifier of the replication job.
     */

    public String getReplicationJobId() {
        return this.replicationJobId;
    }

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     * 
     * @param replicationJobId
     *        The identifier of the replication job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicationJobRequest withReplicationJobId(String replicationJobId) {
        setReplicationJobId(replicationJobId);
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
        if (getReplicationJobId() != null)
            sb.append("ReplicationJobId: ").append(getReplicationJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReplicationJobRequest == false)
            return false;
        DeleteReplicationJobRequest other = (DeleteReplicationJobRequest) obj;
        if (other.getReplicationJobId() == null ^ this.getReplicationJobId() == null)
            return false;
        if (other.getReplicationJobId() != null && other.getReplicationJobId().equals(this.getReplicationJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationJobId() == null) ? 0 : getReplicationJobId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReplicationJobRequest clone() {
        return (DeleteReplicationJobRequest) super.clone();
    }

}
