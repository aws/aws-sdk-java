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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filter configuration includes settings for manifest filtering, start and end times, and time delay that apply to all
 * of your egress requests for this manifest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/FilterConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Optionally specify one or more manifest filters for all of your manifest egress requests. When you include a
     * manifest filter, note that you cannot use an identical manifest filter query parameter for this manifest's
     * endpoint URL.
     * </p>
     */
    private String manifestFilter;
    /**
     * <p>
     * Optionally specify the start time for all of your manifest egress requests. When you include start time, note
     * that you cannot use start time query parameters for this manifest's endpoint URL.
     * </p>
     */
    private java.util.Date start;
    /**
     * <p>
     * Optionally specify the end time for all of your manifest egress requests. When you include end time, note that
     * you cannot use end time query parameters for this manifest's endpoint URL.
     * </p>
     */
    private java.util.Date end;
    /**
     * <p>
     * Optionally specify the time delay for all of your manifest egress requests. Enter a value that is smaller than
     * your endpoint's startover window. When you include time delay, note that you cannot use time delay query
     * parameters for this manifest's endpoint URL.
     * </p>
     */
    private Integer timeDelaySeconds;

    /**
     * <p>
     * Optionally specify one or more manifest filters for all of your manifest egress requests. When you include a
     * manifest filter, note that you cannot use an identical manifest filter query parameter for this manifest's
     * endpoint URL.
     * </p>
     * 
     * @param manifestFilter
     *        Optionally specify one or more manifest filters for all of your manifest egress requests. When you include
     *        a manifest filter, note that you cannot use an identical manifest filter query parameter for this
     *        manifest's endpoint URL.
     */

    public void setManifestFilter(String manifestFilter) {
        this.manifestFilter = manifestFilter;
    }

    /**
     * <p>
     * Optionally specify one or more manifest filters for all of your manifest egress requests. When you include a
     * manifest filter, note that you cannot use an identical manifest filter query parameter for this manifest's
     * endpoint URL.
     * </p>
     * 
     * @return Optionally specify one or more manifest filters for all of your manifest egress requests. When you
     *         include a manifest filter, note that you cannot use an identical manifest filter query parameter for this
     *         manifest's endpoint URL.
     */

    public String getManifestFilter() {
        return this.manifestFilter;
    }

    /**
     * <p>
     * Optionally specify one or more manifest filters for all of your manifest egress requests. When you include a
     * manifest filter, note that you cannot use an identical manifest filter query parameter for this manifest's
     * endpoint URL.
     * </p>
     * 
     * @param manifestFilter
     *        Optionally specify one or more manifest filters for all of your manifest egress requests. When you include
     *        a manifest filter, note that you cannot use an identical manifest filter query parameter for this
     *        manifest's endpoint URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterConfiguration withManifestFilter(String manifestFilter) {
        setManifestFilter(manifestFilter);
        return this;
    }

    /**
     * <p>
     * Optionally specify the start time for all of your manifest egress requests. When you include start time, note
     * that you cannot use start time query parameters for this manifest's endpoint URL.
     * </p>
     * 
     * @param start
     *        Optionally specify the start time for all of your manifest egress requests. When you include start time,
     *        note that you cannot use start time query parameters for this manifest's endpoint URL.
     */

    public void setStart(java.util.Date start) {
        this.start = start;
    }

    /**
     * <p>
     * Optionally specify the start time for all of your manifest egress requests. When you include start time, note
     * that you cannot use start time query parameters for this manifest's endpoint URL.
     * </p>
     * 
     * @return Optionally specify the start time for all of your manifest egress requests. When you include start time,
     *         note that you cannot use start time query parameters for this manifest's endpoint URL.
     */

    public java.util.Date getStart() {
        return this.start;
    }

    /**
     * <p>
     * Optionally specify the start time for all of your manifest egress requests. When you include start time, note
     * that you cannot use start time query parameters for this manifest's endpoint URL.
     * </p>
     * 
     * @param start
     *        Optionally specify the start time for all of your manifest egress requests. When you include start time,
     *        note that you cannot use start time query parameters for this manifest's endpoint URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterConfiguration withStart(java.util.Date start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * Optionally specify the end time for all of your manifest egress requests. When you include end time, note that
     * you cannot use end time query parameters for this manifest's endpoint URL.
     * </p>
     * 
     * @param end
     *        Optionally specify the end time for all of your manifest egress requests. When you include end time, note
     *        that you cannot use end time query parameters for this manifest's endpoint URL.
     */

    public void setEnd(java.util.Date end) {
        this.end = end;
    }

    /**
     * <p>
     * Optionally specify the end time for all of your manifest egress requests. When you include end time, note that
     * you cannot use end time query parameters for this manifest's endpoint URL.
     * </p>
     * 
     * @return Optionally specify the end time for all of your manifest egress requests. When you include end time, note
     *         that you cannot use end time query parameters for this manifest's endpoint URL.
     */

    public java.util.Date getEnd() {
        return this.end;
    }

    /**
     * <p>
     * Optionally specify the end time for all of your manifest egress requests. When you include end time, note that
     * you cannot use end time query parameters for this manifest's endpoint URL.
     * </p>
     * 
     * @param end
     *        Optionally specify the end time for all of your manifest egress requests. When you include end time, note
     *        that you cannot use end time query parameters for this manifest's endpoint URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterConfiguration withEnd(java.util.Date end) {
        setEnd(end);
        return this;
    }

    /**
     * <p>
     * Optionally specify the time delay for all of your manifest egress requests. Enter a value that is smaller than
     * your endpoint's startover window. When you include time delay, note that you cannot use time delay query
     * parameters for this manifest's endpoint URL.
     * </p>
     * 
     * @param timeDelaySeconds
     *        Optionally specify the time delay for all of your manifest egress requests. Enter a value that is smaller
     *        than your endpoint's startover window. When you include time delay, note that you cannot use time delay
     *        query parameters for this manifest's endpoint URL.
     */

    public void setTimeDelaySeconds(Integer timeDelaySeconds) {
        this.timeDelaySeconds = timeDelaySeconds;
    }

    /**
     * <p>
     * Optionally specify the time delay for all of your manifest egress requests. Enter a value that is smaller than
     * your endpoint's startover window. When you include time delay, note that you cannot use time delay query
     * parameters for this manifest's endpoint URL.
     * </p>
     * 
     * @return Optionally specify the time delay for all of your manifest egress requests. Enter a value that is smaller
     *         than your endpoint's startover window. When you include time delay, note that you cannot use time delay
     *         query parameters for this manifest's endpoint URL.
     */

    public Integer getTimeDelaySeconds() {
        return this.timeDelaySeconds;
    }

    /**
     * <p>
     * Optionally specify the time delay for all of your manifest egress requests. Enter a value that is smaller than
     * your endpoint's startover window. When you include time delay, note that you cannot use time delay query
     * parameters for this manifest's endpoint URL.
     * </p>
     * 
     * @param timeDelaySeconds
     *        Optionally specify the time delay for all of your manifest egress requests. Enter a value that is smaller
     *        than your endpoint's startover window. When you include time delay, note that you cannot use time delay
     *        query parameters for this manifest's endpoint URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterConfiguration withTimeDelaySeconds(Integer timeDelaySeconds) {
        setTimeDelaySeconds(timeDelaySeconds);
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
        if (getManifestFilter() != null)
            sb.append("ManifestFilter: ").append(getManifestFilter()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getEnd() != null)
            sb.append("End: ").append(getEnd()).append(",");
        if (getTimeDelaySeconds() != null)
            sb.append("TimeDelaySeconds: ").append(getTimeDelaySeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterConfiguration == false)
            return false;
        FilterConfiguration other = (FilterConfiguration) obj;
        if (other.getManifestFilter() == null ^ this.getManifestFilter() == null)
            return false;
        if (other.getManifestFilter() != null && other.getManifestFilter().equals(this.getManifestFilter()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getTimeDelaySeconds() == null ^ this.getTimeDelaySeconds() == null)
            return false;
        if (other.getTimeDelaySeconds() != null && other.getTimeDelaySeconds().equals(this.getTimeDelaySeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestFilter() == null) ? 0 : getManifestFilter().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getTimeDelaySeconds() == null) ? 0 : getTimeDelaySeconds().hashCode());
        return hashCode;
    }

    @Override
    public FilterConfiguration clone() {
        try {
            return (FilterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.FilterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
