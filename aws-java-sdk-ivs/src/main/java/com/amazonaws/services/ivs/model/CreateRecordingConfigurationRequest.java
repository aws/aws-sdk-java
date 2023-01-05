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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateRecordingConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRecordingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains a destination configuration for where recorded video will be stored.
     * </p>
     */
    private DestinationConfiguration destinationConfiguration;
    /**
     * <p>
     * Recording-configuration name. The value does not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be
     * considered a single broadcast and merged together. Default: 0.
     * </p>
     */
    private Integer recordingReconnectWindowSeconds;
    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A complex type that allows you to enable/disable the recording of thumbnails for a live session and modify the
     * interval at which thumbnails are generated for the live session.
     * </p>
     */
    private ThumbnailConfiguration thumbnailConfiguration;

    /**
     * <p>
     * A complex type that contains a destination configuration for where recorded video will be stored.
     * </p>
     * 
     * @param destinationConfiguration
     *        A complex type that contains a destination configuration for where recorded video will be stored.
     */

    public void setDestinationConfiguration(DestinationConfiguration destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
    }

    /**
     * <p>
     * A complex type that contains a destination configuration for where recorded video will be stored.
     * </p>
     * 
     * @return A complex type that contains a destination configuration for where recorded video will be stored.
     */

    public DestinationConfiguration getDestinationConfiguration() {
        return this.destinationConfiguration;
    }

    /**
     * <p>
     * A complex type that contains a destination configuration for where recorded video will be stored.
     * </p>
     * 
     * @param destinationConfiguration
     *        A complex type that contains a destination configuration for where recorded video will be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecordingConfigurationRequest withDestinationConfiguration(DestinationConfiguration destinationConfiguration) {
        setDestinationConfiguration(destinationConfiguration);
        return this;
    }

    /**
     * <p>
     * Recording-configuration name. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        Recording-configuration name. The value does not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Recording-configuration name. The value does not need to be unique.
     * </p>
     * 
     * @return Recording-configuration name. The value does not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Recording-configuration name. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        Recording-configuration name. The value does not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecordingConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be
     * considered a single broadcast and merged together. Default: 0.
     * </p>
     * 
     * @param recordingReconnectWindowSeconds
     *        If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be
     *        considered a single broadcast and merged together. Default: 0.
     */

    public void setRecordingReconnectWindowSeconds(Integer recordingReconnectWindowSeconds) {
        this.recordingReconnectWindowSeconds = recordingReconnectWindowSeconds;
    }

    /**
     * <p>
     * If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be
     * considered a single broadcast and merged together. Default: 0.
     * </p>
     * 
     * @return If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will
     *         be considered a single broadcast and merged together. Default: 0.
     */

    public Integer getRecordingReconnectWindowSeconds() {
        return this.recordingReconnectWindowSeconds;
    }

    /**
     * <p>
     * If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be
     * considered a single broadcast and merged together. Default: 0.
     * </p>
     * 
     * @param recordingReconnectWindowSeconds
     *        If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be
     *        considered a single broadcast and merged together. Default: 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecordingConfigurationRequest withRecordingReconnectWindowSeconds(Integer recordingReconnectWindowSeconds) {
        setRecordingReconnectWindowSeconds(recordingReconnectWindowSeconds);
        return this;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
     * </p>
     * 
     * @return Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         Resources</a> for more information, including restrictions that apply to tags and
     *         "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is
     *         documented there.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a> for more information, including restrictions that apply to tags and
     *        "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is
     *        documented there.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a> for more information, including restrictions that apply to tags and
     *        "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is
     *        documented there.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecordingConfigurationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRecordingConfigurationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecordingConfigurationRequest addTagsEntry(String key, String value) {
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

    public CreateRecordingConfigurationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A complex type that allows you to enable/disable the recording of thumbnails for a live session and modify the
     * interval at which thumbnails are generated for the live session.
     * </p>
     * 
     * @param thumbnailConfiguration
     *        A complex type that allows you to enable/disable the recording of thumbnails for a live session and modify
     *        the interval at which thumbnails are generated for the live session.
     */

    public void setThumbnailConfiguration(ThumbnailConfiguration thumbnailConfiguration) {
        this.thumbnailConfiguration = thumbnailConfiguration;
    }

    /**
     * <p>
     * A complex type that allows you to enable/disable the recording of thumbnails for a live session and modify the
     * interval at which thumbnails are generated for the live session.
     * </p>
     * 
     * @return A complex type that allows you to enable/disable the recording of thumbnails for a live session and
     *         modify the interval at which thumbnails are generated for the live session.
     */

    public ThumbnailConfiguration getThumbnailConfiguration() {
        return this.thumbnailConfiguration;
    }

    /**
     * <p>
     * A complex type that allows you to enable/disable the recording of thumbnails for a live session and modify the
     * interval at which thumbnails are generated for the live session.
     * </p>
     * 
     * @param thumbnailConfiguration
     *        A complex type that allows you to enable/disable the recording of thumbnails for a live session and modify
     *        the interval at which thumbnails are generated for the live session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecordingConfigurationRequest withThumbnailConfiguration(ThumbnailConfiguration thumbnailConfiguration) {
        setThumbnailConfiguration(thumbnailConfiguration);
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
        if (getDestinationConfiguration() != null)
            sb.append("DestinationConfiguration: ").append(getDestinationConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRecordingReconnectWindowSeconds() != null)
            sb.append("RecordingReconnectWindowSeconds: ").append(getRecordingReconnectWindowSeconds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getThumbnailConfiguration() != null)
            sb.append("ThumbnailConfiguration: ").append(getThumbnailConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRecordingConfigurationRequest == false)
            return false;
        CreateRecordingConfigurationRequest other = (CreateRecordingConfigurationRequest) obj;
        if (other.getDestinationConfiguration() == null ^ this.getDestinationConfiguration() == null)
            return false;
        if (other.getDestinationConfiguration() != null && other.getDestinationConfiguration().equals(this.getDestinationConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecordingReconnectWindowSeconds() == null ^ this.getRecordingReconnectWindowSeconds() == null)
            return false;
        if (other.getRecordingReconnectWindowSeconds() != null
                && other.getRecordingReconnectWindowSeconds().equals(this.getRecordingReconnectWindowSeconds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getThumbnailConfiguration() == null ^ this.getThumbnailConfiguration() == null)
            return false;
        if (other.getThumbnailConfiguration() != null && other.getThumbnailConfiguration().equals(this.getThumbnailConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationConfiguration() == null) ? 0 : getDestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecordingReconnectWindowSeconds() == null) ? 0 : getRecordingReconnectWindowSeconds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getThumbnailConfiguration() == null) ? 0 : getThumbnailConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateRecordingConfigurationRequest clone() {
        return (CreateRecordingConfigurationRequest) super.clone();
    }

}
