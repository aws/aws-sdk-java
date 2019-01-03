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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/StartSchemaExtension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSchemaExtensionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory for which the schema extension will be applied to.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * If true, creates a snapshot of the directory before applying the schema extension.
     * </p>
     */
    private Boolean createSnapshotBeforeSchemaExtension;
    /**
     * <p>
     * The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would be
     * formatted in an ldif file with \n. See the example request below for more details. The file size can be no larger
     * than 1MB.
     * </p>
     */
    private String ldifContent;
    /**
     * <p>
     * A description of the schema extension.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The identifier of the directory for which the schema extension will be applied to.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which the schema extension will be applied to.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which the schema extension will be applied to.
     * </p>
     * 
     * @return The identifier of the directory for which the schema extension will be applied to.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which the schema extension will be applied to.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which the schema extension will be applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSchemaExtensionRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * If true, creates a snapshot of the directory before applying the schema extension.
     * </p>
     * 
     * @param createSnapshotBeforeSchemaExtension
     *        If true, creates a snapshot of the directory before applying the schema extension.
     */

    public void setCreateSnapshotBeforeSchemaExtension(Boolean createSnapshotBeforeSchemaExtension) {
        this.createSnapshotBeforeSchemaExtension = createSnapshotBeforeSchemaExtension;
    }

    /**
     * <p>
     * If true, creates a snapshot of the directory before applying the schema extension.
     * </p>
     * 
     * @return If true, creates a snapshot of the directory before applying the schema extension.
     */

    public Boolean getCreateSnapshotBeforeSchemaExtension() {
        return this.createSnapshotBeforeSchemaExtension;
    }

    /**
     * <p>
     * If true, creates a snapshot of the directory before applying the schema extension.
     * </p>
     * 
     * @param createSnapshotBeforeSchemaExtension
     *        If true, creates a snapshot of the directory before applying the schema extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSchemaExtensionRequest withCreateSnapshotBeforeSchemaExtension(Boolean createSnapshotBeforeSchemaExtension) {
        setCreateSnapshotBeforeSchemaExtension(createSnapshotBeforeSchemaExtension);
        return this;
    }

    /**
     * <p>
     * If true, creates a snapshot of the directory before applying the schema extension.
     * </p>
     * 
     * @return If true, creates a snapshot of the directory before applying the schema extension.
     */

    public Boolean isCreateSnapshotBeforeSchemaExtension() {
        return this.createSnapshotBeforeSchemaExtension;
    }

    /**
     * <p>
     * The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would be
     * formatted in an ldif file with \n. See the example request below for more details. The file size can be no larger
     * than 1MB.
     * </p>
     * 
     * @param ldifContent
     *        The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would
     *        be formatted in an ldif file with \n. See the example request below for more details. The file size can be
     *        no larger than 1MB.
     */

    public void setLdifContent(String ldifContent) {
        this.ldifContent = ldifContent;
    }

    /**
     * <p>
     * The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would be
     * formatted in an ldif file with \n. See the example request below for more details. The file size can be no larger
     * than 1MB.
     * </p>
     * 
     * @return The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would
     *         be formatted in an ldif file with \n. See the example request below for more details. The file size can
     *         be no larger than 1MB.
     */

    public String getLdifContent() {
        return this.ldifContent;
    }

    /**
     * <p>
     * The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would be
     * formatted in an ldif file with \n. See the example request below for more details. The file size can be no larger
     * than 1MB.
     * </p>
     * 
     * @param ldifContent
     *        The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would
     *        be formatted in an ldif file with \n. See the example request below for more details. The file size can be
     *        no larger than 1MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSchemaExtensionRequest withLdifContent(String ldifContent) {
        setLdifContent(ldifContent);
        return this;
    }

    /**
     * <p>
     * A description of the schema extension.
     * </p>
     * 
     * @param description
     *        A description of the schema extension.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the schema extension.
     * </p>
     * 
     * @return A description of the schema extension.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the schema extension.
     * </p>
     * 
     * @param description
     *        A description of the schema extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSchemaExtensionRequest withDescription(String description) {
        setDescription(description);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getCreateSnapshotBeforeSchemaExtension() != null)
            sb.append("CreateSnapshotBeforeSchemaExtension: ").append(getCreateSnapshotBeforeSchemaExtension()).append(",");
        if (getLdifContent() != null)
            sb.append("LdifContent: ").append(getLdifContent()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSchemaExtensionRequest == false)
            return false;
        StartSchemaExtensionRequest other = (StartSchemaExtensionRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getCreateSnapshotBeforeSchemaExtension() == null ^ this.getCreateSnapshotBeforeSchemaExtension() == null)
            return false;
        if (other.getCreateSnapshotBeforeSchemaExtension() != null
                && other.getCreateSnapshotBeforeSchemaExtension().equals(this.getCreateSnapshotBeforeSchemaExtension()) == false)
            return false;
        if (other.getLdifContent() == null ^ this.getLdifContent() == null)
            return false;
        if (other.getLdifContent() != null && other.getLdifContent().equals(this.getLdifContent()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getCreateSnapshotBeforeSchemaExtension() == null) ? 0 : getCreateSnapshotBeforeSchemaExtension().hashCode());
        hashCode = prime * hashCode + ((getLdifContent() == null) ? 0 : getLdifContent().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public StartSchemaExtensionRequest clone() {
        return (StartSchemaExtensionRequest) super.clone();
    }

}
