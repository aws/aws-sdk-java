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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/Fleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Fleet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the fleet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the fleet was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The status of the last fleet deployment.
     * </p>
     */
    private String lastDeploymentStatus;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the last deployment job.
     * </p>
     */
    private String lastDeploymentJob;
    /**
     * <p>
     * The time of the last deployment.
     * </p>
     */
    private java.util.Date lastDeploymentTime;

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param name
     *        The name of the fleet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @return The name of the fleet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param name
     *        The name of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the fleet.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the fleet.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the fleet was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the fleet was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the fleet was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the fleet was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the fleet was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the fleet was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The status of the last fleet deployment.
     * </p>
     * 
     * @param lastDeploymentStatus
     *        The status of the last fleet deployment.
     * @see DeploymentStatus
     */

    public void setLastDeploymentStatus(String lastDeploymentStatus) {
        this.lastDeploymentStatus = lastDeploymentStatus;
    }

    /**
     * <p>
     * The status of the last fleet deployment.
     * </p>
     * 
     * @return The status of the last fleet deployment.
     * @see DeploymentStatus
     */

    public String getLastDeploymentStatus() {
        return this.lastDeploymentStatus;
    }

    /**
     * <p>
     * The status of the last fleet deployment.
     * </p>
     * 
     * @param lastDeploymentStatus
     *        The status of the last fleet deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Fleet withLastDeploymentStatus(String lastDeploymentStatus) {
        setLastDeploymentStatus(lastDeploymentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the last fleet deployment.
     * </p>
     * 
     * @param lastDeploymentStatus
     *        The status of the last fleet deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Fleet withLastDeploymentStatus(DeploymentStatus lastDeploymentStatus) {
        this.lastDeploymentStatus = lastDeploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the last deployment job.
     * </p>
     * 
     * @param lastDeploymentJob
     *        The Amazon Resource Name (ARN) of the last deployment job.
     */

    public void setLastDeploymentJob(String lastDeploymentJob) {
        this.lastDeploymentJob = lastDeploymentJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the last deployment job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the last deployment job.
     */

    public String getLastDeploymentJob() {
        return this.lastDeploymentJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the last deployment job.
     * </p>
     * 
     * @param lastDeploymentJob
     *        The Amazon Resource Name (ARN) of the last deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withLastDeploymentJob(String lastDeploymentJob) {
        setLastDeploymentJob(lastDeploymentJob);
        return this;
    }

    /**
     * <p>
     * The time of the last deployment.
     * </p>
     * 
     * @param lastDeploymentTime
     *        The time of the last deployment.
     */

    public void setLastDeploymentTime(java.util.Date lastDeploymentTime) {
        this.lastDeploymentTime = lastDeploymentTime;
    }

    /**
     * <p>
     * The time of the last deployment.
     * </p>
     * 
     * @return The time of the last deployment.
     */

    public java.util.Date getLastDeploymentTime() {
        return this.lastDeploymentTime;
    }

    /**
     * <p>
     * The time of the last deployment.
     * </p>
     * 
     * @param lastDeploymentTime
     *        The time of the last deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withLastDeploymentTime(java.util.Date lastDeploymentTime) {
        setLastDeploymentTime(lastDeploymentTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastDeploymentStatus() != null)
            sb.append("LastDeploymentStatus: ").append(getLastDeploymentStatus()).append(",");
        if (getLastDeploymentJob() != null)
            sb.append("LastDeploymentJob: ").append(getLastDeploymentJob()).append(",");
        if (getLastDeploymentTime() != null)
            sb.append("LastDeploymentTime: ").append(getLastDeploymentTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Fleet == false)
            return false;
        Fleet other = (Fleet) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastDeploymentStatus() == null ^ this.getLastDeploymentStatus() == null)
            return false;
        if (other.getLastDeploymentStatus() != null && other.getLastDeploymentStatus().equals(this.getLastDeploymentStatus()) == false)
            return false;
        if (other.getLastDeploymentJob() == null ^ this.getLastDeploymentJob() == null)
            return false;
        if (other.getLastDeploymentJob() != null && other.getLastDeploymentJob().equals(this.getLastDeploymentJob()) == false)
            return false;
        if (other.getLastDeploymentTime() == null ^ this.getLastDeploymentTime() == null)
            return false;
        if (other.getLastDeploymentTime() != null && other.getLastDeploymentTime().equals(this.getLastDeploymentTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentStatus() == null) ? 0 : getLastDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentJob() == null) ? 0 : getLastDeploymentJob().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentTime() == null) ? 0 : getLastDeploymentTime().hashCode());
        return hashCode;
    }

    @Override
    public Fleet clone() {
        try {
            return (Fleet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.FleetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
