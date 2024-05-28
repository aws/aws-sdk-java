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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateSourceServerReplicationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSourceServerReplicationTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Account ID on which to update replication type.
     * </p>
     */
    private String accountID;
    /**
     * <p>
     * Replication type to which to update source server.
     * </p>
     */
    private String replicationType;
    /**
     * <p>
     * ID of source server on which to update replication type.
     * </p>
     */
    private String sourceServerID;

    /**
     * <p>
     * Account ID on which to update replication type.
     * </p>
     * 
     * @param accountID
     *        Account ID on which to update replication type.
     */

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * <p>
     * Account ID on which to update replication type.
     * </p>
     * 
     * @return Account ID on which to update replication type.
     */

    public String getAccountID() {
        return this.accountID;
    }

    /**
     * <p>
     * Account ID on which to update replication type.
     * </p>
     * 
     * @param accountID
     *        Account ID on which to update replication type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceServerReplicationTypeRequest withAccountID(String accountID) {
        setAccountID(accountID);
        return this;
    }

    /**
     * <p>
     * Replication type to which to update source server.
     * </p>
     * 
     * @param replicationType
     *        Replication type to which to update source server.
     * @see ReplicationType
     */

    public void setReplicationType(String replicationType) {
        this.replicationType = replicationType;
    }

    /**
     * <p>
     * Replication type to which to update source server.
     * </p>
     * 
     * @return Replication type to which to update source server.
     * @see ReplicationType
     */

    public String getReplicationType() {
        return this.replicationType;
    }

    /**
     * <p>
     * Replication type to which to update source server.
     * </p>
     * 
     * @param replicationType
     *        Replication type to which to update source server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationType
     */

    public UpdateSourceServerReplicationTypeRequest withReplicationType(String replicationType) {
        setReplicationType(replicationType);
        return this;
    }

    /**
     * <p>
     * Replication type to which to update source server.
     * </p>
     * 
     * @param replicationType
     *        Replication type to which to update source server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationType
     */

    public UpdateSourceServerReplicationTypeRequest withReplicationType(ReplicationType replicationType) {
        this.replicationType = replicationType.toString();
        return this;
    }

    /**
     * <p>
     * ID of source server on which to update replication type.
     * </p>
     * 
     * @param sourceServerID
     *        ID of source server on which to update replication type.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * ID of source server on which to update replication type.
     * </p>
     * 
     * @return ID of source server on which to update replication type.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * ID of source server on which to update replication type.
     * </p>
     * 
     * @param sourceServerID
     *        ID of source server on which to update replication type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceServerReplicationTypeRequest withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
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
        if (getAccountID() != null)
            sb.append("AccountID: ").append(getAccountID()).append(",");
        if (getReplicationType() != null)
            sb.append("ReplicationType: ").append(getReplicationType()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSourceServerReplicationTypeRequest == false)
            return false;
        UpdateSourceServerReplicationTypeRequest other = (UpdateSourceServerReplicationTypeRequest) obj;
        if (other.getAccountID() == null ^ this.getAccountID() == null)
            return false;
        if (other.getAccountID() != null && other.getAccountID().equals(this.getAccountID()) == false)
            return false;
        if (other.getReplicationType() == null ^ this.getReplicationType() == null)
            return false;
        if (other.getReplicationType() != null && other.getReplicationType().equals(this.getReplicationType()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountID() == null) ? 0 : getAccountID().hashCode());
        hashCode = prime * hashCode + ((getReplicationType() == null) ? 0 : getReplicationType().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSourceServerReplicationTypeRequest clone() {
        return (UpdateSourceServerReplicationTypeRequest) super.clone();
    }

}
