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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListLakeFormationOptIns"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLakeFormationOptInsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of principal-resource pairs that have Lake Formation permissins enforced.
     * </p>
     */
    private java.util.List<LakeFormationOptInsInfo> lakeFormationOptInsInfoList;
    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of principal-resource pairs that have Lake Formation permissins enforced.
     * </p>
     * 
     * @return A list of principal-resource pairs that have Lake Formation permissins enforced.
     */

    public java.util.List<LakeFormationOptInsInfo> getLakeFormationOptInsInfoList() {
        return lakeFormationOptInsInfoList;
    }

    /**
     * <p>
     * A list of principal-resource pairs that have Lake Formation permissins enforced.
     * </p>
     * 
     * @param lakeFormationOptInsInfoList
     *        A list of principal-resource pairs that have Lake Formation permissins enforced.
     */

    public void setLakeFormationOptInsInfoList(java.util.Collection<LakeFormationOptInsInfo> lakeFormationOptInsInfoList) {
        if (lakeFormationOptInsInfoList == null) {
            this.lakeFormationOptInsInfoList = null;
            return;
        }

        this.lakeFormationOptInsInfoList = new java.util.ArrayList<LakeFormationOptInsInfo>(lakeFormationOptInsInfoList);
    }

    /**
     * <p>
     * A list of principal-resource pairs that have Lake Formation permissins enforced.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLakeFormationOptInsInfoList(java.util.Collection)} or
     * {@link #withLakeFormationOptInsInfoList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lakeFormationOptInsInfoList
     *        A list of principal-resource pairs that have Lake Formation permissins enforced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLakeFormationOptInsResult withLakeFormationOptInsInfoList(LakeFormationOptInsInfo... lakeFormationOptInsInfoList) {
        if (this.lakeFormationOptInsInfoList == null) {
            setLakeFormationOptInsInfoList(new java.util.ArrayList<LakeFormationOptInsInfo>(lakeFormationOptInsInfoList.length));
        }
        for (LakeFormationOptInsInfo ele : lakeFormationOptInsInfoList) {
            this.lakeFormationOptInsInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of principal-resource pairs that have Lake Formation permissins enforced.
     * </p>
     * 
     * @param lakeFormationOptInsInfoList
     *        A list of principal-resource pairs that have Lake Formation permissins enforced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLakeFormationOptInsResult withLakeFormationOptInsInfoList(java.util.Collection<LakeFormationOptInsInfo> lakeFormationOptInsInfoList) {
        setLakeFormationOptInsInfoList(lakeFormationOptInsInfoList);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @return A continuation token, if this is not the first call to retrieve this list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLakeFormationOptInsResult withNextToken(String nextToken) {
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
        if (getLakeFormationOptInsInfoList() != null)
            sb.append("LakeFormationOptInsInfoList: ").append(getLakeFormationOptInsInfoList()).append(",");
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

        if (obj instanceof ListLakeFormationOptInsResult == false)
            return false;
        ListLakeFormationOptInsResult other = (ListLakeFormationOptInsResult) obj;
        if (other.getLakeFormationOptInsInfoList() == null ^ this.getLakeFormationOptInsInfoList() == null)
            return false;
        if (other.getLakeFormationOptInsInfoList() != null && other.getLakeFormationOptInsInfoList().equals(this.getLakeFormationOptInsInfoList()) == false)
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

        hashCode = prime * hashCode + ((getLakeFormationOptInsInfoList() == null) ? 0 : getLakeFormationOptInsInfoList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLakeFormationOptInsResult clone() {
        try {
            return (ListLakeFormationOptInsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
