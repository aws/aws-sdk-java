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
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#getSubscriptionAttributes(GetSubscriptionAttributesRequest) GetSubscriptionAttributes operation}.
 * <p>
 * The <code>GetSubscriptionAttribtues</code> action returns all of the properties of a subscription.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#getSubscriptionAttributes(GetSubscriptionAttributesRequest)
 */
public class GetSubscriptionAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ARN of the subscription whose properties you want to get.
     */
    private String subscriptionArn;

    /**
     * Default constructor for a new GetSubscriptionAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetSubscriptionAttributesRequest() {}
    
    /**
     * Constructs a new GetSubscriptionAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param subscriptionArn The ARN of the subscription whose properties
     * you want to get.
     */
    public GetSubscriptionAttributesRequest(String subscriptionArn) {
        setSubscriptionArn(subscriptionArn);
    }

    /**
     * The ARN of the subscription whose properties you want to get.
     *
     * @return The ARN of the subscription whose properties you want to get.
     */
    public String getSubscriptionArn() {
        return subscriptionArn;
    }
    
    /**
     * The ARN of the subscription whose properties you want to get.
     *
     * @param subscriptionArn The ARN of the subscription whose properties you want to get.
     */
    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }
    
    /**
     * The ARN of the subscription whose properties you want to get.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionArn The ARN of the subscription whose properties you want to get.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetSubscriptionAttributesRequest withSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
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
        if (getSubscriptionArn() != null) sb.append("SubscriptionArn: " + getSubscriptionArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubscriptionArn() == null) ? 0 : getSubscriptionArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetSubscriptionAttributesRequest == false) return false;
        GetSubscriptionAttributesRequest other = (GetSubscriptionAttributesRequest)obj;
        
        if (other.getSubscriptionArn() == null ^ this.getSubscriptionArn() == null) return false;
        if (other.getSubscriptionArn() != null && other.getSubscriptionArn().equals(this.getSubscriptionArn()) == false) return false; 
        return true;
    }
    
}
    