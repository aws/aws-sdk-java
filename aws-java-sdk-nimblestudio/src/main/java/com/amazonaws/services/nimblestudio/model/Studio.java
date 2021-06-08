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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/Studio" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Studio implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
     * </p>
     */
    private String adminRoleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique
     * across all Regions.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A friendly name for the studio.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The AWS region where the studio resource is located.
     * </p>
     */
    private String homeRegion;
    /**
     * <p>
     * The AWS SSO application client ID used to integrate with AWS SSO to enable AWS SSO users to log in to Nimble
     * portal.
     * </p>
     */
    private String ssoClientId;
    /**
     * <p>
     * The current state of the studio resource.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Status codes that provide additional detail on the studio state.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * Additional detail on the studio state.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Configuration of the encryption method that is used for the studio.
     * </p>
     */
    private StudioEncryptionConfiguration studioEncryptionConfiguration;
    /**
     * <p>
     * The unique identifier for a studio resource. In Nimble Studio, all other resources are contained in a studio
     * resource.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
     * </p>
     */
    private String studioName;
    /**
     * <p>
     * The address of the web page for the studio.
     * </p>
     */
    private String studioUrl;
    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The IAM role that studio users assume when logging in to the Nimble Studio portal.
     * </p>
     */
    private String userRoleArn;

    /**
     * <p>
     * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @param adminRoleArn
     *        The IAM role that studio admins assume when logging in to the Nimble Studio portal.
     */

    public void setAdminRoleArn(String adminRoleArn) {
        this.adminRoleArn = adminRoleArn;
    }

    /**
     * <p>
     * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @return The IAM role that studio admins assume when logging in to the Nimble Studio portal.
     */

    public String getAdminRoleArn() {
        return this.adminRoleArn;
    }

    /**
     * <p>
     * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @param adminRoleArn
     *        The IAM role that studio admins assume when logging in to the Nimble Studio portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withAdminRoleArn(String adminRoleArn) {
        setAdminRoleArn(adminRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique
     * across all Regions.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are
     *        unique across all Regions.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique
     * across all Regions.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are
     *         unique across all Regions.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique
     * across all Regions.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are
     *        unique across all Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A friendly name for the studio.
     * </p>
     * 
     * @param displayName
     *        A friendly name for the studio.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * A friendly name for the studio.
     * </p>
     * 
     * @return A friendly name for the studio.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * A friendly name for the studio.
     * </p>
     * 
     * @param displayName
     *        A friendly name for the studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The AWS region where the studio resource is located.
     * </p>
     * 
     * @param homeRegion
     *        The AWS region where the studio resource is located.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * The AWS region where the studio resource is located.
     * </p>
     * 
     * @return The AWS region where the studio resource is located.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * The AWS region where the studio resource is located.
     * </p>
     * 
     * @param homeRegion
     *        The AWS region where the studio resource is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
        return this;
    }

    /**
     * <p>
     * The AWS SSO application client ID used to integrate with AWS SSO to enable AWS SSO users to log in to Nimble
     * portal.
     * </p>
     * 
     * @param ssoClientId
     *        The AWS SSO application client ID used to integrate with AWS SSO to enable AWS SSO users to log in to
     *        Nimble portal.
     */

    public void setSsoClientId(String ssoClientId) {
        this.ssoClientId = ssoClientId;
    }

    /**
     * <p>
     * The AWS SSO application client ID used to integrate with AWS SSO to enable AWS SSO users to log in to Nimble
     * portal.
     * </p>
     * 
     * @return The AWS SSO application client ID used to integrate with AWS SSO to enable AWS SSO users to log in to
     *         Nimble portal.
     */

    public String getSsoClientId() {
        return this.ssoClientId;
    }

    /**
     * <p>
     * The AWS SSO application client ID used to integrate with AWS SSO to enable AWS SSO users to log in to Nimble
     * portal.
     * </p>
     * 
     * @param ssoClientId
     *        The AWS SSO application client ID used to integrate with AWS SSO to enable AWS SSO users to log in to
     *        Nimble portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withSsoClientId(String ssoClientId) {
        setSsoClientId(ssoClientId);
        return this;
    }

    /**
     * <p>
     * The current state of the studio resource.
     * </p>
     * 
     * @param state
     *        The current state of the studio resource.
     * @see StudioState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the studio resource.
     * </p>
     * 
     * @return The current state of the studio resource.
     * @see StudioState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the studio resource.
     * </p>
     * 
     * @param state
     *        The current state of the studio resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioState
     */

    public Studio withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the studio resource.
     * </p>
     * 
     * @param state
     *        The current state of the studio resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioState
     */

    public Studio withState(StudioState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Status codes that provide additional detail on the studio state.
     * </p>
     * 
     * @param statusCode
     *        Status codes that provide additional detail on the studio state.
     * @see StudioStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * Status codes that provide additional detail on the studio state.
     * </p>
     * 
     * @return Status codes that provide additional detail on the studio state.
     * @see StudioStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * Status codes that provide additional detail on the studio state.
     * </p>
     * 
     * @param statusCode
     *        Status codes that provide additional detail on the studio state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioStatusCode
     */

    public Studio withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Status codes that provide additional detail on the studio state.
     * </p>
     * 
     * @param statusCode
     *        Status codes that provide additional detail on the studio state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioStatusCode
     */

    public Studio withStatusCode(StudioStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * Additional detail on the studio state.
     * </p>
     * 
     * @param statusMessage
     *        Additional detail on the studio state.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Additional detail on the studio state.
     * </p>
     * 
     * @return Additional detail on the studio state.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Additional detail on the studio state.
     * </p>
     * 
     * @param statusMessage
     *        Additional detail on the studio state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Configuration of the encryption method that is used for the studio.
     * </p>
     * 
     * @param studioEncryptionConfiguration
     *        Configuration of the encryption method that is used for the studio.
     */

    public void setStudioEncryptionConfiguration(StudioEncryptionConfiguration studioEncryptionConfiguration) {
        this.studioEncryptionConfiguration = studioEncryptionConfiguration;
    }

    /**
     * <p>
     * Configuration of the encryption method that is used for the studio.
     * </p>
     * 
     * @return Configuration of the encryption method that is used for the studio.
     */

    public StudioEncryptionConfiguration getStudioEncryptionConfiguration() {
        return this.studioEncryptionConfiguration;
    }

    /**
     * <p>
     * Configuration of the encryption method that is used for the studio.
     * </p>
     * 
     * @param studioEncryptionConfiguration
     *        Configuration of the encryption method that is used for the studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withStudioEncryptionConfiguration(StudioEncryptionConfiguration studioEncryptionConfiguration) {
        setStudioEncryptionConfiguration(studioEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a studio resource. In Nimble Studio, all other resources are contained in a studio
     * resource.
     * </p>
     * 
     * @param studioId
     *        The unique identifier for a studio resource. In Nimble Studio, all other resources are contained in a
     *        studio resource.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The unique identifier for a studio resource. In Nimble Studio, all other resources are contained in a studio
     * resource.
     * </p>
     * 
     * @return The unique identifier for a studio resource. In Nimble Studio, all other resources are contained in a
     *         studio resource.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The unique identifier for a studio resource. In Nimble Studio, all other resources are contained in a studio
     * resource.
     * </p>
     * 
     * @param studioId
     *        The unique identifier for a studio resource. In Nimble Studio, all other resources are contained in a
     *        studio resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * <p>
     * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
     * </p>
     * 
     * @param studioName
     *        The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
     */

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    /**
     * <p>
     * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
     * </p>
     * 
     * @return The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
     */

    public String getStudioName() {
        return this.studioName;
    }

    /**
     * <p>
     * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
     * </p>
     * 
     * @param studioName
     *        The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withStudioName(String studioName) {
        setStudioName(studioName);
        return this;
    }

    /**
     * <p>
     * The address of the web page for the studio.
     * </p>
     * 
     * @param studioUrl
     *        The address of the web page for the studio.
     */

    public void setStudioUrl(String studioUrl) {
        this.studioUrl = studioUrl;
    }

    /**
     * <p>
     * The address of the web page for the studio.
     * </p>
     * 
     * @return The address of the web page for the studio.
     */

    public String getStudioUrl() {
        return this.studioUrl;
    }

    /**
     * <p>
     * The address of the web page for the studio.
     * </p>
     * 
     * @param studioUrl
     *        The address of the web page for the studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withStudioUrl(String studioUrl) {
        setStudioUrl(studioUrl);
        return this;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @return A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Studio#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Studio addTagsEntry(String key, String value) {
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

    public Studio clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix epoch timestamp in seconds for when the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix epoch timestamp in seconds for when the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The IAM role that studio users assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @param userRoleArn
     *        The IAM role that studio users assume when logging in to the Nimble Studio portal.
     */

    public void setUserRoleArn(String userRoleArn) {
        this.userRoleArn = userRoleArn;
    }

    /**
     * <p>
     * The IAM role that studio users assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @return The IAM role that studio users assume when logging in to the Nimble Studio portal.
     */

    public String getUserRoleArn() {
        return this.userRoleArn;
    }

    /**
     * <p>
     * The IAM role that studio users assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @param userRoleArn
     *        The IAM role that studio users assume when logging in to the Nimble Studio portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withUserRoleArn(String userRoleArn) {
        setUserRoleArn(userRoleArn);
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
        if (getAdminRoleArn() != null)
            sb.append("AdminRoleArn: ").append(getAdminRoleArn()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion()).append(",");
        if (getSsoClientId() != null)
            sb.append("SsoClientId: ").append(getSsoClientId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStudioEncryptionConfiguration() != null)
            sb.append("StudioEncryptionConfiguration: ").append(getStudioEncryptionConfiguration()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
        if (getStudioName() != null)
            sb.append("StudioName: ").append(getStudioName()).append(",");
        if (getStudioUrl() != null)
            sb.append("StudioUrl: ").append(getStudioUrl()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUserRoleArn() != null)
            sb.append("UserRoleArn: ").append(getUserRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Studio == false)
            return false;
        Studio other = (Studio) obj;
        if (other.getAdminRoleArn() == null ^ this.getAdminRoleArn() == null)
            return false;
        if (other.getAdminRoleArn() != null && other.getAdminRoleArn().equals(this.getAdminRoleArn()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        if (other.getSsoClientId() == null ^ this.getSsoClientId() == null)
            return false;
        if (other.getSsoClientId() != null && other.getSsoClientId().equals(this.getSsoClientId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStudioEncryptionConfiguration() == null ^ this.getStudioEncryptionConfiguration() == null)
            return false;
        if (other.getStudioEncryptionConfiguration() != null
                && other.getStudioEncryptionConfiguration().equals(this.getStudioEncryptionConfiguration()) == false)
            return false;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        if (other.getStudioName() == null ^ this.getStudioName() == null)
            return false;
        if (other.getStudioName() != null && other.getStudioName().equals(this.getStudioName()) == false)
            return false;
        if (other.getStudioUrl() == null ^ this.getStudioUrl() == null)
            return false;
        if (other.getStudioUrl() != null && other.getStudioUrl().equals(this.getStudioUrl()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUserRoleArn() == null ^ this.getUserRoleArn() == null)
            return false;
        if (other.getUserRoleArn() != null && other.getUserRoleArn().equals(this.getUserRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminRoleArn() == null) ? 0 : getAdminRoleArn().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        hashCode = prime * hashCode + ((getSsoClientId() == null) ? 0 : getSsoClientId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStudioEncryptionConfiguration() == null) ? 0 : getStudioEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getStudioName() == null) ? 0 : getStudioName().hashCode());
        hashCode = prime * hashCode + ((getStudioUrl() == null) ? 0 : getStudioUrl().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUserRoleArn() == null) ? 0 : getUserRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public Studio clone() {
        try {
            return (Studio) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StudioMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
