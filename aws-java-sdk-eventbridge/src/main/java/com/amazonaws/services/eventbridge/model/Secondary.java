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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The secondary Region that processes events when failover is triggered or replication is enabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/Secondary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Secondary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the secondary Region.
     * </p>
     */
    private String route;

    /**
     * <p>
     * Defines the secondary Region.
     * </p>
     * 
     * @param route
     *        Defines the secondary Region.
     */

    public void setRoute(String route) {
        this.route = route;
    }

    /**
     * <p>
     * Defines the secondary Region.
     * </p>
     * 
     * @return Defines the secondary Region.
     */

    public String getRoute() {
        return this.route;
    }

    /**
     * <p>
     * Defines the secondary Region.
     * </p>
     * 
     * @param route
     *        Defines the secondary Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Secondary withRoute(String route) {
        setRoute(route);
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
        if (getRoute() != null)
            sb.append("Route: ").append(getRoute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Secondary == false)
            return false;
        Secondary other = (Secondary) obj;
        if (other.getRoute() == null ^ this.getRoute() == null)
            return false;
        if (other.getRoute() != null && other.getRoute().equals(this.getRoute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoute() == null) ? 0 : getRoute().hashCode());
        return hashCode;
    }

    @Override
    public Secondary clone() {
        try {
            return (Secondary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.SecondaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
