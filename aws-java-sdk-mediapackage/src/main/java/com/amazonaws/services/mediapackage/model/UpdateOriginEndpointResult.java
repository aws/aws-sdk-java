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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UpdateOriginEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOriginEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The Amazon Resource Name (ARN) assigned to the OriginEndpoint. */
    private String arn;
    /** The ID of the Channel the OriginEndpoint is associated with. */
    private String channelId;

    private CmafPackage cmafPackage;

    private DashPackage dashPackage;
    /** A short text description of the OriginEndpoint. */
    private String description;

    private HlsPackage hlsPackage;
    /** The ID of the OriginEndpoint. */
    private String id;
    /** A short string appended to the end of the OriginEndpoint URL. */
    private String manifestName;

    private MssPackage mssPackage;
    /**
     * Maximum duration (seconds) of content to retain for startover playback. If not specified, startover playback will
     * be disabled for the OriginEndpoint.
     */
    private Integer startoverWindowSeconds;

    private java.util.Map<String, String> tags;
    /**
     * Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no time
     * delay in effect for the OriginEndpoint.
     */
    private Integer timeDelaySeconds;
    /** The URL of the packaged OriginEndpoint for consumption. */
    private String url;
    /** A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint. */
    private java.util.List<String> whitelist;

    /**
     * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
     * 
     * @return The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The ID of the Channel the OriginEndpoint is associated with.
     * 
     * @param channelId
     *        The ID of the Channel the OriginEndpoint is associated with.
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * The ID of the Channel the OriginEndpoint is associated with.
     * 
     * @return The ID of the Channel the OriginEndpoint is associated with.
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * The ID of the Channel the OriginEndpoint is associated with.
     * 
     * @param channelId
     *        The ID of the Channel the OriginEndpoint is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * @param cmafPackage
     */

    public void setCmafPackage(CmafPackage cmafPackage) {
        this.cmafPackage = cmafPackage;
    }

    /**
     * @return
     */

    public CmafPackage getCmafPackage() {
        return this.cmafPackage;
    }

    /**
     * @param cmafPackage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withCmafPackage(CmafPackage cmafPackage) {
        setCmafPackage(cmafPackage);
        return this;
    }

    /**
     * @param dashPackage
     */

    public void setDashPackage(DashPackage dashPackage) {
        this.dashPackage = dashPackage;
    }

    /**
     * @return
     */

    public DashPackage getDashPackage() {
        return this.dashPackage;
    }

    /**
     * @param dashPackage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withDashPackage(DashPackage dashPackage) {
        setDashPackage(dashPackage);
        return this;
    }

    /**
     * A short text description of the OriginEndpoint.
     * 
     * @param description
     *        A short text description of the OriginEndpoint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A short text description of the OriginEndpoint.
     * 
     * @return A short text description of the OriginEndpoint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A short text description of the OriginEndpoint.
     * 
     * @param description
     *        A short text description of the OriginEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param hlsPackage
     */

    public void setHlsPackage(HlsPackage hlsPackage) {
        this.hlsPackage = hlsPackage;
    }

    /**
     * @return
     */

    public HlsPackage getHlsPackage() {
        return this.hlsPackage;
    }

    /**
     * @param hlsPackage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withHlsPackage(HlsPackage hlsPackage) {
        setHlsPackage(hlsPackage);
        return this;
    }

    /**
     * The ID of the OriginEndpoint.
     * 
     * @param id
     *        The ID of the OriginEndpoint.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the OriginEndpoint.
     * 
     * @return The ID of the OriginEndpoint.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the OriginEndpoint.
     * 
     * @param id
     *        The ID of the OriginEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * A short string appended to the end of the OriginEndpoint URL.
     * 
     * @param manifestName
     *        A short string appended to the end of the OriginEndpoint URL.
     */

    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    /**
     * A short string appended to the end of the OriginEndpoint URL.
     * 
     * @return A short string appended to the end of the OriginEndpoint URL.
     */

    public String getManifestName() {
        return this.manifestName;
    }

    /**
     * A short string appended to the end of the OriginEndpoint URL.
     * 
     * @param manifestName
     *        A short string appended to the end of the OriginEndpoint URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withManifestName(String manifestName) {
        setManifestName(manifestName);
        return this;
    }

    /**
     * @param mssPackage
     */

    public void setMssPackage(MssPackage mssPackage) {
        this.mssPackage = mssPackage;
    }

    /**
     * @return
     */

    public MssPackage getMssPackage() {
        return this.mssPackage;
    }

    /**
     * @param mssPackage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withMssPackage(MssPackage mssPackage) {
        setMssPackage(mssPackage);
        return this;
    }

    /**
     * Maximum duration (seconds) of content to retain for startover playback. If not specified, startover playback will
     * be disabled for the OriginEndpoint.
     * 
     * @param startoverWindowSeconds
     *        Maximum duration (seconds) of content to retain for startover playback. If not specified, startover
     *        playback will be disabled for the OriginEndpoint.
     */

    public void setStartoverWindowSeconds(Integer startoverWindowSeconds) {
        this.startoverWindowSeconds = startoverWindowSeconds;
    }

    /**
     * Maximum duration (seconds) of content to retain for startover playback. If not specified, startover playback will
     * be disabled for the OriginEndpoint.
     * 
     * @return Maximum duration (seconds) of content to retain for startover playback. If not specified, startover
     *         playback will be disabled for the OriginEndpoint.
     */

    public Integer getStartoverWindowSeconds() {
        return this.startoverWindowSeconds;
    }

    /**
     * Maximum duration (seconds) of content to retain for startover playback. If not specified, startover playback will
     * be disabled for the OriginEndpoint.
     * 
     * @param startoverWindowSeconds
     *        Maximum duration (seconds) of content to retain for startover playback. If not specified, startover
     *        playback will be disabled for the OriginEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withStartoverWindowSeconds(Integer startoverWindowSeconds) {
        setStartoverWindowSeconds(startoverWindowSeconds);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public UpdateOriginEndpointResult addTagsEntry(String key, String value) {
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

    public UpdateOriginEndpointResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no time
     * delay in effect for the OriginEndpoint.
     * 
     * @param timeDelaySeconds
     *        Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no
     *        time delay in effect for the OriginEndpoint.
     */

    public void setTimeDelaySeconds(Integer timeDelaySeconds) {
        this.timeDelaySeconds = timeDelaySeconds;
    }

    /**
     * Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no time
     * delay in effect for the OriginEndpoint.
     * 
     * @return Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no
     *         time delay in effect for the OriginEndpoint.
     */

    public Integer getTimeDelaySeconds() {
        return this.timeDelaySeconds;
    }

    /**
     * Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no time
     * delay in effect for the OriginEndpoint.
     * 
     * @param timeDelaySeconds
     *        Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no
     *        time delay in effect for the OriginEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withTimeDelaySeconds(Integer timeDelaySeconds) {
        setTimeDelaySeconds(timeDelaySeconds);
        return this;
    }

    /**
     * The URL of the packaged OriginEndpoint for consumption.
     * 
     * @param url
     *        The URL of the packaged OriginEndpoint for consumption.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The URL of the packaged OriginEndpoint for consumption.
     * 
     * @return The URL of the packaged OriginEndpoint for consumption.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * The URL of the packaged OriginEndpoint for consumption.
     * 
     * @param url
     *        The URL of the packaged OriginEndpoint for consumption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     * 
     * @return A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     */

    public java.util.List<String> getWhitelist() {
        return whitelist;
    }

    /**
     * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     * 
     * @param whitelist
     *        A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     */

    public void setWhitelist(java.util.Collection<String> whitelist) {
        if (whitelist == null) {
            this.whitelist = null;
            return;
        }

        this.whitelist = new java.util.ArrayList<String>(whitelist);
    }

    /**
     * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWhitelist(java.util.Collection)} or {@link #withWhitelist(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param whitelist
     *        A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withWhitelist(String... whitelist) {
        if (this.whitelist == null) {
            setWhitelist(new java.util.ArrayList<String>(whitelist.length));
        }
        for (String ele : whitelist) {
            this.whitelist.add(ele);
        }
        return this;
    }

    /**
     * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     * 
     * @param whitelist
     *        A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginEndpointResult withWhitelist(java.util.Collection<String> whitelist) {
        setWhitelist(whitelist);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId()).append(",");
        if (getCmafPackage() != null)
            sb.append("CmafPackage: ").append(getCmafPackage()).append(",");
        if (getDashPackage() != null)
            sb.append("DashPackage: ").append(getDashPackage()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHlsPackage() != null)
            sb.append("HlsPackage: ").append(getHlsPackage()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getManifestName() != null)
            sb.append("ManifestName: ").append(getManifestName()).append(",");
        if (getMssPackage() != null)
            sb.append("MssPackage: ").append(getMssPackage()).append(",");
        if (getStartoverWindowSeconds() != null)
            sb.append("StartoverWindowSeconds: ").append(getStartoverWindowSeconds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTimeDelaySeconds() != null)
            sb.append("TimeDelaySeconds: ").append(getTimeDelaySeconds()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getWhitelist() != null)
            sb.append("Whitelist: ").append(getWhitelist());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOriginEndpointResult == false)
            return false;
        UpdateOriginEndpointResult other = (UpdateOriginEndpointResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getCmafPackage() == null ^ this.getCmafPackage() == null)
            return false;
        if (other.getCmafPackage() != null && other.getCmafPackage().equals(this.getCmafPackage()) == false)
            return false;
        if (other.getDashPackage() == null ^ this.getDashPackage() == null)
            return false;
        if (other.getDashPackage() != null && other.getDashPackage().equals(this.getDashPackage()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHlsPackage() == null ^ this.getHlsPackage() == null)
            return false;
        if (other.getHlsPackage() != null && other.getHlsPackage().equals(this.getHlsPackage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getManifestName() == null ^ this.getManifestName() == null)
            return false;
        if (other.getManifestName() != null && other.getManifestName().equals(this.getManifestName()) == false)
            return false;
        if (other.getMssPackage() == null ^ this.getMssPackage() == null)
            return false;
        if (other.getMssPackage() != null && other.getMssPackage().equals(this.getMssPackage()) == false)
            return false;
        if (other.getStartoverWindowSeconds() == null ^ this.getStartoverWindowSeconds() == null)
            return false;
        if (other.getStartoverWindowSeconds() != null && other.getStartoverWindowSeconds().equals(this.getStartoverWindowSeconds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTimeDelaySeconds() == null ^ this.getTimeDelaySeconds() == null)
            return false;
        if (other.getTimeDelaySeconds() != null && other.getTimeDelaySeconds().equals(this.getTimeDelaySeconds()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getWhitelist() == null ^ this.getWhitelist() == null)
            return false;
        if (other.getWhitelist() != null && other.getWhitelist().equals(this.getWhitelist()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getCmafPackage() == null) ? 0 : getCmafPackage().hashCode());
        hashCode = prime * hashCode + ((getDashPackage() == null) ? 0 : getDashPackage().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHlsPackage() == null) ? 0 : getHlsPackage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getManifestName() == null) ? 0 : getManifestName().hashCode());
        hashCode = prime * hashCode + ((getMssPackage() == null) ? 0 : getMssPackage().hashCode());
        hashCode = prime * hashCode + ((getStartoverWindowSeconds() == null) ? 0 : getStartoverWindowSeconds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTimeDelaySeconds() == null) ? 0 : getTimeDelaySeconds().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getWhitelist() == null) ? 0 : getWhitelist().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOriginEndpointResult clone() {
        try {
            return (UpdateOriginEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
