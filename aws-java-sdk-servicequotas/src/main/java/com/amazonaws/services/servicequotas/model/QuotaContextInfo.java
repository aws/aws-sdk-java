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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes the context for a service quota. The context identifies what the quota applies to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/QuotaContextInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuotaContextInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the quota applies to an Amazon Web Services account, or to a resource.
     * </p>
     */
    private String contextScope;
    /**
     * <p>
     * When the <code>ContextScope</code> is <code>RESOURCE</code>, then this specifies the resource type of the
     * specified resource.
     * </p>
     */
    private String contextScopeType;
    /**
     * <p>
     * Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field depends
     * on the context scope associated with the specified service quota.
     * </p>
     */
    private String contextId;

    /**
     * <p>
     * Specifies whether the quota applies to an Amazon Web Services account, or to a resource.
     * </p>
     * 
     * @param contextScope
     *        Specifies whether the quota applies to an Amazon Web Services account, or to a resource.
     * @see QuotaContextScope
     */

    public void setContextScope(String contextScope) {
        this.contextScope = contextScope;
    }

    /**
     * <p>
     * Specifies whether the quota applies to an Amazon Web Services account, or to a resource.
     * </p>
     * 
     * @return Specifies whether the quota applies to an Amazon Web Services account, or to a resource.
     * @see QuotaContextScope
     */

    public String getContextScope() {
        return this.contextScope;
    }

    /**
     * <p>
     * Specifies whether the quota applies to an Amazon Web Services account, or to a resource.
     * </p>
     * 
     * @param contextScope
     *        Specifies whether the quota applies to an Amazon Web Services account, or to a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuotaContextScope
     */

    public QuotaContextInfo withContextScope(String contextScope) {
        setContextScope(contextScope);
        return this;
    }

    /**
     * <p>
     * Specifies whether the quota applies to an Amazon Web Services account, or to a resource.
     * </p>
     * 
     * @param contextScope
     *        Specifies whether the quota applies to an Amazon Web Services account, or to a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuotaContextScope
     */

    public QuotaContextInfo withContextScope(QuotaContextScope contextScope) {
        this.contextScope = contextScope.toString();
        return this;
    }

    /**
     * <p>
     * When the <code>ContextScope</code> is <code>RESOURCE</code>, then this specifies the resource type of the
     * specified resource.
     * </p>
     * 
     * @param contextScopeType
     *        When the <code>ContextScope</code> is <code>RESOURCE</code>, then this specifies the resource type of the
     *        specified resource.
     */

    public void setContextScopeType(String contextScopeType) {
        this.contextScopeType = contextScopeType;
    }

    /**
     * <p>
     * When the <code>ContextScope</code> is <code>RESOURCE</code>, then this specifies the resource type of the
     * specified resource.
     * </p>
     * 
     * @return When the <code>ContextScope</code> is <code>RESOURCE</code>, then this specifies the resource type of the
     *         specified resource.
     */

    public String getContextScopeType() {
        return this.contextScopeType;
    }

    /**
     * <p>
     * When the <code>ContextScope</code> is <code>RESOURCE</code>, then this specifies the resource type of the
     * specified resource.
     * </p>
     * 
     * @param contextScopeType
     *        When the <code>ContextScope</code> is <code>RESOURCE</code>, then this specifies the resource type of the
     *        specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuotaContextInfo withContextScopeType(String contextScopeType) {
        setContextScopeType(contextScopeType);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field depends
     * on the context scope associated with the specified service quota.
     * </p>
     * 
     * @param contextId
     *        Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field
     *        depends on the context scope associated with the specified service quota.
     */

    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field depends
     * on the context scope associated with the specified service quota.
     * </p>
     * 
     * @return Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field
     *         depends on the context scope associated with the specified service quota.
     */

    public String getContextId() {
        return this.contextId;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field depends
     * on the context scope associated with the specified service quota.
     * </p>
     * 
     * @param contextId
     *        Specifies the Amazon Web Services account or resource to which the quota applies. The value in this field
     *        depends on the context scope associated with the specified service quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuotaContextInfo withContextId(String contextId) {
        setContextId(contextId);
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
        if (getContextScope() != null)
            sb.append("ContextScope: ").append(getContextScope()).append(",");
        if (getContextScopeType() != null)
            sb.append("ContextScopeType: ").append(getContextScopeType()).append(",");
        if (getContextId() != null)
            sb.append("ContextId: ").append(getContextId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuotaContextInfo == false)
            return false;
        QuotaContextInfo other = (QuotaContextInfo) obj;
        if (other.getContextScope() == null ^ this.getContextScope() == null)
            return false;
        if (other.getContextScope() != null && other.getContextScope().equals(this.getContextScope()) == false)
            return false;
        if (other.getContextScopeType() == null ^ this.getContextScopeType() == null)
            return false;
        if (other.getContextScopeType() != null && other.getContextScopeType().equals(this.getContextScopeType()) == false)
            return false;
        if (other.getContextId() == null ^ this.getContextId() == null)
            return false;
        if (other.getContextId() != null && other.getContextId().equals(this.getContextId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContextScope() == null) ? 0 : getContextScope().hashCode());
        hashCode = prime * hashCode + ((getContextScopeType() == null) ? 0 : getContextScopeType().hashCode());
        hashCode = prime * hashCode + ((getContextId() == null) ? 0 : getContextId().hashCode());
        return hashCode;
    }

    @Override
    public QuotaContextInfo clone() {
        try {
            return (QuotaContextInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicequotas.model.transform.QuotaContextInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
