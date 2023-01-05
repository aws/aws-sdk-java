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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The attributes of an <code>Endpoint</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/EndpointAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
     * </p>
     */
    private String deviceToken;
    /**
     * <p>
     * The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
     * </p>
     */
    private String voipDeviceToken;

    /**
     * <p>
     * The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
     * </p>
     * 
     * @param deviceToken
     *        The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
     */

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    /**
     * <p>
     * The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
     * </p>
     * 
     * @return The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
     */

    public String getDeviceToken() {
        return this.deviceToken;
    }

    /**
     * <p>
     * The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
     * </p>
     * 
     * @param deviceToken
     *        The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointAttributes withDeviceToken(String deviceToken) {
        setDeviceToken(deviceToken);
        return this;
    }

    /**
     * <p>
     * The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
     * </p>
     * 
     * @param voipDeviceToken
     *        The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
     */

    public void setVoipDeviceToken(String voipDeviceToken) {
        this.voipDeviceToken = voipDeviceToken;
    }

    /**
     * <p>
     * The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
     * </p>
     * 
     * @return The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
     */

    public String getVoipDeviceToken() {
        return this.voipDeviceToken;
    }

    /**
     * <p>
     * The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
     * </p>
     * 
     * @param voipDeviceToken
     *        The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointAttributes withVoipDeviceToken(String voipDeviceToken) {
        setVoipDeviceToken(voipDeviceToken);
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
        if (getDeviceToken() != null)
            sb.append("DeviceToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getVoipDeviceToken() != null)
            sb.append("VoipDeviceToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointAttributes == false)
            return false;
        EndpointAttributes other = (EndpointAttributes) obj;
        if (other.getDeviceToken() == null ^ this.getDeviceToken() == null)
            return false;
        if (other.getDeviceToken() != null && other.getDeviceToken().equals(this.getDeviceToken()) == false)
            return false;
        if (other.getVoipDeviceToken() == null ^ this.getVoipDeviceToken() == null)
            return false;
        if (other.getVoipDeviceToken() != null && other.getVoipDeviceToken().equals(this.getVoipDeviceToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceToken() == null) ? 0 : getDeviceToken().hashCode());
        hashCode = prime * hashCode + ((getVoipDeviceToken() == null) ? 0 : getVoipDeviceToken().hashCode());
        return hashCode;
    }

    @Override
    public EndpointAttributes clone() {
        try {
            return (EndpointAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkidentity.model.transform.EndpointAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
