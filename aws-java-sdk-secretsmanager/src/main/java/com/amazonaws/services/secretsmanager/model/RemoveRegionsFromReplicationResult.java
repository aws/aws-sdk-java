/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RemoveRegionsFromReplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveRegionsFromReplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the primary secret.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The status of replicas for this secret after you remove Regions.
     * </p>
     */
    private java.util.List<ReplicationStatusType> replicationStatus;

    /**
     * <p>
     * The ARN of the primary secret.
     * </p>
     * 
     * @param aRN
     *        The ARN of the primary secret.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN of the primary secret.
     * </p>
     * 
     * @return The ARN of the primary secret.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN of the primary secret.
     * </p>
     * 
     * @param aRN
     *        The ARN of the primary secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveRegionsFromReplicationResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The status of replicas for this secret after you remove Regions.
     * </p>
     * 
     * @return The status of replicas for this secret after you remove Regions.
     */

    public java.util.List<ReplicationStatusType> getReplicationStatus() {
        return replicationStatus;
    }

    /**
     * <p>
     * The status of replicas for this secret after you remove Regions.
     * </p>
     * 
     * @param replicationStatus
     *        The status of replicas for this secret after you remove Regions.
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
     * The status of replicas for this secret after you remove Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationStatus(java.util.Collection)} or {@link #withReplicationStatus(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationStatus
     *        The status of replicas for this secret after you remove Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveRegionsFromReplicationResult withReplicationStatus(ReplicationStatusType... replicationStatus) {
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
     * The status of replicas for this secret after you remove Regions.
     * </p>
     * 
     * @param replicationStatus
     *        The status of replicas for this secret after you remove Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveRegionsFromReplicationResult withReplicationStatus(java.util.Collection<ReplicationStatusType> replicationStatus) {
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

        if (obj instanceof RemoveRegionsFromReplicationResult == false)
            return false;
        RemoveRegionsFromReplicationResult other = (RemoveRegionsFromReplicationResult) obj;
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
    public RemoveRegionsFromReplicationResult clone() {
        try {
            return (RemoveRegionsFromReplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
