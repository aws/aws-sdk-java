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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/OrganizationConfigRuleStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationConfigRuleStatus implements Serializable, Cloneable, StructuredPojo {

    private String organizationConfigRuleName;

    private String organizationRuleStatus;

    private String errorCode;

    private String errorMessage;

    private java.util.Date lastUpdateTime;

    /**
     * @param organizationConfigRuleName
     */

    public void setOrganizationConfigRuleName(String organizationConfigRuleName) {
        this.organizationConfigRuleName = organizationConfigRuleName;
    }

    /**
     * @return
     */

    public String getOrganizationConfigRuleName() {
        return this.organizationConfigRuleName;
    }

    /**
     * @param organizationConfigRuleName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRuleStatus withOrganizationConfigRuleName(String organizationConfigRuleName) {
        setOrganizationConfigRuleName(organizationConfigRuleName);
        return this;
    }

    /**
     * @param organizationRuleStatus
     * @see OrganizationRuleStatus
     */

    public void setOrganizationRuleStatus(String organizationRuleStatus) {
        this.organizationRuleStatus = organizationRuleStatus;
    }

    /**
     * @return
     * @see OrganizationRuleStatus
     */

    public String getOrganizationRuleStatus() {
        return this.organizationRuleStatus;
    }

    /**
     * @param organizationRuleStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationRuleStatus
     */

    public OrganizationConfigRuleStatus withOrganizationRuleStatus(String organizationRuleStatus) {
        setOrganizationRuleStatus(organizationRuleStatus);
        return this;
    }

    /**
     * @param organizationRuleStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationRuleStatus
     */

    public OrganizationConfigRuleStatus withOrganizationRuleStatus(OrganizationRuleStatus organizationRuleStatus) {
        this.organizationRuleStatus = organizationRuleStatus.toString();
        return this;
    }

    /**
     * @param errorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @param errorCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRuleStatus withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * @param errorMessage
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @param errorMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRuleStatus withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * @param lastUpdateTime
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @return
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * @param lastUpdateTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRuleStatus withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getOrganizationConfigRuleName() != null)
            sb.append("OrganizationConfigRuleName: ").append(getOrganizationConfigRuleName()).append(",");
        if (getOrganizationRuleStatus() != null)
            sb.append("OrganizationRuleStatus: ").append(getOrganizationRuleStatus()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationConfigRuleStatus == false)
            return false;
        OrganizationConfigRuleStatus other = (OrganizationConfigRuleStatus) obj;
        if (other.getOrganizationConfigRuleName() == null ^ this.getOrganizationConfigRuleName() == null)
            return false;
        if (other.getOrganizationConfigRuleName() != null && other.getOrganizationConfigRuleName().equals(this.getOrganizationConfigRuleName()) == false)
            return false;
        if (other.getOrganizationRuleStatus() == null ^ this.getOrganizationRuleStatus() == null)
            return false;
        if (other.getOrganizationRuleStatus() != null && other.getOrganizationRuleStatus().equals(this.getOrganizationRuleStatus()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationConfigRuleName() == null) ? 0 : getOrganizationConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getOrganizationRuleStatus() == null) ? 0 : getOrganizationRuleStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationConfigRuleStatus clone() {
        try {
            return (OrganizationConfigRuleStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.OrganizationConfigRuleStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
