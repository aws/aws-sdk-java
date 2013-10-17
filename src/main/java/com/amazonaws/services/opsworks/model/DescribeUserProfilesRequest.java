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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeUserProfiles(DescribeUserProfilesRequest) DescribeUserProfiles operation}.
 * <p>
 * Describe specified users.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeUserProfiles(DescribeUserProfilesRequest)
 */
public class DescribeUserProfilesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * An array of IAM user ARNs that identify the users to be described.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> iamUserArns;

    /**
     * An array of IAM user ARNs that identify the users to be described.
     *
     * @return An array of IAM user ARNs that identify the users to be described.
     */
    public java.util.List<String> getIamUserArns() {
        if (iamUserArns == null) {
              iamUserArns = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              iamUserArns.setAutoConstruct(true);
        }
        return iamUserArns;
    }
    
    /**
     * An array of IAM user ARNs that identify the users to be described.
     *
     * @param iamUserArns An array of IAM user ARNs that identify the users to be described.
     */
    public void setIamUserArns(java.util.Collection<String> iamUserArns) {
        if (iamUserArns == null) {
            this.iamUserArns = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> iamUserArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(iamUserArns.size());
        iamUserArnsCopy.addAll(iamUserArns);
        this.iamUserArns = iamUserArnsCopy;
    }
    
    /**
     * An array of IAM user ARNs that identify the users to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamUserArns An array of IAM user ARNs that identify the users to be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeUserProfilesRequest withIamUserArns(String... iamUserArns) {
        if (getIamUserArns() == null) setIamUserArns(new java.util.ArrayList<String>(iamUserArns.length));
        for (String value : iamUserArns) {
            getIamUserArns().add(value);
        }
        return this;
    }
    
    /**
     * An array of IAM user ARNs that identify the users to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamUserArns An array of IAM user ARNs that identify the users to be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeUserProfilesRequest withIamUserArns(java.util.Collection<String> iamUserArns) {
        if (iamUserArns == null) {
            this.iamUserArns = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> iamUserArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(iamUserArns.size());
            iamUserArnsCopy.addAll(iamUserArns);
            this.iamUserArns = iamUserArnsCopy;
        }

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
        if (getIamUserArns() != null) sb.append("IamUserArns: " + getIamUserArns() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIamUserArns() == null) ? 0 : getIamUserArns().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeUserProfilesRequest == false) return false;
        DescribeUserProfilesRequest other = (DescribeUserProfilesRequest)obj;
        
        if (other.getIamUserArns() == null ^ this.getIamUserArns() == null) return false;
        if (other.getIamUserArns() != null && other.getIamUserArns().equals(this.getIamUserArns()) == false) return false; 
        return true;
    }
    
}
    