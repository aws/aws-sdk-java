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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a route in a route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/Route" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Route implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of destination for the route.
     * </p>
     */
    private String destinationType;
    /**
     * <p>
     * The type of target for the route.
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * The destination of the route.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The route's target.
     * </p>
     */
    private String target;

    /**
     * <p>
     * The type of destination for the route.
     * </p>
     * 
     * @param destinationType
     *        The type of destination for the route.
     * @see DestinationType
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * The type of destination for the route.
     * </p>
     * 
     * @return The type of destination for the route.
     * @see DestinationType
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * <p>
     * The type of destination for the route.
     * </p>
     * 
     * @param destinationType
     *        The type of destination for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public Route withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * <p>
     * The type of destination for the route.
     * </p>
     * 
     * @param destinationType
     *        The type of destination for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public Route withDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType.toString();
        return this;
    }

    /**
     * <p>
     * The type of target for the route.
     * </p>
     * 
     * @param targetType
     *        The type of target for the route.
     * @see TargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of target for the route.
     * </p>
     * 
     * @return The type of target for the route.
     * @see TargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The type of target for the route.
     * </p>
     * 
     * @param targetType
     *        The type of target for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public Route withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The type of target for the route.
     * </p>
     * 
     * @param targetType
     *        The type of target for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public Route withTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * The destination of the route.
     * </p>
     * 
     * @param destination
     *        The destination of the route.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination of the route.
     * </p>
     * 
     * @return The destination of the route.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination of the route.
     * </p>
     * 
     * @param destination
     *        The destination of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Route withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The route's target.
     * </p>
     * 
     * @param target
     *        The route's target.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The route's target.
     * </p>
     * 
     * @return The route's target.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The route's target.
     * </p>
     * 
     * @param target
     *        The route's target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Route withTarget(String target) {
        setTarget(target);
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
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Route == false)
            return false;
        Route other = (Route) obj;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public Route clone() {
        try {
            return (Route) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.RouteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
