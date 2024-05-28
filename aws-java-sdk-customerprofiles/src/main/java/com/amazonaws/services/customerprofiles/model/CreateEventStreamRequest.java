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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/CreateEventStream"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The StreamARN of the destination to deliver profile events to. For example,
     * arn:aws:kinesis:region:account-id:stream/stream-name
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The name of the event stream.
     * </p>
     */
    private String eventStreamName;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventStreamRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The StreamARN of the destination to deliver profile events to. For example,
     * arn:aws:kinesis:region:account-id:stream/stream-name
     * </p>
     * 
     * @param uri
     *        The StreamARN of the destination to deliver profile events to. For example,
     *        arn:aws:kinesis:region:account-id:stream/stream-name
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The StreamARN of the destination to deliver profile events to. For example,
     * arn:aws:kinesis:region:account-id:stream/stream-name
     * </p>
     * 
     * @return The StreamARN of the destination to deliver profile events to. For example,
     *         arn:aws:kinesis:region:account-id:stream/stream-name
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The StreamARN of the destination to deliver profile events to. For example,
     * arn:aws:kinesis:region:account-id:stream/stream-name
     * </p>
     * 
     * @param uri
     *        The StreamARN of the destination to deliver profile events to. For example,
     *        arn:aws:kinesis:region:account-id:stream/stream-name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventStreamRequest withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The name of the event stream.
     * </p>
     * 
     * @param eventStreamName
     *        The name of the event stream.
     */

    public void setEventStreamName(String eventStreamName) {
        this.eventStreamName = eventStreamName;
    }

    /**
     * <p>
     * The name of the event stream.
     * </p>
     * 
     * @return The name of the event stream.
     */

    public String getEventStreamName() {
        return this.eventStreamName;
    }

    /**
     * <p>
     * The name of the event stream.
     * </p>
     * 
     * @param eventStreamName
     *        The name of the event stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventStreamRequest withEventStreamName(String eventStreamName) {
        setEventStreamName(eventStreamName);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventStreamRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateEventStreamRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventStreamRequest addTagsEntry(String key, String value) {
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

    public CreateEventStreamRequest clearTagsEntries() {
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getEventStreamName() != null)
            sb.append("EventStreamName: ").append(getEventStreamName()).append(",");
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

        if (obj instanceof CreateEventStreamRequest == false)
            return false;
        CreateEventStreamRequest other = (CreateEventStreamRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getEventStreamName() == null ^ this.getEventStreamName() == null)
            return false;
        if (other.getEventStreamName() != null && other.getEventStreamName().equals(this.getEventStreamName()) == false)
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getEventStreamName() == null) ? 0 : getEventStreamName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventStreamRequest clone() {
        return (CreateEventStreamRequest) super.clone();
    }

}
