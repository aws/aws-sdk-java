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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/RemoveProfilePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveProfilePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A human-readable name for the signing profile with permissions to be removed.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * An identifier for the current revision of the signing profile permissions.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * A unique identifier for the cross-account permissions statement.
     * </p>
     */
    private String statementId;

    /**
     * <p>
     * A human-readable name for the signing profile with permissions to be removed.
     * </p>
     * 
     * @param profileName
     *        A human-readable name for the signing profile with permissions to be removed.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * A human-readable name for the signing profile with permissions to be removed.
     * </p>
     * 
     * @return A human-readable name for the signing profile with permissions to be removed.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * A human-readable name for the signing profile with permissions to be removed.
     * </p>
     * 
     * @param profileName
     *        A human-readable name for the signing profile with permissions to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveProfilePermissionRequest withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * An identifier for the current revision of the signing profile permissions.
     * </p>
     * 
     * @param revisionId
     *        An identifier for the current revision of the signing profile permissions.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * An identifier for the current revision of the signing profile permissions.
     * </p>
     * 
     * @return An identifier for the current revision of the signing profile permissions.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * An identifier for the current revision of the signing profile permissions.
     * </p>
     * 
     * @param revisionId
     *        An identifier for the current revision of the signing profile permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveProfilePermissionRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the cross-account permissions statement.
     * </p>
     * 
     * @param statementId
     *        A unique identifier for the cross-account permissions statement.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * A unique identifier for the cross-account permissions statement.
     * </p>
     * 
     * @return A unique identifier for the cross-account permissions statement.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * A unique identifier for the cross-account permissions statement.
     * </p>
     * 
     * @param statementId
     *        A unique identifier for the cross-account permissions statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveProfilePermissionRequest withStatementId(String statementId) {
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

        if (obj instanceof RemoveProfilePermissionRequest == false)
            return false;
        RemoveProfilePermissionRequest other = (RemoveProfilePermissionRequest) obj;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
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
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        return hashCode;
    }

    @Override
    public RemoveProfilePermissionRequest clone() {
        return (RemoveProfilePermissionRequest) super.clone();
    }

}
