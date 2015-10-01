/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.cloudtrail.AWSCloudTrail#getTrailStatus(GetTrailStatusRequest) GetTrailStatus operation}.
 * <p>
 * Returns a JSON-formatted list of information about the specified
 * trail. Fields include information on delivery errors, Amazon SNS and
 * Amazon S3 errors, and start and stop logging times for each trail.
 * This operation returns trail status from a single region. To return
 * trail status from all regions, you must call the operation on each
 * region.
 * </p>
 *
 * @see com.amazonaws.services.cloudtrail.AWSCloudTrail#getTrailStatus(GetTrailStatusRequest)
 */
public class GetTrailStatusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Specifies the name or the CloudTrail ARN of the trail for which you
     * are requesting status. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     */
    private String name;

    /**
     * Specifies the name or the CloudTrail ARN of the trail for which you
     * are requesting status. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     *
     * @return Specifies the name or the CloudTrail ARN of the trail for which you
     *         are requesting status. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Specifies the name or the CloudTrail ARN of the trail for which you
     * are requesting status. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     *
     * @param name Specifies the name or the CloudTrail ARN of the trail for which you
     *         are requesting status. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Specifies the name or the CloudTrail ARN of the trail for which you
     * are requesting status. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name Specifies the name or the CloudTrail ARN of the trail for which you
     *         are requesting status. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusRequest withName(String name) {
        this.name = name;
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
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetTrailStatusRequest == false) return false;
        GetTrailStatusRequest other = (GetTrailStatusRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
    @Override
    public GetTrailStatusRequest clone() {
        
            return (GetTrailStatusRequest) super.clone();
    }

}
    