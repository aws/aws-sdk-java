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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents status information for a VPC peering connection. Status is associated with a <a>VpcPeeringConnection</a>
 * object. Status codes and messages are provided from EC2 (see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_VpcPeeringConnectionStateReason.html"
 * >VpcPeeringConnectionStateReason</a>). Connection status information is also communicated as a fleet <a>Event</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/VpcPeeringConnectionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcPeeringConnectionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Code indicating the status of a VPC peering connection.
     * </p>
     */
    private String code;
    /**
     * <p>
     * Additional messaging associated with the connection status.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Code indicating the status of a VPC peering connection.
     * </p>
     * 
     * @param code
     *        Code indicating the status of a VPC peering connection.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Code indicating the status of a VPC peering connection.
     * </p>
     * 
     * @return Code indicating the status of a VPC peering connection.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * Code indicating the status of a VPC peering connection.
     * </p>
     * 
     * @param code
     *        Code indicating the status of a VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnectionStatus withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Additional messaging associated with the connection status.
     * </p>
     * 
     * @param message
     *        Additional messaging associated with the connection status.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Additional messaging associated with the connection status.
     * </p>
     * 
     * @return Additional messaging associated with the connection status.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Additional messaging associated with the connection status.
     * </p>
     * 
     * @param message
     *        Additional messaging associated with the connection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnectionStatus withMessage(String message) {
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

        if (obj instanceof VpcPeeringConnectionStatus == false)
            return false;
        VpcPeeringConnectionStatus other = (VpcPeeringConnectionStatus) obj;
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
    public VpcPeeringConnectionStatus clone() {
        try {
            return (VpcPeeringConnectionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.VpcPeeringConnectionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
