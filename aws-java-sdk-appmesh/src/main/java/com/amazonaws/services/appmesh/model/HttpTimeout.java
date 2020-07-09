/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents types of timeouts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/HttpTimeout" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpTimeout implements Serializable, Cloneable, StructuredPojo {

    private Duration idle;

    private Duration perRequest;

    /**
     * @param idle
     */

    public void setIdle(Duration idle) {
        this.idle = idle;
    }

    /**
     * @return
     */

    public Duration getIdle() {
        return this.idle;
    }

    /**
     * @param idle
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpTimeout withIdle(Duration idle) {
        setIdle(idle);
        return this;
    }

    /**
     * @param perRequest
     */

    public void setPerRequest(Duration perRequest) {
        this.perRequest = perRequest;
    }

    /**
     * @return
     */

    public Duration getPerRequest() {
        return this.perRequest;
    }

    /**
     * @param perRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpTimeout withPerRequest(Duration perRequest) {
        setPerRequest(perRequest);
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
        if (getIdle() != null)
            sb.append("Idle: ").append(getIdle()).append(",");
        if (getPerRequest() != null)
            sb.append("PerRequest: ").append(getPerRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpTimeout == false)
            return false;
        HttpTimeout other = (HttpTimeout) obj;
        if (other.getIdle() == null ^ this.getIdle() == null)
            return false;
        if (other.getIdle() != null && other.getIdle().equals(this.getIdle()) == false)
            return false;
        if (other.getPerRequest() == null ^ this.getPerRequest() == null)
            return false;
        if (other.getPerRequest() != null && other.getPerRequest().equals(this.getPerRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdle() == null) ? 0 : getIdle().hashCode());
        hashCode = prime * hashCode + ((getPerRequest() == null) ? 0 : getPerRequest().hashCode());
        return hashCode;
    }

    @Override
    public HttpTimeout clone() {
        try {
            return (HttpTimeout) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.HttpTimeoutMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
