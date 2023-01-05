/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DescribeOrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Indicates whether to automatically enable new organization accounts as member accounts in the organization
     * behavior graph.
     * </p>
     */
    private Boolean autoEnable;

    /**
     * <p>
     * Indicates whether to automatically enable new organization accounts as member accounts in the organization
     * behavior graph.
     * </p>
     * 
     * @param autoEnable
     *        Indicates whether to automatically enable new organization accounts as member accounts in the organization
     *        behavior graph.
     */

    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Indicates whether to automatically enable new organization accounts as member accounts in the organization
     * behavior graph.
     * </p>
     * 
     * @return Indicates whether to automatically enable new organization accounts as member accounts in the
     *         organization behavior graph.
     */

    public Boolean getAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Indicates whether to automatically enable new organization accounts as member accounts in the organization
     * behavior graph.
     * </p>
     * 
     * @param autoEnable
     *        Indicates whether to automatically enable new organization accounts as member accounts in the organization
     *        behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationResult withAutoEnable(Boolean autoEnable) {
        setAutoEnable(autoEnable);
        return this;
    }

    /**
     * <p>
     * Indicates whether to automatically enable new organization accounts as member accounts in the organization
     * behavior graph.
     * </p>
     * 
     * @return Indicates whether to automatically enable new organization accounts as member accounts in the
     *         organization behavior graph.
     */

    public Boolean isAutoEnable() {
        return this.autoEnable;
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
            sb.append("AutoEnable: ").append(getAutoEnable());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
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
