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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about failure details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/FailureDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailureDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the failure.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The message about the failure.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The external ID of the run of the action that failed.
     * </p>
     */
    private String externalExecutionId;

    /**
     * <p>
     * The type of the failure.
     * </p>
     * 
     * @param type
     *        The type of the failure.
     * @see FailureType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the failure.
     * </p>
     * 
     * @return The type of the failure.
     * @see FailureType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the failure.
     * </p>
     * 
     * @param type
     *        The type of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureType
     */

    public FailureDetails withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the failure.
     * </p>
     * 
     * @param type
     *        The type of the failure.
     * @see FailureType
     */

    public void setType(FailureType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of the failure.
     * </p>
     * 
     * @param type
     *        The type of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureType
     */

    public FailureDetails withType(FailureType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The message about the failure.
     * </p>
     * 
     * @param message
     *        The message about the failure.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message about the failure.
     * </p>
     * 
     * @return The message about the failure.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message about the failure.
     * </p>
     * 
     * @param message
     *        The message about the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDetails withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The external ID of the run of the action that failed.
     * </p>
     * 
     * @param externalExecutionId
     *        The external ID of the run of the action that failed.
     */

    public void setExternalExecutionId(String externalExecutionId) {
        this.externalExecutionId = externalExecutionId;
    }

    /**
     * <p>
     * The external ID of the run of the action that failed.
     * </p>
     * 
     * @return The external ID of the run of the action that failed.
     */

    public String getExternalExecutionId() {
        return this.externalExecutionId;
    }

    /**
     * <p>
     * The external ID of the run of the action that failed.
     * </p>
     * 
     * @param externalExecutionId
     *        The external ID of the run of the action that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDetails withExternalExecutionId(String externalExecutionId) {
        setExternalExecutionId(externalExecutionId);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getExternalExecutionId() != null)
            sb.append("ExternalExecutionId: ").append(getExternalExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailureDetails == false)
            return false;
        FailureDetails other = (FailureDetails) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getExternalExecutionId() == null ^ this.getExternalExecutionId() == null)
            return false;
        if (other.getExternalExecutionId() != null && other.getExternalExecutionId().equals(this.getExternalExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getExternalExecutionId() == null) ? 0 : getExternalExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public FailureDetails clone() {
        try {
            return (FailureDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.FailureDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
