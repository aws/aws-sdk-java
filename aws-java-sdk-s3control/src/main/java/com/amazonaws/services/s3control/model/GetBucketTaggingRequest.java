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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketTagging" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBucketTaggingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Specifies the bucket.
     * </p>
     * <p>
     * For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the
     * x-amz-outpost-id as well.
     * </p>
     * <p>
     * For using this parameter with S3 on Outposts with the AWS SDK and CLI, you must specify the ARN of the bucket
     * accessed in the format
     * <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     * . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by account
     * <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     * <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must be URL
     * encoded.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the Outposts bucket.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @return The AWS account ID of the Outposts bucket.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketTaggingRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Specifies the bucket.
     * </p>
     * <p>
     * For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the
     * x-amz-outpost-id as well.
     * </p>
     * <p>
     * For using this parameter with S3 on Outposts with the AWS SDK and CLI, you must specify the ARN of the bucket
     * accessed in the format
     * <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     * . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by account
     * <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     * <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must be URL
     * encoded.
     * </p>
     * 
     * @param bucket
     *        Specifies the bucket.</p>
     *        <p>
     *        For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the
     *        x-amz-outpost-id as well.
     *        </p>
     *        <p>
     *        For using this parameter with S3 on Outposts with the AWS SDK and CLI, you must specify the ARN of the
     *        bucket accessed in the format
     *        <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     *        . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by
     *        account <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     *        <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must
     *        be URL encoded.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Specifies the bucket.
     * </p>
     * <p>
     * For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the
     * x-amz-outpost-id as well.
     * </p>
     * <p>
     * For using this parameter with S3 on Outposts with the AWS SDK and CLI, you must specify the ARN of the bucket
     * accessed in the format
     * <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     * . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by account
     * <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     * <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must be URL
     * encoded.
     * </p>
     * 
     * @return Specifies the bucket.</p>
     *         <p>
     *         For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the
     *         x-amz-outpost-id as well.
     *         </p>
     *         <p>
     *         For using this parameter with S3 on Outposts with the AWS SDK and CLI, you must specify the ARN of the
     *         bucket accessed in the format
     *         <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     *         . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by
     *         account <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     *         <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must
     *         be URL encoded.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * Specifies the bucket.
     * </p>
     * <p>
     * For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the
     * x-amz-outpost-id as well.
     * </p>
     * <p>
     * For using this parameter with S3 on Outposts with the AWS SDK and CLI, you must specify the ARN of the bucket
     * accessed in the format
     * <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     * . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by account
     * <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     * <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must be URL
     * encoded.
     * </p>
     * 
     * @param bucket
     *        Specifies the bucket.</p>
     *        <p>
     *        For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the
     *        x-amz-outpost-id as well.
     *        </p>
     *        <p>
     *        For using this parameter with S3 on Outposts with the AWS SDK and CLI, you must specify the ARN of the
     *        bucket accessed in the format
     *        <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     *        . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by
     *        account <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     *        <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must
     *        be URL encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketTaggingRequest withBucket(String bucket) {
        setBucket(bucket);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketTaggingRequest == false)
            return false;
        GetBucketTaggingRequest other = (GetBucketTaggingRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        return hashCode;
    }

    @Override
    public GetBucketTaggingRequest clone() {
        return (GetBucketTaggingRequest) super.clone();
    }

}
