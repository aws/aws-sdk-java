/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * A logical container used for storing the configuration changes of an
 * AWS resource.
 * </p>
 */
public class DeliveryChannel implements Serializable {

    /**
     * The name of the delivery channel. By default, AWS Config automatically
     * assigns the name "default" when creating the delivery channel. You
     * cannot change the assigned name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * The name of the Amazon S3 bucket used to store configuration history
     * for the delivery channel.
     */
    private String s3BucketName;

    /**
     * The prefix for the specified Amazon S3 bucket.
     */
    private String s3KeyPrefix;

    /**
     * The Amazon Resource Name (ARN) of the IAM role used for accessing the
     * Amazon S3 bucket and the Amazon SNS topic.
     */
    private String snsTopicARN;

    /**
     * The name of the delivery channel. By default, AWS Config automatically
     * assigns the name "default" when creating the delivery channel. You
     * cannot change the assigned name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the delivery channel. By default, AWS Config automatically
     *         assigns the name "default" when creating the delivery channel. You
     *         cannot change the assigned name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the delivery channel. By default, AWS Config automatically
     * assigns the name "default" when creating the delivery channel. You
     * cannot change the assigned name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the delivery channel. By default, AWS Config automatically
     *         assigns the name "default" when creating the delivery channel. You
     *         cannot change the assigned name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the delivery channel. By default, AWS Config automatically
     * assigns the name "default" when creating the delivery channel. You
     * cannot change the assigned name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the delivery channel. By default, AWS Config automatically
     *         assigns the name "default" when creating the delivery channel. You
     *         cannot change the assigned name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeliveryChannel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the Amazon S3 bucket used to store configuration history
     * for the delivery channel.
     *
     * @return The name of the Amazon S3 bucket used to store configuration history
     *         for the delivery channel.
     */
    public String getS3BucketName() {
        return s3BucketName;
    }
    
    /**
     * The name of the Amazon S3 bucket used to store configuration history
     * for the delivery channel.
     *
     * @param s3BucketName The name of the Amazon S3 bucket used to store configuration history
     *         for the delivery channel.
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }
    
    /**
     * The name of the Amazon S3 bucket used to store configuration history
     * for the delivery channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3BucketName The name of the Amazon S3 bucket used to store configuration history
     *         for the delivery channel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeliveryChannel withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * The prefix for the specified Amazon S3 bucket.
     *
     * @return The prefix for the specified Amazon S3 bucket.
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }
    
    /**
     * The prefix for the specified Amazon S3 bucket.
     *
     * @param s3KeyPrefix The prefix for the specified Amazon S3 bucket.
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }
    
    /**
     * The prefix for the specified Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3KeyPrefix The prefix for the specified Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeliveryChannel withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role used for accessing the
     * Amazon S3 bucket and the Amazon SNS topic.
     *
     * @return The Amazon Resource Name (ARN) of the IAM role used for accessing the
     *         Amazon S3 bucket and the Amazon SNS topic.
     */
    public String getSnsTopicARN() {
        return snsTopicARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role used for accessing the
     * Amazon S3 bucket and the Amazon SNS topic.
     *
     * @param snsTopicARN The Amazon Resource Name (ARN) of the IAM role used for accessing the
     *         Amazon S3 bucket and the Amazon SNS topic.
     */
    public void setSnsTopicARN(String snsTopicARN) {
        this.snsTopicARN = snsTopicARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role used for accessing the
     * Amazon S3 bucket and the Amazon SNS topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snsTopicARN The Amazon Resource Name (ARN) of the IAM role used for accessing the
     *         Amazon S3 bucket and the Amazon SNS topic.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeliveryChannel withSnsTopicARN(String snsTopicARN) {
        this.snsTopicARN = snsTopicARN;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getS3BucketName() != null) sb.append("S3BucketName: " + getS3BucketName() + ",");
        if (getS3KeyPrefix() != null) sb.append("S3KeyPrefix: " + getS3KeyPrefix() + ",");
        if (getSnsTopicARN() != null) sb.append("SnsTopicARN: " + getSnsTopicARN() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode()); 
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getSnsTopicARN() == null) ? 0 : getSnsTopicARN().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeliveryChannel == false) return false;
        DeliveryChannel other = (DeliveryChannel)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null) return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false) return false; 
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null) return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false) return false; 
        if (other.getSnsTopicARN() == null ^ this.getSnsTopicARN() == null) return false;
        if (other.getSnsTopicARN() != null && other.getSnsTopicARN().equals(this.getSnsTopicARN()) == false) return false; 
        return true;
    }
    
}
    