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
 * Provides status change reason details for the instance fleet.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceFleetStateChangeReason"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceFleetStateChangeReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     */
    private String code;
    /**
     * <p>
     * An explanatory message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     * 
     * @param code
     *        A code corresponding to the reason the state change occurred.
     * @see InstanceFleetStateChangeReasonCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     * 
     * @return A code corresponding to the reason the state change occurred.
     * @see InstanceFleetStateChangeReasonCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     * 
     * @param code
     *        A code corresponding to the reason the state change occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceFleetStateChangeReasonCode
     */

    public InstanceFleetStateChangeReason withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     * 
     * @param code
     *        A code corresponding to the reason the state change occurred.
     * @see InstanceFleetStateChangeReasonCode
     */

    public void setCode(InstanceFleetStateChangeReasonCode code) {
        withCode(code);
    }

    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     * 
     * @param code
     *        A code corresponding to the reason the state change occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceFleetStateChangeReasonCode
     */

    public InstanceFleetStateChangeReason withCode(InstanceFleetStateChangeReasonCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * An explanatory message.
     * </p>
     * 
     * @param message
     *        An explanatory message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An explanatory message.
     * </p>
     * 
     * @return An explanatory message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An explanatory message.
     * </p>
     * 
     * @param message
     *        An explanatory message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetStateChangeReason withMessage(String message) {
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

        if (obj instanceof InstanceFleetStateChangeReason == false)
            return false;
        InstanceFleetStateChangeReason other = (InstanceFleetStateChangeReason) obj;
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
    public InstanceFleetStateChangeReason clone() {
        try {
            return (InstanceFleetStateChangeReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceFleetStateChangeReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
