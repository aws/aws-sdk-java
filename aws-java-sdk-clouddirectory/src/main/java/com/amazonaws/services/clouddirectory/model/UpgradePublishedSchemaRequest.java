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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpgradePublishedSchema"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradePublishedSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the development schema with the changes used for the upgrade.
     * </p>
     */
    private String developmentSchemaArn;
    /**
     * <p>
     * The ARN of the published schema to be upgraded.
     * </p>
     */
    private String publishedSchemaArn;
    /**
     * <p>
     * Identifies the minor version of the published schema that will be created. This parameter is NOT optional.
     * </p>
     */
    private String minorVersion;
    /**
     * <p>
     * Used for testing whether the Development schema provided is backwards compatible, or not, with the publish schema
     * provided by the user to be upgraded. If schema compatibility fails, an exception would be thrown else the call
     * would succeed. This parameter is optional and defaults to false.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ARN of the development schema with the changes used for the upgrade.
     * </p>
     * 
     * @param developmentSchemaArn
     *        The ARN of the development schema with the changes used for the upgrade.
     */

    public void setDevelopmentSchemaArn(String developmentSchemaArn) {
        this.developmentSchemaArn = developmentSchemaArn;
    }

    /**
     * <p>
     * The ARN of the development schema with the changes used for the upgrade.
     * </p>
     * 
     * @return The ARN of the development schema with the changes used for the upgrade.
     */

    public String getDevelopmentSchemaArn() {
        return this.developmentSchemaArn;
    }

    /**
     * <p>
     * The ARN of the development schema with the changes used for the upgrade.
     * </p>
     * 
     * @param developmentSchemaArn
     *        The ARN of the development schema with the changes used for the upgrade.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradePublishedSchemaRequest withDevelopmentSchemaArn(String developmentSchemaArn) {
        setDevelopmentSchemaArn(developmentSchemaArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the published schema to be upgraded.
     * </p>
     * 
     * @param publishedSchemaArn
     *        The ARN of the published schema to be upgraded.
     */

    public void setPublishedSchemaArn(String publishedSchemaArn) {
        this.publishedSchemaArn = publishedSchemaArn;
    }

    /**
     * <p>
     * The ARN of the published schema to be upgraded.
     * </p>
     * 
     * @return The ARN of the published schema to be upgraded.
     */

    public String getPublishedSchemaArn() {
        return this.publishedSchemaArn;
    }

    /**
     * <p>
     * The ARN of the published schema to be upgraded.
     * </p>
     * 
     * @param publishedSchemaArn
     *        The ARN of the published schema to be upgraded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradePublishedSchemaRequest withPublishedSchemaArn(String publishedSchemaArn) {
        setPublishedSchemaArn(publishedSchemaArn);
        return this;
    }

    /**
     * <p>
     * Identifies the minor version of the published schema that will be created. This parameter is NOT optional.
     * </p>
     * 
     * @param minorVersion
     *        Identifies the minor version of the published schema that will be created. This parameter is NOT optional.
     */

    public void setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
    }

    /**
     * <p>
     * Identifies the minor version of the published schema that will be created. This parameter is NOT optional.
     * </p>
     * 
     * @return Identifies the minor version of the published schema that will be created. This parameter is NOT
     *         optional.
     */

    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * <p>
     * Identifies the minor version of the published schema that will be created. This parameter is NOT optional.
     * </p>
     * 
     * @param minorVersion
     *        Identifies the minor version of the published schema that will be created. This parameter is NOT optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradePublishedSchemaRequest withMinorVersion(String minorVersion) {
        setMinorVersion(minorVersion);
        return this;
    }

    /**
     * <p>
     * Used for testing whether the Development schema provided is backwards compatible, or not, with the publish schema
     * provided by the user to be upgraded. If schema compatibility fails, an exception would be thrown else the call
     * would succeed. This parameter is optional and defaults to false.
     * </p>
     * 
     * @param dryRun
     *        Used for testing whether the Development schema provided is backwards compatible, or not, with the publish
     *        schema provided by the user to be upgraded. If schema compatibility fails, an exception would be thrown
     *        else the call would succeed. This parameter is optional and defaults to false.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Used for testing whether the Development schema provided is backwards compatible, or not, with the publish schema
     * provided by the user to be upgraded. If schema compatibility fails, an exception would be thrown else the call
     * would succeed. This parameter is optional and defaults to false.
     * </p>
     * 
     * @return Used for testing whether the Development schema provided is backwards compatible, or not, with the
     *         publish schema provided by the user to be upgraded. If schema compatibility fails, an exception would be
     *         thrown else the call would succeed. This parameter is optional and defaults to false.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Used for testing whether the Development schema provided is backwards compatible, or not, with the publish schema
     * provided by the user to be upgraded. If schema compatibility fails, an exception would be thrown else the call
     * would succeed. This parameter is optional and defaults to false.
     * </p>
     * 
     * @param dryRun
     *        Used for testing whether the Development schema provided is backwards compatible, or not, with the publish
     *        schema provided by the user to be upgraded. If schema compatibility fails, an exception would be thrown
     *        else the call would succeed. This parameter is optional and defaults to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradePublishedSchemaRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Used for testing whether the Development schema provided is backwards compatible, or not, with the publish schema
     * provided by the user to be upgraded. If schema compatibility fails, an exception would be thrown else the call
     * would succeed. This parameter is optional and defaults to false.
     * </p>
     * 
     * @return Used for testing whether the Development schema provided is backwards compatible, or not, with the
     *         publish schema provided by the user to be upgraded. If schema compatibility fails, an exception would be
     *         thrown else the call would succeed. This parameter is optional and defaults to false.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getDevelopmentSchemaArn() != null)
            sb.append("DevelopmentSchemaArn: ").append(getDevelopmentSchemaArn()).append(",");
        if (getPublishedSchemaArn() != null)
            sb.append("PublishedSchemaArn: ").append(getPublishedSchemaArn()).append(",");
        if (getMinorVersion() != null)
            sb.append("MinorVersion: ").append(getMinorVersion()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradePublishedSchemaRequest == false)
            return false;
        UpgradePublishedSchemaRequest other = (UpgradePublishedSchemaRequest) obj;
        if (other.getDevelopmentSchemaArn() == null ^ this.getDevelopmentSchemaArn() == null)
            return false;
        if (other.getDevelopmentSchemaArn() != null && other.getDevelopmentSchemaArn().equals(this.getDevelopmentSchemaArn()) == false)
            return false;
        if (other.getPublishedSchemaArn() == null ^ this.getPublishedSchemaArn() == null)
            return false;
        if (other.getPublishedSchemaArn() != null && other.getPublishedSchemaArn().equals(this.getPublishedSchemaArn()) == false)
            return false;
        if (other.getMinorVersion() == null ^ this.getMinorVersion() == null)
            return false;
        if (other.getMinorVersion() != null && other.getMinorVersion().equals(this.getMinorVersion()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevelopmentSchemaArn() == null) ? 0 : getDevelopmentSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getPublishedSchemaArn() == null) ? 0 : getPublishedSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getMinorVersion() == null) ? 0 : getMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public UpgradePublishedSchemaRequest clone() {
        return (UpgradePublishedSchemaRequest) super.clone();
    }

}
