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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ArrayPropertiesSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArrayPropertiesSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The size of the array job. This parameter is returned for parent array jobs.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The job index within the array that is associated with this job. This parameter is returned for children of array
     * jobs.
     * </p>
     */
    private Integer index;

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

    public ArrayPropertiesSummary withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The job index within the array that is associated with this job. This parameter is returned for children of array
     * jobs.
     * </p>
     * 
     * @param index
     *        The job index within the array that is associated with this job. This parameter is returned for children
     *        of array jobs.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The job index within the array that is associated with this job. This parameter is returned for children of array
     * jobs.
     * </p>
     * 
     * @return The job index within the array that is associated with this job. This parameter is returned for children
     *         of array jobs.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The job index within the array that is associated with this job. This parameter is returned for children of array
     * jobs.
     * </p>
     * 
     * @param index
     *        The job index within the array that is associated with this job. This parameter is returned for children
     *        of array jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayPropertiesSummary withIndex(Integer index) {
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

        if (obj instanceof ArrayPropertiesSummary == false)
            return false;
        ArrayPropertiesSummary other = (ArrayPropertiesSummary) obj;
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

        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        return hashCode;
    }

    @Override
    public ArrayPropertiesSummary clone() {
        try {
            return (ArrayPropertiesSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ArrayPropertiesSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
