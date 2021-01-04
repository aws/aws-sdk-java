/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure that contains <code>payloadVersion</code> and <code>targetArn</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisioningHook implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The payload that was sent to the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     */
    private String payloadVersion;
    /**
     * <p>
     * The ARN of the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     */
    private String targetArn;

    /**
     * <p>
     * The payload that was sent to the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * 
     * @param payloadVersion
     *        The payload that was sent to the target function.</p>
     *        <p>
     *        <i>Note:</i> Only Lambda functions are currently supported.
     */

    public void setPayloadVersion(String payloadVersion) {
        this.payloadVersion = payloadVersion;
    }

    /**
     * <p>
     * The payload that was sent to the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * 
     * @return The payload that was sent to the target function.</p>
     *         <p>
     *         <i>Note:</i> Only Lambda functions are currently supported.
     */

    public String getPayloadVersion() {
        return this.payloadVersion;
    }

    /**
     * <p>
     * The payload that was sent to the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * 
     * @param payloadVersion
     *        The payload that was sent to the target function.</p>
     *        <p>
     *        <i>Note:</i> Only Lambda functions are currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningHook withPayloadVersion(String payloadVersion) {
        setPayloadVersion(payloadVersion);
        return this;
    }

    /**
     * <p>
     * The ARN of the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the target function.</p>
     *        <p>
     *        <i>Note:</i> Only Lambda functions are currently supported.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * 
     * @return The ARN of the target function.</p>
     *         <p>
     *         <i>Note:</i> Only Lambda functions are currently supported.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The ARN of the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the target function.</p>
     *        <p>
     *        <i>Note:</i> Only Lambda functions are currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningHook withTargetArn(String targetArn) {
        setTargetArn(targetArn);
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
        if (getPayloadVersion() != null)
            sb.append("PayloadVersion: ").append(getPayloadVersion()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningHook == false)
            return false;
        ProvisioningHook other = (ProvisioningHook) obj;
        if (other.getPayloadVersion() == null ^ this.getPayloadVersion() == null)
            return false;
        if (other.getPayloadVersion() != null && other.getPayloadVersion().equals(this.getPayloadVersion()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayloadVersion() == null) ? 0 : getPayloadVersion().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public ProvisioningHook clone() {
        try {
            return (ProvisioningHook) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ProvisioningHookMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
