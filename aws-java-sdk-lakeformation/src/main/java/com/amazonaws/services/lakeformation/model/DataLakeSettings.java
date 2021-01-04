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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure representing a list of AWS Lake Formation principals designated as data lake administrators and lists of
 * principal permission entries for default create database and default create table permissions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DataLakeSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of AWS Lake Formation principals. Supported principals are IAM users or IAM roles.
     * </p>
     */
    private java.util.List<DataLakePrincipal> dataLakeAdmins;
    /**
     * <p>
     * A structure representing a list of up to three principal permissions entries for default create database
     * permissions.
     * </p>
     */
    private java.util.List<PrincipalPermissions> createDatabaseDefaultPermissions;
    /**
     * <p>
     * A structure representing a list of up to three principal permissions entries for default create table
     * permissions.
     * </p>
     */
    private java.util.List<PrincipalPermissions> createTableDefaultPermissions;
    /**
     * <p>
     * A list of the resource-owning account IDs that the caller's account can use to share their user access details
     * (user ARNs). The user ARNs can be logged in the resource owner's AWS CloudTrail log.
     * </p>
     * <p>
     * You may want to specify this property when you are in a high-trust boundary, such as the same team or company.
     * </p>
     */
    private java.util.List<String> trustedResourceOwners;

    /**
     * <p>
     * A list of AWS Lake Formation principals. Supported principals are IAM users or IAM roles.
     * </p>
     * 
     * @return A list of AWS Lake Formation principals. Supported principals are IAM users or IAM roles.
     */

    public java.util.List<DataLakePrincipal> getDataLakeAdmins() {
        return dataLakeAdmins;
    }

    /**
     * <p>
     * A list of AWS Lake Formation principals. Supported principals are IAM users or IAM roles.
     * </p>
     * 
     * @param dataLakeAdmins
     *        A list of AWS Lake Formation principals. Supported principals are IAM users or IAM roles.
     */

    public void setDataLakeAdmins(java.util.Collection<DataLakePrincipal> dataLakeAdmins) {
        if (dataLakeAdmins == null) {
            this.dataLakeAdmins = null;
            return;
        }

        this.dataLakeAdmins = new java.util.ArrayList<DataLakePrincipal>(dataLakeAdmins);
    }

    /**
     * <p>
     * A list of AWS Lake Formation principals. Supported principals are IAM users or IAM roles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataLakeAdmins(java.util.Collection)} or {@link #withDataLakeAdmins(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataLakeAdmins
     *        A list of AWS Lake Formation principals. Supported principals are IAM users or IAM roles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withDataLakeAdmins(DataLakePrincipal... dataLakeAdmins) {
        if (this.dataLakeAdmins == null) {
            setDataLakeAdmins(new java.util.ArrayList<DataLakePrincipal>(dataLakeAdmins.length));
        }
        for (DataLakePrincipal ele : dataLakeAdmins) {
            this.dataLakeAdmins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS Lake Formation principals. Supported principals are IAM users or IAM roles.
     * </p>
     * 
     * @param dataLakeAdmins
     *        A list of AWS Lake Formation principals. Supported principals are IAM users or IAM roles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withDataLakeAdmins(java.util.Collection<DataLakePrincipal> dataLakeAdmins) {
        setDataLakeAdmins(dataLakeAdmins);
        return this;
    }

    /**
     * <p>
     * A structure representing a list of up to three principal permissions entries for default create database
     * permissions.
     * </p>
     * 
     * @return A structure representing a list of up to three principal permissions entries for default create database
     *         permissions.
     */

    public java.util.List<PrincipalPermissions> getCreateDatabaseDefaultPermissions() {
        return createDatabaseDefaultPermissions;
    }

    /**
     * <p>
     * A structure representing a list of up to three principal permissions entries for default create database
     * permissions.
     * </p>
     * 
     * @param createDatabaseDefaultPermissions
     *        A structure representing a list of up to three principal permissions entries for default create database
     *        permissions.
     */

    public void setCreateDatabaseDefaultPermissions(java.util.Collection<PrincipalPermissions> createDatabaseDefaultPermissions) {
        if (createDatabaseDefaultPermissions == null) {
            this.createDatabaseDefaultPermissions = null;
            return;
        }

        this.createDatabaseDefaultPermissions = new java.util.ArrayList<PrincipalPermissions>(createDatabaseDefaultPermissions);
    }

    /**
     * <p>
     * A structure representing a list of up to three principal permissions entries for default create database
     * permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreateDatabaseDefaultPermissions(java.util.Collection)} or
     * {@link #withCreateDatabaseDefaultPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param createDatabaseDefaultPermissions
     *        A structure representing a list of up to three principal permissions entries for default create database
     *        permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withCreateDatabaseDefaultPermissions(PrincipalPermissions... createDatabaseDefaultPermissions) {
        if (this.createDatabaseDefaultPermissions == null) {
            setCreateDatabaseDefaultPermissions(new java.util.ArrayList<PrincipalPermissions>(createDatabaseDefaultPermissions.length));
        }
        for (PrincipalPermissions ele : createDatabaseDefaultPermissions) {
            this.createDatabaseDefaultPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure representing a list of up to three principal permissions entries for default create database
     * permissions.
     * </p>
     * 
     * @param createDatabaseDefaultPermissions
     *        A structure representing a list of up to three principal permissions entries for default create database
     *        permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withCreateDatabaseDefaultPermissions(java.util.Collection<PrincipalPermissions> createDatabaseDefaultPermissions) {
        setCreateDatabaseDefaultPermissions(createDatabaseDefaultPermissions);
        return this;
    }

    /**
     * <p>
     * A structure representing a list of up to three principal permissions entries for default create table
     * permissions.
     * </p>
     * 
     * @return A structure representing a list of up to three principal permissions entries for default create table
     *         permissions.
     */

    public java.util.List<PrincipalPermissions> getCreateTableDefaultPermissions() {
        return createTableDefaultPermissions;
    }

    /**
     * <p>
     * A structure representing a list of up to three principal permissions entries for default create table
     * permissions.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        A structure representing a list of up to three principal permissions entries for default create table
     *        permissions.
     */

    public void setCreateTableDefaultPermissions(java.util.Collection<PrincipalPermissions> createTableDefaultPermissions) {
        if (createTableDefaultPermissions == null) {
            this.createTableDefaultPermissions = null;
            return;
        }

        this.createTableDefaultPermissions = new java.util.ArrayList<PrincipalPermissions>(createTableDefaultPermissions);
    }

    /**
     * <p>
     * A structure representing a list of up to three principal permissions entries for default create table
     * permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreateTableDefaultPermissions(java.util.Collection)} or
     * {@link #withCreateTableDefaultPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        A structure representing a list of up to three principal permissions entries for default create table
     *        permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withCreateTableDefaultPermissions(PrincipalPermissions... createTableDefaultPermissions) {
        if (this.createTableDefaultPermissions == null) {
            setCreateTableDefaultPermissions(new java.util.ArrayList<PrincipalPermissions>(createTableDefaultPermissions.length));
        }
        for (PrincipalPermissions ele : createTableDefaultPermissions) {
            this.createTableDefaultPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure representing a list of up to three principal permissions entries for default create table
     * permissions.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        A structure representing a list of up to three principal permissions entries for default create table
     *        permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withCreateTableDefaultPermissions(java.util.Collection<PrincipalPermissions> createTableDefaultPermissions) {
        setCreateTableDefaultPermissions(createTableDefaultPermissions);
        return this;
    }

    /**
     * <p>
     * A list of the resource-owning account IDs that the caller's account can use to share their user access details
     * (user ARNs). The user ARNs can be logged in the resource owner's AWS CloudTrail log.
     * </p>
     * <p>
     * You may want to specify this property when you are in a high-trust boundary, such as the same team or company.
     * </p>
     * 
     * @return A list of the resource-owning account IDs that the caller's account can use to share their user access
     *         details (user ARNs). The user ARNs can be logged in the resource owner's AWS CloudTrail log.</p>
     *         <p>
     *         You may want to specify this property when you are in a high-trust boundary, such as the same team or
     *         company.
     */

    public java.util.List<String> getTrustedResourceOwners() {
        return trustedResourceOwners;
    }

    /**
     * <p>
     * A list of the resource-owning account IDs that the caller's account can use to share their user access details
     * (user ARNs). The user ARNs can be logged in the resource owner's AWS CloudTrail log.
     * </p>
     * <p>
     * You may want to specify this property when you are in a high-trust boundary, such as the same team or company.
     * </p>
     * 
     * @param trustedResourceOwners
     *        A list of the resource-owning account IDs that the caller's account can use to share their user access
     *        details (user ARNs). The user ARNs can be logged in the resource owner's AWS CloudTrail log.</p>
     *        <p>
     *        You may want to specify this property when you are in a high-trust boundary, such as the same team or
     *        company.
     */

    public void setTrustedResourceOwners(java.util.Collection<String> trustedResourceOwners) {
        if (trustedResourceOwners == null) {
            this.trustedResourceOwners = null;
            return;
        }

        this.trustedResourceOwners = new java.util.ArrayList<String>(trustedResourceOwners);
    }

    /**
     * <p>
     * A list of the resource-owning account IDs that the caller's account can use to share their user access details
     * (user ARNs). The user ARNs can be logged in the resource owner's AWS CloudTrail log.
     * </p>
     * <p>
     * You may want to specify this property when you are in a high-trust boundary, such as the same team or company.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrustedResourceOwners(java.util.Collection)} or
     * {@link #withTrustedResourceOwners(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trustedResourceOwners
     *        A list of the resource-owning account IDs that the caller's account can use to share their user access
     *        details (user ARNs). The user ARNs can be logged in the resource owner's AWS CloudTrail log.</p>
     *        <p>
     *        You may want to specify this property when you are in a high-trust boundary, such as the same team or
     *        company.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withTrustedResourceOwners(String... trustedResourceOwners) {
        if (this.trustedResourceOwners == null) {
            setTrustedResourceOwners(new java.util.ArrayList<String>(trustedResourceOwners.length));
        }
        for (String ele : trustedResourceOwners) {
            this.trustedResourceOwners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the resource-owning account IDs that the caller's account can use to share their user access details
     * (user ARNs). The user ARNs can be logged in the resource owner's AWS CloudTrail log.
     * </p>
     * <p>
     * You may want to specify this property when you are in a high-trust boundary, such as the same team or company.
     * </p>
     * 
     * @param trustedResourceOwners
     *        A list of the resource-owning account IDs that the caller's account can use to share their user access
     *        details (user ARNs). The user ARNs can be logged in the resource owner's AWS CloudTrail log.</p>
     *        <p>
     *        You may want to specify this property when you are in a high-trust boundary, such as the same team or
     *        company.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withTrustedResourceOwners(java.util.Collection<String> trustedResourceOwners) {
        setTrustedResourceOwners(trustedResourceOwners);
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
        if (getDataLakeAdmins() != null)
            sb.append("DataLakeAdmins: ").append(getDataLakeAdmins()).append(",");
        if (getCreateDatabaseDefaultPermissions() != null)
            sb.append("CreateDatabaseDefaultPermissions: ").append(getCreateDatabaseDefaultPermissions()).append(",");
        if (getCreateTableDefaultPermissions() != null)
            sb.append("CreateTableDefaultPermissions: ").append(getCreateTableDefaultPermissions()).append(",");
        if (getTrustedResourceOwners() != null)
            sb.append("TrustedResourceOwners: ").append(getTrustedResourceOwners());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakeSettings == false)
            return false;
        DataLakeSettings other = (DataLakeSettings) obj;
        if (other.getDataLakeAdmins() == null ^ this.getDataLakeAdmins() == null)
            return false;
        if (other.getDataLakeAdmins() != null && other.getDataLakeAdmins().equals(this.getDataLakeAdmins()) == false)
            return false;
        if (other.getCreateDatabaseDefaultPermissions() == null ^ this.getCreateDatabaseDefaultPermissions() == null)
            return false;
        if (other.getCreateDatabaseDefaultPermissions() != null
                && other.getCreateDatabaseDefaultPermissions().equals(this.getCreateDatabaseDefaultPermissions()) == false)
            return false;
        if (other.getCreateTableDefaultPermissions() == null ^ this.getCreateTableDefaultPermissions() == null)
            return false;
        if (other.getCreateTableDefaultPermissions() != null
                && other.getCreateTableDefaultPermissions().equals(this.getCreateTableDefaultPermissions()) == false)
            return false;
        if (other.getTrustedResourceOwners() == null ^ this.getTrustedResourceOwners() == null)
            return false;
        if (other.getTrustedResourceOwners() != null && other.getTrustedResourceOwners().equals(this.getTrustedResourceOwners()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataLakeAdmins() == null) ? 0 : getDataLakeAdmins().hashCode());
        hashCode = prime * hashCode + ((getCreateDatabaseDefaultPermissions() == null) ? 0 : getCreateDatabaseDefaultPermissions().hashCode());
        hashCode = prime * hashCode + ((getCreateTableDefaultPermissions() == null) ? 0 : getCreateTableDefaultPermissions().hashCode());
        hashCode = prime * hashCode + ((getTrustedResourceOwners() == null) ? 0 : getTrustedResourceOwners().hashCode());
        return hashCode;
    }

    @Override
    public DataLakeSettings clone() {
        try {
            return (DataLakeSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.DataLakeSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
