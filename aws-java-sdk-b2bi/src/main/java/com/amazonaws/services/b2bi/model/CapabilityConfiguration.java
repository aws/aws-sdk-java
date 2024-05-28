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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A capability object. Currently, only EDI (electronic data interchange) capabilities are supported. A trading
 * capability contains the information required to transform incoming EDI documents into JSON or XML outputs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CapabilityConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapabilityConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An EDI (electronic data interchange) configuration object.
     * </p>
     */
    private EdiConfiguration edi;

    /**
     * <p>
     * An EDI (electronic data interchange) configuration object.
     * </p>
     * 
     * @param edi
     *        An EDI (electronic data interchange) configuration object.
     */

    public void setEdi(EdiConfiguration edi) {
        this.edi = edi;
    }

    /**
     * <p>
     * An EDI (electronic data interchange) configuration object.
     * </p>
     * 
     * @return An EDI (electronic data interchange) configuration object.
     */

    public EdiConfiguration getEdi() {
        return this.edi;
    }

    /**
     * <p>
     * An EDI (electronic data interchange) configuration object.
     * </p>
     * 
     * @param edi
     *        An EDI (electronic data interchange) configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapabilityConfiguration withEdi(EdiConfiguration edi) {
        setEdi(edi);
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
        if (getEdi() != null)
            sb.append("Edi: ").append(getEdi());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapabilityConfiguration == false)
            return false;
        CapabilityConfiguration other = (CapabilityConfiguration) obj;
        if (other.getEdi() == null ^ this.getEdi() == null)
            return false;
        if (other.getEdi() != null && other.getEdi().equals(this.getEdi()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdi() == null) ? 0 : getEdi().hashCode());
        return hashCode;
    }

    @Override
    public CapabilityConfiguration clone() {
        try {
            return (CapabilityConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.b2bi.model.transform.CapabilityConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
