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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateWebACLMigrationStack"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWebACLMigrationStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
     * </p>
     */
    private String webACLId;
    /**
     * <p>
     * The name of the Amazon S3 bucket to store the CloudFormation template in. The S3 bucket must be configured as
     * follows for the migration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket name must start with <code>aws-waf-migration-</code>. For example,
     * <code>aws-waf-migration-my-web-acl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket must be in the Region where you are deploying the template. For example, for a web ACL in us-west-2,
     * you must use an Amazon S3 bucket in us-west-2 and you must deploy the template stack to us-west-2.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket policies must permit the migration process to write data. For listings of the bucket policies, see the
     * Examples section.
     * </p>
     * </li>
     * </ul>
     */
    private String s3BucketName;
    /**
     * <p>
     * Indicates whether to exclude entities that can't be migrated or to stop the migration. Set this to true to ignore
     * unsupported entities in the web ACL during the migration. Otherwise, if AWS WAF encounters unsupported entities,
     * it stops the process and throws an exception.
     * </p>
     */
    private Boolean ignoreUnsupportedType;

    /**
     * <p>
     * The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
     * </p>
     * 
     * @param webACLId
     *        The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
     * </p>
     * 
     * @return The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * <p>
     * The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
     * </p>
     * 
     * @param webACLId
     *        The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebACLMigrationStackRequest withWebACLId(String webACLId) {
        setWebACLId(webACLId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to store the CloudFormation template in. The S3 bucket must be configured as
     * follows for the migration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket name must start with <code>aws-waf-migration-</code>. For example,
     * <code>aws-waf-migration-my-web-acl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket must be in the Region where you are deploying the template. For example, for a web ACL in us-west-2,
     * you must use an Amazon S3 bucket in us-west-2 and you must deploy the template stack to us-west-2.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket policies must permit the migration process to write data. For listings of the bucket policies, see the
     * Examples section.
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket to store the CloudFormation template in. The S3 bucket must be configured
     *        as follows for the migration: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The bucket name must start with <code>aws-waf-migration-</code>. For example,
     *        <code>aws-waf-migration-my-web-acl</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket must be in the Region where you are deploying the template. For example, for a web ACL in
     *        us-west-2, you must use an Amazon S3 bucket in us-west-2 and you must deploy the template stack to
     *        us-west-2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket policies must permit the migration process to write data. For listings of the bucket policies,
     *        see the Examples section.
     *        </p>
     *        </li>
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to store the CloudFormation template in. The S3 bucket must be configured as
     * follows for the migration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket name must start with <code>aws-waf-migration-</code>. For example,
     * <code>aws-waf-migration-my-web-acl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket must be in the Region where you are deploying the template. For example, for a web ACL in us-west-2,
     * you must use an Amazon S3 bucket in us-west-2 and you must deploy the template stack to us-west-2.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket policies must permit the migration process to write data. For listings of the bucket policies, see the
     * Examples section.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the Amazon S3 bucket to store the CloudFormation template in. The S3 bucket must be
     *         configured as follows for the migration: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The bucket name must start with <code>aws-waf-migration-</code>. For example,
     *         <code>aws-waf-migration-my-web-acl</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket must be in the Region where you are deploying the template. For example, for a web ACL in
     *         us-west-2, you must use an Amazon S3 bucket in us-west-2 and you must deploy the template stack to
     *         us-west-2.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket policies must permit the migration process to write data. For listings of the bucket policies,
     *         see the Examples section.
     *         </p>
     *         </li>
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to store the CloudFormation template in. The S3 bucket must be configured as
     * follows for the migration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket name must start with <code>aws-waf-migration-</code>. For example,
     * <code>aws-waf-migration-my-web-acl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket must be in the Region where you are deploying the template. For example, for a web ACL in us-west-2,
     * you must use an Amazon S3 bucket in us-west-2 and you must deploy the template stack to us-west-2.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket policies must permit the migration process to write data. For listings of the bucket policies, see the
     * Examples section.
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket to store the CloudFormation template in. The S3 bucket must be configured
     *        as follows for the migration: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The bucket name must start with <code>aws-waf-migration-</code>. For example,
     *        <code>aws-waf-migration-my-web-acl</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket must be in the Region where you are deploying the template. For example, for a web ACL in
     *        us-west-2, you must use an Amazon S3 bucket in us-west-2 and you must deploy the template stack to
     *        us-west-2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket policies must permit the migration process to write data. For listings of the bucket policies,
     *        see the Examples section.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebACLMigrationStackRequest withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * Indicates whether to exclude entities that can't be migrated or to stop the migration. Set this to true to ignore
     * unsupported entities in the web ACL during the migration. Otherwise, if AWS WAF encounters unsupported entities,
     * it stops the process and throws an exception.
     * </p>
     * 
     * @param ignoreUnsupportedType
     *        Indicates whether to exclude entities that can't be migrated or to stop the migration. Set this to true to
     *        ignore unsupported entities in the web ACL during the migration. Otherwise, if AWS WAF encounters
     *        unsupported entities, it stops the process and throws an exception.
     */

    public void setIgnoreUnsupportedType(Boolean ignoreUnsupportedType) {
        this.ignoreUnsupportedType = ignoreUnsupportedType;
    }

    /**
     * <p>
     * Indicates whether to exclude entities that can't be migrated or to stop the migration. Set this to true to ignore
     * unsupported entities in the web ACL during the migration. Otherwise, if AWS WAF encounters unsupported entities,
     * it stops the process and throws an exception.
     * </p>
     * 
     * @return Indicates whether to exclude entities that can't be migrated or to stop the migration. Set this to true
     *         to ignore unsupported entities in the web ACL during the migration. Otherwise, if AWS WAF encounters
     *         unsupported entities, it stops the process and throws an exception.
     */

    public Boolean getIgnoreUnsupportedType() {
        return this.ignoreUnsupportedType;
    }

    /**
     * <p>
     * Indicates whether to exclude entities that can't be migrated or to stop the migration. Set this to true to ignore
     * unsupported entities in the web ACL during the migration. Otherwise, if AWS WAF encounters unsupported entities,
     * it stops the process and throws an exception.
     * </p>
     * 
     * @param ignoreUnsupportedType
     *        Indicates whether to exclude entities that can't be migrated or to stop the migration. Set this to true to
     *        ignore unsupported entities in the web ACL during the migration. Otherwise, if AWS WAF encounters
     *        unsupported entities, it stops the process and throws an exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebACLMigrationStackRequest withIgnoreUnsupportedType(Boolean ignoreUnsupportedType) {
        setIgnoreUnsupportedType(ignoreUnsupportedType);
        return this;
    }

    /**
     * <p>
     * Indicates whether to exclude entities that can't be migrated or to stop the migration. Set this to true to ignore
     * unsupported entities in the web ACL during the migration. Otherwise, if AWS WAF encounters unsupported entities,
     * it stops the process and throws an exception.
     * </p>
     * 
     * @return Indicates whether to exclude entities that can't be migrated or to stop the migration. Set this to true
     *         to ignore unsupported entities in the web ACL during the migration. Otherwise, if AWS WAF encounters
     *         unsupported entities, it stops the process and throws an exception.
     */

    public Boolean isIgnoreUnsupportedType() {
        return this.ignoreUnsupportedType;
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
        if (getWebACLId() != null)
            sb.append("WebACLId: ").append(getWebACLId()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getIgnoreUnsupportedType() != null)
            sb.append("IgnoreUnsupportedType: ").append(getIgnoreUnsupportedType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWebACLMigrationStackRequest == false)
            return false;
        CreateWebACLMigrationStackRequest other = (CreateWebACLMigrationStackRequest) obj;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getIgnoreUnsupportedType() == null ^ this.getIgnoreUnsupportedType() == null)
            return false;
        if (other.getIgnoreUnsupportedType() != null && other.getIgnoreUnsupportedType().equals(this.getIgnoreUnsupportedType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getIgnoreUnsupportedType() == null) ? 0 : getIgnoreUnsupportedType().hashCode());
        return hashCode;
    }

    @Override
    public CreateWebACLMigrationStackRequest clone() {
        return (CreateWebACLMigrationStackRequest) super.clone();
    }

}
