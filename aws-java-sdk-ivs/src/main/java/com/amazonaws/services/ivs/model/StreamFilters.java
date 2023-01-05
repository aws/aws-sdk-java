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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object specifying the stream attribute on which to filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StreamFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The stream’s health.
     * </p>
     */
    private String health;

    /**
     * <p>
     * The stream’s health.
     * </p>
     * 
     * @param health
     *        The stream’s health.
     * @see StreamHealth
     */

    public void setHealth(String health) {
        this.health = health;
    }

    /**
     * <p>
     * The stream’s health.
     * </p>
     * 
     * @return The stream’s health.
     * @see StreamHealth
     */

    public String getHealth() {
        return this.health;
    }

    /**
     * <p>
     * The stream’s health.
     * </p>
     * 
     * @param health
     *        The stream’s health.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamHealth
     */

    public StreamFilters withHealth(String health) {
        setHealth(health);
        return this;
    }

    /**
     * <p>
     * The stream’s health.
     * </p>
     * 
     * @param health
     *        The stream’s health.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamHealth
     */

    public StreamFilters withHealth(StreamHealth health) {
        this.health = health.toString();
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
        if (getHealth() != null)
            sb.append("Health: ").append(getHealth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamFilters == false)
            return false;
        StreamFilters other = (StreamFilters) obj;
        if (other.getHealth() == null ^ this.getHealth() == null)
            return false;
        if (other.getHealth() != null && other.getHealth().equals(this.getHealth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealth() == null) ? 0 : getHealth().hashCode());
        return hashCode;
    }

    @Override
    public StreamFilters clone() {
        try {
            return (StreamFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.StreamFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
