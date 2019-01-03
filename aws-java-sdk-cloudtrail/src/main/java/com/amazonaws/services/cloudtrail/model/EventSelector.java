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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use event selectors to further specify the management and data event settings for your trail. By default, trails
 * created without specific event selectors will be configured to log all read and write management events, and no data
 * events. When an event occurs in your account, CloudTrail evaluates the event selector for all trails. For each trail,
 * if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event
 * selector, the trail doesn't log the event.
 * </p>
 * <p>
 * You can configure up to five event selectors for a trail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/EventSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2
     * <code>GetConsoleOutput</code> is a read-only API operation and <code>RunInstances</code> is a write-only API
     * operation.
     * </p>
     * <p>
     * By default, the value is <code>All</code>.
     * </p>
     */
    private String readWriteType;
    /**
     * <p>
     * Specify if you want your event selector to include management events for your trail.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-management-events"
     * >Management Events</a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     * <p>
     * By default, the value is <code>true</code>.
     * </p>
     */
    private Boolean includeManagementEvents;
    /**
     * <p>
     * CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up to 250
     * resources for an individual event selector, but the total number of data resources cannot exceed 250 across all
     * event selectors in a trail. This limit does not apply if you configure resource logging for all data events.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-data-events"
     * >Data Events</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Limits in AWS
     * CloudTrail</a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DataResource> dataResources;

    /**
     * <p>
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2
     * <code>GetConsoleOutput</code> is a read-only API operation and <code>RunInstances</code> is a write-only API
     * operation.
     * </p>
     * <p>
     * By default, the value is <code>All</code>.
     * </p>
     * 
     * @param readWriteType
     *        Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2
     *        <code>GetConsoleOutput</code> is a read-only API operation and <code>RunInstances</code> is a write-only
     *        API operation.</p>
     *        <p>
     *        By default, the value is <code>All</code>.
     * @see ReadWriteType
     */

    public void setReadWriteType(String readWriteType) {
        this.readWriteType = readWriteType;
    }

    /**
     * <p>
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2
     * <code>GetConsoleOutput</code> is a read-only API operation and <code>RunInstances</code> is a write-only API
     * operation.
     * </p>
     * <p>
     * By default, the value is <code>All</code>.
     * </p>
     * 
     * @return Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2
     *         <code>GetConsoleOutput</code> is a read-only API operation and <code>RunInstances</code> is a write-only
     *         API operation.</p>
     *         <p>
     *         By default, the value is <code>All</code>.
     * @see ReadWriteType
     */

    public String getReadWriteType() {
        return this.readWriteType;
    }

    /**
     * <p>
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2
     * <code>GetConsoleOutput</code> is a read-only API operation and <code>RunInstances</code> is a write-only API
     * operation.
     * </p>
     * <p>
     * By default, the value is <code>All</code>.
     * </p>
     * 
     * @param readWriteType
     *        Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2
     *        <code>GetConsoleOutput</code> is a read-only API operation and <code>RunInstances</code> is a write-only
     *        API operation.</p>
     *        <p>
     *        By default, the value is <code>All</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadWriteType
     */

    public EventSelector withReadWriteType(String readWriteType) {
        setReadWriteType(readWriteType);
        return this;
    }

    /**
     * <p>
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2
     * <code>GetConsoleOutput</code> is a read-only API operation and <code>RunInstances</code> is a write-only API
     * operation.
     * </p>
     * <p>
     * By default, the value is <code>All</code>.
     * </p>
     * 
     * @param readWriteType
     *        Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2
     *        <code>GetConsoleOutput</code> is a read-only API operation and <code>RunInstances</code> is a write-only
     *        API operation.</p>
     *        <p>
     *        By default, the value is <code>All</code>.
     * @see ReadWriteType
     */

    public void setReadWriteType(ReadWriteType readWriteType) {
        withReadWriteType(readWriteType);
    }

    /**
     * <p>
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2
     * <code>GetConsoleOutput</code> is a read-only API operation and <code>RunInstances</code> is a write-only API
     * operation.
     * </p>
     * <p>
     * By default, the value is <code>All</code>.
     * </p>
     * 
     * @param readWriteType
     *        Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2
     *        <code>GetConsoleOutput</code> is a read-only API operation and <code>RunInstances</code> is a write-only
     *        API operation.</p>
     *        <p>
     *        By default, the value is <code>All</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadWriteType
     */

    public EventSelector withReadWriteType(ReadWriteType readWriteType) {
        this.readWriteType = readWriteType.toString();
        return this;
    }

    /**
     * <p>
     * Specify if you want your event selector to include management events for your trail.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-management-events"
     * >Management Events</a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     * <p>
     * By default, the value is <code>true</code>.
     * </p>
     * 
     * @param includeManagementEvents
     *        Specify if you want your event selector to include management events for your trail.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-management-events"
     *        >Management Events</a> in the <i>AWS CloudTrail User Guide</i>.
     *        </p>
     *        <p>
     *        By default, the value is <code>true</code>.
     */

    public void setIncludeManagementEvents(Boolean includeManagementEvents) {
        this.includeManagementEvents = includeManagementEvents;
    }

    /**
     * <p>
     * Specify if you want your event selector to include management events for your trail.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-management-events"
     * >Management Events</a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     * <p>
     * By default, the value is <code>true</code>.
     * </p>
     * 
     * @return Specify if you want your event selector to include management events for your trail.</p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-management-events"
     *         >Management Events</a> in the <i>AWS CloudTrail User Guide</i>.
     *         </p>
     *         <p>
     *         By default, the value is <code>true</code>.
     */

    public Boolean getIncludeManagementEvents() {
        return this.includeManagementEvents;
    }

    /**
     * <p>
     * Specify if you want your event selector to include management events for your trail.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-management-events"
     * >Management Events</a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     * <p>
     * By default, the value is <code>true</code>.
     * </p>
     * 
     * @param includeManagementEvents
     *        Specify if you want your event selector to include management events for your trail.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-management-events"
     *        >Management Events</a> in the <i>AWS CloudTrail User Guide</i>.
     *        </p>
     *        <p>
     *        By default, the value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSelector withIncludeManagementEvents(Boolean includeManagementEvents) {
        setIncludeManagementEvents(includeManagementEvents);
        return this;
    }

    /**
     * <p>
     * Specify if you want your event selector to include management events for your trail.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-management-events"
     * >Management Events</a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     * <p>
     * By default, the value is <code>true</code>.
     * </p>
     * 
     * @return Specify if you want your event selector to include management events for your trail.</p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-management-events"
     *         >Management Events</a> in the <i>AWS CloudTrail User Guide</i>.
     *         </p>
     *         <p>
     *         By default, the value is <code>true</code>.
     */

    public Boolean isIncludeManagementEvents() {
        return this.includeManagementEvents;
    }

    /**
     * <p>
     * CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up to 250
     * resources for an individual event selector, but the total number of data resources cannot exceed 250 across all
     * event selectors in a trail. This limit does not apply if you configure resource logging for all data events.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-data-events"
     * >Data Events</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Limits in AWS
     * CloudTrail</a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     * 
     * @return CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up
     *         to 250 resources for an individual event selector, but the total number of data resources cannot exceed
     *         250 across all event selectors in a trail. This limit does not apply if you configure resource logging
     *         for all data events. </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-data-events"
     *         >Data Events</a> and <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Limits in
     *         AWS CloudTrail</a> in the <i>AWS CloudTrail User Guide</i>.
     */

    public java.util.List<DataResource> getDataResources() {
        if (dataResources == null) {
            dataResources = new com.amazonaws.internal.SdkInternalList<DataResource>();
        }
        return dataResources;
    }

    /**
     * <p>
     * CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up to 250
     * resources for an individual event selector, but the total number of data resources cannot exceed 250 across all
     * event selectors in a trail. This limit does not apply if you configure resource logging for all data events.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-data-events"
     * >Data Events</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Limits in AWS
     * CloudTrail</a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     * 
     * @param dataResources
     *        CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up
     *        to 250 resources for an individual event selector, but the total number of data resources cannot exceed
     *        250 across all event selectors in a trail. This limit does not apply if you configure resource logging for
     *        all data events. </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-data-events"
     *        >Data Events</a> and <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Limits in
     *        AWS CloudTrail</a> in the <i>AWS CloudTrail User Guide</i>.
     */

    public void setDataResources(java.util.Collection<DataResource> dataResources) {
        if (dataResources == null) {
            this.dataResources = null;
            return;
        }

        this.dataResources = new com.amazonaws.internal.SdkInternalList<DataResource>(dataResources);
    }

    /**
     * <p>
     * CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up to 250
     * resources for an individual event selector, but the total number of data resources cannot exceed 250 across all
     * event selectors in a trail. This limit does not apply if you configure resource logging for all data events.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-data-events"
     * >Data Events</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Limits in AWS
     * CloudTrail</a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataResources(java.util.Collection)} or {@link #withDataResources(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataResources
     *        CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up
     *        to 250 resources for an individual event selector, but the total number of data resources cannot exceed
     *        250 across all event selectors in a trail. This limit does not apply if you configure resource logging for
     *        all data events. </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-data-events"
     *        >Data Events</a> and <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Limits in
     *        AWS CloudTrail</a> in the <i>AWS CloudTrail User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSelector withDataResources(DataResource... dataResources) {
        if (this.dataResources == null) {
            setDataResources(new com.amazonaws.internal.SdkInternalList<DataResource>(dataResources.length));
        }
        for (DataResource ele : dataResources) {
            this.dataResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up to 250
     * resources for an individual event selector, but the total number of data resources cannot exceed 250 across all
     * event selectors in a trail. This limit does not apply if you configure resource logging for all data events.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-data-events"
     * >Data Events</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Limits in AWS
     * CloudTrail</a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     * 
     * @param dataResources
     *        CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up
     *        to 250 resources for an individual event selector, but the total number of data resources cannot exceed
     *        250 across all event selectors in a trail. This limit does not apply if you configure resource logging for
     *        all data events. </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html#logging-data-events"
     *        >Data Events</a> and <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Limits in
     *        AWS CloudTrail</a> in the <i>AWS CloudTrail User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSelector withDataResources(java.util.Collection<DataResource> dataResources) {
        setDataResources(dataResources);
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
        if (getReadWriteType() != null)
            sb.append("ReadWriteType: ").append(getReadWriteType()).append(",");
        if (getIncludeManagementEvents() != null)
            sb.append("IncludeManagementEvents: ").append(getIncludeManagementEvents()).append(",");
        if (getDataResources() != null)
            sb.append("DataResources: ").append(getDataResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventSelector == false)
            return false;
        EventSelector other = (EventSelector) obj;
        if (other.getReadWriteType() == null ^ this.getReadWriteType() == null)
            return false;
        if (other.getReadWriteType() != null && other.getReadWriteType().equals(this.getReadWriteType()) == false)
            return false;
        if (other.getIncludeManagementEvents() == null ^ this.getIncludeManagementEvents() == null)
            return false;
        if (other.getIncludeManagementEvents() != null && other.getIncludeManagementEvents().equals(this.getIncludeManagementEvents()) == false)
            return false;
        if (other.getDataResources() == null ^ this.getDataResources() == null)
            return false;
        if (other.getDataResources() != null && other.getDataResources().equals(this.getDataResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReadWriteType() == null) ? 0 : getReadWriteType().hashCode());
        hashCode = prime * hashCode + ((getIncludeManagementEvents() == null) ? 0 : getIncludeManagementEvents().hashCode());
        hashCode = prime * hashCode + ((getDataResources() == null) ? 0 : getDataResources().hashCode());
        return hashCode;
    }

    @Override
    public EventSelector clone() {
        try {
            return (EventSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.EventSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
