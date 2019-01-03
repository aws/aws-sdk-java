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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional information about a build phase that has an error. You can use this information for troubleshooting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/PhaseContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhaseContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status code for the context of the build phase.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * An explanation of the build phase's context. This might include a command ID and an exit code.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status code for the context of the build phase.
     * </p>
     * 
     * @param statusCode
     *        The status code for the context of the build phase.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code for the context of the build phase.
     * </p>
     * 
     * @return The status code for the context of the build phase.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code for the context of the build phase.
     * </p>
     * 
     * @param statusCode
     *        The status code for the context of the build phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhaseContext withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * An explanation of the build phase's context. This might include a command ID and an exit code.
     * </p>
     * 
     * @param message
     *        An explanation of the build phase's context. This might include a command ID and an exit code.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An explanation of the build phase's context. This might include a command ID and an exit code.
     * </p>
     * 
     * @return An explanation of the build phase's context. This might include a command ID and an exit code.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An explanation of the build phase's context. This might include a command ID and an exit code.
     * </p>
     * 
     * @param message
     *        An explanation of the build phase's context. This might include a command ID and an exit code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhaseContext withMessage(String message) {
        setMessage(message);
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhaseContext == false)
            return false;
        PhaseContext other = (PhaseContext) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public PhaseContext clone() {
        try {
            return (PhaseContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.PhaseContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
