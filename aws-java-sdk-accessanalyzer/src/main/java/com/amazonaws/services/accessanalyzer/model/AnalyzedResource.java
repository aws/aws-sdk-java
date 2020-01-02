/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the analyzed resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/AnalyzedResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyzedResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The actions that an external principal is granted permission to use by the policy that generated the finding.
     * </p>
     */
    private java.util.List<String> actions;
    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     */
    private java.util.Date analyzedAt;
    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * An error message.
     * </p>
     */
    private String error;
    /**
     * <p>
     * Indicates whether the policy that generated the finding grants public access to the resource.
     * </p>
     */
    private Boolean isPublic;
    /**
     * <p>
     * The ARN of the resource that was analyzed.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The type of the resource that was analyzed.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Indicates how the access that generated the finding is granted.
     * </p>
     */
    private java.util.List<String> sharedVia;
    /**
     * <p>
     * The current status of the finding generated from the analyzed resource.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The actions that an external principal is granted permission to use by the policy that generated the finding.
     * </p>
     * 
     * @return The actions that an external principal is granted permission to use by the policy that generated the
     *         finding.
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions that an external principal is granted permission to use by the policy that generated the finding.
     * </p>
     * 
     * @param actions
     *        The actions that an external principal is granted permission to use by the policy that generated the
     *        finding.
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * The actions that an external principal is granted permission to use by the policy that generated the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions that an external principal is granted permission to use by the policy that generated the
     *        finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzedResource withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions that an external principal is granted permission to use by the policy that generated the finding.
     * </p>
     * 
     * @param actions
     *        The actions that an external principal is granted permission to use by the policy that generated the
     *        finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzedResource withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     * 
     * @param analyzedAt
     *        The time at which the resource was analyzed.
     */

    public void setAnalyzedAt(java.util.Date analyzedAt) {
        this.analyzedAt = analyzedAt;
    }

    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     * 
     * @return The time at which the resource was analyzed.
     */

    public java.util.Date getAnalyzedAt() {
        return this.analyzedAt;
    }

    /**
     * <p>
     * The time at which the resource was analyzed.
     * </p>
     * 
     * @param analyzedAt
     *        The time at which the resource was analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzedResource withAnalyzedAt(java.util.Date analyzedAt) {
        setAnalyzedAt(analyzedAt);
        return this;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the finding was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     * 
     * @return The time at which the finding was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the finding was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzedResource withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @param error
     *        An error message.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @return An error message.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @param error
     *        An error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzedResource withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding grants public access to the resource.
     * </p>
     * 
     * @param isPublic
     *        Indicates whether the policy that generated the finding grants public access to the resource.
     */

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding grants public access to the resource.
     * </p>
     * 
     * @return Indicates whether the policy that generated the finding grants public access to the resource.
     */

    public Boolean getIsPublic() {
        return this.isPublic;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding grants public access to the resource.
     * </p>
     * 
     * @param isPublic
     *        Indicates whether the policy that generated the finding grants public access to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzedResource withIsPublic(Boolean isPublic) {
        setIsPublic(isPublic);
        return this;
    }

    /**
     * <p>
     * Indicates whether the policy that generated the finding grants public access to the resource.
     * </p>
     * 
     * @return Indicates whether the policy that generated the finding grants public access to the resource.
     */

    public Boolean isPublic() {
        return this.isPublic;
    }

    /**
     * <p>
     * The ARN of the resource that was analyzed.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource that was analyzed.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource that was analyzed.
     * </p>
     * 
     * @return The ARN of the resource that was analyzed.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource that was analyzed.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource that was analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzedResource withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The type of the resource that was analyzed.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that was analyzed.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource that was analyzed.
     * </p>
     * 
     * @return The type of the resource that was analyzed.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource that was analyzed.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that was analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public AnalyzedResource withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resource that was analyzed.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that was analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public AnalyzedResource withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates how the access that generated the finding is granted.
     * </p>
     * 
     * @return Indicates how the access that generated the finding is granted.
     */

    public java.util.List<String> getSharedVia() {
        return sharedVia;
    }

    /**
     * <p>
     * Indicates how the access that generated the finding is granted.
     * </p>
     * 
     * @param sharedVia
     *        Indicates how the access that generated the finding is granted.
     */

    public void setSharedVia(java.util.Collection<String> sharedVia) {
        if (sharedVia == null) {
            this.sharedVia = null;
            return;
        }

        this.sharedVia = new java.util.ArrayList<String>(sharedVia);
    }

    /**
     * <p>
     * Indicates how the access that generated the finding is granted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSharedVia(java.util.Collection)} or {@link #withSharedVia(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sharedVia
     *        Indicates how the access that generated the finding is granted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzedResource withSharedVia(String... sharedVia) {
        if (this.sharedVia == null) {
            setSharedVia(new java.util.ArrayList<String>(sharedVia.length));
        }
        for (String ele : sharedVia) {
            this.sharedVia.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates how the access that generated the finding is granted.
     * </p>
     * 
     * @param sharedVia
     *        Indicates how the access that generated the finding is granted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzedResource withSharedVia(java.util.Collection<String> sharedVia) {
        setSharedVia(sharedVia);
        return this;
    }

    /**
     * <p>
     * The current status of the finding generated from the analyzed resource.
     * </p>
     * 
     * @param status
     *        The current status of the finding generated from the analyzed resource.
     * @see FindingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the finding generated from the analyzed resource.
     * </p>
     * 
     * @return The current status of the finding generated from the analyzed resource.
     * @see FindingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the finding generated from the analyzed resource.
     * </p>
     * 
     * @param status
     *        The current status of the finding generated from the analyzed resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatus
     */

    public AnalyzedResource withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the finding generated from the analyzed resource.
     * </p>
     * 
     * @param status
     *        The current status of the finding generated from the analyzed resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatus
     */

    public AnalyzedResource withStatus(FindingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the finding was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     * 
     * @return The time at which the finding was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the finding was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzedResource withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getAnalyzedAt() != null)
            sb.append("AnalyzedAt: ").append(getAnalyzedAt()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getIsPublic() != null)
            sb.append("IsPublic: ").append(getIsPublic()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSharedVia() != null)
            sb.append("SharedVia: ").append(getSharedVia()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzedResource == false)
            return false;
        AnalyzedResource other = (AnalyzedResource) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getAnalyzedAt() == null ^ this.getAnalyzedAt() == null)
            return false;
        if (other.getAnalyzedAt() != null && other.getAnalyzedAt().equals(this.getAnalyzedAt()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getIsPublic() == null ^ this.getIsPublic() == null)
            return false;
        if (other.getIsPublic() != null && other.getIsPublic().equals(this.getIsPublic()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSharedVia() == null ^ this.getSharedVia() == null)
            return false;
        if (other.getSharedVia() != null && other.getSharedVia().equals(this.getSharedVia()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getAnalyzedAt() == null) ? 0 : getAnalyzedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getIsPublic() == null) ? 0 : getIsPublic().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSharedVia() == null) ? 0 : getSharedVia().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AnalyzedResource clone() {
        try {
            return (AnalyzedResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.AnalyzedResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
