/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for Subscribe action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Subscribe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscribeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> – delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> – delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> – delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> – delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> – delivery of JSON-encoded message to an EndpointArn for a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> – delivery of JSON-encoded message to an AWS Lambda function.
     * </p>
     * </li>
     * </ul>
     */
    private String protocol;
    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by protocol:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>http</code> protocol, the endpoint is an URL beginning with "http://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the endpoint is a URL beginning with "https://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an SMS-enabled device
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon SQS queue
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>application</code> protocol, the endpoint is the EndpointArn of a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS Lambda function.
     * </p>
     * </li>
     * </ul>
     */
    private String endpoint;
    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetTopicAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of messages,
     * rather than receiving every message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon SQS or
     * HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;
    /**
     * <p>
     * Sets whether the response from the <code>Subscribe</code> request includes the subscription ARN, even if the
     * subscription is not yet confirmed.
     * </p>
     * <p>
     * If you set this parameter to <code>false</code>, the response includes the ARN for confirmed subscriptions, but
     * it includes an ARN value of "pending subscription" for subscriptions that are not yet confirmed. A subscription
     * becomes confirmed when the subscriber calls the <code>ConfirmSubscription</code> action with a confirmation
     * token.
     * </p>
     * <p>
     * If you set this parameter to <code>true</code>, the response includes the ARN in all cases, even if the
     * subscription is not yet confirmed.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     */
    private Boolean returnSubscriptionArn;

    /**
     * Default constructor for SubscribeRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public SubscribeRequest() {
    }

    /**
     * Constructs a new SubscribeRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn
     *        The ARN of the topic you want to subscribe to.
     * @param protocol
     *        The protocol you want to use. Supported protocols include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>http</code> – delivery of JSON-encoded message via HTTP POST
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>email</code> – delivery of message via SMTP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>email-json</code> – delivery of JSON-encoded message via SMTP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sms</code> – delivery of message via SMS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS queue
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>application</code> – delivery of JSON-encoded message to an EndpointArn for a mobile app and device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>lambda</code> – delivery of JSON-encoded message to an AWS Lambda function.
     *        </p>
     *        </li>
     * @param endpoint
     *        The endpoint that you want to receive notifications. Endpoints vary by protocol:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>http</code> protocol, the endpoint is an URL beginning with "http://"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>https</code> protocol, the endpoint is a URL beginning with "https://"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>email</code> protocol, the endpoint is an email address
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>email-json</code> protocol, the endpoint is an email address
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>sms</code> protocol, the endpoint is a phone number of an SMS-enabled device
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon SQS queue
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>application</code> protocol, the endpoint is the EndpointArn of a mobile app and device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS Lambda function.
     *        </p>
     *        </li>
     */
    public SubscribeRequest(String topicArn, String protocol, String endpoint) {
        setTopicArn(topicArn);
        setProtocol(protocol);
        setEndpoint(endpoint);
    }

    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic you want to subscribe to.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     * 
     * @return The ARN of the topic you want to subscribe to.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic you want to subscribe to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> – delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> – delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> – delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> – delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> – delivery of JSON-encoded message to an EndpointArn for a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> – delivery of JSON-encoded message to an AWS Lambda function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The protocol you want to use. Supported protocols include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>http</code> – delivery of JSON-encoded message via HTTP POST
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>email</code> – delivery of message via SMTP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>email-json</code> – delivery of JSON-encoded message via SMTP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sms</code> – delivery of message via SMS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS queue
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>application</code> – delivery of JSON-encoded message to an EndpointArn for a mobile app and device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>lambda</code> – delivery of JSON-encoded message to an AWS Lambda function.
     *        </p>
     *        </li>
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> – delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> – delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> – delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> – delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> – delivery of JSON-encoded message to an EndpointArn for a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> – delivery of JSON-encoded message to an AWS Lambda function.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The protocol you want to use. Supported protocols include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>http</code> – delivery of JSON-encoded message via HTTP POST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>email</code> – delivery of message via SMTP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>email-json</code> – delivery of JSON-encoded message via SMTP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sms</code> – delivery of message via SMS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS queue
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>application</code> – delivery of JSON-encoded message to an EndpointArn for a mobile app and
     *         device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>lambda</code> – delivery of JSON-encoded message to an AWS Lambda function.
     *         </p>
     *         </li>
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> – delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> – delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> – delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> – delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> – delivery of JSON-encoded message to an EndpointArn for a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> – delivery of JSON-encoded message to an AWS Lambda function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The protocol you want to use. Supported protocols include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>http</code> – delivery of JSON-encoded message via HTTP POST
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>email</code> – delivery of message via SMTP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>email-json</code> – delivery of JSON-encoded message via SMTP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sms</code> – delivery of message via SMS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS queue
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>application</code> – delivery of JSON-encoded message to an EndpointArn for a mobile app and device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>lambda</code> – delivery of JSON-encoded message to an AWS Lambda function.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by protocol:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>http</code> protocol, the endpoint is an URL beginning with "http://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the endpoint is a URL beginning with "https://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an SMS-enabled device
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon SQS queue
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>application</code> protocol, the endpoint is the EndpointArn of a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS Lambda function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endpoint
     *        The endpoint that you want to receive notifications. Endpoints vary by protocol:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>http</code> protocol, the endpoint is an URL beginning with "http://"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>https</code> protocol, the endpoint is a URL beginning with "https://"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>email</code> protocol, the endpoint is an email address
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>email-json</code> protocol, the endpoint is an email address
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>sms</code> protocol, the endpoint is a phone number of an SMS-enabled device
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon SQS queue
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>application</code> protocol, the endpoint is the EndpointArn of a mobile app and device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS Lambda function.
     *        </p>
     *        </li>
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by protocol:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>http</code> protocol, the endpoint is an URL beginning with "http://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the endpoint is a URL beginning with "https://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an SMS-enabled device
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon SQS queue
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>application</code> protocol, the endpoint is the EndpointArn of a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS Lambda function.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The endpoint that you want to receive notifications. Endpoints vary by protocol:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>http</code> protocol, the endpoint is an URL beginning with "http://"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>https</code> protocol, the endpoint is a URL beginning with "https://"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>email</code> protocol, the endpoint is an email address
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>email-json</code> protocol, the endpoint is an email address
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>sms</code> protocol, the endpoint is a phone number of an SMS-enabled device
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon SQS queue
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>application</code> protocol, the endpoint is the EndpointArn of a mobile app and device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS Lambda function.
     *         </p>
     *         </li>
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by protocol:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>http</code> protocol, the endpoint is an URL beginning with "http://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the endpoint is a URL beginning with "https://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an SMS-enabled device
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon SQS queue
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>application</code> protocol, the endpoint is the EndpointArn of a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS Lambda function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endpoint
     *        The endpoint that you want to receive notifications. Endpoints vary by protocol:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>http</code> protocol, the endpoint is an URL beginning with "http://"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>https</code> protocol, the endpoint is a URL beginning with "https://"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>email</code> protocol, the endpoint is an email address
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>email-json</code> protocol, the endpoint is an email address
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>sms</code> protocol, the endpoint is a phone number of an SMS-enabled device
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon SQS queue
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>application</code> protocol, the endpoint is the EndpointArn of a mobile app and device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS Lambda function.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeRequest withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetTopicAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of messages,
     * rather than receiving every message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon SQS or
     * HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map of attributes with their corresponding values.</p>
     *         <p>
     *         The following lists the names, descriptions, and values of the special request parameters that the
     *         <code>SetTopicAttributes</code> action uses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     *         endpoints.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of
     *         messages, rather than receiving every message published to the topic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon
     *         SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is
     *         otherwise created for Amazon SNS metadata.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetTopicAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of messages,
     * rather than receiving every message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon SQS or
     * HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>SetTopicAttributes</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     *        endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of
     *        messages, rather than receiving every message published to the topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon
     *        SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is
     *        otherwise created for Amazon SNS metadata.
     *        </p>
     *        </li>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetTopicAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of messages,
     * rather than receiving every message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon SQS or
     * HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>SetTopicAttributes</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     *        endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of
     *        messages, rather than receiving every message published to the topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon
     *        SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is
     *        otherwise created for Amazon SNS metadata.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public SubscribeRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Sets whether the response from the <code>Subscribe</code> request includes the subscription ARN, even if the
     * subscription is not yet confirmed.
     * </p>
     * <p>
     * If you set this parameter to <code>false</code>, the response includes the ARN for confirmed subscriptions, but
     * it includes an ARN value of "pending subscription" for subscriptions that are not yet confirmed. A subscription
     * becomes confirmed when the subscriber calls the <code>ConfirmSubscription</code> action with a confirmation
     * token.
     * </p>
     * <p>
     * If you set this parameter to <code>true</code>, the response includes the ARN in all cases, even if the
     * subscription is not yet confirmed.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @param returnSubscriptionArn
     *        Sets whether the response from the <code>Subscribe</code> request includes the subscription ARN, even if
     *        the subscription is not yet confirmed.</p>
     *        <p>
     *        If you set this parameter to <code>false</code>, the response includes the ARN for confirmed
     *        subscriptions, but it includes an ARN value of "pending subscription" for subscriptions that are not yet
     *        confirmed. A subscription becomes confirmed when the subscriber calls the <code>ConfirmSubscription</code>
     *        action with a confirmation token.
     *        </p>
     *        <p>
     *        If you set this parameter to <code>true</code>, the response includes the ARN in all cases, even if the
     *        subscription is not yet confirmed.
     *        </p>
     *        <p>
     *        The default value is <code>false</code>.
     */

    public void setReturnSubscriptionArn(Boolean returnSubscriptionArn) {
        this.returnSubscriptionArn = returnSubscriptionArn;
    }

    /**
     * <p>
     * Sets whether the response from the <code>Subscribe</code> request includes the subscription ARN, even if the
     * subscription is not yet confirmed.
     * </p>
     * <p>
     * If you set this parameter to <code>false</code>, the response includes the ARN for confirmed subscriptions, but
     * it includes an ARN value of "pending subscription" for subscriptions that are not yet confirmed. A subscription
     * becomes confirmed when the subscriber calls the <code>ConfirmSubscription</code> action with a confirmation
     * token.
     * </p>
     * <p>
     * If you set this parameter to <code>true</code>, the response includes the ARN in all cases, even if the
     * subscription is not yet confirmed.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @return Sets whether the response from the <code>Subscribe</code> request includes the subscription ARN, even if
     *         the subscription is not yet confirmed.</p>
     *         <p>
     *         If you set this parameter to <code>false</code>, the response includes the ARN for confirmed
     *         subscriptions, but it includes an ARN value of "pending subscription" for subscriptions that are not yet
     *         confirmed. A subscription becomes confirmed when the subscriber calls the
     *         <code>ConfirmSubscription</code> action with a confirmation token.
     *         </p>
     *         <p>
     *         If you set this parameter to <code>true</code>, the response includes the ARN in all cases, even if the
     *         subscription is not yet confirmed.
     *         </p>
     *         <p>
     *         The default value is <code>false</code>.
     */

    public Boolean getReturnSubscriptionArn() {
        return this.returnSubscriptionArn;
    }

    /**
     * <p>
     * Sets whether the response from the <code>Subscribe</code> request includes the subscription ARN, even if the
     * subscription is not yet confirmed.
     * </p>
     * <p>
     * If you set this parameter to <code>false</code>, the response includes the ARN for confirmed subscriptions, but
     * it includes an ARN value of "pending subscription" for subscriptions that are not yet confirmed. A subscription
     * becomes confirmed when the subscriber calls the <code>ConfirmSubscription</code> action with a confirmation
     * token.
     * </p>
     * <p>
     * If you set this parameter to <code>true</code>, the response includes the ARN in all cases, even if the
     * subscription is not yet confirmed.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @param returnSubscriptionArn
     *        Sets whether the response from the <code>Subscribe</code> request includes the subscription ARN, even if
     *        the subscription is not yet confirmed.</p>
     *        <p>
     *        If you set this parameter to <code>false</code>, the response includes the ARN for confirmed
     *        subscriptions, but it includes an ARN value of "pending subscription" for subscriptions that are not yet
     *        confirmed. A subscription becomes confirmed when the subscriber calls the <code>ConfirmSubscription</code>
     *        action with a confirmation token.
     *        </p>
     *        <p>
     *        If you set this parameter to <code>true</code>, the response includes the ARN in all cases, even if the
     *        subscription is not yet confirmed.
     *        </p>
     *        <p>
     *        The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeRequest withReturnSubscriptionArn(Boolean returnSubscriptionArn) {
        setReturnSubscriptionArn(returnSubscriptionArn);
        return this;
    }

    /**
     * <p>
     * Sets whether the response from the <code>Subscribe</code> request includes the subscription ARN, even if the
     * subscription is not yet confirmed.
     * </p>
     * <p>
     * If you set this parameter to <code>false</code>, the response includes the ARN for confirmed subscriptions, but
     * it includes an ARN value of "pending subscription" for subscriptions that are not yet confirmed. A subscription
     * becomes confirmed when the subscriber calls the <code>ConfirmSubscription</code> action with a confirmation
     * token.
     * </p>
     * <p>
     * If you set this parameter to <code>true</code>, the response includes the ARN in all cases, even if the
     * subscription is not yet confirmed.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @return Sets whether the response from the <code>Subscribe</code> request includes the subscription ARN, even if
     *         the subscription is not yet confirmed.</p>
     *         <p>
     *         If you set this parameter to <code>false</code>, the response includes the ARN for confirmed
     *         subscriptions, but it includes an ARN value of "pending subscription" for subscriptions that are not yet
     *         confirmed. A subscription becomes confirmed when the subscriber calls the
     *         <code>ConfirmSubscription</code> action with a confirmation token.
     *         </p>
     *         <p>
     *         If you set this parameter to <code>true</code>, the response includes the ARN in all cases, even if the
     *         subscription is not yet confirmed.
     *         </p>
     *         <p>
     *         The default value is <code>false</code>.
     */

    public Boolean isReturnSubscriptionArn() {
        return this.returnSubscriptionArn;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getReturnSubscriptionArn() != null)
            sb.append("ReturnSubscriptionArn: ").append(getReturnSubscriptionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribeRequest == false)
            return false;
        SubscribeRequest other = (SubscribeRequest) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getReturnSubscriptionArn() == null ^ this.getReturnSubscriptionArn() == null)
            return false;
        if (other.getReturnSubscriptionArn() != null && other.getReturnSubscriptionArn().equals(this.getReturnSubscriptionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getReturnSubscriptionArn() == null) ? 0 : getReturnSubscriptionArn().hashCode());
        return hashCode;
    }

    @Override
    public SubscribeRequest clone() {
        return (SubscribeRequest) super.clone();
    }

}
