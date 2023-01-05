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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a sequence.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/SequenceInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SequenceInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sequence's alignment setting.
     * </p>
     */
    private String alignment;
    /**
     * <p>
     * Where the sequence originated.
     * </p>
     */
    private String generatedFrom;
    /**
     * <p>
     * The sequence's total base count.
     * </p>
     */
    private Long totalBaseCount;
    /**
     * <p>
     * The sequence's total read count.
     * </p>
     */
    private Long totalReadCount;

    /**
     * <p>
     * The sequence's alignment setting.
     * </p>
     * 
     * @param alignment
     *        The sequence's alignment setting.
     */

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    /**
     * <p>
     * The sequence's alignment setting.
     * </p>
     * 
     * @return The sequence's alignment setting.
     */

    public String getAlignment() {
        return this.alignment;
    }

    /**
     * <p>
     * The sequence's alignment setting.
     * </p>
     * 
     * @param alignment
     *        The sequence's alignment setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceInformation withAlignment(String alignment) {
        setAlignment(alignment);
        return this;
    }

    /**
     * <p>
     * Where the sequence originated.
     * </p>
     * 
     * @param generatedFrom
     *        Where the sequence originated.
     */

    public void setGeneratedFrom(String generatedFrom) {
        this.generatedFrom = generatedFrom;
    }

    /**
     * <p>
     * Where the sequence originated.
     * </p>
     * 
     * @return Where the sequence originated.
     */

    public String getGeneratedFrom() {
        return this.generatedFrom;
    }

    /**
     * <p>
     * Where the sequence originated.
     * </p>
     * 
     * @param generatedFrom
     *        Where the sequence originated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceInformation withGeneratedFrom(String generatedFrom) {
        setGeneratedFrom(generatedFrom);
        return this;
    }

    /**
     * <p>
     * The sequence's total base count.
     * </p>
     * 
     * @param totalBaseCount
     *        The sequence's total base count.
     */

    public void setTotalBaseCount(Long totalBaseCount) {
        this.totalBaseCount = totalBaseCount;
    }

    /**
     * <p>
     * The sequence's total base count.
     * </p>
     * 
     * @return The sequence's total base count.
     */

    public Long getTotalBaseCount() {
        return this.totalBaseCount;
    }

    /**
     * <p>
     * The sequence's total base count.
     * </p>
     * 
     * @param totalBaseCount
     *        The sequence's total base count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceInformation withTotalBaseCount(Long totalBaseCount) {
        setTotalBaseCount(totalBaseCount);
        return this;
    }

    /**
     * <p>
     * The sequence's total read count.
     * </p>
     * 
     * @param totalReadCount
     *        The sequence's total read count.
     */

    public void setTotalReadCount(Long totalReadCount) {
        this.totalReadCount = totalReadCount;
    }

    /**
     * <p>
     * The sequence's total read count.
     * </p>
     * 
     * @return The sequence's total read count.
     */

    public Long getTotalReadCount() {
        return this.totalReadCount;
    }

    /**
     * <p>
     * The sequence's total read count.
     * </p>
     * 
     * @param totalReadCount
     *        The sequence's total read count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceInformation withTotalReadCount(Long totalReadCount) {
        setTotalReadCount(totalReadCount);
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
        if (getAlignment() != null)
            sb.append("Alignment: ").append(getAlignment()).append(",");
        if (getGeneratedFrom() != null)
            sb.append("GeneratedFrom: ").append(getGeneratedFrom()).append(",");
        if (getTotalBaseCount() != null)
            sb.append("TotalBaseCount: ").append(getTotalBaseCount()).append(",");
        if (getTotalReadCount() != null)
            sb.append("TotalReadCount: ").append(getTotalReadCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SequenceInformation == false)
            return false;
        SequenceInformation other = (SequenceInformation) obj;
        if (other.getAlignment() == null ^ this.getAlignment() == null)
            return false;
        if (other.getAlignment() != null && other.getAlignment().equals(this.getAlignment()) == false)
            return false;
        if (other.getGeneratedFrom() == null ^ this.getGeneratedFrom() == null)
            return false;
        if (other.getGeneratedFrom() != null && other.getGeneratedFrom().equals(this.getGeneratedFrom()) == false)
            return false;
        if (other.getTotalBaseCount() == null ^ this.getTotalBaseCount() == null)
            return false;
        if (other.getTotalBaseCount() != null && other.getTotalBaseCount().equals(this.getTotalBaseCount()) == false)
            return false;
        if (other.getTotalReadCount() == null ^ this.getTotalReadCount() == null)
            return false;
        if (other.getTotalReadCount() != null && other.getTotalReadCount().equals(this.getTotalReadCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlignment() == null) ? 0 : getAlignment().hashCode());
        hashCode = prime * hashCode + ((getGeneratedFrom() == null) ? 0 : getGeneratedFrom().hashCode());
        hashCode = prime * hashCode + ((getTotalBaseCount() == null) ? 0 : getTotalBaseCount().hashCode());
        hashCode = prime * hashCode + ((getTotalReadCount() == null) ? 0 : getTotalReadCount().hashCode());
        return hashCode;
    }

    @Override
    public SequenceInformation clone() {
        try {
            return (SequenceInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.SequenceInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
