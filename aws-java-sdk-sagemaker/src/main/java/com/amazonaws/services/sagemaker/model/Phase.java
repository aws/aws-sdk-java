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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the traffic pattern.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Phase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Phase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies how many concurrent users to start with.
     * </p>
     */
    private Integer initialNumberOfUsers;
    /**
     * <p>
     * Specified how many new users to spawn in a minute.
     * </p>
     */
    private Integer spawnRate;
    /**
     * <p>
     * Specifies how long traffic phase should be.
     * </p>
     */
    private Integer durationInSeconds;

    /**
     * <p>
     * Specifies how many concurrent users to start with.
     * </p>
     * 
     * @param initialNumberOfUsers
     *        Specifies how many concurrent users to start with.
     */

    public void setInitialNumberOfUsers(Integer initialNumberOfUsers) {
        this.initialNumberOfUsers = initialNumberOfUsers;
    }

    /**
     * <p>
     * Specifies how many concurrent users to start with.
     * </p>
     * 
     * @return Specifies how many concurrent users to start with.
     */

    public Integer getInitialNumberOfUsers() {
        return this.initialNumberOfUsers;
    }

    /**
     * <p>
     * Specifies how many concurrent users to start with.
     * </p>
     * 
     * @param initialNumberOfUsers
     *        Specifies how many concurrent users to start with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Phase withInitialNumberOfUsers(Integer initialNumberOfUsers) {
        setInitialNumberOfUsers(initialNumberOfUsers);
        return this;
    }

    /**
     * <p>
     * Specified how many new users to spawn in a minute.
     * </p>
     * 
     * @param spawnRate
     *        Specified how many new users to spawn in a minute.
     */

    public void setSpawnRate(Integer spawnRate) {
        this.spawnRate = spawnRate;
    }

    /**
     * <p>
     * Specified how many new users to spawn in a minute.
     * </p>
     * 
     * @return Specified how many new users to spawn in a minute.
     */

    public Integer getSpawnRate() {
        return this.spawnRate;
    }

    /**
     * <p>
     * Specified how many new users to spawn in a minute.
     * </p>
     * 
     * @param spawnRate
     *        Specified how many new users to spawn in a minute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Phase withSpawnRate(Integer spawnRate) {
        setSpawnRate(spawnRate);
        return this;
    }

    /**
     * <p>
     * Specifies how long traffic phase should be.
     * </p>
     * 
     * @param durationInSeconds
     *        Specifies how long traffic phase should be.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * Specifies how long traffic phase should be.
     * </p>
     * 
     * @return Specifies how long traffic phase should be.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * Specifies how long traffic phase should be.
     * </p>
     * 
     * @param durationInSeconds
     *        Specifies how long traffic phase should be.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Phase withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
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
        if (getInitialNumberOfUsers() != null)
            sb.append("InitialNumberOfUsers: ").append(getInitialNumberOfUsers()).append(",");
        if (getSpawnRate() != null)
            sb.append("SpawnRate: ").append(getSpawnRate()).append(",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Phase == false)
            return false;
        Phase other = (Phase) obj;
        if (other.getInitialNumberOfUsers() == null ^ this.getInitialNumberOfUsers() == null)
            return false;
        if (other.getInitialNumberOfUsers() != null && other.getInitialNumberOfUsers().equals(this.getInitialNumberOfUsers()) == false)
            return false;
        if (other.getSpawnRate() == null ^ this.getSpawnRate() == null)
            return false;
        if (other.getSpawnRate() != null && other.getSpawnRate().equals(this.getSpawnRate()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialNumberOfUsers() == null) ? 0 : getInitialNumberOfUsers().hashCode());
        hashCode = prime * hashCode + ((getSpawnRate() == null) ? 0 : getSpawnRate().hashCode());
        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public Phase clone() {
        try {
            return (Phase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PhaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
