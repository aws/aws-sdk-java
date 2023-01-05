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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the detections for each page analyzed through the Analyze Lending API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/LendingResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LendingResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The page number for a page, with regard to whole submission.
     * </p>
     */
    private Integer page;
    /**
     * <p>
     * The classifier result for a given page.
     * </p>
     */
    private PageClassification pageClassification;
    /**
     * <p>
     * An array of Extraction to hold structured data. e.g. normalized key value pairs instead of raw OCR detections .
     * </p>
     */
    private java.util.List<Extraction> extractions;

    /**
     * <p>
     * The page number for a page, with regard to whole submission.
     * </p>
     * 
     * @param page
     *        The page number for a page, with regard to whole submission.
     */

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * The page number for a page, with regard to whole submission.
     * </p>
     * 
     * @return The page number for a page, with regard to whole submission.
     */

    public Integer getPage() {
        return this.page;
    }

    /**
     * <p>
     * The page number for a page, with regard to whole submission.
     * </p>
     * 
     * @param page
     *        The page number for a page, with regard to whole submission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingResult withPage(Integer page) {
        setPage(page);
        return this;
    }

    /**
     * <p>
     * The classifier result for a given page.
     * </p>
     * 
     * @param pageClassification
     *        The classifier result for a given page.
     */

    public void setPageClassification(PageClassification pageClassification) {
        this.pageClassification = pageClassification;
    }

    /**
     * <p>
     * The classifier result for a given page.
     * </p>
     * 
     * @return The classifier result for a given page.
     */

    public PageClassification getPageClassification() {
        return this.pageClassification;
    }

    /**
     * <p>
     * The classifier result for a given page.
     * </p>
     * 
     * @param pageClassification
     *        The classifier result for a given page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingResult withPageClassification(PageClassification pageClassification) {
        setPageClassification(pageClassification);
        return this;
    }

    /**
     * <p>
     * An array of Extraction to hold structured data. e.g. normalized key value pairs instead of raw OCR detections .
     * </p>
     * 
     * @return An array of Extraction to hold structured data. e.g. normalized key value pairs instead of raw OCR
     *         detections .
     */

    public java.util.List<Extraction> getExtractions() {
        return extractions;
    }

    /**
     * <p>
     * An array of Extraction to hold structured data. e.g. normalized key value pairs instead of raw OCR detections .
     * </p>
     * 
     * @param extractions
     *        An array of Extraction to hold structured data. e.g. normalized key value pairs instead of raw OCR
     *        detections .
     */

    public void setExtractions(java.util.Collection<Extraction> extractions) {
        if (extractions == null) {
            this.extractions = null;
            return;
        }

        this.extractions = new java.util.ArrayList<Extraction>(extractions);
    }

    /**
     * <p>
     * An array of Extraction to hold structured data. e.g. normalized key value pairs instead of raw OCR detections .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtractions(java.util.Collection)} or {@link #withExtractions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param extractions
     *        An array of Extraction to hold structured data. e.g. normalized key value pairs instead of raw OCR
     *        detections .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingResult withExtractions(Extraction... extractions) {
        if (this.extractions == null) {
            setExtractions(new java.util.ArrayList<Extraction>(extractions.length));
        }
        for (Extraction ele : extractions) {
            this.extractions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Extraction to hold structured data. e.g. normalized key value pairs instead of raw OCR detections .
     * </p>
     * 
     * @param extractions
     *        An array of Extraction to hold structured data. e.g. normalized key value pairs instead of raw OCR
     *        detections .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingResult withExtractions(java.util.Collection<Extraction> extractions) {
        setExtractions(extractions);
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
        if (getPage() != null)
            sb.append("Page: ").append(getPage()).append(",");
        if (getPageClassification() != null)
            sb.append("PageClassification: ").append(getPageClassification()).append(",");
        if (getExtractions() != null)
            sb.append("Extractions: ").append(getExtractions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LendingResult == false)
            return false;
        LendingResult other = (LendingResult) obj;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getPageClassification() == null ^ this.getPageClassification() == null)
            return false;
        if (other.getPageClassification() != null && other.getPageClassification().equals(this.getPageClassification()) == false)
            return false;
        if (other.getExtractions() == null ^ this.getExtractions() == null)
            return false;
        if (other.getExtractions() != null && other.getExtractions().equals(this.getExtractions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getPageClassification() == null) ? 0 : getPageClassification().hashCode());
        hashCode = prime * hashCode + ((getExtractions() == null) ? 0 : getExtractions().hashCode());
        return hashCode;
    }

    @Override
    public LendingResult clone() {
        try {
            return (LendingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.LendingResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
