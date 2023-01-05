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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateSite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSiteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String name;

    private String description;
    /**
     * <p>
     * Additional information that you provide about site access requirements, electrician scheduling, personal
     * protective equipment, or regulation of equipment materials that could affect your installation process.
     * </p>
     */
    private String notes;
    /**
     * <p>
     * The tags to apply to a site.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The location to install and power on the hardware. This address might be different from the shipping address.
     * </p>
     */
    private Address operatingAddress;
    /**
     * <p>
     * The location to ship the hardware. This address might be different from the operating address.
     * </p>
     */
    private Address shippingAddress;
    /**
     * <p>
     * Information about the physical and logistical details for the rack at this site. For more information about
     * hardware requirements for racks, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#checklist">Network
     * readiness checklist</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     */
    private RackPhysicalProperties rackPhysicalProperties;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Additional information that you provide about site access requirements, electrician scheduling, personal
     * protective equipment, or regulation of equipment materials that could affect your installation process.
     * </p>
     * 
     * @param notes
     *        Additional information that you provide about site access requirements, electrician scheduling, personal
     *        protective equipment, or regulation of equipment materials that could affect your installation process.
     */

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * <p>
     * Additional information that you provide about site access requirements, electrician scheduling, personal
     * protective equipment, or regulation of equipment materials that could affect your installation process.
     * </p>
     * 
     * @return Additional information that you provide about site access requirements, electrician scheduling, personal
     *         protective equipment, or regulation of equipment materials that could affect your installation process.
     */

    public String getNotes() {
        return this.notes;
    }

    /**
     * <p>
     * Additional information that you provide about site access requirements, electrician scheduling, personal
     * protective equipment, or regulation of equipment materials that could affect your installation process.
     * </p>
     * 
     * @param notes
     *        Additional information that you provide about site access requirements, electrician scheduling, personal
     *        protective equipment, or regulation of equipment materials that could affect your installation process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteRequest withNotes(String notes) {
        setNotes(notes);
        return this;
    }

    /**
     * <p>
     * The tags to apply to a site.
     * </p>
     * 
     * @return The tags to apply to a site.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to a site.
     * </p>
     * 
     * @param tags
     *        The tags to apply to a site.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to apply to a site.
     * </p>
     * 
     * @param tags
     *        The tags to apply to a site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSiteRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteRequest addTagsEntry(String key, String value) {
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

    public CreateSiteRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The location to install and power on the hardware. This address might be different from the shipping address.
     * </p>
     * 
     * @param operatingAddress
     *        The location to install and power on the hardware. This address might be different from the shipping
     *        address.
     */

    public void setOperatingAddress(Address operatingAddress) {
        this.operatingAddress = operatingAddress;
    }

    /**
     * <p>
     * The location to install and power on the hardware. This address might be different from the shipping address.
     * </p>
     * 
     * @return The location to install and power on the hardware. This address might be different from the shipping
     *         address.
     */

    public Address getOperatingAddress() {
        return this.operatingAddress;
    }

    /**
     * <p>
     * The location to install and power on the hardware. This address might be different from the shipping address.
     * </p>
     * 
     * @param operatingAddress
     *        The location to install and power on the hardware. This address might be different from the shipping
     *        address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteRequest withOperatingAddress(Address operatingAddress) {
        setOperatingAddress(operatingAddress);
        return this;
    }

    /**
     * <p>
     * The location to ship the hardware. This address might be different from the operating address.
     * </p>
     * 
     * @param shippingAddress
     *        The location to ship the hardware. This address might be different from the operating address.
     */

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * <p>
     * The location to ship the hardware. This address might be different from the operating address.
     * </p>
     * 
     * @return The location to ship the hardware. This address might be different from the operating address.
     */

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * <p>
     * The location to ship the hardware. This address might be different from the operating address.
     * </p>
     * 
     * @param shippingAddress
     *        The location to ship the hardware. This address might be different from the operating address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteRequest withShippingAddress(Address shippingAddress) {
        setShippingAddress(shippingAddress);
        return this;
    }

    /**
     * <p>
     * Information about the physical and logistical details for the rack at this site. For more information about
     * hardware requirements for racks, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#checklist">Network
     * readiness checklist</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * 
     * @param rackPhysicalProperties
     *        Information about the physical and logistical details for the rack at this site. For more information
     *        about hardware requirements for racks, see <a
     *        href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#checklist">Network
     *        readiness checklist</a> in the Amazon Web Services Outposts User Guide.
     */

    public void setRackPhysicalProperties(RackPhysicalProperties rackPhysicalProperties) {
        this.rackPhysicalProperties = rackPhysicalProperties;
    }

    /**
     * <p>
     * Information about the physical and logistical details for the rack at this site. For more information about
     * hardware requirements for racks, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#checklist">Network
     * readiness checklist</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * 
     * @return Information about the physical and logistical details for the rack at this site. For more information
     *         about hardware requirements for racks, see <a
     *         href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#checklist">Network
     *         readiness checklist</a> in the Amazon Web Services Outposts User Guide.
     */

    public RackPhysicalProperties getRackPhysicalProperties() {
        return this.rackPhysicalProperties;
    }

    /**
     * <p>
     * Information about the physical and logistical details for the rack at this site. For more information about
     * hardware requirements for racks, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#checklist">Network
     * readiness checklist</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * 
     * @param rackPhysicalProperties
     *        Information about the physical and logistical details for the rack at this site. For more information
     *        about hardware requirements for racks, see <a
     *        href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#checklist">Network
     *        readiness checklist</a> in the Amazon Web Services Outposts User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteRequest withRackPhysicalProperties(RackPhysicalProperties rackPhysicalProperties) {
        setRackPhysicalProperties(rackPhysicalProperties);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getOperatingAddress() != null)
            sb.append("OperatingAddress: ").append(getOperatingAddress()).append(",");
        if (getShippingAddress() != null)
            sb.append("ShippingAddress: ").append(getShippingAddress()).append(",");
        if (getRackPhysicalProperties() != null)
            sb.append("RackPhysicalProperties: ").append(getRackPhysicalProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSiteRequest == false)
            return false;
        CreateSiteRequest other = (CreateSiteRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getOperatingAddress() == null ^ this.getOperatingAddress() == null)
            return false;
        if (other.getOperatingAddress() != null && other.getOperatingAddress().equals(this.getOperatingAddress()) == false)
            return false;
        if (other.getShippingAddress() == null ^ this.getShippingAddress() == null)
            return false;
        if (other.getShippingAddress() != null && other.getShippingAddress().equals(this.getShippingAddress()) == false)
            return false;
        if (other.getRackPhysicalProperties() == null ^ this.getRackPhysicalProperties() == null)
            return false;
        if (other.getRackPhysicalProperties() != null && other.getRackPhysicalProperties().equals(this.getRackPhysicalProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getOperatingAddress() == null) ? 0 : getOperatingAddress().hashCode());
        hashCode = prime * hashCode + ((getShippingAddress() == null) ? 0 : getShippingAddress().hashCode());
        hashCode = prime * hashCode + ((getRackPhysicalProperties() == null) ? 0 : getRackPhysicalProperties().hashCode());
        return hashCode;
    }

    @Override
    public CreateSiteRequest clone() {
        return (CreateSiteRequest) super.clone();
    }

}
