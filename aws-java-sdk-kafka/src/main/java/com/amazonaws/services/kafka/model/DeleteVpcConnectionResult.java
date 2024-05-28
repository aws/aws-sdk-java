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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DeleteVpcConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVpcConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK VPC connection.
     * </p>
     */
    private String vpcConnectionArn;
    /**
     * <p>
     * The state of the VPC connection.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK VPC connection.
     * </p>
     * 
     * @param vpcConnectionArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies an MSK VPC connection.
     *        </p>
     */

    public void setVpcConnectionArn(String vpcConnectionArn) {
        this.vpcConnectionArn = vpcConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK VPC connection.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies an MSK VPC connection.
     *         </p>
     */

    public String getVpcConnectionArn() {
        return this.vpcConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK VPC connection.
     * </p>
     * 
     * @param vpcConnectionArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies an MSK VPC connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcConnectionResult withVpcConnectionArn(String vpcConnectionArn) {
        setVpcConnectionArn(vpcConnectionArn);
        return this;
    }

    /**
     * <p>
     * The state of the VPC connection.
     * </p>
     * 
     * @param state
     *        <p>
     *        The state of the VPC connection.
     *        </p>
     * @see VpcConnectionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the VPC connection.
     * </p>
     * 
     * @return <p>
     *         The state of the VPC connection.
     *         </p>
     * @see VpcConnectionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the VPC connection.
     * </p>
     * 
     * @param state
     *        <p>
     *        The state of the VPC connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcConnectionState
     */

    public DeleteVpcConnectionResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the VPC connection.
     * </p>
     * 
     * @param state
     *        <p>
     *        The state of the VPC connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcConnectionState
     */

    public DeleteVpcConnectionResult withState(VpcConnectionState state) {
        this.state = state.toString();
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
        if (getVpcConnectionArn() != null)
            sb.append("VpcConnectionArn: ").append(getVpcConnectionArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVpcConnectionResult == false)
            return false;
        DeleteVpcConnectionResult other = (DeleteVpcConnectionResult) obj;
        if (other.getVpcConnectionArn() == null ^ this.getVpcConnectionArn() == null)
            return false;
        if (other.getVpcConnectionArn() != null && other.getVpcConnectionArn().equals(this.getVpcConnectionArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcConnectionArn() == null) ? 0 : getVpcConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVpcConnectionResult clone() {
        try {
            return (DeleteVpcConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
