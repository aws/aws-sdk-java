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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies capacity units configured for your index. You can add and remove capacity units to tune an index to your
 * requirements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CapacityUnitsConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityUnitsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of extra storage capacity for an index. Each capacity unit provides 150 Gb of storage space or 500,000
     * documents, whichever is reached first.
     * </p>
     */
    private Integer storageCapacityUnits;
    /**
     * <p>
     * The amount of extra query capacity for an index. Each capacity unit provides 0.5 queries per second and 40,000
     * queries per day.
     * </p>
     */
    private Integer queryCapacityUnits;

    /**
     * <p>
     * The amount of extra storage capacity for an index. Each capacity unit provides 150 Gb of storage space or 500,000
     * documents, whichever is reached first.
     * </p>
     * 
     * @param storageCapacityUnits
     *        The amount of extra storage capacity for an index. Each capacity unit provides 150 Gb of storage space or
     *        500,000 documents, whichever is reached first.
     */

    public void setStorageCapacityUnits(Integer storageCapacityUnits) {
        this.storageCapacityUnits = storageCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra storage capacity for an index. Each capacity unit provides 150 Gb of storage space or 500,000
     * documents, whichever is reached first.
     * </p>
     * 
     * @return The amount of extra storage capacity for an index. Each capacity unit provides 150 Gb of storage space or
     *         500,000 documents, whichever is reached first.
     */

    public Integer getStorageCapacityUnits() {
        return this.storageCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra storage capacity for an index. Each capacity unit provides 150 Gb of storage space or 500,000
     * documents, whichever is reached first.
     * </p>
     * 
     * @param storageCapacityUnits
     *        The amount of extra storage capacity for an index. Each capacity unit provides 150 Gb of storage space or
     *        500,000 documents, whichever is reached first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityUnitsConfiguration withStorageCapacityUnits(Integer storageCapacityUnits) {
        setStorageCapacityUnits(storageCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The amount of extra query capacity for an index. Each capacity unit provides 0.5 queries per second and 40,000
     * queries per day.
     * </p>
     * 
     * @param queryCapacityUnits
     *        The amount of extra query capacity for an index. Each capacity unit provides 0.5 queries per second and
     *        40,000 queries per day.
     */

    public void setQueryCapacityUnits(Integer queryCapacityUnits) {
        this.queryCapacityUnits = queryCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra query capacity for an index. Each capacity unit provides 0.5 queries per second and 40,000
     * queries per day.
     * </p>
     * 
     * @return The amount of extra query capacity for an index. Each capacity unit provides 0.5 queries per second and
     *         40,000 queries per day.
     */

    public Integer getQueryCapacityUnits() {
        return this.queryCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra query capacity for an index. Each capacity unit provides 0.5 queries per second and 40,000
     * queries per day.
     * </p>
     * 
     * @param queryCapacityUnits
     *        The amount of extra query capacity for an index. Each capacity unit provides 0.5 queries per second and
     *        40,000 queries per day.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityUnitsConfiguration withQueryCapacityUnits(Integer queryCapacityUnits) {
        setQueryCapacityUnits(queryCapacityUnits);
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
        if (getStorageCapacityUnits() != null)
            sb.append("StorageCapacityUnits: ").append(getStorageCapacityUnits()).append(",");
        if (getQueryCapacityUnits() != null)
            sb.append("QueryCapacityUnits: ").append(getQueryCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityUnitsConfiguration == false)
            return false;
        CapacityUnitsConfiguration other = (CapacityUnitsConfiguration) obj;
        if (other.getStorageCapacityUnits() == null ^ this.getStorageCapacityUnits() == null)
            return false;
        if (other.getStorageCapacityUnits() != null && other.getStorageCapacityUnits().equals(this.getStorageCapacityUnits()) == false)
            return false;
        if (other.getQueryCapacityUnits() == null ^ this.getQueryCapacityUnits() == null)
            return false;
        if (other.getQueryCapacityUnits() != null && other.getQueryCapacityUnits().equals(this.getQueryCapacityUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageCapacityUnits() == null) ? 0 : getStorageCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getQueryCapacityUnits() == null) ? 0 : getQueryCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public CapacityUnitsConfiguration clone() {
        try {
            return (CapacityUnitsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.CapacityUnitsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
