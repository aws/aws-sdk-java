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
 * Container for the parameters to the {@link com.amazonaws.services.cloudtrail.AWSCloudTrail#listPublicKeys(ListPublicKeysRequest) ListPublicKeys operation}.
 * <p>
 * Returns all public keys whose private keys were used to sign the
 * digest files within the specified time range. The public key is needed
 * to validate digest files that were signed with its corresponding
 * private key.
 * </p>
 * <p>
 * <b>NOTE:</b>CloudTrail uses different private/public key pairs per
 * region. Each digest file is signed with a private key unique to its
 * region. Therefore, when you validate a digest file from a particular
 * region, you must look in the same region for its corresponding public
 * key.
 * </p>
 *
 * @see com.amazonaws.services.cloudtrail.AWSCloudTrail#listPublicKeys(ListPublicKeysRequest)
 */
public class ListPublicKeysRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Optionally specifies, in UTC, the start of the time range to look up
     * public keys for CloudTrail digest files. If not specified, the current
     * time is used, and the current public key is returned.
     */
    private java.util.Date startTime;

    /**
     * Optionally specifies, in UTC, the end of the time range to look up
     * public keys for CloudTrail digest files. If not specified, the current
     * time is used.
     */
    private java.util.Date endTime;

    /**
     * Reserved for future use.
     */
    private String nextToken;

    /**
     * Optionally specifies, in UTC, the start of the time range to look up
     * public keys for CloudTrail digest files. If not specified, the current
     * time is used, and the current public key is returned.
     *
     * @return Optionally specifies, in UTC, the start of the time range to look up
     *         public keys for CloudTrail digest files. If not specified, the current
     *         time is used, and the current public key is returned.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * Optionally specifies, in UTC, the start of the time range to look up
     * public keys for CloudTrail digest files. If not specified, the current
     * time is used, and the current public key is returned.
     *
     * @param startTime Optionally specifies, in UTC, the start of the time range to look up
     *         public keys for CloudTrail digest files. If not specified, the current
     *         time is used, and the current public key is returned.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * Optionally specifies, in UTC, the start of the time range to look up
     * public keys for CloudTrail digest files. If not specified, the current
     * time is used, and the current public key is returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime Optionally specifies, in UTC, the start of the time range to look up
     *         public keys for CloudTrail digest files. If not specified, the current
     *         time is used, and the current public key is returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPublicKeysRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Optionally specifies, in UTC, the end of the time range to look up
     * public keys for CloudTrail digest files. If not specified, the current
     * time is used.
     *
     * @return Optionally specifies, in UTC, the end of the time range to look up
     *         public keys for CloudTrail digest files. If not specified, the current
     *         time is used.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * Optionally specifies, in UTC, the end of the time range to look up
     * public keys for CloudTrail digest files. If not specified, the current
     * time is used.
     *
     * @param endTime Optionally specifies, in UTC, the end of the time range to look up
     *         public keys for CloudTrail digest files. If not specified, the current
     *         time is used.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * Optionally specifies, in UTC, the end of the time range to look up
     * public keys for CloudTrail digest files. If not specified, the current
     * time is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime Optionally specifies, in UTC, the end of the time range to look up
     *         public keys for CloudTrail digest files. If not specified, the current
     *         time is used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPublicKeysRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Reserved for future use.
     *
     * @return Reserved for future use.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Reserved for future use.
     *
     * @param nextToken Reserved for future use.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPublicKeysRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPublicKeysRequest == false) return false;
        ListPublicKeysRequest other = (ListPublicKeysRequest)obj;
        
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListPublicKeysRequest clone() {
        
            return (ListPublicKeysRequest) super.clone();
    }

}
    