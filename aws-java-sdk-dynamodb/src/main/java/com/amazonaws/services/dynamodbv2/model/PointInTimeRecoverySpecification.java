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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the settings used to enable point in time recovery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/PointInTimeRecoverySpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PointInTimeRecoverySpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     * </p>
     */
    private Boolean pointInTimeRecoveryEnabled;

    /**
     * <p>
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @param pointInTimeRecoveryEnabled
     *        Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     */

    public void setPointInTimeRecoveryEnabled(Boolean pointInTimeRecoveryEnabled) {
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
    }

    /**
     * <p>
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @return Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     */

    public Boolean getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }

    /**
     * <p>
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @param pointInTimeRecoveryEnabled
     *        Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PointInTimeRecoverySpecification withPointInTimeRecoveryEnabled(Boolean pointInTimeRecoveryEnabled) {
        setPointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @return Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     */

    public Boolean isPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
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
        if (getPointInTimeRecoveryEnabled() != null)
            sb.append("PointInTimeRecoveryEnabled: ").append(getPointInTimeRecoveryEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PointInTimeRecoverySpecification == false)
            return false;
        PointInTimeRecoverySpecification other = (PointInTimeRecoverySpecification) obj;
        if (other.getPointInTimeRecoveryEnabled() == null ^ this.getPointInTimeRecoveryEnabled() == null)
            return false;
        if (other.getPointInTimeRecoveryEnabled() != null && other.getPointInTimeRecoveryEnabled().equals(this.getPointInTimeRecoveryEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPointInTimeRecoveryEnabled() == null) ? 0 : getPointInTimeRecoveryEnabled().hashCode());
        return hashCode;
    }

    @Override
    public PointInTimeRecoverySpecification clone() {
        try {
            return (PointInTimeRecoverySpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.PointInTimeRecoverySpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
