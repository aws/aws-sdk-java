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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteIngressPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIngressPointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the ingress endpoint resource that you want to delete.
     * </p>
     */
    private String ingressPointId;

    /**
     * <p>
     * The identifier of the ingress endpoint resource that you want to delete.
     * </p>
     * 
     * @param ingressPointId
     *        The identifier of the ingress endpoint resource that you want to delete.
     */

    public void setIngressPointId(String ingressPointId) {
        this.ingressPointId = ingressPointId;
    }

    /**
     * <p>
     * The identifier of the ingress endpoint resource that you want to delete.
     * </p>
     * 
     * @return The identifier of the ingress endpoint resource that you want to delete.
     */

    public String getIngressPointId() {
        return this.ingressPointId;
    }

    /**
     * <p>
     * The identifier of the ingress endpoint resource that you want to delete.
     * </p>
     * 
     * @param ingressPointId
     *        The identifier of the ingress endpoint resource that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIngressPointRequest withIngressPointId(String ingressPointId) {
        setIngressPointId(ingressPointId);
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
        if (getIngressPointId() != null)
            sb.append("IngressPointId: ").append(getIngressPointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIngressPointRequest == false)
            return false;
        DeleteIngressPointRequest other = (DeleteIngressPointRequest) obj;
        if (other.getIngressPointId() == null ^ this.getIngressPointId() == null)
            return false;
        if (other.getIngressPointId() != null && other.getIngressPointId().equals(this.getIngressPointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIngressPointId() == null) ? 0 : getIngressPointId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIngressPointRequest clone() {
        return (DeleteIngressPointRequest) super.clone();
    }

}
