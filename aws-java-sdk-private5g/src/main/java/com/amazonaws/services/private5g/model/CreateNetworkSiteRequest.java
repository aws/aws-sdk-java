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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/CreateNetworkSite" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkSiteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone that is the parent of this site. You can't change the Availability Zone after you create
     * the site.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The ID of the Availability Zone that is the parent of this site. You can't change the Availability Zone after you
     * create the site.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description of the site.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     */
    private String networkArn;
    /**
     * <p>
     * The name of the site. You can't change the name after you create the site.
     * </p>
     */
    private String networkSiteName;
    /**
     * <p>
     * Information about the pending plan for this site.
     * </p>
     */
    private SitePlan pendingPlan;
    /**
     * <p>
     * The tags to apply to the network site.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Availability Zone that is the parent of this site. You can't change the Availability Zone after you create
     * the site.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone that is the parent of this site. You can't change the Availability Zone after you
     *        create the site.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that is the parent of this site. You can't change the Availability Zone after you create
     * the site.
     * </p>
     * 
     * @return The Availability Zone that is the parent of this site. You can't change the Availability Zone after you
     *         create the site.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that is the parent of this site. You can't change the Availability Zone after you create
     * the site.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone that is the parent of this site. You can't change the Availability Zone after you
     *        create the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkSiteRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The ID of the Availability Zone that is the parent of this site. You can't change the Availability Zone after you
     * create the site.
     * </p>
     * 
     * @param availabilityZoneId
     *        The ID of the Availability Zone that is the parent of this site. You can't change the Availability Zone
     *        after you create the site.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone that is the parent of this site. You can't change the Availability Zone after you
     * create the site.
     * </p>
     * 
     * @return The ID of the Availability Zone that is the parent of this site. You can't change the Availability Zone
     *         after you create the site.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone that is the parent of this site. You can't change the Availability Zone after you
     * create the site.
     * </p>
     * 
     * @param availabilityZoneId
     *        The ID of the Availability Zone that is the parent of this site. You can't change the Availability Zone
     *        after you create the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkSiteRequest withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
     *        idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
     *         idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to ensure idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkSiteRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The description of the site.
     * </p>
     * 
     * @param description
     *        The description of the site.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the site.
     * </p>
     * 
     * @return The description of the site.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the site.
     * </p>
     * 
     * @param description
     *        The description of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkSiteRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network.
     */

    public void setNetworkArn(String networkArn) {
        this.networkArn = networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network.
     */

    public String getNetworkArn() {
        return this.networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkSiteRequest withNetworkArn(String networkArn) {
        setNetworkArn(networkArn);
        return this;
    }

    /**
     * <p>
     * The name of the site. You can't change the name after you create the site.
     * </p>
     * 
     * @param networkSiteName
     *        The name of the site. You can't change the name after you create the site.
     */

    public void setNetworkSiteName(String networkSiteName) {
        this.networkSiteName = networkSiteName;
    }

    /**
     * <p>
     * The name of the site. You can't change the name after you create the site.
     * </p>
     * 
     * @return The name of the site. You can't change the name after you create the site.
     */

    public String getNetworkSiteName() {
        return this.networkSiteName;
    }

    /**
     * <p>
     * The name of the site. You can't change the name after you create the site.
     * </p>
     * 
     * @param networkSiteName
     *        The name of the site. You can't change the name after you create the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkSiteRequest withNetworkSiteName(String networkSiteName) {
        setNetworkSiteName(networkSiteName);
        return this;
    }

    /**
     * <p>
     * Information about the pending plan for this site.
     * </p>
     * 
     * @param pendingPlan
     *        Information about the pending plan for this site.
     */

    public void setPendingPlan(SitePlan pendingPlan) {
        this.pendingPlan = pendingPlan;
    }

    /**
     * <p>
     * Information about the pending plan for this site.
     * </p>
     * 
     * @return Information about the pending plan for this site.
     */

    public SitePlan getPendingPlan() {
        return this.pendingPlan;
    }

    /**
     * <p>
     * Information about the pending plan for this site.
     * </p>
     * 
     * @param pendingPlan
     *        Information about the pending plan for this site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkSiteRequest withPendingPlan(SitePlan pendingPlan) {
        setPendingPlan(pendingPlan);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the network site.
     * </p>
     * 
     * @return The tags to apply to the network site.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the network site.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the network site.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to apply to the network site.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkSiteRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateNetworkSiteRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkSiteRequest addTagsEntry(String key, String value) {
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

    public CreateNetworkSiteRequest clearTagsEntries() {
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNetworkArn() != null)
            sb.append("NetworkArn: ").append(getNetworkArn()).append(",");
        if (getNetworkSiteName() != null)
            sb.append("NetworkSiteName: ").append(getNetworkSiteName()).append(",");
        if (getPendingPlan() != null)
            sb.append("PendingPlan: ").append(getPendingPlan()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkSiteRequest == false)
            return false;
        CreateNetworkSiteRequest other = (CreateNetworkSiteRequest) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNetworkArn() == null ^ this.getNetworkArn() == null)
            return false;
        if (other.getNetworkArn() != null && other.getNetworkArn().equals(this.getNetworkArn()) == false)
            return false;
        if (other.getNetworkSiteName() == null ^ this.getNetworkSiteName() == null)
            return false;
        if (other.getNetworkSiteName() != null && other.getNetworkSiteName().equals(this.getNetworkSiteName()) == false)
            return false;
        if (other.getPendingPlan() == null ^ this.getPendingPlan() == null)
            return false;
        if (other.getPendingPlan() != null && other.getPendingPlan().equals(this.getPendingPlan()) == false)
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

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNetworkArn() == null) ? 0 : getNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkSiteName() == null) ? 0 : getNetworkSiteName().hashCode());
        hashCode = prime * hashCode + ((getPendingPlan() == null) ? 0 : getPendingPlan().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkSiteRequest clone() {
        return (CreateNetworkSiteRequest) super.clone();
    }

}
