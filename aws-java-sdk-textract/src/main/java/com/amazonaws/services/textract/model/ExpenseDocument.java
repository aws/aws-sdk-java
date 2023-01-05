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
 * The structure holding all the information returned by AnalyzeExpense
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/ExpenseDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpenseDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Denotes which invoice or receipt in the document the information is coming from. First document will be 1, the
     * second 2, and so on.
     * </p>
     */
    private Integer expenseIndex;
    /**
     * <p>
     * Any information found outside of a table by Amazon Textract.
     * </p>
     */
    private java.util.List<ExpenseField> summaryFields;
    /**
     * <p>
     * Information detected on each table of a document, seperated into <code>LineItems</code>.
     * </p>
     */
    private java.util.List<LineItemGroup> lineItemGroups;
    /**
     * <p>
     * This is a block object, the same as reported when DetectDocumentText is run on a document. It provides word level
     * recognition of text.
     * </p>
     */
    private java.util.List<Block> blocks;

    /**
     * <p>
     * Denotes which invoice or receipt in the document the information is coming from. First document will be 1, the
     * second 2, and so on.
     * </p>
     * 
     * @param expenseIndex
     *        Denotes which invoice or receipt in the document the information is coming from. First document will be 1,
     *        the second 2, and so on.
     */

    public void setExpenseIndex(Integer expenseIndex) {
        this.expenseIndex = expenseIndex;
    }

    /**
     * <p>
     * Denotes which invoice or receipt in the document the information is coming from. First document will be 1, the
     * second 2, and so on.
     * </p>
     * 
     * @return Denotes which invoice or receipt in the document the information is coming from. First document will be
     *         1, the second 2, and so on.
     */

    public Integer getExpenseIndex() {
        return this.expenseIndex;
    }

    /**
     * <p>
     * Denotes which invoice or receipt in the document the information is coming from. First document will be 1, the
     * second 2, and so on.
     * </p>
     * 
     * @param expenseIndex
     *        Denotes which invoice or receipt in the document the information is coming from. First document will be 1,
     *        the second 2, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseDocument withExpenseIndex(Integer expenseIndex) {
        setExpenseIndex(expenseIndex);
        return this;
    }

    /**
     * <p>
     * Any information found outside of a table by Amazon Textract.
     * </p>
     * 
     * @return Any information found outside of a table by Amazon Textract.
     */

    public java.util.List<ExpenseField> getSummaryFields() {
        return summaryFields;
    }

    /**
     * <p>
     * Any information found outside of a table by Amazon Textract.
     * </p>
     * 
     * @param summaryFields
     *        Any information found outside of a table by Amazon Textract.
     */

    public void setSummaryFields(java.util.Collection<ExpenseField> summaryFields) {
        if (summaryFields == null) {
            this.summaryFields = null;
            return;
        }

        this.summaryFields = new java.util.ArrayList<ExpenseField>(summaryFields);
    }

    /**
     * <p>
     * Any information found outside of a table by Amazon Textract.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaryFields(java.util.Collection)} or {@link #withSummaryFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param summaryFields
     *        Any information found outside of a table by Amazon Textract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseDocument withSummaryFields(ExpenseField... summaryFields) {
        if (this.summaryFields == null) {
            setSummaryFields(new java.util.ArrayList<ExpenseField>(summaryFields.length));
        }
        for (ExpenseField ele : summaryFields) {
            this.summaryFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any information found outside of a table by Amazon Textract.
     * </p>
     * 
     * @param summaryFields
     *        Any information found outside of a table by Amazon Textract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseDocument withSummaryFields(java.util.Collection<ExpenseField> summaryFields) {
        setSummaryFields(summaryFields);
        return this;
    }

    /**
     * <p>
     * Information detected on each table of a document, seperated into <code>LineItems</code>.
     * </p>
     * 
     * @return Information detected on each table of a document, seperated into <code>LineItems</code>.
     */

    public java.util.List<LineItemGroup> getLineItemGroups() {
        return lineItemGroups;
    }

    /**
     * <p>
     * Information detected on each table of a document, seperated into <code>LineItems</code>.
     * </p>
     * 
     * @param lineItemGroups
     *        Information detected on each table of a document, seperated into <code>LineItems</code>.
     */

    public void setLineItemGroups(java.util.Collection<LineItemGroup> lineItemGroups) {
        if (lineItemGroups == null) {
            this.lineItemGroups = null;
            return;
        }

        this.lineItemGroups = new java.util.ArrayList<LineItemGroup>(lineItemGroups);
    }

    /**
     * <p>
     * Information detected on each table of a document, seperated into <code>LineItems</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineItemGroups(java.util.Collection)} or {@link #withLineItemGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param lineItemGroups
     *        Information detected on each table of a document, seperated into <code>LineItems</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseDocument withLineItemGroups(LineItemGroup... lineItemGroups) {
        if (this.lineItemGroups == null) {
            setLineItemGroups(new java.util.ArrayList<LineItemGroup>(lineItemGroups.length));
        }
        for (LineItemGroup ele : lineItemGroups) {
            this.lineItemGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information detected on each table of a document, seperated into <code>LineItems</code>.
     * </p>
     * 
     * @param lineItemGroups
     *        Information detected on each table of a document, seperated into <code>LineItems</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseDocument withLineItemGroups(java.util.Collection<LineItemGroup> lineItemGroups) {
        setLineItemGroups(lineItemGroups);
        return this;
    }

    /**
     * <p>
     * This is a block object, the same as reported when DetectDocumentText is run on a document. It provides word level
     * recognition of text.
     * </p>
     * 
     * @return This is a block object, the same as reported when DetectDocumentText is run on a document. It provides
     *         word level recognition of text.
     */

    public java.util.List<Block> getBlocks() {
        return blocks;
    }

    /**
     * <p>
     * This is a block object, the same as reported when DetectDocumentText is run on a document. It provides word level
     * recognition of text.
     * </p>
     * 
     * @param blocks
     *        This is a block object, the same as reported when DetectDocumentText is run on a document. It provides
     *        word level recognition of text.
     */

    public void setBlocks(java.util.Collection<Block> blocks) {
        if (blocks == null) {
            this.blocks = null;
            return;
        }

        this.blocks = new java.util.ArrayList<Block>(blocks);
    }

    /**
     * <p>
     * This is a block object, the same as reported when DetectDocumentText is run on a document. It provides word level
     * recognition of text.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlocks(java.util.Collection)} or {@link #withBlocks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param blocks
     *        This is a block object, the same as reported when DetectDocumentText is run on a document. It provides
     *        word level recognition of text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseDocument withBlocks(Block... blocks) {
        if (this.blocks == null) {
            setBlocks(new java.util.ArrayList<Block>(blocks.length));
        }
        for (Block ele : blocks) {
            this.blocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This is a block object, the same as reported when DetectDocumentText is run on a document. It provides word level
     * recognition of text.
     * </p>
     * 
     * @param blocks
     *        This is a block object, the same as reported when DetectDocumentText is run on a document. It provides
     *        word level recognition of text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseDocument withBlocks(java.util.Collection<Block> blocks) {
        setBlocks(blocks);
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
        if (getExpenseIndex() != null)
            sb.append("ExpenseIndex: ").append(getExpenseIndex()).append(",");
        if (getSummaryFields() != null)
            sb.append("SummaryFields: ").append(getSummaryFields()).append(",");
        if (getLineItemGroups() != null)
            sb.append("LineItemGroups: ").append(getLineItemGroups()).append(",");
        if (getBlocks() != null)
            sb.append("Blocks: ").append(getBlocks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpenseDocument == false)
            return false;
        ExpenseDocument other = (ExpenseDocument) obj;
        if (other.getExpenseIndex() == null ^ this.getExpenseIndex() == null)
            return false;
        if (other.getExpenseIndex() != null && other.getExpenseIndex().equals(this.getExpenseIndex()) == false)
            return false;
        if (other.getSummaryFields() == null ^ this.getSummaryFields() == null)
            return false;
        if (other.getSummaryFields() != null && other.getSummaryFields().equals(this.getSummaryFields()) == false)
            return false;
        if (other.getLineItemGroups() == null ^ this.getLineItemGroups() == null)
            return false;
        if (other.getLineItemGroups() != null && other.getLineItemGroups().equals(this.getLineItemGroups()) == false)
            return false;
        if (other.getBlocks() == null ^ this.getBlocks() == null)
            return false;
        if (other.getBlocks() != null && other.getBlocks().equals(this.getBlocks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpenseIndex() == null) ? 0 : getExpenseIndex().hashCode());
        hashCode = prime * hashCode + ((getSummaryFields() == null) ? 0 : getSummaryFields().hashCode());
        hashCode = prime * hashCode + ((getLineItemGroups() == null) ? 0 : getLineItemGroups().hashCode());
        hashCode = prime * hashCode + ((getBlocks() == null) ? 0 : getBlocks().hashCode());
        return hashCode;
    }

    @Override
    public ExpenseDocument clone() {
        try {
            return (ExpenseDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.ExpenseDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
