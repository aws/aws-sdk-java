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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateBucket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBucketResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The location of the bucket.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
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
    private String bucketArn;

    /**
     * <p>
     * The location of the bucket.
     * </p>
     * 
     * @param location
     *        The location of the bucket.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the bucket.
     * </p>
     * 
     * @return The location of the bucket.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the bucket.
     * </p>
     * 
     * @param location
     *        The location of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBucketResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
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
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of the bucket.</p>
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

    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
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
     * @return The Amazon Resource Name (ARN) of the bucket.</p>
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

    public String getBucketArn() {
        return this.bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
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
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of the bucket.</p>
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

    public CreateBucketResult withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getBucketArn() != null)
            sb.append("BucketArn: ").append(getBucketArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBucketResult == false)
            return false;
        CreateBucketResult other = (CreateBucketResult) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateBucketResult clone() {
        try {
            return (CreateBucketResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
