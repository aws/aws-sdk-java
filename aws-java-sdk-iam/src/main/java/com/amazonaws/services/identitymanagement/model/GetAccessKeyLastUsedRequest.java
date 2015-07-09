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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getAccessKeyLastUsed(GetAccessKeyLastUsedRequest) GetAccessKeyLastUsed operation}.
 * <p>
 * Retrieves information about when the specified access key was last
 * used. The information includes the date and time of last use, along
 * with the AWS service and region that were specified in the last
 * request made with that key.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getAccessKeyLastUsed(GetAccessKeyLastUsedRequest)
 */
public class GetAccessKeyLastUsedRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of an access key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String accessKeyId;

    /**
     * The identifier of an access key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return The identifier of an access key.
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }
    
    /**
     * The identifier of an access key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param accessKeyId The identifier of an access key.
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    
    /**
     * The identifier of an access key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param accessKeyId The identifier of an access key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccessKeyLastUsedRequest withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
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
        if (getAccessKeyId() != null) sb.append("AccessKeyId: " + getAccessKeyId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAccessKeyLastUsedRequest == false) return false;
        GetAccessKeyLastUsedRequest other = (GetAccessKeyLastUsedRequest)obj;
        
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null) return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false) return false; 
        return true;
    }
    
    @Override
    public GetAccessKeyLastUsedRequest clone() {
        
            return (GetAccessKeyLastUsedRequest) super.clone();
    }

}
    