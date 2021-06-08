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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Notification medium for users to get alerted for events that occur in application profile. We support SNS topic as a
 * notification channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/Channel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Channel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of publishers for different type of events that may be detected in an application from the profile. Anomaly
     * detection is the only event publisher in Profiler.
     * </p>
     */
    private java.util.List<String> eventPublishers;
    /**
     * <p>
     * Unique identifier for each <code>Channel</code> in the notification configuration of a Profiling Group. A random
     * UUID for channelId is used when adding a channel to the notification configuration if not specified in the
     * request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Unique arn of the resource to be used for notifications. We support a valid SNS topic arn as a channel uri.
     * </p>
     */
    private String uri;

    /**
     * <p>
     * List of publishers for different type of events that may be detected in an application from the profile. Anomaly
     * detection is the only event publisher in Profiler.
     * </p>
     * 
     * @return List of publishers for different type of events that may be detected in an application from the profile.
     *         Anomaly detection is the only event publisher in Profiler.
     * @see EventPublisher
     */

    public java.util.List<String> getEventPublishers() {
        return eventPublishers;
    }

    /**
     * <p>
     * List of publishers for different type of events that may be detected in an application from the profile. Anomaly
     * detection is the only event publisher in Profiler.
     * </p>
     * 
     * @param eventPublishers
     *        List of publishers for different type of events that may be detected in an application from the profile.
     *        Anomaly detection is the only event publisher in Profiler.
     * @see EventPublisher
     */

    public void setEventPublishers(java.util.Collection<String> eventPublishers) {
        if (eventPublishers == null) {
            this.eventPublishers = null;
            return;
        }

        this.eventPublishers = new java.util.ArrayList<String>(eventPublishers);
    }

    /**
     * <p>
     * List of publishers for different type of events that may be detected in an application from the profile. Anomaly
     * detection is the only event publisher in Profiler.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventPublishers(java.util.Collection)} or {@link #withEventPublishers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventPublishers
     *        List of publishers for different type of events that may be detected in an application from the profile.
     *        Anomaly detection is the only event publisher in Profiler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventPublisher
     */

    public Channel withEventPublishers(String... eventPublishers) {
        if (this.eventPublishers == null) {
            setEventPublishers(new java.util.ArrayList<String>(eventPublishers.length));
        }
        for (String ele : eventPublishers) {
            this.eventPublishers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of publishers for different type of events that may be detected in an application from the profile. Anomaly
     * detection is the only event publisher in Profiler.
     * </p>
     * 
     * @param eventPublishers
     *        List of publishers for different type of events that may be detected in an application from the profile.
     *        Anomaly detection is the only event publisher in Profiler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventPublisher
     */

    public Channel withEventPublishers(java.util.Collection<String> eventPublishers) {
        setEventPublishers(eventPublishers);
        return this;
    }

    /**
     * <p>
     * List of publishers for different type of events that may be detected in an application from the profile. Anomaly
     * detection is the only event publisher in Profiler.
     * </p>
     * 
     * @param eventPublishers
     *        List of publishers for different type of events that may be detected in an application from the profile.
     *        Anomaly detection is the only event publisher in Profiler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventPublisher
     */

    public Channel withEventPublishers(EventPublisher... eventPublishers) {
        java.util.ArrayList<String> eventPublishersCopy = new java.util.ArrayList<String>(eventPublishers.length);
        for (EventPublisher value : eventPublishers) {
            eventPublishersCopy.add(value.toString());
        }
        if (getEventPublishers() == null) {
            setEventPublishers(eventPublishersCopy);
        } else {
            getEventPublishers().addAll(eventPublishersCopy);
        }
        return this;
    }

    /**
     * <p>
     * Unique identifier for each <code>Channel</code> in the notification configuration of a Profiling Group. A random
     * UUID for channelId is used when adding a channel to the notification configuration if not specified in the
     * request.
     * </p>
     * 
     * @param id
     *        Unique identifier for each <code>Channel</code> in the notification configuration of a Profiling Group. A
     *        random UUID for channelId is used when adding a channel to the notification configuration if not specified
     *        in the request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Unique identifier for each <code>Channel</code> in the notification configuration of a Profiling Group. A random
     * UUID for channelId is used when adding a channel to the notification configuration if not specified in the
     * request.
     * </p>
     * 
     * @return Unique identifier for each <code>Channel</code> in the notification configuration of a Profiling Group. A
     *         random UUID for channelId is used when adding a channel to the notification configuration if not
     *         specified in the request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Unique identifier for each <code>Channel</code> in the notification configuration of a Profiling Group. A random
     * UUID for channelId is used when adding a channel to the notification configuration if not specified in the
     * request.
     * </p>
     * 
     * @param id
     *        Unique identifier for each <code>Channel</code> in the notification configuration of a Profiling Group. A
     *        random UUID for channelId is used when adding a channel to the notification configuration if not specified
     *        in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Unique arn of the resource to be used for notifications. We support a valid SNS topic arn as a channel uri.
     * </p>
     * 
     * @param uri
     *        Unique arn of the resource to be used for notifications. We support a valid SNS topic arn as a channel
     *        uri.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * Unique arn of the resource to be used for notifications. We support a valid SNS topic arn as a channel uri.
     * </p>
     * 
     * @return Unique arn of the resource to be used for notifications. We support a valid SNS topic arn as a channel
     *         uri.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * Unique arn of the resource to be used for notifications. We support a valid SNS topic arn as a channel uri.
     * </p>
     * 
     * @param uri
     *        Unique arn of the resource to be used for notifications. We support a valid SNS topic arn as a channel
     *        uri.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withUri(String uri) {
        setUri(uri);
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
        if (getEventPublishers() != null)
            sb.append("EventPublishers: ").append(getEventPublishers()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Channel == false)
            return false;
        Channel other = (Channel) obj;
        if (other.getEventPublishers() == null ^ this.getEventPublishers() == null)
            return false;
        if (other.getEventPublishers() != null && other.getEventPublishers().equals(this.getEventPublishers()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventPublishers() == null) ? 0 : getEventPublishers().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        return hashCode;
    }

    @Override
    public Channel clone() {
        try {
            return (Channel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.ChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
