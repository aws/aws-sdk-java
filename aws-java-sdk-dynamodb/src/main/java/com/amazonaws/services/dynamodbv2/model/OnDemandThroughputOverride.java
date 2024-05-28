/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Overrides the on-demand throughput settings for this replica table. If you don't specify a value for this parameter,
 * it uses the source table's on-demand throughput settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/OnDemandThroughputOverride"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnDemandThroughputOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum number of read request units for the specified replica table.
     * </p>
     */
    private Long maxReadRequestUnits;

    /**
     * <p>
     * Maximum number of read request units for the specified replica table.
     * </p>
     * 
     * @param maxReadRequestUnits
     *        Maximum number of read request units for the specified replica table.
     */

    public void setMaxReadRequestUnits(Long maxReadRequestUnits) {
        this.maxReadRequestUnits = maxReadRequestUnits;
    }

    /**
     * <p>
     * Maximum number of read request units for the specified replica table.
     * </p>
     * 
     * @return Maximum number of read request units for the specified replica table.
     */

    public Long getMaxReadRequestUnits() {
        return this.maxReadRequestUnits;
    }

    /**
     * <p>
     * Maximum number of read request units for the specified replica table.
     * </p>
     * 
     * @param maxReadRequestUnits
     *        Maximum number of read request units for the specified replica table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDemandThroughputOverride withMaxReadRequestUnits(Long maxReadRequestUnits) {
        setMaxReadRequestUnits(maxReadRequestUnits);
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
        if (getMaxReadRequestUnits() != null)
            sb.append("MaxReadRequestUnits: ").append(getMaxReadRequestUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnDemandThroughputOverride == false)
            return false;
        OnDemandThroughputOverride other = (OnDemandThroughputOverride) obj;
        if (other.getMaxReadRequestUnits() == null ^ this.getMaxReadRequestUnits() == null)
            return false;
        if (other.getMaxReadRequestUnits() != null && other.getMaxReadRequestUnits().equals(this.getMaxReadRequestUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxReadRequestUnits() == null) ? 0 : getMaxReadRequestUnits().hashCode());
        return hashCode;
    }

    @Override
    public OnDemandThroughputOverride clone() {
        try {
            return (OnDemandThroughputOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.OnDemandThroughputOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
