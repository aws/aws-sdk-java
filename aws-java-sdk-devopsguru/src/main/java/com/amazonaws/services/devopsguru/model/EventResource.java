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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The AWS resource that emitted an event. AWS resource events and metrics are analyzed by DevOps Guru to find anomalous
 * behavior and provide recommendations to improve your operational solutions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/EventResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of resource that emitted an event.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the resource that emitted an event.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that emitted an event.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The type of resource that emitted an event.
     * </p>
     * 
     * @param type
     *        The type of resource that emitted an event.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of resource that emitted an event.
     * </p>
     * 
     * @return The type of resource that emitted an event.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of resource that emitted an event.
     * </p>
     * 
     * @param type
     *        The type of resource that emitted an event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventResource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The name of the resource that emitted an event.
     * </p>
     * 
     * @param name
     *        The name of the resource that emitted an event.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource that emitted an event.
     * </p>
     * 
     * @return The name of the resource that emitted an event.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource that emitted an event.
     * </p>
     * 
     * @param name
     *        The name of the resource that emitted an event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventResource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that emitted an event.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource that emitted an event.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that emitted an event.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource that emitted an event.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that emitted an event.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource that emitted an event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventResource withArn(String arn) {
        setArn(arn);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventResource == false)
            return false;
        EventResource other = (EventResource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public EventResource clone() {
        try {
            return (EventResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.EventResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
