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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The LF-tag policy and permissions for database resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DatabaseLFTagPolicyAndPermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseLFTagPolicyAndPermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of LF-tag conditions that apply to database resources.
     * </p>
     */
    private java.util.List<LFTag> expression;
    /**
     * <p>
     * The permissions granted to subscribers on database resources.
     * </p>
     */
    private java.util.List<String> permissions;

    /**
     * <p>
     * A list of LF-tag conditions that apply to database resources.
     * </p>
     * 
     * @return A list of LF-tag conditions that apply to database resources.
     */

    public java.util.List<LFTag> getExpression() {
        return expression;
    }

    /**
     * <p>
     * A list of LF-tag conditions that apply to database resources.
     * </p>
     * 
     * @param expression
     *        A list of LF-tag conditions that apply to database resources.
     */

    public void setExpression(java.util.Collection<LFTag> expression) {
        if (expression == null) {
            this.expression = null;
            return;
        }

        this.expression = new java.util.ArrayList<LFTag>(expression);
    }

    /**
     * <p>
     * A list of LF-tag conditions that apply to database resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpression(java.util.Collection)} or {@link #withExpression(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param expression
     *        A list of LF-tag conditions that apply to database resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseLFTagPolicyAndPermissions withExpression(LFTag... expression) {
        if (this.expression == null) {
            setExpression(new java.util.ArrayList<LFTag>(expression.length));
        }
        for (LFTag ele : expression) {
            this.expression.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of LF-tag conditions that apply to database resources.
     * </p>
     * 
     * @param expression
     *        A list of LF-tag conditions that apply to database resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseLFTagPolicyAndPermissions withExpression(java.util.Collection<LFTag> expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The permissions granted to subscribers on database resources.
     * </p>
     * 
     * @return The permissions granted to subscribers on database resources.
     * @see DatabaseLFTagPolicyPermission
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The permissions granted to subscribers on database resources.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to subscribers on database resources.
     * @see DatabaseLFTagPolicyPermission
     */

    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * The permissions granted to subscribers on database resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to subscribers on database resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseLFTagPolicyPermission
     */

    public DatabaseLFTagPolicyAndPermissions withPermissions(String... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<String>(permissions.length));
        }
        for (String ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions granted to subscribers on database resources.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to subscribers on database resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseLFTagPolicyPermission
     */

    public DatabaseLFTagPolicyAndPermissions withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The permissions granted to subscribers on database resources.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to subscribers on database resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseLFTagPolicyPermission
     */

    public DatabaseLFTagPolicyAndPermissions withPermissions(DatabaseLFTagPolicyPermission... permissions) {
        java.util.ArrayList<String> permissionsCopy = new java.util.ArrayList<String>(permissions.length);
        for (DatabaseLFTagPolicyPermission value : permissions) {
            permissionsCopy.add(value.toString());
        }
        if (getPermissions() == null) {
            setPermissions(permissionsCopy);
        } else {
            getPermissions().addAll(permissionsCopy);
        }
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
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseLFTagPolicyAndPermissions == false)
            return false;
        DatabaseLFTagPolicyAndPermissions other = (DatabaseLFTagPolicyAndPermissions) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseLFTagPolicyAndPermissions clone() {
        try {
            return (DatabaseLFTagPolicyAndPermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.DatabaseLFTagPolicyAndPermissionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
