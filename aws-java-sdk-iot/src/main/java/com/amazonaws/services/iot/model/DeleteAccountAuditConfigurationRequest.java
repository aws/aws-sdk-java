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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAccountAuditConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If true, all scheduled audits are deleted.
     * </p>
     */
    private Boolean deleteScheduledAudits;

    /**
     * <p>
     * If true, all scheduled audits are deleted.
     * </p>
     * 
     * @param deleteScheduledAudits
     *        If true, all scheduled audits are deleted.
     */

    public void setDeleteScheduledAudits(Boolean deleteScheduledAudits) {
        this.deleteScheduledAudits = deleteScheduledAudits;
    }

    /**
     * <p>
     * If true, all scheduled audits are deleted.
     * </p>
     * 
     * @return If true, all scheduled audits are deleted.
     */

    public Boolean getDeleteScheduledAudits() {
        return this.deleteScheduledAudits;
    }

    /**
     * <p>
     * If true, all scheduled audits are deleted.
     * </p>
     * 
     * @param deleteScheduledAudits
     *        If true, all scheduled audits are deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccountAuditConfigurationRequest withDeleteScheduledAudits(Boolean deleteScheduledAudits) {
        setDeleteScheduledAudits(deleteScheduledAudits);
        return this;
    }

    /**
     * <p>
     * If true, all scheduled audits are deleted.
     * </p>
     * 
     * @return If true, all scheduled audits are deleted.
     */

    public Boolean isDeleteScheduledAudits() {
        return this.deleteScheduledAudits;
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
        if (getDeleteScheduledAudits() != null)
            sb.append("DeleteScheduledAudits: ").append(getDeleteScheduledAudits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAccountAuditConfigurationRequest == false)
            return false;
        DeleteAccountAuditConfigurationRequest other = (DeleteAccountAuditConfigurationRequest) obj;
        if (other.getDeleteScheduledAudits() == null ^ this.getDeleteScheduledAudits() == null)
            return false;
        if (other.getDeleteScheduledAudits() != null && other.getDeleteScheduledAudits().equals(this.getDeleteScheduledAudits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleteScheduledAudits() == null) ? 0 : getDeleteScheduledAudits().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAccountAuditConfigurationRequest clone() {
        return (DeleteAccountAuditConfigurationRequest) super.clone();
    }

}
