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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeDocumentVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDocumentVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The document versions.
     * </p>
     */
    private java.util.List<DocumentVersionMetadata> documentVersions;
    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The document versions.
     * </p>
     * 
     * @return The document versions.
     */

    public java.util.List<DocumentVersionMetadata> getDocumentVersions() {
        return documentVersions;
    }

    /**
     * <p>
     * The document versions.
     * </p>
     * 
     * @param documentVersions
     *        The document versions.
     */

    public void setDocumentVersions(java.util.Collection<DocumentVersionMetadata> documentVersions) {
        if (documentVersions == null) {
            this.documentVersions = null;
            return;
        }

        this.documentVersions = new java.util.ArrayList<DocumentVersionMetadata>(documentVersions);
    }

    /**
     * <p>
     * The document versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentVersions(java.util.Collection)} or {@link #withDocumentVersions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param documentVersions
     *        The document versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDocumentVersionsResult withDocumentVersions(DocumentVersionMetadata... documentVersions) {
        if (this.documentVersions == null) {
            setDocumentVersions(new java.util.ArrayList<DocumentVersionMetadata>(documentVersions.length));
        }
        for (DocumentVersionMetadata ele : documentVersions) {
            this.documentVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The document versions.
     * </p>
     * 
     * @param documentVersions
     *        The document versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDocumentVersionsResult withDocumentVersions(java.util.Collection<DocumentVersionMetadata> documentVersions) {
        setDocumentVersions(documentVersions);
        return this;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @param marker
     *        The marker to use when requesting the next set of results. If there are no additional results, the string
     *        is empty.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @return The marker to use when requesting the next set of results. If there are no additional results, the string
     *         is empty.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @param marker
     *        The marker to use when requesting the next set of results. If there are no additional results, the string
     *        is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDocumentVersionsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getDocumentVersions() != null)
            sb.append("DocumentVersions: ").append(getDocumentVersions()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDocumentVersionsResult == false)
            return false;
        DescribeDocumentVersionsResult other = (DescribeDocumentVersionsResult) obj;
        if (other.getDocumentVersions() == null ^ this.getDocumentVersions() == null)
            return false;
        if (other.getDocumentVersions() != null && other.getDocumentVersions().equals(this.getDocumentVersions()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentVersions() == null) ? 0 : getDocumentVersions().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDocumentVersionsResult clone() {
        try {
            return (DescribeDocumentVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
