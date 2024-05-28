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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response from creating a new email archive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateArchive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateArchiveResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the newly created archive.
     * </p>
     */
    private String archiveId;

    /**
     * <p>
     * The unique identifier for the newly created archive.
     * </p>
     * 
     * @param archiveId
     *        The unique identifier for the newly created archive.
     */

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    /**
     * <p>
     * The unique identifier for the newly created archive.
     * </p>
     * 
     * @return The unique identifier for the newly created archive.
     */

    public String getArchiveId() {
        return this.archiveId;
    }

    /**
     * <p>
     * The unique identifier for the newly created archive.
     * </p>
     * 
     * @param archiveId
     *        The unique identifier for the newly created archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveResult withArchiveId(String archiveId) {
        setArchiveId(archiveId);
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
        if (getArchiveId() != null)
            sb.append("ArchiveId: ").append(getArchiveId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateArchiveResult == false)
            return false;
        CreateArchiveResult other = (CreateArchiveResult) obj;
        if (other.getArchiveId() == null ^ this.getArchiveId() == null)
            return false;
        if (other.getArchiveId() != null && other.getArchiveId().equals(this.getArchiveId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveId() == null) ? 0 : getArchiveId().hashCode());
        return hashCode;
    }

    @Override
    public CreateArchiveResult clone() {
        try {
            return (CreateArchiveResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
