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
 * Specifies the resource, the hook, and the hook version to be invoked.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ChangeSetHook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeSetHook implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the points in provisioning logic where a hook is invoked.
     * </p>
     */
    private String invocationPoint;
    /**
     * <p>
     * Specify the hook failure mode for non-compliant resources in the followings ways.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAIL</code> Stops provisioning resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN</code> Allows provisioning to continue with a warning message.
     * </p>
     * </li>
     * </ul>
     */
    private String failureMode;
    /**
     * <p>
     * The unique name for your hook. Specifies a three-part namespace for your hook, with a recommended pattern of
     * <code>Organization::Service::Hook</code>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and can't be used in your hook type names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private String typeName;
    /**
     * <p>
     * The version ID of the type specified.
     * </p>
     */
    private String typeVersionId;
    /**
     * <p>
     * The version ID of the type configuration.
     * </p>
     */
    private String typeConfigurationVersionId;
    /**
     * <p>
     * Specifies details about the target that the hook will run against.
     * </p>
     */
    private ChangeSetHookTargetDetails targetDetails;

    /**
     * <p>
     * Specifies the points in provisioning logic where a hook is invoked.
     * </p>
     * 
     * @param invocationPoint
     *        Specifies the points in provisioning logic where a hook is invoked.
     * @see HookInvocationPoint
     */

    public void setInvocationPoint(String invocationPoint) {
        this.invocationPoint = invocationPoint;
    }

    /**
     * <p>
     * Specifies the points in provisioning logic where a hook is invoked.
     * </p>
     * 
     * @return Specifies the points in provisioning logic where a hook is invoked.
     * @see HookInvocationPoint
     */

    public String getInvocationPoint() {
        return this.invocationPoint;
    }

    /**
     * <p>
     * Specifies the points in provisioning logic where a hook is invoked.
     * </p>
     * 
     * @param invocationPoint
     *        Specifies the points in provisioning logic where a hook is invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HookInvocationPoint
     */

    public ChangeSetHook withInvocationPoint(String invocationPoint) {
        setInvocationPoint(invocationPoint);
        return this;
    }

    /**
     * <p>
     * Specifies the points in provisioning logic where a hook is invoked.
     * </p>
     * 
     * @param invocationPoint
     *        Specifies the points in provisioning logic where a hook is invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HookInvocationPoint
     */

    public ChangeSetHook withInvocationPoint(HookInvocationPoint invocationPoint) {
        this.invocationPoint = invocationPoint.toString();
        return this;
    }

    /**
     * <p>
     * Specify the hook failure mode for non-compliant resources in the followings ways.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAIL</code> Stops provisioning resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN</code> Allows provisioning to continue with a warning message.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureMode
     *        Specify the hook failure mode for non-compliant resources in the followings ways.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAIL</code> Stops provisioning resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARN</code> Allows provisioning to continue with a warning message.
     *        </p>
     *        </li>
     * @see HookFailureMode
     */

    public void setFailureMode(String failureMode) {
        this.failureMode = failureMode;
    }

    /**
     * <p>
     * Specify the hook failure mode for non-compliant resources in the followings ways.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAIL</code> Stops provisioning resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN</code> Allows provisioning to continue with a warning message.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify the hook failure mode for non-compliant resources in the followings ways.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FAIL</code> Stops provisioning resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WARN</code> Allows provisioning to continue with a warning message.
     *         </p>
     *         </li>
     * @see HookFailureMode
     */

    public String getFailureMode() {
        return this.failureMode;
    }

    /**
     * <p>
     * Specify the hook failure mode for non-compliant resources in the followings ways.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAIL</code> Stops provisioning resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN</code> Allows provisioning to continue with a warning message.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureMode
     *        Specify the hook failure mode for non-compliant resources in the followings ways.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAIL</code> Stops provisioning resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARN</code> Allows provisioning to continue with a warning message.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HookFailureMode
     */

    public ChangeSetHook withFailureMode(String failureMode) {
        setFailureMode(failureMode);
        return this;
    }

    /**
     * <p>
     * Specify the hook failure mode for non-compliant resources in the followings ways.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAIL</code> Stops provisioning resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN</code> Allows provisioning to continue with a warning message.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureMode
     *        Specify the hook failure mode for non-compliant resources in the followings ways.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAIL</code> Stops provisioning resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARN</code> Allows provisioning to continue with a warning message.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HookFailureMode
     */

    public ChangeSetHook withFailureMode(HookFailureMode failureMode) {
        this.failureMode = failureMode.toString();
        return this;
    }

    /**
     * <p>
     * The unique name for your hook. Specifies a three-part namespace for your hook, with a recommended pattern of
     * <code>Organization::Service::Hook</code>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and can't be used in your hook type names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param typeName
     *        The unique name for your hook. Specifies a three-part namespace for your hook, with a recommended pattern
     *        of <code>Organization::Service::Hook</code>.</p> <note>
     *        <p>
     *        The following organization namespaces are reserved and can't be used in your hook type names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Alexa</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AMZN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Amazon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Custom</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dev</code>
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The unique name for your hook. Specifies a three-part namespace for your hook, with a recommended pattern of
     * <code>Organization::Service::Hook</code>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and can't be used in your hook type names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return The unique name for your hook. Specifies a three-part namespace for your hook, with a recommended pattern
     *         of <code>Organization::Service::Hook</code>.</p> <note>
     *         <p>
     *         The following organization namespaces are reserved and can't be used in your hook type names:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Alexa</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AMZN</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Amazon</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASK</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Custom</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Dev</code>
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The unique name for your hook. Specifies a three-part namespace for your hook, with a recommended pattern of
     * <code>Organization::Service::Hook</code>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and can't be used in your hook type names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param typeName
     *        The unique name for your hook. Specifies a three-part namespace for your hook, with a recommended pattern
     *        of <code>Organization::Service::Hook</code>.</p> <note>
     *        <p>
     *        The following organization namespaces are reserved and can't be used in your hook type names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Alexa</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AMZN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Amazon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Custom</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dev</code>
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetHook withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The version ID of the type specified.
     * </p>
     * 
     * @param typeVersionId
     *        The version ID of the type specified.
     */

    public void setTypeVersionId(String typeVersionId) {
        this.typeVersionId = typeVersionId;
    }

    /**
     * <p>
     * The version ID of the type specified.
     * </p>
     * 
     * @return The version ID of the type specified.
     */

    public String getTypeVersionId() {
        return this.typeVersionId;
    }

    /**
     * <p>
     * The version ID of the type specified.
     * </p>
     * 
     * @param typeVersionId
     *        The version ID of the type specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetHook withTypeVersionId(String typeVersionId) {
        setTypeVersionId(typeVersionId);
        return this;
    }

    /**
     * <p>
     * The version ID of the type configuration.
     * </p>
     * 
     * @param typeConfigurationVersionId
     *        The version ID of the type configuration.
     */

    public void setTypeConfigurationVersionId(String typeConfigurationVersionId) {
        this.typeConfigurationVersionId = typeConfigurationVersionId;
    }

    /**
     * <p>
     * The version ID of the type configuration.
     * </p>
     * 
     * @return The version ID of the type configuration.
     */

    public String getTypeConfigurationVersionId() {
        return this.typeConfigurationVersionId;
    }

    /**
     * <p>
     * The version ID of the type configuration.
     * </p>
     * 
     * @param typeConfigurationVersionId
     *        The version ID of the type configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetHook withTypeConfigurationVersionId(String typeConfigurationVersionId) {
        setTypeConfigurationVersionId(typeConfigurationVersionId);
        return this;
    }

    /**
     * <p>
     * Specifies details about the target that the hook will run against.
     * </p>
     * 
     * @param targetDetails
     *        Specifies details about the target that the hook will run against.
     */

    public void setTargetDetails(ChangeSetHookTargetDetails targetDetails) {
        this.targetDetails = targetDetails;
    }

    /**
     * <p>
     * Specifies details about the target that the hook will run against.
     * </p>
     * 
     * @return Specifies details about the target that the hook will run against.
     */

    public ChangeSetHookTargetDetails getTargetDetails() {
        return this.targetDetails;
    }

    /**
     * <p>
     * Specifies details about the target that the hook will run against.
     * </p>
     * 
     * @param targetDetails
     *        Specifies details about the target that the hook will run against.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetHook withTargetDetails(ChangeSetHookTargetDetails targetDetails) {
        setTargetDetails(targetDetails);
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
        if (getInvocationPoint() != null)
            sb.append("InvocationPoint: ").append(getInvocationPoint()).append(",");
        if (getFailureMode() != null)
            sb.append("FailureMode: ").append(getFailureMode()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getTypeVersionId() != null)
            sb.append("TypeVersionId: ").append(getTypeVersionId()).append(",");
        if (getTypeConfigurationVersionId() != null)
            sb.append("TypeConfigurationVersionId: ").append(getTypeConfigurationVersionId()).append(",");
        if (getTargetDetails() != null)
            sb.append("TargetDetails: ").append(getTargetDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeSetHook == false)
            return false;
        ChangeSetHook other = (ChangeSetHook) obj;
        if (other.getInvocationPoint() == null ^ this.getInvocationPoint() == null)
            return false;
        if (other.getInvocationPoint() != null && other.getInvocationPoint().equals(this.getInvocationPoint()) == false)
            return false;
        if (other.getFailureMode() == null ^ this.getFailureMode() == null)
            return false;
        if (other.getFailureMode() != null && other.getFailureMode().equals(this.getFailureMode()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getTypeVersionId() == null ^ this.getTypeVersionId() == null)
            return false;
        if (other.getTypeVersionId() != null && other.getTypeVersionId().equals(this.getTypeVersionId()) == false)
            return false;
        if (other.getTypeConfigurationVersionId() == null ^ this.getTypeConfigurationVersionId() == null)
            return false;
        if (other.getTypeConfigurationVersionId() != null && other.getTypeConfigurationVersionId().equals(this.getTypeConfigurationVersionId()) == false)
            return false;
        if (other.getTargetDetails() == null ^ this.getTargetDetails() == null)
            return false;
        if (other.getTargetDetails() != null && other.getTargetDetails().equals(this.getTargetDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvocationPoint() == null) ? 0 : getInvocationPoint().hashCode());
        hashCode = prime * hashCode + ((getFailureMode() == null) ? 0 : getFailureMode().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getTypeVersionId() == null) ? 0 : getTypeVersionId().hashCode());
        hashCode = prime * hashCode + ((getTypeConfigurationVersionId() == null) ? 0 : getTypeConfigurationVersionId().hashCode());
        hashCode = prime * hashCode + ((getTargetDetails() == null) ? 0 : getTargetDetails().hashCode());
        return hashCode;
    }

    @Override
    public ChangeSetHook clone() {
        try {
            return (ChangeSetHook) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
