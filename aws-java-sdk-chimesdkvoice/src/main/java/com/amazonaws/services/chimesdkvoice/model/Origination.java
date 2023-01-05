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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/Origination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Origination implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<OriginationRoute> routes;

    private Boolean disabled;

    /**
     * @return
     */

    public java.util.List<OriginationRoute> getRoutes() {
        return routes;
    }

    /**
     * @param routes
     */

    public void setRoutes(java.util.Collection<OriginationRoute> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new java.util.ArrayList<OriginationRoute>(routes);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutes(java.util.Collection)} or {@link #withRoutes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param routes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origination withRoutes(OriginationRoute... routes) {
        if (this.routes == null) {
            setRoutes(new java.util.ArrayList<OriginationRoute>(routes.length));
        }
        for (OriginationRoute ele : routes) {
            this.routes.add(ele);
        }
        return this;
    }

    /**
     * @param routes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origination withRoutes(java.util.Collection<OriginationRoute> routes) {
        setRoutes(routes);
        return this;
    }

    /**
     * @param disabled
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * @return
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @param disabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origination withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * @return
     */

    public Boolean isDisabled() {
        return this.disabled;
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
        if (getRoutes() != null)
            sb.append("Routes: ").append(getRoutes()).append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Origination == false)
            return false;
        Origination other = (Origination) obj;
        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        return hashCode;
    }

    @Override
    public Origination clone() {
        try {
            return (Origination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.OriginationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
