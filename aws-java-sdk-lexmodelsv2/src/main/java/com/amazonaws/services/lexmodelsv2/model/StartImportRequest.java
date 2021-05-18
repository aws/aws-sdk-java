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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the import. It is included in the response from the operation.
     * </p>
     */
    private String importId;
    /**
     * <p>
     * Parameters for creating the bot or bot locale.
     * </p>
     */
    private ImportResourceSpecification resourceSpecification;
    /**
     * <p>
     * The strategy to use when there is a name conflict between the imported resource and an existing resource. When
     * the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the import fails.
     * </p>
     */
    private String mergeStrategy;
    /**
     * <p>
     * The password used to encrypt the zip archive that contains the bot or bot locale definition. You should always
     * encrypt the zip archive to protect it during transit between your site and Amazon Lex.
     * </p>
     */
    private String filePassword;

    /**
     * <p>
     * The unique identifier for the import. It is included in the response from the operation.
     * </p>
     * 
     * @param importId
     *        The unique identifier for the import. It is included in the response from the operation.
     */

    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * The unique identifier for the import. It is included in the response from the operation.
     * </p>
     * 
     * @return The unique identifier for the import. It is included in the response from the operation.
     */

    public String getImportId() {
        return this.importId;
    }

    /**
     * <p>
     * The unique identifier for the import. It is included in the response from the operation.
     * </p>
     * 
     * @param importId
     *        The unique identifier for the import. It is included in the response from the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withImportId(String importId) {
        setImportId(importId);
        return this;
    }

    /**
     * <p>
     * Parameters for creating the bot or bot locale.
     * </p>
     * 
     * @param resourceSpecification
     *        Parameters for creating the bot or bot locale.
     */

    public void setResourceSpecification(ImportResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    /**
     * <p>
     * Parameters for creating the bot or bot locale.
     * </p>
     * 
     * @return Parameters for creating the bot or bot locale.
     */

    public ImportResourceSpecification getResourceSpecification() {
        return this.resourceSpecification;
    }

    /**
     * <p>
     * Parameters for creating the bot or bot locale.
     * </p>
     * 
     * @param resourceSpecification
     *        Parameters for creating the bot or bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withResourceSpecification(ImportResourceSpecification resourceSpecification) {
        setResourceSpecification(resourceSpecification);
        return this;
    }

    /**
     * <p>
     * The strategy to use when there is a name conflict between the imported resource and an existing resource. When
     * the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the import fails.
     * </p>
     * 
     * @param mergeStrategy
     *        The strategy to use when there is a name conflict between the imported resource and an existing resource.
     *        When the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the
     *        import fails.
     * @see MergeStrategy
     */

    public void setMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    /**
     * <p>
     * The strategy to use when there is a name conflict between the imported resource and an existing resource. When
     * the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the import fails.
     * </p>
     * 
     * @return The strategy to use when there is a name conflict between the imported resource and an existing resource.
     *         When the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the
     *         import fails.
     * @see MergeStrategy
     */

    public String getMergeStrategy() {
        return this.mergeStrategy;
    }

    /**
     * <p>
     * The strategy to use when there is a name conflict between the imported resource and an existing resource. When
     * the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the import fails.
     * </p>
     * 
     * @param mergeStrategy
     *        The strategy to use when there is a name conflict between the imported resource and an existing resource.
     *        When the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the
     *        import fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public StartImportRequest withMergeStrategy(String mergeStrategy) {
        setMergeStrategy(mergeStrategy);
        return this;
    }

    /**
     * <p>
     * The strategy to use when there is a name conflict between the imported resource and an existing resource. When
     * the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the import fails.
     * </p>
     * 
     * @param mergeStrategy
     *        The strategy to use when there is a name conflict between the imported resource and an existing resource.
     *        When the merge strategy is <code>FailOnConflict</code> existing resources are not overwritten and the
     *        import fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public StartImportRequest withMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The password used to encrypt the zip archive that contains the bot or bot locale definition. You should always
     * encrypt the zip archive to protect it during transit between your site and Amazon Lex.
     * </p>
     * 
     * @param filePassword
     *        The password used to encrypt the zip archive that contains the bot or bot locale definition. You should
     *        always encrypt the zip archive to protect it during transit between your site and Amazon Lex.
     */

    public void setFilePassword(String filePassword) {
        this.filePassword = filePassword;
    }

    /**
     * <p>
     * The password used to encrypt the zip archive that contains the bot or bot locale definition. You should always
     * encrypt the zip archive to protect it during transit between your site and Amazon Lex.
     * </p>
     * 
     * @return The password used to encrypt the zip archive that contains the bot or bot locale definition. You should
     *         always encrypt the zip archive to protect it during transit between your site and Amazon Lex.
     */

    public String getFilePassword() {
        return this.filePassword;
    }

    /**
     * <p>
     * The password used to encrypt the zip archive that contains the bot or bot locale definition. You should always
     * encrypt the zip archive to protect it during transit between your site and Amazon Lex.
     * </p>
     * 
     * @param filePassword
     *        The password used to encrypt the zip archive that contains the bot or bot locale definition. You should
     *        always encrypt the zip archive to protect it during transit between your site and Amazon Lex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withFilePassword(String filePassword) {
        setFilePassword(filePassword);
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
        if (getImportId() != null)
            sb.append("ImportId: ").append(getImportId()).append(",");
        if (getResourceSpecification() != null)
            sb.append("ResourceSpecification: ").append(getResourceSpecification()).append(",");
        if (getMergeStrategy() != null)
            sb.append("MergeStrategy: ").append(getMergeStrategy()).append(",");
        if (getFilePassword() != null)
            sb.append("FilePassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportRequest == false)
            return false;
        StartImportRequest other = (StartImportRequest) obj;
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        if (other.getResourceSpecification() == null ^ this.getResourceSpecification() == null)
            return false;
        if (other.getResourceSpecification() != null && other.getResourceSpecification().equals(this.getResourceSpecification()) == false)
            return false;
        if (other.getMergeStrategy() == null ^ this.getMergeStrategy() == null)
            return false;
        if (other.getMergeStrategy() != null && other.getMergeStrategy().equals(this.getMergeStrategy()) == false)
            return false;
        if (other.getFilePassword() == null ^ this.getFilePassword() == null)
            return false;
        if (other.getFilePassword() != null && other.getFilePassword().equals(this.getFilePassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        hashCode = prime * hashCode + ((getResourceSpecification() == null) ? 0 : getResourceSpecification().hashCode());
        hashCode = prime * hashCode + ((getMergeStrategy() == null) ? 0 : getMergeStrategy().hashCode());
        hashCode = prime * hashCode + ((getFilePassword() == null) ? 0 : getFilePassword().hashCode());
        return hashCode;
    }

    @Override
    public StartImportRequest clone() {
        return (StartImportRequest) super.clone();
    }

}
