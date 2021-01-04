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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateBucket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBucketRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private String aCL;
    /**
     * <p>
     * The name of the bucket.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The configuration information for the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private CreateBucketConfiguration createBucketConfiguration;
    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private String grantFullControl;
    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private String grantRead;
    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private String grantReadACP;
    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private String grantWrite;
    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private String grantWriteACP;
    /**
     * <p>
     * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private Boolean objectLockEnabledForBucket;
    /**
     * <p>
     * The ID of the Outposts where the bucket is being created.
     * </p>
     * <note>
     * <p>
     * This is required by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private String outpostId;

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param aCL
     *        The canned ACL to apply to the bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @see BucketCannedACL
     */

    public void setACL(String aCL) {
        this.aCL = aCL;
    }

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return The canned ACL to apply to the bucket.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     * @see BucketCannedACL
     */

    public String getACL() {
        return this.aCL;
    }

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param aCL
     *        The canned ACL to apply to the bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BucketCannedACL
     */

    public CreateBucketRequest withACL(String aCL) {
        setACL(aCL);
        return this;
    }

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param aCL
     *        The canned ACL to apply to the bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BucketCannedACL
     */

    public CreateBucketRequest withACL(BucketCannedACL aCL) {
        this.aCL = aCL.toString();
        return this;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @return The name of the bucket.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The configuration information for the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param createBucketConfiguration
     *        The configuration information for the bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setCreateBucketConfiguration(CreateBucketConfiguration createBucketConfiguration) {
        this.createBucketConfiguration = createBucketConfiguration;
    }

    /**
     * <p>
     * The configuration information for the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return The configuration information for the bucket.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public CreateBucketConfiguration getCreateBucketConfiguration() {
        return this.createBucketConfiguration;
    }

    /**
     * <p>
     * The configuration information for the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param createBucketConfiguration
     *        The configuration information for the bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withCreateBucketConfiguration(CreateBucketConfiguration createBucketConfiguration) {
        setCreateBucketConfiguration(createBucketConfiguration);
        return this;
    }

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param grantFullControl
     *        Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setGrantFullControl(String grantFullControl) {
        this.grantFullControl = grantFullControl;
    }

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public String getGrantFullControl() {
        return this.grantFullControl;
    }

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param grantFullControl
     *        Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withGrantFullControl(String grantFullControl) {
        setGrantFullControl(grantFullControl);
        return this;
    }

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param grantRead
     *        Allows grantee to list the objects in the bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setGrantRead(String grantRead) {
        this.grantRead = grantRead;
    }

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Allows grantee to list the objects in the bucket.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public String getGrantRead() {
        return this.grantRead;
    }

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param grantRead
     *        Allows grantee to list the objects in the bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withGrantRead(String grantRead) {
        setGrantRead(grantRead);
        return this;
    }

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param grantReadACP
     *        Allows grantee to read the bucket ACL.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setGrantReadACP(String grantReadACP) {
        this.grantReadACP = grantReadACP;
    }

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Allows grantee to read the bucket ACL.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public String getGrantReadACP() {
        return this.grantReadACP;
    }

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param grantReadACP
     *        Allows grantee to read the bucket ACL.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withGrantReadACP(String grantReadACP) {
        setGrantReadACP(grantReadACP);
        return this;
    }

    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param grantWrite
     *        Allows grantee to create, overwrite, and delete any object in the bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setGrantWrite(String grantWrite) {
        this.grantWrite = grantWrite;
    }

    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Allows grantee to create, overwrite, and delete any object in the bucket.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public String getGrantWrite() {
        return this.grantWrite;
    }

    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param grantWrite
     *        Allows grantee to create, overwrite, and delete any object in the bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withGrantWrite(String grantWrite) {
        setGrantWrite(grantWrite);
        return this;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param grantWriteACP
     *        Allows grantee to write the ACL for the applicable bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setGrantWriteACP(String grantWriteACP) {
        this.grantWriteACP = grantWriteACP;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Allows grantee to write the ACL for the applicable bucket.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public String getGrantWriteACP() {
        return this.grantWriteACP;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param grantWriteACP
     *        Allows grantee to write the ACL for the applicable bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withGrantWriteACP(String grantWriteACP) {
        setGrantWriteACP(grantWriteACP);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param objectLockEnabledForBucket
     *        Specifies whether you want S3 Object Lock to be enabled for the new bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setObjectLockEnabledForBucket(Boolean objectLockEnabledForBucket) {
        this.objectLockEnabledForBucket = objectLockEnabledForBucket;
    }

    /**
     * <p>
     * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Specifies whether you want S3 Object Lock to be enabled for the new bucket.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public Boolean getObjectLockEnabledForBucket() {
        return this.objectLockEnabledForBucket;
    }

    /**
     * <p>
     * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param objectLockEnabledForBucket
     *        Specifies whether you want S3 Object Lock to be enabled for the new bucket.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withObjectLockEnabledForBucket(Boolean objectLockEnabledForBucket) {
        setObjectLockEnabledForBucket(objectLockEnabledForBucket);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Specifies whether you want S3 Object Lock to be enabled for the new bucket.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public Boolean isObjectLockEnabledForBucket() {
        return this.objectLockEnabledForBucket;
    }

    /**
     * <p>
     * The ID of the Outposts where the bucket is being created.
     * </p>
     * <note>
     * <p>
     * This is required by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param outpostId
     *        The ID of the Outposts where the bucket is being created.</p> <note>
     *        <p>
     *        This is required by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * The ID of the Outposts where the bucket is being created.
     * </p>
     * <note>
     * <p>
     * This is required by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return The ID of the Outposts where the bucket is being created.</p> <note>
     *         <p>
     *         This is required by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * The ID of the Outposts where the bucket is being created.
     * </p>
     * <note>
     * <p>
     * This is required by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param outpostId
     *        The ID of the Outposts where the bucket is being created.</p> <note>
     *        <p>
     *        This is required by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketRequest withOutpostId(String outpostId) {
        setOutpostId(outpostId);
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
        if (getACL() != null)
            sb.append("ACL: ").append(getACL()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getCreateBucketConfiguration() != null)
            sb.append("CreateBucketConfiguration: ").append(getCreateBucketConfiguration()).append(",");
        if (getGrantFullControl() != null)
            sb.append("GrantFullControl: ").append(getGrantFullControl()).append(",");
        if (getGrantRead() != null)
            sb.append("GrantRead: ").append(getGrantRead()).append(",");
        if (getGrantReadACP() != null)
            sb.append("GrantReadACP: ").append(getGrantReadACP()).append(",");
        if (getGrantWrite() != null)
            sb.append("GrantWrite: ").append(getGrantWrite()).append(",");
        if (getGrantWriteACP() != null)
            sb.append("GrantWriteACP: ").append(getGrantWriteACP()).append(",");
        if (getObjectLockEnabledForBucket() != null)
            sb.append("ObjectLockEnabledForBucket: ").append(getObjectLockEnabledForBucket()).append(",");
        if (getOutpostId() != null)
            sb.append("OutpostId: ").append(getOutpostId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBucketRequest == false)
            return false;
        CreateBucketRequest other = (CreateBucketRequest) obj;
        if (other.getACL() == null ^ this.getACL() == null)
            return false;
        if (other.getACL() != null && other.getACL().equals(this.getACL()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getCreateBucketConfiguration() == null ^ this.getCreateBucketConfiguration() == null)
            return false;
        if (other.getCreateBucketConfiguration() != null && other.getCreateBucketConfiguration().equals(this.getCreateBucketConfiguration()) == false)
            return false;
        if (other.getGrantFullControl() == null ^ this.getGrantFullControl() == null)
            return false;
        if (other.getGrantFullControl() != null && other.getGrantFullControl().equals(this.getGrantFullControl()) == false)
            return false;
        if (other.getGrantRead() == null ^ this.getGrantRead() == null)
            return false;
        if (other.getGrantRead() != null && other.getGrantRead().equals(this.getGrantRead()) == false)
            return false;
        if (other.getGrantReadACP() == null ^ this.getGrantReadACP() == null)
            return false;
        if (other.getGrantReadACP() != null && other.getGrantReadACP().equals(this.getGrantReadACP()) == false)
            return false;
        if (other.getGrantWrite() == null ^ this.getGrantWrite() == null)
            return false;
        if (other.getGrantWrite() != null && other.getGrantWrite().equals(this.getGrantWrite()) == false)
            return false;
        if (other.getGrantWriteACP() == null ^ this.getGrantWriteACP() == null)
            return false;
        if (other.getGrantWriteACP() != null && other.getGrantWriteACP().equals(this.getGrantWriteACP()) == false)
            return false;
        if (other.getObjectLockEnabledForBucket() == null ^ this.getObjectLockEnabledForBucket() == null)
            return false;
        if (other.getObjectLockEnabledForBucket() != null && other.getObjectLockEnabledForBucket().equals(this.getObjectLockEnabledForBucket()) == false)
            return false;
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getACL() == null) ? 0 : getACL().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getCreateBucketConfiguration() == null) ? 0 : getCreateBucketConfiguration().hashCode());
        hashCode = prime * hashCode + ((getGrantFullControl() == null) ? 0 : getGrantFullControl().hashCode());
        hashCode = prime * hashCode + ((getGrantRead() == null) ? 0 : getGrantRead().hashCode());
        hashCode = prime * hashCode + ((getGrantReadACP() == null) ? 0 : getGrantReadACP().hashCode());
        hashCode = prime * hashCode + ((getGrantWrite() == null) ? 0 : getGrantWrite().hashCode());
        hashCode = prime * hashCode + ((getGrantWriteACP() == null) ? 0 : getGrantWriteACP().hashCode());
        hashCode = prime * hashCode + ((getObjectLockEnabledForBucket() == null) ? 0 : getObjectLockEnabledForBucket().hashCode());
        hashCode = prime * hashCode + ((getOutpostId() == null) ? 0 : getOutpostId().hashCode());
        return hashCode;
    }

    @Override
    public CreateBucketRequest clone() {
        return (CreateBucketRequest) super.clone();
    }

}
