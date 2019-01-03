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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSecretResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the secret that is now scheduled for deletion.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The friendly name of the secret that is now scheduled for deletion.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This
     * value is the date and time of the delete request plus the number of days specified in
     * <code>RecoveryWindowInDays</code>.
     * </p>
     */
    private java.util.Date deletionDate;

    /**
     * <p>
     * The ARN of the secret that is now scheduled for deletion.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret that is now scheduled for deletion.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN of the secret that is now scheduled for deletion.
     * </p>
     * 
     * @return The ARN of the secret that is now scheduled for deletion.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN of the secret that is now scheduled for deletion.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret that is now scheduled for deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecretResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The friendly name of the secret that is now scheduled for deletion.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret that is now scheduled for deletion.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the secret that is now scheduled for deletion.
     * </p>
     * 
     * @return The friendly name of the secret that is now scheduled for deletion.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the secret that is now scheduled for deletion.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret that is now scheduled for deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecretResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This
     * value is the date and time of the delete request plus the number of days specified in
     * <code>RecoveryWindowInDays</code>.
     * </p>
     * 
     * @param deletionDate
     *        The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored.
     *        This value is the date and time of the delete request plus the number of days specified in
     *        <code>RecoveryWindowInDays</code>.
     */

    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>
     * The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This
     * value is the date and time of the delete request plus the number of days specified in
     * <code>RecoveryWindowInDays</code>.
     * </p>
     * 
     * @return The date and time after which this secret can be deleted by Secrets Manager and can no longer be
     *         restored. This value is the date and time of the delete request plus the number of days specified in
     *         <code>RecoveryWindowInDays</code>.
     */

    public java.util.Date getDeletionDate() {
        return this.deletionDate;
    }

    /**
     * <p>
     * The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This
     * value is the date and time of the delete request plus the number of days specified in
     * <code>RecoveryWindowInDays</code>.
     * </p>
     * 
     * @param deletionDate
     *        The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored.
     *        This value is the date and time of the delete request plus the number of days specified in
     *        <code>RecoveryWindowInDays</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecretResult withDeletionDate(java.util.Date deletionDate) {
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof DeleteSecretResult == false)
            return false;
        DeleteSecretResult other = (DeleteSecretResult) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDeletionDate() == null) ? 0 : getDeletionDate().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSecretResult clone() {
        try {
            return (DeleteSecretResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
