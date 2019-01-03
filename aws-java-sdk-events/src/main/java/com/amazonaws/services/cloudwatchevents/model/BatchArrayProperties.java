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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and
 * 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target
 * is an AWS Batch job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/BatchArrayProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchArrayProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
     * </p>
     * 
     * @param size
     *        The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
     * </p>
     * 
     * @return The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
     * </p>
     * 
     * @param size
     *        The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchArrayProperties withSize(Integer size) {
        setSize(size);
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
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchArrayProperties == false)
            return false;
        BatchArrayProperties other = (BatchArrayProperties) obj;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public BatchArrayProperties clone() {
        try {
            return (BatchArrayProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.BatchArrayPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
