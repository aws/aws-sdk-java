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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An AWS resource event. AWS resource events and metrics are analyzed by DevOps Guru to find anomalous behavior and
 * provide recommendations to improve your operational solutions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/Event" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Event implements Serializable, Cloneable, StructuredPojo {

    private ResourceCollection resourceCollection;
    /**
     * <p>
     * The ID of the event.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A <code>Timestamp</code> that specifies the time the event occurred.
     * </p>
     */
    private java.util.Date time;
    /**
     * <p>
     * The AWS source that emitted the event.
     * </p>
     */
    private String eventSource;
    /**
     * <p>
     * The name of the event.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The source, <code>AWS_CLOUD_TRAIL</code> or <code>AWS_CODE_DEPLOY</code>, where DevOps Guru analysis found the
     * event.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * The class of the event. The class specifies what the event is related to, such as an infrastructure change, a
     * deployment, or a schema change.
     * </p>
     */
    private String eventClass;
    /**
     * <p>
     * An <code>EventResource</code> object that contains information about the resource that emitted the event.
     * </p>
     */
    private java.util.List<EventResource> resources;

    /**
     * @param resourceCollection
     */

    public void setResourceCollection(ResourceCollection resourceCollection) {
        this.resourceCollection = resourceCollection;
    }

    /**
     * @return
     */

    public ResourceCollection getResourceCollection() {
        return this.resourceCollection;
    }

    /**
     * @param resourceCollection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withResourceCollection(ResourceCollection resourceCollection) {
        setResourceCollection(resourceCollection);
        return this;
    }

    /**
     * <p>
     * The ID of the event.
     * </p>
     * 
     * @param id
     *        The ID of the event.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the event.
     * </p>
     * 
     * @return The ID of the event.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the event.
     * </p>
     * 
     * @param id
     *        The ID of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A <code>Timestamp</code> that specifies the time the event occurred.
     * </p>
     * 
     * @param time
     *        A <code>Timestamp</code> that specifies the time the event occurred.
     */

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * A <code>Timestamp</code> that specifies the time the event occurred.
     * </p>
     * 
     * @return A <code>Timestamp</code> that specifies the time the event occurred.
     */

    public java.util.Date getTime() {
        return this.time;
    }

    /**
     * <p>
     * A <code>Timestamp</code> that specifies the time the event occurred.
     * </p>
     * 
     * @param time
     *        A <code>Timestamp</code> that specifies the time the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withTime(java.util.Date time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The AWS source that emitted the event.
     * </p>
     * 
     * @param eventSource
     *        The AWS source that emitted the event.
     */

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * <p>
     * The AWS source that emitted the event.
     * </p>
     * 
     * @return The AWS source that emitted the event.
     */

    public String getEventSource() {
        return this.eventSource;
    }

    /**
     * <p>
     * The AWS source that emitted the event.
     * </p>
     * 
     * @param eventSource
     *        The AWS source that emitted the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventSource(String eventSource) {
        setEventSource(eventSource);
        return this;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * 
     * @param name
     *        The name of the event.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * 
     * @return The name of the event.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * 
     * @param name
     *        The name of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The source, <code>AWS_CLOUD_TRAIL</code> or <code>AWS_CODE_DEPLOY</code>, where DevOps Guru analysis found the
     * event.
     * </p>
     * 
     * @param dataSource
     *        The source, <code>AWS_CLOUD_TRAIL</code> or <code>AWS_CODE_DEPLOY</code>, where DevOps Guru analysis found
     *        the event.
     * @see EventDataSource
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The source, <code>AWS_CLOUD_TRAIL</code> or <code>AWS_CODE_DEPLOY</code>, where DevOps Guru analysis found the
     * event.
     * </p>
     * 
     * @return The source, <code>AWS_CLOUD_TRAIL</code> or <code>AWS_CODE_DEPLOY</code>, where DevOps Guru analysis
     *         found the event.
     * @see EventDataSource
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The source, <code>AWS_CLOUD_TRAIL</code> or <code>AWS_CODE_DEPLOY</code>, where DevOps Guru analysis found the
     * event.
     * </p>
     * 
     * @param dataSource
     *        The source, <code>AWS_CLOUD_TRAIL</code> or <code>AWS_CODE_DEPLOY</code>, where DevOps Guru analysis found
     *        the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventDataSource
     */

    public Event withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The source, <code>AWS_CLOUD_TRAIL</code> or <code>AWS_CODE_DEPLOY</code>, where DevOps Guru analysis found the
     * event.
     * </p>
     * 
     * @param dataSource
     *        The source, <code>AWS_CLOUD_TRAIL</code> or <code>AWS_CODE_DEPLOY</code>, where DevOps Guru analysis found
     *        the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventDataSource
     */

    public Event withDataSource(EventDataSource dataSource) {
        this.dataSource = dataSource.toString();
        return this;
    }

    /**
     * <p>
     * The class of the event. The class specifies what the event is related to, such as an infrastructure change, a
     * deployment, or a schema change.
     * </p>
     * 
     * @param eventClass
     *        The class of the event. The class specifies what the event is related to, such as an infrastructure
     *        change, a deployment, or a schema change.
     * @see EventClass
     */

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    /**
     * <p>
     * The class of the event. The class specifies what the event is related to, such as an infrastructure change, a
     * deployment, or a schema change.
     * </p>
     * 
     * @return The class of the event. The class specifies what the event is related to, such as an infrastructure
     *         change, a deployment, or a schema change.
     * @see EventClass
     */

    public String getEventClass() {
        return this.eventClass;
    }

    /**
     * <p>
     * The class of the event. The class specifies what the event is related to, such as an infrastructure change, a
     * deployment, or a schema change.
     * </p>
     * 
     * @param eventClass
     *        The class of the event. The class specifies what the event is related to, such as an infrastructure
     *        change, a deployment, or a schema change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventClass
     */

    public Event withEventClass(String eventClass) {
        setEventClass(eventClass);
        return this;
    }

    /**
     * <p>
     * The class of the event. The class specifies what the event is related to, such as an infrastructure change, a
     * deployment, or a schema change.
     * </p>
     * 
     * @param eventClass
     *        The class of the event. The class specifies what the event is related to, such as an infrastructure
     *        change, a deployment, or a schema change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventClass
     */

    public Event withEventClass(EventClass eventClass) {
        this.eventClass = eventClass.toString();
        return this;
    }

    /**
     * <p>
     * An <code>EventResource</code> object that contains information about the resource that emitted the event.
     * </p>
     * 
     * @return An <code>EventResource</code> object that contains information about the resource that emitted the event.
     */

    public java.util.List<EventResource> getResources() {
        return resources;
    }

    /**
     * <p>
     * An <code>EventResource</code> object that contains information about the resource that emitted the event.
     * </p>
     * 
     * @param resources
     *        An <code>EventResource</code> object that contains information about the resource that emitted the event.
     */

    public void setResources(java.util.Collection<EventResource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<EventResource>(resources);
    }

    /**
     * <p>
     * An <code>EventResource</code> object that contains information about the resource that emitted the event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        An <code>EventResource</code> object that contains information about the resource that emitted the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withResources(EventResource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<EventResource>(resources.length));
        }
        for (EventResource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An <code>EventResource</code> object that contains information about the resource that emitted the event.
     * </p>
     * 
     * @param resources
     *        An <code>EventResource</code> object that contains information about the resource that emitted the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withResources(java.util.Collection<EventResource> resources) {
        setResources(resources);
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
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getEventSource() != null)
            sb.append("EventSource: ").append(getEventSource()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getEventClass() != null)
            sb.append("EventClass: ").append(getEventClass()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getEventSource() == null ^ this.getEventSource() == null)
            return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getEventClass() == null ^ this.getEventClass() == null)
            return false;
        if (other.getEventClass() != null && other.getEventClass().equals(this.getEventClass()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getEventClass() == null) ? 0 : getEventClass().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public Event clone() {
        try {
            return (Event) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.EventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
