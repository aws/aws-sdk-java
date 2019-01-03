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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetServiceLinkedRoleDeletionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceLinkedRoleDeletionStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The deletion task identifier. This identifier is returned by the <a>DeleteServiceLinkedRole</a> operation in the
     * format <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>.
     * </p>
     */
    private String deletionTaskId;

    /**
     * <p>
     * The deletion task identifier. This identifier is returned by the <a>DeleteServiceLinkedRole</a> operation in the
     * format <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>.
     * </p>
     * 
     * @param deletionTaskId
     *        The deletion task identifier. This identifier is returned by the <a>DeleteServiceLinkedRole</a> operation
     *        in the format
     *        <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>.
     */

    public void setDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
    }

    /**
     * <p>
     * The deletion task identifier. This identifier is returned by the <a>DeleteServiceLinkedRole</a> operation in the
     * format <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>.
     * </p>
     * 
     * @return The deletion task identifier. This identifier is returned by the <a>DeleteServiceLinkedRole</a> operation
     *         in the format
     *         <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>.
     */

    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

    /**
     * <p>
     * The deletion task identifier. This identifier is returned by the <a>DeleteServiceLinkedRole</a> operation in the
     * format <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>.
     * </p>
     * 
     * @param deletionTaskId
     *        The deletion task identifier. This identifier is returned by the <a>DeleteServiceLinkedRole</a> operation
     *        in the format
     *        <code>task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceLinkedRoleDeletionStatusRequest withDeletionTaskId(String deletionTaskId) {
        setDeletionTaskId(deletionTaskId);
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
        if (getDeletionTaskId() != null)
            sb.append("DeletionTaskId: ").append(getDeletionTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceLinkedRoleDeletionStatusRequest == false)
            return false;
        GetServiceLinkedRoleDeletionStatusRequest other = (GetServiceLinkedRoleDeletionStatusRequest) obj;
        if (other.getDeletionTaskId() == null ^ this.getDeletionTaskId() == null)
            return false;
        if (other.getDeletionTaskId() != null && other.getDeletionTaskId().equals(this.getDeletionTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletionTaskId() == null) ? 0 : getDeletionTaskId().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceLinkedRoleDeletionStatusRequest clone() {
        return (GetServiceLinkedRoleDeletionStatusRequest) super.clone();
    }

}
