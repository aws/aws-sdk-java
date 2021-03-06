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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Updated Start of Authority (SOA) properties for a public or private DNS namespace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/SOAChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SOAChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The updated time to live (TTL) for purposes of negative caching.
     * </p>
     */
    private Long tTL;

    /**
     * <p>
     * The updated time to live (TTL) for purposes of negative caching.
     * </p>
     * 
     * @param tTL
     *        The updated time to live (TTL) for purposes of negative caching.
     */

    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * The updated time to live (TTL) for purposes of negative caching.
     * </p>
     * 
     * @return The updated time to live (TTL) for purposes of negative caching.
     */

    public Long getTTL() {
        return this.tTL;
    }

    /**
     * <p>
     * The updated time to live (TTL) for purposes of negative caching.
     * </p>
     * 
     * @param tTL
     *        The updated time to live (TTL) for purposes of negative caching.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SOAChange withTTL(Long tTL) {
        setTTL(tTL);
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
        if (getTTL() != null)
            sb.append("TTL: ").append(getTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SOAChange == false)
            return false;
        SOAChange other = (SOAChange) obj;
        if (other.getTTL() == null ^ this.getTTL() == null)
            return false;
        if (other.getTTL() != null && other.getTTL().equals(this.getTTL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode());
        return hashCode;
    }

    @Override
    public SOAChange clone() {
        try {
            return (SOAChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.SOAChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
