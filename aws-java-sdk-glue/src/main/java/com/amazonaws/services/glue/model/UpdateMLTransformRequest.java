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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateMLTransform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMLTransformRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier that was generated when the transform was created.
     * </p>
     */
    private String transformId;
    /**
     * <p>
     * The unique name that you gave the transform when you created it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the transform. The default is an empty string.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The configuration parameters that are specific to the transform type (algorithm) used. Conditionally dependent on
     * the transform type.
     * </p>
     */
    private TransformParameters parameters;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can
     * allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     * <code>MaxCapacity</code> field is set automatically and becomes read-only.
     * </p>
     */
    private Double maxCapacity;
    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     */
    private String workerType;
    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this
     * transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The default is
     * 2,880 minutes (48 hours).
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a task run fails.
     * </p>
     */
    private Integer maxRetries;

    /**
     * <p>
     * A unique identifier that was generated when the transform was created.
     * </p>
     * 
     * @param transformId
     *        A unique identifier that was generated when the transform was created.
     */

    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * A unique identifier that was generated when the transform was created.
     * </p>
     * 
     * @return A unique identifier that was generated when the transform was created.
     */

    public String getTransformId() {
        return this.transformId;
    }

    /**
     * <p>
     * A unique identifier that was generated when the transform was created.
     * </p>
     * 
     * @param transformId
     *        A unique identifier that was generated when the transform was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLTransformRequest withTransformId(String transformId) {
        setTransformId(transformId);
        return this;
    }

    /**
     * <p>
     * The unique name that you gave the transform when you created it.
     * </p>
     * 
     * @param name
     *        The unique name that you gave the transform when you created it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name that you gave the transform when you created it.
     * </p>
     * 
     * @return The unique name that you gave the transform when you created it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name that you gave the transform when you created it.
     * </p>
     * 
     * @param name
     *        The unique name that you gave the transform when you created it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLTransformRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the transform. The default is an empty string.
     * </p>
     * 
     * @param description
     *        A description of the transform. The default is an empty string.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the transform. The default is an empty string.
     * </p>
     * 
     * @return A description of the transform. The default is an empty string.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the transform. The default is an empty string.
     * </p>
     * 
     * @param description
     *        A description of the transform. The default is an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLTransformRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The configuration parameters that are specific to the transform type (algorithm) used. Conditionally dependent on
     * the transform type.
     * </p>
     * 
     * @param parameters
     *        The configuration parameters that are specific to the transform type (algorithm) used. Conditionally
     *        dependent on the transform type.
     */

    public void setParameters(TransformParameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The configuration parameters that are specific to the transform type (algorithm) used. Conditionally dependent on
     * the transform type.
     * </p>
     * 
     * @return The configuration parameters that are specific to the transform type (algorithm) used. Conditionally
     *         dependent on the transform type.
     */

    public TransformParameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The configuration parameters that are specific to the transform type (algorithm) used. Conditionally dependent on
     * the transform type.
     * </p>
     * 
     * @param parameters
     *        The configuration parameters that are specific to the transform type (algorithm) used. Conditionally
     *        dependent on the transform type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLTransformRequest withParameters(TransformParameters parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     * </p>
     * 
     * @param role
     *        The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     * </p>
     * 
     * @param role
     *        The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLTransformRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can
     * allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     * <code>MaxCapacity</code> field is set automatically and becomes read-only.
     * </p>
     * 
     * @param maxCapacity
     *        The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform.
     *        You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power
     *        that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>. </p>
     *        <p>
     *        When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     *        <code>MaxCapacity</code> field is set automatically and becomes read-only.
     */

    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can
     * allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     * <code>MaxCapacity</code> field is set automatically and becomes read-only.
     * </p>
     * 
     * @return The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform.
     *         You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power
     *         that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     *         href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>. </p>
     *         <p>
     *         When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     *         <code>MaxCapacity</code> field is set automatically and becomes read-only.
     */

    public Double getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can
     * allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     * <code>MaxCapacity</code> field is set automatically and becomes read-only.
     * </p>
     * 
     * @param maxCapacity
     *        The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform.
     *        You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power
     *        that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>. </p>
     *        <p>
     *        When the <code>WorkerType</code> field is set to a value other than <code>Standard</code>, the
     *        <code>MaxCapacity</code> field is set automatically and becomes read-only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLTransformRequest withMaxCapacity(Double maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or
     *        G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     *        executor per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *        1 executor per worker.
     *        </p>
     *        </li>
     * @see WorkerType
     */

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X,
     *         or G.2X.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *         and 2 executors per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and
     *         1 executor per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *         1 executor per worker.
     *         </p>
     *         </li>
     * @see WorkerType
     */

    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or
     *        G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     *        executor per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *        1 executor per worker.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public UpdateMLTransformRequest withWorkerType(String workerType) {
        setWorkerType(workerType);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or
     *        G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     *        executor per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *        1 executor per worker.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public UpdateMLTransformRequest withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     */

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     * </p>
     * 
     * @return The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     */

    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated when this task runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLTransformRequest withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this
     * transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The default is
     * 2,880 minutes (48 hours).
     * </p>
     * 
     * @param timeout
     *        The timeout for a task run for this transform in minutes. This is the maximum time that a task run for
     *        this transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The
     *        default is 2,880 minutes (48 hours).
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this
     * transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The default is
     * 2,880 minutes (48 hours).
     * </p>
     * 
     * @return The timeout for a task run for this transform in minutes. This is the maximum time that a task run for
     *         this transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The
     *         default is 2,880 minutes (48 hours).
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this
     * transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The default is
     * 2,880 minutes (48 hours).
     * </p>
     * 
     * @param timeout
     *        The timeout for a task run for this transform in minutes. This is the maximum time that a task run for
     *        this transform can consume resources before it is terminated and enters <code>TIMEOUT</code> status. The
     *        default is 2,880 minutes (48 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLTransformRequest withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a task run fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry a task for this transform after a task run fails.
     */

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a task run fails.
     * </p>
     * 
     * @return The maximum number of times to retry a task for this transform after a task run fails.
     */

    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a task run fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry a task for this transform after a task run fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLTransformRequest withMaxRetries(Integer maxRetries) {
        setMaxRetries(maxRetries);
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
        if (getTransformId() != null)
            sb.append("TransformId: ").append(getTransformId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getWorkerType() != null)
            sb.append("WorkerType: ").append(getWorkerType()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: ").append(getMaxRetries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMLTransformRequest == false)
            return false;
        UpdateMLTransformRequest other = (UpdateMLTransformRequest) obj;
        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMLTransformRequest clone() {
        return (UpdateMLTransformRequest) super.clone();
    }

}
