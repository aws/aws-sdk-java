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
 * The class assigned to a Page object detected in an input document. Contains information regarding the predicted
 * type/class of a document's page and the page number that the Page object was detected on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/PageClassification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PageClassification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The class, or document type, assigned to a detected Page object. The class, or document type, assigned to a
     * detected Page object.
     * </p>
     */
    private java.util.List<Prediction> pageType;
    /**
     * <p>
     * The page number the value was detected on, relative to Amazon Textract's starting position.
     * </p>
     */
    private java.util.List<Prediction> pageNumber;

    /**
     * <p>
     * The class, or document type, assigned to a detected Page object. The class, or document type, assigned to a
     * detected Page object.
     * </p>
     * 
     * @return The class, or document type, assigned to a detected Page object. The class, or document type, assigned to
     *         a detected Page object.
     */

    public java.util.List<Prediction> getPageType() {
        return pageType;
    }

    /**
     * <p>
     * The class, or document type, assigned to a detected Page object. The class, or document type, assigned to a
     * detected Page object.
     * </p>
     * 
     * @param pageType
     *        The class, or document type, assigned to a detected Page object. The class, or document type, assigned to
     *        a detected Page object.
     */

    public void setPageType(java.util.Collection<Prediction> pageType) {
        if (pageType == null) {
            this.pageType = null;
            return;
        }

        this.pageType = new java.util.ArrayList<Prediction>(pageType);
    }

    /**
     * <p>
     * The class, or document type, assigned to a detected Page object. The class, or document type, assigned to a
     * detected Page object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPageType(java.util.Collection)} or {@link #withPageType(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param pageType
     *        The class, or document type, assigned to a detected Page object. The class, or document type, assigned to
     *        a detected Page object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PageClassification withPageType(Prediction... pageType) {
        if (this.pageType == null) {
            setPageType(new java.util.ArrayList<Prediction>(pageType.length));
        }
        for (Prediction ele : pageType) {
            this.pageType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The class, or document type, assigned to a detected Page object. The class, or document type, assigned to a
     * detected Page object.
     * </p>
     * 
     * @param pageType
     *        The class, or document type, assigned to a detected Page object. The class, or document type, assigned to
     *        a detected Page object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PageClassification withPageType(java.util.Collection<Prediction> pageType) {
        setPageType(pageType);
        return this;
    }

    /**
     * <p>
     * The page number the value was detected on, relative to Amazon Textract's starting position.
     * </p>
     * 
     * @return The page number the value was detected on, relative to Amazon Textract's starting position.
     */

    public java.util.List<Prediction> getPageNumber() {
        return pageNumber;
    }

    /**
     * <p>
     * The page number the value was detected on, relative to Amazon Textract's starting position.
     * </p>
     * 
     * @param pageNumber
     *        The page number the value was detected on, relative to Amazon Textract's starting position.
     */

    public void setPageNumber(java.util.Collection<Prediction> pageNumber) {
        if (pageNumber == null) {
            this.pageNumber = null;
            return;
        }

        this.pageNumber = new java.util.ArrayList<Prediction>(pageNumber);
    }

    /**
     * <p>
     * The page number the value was detected on, relative to Amazon Textract's starting position.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPageNumber(java.util.Collection)} or {@link #withPageNumber(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pageNumber
     *        The page number the value was detected on, relative to Amazon Textract's starting position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PageClassification withPageNumber(Prediction... pageNumber) {
        if (this.pageNumber == null) {
            setPageNumber(new java.util.ArrayList<Prediction>(pageNumber.length));
        }
        for (Prediction ele : pageNumber) {
            this.pageNumber.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The page number the value was detected on, relative to Amazon Textract's starting position.
     * </p>
     * 
     * @param pageNumber
     *        The page number the value was detected on, relative to Amazon Textract's starting position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PageClassification withPageNumber(java.util.Collection<Prediction> pageNumber) {
        setPageNumber(pageNumber);
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
        if (getPageType() != null)
            sb.append("PageType: ").append(getPageType()).append(",");
        if (getPageNumber() != null)
            sb.append("PageNumber: ").append(getPageNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PageClassification == false)
            return false;
        PageClassification other = (PageClassification) obj;
        if (other.getPageType() == null ^ this.getPageType() == null)
            return false;
        if (other.getPageType() != null && other.getPageType().equals(this.getPageType()) == false)
            return false;
        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageType() == null) ? 0 : getPageType().hashCode());
        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        return hashCode;
    }

    @Override
    public PageClassification clone() {
        try {
            return (PageClassification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.PageClassificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
