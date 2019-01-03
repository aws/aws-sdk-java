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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains information about an operation that matches the criteria that you specified in a
 * <a>ListOperations</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/OperationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OperationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for an operation.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The ID for an operation.
     * </p>
     * 
     * @param id
     *        The ID for an operation.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for an operation.
     * </p>
     * 
     * @return The ID for an operation.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for an operation.
     * </p>
     * 
     * @param id
     *        The ID for an operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the operation. Values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCESS</b>: The operation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     *        </p>
     *        </li>
     * @see OperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the operation. Values include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SUCCESS</b>: The operation succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     *         </p>
     *         </li>
     * @see OperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the operation. Values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCESS</b>: The operation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public OperationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the operation. Values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCESS</b>: The operation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public OperationSummary withStatus(OperationStatus status) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof OperationSummary == false)
            return false;
        OperationSummary other = (OperationSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public OperationSummary clone() {
        try {
            return (OperationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.OperationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
