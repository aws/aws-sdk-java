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
 * Input for CreatePlatformApplication action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreatePlatformApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePlatformApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Application names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, hyphens,
     * and periods, and must be between 1 and 256 characters long.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The following platforms are supported: ADM (Amazon Device Messaging), APNS (Apple Push Notification Service),
     * APNS_SANDBOX, and GCM (Google Cloud Messaging).
     * </p>
     */
    private String platform;
    /**
     * <p>
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html"
     * >SetPlatformApplicationAttributes</a>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;

    /**
     * <p>
     * Application names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, hyphens,
     * and periods, and must be between 1 and 256 characters long.
     * </p>
     * 
     * @param name
     *        Application names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores,
     *        hyphens, and periods, and must be between 1 and 256 characters long.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Application names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, hyphens,
     * and periods, and must be between 1 and 256 characters long.
     * </p>
     * 
     * @return Application names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores,
     *         hyphens, and periods, and must be between 1 and 256 characters long.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Application names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, hyphens,
     * and periods, and must be between 1 and 256 characters long.
     * </p>
     * 
     * @param name
     *        Application names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores,
     *        hyphens, and periods, and must be between 1 and 256 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The following platforms are supported: ADM (Amazon Device Messaging), APNS (Apple Push Notification Service),
     * APNS_SANDBOX, and GCM (Google Cloud Messaging).
     * </p>
     * 
     * @param platform
     *        The following platforms are supported: ADM (Amazon Device Messaging), APNS (Apple Push Notification
     *        Service), APNS_SANDBOX, and GCM (Google Cloud Messaging).
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The following platforms are supported: ADM (Amazon Device Messaging), APNS (Apple Push Notification Service),
     * APNS_SANDBOX, and GCM (Google Cloud Messaging).
     * </p>
     * 
     * @return The following platforms are supported: ADM (Amazon Device Messaging), APNS (Apple Push Notification
     *         Service), APNS_SANDBOX, and GCM (Google Cloud Messaging).
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The following platforms are supported: ADM (Amazon Device Messaging), APNS (Apple Push Notification Service),
     * APNS_SANDBOX, and GCM (Google Cloud Messaging).
     * </p>
     * 
     * @param platform
     *        The following platforms are supported: ADM (Amazon Device Messaging), APNS (Apple Push Notification
     *        Service), APNS_SANDBOX, and GCM (Google Cloud Messaging).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformApplicationRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html"
     * >SetPlatformApplicationAttributes</a>
     * </p>
     * 
     * @return For a list of attributes, see <a
     *         href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html"
     *         >SetPlatformApplicationAttributes</a>
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html"
     * >SetPlatformApplicationAttributes</a>
     * </p>
     * 
     * @param attributes
     *        For a list of attributes, see <a
     *        href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html"
     *        >SetPlatformApplicationAttributes</a>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html"
     * >SetPlatformApplicationAttributes</a>
     * </p>
     * 
     * @param attributes
     *        For a list of attributes, see <a
     *        href="http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html"
     *        >SetPlatformApplicationAttributes</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformApplicationRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public CreatePlatformApplicationRequest addAttributesEntry(String key, String value) {
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

    public CreatePlatformApplicationRequest clearAttributesEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
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

        if (obj instanceof CreatePlatformApplicationRequest == false)
            return false;
        CreatePlatformApplicationRequest other = (CreatePlatformApplicationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlatformApplicationRequest clone() {
        return (CreatePlatformApplicationRequest) super.clone();
    }

}
