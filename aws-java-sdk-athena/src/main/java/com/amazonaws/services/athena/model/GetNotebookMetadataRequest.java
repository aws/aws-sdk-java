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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNotebookMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNotebookMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the notebook whose metadata is to be retrieved.
     * </p>
     */
    private String notebookId;

    /**
     * <p>
     * The ID of the notebook whose metadata is to be retrieved.
     * </p>
     * 
     * @param notebookId
     *        The ID of the notebook whose metadata is to be retrieved.
     */

    public void setNotebookId(String notebookId) {
        this.notebookId = notebookId;
    }

    /**
     * <p>
     * The ID of the notebook whose metadata is to be retrieved.
     * </p>
     * 
     * @return The ID of the notebook whose metadata is to be retrieved.
     */

    public String getNotebookId() {
        return this.notebookId;
    }

    /**
     * <p>
     * The ID of the notebook whose metadata is to be retrieved.
     * </p>
     * 
     * @param notebookId
     *        The ID of the notebook whose metadata is to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNotebookMetadataRequest withNotebookId(String notebookId) {
        setNotebookId(notebookId);
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
        if (getNotebookId() != null)
            sb.append("NotebookId: ").append(getNotebookId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNotebookMetadataRequest == false)
            return false;
        GetNotebookMetadataRequest other = (GetNotebookMetadataRequest) obj;
        if (other.getNotebookId() == null ^ this.getNotebookId() == null)
            return false;
        if (other.getNotebookId() != null && other.getNotebookId().equals(this.getNotebookId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookId() == null) ? 0 : getNotebookId().hashCode());
        return hashCode;
    }

    @Override
    public GetNotebookMetadataRequest clone() {
        return (GetNotebookMetadataRequest) super.clone();
    }

}
