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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains detailed information about a framework. Frameworks contain controls, which evaluate and report on your
 * backup events and resources. Frameworks generate daily compliance results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/Framework" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Framework implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting
     * of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     */
    private String frameworkName;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     */
    private String frameworkArn;
    /**
     * <p>
     * An optional description of the framework with a maximum 1,024 characters.
     * </p>
     */
    private String frameworkDescription;
    /**
     * <p>
     * The number of controls contained by the framework.
     * </p>
     */
    private Integer numberOfControls;
    /**
     * <p>
     * The date and time that a framework is created, in ISO 8601 representation. The value of <code>CreationTime</code>
     * is accurate to milliseconds. For example, 2020-07-10T15:00:00.000-08:00 represents the 10th of July 2020 at 3:00
     * PM 8 hours behind UTC.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The deployment status of a framework. The statuses are:
     * </p>
     * <p>
     * <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED | FAILED</code>
     * </p>
     */
    private String deploymentStatus;

    /**
     * <p>
     * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting
     * of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param frameworkName
     *        The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and
     *        consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public void setFrameworkName(String frameworkName) {
        this.frameworkName = frameworkName;
    }

    /**
     * <p>
     * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting
     * of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @return The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and
     *         consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public String getFrameworkName() {
        return this.frameworkName;
    }

    /**
     * <p>
     * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting
     * of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param frameworkName
     *        The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and
     *        consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withFrameworkName(String frameworkName) {
        setFrameworkName(frameworkName);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param frameworkArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     */

    public void setFrameworkArn(String frameworkArn) {
        this.frameworkArn = frameworkArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *         resource type.
     */

    public String getFrameworkArn() {
        return this.frameworkArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param frameworkArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withFrameworkArn(String frameworkArn) {
        setFrameworkArn(frameworkArn);
        return this;
    }

    /**
     * <p>
     * An optional description of the framework with a maximum 1,024 characters.
     * </p>
     * 
     * @param frameworkDescription
     *        An optional description of the framework with a maximum 1,024 characters.
     */

    public void setFrameworkDescription(String frameworkDescription) {
        this.frameworkDescription = frameworkDescription;
    }

    /**
     * <p>
     * An optional description of the framework with a maximum 1,024 characters.
     * </p>
     * 
     * @return An optional description of the framework with a maximum 1,024 characters.
     */

    public String getFrameworkDescription() {
        return this.frameworkDescription;
    }

    /**
     * <p>
     * An optional description of the framework with a maximum 1,024 characters.
     * </p>
     * 
     * @param frameworkDescription
     *        An optional description of the framework with a maximum 1,024 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withFrameworkDescription(String frameworkDescription) {
        setFrameworkDescription(frameworkDescription);
        return this;
    }

    /**
     * <p>
     * The number of controls contained by the framework.
     * </p>
     * 
     * @param numberOfControls
     *        The number of controls contained by the framework.
     */

    public void setNumberOfControls(Integer numberOfControls) {
        this.numberOfControls = numberOfControls;
    }

    /**
     * <p>
     * The number of controls contained by the framework.
     * </p>
     * 
     * @return The number of controls contained by the framework.
     */

    public Integer getNumberOfControls() {
        return this.numberOfControls;
    }

    /**
     * <p>
     * The number of controls contained by the framework.
     * </p>
     * 
     * @param numberOfControls
     *        The number of controls contained by the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withNumberOfControls(Integer numberOfControls) {
        setNumberOfControls(numberOfControls);
        return this;
    }

    /**
     * <p>
     * The date and time that a framework is created, in ISO 8601 representation. The value of <code>CreationTime</code>
     * is accurate to milliseconds. For example, 2020-07-10T15:00:00.000-08:00 represents the 10th of July 2020 at 3:00
     * PM 8 hours behind UTC.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a framework is created, in ISO 8601 representation. The value of
     *        <code>CreationTime</code> is accurate to milliseconds. For example, 2020-07-10T15:00:00.000-08:00
     *        represents the 10th of July 2020 at 3:00 PM 8 hours behind UTC.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that a framework is created, in ISO 8601 representation. The value of <code>CreationTime</code>
     * is accurate to milliseconds. For example, 2020-07-10T15:00:00.000-08:00 represents the 10th of July 2020 at 3:00
     * PM 8 hours behind UTC.
     * </p>
     * 
     * @return The date and time that a framework is created, in ISO 8601 representation. The value of
     *         <code>CreationTime</code> is accurate to milliseconds. For example, 2020-07-10T15:00:00.000-08:00
     *         represents the 10th of July 2020 at 3:00 PM 8 hours behind UTC.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that a framework is created, in ISO 8601 representation. The value of <code>CreationTime</code>
     * is accurate to milliseconds. For example, 2020-07-10T15:00:00.000-08:00 represents the 10th of July 2020 at 3:00
     * PM 8 hours behind UTC.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a framework is created, in ISO 8601 representation. The value of
     *        <code>CreationTime</code> is accurate to milliseconds. For example, 2020-07-10T15:00:00.000-08:00
     *        represents the 10th of July 2020 at 3:00 PM 8 hours behind UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The deployment status of a framework. The statuses are:
     * </p>
     * <p>
     * <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED | FAILED</code>
     * </p>
     * 
     * @param deploymentStatus
     *        The deployment status of a framework. The statuses are:</p>
     *        <p>
     *        <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED | FAILED</code>
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The deployment status of a framework. The statuses are:
     * </p>
     * <p>
     * <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED | FAILED</code>
     * </p>
     * 
     * @return The deployment status of a framework. The statuses are:</p>
     *         <p>
     *         <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED | FAILED</code>
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The deployment status of a framework. The statuses are:
     * </p>
     * <p>
     * <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED | FAILED</code>
     * </p>
     * 
     * @param deploymentStatus
     *        The deployment status of a framework. The statuses are:</p>
     *        <p>
     *        <code>CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED | FAILED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
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
        if (getFrameworkName() != null)
            sb.append("FrameworkName: ").append(getFrameworkName()).append(",");
        if (getFrameworkArn() != null)
            sb.append("FrameworkArn: ").append(getFrameworkArn()).append(",");
        if (getFrameworkDescription() != null)
            sb.append("FrameworkDescription: ").append(getFrameworkDescription()).append(",");
        if (getNumberOfControls() != null)
            sb.append("NumberOfControls: ").append(getNumberOfControls()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Framework == false)
            return false;
        Framework other = (Framework) obj;
        if (other.getFrameworkName() == null ^ this.getFrameworkName() == null)
            return false;
        if (other.getFrameworkName() != null && other.getFrameworkName().equals(this.getFrameworkName()) == false)
            return false;
        if (other.getFrameworkArn() == null ^ this.getFrameworkArn() == null)
            return false;
        if (other.getFrameworkArn() != null && other.getFrameworkArn().equals(this.getFrameworkArn()) == false)
            return false;
        if (other.getFrameworkDescription() == null ^ this.getFrameworkDescription() == null)
            return false;
        if (other.getFrameworkDescription() != null && other.getFrameworkDescription().equals(this.getFrameworkDescription()) == false)
            return false;
        if (other.getNumberOfControls() == null ^ this.getNumberOfControls() == null)
            return false;
        if (other.getNumberOfControls() != null && other.getNumberOfControls().equals(this.getNumberOfControls()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrameworkName() == null) ? 0 : getFrameworkName().hashCode());
        hashCode = prime * hashCode + ((getFrameworkArn() == null) ? 0 : getFrameworkArn().hashCode());
        hashCode = prime * hashCode + ((getFrameworkDescription() == null) ? 0 : getFrameworkDescription().hashCode());
        hashCode = prime * hashCode + ((getNumberOfControls() == null) ? 0 : getNumberOfControls().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        return hashCode;
    }

    @Override
    public Framework clone() {
        try {
            return (Framework) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.FrameworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
