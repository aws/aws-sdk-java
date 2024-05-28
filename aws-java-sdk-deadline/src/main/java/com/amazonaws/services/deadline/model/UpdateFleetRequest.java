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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The fleet configuration to update.
     * </p>
     */
    private FleetConfiguration configuration;
    /**
     * <p>
     * The description of the fleet to update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the fleet to update.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The farm ID to update.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The fleet ID to update.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The maximum number of workers in the fleet.
     * </p>
     */
    private Integer maxWorkerCount;
    /**
     * <p>
     * The minimum number of workers in the fleet.
     * </p>
     */
    private Integer minWorkerCount;
    /**
     * <p>
     * The IAM role ARN that the fleet's workers assume while running jobs.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @return The unique token which the server uses to recognize retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The fleet configuration to update.
     * </p>
     * 
     * @param configuration
     *        The fleet configuration to update.
     */

    public void setConfiguration(FleetConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The fleet configuration to update.
     * </p>
     * 
     * @return The fleet configuration to update.
     */

    public FleetConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The fleet configuration to update.
     * </p>
     * 
     * @param configuration
     *        The fleet configuration to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withConfiguration(FleetConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The description of the fleet to update.
     * </p>
     * 
     * @param description
     *        The description of the fleet to update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the fleet to update.
     * </p>
     * 
     * @return The description of the fleet to update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the fleet to update.
     * </p>
     * 
     * @param description
     *        The description of the fleet to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the fleet to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the fleet to update.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the fleet to update.
     * </p>
     * 
     * @return The display name of the fleet to update.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the fleet to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the fleet to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @return The farm ID to update.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The fleet ID to update.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID to update.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The fleet ID to update.
     * </p>
     * 
     * @return The fleet ID to update.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The fleet ID to update.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The maximum number of workers in the fleet.
     * </p>
     * 
     * @param maxWorkerCount
     *        The maximum number of workers in the fleet.
     */

    public void setMaxWorkerCount(Integer maxWorkerCount) {
        this.maxWorkerCount = maxWorkerCount;
    }

    /**
     * <p>
     * The maximum number of workers in the fleet.
     * </p>
     * 
     * @return The maximum number of workers in the fleet.
     */

    public Integer getMaxWorkerCount() {
        return this.maxWorkerCount;
    }

    /**
     * <p>
     * The maximum number of workers in the fleet.
     * </p>
     * 
     * @param maxWorkerCount
     *        The maximum number of workers in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withMaxWorkerCount(Integer maxWorkerCount) {
        setMaxWorkerCount(maxWorkerCount);
        return this;
    }

    /**
     * <p>
     * The minimum number of workers in the fleet.
     * </p>
     * 
     * @param minWorkerCount
     *        The minimum number of workers in the fleet.
     */

    public void setMinWorkerCount(Integer minWorkerCount) {
        this.minWorkerCount = minWorkerCount;
    }

    /**
     * <p>
     * The minimum number of workers in the fleet.
     * </p>
     * 
     * @return The minimum number of workers in the fleet.
     */

    public Integer getMinWorkerCount() {
        return this.minWorkerCount;
    }

    /**
     * <p>
     * The minimum number of workers in the fleet.
     * </p>
     * 
     * @param minWorkerCount
     *        The minimum number of workers in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withMinWorkerCount(Integer minWorkerCount) {
        setMinWorkerCount(minWorkerCount);
        return this;
    }

    /**
     * <p>
     * The IAM role ARN that the fleet's workers assume while running jobs.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN that the fleet's workers assume while running jobs.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that the fleet's workers assume while running jobs.
     * </p>
     * 
     * @return The IAM role ARN that the fleet's workers assume while running jobs.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that the fleet's workers assume while running jobs.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN that the fleet's workers assume while running jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getMaxWorkerCount() != null)
            sb.append("MaxWorkerCount: ").append(getMaxWorkerCount()).append(",");
        if (getMinWorkerCount() != null)
            sb.append("MinWorkerCount: ").append(getMinWorkerCount()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetRequest == false)
            return false;
        UpdateFleetRequest other = (UpdateFleetRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getMaxWorkerCount() == null ^ this.getMaxWorkerCount() == null)
            return false;
        if (other.getMaxWorkerCount() != null && other.getMaxWorkerCount().equals(this.getMaxWorkerCount()) == false)
            return false;
        if (other.getMinWorkerCount() == null ^ this.getMinWorkerCount() == null)
            return false;
        if (other.getMinWorkerCount() != null && other.getMinWorkerCount().equals(this.getMinWorkerCount()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getMaxWorkerCount() == null) ? 0 : getMaxWorkerCount().hashCode());
        hashCode = prime * hashCode + ((getMinWorkerCount() == null) ? 0 : getMinWorkerCount().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetRequest clone() {
        return (UpdateFleetRequest) super.clone();
    }

}
