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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeNamespace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNamespaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The information about the namespace that you're describing. The response includes the namespace ARN, name, AWS
     * Region, creation status, and identity store. <code>DescribeNamespace</code> also works for namespaces that are in
     * the process of being created. For incomplete namespaces, this API operation lists the namespace error types and
     * messages associated with the creation process.
     * </p>
     */
    private NamespaceInfoV2 namespace;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The information about the namespace that you're describing. The response includes the namespace ARN, name, AWS
     * Region, creation status, and identity store. <code>DescribeNamespace</code> also works for namespaces that are in
     * the process of being created. For incomplete namespaces, this API operation lists the namespace error types and
     * messages associated with the creation process.
     * </p>
     * 
     * @param namespace
     *        The information about the namespace that you're describing. The response includes the namespace ARN, name,
     *        AWS Region, creation status, and identity store. <code>DescribeNamespace</code> also works for namespaces
     *        that are in the process of being created. For incomplete namespaces, this API operation lists the
     *        namespace error types and messages associated with the creation process.
     */

    public void setNamespace(NamespaceInfoV2 namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The information about the namespace that you're describing. The response includes the namespace ARN, name, AWS
     * Region, creation status, and identity store. <code>DescribeNamespace</code> also works for namespaces that are in
     * the process of being created. For incomplete namespaces, this API operation lists the namespace error types and
     * messages associated with the creation process.
     * </p>
     * 
     * @return The information about the namespace that you're describing. The response includes the namespace ARN,
     *         name, AWS Region, creation status, and identity store. <code>DescribeNamespace</code> also works for
     *         namespaces that are in the process of being created. For incomplete namespaces, this API operation lists
     *         the namespace error types and messages associated with the creation process.
     */

    public NamespaceInfoV2 getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The information about the namespace that you're describing. The response includes the namespace ARN, name, AWS
     * Region, creation status, and identity store. <code>DescribeNamespace</code> also works for namespaces that are in
     * the process of being created. For incomplete namespaces, this API operation lists the namespace error types and
     * messages associated with the creation process.
     * </p>
     * 
     * @param namespace
     *        The information about the namespace that you're describing. The response includes the namespace ARN, name,
     *        AWS Region, creation status, and identity store. <code>DescribeNamespace</code> also works for namespaces
     *        that are in the process of being created. For incomplete namespaces, this API operation lists the
     *        namespace error types and messages associated with the creation process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNamespaceResult withNamespace(NamespaceInfoV2 namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNamespaceResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNamespaceResult withStatus(Integer status) {
        setStatus(status);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
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

        if (obj instanceof DescribeNamespaceResult == false)
            return false;
        DescribeNamespaceResult other = (DescribeNamespaceResult) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
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

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNamespaceResult clone() {
        try {
            return (DescribeNamespaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
