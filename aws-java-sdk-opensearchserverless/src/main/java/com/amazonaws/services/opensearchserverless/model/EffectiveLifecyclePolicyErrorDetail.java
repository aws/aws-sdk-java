/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error information for an OpenSearch Serverless request.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/EffectiveLifecyclePolicyErrorDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EffectiveLifecyclePolicyErrorDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code for the request.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A description of the error. For example, <code>The specified Index resource is not found</code>.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The name of OpenSearch Serverless index resource.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The type of lifecycle policy.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The error code for the request.
     * </p>
     * 
     * @param errorCode
     *        The error code for the request.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for the request.
     * </p>
     * 
     * @return The error code for the request.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for the request.
     * </p>
     * 
     * @param errorCode
     *        The error code for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveLifecyclePolicyErrorDetail withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * A description of the error. For example, <code>The specified Index resource is not found</code>.
     * </p>
     * 
     * @param errorMessage
     *        A description of the error. For example, <code>The specified Index resource is not found</code>.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A description of the error. For example, <code>The specified Index resource is not found</code>.
     * </p>
     * 
     * @return A description of the error. For example, <code>The specified Index resource is not found</code>.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A description of the error. For example, <code>The specified Index resource is not found</code>.
     * </p>
     * 
     * @param errorMessage
     *        A description of the error. For example, <code>The specified Index resource is not found</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveLifecyclePolicyErrorDetail withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The name of OpenSearch Serverless index resource.
     * </p>
     * 
     * @param resource
     *        The name of OpenSearch Serverless index resource.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The name of OpenSearch Serverless index resource.
     * </p>
     * 
     * @return The name of OpenSearch Serverless index resource.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The name of OpenSearch Serverless index resource.
     * </p>
     * 
     * @param resource
     *        The name of OpenSearch Serverless index resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveLifecyclePolicyErrorDetail withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The type of lifecycle policy.
     * </p>
     * 
     * @param type
     *        The type of lifecycle policy.
     * @see LifecyclePolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of lifecycle policy.
     * </p>
     * 
     * @return The type of lifecycle policy.
     * @see LifecyclePolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of lifecycle policy.
     * </p>
     * 
     * @param type
     *        The type of lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyType
     */

    public EffectiveLifecyclePolicyErrorDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of lifecycle policy.
     * </p>
     * 
     * @param type
     *        The type of lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyType
     */

    public EffectiveLifecyclePolicyErrorDetail withType(LifecyclePolicyType type) {
        this.type = type.toString();
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EffectiveLifecyclePolicyErrorDetail == false)
            return false;
        EffectiveLifecyclePolicyErrorDetail other = (EffectiveLifecyclePolicyErrorDetail) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public EffectiveLifecyclePolicyErrorDetail clone() {
        try {
            return (EffectiveLifecyclePolicyErrorDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.EffectiveLifecyclePolicyErrorDetailMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
