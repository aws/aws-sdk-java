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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateMap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMapRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     */
    private MapConfiguration configuration;
    /**
     * <p>
     * An optional description for the map resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name for the map resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique map resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleMap</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String mapName;
    /**
     * <p>
     * Specifies the pricing plan for your map resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     */
    private String pricingPlan;
    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair helps manage, identify, search, and
     * filter your resources by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * 
     * @param configuration
     *        Specifies the map style selected from an available data provider.
     */

    public void setConfiguration(MapConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * 
     * @return Specifies the map style selected from an available data provider.
     */

    public MapConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * 
     * @param configuration
     *        Specifies the map style selected from an available data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMapRequest withConfiguration(MapConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * An optional description for the map resource.
     * </p>
     * 
     * @param description
     *        An optional description for the map resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the map resource.
     * </p>
     * 
     * @return An optional description for the map resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the map resource.
     * </p>
     * 
     * @param description
     *        An optional description for the map resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMapRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name for the map resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique map resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleMap</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mapName
     *        The name for the map resource.</p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique map resource name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExampleMap</code>.
     *        </p>
     *        </li>
     */

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The name for the map resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique map resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleMap</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name for the map resource.</p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique map resource name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>ExampleMap</code>.
     *         </p>
     *         </li>
     */

    public String getMapName() {
        return this.mapName;
    }

    /**
     * <p>
     * The name for the map resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique map resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleMap</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mapName
     *        The name for the map resource.</p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique map resource name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExampleMap</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMapRequest withMapName(String mapName) {
        setMapName(mapName);
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your map resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for your map resource.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @see PricingPlan
     */

    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * Specifies the pricing plan for your map resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @return Specifies the pricing plan for your map resource.</p>
     *         <p>
     *         For additional details and restrictions on each pricing plan option, see the <a
     *         href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @see PricingPlan
     */

    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * <p>
     * Specifies the pricing plan for your map resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for your map resource.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreateMapRequest withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your map resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for your map resource.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreateMapRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair helps manage, identify, search, and
     * filter your resources by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Applies one or more tags to the map resource. A tag is a key-value pair helps manage, identify, search,
     *         and filter your resources by labelling them.</p>
     *         <p>
     *         Format: <code>"key" : "value"</code>
     *         </p>
     *         <p>
     *         Restrictions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum 50 tags per resource
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each resource tag must be unique with a maximum of one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair helps manage, identify, search, and
     * filter your resources by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Applies one or more tags to the map resource. A tag is a key-value pair helps manage, identify, search,
     *        and filter your resources by labelling them.</p>
     *        <p>
     *        Format: <code>"key" : "value"</code>
     *        </p>
     *        <p>
     *        Restrictions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum 50 tags per resource
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each resource tag must be unique with a maximum of one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair helps manage, identify, search, and
     * filter your resources by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Applies one or more tags to the map resource. A tag is a key-value pair helps manage, identify, search,
     *        and filter your resources by labelling them.</p>
     *        <p>
     *        Format: <code>"key" : "value"</code>
     *        </p>
     *        <p>
     *        Restrictions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum 50 tags per resource
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each resource tag must be unique with a maximum of one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMapRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateMapRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateMapRequest addTagsEntry(String key, String value) {
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

    public CreateMapRequest clearTagsEntries() {
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMapName() != null)
            sb.append("MapName: ").append(getMapName()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan()).append(",");
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

        if (obj instanceof CreateMapRequest == false)
            return false;
        CreateMapRequest other = (CreateMapRequest) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null && other.getPricingPlan().equals(this.getPricingPlan()) == false)
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

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMapRequest clone() {
        return (CreateMapRequest) super.clone();
    }

}
