/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A cross account destination that is the recipient of subscription log events.
 * </p>
 */
public class Destination implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the destination.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * ARN of the physical target where the log events will be delivered (eg. ARN of a Kinesis stream).
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * A role for impersonation for delivering log events to the target.
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
     * ARN of this destination.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC specifying when this
     * destination was created.
     * </p>
     */
    private Long creationTime;

    /**
     * <p>
     * Name of the destination.
     * </p>
     * 
     * @param destinationName
     *        Name of the destination.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * Name of the destination.
     * </p>
     * 
     * @return Name of the destination.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * Name of the destination.
     * </p>
     * 
     * @param destinationName
     *        Name of the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * ARN of the physical target where the log events will be delivered (eg. ARN of a Kinesis stream).
     * </p>
     * 
     * @param targetArn
     *        ARN of the physical target where the log events will be delivered (eg. ARN of a Kinesis stream).
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * ARN of the physical target where the log events will be delivered (eg. ARN of a Kinesis stream).
     * </p>
     * 
     * @return ARN of the physical target where the log events will be delivered (eg. ARN of a Kinesis stream).
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * ARN of the physical target where the log events will be delivered (eg. ARN of a Kinesis stream).
     * </p>
     * 
     * @param targetArn
     *        ARN of the physical target where the log events will be delivered (eg. ARN of a Kinesis stream).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * A role for impersonation for delivering log events to the target.
     * </p>
     * 
     * @param roleArn
     *        A role for impersonation for delivering log events to the target.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * A role for impersonation for delivering log events to the target.
     * </p>
     * 
     * @return A role for impersonation for delivering log events to the target.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * A role for impersonation for delivering log events to the target.
     * </p>
     * 
     * @param roleArn
     *        A role for impersonation for delivering log events to the target.
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
     * ARN of this destination.
     * </p>
     * 
     * @param arn
     *        ARN of this destination.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN of this destination.
     * </p>
     * 
     * @return ARN of this destination.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * ARN of this destination.
     * </p>
     * 
     * @param arn
     *        ARN of this destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC specifying when this
     * destination was created.
     * </p>
     * 
     * @param creationTime
     *        A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC specifying when
     *        this destination was created.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC specifying when this
     * destination was created.
     * </p>
     * 
     * @return A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC specifying when
     *         this destination was created.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC specifying when this
     * destination was created.
     * </p>
     * 
     * @param creationTime
     *        A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC specifying when
     *        this destination was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DestinationName: " + getDestinationName() + ",");
        if (getTargetArn() != null)
            sb.append("TargetArn: " + getTargetArn() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getAccessPolicy() != null)
            sb.append("AccessPolicy: " + getAccessPolicy() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime());
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
}
