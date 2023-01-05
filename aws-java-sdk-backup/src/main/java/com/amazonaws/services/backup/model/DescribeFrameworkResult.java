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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeFramework" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFrameworkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of a framework.
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
     * An optional description of the framework.
     * </p>
     */
    private String frameworkDescription;
    /**
     * <p>
     * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and
     * scope.
     * </p>
     */
    private java.util.List<FrameworkControl> frameworkControls;
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
     * A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup
     * selections, backup vaults, or recovery points. You can also turn Config recording on or off for each resource.
     * The statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> when recording is turned on for all resources governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIALLY_ACTIVE</code> when recording is turned off for at least one resource governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> when recording is turned off for all resources governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code> when Backup is unable to validate recording status at this time.
     * </p>
     * </li>
     * </ul>
     */
    private String frameworkStatus;
    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>DescribeFrameworkOutput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The unique name of a framework.
     * </p>
     * 
     * @param frameworkName
     *        The unique name of a framework.
     */

    public void setFrameworkName(String frameworkName) {
        this.frameworkName = frameworkName;
    }

    /**
     * <p>
     * The unique name of a framework.
     * </p>
     * 
     * @return The unique name of a framework.
     */

    public String getFrameworkName() {
        return this.frameworkName;
    }

    /**
     * <p>
     * The unique name of a framework.
     * </p>
     * 
     * @param frameworkName
     *        The unique name of a framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFrameworkResult withFrameworkName(String frameworkName) {
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

    public DescribeFrameworkResult withFrameworkArn(String frameworkArn) {
        setFrameworkArn(frameworkArn);
        return this;
    }

    /**
     * <p>
     * An optional description of the framework.
     * </p>
     * 
     * @param frameworkDescription
     *        An optional description of the framework.
     */

    public void setFrameworkDescription(String frameworkDescription) {
        this.frameworkDescription = frameworkDescription;
    }

    /**
     * <p>
     * An optional description of the framework.
     * </p>
     * 
     * @return An optional description of the framework.
     */

    public String getFrameworkDescription() {
        return this.frameworkDescription;
    }

    /**
     * <p>
     * An optional description of the framework.
     * </p>
     * 
     * @param frameworkDescription
     *        An optional description of the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFrameworkResult withFrameworkDescription(String frameworkDescription) {
        setFrameworkDescription(frameworkDescription);
        return this;
    }

    /**
     * <p>
     * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and
     * scope.
     * </p>
     * 
     * @return A list of the controls that make up the framework. Each control in the list has a name, input parameters,
     *         and scope.
     */

    public java.util.List<FrameworkControl> getFrameworkControls() {
        return frameworkControls;
    }

    /**
     * <p>
     * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and
     * scope.
     * </p>
     * 
     * @param frameworkControls
     *        A list of the controls that make up the framework. Each control in the list has a name, input parameters,
     *        and scope.
     */

    public void setFrameworkControls(java.util.Collection<FrameworkControl> frameworkControls) {
        if (frameworkControls == null) {
            this.frameworkControls = null;
            return;
        }

        this.frameworkControls = new java.util.ArrayList<FrameworkControl>(frameworkControls);
    }

    /**
     * <p>
     * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and
     * scope.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFrameworkControls(java.util.Collection)} or {@link #withFrameworkControls(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param frameworkControls
     *        A list of the controls that make up the framework. Each control in the list has a name, input parameters,
     *        and scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFrameworkResult withFrameworkControls(FrameworkControl... frameworkControls) {
        if (this.frameworkControls == null) {
            setFrameworkControls(new java.util.ArrayList<FrameworkControl>(frameworkControls.length));
        }
        for (FrameworkControl ele : frameworkControls) {
            this.frameworkControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and
     * scope.
     * </p>
     * 
     * @param frameworkControls
     *        A list of the controls that make up the framework. Each control in the list has a name, input parameters,
     *        and scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFrameworkResult withFrameworkControls(java.util.Collection<FrameworkControl> frameworkControls) {
        setFrameworkControls(frameworkControls);
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

    public DescribeFrameworkResult withCreationTime(java.util.Date creationTime) {
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

    public DescribeFrameworkResult withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup
     * selections, backup vaults, or recovery points. You can also turn Config recording on or off for each resource.
     * The statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> when recording is turned on for all resources governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIALLY_ACTIVE</code> when recording is turned off for at least one resource governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> when recording is turned off for all resources governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code> when Backup is unable to validate recording status at this time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param frameworkStatus
     *        A framework consists of one or more controls. Each control governs a resource, such as backup plans,
     *        backup selections, backup vaults, or recovery points. You can also turn Config recording on or off for
     *        each resource. The statuses are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> when recording is turned on for all resources governed by the framework.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARTIALLY_ACTIVE</code> when recording is turned off for at least one resource governed by the
     *        framework.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code> when recording is turned off for all resources governed by the framework.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNAVAILABLE</code> when Backup is unable to validate recording status at this time.
     *        </p>
     *        </li>
     */

    public void setFrameworkStatus(String frameworkStatus) {
        this.frameworkStatus = frameworkStatus;
    }

    /**
     * <p>
     * A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup
     * selections, backup vaults, or recovery points. You can also turn Config recording on or off for each resource.
     * The statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> when recording is turned on for all resources governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIALLY_ACTIVE</code> when recording is turned off for at least one resource governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> when recording is turned off for all resources governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code> when Backup is unable to validate recording status at this time.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A framework consists of one or more controls. Each control governs a resource, such as backup plans,
     *         backup selections, backup vaults, or recovery points. You can also turn Config recording on or off for
     *         each resource. The statuses are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> when recording is turned on for all resources governed by the framework.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PARTIALLY_ACTIVE</code> when recording is turned off for at least one resource governed by the
     *         framework.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACTIVE</code> when recording is turned off for all resources governed by the framework.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNAVAILABLE</code> when Backup is unable to validate recording status at this time.
     *         </p>
     *         </li>
     */

    public String getFrameworkStatus() {
        return this.frameworkStatus;
    }

    /**
     * <p>
     * A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup
     * selections, backup vaults, or recovery points. You can also turn Config recording on or off for each resource.
     * The statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> when recording is turned on for all resources governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIALLY_ACTIVE</code> when recording is turned off for at least one resource governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code> when recording is turned off for all resources governed by the framework.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code> when Backup is unable to validate recording status at this time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param frameworkStatus
     *        A framework consists of one or more controls. Each control governs a resource, such as backup plans,
     *        backup selections, backup vaults, or recovery points. You can also turn Config recording on or off for
     *        each resource. The statuses are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> when recording is turned on for all resources governed by the framework.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARTIALLY_ACTIVE</code> when recording is turned off for at least one resource governed by the
     *        framework.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code> when recording is turned off for all resources governed by the framework.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNAVAILABLE</code> when Backup is unable to validate recording status at this time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFrameworkResult withFrameworkStatus(String frameworkStatus) {
        setFrameworkStatus(frameworkStatus);
        return this;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>DescribeFrameworkOutput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *        <code>DescribeFrameworkOutput</code>. Retrying a successful request with the same idempotency token
     *        results in a success message with no action taken.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>DescribeFrameworkOutput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @return A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *         <code>DescribeFrameworkOutput</code>. Retrying a successful request with the same idempotency token
     *         results in a success message with no action taken.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>DescribeFrameworkOutput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *        <code>DescribeFrameworkOutput</code>. Retrying a successful request with the same idempotency token
     *        results in a success message with no action taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFrameworkResult withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getFrameworkControls() != null)
            sb.append("FrameworkControls: ").append(getFrameworkControls()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getFrameworkStatus() != null)
            sb.append("FrameworkStatus: ").append(getFrameworkStatus()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFrameworkResult == false)
            return false;
        DescribeFrameworkResult other = (DescribeFrameworkResult) obj;
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
        if (other.getFrameworkControls() == null ^ this.getFrameworkControls() == null)
            return false;
        if (other.getFrameworkControls() != null && other.getFrameworkControls().equals(this.getFrameworkControls()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getFrameworkStatus() == null ^ this.getFrameworkStatus() == null)
            return false;
        if (other.getFrameworkStatus() != null && other.getFrameworkStatus().equals(this.getFrameworkStatus()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
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
        hashCode = prime * hashCode + ((getFrameworkControls() == null) ? 0 : getFrameworkControls().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getFrameworkStatus() == null) ? 0 : getFrameworkStatus().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFrameworkResult clone() {
        try {
            return (DescribeFrameworkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
