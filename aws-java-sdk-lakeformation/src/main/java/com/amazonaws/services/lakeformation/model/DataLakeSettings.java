/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The AWS Lake Formation principal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DataLakeSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of AWS Lake Formation principals.
     * </p>
     */
    private java.util.List<DataLakePrincipal> dataLakeAdmins;
    /**
     * <p>
     * A list of up to three principal permissions entries for default create database permissions.
     * </p>
     */
    private java.util.List<PrincipalPermissions> createDatabaseDefaultPermissions;
    /**
     * <p>
     * A list of up to three principal permissions entries for default create table permissions.
     * </p>
     */
    private java.util.List<PrincipalPermissions> createTableDefaultPermissions;

    /**
     * <p>
     * A list of AWS Lake Formation principals.
     * </p>
     * 
     * @return A list of AWS Lake Formation principals.
     */

    public java.util.List<DataLakePrincipal> getDataLakeAdmins() {
        return dataLakeAdmins;
    }

    /**
     * <p>
     * A list of AWS Lake Formation principals.
     * </p>
     * 
     * @param dataLakeAdmins
     *        A list of AWS Lake Formation principals.
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
     * A list of AWS Lake Formation principals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataLakeAdmins(java.util.Collection)} or {@link #withDataLakeAdmins(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataLakeAdmins
     *        A list of AWS Lake Formation principals.
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
     * A list of AWS Lake Formation principals.
     * </p>
     * 
     * @param dataLakeAdmins
     *        A list of AWS Lake Formation principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withDataLakeAdmins(java.util.Collection<DataLakePrincipal> dataLakeAdmins) {
        setDataLakeAdmins(dataLakeAdmins);
        return this;
    }

    /**
     * <p>
     * A list of up to three principal permissions entries for default create database permissions.
     * </p>
     * 
     * @return A list of up to three principal permissions entries for default create database permissions.
     */

    public java.util.List<PrincipalPermissions> getCreateDatabaseDefaultPermissions() {
        return createDatabaseDefaultPermissions;
    }

    /**
     * <p>
     * A list of up to three principal permissions entries for default create database permissions.
     * </p>
     * 
     * @param createDatabaseDefaultPermissions
     *        A list of up to three principal permissions entries for default create database permissions.
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
     * A list of up to three principal permissions entries for default create database permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreateDatabaseDefaultPermissions(java.util.Collection)} or
     * {@link #withCreateDatabaseDefaultPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param createDatabaseDefaultPermissions
     *        A list of up to three principal permissions entries for default create database permissions.
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
     * A list of up to three principal permissions entries for default create database permissions.
     * </p>
     * 
     * @param createDatabaseDefaultPermissions
     *        A list of up to three principal permissions entries for default create database permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withCreateDatabaseDefaultPermissions(java.util.Collection<PrincipalPermissions> createDatabaseDefaultPermissions) {
        setCreateDatabaseDefaultPermissions(createDatabaseDefaultPermissions);
        return this;
    }

    /**
     * <p>
     * A list of up to three principal permissions entries for default create table permissions.
     * </p>
     * 
     * @return A list of up to three principal permissions entries for default create table permissions.
     */

    public java.util.List<PrincipalPermissions> getCreateTableDefaultPermissions() {
        return createTableDefaultPermissions;
    }

    /**
     * <p>
     * A list of up to three principal permissions entries for default create table permissions.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        A list of up to three principal permissions entries for default create table permissions.
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
     * A list of up to three principal permissions entries for default create table permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreateTableDefaultPermissions(java.util.Collection)} or
     * {@link #withCreateTableDefaultPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        A list of up to three principal permissions entries for default create table permissions.
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
     * A list of up to three principal permissions entries for default create table permissions.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        A list of up to three principal permissions entries for default create table permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withCreateTableDefaultPermissions(java.util.Collection<PrincipalPermissions> createTableDefaultPermissions) {
        setCreateTableDefaultPermissions(createTableDefaultPermissions);
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
            sb.append("CreateTableDefaultPermissions: ").append(getCreateTableDefaultPermissions());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataLakeAdmins() == null) ? 0 : getDataLakeAdmins().hashCode());
        hashCode = prime * hashCode + ((getCreateDatabaseDefaultPermissions() == null) ? 0 : getCreateDatabaseDefaultPermissions().hashCode());
        hashCode = prime * hashCode + ((getCreateTableDefaultPermissions() == null) ? 0 : getCreateTableDefaultPermissions().hashCode());
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
