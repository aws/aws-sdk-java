/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the default server-side encryption to apply to new objects in the bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketServerSideEncryptionByDefault"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketServerSideEncryptionByDefault implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     */
    private String sSEAlgorithm;
    /**
     * <p>
     * AWS KMS customer master key (CMK) ID to use for the default encryption.
     * </p>
     */
    private String kMSMasterKeyID;

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * 
     * @param sSEAlgorithm
     *        Server-side encryption algorithm to use for the default encryption.
     */

    public void setSSEAlgorithm(String sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm;
    }

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * 
     * @return Server-side encryption algorithm to use for the default encryption.
     */

    public String getSSEAlgorithm() {
        return this.sSEAlgorithm;
    }

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * 
     * @param sSEAlgorithm
     *        Server-side encryption algorithm to use for the default encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketServerSideEncryptionByDefault withSSEAlgorithm(String sSEAlgorithm) {
        setSSEAlgorithm(sSEAlgorithm);
        return this;
    }

    /**
     * <p>
     * AWS KMS customer master key (CMK) ID to use for the default encryption.
     * </p>
     * 
     * @param kMSMasterKeyID
     *        AWS KMS customer master key (CMK) ID to use for the default encryption.
     */

    public void setKMSMasterKeyID(String kMSMasterKeyID) {
        this.kMSMasterKeyID = kMSMasterKeyID;
    }

    /**
     * <p>
     * AWS KMS customer master key (CMK) ID to use for the default encryption.
     * </p>
     * 
     * @return AWS KMS customer master key (CMK) ID to use for the default encryption.
     */

    public String getKMSMasterKeyID() {
        return this.kMSMasterKeyID;
    }

    /**
     * <p>
     * AWS KMS customer master key (CMK) ID to use for the default encryption.
     * </p>
     * 
     * @param kMSMasterKeyID
     *        AWS KMS customer master key (CMK) ID to use for the default encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketServerSideEncryptionByDefault withKMSMasterKeyID(String kMSMasterKeyID) {
        setKMSMasterKeyID(kMSMasterKeyID);
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
        if (getSSEAlgorithm() != null)
            sb.append("SSEAlgorithm: ").append(getSSEAlgorithm()).append(",");
        if (getKMSMasterKeyID() != null)
            sb.append("KMSMasterKeyID: ").append(getKMSMasterKeyID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketServerSideEncryptionByDefault == false)
            return false;
        AwsS3BucketServerSideEncryptionByDefault other = (AwsS3BucketServerSideEncryptionByDefault) obj;
        if (other.getSSEAlgorithm() == null ^ this.getSSEAlgorithm() == null)
            return false;
        if (other.getSSEAlgorithm() != null && other.getSSEAlgorithm().equals(this.getSSEAlgorithm()) == false)
            return false;
        if (other.getKMSMasterKeyID() == null ^ this.getKMSMasterKeyID() == null)
            return false;
        if (other.getKMSMasterKeyID() != null && other.getKMSMasterKeyID().equals(this.getKMSMasterKeyID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSSEAlgorithm() == null) ? 0 : getSSEAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKMSMasterKeyID() == null) ? 0 : getKMSMasterKeyID().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketServerSideEncryptionByDefault clone() {
        try {
            return (AwsS3BucketServerSideEncryptionByDefault) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketServerSideEncryptionByDefaultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
