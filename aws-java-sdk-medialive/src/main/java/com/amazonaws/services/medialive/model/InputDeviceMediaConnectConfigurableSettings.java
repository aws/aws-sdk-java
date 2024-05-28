/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Parameters required to attach a MediaConnect flow to the device.
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputDeviceMediaConnectConfigurableSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDeviceMediaConnectConfigurableSettings implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the MediaConnect flow to attach this device to. */
    private String flowArn;
    /**
     * The ARN for the role that MediaLive assumes to access the attached flow and secret. For more information about
     * how to create this role, see the MediaLive user guide.
     */
    private String roleArn;
    /** The ARN for the secret that holds the encryption key to encrypt the content output by the device. */
    private String secretArn;
    /** The name of the MediaConnect Flow source to stream to. */
    private String sourceName;

    /**
     * The ARN of the MediaConnect flow to attach this device to.
     * 
     * @param flowArn
     *        The ARN of the MediaConnect flow to attach this device to.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the MediaConnect flow to attach this device to.
     * 
     * @return The ARN of the MediaConnect flow to attach this device to.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The ARN of the MediaConnect flow to attach this device to.
     * 
     * @param flowArn
     *        The ARN of the MediaConnect flow to attach this device to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceMediaConnectConfigurableSettings withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The ARN for the role that MediaLive assumes to access the attached flow and secret. For more information about
     * how to create this role, see the MediaLive user guide.
     * 
     * @param roleArn
     *        The ARN for the role that MediaLive assumes to access the attached flow and secret. For more information
     *        about how to create this role, see the MediaLive user guide.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The ARN for the role that MediaLive assumes to access the attached flow and secret. For more information about
     * how to create this role, see the MediaLive user guide.
     * 
     * @return The ARN for the role that MediaLive assumes to access the attached flow and secret. For more information
     *         about how to create this role, see the MediaLive user guide.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The ARN for the role that MediaLive assumes to access the attached flow and secret. For more information about
     * how to create this role, see the MediaLive user guide.
     * 
     * @param roleArn
     *        The ARN for the role that MediaLive assumes to access the attached flow and secret. For more information
     *        about how to create this role, see the MediaLive user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceMediaConnectConfigurableSettings withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * The ARN for the secret that holds the encryption key to encrypt the content output by the device.
     * 
     * @param secretArn
     *        The ARN for the secret that holds the encryption key to encrypt the content output by the device.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * The ARN for the secret that holds the encryption key to encrypt the content output by the device.
     * 
     * @return The ARN for the secret that holds the encryption key to encrypt the content output by the device.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * The ARN for the secret that holds the encryption key to encrypt the content output by the device.
     * 
     * @param secretArn
     *        The ARN for the secret that holds the encryption key to encrypt the content output by the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceMediaConnectConfigurableSettings withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * The name of the MediaConnect Flow source to stream to.
     * 
     * @param sourceName
     *        The name of the MediaConnect Flow source to stream to.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * The name of the MediaConnect Flow source to stream to.
     * 
     * @return The name of the MediaConnect Flow source to stream to.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * The name of the MediaConnect Flow source to stream to.
     * 
     * @param sourceName
     *        The name of the MediaConnect Flow source to stream to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceMediaConnectConfigurableSettings withSourceName(String sourceName) {
        setSourceName(sourceName);
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDeviceMediaConnectConfigurableSettings == false)
            return false;
        InputDeviceMediaConnectConfigurableSettings other = (InputDeviceMediaConnectConfigurableSettings) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        return hashCode;
    }

    @Override
    public InputDeviceMediaConnectConfigurableSettings clone() {
        try {
            return (InputDeviceMediaConnectConfigurableSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputDeviceMediaConnectConfigurableSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
