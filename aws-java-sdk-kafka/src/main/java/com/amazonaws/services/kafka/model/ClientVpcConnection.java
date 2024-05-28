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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * The client VPC connection object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ClientVpcConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientVpcConnection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the auth scheme of Vpc Connection.
     * </p>
     */
    private String authentication;
    /**
     * <p>
     * Creation time of the Vpc Connection.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * State of the Vpc Connection.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The ARN that identifies the Vpc Connection.
     * </p>
     */
    private String vpcConnectionArn;
    /**
     * <p>
     * The Owner of the Vpc Connection.
     * </p>
     */
    private String owner;

    /**
     * <p>
     * Information about the auth scheme of Vpc Connection.
     * </p>
     * 
     * @param authentication
     *        <p>
     *        Information about the auth scheme of Vpc Connection.
     *        </p>
     */

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    /**
     * <p>
     * Information about the auth scheme of Vpc Connection.
     * </p>
     * 
     * @return <p>
     *         Information about the auth scheme of Vpc Connection.
     *         </p>
     */

    public String getAuthentication() {
        return this.authentication;
    }

    /**
     * <p>
     * Information about the auth scheme of Vpc Connection.
     * </p>
     * 
     * @param authentication
     *        <p>
     *        Information about the auth scheme of Vpc Connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpcConnection withAuthentication(String authentication) {
        setAuthentication(authentication);
        return this;
    }

    /**
     * <p>
     * Creation time of the Vpc Connection.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        Creation time of the Vpc Connection.
     *        </p>
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Creation time of the Vpc Connection.
     * </p>
     * 
     * @return <p>
     *         Creation time of the Vpc Connection.
     *         </p>
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Creation time of the Vpc Connection.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        Creation time of the Vpc Connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpcConnection withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * State of the Vpc Connection.
     * </p>
     * 
     * @param state
     *        <p>
     *        State of the Vpc Connection.
     *        </p>
     * @see VpcConnectionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * State of the Vpc Connection.
     * </p>
     * 
     * @return <p>
     *         State of the Vpc Connection.
     *         </p>
     * @see VpcConnectionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * State of the Vpc Connection.
     * </p>
     * 
     * @param state
     *        <p>
     *        State of the Vpc Connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcConnectionState
     */

    public ClientVpcConnection withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * State of the Vpc Connection.
     * </p>
     * 
     * @param state
     *        <p>
     *        State of the Vpc Connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcConnectionState
     */

    public ClientVpcConnection withState(VpcConnectionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ARN that identifies the Vpc Connection.
     * </p>
     * 
     * @param vpcConnectionArn
     *        <p>
     *        The ARN that identifies the Vpc Connection.
     *        </p>
     */

    public void setVpcConnectionArn(String vpcConnectionArn) {
        this.vpcConnectionArn = vpcConnectionArn;
    }

    /**
     * <p>
     * The ARN that identifies the Vpc Connection.
     * </p>
     * 
     * @return <p>
     *         The ARN that identifies the Vpc Connection.
     *         </p>
     */

    public String getVpcConnectionArn() {
        return this.vpcConnectionArn;
    }

    /**
     * <p>
     * The ARN that identifies the Vpc Connection.
     * </p>
     * 
     * @param vpcConnectionArn
     *        <p>
     *        The ARN that identifies the Vpc Connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpcConnection withVpcConnectionArn(String vpcConnectionArn) {
        setVpcConnectionArn(vpcConnectionArn);
        return this;
    }

    /**
     * <p>
     * The Owner of the Vpc Connection.
     * </p>
     * 
     * @param owner
     *        <p>
     *        The Owner of the Vpc Connection.
     *        </p>
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The Owner of the Vpc Connection.
     * </p>
     * 
     * @return <p>
     *         The Owner of the Vpc Connection.
     *         </p>
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The Owner of the Vpc Connection.
     * </p>
     * 
     * @param owner
     *        <p>
     *        The Owner of the Vpc Connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpcConnection withOwner(String owner) {
        setOwner(owner);
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
        if (getAuthentication() != null)
            sb.append("Authentication: ").append(getAuthentication()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getVpcConnectionArn() != null)
            sb.append("VpcConnectionArn: ").append(getVpcConnectionArn()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientVpcConnection == false)
            return false;
        ClientVpcConnection other = (ClientVpcConnection) obj;
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null && other.getAuthentication().equals(this.getAuthentication()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVpcConnectionArn() == null ^ this.getVpcConnectionArn() == null)
            return false;
        if (other.getVpcConnectionArn() != null && other.getVpcConnectionArn().equals(this.getVpcConnectionArn()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVpcConnectionArn() == null) ? 0 : getVpcConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public ClientVpcConnection clone() {
        try {
            return (ClientVpcConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ClientVpcConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
