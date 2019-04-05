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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a DescribeTrust request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeTrusts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of Trust objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <i>Limit</i> member of the
     * request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations
     * of the operation have been exceeded.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Trust> trusts;
    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>DescribeTrusts</a> to retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of Trust objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <i>Limit</i> member of the
     * request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations
     * of the operation have been exceeded.
     * </p>
     * 
     * @return The list of Trust objects that were retrieved.</p>
     *         <p>
     *         It is possible that this list contains less than the number of items specified in the <i>Limit</i> member
     *         of the request. This occurs if there are less than the requested number of items left to retrieve, or if
     *         the limitations of the operation have been exceeded.
     */

    public java.util.List<Trust> getTrusts() {
        if (trusts == null) {
            trusts = new com.amazonaws.internal.SdkInternalList<Trust>();
        }
        return trusts;
    }

    /**
     * <p>
     * The list of Trust objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <i>Limit</i> member of the
     * request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations
     * of the operation have been exceeded.
     * </p>
     * 
     * @param trusts
     *        The list of Trust objects that were retrieved.</p>
     *        <p>
     *        It is possible that this list contains less than the number of items specified in the <i>Limit</i> member
     *        of the request. This occurs if there are less than the requested number of items left to retrieve, or if
     *        the limitations of the operation have been exceeded.
     */

    public void setTrusts(java.util.Collection<Trust> trusts) {
        if (trusts == null) {
            this.trusts = null;
            return;
        }

        this.trusts = new com.amazonaws.internal.SdkInternalList<Trust>(trusts);
    }

    /**
     * <p>
     * The list of Trust objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <i>Limit</i> member of the
     * request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations
     * of the operation have been exceeded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrusts(java.util.Collection)} or {@link #withTrusts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param trusts
     *        The list of Trust objects that were retrieved.</p>
     *        <p>
     *        It is possible that this list contains less than the number of items specified in the <i>Limit</i> member
     *        of the request. This occurs if there are less than the requested number of items left to retrieve, or if
     *        the limitations of the operation have been exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustsResult withTrusts(Trust... trusts) {
        if (this.trusts == null) {
            setTrusts(new com.amazonaws.internal.SdkInternalList<Trust>(trusts.length));
        }
        for (Trust ele : trusts) {
            this.trusts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Trust objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <i>Limit</i> member of the
     * request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations
     * of the operation have been exceeded.
     * </p>
     * 
     * @param trusts
     *        The list of Trust objects that were retrieved.</p>
     *        <p>
     *        It is possible that this list contains less than the number of items specified in the <i>Limit</i> member
     *        of the request. This occurs if there are less than the requested number of items left to retrieve, or if
     *        the limitations of the operation have been exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustsResult withTrusts(java.util.Collection<Trust> trusts) {
        setTrusts(trusts);
        return this;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>DescribeTrusts</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a
     *        subsequent call to <a>DescribeTrusts</a> to retrieve the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>DescribeTrusts</a> to retrieve the next set of items.
     * </p>
     * 
     * @return If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a
     *         subsequent call to <a>DescribeTrusts</a> to retrieve the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>DescribeTrusts</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a
     *        subsequent call to <a>DescribeTrusts</a> to retrieve the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustsResult withNextToken(String nextToken) {
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
        if (getTrusts() != null)
            sb.append("Trusts: ").append(getTrusts()).append(",");
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

        if (obj instanceof DescribeTrustsResult == false)
            return false;
        DescribeTrustsResult other = (DescribeTrustsResult) obj;
        if (other.getTrusts() == null ^ this.getTrusts() == null)
            return false;
        if (other.getTrusts() != null && other.getTrusts().equals(this.getTrusts()) == false)
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

        hashCode = prime * hashCode + ((getTrusts() == null) ? 0 : getTrusts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrustsResult clone() {
        try {
            return (DescribeTrustsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
