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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAccessPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccessPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     */
    private String accessPolicyId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the access
     * policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     */
    private String accessPolicyArn;
    /**
     * <p>
     * The identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user) to which this access
     * policy applies.
     * </p>
     */
    private Identity accessPolicyIdentity;
    /**
     * <p>
     * The IoT SiteWise Monitor resource (portal or project) to which this access policy provides access.
     * </p>
     */
    private Resource accessPolicyResource;
    /**
     * <p>
     * The access policy permission. Note that a project <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     */
    private String accessPolicyPermission;
    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date accessPolicyCreationDate;
    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date accessPolicyLastUpdateDate;

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @param accessPolicyId
     *        The ID of the access policy.
     */

    public void setAccessPolicyId(String accessPolicyId) {
        this.accessPolicyId = accessPolicyId;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @return The ID of the access policy.
     */

    public String getAccessPolicyId() {
        return this.accessPolicyId;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @param accessPolicyId
     *        The ID of the access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPolicyResult withAccessPolicyId(String accessPolicyId) {
        setAccessPolicyId(accessPolicyId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the access
     * policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     * 
     * @param accessPolicyArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        access policy, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     */

    public void setAccessPolicyArn(String accessPolicyArn) {
        this.accessPolicyArn = accessPolicyArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the access
     * policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         access policy, which has the following format.</p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     */

    public String getAccessPolicyArn() {
        return this.accessPolicyArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the access
     * policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     * 
     * @param accessPolicyArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        access policy, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPolicyResult withAccessPolicyArn(String accessPolicyArn) {
        setAccessPolicyArn(accessPolicyArn);
        return this;
    }

    /**
     * <p>
     * The identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user) to which this access
     * policy applies.
     * </p>
     * 
     * @param accessPolicyIdentity
     *        The identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user) to which this
     *        access policy applies.
     */

    public void setAccessPolicyIdentity(Identity accessPolicyIdentity) {
        this.accessPolicyIdentity = accessPolicyIdentity;
    }

    /**
     * <p>
     * The identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user) to which this access
     * policy applies.
     * </p>
     * 
     * @return The identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user) to which this
     *         access policy applies.
     */

    public Identity getAccessPolicyIdentity() {
        return this.accessPolicyIdentity;
    }

    /**
     * <p>
     * The identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user) to which this access
     * policy applies.
     * </p>
     * 
     * @param accessPolicyIdentity
     *        The identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user) to which this
     *        access policy applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPolicyResult withAccessPolicyIdentity(Identity accessPolicyIdentity) {
        setAccessPolicyIdentity(accessPolicyIdentity);
        return this;
    }

    /**
     * <p>
     * The IoT SiteWise Monitor resource (portal or project) to which this access policy provides access.
     * </p>
     * 
     * @param accessPolicyResource
     *        The IoT SiteWise Monitor resource (portal or project) to which this access policy provides access.
     */

    public void setAccessPolicyResource(Resource accessPolicyResource) {
        this.accessPolicyResource = accessPolicyResource;
    }

    /**
     * <p>
     * The IoT SiteWise Monitor resource (portal or project) to which this access policy provides access.
     * </p>
     * 
     * @return The IoT SiteWise Monitor resource (portal or project) to which this access policy provides access.
     */

    public Resource getAccessPolicyResource() {
        return this.accessPolicyResource;
    }

    /**
     * <p>
     * The IoT SiteWise Monitor resource (portal or project) to which this access policy provides access.
     * </p>
     * 
     * @param accessPolicyResource
     *        The IoT SiteWise Monitor resource (portal or project) to which this access policy provides access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPolicyResult withAccessPolicyResource(Resource accessPolicyResource) {
        setAccessPolicyResource(accessPolicyResource);
        return this;
    }

    /**
     * <p>
     * The access policy permission. Note that a project <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * 
     * @param accessPolicyPermission
     *        The access policy permission. Note that a project <code>ADMINISTRATOR</code> is also known as a project
     *        owner.
     * @see Permission
     */

    public void setAccessPolicyPermission(String accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission;
    }

    /**
     * <p>
     * The access policy permission. Note that a project <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * 
     * @return The access policy permission. Note that a project <code>ADMINISTRATOR</code> is also known as a project
     *         owner.
     * @see Permission
     */

    public String getAccessPolicyPermission() {
        return this.accessPolicyPermission;
    }

    /**
     * <p>
     * The access policy permission. Note that a project <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * 
     * @param accessPolicyPermission
     *        The access policy permission. Note that a project <code>ADMINISTRATOR</code> is also known as a project
     *        owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public DescribeAccessPolicyResult withAccessPolicyPermission(String accessPolicyPermission) {
        setAccessPolicyPermission(accessPolicyPermission);
        return this;
    }

    /**
     * <p>
     * The access policy permission. Note that a project <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * 
     * @param accessPolicyPermission
     *        The access policy permission. Note that a project <code>ADMINISTRATOR</code> is also known as a project
     *        owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public DescribeAccessPolicyResult withAccessPolicyPermission(Permission accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission.toString();
        return this;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     * 
     * @param accessPolicyCreationDate
     *        The date the access policy was created, in Unix epoch time.
     */

    public void setAccessPolicyCreationDate(java.util.Date accessPolicyCreationDate) {
        this.accessPolicyCreationDate = accessPolicyCreationDate;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the access policy was created, in Unix epoch time.
     */

    public java.util.Date getAccessPolicyCreationDate() {
        return this.accessPolicyCreationDate;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     * 
     * @param accessPolicyCreationDate
     *        The date the access policy was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPolicyResult withAccessPolicyCreationDate(java.util.Date accessPolicyCreationDate) {
        setAccessPolicyCreationDate(accessPolicyCreationDate);
        return this;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     * 
     * @param accessPolicyLastUpdateDate
     *        The date the access policy was last updated, in Unix epoch time.
     */

    public void setAccessPolicyLastUpdateDate(java.util.Date accessPolicyLastUpdateDate) {
        this.accessPolicyLastUpdateDate = accessPolicyLastUpdateDate;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the access policy was last updated, in Unix epoch time.
     */

    public java.util.Date getAccessPolicyLastUpdateDate() {
        return this.accessPolicyLastUpdateDate;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     * 
     * @param accessPolicyLastUpdateDate
     *        The date the access policy was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPolicyResult withAccessPolicyLastUpdateDate(java.util.Date accessPolicyLastUpdateDate) {
        setAccessPolicyLastUpdateDate(accessPolicyLastUpdateDate);
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
        if (getAccessPolicyId() != null)
            sb.append("AccessPolicyId: ").append(getAccessPolicyId()).append(",");
        if (getAccessPolicyArn() != null)
            sb.append("AccessPolicyArn: ").append(getAccessPolicyArn()).append(",");
        if (getAccessPolicyIdentity() != null)
            sb.append("AccessPolicyIdentity: ").append(getAccessPolicyIdentity()).append(",");
        if (getAccessPolicyResource() != null)
            sb.append("AccessPolicyResource: ").append(getAccessPolicyResource()).append(",");
        if (getAccessPolicyPermission() != null)
            sb.append("AccessPolicyPermission: ").append(getAccessPolicyPermission()).append(",");
        if (getAccessPolicyCreationDate() != null)
            sb.append("AccessPolicyCreationDate: ").append(getAccessPolicyCreationDate()).append(",");
        if (getAccessPolicyLastUpdateDate() != null)
            sb.append("AccessPolicyLastUpdateDate: ").append(getAccessPolicyLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccessPolicyResult == false)
            return false;
        DescribeAccessPolicyResult other = (DescribeAccessPolicyResult) obj;
        if (other.getAccessPolicyId() == null ^ this.getAccessPolicyId() == null)
            return false;
        if (other.getAccessPolicyId() != null && other.getAccessPolicyId().equals(this.getAccessPolicyId()) == false)
            return false;
        if (other.getAccessPolicyArn() == null ^ this.getAccessPolicyArn() == null)
            return false;
        if (other.getAccessPolicyArn() != null && other.getAccessPolicyArn().equals(this.getAccessPolicyArn()) == false)
            return false;
        if (other.getAccessPolicyIdentity() == null ^ this.getAccessPolicyIdentity() == null)
            return false;
        if (other.getAccessPolicyIdentity() != null && other.getAccessPolicyIdentity().equals(this.getAccessPolicyIdentity()) == false)
            return false;
        if (other.getAccessPolicyResource() == null ^ this.getAccessPolicyResource() == null)
            return false;
        if (other.getAccessPolicyResource() != null && other.getAccessPolicyResource().equals(this.getAccessPolicyResource()) == false)
            return false;
        if (other.getAccessPolicyPermission() == null ^ this.getAccessPolicyPermission() == null)
            return false;
        if (other.getAccessPolicyPermission() != null && other.getAccessPolicyPermission().equals(this.getAccessPolicyPermission()) == false)
            return false;
        if (other.getAccessPolicyCreationDate() == null ^ this.getAccessPolicyCreationDate() == null)
            return false;
        if (other.getAccessPolicyCreationDate() != null && other.getAccessPolicyCreationDate().equals(this.getAccessPolicyCreationDate()) == false)
            return false;
        if (other.getAccessPolicyLastUpdateDate() == null ^ this.getAccessPolicyLastUpdateDate() == null)
            return false;
        if (other.getAccessPolicyLastUpdateDate() != null && other.getAccessPolicyLastUpdateDate().equals(this.getAccessPolicyLastUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPolicyId() == null) ? 0 : getAccessPolicyId().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicyArn() == null) ? 0 : getAccessPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicyIdentity() == null) ? 0 : getAccessPolicyIdentity().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicyResource() == null) ? 0 : getAccessPolicyResource().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicyPermission() == null) ? 0 : getAccessPolicyPermission().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicyCreationDate() == null) ? 0 : getAccessPolicyCreationDate().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicyLastUpdateDate() == null) ? 0 : getAccessPolicyLastUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccessPolicyResult clone() {
        try {
            return (DescribeAccessPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
