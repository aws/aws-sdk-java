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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns properties of the execution that is specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListedExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the execution of a workflow.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * A structure that describes the Amazon S3 or EFS file location. This is the file location when the execution
     * begins: if the file is being copied, this is the initial (as opposed to destination) file location.
     * </p>
     */
    private FileLocation initialFileLocation;
    /**
     * <p>
     * A container object for the session details that are associated with a workflow.
     * </p>
     */
    private ServiceMetadata serviceMetadata;
    /**
     * <p>
     * The status is one of the execution. Can be in progress, completed, exception encountered, or handling the
     * exception.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A unique identifier for the execution of a workflow.
     * </p>
     * 
     * @param executionId
     *        A unique identifier for the execution of a workflow.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * A unique identifier for the execution of a workflow.
     * </p>
     * 
     * @return A unique identifier for the execution of a workflow.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * A unique identifier for the execution of a workflow.
     * </p>
     * 
     * @param executionId
     *        A unique identifier for the execution of a workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedExecution withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * A structure that describes the Amazon S3 or EFS file location. This is the file location when the execution
     * begins: if the file is being copied, this is the initial (as opposed to destination) file location.
     * </p>
     * 
     * @param initialFileLocation
     *        A structure that describes the Amazon S3 or EFS file location. This is the file location when the
     *        execution begins: if the file is being copied, this is the initial (as opposed to destination) file
     *        location.
     */

    public void setInitialFileLocation(FileLocation initialFileLocation) {
        this.initialFileLocation = initialFileLocation;
    }

    /**
     * <p>
     * A structure that describes the Amazon S3 or EFS file location. This is the file location when the execution
     * begins: if the file is being copied, this is the initial (as opposed to destination) file location.
     * </p>
     * 
     * @return A structure that describes the Amazon S3 or EFS file location. This is the file location when the
     *         execution begins: if the file is being copied, this is the initial (as opposed to destination) file
     *         location.
     */

    public FileLocation getInitialFileLocation() {
        return this.initialFileLocation;
    }

    /**
     * <p>
     * A structure that describes the Amazon S3 or EFS file location. This is the file location when the execution
     * begins: if the file is being copied, this is the initial (as opposed to destination) file location.
     * </p>
     * 
     * @param initialFileLocation
     *        A structure that describes the Amazon S3 or EFS file location. This is the file location when the
     *        execution begins: if the file is being copied, this is the initial (as opposed to destination) file
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedExecution withInitialFileLocation(FileLocation initialFileLocation) {
        setInitialFileLocation(initialFileLocation);
        return this;
    }

    /**
     * <p>
     * A container object for the session details that are associated with a workflow.
     * </p>
     * 
     * @param serviceMetadata
     *        A container object for the session details that are associated with a workflow.
     */

    public void setServiceMetadata(ServiceMetadata serviceMetadata) {
        this.serviceMetadata = serviceMetadata;
    }

    /**
     * <p>
     * A container object for the session details that are associated with a workflow.
     * </p>
     * 
     * @return A container object for the session details that are associated with a workflow.
     */

    public ServiceMetadata getServiceMetadata() {
        return this.serviceMetadata;
    }

    /**
     * <p>
     * A container object for the session details that are associated with a workflow.
     * </p>
     * 
     * @param serviceMetadata
     *        A container object for the session details that are associated with a workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedExecution withServiceMetadata(ServiceMetadata serviceMetadata) {
        setServiceMetadata(serviceMetadata);
        return this;
    }

    /**
     * <p>
     * The status is one of the execution. Can be in progress, completed, exception encountered, or handling the
     * exception.
     * </p>
     * 
     * @param status
     *        The status is one of the execution. Can be in progress, completed, exception encountered, or handling the
     *        exception.
     * @see ExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status is one of the execution. Can be in progress, completed, exception encountered, or handling the
     * exception.
     * </p>
     * 
     * @return The status is one of the execution. Can be in progress, completed, exception encountered, or handling the
     *         exception.
     * @see ExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status is one of the execution. Can be in progress, completed, exception encountered, or handling the
     * exception.
     * </p>
     * 
     * @param status
     *        The status is one of the execution. Can be in progress, completed, exception encountered, or handling the
     *        exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ListedExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status is one of the execution. Can be in progress, completed, exception encountered, or handling the
     * exception.
     * </p>
     * 
     * @param status
     *        The status is one of the execution. Can be in progress, completed, exception encountered, or handling the
     *        exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ListedExecution withStatus(ExecutionStatus status) {
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
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getInitialFileLocation() != null)
            sb.append("InitialFileLocation: ").append(getInitialFileLocation()).append(",");
        if (getServiceMetadata() != null)
            sb.append("ServiceMetadata: ").append(getServiceMetadata()).append(",");
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

        if (obj instanceof ListedExecution == false)
            return false;
        ListedExecution other = (ListedExecution) obj;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getInitialFileLocation() == null ^ this.getInitialFileLocation() == null)
            return false;
        if (other.getInitialFileLocation() != null && other.getInitialFileLocation().equals(this.getInitialFileLocation()) == false)
            return false;
        if (other.getServiceMetadata() == null ^ this.getServiceMetadata() == null)
            return false;
        if (other.getServiceMetadata() != null && other.getServiceMetadata().equals(this.getServiceMetadata()) == false)
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

        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getInitialFileLocation() == null) ? 0 : getInitialFileLocation().hashCode());
        hashCode = prime * hashCode + ((getServiceMetadata() == null) ? 0 : getServiceMetadata().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListedExecution clone() {
        try {
            return (ListedExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ListedExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
