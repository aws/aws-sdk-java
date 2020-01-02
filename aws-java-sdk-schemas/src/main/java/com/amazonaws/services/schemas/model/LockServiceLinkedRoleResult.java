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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/LockServiceLinkedRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LockServiceLinkedRoleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Boolean canBeDeleted;

    private String reasonOfFailure;

    private java.util.List<DiscovererSummary> relatedResources;

    /**
     * @param canBeDeleted
     */

    public void setCanBeDeleted(Boolean canBeDeleted) {
        this.canBeDeleted = canBeDeleted;
    }

    /**
     * @return
     */

    public Boolean getCanBeDeleted() {
        return this.canBeDeleted;
    }

    /**
     * @param canBeDeleted
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockServiceLinkedRoleResult withCanBeDeleted(Boolean canBeDeleted) {
        setCanBeDeleted(canBeDeleted);
        return this;
    }

    /**
     * @return
     */

    public Boolean isCanBeDeleted() {
        return this.canBeDeleted;
    }

    /**
     * @param reasonOfFailure
     */

    public void setReasonOfFailure(String reasonOfFailure) {
        this.reasonOfFailure = reasonOfFailure;
    }

    /**
     * @return
     */

    public String getReasonOfFailure() {
        return this.reasonOfFailure;
    }

    /**
     * @param reasonOfFailure
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockServiceLinkedRoleResult withReasonOfFailure(String reasonOfFailure) {
        setReasonOfFailure(reasonOfFailure);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<DiscovererSummary> getRelatedResources() {
        return relatedResources;
    }

    /**
     * @param relatedResources
     */

    public void setRelatedResources(java.util.Collection<DiscovererSummary> relatedResources) {
        if (relatedResources == null) {
            this.relatedResources = null;
            return;
        }

        this.relatedResources = new java.util.ArrayList<DiscovererSummary>(relatedResources);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedResources(java.util.Collection)} or {@link #withRelatedResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relatedResources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockServiceLinkedRoleResult withRelatedResources(DiscovererSummary... relatedResources) {
        if (this.relatedResources == null) {
            setRelatedResources(new java.util.ArrayList<DiscovererSummary>(relatedResources.length));
        }
        for (DiscovererSummary ele : relatedResources) {
            this.relatedResources.add(ele);
        }
        return this;
    }

    /**
     * @param relatedResources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockServiceLinkedRoleResult withRelatedResources(java.util.Collection<DiscovererSummary> relatedResources) {
        setRelatedResources(relatedResources);
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
        if (getCanBeDeleted() != null)
            sb.append("CanBeDeleted: ").append(getCanBeDeleted()).append(",");
        if (getReasonOfFailure() != null)
            sb.append("ReasonOfFailure: ").append(getReasonOfFailure()).append(",");
        if (getRelatedResources() != null)
            sb.append("RelatedResources: ").append(getRelatedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LockServiceLinkedRoleResult == false)
            return false;
        LockServiceLinkedRoleResult other = (LockServiceLinkedRoleResult) obj;
        if (other.getCanBeDeleted() == null ^ this.getCanBeDeleted() == null)
            return false;
        if (other.getCanBeDeleted() != null && other.getCanBeDeleted().equals(this.getCanBeDeleted()) == false)
            return false;
        if (other.getReasonOfFailure() == null ^ this.getReasonOfFailure() == null)
            return false;
        if (other.getReasonOfFailure() != null && other.getReasonOfFailure().equals(this.getReasonOfFailure()) == false)
            return false;
        if (other.getRelatedResources() == null ^ this.getRelatedResources() == null)
            return false;
        if (other.getRelatedResources() != null && other.getRelatedResources().equals(this.getRelatedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanBeDeleted() == null) ? 0 : getCanBeDeleted().hashCode());
        hashCode = prime * hashCode + ((getReasonOfFailure() == null) ? 0 : getReasonOfFailure().hashCode());
        hashCode = prime * hashCode + ((getRelatedResources() == null) ? 0 : getRelatedResources().hashCode());
        return hashCode;
    }

    @Override
    public LockServiceLinkedRoleResult clone() {
        try {
            return (LockServiceLinkedRoleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
