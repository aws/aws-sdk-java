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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains information about the canary's Lambda handler and where its code is stored by CloudWatch
 * Synthetics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CanaryCodeOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanaryCodeOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Lambda layer where Synthetics stores the canary script code.
     * </p>
     */
    private String sourceLocationArn;
    /**
     * <p>
     * The entry point to use for the source code when running the canary.
     * </p>
     */
    private String handler;

    /**
     * <p>
     * The ARN of the Lambda layer where Synthetics stores the canary script code.
     * </p>
     * 
     * @param sourceLocationArn
     *        The ARN of the Lambda layer where Synthetics stores the canary script code.
     */

    public void setSourceLocationArn(String sourceLocationArn) {
        this.sourceLocationArn = sourceLocationArn;
    }

    /**
     * <p>
     * The ARN of the Lambda layer where Synthetics stores the canary script code.
     * </p>
     * 
     * @return The ARN of the Lambda layer where Synthetics stores the canary script code.
     */

    public String getSourceLocationArn() {
        return this.sourceLocationArn;
    }

    /**
     * <p>
     * The ARN of the Lambda layer where Synthetics stores the canary script code.
     * </p>
     * 
     * @param sourceLocationArn
     *        The ARN of the Lambda layer where Synthetics stores the canary script code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryCodeOutput withSourceLocationArn(String sourceLocationArn) {
        setSourceLocationArn(sourceLocationArn);
        return this;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary.
     * </p>
     * 
     * @param handler
     *        The entry point to use for the source code when running the canary.
     */

    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary.
     * </p>
     * 
     * @return The entry point to use for the source code when running the canary.
     */

    public String getHandler() {
        return this.handler;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary.
     * </p>
     * 
     * @param handler
     *        The entry point to use for the source code when running the canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryCodeOutput withHandler(String handler) {
        setHandler(handler);
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
        if (getSourceLocationArn() != null)
            sb.append("SourceLocationArn: ").append(getSourceLocationArn()).append(",");
        if (getHandler() != null)
            sb.append("Handler: ").append(getHandler());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryCodeOutput == false)
            return false;
        CanaryCodeOutput other = (CanaryCodeOutput) obj;
        if (other.getSourceLocationArn() == null ^ this.getSourceLocationArn() == null)
            return false;
        if (other.getSourceLocationArn() != null && other.getSourceLocationArn().equals(this.getSourceLocationArn()) == false)
            return false;
        if (other.getHandler() == null ^ this.getHandler() == null)
            return false;
        if (other.getHandler() != null && other.getHandler().equals(this.getHandler()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceLocationArn() == null) ? 0 : getSourceLocationArn().hashCode());
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode());
        return hashCode;
    }

    @Override
    public CanaryCodeOutput clone() {
        try {
            return (CanaryCodeOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.CanaryCodeOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
