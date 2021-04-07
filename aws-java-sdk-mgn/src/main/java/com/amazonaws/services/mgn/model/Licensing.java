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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configure Licensing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/Licensing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Licensing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configure BYOL OS licensing.
     * </p>
     */
    private Boolean osByol;

    /**
     * <p>
     * Configure BYOL OS licensing.
     * </p>
     * 
     * @param osByol
     *        Configure BYOL OS licensing.
     */

    public void setOsByol(Boolean osByol) {
        this.osByol = osByol;
    }

    /**
     * <p>
     * Configure BYOL OS licensing.
     * </p>
     * 
     * @return Configure BYOL OS licensing.
     */

    public Boolean getOsByol() {
        return this.osByol;
    }

    /**
     * <p>
     * Configure BYOL OS licensing.
     * </p>
     * 
     * @param osByol
     *        Configure BYOL OS licensing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Licensing withOsByol(Boolean osByol) {
        setOsByol(osByol);
        return this;
    }

    /**
     * <p>
     * Configure BYOL OS licensing.
     * </p>
     * 
     * @return Configure BYOL OS licensing.
     */

    public Boolean isOsByol() {
        return this.osByol;
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
        if (getOsByol() != null)
            sb.append("OsByol: ").append(getOsByol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Licensing == false)
            return false;
        Licensing other = (Licensing) obj;
        if (other.getOsByol() == null ^ this.getOsByol() == null)
            return false;
        if (other.getOsByol() != null && other.getOsByol().equals(this.getOsByol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOsByol() == null) ? 0 : getOsByol().hashCode());
        return hashCode;
    }

    @Override
    public Licensing clone() {
        try {
            return (Licensing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.LicensingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
