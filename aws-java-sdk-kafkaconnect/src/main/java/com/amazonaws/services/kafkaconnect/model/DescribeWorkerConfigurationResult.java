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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeWorkerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkerConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time that the worker configuration was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The description of the worker configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The latest revision of the custom configuration.
     * </p>
     */
    private WorkerConfigurationRevisionDescription latestRevision;
    /**
     * <p>
     * The name of the worker configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom configuration.
     * </p>
     */
    private String workerConfigurationArn;

    /**
     * <p>
     * The time that the worker configuration was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the worker configuration was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the worker configuration was created.
     * </p>
     * 
     * @return The time that the worker configuration was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the worker configuration was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the worker configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkerConfigurationResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The description of the worker configuration.
     * </p>
     * 
     * @param description
     *        The description of the worker configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the worker configuration.
     * </p>
     * 
     * @return The description of the worker configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the worker configuration.
     * </p>
     * 
     * @param description
     *        The description of the worker configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkerConfigurationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The latest revision of the custom configuration.
     * </p>
     * 
     * @param latestRevision
     *        The latest revision of the custom configuration.
     */

    public void setLatestRevision(WorkerConfigurationRevisionDescription latestRevision) {
        this.latestRevision = latestRevision;
    }

    /**
     * <p>
     * The latest revision of the custom configuration.
     * </p>
     * 
     * @return The latest revision of the custom configuration.
     */

    public WorkerConfigurationRevisionDescription getLatestRevision() {
        return this.latestRevision;
    }

    /**
     * <p>
     * The latest revision of the custom configuration.
     * </p>
     * 
     * @param latestRevision
     *        The latest revision of the custom configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkerConfigurationResult withLatestRevision(WorkerConfigurationRevisionDescription latestRevision) {
        setLatestRevision(latestRevision);
        return this;
    }

    /**
     * <p>
     * The name of the worker configuration.
     * </p>
     * 
     * @param name
     *        The name of the worker configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the worker configuration.
     * </p>
     * 
     * @return The name of the worker configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the worker configuration.
     * </p>
     * 
     * @param name
     *        The name of the worker configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkerConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom configuration.
     * </p>
     * 
     * @param workerConfigurationArn
     *        The Amazon Resource Name (ARN) of the custom configuration.
     */

    public void setWorkerConfigurationArn(String workerConfigurationArn) {
        this.workerConfigurationArn = workerConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom configuration.
     */

    public String getWorkerConfigurationArn() {
        return this.workerConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom configuration.
     * </p>
     * 
     * @param workerConfigurationArn
     *        The Amazon Resource Name (ARN) of the custom configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkerConfigurationResult withWorkerConfigurationArn(String workerConfigurationArn) {
        setWorkerConfigurationArn(workerConfigurationArn);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLatestRevision() != null)
            sb.append("LatestRevision: ").append(getLatestRevision()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getWorkerConfigurationArn() != null)
            sb.append("WorkerConfigurationArn: ").append(getWorkerConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkerConfigurationResult == false)
            return false;
        DescribeWorkerConfigurationResult other = (DescribeWorkerConfigurationResult) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLatestRevision() == null ^ this.getLatestRevision() == null)
            return false;
        if (other.getLatestRevision() != null && other.getLatestRevision().equals(this.getLatestRevision()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getWorkerConfigurationArn() == null ^ this.getWorkerConfigurationArn() == null)
            return false;
        if (other.getWorkerConfigurationArn() != null && other.getWorkerConfigurationArn().equals(this.getWorkerConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLatestRevision() == null) ? 0 : getLatestRevision().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getWorkerConfigurationArn() == null) ? 0 : getWorkerConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkerConfigurationResult clone() {
        try {
            return (DescribeWorkerConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
