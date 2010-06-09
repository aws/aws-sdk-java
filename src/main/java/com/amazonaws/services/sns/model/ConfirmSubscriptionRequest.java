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
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#confirmSubscription(ConfirmSubscriptionRequest) ConfirmSubscription operation}.
 * <p>
 * The ConfirmSubscription action verifies an endpoint owner's intent to
 * receive messages by validating the token sent to the endpoint by an
 * earlier Subscribe action. If the token is valid, the action creates a
 * new subscription and returns its Amazon Resource Name (ARN). This call
 * requires an AWS signature only when the AuthenticateOnUnsubscribe flag
 * is set to "true".
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#confirmSubscription(ConfirmSubscriptionRequest)
 */
public class ConfirmSubscriptionRequest extends AmazonWebServiceRequest {

    /**
     * The ARN of the topic for which you wish to confirm a subscription.
     */
    private String topicArn;

    /**
     * Short-lived token sent to an endpoint during the Subscribe action.
     */
    private String token;

    /**
     * Indicates that you want to disable unauthenticated unsubsciption of
     * the subscription. If parameter is present in the request, the request
     * has an AWS signature, and the value of this parameter is true, only
     * the topic owner and the subscription owner will be permitted to
     * unsubscribe the endopint, and the Unsubscribe action will require AWS
     * authentication.
     */
    private String authenticateOnUnsubscribe;

    /**
     * Default constructor for a new ConfirmSubscriptionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ConfirmSubscriptionRequest() {}
    
    /**
     * Constructs a new ConfirmSubscriptionRequest object and initializes the specified
     * object members.  Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn The ARN of the topic for which you wish to confirm a
     * subscription.
     * @param token Short-lived token sent to an endpoint during the
     * Subscribe action.
     */
    public ConfirmSubscriptionRequest(String topicArn, String token) {
        this.topicArn = topicArn;
        this.token = token;
    }
    
    /**
     * The ARN of the topic for which you wish to confirm a subscription.
     *
     * @return The ARN of the topic for which you wish to confirm a subscription.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The ARN of the topic for which you wish to confirm a subscription.
     *
     * @param topicArn The ARN of the topic for which you wish to confirm a subscription.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The ARN of the topic for which you wish to confirm a subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The ARN of the topic for which you wish to confirm a subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ConfirmSubscriptionRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }
    
    
    /**
     * Short-lived token sent to an endpoint during the Subscribe action.
     *
     * @return Short-lived token sent to an endpoint during the Subscribe action.
     */
    public String getToken() {
        return token;
    }
    
    /**
     * Short-lived token sent to an endpoint during the Subscribe action.
     *
     * @param token Short-lived token sent to an endpoint during the Subscribe action.
     */
    public void setToken(String token) {
        this.token = token;
    }
    
    /**
     * Short-lived token sent to an endpoint during the Subscribe action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param token Short-lived token sent to an endpoint during the Subscribe action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ConfirmSubscriptionRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    
    /**
     * Indicates that you want to disable unauthenticated unsubsciption of
     * the subscription. If parameter is present in the request, the request
     * has an AWS signature, and the value of this parameter is true, only
     * the topic owner and the subscription owner will be permitted to
     * unsubscribe the endopint, and the Unsubscribe action will require AWS
     * authentication.
     *
     * @return Indicates that you want to disable unauthenticated unsubsciption of
     *         the subscription. If parameter is present in the request, the request
     *         has an AWS signature, and the value of this parameter is true, only
     *         the topic owner and the subscription owner will be permitted to
     *         unsubscribe the endopint, and the Unsubscribe action will require AWS
     *         authentication.
     */
    public String getAuthenticateOnUnsubscribe() {
        return authenticateOnUnsubscribe;
    }
    
    /**
     * Indicates that you want to disable unauthenticated unsubsciption of
     * the subscription. If parameter is present in the request, the request
     * has an AWS signature, and the value of this parameter is true, only
     * the topic owner and the subscription owner will be permitted to
     * unsubscribe the endopint, and the Unsubscribe action will require AWS
     * authentication.
     *
     * @param authenticateOnUnsubscribe Indicates that you want to disable unauthenticated unsubsciption of
     *         the subscription. If parameter is present in the request, the request
     *         has an AWS signature, and the value of this parameter is true, only
     *         the topic owner and the subscription owner will be permitted to
     *         unsubscribe the endopint, and the Unsubscribe action will require AWS
     *         authentication.
     */
    public void setAuthenticateOnUnsubscribe(String authenticateOnUnsubscribe) {
        this.authenticateOnUnsubscribe = authenticateOnUnsubscribe;
    }
    
    /**
     * Indicates that you want to disable unauthenticated unsubsciption of
     * the subscription. If parameter is present in the request, the request
     * has an AWS signature, and the value of this parameter is true, only
     * the topic owner and the subscription owner will be permitted to
     * unsubscribe the endopint, and the Unsubscribe action will require AWS
     * authentication.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param authenticateOnUnsubscribe Indicates that you want to disable unauthenticated unsubsciption of
     *         the subscription. If parameter is present in the request, the request
     *         has an AWS signature, and the value of this parameter is true, only
     *         the topic owner and the subscription owner will be permitted to
     *         unsubscribe the endopint, and the Unsubscribe action will require AWS
     *         authentication.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ConfirmSubscriptionRequest withAuthenticateOnUnsubscribe(String authenticateOnUnsubscribe) {
        this.authenticateOnUnsubscribe = authenticateOnUnsubscribe;
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
        
        sb.append("TopicArn: " + topicArn + ", ");
        sb.append("Token: " + token + ", ");
        sb.append("AuthenticateOnUnsubscribe: " + authenticateOnUnsubscribe + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    