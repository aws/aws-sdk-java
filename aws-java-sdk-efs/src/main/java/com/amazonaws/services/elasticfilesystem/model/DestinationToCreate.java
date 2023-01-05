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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the destination file system to create in the replication configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DestinationToCreate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationToCreate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * To create a file system that uses Regional storage, specify the Amazon Web Services Region in which to create the
     * destination file system.
     * </p>
     */
    private String region;
    /**
     * <p>
     * To create a file system that uses EFS One Zone storage, specify the name of the Availability Zone in which to
     * create the destination file system.
     * </p>
     */
    private String availabilityZoneName;
    /**
     * <p>
     * Specifies the Key Management Service (KMS) key that you want to use to encrypt the destination file system. If
     * you do not specify a KMS key, Amazon EFS uses your default KMS key for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>. This ID can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - The unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - The Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - The ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;

    /**
     * <p>
     * To create a file system that uses Regional storage, specify the Amazon Web Services Region in which to create the
     * destination file system.
     * </p>
     * 
     * @param region
     *        To create a file system that uses Regional storage, specify the Amazon Web Services Region in which to
     *        create the destination file system.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * To create a file system that uses Regional storage, specify the Amazon Web Services Region in which to create the
     * destination file system.
     * </p>
     * 
     * @return To create a file system that uses Regional storage, specify the Amazon Web Services Region in which to
     *         create the destination file system.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * To create a file system that uses Regional storage, specify the Amazon Web Services Region in which to create the
     * destination file system.
     * </p>
     * 
     * @param region
     *        To create a file system that uses Regional storage, specify the Amazon Web Services Region in which to
     *        create the destination file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationToCreate withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * To create a file system that uses EFS One Zone storage, specify the name of the Availability Zone in which to
     * create the destination file system.
     * </p>
     * 
     * @param availabilityZoneName
     *        To create a file system that uses EFS One Zone storage, specify the name of the Availability Zone in which
     *        to create the destination file system.
     */

    public void setAvailabilityZoneName(String availabilityZoneName) {
        this.availabilityZoneName = availabilityZoneName;
    }

    /**
     * <p>
     * To create a file system that uses EFS One Zone storage, specify the name of the Availability Zone in which to
     * create the destination file system.
     * </p>
     * 
     * @return To create a file system that uses EFS One Zone storage, specify the name of the Availability Zone in
     *         which to create the destination file system.
     */

    public String getAvailabilityZoneName() {
        return this.availabilityZoneName;
    }

    /**
     * <p>
     * To create a file system that uses EFS One Zone storage, specify the name of the Availability Zone in which to
     * create the destination file system.
     * </p>
     * 
     * @param availabilityZoneName
     *        To create a file system that uses EFS One Zone storage, specify the name of the Availability Zone in which
     *        to create the destination file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationToCreate withAvailabilityZoneName(String availabilityZoneName) {
        setAvailabilityZoneName(availabilityZoneName);
        return this;
    }

    /**
     * <p>
     * Specifies the Key Management Service (KMS) key that you want to use to encrypt the destination file system. If
     * you do not specify a KMS key, Amazon EFS uses your default KMS key for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>. This ID can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - The unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - The Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - The ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        Specifies the Key Management Service (KMS) key that you want to use to encrypt the destination file
     *        system. If you do not specify a KMS key, Amazon EFS uses your default KMS key for Amazon EFS,
     *        <code>/aws/elasticfilesystem</code>. This ID can be in one of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID - The unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN - The Amazon Resource Name (ARN) for the key, for example
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias ARN - The ARN for a key alias, for example
     *        <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Specifies the Key Management Service (KMS) key that you want to use to encrypt the destination file system. If
     * you do not specify a KMS key, Amazon EFS uses your default KMS key for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>. This ID can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - The unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - The Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - The ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the Key Management Service (KMS) key that you want to use to encrypt the destination file
     *         system. If you do not specify a KMS key, Amazon EFS uses your default KMS key for Amazon EFS,
     *         <code>/aws/elasticfilesystem</code>. This ID can be in one of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID - The unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN - The Amazon Resource Name (ARN) for the key, for example
     *         <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias ARN - The ARN for a key alias, for example
     *         <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Specifies the Key Management Service (KMS) key that you want to use to encrypt the destination file system. If
     * you do not specify a KMS key, Amazon EFS uses your default KMS key for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>. This ID can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - The unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - The Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - The ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        Specifies the Key Management Service (KMS) key that you want to use to encrypt the destination file
     *        system. If you do not specify a KMS key, Amazon EFS uses your default KMS key for Amazon EFS,
     *        <code>/aws/elasticfilesystem</code>. This ID can be in one of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID - The unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN - The Amazon Resource Name (ARN) for the key, for example
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias ARN - The ARN for a key alias, for example
     *        <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationToCreate withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getAvailabilityZoneName() != null)
            sb.append("AvailabilityZoneName: ").append(getAvailabilityZoneName()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationToCreate == false)
            return false;
        DestinationToCreate other = (DestinationToCreate) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAvailabilityZoneName() == null ^ this.getAvailabilityZoneName() == null)
            return false;
        if (other.getAvailabilityZoneName() != null && other.getAvailabilityZoneName().equals(this.getAvailabilityZoneName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneName() == null) ? 0 : getAvailabilityZoneName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public DestinationToCreate clone() {
        try {
            return (DestinationToCreate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticfilesystem.model.transform.DestinationToCreateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
