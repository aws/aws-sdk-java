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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to disassociate lens reviews.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DisassociateLenses" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateLensesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String workloadId;

    private java.util.List<String> lensAliases;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateLensesRequest withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getLensAliases() {
        return lensAliases;
    }

    /**
     * @param lensAliases
     */

    public void setLensAliases(java.util.Collection<String> lensAliases) {
        if (lensAliases == null) {
            this.lensAliases = null;
            return;
        }

        this.lensAliases = new java.util.ArrayList<String>(lensAliases);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLensAliases(java.util.Collection)} or {@link #withLensAliases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lensAliases
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateLensesRequest withLensAliases(String... lensAliases) {
        if (this.lensAliases == null) {
            setLensAliases(new java.util.ArrayList<String>(lensAliases.length));
        }
        for (String ele : lensAliases) {
            this.lensAliases.add(ele);
        }
        return this;
    }

    /**
     * @param lensAliases
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateLensesRequest withLensAliases(java.util.Collection<String> lensAliases) {
        setLensAliases(lensAliases);
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getLensAliases() != null)
            sb.append("LensAliases: ").append(getLensAliases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateLensesRequest == false)
            return false;
        DisassociateLensesRequest other = (DisassociateLensesRequest) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getLensAliases() == null ^ this.getLensAliases() == null)
            return false;
        if (other.getLensAliases() != null && other.getLensAliases().equals(this.getLensAliases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getLensAliases() == null) ? 0 : getLensAliases().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateLensesRequest clone() {
        return (DisassociateLensesRequest) super.clone();
    }

}
