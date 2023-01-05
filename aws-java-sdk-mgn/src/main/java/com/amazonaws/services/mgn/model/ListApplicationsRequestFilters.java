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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Applications list filters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListApplicationsRequestFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationsRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter applications list by application ID.
     * </p>
     */
    private java.util.List<String> applicationIDs;
    /**
     * <p>
     * Filter applications list by archival status.
     * </p>
     */
    private Boolean isArchived;
    /**
     * <p>
     * Filter applications list by wave ID.
     * </p>
     */
    private java.util.List<String> waveIDs;

    /**
     * <p>
     * Filter applications list by application ID.
     * </p>
     * 
     * @return Filter applications list by application ID.
     */

    public java.util.List<String> getApplicationIDs() {
        return applicationIDs;
    }

    /**
     * <p>
     * Filter applications list by application ID.
     * </p>
     * 
     * @param applicationIDs
     *        Filter applications list by application ID.
     */

    public void setApplicationIDs(java.util.Collection<String> applicationIDs) {
        if (applicationIDs == null) {
            this.applicationIDs = null;
            return;
        }

        this.applicationIDs = new java.util.ArrayList<String>(applicationIDs);
    }

    /**
     * <p>
     * Filter applications list by application ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationIDs(java.util.Collection)} or {@link #withApplicationIDs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param applicationIDs
     *        Filter applications list by application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequestFilters withApplicationIDs(String... applicationIDs) {
        if (this.applicationIDs == null) {
            setApplicationIDs(new java.util.ArrayList<String>(applicationIDs.length));
        }
        for (String ele : applicationIDs) {
            this.applicationIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter applications list by application ID.
     * </p>
     * 
     * @param applicationIDs
     *        Filter applications list by application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequestFilters withApplicationIDs(java.util.Collection<String> applicationIDs) {
        setApplicationIDs(applicationIDs);
        return this;
    }

    /**
     * <p>
     * Filter applications list by archival status.
     * </p>
     * 
     * @param isArchived
     *        Filter applications list by archival status.
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * <p>
     * Filter applications list by archival status.
     * </p>
     * 
     * @return Filter applications list by archival status.
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Filter applications list by archival status.
     * </p>
     * 
     * @param isArchived
     *        Filter applications list by archival status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequestFilters withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * <p>
     * Filter applications list by archival status.
     * </p>
     * 
     * @return Filter applications list by archival status.
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Filter applications list by wave ID.
     * </p>
     * 
     * @return Filter applications list by wave ID.
     */

    public java.util.List<String> getWaveIDs() {
        return waveIDs;
    }

    /**
     * <p>
     * Filter applications list by wave ID.
     * </p>
     * 
     * @param waveIDs
     *        Filter applications list by wave ID.
     */

    public void setWaveIDs(java.util.Collection<String> waveIDs) {
        if (waveIDs == null) {
            this.waveIDs = null;
            return;
        }

        this.waveIDs = new java.util.ArrayList<String>(waveIDs);
    }

    /**
     * <p>
     * Filter applications list by wave ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWaveIDs(java.util.Collection)} or {@link #withWaveIDs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param waveIDs
     *        Filter applications list by wave ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequestFilters withWaveIDs(String... waveIDs) {
        if (this.waveIDs == null) {
            setWaveIDs(new java.util.ArrayList<String>(waveIDs.length));
        }
        for (String ele : waveIDs) {
            this.waveIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter applications list by wave ID.
     * </p>
     * 
     * @param waveIDs
     *        Filter applications list by wave ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequestFilters withWaveIDs(java.util.Collection<String> waveIDs) {
        setWaveIDs(waveIDs);
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
        if (getApplicationIDs() != null)
            sb.append("ApplicationIDs: ").append(getApplicationIDs()).append(",");
        if (getIsArchived() != null)
            sb.append("IsArchived: ").append(getIsArchived()).append(",");
        if (getWaveIDs() != null)
            sb.append("WaveIDs: ").append(getWaveIDs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationsRequestFilters == false)
            return false;
        ListApplicationsRequestFilters other = (ListApplicationsRequestFilters) obj;
        if (other.getApplicationIDs() == null ^ this.getApplicationIDs() == null)
            return false;
        if (other.getApplicationIDs() != null && other.getApplicationIDs().equals(this.getApplicationIDs()) == false)
            return false;
        if (other.getIsArchived() == null ^ this.getIsArchived() == null)
            return false;
        if (other.getIsArchived() != null && other.getIsArchived().equals(this.getIsArchived()) == false)
            return false;
        if (other.getWaveIDs() == null ^ this.getWaveIDs() == null)
            return false;
        if (other.getWaveIDs() != null && other.getWaveIDs().equals(this.getWaveIDs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationIDs() == null) ? 0 : getApplicationIDs().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode + ((getWaveIDs() == null) ? 0 : getWaveIDs().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationsRequestFilters clone() {
        try {
            return (ListApplicationsRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ListApplicationsRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
