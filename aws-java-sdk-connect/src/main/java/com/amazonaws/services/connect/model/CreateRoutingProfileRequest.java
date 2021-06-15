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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRoutingProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoutingProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the routing profile. Must not be more than 127 characters.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description of the routing profile. Must not be more than 250 characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The default outbound queue for the routing profile.
     * </p>
     */
    private String defaultOutboundQueueId;
    /**
     * <p>
     * The inbound queues associated with the routing profile. If no queue is added, the agent can make only outbound
     * calls.
     * </p>
     */
    private java.util.List<RoutingProfileQueueConfig> queueConfigs;
    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * </p>
     */
    private java.util.List<MediaConcurrency> mediaConcurrencies;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the routing profile. Must not be more than 127 characters.
     * </p>
     * 
     * @param name
     *        The name of the routing profile. Must not be more than 127 characters.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the routing profile. Must not be more than 127 characters.
     * </p>
     * 
     * @return The name of the routing profile. Must not be more than 127 characters.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the routing profile. Must not be more than 127 characters.
     * </p>
     * 
     * @param name
     *        The name of the routing profile. Must not be more than 127 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description of the routing profile. Must not be more than 250 characters.
     * </p>
     * 
     * @param description
     *        Description of the routing profile. Must not be more than 250 characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the routing profile. Must not be more than 250 characters.
     * </p>
     * 
     * @return Description of the routing profile. Must not be more than 250 characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the routing profile. Must not be more than 250 characters.
     * </p>
     * 
     * @param description
     *        Description of the routing profile. Must not be more than 250 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The default outbound queue for the routing profile.
     * </p>
     * 
     * @param defaultOutboundQueueId
     *        The default outbound queue for the routing profile.
     */

    public void setDefaultOutboundQueueId(String defaultOutboundQueueId) {
        this.defaultOutboundQueueId = defaultOutboundQueueId;
    }

    /**
     * <p>
     * The default outbound queue for the routing profile.
     * </p>
     * 
     * @return The default outbound queue for the routing profile.
     */

    public String getDefaultOutboundQueueId() {
        return this.defaultOutboundQueueId;
    }

    /**
     * <p>
     * The default outbound queue for the routing profile.
     * </p>
     * 
     * @param defaultOutboundQueueId
     *        The default outbound queue for the routing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileRequest withDefaultOutboundQueueId(String defaultOutboundQueueId) {
        setDefaultOutboundQueueId(defaultOutboundQueueId);
        return this;
    }

    /**
     * <p>
     * The inbound queues associated with the routing profile. If no queue is added, the agent can make only outbound
     * calls.
     * </p>
     * 
     * @return The inbound queues associated with the routing profile. If no queue is added, the agent can make only
     *         outbound calls.
     */

    public java.util.List<RoutingProfileQueueConfig> getQueueConfigs() {
        return queueConfigs;
    }

    /**
     * <p>
     * The inbound queues associated with the routing profile. If no queue is added, the agent can make only outbound
     * calls.
     * </p>
     * 
     * @param queueConfigs
     *        The inbound queues associated with the routing profile. If no queue is added, the agent can make only
     *        outbound calls.
     */

    public void setQueueConfigs(java.util.Collection<RoutingProfileQueueConfig> queueConfigs) {
        if (queueConfigs == null) {
            this.queueConfigs = null;
            return;
        }

        this.queueConfigs = new java.util.ArrayList<RoutingProfileQueueConfig>(queueConfigs);
    }

    /**
     * <p>
     * The inbound queues associated with the routing profile. If no queue is added, the agent can make only outbound
     * calls.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueueConfigs(java.util.Collection)} or {@link #withQueueConfigs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param queueConfigs
     *        The inbound queues associated with the routing profile. If no queue is added, the agent can make only
     *        outbound calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileRequest withQueueConfigs(RoutingProfileQueueConfig... queueConfigs) {
        if (this.queueConfigs == null) {
            setQueueConfigs(new java.util.ArrayList<RoutingProfileQueueConfig>(queueConfigs.length));
        }
        for (RoutingProfileQueueConfig ele : queueConfigs) {
            this.queueConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inbound queues associated with the routing profile. If no queue is added, the agent can make only outbound
     * calls.
     * </p>
     * 
     * @param queueConfigs
     *        The inbound queues associated with the routing profile. If no queue is added, the agent can make only
     *        outbound calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileRequest withQueueConfigs(java.util.Collection<RoutingProfileQueueConfig> queueConfigs) {
        setQueueConfigs(queueConfigs);
        return this;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * </p>
     * 
     * @return The channels that agents can handle in the Contact Control Panel (CCP) for this routing profile.
     */

    public java.util.List<MediaConcurrency> getMediaConcurrencies() {
        return mediaConcurrencies;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * </p>
     * 
     * @param mediaConcurrencies
     *        The channels that agents can handle in the Contact Control Panel (CCP) for this routing profile.
     */

    public void setMediaConcurrencies(java.util.Collection<MediaConcurrency> mediaConcurrencies) {
        if (mediaConcurrencies == null) {
            this.mediaConcurrencies = null;
            return;
        }

        this.mediaConcurrencies = new java.util.ArrayList<MediaConcurrency>(mediaConcurrencies);
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaConcurrencies(java.util.Collection)} or {@link #withMediaConcurrencies(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param mediaConcurrencies
     *        The channels that agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileRequest withMediaConcurrencies(MediaConcurrency... mediaConcurrencies) {
        if (this.mediaConcurrencies == null) {
            setMediaConcurrencies(new java.util.ArrayList<MediaConcurrency>(mediaConcurrencies.length));
        }
        for (MediaConcurrency ele : mediaConcurrencies) {
            this.mediaConcurrencies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The channels that agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * </p>
     * 
     * @param mediaConcurrencies
     *        The channels that agents can handle in the Contact Control Panel (CCP) for this routing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileRequest withMediaConcurrencies(java.util.Collection<MediaConcurrency> mediaConcurrencies) {
        setMediaConcurrencies(mediaConcurrencies);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRoutingProfileRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileRequest addTagsEntry(String key, String value) {
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

    public CreateRoutingProfileRequest clearTagsEntries() {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDefaultOutboundQueueId() != null)
            sb.append("DefaultOutboundQueueId: ").append(getDefaultOutboundQueueId()).append(",");
        if (getQueueConfigs() != null)
            sb.append("QueueConfigs: ").append(getQueueConfigs()).append(",");
        if (getMediaConcurrencies() != null)
            sb.append("MediaConcurrencies: ").append(getMediaConcurrencies()).append(",");
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

        if (obj instanceof CreateRoutingProfileRequest == false)
            return false;
        CreateRoutingProfileRequest other = (CreateRoutingProfileRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultOutboundQueueId() == null ^ this.getDefaultOutboundQueueId() == null)
            return false;
        if (other.getDefaultOutboundQueueId() != null && other.getDefaultOutboundQueueId().equals(this.getDefaultOutboundQueueId()) == false)
            return false;
        if (other.getQueueConfigs() == null ^ this.getQueueConfigs() == null)
            return false;
        if (other.getQueueConfigs() != null && other.getQueueConfigs().equals(this.getQueueConfigs()) == false)
            return false;
        if (other.getMediaConcurrencies() == null ^ this.getMediaConcurrencies() == null)
            return false;
        if (other.getMediaConcurrencies() != null && other.getMediaConcurrencies().equals(this.getMediaConcurrencies()) == false)
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultOutboundQueueId() == null) ? 0 : getDefaultOutboundQueueId().hashCode());
        hashCode = prime * hashCode + ((getQueueConfigs() == null) ? 0 : getQueueConfigs().hashCode());
        hashCode = prime * hashCode + ((getMediaConcurrencies() == null) ? 0 : getMediaConcurrencies().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRoutingProfileRequest clone() {
        return (CreateRoutingProfileRequest) super.clone();
    }

}
