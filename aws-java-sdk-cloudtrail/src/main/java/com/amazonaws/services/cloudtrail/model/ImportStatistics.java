/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides statistics for the specified <code>ImportID</code>. CloudTrail does not update import statistics in
 * real-time. Returned values for parameters such as <code>EventsCompleted</code> may be lower than the actual value,
 * because CloudTrail updates statistics incrementally over the course of the import.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ImportStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of S3 prefixes found for the import.
     * </p>
     */
    private Long prefixesFound;
    /**
     * <p>
     * The number of S3 prefixes that completed import.
     * </p>
     */
    private Long prefixesCompleted;
    /**
     * <p>
     * The number of log files that completed import.
     * </p>
     */
    private Long filesCompleted;
    /**
     * <p>
     * The number of trail events imported into the event data store.
     * </p>
     */
    private Long eventsCompleted;
    /**
     * <p>
     * The number of failed entries.
     * </p>
     */
    private Long failedEntries;

    /**
     * <p>
     * The number of S3 prefixes found for the import.
     * </p>
     * 
     * @param prefixesFound
     *        The number of S3 prefixes found for the import.
     */

    public void setPrefixesFound(Long prefixesFound) {
        this.prefixesFound = prefixesFound;
    }

    /**
     * <p>
     * The number of S3 prefixes found for the import.
     * </p>
     * 
     * @return The number of S3 prefixes found for the import.
     */

    public Long getPrefixesFound() {
        return this.prefixesFound;
    }

    /**
     * <p>
     * The number of S3 prefixes found for the import.
     * </p>
     * 
     * @param prefixesFound
     *        The number of S3 prefixes found for the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStatistics withPrefixesFound(Long prefixesFound) {
        setPrefixesFound(prefixesFound);
        return this;
    }

    /**
     * <p>
     * The number of S3 prefixes that completed import.
     * </p>
     * 
     * @param prefixesCompleted
     *        The number of S3 prefixes that completed import.
     */

    public void setPrefixesCompleted(Long prefixesCompleted) {
        this.prefixesCompleted = prefixesCompleted;
    }

    /**
     * <p>
     * The number of S3 prefixes that completed import.
     * </p>
     * 
     * @return The number of S3 prefixes that completed import.
     */

    public Long getPrefixesCompleted() {
        return this.prefixesCompleted;
    }

    /**
     * <p>
     * The number of S3 prefixes that completed import.
     * </p>
     * 
     * @param prefixesCompleted
     *        The number of S3 prefixes that completed import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStatistics withPrefixesCompleted(Long prefixesCompleted) {
        setPrefixesCompleted(prefixesCompleted);
        return this;
    }

    /**
     * <p>
     * The number of log files that completed import.
     * </p>
     * 
     * @param filesCompleted
     *        The number of log files that completed import.
     */

    public void setFilesCompleted(Long filesCompleted) {
        this.filesCompleted = filesCompleted;
    }

    /**
     * <p>
     * The number of log files that completed import.
     * </p>
     * 
     * @return The number of log files that completed import.
     */

    public Long getFilesCompleted() {
        return this.filesCompleted;
    }

    /**
     * <p>
     * The number of log files that completed import.
     * </p>
     * 
     * @param filesCompleted
     *        The number of log files that completed import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStatistics withFilesCompleted(Long filesCompleted) {
        setFilesCompleted(filesCompleted);
        return this;
    }

    /**
     * <p>
     * The number of trail events imported into the event data store.
     * </p>
     * 
     * @param eventsCompleted
     *        The number of trail events imported into the event data store.
     */

    public void setEventsCompleted(Long eventsCompleted) {
        this.eventsCompleted = eventsCompleted;
    }

    /**
     * <p>
     * The number of trail events imported into the event data store.
     * </p>
     * 
     * @return The number of trail events imported into the event data store.
     */

    public Long getEventsCompleted() {
        return this.eventsCompleted;
    }

    /**
     * <p>
     * The number of trail events imported into the event data store.
     * </p>
     * 
     * @param eventsCompleted
     *        The number of trail events imported into the event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStatistics withEventsCompleted(Long eventsCompleted) {
        setEventsCompleted(eventsCompleted);
        return this;
    }

    /**
     * <p>
     * The number of failed entries.
     * </p>
     * 
     * @param failedEntries
     *        The number of failed entries.
     */

    public void setFailedEntries(Long failedEntries) {
        this.failedEntries = failedEntries;
    }

    /**
     * <p>
     * The number of failed entries.
     * </p>
     * 
     * @return The number of failed entries.
     */

    public Long getFailedEntries() {
        return this.failedEntries;
    }

    /**
     * <p>
     * The number of failed entries.
     * </p>
     * 
     * @param failedEntries
     *        The number of failed entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStatistics withFailedEntries(Long failedEntries) {
        setFailedEntries(failedEntries);
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
        if (getPrefixesFound() != null)
            sb.append("PrefixesFound: ").append(getPrefixesFound()).append(",");
        if (getPrefixesCompleted() != null)
            sb.append("PrefixesCompleted: ").append(getPrefixesCompleted()).append(",");
        if (getFilesCompleted() != null)
            sb.append("FilesCompleted: ").append(getFilesCompleted()).append(",");
        if (getEventsCompleted() != null)
            sb.append("EventsCompleted: ").append(getEventsCompleted()).append(",");
        if (getFailedEntries() != null)
            sb.append("FailedEntries: ").append(getFailedEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportStatistics == false)
            return false;
        ImportStatistics other = (ImportStatistics) obj;
        if (other.getPrefixesFound() == null ^ this.getPrefixesFound() == null)
            return false;
        if (other.getPrefixesFound() != null && other.getPrefixesFound().equals(this.getPrefixesFound()) == false)
            return false;
        if (other.getPrefixesCompleted() == null ^ this.getPrefixesCompleted() == null)
            return false;
        if (other.getPrefixesCompleted() != null && other.getPrefixesCompleted().equals(this.getPrefixesCompleted()) == false)
            return false;
        if (other.getFilesCompleted() == null ^ this.getFilesCompleted() == null)
            return false;
        if (other.getFilesCompleted() != null && other.getFilesCompleted().equals(this.getFilesCompleted()) == false)
            return false;
        if (other.getEventsCompleted() == null ^ this.getEventsCompleted() == null)
            return false;
        if (other.getEventsCompleted() != null && other.getEventsCompleted().equals(this.getEventsCompleted()) == false)
            return false;
        if (other.getFailedEntries() == null ^ this.getFailedEntries() == null)
            return false;
        if (other.getFailedEntries() != null && other.getFailedEntries().equals(this.getFailedEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefixesFound() == null) ? 0 : getPrefixesFound().hashCode());
        hashCode = prime * hashCode + ((getPrefixesCompleted() == null) ? 0 : getPrefixesCompleted().hashCode());
        hashCode = prime * hashCode + ((getFilesCompleted() == null) ? 0 : getFilesCompleted().hashCode());
        hashCode = prime * hashCode + ((getEventsCompleted() == null) ? 0 : getEventsCompleted().hashCode());
        hashCode = prime * hashCode + ((getFailedEntries() == null) ? 0 : getFailedEntries().hashCode());
        return hashCode;
    }

    @Override
    public ImportStatistics clone() {
        try {
            return (ImportStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.ImportStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
