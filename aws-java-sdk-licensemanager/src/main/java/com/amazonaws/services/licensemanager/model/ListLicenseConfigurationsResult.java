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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLicenseConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Array of license configuration objects.
     * </p>
     */
    private java.util.List<LicenseConfiguration> licenseConfigurations;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Array of license configuration objects.
     * </p>
     * 
     * @return Array of license configuration objects.
     */

    public java.util.List<LicenseConfiguration> getLicenseConfigurations() {
        return licenseConfigurations;
    }

    /**
     * <p>
     * Array of license configuration objects.
     * </p>
     * 
     * @param licenseConfigurations
     *        Array of license configuration objects.
     */

    public void setLicenseConfigurations(java.util.Collection<LicenseConfiguration> licenseConfigurations) {
        if (licenseConfigurations == null) {
            this.licenseConfigurations = null;
            return;
        }

        this.licenseConfigurations = new java.util.ArrayList<LicenseConfiguration>(licenseConfigurations);
    }

    /**
     * <p>
     * Array of license configuration objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseConfigurations(java.util.Collection)} or
     * {@link #withLicenseConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseConfigurations
     *        Array of license configuration objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseConfigurationsResult withLicenseConfigurations(LicenseConfiguration... licenseConfigurations) {
        if (this.licenseConfigurations == null) {
            setLicenseConfigurations(new java.util.ArrayList<LicenseConfiguration>(licenseConfigurations.length));
        }
        for (LicenseConfiguration ele : licenseConfigurations) {
            this.licenseConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of license configuration objects.
     * </p>
     * 
     * @param licenseConfigurations
     *        Array of license configuration objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseConfigurationsResult withLicenseConfigurations(java.util.Collection<LicenseConfiguration> licenseConfigurations) {
        setLicenseConfigurations(licenseConfigurations);
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

    public ListLicenseConfigurationsResult withNextToken(String nextToken) {
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
        if (getLicenseConfigurations() != null)
            sb.append("LicenseConfigurations: ").append(getLicenseConfigurations()).append(",");
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

        if (obj instanceof ListLicenseConfigurationsResult == false)
            return false;
        ListLicenseConfigurationsResult other = (ListLicenseConfigurationsResult) obj;
        if (other.getLicenseConfigurations() == null ^ this.getLicenseConfigurations() == null)
            return false;
        if (other.getLicenseConfigurations() != null && other.getLicenseConfigurations().equals(this.getLicenseConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getLicenseConfigurations() == null) ? 0 : getLicenseConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLicenseConfigurationsResult clone() {
        try {
            return (ListLicenseConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
