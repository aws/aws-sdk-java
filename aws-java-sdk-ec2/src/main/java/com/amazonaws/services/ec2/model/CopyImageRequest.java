/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CopyImageRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CopyImage.
 * </p>
 */
public class CopyImageRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CopyImageRequest> {

    /**
     * <p>
     * The name of the region that contains the AMI to copy.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     */
    private String sourceImageId;
    /**
     * <p>
     * The name of the new AMI in the destination region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for the new AMI in the destination region.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be encrypted. The default CMK for EBS is
     * used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with <code>KmsKeyId</code>. For
     * more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     * Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of an image
     * during a copy operation. This parameter is only required if you want to use a non-default CMK; if this parameter
     * is not specified, the default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace,
     * followed by the region of the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then
     * the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The specified
     * CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The name of the region that contains the AMI to copy.
     * </p>
     * 
     * @param sourceRegion
     *        The name of the region that contains the AMI to copy.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The name of the region that contains the AMI to copy.
     * </p>
     * 
     * @return The name of the region that contains the AMI to copy.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The name of the region that contains the AMI to copy.
     * </p>
     * 
     * @param sourceRegion
     *        The name of the region that contains the AMI to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     * 
     * @param sourceImageId
     *        The ID of the AMI to copy.
     */

    public void setSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
    }

    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     * 
     * @return The ID of the AMI to copy.
     */

    public String getSourceImageId() {
        return this.sourceImageId;
    }

    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     * 
     * @param sourceImageId
     *        The ID of the AMI to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withSourceImageId(String sourceImageId) {
        setSourceImageId(sourceImageId);
        return this;
    }

    /**
     * <p>
     * The name of the new AMI in the destination region.
     * </p>
     * 
     * @param name
     *        The name of the new AMI in the destination region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new AMI in the destination region.
     * </p>
     * 
     * @return The name of the new AMI in the destination region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new AMI in the destination region.
     * </p>
     * 
     * @param name
     *        The name of the new AMI in the destination region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for the new AMI in the destination region.
     * </p>
     * 
     * @param description
     *        A description for the new AMI in the destination region.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the new AMI in the destination region.
     * </p>
     * 
     * @return A description for the new AMI in the destination region.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the new AMI in the destination region.
     * </p>
     * 
     * @param description
     *        A description for the new AMI in the destination region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to
     *        Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *         see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to
     *         Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to
     *        Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be encrypted. The default CMK for EBS is
     * used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with <code>KmsKeyId</code>. For
     * more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     * Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the destination snapshots of the copied image should be encrypted. The default CMK for
     *        EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with
     *        <code>KmsKeyId</code>. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be encrypted. The default CMK for EBS is
     * used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with <code>KmsKeyId</code>. For
     * more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     * Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the destination snapshots of the copied image should be encrypted. The default CMK for
     *         EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with
     *         <code>KmsKeyId</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *         the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be encrypted. The default CMK for EBS is
     * used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with <code>KmsKeyId</code>. For
     * more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     * Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the destination snapshots of the copied image should be encrypted. The default CMK for
     *        EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with
     *        <code>KmsKeyId</code>. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be encrypted. The default CMK for EBS is
     * used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with <code>KmsKeyId</code>. For
     * more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     * Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the destination snapshots of the copied image should be encrypted. The default CMK for
     *         EBS is used unless a non-default AWS Key Management Service (AWS KMS) CMK is specified with
     *         <code>KmsKeyId</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *         the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of an image
     * during a copy operation. This parameter is only required if you want to use a non-default CMK; if this parameter
     * is not specified, the default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace,
     * followed by the region of the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then
     * the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The specified
     * CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     * 
     * @param kmsKeyId
     *        The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of an
     *        image during a copy operation. This parameter is only required if you want to use a non-default CMK; if
     *        this parameter is not specified, the default CMK for EBS is used. The ARN contains the
     *        <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the AWS account ID of the CMK
     *        owner, the <code>key</code> namespace, and then the CMK ID. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The
     *        specified CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is
     *        specified, the <code>Encrypted</code> flag must also be set.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of an image
     * during a copy operation. This parameter is only required if you want to use a non-default CMK; if this parameter
     * is not specified, the default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace,
     * followed by the region of the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then
     * the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The specified
     * CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     * 
     * @return The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of an
     *         image during a copy operation. This parameter is only required if you want to use a non-default CMK; if
     *         this parameter is not specified, the default CMK for EBS is used. The ARN contains the
     *         <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the AWS account ID of the CMK
     *         owner, the <code>key</code> namespace, and then the CMK ID. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The
     *         specified CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code>
     *         is specified, the <code>Encrypted</code> flag must also be set.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of an image
     * during a copy operation. This parameter is only required if you want to use a non-default CMK; if this parameter
     * is not specified, the default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace,
     * followed by the region of the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then
     * the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The specified
     * CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * </p>
     * 
     * @param kmsKeyId
     *        The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of an
     *        image during a copy operation. This parameter is only required if you want to use a non-default CMK; if
     *        this parameter is not specified, the default CMK for EBS is used. The ARN contains the
     *        <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the AWS account ID of the CMK
     *        owner, the <code>key</code> namespace, and then the CMK ID. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. The
     *        specified CMK must exist in the region that the snapshot is being copied to. If a <code>KmsKeyId</code> is
     *        specified, the <code>Encrypted</code> flag must also be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CopyImageRequest> getDryRunRequest() {
        Request<CopyImageRequest> request = new CopyImageRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: " + getSourceRegion() + ",");
        if (getSourceImageId() != null)
            sb.append("SourceImageId: " + getSourceImageId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyImageRequest == false)
            return false;
        CopyImageRequest other = (CopyImageRequest) obj;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getSourceImageId() == null ^ this.getSourceImageId() == null)
            return false;
        if (other.getSourceImageId() != null && other.getSourceImageId().equals(this.getSourceImageId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
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

        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getSourceImageId() == null) ? 0 : getSourceImageId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CopyImageRequest clone() {
        return (CopyImageRequest) super.clone();
    }
}
