/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the channel.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not
     * specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
     * </p>
     */
    private ChannelStorage channelStorage;
    /**
     * <p>
     * How long, in days, message data is kept for the channel. When "customerManagedS3" storage is selected, this
     * parameter is ignored.
     * </p>
     */
    private RetentionPeriod retentionPeriod;
    /**
     * <p>
     * Metadata which can be used to manage the channel.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param channelName
     *        The name of the channel.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @return The name of the channel.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param channelName
     *        The name of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not
     * specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
     * </p>
     * 
     * @param channelStorage
     *        Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If
     *        not specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
     */

    public void setChannelStorage(ChannelStorage channelStorage) {
        this.channelStorage = channelStorage;
    }

    /**
     * <p>
     * Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not
     * specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
     * </p>
     * 
     * @return Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If
     *         not specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
     */

    public ChannelStorage getChannelStorage() {
        return this.channelStorage;
    }

    /**
     * <p>
     * Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not
     * specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
     * </p>
     * 
     * @param channelStorage
     *        Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If
     *        not specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withChannelStorage(ChannelStorage channelStorage) {
        setChannelStorage(channelStorage);
        return this;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the channel. When "customerManagedS3" storage is selected, this
     * parameter is ignored.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, message data is kept for the channel. When "customerManagedS3" storage is selected,
     *        this parameter is ignored.
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the channel. When "customerManagedS3" storage is selected, this
     * parameter is ignored.
     * </p>
     * 
     * @return How long, in days, message data is kept for the channel. When "customerManagedS3" storage is selected,
     *         this parameter is ignored.
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the channel. When "customerManagedS3" storage is selected, this
     * parameter is ignored.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, message data is kept for the channel. When "customerManagedS3" storage is selected,
     *        this parameter is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the channel.
     * </p>
     * 
     * @return Metadata which can be used to manage the channel.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the channel.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the channel.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the channel.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getChannelStorage() != null)
            sb.append("ChannelStorage: ").append(getChannelStorage()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
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

        if (obj instanceof CreateChannelRequest == false)
            return false;
        CreateChannelRequest other = (CreateChannelRequest) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getChannelStorage() == null ^ this.getChannelStorage() == null)
            return false;
        if (other.getChannelStorage() != null && other.getChannelStorage().equals(this.getChannelStorage()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
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

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getChannelStorage() == null) ? 0 : getChannelStorage().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelRequest clone() {
        return (CreateChannelRequest) super.clone();
    }

}
