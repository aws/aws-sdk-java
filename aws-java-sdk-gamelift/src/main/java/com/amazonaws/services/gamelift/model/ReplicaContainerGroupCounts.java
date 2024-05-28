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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>This data type is used with the Amazon GameLift containers feature, which is currently in public preview.</b>
 * </p>
 * <p>
 * The number and status of replica container groups that are deployed across a fleet with compute type
 * <code>CONTAINER</code>. This information, combined with the number of server processes being hosted per container
 * group (see <code>RuntimeConfiguration</code>), tells you how many game sessions the fleet is currently capable of
 * hosting concurrently.
 * </p>
 * <p>
 * <b>Returned by:</b> <a>DescribeFleetCapacity</a>, <a>DescribeFleetLocationCapacity</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ReplicaContainerGroupCounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaContainerGroupCounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of container groups that are starting up but have not yet registered.
     * </p>
     */
    private Integer pENDING;
    /**
     * <p>
     * The number of container groups that have active game sessions.
     * </p>
     */
    private Integer aCTIVE;
    /**
     * <p>
     * The number of container groups that have no active game sessions.
     * </p>
     */
    private Integer iDLE;
    /**
     * <p>
     * The number of container groups that are in the process of shutting down.
     * </p>
     */
    private Integer tERMINATING;

    /**
     * <p>
     * The number of container groups that are starting up but have not yet registered.
     * </p>
     * 
     * @param pENDING
     *        The number of container groups that are starting up but have not yet registered.
     */

    public void setPENDING(Integer pENDING) {
        this.pENDING = pENDING;
    }

    /**
     * <p>
     * The number of container groups that are starting up but have not yet registered.
     * </p>
     * 
     * @return The number of container groups that are starting up but have not yet registered.
     */

    public Integer getPENDING() {
        return this.pENDING;
    }

    /**
     * <p>
     * The number of container groups that are starting up but have not yet registered.
     * </p>
     * 
     * @param pENDING
     *        The number of container groups that are starting up but have not yet registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaContainerGroupCounts withPENDING(Integer pENDING) {
        setPENDING(pENDING);
        return this;
    }

    /**
     * <p>
     * The number of container groups that have active game sessions.
     * </p>
     * 
     * @param aCTIVE
     *        The number of container groups that have active game sessions.
     */

    public void setACTIVE(Integer aCTIVE) {
        this.aCTIVE = aCTIVE;
    }

    /**
     * <p>
     * The number of container groups that have active game sessions.
     * </p>
     * 
     * @return The number of container groups that have active game sessions.
     */

    public Integer getACTIVE() {
        return this.aCTIVE;
    }

    /**
     * <p>
     * The number of container groups that have active game sessions.
     * </p>
     * 
     * @param aCTIVE
     *        The number of container groups that have active game sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaContainerGroupCounts withACTIVE(Integer aCTIVE) {
        setACTIVE(aCTIVE);
        return this;
    }

    /**
     * <p>
     * The number of container groups that have no active game sessions.
     * </p>
     * 
     * @param iDLE
     *        The number of container groups that have no active game sessions.
     */

    public void setIDLE(Integer iDLE) {
        this.iDLE = iDLE;
    }

    /**
     * <p>
     * The number of container groups that have no active game sessions.
     * </p>
     * 
     * @return The number of container groups that have no active game sessions.
     */

    public Integer getIDLE() {
        return this.iDLE;
    }

    /**
     * <p>
     * The number of container groups that have no active game sessions.
     * </p>
     * 
     * @param iDLE
     *        The number of container groups that have no active game sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaContainerGroupCounts withIDLE(Integer iDLE) {
        setIDLE(iDLE);
        return this;
    }

    /**
     * <p>
     * The number of container groups that are in the process of shutting down.
     * </p>
     * 
     * @param tERMINATING
     *        The number of container groups that are in the process of shutting down.
     */

    public void setTERMINATING(Integer tERMINATING) {
        this.tERMINATING = tERMINATING;
    }

    /**
     * <p>
     * The number of container groups that are in the process of shutting down.
     * </p>
     * 
     * @return The number of container groups that are in the process of shutting down.
     */

    public Integer getTERMINATING() {
        return this.tERMINATING;
    }

    /**
     * <p>
     * The number of container groups that are in the process of shutting down.
     * </p>
     * 
     * @param tERMINATING
     *        The number of container groups that are in the process of shutting down.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaContainerGroupCounts withTERMINATING(Integer tERMINATING) {
        setTERMINATING(tERMINATING);
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
        if (getPENDING() != null)
            sb.append("PENDING: ").append(getPENDING()).append(",");
        if (getACTIVE() != null)
            sb.append("ACTIVE: ").append(getACTIVE()).append(",");
        if (getIDLE() != null)
            sb.append("IDLE: ").append(getIDLE()).append(",");
        if (getTERMINATING() != null)
            sb.append("TERMINATING: ").append(getTERMINATING());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaContainerGroupCounts == false)
            return false;
        ReplicaContainerGroupCounts other = (ReplicaContainerGroupCounts) obj;
        if (other.getPENDING() == null ^ this.getPENDING() == null)
            return false;
        if (other.getPENDING() != null && other.getPENDING().equals(this.getPENDING()) == false)
            return false;
        if (other.getACTIVE() == null ^ this.getACTIVE() == null)
            return false;
        if (other.getACTIVE() != null && other.getACTIVE().equals(this.getACTIVE()) == false)
            return false;
        if (other.getIDLE() == null ^ this.getIDLE() == null)
            return false;
        if (other.getIDLE() != null && other.getIDLE().equals(this.getIDLE()) == false)
            return false;
        if (other.getTERMINATING() == null ^ this.getTERMINATING() == null)
            return false;
        if (other.getTERMINATING() != null && other.getTERMINATING().equals(this.getTERMINATING()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPENDING() == null) ? 0 : getPENDING().hashCode());
        hashCode = prime * hashCode + ((getACTIVE() == null) ? 0 : getACTIVE().hashCode());
        hashCode = prime * hashCode + ((getIDLE() == null) ? 0 : getIDLE().hashCode());
        hashCode = prime * hashCode + ((getTERMINATING() == null) ? 0 : getTERMINATING().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaContainerGroupCounts clone() {
        try {
            return (ReplicaContainerGroupCounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ReplicaContainerGroupCountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
