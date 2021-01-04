/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the configureAgentRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ConfigureAgent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigureAgentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A universally unique identifier (UUID) for a profiling instance. For example, if the profiling instance is an
     * Amazon EC2 instance, it is the instance ID. If it is an AWS Fargate container, it is the container's task ID.
     * </p>
     */
    private String fleetInstanceId;
    /**
     * <p>
     * Metadata captured about the compute platform the agent is running on. It includes information about sampling and
     * reporting. The valid fields are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPUTE_PLATFORM</code> - The compute platform on which the agent is running
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AGENT_ID</code> - The ID for an agent instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_REQUEST_ID</code> - The AWS request ID of a Lambda invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTION_ENVIRONMENT</code> - The execution environment a Lambda function is running on.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_FUNCTION_ARN</code> - The Amazon Resource Name (ARN) that is used to invoke a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_MEMORY_LIMIT_IN_MB</code> - The memory allocated to a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_REMAINING_TIME_IN_MILLISECONDS</code> - The time in milliseconds before execution of a Lambda
     * function times out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_TIME_GAP_BETWEEN_INVOKES_IN_MILLISECONDS</code> - The time in milliseconds between two invocations
     * of a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_PREVIOUS_EXECUTION_TIME_IN_MILLISECONDS</code> - The time in milliseconds for the previous Lambda
     * invocation.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * The name of the profiling group for which the configured agent is collecting profiling data.
     * </p>
     */
    private String profilingGroupName;

    /**
     * <p>
     * A universally unique identifier (UUID) for a profiling instance. For example, if the profiling instance is an
     * Amazon EC2 instance, it is the instance ID. If it is an AWS Fargate container, it is the container's task ID.
     * </p>
     * 
     * @param fleetInstanceId
     *        A universally unique identifier (UUID) for a profiling instance. For example, if the profiling instance is
     *        an Amazon EC2 instance, it is the instance ID. If it is an AWS Fargate container, it is the container's
     *        task ID.
     */

    public void setFleetInstanceId(String fleetInstanceId) {
        this.fleetInstanceId = fleetInstanceId;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for a profiling instance. For example, if the profiling instance is an
     * Amazon EC2 instance, it is the instance ID. If it is an AWS Fargate container, it is the container's task ID.
     * </p>
     * 
     * @return A universally unique identifier (UUID) for a profiling instance. For example, if the profiling instance
     *         is an Amazon EC2 instance, it is the instance ID. If it is an AWS Fargate container, it is the
     *         container's task ID.
     */

    public String getFleetInstanceId() {
        return this.fleetInstanceId;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for a profiling instance. For example, if the profiling instance is an
     * Amazon EC2 instance, it is the instance ID. If it is an AWS Fargate container, it is the container's task ID.
     * </p>
     * 
     * @param fleetInstanceId
     *        A universally unique identifier (UUID) for a profiling instance. For example, if the profiling instance is
     *        an Amazon EC2 instance, it is the instance ID. If it is an AWS Fargate container, it is the container's
     *        task ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAgentRequest withFleetInstanceId(String fleetInstanceId) {
        setFleetInstanceId(fleetInstanceId);
        return this;
    }

    /**
     * <p>
     * Metadata captured about the compute platform the agent is running on. It includes information about sampling and
     * reporting. The valid fields are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPUTE_PLATFORM</code> - The compute platform on which the agent is running
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AGENT_ID</code> - The ID for an agent instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_REQUEST_ID</code> - The AWS request ID of a Lambda invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTION_ENVIRONMENT</code> - The execution environment a Lambda function is running on.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_FUNCTION_ARN</code> - The Amazon Resource Name (ARN) that is used to invoke a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_MEMORY_LIMIT_IN_MB</code> - The memory allocated to a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_REMAINING_TIME_IN_MILLISECONDS</code> - The time in milliseconds before execution of a Lambda
     * function times out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_TIME_GAP_BETWEEN_INVOKES_IN_MILLISECONDS</code> - The time in milliseconds between two invocations
     * of a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_PREVIOUS_EXECUTION_TIME_IN_MILLISECONDS</code> - The time in milliseconds for the previous Lambda
     * invocation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Metadata captured about the compute platform the agent is running on. It includes information about
     *         sampling and reporting. The valid fields are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPUTE_PLATFORM</code> - The compute platform on which the agent is running
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AGENT_ID</code> - The ID for an agent instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_REQUEST_ID</code> - The AWS request ID of a Lambda invocation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXECUTION_ENVIRONMENT</code> - The execution environment a Lambda function is running on.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LAMBDA_FUNCTION_ARN</code> - The Amazon Resource Name (ARN) that is used to invoke a Lambda
     *         function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LAMBDA_MEMORY_LIMIT_IN_MB</code> - The memory allocated to a Lambda function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LAMBDA_REMAINING_TIME_IN_MILLISECONDS</code> - The time in milliseconds before execution of a
     *         Lambda function times out.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LAMBDA_TIME_GAP_BETWEEN_INVOKES_IN_MILLISECONDS</code> - The time in milliseconds between two
     *         invocations of a Lambda function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LAMBDA_PREVIOUS_EXECUTION_TIME_IN_MILLISECONDS</code> - The time in milliseconds for the previous
     *         Lambda invocation.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Metadata captured about the compute platform the agent is running on. It includes information about sampling and
     * reporting. The valid fields are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPUTE_PLATFORM</code> - The compute platform on which the agent is running
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AGENT_ID</code> - The ID for an agent instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_REQUEST_ID</code> - The AWS request ID of a Lambda invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTION_ENVIRONMENT</code> - The execution environment a Lambda function is running on.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_FUNCTION_ARN</code> - The Amazon Resource Name (ARN) that is used to invoke a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_MEMORY_LIMIT_IN_MB</code> - The memory allocated to a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_REMAINING_TIME_IN_MILLISECONDS</code> - The time in milliseconds before execution of a Lambda
     * function times out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_TIME_GAP_BETWEEN_INVOKES_IN_MILLISECONDS</code> - The time in milliseconds between two invocations
     * of a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_PREVIOUS_EXECUTION_TIME_IN_MILLISECONDS</code> - The time in milliseconds for the previous Lambda
     * invocation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metadata
     *        Metadata captured about the compute platform the agent is running on. It includes information about
     *        sampling and reporting. The valid fields are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPUTE_PLATFORM</code> - The compute platform on which the agent is running
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AGENT_ID</code> - The ID for an agent instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_REQUEST_ID</code> - The AWS request ID of a Lambda invocation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXECUTION_ENVIRONMENT</code> - The execution environment a Lambda function is running on.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAMBDA_FUNCTION_ARN</code> - The Amazon Resource Name (ARN) that is used to invoke a Lambda
     *        function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAMBDA_MEMORY_LIMIT_IN_MB</code> - The memory allocated to a Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAMBDA_REMAINING_TIME_IN_MILLISECONDS</code> - The time in milliseconds before execution of a Lambda
     *        function times out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAMBDA_TIME_GAP_BETWEEN_INVOKES_IN_MILLISECONDS</code> - The time in milliseconds between two
     *        invocations of a Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAMBDA_PREVIOUS_EXECUTION_TIME_IN_MILLISECONDS</code> - The time in milliseconds for the previous
     *        Lambda invocation.
     *        </p>
     *        </li>
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata captured about the compute platform the agent is running on. It includes information about sampling and
     * reporting. The valid fields are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPUTE_PLATFORM</code> - The compute platform on which the agent is running
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AGENT_ID</code> - The ID for an agent instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_REQUEST_ID</code> - The AWS request ID of a Lambda invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTION_ENVIRONMENT</code> - The execution environment a Lambda function is running on.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_FUNCTION_ARN</code> - The Amazon Resource Name (ARN) that is used to invoke a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_MEMORY_LIMIT_IN_MB</code> - The memory allocated to a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_REMAINING_TIME_IN_MILLISECONDS</code> - The time in milliseconds before execution of a Lambda
     * function times out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_TIME_GAP_BETWEEN_INVOKES_IN_MILLISECONDS</code> - The time in milliseconds between two invocations
     * of a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAMBDA_PREVIOUS_EXECUTION_TIME_IN_MILLISECONDS</code> - The time in milliseconds for the previous Lambda
     * invocation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metadata
     *        Metadata captured about the compute platform the agent is running on. It includes information about
     *        sampling and reporting. The valid fields are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPUTE_PLATFORM</code> - The compute platform on which the agent is running
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AGENT_ID</code> - The ID for an agent instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_REQUEST_ID</code> - The AWS request ID of a Lambda invocation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXECUTION_ENVIRONMENT</code> - The execution environment a Lambda function is running on.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAMBDA_FUNCTION_ARN</code> - The Amazon Resource Name (ARN) that is used to invoke a Lambda
     *        function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAMBDA_MEMORY_LIMIT_IN_MB</code> - The memory allocated to a Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAMBDA_REMAINING_TIME_IN_MILLISECONDS</code> - The time in milliseconds before execution of a Lambda
     *        function times out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAMBDA_TIME_GAP_BETWEEN_INVOKES_IN_MILLISECONDS</code> - The time in milliseconds between two
     *        invocations of a Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAMBDA_PREVIOUS_EXECUTION_TIME_IN_MILLISECONDS</code> - The time in milliseconds for the previous
     *        Lambda invocation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAgentRequest withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see ConfigureAgentRequest#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAgentRequest addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAgentRequest clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * The name of the profiling group for which the configured agent is collecting profiling data.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group for which the configured agent is collecting profiling data.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group for which the configured agent is collecting profiling data.
     * </p>
     * 
     * @return The name of the profiling group for which the configured agent is collecting profiling data.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group for which the configured agent is collecting profiling data.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group for which the configured agent is collecting profiling data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAgentRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
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
        if (getFleetInstanceId() != null)
            sb.append("FleetInstanceId: ").append(getFleetInstanceId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigureAgentRequest == false)
            return false;
        ConfigureAgentRequest other = (ConfigureAgentRequest) obj;
        if (other.getFleetInstanceId() == null ^ this.getFleetInstanceId() == null)
            return false;
        if (other.getFleetInstanceId() != null && other.getFleetInstanceId().equals(this.getFleetInstanceId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetInstanceId() == null) ? 0 : getFleetInstanceId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        return hashCode;
    }

    @Override
    public ConfigureAgentRequest clone() {
        return (ConfigureAgentRequest) super.clone();
    }

}
