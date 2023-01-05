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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RemoveRegionsFromReplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveRegionsFromReplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * The Regions of the replicas to remove.
     * </p>
     */
    private java.util.List<String> removeReplicaRegions;

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * 
     * @return The ARN or name of the secret.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveRegionsFromReplicationRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * The Regions of the replicas to remove.
     * </p>
     * 
     * @return The Regions of the replicas to remove.
     */

    public java.util.List<String> getRemoveReplicaRegions() {
        return removeReplicaRegions;
    }

    /**
     * <p>
     * The Regions of the replicas to remove.
     * </p>
     * 
     * @param removeReplicaRegions
     *        The Regions of the replicas to remove.
     */

    public void setRemoveReplicaRegions(java.util.Collection<String> removeReplicaRegions) {
        if (removeReplicaRegions == null) {
            this.removeReplicaRegions = null;
            return;
        }

        this.removeReplicaRegions = new java.util.ArrayList<String>(removeReplicaRegions);
    }

    /**
     * <p>
     * The Regions of the replicas to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveReplicaRegions(java.util.Collection)} or {@link #withRemoveReplicaRegions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param removeReplicaRegions
     *        The Regions of the replicas to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveRegionsFromReplicationRequest withRemoveReplicaRegions(String... removeReplicaRegions) {
        if (this.removeReplicaRegions == null) {
            setRemoveReplicaRegions(new java.util.ArrayList<String>(removeReplicaRegions.length));
        }
        for (String ele : removeReplicaRegions) {
            this.removeReplicaRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Regions of the replicas to remove.
     * </p>
     * 
     * @param removeReplicaRegions
     *        The Regions of the replicas to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveRegionsFromReplicationRequest withRemoveReplicaRegions(java.util.Collection<String> removeReplicaRegions) {
        setRemoveReplicaRegions(removeReplicaRegions);
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
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getRemoveReplicaRegions() != null)
            sb.append("RemoveReplicaRegions: ").append(getRemoveReplicaRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveRegionsFromReplicationRequest == false)
            return false;
        RemoveRegionsFromReplicationRequest other = (RemoveRegionsFromReplicationRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getRemoveReplicaRegions() == null ^ this.getRemoveReplicaRegions() == null)
            return false;
        if (other.getRemoveReplicaRegions() != null && other.getRemoveReplicaRegions().equals(this.getRemoveReplicaRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getRemoveReplicaRegions() == null) ? 0 : getRemoveReplicaRegions().hashCode());
        return hashCode;
    }

    @Override
    public RemoveRegionsFromReplicationRequest clone() {
        return (RemoveRegionsFromReplicationRequest) super.clone();
    }

}
