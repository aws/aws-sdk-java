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
 * Returns the objects or data listed below if successful. Otherwise, returns an error.
 * </p>
 */
public class UpdateTrailResult implements Serializable {

    private String name;

    private String s3BucketName;

    private String s3KeyPrefix;

    private String snsTopicName;

    private Boolean includeGlobalServiceEvents;

    /**
     * Represents the CloudTrail settings that were updated by calling
     * <a>UpdateTrail</a>.
     */
    private Trail trail;

    /**
     * Returns the value of the Name property for this object.
     *
     * @return The value of the Name property for this object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     *
     * @param name The new value for the Name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The new value for the Name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateTrailResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns the value of the S3BucketName property for this object.
     *
     * @return The value of the S3BucketName property for this object.
     */
    public String getS3BucketName() {
        return s3BucketName;
    }
    
    /**
     * Sets the value of the S3BucketName property for this object.
     *
     * @param s3BucketName The new value for the S3BucketName property for this object.
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }
    
    /**
     * Sets the value of the S3BucketName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3BucketName The new value for the S3BucketName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateTrailResult withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * Returns the value of the S3KeyPrefix property for this object.
     *
     * @return The value of the S3KeyPrefix property for this object.
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }
    
    /**
     * Sets the value of the S3KeyPrefix property for this object.
     *
     * @param s3KeyPrefix The new value for the S3KeyPrefix property for this object.
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }
    
    /**
     * Sets the value of the S3KeyPrefix property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3KeyPrefix The new value for the S3KeyPrefix property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateTrailResult withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * Returns the value of the SnsTopicName property for this object.
     *
     * @return The value of the SnsTopicName property for this object.
     */
    public String getSnsTopicName() {
        return snsTopicName;
    }
    
    /**
     * Sets the value of the SnsTopicName property for this object.
     *
     * @param snsTopicName The new value for the SnsTopicName property for this object.
     */
    public void setSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
    }
    
    /**
     * Sets the value of the SnsTopicName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snsTopicName The new value for the SnsTopicName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateTrailResult withSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
        return this;
    }

    /**
     * Returns the value of the IncludeGlobalServiceEvents property for this
     * object.
     *
     * @return The value of the IncludeGlobalServiceEvents property for this object.
     */
    public Boolean isIncludeGlobalServiceEvents() {
        return includeGlobalServiceEvents;
    }
    
    /**
     * Sets the value of the IncludeGlobalServiceEvents property for this
     * object.
     *
     * @param includeGlobalServiceEvents The new value for the IncludeGlobalServiceEvents property for this
     *         object.
     */
    public void setIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
    }
    
    /**
     * Sets the value of the IncludeGlobalServiceEvents property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeGlobalServiceEvents The new value for the IncludeGlobalServiceEvents property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateTrailResult withIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
        return this;
    }

    /**
     * Returns the value of the IncludeGlobalServiceEvents property for this
     * object.
     *
     * @return The value of the IncludeGlobalServiceEvents property for this object.
     */
    public Boolean getIncludeGlobalServiceEvents() {
        return includeGlobalServiceEvents;
    }

    /**
     * Represents the CloudTrail settings that were updated by calling
     * <a>UpdateTrail</a>.
     *
     * @return Represents the CloudTrail settings that were updated by calling
     *         <a>UpdateTrail</a>.
     */
    public Trail getTrail() {
        return trail;
    }
    
    /**
     * Represents the CloudTrail settings that were updated by calling
     * <a>UpdateTrail</a>.
     *
     * @param trail Represents the CloudTrail settings that were updated by calling
     *         <a>UpdateTrail</a>.
     */
    public void setTrail(Trail trail) {
        this.trail = trail;
    }
    
    /**
     * Represents the CloudTrail settings that were updated by calling
     * <a>UpdateTrail</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trail Represents the CloudTrail settings that were updated by calling
     *         <a>UpdateTrail</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateTrailResult withTrail(Trail trail) {
        this.trail = trail;
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
        if (getSnsTopicName() != null) sb.append("SnsTopicName: " + getSnsTopicName() + ",");
        if (isIncludeGlobalServiceEvents() != null) sb.append("IncludeGlobalServiceEvents: " + isIncludeGlobalServiceEvents() + ",");
        if (getTrail() != null) sb.append("Trail: " + getTrail() );
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
        hashCode = prime * hashCode + ((getTrail() == null) ? 0 : getTrail().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateTrailResult == false) return false;
        UpdateTrailResult other = (UpdateTrailResult)obj;
        
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
        if (other.getTrail() == null ^ this.getTrail() == null) return false;
        if (other.getTrail() != null && other.getTrail().equals(this.getTrail()) == false) return false; 
        return true;
    }
    
}
    