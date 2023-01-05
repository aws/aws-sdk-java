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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeID" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyzeIDRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The document being passed to AnalyzeID.
     * </p>
     */
    private java.util.List<Document> documentPages;

    /**
     * <p>
     * The document being passed to AnalyzeID.
     * </p>
     * 
     * @return The document being passed to AnalyzeID.
     */

    public java.util.List<Document> getDocumentPages() {
        return documentPages;
    }

    /**
     * <p>
     * The document being passed to AnalyzeID.
     * </p>
     * 
     * @param documentPages
     *        The document being passed to AnalyzeID.
     */

    public void setDocumentPages(java.util.Collection<Document> documentPages) {
        if (documentPages == null) {
            this.documentPages = null;
            return;
        }

        this.documentPages = new java.util.ArrayList<Document>(documentPages);
    }

    /**
     * <p>
     * The document being passed to AnalyzeID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentPages(java.util.Collection)} or {@link #withDocumentPages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param documentPages
     *        The document being passed to AnalyzeID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeIDRequest withDocumentPages(Document... documentPages) {
        if (this.documentPages == null) {
            setDocumentPages(new java.util.ArrayList<Document>(documentPages.length));
        }
        for (Document ele : documentPages) {
            this.documentPages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The document being passed to AnalyzeID.
     * </p>
     * 
     * @param documentPages
     *        The document being passed to AnalyzeID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeIDRequest withDocumentPages(java.util.Collection<Document> documentPages) {
        setDocumentPages(documentPages);
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
        if (getDocumentPages() != null)
            sb.append("DocumentPages: ").append(getDocumentPages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzeIDRequest == false)
            return false;
        AnalyzeIDRequest other = (AnalyzeIDRequest) obj;
        if (other.getDocumentPages() == null ^ this.getDocumentPages() == null)
            return false;
        if (other.getDocumentPages() != null && other.getDocumentPages().equals(this.getDocumentPages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentPages() == null) ? 0 : getDocumentPages().hashCode());
        return hashCode;
    }

    @Override
    public AnalyzeIDRequest clone() {
        return (AnalyzeIDRequest) super.clone();
    }

}
