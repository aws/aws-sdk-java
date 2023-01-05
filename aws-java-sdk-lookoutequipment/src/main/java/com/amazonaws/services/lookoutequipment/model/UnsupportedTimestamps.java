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
 * Entity that comprises information abount unsupported timestamps in the dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UnsupportedTimestamps"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsupportedTimestamps implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the total number of unsupported timestamps across the ingested data.
     * </p>
     */
    private Integer totalNumberOfUnsupportedTimestamps;

    /**
     * <p>
     * Indicates the total number of unsupported timestamps across the ingested data.
     * </p>
     * 
     * @param totalNumberOfUnsupportedTimestamps
     *        Indicates the total number of unsupported timestamps across the ingested data.
     */

    public void setTotalNumberOfUnsupportedTimestamps(Integer totalNumberOfUnsupportedTimestamps) {
        this.totalNumberOfUnsupportedTimestamps = totalNumberOfUnsupportedTimestamps;
    }

    /**
     * <p>
     * Indicates the total number of unsupported timestamps across the ingested data.
     * </p>
     * 
     * @return Indicates the total number of unsupported timestamps across the ingested data.
     */

    public Integer getTotalNumberOfUnsupportedTimestamps() {
        return this.totalNumberOfUnsupportedTimestamps;
    }

    /**
     * <p>
     * Indicates the total number of unsupported timestamps across the ingested data.
     * </p>
     * 
     * @param totalNumberOfUnsupportedTimestamps
     *        Indicates the total number of unsupported timestamps across the ingested data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedTimestamps withTotalNumberOfUnsupportedTimestamps(Integer totalNumberOfUnsupportedTimestamps) {
        setTotalNumberOfUnsupportedTimestamps(totalNumberOfUnsupportedTimestamps);
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
        if (getTotalNumberOfUnsupportedTimestamps() != null)
            sb.append("TotalNumberOfUnsupportedTimestamps: ").append(getTotalNumberOfUnsupportedTimestamps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnsupportedTimestamps == false)
            return false;
        UnsupportedTimestamps other = (UnsupportedTimestamps) obj;
        if (other.getTotalNumberOfUnsupportedTimestamps() == null ^ this.getTotalNumberOfUnsupportedTimestamps() == null)
            return false;
        if (other.getTotalNumberOfUnsupportedTimestamps() != null
                && other.getTotalNumberOfUnsupportedTimestamps().equals(this.getTotalNumberOfUnsupportedTimestamps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalNumberOfUnsupportedTimestamps() == null) ? 0 : getTotalNumberOfUnsupportedTimestamps().hashCode());
        return hashCode;
    }

    @Override
    public UnsupportedTimestamps clone() {
        try {
            return (UnsupportedTimestamps) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.UnsupportedTimestampsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
