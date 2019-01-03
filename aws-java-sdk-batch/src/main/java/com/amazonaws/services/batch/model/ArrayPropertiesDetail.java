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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the array properties of a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ArrayPropertiesDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArrayPropertiesDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A summary of the number of array job children in each available job status. This parameter is returned for parent
     * array jobs.
     * </p>
     */
    private java.util.Map<String, Integer> statusSummary;
    /**
     * <p>
     * The size of the array job. This parameter is returned for parent array jobs.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The job index within the array that is associated with this job. This parameter is returned for array job
     * children.
     * </p>
     */
    private Integer index;

    /**
     * <p>
     * A summary of the number of array job children in each available job status. This parameter is returned for parent
     * array jobs.
     * </p>
     * 
     * @return A summary of the number of array job children in each available job status. This parameter is returned
     *         for parent array jobs.
     */

    public java.util.Map<String, Integer> getStatusSummary() {
        return statusSummary;
    }

    /**
     * <p>
     * A summary of the number of array job children in each available job status. This parameter is returned for parent
     * array jobs.
     * </p>
     * 
     * @param statusSummary
     *        A summary of the number of array job children in each available job status. This parameter is returned for
     *        parent array jobs.
     */

    public void setStatusSummary(java.util.Map<String, Integer> statusSummary) {
        this.statusSummary = statusSummary;
    }

    /**
     * <p>
     * A summary of the number of array job children in each available job status. This parameter is returned for parent
     * array jobs.
     * </p>
     * 
     * @param statusSummary
     *        A summary of the number of array job children in each available job status. This parameter is returned for
     *        parent array jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayPropertiesDetail withStatusSummary(java.util.Map<String, Integer> statusSummary) {
        setStatusSummary(statusSummary);
        return this;
    }

    public ArrayPropertiesDetail addStatusSummaryEntry(String key, Integer value) {
        if (null == this.statusSummary) {
            this.statusSummary = new java.util.HashMap<String, Integer>();
        }
        if (this.statusSummary.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.statusSummary.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StatusSummary.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayPropertiesDetail clearStatusSummaryEntries() {
        this.statusSummary = null;
        return this;
    }

    /**
     * <p>
     * The size of the array job. This parameter is returned for parent array jobs.
     * </p>
     * 
     * @param size
     *        The size of the array job. This parameter is returned for parent array jobs.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the array job. This parameter is returned for parent array jobs.
     * </p>
     * 
     * @return The size of the array job. This parameter is returned for parent array jobs.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the array job. This parameter is returned for parent array jobs.
     * </p>
     * 
     * @param size
     *        The size of the array job. This parameter is returned for parent array jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayPropertiesDetail withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The job index within the array that is associated with this job. This parameter is returned for array job
     * children.
     * </p>
     * 
     * @param index
     *        The job index within the array that is associated with this job. This parameter is returned for array job
     *        children.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The job index within the array that is associated with this job. This parameter is returned for array job
     * children.
     * </p>
     * 
     * @return The job index within the array that is associated with this job. This parameter is returned for array job
     *         children.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The job index within the array that is associated with this job. This parameter is returned for array job
     * children.
     * </p>
     * 
     * @param index
     *        The job index within the array that is associated with this job. This parameter is returned for array job
     *        children.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayPropertiesDetail withIndex(Integer index) {
        setIndex(index);
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
        if (getStatusSummary() != null)
            sb.append("StatusSummary: ").append(getStatusSummary()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArrayPropertiesDetail == false)
            return false;
        ArrayPropertiesDetail other = (ArrayPropertiesDetail) obj;
        if (other.getStatusSummary() == null ^ this.getStatusSummary() == null)
            return false;
        if (other.getStatusSummary() != null && other.getStatusSummary().equals(this.getStatusSummary()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusSummary() == null) ? 0 : getStatusSummary().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        return hashCode;
    }

    @Override
    public ArrayPropertiesDetail clone() {
        try {
            return (ArrayPropertiesDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ArrayPropertiesDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
