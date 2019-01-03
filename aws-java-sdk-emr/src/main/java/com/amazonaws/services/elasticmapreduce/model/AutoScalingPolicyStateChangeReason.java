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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The reason for an <a>AutoScalingPolicyStatus</a> change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AutoScalingPolicyStateChangeReason"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingPolicyStateChangeReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code indicating the reason for the change in status.<code>USER_REQUEST</code> indicates that the scaling
     * policy status was changed by a user. <code>PROVISION_FAILURE</code> indicates that the status change was because
     * the policy failed to provision. <code>CLEANUP_FAILURE</code> indicates an error.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A friendly, more verbose message that accompanies an automatic scaling policy state change.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The code indicating the reason for the change in status.<code>USER_REQUEST</code> indicates that the scaling
     * policy status was changed by a user. <code>PROVISION_FAILURE</code> indicates that the status change was because
     * the policy failed to provision. <code>CLEANUP_FAILURE</code> indicates an error.
     * </p>
     * 
     * @param code
     *        The code indicating the reason for the change in status.<code>USER_REQUEST</code> indicates that the
     *        scaling policy status was changed by a user. <code>PROVISION_FAILURE</code> indicates that the status
     *        change was because the policy failed to provision. <code>CLEANUP_FAILURE</code> indicates an error.
     * @see AutoScalingPolicyStateChangeReasonCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The code indicating the reason for the change in status.<code>USER_REQUEST</code> indicates that the scaling
     * policy status was changed by a user. <code>PROVISION_FAILURE</code> indicates that the status change was because
     * the policy failed to provision. <code>CLEANUP_FAILURE</code> indicates an error.
     * </p>
     * 
     * @return The code indicating the reason for the change in status.<code>USER_REQUEST</code> indicates that the
     *         scaling policy status was changed by a user. <code>PROVISION_FAILURE</code> indicates that the status
     *         change was because the policy failed to provision. <code>CLEANUP_FAILURE</code> indicates an error.
     * @see AutoScalingPolicyStateChangeReasonCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The code indicating the reason for the change in status.<code>USER_REQUEST</code> indicates that the scaling
     * policy status was changed by a user. <code>PROVISION_FAILURE</code> indicates that the status change was because
     * the policy failed to provision. <code>CLEANUP_FAILURE</code> indicates an error.
     * </p>
     * 
     * @param code
     *        The code indicating the reason for the change in status.<code>USER_REQUEST</code> indicates that the
     *        scaling policy status was changed by a user. <code>PROVISION_FAILURE</code> indicates that the status
     *        change was because the policy failed to provision. <code>CLEANUP_FAILURE</code> indicates an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingPolicyStateChangeReasonCode
     */

    public AutoScalingPolicyStateChangeReason withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The code indicating the reason for the change in status.<code>USER_REQUEST</code> indicates that the scaling
     * policy status was changed by a user. <code>PROVISION_FAILURE</code> indicates that the status change was because
     * the policy failed to provision. <code>CLEANUP_FAILURE</code> indicates an error.
     * </p>
     * 
     * @param code
     *        The code indicating the reason for the change in status.<code>USER_REQUEST</code> indicates that the
     *        scaling policy status was changed by a user. <code>PROVISION_FAILURE</code> indicates that the status
     *        change was because the policy failed to provision. <code>CLEANUP_FAILURE</code> indicates an error.
     * @see AutoScalingPolicyStateChangeReasonCode
     */

    public void setCode(AutoScalingPolicyStateChangeReasonCode code) {
        withCode(code);
    }

    /**
     * <p>
     * The code indicating the reason for the change in status.<code>USER_REQUEST</code> indicates that the scaling
     * policy status was changed by a user. <code>PROVISION_FAILURE</code> indicates that the status change was because
     * the policy failed to provision. <code>CLEANUP_FAILURE</code> indicates an error.
     * </p>
     * 
     * @param code
     *        The code indicating the reason for the change in status.<code>USER_REQUEST</code> indicates that the
     *        scaling policy status was changed by a user. <code>PROVISION_FAILURE</code> indicates that the status
     *        change was because the policy failed to provision. <code>CLEANUP_FAILURE</code> indicates an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingPolicyStateChangeReasonCode
     */

    public AutoScalingPolicyStateChangeReason withCode(AutoScalingPolicyStateChangeReasonCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * A friendly, more verbose message that accompanies an automatic scaling policy state change.
     * </p>
     * 
     * @param message
     *        A friendly, more verbose message that accompanies an automatic scaling policy state change.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A friendly, more verbose message that accompanies an automatic scaling policy state change.
     * </p>
     * 
     * @return A friendly, more verbose message that accompanies an automatic scaling policy state change.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A friendly, more verbose message that accompanies an automatic scaling policy state change.
     * </p>
     * 
     * @param message
     *        A friendly, more verbose message that accompanies an automatic scaling policy state change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingPolicyStateChangeReason withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingPolicyStateChangeReason == false)
            return false;
        AutoScalingPolicyStateChangeReason other = (AutoScalingPolicyStateChangeReason) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingPolicyStateChangeReason clone() {
        try {
            return (AutoScalingPolicyStateChangeReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.AutoScalingPolicyStateChangeReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
