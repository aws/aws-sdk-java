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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a cross-account destination that receives subscription log events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the destination.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the physical target to where the log events are delivered (for example, a
     * Kinesis stream).
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * A role for impersonation, used when delivering log events to the target.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An IAM policy document that governs which AWS accounts can create subscription filters against this destination.
     * </p>
     */
    private String accessPolicy;
    /**
     * <p>
     * The ARN of this destination.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     */
    private Long creationTime;

    /**
     * <p>
     * The name of the destination.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of the destination.
     * </p>
     * 
     * @return The name of the destination.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The name of the destination.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the physical target to where the log events are delivered (for example, a
     * Kinesis stream).
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of the physical target to where the log events are delivered (for example,
     *        a Kinesis stream).
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the physical target to where the log events are delivered (for example, a
     * Kinesis stream).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the physical target to where the log events are delivered (for example,
     *         a Kinesis stream).
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the physical target to where the log events are delivered (for example, a
     * Kinesis stream).
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of the physical target to where the log events are delivered (for example,
     *        a Kinesis stream).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * A role for impersonation, used when delivering log events to the target.
     * </p>
     * 
     * @param roleArn
     *        A role for impersonation, used when delivering log events to the target.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * A role for impersonation, used when delivering log events to the target.
     * </p>
     * 
     * @return A role for impersonation, used when delivering log events to the target.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * A role for impersonation, used when delivering log events to the target.
     * </p>
     * 
     * @param roleArn
     *        A role for impersonation, used when delivering log events to the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An IAM policy document that governs which AWS accounts can create subscription filters against this destination.
     * </p>
     * 
     * @param accessPolicy
     *        An IAM policy document that governs which AWS accounts can create subscription filters against this
     *        destination.
     */

    public void setAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    /**
     * <p>
     * An IAM policy document that governs which AWS accounts can create subscription filters against this destination.
     * </p>
     * 
     * @return An IAM policy document that governs which AWS accounts can create subscription filters against this
     *         destination.
     */

    public String getAccessPolicy() {
        return this.accessPolicy;
    }

    /**
     * <p>
     * An IAM policy document that governs which AWS accounts can create subscription filters against this destination.
     * </p>
     * 
     * @param accessPolicy
     *        An IAM policy document that governs which AWS accounts can create subscription filters against this
     *        destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withAccessPolicy(String accessPolicy) {
        setAccessPolicy(accessPolicy);
        return this;
    }

    /**
     * <p>
     * The ARN of this destination.
     * </p>
     * 
     * @param arn
     *        The ARN of this destination.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of this destination.
     * </p>
     * 
     * @return The ARN of this destination.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of this destination.
     * </p>
     * 
     * @param arn
     *        The ARN of this destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     *        UTC.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @return The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     *         UTC.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00
     *        UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
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
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getAccessPolicy() != null)
            sb.append("AccessPolicy: ").append(getAccessPolicy()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAccessPolicy() == null ^ this.getAccessPolicy() == null)
            return false;
        if (other.getAccessPolicy() != null && other.getAccessPolicy().equals(this.getAccessPolicy()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicy() == null) ? 0 : getAccessPolicy().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public Destination clone() {
        try {
            return (Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
