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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateFarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFarmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the farm to update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the farm to update.
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
     * The description of the farm to update.
     * </p>
     * 
     * @param description
     *        The description of the farm to update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the farm to update.
     * </p>
     * 
     * @return The description of the farm to update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the farm to update.
     * </p>
     * 
     * @param description
     *        The description of the farm to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFarmRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the farm to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the farm to update.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the farm to update.
     * </p>
     * 
     * @return The display name of the farm to update.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the farm to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the farm to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFarmRequest withDisplayName(String displayName) {
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

    public UpdateFarmRequest withFarmId(String farmId) {
        setFarmId(farmId);
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFarmRequest == false)
            return false;
        UpdateFarmRequest other = (UpdateFarmRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFarmRequest clone() {
        return (UpdateFarmRequest) super.clone();
    }

}
