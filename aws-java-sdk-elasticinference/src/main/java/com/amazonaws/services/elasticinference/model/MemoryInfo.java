/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticinference.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The memory information of an Elastic Inference Accelerator type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/MemoryInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemoryInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The size in mebibytes of the Elastic Inference Accelerator type.
     * </p>
     */
    private Integer sizeInMiB;

    /**
     * <p>
     * The size in mebibytes of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @param sizeInMiB
     *        The size in mebibytes of the Elastic Inference Accelerator type.
     */

    public void setSizeInMiB(Integer sizeInMiB) {
        this.sizeInMiB = sizeInMiB;
    }

    /**
     * <p>
     * The size in mebibytes of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @return The size in mebibytes of the Elastic Inference Accelerator type.
     */

    public Integer getSizeInMiB() {
        return this.sizeInMiB;
    }

    /**
     * <p>
     * The size in mebibytes of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @param sizeInMiB
     *        The size in mebibytes of the Elastic Inference Accelerator type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemoryInfo withSizeInMiB(Integer sizeInMiB) {
        setSizeInMiB(sizeInMiB);
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
        if (getSizeInMiB() != null)
            sb.append("SizeInMiB: ").append(getSizeInMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemoryInfo == false)
            return false;
        MemoryInfo other = (MemoryInfo) obj;
        if (other.getSizeInMiB() == null ^ this.getSizeInMiB() == null)
            return false;
        if (other.getSizeInMiB() != null && other.getSizeInMiB().equals(this.getSizeInMiB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeInMiB() == null) ? 0 : getSizeInMiB().hashCode());
        return hashCode;
    }

    @Override
    public MemoryInfo clone() {
        try {
            return (MemoryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticinference.model.transform.MemoryInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
