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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseConversionTasks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLicenseConversionTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the license configuration tasks for your account.
     * </p>
     */
    private java.util.List<LicenseConversionTask> licenseConversionTasks;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the license configuration tasks for your account.
     * </p>
     * 
     * @return Information about the license configuration tasks for your account.
     */

    public java.util.List<LicenseConversionTask> getLicenseConversionTasks() {
        return licenseConversionTasks;
    }

    /**
     * <p>
     * Information about the license configuration tasks for your account.
     * </p>
     * 
     * @param licenseConversionTasks
     *        Information about the license configuration tasks for your account.
     */

    public void setLicenseConversionTasks(java.util.Collection<LicenseConversionTask> licenseConversionTasks) {
        if (licenseConversionTasks == null) {
            this.licenseConversionTasks = null;
            return;
        }

        this.licenseConversionTasks = new java.util.ArrayList<LicenseConversionTask>(licenseConversionTasks);
    }

    /**
     * <p>
     * Information about the license configuration tasks for your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseConversionTasks(java.util.Collection)} or
     * {@link #withLicenseConversionTasks(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseConversionTasks
     *        Information about the license configuration tasks for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseConversionTasksResult withLicenseConversionTasks(LicenseConversionTask... licenseConversionTasks) {
        if (this.licenseConversionTasks == null) {
            setLicenseConversionTasks(new java.util.ArrayList<LicenseConversionTask>(licenseConversionTasks.length));
        }
        for (LicenseConversionTask ele : licenseConversionTasks) {
            this.licenseConversionTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the license configuration tasks for your account.
     * </p>
     * 
     * @param licenseConversionTasks
     *        Information about the license configuration tasks for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseConversionTasksResult withLicenseConversionTasks(java.util.Collection<LicenseConversionTask> licenseConversionTasks) {
        setLicenseConversionTasks(licenseConversionTasks);
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

    public ListLicenseConversionTasksResult withNextToken(String nextToken) {
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
        if (getLicenseConversionTasks() != null)
            sb.append("LicenseConversionTasks: ").append(getLicenseConversionTasks()).append(",");
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

        if (obj instanceof ListLicenseConversionTasksResult == false)
            return false;
        ListLicenseConversionTasksResult other = (ListLicenseConversionTasksResult) obj;
        if (other.getLicenseConversionTasks() == null ^ this.getLicenseConversionTasks() == null)
            return false;
        if (other.getLicenseConversionTasks() != null && other.getLicenseConversionTasks().equals(this.getLicenseConversionTasks()) == false)
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

        hashCode = prime * hashCode + ((getLicenseConversionTasks() == null) ? 0 : getLicenseConversionTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLicenseConversionTasksResult clone() {
        try {
            return (ListLicenseConversionTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
