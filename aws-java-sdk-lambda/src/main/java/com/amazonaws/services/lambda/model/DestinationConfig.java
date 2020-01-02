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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A configuration object that specifies the destination of an event after Lambda processes it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DestinationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination configuration for successful invocations.
     * </p>
     */
    private OnSuccess onSuccess;
    /**
     * <p>
     * The destination configuration for failed invocations.
     * </p>
     */
    private OnFailure onFailure;

    /**
     * <p>
     * The destination configuration for successful invocations.
     * </p>
     * 
     * @param onSuccess
     *        The destination configuration for successful invocations.
     */

    public void setOnSuccess(OnSuccess onSuccess) {
        this.onSuccess = onSuccess;
    }

    /**
     * <p>
     * The destination configuration for successful invocations.
     * </p>
     * 
     * @return The destination configuration for successful invocations.
     */

    public OnSuccess getOnSuccess() {
        return this.onSuccess;
    }

    /**
     * <p>
     * The destination configuration for successful invocations.
     * </p>
     * 
     * @param onSuccess
     *        The destination configuration for successful invocations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfig withOnSuccess(OnSuccess onSuccess) {
        setOnSuccess(onSuccess);
        return this;
    }

    /**
     * <p>
     * The destination configuration for failed invocations.
     * </p>
     * 
     * @param onFailure
     *        The destination configuration for failed invocations.
     */

    public void setOnFailure(OnFailure onFailure) {
        this.onFailure = onFailure;
    }

    /**
     * <p>
     * The destination configuration for failed invocations.
     * </p>
     * 
     * @return The destination configuration for failed invocations.
     */

    public OnFailure getOnFailure() {
        return this.onFailure;
    }

    /**
     * <p>
     * The destination configuration for failed invocations.
     * </p>
     * 
     * @param onFailure
     *        The destination configuration for failed invocations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfig withOnFailure(OnFailure onFailure) {
        setOnFailure(onFailure);
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
        if (getOnSuccess() != null)
            sb.append("OnSuccess: ").append(getOnSuccess()).append(",");
        if (getOnFailure() != null)
            sb.append("OnFailure: ").append(getOnFailure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationConfig == false)
            return false;
        DestinationConfig other = (DestinationConfig) obj;
        if (other.getOnSuccess() == null ^ this.getOnSuccess() == null)
            return false;
        if (other.getOnSuccess() != null && other.getOnSuccess().equals(this.getOnSuccess()) == false)
            return false;
        if (other.getOnFailure() == null ^ this.getOnFailure() == null)
            return false;
        if (other.getOnFailure() != null && other.getOnFailure().equals(this.getOnFailure()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOnSuccess() == null) ? 0 : getOnSuccess().hashCode());
        hashCode = prime * hashCode + ((getOnFailure() == null) ? 0 : getOnFailure().hashCode());
        return hashCode;
    }

    @Override
    public DestinationConfig clone() {
        try {
            return (DestinationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.DestinationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
