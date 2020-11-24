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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/GetStudioSessionMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStudioSessionMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * The globally unique identifier (GUID) of the user or group. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     * >UserId</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-GroupId"
     * >GroupId</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     * <code>IdentityId</code> must be specified.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * The name of the user or group to fetch. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     * >UserName</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     * >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     * <code>IdentityId</code> must be specified.
     * </p>
     */
    private String identityName;
    /**
     * <p>
     * Specifies whether the identity to fetch is a user or a group.
     * </p>
     */
    private String identityType;

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @param studioId
     *        The ID of the Amazon EMR Studio.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @return The ID of the Amazon EMR Studio.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @param studioId
     *        The ID of the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStudioSessionMappingRequest withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * <p>
     * The globally unique identifier (GUID) of the user or group. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     * >UserId</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-GroupId"
     * >GroupId</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     * <code>IdentityId</code> must be specified.
     * </p>
     * 
     * @param identityId
     *        The globally unique identifier (GUID) of the user or group. For more information, see <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     *        >UserId</a> and <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-GroupId"
     *        >GroupId</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     *        <code>IdentityId</code> must be specified.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * The globally unique identifier (GUID) of the user or group. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     * >UserId</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-GroupId"
     * >GroupId</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     * <code>IdentityId</code> must be specified.
     * </p>
     * 
     * @return The globally unique identifier (GUID) of the user or group. For more information, see <a href=
     *         "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     *         >UserId</a> and <a href=
     *         "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-GroupId"
     *         >GroupId</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     *         <code>IdentityId</code> must be specified.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * The globally unique identifier (GUID) of the user or group. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     * >UserId</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-GroupId"
     * >GroupId</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     * <code>IdentityId</code> must be specified.
     * </p>
     * 
     * @param identityId
     *        The globally unique identifier (GUID) of the user or group. For more information, see <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     *        >UserId</a> and <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-GroupId"
     *        >GroupId</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     *        <code>IdentityId</code> must be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStudioSessionMappingRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * The name of the user or group to fetch. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     * >UserName</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     * >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     * <code>IdentityId</code> must be specified.
     * </p>
     * 
     * @param identityName
     *        The name of the user or group to fetch. For more information, see <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     *        >UserName</a> and <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     *        >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     *        <code>IdentityId</code> must be specified.
     */

    public void setIdentityName(String identityName) {
        this.identityName = identityName;
    }

    /**
     * <p>
     * The name of the user or group to fetch. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     * >UserName</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     * >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     * <code>IdentityId</code> must be specified.
     * </p>
     * 
     * @return The name of the user or group to fetch. For more information, see <a href=
     *         "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     *         >UserName</a> and <a href=
     *         "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     *         >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     *         <code>IdentityId</code> must be specified.
     */

    public String getIdentityName() {
        return this.identityName;
    }

    /**
     * <p>
     * The name of the user or group to fetch. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     * >UserName</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     * >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     * <code>IdentityId</code> must be specified.
     * </p>
     * 
     * @param identityName
     *        The name of the user or group to fetch. For more information, see <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserId"
     *        >UserName</a> and <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     *        >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>. Either <code>IdentityName</code> or
     *        <code>IdentityId</code> must be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStudioSessionMappingRequest withIdentityName(String identityName) {
        setIdentityName(identityName);
        return this;
    }

    /**
     * <p>
     * Specifies whether the identity to fetch is a user or a group.
     * </p>
     * 
     * @param identityType
     *        Specifies whether the identity to fetch is a user or a group.
     * @see IdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * Specifies whether the identity to fetch is a user or a group.
     * </p>
     * 
     * @return Specifies whether the identity to fetch is a user or a group.
     * @see IdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * Specifies whether the identity to fetch is a user or a group.
     * </p>
     * 
     * @param identityType
     *        Specifies whether the identity to fetch is a user or a group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public GetStudioSessionMappingRequest withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the identity to fetch is a user or a group.
     * </p>
     * 
     * @param identityType
     *        Specifies whether the identity to fetch is a user or a group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public GetStudioSessionMappingRequest withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
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
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getIdentityName() != null)
            sb.append("IdentityName: ").append(getIdentityName()).append(",");
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStudioSessionMappingRequest == false)
            return false;
        GetStudioSessionMappingRequest other = (GetStudioSessionMappingRequest) obj;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getIdentityName() == null ^ this.getIdentityName() == null)
            return false;
        if (other.getIdentityName() != null && other.getIdentityName().equals(this.getIdentityName()) == false)
            return false;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getIdentityName() == null) ? 0 : getIdentityName().hashCode());
        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        return hashCode;
    }

    @Override
    public GetStudioSessionMappingRequest clone() {
        return (GetStudioSessionMappingRequest) super.clone();
    }

}
