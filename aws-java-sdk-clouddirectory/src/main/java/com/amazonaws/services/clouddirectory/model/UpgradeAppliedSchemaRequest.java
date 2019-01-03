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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpgradeAppliedSchema"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradeAppliedSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The revision of the published schema to upgrade the directory to.
     * </p>
     */
    private String publishedSchemaArn;
    /**
     * <p>
     * The ARN for the directory to which the upgraded schema will be applied.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * Used for testing whether the major version schemas are backward compatible or not. If schema compatibility fails,
     * an exception would be thrown else the call would succeed but no changes will be saved. This parameter is
     * optional.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The revision of the published schema to upgrade the directory to.
     * </p>
     * 
     * @param publishedSchemaArn
     *        The revision of the published schema to upgrade the directory to.
     */

    public void setPublishedSchemaArn(String publishedSchemaArn) {
        this.publishedSchemaArn = publishedSchemaArn;
    }

    /**
     * <p>
     * The revision of the published schema to upgrade the directory to.
     * </p>
     * 
     * @return The revision of the published schema to upgrade the directory to.
     */

    public String getPublishedSchemaArn() {
        return this.publishedSchemaArn;
    }

    /**
     * <p>
     * The revision of the published schema to upgrade the directory to.
     * </p>
     * 
     * @param publishedSchemaArn
     *        The revision of the published schema to upgrade the directory to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeAppliedSchemaRequest withPublishedSchemaArn(String publishedSchemaArn) {
        setPublishedSchemaArn(publishedSchemaArn);
        return this;
    }

    /**
     * <p>
     * The ARN for the directory to which the upgraded schema will be applied.
     * </p>
     * 
     * @param directoryArn
     *        The ARN for the directory to which the upgraded schema will be applied.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The ARN for the directory to which the upgraded schema will be applied.
     * </p>
     * 
     * @return The ARN for the directory to which the upgraded schema will be applied.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The ARN for the directory to which the upgraded schema will be applied.
     * </p>
     * 
     * @param directoryArn
     *        The ARN for the directory to which the upgraded schema will be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeAppliedSchemaRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * Used for testing whether the major version schemas are backward compatible or not. If schema compatibility fails,
     * an exception would be thrown else the call would succeed but no changes will be saved. This parameter is
     * optional.
     * </p>
     * 
     * @param dryRun
     *        Used for testing whether the major version schemas are backward compatible or not. If schema compatibility
     *        fails, an exception would be thrown else the call would succeed but no changes will be saved. This
     *        parameter is optional.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Used for testing whether the major version schemas are backward compatible or not. If schema compatibility fails,
     * an exception would be thrown else the call would succeed but no changes will be saved. This parameter is
     * optional.
     * </p>
     * 
     * @return Used for testing whether the major version schemas are backward compatible or not. If schema
     *         compatibility fails, an exception would be thrown else the call would succeed but no changes will be
     *         saved. This parameter is optional.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Used for testing whether the major version schemas are backward compatible or not. If schema compatibility fails,
     * an exception would be thrown else the call would succeed but no changes will be saved. This parameter is
     * optional.
     * </p>
     * 
     * @param dryRun
     *        Used for testing whether the major version schemas are backward compatible or not. If schema compatibility
     *        fails, an exception would be thrown else the call would succeed but no changes will be saved. This
     *        parameter is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeAppliedSchemaRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Used for testing whether the major version schemas are backward compatible or not. If schema compatibility fails,
     * an exception would be thrown else the call would succeed but no changes will be saved. This parameter is
     * optional.
     * </p>
     * 
     * @return Used for testing whether the major version schemas are backward compatible or not. If schema
     *         compatibility fails, an exception would be thrown else the call would succeed but no changes will be
     *         saved. This parameter is optional.
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
        if (getPublishedSchemaArn() != null)
            sb.append("PublishedSchemaArn: ").append(getPublishedSchemaArn()).append(",");
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
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

        if (obj instanceof UpgradeAppliedSchemaRequest == false)
            return false;
        UpgradeAppliedSchemaRequest other = (UpgradeAppliedSchemaRequest) obj;
        if (other.getPublishedSchemaArn() == null ^ this.getPublishedSchemaArn() == null)
            return false;
        if (other.getPublishedSchemaArn() != null && other.getPublishedSchemaArn().equals(this.getPublishedSchemaArn()) == false)
            return false;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
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

        hashCode = prime * hashCode + ((getPublishedSchemaArn() == null) ? 0 : getPublishedSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public UpgradeAppliedSchemaRequest clone() {
        return (UpgradeAppliedSchemaRequest) super.clone();
    }

}
