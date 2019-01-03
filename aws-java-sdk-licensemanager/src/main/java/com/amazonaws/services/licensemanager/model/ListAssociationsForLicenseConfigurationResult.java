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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListAssociationsForLicenseConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssociationsForLicenseConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Lists association objects for the license configuration, each containing the association time, number of consumed
     * licenses, resource ARN, resource ID, account ID that owns the resource, resource size, and resource type.
     * </p>
     */
    private java.util.List<LicenseConfigurationAssociation> licenseConfigurationAssociations;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists association objects for the license configuration, each containing the association time, number of consumed
     * licenses, resource ARN, resource ID, account ID that owns the resource, resource size, and resource type.
     * </p>
     * 
     * @return Lists association objects for the license configuration, each containing the association time, number of
     *         consumed licenses, resource ARN, resource ID, account ID that owns the resource, resource size, and
     *         resource type.
     */

    public java.util.List<LicenseConfigurationAssociation> getLicenseConfigurationAssociations() {
        return licenseConfigurationAssociations;
    }

    /**
     * <p>
     * Lists association objects for the license configuration, each containing the association time, number of consumed
     * licenses, resource ARN, resource ID, account ID that owns the resource, resource size, and resource type.
     * </p>
     * 
     * @param licenseConfigurationAssociations
     *        Lists association objects for the license configuration, each containing the association time, number of
     *        consumed licenses, resource ARN, resource ID, account ID that owns the resource, resource size, and
     *        resource type.
     */

    public void setLicenseConfigurationAssociations(java.util.Collection<LicenseConfigurationAssociation> licenseConfigurationAssociations) {
        if (licenseConfigurationAssociations == null) {
            this.licenseConfigurationAssociations = null;
            return;
        }

        this.licenseConfigurationAssociations = new java.util.ArrayList<LicenseConfigurationAssociation>(licenseConfigurationAssociations);
    }

    /**
     * <p>
     * Lists association objects for the license configuration, each containing the association time, number of consumed
     * licenses, resource ARN, resource ID, account ID that owns the resource, resource size, and resource type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseConfigurationAssociations(java.util.Collection)} or
     * {@link #withLicenseConfigurationAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseConfigurationAssociations
     *        Lists association objects for the license configuration, each containing the association time, number of
     *        consumed licenses, resource ARN, resource ID, account ID that owns the resource, resource size, and
     *        resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsForLicenseConfigurationResult withLicenseConfigurationAssociations(
            LicenseConfigurationAssociation... licenseConfigurationAssociations) {
        if (this.licenseConfigurationAssociations == null) {
            setLicenseConfigurationAssociations(new java.util.ArrayList<LicenseConfigurationAssociation>(licenseConfigurationAssociations.length));
        }
        for (LicenseConfigurationAssociation ele : licenseConfigurationAssociations) {
            this.licenseConfigurationAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists association objects for the license configuration, each containing the association time, number of consumed
     * licenses, resource ARN, resource ID, account ID that owns the resource, resource size, and resource type.
     * </p>
     * 
     * @param licenseConfigurationAssociations
     *        Lists association objects for the license configuration, each containing the association time, number of
     *        consumed licenses, resource ARN, resource ID, account ID that owns the resource, resource size, and
     *        resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsForLicenseConfigurationResult withLicenseConfigurationAssociations(
            java.util.Collection<LicenseConfigurationAssociation> licenseConfigurationAssociations) {
        setLicenseConfigurationAssociations(licenseConfigurationAssociations);
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

    public ListAssociationsForLicenseConfigurationResult withNextToken(String nextToken) {
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
        if (getLicenseConfigurationAssociations() != null)
            sb.append("LicenseConfigurationAssociations: ").append(getLicenseConfigurationAssociations()).append(",");
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

        if (obj instanceof ListAssociationsForLicenseConfigurationResult == false)
            return false;
        ListAssociationsForLicenseConfigurationResult other = (ListAssociationsForLicenseConfigurationResult) obj;
        if (other.getLicenseConfigurationAssociations() == null ^ this.getLicenseConfigurationAssociations() == null)
            return false;
        if (other.getLicenseConfigurationAssociations() != null
                && other.getLicenseConfigurationAssociations().equals(this.getLicenseConfigurationAssociations()) == false)
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

        hashCode = prime * hashCode + ((getLicenseConfigurationAssociations() == null) ? 0 : getLicenseConfigurationAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssociationsForLicenseConfigurationResult clone() {
        try {
            return (ListAssociationsForLicenseConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
