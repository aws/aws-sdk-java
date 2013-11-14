/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;


/**
 * <p>
 * The settings for a trail.
 * </p>
 */
public class Trail implements Serializable {

    /**
     * Name of the trail defined when you call when you call
     * <a>CreateTrail</a>
     */
    private String name;

    /**
     * Name of the Amazon S3 bucket into which CloudTrail delivers your trail
     * files. Passed when you call <a>CreateTrail</a>.
     */
    private String s3BucketName;

    /**
     * Value of the Amazon S3 prefix
     */
    private String s3KeyPrefix;

    /**
     * Name of the existing Amazon SNS topic that CloudTrail uses to notify
     * the account owner when new CloudTrail log files have been delivered.
     */
    private String snsTopicName;

    /**
     * Set to <b>True</b> to include AWS API calls from AWS global services
     * such as IAM. Otherwise, <b>False</b>.
     */
    private Boolean includeGlobalServiceEvents;

    /**
     * Name of the trail defined when you call when you call
     * <a>CreateTrail</a>
     *
     * @return Name of the trail defined when you call when you call
     *         <a>CreateTrail</a>
     */
    public String getName() {
        return name;
    }
    
    /**
     * Name of the trail defined when you call when you call
     * <a>CreateTrail</a>
     *
     * @param name Name of the trail defined when you call when you call
     *         <a>CreateTrail</a>
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Name of the trail defined when you call when you call
     * <a>CreateTrail</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name Name of the trail defined when you call when you call
     *         <a>CreateTrail</a>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Trail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the Amazon S3 bucket into which CloudTrail delivers your trail
     * files. Passed when you call <a>CreateTrail</a>.
     *
     * @return Name of the Amazon S3 bucket into which CloudTrail delivers your trail
     *         files. Passed when you call <a>CreateTrail</a>.
     */
    public String getS3BucketName() {
        return s3BucketName;
    }
    
    /**
     * Name of the Amazon S3 bucket into which CloudTrail delivers your trail
     * files. Passed when you call <a>CreateTrail</a>.
     *
     * @param s3BucketName Name of the Amazon S3 bucket into which CloudTrail delivers your trail
     *         files. Passed when you call <a>CreateTrail</a>.
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }
    
    /**
     * Name of the Amazon S3 bucket into which CloudTrail delivers your trail
     * files. Passed when you call <a>CreateTrail</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3BucketName Name of the Amazon S3 bucket into which CloudTrail delivers your trail
     *         files. Passed when you call <a>CreateTrail</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Trail withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * Value of the Amazon S3 prefix
     *
     * @return Value of the Amazon S3 prefix
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }
    
    /**
     * Value of the Amazon S3 prefix
     *
     * @param s3KeyPrefix Value of the Amazon S3 prefix
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }
    
    /**
     * Value of the Amazon S3 prefix
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3KeyPrefix Value of the Amazon S3 prefix
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Trail withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * Name of the existing Amazon SNS topic that CloudTrail uses to notify
     * the account owner when new CloudTrail log files have been delivered.
     *
     * @return Name of the existing Amazon SNS topic that CloudTrail uses to notify
     *         the account owner when new CloudTrail log files have been delivered.
     */
    public String getSnsTopicName() {
        return snsTopicName;
    }
    
    /**
     * Name of the existing Amazon SNS topic that CloudTrail uses to notify
     * the account owner when new CloudTrail log files have been delivered.
     *
     * @param snsTopicName Name of the existing Amazon SNS topic that CloudTrail uses to notify
     *         the account owner when new CloudTrail log files have been delivered.
     */
    public void setSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
    }
    
    /**
     * Name of the existing Amazon SNS topic that CloudTrail uses to notify
     * the account owner when new CloudTrail log files have been delivered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snsTopicName Name of the existing Amazon SNS topic that CloudTrail uses to notify
     *         the account owner when new CloudTrail log files have been delivered.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Trail withSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
        return this;
    }

    /**
     * Set to <b>True</b> to include AWS API calls from AWS global services
     * such as IAM. Otherwise, <b>False</b>.
     *
     * @return Set to <b>True</b> to include AWS API calls from AWS global services
     *         such as IAM. Otherwise, <b>False</b>.
     */
    public Boolean isIncludeGlobalServiceEvents() {
        return includeGlobalServiceEvents;
    }
    
    /**
     * Set to <b>True</b> to include AWS API calls from AWS global services
     * such as IAM. Otherwise, <b>False</b>.
     *
     * @param includeGlobalServiceEvents Set to <b>True</b> to include AWS API calls from AWS global services
     *         such as IAM. Otherwise, <b>False</b>.
     */
    public void setIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
    }
    
    /**
     * Set to <b>True</b> to include AWS API calls from AWS global services
     * such as IAM. Otherwise, <b>False</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeGlobalServiceEvents Set to <b>True</b> to include AWS API calls from AWS global services
     *         such as IAM. Otherwise, <b>False</b>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Trail withIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
        return this;
    }

    /**
     * Set to <b>True</b> to include AWS API calls from AWS global services
     * such as IAM. Otherwise, <b>False</b>.
     *
     * @return Set to <b>True</b> to include AWS API calls from AWS global services
     *         such as IAM. Otherwise, <b>False</b>.
     */
    public Boolean getIncludeGlobalServiceEvents() {
        return includeGlobalServiceEvents;
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
        if (getSnsTopicName() != null) sb.append("SnsTopicName: " + getSnsTopicName() + ",");
        if (isIncludeGlobalServiceEvents() != null) sb.append("IncludeGlobalServiceEvents: " + isIncludeGlobalServiceEvents() );
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
        hashCode = prime * hashCode + ((getSnsTopicName() == null) ? 0 : getSnsTopicName().hashCode()); 
        hashCode = prime * hashCode + ((isIncludeGlobalServiceEvents() == null) ? 0 : isIncludeGlobalServiceEvents().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Trail == false) return false;
        Trail other = (Trail)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null) return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false) return false; 
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null) return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false) return false; 
        if (other.getSnsTopicName() == null ^ this.getSnsTopicName() == null) return false;
        if (other.getSnsTopicName() != null && other.getSnsTopicName().equals(this.getSnsTopicName()) == false) return false; 
        if (other.isIncludeGlobalServiceEvents() == null ^ this.isIncludeGlobalServiceEvents() == null) return false;
        if (other.isIncludeGlobalServiceEvents() != null && other.isIncludeGlobalServiceEvents().equals(this.isIncludeGlobalServiceEvents()) == false) return false; 
        return true;
    }
    
}
    