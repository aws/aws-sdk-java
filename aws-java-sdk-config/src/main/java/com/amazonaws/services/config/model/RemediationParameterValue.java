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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value is either a dynamic (resource) value or a static value. You must select either a dynamic value or a static
 * value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/RemediationParameterValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemediationParameterValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value is dynamic and changes at run-time.
     * </p>
     */
    private ResourceValue resourceValue;
    /**
     * <p>
     * The value is static and does not change at run-time.
     * </p>
     */
    private StaticValue staticValue;

    /**
     * <p>
     * The value is dynamic and changes at run-time.
     * </p>
     * 
     * @param resourceValue
     *        The value is dynamic and changes at run-time.
     */

    public void setResourceValue(ResourceValue resourceValue) {
        this.resourceValue = resourceValue;
    }

    /**
     * <p>
     * The value is dynamic and changes at run-time.
     * </p>
     * 
     * @return The value is dynamic and changes at run-time.
     */

    public ResourceValue getResourceValue() {
        return this.resourceValue;
    }

    /**
     * <p>
     * The value is dynamic and changes at run-time.
     * </p>
     * 
     * @param resourceValue
     *        The value is dynamic and changes at run-time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationParameterValue withResourceValue(ResourceValue resourceValue) {
        setResourceValue(resourceValue);
        return this;
    }

    /**
     * <p>
     * The value is static and does not change at run-time.
     * </p>
     * 
     * @param staticValue
     *        The value is static and does not change at run-time.
     */

    public void setStaticValue(StaticValue staticValue) {
        this.staticValue = staticValue;
    }

    /**
     * <p>
     * The value is static and does not change at run-time.
     * </p>
     * 
     * @return The value is static and does not change at run-time.
     */

    public StaticValue getStaticValue() {
        return this.staticValue;
    }

    /**
     * <p>
     * The value is static and does not change at run-time.
     * </p>
     * 
     * @param staticValue
     *        The value is static and does not change at run-time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationParameterValue withStaticValue(StaticValue staticValue) {
        setStaticValue(staticValue);
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
        if (getResourceValue() != null)
            sb.append("ResourceValue: ").append(getResourceValue()).append(",");
        if (getStaticValue() != null)
            sb.append("StaticValue: ").append(getStaticValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemediationParameterValue == false)
            return false;
        RemediationParameterValue other = (RemediationParameterValue) obj;
        if (other.getResourceValue() == null ^ this.getResourceValue() == null)
            return false;
        if (other.getResourceValue() != null && other.getResourceValue().equals(this.getResourceValue()) == false)
            return false;
        if (other.getStaticValue() == null ^ this.getStaticValue() == null)
            return false;
        if (other.getStaticValue() != null && other.getStaticValue().equals(this.getStaticValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceValue() == null) ? 0 : getResourceValue().hashCode());
        hashCode = prime * hashCode + ((getStaticValue() == null) ? 0 : getStaticValue().hashCode());
        return hashCode;
    }

    @Override
    public RemediationParameterValue clone() {
        try {
            return (RemediationParameterValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.RemediationParameterValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
