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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/UpdateApplicationSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The credentials to be added or updated.
     * </p>
     */
    private java.util.List<ApplicationCredential> credentialsToAddOrUpdate;
    /**
     * <p>
     * The credentials to be removed.
     * </p>
     */
    private java.util.List<ApplicationCredential> credentialsToRemove;
    /**
     * <p>
     * Installation of AWS Backint Agent for SAP HANA.
     * </p>
     */
    private BackintConfig backint;
    /**
     * <p>
     * The Amazon Resource Name of the SAP HANA database that replaces the current SAP HANA connection with the SAP_ABAP
     * application.
     * </p>
     */
    private String databaseArn;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The credentials to be added or updated.
     * </p>
     * 
     * @return The credentials to be added or updated.
     */

    public java.util.List<ApplicationCredential> getCredentialsToAddOrUpdate() {
        return credentialsToAddOrUpdate;
    }

    /**
     * <p>
     * The credentials to be added or updated.
     * </p>
     * 
     * @param credentialsToAddOrUpdate
     *        The credentials to be added or updated.
     */

    public void setCredentialsToAddOrUpdate(java.util.Collection<ApplicationCredential> credentialsToAddOrUpdate) {
        if (credentialsToAddOrUpdate == null) {
            this.credentialsToAddOrUpdate = null;
            return;
        }

        this.credentialsToAddOrUpdate = new java.util.ArrayList<ApplicationCredential>(credentialsToAddOrUpdate);
    }

    /**
     * <p>
     * The credentials to be added or updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCredentialsToAddOrUpdate(java.util.Collection)} or
     * {@link #withCredentialsToAddOrUpdate(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param credentialsToAddOrUpdate
     *        The credentials to be added or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withCredentialsToAddOrUpdate(ApplicationCredential... credentialsToAddOrUpdate) {
        if (this.credentialsToAddOrUpdate == null) {
            setCredentialsToAddOrUpdate(new java.util.ArrayList<ApplicationCredential>(credentialsToAddOrUpdate.length));
        }
        for (ApplicationCredential ele : credentialsToAddOrUpdate) {
            this.credentialsToAddOrUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The credentials to be added or updated.
     * </p>
     * 
     * @param credentialsToAddOrUpdate
     *        The credentials to be added or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withCredentialsToAddOrUpdate(java.util.Collection<ApplicationCredential> credentialsToAddOrUpdate) {
        setCredentialsToAddOrUpdate(credentialsToAddOrUpdate);
        return this;
    }

    /**
     * <p>
     * The credentials to be removed.
     * </p>
     * 
     * @return The credentials to be removed.
     */

    public java.util.List<ApplicationCredential> getCredentialsToRemove() {
        return credentialsToRemove;
    }

    /**
     * <p>
     * The credentials to be removed.
     * </p>
     * 
     * @param credentialsToRemove
     *        The credentials to be removed.
     */

    public void setCredentialsToRemove(java.util.Collection<ApplicationCredential> credentialsToRemove) {
        if (credentialsToRemove == null) {
            this.credentialsToRemove = null;
            return;
        }

        this.credentialsToRemove = new java.util.ArrayList<ApplicationCredential>(credentialsToRemove);
    }

    /**
     * <p>
     * The credentials to be removed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCredentialsToRemove(java.util.Collection)} or {@link #withCredentialsToRemove(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param credentialsToRemove
     *        The credentials to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withCredentialsToRemove(ApplicationCredential... credentialsToRemove) {
        if (this.credentialsToRemove == null) {
            setCredentialsToRemove(new java.util.ArrayList<ApplicationCredential>(credentialsToRemove.length));
        }
        for (ApplicationCredential ele : credentialsToRemove) {
            this.credentialsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The credentials to be removed.
     * </p>
     * 
     * @param credentialsToRemove
     *        The credentials to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withCredentialsToRemove(java.util.Collection<ApplicationCredential> credentialsToRemove) {
        setCredentialsToRemove(credentialsToRemove);
        return this;
    }

    /**
     * <p>
     * Installation of AWS Backint Agent for SAP HANA.
     * </p>
     * 
     * @param backint
     *        Installation of AWS Backint Agent for SAP HANA.
     */

    public void setBackint(BackintConfig backint) {
        this.backint = backint;
    }

    /**
     * <p>
     * Installation of AWS Backint Agent for SAP HANA.
     * </p>
     * 
     * @return Installation of AWS Backint Agent for SAP HANA.
     */

    public BackintConfig getBackint() {
        return this.backint;
    }

    /**
     * <p>
     * Installation of AWS Backint Agent for SAP HANA.
     * </p>
     * 
     * @param backint
     *        Installation of AWS Backint Agent for SAP HANA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withBackint(BackintConfig backint) {
        setBackint(backint);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the SAP HANA database that replaces the current SAP HANA connection with the SAP_ABAP
     * application.
     * </p>
     * 
     * @param databaseArn
     *        The Amazon Resource Name of the SAP HANA database that replaces the current SAP HANA connection with the
     *        SAP_ABAP application.
     */

    public void setDatabaseArn(String databaseArn) {
        this.databaseArn = databaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the SAP HANA database that replaces the current SAP HANA connection with the SAP_ABAP
     * application.
     * </p>
     * 
     * @return The Amazon Resource Name of the SAP HANA database that replaces the current SAP HANA connection with the
     *         SAP_ABAP application.
     */

    public String getDatabaseArn() {
        return this.databaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the SAP HANA database that replaces the current SAP HANA connection with the SAP_ABAP
     * application.
     * </p>
     * 
     * @param databaseArn
     *        The Amazon Resource Name of the SAP HANA database that replaces the current SAP HANA connection with the
     *        SAP_ABAP application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withDatabaseArn(String databaseArn) {
        setDatabaseArn(databaseArn);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCredentialsToAddOrUpdate() != null)
            sb.append("CredentialsToAddOrUpdate: ").append(getCredentialsToAddOrUpdate()).append(",");
        if (getCredentialsToRemove() != null)
            sb.append("CredentialsToRemove: ").append(getCredentialsToRemove()).append(",");
        if (getBackint() != null)
            sb.append("Backint: ").append(getBackint()).append(",");
        if (getDatabaseArn() != null)
            sb.append("DatabaseArn: ").append(getDatabaseArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationSettingsRequest == false)
            return false;
        UpdateApplicationSettingsRequest other = (UpdateApplicationSettingsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCredentialsToAddOrUpdate() == null ^ this.getCredentialsToAddOrUpdate() == null)
            return false;
        if (other.getCredentialsToAddOrUpdate() != null && other.getCredentialsToAddOrUpdate().equals(this.getCredentialsToAddOrUpdate()) == false)
            return false;
        if (other.getCredentialsToRemove() == null ^ this.getCredentialsToRemove() == null)
            return false;
        if (other.getCredentialsToRemove() != null && other.getCredentialsToRemove().equals(this.getCredentialsToRemove()) == false)
            return false;
        if (other.getBackint() == null ^ this.getBackint() == null)
            return false;
        if (other.getBackint() != null && other.getBackint().equals(this.getBackint()) == false)
            return false;
        if (other.getDatabaseArn() == null ^ this.getDatabaseArn() == null)
            return false;
        if (other.getDatabaseArn() != null && other.getDatabaseArn().equals(this.getDatabaseArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCredentialsToAddOrUpdate() == null) ? 0 : getCredentialsToAddOrUpdate().hashCode());
        hashCode = prime * hashCode + ((getCredentialsToRemove() == null) ? 0 : getCredentialsToRemove().hashCode());
        hashCode = prime * hashCode + ((getBackint() == null) ? 0 : getBackint().hashCode());
        hashCode = prime * hashCode + ((getDatabaseArn() == null) ? 0 : getDatabaseArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationSettingsRequest clone() {
        return (UpdateApplicationSettingsRequest) super.clone();
    }

}
