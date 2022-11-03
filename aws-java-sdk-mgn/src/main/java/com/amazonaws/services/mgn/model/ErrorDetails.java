/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ErrorDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Error details code.
     * </p>
     */
    private String code;
    /**
     * <p>
     * Error details message.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Error details resourceId.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Error details resourceType.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * Error details code.
     * </p>
     * 
     * @param code
     *        Error details code.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Error details code.
     * </p>
     * 
     * @return Error details code.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * Error details code.
     * </p>
     * 
     * @param code
     *        Error details code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetails withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Error details message.
     * </p>
     * 
     * @param message
     *        Error details message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Error details message.
     * </p>
     * 
     * @return Error details message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Error details message.
     * </p>
     * 
     * @param message
     *        Error details message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetails withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Error details resourceId.
     * </p>
     * 
     * @param resourceId
     *        Error details resourceId.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Error details resourceId.
     * </p>
     * 
     * @return Error details resourceId.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Error details resourceId.
     * </p>
     * 
     * @param resourceId
     *        Error details resourceId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetails withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Error details resourceType.
     * </p>
     * 
     * @param resourceType
     *        Error details resourceType.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Error details resourceType.
     * </p>
     * 
     * @return Error details resourceType.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Error details resourceType.
     * </p>
     * 
     * @param resourceType
     *        Error details resourceType.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetails withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorDetails == false)
            return false;
        ErrorDetails other = (ErrorDetails) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public ErrorDetails clone() {
        try {
            return (ErrorDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ErrorDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
