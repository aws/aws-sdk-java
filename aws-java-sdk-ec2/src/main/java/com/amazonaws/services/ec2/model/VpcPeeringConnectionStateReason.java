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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the status of a VPC peering connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpcPeeringConnectionStateReason"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcPeeringConnectionStateReason implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A message that provides more information about the status, if applicable.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     * 
     * @param code
     *        The status of the VPC peering connection.
     * @see VpcPeeringConnectionStateReasonCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     * 
     * @return The status of the VPC peering connection.
     * @see VpcPeeringConnectionStateReasonCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     * 
     * @param code
     *        The status of the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcPeeringConnectionStateReasonCode
     */

    public VpcPeeringConnectionStateReason withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     * 
     * @param code
     *        The status of the VPC peering connection.
     * @see VpcPeeringConnectionStateReasonCode
     */

    public void setCode(VpcPeeringConnectionStateReasonCode code) {
        withCode(code);
    }

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     * 
     * @param code
     *        The status of the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcPeeringConnectionStateReasonCode
     */

    public VpcPeeringConnectionStateReason withCode(VpcPeeringConnectionStateReasonCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * A message that provides more information about the status, if applicable.
     * </p>
     * 
     * @param message
     *        A message that provides more information about the status, if applicable.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that provides more information about the status, if applicable.
     * </p>
     * 
     * @return A message that provides more information about the status, if applicable.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that provides more information about the status, if applicable.
     * </p>
     * 
     * @param message
     *        A message that provides more information about the status, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnectionStateReason withMessage(String message) {
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

        if (obj instanceof VpcPeeringConnectionStateReason == false)
            return false;
        VpcPeeringConnectionStateReason other = (VpcPeeringConnectionStateReason) obj;
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
    public VpcPeeringConnectionStateReason clone() {
        try {
            return (VpcPeeringConnectionStateReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
