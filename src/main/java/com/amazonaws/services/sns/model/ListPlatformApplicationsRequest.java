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
package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#listPlatformApplications(ListPlatformApplicationsRequest) ListPlatformApplications operation}.
 * <p>
 * The <code>ListPlatformApplications</code> action lists the platform application objects for the supported push notification services, such as APNS and
 * GCM. The results for <code>ListPlatformApplications</code> are paginated and return a limited list of applications, up to 100. If additional records
 * are available after the first page results, then a NextToken string will be returned. To receive the next page, you call
 * <code>ListPlatformApplications</code> using the NextToken string received from the previous call. When there are no more records to return, NextToken
 * will be null. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html"> Using Amazon SNS Mobile Push
 * Notifications </a> .
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#listPlatformApplications(ListPlatformApplicationsRequest)
 */
public class ListPlatformApplicationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * NextToken string is used when calling ListPlatformApplications action
     * to retrieve additional records that are available after the first page
     * results.
     */
    private String nextToken;

    /**
     * NextToken string is used when calling ListPlatformApplications action
     * to retrieve additional records that are available after the first page
     * results.
     *
     * @return NextToken string is used when calling ListPlatformApplications action
     *         to retrieve additional records that are available after the first page
     *         results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * NextToken string is used when calling ListPlatformApplications action
     * to retrieve additional records that are available after the first page
     * results.
     *
     * @param nextToken NextToken string is used when calling ListPlatformApplications action
     *         to retrieve additional records that are available after the first page
     *         results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * NextToken string is used when calling ListPlatformApplications action
     * to retrieve additional records that are available after the first page
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken NextToken string is used when calling ListPlatformApplications action
     *         to retrieve additional records that are available after the first page
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPlatformApplicationsRequest withNextToken(String nextToken) {
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
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPlatformApplicationsRequest == false) return false;
        ListPlatformApplicationsRequest other = (ListPlatformApplicationsRequest)obj;
        
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    