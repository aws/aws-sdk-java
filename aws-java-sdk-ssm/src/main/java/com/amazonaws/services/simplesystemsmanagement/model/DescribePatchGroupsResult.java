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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePatchGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Each entry in the array contains:
     * </p>
     * <p>
     * PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     * </p>
     * <p>
     * PatchBaselineIdentity: A PatchBaselineIdentity element.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PatchGroupPatchBaselineMapping> mappings;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Each entry in the array contains:
     * </p>
     * <p>
     * PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     * </p>
     * <p>
     * PatchBaselineIdentity: A PatchBaselineIdentity element.
     * </p>
     * 
     * @return Each entry in the array contains:</p>
     *         <p>
     *         PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     *         </p>
     *         <p>
     *         PatchBaselineIdentity: A PatchBaselineIdentity element.
     */

    public java.util.List<PatchGroupPatchBaselineMapping> getMappings() {
        if (mappings == null) {
            mappings = new com.amazonaws.internal.SdkInternalList<PatchGroupPatchBaselineMapping>();
        }
        return mappings;
    }

    /**
     * <p>
     * Each entry in the array contains:
     * </p>
     * <p>
     * PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     * </p>
     * <p>
     * PatchBaselineIdentity: A PatchBaselineIdentity element.
     * </p>
     * 
     * @param mappings
     *        Each entry in the array contains:</p>
     *        <p>
     *        PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     *        </p>
     *        <p>
     *        PatchBaselineIdentity: A PatchBaselineIdentity element.
     */

    public void setMappings(java.util.Collection<PatchGroupPatchBaselineMapping> mappings) {
        if (mappings == null) {
            this.mappings = null;
            return;
        }

        this.mappings = new com.amazonaws.internal.SdkInternalList<PatchGroupPatchBaselineMapping>(mappings);
    }

    /**
     * <p>
     * Each entry in the array contains:
     * </p>
     * <p>
     * PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     * </p>
     * <p>
     * PatchBaselineIdentity: A PatchBaselineIdentity element.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMappings(java.util.Collection)} or {@link #withMappings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param mappings
     *        Each entry in the array contains:</p>
     *        <p>
     *        PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     *        </p>
     *        <p>
     *        PatchBaselineIdentity: A PatchBaselineIdentity element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupsResult withMappings(PatchGroupPatchBaselineMapping... mappings) {
        if (this.mappings == null) {
            setMappings(new com.amazonaws.internal.SdkInternalList<PatchGroupPatchBaselineMapping>(mappings.length));
        }
        for (PatchGroupPatchBaselineMapping ele : mappings) {
            this.mappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Each entry in the array contains:
     * </p>
     * <p>
     * PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     * </p>
     * <p>
     * PatchBaselineIdentity: A PatchBaselineIdentity element.
     * </p>
     * 
     * @param mappings
     *        Each entry in the array contains:</p>
     *        <p>
     *        PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     *        </p>
     *        <p>
     *        PatchBaselineIdentity: A PatchBaselineIdentity element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupsResult withMappings(java.util.Collection<PatchGroupPatchBaselineMapping> mappings) {
        setMappings(mappings);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there are no additional items to return, the
     *         string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getMappings() != null)
            sb.append("Mappings: ").append(getMappings()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePatchGroupsResult == false)
            return false;
        DescribePatchGroupsResult other = (DescribePatchGroupsResult) obj;
        if (other.getMappings() == null ^ this.getMappings() == null)
            return false;
        if (other.getMappings() != null && other.getMappings().equals(this.getMappings()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMappings() == null) ? 0 : getMappings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePatchGroupsResult clone() {
        try {
            return (DescribePatchGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
