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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/SwitchoverBlueGreenDeployment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SwitchoverBlueGreenDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The blue/green deployment identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing blue/green deployment identifier.
     * </p>
     * </li>
     * </ul>
     */
    private String blueGreenDeploymentIdentifier;
    /**
     * <p>
     * The amount of time, in seconds, for the switchover to complete. The default is 300.
     * </p>
     * <p>
     * If the switchover takes longer than the specified duration, then any changes are rolled back, and no changes are
     * made to the environments.
     * </p>
     */
    private Integer switchoverTimeout;

    /**
     * <p>
     * The blue/green deployment identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing blue/green deployment identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param blueGreenDeploymentIdentifier
     *        The blue/green deployment identifier.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match an existing blue/green deployment identifier.
     *        </p>
     *        </li>
     */

    public void setBlueGreenDeploymentIdentifier(String blueGreenDeploymentIdentifier) {
        this.blueGreenDeploymentIdentifier = blueGreenDeploymentIdentifier;
    }

    /**
     * <p>
     * The blue/green deployment identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing blue/green deployment identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The blue/green deployment identifier.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match an existing blue/green deployment identifier.
     *         </p>
     *         </li>
     */

    public String getBlueGreenDeploymentIdentifier() {
        return this.blueGreenDeploymentIdentifier;
    }

    /**
     * <p>
     * The blue/green deployment identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing blue/green deployment identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param blueGreenDeploymentIdentifier
     *        The blue/green deployment identifier.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match an existing blue/green deployment identifier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SwitchoverBlueGreenDeploymentRequest withBlueGreenDeploymentIdentifier(String blueGreenDeploymentIdentifier) {
        setBlueGreenDeploymentIdentifier(blueGreenDeploymentIdentifier);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, for the switchover to complete. The default is 300.
     * </p>
     * <p>
     * If the switchover takes longer than the specified duration, then any changes are rolled back, and no changes are
     * made to the environments.
     * </p>
     * 
     * @param switchoverTimeout
     *        The amount of time, in seconds, for the switchover to complete. The default is 300.</p>
     *        <p>
     *        If the switchover takes longer than the specified duration, then any changes are rolled back, and no
     *        changes are made to the environments.
     */

    public void setSwitchoverTimeout(Integer switchoverTimeout) {
        this.switchoverTimeout = switchoverTimeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, for the switchover to complete. The default is 300.
     * </p>
     * <p>
     * If the switchover takes longer than the specified duration, then any changes are rolled back, and no changes are
     * made to the environments.
     * </p>
     * 
     * @return The amount of time, in seconds, for the switchover to complete. The default is 300.</p>
     *         <p>
     *         If the switchover takes longer than the specified duration, then any changes are rolled back, and no
     *         changes are made to the environments.
     */

    public Integer getSwitchoverTimeout() {
        return this.switchoverTimeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, for the switchover to complete. The default is 300.
     * </p>
     * <p>
     * If the switchover takes longer than the specified duration, then any changes are rolled back, and no changes are
     * made to the environments.
     * </p>
     * 
     * @param switchoverTimeout
     *        The amount of time, in seconds, for the switchover to complete. The default is 300.</p>
     *        <p>
     *        If the switchover takes longer than the specified duration, then any changes are rolled back, and no
     *        changes are made to the environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SwitchoverBlueGreenDeploymentRequest withSwitchoverTimeout(Integer switchoverTimeout) {
        setSwitchoverTimeout(switchoverTimeout);
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
        if (getBlueGreenDeploymentIdentifier() != null)
            sb.append("BlueGreenDeploymentIdentifier: ").append(getBlueGreenDeploymentIdentifier()).append(",");
        if (getSwitchoverTimeout() != null)
            sb.append("SwitchoverTimeout: ").append(getSwitchoverTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SwitchoverBlueGreenDeploymentRequest == false)
            return false;
        SwitchoverBlueGreenDeploymentRequest other = (SwitchoverBlueGreenDeploymentRequest) obj;
        if (other.getBlueGreenDeploymentIdentifier() == null ^ this.getBlueGreenDeploymentIdentifier() == null)
            return false;
        if (other.getBlueGreenDeploymentIdentifier() != null
                && other.getBlueGreenDeploymentIdentifier().equals(this.getBlueGreenDeploymentIdentifier()) == false)
            return false;
        if (other.getSwitchoverTimeout() == null ^ this.getSwitchoverTimeout() == null)
            return false;
        if (other.getSwitchoverTimeout() != null && other.getSwitchoverTimeout().equals(this.getSwitchoverTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueGreenDeploymentIdentifier() == null) ? 0 : getBlueGreenDeploymentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSwitchoverTimeout() == null) ? 0 : getSwitchoverTimeout().hashCode());
        return hashCode;
    }

    @Override
    public SwitchoverBlueGreenDeploymentRequest clone() {
        return (SwitchoverBlueGreenDeploymentRequest) super.clone();
    }

}
