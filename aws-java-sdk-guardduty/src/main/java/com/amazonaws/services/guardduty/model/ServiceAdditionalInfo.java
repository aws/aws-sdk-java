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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional information about the generated finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ServiceAdditionalInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceAdditionalInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This field specifies the value of the additional information.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Describes the type of the additional information.
     * </p>
     */
    private String type;

    /**
     * <p>
     * This field specifies the value of the additional information.
     * </p>
     * 
     * @param value
     *        This field specifies the value of the additional information.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * This field specifies the value of the additional information.
     * </p>
     * 
     * @return This field specifies the value of the additional information.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * This field specifies the value of the additional information.
     * </p>
     * 
     * @param value
     *        This field specifies the value of the additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAdditionalInfo withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Describes the type of the additional information.
     * </p>
     * 
     * @param type
     *        Describes the type of the additional information.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Describes the type of the additional information.
     * </p>
     * 
     * @return Describes the type of the additional information.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Describes the type of the additional information.
     * </p>
     * 
     * @param type
     *        Describes the type of the additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAdditionalInfo withType(String type) {
        setType(type);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceAdditionalInfo == false)
            return false;
        ServiceAdditionalInfo other = (ServiceAdditionalInfo) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ServiceAdditionalInfo clone() {
        try {
            return (ServiceAdditionalInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ServiceAdditionalInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
