/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListFailuresForLicenseConfigurationOperations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFailuresForLicenseConfigurationOperationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * License configuration operations that failed.
     * </p>
     */
    private java.util.List<LicenseOperationFailure> licenseOperationFailureList;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * License configuration operations that failed.
     * </p>
     * 
     * @return License configuration operations that failed.
     */

    public java.util.List<LicenseOperationFailure> getLicenseOperationFailureList() {
        return licenseOperationFailureList;
    }

    /**
     * <p>
     * License configuration operations that failed.
     * </p>
     * 
     * @param licenseOperationFailureList
     *        License configuration operations that failed.
     */

    public void setLicenseOperationFailureList(java.util.Collection<LicenseOperationFailure> licenseOperationFailureList) {
        if (licenseOperationFailureList == null) {
            this.licenseOperationFailureList = null;
            return;
        }

        this.licenseOperationFailureList = new java.util.ArrayList<LicenseOperationFailure>(licenseOperationFailureList);
    }

    /**
     * <p>
     * License configuration operations that failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseOperationFailureList(java.util.Collection)} or
     * {@link #withLicenseOperationFailureList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseOperationFailureList
     *        License configuration operations that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFailuresForLicenseConfigurationOperationsResult withLicenseOperationFailureList(LicenseOperationFailure... licenseOperationFailureList) {
        if (this.licenseOperationFailureList == null) {
            setLicenseOperationFailureList(new java.util.ArrayList<LicenseOperationFailure>(licenseOperationFailureList.length));
        }
        for (LicenseOperationFailure ele : licenseOperationFailureList) {
            this.licenseOperationFailureList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * License configuration operations that failed.
     * </p>
     * 
     * @param licenseOperationFailureList
     *        License configuration operations that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFailuresForLicenseConfigurationOperationsResult withLicenseOperationFailureList(
            java.util.Collection<LicenseOperationFailure> licenseOperationFailureList) {
        setLicenseOperationFailureList(licenseOperationFailureList);
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

    public ListFailuresForLicenseConfigurationOperationsResult withNextToken(String nextToken) {
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
        if (getLicenseOperationFailureList() != null)
            sb.append("LicenseOperationFailureList: ").append(getLicenseOperationFailureList()).append(",");
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

        if (obj instanceof ListFailuresForLicenseConfigurationOperationsResult == false)
            return false;
        ListFailuresForLicenseConfigurationOperationsResult other = (ListFailuresForLicenseConfigurationOperationsResult) obj;
        if (other.getLicenseOperationFailureList() == null ^ this.getLicenseOperationFailureList() == null)
            return false;
        if (other.getLicenseOperationFailureList() != null && other.getLicenseOperationFailureList().equals(this.getLicenseOperationFailureList()) == false)
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

        hashCode = prime * hashCode + ((getLicenseOperationFailureList() == null) ? 0 : getLicenseOperationFailureList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFailuresForLicenseConfigurationOperationsResult clone() {
        try {
            return (ListFailuresForLicenseConfigurationOperationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
