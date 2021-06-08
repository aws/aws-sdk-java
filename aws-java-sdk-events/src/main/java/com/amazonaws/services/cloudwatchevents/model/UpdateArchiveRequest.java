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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/UpdateArchive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateArchiveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the archive to update.
     * </p>
     */
    private String archiveName;
    /**
     * <p>
     * The description for the archive.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The event pattern to use to filter events sent to the archive.
     * </p>
     */
    private String eventPattern;
    /**
     * <p>
     * The number of days to retain events in the archive.
     * </p>
     */
    private Integer retentionDays;

    /**
     * <p>
     * The name of the archive to update.
     * </p>
     * 
     * @param archiveName
     *        The name of the archive to update.
     */

    public void setArchiveName(String archiveName) {
        this.archiveName = archiveName;
    }

    /**
     * <p>
     * The name of the archive to update.
     * </p>
     * 
     * @return The name of the archive to update.
     */

    public String getArchiveName() {
        return this.archiveName;
    }

    /**
     * <p>
     * The name of the archive to update.
     * </p>
     * 
     * @param archiveName
     *        The name of the archive to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArchiveRequest withArchiveName(String archiveName) {
        setArchiveName(archiveName);
        return this;
    }

    /**
     * <p>
     * The description for the archive.
     * </p>
     * 
     * @param description
     *        The description for the archive.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the archive.
     * </p>
     * 
     * @return The description for the archive.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the archive.
     * </p>
     * 
     * @param description
     *        The description for the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArchiveRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The event pattern to use to filter events sent to the archive.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern to use to filter events sent to the archive.
     */

    public void setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
    }

    /**
     * <p>
     * The event pattern to use to filter events sent to the archive.
     * </p>
     * 
     * @return The event pattern to use to filter events sent to the archive.
     */

    public String getEventPattern() {
        return this.eventPattern;
    }

    /**
     * <p>
     * The event pattern to use to filter events sent to the archive.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern to use to filter events sent to the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArchiveRequest withEventPattern(String eventPattern) {
        setEventPattern(eventPattern);
        return this;
    }

    /**
     * <p>
     * The number of days to retain events in the archive.
     * </p>
     * 
     * @param retentionDays
     *        The number of days to retain events in the archive.
     */

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    /**
     * <p>
     * The number of days to retain events in the archive.
     * </p>
     * 
     * @return The number of days to retain events in the archive.
     */

    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * <p>
     * The number of days to retain events in the archive.
     * </p>
     * 
     * @param retentionDays
     *        The number of days to retain events in the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArchiveRequest withRetentionDays(Integer retentionDays) {
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

        if (obj instanceof UpdateArchiveRequest == false)
            return false;
        UpdateArchiveRequest other = (UpdateArchiveRequest) obj;
        if (other.getArchiveName() == null ^ this.getArchiveName() == null)
            return false;
        if (other.getArchiveName() != null && other.getArchiveName().equals(this.getArchiveName()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventPattern() == null) ? 0 : getEventPattern().hashCode());
        hashCode = prime * hashCode + ((getRetentionDays() == null) ? 0 : getRetentionDays().hashCode());
        return hashCode;
    }

    @Override
    public UpdateArchiveRequest clone() {
        return (UpdateArchiveRequest) super.clone();
    }

}
