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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCollectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details of the deleted collection.
     * </p>
     */
    private DeleteCollectionDetail deleteCollectionDetail;

    /**
     * <p>
     * Details of the deleted collection.
     * </p>
     * 
     * @param deleteCollectionDetail
     *        Details of the deleted collection.
     */

    public void setDeleteCollectionDetail(DeleteCollectionDetail deleteCollectionDetail) {
        this.deleteCollectionDetail = deleteCollectionDetail;
    }

    /**
     * <p>
     * Details of the deleted collection.
     * </p>
     * 
     * @return Details of the deleted collection.
     */

    public DeleteCollectionDetail getDeleteCollectionDetail() {
        return this.deleteCollectionDetail;
    }

    /**
     * <p>
     * Details of the deleted collection.
     * </p>
     * 
     * @param deleteCollectionDetail
     *        Details of the deleted collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCollectionResult withDeleteCollectionDetail(DeleteCollectionDetail deleteCollectionDetail) {
        setDeleteCollectionDetail(deleteCollectionDetail);
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
        if (getDeleteCollectionDetail() != null)
            sb.append("DeleteCollectionDetail: ").append(getDeleteCollectionDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCollectionResult == false)
            return false;
        DeleteCollectionResult other = (DeleteCollectionResult) obj;
        if (other.getDeleteCollectionDetail() == null ^ this.getDeleteCollectionDetail() == null)
            return false;
        if (other.getDeleteCollectionDetail() != null && other.getDeleteCollectionDetail().equals(this.getDeleteCollectionDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleteCollectionDetail() == null) ? 0 : getDeleteCollectionDetail().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCollectionResult clone() {
        try {
            return (DeleteCollectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
