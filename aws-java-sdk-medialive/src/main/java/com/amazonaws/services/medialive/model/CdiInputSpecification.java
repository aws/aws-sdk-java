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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for CdiInputSpecification
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CdiInputSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CdiInputSpecification implements Serializable, Cloneable, StructuredPojo {

    /** Maximum CDI input resolution */
    private String resolution;

    /**
     * Maximum CDI input resolution
     * 
     * @param resolution
     *        Maximum CDI input resolution
     * @see CdiInputResolution
     */

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * Maximum CDI input resolution
     * 
     * @return Maximum CDI input resolution
     * @see CdiInputResolution
     */

    public String getResolution() {
        return this.resolution;
    }

    /**
     * Maximum CDI input resolution
     * 
     * @param resolution
     *        Maximum CDI input resolution
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CdiInputResolution
     */

    public CdiInputSpecification withResolution(String resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * Maximum CDI input resolution
     * 
     * @param resolution
     *        Maximum CDI input resolution
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CdiInputResolution
     */

    public CdiInputSpecification withResolution(CdiInputResolution resolution) {
        this.resolution = resolution.toString();
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
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CdiInputSpecification == false)
            return false;
        CdiInputSpecification other = (CdiInputSpecification) obj;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        return hashCode;
    }

    @Override
    public CdiInputSpecification clone() {
        try {
            return (CdiInputSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.CdiInputSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
