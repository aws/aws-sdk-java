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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListIndexes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIndexesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains the details and status of each index.
     * </p>
     */
    private java.util.List<Index> indexes;
    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A structure that contains the details and status of each index.
     * </p>
     * 
     * @return A structure that contains the details and status of each index.
     */

    public java.util.List<Index> getIndexes() {
        return indexes;
    }

    /**
     * <p>
     * A structure that contains the details and status of each index.
     * </p>
     * 
     * @param indexes
     *        A structure that contains the details and status of each index.
     */

    public void setIndexes(java.util.Collection<Index> indexes) {
        if (indexes == null) {
            this.indexes = null;
            return;
        }

        this.indexes = new java.util.ArrayList<Index>(indexes);
    }

    /**
     * <p>
     * A structure that contains the details and status of each index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIndexes(java.util.Collection)} or {@link #withIndexes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param indexes
     *        A structure that contains the details and status of each index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndexesResult withIndexes(Index... indexes) {
        if (this.indexes == null) {
            setIndexes(new java.util.ArrayList<Index>(indexes.length));
        }
        for (Index ele : indexes) {
            this.indexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that contains the details and status of each index.
     * </p>
     * 
     * @param indexes
     *        A structure that contains the details and status of each index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndexesResult withIndexes(java.util.Collection<Index> indexes) {
        setIndexes(indexes);
        return this;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, indicates that more output is available than is included in the current response. Use this
     *        value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *        next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *        back as <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @return If present, indicates that more output is available than is included in the current response. Use this
     *         value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *         next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *         back as <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, indicates that more output is available than is included in the current response. Use this
     *        value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *        next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *        back as <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndexesResult withNextToken(String nextToken) {
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
        if (getIndexes() != null)
            sb.append("Indexes: ").append(getIndexes()).append(",");
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

        if (obj instanceof ListIndexesResult == false)
            return false;
        ListIndexesResult other = (ListIndexesResult) obj;
        if (other.getIndexes() == null ^ this.getIndexes() == null)
            return false;
        if (other.getIndexes() != null && other.getIndexes().equals(this.getIndexes()) == false)
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

        hashCode = prime * hashCode + ((getIndexes() == null) ? 0 : getIndexes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIndexesResult clone() {
        try {
            return (ListIndexesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
