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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateCustomLogSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomLogSourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     */
    private String customDataLocation;
    /**
     * <p>
     * The name of the Glue crawler.
     * </p>
     */
    private String glueCrawlerName;
    /**
     * <p>
     * The Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     */
    private String glueDatabaseName;
    /**
     * <p>
     * The table name of the Glue crawler.
     * </p>
     */
    private String glueTableName;
    /**
     * <p>
     * The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security Lake
     * will apply the correct access policies to this role, but you must first manually create the trust policy for this
     * role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust the
     * <code>logProviderAccountId</code> to assume the role.
     * </p>
     */
    private String logProviderAccessRoleArn;

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     * 
     * @param customDataLocation
     *        The location of the partition in the Amazon S3 bucket for Security Lake.
     */

    public void setCustomDataLocation(String customDataLocation) {
        this.customDataLocation = customDataLocation;
    }

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     * 
     * @return The location of the partition in the Amazon S3 bucket for Security Lake.
     */

    public String getCustomDataLocation() {
        return this.customDataLocation;
    }

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     * 
     * @param customDataLocation
     *        The location of the partition in the Amazon S3 bucket for Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLogSourceResult withCustomDataLocation(String customDataLocation) {
        setCustomDataLocation(customDataLocation);
        return this;
    }

    /**
     * <p>
     * The name of the Glue crawler.
     * </p>
     * 
     * @param glueCrawlerName
     *        The name of the Glue crawler.
     */

    public void setGlueCrawlerName(String glueCrawlerName) {
        this.glueCrawlerName = glueCrawlerName;
    }

    /**
     * <p>
     * The name of the Glue crawler.
     * </p>
     * 
     * @return The name of the Glue crawler.
     */

    public String getGlueCrawlerName() {
        return this.glueCrawlerName;
    }

    /**
     * <p>
     * The name of the Glue crawler.
     * </p>
     * 
     * @param glueCrawlerName
     *        The name of the Glue crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLogSourceResult withGlueCrawlerName(String glueCrawlerName) {
        setGlueCrawlerName(glueCrawlerName);
        return this;
    }

    /**
     * <p>
     * The Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     * 
     * @param glueDatabaseName
     *        The Glue database where results are written, such as:
     *        <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     */

    public void setGlueDatabaseName(String glueDatabaseName) {
        this.glueDatabaseName = glueDatabaseName;
    }

    /**
     * <p>
     * The Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     * 
     * @return The Glue database where results are written, such as:
     *         <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     */

    public String getGlueDatabaseName() {
        return this.glueDatabaseName;
    }

    /**
     * <p>
     * The Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     * 
     * @param glueDatabaseName
     *        The Glue database where results are written, such as:
     *        <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLogSourceResult withGlueDatabaseName(String glueDatabaseName) {
        setGlueDatabaseName(glueDatabaseName);
        return this;
    }

    /**
     * <p>
     * The table name of the Glue crawler.
     * </p>
     * 
     * @param glueTableName
     *        The table name of the Glue crawler.
     */

    public void setGlueTableName(String glueTableName) {
        this.glueTableName = glueTableName;
    }

    /**
     * <p>
     * The table name of the Glue crawler.
     * </p>
     * 
     * @return The table name of the Glue crawler.
     */

    public String getGlueTableName() {
        return this.glueTableName;
    }

    /**
     * <p>
     * The table name of the Glue crawler.
     * </p>
     * 
     * @param glueTableName
     *        The table name of the Glue crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLogSourceResult withGlueTableName(String glueTableName) {
        setGlueTableName(glueTableName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security Lake
     * will apply the correct access policies to this role, but you must first manually create the trust policy for this
     * role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust the
     * <code>logProviderAccountId</code> to assume the role.
     * </p>
     * 
     * @param logProviderAccessRoleArn
     *        The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security
     *        Lake will apply the correct access policies to this role, but you must first manually create the trust
     *        policy for this role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust
     *        the <code>logProviderAccountId</code> to assume the role.
     */

    public void setLogProviderAccessRoleArn(String logProviderAccessRoleArn) {
        this.logProviderAccessRoleArn = logProviderAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security Lake
     * will apply the correct access policies to this role, but you must first manually create the trust policy for this
     * role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust the
     * <code>logProviderAccountId</code> to assume the role.
     * </p>
     * 
     * @return The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security
     *         Lake will apply the correct access policies to this role, but you must first manually create the trust
     *         policy for this role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust
     *         the <code>logProviderAccountId</code> to assume the role.
     */

    public String getLogProviderAccessRoleArn() {
        return this.logProviderAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security Lake
     * will apply the correct access policies to this role, but you must first manually create the trust policy for this
     * role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust the
     * <code>logProviderAccountId</code> to assume the role.
     * </p>
     * 
     * @param logProviderAccessRoleArn
     *        The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security
     *        Lake will apply the correct access policies to this role, but you must first manually create the trust
     *        policy for this role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust
     *        the <code>logProviderAccountId</code> to assume the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomLogSourceResult withLogProviderAccessRoleArn(String logProviderAccessRoleArn) {
        setLogProviderAccessRoleArn(logProviderAccessRoleArn);
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
        if (getCustomDataLocation() != null)
            sb.append("CustomDataLocation: ").append(getCustomDataLocation()).append(",");
        if (getGlueCrawlerName() != null)
            sb.append("GlueCrawlerName: ").append(getGlueCrawlerName()).append(",");
        if (getGlueDatabaseName() != null)
            sb.append("GlueDatabaseName: ").append(getGlueDatabaseName()).append(",");
        if (getGlueTableName() != null)
            sb.append("GlueTableName: ").append(getGlueTableName()).append(",");
        if (getLogProviderAccessRoleArn() != null)
            sb.append("LogProviderAccessRoleArn: ").append(getLogProviderAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomLogSourceResult == false)
            return false;
        CreateCustomLogSourceResult other = (CreateCustomLogSourceResult) obj;
        if (other.getCustomDataLocation() == null ^ this.getCustomDataLocation() == null)
            return false;
        if (other.getCustomDataLocation() != null && other.getCustomDataLocation().equals(this.getCustomDataLocation()) == false)
            return false;
        if (other.getGlueCrawlerName() == null ^ this.getGlueCrawlerName() == null)
            return false;
        if (other.getGlueCrawlerName() != null && other.getGlueCrawlerName().equals(this.getGlueCrawlerName()) == false)
            return false;
        if (other.getGlueDatabaseName() == null ^ this.getGlueDatabaseName() == null)
            return false;
        if (other.getGlueDatabaseName() != null && other.getGlueDatabaseName().equals(this.getGlueDatabaseName()) == false)
            return false;
        if (other.getGlueTableName() == null ^ this.getGlueTableName() == null)
            return false;
        if (other.getGlueTableName() != null && other.getGlueTableName().equals(this.getGlueTableName()) == false)
            return false;
        if (other.getLogProviderAccessRoleArn() == null ^ this.getLogProviderAccessRoleArn() == null)
            return false;
        if (other.getLogProviderAccessRoleArn() != null && other.getLogProviderAccessRoleArn().equals(this.getLogProviderAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDataLocation() == null) ? 0 : getCustomDataLocation().hashCode());
        hashCode = prime * hashCode + ((getGlueCrawlerName() == null) ? 0 : getGlueCrawlerName().hashCode());
        hashCode = prime * hashCode + ((getGlueDatabaseName() == null) ? 0 : getGlueDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getGlueTableName() == null) ? 0 : getGlueTableName().hashCode());
        hashCode = prime * hashCode + ((getLogProviderAccessRoleArn() == null) ? 0 : getLogProviderAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomLogSourceResult clone() {
        try {
            return (CreateCustomLogSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
