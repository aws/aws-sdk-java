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
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#createPlatformApplication(CreatePlatformApplicationRequest) CreatePlatformApplication operation}.
 * <p>
 * The <code>CreatePlatformApplication</code> action creates a platform application object for one of the supported push notification services, such as
 * APNS and GCM, to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential attributes when using the
 * <code>CreatePlatformApplication</code> action. The PlatformPrincipal is received from the notification service. For APNS/APNS_SANDBOX,
 * PlatformPrincipal is "SSL certificate". For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The
 * PlatformCredential is also received from the notification service. For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM,
 * PlatformCredential is "API key". For ADM, PlatformCredential is "client secret". The PlatformApplicationArn that is returned when using
 * <code>CreatePlatformApplication</code> is then used as an attribute for the <code>CreatePlatformEndpoint</code> action. For more information, see <a
 * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html"> Using Amazon SNS Mobile Push Notifications </a> .
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#createPlatformApplication(CreatePlatformApplicationRequest)
 */
public class CreatePlatformApplicationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Application names must be made up of only uppercase and lowercase
     * ASCII letters, numbers, underscores, hyphens, and periods, and must be
     * between 1 and 256 characters long.
     */
    private String name;

    /**
     * The following platforms are supported: ADM (Amazon Device Messaging),
     * APNS (Apple Push Notification Service), APNS_SANDBOX, and GCM (Google
     * Cloud Messaging).
     */
    private String platform;

    /**
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html">SetPlatformApplicationAttributes</a>
     */
    private java.util.Map<String,String> attributes;

    /**
     * Application names must be made up of only uppercase and lowercase
     * ASCII letters, numbers, underscores, hyphens, and periods, and must be
     * between 1 and 256 characters long.
     *
     * @return Application names must be made up of only uppercase and lowercase
     *         ASCII letters, numbers, underscores, hyphens, and periods, and must be
     *         between 1 and 256 characters long.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Application names must be made up of only uppercase and lowercase
     * ASCII letters, numbers, underscores, hyphens, and periods, and must be
     * between 1 and 256 characters long.
     *
     * @param name Application names must be made up of only uppercase and lowercase
     *         ASCII letters, numbers, underscores, hyphens, and periods, and must be
     *         between 1 and 256 characters long.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Application names must be made up of only uppercase and lowercase
     * ASCII letters, numbers, underscores, hyphens, and periods, and must be
     * between 1 and 256 characters long.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name Application names must be made up of only uppercase and lowercase
     *         ASCII letters, numbers, underscores, hyphens, and periods, and must be
     *         between 1 and 256 characters long.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePlatformApplicationRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The following platforms are supported: ADM (Amazon Device Messaging),
     * APNS (Apple Push Notification Service), APNS_SANDBOX, and GCM (Google
     * Cloud Messaging).
     *
     * @return The following platforms are supported: ADM (Amazon Device Messaging),
     *         APNS (Apple Push Notification Service), APNS_SANDBOX, and GCM (Google
     *         Cloud Messaging).
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The following platforms are supported: ADM (Amazon Device Messaging),
     * APNS (Apple Push Notification Service), APNS_SANDBOX, and GCM (Google
     * Cloud Messaging).
     *
     * @param platform The following platforms are supported: ADM (Amazon Device Messaging),
     *         APNS (Apple Push Notification Service), APNS_SANDBOX, and GCM (Google
     *         Cloud Messaging).
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The following platforms are supported: ADM (Amazon Device Messaging),
     * APNS (Apple Push Notification Service), APNS_SANDBOX, and GCM (Google
     * Cloud Messaging).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platform The following platforms are supported: ADM (Amazon Device Messaging),
     *         APNS (Apple Push Notification Service), APNS_SANDBOX, and GCM (Google
     *         Cloud Messaging).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePlatformApplicationRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html">SetPlatformApplicationAttributes</a>
     *
     * @return For a list of attributes, see <a
     *         href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html">SetPlatformApplicationAttributes</a>
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html">SetPlatformApplicationAttributes</a>
     *
     * @param attributes For a list of attributes, see <a
     *         href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html">SetPlatformApplicationAttributes</a>
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html">SetPlatformApplicationAttributes</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes For a list of attributes, see <a
     *         href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html">SetPlatformApplicationAttributes</a>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePlatformApplicationRequest withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html">SetPlatformApplicationAttributes</a>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
	public CreatePlatformApplicationRequest addAttributesEntry(String key, String value) {
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
	public CreatePlatformApplicationRequest clearAttributesEntries() {
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePlatformApplicationRequest == false) return false;
        CreatePlatformApplicationRequest other = (CreatePlatformApplicationRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    