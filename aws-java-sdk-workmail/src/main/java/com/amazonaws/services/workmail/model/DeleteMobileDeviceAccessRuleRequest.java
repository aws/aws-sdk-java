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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMobileDeviceAccessRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMobileDeviceAccessRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon WorkMail organization under which the rule will be deleted.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier of the rule to be deleted.
     * </p>
     */
    private String mobileDeviceAccessRuleId;

    /**
     * <p>
     * The Amazon WorkMail organization under which the rule will be deleted.
     * </p>
     * 
     * @param organizationId
     *        The Amazon WorkMail organization under which the rule will be deleted.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The Amazon WorkMail organization under which the rule will be deleted.
     * </p>
     * 
     * @return The Amazon WorkMail organization under which the rule will be deleted.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The Amazon WorkMail organization under which the rule will be deleted.
     * </p>
     * 
     * @param organizationId
     *        The Amazon WorkMail organization under which the rule will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMobileDeviceAccessRuleRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the rule to be deleted.
     * </p>
     * 
     * @param mobileDeviceAccessRuleId
     *        The identifier of the rule to be deleted.
     */

    public void setMobileDeviceAccessRuleId(String mobileDeviceAccessRuleId) {
        this.mobileDeviceAccessRuleId = mobileDeviceAccessRuleId;
    }

    /**
     * <p>
     * The identifier of the rule to be deleted.
     * </p>
     * 
     * @return The identifier of the rule to be deleted.
     */

    public String getMobileDeviceAccessRuleId() {
        return this.mobileDeviceAccessRuleId;
    }

    /**
     * <p>
     * The identifier of the rule to be deleted.
     * </p>
     * 
     * @param mobileDeviceAccessRuleId
     *        The identifier of the rule to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMobileDeviceAccessRuleRequest withMobileDeviceAccessRuleId(String mobileDeviceAccessRuleId) {
        setMobileDeviceAccessRuleId(mobileDeviceAccessRuleId);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getMobileDeviceAccessRuleId() != null)
            sb.append("MobileDeviceAccessRuleId: ").append(getMobileDeviceAccessRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMobileDeviceAccessRuleRequest == false)
            return false;
        DeleteMobileDeviceAccessRuleRequest other = (DeleteMobileDeviceAccessRuleRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getMobileDeviceAccessRuleId() == null ^ this.getMobileDeviceAccessRuleId() == null)
            return false;
        if (other.getMobileDeviceAccessRuleId() != null && other.getMobileDeviceAccessRuleId().equals(this.getMobileDeviceAccessRuleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getMobileDeviceAccessRuleId() == null) ? 0 : getMobileDeviceAccessRuleId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMobileDeviceAccessRuleRequest clone() {
        return (DeleteMobileDeviceAccessRuleRequest) super.clone();
    }

}
