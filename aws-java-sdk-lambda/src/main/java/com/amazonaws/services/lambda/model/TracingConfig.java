/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The parent object that contains your function's tracing settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/TracingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TracingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Can be either PassThrough or Active. If PassThrough, Lambda will only trace the request from an upstream service
     * if it contains a tracing header with "sampled=1". If Active, Lambda will respect any tracing header it receives
     * from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * Can be either PassThrough or Active. If PassThrough, Lambda will only trace the request from an upstream service
     * if it contains a tracing header with "sampled=1". If Active, Lambda will respect any tracing header it receives
     * from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
     * </p>
     * 
     * @param mode
     *        Can be either PassThrough or Active. If PassThrough, Lambda will only trace the request from an upstream
     *        service if it contains a tracing header with "sampled=1". If Active, Lambda will respect any tracing
     *        header it receives from an upstream service. If no tracing header is received, Lambda will call X-Ray for
     *        a tracing decision.
     * @see TracingMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Can be either PassThrough or Active. If PassThrough, Lambda will only trace the request from an upstream service
     * if it contains a tracing header with "sampled=1". If Active, Lambda will respect any tracing header it receives
     * from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
     * </p>
     * 
     * @return Can be either PassThrough or Active. If PassThrough, Lambda will only trace the request from an upstream
     *         service if it contains a tracing header with "sampled=1". If Active, Lambda will respect any tracing
     *         header it receives from an upstream service. If no tracing header is received, Lambda will call X-Ray for
     *         a tracing decision.
     * @see TracingMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Can be either PassThrough or Active. If PassThrough, Lambda will only trace the request from an upstream service
     * if it contains a tracing header with "sampled=1". If Active, Lambda will respect any tracing header it receives
     * from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
     * </p>
     * 
     * @param mode
     *        Can be either PassThrough or Active. If PassThrough, Lambda will only trace the request from an upstream
     *        service if it contains a tracing header with "sampled=1". If Active, Lambda will respect any tracing
     *        header it receives from an upstream service. If no tracing header is received, Lambda will call X-Ray for
     *        a tracing decision.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TracingMode
     */

    public TracingConfig withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Can be either PassThrough or Active. If PassThrough, Lambda will only trace the request from an upstream service
     * if it contains a tracing header with "sampled=1". If Active, Lambda will respect any tracing header it receives
     * from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
     * </p>
     * 
     * @param mode
     *        Can be either PassThrough or Active. If PassThrough, Lambda will only trace the request from an upstream
     *        service if it contains a tracing header with "sampled=1". If Active, Lambda will respect any tracing
     *        header it receives from an upstream service. If no tracing header is received, Lambda will call X-Ray for
     *        a tracing decision.
     * @see TracingMode
     */

    public void setMode(TracingMode mode) {
        withMode(mode);
    }

    /**
     * <p>
     * Can be either PassThrough or Active. If PassThrough, Lambda will only trace the request from an upstream service
     * if it contains a tracing header with "sampled=1". If Active, Lambda will respect any tracing header it receives
     * from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
     * </p>
     * 
     * @param mode
     *        Can be either PassThrough or Active. If PassThrough, Lambda will only trace the request from an upstream
     *        service if it contains a tracing header with "sampled=1". If Active, Lambda will respect any tracing
     *        header it receives from an upstream service. If no tracing header is received, Lambda will call X-Ray for
     *        a tracing decision.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TracingMode
     */

    public TracingConfig withMode(TracingMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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

        if (obj instanceof TracingConfig == false)
            return false;
        TracingConfig other = (TracingConfig) obj;
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
    public TracingConfig clone() {
        try {
            return (TracingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.TracingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
