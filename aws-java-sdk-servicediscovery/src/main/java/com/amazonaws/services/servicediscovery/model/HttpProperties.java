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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains the name of an HTTP namespace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/HttpProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an HTTP namespace.
     * </p>
     */
    private String httpName;

    /**
     * <p>
     * The name of an HTTP namespace.
     * </p>
     * 
     * @param httpName
     *        The name of an HTTP namespace.
     */

    public void setHttpName(String httpName) {
        this.httpName = httpName;
    }

    /**
     * <p>
     * The name of an HTTP namespace.
     * </p>
     * 
     * @return The name of an HTTP namespace.
     */

    public String getHttpName() {
        return this.httpName;
    }

    /**
     * <p>
     * The name of an HTTP namespace.
     * </p>
     * 
     * @param httpName
     *        The name of an HTTP namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpProperties withHttpName(String httpName) {
        setHttpName(httpName);
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
        if (getHttpName() != null)
            sb.append("HttpName: ").append(getHttpName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpProperties == false)
            return false;
        HttpProperties other = (HttpProperties) obj;
        if (other.getHttpName() == null ^ this.getHttpName() == null)
            return false;
        if (other.getHttpName() != null && other.getHttpName().equals(this.getHttpName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpName() == null) ? 0 : getHttpName().hashCode());
        return hashCode;
    }

    @Override
    public HttpProperties clone() {
        try {
            return (HttpProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.HttpPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
