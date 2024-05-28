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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The entity tag (ETag) is a hash of the object representing its semantic content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ETag" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ETag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The algorithm used to calculate the read set’s ETag(s).
     * </p>
     */
    private String algorithm;
    /**
     * <p>
     * The ETag hash calculated on Source1 of the read set.
     * </p>
     */
    private String source1;
    /**
     * <p>
     * The ETag hash calculated on Source2 of the read set.
     * </p>
     */
    private String source2;

    /**
     * <p>
     * The algorithm used to calculate the read set’s ETag(s).
     * </p>
     * 
     * @param algorithm
     *        The algorithm used to calculate the read set’s ETag(s).
     * @see ETagAlgorithm
     */

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * <p>
     * The algorithm used to calculate the read set’s ETag(s).
     * </p>
     * 
     * @return The algorithm used to calculate the read set’s ETag(s).
     * @see ETagAlgorithm
     */

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * <p>
     * The algorithm used to calculate the read set’s ETag(s).
     * </p>
     * 
     * @param algorithm
     *        The algorithm used to calculate the read set’s ETag(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ETagAlgorithm
     */

    public ETag withAlgorithm(String algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm used to calculate the read set’s ETag(s).
     * </p>
     * 
     * @param algorithm
     *        The algorithm used to calculate the read set’s ETag(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ETagAlgorithm
     */

    public ETag withAlgorithm(ETagAlgorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * <p>
     * The ETag hash calculated on Source1 of the read set.
     * </p>
     * 
     * @param source1
     *        The ETag hash calculated on Source1 of the read set.
     */

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    /**
     * <p>
     * The ETag hash calculated on Source1 of the read set.
     * </p>
     * 
     * @return The ETag hash calculated on Source1 of the read set.
     */

    public String getSource1() {
        return this.source1;
    }

    /**
     * <p>
     * The ETag hash calculated on Source1 of the read set.
     * </p>
     * 
     * @param source1
     *        The ETag hash calculated on Source1 of the read set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ETag withSource1(String source1) {
        setSource1(source1);
        return this;
    }

    /**
     * <p>
     * The ETag hash calculated on Source2 of the read set.
     * </p>
     * 
     * @param source2
     *        The ETag hash calculated on Source2 of the read set.
     */

    public void setSource2(String source2) {
        this.source2 = source2;
    }

    /**
     * <p>
     * The ETag hash calculated on Source2 of the read set.
     * </p>
     * 
     * @return The ETag hash calculated on Source2 of the read set.
     */

    public String getSource2() {
        return this.source2;
    }

    /**
     * <p>
     * The ETag hash calculated on Source2 of the read set.
     * </p>
     * 
     * @param source2
     *        The ETag hash calculated on Source2 of the read set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ETag withSource2(String source2) {
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: ").append(getAlgorithm()).append(",");
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

        if (obj instanceof ETag == false)
            return false;
        ETag other = (ETag) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getSource1() == null) ? 0 : getSource1().hashCode());
        hashCode = prime * hashCode + ((getSource2() == null) ? 0 : getSource2().hashCode());
        return hashCode;
    }

    @Override
    public ETag clone() {
        try {
            return (ETag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ETagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
