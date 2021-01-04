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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The filters applied to Data Store query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DatastoreFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatastoreFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows the user to filter Data Store results by name.
     * </p>
     */
    private String datastoreName;
    /**
     * <p>
     * Allows the user to filter Data Store results by status.
     * </p>
     */
    private String datastoreStatus;
    /**
     * <p>
     * A filter that allows the user to set cutoff dates for records. All Data Stores created before the specified date
     * will be included in the results.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * A filter that allows the user to set cutoff dates for records. All Data Stores created after the specified date
     * will be included in the results.
     * </p>
     */
    private java.util.Date createdAfter;

    /**
     * <p>
     * Allows the user to filter Data Store results by name.
     * </p>
     * 
     * @param datastoreName
     *        Allows the user to filter Data Store results by name.
     */

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    /**
     * <p>
     * Allows the user to filter Data Store results by name.
     * </p>
     * 
     * @return Allows the user to filter Data Store results by name.
     */

    public String getDatastoreName() {
        return this.datastoreName;
    }

    /**
     * <p>
     * Allows the user to filter Data Store results by name.
     * </p>
     * 
     * @param datastoreName
     *        Allows the user to filter Data Store results by name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreFilter withDatastoreName(String datastoreName) {
        setDatastoreName(datastoreName);
        return this;
    }

    /**
     * <p>
     * Allows the user to filter Data Store results by status.
     * </p>
     * 
     * @param datastoreStatus
     *        Allows the user to filter Data Store results by status.
     * @see DatastoreStatus
     */

    public void setDatastoreStatus(String datastoreStatus) {
        this.datastoreStatus = datastoreStatus;
    }

    /**
     * <p>
     * Allows the user to filter Data Store results by status.
     * </p>
     * 
     * @return Allows the user to filter Data Store results by status.
     * @see DatastoreStatus
     */

    public String getDatastoreStatus() {
        return this.datastoreStatus;
    }

    /**
     * <p>
     * Allows the user to filter Data Store results by status.
     * </p>
     * 
     * @param datastoreStatus
     *        Allows the user to filter Data Store results by status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public DatastoreFilter withDatastoreStatus(String datastoreStatus) {
        setDatastoreStatus(datastoreStatus);
        return this;
    }

    /**
     * <p>
     * Allows the user to filter Data Store results by status.
     * </p>
     * 
     * @param datastoreStatus
     *        Allows the user to filter Data Store results by status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public DatastoreFilter withDatastoreStatus(DatastoreStatus datastoreStatus) {
        this.datastoreStatus = datastoreStatus.toString();
        return this;
    }

    /**
     * <p>
     * A filter that allows the user to set cutoff dates for records. All Data Stores created before the specified date
     * will be included in the results.
     * </p>
     * 
     * @param createdBefore
     *        A filter that allows the user to set cutoff dates for records. All Data Stores created before the
     *        specified date will be included in the results.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * A filter that allows the user to set cutoff dates for records. All Data Stores created before the specified date
     * will be included in the results.
     * </p>
     * 
     * @return A filter that allows the user to set cutoff dates for records. All Data Stores created before the
     *         specified date will be included in the results.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * A filter that allows the user to set cutoff dates for records. All Data Stores created before the specified date
     * will be included in the results.
     * </p>
     * 
     * @param createdBefore
     *        A filter that allows the user to set cutoff dates for records. All Data Stores created before the
     *        specified date will be included in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreFilter withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * A filter that allows the user to set cutoff dates for records. All Data Stores created after the specified date
     * will be included in the results.
     * </p>
     * 
     * @param createdAfter
     *        A filter that allows the user to set cutoff dates for records. All Data Stores created after the specified
     *        date will be included in the results.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * A filter that allows the user to set cutoff dates for records. All Data Stores created after the specified date
     * will be included in the results.
     * </p>
     * 
     * @return A filter that allows the user to set cutoff dates for records. All Data Stores created after the
     *         specified date will be included in the results.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * A filter that allows the user to set cutoff dates for records. All Data Stores created after the specified date
     * will be included in the results.
     * </p>
     * 
     * @param createdAfter
     *        A filter that allows the user to set cutoff dates for records. All Data Stores created after the specified
     *        date will be included in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreFilter withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
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
        if (getDatastoreName() != null)
            sb.append("DatastoreName: ").append(getDatastoreName()).append(",");
        if (getDatastoreStatus() != null)
            sb.append("DatastoreStatus: ").append(getDatastoreStatus()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatastoreFilter == false)
            return false;
        DatastoreFilter other = (DatastoreFilter) obj;
        if (other.getDatastoreName() == null ^ this.getDatastoreName() == null)
            return false;
        if (other.getDatastoreName() != null && other.getDatastoreName().equals(this.getDatastoreName()) == false)
            return false;
        if (other.getDatastoreStatus() == null ^ this.getDatastoreStatus() == null)
            return false;
        if (other.getDatastoreStatus() != null && other.getDatastoreStatus().equals(this.getDatastoreStatus()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreName() == null) ? 0 : getDatastoreName().hashCode());
        hashCode = prime * hashCode + ((getDatastoreStatus() == null) ? 0 : getDatastoreStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        return hashCode;
    }

    @Override
    public DatastoreFilter clone() {
        try {
            return (DatastoreFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.healthlake.model.transform.DatastoreFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
