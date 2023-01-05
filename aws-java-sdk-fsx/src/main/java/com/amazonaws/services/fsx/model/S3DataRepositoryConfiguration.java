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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for an Amazon S3 data repository linked to an Amazon FSx for Lustre file system with a data
 * repository association. The configuration consists of an <code>AutoImportPolicy</code> that defines which file events
 * on the data repository are automatically imported to the file system and an <code>AutoExportPolicy</code> that
 * defines which file events on the file system are automatically exported to the data repository. File events are when
 * files or directories are added, changed, or deleted on the file system or the data repository.
 * </p>
 * <note>
 * <p>
 * Data repository associations on Amazon File Cache don't use <code>S3DataRepositoryConfiguration</code> because they
 * don't support automatic import or automatic export.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/S3DataRepositoryConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DataRepositoryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the type of updated objects (new, changed, deleted) that will be automatically imported from the linked
     * S3 bucket to your file system.
     * </p>
     */
    private AutoImportPolicy autoImportPolicy;
    /**
     * <p>
     * Specifies the type of updated objects (new, changed, deleted) that will be automatically exported from your file
     * system to the linked S3 bucket.
     * </p>
     */
    private AutoExportPolicy autoExportPolicy;

    /**
     * <p>
     * Specifies the type of updated objects (new, changed, deleted) that will be automatically imported from the linked
     * S3 bucket to your file system.
     * </p>
     * 
     * @param autoImportPolicy
     *        Specifies the type of updated objects (new, changed, deleted) that will be automatically imported from the
     *        linked S3 bucket to your file system.
     */

    public void setAutoImportPolicy(AutoImportPolicy autoImportPolicy) {
        this.autoImportPolicy = autoImportPolicy;
    }

    /**
     * <p>
     * Specifies the type of updated objects (new, changed, deleted) that will be automatically imported from the linked
     * S3 bucket to your file system.
     * </p>
     * 
     * @return Specifies the type of updated objects (new, changed, deleted) that will be automatically imported from
     *         the linked S3 bucket to your file system.
     */

    public AutoImportPolicy getAutoImportPolicy() {
        return this.autoImportPolicy;
    }

    /**
     * <p>
     * Specifies the type of updated objects (new, changed, deleted) that will be automatically imported from the linked
     * S3 bucket to your file system.
     * </p>
     * 
     * @param autoImportPolicy
     *        Specifies the type of updated objects (new, changed, deleted) that will be automatically imported from the
     *        linked S3 bucket to your file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataRepositoryConfiguration withAutoImportPolicy(AutoImportPolicy autoImportPolicy) {
        setAutoImportPolicy(autoImportPolicy);
        return this;
    }

    /**
     * <p>
     * Specifies the type of updated objects (new, changed, deleted) that will be automatically exported from your file
     * system to the linked S3 bucket.
     * </p>
     * 
     * @param autoExportPolicy
     *        Specifies the type of updated objects (new, changed, deleted) that will be automatically exported from
     *        your file system to the linked S3 bucket.
     */

    public void setAutoExportPolicy(AutoExportPolicy autoExportPolicy) {
        this.autoExportPolicy = autoExportPolicy;
    }

    /**
     * <p>
     * Specifies the type of updated objects (new, changed, deleted) that will be automatically exported from your file
     * system to the linked S3 bucket.
     * </p>
     * 
     * @return Specifies the type of updated objects (new, changed, deleted) that will be automatically exported from
     *         your file system to the linked S3 bucket.
     */

    public AutoExportPolicy getAutoExportPolicy() {
        return this.autoExportPolicy;
    }

    /**
     * <p>
     * Specifies the type of updated objects (new, changed, deleted) that will be automatically exported from your file
     * system to the linked S3 bucket.
     * </p>
     * 
     * @param autoExportPolicy
     *        Specifies the type of updated objects (new, changed, deleted) that will be automatically exported from
     *        your file system to the linked S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataRepositoryConfiguration withAutoExportPolicy(AutoExportPolicy autoExportPolicy) {
        setAutoExportPolicy(autoExportPolicy);
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
        if (getAutoImportPolicy() != null)
            sb.append("AutoImportPolicy: ").append(getAutoImportPolicy()).append(",");
        if (getAutoExportPolicy() != null)
            sb.append("AutoExportPolicy: ").append(getAutoExportPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DataRepositoryConfiguration == false)
            return false;
        S3DataRepositoryConfiguration other = (S3DataRepositoryConfiguration) obj;
        if (other.getAutoImportPolicy() == null ^ this.getAutoImportPolicy() == null)
            return false;
        if (other.getAutoImportPolicy() != null && other.getAutoImportPolicy().equals(this.getAutoImportPolicy()) == false)
            return false;
        if (other.getAutoExportPolicy() == null ^ this.getAutoExportPolicy() == null)
            return false;
        if (other.getAutoExportPolicy() != null && other.getAutoExportPolicy().equals(this.getAutoExportPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoImportPolicy() == null) ? 0 : getAutoImportPolicy().hashCode());
        hashCode = prime * hashCode + ((getAutoExportPolicy() == null) ? 0 : getAutoExportPolicy().hashCode());
        return hashCode;
    }

    @Override
    public S3DataRepositoryConfiguration clone() {
        try {
            return (S3DataRepositoryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.S3DataRepositoryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
