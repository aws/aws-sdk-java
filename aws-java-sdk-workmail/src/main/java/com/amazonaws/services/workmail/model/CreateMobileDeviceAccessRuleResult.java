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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateMobileDeviceAccessRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMobileDeviceAccessRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the newly created mobile device access rule.
     * </p>
     */
    private String mobileDeviceAccessRuleId;

    /**
     * <p>
     * The identifier for the newly created mobile device access rule.
     * </p>
     * 
     * @param mobileDeviceAccessRuleId
     *        The identifier for the newly created mobile device access rule.
     */

    public void setMobileDeviceAccessRuleId(String mobileDeviceAccessRuleId) {
        this.mobileDeviceAccessRuleId = mobileDeviceAccessRuleId;
    }

    /**
     * <p>
     * The identifier for the newly created mobile device access rule.
     * </p>
     * 
     * @return The identifier for the newly created mobile device access rule.
     */

    public String getMobileDeviceAccessRuleId() {
        return this.mobileDeviceAccessRuleId;
    }

    /**
     * <p>
     * The identifier for the newly created mobile device access rule.
     * </p>
     * 
     * @param mobileDeviceAccessRuleId
     *        The identifier for the newly created mobile device access rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMobileDeviceAccessRuleResult withMobileDeviceAccessRuleId(String mobileDeviceAccessRuleId) {
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

        if (obj instanceof CreateMobileDeviceAccessRuleResult == false)
            return false;
        CreateMobileDeviceAccessRuleResult other = (CreateMobileDeviceAccessRuleResult) obj;
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

        hashCode = prime * hashCode + ((getMobileDeviceAccessRuleId() == null) ? 0 : getMobileDeviceAccessRuleId().hashCode());
        return hashCode;
    }

    @Override
    public CreateMobileDeviceAccessRuleResult clone() {
        try {
            return (CreateMobileDeviceAccessRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
