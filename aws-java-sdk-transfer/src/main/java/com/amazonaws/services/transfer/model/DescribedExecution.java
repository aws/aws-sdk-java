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
 * The details for an execution object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedExecution implements Serializable, Cloneable, StructuredPojo {

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
     * The IAM role associated with the execution.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * The IAM logging role associated with the execution.
     * </p>
     */
    private LoggingConfiguration loggingConfiguration;

    private PosixProfile posixProfile;
    /**
     * <p>
     * The status is one of the execution. Can be in progress, completed, exception encountered, or handling the
     * exception.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A structure that describes the execution results. This includes a list of the steps along with the details of
     * each step, error type and message (if any), and the <code>OnExceptionSteps</code> structure.
     * </p>
     */
    private ExecutionResults results;

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

    public DescribedExecution withExecutionId(String executionId) {
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

    public DescribedExecution withInitialFileLocation(FileLocation initialFileLocation) {
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

    public DescribedExecution withServiceMetadata(ServiceMetadata serviceMetadata) {
        setServiceMetadata(serviceMetadata);
        return this;
    }

    /**
     * <p>
     * The IAM role associated with the execution.
     * </p>
     * 
     * @param executionRole
     *        The IAM role associated with the execution.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The IAM role associated with the execution.
     * </p>
     * 
     * @return The IAM role associated with the execution.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The IAM role associated with the execution.
     * </p>
     * 
     * @param executionRole
     *        The IAM role associated with the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedExecution withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * The IAM logging role associated with the execution.
     * </p>
     * 
     * @param loggingConfiguration
     *        The IAM logging role associated with the execution.
     */

    public void setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * The IAM logging role associated with the execution.
     * </p>
     * 
     * @return The IAM logging role associated with the execution.
     */

    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * <p>
     * The IAM logging role associated with the execution.
     * </p>
     * 
     * @param loggingConfiguration
     *        The IAM logging role associated with the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedExecution withLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

    /**
     * @param posixProfile
     */

    public void setPosixProfile(PosixProfile posixProfile) {
        this.posixProfile = posixProfile;
    }

    /**
     * @return
     */

    public PosixProfile getPosixProfile() {
        return this.posixProfile;
    }

    /**
     * @param posixProfile
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedExecution withPosixProfile(PosixProfile posixProfile) {
        setPosixProfile(posixProfile);
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

    public DescribedExecution withStatus(String status) {
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

    public DescribedExecution withStatus(ExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A structure that describes the execution results. This includes a list of the steps along with the details of
     * each step, error type and message (if any), and the <code>OnExceptionSteps</code> structure.
     * </p>
     * 
     * @param results
     *        A structure that describes the execution results. This includes a list of the steps along with the details
     *        of each step, error type and message (if any), and the <code>OnExceptionSteps</code> structure.
     */

    public void setResults(ExecutionResults results) {
        this.results = results;
    }

    /**
     * <p>
     * A structure that describes the execution results. This includes a list of the steps along with the details of
     * each step, error type and message (if any), and the <code>OnExceptionSteps</code> structure.
     * </p>
     * 
     * @return A structure that describes the execution results. This includes a list of the steps along with the
     *         details of each step, error type and message (if any), and the <code>OnExceptionSteps</code> structure.
     */

    public ExecutionResults getResults() {
        return this.results;
    }

    /**
     * <p>
     * A structure that describes the execution results. This includes a list of the steps along with the details of
     * each step, error type and message (if any), and the <code>OnExceptionSteps</code> structure.
     * </p>
     * 
     * @param results
     *        A structure that describes the execution results. This includes a list of the steps along with the details
     *        of each step, error type and message (if any), and the <code>OnExceptionSteps</code> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedExecution withResults(ExecutionResults results) {
        setResults(results);
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
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole()).append(",");
        if (getLoggingConfiguration() != null)
            sb.append("LoggingConfiguration: ").append(getLoggingConfiguration()).append(",");
        if (getPosixProfile() != null)
            sb.append("PosixProfile: ").append(getPosixProfile()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getResults() != null)
            sb.append("Results: ").append(getResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribedExecution == false)
            return false;
        DescribedExecution other = (DescribedExecution) obj;
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
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getLoggingConfiguration() == null ^ this.getLoggingConfiguration() == null)
            return false;
        if (other.getLoggingConfiguration() != null && other.getLoggingConfiguration().equals(this.getLoggingConfiguration()) == false)
            return false;
        if (other.getPosixProfile() == null ^ this.getPosixProfile() == null)
            return false;
        if (other.getPosixProfile() != null && other.getPosixProfile().equals(this.getPosixProfile()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
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
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPosixProfile() == null) ? 0 : getPosixProfile().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribedExecution clone() {
        try {
            return (DescribedExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.DescribedExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
