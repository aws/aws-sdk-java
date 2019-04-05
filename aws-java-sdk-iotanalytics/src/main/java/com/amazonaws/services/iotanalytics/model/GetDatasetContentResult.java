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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/GetDatasetContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDatasetContentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of "DatasetEntry" objects.
     * </p>
     */
    private java.util.List<DatasetEntry> entries;
    /**
     * <p>
     * The time when the request was made.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The status of the data set content.
     * </p>
     */
    private DatasetContentStatus status;

    /**
     * <p>
     * A list of "DatasetEntry" objects.
     * </p>
     * 
     * @return A list of "DatasetEntry" objects.
     */

    public java.util.List<DatasetEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * A list of "DatasetEntry" objects.
     * </p>
     * 
     * @param entries
     *        A list of "DatasetEntry" objects.
     */

    public void setEntries(java.util.Collection<DatasetEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<DatasetEntry>(entries);
    }

    /**
     * <p>
     * A list of "DatasetEntry" objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        A list of "DatasetEntry" objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatasetContentResult withEntries(DatasetEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<DatasetEntry>(entries.length));
        }
        for (DatasetEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of "DatasetEntry" objects.
     * </p>
     * 
     * @param entries
     *        A list of "DatasetEntry" objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatasetContentResult withEntries(java.util.Collection<DatasetEntry> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * The time when the request was made.
     * </p>
     * 
     * @param timestamp
     *        The time when the request was made.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time when the request was made.
     * </p>
     * 
     * @return The time when the request was made.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time when the request was made.
     * </p>
     * 
     * @param timestamp
     *        The time when the request was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatasetContentResult withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The status of the data set content.
     * </p>
     * 
     * @param status
     *        The status of the data set content.
     */

    public void setStatus(DatasetContentStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data set content.
     * </p>
     * 
     * @return The status of the data set content.
     */

    public DatasetContentStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data set content.
     * </p>
     * 
     * @param status
     *        The status of the data set content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatasetContentResult withStatus(DatasetContentStatus status) {
        setStatus(status);
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
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDatasetContentResult == false)
            return false;
        GetDatasetContentResult other = (GetDatasetContentResult) obj;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetDatasetContentResult clone() {
        try {
            return (GetDatasetContentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
