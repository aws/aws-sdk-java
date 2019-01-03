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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * CreateLocationS3Request
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationS3" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationS3Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source
     * location or write data to the S3 destination.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * </p>
     */
    private String s3BucketArn;

    private S3Config s3Config;
    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * <p>
     * A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source
     * location or write data to the S3 destination.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3
     *        source location or write data to the S3 destination.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source
     * location or write data to the S3 destination.
     * </p>
     * 
     * @return A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3
     *         source location or write data to the S3 destination.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source
     * location or write data to the S3 destination.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3
     *        source location or write data to the S3 destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * </p>
     * 
     * @param s3BucketArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * </p>
     * 
     * @param s3BucketArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
        return this;
    }

    /**
     * @param s3Config
     */

    public void setS3Config(S3Config s3Config) {
        this.s3Config = s3Config;
    }

    /**
     * @return
     */

    public S3Config getS3Config() {
        return this.s3Config;
    }

    /**
     * @param s3Config
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withS3Config(S3Config s3Config) {
        setS3Config(s3Config);
        return this;
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * 
     * @return The key-value pair that represents the tag that you want to add to the location. The value can be an
     *         empty string. We recommend using tags to name your resources.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     *        string. We recommend using tags to name your resources.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     *        string. We recommend using tags to name your resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     *        string. We recommend using tags to name your resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
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
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn()).append(",");
        if (getS3Config() != null)
            sb.append("S3Config: ").append(getS3Config()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLocationS3Request == false)
            return false;
        CreateLocationS3Request other = (CreateLocationS3Request) obj;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        if (other.getS3Config() == null ^ this.getS3Config() == null)
            return false;
        if (other.getS3Config() != null && other.getS3Config().equals(this.getS3Config()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        hashCode = prime * hashCode + ((getS3Config() == null) ? 0 : getS3Config().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationS3Request clone() {
        return (CreateLocationS3Request) super.clone();
    }

}
