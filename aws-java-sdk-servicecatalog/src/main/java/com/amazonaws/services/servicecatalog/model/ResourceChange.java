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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a resource change that will occur when a plan is executed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ResourceChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The change action.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The ID of the resource, as defined in the CloudFormation template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * The ID of the resource, if it was already created.
     * </p>
     */
    private String physicalResourceId;
    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * If the change type is <code>Modify</code>, indicates whether the existing resource is deleted and replaced with a
     * new one.
     * </p>
     */
    private String replacement;
    /**
     * <p>
     * The change scope.
     * </p>
     */
    private java.util.List<String> scope;
    /**
     * <p>
     * Information about the resource changes.
     * </p>
     */
    private java.util.List<ResourceChangeDetail> details;

    /**
     * <p>
     * The change action.
     * </p>
     * 
     * @param action
     *        The change action.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The change action.
     * </p>
     * 
     * @return The change action.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The change action.
     * </p>
     * 
     * @param action
     *        The change action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public ResourceChange withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The change action.
     * </p>
     * 
     * @param action
     *        The change action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public ResourceChange withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource, as defined in the CloudFormation template.
     * </p>
     * 
     * @param logicalResourceId
     *        The ID of the resource, as defined in the CloudFormation template.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The ID of the resource, as defined in the CloudFormation template.
     * </p>
     * 
     * @return The ID of the resource, as defined in the CloudFormation template.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The ID of the resource, as defined in the CloudFormation template.
     * </p>
     * 
     * @param logicalResourceId
     *        The ID of the resource, as defined in the CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChange withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The ID of the resource, if it was already created.
     * </p>
     * 
     * @param physicalResourceId
     *        The ID of the resource, if it was already created.
     */

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The ID of the resource, if it was already created.
     * </p>
     * 
     * @return The ID of the resource, if it was already created.
     */

    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The ID of the resource, if it was already created.
     * </p>
     * 
     * @param physicalResourceId
     *        The ID of the resource, if it was already created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChange withPhysicalResourceId(String physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @return The type of resource.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChange withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * If the change type is <code>Modify</code>, indicates whether the existing resource is deleted and replaced with a
     * new one.
     * </p>
     * 
     * @param replacement
     *        If the change type is <code>Modify</code>, indicates whether the existing resource is deleted and replaced
     *        with a new one.
     * @see Replacement
     */

    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    /**
     * <p>
     * If the change type is <code>Modify</code>, indicates whether the existing resource is deleted and replaced with a
     * new one.
     * </p>
     * 
     * @return If the change type is <code>Modify</code>, indicates whether the existing resource is deleted and
     *         replaced with a new one.
     * @see Replacement
     */

    public String getReplacement() {
        return this.replacement;
    }

    /**
     * <p>
     * If the change type is <code>Modify</code>, indicates whether the existing resource is deleted and replaced with a
     * new one.
     * </p>
     * 
     * @param replacement
     *        If the change type is <code>Modify</code>, indicates whether the existing resource is deleted and replaced
     *        with a new one.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Replacement
     */

    public ResourceChange withReplacement(String replacement) {
        setReplacement(replacement);
        return this;
    }

    /**
     * <p>
     * If the change type is <code>Modify</code>, indicates whether the existing resource is deleted and replaced with a
     * new one.
     * </p>
     * 
     * @param replacement
     *        If the change type is <code>Modify</code>, indicates whether the existing resource is deleted and replaced
     *        with a new one.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Replacement
     */

    public ResourceChange withReplacement(Replacement replacement) {
        this.replacement = replacement.toString();
        return this;
    }

    /**
     * <p>
     * The change scope.
     * </p>
     * 
     * @return The change scope.
     * @see ResourceAttribute
     */

    public java.util.List<String> getScope() {
        return scope;
    }

    /**
     * <p>
     * The change scope.
     * </p>
     * 
     * @param scope
     *        The change scope.
     * @see ResourceAttribute
     */

    public void setScope(java.util.Collection<String> scope) {
        if (scope == null) {
            this.scope = null;
            return;
        }

        this.scope = new java.util.ArrayList<String>(scope);
    }

    /**
     * <p>
     * The change scope.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScope(java.util.Collection)} or {@link #withScope(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scope
     *        The change scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttribute
     */

    public ResourceChange withScope(String... scope) {
        if (this.scope == null) {
            setScope(new java.util.ArrayList<String>(scope.length));
        }
        for (String ele : scope) {
            this.scope.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The change scope.
     * </p>
     * 
     * @param scope
     *        The change scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttribute
     */

    public ResourceChange withScope(java.util.Collection<String> scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The change scope.
     * </p>
     * 
     * @param scope
     *        The change scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttribute
     */

    public ResourceChange withScope(ResourceAttribute... scope) {
        java.util.ArrayList<String> scopeCopy = new java.util.ArrayList<String>(scope.length);
        for (ResourceAttribute value : scope) {
            scopeCopy.add(value.toString());
        }
        if (getScope() == null) {
            setScope(scopeCopy);
        } else {
            getScope().addAll(scopeCopy);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource changes.
     * </p>
     * 
     * @return Information about the resource changes.
     */

    public java.util.List<ResourceChangeDetail> getDetails() {
        return details;
    }

    /**
     * <p>
     * Information about the resource changes.
     * </p>
     * 
     * @param details
     *        Information about the resource changes.
     */

    public void setDetails(java.util.Collection<ResourceChangeDetail> details) {
        if (details == null) {
            this.details = null;
            return;
        }

        this.details = new java.util.ArrayList<ResourceChangeDetail>(details);
    }

    /**
     * <p>
     * Information about the resource changes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetails(java.util.Collection)} or {@link #withDetails(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param details
     *        Information about the resource changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChange withDetails(ResourceChangeDetail... details) {
        if (this.details == null) {
            setDetails(new java.util.ArrayList<ResourceChangeDetail>(details.length));
        }
        for (ResourceChangeDetail ele : details) {
            this.details.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource changes.
     * </p>
     * 
     * @param details
     *        Information about the resource changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChange withDetails(java.util.Collection<ResourceChangeDetail> details) {
        setDetails(details);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getReplacement() != null)
            sb.append("Replacement: ").append(getReplacement()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceChange == false)
            return false;
        ResourceChange other = (ResourceChange) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getReplacement() == null ^ this.getReplacement() == null)
            return false;
        if (other.getReplacement() != null && other.getReplacement().equals(this.getReplacement()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getReplacement() == null) ? 0 : getReplacement().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public ResourceChange clone() {
        try {
            return (ResourceChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ResourceChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
