/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of data about the simulation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/SimulationMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulationMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The name of the simulation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the simulation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The desired status of the simulation.
     * </p>
     */
    private String targetStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationMetadata withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     * 
     * @param creationTime
     *        The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since
     *        the Unix epoch (0:0:0.000, January 1, 1970).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     * 
     * @return The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC
     *         since the Unix epoch (0:0:0.000, January 1, 1970).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     * 
     * @param creationTime
     *        The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since
     *        the Unix epoch (0:0:0.000, January 1, 1970).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationMetadata withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @param name
     *        The name of the simulation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @return The name of the simulation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @param name
     *        The name of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the simulation.
     * </p>
     * 
     * @param status
     *        The current status of the simulation.
     * @see SimulationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the simulation.
     * </p>
     * 
     * @return The current status of the simulation.
     * @see SimulationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the simulation.
     * </p>
     * 
     * @param status
     *        The current status of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationStatus
     */

    public SimulationMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the simulation.
     * </p>
     * 
     * @param status
     *        The current status of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationStatus
     */

    public SimulationMetadata withStatus(SimulationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The desired status of the simulation.
     * </p>
     * 
     * @param targetStatus
     *        The desired status of the simulation.
     * @see SimulationTargetStatus
     */

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * <p>
     * The desired status of the simulation.
     * </p>
     * 
     * @return The desired status of the simulation.
     * @see SimulationTargetStatus
     */

    public String getTargetStatus() {
        return this.targetStatus;
    }

    /**
     * <p>
     * The desired status of the simulation.
     * </p>
     * 
     * @param targetStatus
     *        The desired status of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationTargetStatus
     */

    public SimulationMetadata withTargetStatus(String targetStatus) {
        setTargetStatus(targetStatus);
        return this;
    }

    /**
     * <p>
     * The desired status of the simulation.
     * </p>
     * 
     * @param targetStatus
     *        The desired status of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationTargetStatus
     */

    public SimulationMetadata withTargetStatus(SimulationTargetStatus targetStatus) {
        this.targetStatus = targetStatus.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTargetStatus() != null)
            sb.append("TargetStatus: ").append(getTargetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimulationMetadata == false)
            return false;
        SimulationMetadata other = (SimulationMetadata) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetStatus() == null ^ this.getTargetStatus() == null)
            return false;
        if (other.getTargetStatus() != null && other.getTargetStatus().equals(this.getTargetStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetStatus() == null) ? 0 : getTargetStatus().hashCode());
        return hashCode;
    }

    @Override
    public SimulationMetadata clone() {
        try {
            return (SimulationMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simspaceweaver.model.transform.SimulationMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
