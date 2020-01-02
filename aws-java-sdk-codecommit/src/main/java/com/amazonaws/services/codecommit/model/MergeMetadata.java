/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The commit ID for the merge commit, if any.
     * </p>
     */
    private String mergeCommitId;
    /**
     * <p>
     * The merge strategy used in the merge.
     * </p>
     */
    private String mergeOption;

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
     * <p>
     * The commit ID for the merge commit, if any.
     * </p>
     * 
     * @param mergeCommitId
     *        The commit ID for the merge commit, if any.
     */

    public void setMergeCommitId(String mergeCommitId) {
        this.mergeCommitId = mergeCommitId;
    }

    /**
     * <p>
     * The commit ID for the merge commit, if any.
     * </p>
     * 
     * @return The commit ID for the merge commit, if any.
     */

    public String getMergeCommitId() {
        return this.mergeCommitId;
    }

    /**
     * <p>
     * The commit ID for the merge commit, if any.
     * </p>
     * 
     * @param mergeCommitId
     *        The commit ID for the merge commit, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeMetadata withMergeCommitId(String mergeCommitId) {
        setMergeCommitId(mergeCommitId);
        return this;
    }

    /**
     * <p>
     * The merge strategy used in the merge.
     * </p>
     * 
     * @param mergeOption
     *        The merge strategy used in the merge.
     * @see MergeOptionTypeEnum
     */

    public void setMergeOption(String mergeOption) {
        this.mergeOption = mergeOption;
    }

    /**
     * <p>
     * The merge strategy used in the merge.
     * </p>
     * 
     * @return The merge strategy used in the merge.
     * @see MergeOptionTypeEnum
     */

    public String getMergeOption() {
        return this.mergeOption;
    }

    /**
     * <p>
     * The merge strategy used in the merge.
     * </p>
     * 
     * @param mergeOption
     *        The merge strategy used in the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeOptionTypeEnum
     */

    public MergeMetadata withMergeOption(String mergeOption) {
        setMergeOption(mergeOption);
        return this;
    }

    /**
     * <p>
     * The merge strategy used in the merge.
     * </p>
     * 
     * @param mergeOption
     *        The merge strategy used in the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeOptionTypeEnum
     */

    public MergeMetadata withMergeOption(MergeOptionTypeEnum mergeOption) {
        this.mergeOption = mergeOption.toString();
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
            sb.append("MergedBy: ").append(getMergedBy()).append(",");
        if (getMergeCommitId() != null)
            sb.append("MergeCommitId: ").append(getMergeCommitId()).append(",");
        if (getMergeOption() != null)
            sb.append("MergeOption: ").append(getMergeOption());
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
        if (other.getMergeCommitId() == null ^ this.getMergeCommitId() == null)
            return false;
        if (other.getMergeCommitId() != null && other.getMergeCommitId().equals(this.getMergeCommitId()) == false)
            return false;
        if (other.getMergeOption() == null ^ this.getMergeOption() == null)
            return false;
        if (other.getMergeOption() != null && other.getMergeOption().equals(this.getMergeOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsMerged() == null) ? 0 : getIsMerged().hashCode());
        hashCode = prime * hashCode + ((getMergedBy() == null) ? 0 : getMergedBy().hashCode());
        hashCode = prime * hashCode + ((getMergeCommitId() == null) ? 0 : getMergeCommitId().hashCode());
        hashCode = prime * hashCode + ((getMergeOption() == null) ? 0 : getMergeOption().hashCode());
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
