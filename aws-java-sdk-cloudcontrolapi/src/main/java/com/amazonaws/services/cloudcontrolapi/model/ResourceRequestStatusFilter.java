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
package com.amazonaws.services.cloudcontrolapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The filter criteria to use in determining the requests returned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ResourceRequestStatusFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceRequestStatusFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operation types to include in the filter.
     * </p>
     */
    private java.util.List<String> operations;
    /**
     * <p>
     * The operation statuses to include in the filter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation has been requested, but not yet initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The operation completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_IN_PROGRESS</code>: The operation is in the process of being canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_COMPLETE</code>: The operation has been canceled.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> operationStatuses;

    /**
     * <p>
     * The operation types to include in the filter.
     * </p>
     * 
     * @return The operation types to include in the filter.
     * @see Operation
     */

    public java.util.List<String> getOperations() {
        return operations;
    }

    /**
     * <p>
     * The operation types to include in the filter.
     * </p>
     * 
     * @param operations
     *        The operation types to include in the filter.
     * @see Operation
     */

    public void setOperations(java.util.Collection<String> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<String>(operations);
    }

    /**
     * <p>
     * The operation types to include in the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperations(java.util.Collection)} or {@link #withOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operations
     *        The operation types to include in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public ResourceRequestStatusFilter withOperations(String... operations) {
        if (this.operations == null) {
            setOperations(new java.util.ArrayList<String>(operations.length));
        }
        for (String ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The operation types to include in the filter.
     * </p>
     * 
     * @param operations
     *        The operation types to include in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public ResourceRequestStatusFilter withOperations(java.util.Collection<String> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * The operation types to include in the filter.
     * </p>
     * 
     * @param operations
     *        The operation types to include in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public ResourceRequestStatusFilter withOperations(Operation... operations) {
        java.util.ArrayList<String> operationsCopy = new java.util.ArrayList<String>(operations.length);
        for (Operation value : operations) {
            operationsCopy.add(value.toString());
        }
        if (getOperations() == null) {
            setOperations(operationsCopy);
        } else {
            getOperations().addAll(operationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The operation statuses to include in the filter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation has been requested, but not yet initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The operation completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_IN_PROGRESS</code>: The operation is in the process of being canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_COMPLETE</code>: The operation has been canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The operation statuses to include in the filter.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code>: The operation has been requested, but not yet initiated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>: The operation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESS</code>: The operation completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The operation failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCEL_IN_PROGRESS</code>: The operation is in the process of being canceled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCEL_COMPLETE</code>: The operation has been canceled.
     *         </p>
     *         </li>
     * @see OperationStatus
     */

    public java.util.List<String> getOperationStatuses() {
        return operationStatuses;
    }

    /**
     * <p>
     * The operation statuses to include in the filter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation has been requested, but not yet initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The operation completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_IN_PROGRESS</code>: The operation is in the process of being canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_COMPLETE</code>: The operation has been canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationStatuses
     *        The operation statuses to include in the filter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The operation has been requested, but not yet initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code>: The operation completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_IN_PROGRESS</code>: The operation is in the process of being canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_COMPLETE</code>: The operation has been canceled.
     *        </p>
     *        </li>
     * @see OperationStatus
     */

    public void setOperationStatuses(java.util.Collection<String> operationStatuses) {
        if (operationStatuses == null) {
            this.operationStatuses = null;
            return;
        }

        this.operationStatuses = new java.util.ArrayList<String>(operationStatuses);
    }

    /**
     * <p>
     * The operation statuses to include in the filter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation has been requested, but not yet initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The operation completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_IN_PROGRESS</code>: The operation is in the process of being canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_COMPLETE</code>: The operation has been canceled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperationStatuses(java.util.Collection)} or {@link #withOperationStatuses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param operationStatuses
     *        The operation statuses to include in the filter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The operation has been requested, but not yet initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code>: The operation completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_IN_PROGRESS</code>: The operation is in the process of being canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_COMPLETE</code>: The operation has been canceled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ResourceRequestStatusFilter withOperationStatuses(String... operationStatuses) {
        if (this.operationStatuses == null) {
            setOperationStatuses(new java.util.ArrayList<String>(operationStatuses.length));
        }
        for (String ele : operationStatuses) {
            this.operationStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The operation statuses to include in the filter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation has been requested, but not yet initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The operation completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_IN_PROGRESS</code>: The operation is in the process of being canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_COMPLETE</code>: The operation has been canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationStatuses
     *        The operation statuses to include in the filter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The operation has been requested, but not yet initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code>: The operation completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_IN_PROGRESS</code>: The operation is in the process of being canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_COMPLETE</code>: The operation has been canceled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ResourceRequestStatusFilter withOperationStatuses(java.util.Collection<String> operationStatuses) {
        setOperationStatuses(operationStatuses);
        return this;
    }

    /**
     * <p>
     * The operation statuses to include in the filter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation has been requested, but not yet initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The operation completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_IN_PROGRESS</code>: The operation is in the process of being canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_COMPLETE</code>: The operation has been canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationStatuses
     *        The operation statuses to include in the filter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The operation has been requested, but not yet initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code>: The operation completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_IN_PROGRESS</code>: The operation is in the process of being canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_COMPLETE</code>: The operation has been canceled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ResourceRequestStatusFilter withOperationStatuses(OperationStatus... operationStatuses) {
        java.util.ArrayList<String> operationStatusesCopy = new java.util.ArrayList<String>(operationStatuses.length);
        for (OperationStatus value : operationStatuses) {
            operationStatusesCopy.add(value.toString());
        }
        if (getOperationStatuses() == null) {
            setOperationStatuses(operationStatusesCopy);
        } else {
            getOperationStatuses().addAll(operationStatusesCopy);
        }
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
        if (getOperations() != null)
            sb.append("Operations: ").append(getOperations()).append(",");
        if (getOperationStatuses() != null)
            sb.append("OperationStatuses: ").append(getOperationStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceRequestStatusFilter == false)
            return false;
        ResourceRequestStatusFilter other = (ResourceRequestStatusFilter) obj;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getOperationStatuses() == null ^ this.getOperationStatuses() == null)
            return false;
        if (other.getOperationStatuses() != null && other.getOperationStatuses().equals(this.getOperationStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode + ((getOperationStatuses() == null) ? 0 : getOperationStatuses().hashCode());
        return hashCode;
    }

    @Override
    public ResourceRequestStatusFilter clone() {
        try {
            return (ResourceRequestStatusFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudcontrolapi.model.transform.ResourceRequestStatusFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
