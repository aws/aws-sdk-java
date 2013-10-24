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
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#createPlatformEndpoint(CreatePlatformEndpointRequest) CreatePlatformEndpoint operation}.
 * <p>
 * The <code>CreatePlatformEndpoint</code> creates an endpoint for a device and mobile app on one of the supported push notification services, such as
 * GCM and APNS. <code>CreatePlatformEndpoint</code> requires the PlatformApplicationArn that is returned from <code>CreatePlatformApplication</code> .
 * The EndpointArn that is returned when using <code>CreatePlatformEndpoint</code> can then be used by the <code>Publish</code> action to send a message
 * to a mobile app or by the <code>Subscribe</code> action for subscription to a topic. For more information, see <a
 * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html"> Using Amazon SNS Mobile Push Notifications </a> .
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#createPlatformEndpoint(CreatePlatformEndpointRequest)
 */
public class CreatePlatformEndpointRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * PlatformApplicationArn returned from CreatePlatformApplication is used
     * to create a an endpoint.
     */
    private String platformApplicationArn;

    /**
     * Unique identifier created by the notification service for an app on a
     * device. The specific name for Token will vary, depending on which
     * notification service is being used. For example, when using APNS as
     * the notification service, you need the device token. Alternatively,
     * when using GCM or ADM, the device token equivalent is called the
     * registration ID.
     */
    private String token;

    /**
     * Arbitrary user data to associate with the endpoint. SNS does not use
     * this data. The data must be in UTF-8 format and less than 2KB.
     */
    private String customUserData;

    /**
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     */
    private java.util.Map<String,String> attributes;

    /**
     * PlatformApplicationArn returned from CreatePlatformApplication is used
     * to create a an endpoint.
     *
     * @return PlatformApplicationArn returned from CreatePlatformApplication is used
     *         to create a an endpoint.
     */
    public String getPlatformApplicationArn() {
        return platformApplicationArn;
    }
    
    /**
     * PlatformApplicationArn returned from CreatePlatformApplication is used
     * to create a an endpoint.
     *
     * @param platformApplicationArn PlatformApplicationArn returned from CreatePlatformApplication is used
     *         to create a an endpoint.
     */
    public void setPlatformApplicationArn(String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
    }
    
    /**
     * PlatformApplicationArn returned from CreatePlatformApplication is used
     * to create a an endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platformApplicationArn PlatformApplicationArn returned from CreatePlatformApplication is used
     *         to create a an endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePlatformEndpointRequest withPlatformApplicationArn(String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
        return this;
    }

    /**
     * Unique identifier created by the notification service for an app on a
     * device. The specific name for Token will vary, depending on which
     * notification service is being used. For example, when using APNS as
     * the notification service, you need the device token. Alternatively,
     * when using GCM or ADM, the device token equivalent is called the
     * registration ID.
     *
     * @return Unique identifier created by the notification service for an app on a
     *         device. The specific name for Token will vary, depending on which
     *         notification service is being used. For example, when using APNS as
     *         the notification service, you need the device token. Alternatively,
     *         when using GCM or ADM, the device token equivalent is called the
     *         registration ID.
     */
    public String getToken() {
        return token;
    }
    
    /**
     * Unique identifier created by the notification service for an app on a
     * device. The specific name for Token will vary, depending on which
     * notification service is being used. For example, when using APNS as
     * the notification service, you need the device token. Alternatively,
     * when using GCM or ADM, the device token equivalent is called the
     * registration ID.
     *
     * @param token Unique identifier created by the notification service for an app on a
     *         device. The specific name for Token will vary, depending on which
     *         notification service is being used. For example, when using APNS as
     *         the notification service, you need the device token. Alternatively,
     *         when using GCM or ADM, the device token equivalent is called the
     *         registration ID.
     */
    public void setToken(String token) {
        this.token = token;
    }
    
    /**
     * Unique identifier created by the notification service for an app on a
     * device. The specific name for Token will vary, depending on which
     * notification service is being used. For example, when using APNS as
     * the notification service, you need the device token. Alternatively,
     * when using GCM or ADM, the device token equivalent is called the
     * registration ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param token Unique identifier created by the notification service for an app on a
     *         device. The specific name for Token will vary, depending on which
     *         notification service is being used. For example, when using APNS as
     *         the notification service, you need the device token. Alternatively,
     *         when using GCM or ADM, the device token equivalent is called the
     *         registration ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePlatformEndpointRequest withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Arbitrary user data to associate with the endpoint. SNS does not use
     * this data. The data must be in UTF-8 format and less than 2KB.
     *
     * @return Arbitrary user data to associate with the endpoint. SNS does not use
     *         this data. The data must be in UTF-8 format and less than 2KB.
     */
    public String getCustomUserData() {
        return customUserData;
    }
    
    /**
     * Arbitrary user data to associate with the endpoint. SNS does not use
     * this data. The data must be in UTF-8 format and less than 2KB.
     *
     * @param customUserData Arbitrary user data to associate with the endpoint. SNS does not use
     *         this data. The data must be in UTF-8 format and less than 2KB.
     */
    public void setCustomUserData(String customUserData) {
        this.customUserData = customUserData;
    }
    
    /**
     * Arbitrary user data to associate with the endpoint. SNS does not use
     * this data. The data must be in UTF-8 format and less than 2KB.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customUserData Arbitrary user data to associate with the endpoint. SNS does not use
     *         this data. The data must be in UTF-8 format and less than 2KB.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePlatformEndpointRequest withCustomUserData(String customUserData) {
        this.customUserData = customUserData;
        return this;
    }

    /**
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     *
     * @return For a list of attributes, see <a
     *         href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     *
     * @param attributes For a list of attributes, see <a
     *         href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes For a list of attributes, see <a
     *         href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePlatformEndpointRequest withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
	public CreatePlatformEndpointRequest addAttributesEntry(String key, String value) {
		if (null == this.attributes) {
			this.attributes = new java.util.HashMap<String,String>();
		}
		if (this.attributes.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.attributes.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Attributes.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public CreatePlatformEndpointRequest clearAttributesEntries() {
		this.attributes = null;
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
        if (getPlatformApplicationArn() != null) sb.append("PlatformApplicationArn: " + getPlatformApplicationArn() + ",");
        if (getToken() != null) sb.append("Token: " + getToken() + ",");
        if (getCustomUserData() != null) sb.append("CustomUserData: " + getCustomUserData() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPlatformApplicationArn() == null) ? 0 : getPlatformApplicationArn().hashCode()); 
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode()); 
        hashCode = prime * hashCode + ((getCustomUserData() == null) ? 0 : getCustomUserData().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePlatformEndpointRequest == false) return false;
        CreatePlatformEndpointRequest other = (CreatePlatformEndpointRequest)obj;
        
        if (other.getPlatformApplicationArn() == null ^ this.getPlatformApplicationArn() == null) return false;
        if (other.getPlatformApplicationArn() != null && other.getPlatformApplicationArn().equals(this.getPlatformApplicationArn()) == false) return false; 
        if (other.getToken() == null ^ this.getToken() == null) return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false) return false; 
        if (other.getCustomUserData() == null ^ this.getCustomUserData() == null) return false;
        if (other.getCustomUserData() != null && other.getCustomUserData().equals(this.getCustomUserData()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    