/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.importexport.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Input structure for the ListJobs operation.
 */
public class ListJobsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    private Integer maxJobs;

    private String marker;

    private String aPIVersion;

    /**
     * Sets the value of the MaxJobs property for this object.
     * 
     * @param maxJobs
     *        The new value for the MaxJobs property for this object.
     */
    public void setMaxJobs(Integer maxJobs) {
        this.maxJobs = maxJobs;
    }

    /**
     * Returns the value of the MaxJobs property for this object.
     * 
     * @return The value of the MaxJobs property for this object.
     */
    public Integer getMaxJobs() {
        return this.maxJobs;
    }

    /**
     * Sets the value of the MaxJobs property for this object.
     * 
     * @param maxJobs
     *        The new value for the MaxJobs property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListJobsRequest withMaxJobs(Integer maxJobs) {
        setMaxJobs(maxJobs);
        return this;
    }

    /**
     * Sets the value of the Marker property for this object.
     * 
     * @param marker
     *        The new value for the Marker property for this object.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * Returns the value of the Marker property for this object.
     * 
     * @return The value of the Marker property for this object.
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * Sets the value of the Marker property for this object.
     * 
     * @param marker
     *        The new value for the Marker property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListJobsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Sets the value of the APIVersion property for this object.
     * 
     * @param aPIVersion
     *        The new value for the APIVersion property for this object.
     */
    public void setAPIVersion(String aPIVersion) {
        this.aPIVersion = aPIVersion;
    }

    /**
     * Returns the value of the APIVersion property for this object.
     * 
     * @return The value of the APIVersion property for this object.
     */
    public String getAPIVersion() {
        return this.aPIVersion;
    }

    /**
     * Sets the value of the APIVersion property for this object.
     * 
     * @param aPIVersion
     *        The new value for the APIVersion property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListJobsRequest withAPIVersion(String aPIVersion) {
        setAPIVersion(aPIVersion);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMaxJobs() != null)
            sb.append("MaxJobs: " + getMaxJobs() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getAPIVersion() != null)
            sb.append("APIVersion: " + getAPIVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsRequest == false)
            return false;
        ListJobsRequest other = (ListJobsRequest) obj;
        if (other.getMaxJobs() == null ^ this.getMaxJobs() == null)
            return false;
        if (other.getMaxJobs() != null
                && other.getMaxJobs().equals(this.getMaxJobs()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getAPIVersion() == null ^ this.getAPIVersion() == null)
            return false;
        if (other.getAPIVersion() != null
                && other.getAPIVersion().equals(this.getAPIVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaxJobs() == null) ? 0 : getMaxJobs().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getAPIVersion() == null) ? 0 : getAPIVersion().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsRequest clone() {
        return (ListJobsRequest) super.clone();
    }
}