/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An authorization request that you include in a <code>BatchIsAuthorized</code> API request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/BatchIsAuthorizedInputItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchIsAuthorizedInputItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the principal for which the authorization decision is to be made.
     * </p>
     */
    private EntityIdentifier principal;
    /**
     * <p>
     * Specifies the requested action to be authorized. For example, <code>PhotoFlash::ReadPhoto</code>.
     * </p>
     */
    private ActionIdentifier action;
    /**
     * <p>
     * Specifies the resource that you want an authorization decision for. For example, <code>PhotoFlash::Photo</code>.
     * </p>
     */
    private EntityIdentifier resource;
    /**
     * <p>
     * Specifies additional context that can be used to make more granular authorization decisions.
     * </p>
     */
    private ContextDefinition context;

    /**
     * <p>
     * Specifies the principal for which the authorization decision is to be made.
     * </p>
     * 
     * @param principal
     *        Specifies the principal for which the authorization decision is to be made.
     */

    public void setPrincipal(EntityIdentifier principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * Specifies the principal for which the authorization decision is to be made.
     * </p>
     * 
     * @return Specifies the principal for which the authorization decision is to be made.
     */

    public EntityIdentifier getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * Specifies the principal for which the authorization decision is to be made.
     * </p>
     * 
     * @param principal
     *        Specifies the principal for which the authorization decision is to be made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedInputItem withPrincipal(EntityIdentifier principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * Specifies the requested action to be authorized. For example, <code>PhotoFlash::ReadPhoto</code>.
     * </p>
     * 
     * @param action
     *        Specifies the requested action to be authorized. For example, <code>PhotoFlash::ReadPhoto</code>.
     */

    public void setAction(ActionIdentifier action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the requested action to be authorized. For example, <code>PhotoFlash::ReadPhoto</code>.
     * </p>
     * 
     * @return Specifies the requested action to be authorized. For example, <code>PhotoFlash::ReadPhoto</code>.
     */

    public ActionIdentifier getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies the requested action to be authorized. For example, <code>PhotoFlash::ReadPhoto</code>.
     * </p>
     * 
     * @param action
     *        Specifies the requested action to be authorized. For example, <code>PhotoFlash::ReadPhoto</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedInputItem withAction(ActionIdentifier action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies the resource that you want an authorization decision for. For example, <code>PhotoFlash::Photo</code>.
     * </p>
     * 
     * @param resource
     *        Specifies the resource that you want an authorization decision for. For example,
     *        <code>PhotoFlash::Photo</code>.
     */

    public void setResource(EntityIdentifier resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * Specifies the resource that you want an authorization decision for. For example, <code>PhotoFlash::Photo</code>.
     * </p>
     * 
     * @return Specifies the resource that you want an authorization decision for. For example,
     *         <code>PhotoFlash::Photo</code>.
     */

    public EntityIdentifier getResource() {
        return this.resource;
    }

    /**
     * <p>
     * Specifies the resource that you want an authorization decision for. For example, <code>PhotoFlash::Photo</code>.
     * </p>
     * 
     * @param resource
     *        Specifies the resource that you want an authorization decision for. For example,
     *        <code>PhotoFlash::Photo</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedInputItem withResource(EntityIdentifier resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * Specifies additional context that can be used to make more granular authorization decisions.
     * </p>
     * 
     * @param context
     *        Specifies additional context that can be used to make more granular authorization decisions.
     */

    public void setContext(ContextDefinition context) {
        this.context = context;
    }

    /**
     * <p>
     * Specifies additional context that can be used to make more granular authorization decisions.
     * </p>
     * 
     * @return Specifies additional context that can be used to make more granular authorization decisions.
     */

    public ContextDefinition getContext() {
        return this.context;
    }

    /**
     * <p>
     * Specifies additional context that can be used to make more granular authorization decisions.
     * </p>
     * 
     * @param context
     *        Specifies additional context that can be used to make more granular authorization decisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedInputItem withContext(ContextDefinition context) {
        setContext(context);
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
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchIsAuthorizedInputItem == false)
            return false;
        BatchIsAuthorizedInputItem other = (BatchIsAuthorizedInputItem) obj;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        return hashCode;
    }

    @Override
    public BatchIsAuthorizedInputItem clone() {
        try {
            return (BatchIsAuthorizedInputItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.BatchIsAuthorizedInputItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
