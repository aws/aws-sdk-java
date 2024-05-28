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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the permissions for the resource that you want to override in an asset bundle import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleResourcePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleResourcePermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of principals to grant permissions on.
     * </p>
     */
    private java.util.List<String> principals;
    /**
     * <p>
     * A list of IAM actions to grant permissions on.
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * A list of principals to grant permissions on.
     * </p>
     * 
     * @return A list of principals to grant permissions on.
     */

    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * A list of principals to grant permissions on.
     * </p>
     * 
     * @param principals
     *        A list of principals to grant permissions on.
     */

    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * A list of principals to grant permissions on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        A list of principals to grant permissions on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleResourcePermissions withPrincipals(String... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<String>(principals.length));
        }
        for (String ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of principals to grant permissions on.
     * </p>
     * 
     * @param principals
     *        A list of principals to grant permissions on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleResourcePermissions withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * A list of IAM actions to grant permissions on.
     * </p>
     * 
     * @return A list of IAM actions to grant permissions on.
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of IAM actions to grant permissions on.
     * </p>
     * 
     * @param actions
     *        A list of IAM actions to grant permissions on.
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
     * A list of IAM actions to grant permissions on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        A list of IAM actions to grant permissions on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleResourcePermissions withActions(String... actions) {
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
     * A list of IAM actions to grant permissions on.
     * </p>
     * 
     * @param actions
     *        A list of IAM actions to grant permissions on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleResourcePermissions withActions(java.util.Collection<String> actions) {
        setActions(actions);
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
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleResourcePermissions == false)
            return false;
        AssetBundleResourcePermissions other = (AssetBundleResourcePermissions) obj;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleResourcePermissions clone() {
        try {
            return (AssetBundleResourcePermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleResourcePermissionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
