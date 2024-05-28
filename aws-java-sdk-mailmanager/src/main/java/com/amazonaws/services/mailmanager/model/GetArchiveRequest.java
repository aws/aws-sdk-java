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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to retrieve details of an email archive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArchiveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the archive to retrieve.
     * </p>
     */
    private String archiveId;

    /**
     * <p>
     * The identifier of the archive to retrieve.
     * </p>
     * 
     * @param archiveId
     *        The identifier of the archive to retrieve.
     */

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    /**
     * <p>
     * The identifier of the archive to retrieve.
     * </p>
     * 
     * @return The identifier of the archive to retrieve.
     */

    public String getArchiveId() {
        return this.archiveId;
    }

    /**
     * <p>
     * The identifier of the archive to retrieve.
     * </p>
     * 
     * @param archiveId
     *        The identifier of the archive to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveRequest withArchiveId(String archiveId) {
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

        if (obj instanceof GetArchiveRequest == false)
            return false;
        GetArchiveRequest other = (GetArchiveRequest) obj;
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
    public GetArchiveRequest clone() {
        return (GetArchiveRequest) super.clone();
    }

}
