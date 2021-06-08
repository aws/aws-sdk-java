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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/CreateArchive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateArchiveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the archive to create.
     * </p>
     */
    private String archiveName;
    /**
     * <p>
     * The ARN of the event source associated with the archive.
     * </p>
     */
    private String eventSourceArn;
    /**
     * <p>
     * A description for the archive.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An event pattern to use to filter events sent to the archive.
     * </p>
     */
    private String eventPattern;
    /**
     * <p>
     * The number of days to retain events for. Default value is 0. If set to 0, events are retained indefinitely
     * </p>
     */
    private Integer retentionDays;

    /**
     * <p>
     * The name for the archive to create.
     * </p>
     * 
     * @param archiveName
     *        The name for the archive to create.
     */

    public void setArchiveName(String archiveName) {
        this.archiveName = archiveName;
    }

    /**
     * <p>
     * The name for the archive to create.
     * </p>
     * 
     * @return The name for the archive to create.
     */

    public String getArchiveName() {
        return this.archiveName;
    }

    /**
     * <p>
     * The name for the archive to create.
     * </p>
     * 
     * @param archiveName
     *        The name for the archive to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveRequest withArchiveName(String archiveName) {
        setArchiveName(archiveName);
        return this;
    }

    /**
     * <p>
     * The ARN of the event source associated with the archive.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the event source associated with the archive.
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the event source associated with the archive.
     * </p>
     * 
     * @return The ARN of the event source associated with the archive.
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the event source associated with the archive.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the event source associated with the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveRequest withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * A description for the archive.
     * </p>
     * 
     * @param description
     *        A description for the archive.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the archive.
     * </p>
     * 
     * @return A description for the archive.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the archive.
     * </p>
     * 
     * @param description
     *        A description for the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An event pattern to use to filter events sent to the archive.
     * </p>
     * 
     * @param eventPattern
     *        An event pattern to use to filter events sent to the archive.
     */

    public void setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
    }

    /**
     * <p>
     * An event pattern to use to filter events sent to the archive.
     * </p>
     * 
     * @return An event pattern to use to filter events sent to the archive.
     */

    public String getEventPattern() {
        return this.eventPattern;
    }

    /**
     * <p>
     * An event pattern to use to filter events sent to the archive.
     * </p>
     * 
     * @param eventPattern
     *        An event pattern to use to filter events sent to the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveRequest withEventPattern(String eventPattern) {
        setEventPattern(eventPattern);
        return this;
    }

    /**
     * <p>
     * The number of days to retain events for. Default value is 0. If set to 0, events are retained indefinitely
     * </p>
     * 
     * @param retentionDays
     *        The number of days to retain events for. Default value is 0. If set to 0, events are retained indefinitely
     */

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    /**
     * <p>
     * The number of days to retain events for. Default value is 0. If set to 0, events are retained indefinitely
     * </p>
     * 
     * @return The number of days to retain events for. Default value is 0. If set to 0, events are retained
     *         indefinitely
     */

    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * <p>
     * The number of days to retain events for. Default value is 0. If set to 0, events are retained indefinitely
     * </p>
     * 
     * @param retentionDays
     *        The number of days to retain events for. Default value is 0. If set to 0, events are retained indefinitely
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveRequest withRetentionDays(Integer retentionDays) {
        setRetentionDays(retentionDays);
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
        if (getArchiveName() != null)
            sb.append("ArchiveName: ").append(getArchiveName()).append(",");
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: ").append(getEventSourceArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventPattern() != null)
            sb.append("EventPattern: ").append(getEventPattern()).append(",");
        if (getRetentionDays() != null)
            sb.append("RetentionDays: ").append(getRetentionDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateArchiveRequest == false)
            return false;
        CreateArchiveRequest other = (CreateArchiveRequest) obj;
        if (other.getArchiveName() == null ^ this.getArchiveName() == null)
            return false;
        if (other.getArchiveName() != null && other.getArchiveName().equals(this.getArchiveName()) == false)
            return false;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventPattern() == null ^ this.getEventPattern() == null)
            return false;
        if (other.getEventPattern() != null && other.getEventPattern().equals(this.getEventPattern()) == false)
            return false;
        if (other.getRetentionDays() == null ^ this.getRetentionDays() == null)
            return false;
        if (other.getRetentionDays() != null && other.getRetentionDays().equals(this.getRetentionDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveName() == null) ? 0 : getArchiveName().hashCode());
        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventPattern() == null) ? 0 : getEventPattern().hashCode());
        hashCode = prime * hashCode + ((getRetentionDays() == null) ? 0 : getRetentionDays().hashCode());
        return hashCode;
    }

    @Override
    public CreateArchiveRequest clone() {
        return (CreateArchiveRequest) super.clone();
    }

}
