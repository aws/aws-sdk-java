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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Amazon Web Services Region in which Amazon Web Services Control Tower expects to find the control deployed.
 * </p>
 * <p>
 * The expected Regions are based on the Regions that are governed by the landing zone. In certain cases, a control is
 * not actually enabled in the Region as expected, such as during drift, or <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/region-how.html#mixed-governance">mixed
 * governance</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/Region" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Region implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Region name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Web Services Region name.
     * </p>
     * 
     * @param name
     *        The Amazon Web Services Region name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The Amazon Web Services Region name.
     * </p>
     * 
     * @return The Amazon Web Services Region name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The Amazon Web Services Region name.
     * </p>
     * 
     * @param name
     *        The Amazon Web Services Region name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Region withName(String name) {
        setName(name);
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
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Region == false)
            return false;
        Region other = (Region) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public Region clone() {
        try {
            return (Region) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.RegionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
