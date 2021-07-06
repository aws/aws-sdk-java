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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about settings that define whether one or more objects in an S3 bucket are replicated to S3
 * buckets for other Amazon Web Services accounts and, if so, which accounts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ReplicationDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to any destination.
     * </p>
     */
    private Boolean replicated;
    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to an Amazon Web Services account
     * that isn't part of the same Amazon Macie organization.
     * </p>
     */
    private Boolean replicatedExternally;
    /**
     * <p>
     * An array of Amazon Web Services account IDs, one for each Amazon Web Services account that the bucket is
     * configured to replicate one or more objects to.
     * </p>
     */
    private java.util.List<String> replicationAccounts;

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to any destination.
     * </p>
     * 
     * @param replicated
     *        Specifies whether the bucket is configured to replicate one or more objects to any destination.
     */

    public void setReplicated(Boolean replicated) {
        this.replicated = replicated;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to any destination.
     * </p>
     * 
     * @return Specifies whether the bucket is configured to replicate one or more objects to any destination.
     */

    public Boolean getReplicated() {
        return this.replicated;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to any destination.
     * </p>
     * 
     * @param replicated
     *        Specifies whether the bucket is configured to replicate one or more objects to any destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationDetails withReplicated(Boolean replicated) {
        setReplicated(replicated);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to any destination.
     * </p>
     * 
     * @return Specifies whether the bucket is configured to replicate one or more objects to any destination.
     */

    public Boolean isReplicated() {
        return this.replicated;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to an Amazon Web Services account
     * that isn't part of the same Amazon Macie organization.
     * </p>
     * 
     * @param replicatedExternally
     *        Specifies whether the bucket is configured to replicate one or more objects to an Amazon Web Services
     *        account that isn't part of the same Amazon Macie organization.
     */

    public void setReplicatedExternally(Boolean replicatedExternally) {
        this.replicatedExternally = replicatedExternally;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to an Amazon Web Services account
     * that isn't part of the same Amazon Macie organization.
     * </p>
     * 
     * @return Specifies whether the bucket is configured to replicate one or more objects to an Amazon Web Services
     *         account that isn't part of the same Amazon Macie organization.
     */

    public Boolean getReplicatedExternally() {
        return this.replicatedExternally;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to an Amazon Web Services account
     * that isn't part of the same Amazon Macie organization.
     * </p>
     * 
     * @param replicatedExternally
     *        Specifies whether the bucket is configured to replicate one or more objects to an Amazon Web Services
     *        account that isn't part of the same Amazon Macie organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationDetails withReplicatedExternally(Boolean replicatedExternally) {
        setReplicatedExternally(replicatedExternally);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to an Amazon Web Services account
     * that isn't part of the same Amazon Macie organization.
     * </p>
     * 
     * @return Specifies whether the bucket is configured to replicate one or more objects to an Amazon Web Services
     *         account that isn't part of the same Amazon Macie organization.
     */

    public Boolean isReplicatedExternally() {
        return this.replicatedExternally;
    }

    /**
     * <p>
     * An array of Amazon Web Services account IDs, one for each Amazon Web Services account that the bucket is
     * configured to replicate one or more objects to.
     * </p>
     * 
     * @return An array of Amazon Web Services account IDs, one for each Amazon Web Services account that the bucket is
     *         configured to replicate one or more objects to.
     */

    public java.util.List<String> getReplicationAccounts() {
        return replicationAccounts;
    }

    /**
     * <p>
     * An array of Amazon Web Services account IDs, one for each Amazon Web Services account that the bucket is
     * configured to replicate one or more objects to.
     * </p>
     * 
     * @param replicationAccounts
     *        An array of Amazon Web Services account IDs, one for each Amazon Web Services account that the bucket is
     *        configured to replicate one or more objects to.
     */

    public void setReplicationAccounts(java.util.Collection<String> replicationAccounts) {
        if (replicationAccounts == null) {
            this.replicationAccounts = null;
            return;
        }

        this.replicationAccounts = new java.util.ArrayList<String>(replicationAccounts);
    }

    /**
     * <p>
     * An array of Amazon Web Services account IDs, one for each Amazon Web Services account that the bucket is
     * configured to replicate one or more objects to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationAccounts(java.util.Collection)} or {@link #withReplicationAccounts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param replicationAccounts
     *        An array of Amazon Web Services account IDs, one for each Amazon Web Services account that the bucket is
     *        configured to replicate one or more objects to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationDetails withReplicationAccounts(String... replicationAccounts) {
        if (this.replicationAccounts == null) {
            setReplicationAccounts(new java.util.ArrayList<String>(replicationAccounts.length));
        }
        for (String ele : replicationAccounts) {
            this.replicationAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Web Services account IDs, one for each Amazon Web Services account that the bucket is
     * configured to replicate one or more objects to.
     * </p>
     * 
     * @param replicationAccounts
     *        An array of Amazon Web Services account IDs, one for each Amazon Web Services account that the bucket is
     *        configured to replicate one or more objects to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationDetails withReplicationAccounts(java.util.Collection<String> replicationAccounts) {
        setReplicationAccounts(replicationAccounts);
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
        if (getReplicated() != null)
            sb.append("Replicated: ").append(getReplicated()).append(",");
        if (getReplicatedExternally() != null)
            sb.append("ReplicatedExternally: ").append(getReplicatedExternally()).append(",");
        if (getReplicationAccounts() != null)
            sb.append("ReplicationAccounts: ").append(getReplicationAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationDetails == false)
            return false;
        ReplicationDetails other = (ReplicationDetails) obj;
        if (other.getReplicated() == null ^ this.getReplicated() == null)
            return false;
        if (other.getReplicated() != null && other.getReplicated().equals(this.getReplicated()) == false)
            return false;
        if (other.getReplicatedExternally() == null ^ this.getReplicatedExternally() == null)
            return false;
        if (other.getReplicatedExternally() != null && other.getReplicatedExternally().equals(this.getReplicatedExternally()) == false)
            return false;
        if (other.getReplicationAccounts() == null ^ this.getReplicationAccounts() == null)
            return false;
        if (other.getReplicationAccounts() != null && other.getReplicationAccounts().equals(this.getReplicationAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicated() == null) ? 0 : getReplicated().hashCode());
        hashCode = prime * hashCode + ((getReplicatedExternally() == null) ? 0 : getReplicatedExternally().hashCode());
        hashCode = prime * hashCode + ((getReplicationAccounts() == null) ? 0 : getReplicationAccounts().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationDetails clone() {
        try {
            return (ReplicationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ReplicationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
