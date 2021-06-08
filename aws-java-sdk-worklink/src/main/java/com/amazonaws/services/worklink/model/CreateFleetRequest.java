/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/CreateFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name for the fleet.
     * </p>
     */
    private String fleetName;
    /**
     * <p>
     * The fleet name to display.
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
     * The tags to add to the resource. A tag is a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique name for the fleet.
     * </p>
     * 
     * @param fleetName
     *        A unique name for the fleet.
     */

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     * <p>
     * A unique name for the fleet.
     * </p>
     * 
     * @return A unique name for the fleet.
     */

    public String getFleetName() {
        return this.fleetName;
    }

    /**
     * <p>
     * A unique name for the fleet.
     * </p>
     * 
     * @param fleetName
     *        A unique name for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withFleetName(String fleetName) {
        setFleetName(fleetName);
        return this;
    }

    /**
     * <p>
     * The fleet name to display.
     * </p>
     * 
     * @param displayName
     *        The fleet name to display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The fleet name to display.
     * </p>
     * 
     * @return The fleet name to display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The fleet name to display.
     * </p>
     * 
     * @param displayName
     *        The fleet name to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withDisplayName(String displayName) {
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

    public CreateFleetRequest withOptimizeForEndUserLocation(Boolean optimizeForEndUserLocation) {
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
     * <p>
     * The tags to add to the resource. A tag is a key-value pair.
     * </p>
     * 
     * @return The tags to add to the resource. A tag is a key-value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add to the resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags to add to the resource. A tag is a key-value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to add to the resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags to add to the resource. A tag is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateFleetRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest clearTagsEntries() {
        this.tags = null;
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
        if (getFleetName() != null)
            sb.append("FleetName: ").append(getFleetName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getOptimizeForEndUserLocation() != null)
            sb.append("OptimizeForEndUserLocation: ").append(getOptimizeForEndUserLocation()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetRequest == false)
            return false;
        CreateFleetRequest other = (CreateFleetRequest) obj;
        if (other.getFleetName() == null ^ this.getFleetName() == null)
            return false;
        if (other.getFleetName() != null && other.getFleetName().equals(this.getFleetName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getOptimizeForEndUserLocation() == null ^ this.getOptimizeForEndUserLocation() == null)
            return false;
        if (other.getOptimizeForEndUserLocation() != null && other.getOptimizeForEndUserLocation().equals(this.getOptimizeForEndUserLocation()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetName() == null) ? 0 : getFleetName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getOptimizeForEndUserLocation() == null) ? 0 : getOptimizeForEndUserLocation().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetRequest clone() {
        return (CreateFleetRequest) super.clone();
    }

}
