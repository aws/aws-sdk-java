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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The mitigation applied to a DDoS attack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/Mitigation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Mitigation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the mitigation taken for this attack.
     * </p>
     */
    private String mitigationName;

    /**
     * <p>
     * The name of the mitigation taken for this attack.
     * </p>
     * 
     * @param mitigationName
     *        The name of the mitigation taken for this attack.
     */

    public void setMitigationName(String mitigationName) {
        this.mitigationName = mitigationName;
    }

    /**
     * <p>
     * The name of the mitigation taken for this attack.
     * </p>
     * 
     * @return The name of the mitigation taken for this attack.
     */

    public String getMitigationName() {
        return this.mitigationName;
    }

    /**
     * <p>
     * The name of the mitigation taken for this attack.
     * </p>
     * 
     * @param mitigationName
     *        The name of the mitigation taken for this attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mitigation withMitigationName(String mitigationName) {
        setMitigationName(mitigationName);
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
        if (getMitigationName() != null)
            sb.append("MitigationName: ").append(getMitigationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mitigation == false)
            return false;
        Mitigation other = (Mitigation) obj;
        if (other.getMitigationName() == null ^ this.getMitigationName() == null)
            return false;
        if (other.getMitigationName() != null && other.getMitigationName().equals(this.getMitigationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMitigationName() == null) ? 0 : getMitigationName().hashCode());
        return hashCode;
    }

    @Override
    public Mitigation clone() {
        try {
            return (Mitigation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.MitigationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
