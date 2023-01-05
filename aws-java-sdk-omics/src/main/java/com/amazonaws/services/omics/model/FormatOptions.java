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
 * Formatting options for a file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/FormatOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormatOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Options for a TSV file.
     * </p>
     */
    private TsvOptions tsvOptions;
    /**
     * <p>
     * Options for a VCF file.
     * </p>
     */
    private VcfOptions vcfOptions;

    /**
     * <p>
     * Options for a TSV file.
     * </p>
     * 
     * @param tsvOptions
     *        Options for a TSV file.
     */

    public void setTsvOptions(TsvOptions tsvOptions) {
        this.tsvOptions = tsvOptions;
    }

    /**
     * <p>
     * Options for a TSV file.
     * </p>
     * 
     * @return Options for a TSV file.
     */

    public TsvOptions getTsvOptions() {
        return this.tsvOptions;
    }

    /**
     * <p>
     * Options for a TSV file.
     * </p>
     * 
     * @param tsvOptions
     *        Options for a TSV file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormatOptions withTsvOptions(TsvOptions tsvOptions) {
        setTsvOptions(tsvOptions);
        return this;
    }

    /**
     * <p>
     * Options for a VCF file.
     * </p>
     * 
     * @param vcfOptions
     *        Options for a VCF file.
     */

    public void setVcfOptions(VcfOptions vcfOptions) {
        this.vcfOptions = vcfOptions;
    }

    /**
     * <p>
     * Options for a VCF file.
     * </p>
     * 
     * @return Options for a VCF file.
     */

    public VcfOptions getVcfOptions() {
        return this.vcfOptions;
    }

    /**
     * <p>
     * Options for a VCF file.
     * </p>
     * 
     * @param vcfOptions
     *        Options for a VCF file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormatOptions withVcfOptions(VcfOptions vcfOptions) {
        setVcfOptions(vcfOptions);
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
        if (getTsvOptions() != null)
            sb.append("TsvOptions: ").append(getTsvOptions()).append(",");
        if (getVcfOptions() != null)
            sb.append("VcfOptions: ").append(getVcfOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormatOptions == false)
            return false;
        FormatOptions other = (FormatOptions) obj;
        if (other.getTsvOptions() == null ^ this.getTsvOptions() == null)
            return false;
        if (other.getTsvOptions() != null && other.getTsvOptions().equals(this.getTsvOptions()) == false)
            return false;
        if (other.getVcfOptions() == null ^ this.getVcfOptions() == null)
            return false;
        if (other.getVcfOptions() != null && other.getVcfOptions().equals(this.getVcfOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTsvOptions() == null) ? 0 : getTsvOptions().hashCode());
        hashCode = prime * hashCode + ((getVcfOptions() == null) ? 0 : getVcfOptions().hashCode());
        return hashCode;
    }

    @Override
    public FormatOptions clone() {
        try {
            return (FormatOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.FormatOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
