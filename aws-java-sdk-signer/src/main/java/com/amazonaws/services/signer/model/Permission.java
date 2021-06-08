/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A cross-account permission for a signing profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/Permission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Permission implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An AWS Signer action permitted as part of cross-account permissions.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The AWS principal that has been granted a cross-account permission.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * A unique identifier for a cross-account permission statement.
     * </p>
     */
    private String statementId;
    /**
     * <p>
     * The signing profile version that a permission applies to.
     * </p>
     */
    private String profileVersion;

    /**
     * <p>
     * An AWS Signer action permitted as part of cross-account permissions.
     * </p>
     * 
     * @param action
     *        An AWS Signer action permitted as part of cross-account permissions.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * An AWS Signer action permitted as part of cross-account permissions.
     * </p>
     * 
     * @return An AWS Signer action permitted as part of cross-account permissions.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * An AWS Signer action permitted as part of cross-account permissions.
     * </p>
     * 
     * @param action
     *        An AWS Signer action permitted as part of cross-account permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The AWS principal that has been granted a cross-account permission.
     * </p>
     * 
     * @param principal
     *        The AWS principal that has been granted a cross-account permission.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The AWS principal that has been granted a cross-account permission.
     * </p>
     * 
     * @return The AWS principal that has been granted a cross-account permission.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The AWS principal that has been granted a cross-account permission.
     * </p>
     * 
     * @param principal
     *        The AWS principal that has been granted a cross-account permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a cross-account permission statement.
     * </p>
     * 
     * @param statementId
     *        A unique identifier for a cross-account permission statement.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * A unique identifier for a cross-account permission statement.
     * </p>
     * 
     * @return A unique identifier for a cross-account permission statement.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * A unique identifier for a cross-account permission statement.
     * </p>
     * 
     * @param statementId
     *        A unique identifier for a cross-account permission statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withStatementId(String statementId) {
        setStatementId(statementId);
        return this;
    }

    /**
     * <p>
     * The signing profile version that a permission applies to.
     * </p>
     * 
     * @param profileVersion
     *        The signing profile version that a permission applies to.
     */

    public void setProfileVersion(String profileVersion) {
        this.profileVersion = profileVersion;
    }

    /**
     * <p>
     * The signing profile version that a permission applies to.
     * </p>
     * 
     * @return The signing profile version that a permission applies to.
     */

    public String getProfileVersion() {
        return this.profileVersion;
    }

    /**
     * <p>
     * The signing profile version that a permission applies to.
     * </p>
     * 
     * @param profileVersion
     *        The signing profile version that a permission applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withProfileVersion(String profileVersion) {
        setProfileVersion(profileVersion);
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
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId()).append(",");
        if (getProfileVersion() != null)
            sb.append("ProfileVersion: ").append(getProfileVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Permission == false)
            return false;
        Permission other = (Permission) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        if (other.getProfileVersion() == null ^ this.getProfileVersion() == null)
            return false;
        if (other.getProfileVersion() != null && other.getProfileVersion().equals(this.getProfileVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        hashCode = prime * hashCode + ((getProfileVersion() == null) ? 0 : getProfileVersion().hashCode());
        return hashCode;
    }

    @Override
    public Permission clone() {
        try {
            return (Permission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.PermissionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
