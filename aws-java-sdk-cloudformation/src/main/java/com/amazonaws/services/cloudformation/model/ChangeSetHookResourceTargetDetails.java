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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Specifies <code>RESOURCE</code> type target details for activated hooks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ChangeSetHookResourceTargetDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeSetHookResourceTargetDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * The type of CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Specifies the action of the resource.
     * </p>
     */
    private String resourceAction;

    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     * 
     * @param logicalResourceId
     *        The resource's logical ID, which is defined in the stack's template.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     * 
     * @return The resource's logical ID, which is defined in the stack's template.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     * 
     * @param logicalResourceId
     *        The resource's logical ID, which is defined in the stack's template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetHookResourceTargetDetails withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The type of CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @return The type of CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetHookResourceTargetDetails withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specifies the action of the resource.
     * </p>
     * 
     * @param resourceAction
     *        Specifies the action of the resource.
     * @see ChangeAction
     */

    public void setResourceAction(String resourceAction) {
        this.resourceAction = resourceAction;
    }

    /**
     * <p>
     * Specifies the action of the resource.
     * </p>
     * 
     * @return Specifies the action of the resource.
     * @see ChangeAction
     */

    public String getResourceAction() {
        return this.resourceAction;
    }

    /**
     * <p>
     * Specifies the action of the resource.
     * </p>
     * 
     * @param resourceAction
     *        Specifies the action of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public ChangeSetHookResourceTargetDetails withResourceAction(String resourceAction) {
        setResourceAction(resourceAction);
        return this;
    }

    /**
     * <p>
     * Specifies the action of the resource.
     * </p>
     * 
     * @param resourceAction
     *        Specifies the action of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public ChangeSetHookResourceTargetDetails withResourceAction(ChangeAction resourceAction) {
        this.resourceAction = resourceAction.toString();
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
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceAction() != null)
            sb.append("ResourceAction: ").append(getResourceAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeSetHookResourceTargetDetails == false)
            return false;
        ChangeSetHookResourceTargetDetails other = (ChangeSetHookResourceTargetDetails) obj;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceAction() == null ^ this.getResourceAction() == null)
            return false;
        if (other.getResourceAction() != null && other.getResourceAction().equals(this.getResourceAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceAction() == null) ? 0 : getResourceAction().hashCode());
        return hashCode;
    }

    @Override
    public ChangeSetHookResourceTargetDetails clone() {
        try {
            return (ChangeSetHookResourceTargetDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
