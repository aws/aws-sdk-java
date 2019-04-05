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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartRestoreJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartRestoreJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     */
    private String recoveryPointArn;
    /**
     * <p>
     * A set of metadata key-value pairs. Lists the metadata that the recovery point was created with.
     * </p>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartRestoreJob</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>StartRestoreJob</code> multiple times
     * with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one restore
     * job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are
     * requesting to start multiple restores.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * Starts a job to restore a recovery point for one of the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SGW</code> for AWS Storage Gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * </ul>
     */
    private String resourceType;

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param recoveryPointArn
     *        An ARN that uniquely identifies a recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @return An ARN that uniquely identifies a recovery point; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public String getRecoveryPointArn() {
        return this.recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param recoveryPointArn
     *        An ARN that uniquely identifies a recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRestoreJobRequest withRecoveryPointArn(String recoveryPointArn) {
        setRecoveryPointArn(recoveryPointArn);
        return this;
    }

    /**
     * <p>
     * A set of metadata key-value pairs. Lists the metadata that the recovery point was created with.
     * </p>
     * 
     * @return A set of metadata key-value pairs. Lists the metadata that the recovery point was created with.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * A set of metadata key-value pairs. Lists the metadata that the recovery point was created with.
     * </p>
     * 
     * @param metadata
     *        A set of metadata key-value pairs. Lists the metadata that the recovery point was created with.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * A set of metadata key-value pairs. Lists the metadata that the recovery point was created with.
     * </p>
     * 
     * @param metadata
     *        A set of metadata key-value pairs. Lists the metadata that the recovery point was created with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRestoreJobRequest withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    public StartRestoreJobRequest addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRestoreJobRequest clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target recovery point;
     *        for example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target recovery point;
     *         for example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target recovery point;
     *        for example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRestoreJobRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartRestoreJob</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>StartRestoreJob</code> multiple times
     * with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one restore
     * job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are
     * requesting to start multiple restores.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer chosen string that can be used to distinguish between calls to <code>StartRestoreJob</code>.
     *        Idempotency tokens time out after one hour. Therefore, if you call <code>StartRestoreJob</code> multiple
     *        times with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only
     *        one restore job and initiates only one. If you change the idempotency token for each call, AWS Backup
     *        recognizes that you are requesting to start multiple restores.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartRestoreJob</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>StartRestoreJob</code> multiple times
     * with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one restore
     * job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are
     * requesting to start multiple restores.
     * </p>
     * 
     * @return A customer chosen string that can be used to distinguish between calls to <code>StartRestoreJob</code>.
     *         Idempotency tokens time out after one hour. Therefore, if you call <code>StartRestoreJob</code> multiple
     *         times with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only
     *         one restore job and initiates only one. If you change the idempotency token for each call, AWS Backup
     *         recognizes that you are requesting to start multiple restores.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartRestoreJob</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>StartRestoreJob</code> multiple times
     * with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one restore
     * job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are
     * requesting to start multiple restores.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer chosen string that can be used to distinguish between calls to <code>StartRestoreJob</code>.
     *        Idempotency tokens time out after one hour. Therefore, if you call <code>StartRestoreJob</code> multiple
     *        times with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only
     *        one restore job and initiates only one. If you change the idempotency token for each call, AWS Backup
     *        recognizes that you are requesting to start multiple restores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRestoreJobRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * Starts a job to restore a recovery point for one of the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SGW</code> for AWS Storage Gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        Starts a job to restore a recovery point for one of the following resources:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EBS</code> for Amazon Elastic Block Store
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SGW</code> for AWS Storage Gateway
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDS</code> for Amazon Relational Database Service
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DDB</code> for Amazon DynamoDB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EFS</code> for Amazon Elastic File System
     *        </p>
     *        </li>
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Starts a job to restore a recovery point for one of the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SGW</code> for AWS Storage Gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * </ul>
     * 
     * @return Starts a job to restore a recovery point for one of the following resources:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EBS</code> for Amazon Elastic Block Store
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SGW</code> for AWS Storage Gateway
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RDS</code> for Amazon Relational Database Service
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DDB</code> for Amazon DynamoDB
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EFS</code> for Amazon Elastic File System
     *         </p>
     *         </li>
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Starts a job to restore a recovery point for one of the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SGW</code> for AWS Storage Gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        Starts a job to restore a recovery point for one of the following resources:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EBS</code> for Amazon Elastic Block Store
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SGW</code> for AWS Storage Gateway
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDS</code> for Amazon Relational Database Service
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DDB</code> for Amazon DynamoDB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EFS</code> for Amazon Elastic File System
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRestoreJobRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: ").append(getRecoveryPointArn()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartRestoreJobRequest == false)
            return false;
        StartRestoreJobRequest other = (StartRestoreJobRequest) obj;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public StartRestoreJobRequest clone() {
        return (StartRestoreJobRequest) super.clone();
    }

}
