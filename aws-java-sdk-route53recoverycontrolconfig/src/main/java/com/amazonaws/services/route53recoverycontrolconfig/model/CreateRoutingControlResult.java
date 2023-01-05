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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateRoutingControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoutingControlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The routing control that is created.
     * </p>
     */
    private RoutingControl routingControl;

    /**
     * <p>
     * The routing control that is created.
     * </p>
     * 
     * @param routingControl
     *        The routing control that is created.
     */

    public void setRoutingControl(RoutingControl routingControl) {
        this.routingControl = routingControl;
    }

    /**
     * <p>
     * The routing control that is created.
     * </p>
     * 
     * @return The routing control that is created.
     */

    public RoutingControl getRoutingControl() {
        return this.routingControl;
    }

    /**
     * <p>
     * The routing control that is created.
     * </p>
     * 
     * @param routingControl
     *        The routing control that is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingControlResult withRoutingControl(RoutingControl routingControl) {
        setRoutingControl(routingControl);
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
        if (getRoutingControl() != null)
            sb.append("RoutingControl: ").append(getRoutingControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoutingControlResult == false)
            return false;
        CreateRoutingControlResult other = (CreateRoutingControlResult) obj;
        if (other.getRoutingControl() == null ^ this.getRoutingControl() == null)
            return false;
        if (other.getRoutingControl() != null && other.getRoutingControl().equals(this.getRoutingControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoutingControl() == null) ? 0 : getRoutingControl().hashCode());
        return hashCode;
    }

    @Override
    public CreateRoutingControlResult clone() {
        try {
            return (CreateRoutingControlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
