/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the channel.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the partner or external event source. You cannot change this name after you create the channel. A
     * maximum of one channel is allowed per source.
     * </p>
     * <p>
     * A source can be either <code>Custom</code> for all valid non-Amazon Web Services events, or the name of a partner
     * event source. For information about the source names for available partners, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information"
     * >Additional information about integration partners</a> in the CloudTrail User Guide.
     * </p>
     */
    private String source;
    /**
     * <p>
     * One or more event data stores to which events arriving through a channel will be logged.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Destination> destinations;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param name
     *        The name of the channel.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @return The name of the channel.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param name
     *        The name of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the partner or external event source. You cannot change this name after you create the channel. A
     * maximum of one channel is allowed per source.
     * </p>
     * <p>
     * A source can be either <code>Custom</code> for all valid non-Amazon Web Services events, or the name of a partner
     * event source. For information about the source names for available partners, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information"
     * >Additional information about integration partners</a> in the CloudTrail User Guide.
     * </p>
     * 
     * @param source
     *        The name of the partner or external event source. You cannot change this name after you create the
     *        channel. A maximum of one channel is allowed per source.</p>
     *        <p>
     *        A source can be either <code>Custom</code> for all valid non-Amazon Web Services events, or the name of a
     *        partner event source. For information about the source names for available partners, see <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information"
     *        >Additional information about integration partners</a> in the CloudTrail User Guide.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The name of the partner or external event source. You cannot change this name after you create the channel. A
     * maximum of one channel is allowed per source.
     * </p>
     * <p>
     * A source can be either <code>Custom</code> for all valid non-Amazon Web Services events, or the name of a partner
     * event source. For information about the source names for available partners, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information"
     * >Additional information about integration partners</a> in the CloudTrail User Guide.
     * </p>
     * 
     * @return The name of the partner or external event source. You cannot change this name after you create the
     *         channel. A maximum of one channel is allowed per source.</p>
     *         <p>
     *         A source can be either <code>Custom</code> for all valid non-Amazon Web Services events, or the name of a
     *         partner event source. For information about the source names for available partners, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information"
     *         >Additional information about integration partners</a> in the CloudTrail User Guide.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The name of the partner or external event source. You cannot change this name after you create the channel. A
     * maximum of one channel is allowed per source.
     * </p>
     * <p>
     * A source can be either <code>Custom</code> for all valid non-Amazon Web Services events, or the name of a partner
     * event source. For information about the source names for available partners, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information"
     * >Additional information about integration partners</a> in the CloudTrail User Guide.
     * </p>
     * 
     * @param source
     *        The name of the partner or external event source. You cannot change this name after you create the
     *        channel. A maximum of one channel is allowed per source.</p>
     *        <p>
     *        A source can be either <code>Custom</code> for all valid non-Amazon Web Services events, or the name of a
     *        partner event source. For information about the source names for available partners, see <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information"
     *        >Additional information about integration partners</a> in the CloudTrail User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * One or more event data stores to which events arriving through a channel will be logged.
     * </p>
     * 
     * @return One or more event data stores to which events arriving through a channel will be logged.
     */

    public java.util.List<Destination> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<Destination>();
        }
        return destinations;
    }

    /**
     * <p>
     * One or more event data stores to which events arriving through a channel will be logged.
     * </p>
     * 
     * @param destinations
     *        One or more event data stores to which events arriving through a channel will be logged.
     */

    public void setDestinations(java.util.Collection<Destination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new com.amazonaws.internal.SdkInternalList<Destination>(destinations);
    }

    /**
     * <p>
     * One or more event data stores to which events arriving through a channel will be logged.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        One or more event data stores to which events arriving through a channel will be logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withDestinations(Destination... destinations) {
        if (this.destinations == null) {
            setDestinations(new com.amazonaws.internal.SdkInternalList<Destination>(destinations.length));
        }
        for (Destination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more event data stores to which events arriving through a channel will be logged.
     * </p>
     * 
     * @param destinations
     *        One or more event data stores to which events arriving through a channel will be logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withDestinations(java.util.Collection<Destination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelRequest clone() {
        return (CreateChannelRequest) super.clone();
    }

}
