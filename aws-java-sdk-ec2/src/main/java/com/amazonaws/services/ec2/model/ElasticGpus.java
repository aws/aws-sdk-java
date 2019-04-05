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
 * Describes an Elastic Graphics accelerator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ElasticGpus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticGpus implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     */
    private String elasticGpuId;
    /**
     * <p>
     * The Availability Zone in the which the Elastic Graphics accelerator resides.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     */
    private String elasticGpuType;
    /**
     * <p>
     * The status of the Elastic Graphics accelerator.
     * </p>
     */
    private ElasticGpuHealth elasticGpuHealth;
    /**
     * <p>
     * The state of the Elastic Graphics accelerator.
     * </p>
     */
    private String elasticGpuState;
    /**
     * <p>
     * The ID of the instance to which the Elastic Graphics accelerator is attached.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     * 
     * @param elasticGpuId
     *        The ID of the Elastic Graphics accelerator.
     */

    public void setElasticGpuId(String elasticGpuId) {
        this.elasticGpuId = elasticGpuId;
    }

    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     * 
     * @return The ID of the Elastic Graphics accelerator.
     */

    public String getElasticGpuId() {
        return this.elasticGpuId;
    }

    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     * 
     * @param elasticGpuId
     *        The ID of the Elastic Graphics accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticGpus withElasticGpuId(String elasticGpuId) {
        setElasticGpuId(elasticGpuId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in the which the Elastic Graphics accelerator resides.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in the which the Elastic Graphics accelerator resides.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in the which the Elastic Graphics accelerator resides.
     * </p>
     * 
     * @return The Availability Zone in the which the Elastic Graphics accelerator resides.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in the which the Elastic Graphics accelerator resides.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in the which the Elastic Graphics accelerator resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticGpus withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     * 
     * @param elasticGpuType
     *        The type of Elastic Graphics accelerator.
     */

    public void setElasticGpuType(String elasticGpuType) {
        this.elasticGpuType = elasticGpuType;
    }

    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     * 
     * @return The type of Elastic Graphics accelerator.
     */

    public String getElasticGpuType() {
        return this.elasticGpuType;
    }

    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     * 
     * @param elasticGpuType
     *        The type of Elastic Graphics accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticGpus withElasticGpuType(String elasticGpuType) {
        setElasticGpuType(elasticGpuType);
        return this;
    }

    /**
     * <p>
     * The status of the Elastic Graphics accelerator.
     * </p>
     * 
     * @param elasticGpuHealth
     *        The status of the Elastic Graphics accelerator.
     */

    public void setElasticGpuHealth(ElasticGpuHealth elasticGpuHealth) {
        this.elasticGpuHealth = elasticGpuHealth;
    }

    /**
     * <p>
     * The status of the Elastic Graphics accelerator.
     * </p>
     * 
     * @return The status of the Elastic Graphics accelerator.
     */

    public ElasticGpuHealth getElasticGpuHealth() {
        return this.elasticGpuHealth;
    }

    /**
     * <p>
     * The status of the Elastic Graphics accelerator.
     * </p>
     * 
     * @param elasticGpuHealth
     *        The status of the Elastic Graphics accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticGpus withElasticGpuHealth(ElasticGpuHealth elasticGpuHealth) {
        setElasticGpuHealth(elasticGpuHealth);
        return this;
    }

    /**
     * <p>
     * The state of the Elastic Graphics accelerator.
     * </p>
     * 
     * @param elasticGpuState
     *        The state of the Elastic Graphics accelerator.
     * @see ElasticGpuState
     */

    public void setElasticGpuState(String elasticGpuState) {
        this.elasticGpuState = elasticGpuState;
    }

    /**
     * <p>
     * The state of the Elastic Graphics accelerator.
     * </p>
     * 
     * @return The state of the Elastic Graphics accelerator.
     * @see ElasticGpuState
     */

    public String getElasticGpuState() {
        return this.elasticGpuState;
    }

    /**
     * <p>
     * The state of the Elastic Graphics accelerator.
     * </p>
     * 
     * @param elasticGpuState
     *        The state of the Elastic Graphics accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticGpuState
     */

    public ElasticGpus withElasticGpuState(String elasticGpuState) {
        setElasticGpuState(elasticGpuState);
        return this;
    }

    /**
     * <p>
     * The state of the Elastic Graphics accelerator.
     * </p>
     * 
     * @param elasticGpuState
     *        The state of the Elastic Graphics accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticGpuState
     */

    public ElasticGpus withElasticGpuState(ElasticGpuState elasticGpuState) {
        this.elasticGpuState = elasticGpuState.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the instance to which the Elastic Graphics accelerator is attached.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance to which the Elastic Graphics accelerator is attached.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance to which the Elastic Graphics accelerator is attached.
     * </p>
     * 
     * @return The ID of the instance to which the Elastic Graphics accelerator is attached.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance to which the Elastic Graphics accelerator is attached.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance to which the Elastic Graphics accelerator is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticGpus withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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
        if (getElasticGpuId() != null)
            sb.append("ElasticGpuId: ").append(getElasticGpuId()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getElasticGpuType() != null)
            sb.append("ElasticGpuType: ").append(getElasticGpuType()).append(",");
        if (getElasticGpuHealth() != null)
            sb.append("ElasticGpuHealth: ").append(getElasticGpuHealth()).append(",");
        if (getElasticGpuState() != null)
            sb.append("ElasticGpuState: ").append(getElasticGpuState()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticGpus == false)
            return false;
        ElasticGpus other = (ElasticGpus) obj;
        if (other.getElasticGpuId() == null ^ this.getElasticGpuId() == null)
            return false;
        if (other.getElasticGpuId() != null && other.getElasticGpuId().equals(this.getElasticGpuId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getElasticGpuType() == null ^ this.getElasticGpuType() == null)
            return false;
        if (other.getElasticGpuType() != null && other.getElasticGpuType().equals(this.getElasticGpuType()) == false)
            return false;
        if (other.getElasticGpuHealth() == null ^ this.getElasticGpuHealth() == null)
            return false;
        if (other.getElasticGpuHealth() != null && other.getElasticGpuHealth().equals(this.getElasticGpuHealth()) == false)
            return false;
        if (other.getElasticGpuState() == null ^ this.getElasticGpuState() == null)
            return false;
        if (other.getElasticGpuState() != null && other.getElasticGpuState().equals(this.getElasticGpuState()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElasticGpuId() == null) ? 0 : getElasticGpuId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getElasticGpuType() == null) ? 0 : getElasticGpuType().hashCode());
        hashCode = prime * hashCode + ((getElasticGpuHealth() == null) ? 0 : getElasticGpuHealth().hashCode());
        hashCode = prime * hashCode + ((getElasticGpuState() == null) ? 0 : getElasticGpuState().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public ElasticGpus clone() {
        try {
            return (ElasticGpus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
