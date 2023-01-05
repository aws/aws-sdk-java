/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the status of an attempt from Amazon AppFlow to register a resource.
 * </p>
 * <p>
 * When you run a flow that you've configured to use a metadata catalog, Amazon AppFlow registers a metadata table and
 * data partitions with that catalog. This operation provides the status of that registration attempt. The operation
 * also indicates how many related resources Amazon AppFlow created or updated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/RegistrationOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Explains the status of the registration attempt from Amazon AppFlow. If the attempt fails, the message explains
     * why.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Indicates the number of resources that Amazon AppFlow created or updated. Possible resources include metadata
     * tables and data partitions.
     * </p>
     */
    private String result;
    /**
     * <p>
     * Indicates the status of the registration attempt from Amazon AppFlow.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Explains the status of the registration attempt from Amazon AppFlow. If the attempt fails, the message explains
     * why.
     * </p>
     * 
     * @param message
     *        Explains the status of the registration attempt from Amazon AppFlow. If the attempt fails, the message
     *        explains why.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Explains the status of the registration attempt from Amazon AppFlow. If the attempt fails, the message explains
     * why.
     * </p>
     * 
     * @return Explains the status of the registration attempt from Amazon AppFlow. If the attempt fails, the message
     *         explains why.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Explains the status of the registration attempt from Amazon AppFlow. If the attempt fails, the message explains
     * why.
     * </p>
     * 
     * @param message
     *        Explains the status of the registration attempt from Amazon AppFlow. If the attempt fails, the message
     *        explains why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationOutput withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Indicates the number of resources that Amazon AppFlow created or updated. Possible resources include metadata
     * tables and data partitions.
     * </p>
     * 
     * @param result
     *        Indicates the number of resources that Amazon AppFlow created or updated. Possible resources include
     *        metadata tables and data partitions.
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * Indicates the number of resources that Amazon AppFlow created or updated. Possible resources include metadata
     * tables and data partitions.
     * </p>
     * 
     * @return Indicates the number of resources that Amazon AppFlow created or updated. Possible resources include
     *         metadata tables and data partitions.
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * Indicates the number of resources that Amazon AppFlow created or updated. Possible resources include metadata
     * tables and data partitions.
     * </p>
     * 
     * @param result
     *        Indicates the number of resources that Amazon AppFlow created or updated. Possible resources include
     *        metadata tables and data partitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationOutput withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the registration attempt from Amazon AppFlow.
     * </p>
     * 
     * @param status
     *        Indicates the status of the registration attempt from Amazon AppFlow.
     * @see ExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the registration attempt from Amazon AppFlow.
     * </p>
     * 
     * @return Indicates the status of the registration attempt from Amazon AppFlow.
     * @see ExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the registration attempt from Amazon AppFlow.
     * </p>
     * 
     * @param status
     *        Indicates the status of the registration attempt from Amazon AppFlow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public RegistrationOutput withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the registration attempt from Amazon AppFlow.
     * </p>
     * 
     * @param status
     *        Indicates the status of the registration attempt from Amazon AppFlow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public RegistrationOutput withStatus(ExecutionStatus status) {
        this.status = status.toString();
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistrationOutput == false)
            return false;
        RegistrationOutput other = (RegistrationOutput) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public RegistrationOutput clone() {
        try {
            return (RegistrationOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.RegistrationOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
