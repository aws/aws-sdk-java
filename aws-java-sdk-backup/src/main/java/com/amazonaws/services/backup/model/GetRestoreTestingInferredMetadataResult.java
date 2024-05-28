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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetRestoreTestingInferredMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRestoreTestingInferredMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * This is a string map of the metadata inferred from the request.
     * </p>
     */
    private java.util.Map<String, String> inferredMetadata;

    /**
     * <p>
     * This is a string map of the metadata inferred from the request.
     * </p>
     * 
     * @return This is a string map of the metadata inferred from the request.
     */

    public java.util.Map<String, String> getInferredMetadata() {
        return inferredMetadata;
    }

    /**
     * <p>
     * This is a string map of the metadata inferred from the request.
     * </p>
     * 
     * @param inferredMetadata
     *        This is a string map of the metadata inferred from the request.
     */

    public void setInferredMetadata(java.util.Map<String, String> inferredMetadata) {
        this.inferredMetadata = inferredMetadata;
    }

    /**
     * <p>
     * This is a string map of the metadata inferred from the request.
     * </p>
     * 
     * @param inferredMetadata
     *        This is a string map of the metadata inferred from the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRestoreTestingInferredMetadataResult withInferredMetadata(java.util.Map<String, String> inferredMetadata) {
        setInferredMetadata(inferredMetadata);
        return this;
    }

    /**
     * Add a single InferredMetadata entry
     *
     * @see GetRestoreTestingInferredMetadataResult#withInferredMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetRestoreTestingInferredMetadataResult addInferredMetadataEntry(String key, String value) {
        if (null == this.inferredMetadata) {
            this.inferredMetadata = new java.util.HashMap<String, String>();
        }
        if (this.inferredMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.inferredMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InferredMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRestoreTestingInferredMetadataResult clearInferredMetadataEntries() {
        this.inferredMetadata = null;
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
        if (getInferredMetadata() != null)
            sb.append("InferredMetadata: ").append(getInferredMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRestoreTestingInferredMetadataResult == false)
            return false;
        GetRestoreTestingInferredMetadataResult other = (GetRestoreTestingInferredMetadataResult) obj;
        if (other.getInferredMetadata() == null ^ this.getInferredMetadata() == null)
            return false;
        if (other.getInferredMetadata() != null && other.getInferredMetadata().equals(this.getInferredMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferredMetadata() == null) ? 0 : getInferredMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetRestoreTestingInferredMetadataResult clone() {
        try {
            return (GetRestoreTestingInferredMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
