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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The CIS session message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisSessionMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisSessionMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CIS rule details for the CIS session message.
     * </p>
     */
    private java.nio.ByteBuffer cisRuleDetails;
    /**
     * <p>
     * The rule ID for the CIS session message.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The status of the CIS session message.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The CIS rule details for the CIS session message.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param cisRuleDetails
     *        The CIS rule details for the CIS session message.
     */

    public void setCisRuleDetails(java.nio.ByteBuffer cisRuleDetails) {
        this.cisRuleDetails = cisRuleDetails;
    }

    /**
     * <p>
     * The CIS rule details for the CIS session message.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The CIS rule details for the CIS session message.
     */

    public java.nio.ByteBuffer getCisRuleDetails() {
        return this.cisRuleDetails;
    }

    /**
     * <p>
     * The CIS rule details for the CIS session message.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param cisRuleDetails
     *        The CIS rule details for the CIS session message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisSessionMessage withCisRuleDetails(java.nio.ByteBuffer cisRuleDetails) {
        setCisRuleDetails(cisRuleDetails);
        return this;
    }

    /**
     * <p>
     * The rule ID for the CIS session message.
     * </p>
     * 
     * @param ruleId
     *        The rule ID for the CIS session message.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The rule ID for the CIS session message.
     * </p>
     * 
     * @return The rule ID for the CIS session message.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The rule ID for the CIS session message.
     * </p>
     * 
     * @param ruleId
     *        The rule ID for the CIS session message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisSessionMessage withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The status of the CIS session message.
     * </p>
     * 
     * @param status
     *        The status of the CIS session message.
     * @see CisRuleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the CIS session message.
     * </p>
     * 
     * @return The status of the CIS session message.
     * @see CisRuleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the CIS session message.
     * </p>
     * 
     * @param status
     *        The status of the CIS session message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisRuleStatus
     */

    public CisSessionMessage withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the CIS session message.
     * </p>
     * 
     * @param status
     *        The status of the CIS session message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisRuleStatus
     */

    public CisSessionMessage withStatus(CisRuleStatus status) {
        this.status = status.toString();
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
        if (getCisRuleDetails() != null)
            sb.append("CisRuleDetails: ").append(getCisRuleDetails()).append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CisSessionMessage == false)
            return false;
        CisSessionMessage other = (CisSessionMessage) obj;
        if (other.getCisRuleDetails() == null ^ this.getCisRuleDetails() == null)
            return false;
        if (other.getCisRuleDetails() != null && other.getCisRuleDetails().equals(this.getCisRuleDetails()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCisRuleDetails() == null) ? 0 : getCisRuleDetails().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CisSessionMessage clone() {
        try {
            return (CisSessionMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisSessionMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
