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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CreateSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSecretResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the new secret. The ARN includes the name of the secret followed by six random characters. This
     * ensures that if you create a new secret with the same name as a deleted secret, then users with access to the old
     * secret don't get access to the new secret because the ARNs are different.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The name of the new secret.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier associated with the version of the new secret.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * A list of the replicas of this secret and their status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code>, which indicates that the replica was not created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InSync</code>, which indicates that the replica was created.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ReplicationStatusType> replicationStatus;

    /**
     * <p>
     * The ARN of the new secret. The ARN includes the name of the secret followed by six random characters. This
     * ensures that if you create a new secret with the same name as a deleted secret, then users with access to the old
     * secret don't get access to the new secret because the ARNs are different.
     * </p>
     * 
     * @param aRN
     *        The ARN of the new secret. The ARN includes the name of the secret followed by six random characters. This
     *        ensures that if you create a new secret with the same name as a deleted secret, then users with access to
     *        the old secret don't get access to the new secret because the ARNs are different.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN of the new secret. The ARN includes the name of the secret followed by six random characters. This
     * ensures that if you create a new secret with the same name as a deleted secret, then users with access to the old
     * secret don't get access to the new secret because the ARNs are different.
     * </p>
     * 
     * @return The ARN of the new secret. The ARN includes the name of the secret followed by six random characters.
     *         This ensures that if you create a new secret with the same name as a deleted secret, then users with
     *         access to the old secret don't get access to the new secret because the ARNs are different.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN of the new secret. The ARN includes the name of the secret followed by six random characters. This
     * ensures that if you create a new secret with the same name as a deleted secret, then users with access to the old
     * secret don't get access to the new secret because the ARNs are different.
     * </p>
     * 
     * @param aRN
     *        The ARN of the new secret. The ARN includes the name of the secret followed by six random characters. This
     *        ensures that if you create a new secret with the same name as a deleted secret, then users with access to
     *        the old secret don't get access to the new secret because the ARNs are different.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The name of the new secret.
     * </p>
     * 
     * @param name
     *        The name of the new secret.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new secret.
     * </p>
     * 
     * @return The name of the new secret.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new secret.
     * </p>
     * 
     * @param name
     *        The name of the new secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier associated with the version of the new secret.
     * </p>
     * 
     * @param versionId
     *        The unique identifier associated with the version of the new secret.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The unique identifier associated with the version of the new secret.
     * </p>
     * 
     * @return The unique identifier associated with the version of the new secret.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The unique identifier associated with the version of the new secret.
     * </p>
     * 
     * @param versionId
     *        The unique identifier associated with the version of the new secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretResult withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * A list of the replicas of this secret and their status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code>, which indicates that the replica was not created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InSync</code>, which indicates that the replica was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of the replicas of this secret and their status:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Failed</code>, which indicates that the replica was not created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InSync</code>, which indicates that the replica was created.
     *         </p>
     *         </li>
     */

    public java.util.List<ReplicationStatusType> getReplicationStatus() {
        return replicationStatus;
    }

    /**
     * <p>
     * A list of the replicas of this secret and their status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code>, which indicates that the replica was not created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InSync</code>, which indicates that the replica was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicationStatus
     *        A list of the replicas of this secret and their status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code>, which indicates that the replica was not created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InSync</code>, which indicates that the replica was created.
     *        </p>
     *        </li>
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
     * A list of the replicas of this secret and their status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code>, which indicates that the replica was not created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InSync</code>, which indicates that the replica was created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationStatus(java.util.Collection)} or {@link #withReplicationStatus(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationStatus
     *        A list of the replicas of this secret and their status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code>, which indicates that the replica was not created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InSync</code>, which indicates that the replica was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretResult withReplicationStatus(ReplicationStatusType... replicationStatus) {
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
     * A list of the replicas of this secret and their status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code>, which indicates that the replica was not created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InSync</code>, which indicates that the replica was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicationStatus
     *        A list of the replicas of this secret and their status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code>, which indicates that the replica was not created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InSync</code>, which indicates that the replica was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretResult withReplicationStatus(java.util.Collection<ReplicationStatusType> replicationStatus) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
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

        if (obj instanceof CreateSecretResult == false)
            return false;
        CreateSecretResult other = (CreateSecretResult) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getReplicationStatus() == null) ? 0 : getReplicationStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateSecretResult clone() {
        try {
            return (CreateSecretResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
