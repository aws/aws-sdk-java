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
 * Source files for a sequence.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/SourceFiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceFiles implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the first file in Amazon S3.
     * </p>
     */
    private String source1;
    /**
     * <p>
     * The location of the second file in Amazon S3.
     * </p>
     */
    private String source2;

    /**
     * <p>
     * The location of the first file in Amazon S3.
     * </p>
     * 
     * @param source1
     *        The location of the first file in Amazon S3.
     */

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    /**
     * <p>
     * The location of the first file in Amazon S3.
     * </p>
     * 
     * @return The location of the first file in Amazon S3.
     */

    public String getSource1() {
        return this.source1;
    }

    /**
     * <p>
     * The location of the first file in Amazon S3.
     * </p>
     * 
     * @param source1
     *        The location of the first file in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceFiles withSource1(String source1) {
        setSource1(source1);
        return this;
    }

    /**
     * <p>
     * The location of the second file in Amazon S3.
     * </p>
     * 
     * @param source2
     *        The location of the second file in Amazon S3.
     */

    public void setSource2(String source2) {
        this.source2 = source2;
    }

    /**
     * <p>
     * The location of the second file in Amazon S3.
     * </p>
     * 
     * @return The location of the second file in Amazon S3.
     */

    public String getSource2() {
        return this.source2;
    }

    /**
     * <p>
     * The location of the second file in Amazon S3.
     * </p>
     * 
     * @param source2
     *        The location of the second file in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceFiles withSource2(String source2) {
        setSource2(source2);
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
        if (getSource1() != null)
            sb.append("Source1: ").append(getSource1()).append(",");
        if (getSource2() != null)
            sb.append("Source2: ").append(getSource2());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceFiles == false)
            return false;
        SourceFiles other = (SourceFiles) obj;
        if (other.getSource1() == null ^ this.getSource1() == null)
            return false;
        if (other.getSource1() != null && other.getSource1().equals(this.getSource1()) == false)
            return false;
        if (other.getSource2() == null ^ this.getSource2() == null)
            return false;
        if (other.getSource2() != null && other.getSource2().equals(this.getSource2()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource1() == null) ? 0 : getSource1().hashCode());
        hashCode = prime * hashCode + ((getSource2() == null) ? 0 : getSource2().hashCode());
        return hashCode;
    }

    @Override
    public SourceFiles clone() {
        try {
            return (SourceFiles) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.SourceFilesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
