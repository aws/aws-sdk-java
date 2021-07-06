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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeOrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for accounts that are added to the Amazon Web Services
     * organization.
     * </p>
     */
    private Boolean autoEnable;
    /**
     * <p>
     * Specifies whether the maximum number of Amazon Macie member accounts are part of the Amazon Web Services
     * organization.
     * </p>
     */
    private Boolean maxAccountLimitReached;

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for accounts that are added to the Amazon Web Services
     * organization.
     * </p>
     * 
     * @param autoEnable
     *        Specifies whether Amazon Macie is enabled automatically for accounts that are added to the Amazon Web
     *        Services organization.
     */

    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for accounts that are added to the Amazon Web Services
     * organization.
     * </p>
     * 
     * @return Specifies whether Amazon Macie is enabled automatically for accounts that are added to the Amazon Web
     *         Services organization.
     */

    public Boolean getAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for accounts that are added to the Amazon Web Services
     * organization.
     * </p>
     * 
     * @param autoEnable
     *        Specifies whether Amazon Macie is enabled automatically for accounts that are added to the Amazon Web
     *        Services organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationResult withAutoEnable(Boolean autoEnable) {
        setAutoEnable(autoEnable);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for accounts that are added to the Amazon Web Services
     * organization.
     * </p>
     * 
     * @return Specifies whether Amazon Macie is enabled automatically for accounts that are added to the Amazon Web
     *         Services organization.
     */

    public Boolean isAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Specifies whether the maximum number of Amazon Macie member accounts are part of the Amazon Web Services
     * organization.
     * </p>
     * 
     * @param maxAccountLimitReached
     *        Specifies whether the maximum number of Amazon Macie member accounts are part of the Amazon Web Services
     *        organization.
     */

    public void setMaxAccountLimitReached(Boolean maxAccountLimitReached) {
        this.maxAccountLimitReached = maxAccountLimitReached;
    }

    /**
     * <p>
     * Specifies whether the maximum number of Amazon Macie member accounts are part of the Amazon Web Services
     * organization.
     * </p>
     * 
     * @return Specifies whether the maximum number of Amazon Macie member accounts are part of the Amazon Web Services
     *         organization.
     */

    public Boolean getMaxAccountLimitReached() {
        return this.maxAccountLimitReached;
    }

    /**
     * <p>
     * Specifies whether the maximum number of Amazon Macie member accounts are part of the Amazon Web Services
     * organization.
     * </p>
     * 
     * @param maxAccountLimitReached
     *        Specifies whether the maximum number of Amazon Macie member accounts are part of the Amazon Web Services
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationResult withMaxAccountLimitReached(Boolean maxAccountLimitReached) {
        setMaxAccountLimitReached(maxAccountLimitReached);
        return this;
    }

    /**
     * <p>
     * Specifies whether the maximum number of Amazon Macie member accounts are part of the Amazon Web Services
     * organization.
     * </p>
     * 
     * @return Specifies whether the maximum number of Amazon Macie member accounts are part of the Amazon Web Services
     *         organization.
     */

    public Boolean isMaxAccountLimitReached() {
        return this.maxAccountLimitReached;
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
        if (getAutoEnable() != null)
            sb.append("AutoEnable: ").append(getAutoEnable()).append(",");
        if (getMaxAccountLimitReached() != null)
            sb.append("MaxAccountLimitReached: ").append(getMaxAccountLimitReached());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationConfigurationResult == false)
            return false;
        DescribeOrganizationConfigurationResult other = (DescribeOrganizationConfigurationResult) obj;
        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        if (other.getMaxAccountLimitReached() == null ^ this.getMaxAccountLimitReached() == null)
            return false;
        if (other.getMaxAccountLimitReached() != null && other.getMaxAccountLimitReached().equals(this.getMaxAccountLimitReached()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        hashCode = prime * hashCode + ((getMaxAccountLimitReached() == null) ? 0 : getMaxAccountLimitReached().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationConfigurationResult clone() {
        try {
            return (DescribeOrganizationConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
