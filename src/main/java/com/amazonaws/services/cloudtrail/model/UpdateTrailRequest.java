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
 * Container for the parameters to the {@link com.amazonaws.services.cloudtrail.AWSCloudTrail#updateTrail(UpdateTrailRequest) UpdateTrail operation}.
 * <p>
 * From the command line, use update-subscription.
 * </p>
 * <p>
 * Updates the settings that specify delivery of log files. Changes to a trail do not require stopping the CloudTrail service. You use this action to
 * designate an existing bucket for log delivery. If the existing bucket has previously been a target for CloudTrail log files, an IAM policy exists for
 * the bucket. Use a Trail data type to pass updated bucket or topic names.
 * </p>
 *
 * @see com.amazonaws.services.cloudtrail.AWSCloudTrail#updateTrail(UpdateTrailRequest)
 */
public class UpdateTrailRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Represents the <a>Trail</a> structure that contains the CloudTrail
     * setting for an account.
     */
    private Trail trail;

    /**
     * Represents the <a>Trail</a> structure that contains the CloudTrail
     * setting for an account.
     *
     * @return Represents the <a>Trail</a> structure that contains the CloudTrail
     *         setting for an account.
     */
    public Trail getTrail() {
        return trail;
    }
    
    /**
     * Represents the <a>Trail</a> structure that contains the CloudTrail
     * setting for an account.
     *
     * @param trail Represents the <a>Trail</a> structure that contains the CloudTrail
     *         setting for an account.
     */
    public void setTrail(Trail trail) {
        this.trail = trail;
    }
    
    /**
     * Represents the <a>Trail</a> structure that contains the CloudTrail
     * setting for an account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trail Represents the <a>Trail</a> structure that contains the CloudTrail
     *         setting for an account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateTrailRequest withTrail(Trail trail) {
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

        if (obj instanceof UpdateTrailRequest == false) return false;
        UpdateTrailRequest other = (UpdateTrailRequest)obj;
        
        if (other.getTrail() == null ^ this.getTrail() == null) return false;
        if (other.getTrail() != null && other.getTrail().equals(this.getTrail()) == false) return false; 
        return true;
    }
    
}
    