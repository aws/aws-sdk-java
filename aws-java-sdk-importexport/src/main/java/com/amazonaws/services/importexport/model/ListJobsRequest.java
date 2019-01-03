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
package com.amazonaws.services.importexport.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Input structure for the ListJobs operation.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private Integer maxJobs;

    private String marker;

    private String aPIVersion;

    /**
     * @param maxJobs
     */

    public void setMaxJobs(Integer maxJobs) {
        this.maxJobs = maxJobs;
    }

    /**
     * @return
     */

    public Integer getMaxJobs() {
        return this.maxJobs;
    }

    /**
     * @param maxJobs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withMaxJobs(Integer maxJobs) {
        setMaxJobs(maxJobs);
        return this;
    }

    /**
     * @param marker
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * @return
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * @param marker
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * @param aPIVersion
     */

    public void setAPIVersion(String aPIVersion) {
        this.aPIVersion = aPIVersion;
    }

    /**
     * @return
     */

    public String getAPIVersion() {
        return this.aPIVersion;
    }

    /**
     * @param aPIVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withAPIVersion(String aPIVersion) {
        setAPIVersion(aPIVersion);
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
        if (getMaxJobs() != null)
            sb.append("MaxJobs: ").append(getMaxJobs()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getAPIVersion() != null)
            sb.append("APIVersion: ").append(getAPIVersion());
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
        if (other.getMaxJobs() != null && other.getMaxJobs().equals(this.getMaxJobs()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getAPIVersion() == null ^ this.getAPIVersion() == null)
            return false;
        if (other.getAPIVersion() != null && other.getAPIVersion().equals(this.getAPIVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxJobs() == null) ? 0 : getMaxJobs().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getAPIVersion() == null) ? 0 : getAPIVersion().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsRequest clone() {
        return (ListJobsRequest) super.clone();
    }

}
