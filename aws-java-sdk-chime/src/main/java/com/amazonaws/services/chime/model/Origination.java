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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Origination settings enable your SIP hosts to receive inbound calls using your Amazon Chime Voice Connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/Origination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Origination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum value of
     * 20.
     * </p>
     */
    private java.util.List<OriginationRoute> routes;
    /**
     * <p>
     * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
     * </p>
     */
    private Boolean disabled;

    /**
     * <p>
     * The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum value of
     * 20.
     * </p>
     * 
     * @return The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum
     *         value of 20.
     */

    public java.util.List<OriginationRoute> getRoutes() {
        return routes;
    }

    /**
     * <p>
     * The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum value of
     * 20.
     * </p>
     * 
     * @param routes
     *        The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum
     *        value of 20.
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
     * The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum value of
     * 20.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutes(java.util.Collection)} or {@link #withRoutes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param routes
     *        The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum
     *        value of 20.
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
     * <p>
     * The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum value of
     * 20.
     * </p>
     * 
     * @param routes
     *        The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum
     *        value of 20.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origination withRoutes(java.util.Collection<OriginationRoute> routes) {
        setRoutes(routes);
        return this;
    }

    /**
     * <p>
     * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
     * </p>
     * 
     * @param disabled
     *        When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice
     *        Connector.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
     * </p>
     * 
     * @return When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice
     *         Connector.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
     * </p>
     * 
     * @param disabled
     *        When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice
     *        Connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origination withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
     * </p>
     * 
     * @return When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice
     *         Connector.
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
        com.amazonaws.services.chime.model.transform.OriginationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
