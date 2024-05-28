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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a notification generated in Amazon DataZone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/NotificationOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action link included in the notification.
     * </p>
     */
    private String actionLink;
    /**
     * <p>
     * The timestamp of when a notification was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The identifier of a Amazon DataZone domain in which the notification exists.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the notification.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The timestamp of when the notification was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * The message included in the notification.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The metadata included in the notification.
     * </p>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * The status included in the notification.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The title of the notification.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The topic of the notification.
     * </p>
     */
    private Topic topic;
    /**
     * <p>
     * The type of the notification.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The action link included in the notification.
     * </p>
     * 
     * @param actionLink
     *        The action link included in the notification.
     */

    public void setActionLink(String actionLink) {
        this.actionLink = actionLink;
    }

    /**
     * <p>
     * The action link included in the notification.
     * </p>
     * 
     * @return The action link included in the notification.
     */

    public String getActionLink() {
        return this.actionLink;
    }

    /**
     * <p>
     * The action link included in the notification.
     * </p>
     * 
     * @param actionLink
     *        The action link included in the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOutput withActionLink(String actionLink) {
        setActionLink(actionLink);
        return this;
    }

    /**
     * <p>
     * The timestamp of when a notification was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The timestamp of when a notification was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The timestamp of when a notification was created.
     * </p>
     * 
     * @return The timestamp of when a notification was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The timestamp of when a notification was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The timestamp of when a notification was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOutput withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The identifier of a Amazon DataZone domain in which the notification exists.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of a Amazon DataZone domain in which the notification exists.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of a Amazon DataZone domain in which the notification exists.
     * </p>
     * 
     * @return The identifier of a Amazon DataZone domain in which the notification exists.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of a Amazon DataZone domain in which the notification exists.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of a Amazon DataZone domain in which the notification exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOutput withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the notification.
     * </p>
     * 
     * @param identifier
     *        The identifier of the notification.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the notification.
     * </p>
     * 
     * @return The identifier of the notification.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the notification.
     * </p>
     * 
     * @param identifier
     *        The identifier of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOutput withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the notification was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp of when the notification was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the notification was last updated.
     * </p>
     * 
     * @return The timestamp of when the notification was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the notification was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp of when the notification was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOutput withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The message included in the notification.
     * </p>
     * 
     * @param message
     *        The message included in the notification.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message included in the notification.
     * </p>
     * 
     * @return The message included in the notification.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message included in the notification.
     * </p>
     * 
     * @param message
     *        The message included in the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOutput withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The metadata included in the notification.
     * </p>
     * 
     * @return The metadata included in the notification.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The metadata included in the notification.
     * </p>
     * 
     * @param metadata
     *        The metadata included in the notification.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata included in the notification.
     * </p>
     * 
     * @param metadata
     *        The metadata included in the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOutput withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see NotificationOutput#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOutput addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOutput clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * The status included in the notification.
     * </p>
     * 
     * @param status
     *        The status included in the notification.
     * @see TaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status included in the notification.
     * </p>
     * 
     * @return The status included in the notification.
     * @see TaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status included in the notification.
     * </p>
     * 
     * @param status
     *        The status included in the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public NotificationOutput withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status included in the notification.
     * </p>
     * 
     * @param status
     *        The status included in the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public NotificationOutput withStatus(TaskStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The title of the notification.
     * </p>
     * 
     * @param title
     *        The title of the notification.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the notification.
     * </p>
     * 
     * @return The title of the notification.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the notification.
     * </p>
     * 
     * @param title
     *        The title of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOutput withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The topic of the notification.
     * </p>
     * 
     * @param topic
     *        The topic of the notification.
     */

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The topic of the notification.
     * </p>
     * 
     * @return The topic of the notification.
     */

    public Topic getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The topic of the notification.
     * </p>
     * 
     * @param topic
     *        The topic of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOutput withTopic(Topic topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * The type of the notification.
     * </p>
     * 
     * @param type
     *        The type of the notification.
     * @see NotificationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the notification.
     * </p>
     * 
     * @return The type of the notification.
     * @see NotificationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the notification.
     * </p>
     * 
     * @param type
     *        The type of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public NotificationOutput withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the notification.
     * </p>
     * 
     * @param type
     *        The type of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public NotificationOutput withType(NotificationType type) {
        this.type = type.toString();
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
        if (getActionLink() != null)
            sb.append("ActionLink: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append("***Sensitive Data Redacted***").append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append("***Sensitive Data Redacted***").append(",");
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationOutput == false)
            return false;
        NotificationOutput other = (NotificationOutput) obj;
        if (other.getActionLink() == null ^ this.getActionLink() == null)
            return false;
        if (other.getActionLink() != null && other.getActionLink().equals(this.getActionLink()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionLink() == null) ? 0 : getActionLink().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public NotificationOutput clone() {
        try {
            return (NotificationOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.NotificationOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
