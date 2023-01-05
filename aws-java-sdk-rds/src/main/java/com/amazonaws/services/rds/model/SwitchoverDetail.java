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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the details about a blue/green deployment.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html">Using Amazon RDS Blue/Green
 * Deployments for database updates</a> in the <i>Amazon RDS User Guide</i> and <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/blue-green-deployments.html"> Using Amazon RDS
 * Blue/Green Deployments for database updates</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/SwitchoverDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SwitchoverDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource in the blue environment.
     * </p>
     */
    private String sourceMember;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource in the green environment.
     * </p>
     */
    private String targetMember;
    /**
     * <p>
     * The switchover status of a resource in a blue/green deployment.
     * </p>
     * <p>
     * Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>preparing-for-switchover</code> - The resource is being prepared to switch over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ready-for-switchover</code> - The resource is ready to switch over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-in-progress</code> - The resource is being switched over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-completed</code> - The resource has been switched over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-failed</code> - The resource attempted to switch over but failed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource in the blue environment.
     * </p>
     * 
     * @param sourceMember
     *        The Amazon Resource Name (ARN) of a resource in the blue environment.
     */

    public void setSourceMember(String sourceMember) {
        this.sourceMember = sourceMember;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource in the blue environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a resource in the blue environment.
     */

    public String getSourceMember() {
        return this.sourceMember;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource in the blue environment.
     * </p>
     * 
     * @param sourceMember
     *        The Amazon Resource Name (ARN) of a resource in the blue environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SwitchoverDetail withSourceMember(String sourceMember) {
        setSourceMember(sourceMember);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource in the green environment.
     * </p>
     * 
     * @param targetMember
     *        The Amazon Resource Name (ARN) of a resource in the green environment.
     */

    public void setTargetMember(String targetMember) {
        this.targetMember = targetMember;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource in the green environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a resource in the green environment.
     */

    public String getTargetMember() {
        return this.targetMember;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource in the green environment.
     * </p>
     * 
     * @param targetMember
     *        The Amazon Resource Name (ARN) of a resource in the green environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SwitchoverDetail withTargetMember(String targetMember) {
        setTargetMember(targetMember);
        return this;
    }

    /**
     * <p>
     * The switchover status of a resource in a blue/green deployment.
     * </p>
     * <p>
     * Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>preparing-for-switchover</code> - The resource is being prepared to switch over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ready-for-switchover</code> - The resource is ready to switch over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-in-progress</code> - The resource is being switched over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-completed</code> - The resource has been switched over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-failed</code> - The resource attempted to switch over but failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The switchover status of a resource in a blue/green deployment.</p>
     *        <p>
     *        Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>preparing-for-switchover</code> - The resource is being prepared to switch over.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ready-for-switchover</code> - The resource is ready to switch over.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>switchover-in-progress</code> - The resource is being switched over.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>switchover-completed</code> - The resource has been switched over.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>switchover-failed</code> - The resource attempted to switch over but failed.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The switchover status of a resource in a blue/green deployment.
     * </p>
     * <p>
     * Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>preparing-for-switchover</code> - The resource is being prepared to switch over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ready-for-switchover</code> - The resource is ready to switch over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-in-progress</code> - The resource is being switched over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-completed</code> - The resource has been switched over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-failed</code> - The resource attempted to switch over but failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The switchover status of a resource in a blue/green deployment.</p>
     *         <p>
     *         Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>preparing-for-switchover</code> - The resource is being prepared to switch over.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ready-for-switchover</code> - The resource is ready to switch over.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>switchover-in-progress</code> - The resource is being switched over.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>switchover-completed</code> - The resource has been switched over.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>switchover-failed</code> - The resource attempted to switch over but failed.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The switchover status of a resource in a blue/green deployment.
     * </p>
     * <p>
     * Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>preparing-for-switchover</code> - The resource is being prepared to switch over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ready-for-switchover</code> - The resource is ready to switch over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-in-progress</code> - The resource is being switched over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-completed</code> - The resource has been switched over.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>switchover-failed</code> - The resource attempted to switch over but failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The switchover status of a resource in a blue/green deployment.</p>
     *        <p>
     *        Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>preparing-for-switchover</code> - The resource is being prepared to switch over.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ready-for-switchover</code> - The resource is ready to switch over.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>switchover-in-progress</code> - The resource is being switched over.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>switchover-completed</code> - The resource has been switched over.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>switchover-failed</code> - The resource attempted to switch over but failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SwitchoverDetail withStatus(String status) {
        setStatus(status);
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
        if (getSourceMember() != null)
            sb.append("SourceMember: ").append(getSourceMember()).append(",");
        if (getTargetMember() != null)
            sb.append("TargetMember: ").append(getTargetMember()).append(",");
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

        if (obj instanceof SwitchoverDetail == false)
            return false;
        SwitchoverDetail other = (SwitchoverDetail) obj;
        if (other.getSourceMember() == null ^ this.getSourceMember() == null)
            return false;
        if (other.getSourceMember() != null && other.getSourceMember().equals(this.getSourceMember()) == false)
            return false;
        if (other.getTargetMember() == null ^ this.getTargetMember() == null)
            return false;
        if (other.getTargetMember() != null && other.getTargetMember().equals(this.getTargetMember()) == false)
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

        hashCode = prime * hashCode + ((getSourceMember() == null) ? 0 : getSourceMember().hashCode());
        hashCode = prime * hashCode + ((getTargetMember() == null) ? 0 : getTargetMember().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SwitchoverDetail clone() {
        try {
            return (SwitchoverDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
