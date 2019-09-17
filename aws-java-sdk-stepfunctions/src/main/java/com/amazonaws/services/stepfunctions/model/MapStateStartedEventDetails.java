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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a Map state that was started.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/MapStateStartedEventDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MapStateStartedEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The size of the array for Map state iterations.
     * </p>
     */
    private Integer length;

    /**
     * <p>
     * The size of the array for Map state iterations.
     * </p>
     * 
     * @param length
     *        The size of the array for Map state iterations.
     */

    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * <p>
     * The size of the array for Map state iterations.
     * </p>
     * 
     * @return The size of the array for Map state iterations.
     */

    public Integer getLength() {
        return this.length;
    }

    /**
     * <p>
     * The size of the array for Map state iterations.
     * </p>
     * 
     * @param length
     *        The size of the array for Map state iterations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapStateStartedEventDetails withLength(Integer length) {
        setLength(length);
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
        if (getLength() != null)
            sb.append("Length: ").append(getLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MapStateStartedEventDetails == false)
            return false;
        MapStateStartedEventDetails other = (MapStateStartedEventDetails) obj;
        if (other.getLength() == null ^ this.getLength() == null)
            return false;
        if (other.getLength() != null && other.getLength().equals(this.getLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        return hashCode;
    }

    @Override
    public MapStateStartedEventDetails clone() {
        try {
            return (MapStateStartedEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.MapStateStartedEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
