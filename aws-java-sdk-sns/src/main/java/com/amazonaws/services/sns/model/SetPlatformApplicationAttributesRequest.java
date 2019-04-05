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
 * Input for SetPlatformApplicationAttributes action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetPlatformApplicationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetPlatformApplicationAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * PlatformApplicationArn for SetPlatformApplicationAttributes action.
     * </p>
     */
    private String platformApplicationArn;
    /**
     * <p>
     * A map of the platform application attributes. Attributes in this map include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformCredential</code> – The credential received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformCredential is private key. For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is
     * "client secret".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformPrincipal</code> – The principal received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformPrincipal is SSL certificate. For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is
     * "client id".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointCreated</code> – Topic ARN to which EndpointCreated event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointDeleted</code> – Topic ARN to which EndpointDeleted event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointUpdated</code> – Topic ARN to which EndpointUpdate event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventDeliveryFailure</code> – Topic ARN to which DeliveryFailure event notifications should be sent upon
     * Direct Publish delivery failure (permanent) to one of the application's endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FailureFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackSampleRate</code> – Sample rate percentage (0-100) of successfully delivered messages.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;

    /**
     * <p>
     * PlatformApplicationArn for SetPlatformApplicationAttributes action.
     * </p>
     * 
     * @param platformApplicationArn
     *        PlatformApplicationArn for SetPlatformApplicationAttributes action.
     */

    public void setPlatformApplicationArn(String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for SetPlatformApplicationAttributes action.
     * </p>
     * 
     * @return PlatformApplicationArn for SetPlatformApplicationAttributes action.
     */

    public String getPlatformApplicationArn() {
        return this.platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for SetPlatformApplicationAttributes action.
     * </p>
     * 
     * @param platformApplicationArn
     *        PlatformApplicationArn for SetPlatformApplicationAttributes action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetPlatformApplicationAttributesRequest withPlatformApplicationArn(String platformApplicationArn) {
        setPlatformApplicationArn(platformApplicationArn);
        return this;
    }

    /**
     * <p>
     * A map of the platform application attributes. Attributes in this map include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformCredential</code> – The credential received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformCredential is private key. For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is
     * "client secret".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformPrincipal</code> – The principal received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformPrincipal is SSL certificate. For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is
     * "client id".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointCreated</code> – Topic ARN to which EndpointCreated event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointDeleted</code> – Topic ARN to which EndpointDeleted event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointUpdated</code> – Topic ARN to which EndpointUpdate event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventDeliveryFailure</code> – Topic ARN to which DeliveryFailure event notifications should be sent upon
     * Direct Publish delivery failure (permanent) to one of the application's endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FailureFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackSampleRate</code> – Sample rate percentage (0-100) of successfully delivered messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map of the platform application attributes. Attributes in this map include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PlatformCredential</code> – The credential received from the notification service. For
     *         APNS/APNS_SANDBOX, PlatformCredential is private key. For GCM, PlatformCredential is "API key". For ADM,
     *         PlatformCredential is "client secret".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PlatformPrincipal</code> – The principal received from the notification service. For
     *         APNS/APNS_SANDBOX, PlatformPrincipal is SSL certificate. For GCM, PlatformPrincipal is not applicable.
     *         For ADM, PlatformPrincipal is "client id".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EventEndpointCreated</code> – Topic ARN to which EndpointCreated event notifications should be
     *         sent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EventEndpointDeleted</code> – Topic ARN to which EndpointDeleted event notifications should be
     *         sent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EventEndpointUpdated</code> – Topic ARN to which EndpointUpdate event notifications should be sent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EventDeliveryFailure</code> – Topic ARN to which DeliveryFailure event notifications should be sent
     *         upon Direct Publish delivery failure (permanent) to one of the application's endpoints.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SuccessFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch
     *         Logs on your behalf.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FailureFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch
     *         Logs on your behalf.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SuccessFeedbackSampleRate</code> – Sample rate percentage (0-100) of successfully delivered
     *         messages.
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
     * A map of the platform application attributes. Attributes in this map include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformCredential</code> – The credential received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformCredential is private key. For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is
     * "client secret".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformPrincipal</code> – The principal received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformPrincipal is SSL certificate. For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is
     * "client id".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointCreated</code> – Topic ARN to which EndpointCreated event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointDeleted</code> – Topic ARN to which EndpointDeleted event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointUpdated</code> – Topic ARN to which EndpointUpdate event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventDeliveryFailure</code> – Topic ARN to which DeliveryFailure event notifications should be sent upon
     * Direct Publish delivery failure (permanent) to one of the application's endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FailureFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackSampleRate</code> – Sample rate percentage (0-100) of successfully delivered messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A map of the platform application attributes. Attributes in this map include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlatformCredential</code> – The credential received from the notification service. For
     *        APNS/APNS_SANDBOX, PlatformCredential is private key. For GCM, PlatformCredential is "API key". For ADM,
     *        PlatformCredential is "client secret".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PlatformPrincipal</code> – The principal received from the notification service. For
     *        APNS/APNS_SANDBOX, PlatformPrincipal is SSL certificate. For GCM, PlatformPrincipal is not applicable. For
     *        ADM, PlatformPrincipal is "client id".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EventEndpointCreated</code> – Topic ARN to which EndpointCreated event notifications should be sent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EventEndpointDeleted</code> – Topic ARN to which EndpointDeleted event notifications should be sent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EventEndpointUpdated</code> – Topic ARN to which EndpointUpdate event notifications should be sent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EventDeliveryFailure</code> – Topic ARN to which DeliveryFailure event notifications should be sent
     *        upon Direct Publish delivery failure (permanent) to one of the application's endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SuccessFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch
     *        Logs on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FailureFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch
     *        Logs on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SuccessFeedbackSampleRate</code> – Sample rate percentage (0-100) of successfully delivered
     *        messages.
     *        </p>
     *        </li>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * A map of the platform application attributes. Attributes in this map include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformCredential</code> – The credential received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformCredential is private key. For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is
     * "client secret".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformPrincipal</code> – The principal received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformPrincipal is SSL certificate. For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is
     * "client id".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointCreated</code> – Topic ARN to which EndpointCreated event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointDeleted</code> – Topic ARN to which EndpointDeleted event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointUpdated</code> – Topic ARN to which EndpointUpdate event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventDeliveryFailure</code> – Topic ARN to which DeliveryFailure event notifications should be sent upon
     * Direct Publish delivery failure (permanent) to one of the application's endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FailureFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackSampleRate</code> – Sample rate percentage (0-100) of successfully delivered messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A map of the platform application attributes. Attributes in this map include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlatformCredential</code> – The credential received from the notification service. For
     *        APNS/APNS_SANDBOX, PlatformCredential is private key. For GCM, PlatformCredential is "API key". For ADM,
     *        PlatformCredential is "client secret".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PlatformPrincipal</code> – The principal received from the notification service. For
     *        APNS/APNS_SANDBOX, PlatformPrincipal is SSL certificate. For GCM, PlatformPrincipal is not applicable. For
     *        ADM, PlatformPrincipal is "client id".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EventEndpointCreated</code> – Topic ARN to which EndpointCreated event notifications should be sent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EventEndpointDeleted</code> – Topic ARN to which EndpointDeleted event notifications should be sent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EventEndpointUpdated</code> – Topic ARN to which EndpointUpdate event notifications should be sent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EventDeliveryFailure</code> – Topic ARN to which DeliveryFailure event notifications should be sent
     *        upon Direct Publish delivery failure (permanent) to one of the application's endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SuccessFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch
     *        Logs on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FailureFeedbackRoleArn</code> – IAM role ARN used to give Amazon SNS write access to use CloudWatch
     *        Logs on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SuccessFeedbackSampleRate</code> – Sample rate percentage (0-100) of successfully delivered
     *        messages.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetPlatformApplicationAttributesRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public SetPlatformApplicationAttributesRequest addAttributesEntry(String key, String value) {
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

    public SetPlatformApplicationAttributesRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
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
        if (getPlatformApplicationArn() != null)
            sb.append("PlatformApplicationArn: ").append(getPlatformApplicationArn()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetPlatformApplicationAttributesRequest == false)
            return false;
        SetPlatformApplicationAttributesRequest other = (SetPlatformApplicationAttributesRequest) obj;
        if (other.getPlatformApplicationArn() == null ^ this.getPlatformApplicationArn() == null)
            return false;
        if (other.getPlatformApplicationArn() != null && other.getPlatformApplicationArn().equals(this.getPlatformApplicationArn()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatformApplicationArn() == null) ? 0 : getPlatformApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public SetPlatformApplicationAttributesRequest clone() {
        return (SetPlatformApplicationAttributesRequest) super.clone();
    }

}
