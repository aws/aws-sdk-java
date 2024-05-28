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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about a collapsed group of search results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CollapsedResultDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollapsedResultDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the document attribute that results are collapsed on.
     * </p>
     */
    private DocumentAttribute documentAttribute;
    /**
     * <p>
     * A list of results in the collapsed group.
     * </p>
     */
    private java.util.List<ExpandedResultItem> expandedResults;

    /**
     * <p>
     * The value of the document attribute that results are collapsed on.
     * </p>
     * 
     * @param documentAttribute
     *        The value of the document attribute that results are collapsed on.
     */

    public void setDocumentAttribute(DocumentAttribute documentAttribute) {
        this.documentAttribute = documentAttribute;
    }

    /**
     * <p>
     * The value of the document attribute that results are collapsed on.
     * </p>
     * 
     * @return The value of the document attribute that results are collapsed on.
     */

    public DocumentAttribute getDocumentAttribute() {
        return this.documentAttribute;
    }

    /**
     * <p>
     * The value of the document attribute that results are collapsed on.
     * </p>
     * 
     * @param documentAttribute
     *        The value of the document attribute that results are collapsed on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollapsedResultDetail withDocumentAttribute(DocumentAttribute documentAttribute) {
        setDocumentAttribute(documentAttribute);
        return this;
    }

    /**
     * <p>
     * A list of results in the collapsed group.
     * </p>
     * 
     * @return A list of results in the collapsed group.
     */

    public java.util.List<ExpandedResultItem> getExpandedResults() {
        return expandedResults;
    }

    /**
     * <p>
     * A list of results in the collapsed group.
     * </p>
     * 
     * @param expandedResults
     *        A list of results in the collapsed group.
     */

    public void setExpandedResults(java.util.Collection<ExpandedResultItem> expandedResults) {
        if (expandedResults == null) {
            this.expandedResults = null;
            return;
        }

        this.expandedResults = new java.util.ArrayList<ExpandedResultItem>(expandedResults);
    }

    /**
     * <p>
     * A list of results in the collapsed group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpandedResults(java.util.Collection)} or {@link #withExpandedResults(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param expandedResults
     *        A list of results in the collapsed group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollapsedResultDetail withExpandedResults(ExpandedResultItem... expandedResults) {
        if (this.expandedResults == null) {
            setExpandedResults(new java.util.ArrayList<ExpandedResultItem>(expandedResults.length));
        }
        for (ExpandedResultItem ele : expandedResults) {
            this.expandedResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of results in the collapsed group.
     * </p>
     * 
     * @param expandedResults
     *        A list of results in the collapsed group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollapsedResultDetail withExpandedResults(java.util.Collection<ExpandedResultItem> expandedResults) {
        setExpandedResults(expandedResults);
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
        if (getDocumentAttribute() != null)
            sb.append("DocumentAttribute: ").append(getDocumentAttribute()).append(",");
        if (getExpandedResults() != null)
            sb.append("ExpandedResults: ").append(getExpandedResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollapsedResultDetail == false)
            return false;
        CollapsedResultDetail other = (CollapsedResultDetail) obj;
        if (other.getDocumentAttribute() == null ^ this.getDocumentAttribute() == null)
            return false;
        if (other.getDocumentAttribute() != null && other.getDocumentAttribute().equals(this.getDocumentAttribute()) == false)
            return false;
        if (other.getExpandedResults() == null ^ this.getExpandedResults() == null)
            return false;
        if (other.getExpandedResults() != null && other.getExpandedResults().equals(this.getExpandedResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentAttribute() == null) ? 0 : getDocumentAttribute().hashCode());
        hashCode = prime * hashCode + ((getExpandedResults() == null) ? 0 : getExpandedResults().hashCode());
        return hashCode;
    }

    @Override
    public CollapsedResultDetail clone() {
        try {
            return (CollapsedResultDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.CollapsedResultDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
