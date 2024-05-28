/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateKeyValueStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeyValueStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the key value store. The minimum length is 1 character and the maximum length is 64 characters.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The comment of the key value store.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The S3 bucket that provides the source for the import. The source must be in a valid JSON format.
     * </p>
     */
    private ImportSource importSource;

    /**
     * <p>
     * The name of the key value store. The minimum length is 1 character and the maximum length is 64 characters.
     * </p>
     * 
     * @param name
     *        The name of the key value store. The minimum length is 1 character and the maximum length is 64
     *        characters.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the key value store. The minimum length is 1 character and the maximum length is 64 characters.
     * </p>
     * 
     * @return The name of the key value store. The minimum length is 1 character and the maximum length is 64
     *         characters.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the key value store. The minimum length is 1 character and the maximum length is 64 characters.
     * </p>
     * 
     * @param name
     *        The name of the key value store. The minimum length is 1 character and the maximum length is 64
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyValueStoreRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The comment of the key value store.
     * </p>
     * 
     * @param comment
     *        The comment of the key value store.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment of the key value store.
     * </p>
     * 
     * @return The comment of the key value store.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The comment of the key value store.
     * </p>
     * 
     * @param comment
     *        The comment of the key value store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyValueStoreRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The S3 bucket that provides the source for the import. The source must be in a valid JSON format.
     * </p>
     * 
     * @param importSource
     *        The S3 bucket that provides the source for the import. The source must be in a valid JSON format.
     */

    public void setImportSource(ImportSource importSource) {
        this.importSource = importSource;
    }

    /**
     * <p>
     * The S3 bucket that provides the source for the import. The source must be in a valid JSON format.
     * </p>
     * 
     * @return The S3 bucket that provides the source for the import. The source must be in a valid JSON format.
     */

    public ImportSource getImportSource() {
        return this.importSource;
    }

    /**
     * <p>
     * The S3 bucket that provides the source for the import. The source must be in a valid JSON format.
     * </p>
     * 
     * @param importSource
     *        The S3 bucket that provides the source for the import. The source must be in a valid JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyValueStoreRequest withImportSource(ImportSource importSource) {
        setImportSource(importSource);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getImportSource() != null)
            sb.append("ImportSource: ").append(getImportSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyValueStoreRequest == false)
            return false;
        CreateKeyValueStoreRequest other = (CreateKeyValueStoreRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getImportSource() == null ^ this.getImportSource() == null)
            return false;
        if (other.getImportSource() != null && other.getImportSource().equals(this.getImportSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getImportSource() == null) ? 0 : getImportSource().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeyValueStoreRequest clone() {
        return (CreateKeyValueStoreRequest) super.clone();
    }

}
