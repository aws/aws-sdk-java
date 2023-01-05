/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contextual data, such as the user's device fingerprint, IP address, or location, used for evaluating the risk of an
 * unexpected event by Amazon Cognito advanced security.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UserContextDataType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserContextDataType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source IP address of your user's device.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Encoded device-fingerprint details that your app collected with the Amazon Cognito context data collection
     * library. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     */
    private String encodedData;

    /**
     * <p>
     * The source IP address of your user's device.
     * </p>
     * 
     * @param ipAddress
     *        The source IP address of your user's device.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The source IP address of your user's device.
     * </p>
     * 
     * @return The source IP address of your user's device.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The source IP address of your user's device.
     * </p>
     * 
     * @param ipAddress
     *        The source IP address of your user's device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContextDataType withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Encoded device-fingerprint details that your app collected with the Amazon Cognito context data collection
     * library. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * 
     * @param encodedData
     *        Encoded device-fingerprint details that your app collected with the Amazon Cognito context data collection
     *        library. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *        >Adding user device and session data to API requests</a>.
     */

    public void setEncodedData(String encodedData) {
        this.encodedData = encodedData;
    }

    /**
     * <p>
     * Encoded device-fingerprint details that your app collected with the Amazon Cognito context data collection
     * library. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * 
     * @return Encoded device-fingerprint details that your app collected with the Amazon Cognito context data
     *         collection library. For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *         >Adding user device and session data to API requests</a>.
     */

    public String getEncodedData() {
        return this.encodedData;
    }

    /**
     * <p>
     * Encoded device-fingerprint details that your app collected with the Amazon Cognito context data collection
     * library. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * 
     * @param encodedData
     *        Encoded device-fingerprint details that your app collected with the Amazon Cognito context data collection
     *        library. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *        >Adding user device and session data to API requests</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContextDataType withEncodedData(String encodedData) {
        setEncodedData(encodedData);
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
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getEncodedData() != null)
            sb.append("EncodedData: ").append(getEncodedData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserContextDataType == false)
            return false;
        UserContextDataType other = (UserContextDataType) obj;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getEncodedData() == null ^ this.getEncodedData() == null)
            return false;
        if (other.getEncodedData() != null && other.getEncodedData().equals(this.getEncodedData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getEncodedData() == null) ? 0 : getEncodedData().hashCode());
        return hashCode;
    }

    @Override
    public UserContextDataType clone() {
        try {
            return (UserContextDataType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.UserContextDataTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
