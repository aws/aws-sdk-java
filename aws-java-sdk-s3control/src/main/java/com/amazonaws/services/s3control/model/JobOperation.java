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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The operation that you want this job to perform on every object listed in the manifest. For more information about
 * the available operations, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Operations</a> in the <i>Amazon
 * Simple Storage Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/JobOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobOperation implements Serializable, Cloneable {

    /**
     * <p>
     * Directs the specified job to invoke an AWS Lambda function on every object in the manifest.
     * </p>
     */
    private LambdaInvokeOperation lambdaInvoke;
    /**
     * <p>
     * Directs the specified job to run a PUT Copy object call on every object in the manifest.
     * </p>
     */
    private S3CopyObjectOperation s3PutObjectCopy;
    /**
     * <p>
     * Directs the specified job to run a PUT Object acl call on every object in the manifest.
     * </p>
     */
    private S3SetObjectAclOperation s3PutObjectAcl;
    /**
     * <p>
     * Directs the specified job to run a PUT Object tagging call on every object in the manifest.
     * </p>
     */
    private S3SetObjectTaggingOperation s3PutObjectTagging;
    /**
     * <p>
     * Directs the specified job to initiate restore requests for every archived object in the manifest.
     * </p>
     */
    private S3InitiateRestoreObjectOperation s3InitiateRestoreObject;

    private S3SetObjectLegalHoldOperation s3PutObjectLegalHold;

    private S3SetObjectRetentionOperation s3PutObjectRetention;

    /**
     * <p>
     * Directs the specified job to invoke an AWS Lambda function on every object in the manifest.
     * </p>
     * 
     * @param lambdaInvoke
     *        Directs the specified job to invoke an AWS Lambda function on every object in the manifest.
     */

    public void setLambdaInvoke(LambdaInvokeOperation lambdaInvoke) {
        this.lambdaInvoke = lambdaInvoke;
    }

    /**
     * <p>
     * Directs the specified job to invoke an AWS Lambda function on every object in the manifest.
     * </p>
     * 
     * @return Directs the specified job to invoke an AWS Lambda function on every object in the manifest.
     */

    public LambdaInvokeOperation getLambdaInvoke() {
        return this.lambdaInvoke;
    }

    /**
     * <p>
     * Directs the specified job to invoke an AWS Lambda function on every object in the manifest.
     * </p>
     * 
     * @param lambdaInvoke
     *        Directs the specified job to invoke an AWS Lambda function on every object in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOperation withLambdaInvoke(LambdaInvokeOperation lambdaInvoke) {
        setLambdaInvoke(lambdaInvoke);
        return this;
    }

    /**
     * <p>
     * Directs the specified job to run a PUT Copy object call on every object in the manifest.
     * </p>
     * 
     * @param s3PutObjectCopy
     *        Directs the specified job to run a PUT Copy object call on every object in the manifest.
     */

    public void setS3PutObjectCopy(S3CopyObjectOperation s3PutObjectCopy) {
        this.s3PutObjectCopy = s3PutObjectCopy;
    }

    /**
     * <p>
     * Directs the specified job to run a PUT Copy object call on every object in the manifest.
     * </p>
     * 
     * @return Directs the specified job to run a PUT Copy object call on every object in the manifest.
     */

    public S3CopyObjectOperation getS3PutObjectCopy() {
        return this.s3PutObjectCopy;
    }

    /**
     * <p>
     * Directs the specified job to run a PUT Copy object call on every object in the manifest.
     * </p>
     * 
     * @param s3PutObjectCopy
     *        Directs the specified job to run a PUT Copy object call on every object in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOperation withS3PutObjectCopy(S3CopyObjectOperation s3PutObjectCopy) {
        setS3PutObjectCopy(s3PutObjectCopy);
        return this;
    }

    /**
     * <p>
     * Directs the specified job to run a PUT Object acl call on every object in the manifest.
     * </p>
     * 
     * @param s3PutObjectAcl
     *        Directs the specified job to run a PUT Object acl call on every object in the manifest.
     */

    public void setS3PutObjectAcl(S3SetObjectAclOperation s3PutObjectAcl) {
        this.s3PutObjectAcl = s3PutObjectAcl;
    }

    /**
     * <p>
     * Directs the specified job to run a PUT Object acl call on every object in the manifest.
     * </p>
     * 
     * @return Directs the specified job to run a PUT Object acl call on every object in the manifest.
     */

    public S3SetObjectAclOperation getS3PutObjectAcl() {
        return this.s3PutObjectAcl;
    }

    /**
     * <p>
     * Directs the specified job to run a PUT Object acl call on every object in the manifest.
     * </p>
     * 
     * @param s3PutObjectAcl
     *        Directs the specified job to run a PUT Object acl call on every object in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOperation withS3PutObjectAcl(S3SetObjectAclOperation s3PutObjectAcl) {
        setS3PutObjectAcl(s3PutObjectAcl);
        return this;
    }

    /**
     * <p>
     * Directs the specified job to run a PUT Object tagging call on every object in the manifest.
     * </p>
     * 
     * @param s3PutObjectTagging
     *        Directs the specified job to run a PUT Object tagging call on every object in the manifest.
     */

    public void setS3PutObjectTagging(S3SetObjectTaggingOperation s3PutObjectTagging) {
        this.s3PutObjectTagging = s3PutObjectTagging;
    }

    /**
     * <p>
     * Directs the specified job to run a PUT Object tagging call on every object in the manifest.
     * </p>
     * 
     * @return Directs the specified job to run a PUT Object tagging call on every object in the manifest.
     */

    public S3SetObjectTaggingOperation getS3PutObjectTagging() {
        return this.s3PutObjectTagging;
    }

    /**
     * <p>
     * Directs the specified job to run a PUT Object tagging call on every object in the manifest.
     * </p>
     * 
     * @param s3PutObjectTagging
     *        Directs the specified job to run a PUT Object tagging call on every object in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOperation withS3PutObjectTagging(S3SetObjectTaggingOperation s3PutObjectTagging) {
        setS3PutObjectTagging(s3PutObjectTagging);
        return this;
    }

    /**
     * <p>
     * Directs the specified job to initiate restore requests for every archived object in the manifest.
     * </p>
     * 
     * @param s3InitiateRestoreObject
     *        Directs the specified job to initiate restore requests for every archived object in the manifest.
     */

    public void setS3InitiateRestoreObject(S3InitiateRestoreObjectOperation s3InitiateRestoreObject) {
        this.s3InitiateRestoreObject = s3InitiateRestoreObject;
    }

    /**
     * <p>
     * Directs the specified job to initiate restore requests for every archived object in the manifest.
     * </p>
     * 
     * @return Directs the specified job to initiate restore requests for every archived object in the manifest.
     */

    public S3InitiateRestoreObjectOperation getS3InitiateRestoreObject() {
        return this.s3InitiateRestoreObject;
    }

    /**
     * <p>
     * Directs the specified job to initiate restore requests for every archived object in the manifest.
     * </p>
     * 
     * @param s3InitiateRestoreObject
     *        Directs the specified job to initiate restore requests for every archived object in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOperation withS3InitiateRestoreObject(S3InitiateRestoreObjectOperation s3InitiateRestoreObject) {
        setS3InitiateRestoreObject(s3InitiateRestoreObject);
        return this;
    }

    /**
     * @param s3PutObjectLegalHold
     */

    public void setS3PutObjectLegalHold(S3SetObjectLegalHoldOperation s3PutObjectLegalHold) {
        this.s3PutObjectLegalHold = s3PutObjectLegalHold;
    }

    /**
     * @return
     */

    public S3SetObjectLegalHoldOperation getS3PutObjectLegalHold() {
        return this.s3PutObjectLegalHold;
    }

    /**
     * @param s3PutObjectLegalHold
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOperation withS3PutObjectLegalHold(S3SetObjectLegalHoldOperation s3PutObjectLegalHold) {
        setS3PutObjectLegalHold(s3PutObjectLegalHold);
        return this;
    }

    /**
     * @param s3PutObjectRetention
     */

    public void setS3PutObjectRetention(S3SetObjectRetentionOperation s3PutObjectRetention) {
        this.s3PutObjectRetention = s3PutObjectRetention;
    }

    /**
     * @return
     */

    public S3SetObjectRetentionOperation getS3PutObjectRetention() {
        return this.s3PutObjectRetention;
    }

    /**
     * @param s3PutObjectRetention
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOperation withS3PutObjectRetention(S3SetObjectRetentionOperation s3PutObjectRetention) {
        setS3PutObjectRetention(s3PutObjectRetention);
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
        if (getLambdaInvoke() != null)
            sb.append("LambdaInvoke: ").append(getLambdaInvoke()).append(",");
        if (getS3PutObjectCopy() != null)
            sb.append("S3PutObjectCopy: ").append(getS3PutObjectCopy()).append(",");
        if (getS3PutObjectAcl() != null)
            sb.append("S3PutObjectAcl: ").append(getS3PutObjectAcl()).append(",");
        if (getS3PutObjectTagging() != null)
            sb.append("S3PutObjectTagging: ").append(getS3PutObjectTagging()).append(",");
        if (getS3InitiateRestoreObject() != null)
            sb.append("S3InitiateRestoreObject: ").append(getS3InitiateRestoreObject()).append(",");
        if (getS3PutObjectLegalHold() != null)
            sb.append("S3PutObjectLegalHold: ").append(getS3PutObjectLegalHold()).append(",");
        if (getS3PutObjectRetention() != null)
            sb.append("S3PutObjectRetention: ").append(getS3PutObjectRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobOperation == false)
            return false;
        JobOperation other = (JobOperation) obj;
        if (other.getLambdaInvoke() == null ^ this.getLambdaInvoke() == null)
            return false;
        if (other.getLambdaInvoke() != null && other.getLambdaInvoke().equals(this.getLambdaInvoke()) == false)
            return false;
        if (other.getS3PutObjectCopy() == null ^ this.getS3PutObjectCopy() == null)
            return false;
        if (other.getS3PutObjectCopy() != null && other.getS3PutObjectCopy().equals(this.getS3PutObjectCopy()) == false)
            return false;
        if (other.getS3PutObjectAcl() == null ^ this.getS3PutObjectAcl() == null)
            return false;
        if (other.getS3PutObjectAcl() != null && other.getS3PutObjectAcl().equals(this.getS3PutObjectAcl()) == false)
            return false;
        if (other.getS3PutObjectTagging() == null ^ this.getS3PutObjectTagging() == null)
            return false;
        if (other.getS3PutObjectTagging() != null && other.getS3PutObjectTagging().equals(this.getS3PutObjectTagging()) == false)
            return false;
        if (other.getS3InitiateRestoreObject() == null ^ this.getS3InitiateRestoreObject() == null)
            return false;
        if (other.getS3InitiateRestoreObject() != null && other.getS3InitiateRestoreObject().equals(this.getS3InitiateRestoreObject()) == false)
            return false;
        if (other.getS3PutObjectLegalHold() == null ^ this.getS3PutObjectLegalHold() == null)
            return false;
        if (other.getS3PutObjectLegalHold() != null && other.getS3PutObjectLegalHold().equals(this.getS3PutObjectLegalHold()) == false)
            return false;
        if (other.getS3PutObjectRetention() == null ^ this.getS3PutObjectRetention() == null)
            return false;
        if (other.getS3PutObjectRetention() != null && other.getS3PutObjectRetention().equals(this.getS3PutObjectRetention()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaInvoke() == null) ? 0 : getLambdaInvoke().hashCode());
        hashCode = prime * hashCode + ((getS3PutObjectCopy() == null) ? 0 : getS3PutObjectCopy().hashCode());
        hashCode = prime * hashCode + ((getS3PutObjectAcl() == null) ? 0 : getS3PutObjectAcl().hashCode());
        hashCode = prime * hashCode + ((getS3PutObjectTagging() == null) ? 0 : getS3PutObjectTagging().hashCode());
        hashCode = prime * hashCode + ((getS3InitiateRestoreObject() == null) ? 0 : getS3InitiateRestoreObject().hashCode());
        hashCode = prime * hashCode + ((getS3PutObjectLegalHold() == null) ? 0 : getS3PutObjectLegalHold().hashCode());
        hashCode = prime * hashCode + ((getS3PutObjectRetention() == null) ? 0 : getS3PutObjectRetention().hashCode());
        return hashCode;
    }

    @Override
    public JobOperation clone() {
        try {
            return (JobOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
