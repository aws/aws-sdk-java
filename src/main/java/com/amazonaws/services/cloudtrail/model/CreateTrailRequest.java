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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudtrail.AWSCloudTrail#createTrail(CreateTrailRequest) CreateTrail operation}.
 * <p>
 * From the command line, use create-subscription.
 * </p>
 * <p>
 * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket. The request includes a Trail structure that specifies the
 * following:
 * </p>
 * 
 * <ul>
 * <li>Trail name.</li>
 * <li>The name of an existing Amazon S3 bucket to which CloudTrail delivers your log files.</li>
 * <li>The name of the Amazon S3 key prefix that precedes each log file.</li>
 * <li>The name of an existing Amazon SNS topic that notifies you that a new file is available in your bucket.</li>
 * <li>Whether the log file should include AWS API calls from global services. Currently, the only global AWS API calls included in CloudTrail log files
 * are from IAM and AWS STS.</li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.cloudtrail.AWSCloudTrail#createTrail(CreateTrailRequest)
 */
public class CreateTrailRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Contains the <a>Trail</a> structure that specifies the settings for
     * each trail.
     */
    private Trail trail;

    /**
     * Contains the <a>Trail</a> structure that specifies the settings for
     * each trail.
     *
     * @return Contains the <a>Trail</a> structure that specifies the settings for
     *         each trail.
     */
    public Trail getTrail() {
        return trail;
    }
    
    /**
     * Contains the <a>Trail</a> structure that specifies the settings for
     * each trail.
     *
     * @param trail Contains the <a>Trail</a> structure that specifies the settings for
     *         each trail.
     */
    public void setTrail(Trail trail) {
        this.trail = trail;
    }
    
    /**
     * Contains the <a>Trail</a> structure that specifies the settings for
     * each trail.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trail Contains the <a>Trail</a> structure that specifies the settings for
     *         each trail.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTrailRequest withTrail(Trail trail) {
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
        if (getTrail() != null) sb.append("Trail: " + getTrail() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTrail() == null) ? 0 : getTrail().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTrailRequest == false) return false;
        CreateTrailRequest other = (CreateTrailRequest)obj;
        
        if (other.getTrail() == null ^ this.getTrail() == null) return false;
        if (other.getTrail() != null && other.getTrail().equals(this.getTrail()) == false) return false; 
        return true;
    }
    
}
    