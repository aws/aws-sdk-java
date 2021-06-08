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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicense" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLicenseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * License status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Date on which the license is deleted.
     * </p>
     */
    private String deletionDate;

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @param status
     *        License status.
     * @see LicenseDeletionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @return License status.
     * @see LicenseDeletionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @param status
     *        License status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseDeletionStatus
     */

    public DeleteLicenseResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @param status
     *        License status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseDeletionStatus
     */

    public DeleteLicenseResult withStatus(LicenseDeletionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Date on which the license is deleted.
     * </p>
     * 
     * @param deletionDate
     *        Date on which the license is deleted.
     */

    public void setDeletionDate(String deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>
     * Date on which the license is deleted.
     * </p>
     * 
     * @return Date on which the license is deleted.
     */

    public String getDeletionDate() {
        return this.deletionDate;
    }

    /**
     * <p>
     * Date on which the license is deleted.
     * </p>
     * 
     * @param deletionDate
     *        Date on which the license is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLicenseResult withDeletionDate(String deletionDate) {
        setDeletionDate(deletionDate);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDeletionDate() != null)
            sb.append("DeletionDate: ").append(getDeletionDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLicenseResult == false)
            return false;
        DeleteLicenseResult other = (DeleteLicenseResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDeletionDate() == null ^ this.getDeletionDate() == null)
            return false;
        if (other.getDeletionDate() != null && other.getDeletionDate().equals(this.getDeletionDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDeletionDate() == null) ? 0 : getDeletionDate().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLicenseResult clone() {
        try {
            return (DeleteLicenseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
