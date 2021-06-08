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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListProfilePermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfilePermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the current revision of profile permissions.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * Total size of the policy associated with the Signing Profile in bytes.
     * </p>
     */
    private Integer policySizeBytes;
    /**
     * <p>
     * List of permissions associated with the Signing Profile.
     * </p>
     */
    private java.util.List<Permission> permissions;
    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier for the current revision of profile permissions.
     * </p>
     * 
     * @param revisionId
     *        The identifier for the current revision of profile permissions.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The identifier for the current revision of profile permissions.
     * </p>
     * 
     * @return The identifier for the current revision of profile permissions.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The identifier for the current revision of profile permissions.
     * </p>
     * 
     * @param revisionId
     *        The identifier for the current revision of profile permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilePermissionsResult withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * Total size of the policy associated with the Signing Profile in bytes.
     * </p>
     * 
     * @param policySizeBytes
     *        Total size of the policy associated with the Signing Profile in bytes.
     */

    public void setPolicySizeBytes(Integer policySizeBytes) {
        this.policySizeBytes = policySizeBytes;
    }

    /**
     * <p>
     * Total size of the policy associated with the Signing Profile in bytes.
     * </p>
     * 
     * @return Total size of the policy associated with the Signing Profile in bytes.
     */

    public Integer getPolicySizeBytes() {
        return this.policySizeBytes;
    }

    /**
     * <p>
     * Total size of the policy associated with the Signing Profile in bytes.
     * </p>
     * 
     * @param policySizeBytes
     *        Total size of the policy associated with the Signing Profile in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilePermissionsResult withPolicySizeBytes(Integer policySizeBytes) {
        setPolicySizeBytes(policySizeBytes);
        return this;
    }

    /**
     * <p>
     * List of permissions associated with the Signing Profile.
     * </p>
     * 
     * @return List of permissions associated with the Signing Profile.
     */

    public java.util.List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * List of permissions associated with the Signing Profile.
     * </p>
     * 
     * @param permissions
     *        List of permissions associated with the Signing Profile.
     */

    public void setPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<Permission>(permissions);
    }

    /**
     * <p>
     * List of permissions associated with the Signing Profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        List of permissions associated with the Signing Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilePermissionsResult withPermissions(Permission... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<Permission>(permissions.length));
        }
        for (Permission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of permissions associated with the Signing Profile.
     * </p>
     * 
     * @param permissions
     *        List of permissions associated with the Signing Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilePermissionsResult withPermissions(java.util.Collection<Permission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        String for specifying the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     * 
     * @return String for specifying the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        String for specifying the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilePermissionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getPolicySizeBytes() != null)
            sb.append("PolicySizeBytes: ").append(getPolicySizeBytes()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProfilePermissionsResult == false)
            return false;
        ListProfilePermissionsResult other = (ListProfilePermissionsResult) obj;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getPolicySizeBytes() == null ^ this.getPolicySizeBytes() == null)
            return false;
        if (other.getPolicySizeBytes() != null && other.getPolicySizeBytes().equals(this.getPolicySizeBytes()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getPolicySizeBytes() == null) ? 0 : getPolicySizeBytes().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProfilePermissionsResult clone() {
        try {
            return (ListProfilePermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
