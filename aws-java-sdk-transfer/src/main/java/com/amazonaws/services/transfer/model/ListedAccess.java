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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists the properties for one or more specified associated accesses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListedAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedAccess implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the landing directory (or folder), which is the location that files are written to or read from in an
     * Amazon S3 bucket, for the described access.
     * </p>
     */
    private String homeDirectory;
    /**
     * <p>
     * The type of landing directory (folder) that you want your users' home directory to be when they log in to the
     * server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their
     * file transfer protocol clients. If you set it to <code>LOGICAL</code>, you must provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * </p>
     */
    private String homeDirectoryType;
    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that controls access to your Amazon S3 bucket from the
     * specified associated access. The policies attached to this role will determine the level of access that you want
     * to provide the associated access when transferring files into and out of your Amazon S3 bucket or buckets. The
     * IAM role should also contain a trust relationship that allows a server to access your resources when servicing
     * transfer requests for the associated access.
     * </p>
     */
    private String role;
    /**
     * <p>
     * A unique identifier that might be required when you assume a role in another account. Think of the
     * <code>ExternalID</code> as a group membership mechanism that uses a unique identifier (often a SID, but could be
     * a group name or something else) as a basis. If the administrator of the account to which the role belongs
     * provided you with an external ID, then provide that value in the <code>ExternalId</code> parameter. A
     * cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the trusted account. That way, only someone
     * with the ID can assume the role, rather than everyone in the account.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * Specifies the landing directory (or folder), which is the location that files are written to or read from in an
     * Amazon S3 bucket, for the described access.
     * </p>
     * 
     * @param homeDirectory
     *        Specifies the landing directory (or folder), which is the location that files are written to or read from
     *        in an Amazon S3 bucket, for the described access.
     */

    public void setHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    /**
     * <p>
     * Specifies the landing directory (or folder), which is the location that files are written to or read from in an
     * Amazon S3 bucket, for the described access.
     * </p>
     * 
     * @return Specifies the landing directory (or folder), which is the location that files are written to or read from
     *         in an Amazon S3 bucket, for the described access.
     */

    public String getHomeDirectory() {
        return this.homeDirectory;
    }

    /**
     * <p>
     * Specifies the landing directory (or folder), which is the location that files are written to or read from in an
     * Amazon S3 bucket, for the described access.
     * </p>
     * 
     * @param homeDirectory
     *        Specifies the landing directory (or folder), which is the location that files are written to or read from
     *        in an Amazon S3 bucket, for the described access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedAccess withHomeDirectory(String homeDirectory) {
        setHomeDirectory(homeDirectory);
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) that you want your users' home directory to be when they log in to the
     * server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their
     * file transfer protocol clients. If you set it to <code>LOGICAL</code>, you must provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        The type of landing directory (folder) that you want your users' home directory to be when they log in to
     *        the server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as
     *        is in their file transfer protocol clients. If you set it to <code>LOGICAL</code>, you must provide
     *        mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to
     *        your users.
     * @see HomeDirectoryType
     */

    public void setHomeDirectoryType(String homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType;
    }

    /**
     * <p>
     * The type of landing directory (folder) that you want your users' home directory to be when they log in to the
     * server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their
     * file transfer protocol clients. If you set it to <code>LOGICAL</code>, you must provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * </p>
     * 
     * @return The type of landing directory (folder) that you want your users' home directory to be when they log in to
     *         the server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as
     *         is in their file transfer protocol clients. If you set it to <code>LOGICAL</code>, you must provide
     *         mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to
     *         your users.
     * @see HomeDirectoryType
     */

    public String getHomeDirectoryType() {
        return this.homeDirectoryType;
    }

    /**
     * <p>
     * The type of landing directory (folder) that you want your users' home directory to be when they log in to the
     * server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their
     * file transfer protocol clients. If you set it to <code>LOGICAL</code>, you must provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        The type of landing directory (folder) that you want your users' home directory to be when they log in to
     *        the server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as
     *        is in their file transfer protocol clients. If you set it to <code>LOGICAL</code>, you must provide
     *        mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to
     *        your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HomeDirectoryType
     */

    public ListedAccess withHomeDirectoryType(String homeDirectoryType) {
        setHomeDirectoryType(homeDirectoryType);
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) that you want your users' home directory to be when they log in to the
     * server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as is in their
     * file transfer protocol clients. If you set it to <code>LOGICAL</code>, you must provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        The type of landing directory (folder) that you want your users' home directory to be when they log in to
     *        the server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket paths as
     *        is in their file transfer protocol clients. If you set it to <code>LOGICAL</code>, you must provide
     *        mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 paths visible to
     *        your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HomeDirectoryType
     */

    public ListedAccess withHomeDirectoryType(HomeDirectoryType homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that controls access to your Amazon S3 bucket from the
     * specified associated access. The policies attached to this role will determine the level of access that you want
     * to provide the associated access when transferring files into and out of your Amazon S3 bucket or buckets. The
     * IAM role should also contain a trust relationship that allows a server to access your resources when servicing
     * transfer requests for the associated access.
     * </p>
     * 
     * @param role
     *        The AWS Identity and Access Management (IAM) role that controls access to your Amazon S3 bucket from the
     *        specified associated access. The policies attached to this role will determine the level of access that
     *        you want to provide the associated access when transferring files into and out of your Amazon S3 bucket or
     *        buckets. The IAM role should also contain a trust relationship that allows a server to access your
     *        resources when servicing transfer requests for the associated access.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that controls access to your Amazon S3 bucket from the
     * specified associated access. The policies attached to this role will determine the level of access that you want
     * to provide the associated access when transferring files into and out of your Amazon S3 bucket or buckets. The
     * IAM role should also contain a trust relationship that allows a server to access your resources when servicing
     * transfer requests for the associated access.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) role that controls access to your Amazon S3 bucket from the
     *         specified associated access. The policies attached to this role will determine the level of access that
     *         you want to provide the associated access when transferring files into and out of your Amazon S3 bucket
     *         or buckets. The IAM role should also contain a trust relationship that allows a server to access your
     *         resources when servicing transfer requests for the associated access.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that controls access to your Amazon S3 bucket from the
     * specified associated access. The policies attached to this role will determine the level of access that you want
     * to provide the associated access when transferring files into and out of your Amazon S3 bucket or buckets. The
     * IAM role should also contain a trust relationship that allows a server to access your resources when servicing
     * transfer requests for the associated access.
     * </p>
     * 
     * @param role
     *        The AWS Identity and Access Management (IAM) role that controls access to your Amazon S3 bucket from the
     *        specified associated access. The policies attached to this role will determine the level of access that
     *        you want to provide the associated access when transferring files into and out of your Amazon S3 bucket or
     *        buckets. The IAM role should also contain a trust relationship that allows a server to access your
     *        resources when servicing transfer requests for the associated access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedAccess withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * A unique identifier that might be required when you assume a role in another account. Think of the
     * <code>ExternalID</code> as a group membership mechanism that uses a unique identifier (often a SID, but could be
     * a group name or something else) as a basis. If the administrator of the account to which the role belongs
     * provided you with an external ID, then provide that value in the <code>ExternalId</code> parameter. A
     * cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the trusted account. That way, only someone
     * with the ID can assume the role, rather than everyone in the account.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @param externalId
     *        A unique identifier that might be required when you assume a role in another account. Think of the
     *        <code>ExternalID</code> as a group membership mechanism that uses a unique identifier (often a SID, but
     *        could be a group name or something else) as a basis. If the administrator of the account to which the role
     *        belongs provided you with an external ID, then provide that value in the <code>ExternalId</code>
     *        parameter. A cross-account role is usually set up to trust everyone in an account. Therefore, the
     *        administrator of the trusting account might send an external ID to the administrator of the trusted
     *        account. That way, only someone with the ID can assume the role, rather than everyone in the account.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@:/-
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * A unique identifier that might be required when you assume a role in another account. Think of the
     * <code>ExternalID</code> as a group membership mechanism that uses a unique identifier (often a SID, but could be
     * a group name or something else) as a basis. If the administrator of the account to which the role belongs
     * provided you with an external ID, then provide that value in the <code>ExternalId</code> parameter. A
     * cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the trusted account. That way, only someone
     * with the ID can assume the role, rather than everyone in the account.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @return A unique identifier that might be required when you assume a role in another account. Think of the
     *         <code>ExternalID</code> as a group membership mechanism that uses a unique identifier (often a SID, but
     *         could be a group name or something else) as a basis. If the administrator of the account to which the
     *         role belongs provided you with an external ID, then provide that value in the <code>ExternalId</code>
     *         parameter. A cross-account role is usually set up to trust everyone in an account. Therefore, the
     *         administrator of the trusting account might send an external ID to the administrator of the trusted
     *         account. That way, only someone with the ID can assume the role, rather than everyone in the account.</p>
     *         <p>
     *         The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     *         alphanumeric characters with no spaces. You can also include underscores or any of the following
     *         characters: =,.@:/-
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * A unique identifier that might be required when you assume a role in another account. Think of the
     * <code>ExternalID</code> as a group membership mechanism that uses a unique identifier (often a SID, but could be
     * a group name or something else) as a basis. If the administrator of the account to which the role belongs
     * provided you with an external ID, then provide that value in the <code>ExternalId</code> parameter. A
     * cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the trusted account. That way, only someone
     * with the ID can assume the role, rather than everyone in the account.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @param externalId
     *        A unique identifier that might be required when you assume a role in another account. Think of the
     *        <code>ExternalID</code> as a group membership mechanism that uses a unique identifier (often a SID, but
     *        could be a group name or something else) as a basis. If the administrator of the account to which the role
     *        belongs provided you with an external ID, then provide that value in the <code>ExternalId</code>
     *        parameter. A cross-account role is usually set up to trust everyone in an account. Therefore, the
     *        administrator of the trusting account might send an external ID to the administrator of the trusted
     *        account. That way, only someone with the ID can assume the role, rather than everyone in the account.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of uppercase and lowercase
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@:/-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedAccess withExternalId(String externalId) {
        setExternalId(externalId);
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
        if (getHomeDirectory() != null)
            sb.append("HomeDirectory: ").append(getHomeDirectory()).append(",");
        if (getHomeDirectoryType() != null)
            sb.append("HomeDirectoryType: ").append(getHomeDirectoryType()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedAccess == false)
            return false;
        ListedAccess other = (ListedAccess) obj;
        if (other.getHomeDirectory() == null ^ this.getHomeDirectory() == null)
            return false;
        if (other.getHomeDirectory() != null && other.getHomeDirectory().equals(this.getHomeDirectory()) == false)
            return false;
        if (other.getHomeDirectoryType() == null ^ this.getHomeDirectoryType() == null)
            return false;
        if (other.getHomeDirectoryType() != null && other.getHomeDirectoryType().equals(this.getHomeDirectoryType()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHomeDirectory() == null) ? 0 : getHomeDirectory().hashCode());
        hashCode = prime * hashCode + ((getHomeDirectoryType() == null) ? 0 : getHomeDirectoryType().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public ListedAccess clone() {
        try {
            return (ListedAccess) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ListedAccessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
