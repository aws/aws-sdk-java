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
 * The values to use to filter results from the <a>DescribeAffectedEntities</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/EntityFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     */
    private java.util.List<String> eventArns;
    /**
     * <p>
     * A list of entity ARNs (unique identifiers).
     * </p>
     */
    private java.util.List<String> entityArns;
    /**
     * <p>
     * A list of IDs for affected entities.
     * </p>
     */
    private java.util.List<String> entityValues;
    /**
     * <p>
     * A list of the most recent dates and times that the entity was updated.
     * </p>
     */
    private java.util.List<DateTimeRange> lastUpdatedTimes;
    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> tags;
    /**
     * <p>
     * A list of entity status codes (<code>IMPAIRED</code>, <code>UNIMPAIRED</code>, or <code>UNKNOWN</code>).
     * </p>
     */
    private java.util.List<String> statusCodes;

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * 
     * @return A list of event ARNs (unique identifiers). For example:
     *         <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     */

    public java.util.List<String> getEventArns() {
        return eventArns;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * 
     * @param eventArns
     *        A list of event ARNs (unique identifiers). For example:
     *        <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     */

    public void setEventArns(java.util.Collection<String> eventArns) {
        if (eventArns == null) {
            this.eventArns = null;
            return;
        }

        this.eventArns = new java.util.ArrayList<String>(eventArns);
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventArns(java.util.Collection)} or {@link #withEventArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventArns
     *        A list of event ARNs (unique identifiers). For example:
     *        <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityFilter withEventArns(String... eventArns) {
        if (this.eventArns == null) {
            setEventArns(new java.util.ArrayList<String>(eventArns.length));
        }
        for (String ele : eventArns) {
            this.eventArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * 
     * @param eventArns
     *        A list of event ARNs (unique identifiers). For example:
     *        <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityFilter withEventArns(java.util.Collection<String> eventArns) {
        setEventArns(eventArns);
        return this;
    }

    /**
     * <p>
     * A list of entity ARNs (unique identifiers).
     * </p>
     * 
     * @return A list of entity ARNs (unique identifiers).
     */

    public java.util.List<String> getEntityArns() {
        return entityArns;
    }

    /**
     * <p>
     * A list of entity ARNs (unique identifiers).
     * </p>
     * 
     * @param entityArns
     *        A list of entity ARNs (unique identifiers).
     */

    public void setEntityArns(java.util.Collection<String> entityArns) {
        if (entityArns == null) {
            this.entityArns = null;
            return;
        }

        this.entityArns = new java.util.ArrayList<String>(entityArns);
    }

    /**
     * <p>
     * A list of entity ARNs (unique identifiers).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityArns(java.util.Collection)} or {@link #withEntityArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityArns
     *        A list of entity ARNs (unique identifiers).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityFilter withEntityArns(String... entityArns) {
        if (this.entityArns == null) {
            setEntityArns(new java.util.ArrayList<String>(entityArns.length));
        }
        for (String ele : entityArns) {
            this.entityArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of entity ARNs (unique identifiers).
     * </p>
     * 
     * @param entityArns
     *        A list of entity ARNs (unique identifiers).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityFilter withEntityArns(java.util.Collection<String> entityArns) {
        setEntityArns(entityArns);
        return this;
    }

    /**
     * <p>
     * A list of IDs for affected entities.
     * </p>
     * 
     * @return A list of IDs for affected entities.
     */

    public java.util.List<String> getEntityValues() {
        return entityValues;
    }

    /**
     * <p>
     * A list of IDs for affected entities.
     * </p>
     * 
     * @param entityValues
     *        A list of IDs for affected entities.
     */

    public void setEntityValues(java.util.Collection<String> entityValues) {
        if (entityValues == null) {
            this.entityValues = null;
            return;
        }

        this.entityValues = new java.util.ArrayList<String>(entityValues);
    }

    /**
     * <p>
     * A list of IDs for affected entities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityValues(java.util.Collection)} or {@link #withEntityValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityValues
     *        A list of IDs for affected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityFilter withEntityValues(String... entityValues) {
        if (this.entityValues == null) {
            setEntityValues(new java.util.ArrayList<String>(entityValues.length));
        }
        for (String ele : entityValues) {
            this.entityValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs for affected entities.
     * </p>
     * 
     * @param entityValues
     *        A list of IDs for affected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityFilter withEntityValues(java.util.Collection<String> entityValues) {
        setEntityValues(entityValues);
        return this;
    }

    /**
     * <p>
     * A list of the most recent dates and times that the entity was updated.
     * </p>
     * 
     * @return A list of the most recent dates and times that the entity was updated.
     */

    public java.util.List<DateTimeRange> getLastUpdatedTimes() {
        return lastUpdatedTimes;
    }

    /**
     * <p>
     * A list of the most recent dates and times that the entity was updated.
     * </p>
     * 
     * @param lastUpdatedTimes
     *        A list of the most recent dates and times that the entity was updated.
     */

    public void setLastUpdatedTimes(java.util.Collection<DateTimeRange> lastUpdatedTimes) {
        if (lastUpdatedTimes == null) {
            this.lastUpdatedTimes = null;
            return;
        }

        this.lastUpdatedTimes = new java.util.ArrayList<DateTimeRange>(lastUpdatedTimes);
    }

    /**
     * <p>
     * A list of the most recent dates and times that the entity was updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLastUpdatedTimes(java.util.Collection)} or {@link #withLastUpdatedTimes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lastUpdatedTimes
     *        A list of the most recent dates and times that the entity was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityFilter withLastUpdatedTimes(DateTimeRange... lastUpdatedTimes) {
        if (this.lastUpdatedTimes == null) {
            setLastUpdatedTimes(new java.util.ArrayList<DateTimeRange>(lastUpdatedTimes.length));
        }
        for (DateTimeRange ele : lastUpdatedTimes) {
            this.lastUpdatedTimes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the most recent dates and times that the entity was updated.
     * </p>
     * 
     * @param lastUpdatedTimes
     *        A list of the most recent dates and times that the entity was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityFilter withLastUpdatedTimes(java.util.Collection<DateTimeRange> lastUpdatedTimes) {
        setLastUpdatedTimes(lastUpdatedTimes);
        return this;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * 
     * @return A map of entity tags attached to the affected entity.
     */

    public java.util.List<java.util.Map<String, String>> getTags() {
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

    public void setTags(java.util.Collection<java.util.Map<String, String>> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<java.util.Map<String, String>>(tags);
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A map of entity tags attached to the affected entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityFilter withTags(java.util.Map<String, String>... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<java.util.Map<String, String>>(tags.length));
        }
        for (java.util.Map<String, String> ele : tags) {
            this.tags.add(ele);
        }
        return this;
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

    public EntityFilter withTags(java.util.Collection<java.util.Map<String, String>> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of entity status codes (<code>IMPAIRED</code>, <code>UNIMPAIRED</code>, or <code>UNKNOWN</code>).
     * </p>
     * 
     * @return A list of entity status codes (<code>IMPAIRED</code>, <code>UNIMPAIRED</code>, or <code>UNKNOWN</code>).
     * @see EntityStatusCode
     */

    public java.util.List<String> getStatusCodes() {
        return statusCodes;
    }

    /**
     * <p>
     * A list of entity status codes (<code>IMPAIRED</code>, <code>UNIMPAIRED</code>, or <code>UNKNOWN</code>).
     * </p>
     * 
     * @param statusCodes
     *        A list of entity status codes (<code>IMPAIRED</code>, <code>UNIMPAIRED</code>, or <code>UNKNOWN</code>).
     * @see EntityStatusCode
     */

    public void setStatusCodes(java.util.Collection<String> statusCodes) {
        if (statusCodes == null) {
            this.statusCodes = null;
            return;
        }

        this.statusCodes = new java.util.ArrayList<String>(statusCodes);
    }

    /**
     * <p>
     * A list of entity status codes (<code>IMPAIRED</code>, <code>UNIMPAIRED</code>, or <code>UNKNOWN</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusCodes(java.util.Collection)} or {@link #withStatusCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statusCodes
     *        A list of entity status codes (<code>IMPAIRED</code>, <code>UNIMPAIRED</code>, or <code>UNKNOWN</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatusCode
     */

    public EntityFilter withStatusCodes(String... statusCodes) {
        if (this.statusCodes == null) {
            setStatusCodes(new java.util.ArrayList<String>(statusCodes.length));
        }
        for (String ele : statusCodes) {
            this.statusCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of entity status codes (<code>IMPAIRED</code>, <code>UNIMPAIRED</code>, or <code>UNKNOWN</code>).
     * </p>
     * 
     * @param statusCodes
     *        A list of entity status codes (<code>IMPAIRED</code>, <code>UNIMPAIRED</code>, or <code>UNKNOWN</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatusCode
     */

    public EntityFilter withStatusCodes(java.util.Collection<String> statusCodes) {
        setStatusCodes(statusCodes);
        return this;
    }

    /**
     * <p>
     * A list of entity status codes (<code>IMPAIRED</code>, <code>UNIMPAIRED</code>, or <code>UNKNOWN</code>).
     * </p>
     * 
     * @param statusCodes
     *        A list of entity status codes (<code>IMPAIRED</code>, <code>UNIMPAIRED</code>, or <code>UNKNOWN</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatusCode
     */

    public EntityFilter withStatusCodes(EntityStatusCode... statusCodes) {
        java.util.ArrayList<String> statusCodesCopy = new java.util.ArrayList<String>(statusCodes.length);
        for (EntityStatusCode value : statusCodes) {
            statusCodesCopy.add(value.toString());
        }
        if (getStatusCodes() == null) {
            setStatusCodes(statusCodesCopy);
        } else {
            getStatusCodes().addAll(statusCodesCopy);
        }
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
        if (getEventArns() != null)
            sb.append("EventArns: ").append(getEventArns()).append(",");
        if (getEntityArns() != null)
            sb.append("EntityArns: ").append(getEntityArns()).append(",");
        if (getEntityValues() != null)
            sb.append("EntityValues: ").append(getEntityValues()).append(",");
        if (getLastUpdatedTimes() != null)
            sb.append("LastUpdatedTimes: ").append(getLastUpdatedTimes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStatusCodes() != null)
            sb.append("StatusCodes: ").append(getStatusCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityFilter == false)
            return false;
        EntityFilter other = (EntityFilter) obj;
        if (other.getEventArns() == null ^ this.getEventArns() == null)
            return false;
        if (other.getEventArns() != null && other.getEventArns().equals(this.getEventArns()) == false)
            return false;
        if (other.getEntityArns() == null ^ this.getEntityArns() == null)
            return false;
        if (other.getEntityArns() != null && other.getEntityArns().equals(this.getEntityArns()) == false)
            return false;
        if (other.getEntityValues() == null ^ this.getEntityValues() == null)
            return false;
        if (other.getEntityValues() != null && other.getEntityValues().equals(this.getEntityValues()) == false)
            return false;
        if (other.getLastUpdatedTimes() == null ^ this.getLastUpdatedTimes() == null)
            return false;
        if (other.getLastUpdatedTimes() != null && other.getLastUpdatedTimes().equals(this.getLastUpdatedTimes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStatusCodes() == null ^ this.getStatusCodes() == null)
            return false;
        if (other.getStatusCodes() != null && other.getStatusCodes().equals(this.getStatusCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventArns() == null) ? 0 : getEventArns().hashCode());
        hashCode = prime * hashCode + ((getEntityArns() == null) ? 0 : getEntityArns().hashCode());
        hashCode = prime * hashCode + ((getEntityValues() == null) ? 0 : getEntityValues().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimes() == null) ? 0 : getLastUpdatedTimes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStatusCodes() == null) ? 0 : getStatusCodes().hashCode());
        return hashCode;
    }

    @Override
    public EntityFilter clone() {
        try {
            return (EntityFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.EntityFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
