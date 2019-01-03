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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListUsageForLicenseConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsageForLicenseConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of <code>LicenseConfigurationUsage</code> objects.
     * </p>
     */
    private java.util.List<LicenseConfigurationUsage> licenseConfigurationUsageList;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>LicenseConfigurationUsage</code> objects.
     * </p>
     * 
     * @return An array of <code>LicenseConfigurationUsage</code> objects.
     */

    public java.util.List<LicenseConfigurationUsage> getLicenseConfigurationUsageList() {
        return licenseConfigurationUsageList;
    }

    /**
     * <p>
     * An array of <code>LicenseConfigurationUsage</code> objects.
     * </p>
     * 
     * @param licenseConfigurationUsageList
     *        An array of <code>LicenseConfigurationUsage</code> objects.
     */

    public void setLicenseConfigurationUsageList(java.util.Collection<LicenseConfigurationUsage> licenseConfigurationUsageList) {
        if (licenseConfigurationUsageList == null) {
            this.licenseConfigurationUsageList = null;
            return;
        }

        this.licenseConfigurationUsageList = new java.util.ArrayList<LicenseConfigurationUsage>(licenseConfigurationUsageList);
    }

    /**
     * <p>
     * An array of <code>LicenseConfigurationUsage</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseConfigurationUsageList(java.util.Collection)} or
     * {@link #withLicenseConfigurationUsageList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseConfigurationUsageList
     *        An array of <code>LicenseConfigurationUsage</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageForLicenseConfigurationResult withLicenseConfigurationUsageList(LicenseConfigurationUsage... licenseConfigurationUsageList) {
        if (this.licenseConfigurationUsageList == null) {
            setLicenseConfigurationUsageList(new java.util.ArrayList<LicenseConfigurationUsage>(licenseConfigurationUsageList.length));
        }
        for (LicenseConfigurationUsage ele : licenseConfigurationUsageList) {
            this.licenseConfigurationUsageList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>LicenseConfigurationUsage</code> objects.
     * </p>
     * 
     * @param licenseConfigurationUsageList
     *        An array of <code>LicenseConfigurationUsage</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageForLicenseConfigurationResult withLicenseConfigurationUsageList(
            java.util.Collection<LicenseConfigurationUsage> licenseConfigurationUsageList) {
        setLicenseConfigurationUsageList(licenseConfigurationUsageList);
        return this;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @return Token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageForLicenseConfigurationResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getLicenseConfigurationUsageList() != null)
            sb.append("LicenseConfigurationUsageList: ").append(getLicenseConfigurationUsageList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsageForLicenseConfigurationResult == false)
            return false;
        ListUsageForLicenseConfigurationResult other = (ListUsageForLicenseConfigurationResult) obj;
        if (other.getLicenseConfigurationUsageList() == null ^ this.getLicenseConfigurationUsageList() == null)
            return false;
        if (other.getLicenseConfigurationUsageList() != null
                && other.getLicenseConfigurationUsageList().equals(this.getLicenseConfigurationUsageList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConfigurationUsageList() == null) ? 0 : getLicenseConfigurationUsageList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUsageForLicenseConfigurationResult clone() {
        try {
            return (ListUsageForLicenseConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
