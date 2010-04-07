/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Unsubscribe Request
 */
public class UnsubscribeRequest extends AmazonWebServiceRequest {

    /**
     * The ARN of the subscription to be deleted.
     */
    private String subscriptionArn;

    /**
     * Default constructor for a new UnsubscribeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UnsubscribeRequest() {}
    
    /**
     * Constructs a new UnsubscribeRequest object and initializes the specified
     * object members.  Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param subscriptionArn The ARN of the subscription to be deleted.
     */
    public UnsubscribeRequest(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }
    
    /**
     * The ARN of the subscription to be deleted.
     *
     * @return The ARN of the subscription to be deleted.
     */
    public String getSubscriptionArn() {
        return subscriptionArn;
    }
    
    /**
     * The ARN of the subscription to be deleted.
     *
     * @param subscriptionArn The ARN of the subscription to be deleted.
     */
    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }
    
    /**
     * The ARN of the subscription to be deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionArn The ARN of the subscription to be deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UnsubscribeRequest withSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
        return this;
    }
    
    
}
    