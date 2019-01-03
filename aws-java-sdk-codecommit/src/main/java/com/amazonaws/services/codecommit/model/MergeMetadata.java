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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a merge or potential merge between a source reference and a destination reference in a pull
 * request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergeMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean value indicating whether the merge has been made.
     * </p>
     */
    private Boolean isMerged;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who merged the branches.
     * </p>
     */
    private String mergedBy;

    /**
     * <p>
     * A Boolean value indicating whether the merge has been made.
     * </p>
     * 
     * @param isMerged
     *        A Boolean value indicating whether the merge has been made.
     */

    public void setIsMerged(Boolean isMerged) {
        this.isMerged = isMerged;
    }

    /**
     * <p>
     * A Boolean value indicating whether the merge has been made.
     * </p>
     * 
     * @return A Boolean value indicating whether the merge has been made.
     */

    public Boolean getIsMerged() {
        return this.isMerged;
    }

    /**
     * <p>
     * A Boolean value indicating whether the merge has been made.
     * </p>
     * 
     * @param isMerged
     *        A Boolean value indicating whether the merge has been made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeMetadata withIsMerged(Boolean isMerged) {
        setIsMerged(isMerged);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the merge has been made.
     * </p>
     * 
     * @return A Boolean value indicating whether the merge has been made.
     */

    public Boolean isMerged() {
        return this.isMerged;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who merged the branches.
     * </p>
     * 
     * @param mergedBy
     *        The Amazon Resource Name (ARN) of the user who merged the branches.
     */

    public void setMergedBy(String mergedBy) {
        this.mergedBy = mergedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who merged the branches.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who merged the branches.
     */

    public String getMergedBy() {
        return this.mergedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who merged the branches.
     * </p>
     * 
     * @param mergedBy
     *        The Amazon Resource Name (ARN) of the user who merged the branches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeMetadata withMergedBy(String mergedBy) {
        setMergedBy(mergedBy);
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
        if (getIsMerged() != null)
            sb.append("IsMerged: ").append(getIsMerged()).append(",");
        if (getMergedBy() != null)
            sb.append("MergedBy: ").append(getMergedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeMetadata == false)
            return false;
        MergeMetadata other = (MergeMetadata) obj;
        if (other.getIsMerged() == null ^ this.getIsMerged() == null)
            return false;
        if (other.getIsMerged() != null && other.getIsMerged().equals(this.getIsMerged()) == false)
            return false;
        if (other.getMergedBy() == null ^ this.getMergedBy() == null)
            return false;
        if (other.getMergedBy() != null && other.getMergedBy().equals(this.getMergedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsMerged() == null) ? 0 : getIsMerged().hashCode());
        hashCode = prime * hashCode + ((getMergedBy() == null) ? 0 : getMergedBy().hashCode());
        return hashCode;
    }

    @Override
    public MergeMetadata clone() {
        try {
            return (MergeMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.MergeMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
