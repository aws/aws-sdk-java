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
 * Input for CreatePlatformEndpoint action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreatePlatformEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePlatformEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
     * </p>
     */
    private String platformApplicationArn;
    /**
     * <p>
     * Unique identifier created by the notification service for an app on a device. The specific name for Token will
     * vary, depending on which notification service is being used. For example, when using APNS as the notification
     * service, you need the device token. Alternatively, when using GCM or ADM, the device token equivalent is called
     * the registration ID.
     * </p>
     */
    private String token;
    /**
     * <p>
     * Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8
     * format and less than 2KB.
     * </p>
     */
    private String customUserData;
    /**
     * <p>
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;

    /**
     * <p>
     * PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
     * </p>
     * 
     * @param platformApplicationArn
     *        PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
     */

    public void setPlatformApplicationArn(String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
     * </p>
     * 
     * @return PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
     */

    public String getPlatformApplicationArn() {
        return this.platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
     * </p>
     * 
     * @param platformApplicationArn
     *        PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformEndpointRequest withPlatformApplicationArn(String platformApplicationArn) {
        setPlatformApplicationArn(platformApplicationArn);
        return this;
    }

    /**
     * <p>
     * Unique identifier created by the notification service for an app on a device. The specific name for Token will
     * vary, depending on which notification service is being used. For example, when using APNS as the notification
     * service, you need the device token. Alternatively, when using GCM or ADM, the device token equivalent is called
     * the registration ID.
     * </p>
     * 
     * @param token
     *        Unique identifier created by the notification service for an app on a device. The specific name for Token
     *        will vary, depending on which notification service is being used. For example, when using APNS as the
     *        notification service, you need the device token. Alternatively, when using GCM or ADM, the device token
     *        equivalent is called the registration ID.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * Unique identifier created by the notification service for an app on a device. The specific name for Token will
     * vary, depending on which notification service is being used. For example, when using APNS as the notification
     * service, you need the device token. Alternatively, when using GCM or ADM, the device token equivalent is called
     * the registration ID.
     * </p>
     * 
     * @return Unique identifier created by the notification service for an app on a device. The specific name for Token
     *         will vary, depending on which notification service is being used. For example, when using APNS as the
     *         notification service, you need the device token. Alternatively, when using GCM or ADM, the device token
     *         equivalent is called the registration ID.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * Unique identifier created by the notification service for an app on a device. The specific name for Token will
     * vary, depending on which notification service is being used. For example, when using APNS as the notification
     * service, you need the device token. Alternatively, when using GCM or ADM, the device token equivalent is called
     * the registration ID.
     * </p>
     * 
     * @param token
     *        Unique identifier created by the notification service for an app on a device. The specific name for Token
     *        will vary, depending on which notification service is being used. For example, when using APNS as the
     *        notification service, you need the device token. Alternatively, when using GCM or ADM, the device token
     *        equivalent is called the registration ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformEndpointRequest withToken(String token) {
        setToken(token);
        return this;
    }

    /**
     * <p>
     * Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8
     * format and less than 2KB.
     * </p>
     * 
     * @param customUserData
     *        Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in
     *        UTF-8 format and less than 2KB.
     */

    public void setCustomUserData(String customUserData) {
        this.customUserData = customUserData;
    }

    /**
     * <p>
     * Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8
     * format and less than 2KB.
     * </p>
     * 
     * @return Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be
     *         in UTF-8 format and less than 2KB.
     */

    public String getCustomUserData() {
        return this.customUserData;
    }

    /**
     * <p>
     * Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8
     * format and less than 2KB.
     * </p>
     * 
     * @param customUserData
     *        Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in
     *        UTF-8 format and less than 2KB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformEndpointRequest withCustomUserData(String customUserData) {
        setCustomUserData(customUserData);
        return this;
    }

    /**
     * <p>
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     * </p>
     * 
     * @return For a list of attributes, see <a
     *         href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html"
     *         >SetEndpointAttributes</a>.
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
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     * </p>
     * 
     * @param attributes
     *        For a list of attributes, see <a
     *        href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * For a list of attributes, see <a
     * href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     * </p>
     * 
     * @param attributes
     *        For a list of attributes, see <a
     *        href="http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html">SetEndpointAttributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlatformEndpointRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public CreatePlatformEndpointRequest addAttributesEntry(String key, String value) {
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

    public CreatePlatformEndpointRequest clearAttributesEntries() {
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
        if (getToken() != null)
            sb.append("Token: ").append(getToken()).append(",");
        if (getCustomUserData() != null)
            sb.append("CustomUserData: ").append(getCustomUserData()).append(",");
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

        if (obj instanceof CreatePlatformEndpointRequest == false)
            return false;
        CreatePlatformEndpointRequest other = (CreatePlatformEndpointRequest) obj;
        if (other.getPlatformApplicationArn() == null ^ this.getPlatformApplicationArn() == null)
            return false;
        if (other.getPlatformApplicationArn() != null && other.getPlatformApplicationArn().equals(this.getPlatformApplicationArn()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getCustomUserData() == null ^ this.getCustomUserData() == null)
            return false;
        if (other.getCustomUserData() != null && other.getCustomUserData().equals(this.getCustomUserData()) == false)
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
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getCustomUserData() == null) ? 0 : getCustomUserData().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlatformEndpointRequest clone() {
        return (CreatePlatformEndpointRequest) super.clone();
    }

}
