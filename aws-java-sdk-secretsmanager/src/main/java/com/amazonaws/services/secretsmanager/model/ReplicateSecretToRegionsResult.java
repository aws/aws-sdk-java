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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ReplicateSecretToRegions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicateSecretToRegionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Replicate a secret based on the <code>ReplicaRegionType</code>&gt; consisting of a Region(required) and a
     * KMSKeyId (optional) which can be the ARN, KeyID, or Alias.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * Describes the secret replication status as <code>PENDING</code>, <code>SUCCESS</code> or <code>FAIL</code>.
     * </p>
     */
    private java.util.List<ReplicationStatusType> replicationStatus;

    /**
     * <p>
     * Replicate a secret based on the <code>ReplicaRegionType</code>&gt; consisting of a Region(required) and a
     * KMSKeyId (optional) which can be the ARN, KeyID, or Alias.
     * </p>
     * 
     * @param aRN
     *        Replicate a secret based on the <code>ReplicaRegionType</code>&gt; consisting of a Region(required) and a
     *        KMSKeyId (optional) which can be the ARN, KeyID, or Alias.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * Replicate a secret based on the <code>ReplicaRegionType</code>&gt; consisting of a Region(required) and a
     * KMSKeyId (optional) which can be the ARN, KeyID, or Alias.
     * </p>
     * 
     * @return Replicate a secret based on the <code>ReplicaRegionType</code>&gt; consisting of a Region(required) and a
     *         KMSKeyId (optional) which can be the ARN, KeyID, or Alias.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * Replicate a secret based on the <code>ReplicaRegionType</code>&gt; consisting of a Region(required) and a
     * KMSKeyId (optional) which can be the ARN, KeyID, or Alias.
     * </p>
     * 
     * @param aRN
     *        Replicate a secret based on the <code>ReplicaRegionType</code>&gt; consisting of a Region(required) and a
     *        KMSKeyId (optional) which can be the ARN, KeyID, or Alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateSecretToRegionsResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * Describes the secret replication status as <code>PENDING</code>, <code>SUCCESS</code> or <code>FAIL</code>.
     * </p>
     * 
     * @return Describes the secret replication status as <code>PENDING</code>, <code>SUCCESS</code> or
     *         <code>FAIL</code>.
     */

    public java.util.List<ReplicationStatusType> getReplicationStatus() {
        return replicationStatus;
    }

    /**
     * <p>
     * Describes the secret replication status as <code>PENDING</code>, <code>SUCCESS</code> or <code>FAIL</code>.
     * </p>
     * 
     * @param replicationStatus
     *        Describes the secret replication status as <code>PENDING</code>, <code>SUCCESS</code> or <code>FAIL</code>
     *        .
     */

    public void setReplicationStatus(java.util.Collection<ReplicationStatusType> replicationStatus) {
        if (replicationStatus == null) {
            this.replicationStatus = null;
            return;
        }

        this.replicationStatus = new java.util.ArrayList<ReplicationStatusType>(replicationStatus);
    }

    /**
     * <p>
     * Describes the secret replication status as <code>PENDING</code>, <code>SUCCESS</code> or <code>FAIL</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationStatus(java.util.Collection)} or {@link #withReplicationStatus(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationStatus
     *        Describes the secret replication status as <code>PENDING</code>, <code>SUCCESS</code> or <code>FAIL</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateSecretToRegionsResult withReplicationStatus(ReplicationStatusType... replicationStatus) {
        if (this.replicationStatus == null) {
            setReplicationStatus(new java.util.ArrayList<ReplicationStatusType>(replicationStatus.length));
        }
        for (ReplicationStatusType ele : replicationStatus) {
            this.replicationStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the secret replication status as <code>PENDING</code>, <code>SUCCESS</code> or <code>FAIL</code>.
     * </p>
     * 
     * @param replicationStatus
     *        Describes the secret replication status as <code>PENDING</code>, <code>SUCCESS</code> or <code>FAIL</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateSecretToRegionsResult withReplicationStatus(java.util.Collection<ReplicationStatusType> replicationStatus) {
        setReplicationStatus(replicationStatus);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getReplicationStatus() != null)
            sb.append("ReplicationStatus: ").append(getReplicationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicateSecretToRegionsResult == false)
            return false;
        ReplicateSecretToRegionsResult other = (ReplicateSecretToRegionsResult) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getReplicationStatus() == null ^ this.getReplicationStatus() == null)
            return false;
        if (other.getReplicationStatus() != null && other.getReplicationStatus().equals(this.getReplicationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getReplicationStatus() == null) ? 0 : getReplicationStatus().hashCode());
        return hashCode;
    }

    @Override
    public ReplicateSecretToRegionsResult clone() {
        try {
            return (ReplicateSecretToRegionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
