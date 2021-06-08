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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/AddProfilePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddProfilePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The human-readable name of the signing profile.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The version of the signing profile.
     * </p>
     */
    private String profileVersion;
    /**
     * <p>
     * The AWS Signer action permitted as part of cross-account permissions.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The AWS principal receiving cross-account permissions. This may be an IAM role or another AWS account ID.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * A unique identifier for the current profile revision.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * A unique identifier for the cross-account permission statement.
     * </p>
     */
    private String statementId;

    /**
     * <p>
     * The human-readable name of the signing profile.
     * </p>
     * 
     * @param profileName
     *        The human-readable name of the signing profile.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The human-readable name of the signing profile.
     * </p>
     * 
     * @return The human-readable name of the signing profile.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The human-readable name of the signing profile.
     * </p>
     * 
     * @param profileName
     *        The human-readable name of the signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddProfilePermissionRequest withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The version of the signing profile.
     * </p>
     * 
     * @param profileVersion
     *        The version of the signing profile.
     */

    public void setProfileVersion(String profileVersion) {
        this.profileVersion = profileVersion;
    }

    /**
     * <p>
     * The version of the signing profile.
     * </p>
     * 
     * @return The version of the signing profile.
     */

    public String getProfileVersion() {
        return this.profileVersion;
    }

    /**
     * <p>
     * The version of the signing profile.
     * </p>
     * 
     * @param profileVersion
     *        The version of the signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddProfilePermissionRequest withProfileVersion(String profileVersion) {
        setProfileVersion(profileVersion);
        return this;
    }

    /**
     * <p>
     * The AWS Signer action permitted as part of cross-account permissions.
     * </p>
     * 
     * @param action
     *        The AWS Signer action permitted as part of cross-account permissions.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The AWS Signer action permitted as part of cross-account permissions.
     * </p>
     * 
     * @return The AWS Signer action permitted as part of cross-account permissions.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The AWS Signer action permitted as part of cross-account permissions.
     * </p>
     * 
     * @param action
     *        The AWS Signer action permitted as part of cross-account permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddProfilePermissionRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The AWS principal receiving cross-account permissions. This may be an IAM role or another AWS account ID.
     * </p>
     * 
     * @param principal
     *        The AWS principal receiving cross-account permissions. This may be an IAM role or another AWS account ID.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The AWS principal receiving cross-account permissions. This may be an IAM role or another AWS account ID.
     * </p>
     * 
     * @return The AWS principal receiving cross-account permissions. This may be an IAM role or another AWS account ID.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The AWS principal receiving cross-account permissions. This may be an IAM role or another AWS account ID.
     * </p>
     * 
     * @param principal
     *        The AWS principal receiving cross-account permissions. This may be an IAM role or another AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddProfilePermissionRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the current profile revision.
     * </p>
     * 
     * @param revisionId
     *        A unique identifier for the current profile revision.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * A unique identifier for the current profile revision.
     * </p>
     * 
     * @return A unique identifier for the current profile revision.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * A unique identifier for the current profile revision.
     * </p>
     * 
     * @param revisionId
     *        A unique identifier for the current profile revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddProfilePermissionRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the cross-account permission statement.
     * </p>
     * 
     * @param statementId
     *        A unique identifier for the cross-account permission statement.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * A unique identifier for the cross-account permission statement.
     * </p>
     * 
     * @return A unique identifier for the cross-account permission statement.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * A unique identifier for the cross-account permission statement.
     * </p>
     * 
     * @param statementId
     *        A unique identifier for the cross-account permission statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddProfilePermissionRequest withStatementId(String statementId) {
        setStatementId(statementId);
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
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getProfileVersion() != null)
            sb.append("ProfileVersion: ").append(getProfileVersion()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddProfilePermissionRequest == false)
            return false;
        AddProfilePermissionRequest other = (AddProfilePermissionRequest) obj;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getProfileVersion() == null ^ this.getProfileVersion() == null)
            return false;
        if (other.getProfileVersion() != null && other.getProfileVersion().equals(this.getProfileVersion()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getProfileVersion() == null) ? 0 : getProfileVersion().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        return hashCode;
    }

    @Override
    public AddProfilePermissionRequest clone() {
        return (AddProfilePermissionRequest) super.clone();
    }

}
