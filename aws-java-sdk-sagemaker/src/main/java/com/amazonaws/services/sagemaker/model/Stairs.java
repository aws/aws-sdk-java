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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the stairs traffic pattern for an Inference Recommender load test. This pattern type consists of multiple
 * steps where the number of users increases at each step.
 * </p>
 * <p>
 * Specify either the stairs or phases traffic pattern.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Stairs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Stairs implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines how long each traffic step should be.
     * </p>
     */
    private Integer durationInSeconds;
    /**
     * <p>
     * Specifies how many steps to perform during traffic.
     * </p>
     */
    private Integer numberOfSteps;
    /**
     * <p>
     * Specifies how many new users to spawn in each step.
     * </p>
     */
    private Integer usersPerStep;

    /**
     * <p>
     * Defines how long each traffic step should be.
     * </p>
     * 
     * @param durationInSeconds
     *        Defines how long each traffic step should be.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * Defines how long each traffic step should be.
     * </p>
     * 
     * @return Defines how long each traffic step should be.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * Defines how long each traffic step should be.
     * </p>
     * 
     * @param durationInSeconds
     *        Defines how long each traffic step should be.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stairs withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * Specifies how many steps to perform during traffic.
     * </p>
     * 
     * @param numberOfSteps
     *        Specifies how many steps to perform during traffic.
     */

    public void setNumberOfSteps(Integer numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    /**
     * <p>
     * Specifies how many steps to perform during traffic.
     * </p>
     * 
     * @return Specifies how many steps to perform during traffic.
     */

    public Integer getNumberOfSteps() {
        return this.numberOfSteps;
    }

    /**
     * <p>
     * Specifies how many steps to perform during traffic.
     * </p>
     * 
     * @param numberOfSteps
     *        Specifies how many steps to perform during traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stairs withNumberOfSteps(Integer numberOfSteps) {
        setNumberOfSteps(numberOfSteps);
        return this;
    }

    /**
     * <p>
     * Specifies how many new users to spawn in each step.
     * </p>
     * 
     * @param usersPerStep
     *        Specifies how many new users to spawn in each step.
     */

    public void setUsersPerStep(Integer usersPerStep) {
        this.usersPerStep = usersPerStep;
    }

    /**
     * <p>
     * Specifies how many new users to spawn in each step.
     * </p>
     * 
     * @return Specifies how many new users to spawn in each step.
     */

    public Integer getUsersPerStep() {
        return this.usersPerStep;
    }

    /**
     * <p>
     * Specifies how many new users to spawn in each step.
     * </p>
     * 
     * @param usersPerStep
     *        Specifies how many new users to spawn in each step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stairs withUsersPerStep(Integer usersPerStep) {
        setUsersPerStep(usersPerStep);
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
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds()).append(",");
        if (getNumberOfSteps() != null)
            sb.append("NumberOfSteps: ").append(getNumberOfSteps()).append(",");
        if (getUsersPerStep() != null)
            sb.append("UsersPerStep: ").append(getUsersPerStep());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Stairs == false)
            return false;
        Stairs other = (Stairs) obj;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        if (other.getNumberOfSteps() == null ^ this.getNumberOfSteps() == null)
            return false;
        if (other.getNumberOfSteps() != null && other.getNumberOfSteps().equals(this.getNumberOfSteps()) == false)
            return false;
        if (other.getUsersPerStep() == null ^ this.getUsersPerStep() == null)
            return false;
        if (other.getUsersPerStep() != null && other.getUsersPerStep().equals(this.getUsersPerStep()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getNumberOfSteps() == null) ? 0 : getNumberOfSteps().hashCode());
        hashCode = prime * hashCode + ((getUsersPerStep() == null) ? 0 : getUsersPerStep().hashCode());
        return hashCode;
    }

    @Override
    public Stairs clone() {
        try {
            return (Stairs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.StairsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
