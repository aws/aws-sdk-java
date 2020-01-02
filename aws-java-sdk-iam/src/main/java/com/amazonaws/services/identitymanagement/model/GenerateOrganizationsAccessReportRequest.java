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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GenerateOrganizationsAccessReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateOrganizationsAccessReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The path of the AWS Organizations entity (root, OU, or account). You can build an entity path using the known
     * structure of your organization. For example, assume that your account ID is <code>123456789012</code> and its
     * parent OU ID is <code>ou-rge0-awsabcde</code>. The organization root ID is <code>r-f6g7h8i9j0example</code> and
     * your organization ID is <code>o-a1b2c3d4e5</code>. Your entity path is
     * <code>o-a1b2c3d4e5/r-f6g7h8i9j0example/ou-rge0-awsabcde/123456789012</code>.
     * </p>
     */
    private String entityPath;
    /**
     * <p>
     * The identifier of the AWS Organizations service control policy (SCP). This parameter is optional.
     * </p>
     * <p>
     * This ID is used to generate information about when an account principal that is limited by the SCP attempted to
     * access an AWS service.
     * </p>
     */
    private String organizationsPolicyId;

    /**
     * <p>
     * The path of the AWS Organizations entity (root, OU, or account). You can build an entity path using the known
     * structure of your organization. For example, assume that your account ID is <code>123456789012</code> and its
     * parent OU ID is <code>ou-rge0-awsabcde</code>. The organization root ID is <code>r-f6g7h8i9j0example</code> and
     * your organization ID is <code>o-a1b2c3d4e5</code>. Your entity path is
     * <code>o-a1b2c3d4e5/r-f6g7h8i9j0example/ou-rge0-awsabcde/123456789012</code>.
     * </p>
     * 
     * @param entityPath
     *        The path of the AWS Organizations entity (root, OU, or account). You can build an entity path using the
     *        known structure of your organization. For example, assume that your account ID is
     *        <code>123456789012</code> and its parent OU ID is <code>ou-rge0-awsabcde</code>. The organization root ID
     *        is <code>r-f6g7h8i9j0example</code> and your organization ID is <code>o-a1b2c3d4e5</code>. Your entity
     *        path is <code>o-a1b2c3d4e5/r-f6g7h8i9j0example/ou-rge0-awsabcde/123456789012</code>.
     */

    public void setEntityPath(String entityPath) {
        this.entityPath = entityPath;
    }

    /**
     * <p>
     * The path of the AWS Organizations entity (root, OU, or account). You can build an entity path using the known
     * structure of your organization. For example, assume that your account ID is <code>123456789012</code> and its
     * parent OU ID is <code>ou-rge0-awsabcde</code>. The organization root ID is <code>r-f6g7h8i9j0example</code> and
     * your organization ID is <code>o-a1b2c3d4e5</code>. Your entity path is
     * <code>o-a1b2c3d4e5/r-f6g7h8i9j0example/ou-rge0-awsabcde/123456789012</code>.
     * </p>
     * 
     * @return The path of the AWS Organizations entity (root, OU, or account). You can build an entity path using the
     *         known structure of your organization. For example, assume that your account ID is
     *         <code>123456789012</code> and its parent OU ID is <code>ou-rge0-awsabcde</code>. The organization root ID
     *         is <code>r-f6g7h8i9j0example</code> and your organization ID is <code>o-a1b2c3d4e5</code>. Your entity
     *         path is <code>o-a1b2c3d4e5/r-f6g7h8i9j0example/ou-rge0-awsabcde/123456789012</code>.
     */

    public String getEntityPath() {
        return this.entityPath;
    }

    /**
     * <p>
     * The path of the AWS Organizations entity (root, OU, or account). You can build an entity path using the known
     * structure of your organization. For example, assume that your account ID is <code>123456789012</code> and its
     * parent OU ID is <code>ou-rge0-awsabcde</code>. The organization root ID is <code>r-f6g7h8i9j0example</code> and
     * your organization ID is <code>o-a1b2c3d4e5</code>. Your entity path is
     * <code>o-a1b2c3d4e5/r-f6g7h8i9j0example/ou-rge0-awsabcde/123456789012</code>.
     * </p>
     * 
     * @param entityPath
     *        The path of the AWS Organizations entity (root, OU, or account). You can build an entity path using the
     *        known structure of your organization. For example, assume that your account ID is
     *        <code>123456789012</code> and its parent OU ID is <code>ou-rge0-awsabcde</code>. The organization root ID
     *        is <code>r-f6g7h8i9j0example</code> and your organization ID is <code>o-a1b2c3d4e5</code>. Your entity
     *        path is <code>o-a1b2c3d4e5/r-f6g7h8i9j0example/ou-rge0-awsabcde/123456789012</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateOrganizationsAccessReportRequest withEntityPath(String entityPath) {
        setEntityPath(entityPath);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS Organizations service control policy (SCP). This parameter is optional.
     * </p>
     * <p>
     * This ID is used to generate information about when an account principal that is limited by the SCP attempted to
     * access an AWS service.
     * </p>
     * 
     * @param organizationsPolicyId
     *        The identifier of the AWS Organizations service control policy (SCP). This parameter is optional.</p>
     *        <p>
     *        This ID is used to generate information about when an account principal that is limited by the SCP
     *        attempted to access an AWS service.
     */

    public void setOrganizationsPolicyId(String organizationsPolicyId) {
        this.organizationsPolicyId = organizationsPolicyId;
    }

    /**
     * <p>
     * The identifier of the AWS Organizations service control policy (SCP). This parameter is optional.
     * </p>
     * <p>
     * This ID is used to generate information about when an account principal that is limited by the SCP attempted to
     * access an AWS service.
     * </p>
     * 
     * @return The identifier of the AWS Organizations service control policy (SCP). This parameter is optional.</p>
     *         <p>
     *         This ID is used to generate information about when an account principal that is limited by the SCP
     *         attempted to access an AWS service.
     */

    public String getOrganizationsPolicyId() {
        return this.organizationsPolicyId;
    }

    /**
     * <p>
     * The identifier of the AWS Organizations service control policy (SCP). This parameter is optional.
     * </p>
     * <p>
     * This ID is used to generate information about when an account principal that is limited by the SCP attempted to
     * access an AWS service.
     * </p>
     * 
     * @param organizationsPolicyId
     *        The identifier of the AWS Organizations service control policy (SCP). This parameter is optional.</p>
     *        <p>
     *        This ID is used to generate information about when an account principal that is limited by the SCP
     *        attempted to access an AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateOrganizationsAccessReportRequest withOrganizationsPolicyId(String organizationsPolicyId) {
        setOrganizationsPolicyId(organizationsPolicyId);
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
        if (getEntityPath() != null)
            sb.append("EntityPath: ").append(getEntityPath()).append(",");
        if (getOrganizationsPolicyId() != null)
            sb.append("OrganizationsPolicyId: ").append(getOrganizationsPolicyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateOrganizationsAccessReportRequest == false)
            return false;
        GenerateOrganizationsAccessReportRequest other = (GenerateOrganizationsAccessReportRequest) obj;
        if (other.getEntityPath() == null ^ this.getEntityPath() == null)
            return false;
        if (other.getEntityPath() != null && other.getEntityPath().equals(this.getEntityPath()) == false)
            return false;
        if (other.getOrganizationsPolicyId() == null ^ this.getOrganizationsPolicyId() == null)
            return false;
        if (other.getOrganizationsPolicyId() != null && other.getOrganizationsPolicyId().equals(this.getOrganizationsPolicyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityPath() == null) ? 0 : getEntityPath().hashCode());
        hashCode = prime * hashCode + ((getOrganizationsPolicyId() == null) ? 0 : getOrganizationsPolicyId().hashCode());
        return hashCode;
    }

    @Override
    public GenerateOrganizationsAccessReportRequest clone() {
        return (GenerateOrganizationsAccessReportRequest) super.clone();
    }

}
