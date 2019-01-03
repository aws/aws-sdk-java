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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The function's AWS X-Ray tracing configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/TracingConfigResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TracingConfigResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tracing mode.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * The tracing mode.
     * </p>
     * 
     * @param mode
     *        The tracing mode.
     * @see TracingMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The tracing mode.
     * </p>
     * 
     * @return The tracing mode.
     * @see TracingMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The tracing mode.
     * </p>
     * 
     * @param mode
     *        The tracing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TracingMode
     */

    public TracingConfigResponse withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The tracing mode.
     * </p>
     * 
     * @param mode
     *        The tracing mode.
     * @see TracingMode
     */

    public void setMode(TracingMode mode) {
        withMode(mode);
    }

    /**
     * <p>
     * The tracing mode.
     * </p>
     * 
     * @param mode
     *        The tracing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TracingMode
     */

    public TracingConfigResponse withMode(TracingMode mode) {
        this.mode = mode.toString();
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TracingConfigResponse == false)
            return false;
        TracingConfigResponse other = (TracingConfigResponse) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public TracingConfigResponse clone() {
        try {
            return (TracingConfigResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.TracingConfigResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
