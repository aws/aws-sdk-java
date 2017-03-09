/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteFolderContents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFolderContentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the folder.
     * </p>
     */
    private String folderId;

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @param folderId
     *        The ID of the folder.
     */

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @return The ID of the folder.
     */

    public String getFolderId() {
        return this.folderId;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @param folderId
     *        The ID of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFolderContentsRequest withFolderId(String folderId) {
        setFolderId(folderId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFolderId() != null)
            sb.append("FolderId: ").append(getFolderId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFolderContentsRequest == false)
            return false;
        DeleteFolderContentsRequest other = (DeleteFolderContentsRequest) obj;
        if (other.getFolderId() == null ^ this.getFolderId() == null)
            return false;
        if (other.getFolderId() != null && other.getFolderId().equals(this.getFolderId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFolderId() == null) ? 0 : getFolderId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFolderContentsRequest clone() {
        return (DeleteFolderContentsRequest) super.clone();
    }

}
