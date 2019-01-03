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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of algorithms that were used to create a model package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SourceAlgorithmSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceAlgorithmSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the algorithms that were used to create a model package.
     * </p>
     */
    private java.util.List<SourceAlgorithm> sourceAlgorithms;

    /**
     * <p>
     * A list of the algorithms that were used to create a model package.
     * </p>
     * 
     * @return A list of the algorithms that were used to create a model package.
     */

    public java.util.List<SourceAlgorithm> getSourceAlgorithms() {
        return sourceAlgorithms;
    }

    /**
     * <p>
     * A list of the algorithms that were used to create a model package.
     * </p>
     * 
     * @param sourceAlgorithms
     *        A list of the algorithms that were used to create a model package.
     */

    public void setSourceAlgorithms(java.util.Collection<SourceAlgorithm> sourceAlgorithms) {
        if (sourceAlgorithms == null) {
            this.sourceAlgorithms = null;
            return;
        }

        this.sourceAlgorithms = new java.util.ArrayList<SourceAlgorithm>(sourceAlgorithms);
    }

    /**
     * <p>
     * A list of the algorithms that were used to create a model package.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceAlgorithms(java.util.Collection)} or {@link #withSourceAlgorithms(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourceAlgorithms
     *        A list of the algorithms that were used to create a model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAlgorithmSpecification withSourceAlgorithms(SourceAlgorithm... sourceAlgorithms) {
        if (this.sourceAlgorithms == null) {
            setSourceAlgorithms(new java.util.ArrayList<SourceAlgorithm>(sourceAlgorithms.length));
        }
        for (SourceAlgorithm ele : sourceAlgorithms) {
            this.sourceAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the algorithms that were used to create a model package.
     * </p>
     * 
     * @param sourceAlgorithms
     *        A list of the algorithms that were used to create a model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAlgorithmSpecification withSourceAlgorithms(java.util.Collection<SourceAlgorithm> sourceAlgorithms) {
        setSourceAlgorithms(sourceAlgorithms);
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
        if (getSourceAlgorithms() != null)
            sb.append("SourceAlgorithms: ").append(getSourceAlgorithms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceAlgorithmSpecification == false)
            return false;
        SourceAlgorithmSpecification other = (SourceAlgorithmSpecification) obj;
        if (other.getSourceAlgorithms() == null ^ this.getSourceAlgorithms() == null)
            return false;
        if (other.getSourceAlgorithms() != null && other.getSourceAlgorithms().equals(this.getSourceAlgorithms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceAlgorithms() == null) ? 0 : getSourceAlgorithms().hashCode());
        return hashCode;
    }

    @Override
    public SourceAlgorithmSpecification clone() {
        try {
            return (SourceAlgorithmSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SourceAlgorithmSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
