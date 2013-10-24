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
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#getEndpointAttributes(GetEndpointAttributesRequest) GetEndpointAttributes operation}.
 * <p>
 * The <code>GetEndpointAttributes</code> retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM
 * and APNS. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html"> Using Amazon SNS Mobile Push Notifications
 * </a> .
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#getEndpointAttributes(GetEndpointAttributesRequest)
 */
public class GetEndpointAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * EndpointArn for GetEndpointAttributes input.
     */
    private String endpointArn;

    /**
     * EndpointArn for GetEndpointAttributes input.
     *
     * @return EndpointArn for GetEndpointAttributes input.
     */
    public String getEndpointArn() {
        return endpointArn;
    }
    
    /**
     * EndpointArn for GetEndpointAttributes input.
     *
     * @param endpointArn EndpointArn for GetEndpointAttributes input.
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }
    
    /**
     * EndpointArn for GetEndpointAttributes input.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpointArn EndpointArn for GetEndpointAttributes input.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetEndpointAttributesRequest withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
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
        if (getEndpointArn() != null) sb.append("EndpointArn: " + getEndpointArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetEndpointAttributesRequest == false) return false;
        GetEndpointAttributesRequest other = (GetEndpointAttributesRequest)obj;
        
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null) return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false) return false; 
        return true;
    }
    
}
    