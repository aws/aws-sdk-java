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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListEventsFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventsFilters implements Serializable, Cloneable, StructuredPojo {

    private String dataSource;

    private String eventClass;

    private String eventSource;

    private EventTimeRange eventTimeRange;

    private String insightId;

    private ResourceCollection resourceCollection;

    /**
     * @param dataSource
     * @see EventDataSource
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * @return
     * @see EventDataSource
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * @param dataSource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventDataSource
     */

    public ListEventsFilters withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * @param dataSource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventDataSource
     */

    public ListEventsFilters withDataSource(EventDataSource dataSource) {
        this.dataSource = dataSource.toString();
        return this;
    }

    /**
     * @param eventClass
     * @see EventClass
     */

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    /**
     * @return
     * @see EventClass
     */

    public String getEventClass() {
        return this.eventClass;
    }

    /**
     * @param eventClass
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventClass
     */

    public ListEventsFilters withEventClass(String eventClass) {
        setEventClass(eventClass);
        return this;
    }

    /**
     * @param eventClass
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventClass
     */

    public ListEventsFilters withEventClass(EventClass eventClass) {
        this.eventClass = eventClass.toString();
        return this;
    }

    /**
     * @param eventSource
     */

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * @return
     */

    public String getEventSource() {
        return this.eventSource;
    }

    /**
     * @param eventSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventsFilters withEventSource(String eventSource) {
        setEventSource(eventSource);
        return this;
    }

    /**
     * @param eventTimeRange
     */

    public void setEventTimeRange(EventTimeRange eventTimeRange) {
        this.eventTimeRange = eventTimeRange;
    }

    /**
     * @return
     */

    public EventTimeRange getEventTimeRange() {
        return this.eventTimeRange;
    }

    /**
     * @param eventTimeRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventsFilters withEventTimeRange(EventTimeRange eventTimeRange) {
        setEventTimeRange(eventTimeRange);
        return this;
    }

    /**
     * @param insightId
     */

    public void setInsightId(String insightId) {
        this.insightId = insightId;
    }

    /**
     * @return
     */

    public String getInsightId() {
        return this.insightId;
    }

    /**
     * @param insightId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventsFilters withInsightId(String insightId) {
        setInsightId(insightId);
        return this;
    }

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

    public ListEventsFilters withResourceCollection(ResourceCollection resourceCollection) {
        setResourceCollection(resourceCollection);
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getEventClass() != null)
            sb.append("EventClass: ").append(getEventClass()).append(",");
        if (getEventSource() != null)
            sb.append("EventSource: ").append(getEventSource()).append(",");
        if (getEventTimeRange() != null)
            sb.append("EventTimeRange: ").append(getEventTimeRange()).append(",");
        if (getInsightId() != null)
            sb.append("InsightId: ").append(getInsightId()).append(",");
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEventsFilters == false)
            return false;
        ListEventsFilters other = (ListEventsFilters) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getEventClass() == null ^ this.getEventClass() == null)
            return false;
        if (other.getEventClass() != null && other.getEventClass().equals(this.getEventClass()) == false)
            return false;
        if (other.getEventSource() == null ^ this.getEventSource() == null)
            return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false)
            return false;
        if (other.getEventTimeRange() == null ^ this.getEventTimeRange() == null)
            return false;
        if (other.getEventTimeRange() != null && other.getEventTimeRange().equals(this.getEventTimeRange()) == false)
            return false;
        if (other.getInsightId() == null ^ this.getInsightId() == null)
            return false;
        if (other.getInsightId() != null && other.getInsightId().equals(this.getInsightId()) == false)
            return false;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getEventClass() == null) ? 0 : getEventClass().hashCode());
        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode());
        hashCode = prime * hashCode + ((getEventTimeRange() == null) ? 0 : getEventTimeRange().hashCode());
        hashCode = prime * hashCode + ((getInsightId() == null) ? 0 : getInsightId().hashCode());
        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        return hashCode;
    }

    @Override
    public ListEventsFilters clone() {
        try {
            return (ListEventsFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ListEventsFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
