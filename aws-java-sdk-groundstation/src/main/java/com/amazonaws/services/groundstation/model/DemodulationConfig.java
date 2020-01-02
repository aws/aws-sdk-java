/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the demodulation <code>Config</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DemodulationConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DemodulationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unvalidated JSON of a demodulation <code>Config</code>.
     * </p>
     */
    private String unvalidatedJSON;

    /**
     * <p>
     * Unvalidated JSON of a demodulation <code>Config</code>.
     * </p>
     * 
     * @param unvalidatedJSON
     *        Unvalidated JSON of a demodulation <code>Config</code>.
     */

    public void setUnvalidatedJSON(String unvalidatedJSON) {
        this.unvalidatedJSON = unvalidatedJSON;
    }

    /**
     * <p>
     * Unvalidated JSON of a demodulation <code>Config</code>.
     * </p>
     * 
     * @return Unvalidated JSON of a demodulation <code>Config</code>.
     */

    public String getUnvalidatedJSON() {
        return this.unvalidatedJSON;
    }

    /**
     * <p>
     * Unvalidated JSON of a demodulation <code>Config</code>.
     * </p>
     * 
     * @param unvalidatedJSON
     *        Unvalidated JSON of a demodulation <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DemodulationConfig withUnvalidatedJSON(String unvalidatedJSON) {
        setUnvalidatedJSON(unvalidatedJSON);
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
        if (getUnvalidatedJSON() != null)
            sb.append("UnvalidatedJSON: ").append(getUnvalidatedJSON());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DemodulationConfig == false)
            return false;
        DemodulationConfig other = (DemodulationConfig) obj;
        if (other.getUnvalidatedJSON() == null ^ this.getUnvalidatedJSON() == null)
            return false;
        if (other.getUnvalidatedJSON() != null && other.getUnvalidatedJSON().equals(this.getUnvalidatedJSON()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnvalidatedJSON() == null) ? 0 : getUnvalidatedJSON().hashCode());
        return hashCode;
    }

    @Override
    public DemodulationConfig clone() {
        try {
            return (DemodulationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.DemodulationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
