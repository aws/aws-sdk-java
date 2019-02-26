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
 * Describes the state of a CIDR block.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SubnetCidrBlockState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubnetCidrBlockState implements Serializable, Cloneable {

    /**
     * <p>
     * The state of a CIDR block.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A message about the status of the CIDR block, if applicable.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The state of a CIDR block.
     * </p>
     * 
     * @param state
     *        The state of a CIDR block.
     * @see SubnetCidrBlockStateCode
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of a CIDR block.
     * </p>
     * 
     * @return The state of a CIDR block.
     * @see SubnetCidrBlockStateCode
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of a CIDR block.
     * </p>
     * 
     * @param state
     *        The state of a CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubnetCidrBlockStateCode
     */

    public SubnetCidrBlockState withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of a CIDR block.
     * </p>
     * 
     * @param state
     *        The state of a CIDR block.
     * @see SubnetCidrBlockStateCode
     */

    public void setState(SubnetCidrBlockStateCode state) {
        withState(state);
    }

    /**
     * <p>
     * The state of a CIDR block.
     * </p>
     * 
     * @param state
     *        The state of a CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubnetCidrBlockStateCode
     */

    public SubnetCidrBlockState withState(SubnetCidrBlockStateCode state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A message about the status of the CIDR block, if applicable.
     * </p>
     * 
     * @param statusMessage
     *        A message about the status of the CIDR block, if applicable.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message about the status of the CIDR block, if applicable.
     * </p>
     * 
     * @return A message about the status of the CIDR block, if applicable.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message about the status of the CIDR block, if applicable.
     * </p>
     * 
     * @param statusMessage
     *        A message about the status of the CIDR block, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetCidrBlockState withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubnetCidrBlockState == false)
            return false;
        SubnetCidrBlockState other = (SubnetCidrBlockState) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public SubnetCidrBlockState clone() {
        try {
            return (SubnetCidrBlockState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
