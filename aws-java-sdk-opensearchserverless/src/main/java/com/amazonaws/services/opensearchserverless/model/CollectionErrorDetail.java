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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CollectionErrorDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollectionErrorDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code for the request. For example, <code>NOT_FOUND</code>.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A description of the error. For example, <code>The specified Collection is not found.</code>
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * If the request contains collection IDs, the response includes the IDs provided in the request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * If the request contains collection names, the response includes the names provided in the request.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The error code for the request. For example, <code>NOT_FOUND</code>.
     * </p>
     * 
     * @param errorCode
     *        The error code for the request. For example, <code>NOT_FOUND</code>.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for the request. For example, <code>NOT_FOUND</code>.
     * </p>
     * 
     * @return The error code for the request. For example, <code>NOT_FOUND</code>.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for the request. For example, <code>NOT_FOUND</code>.
     * </p>
     * 
     * @param errorCode
     *        The error code for the request. For example, <code>NOT_FOUND</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionErrorDetail withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * A description of the error. For example, <code>The specified Collection is not found.</code>
     * </p>
     * 
     * @param errorMessage
     *        A description of the error. For example, <code>The specified Collection is not found.</code>
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A description of the error. For example, <code>The specified Collection is not found.</code>
     * </p>
     * 
     * @return A description of the error. For example, <code>The specified Collection is not found.</code>
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A description of the error. For example, <code>The specified Collection is not found.</code>
     * </p>
     * 
     * @param errorMessage
     *        A description of the error. For example, <code>The specified Collection is not found.</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionErrorDetail withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * If the request contains collection IDs, the response includes the IDs provided in the request.
     * </p>
     * 
     * @param id
     *        If the request contains collection IDs, the response includes the IDs provided in the request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * If the request contains collection IDs, the response includes the IDs provided in the request.
     * </p>
     * 
     * @return If the request contains collection IDs, the response includes the IDs provided in the request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * If the request contains collection IDs, the response includes the IDs provided in the request.
     * </p>
     * 
     * @param id
     *        If the request contains collection IDs, the response includes the IDs provided in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionErrorDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * If the request contains collection names, the response includes the names provided in the request.
     * </p>
     * 
     * @param name
     *        If the request contains collection names, the response includes the names provided in the request.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * If the request contains collection names, the response includes the names provided in the request.
     * </p>
     * 
     * @return If the request contains collection names, the response includes the names provided in the request.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * If the request contains collection names, the response includes the names provided in the request.
     * </p>
     * 
     * @param name
     *        If the request contains collection names, the response includes the names provided in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionErrorDetail withName(String name) {
        setName(name);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollectionErrorDetail == false)
            return false;
        CollectionErrorDetail other = (CollectionErrorDetail) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CollectionErrorDetail clone() {
        try {
            return (CollectionErrorDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.CollectionErrorDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
