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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an entity that is affected by a Health event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/AffectedEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AffectedEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the entity. Format:
     * <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>. Example:
     * <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     * </p>
     */
    private String entityArn;
    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     */
    private String eventArn;
    /**
     * <p>
     * The ID of the affected entity.
     * </p>
     */
    private String entityValue;

    private String entityUrl;
    /**
     * <p>
     * The 12-digit AWS account number that contains the affected entity.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The most recent time that the entity was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible values are <code>IMPAIRED</code>,
     * <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique identifier for the entity. Format:
     * <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>. Example:
     * <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     * </p>
     * 
     * @param entityArn
     *        The unique identifier for the entity. Format:
     *        <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>. Example:
     *        <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     */

    public void setEntityArn(String entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>
     * The unique identifier for the entity. Format:
     * <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>. Example:
     * <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     * </p>
     * 
     * @return The unique identifier for the entity. Format:
     *         <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>. Example:
     *         <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     */

    public String getEntityArn() {
        return this.entityArn;
    }

    /**
     * <p>
     * The unique identifier for the entity. Format:
     * <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>. Example:
     * <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     * </p>
     * 
     * @param entityArn
     *        The unique identifier for the entity. Format:
     *        <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>. Example:
     *        <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AffectedEntity withEntityArn(String entityArn) {
        setEntityArn(entityArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @param eventArn
     *        The unique identifier for the event. Format:
     *        <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *        . Example:
     *        <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     */

    public void setEventArn(String eventArn) {
        this.eventArn = eventArn;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @return The unique identifier for the event. Format:
     *         <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *         . Example:
     *         <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     */

    public String getEventArn() {
        return this.eventArn;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @param eventArn
     *        The unique identifier for the event. Format:
     *        <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *        . Example:
     *        <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AffectedEntity withEventArn(String eventArn) {
        setEventArn(eventArn);
        return this;
    }

    /**
     * <p>
     * The ID of the affected entity.
     * </p>
     * 
     * @param entityValue
     *        The ID of the affected entity.
     */

    public void setEntityValue(String entityValue) {
        this.entityValue = entityValue;
    }

    /**
     * <p>
     * The ID of the affected entity.
     * </p>
     * 
     * @return The ID of the affected entity.
     */

    public String getEntityValue() {
        return this.entityValue;
    }

    /**
     * <p>
     * The ID of the affected entity.
     * </p>
     * 
     * @param entityValue
     *        The ID of the affected entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AffectedEntity withEntityValue(String entityValue) {
        setEntityValue(entityValue);
        return this;
    }

    /**
     * @param entityUrl
     */

    public void setEntityUrl(String entityUrl) {
        this.entityUrl = entityUrl;
    }

    /**
     * @return
     */

    public String getEntityUrl() {
        return this.entityUrl;
    }

    /**
     * @param entityUrl
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AffectedEntity withEntityUrl(String entityUrl) {
        setEntityUrl(entityUrl);
        return this;
    }

    /**
     * <p>
     * The 12-digit AWS account number that contains the affected entity.
     * </p>
     * 
     * @param awsAccountId
     *        The 12-digit AWS account number that contains the affected entity.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The 12-digit AWS account number that contains the affected entity.
     * </p>
     * 
     * @return The 12-digit AWS account number that contains the affected entity.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The 12-digit AWS account number that contains the affected entity.
     * </p>
     * 
     * @param awsAccountId
     *        The 12-digit AWS account number that contains the affected entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AffectedEntity withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The most recent time that the entity was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The most recent time that the entity was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The most recent time that the entity was updated.
     * </p>
     * 
     * @return The most recent time that the entity was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The most recent time that the entity was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The most recent time that the entity was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AffectedEntity withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible values are <code>IMPAIRED</code>,
     * <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     * </p>
     * 
     * @param statusCode
     *        The most recent status of the entity affected by the event. The possible values are <code>IMPAIRED</code>,
     *        <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     * @see EntityStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible values are <code>IMPAIRED</code>,
     * <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     * </p>
     * 
     * @return The most recent status of the entity affected by the event. The possible values are <code>IMPAIRED</code>
     *         , <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     * @see EntityStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible values are <code>IMPAIRED</code>,
     * <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     * </p>
     * 
     * @param statusCode
     *        The most recent status of the entity affected by the event. The possible values are <code>IMPAIRED</code>,
     *        <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatusCode
     */

    public AffectedEntity withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible values are <code>IMPAIRED</code>,
     * <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     * </p>
     * 
     * @param statusCode
     *        The most recent status of the entity affected by the event. The possible values are <code>IMPAIRED</code>,
     *        <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     * @see EntityStatusCode
     */

    public void setStatusCode(EntityStatusCode statusCode) {
        withStatusCode(statusCode);
    }

    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible values are <code>IMPAIRED</code>,
     * <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     * </p>
     * 
     * @param statusCode
     *        The most recent status of the entity affected by the event. The possible values are <code>IMPAIRED</code>,
     *        <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatusCode
     */

    public AffectedEntity withStatusCode(EntityStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * 
     * @return A map of entity tags attached to the affected entity.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * 
     * @param tags
     *        A map of entity tags attached to the affected entity.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * 
     * @param tags
     *        A map of entity tags attached to the affected entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AffectedEntity withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public AffectedEntity addTagsEntry(String key, String value) {
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

    public AffectedEntity clearTagsEntries() {
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
        if (getEntityArn() != null)
            sb.append("EntityArn: ").append(getEntityArn()).append(",");
        if (getEventArn() != null)
            sb.append("EventArn: ").append(getEventArn()).append(",");
        if (getEntityValue() != null)
            sb.append("EntityValue: ").append(getEntityValue()).append(",");
        if (getEntityUrl() != null)
            sb.append("EntityUrl: ").append(getEntityUrl()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
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

        if (obj instanceof AffectedEntity == false)
            return false;
        AffectedEntity other = (AffectedEntity) obj;
        if (other.getEntityArn() == null ^ this.getEntityArn() == null)
            return false;
        if (other.getEntityArn() != null && other.getEntityArn().equals(this.getEntityArn()) == false)
            return false;
        if (other.getEventArn() == null ^ this.getEventArn() == null)
            return false;
        if (other.getEventArn() != null && other.getEventArn().equals(this.getEventArn()) == false)
            return false;
        if (other.getEntityValue() == null ^ this.getEntityValue() == null)
            return false;
        if (other.getEntityValue() != null && other.getEntityValue().equals(this.getEntityValue()) == false)
            return false;
        if (other.getEntityUrl() == null ^ this.getEntityUrl() == null)
            return false;
        if (other.getEntityUrl() != null && other.getEntityUrl().equals(this.getEntityUrl()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
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

        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getEventArn() == null) ? 0 : getEventArn().hashCode());
        hashCode = prime * hashCode + ((getEntityValue() == null) ? 0 : getEntityValue().hashCode());
        hashCode = prime * hashCode + ((getEntityUrl() == null) ? 0 : getEntityUrl().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AffectedEntity clone() {
        try {
            return (AffectedEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.AffectedEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
