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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Entity that comprises information abount duplicate timestamps in the dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DuplicateTimestamps"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DuplicateTimestamps implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the total number of duplicate timestamps.
     * </p>
     */
    private Integer totalNumberOfDuplicateTimestamps;

    /**
     * <p>
     * Indicates the total number of duplicate timestamps.
     * </p>
     * 
     * @param totalNumberOfDuplicateTimestamps
     *        Indicates the total number of duplicate timestamps.
     */

    public void setTotalNumberOfDuplicateTimestamps(Integer totalNumberOfDuplicateTimestamps) {
        this.totalNumberOfDuplicateTimestamps = totalNumberOfDuplicateTimestamps;
    }

    /**
     * <p>
     * Indicates the total number of duplicate timestamps.
     * </p>
     * 
     * @return Indicates the total number of duplicate timestamps.
     */

    public Integer getTotalNumberOfDuplicateTimestamps() {
        return this.totalNumberOfDuplicateTimestamps;
    }

    /**
     * <p>
     * Indicates the total number of duplicate timestamps.
     * </p>
     * 
     * @param totalNumberOfDuplicateTimestamps
     *        Indicates the total number of duplicate timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DuplicateTimestamps withTotalNumberOfDuplicateTimestamps(Integer totalNumberOfDuplicateTimestamps) {
        setTotalNumberOfDuplicateTimestamps(totalNumberOfDuplicateTimestamps);
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
        if (getTotalNumberOfDuplicateTimestamps() != null)
            sb.append("TotalNumberOfDuplicateTimestamps: ").append(getTotalNumberOfDuplicateTimestamps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DuplicateTimestamps == false)
            return false;
        DuplicateTimestamps other = (DuplicateTimestamps) obj;
        if (other.getTotalNumberOfDuplicateTimestamps() == null ^ this.getTotalNumberOfDuplicateTimestamps() == null)
            return false;
        if (other.getTotalNumberOfDuplicateTimestamps() != null
                && other.getTotalNumberOfDuplicateTimestamps().equals(this.getTotalNumberOfDuplicateTimestamps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalNumberOfDuplicateTimestamps() == null) ? 0 : getTotalNumberOfDuplicateTimestamps().hashCode());
        return hashCode;
    }

    @Override
    public DuplicateTimestamps clone() {
        try {
            return (DuplicateTimestamps) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.DuplicateTimestampsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
