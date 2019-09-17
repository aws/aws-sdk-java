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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateFleetMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFleetMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * The fleet name to display. The existing DisplayName is unset if null is passed.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which
     * may be outside of your home Region.
     * </p>
     */
    private Boolean optimizeForEndUserLocation;

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The ARN of the fleet.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @return The ARN of the fleet.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The ARN of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetMetadataRequest withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The fleet name to display. The existing DisplayName is unset if null is passed.
     * </p>
     * 
     * @param displayName
     *        The fleet name to display. The existing DisplayName is unset if null is passed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The fleet name to display. The existing DisplayName is unset if null is passed.
     * </p>
     * 
     * @return The fleet name to display. The existing DisplayName is unset if null is passed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The fleet name to display. The existing DisplayName is unset if null is passed.
     * </p>
     * 
     * @param displayName
     *        The fleet name to display. The existing DisplayName is unset if null is passed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetMetadataRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which
     * may be outside of your home Region.
     * </p>
     * 
     * @param optimizeForEndUserLocation
     *        The option to optimize for better performance by routing traffic through the closest AWS Region to users,
     *        which may be outside of your home Region.
     */

    public void setOptimizeForEndUserLocation(Boolean optimizeForEndUserLocation) {
        this.optimizeForEndUserLocation = optimizeForEndUserLocation;
    }

    /**
     * <p>
     * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which
     * may be outside of your home Region.
     * </p>
     * 
     * @return The option to optimize for better performance by routing traffic through the closest AWS Region to users,
     *         which may be outside of your home Region.
     */

    public Boolean getOptimizeForEndUserLocation() {
        return this.optimizeForEndUserLocation;
    }

    /**
     * <p>
     * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which
     * may be outside of your home Region.
     * </p>
     * 
     * @param optimizeForEndUserLocation
     *        The option to optimize for better performance by routing traffic through the closest AWS Region to users,
     *        which may be outside of your home Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetMetadataRequest withOptimizeForEndUserLocation(Boolean optimizeForEndUserLocation) {
        setOptimizeForEndUserLocation(optimizeForEndUserLocation);
        return this;
    }

    /**
     * <p>
     * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which
     * may be outside of your home Region.
     * </p>
     * 
     * @return The option to optimize for better performance by routing traffic through the closest AWS Region to users,
     *         which may be outside of your home Region.
     */

    public Boolean isOptimizeForEndUserLocation() {
        return this.optimizeForEndUserLocation;
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
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getOptimizeForEndUserLocation() != null)
            sb.append("OptimizeForEndUserLocation: ").append(getOptimizeForEndUserLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetMetadataRequest == false)
            return false;
        UpdateFleetMetadataRequest other = (UpdateFleetMetadataRequest) obj;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getOptimizeForEndUserLocation() == null ^ this.getOptimizeForEndUserLocation() == null)
            return false;
        if (other.getOptimizeForEndUserLocation() != null && other.getOptimizeForEndUserLocation().equals(this.getOptimizeForEndUserLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getOptimizeForEndUserLocation() == null) ? 0 : getOptimizeForEndUserLocation().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetMetadataRequest clone() {
        return (UpdateFleetMetadataRequest) super.clone();
    }

}
