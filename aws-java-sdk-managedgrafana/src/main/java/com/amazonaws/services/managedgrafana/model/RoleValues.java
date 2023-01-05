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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure defines which groups defined in the SAML assertion attribute are to be mapped to the Grafana
 * <code>Admin</code> and <code>Editor</code> roles in the workspace. SAML authenticated users not part of
 * <code>Admin</code> or <code>Editor</code> role groups have <code>Viewer</code> permission over the workspace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/RoleValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoleValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of groups from the SAML assertion attribute to grant the Grafana <code>Admin</code> role to.
     * </p>
     */
    private java.util.List<String> admin;
    /**
     * <p>
     * A list of groups from the SAML assertion attribute to grant the Grafana <code>Editor</code> role to.
     * </p>
     */
    private java.util.List<String> editor;

    /**
     * <p>
     * A list of groups from the SAML assertion attribute to grant the Grafana <code>Admin</code> role to.
     * </p>
     * 
     * @return A list of groups from the SAML assertion attribute to grant the Grafana <code>Admin</code> role to.
     */

    public java.util.List<String> getAdmin() {
        return admin;
    }

    /**
     * <p>
     * A list of groups from the SAML assertion attribute to grant the Grafana <code>Admin</code> role to.
     * </p>
     * 
     * @param admin
     *        A list of groups from the SAML assertion attribute to grant the Grafana <code>Admin</code> role to.
     */

    public void setAdmin(java.util.Collection<String> admin) {
        if (admin == null) {
            this.admin = null;
            return;
        }

        this.admin = new java.util.ArrayList<String>(admin);
    }

    /**
     * <p>
     * A list of groups from the SAML assertion attribute to grant the Grafana <code>Admin</code> role to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdmin(java.util.Collection)} or {@link #withAdmin(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param admin
     *        A list of groups from the SAML assertion attribute to grant the Grafana <code>Admin</code> role to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleValues withAdmin(String... admin) {
        if (this.admin == null) {
            setAdmin(new java.util.ArrayList<String>(admin.length));
        }
        for (String ele : admin) {
            this.admin.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of groups from the SAML assertion attribute to grant the Grafana <code>Admin</code> role to.
     * </p>
     * 
     * @param admin
     *        A list of groups from the SAML assertion attribute to grant the Grafana <code>Admin</code> role to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleValues withAdmin(java.util.Collection<String> admin) {
        setAdmin(admin);
        return this;
    }

    /**
     * <p>
     * A list of groups from the SAML assertion attribute to grant the Grafana <code>Editor</code> role to.
     * </p>
     * 
     * @return A list of groups from the SAML assertion attribute to grant the Grafana <code>Editor</code> role to.
     */

    public java.util.List<String> getEditor() {
        return editor;
    }

    /**
     * <p>
     * A list of groups from the SAML assertion attribute to grant the Grafana <code>Editor</code> role to.
     * </p>
     * 
     * @param editor
     *        A list of groups from the SAML assertion attribute to grant the Grafana <code>Editor</code> role to.
     */

    public void setEditor(java.util.Collection<String> editor) {
        if (editor == null) {
            this.editor = null;
            return;
        }

        this.editor = new java.util.ArrayList<String>(editor);
    }

    /**
     * <p>
     * A list of groups from the SAML assertion attribute to grant the Grafana <code>Editor</code> role to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEditor(java.util.Collection)} or {@link #withEditor(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param editor
     *        A list of groups from the SAML assertion attribute to grant the Grafana <code>Editor</code> role to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleValues withEditor(String... editor) {
        if (this.editor == null) {
            setEditor(new java.util.ArrayList<String>(editor.length));
        }
        for (String ele : editor) {
            this.editor.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of groups from the SAML assertion attribute to grant the Grafana <code>Editor</code> role to.
     * </p>
     * 
     * @param editor
     *        A list of groups from the SAML assertion attribute to grant the Grafana <code>Editor</code> role to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleValues withEditor(java.util.Collection<String> editor) {
        setEditor(editor);
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
        if (getAdmin() != null)
            sb.append("Admin: ").append(getAdmin()).append(",");
        if (getEditor() != null)
            sb.append("Editor: ").append(getEditor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoleValues == false)
            return false;
        RoleValues other = (RoleValues) obj;
        if (other.getAdmin() == null ^ this.getAdmin() == null)
            return false;
        if (other.getAdmin() != null && other.getAdmin().equals(this.getAdmin()) == false)
            return false;
        if (other.getEditor() == null ^ this.getEditor() == null)
            return false;
        if (other.getEditor() != null && other.getEditor().equals(this.getEditor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdmin() == null) ? 0 : getAdmin().hashCode());
        hashCode = prime * hashCode + ((getEditor() == null) ? 0 : getEditor().hashCode());
        return hashCode;
    }

    @Override
    public RoleValues clone() {
        try {
            return (RoleValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.RoleValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
