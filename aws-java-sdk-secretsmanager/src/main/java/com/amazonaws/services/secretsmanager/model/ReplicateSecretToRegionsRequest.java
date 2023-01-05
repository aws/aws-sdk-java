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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ReplicateSecretToRegions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicateSecretToRegionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or name of the secret to replicate.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * A list of Regions in which to replicate the secret.
     * </p>
     */
    private java.util.List<ReplicaRegionType> addReplicaRegions;
    /**
     * <p>
     * Specifies whether to overwrite a secret with the same name in the destination Region.
     * </p>
     */
    private Boolean forceOverwriteReplicaSecret;

    /**
     * <p>
     * The ARN or name of the secret to replicate.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to replicate.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret to replicate.
     * </p>
     * 
     * @return The ARN or name of the secret to replicate.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret to replicate.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to replicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateSecretToRegionsRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * A list of Regions in which to replicate the secret.
     * </p>
     * 
     * @return A list of Regions in which to replicate the secret.
     */

    public java.util.List<ReplicaRegionType> getAddReplicaRegions() {
        return addReplicaRegions;
    }

    /**
     * <p>
     * A list of Regions in which to replicate the secret.
     * </p>
     * 
     * @param addReplicaRegions
     *        A list of Regions in which to replicate the secret.
     */

    public void setAddReplicaRegions(java.util.Collection<ReplicaRegionType> addReplicaRegions) {
        if (addReplicaRegions == null) {
            this.addReplicaRegions = null;
            return;
        }

        this.addReplicaRegions = new java.util.ArrayList<ReplicaRegionType>(addReplicaRegions);
    }

    /**
     * <p>
     * A list of Regions in which to replicate the secret.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddReplicaRegions(java.util.Collection)} or {@link #withAddReplicaRegions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param addReplicaRegions
     *        A list of Regions in which to replicate the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateSecretToRegionsRequest withAddReplicaRegions(ReplicaRegionType... addReplicaRegions) {
        if (this.addReplicaRegions == null) {
            setAddReplicaRegions(new java.util.ArrayList<ReplicaRegionType>(addReplicaRegions.length));
        }
        for (ReplicaRegionType ele : addReplicaRegions) {
            this.addReplicaRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Regions in which to replicate the secret.
     * </p>
     * 
     * @param addReplicaRegions
     *        A list of Regions in which to replicate the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateSecretToRegionsRequest withAddReplicaRegions(java.util.Collection<ReplicaRegionType> addReplicaRegions) {
        setAddReplicaRegions(addReplicaRegions);
        return this;
    }

    /**
     * <p>
     * Specifies whether to overwrite a secret with the same name in the destination Region.
     * </p>
     * 
     * @param forceOverwriteReplicaSecret
     *        Specifies whether to overwrite a secret with the same name in the destination Region.
     */

    public void setForceOverwriteReplicaSecret(Boolean forceOverwriteReplicaSecret) {
        this.forceOverwriteReplicaSecret = forceOverwriteReplicaSecret;
    }

    /**
     * <p>
     * Specifies whether to overwrite a secret with the same name in the destination Region.
     * </p>
     * 
     * @return Specifies whether to overwrite a secret with the same name in the destination Region.
     */

    public Boolean getForceOverwriteReplicaSecret() {
        return this.forceOverwriteReplicaSecret;
    }

    /**
     * <p>
     * Specifies whether to overwrite a secret with the same name in the destination Region.
     * </p>
     * 
     * @param forceOverwriteReplicaSecret
     *        Specifies whether to overwrite a secret with the same name in the destination Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateSecretToRegionsRequest withForceOverwriteReplicaSecret(Boolean forceOverwriteReplicaSecret) {
        setForceOverwriteReplicaSecret(forceOverwriteReplicaSecret);
        return this;
    }

    /**
     * <p>
     * Specifies whether to overwrite a secret with the same name in the destination Region.
     * </p>
     * 
     * @return Specifies whether to overwrite a secret with the same name in the destination Region.
     */

    public Boolean isForceOverwriteReplicaSecret() {
        return this.forceOverwriteReplicaSecret;
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
        if (getAddReplicaRegions() != null)
            sb.append("AddReplicaRegions: ").append(getAddReplicaRegions()).append(",");
        if (getForceOverwriteReplicaSecret() != null)
            sb.append("ForceOverwriteReplicaSecret: ").append(getForceOverwriteReplicaSecret());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicateSecretToRegionsRequest == false)
            return false;
        ReplicateSecretToRegionsRequest other = (ReplicateSecretToRegionsRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getAddReplicaRegions() == null ^ this.getAddReplicaRegions() == null)
            return false;
        if (other.getAddReplicaRegions() != null && other.getAddReplicaRegions().equals(this.getAddReplicaRegions()) == false)
            return false;
        if (other.getForceOverwriteReplicaSecret() == null ^ this.getForceOverwriteReplicaSecret() == null)
            return false;
        if (other.getForceOverwriteReplicaSecret() != null && other.getForceOverwriteReplicaSecret().equals(this.getForceOverwriteReplicaSecret()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getAddReplicaRegions() == null) ? 0 : getAddReplicaRegions().hashCode());
        hashCode = prime * hashCode + ((getForceOverwriteReplicaSecret() == null) ? 0 : getForceOverwriteReplicaSecret().hashCode());
        return hashCode;
    }

    @Override
    public ReplicateSecretToRegionsRequest clone() {
        return (ReplicateSecretToRegionsRequest) super.clone();
    }

}
