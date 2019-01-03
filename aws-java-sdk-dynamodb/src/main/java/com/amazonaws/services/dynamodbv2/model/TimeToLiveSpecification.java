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
 * Represents the settings used to enable or disable Time to Live for the specified table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TimeToLiveSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeToLiveSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The name of the Time to Live attribute used to store the expiration time for items in the table.
     * </p>
     */
    private String attributeName;

    /**
     * <p>
     * Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @param enabled
     *        Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @return Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @param enabled
     *        Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeToLiveSpecification withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @return Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The name of the Time to Live attribute used to store the expiration time for items in the table.
     * </p>
     * 
     * @param attributeName
     *        The name of the Time to Live attribute used to store the expiration time for items in the table.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the Time to Live attribute used to store the expiration time for items in the table.
     * </p>
     * 
     * @return The name of the Time to Live attribute used to store the expiration time for items in the table.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the Time to Live attribute used to store the expiration time for items in the table.
     * </p>
     * 
     * @param attributeName
     *        The name of the Time to Live attribute used to store the expiration time for items in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeToLiveSpecification withAttributeName(String attributeName) {
        setAttributeName(attributeName);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeToLiveSpecification == false)
            return false;
        TimeToLiveSpecification other = (TimeToLiveSpecification) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public TimeToLiveSpecification clone() {
        try {
            return (TimeToLiveSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.TimeToLiveSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
