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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectTargetedSentiment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetectTargetedSentimentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects containing the results of the operation. The results are sorted in ascending order by the
     * <code>Index</code> field and match the order of the documents in the input list. If all of the documents contain
     * an error, the <code>ResultList</code> is empty.
     * </p>
     */
    private java.util.List<BatchDetectTargetedSentimentItemResult> resultList;
    /**
     * <p>
     * List of errors that the operation can return.
     * </p>
     */
    private java.util.List<BatchItemError> errorList;

    /**
     * <p>
     * A list of objects containing the results of the operation. The results are sorted in ascending order by the
     * <code>Index</code> field and match the order of the documents in the input list. If all of the documents contain
     * an error, the <code>ResultList</code> is empty.
     * </p>
     * 
     * @return A list of objects containing the results of the operation. The results are sorted in ascending order by
     *         the <code>Index</code> field and match the order of the documents in the input list. If all of the
     *         documents contain an error, the <code>ResultList</code> is empty.
     */

    public java.util.List<BatchDetectTargetedSentimentItemResult> getResultList() {
        return resultList;
    }

    /**
     * <p>
     * A list of objects containing the results of the operation. The results are sorted in ascending order by the
     * <code>Index</code> field and match the order of the documents in the input list. If all of the documents contain
     * an error, the <code>ResultList</code> is empty.
     * </p>
     * 
     * @param resultList
     *        A list of objects containing the results of the operation. The results are sorted in ascending order by
     *        the <code>Index</code> field and match the order of the documents in the input list. If all of the
     *        documents contain an error, the <code>ResultList</code> is empty.
     */

    public void setResultList(java.util.Collection<BatchDetectTargetedSentimentItemResult> resultList) {
        if (resultList == null) {
            this.resultList = null;
            return;
        }

        this.resultList = new java.util.ArrayList<BatchDetectTargetedSentimentItemResult>(resultList);
    }

    /**
     * <p>
     * A list of objects containing the results of the operation. The results are sorted in ascending order by the
     * <code>Index</code> field and match the order of the documents in the input list. If all of the documents contain
     * an error, the <code>ResultList</code> is empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultList(java.util.Collection)} or {@link #withResultList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resultList
     *        A list of objects containing the results of the operation. The results are sorted in ascending order by
     *        the <code>Index</code> field and match the order of the documents in the input list. If all of the
     *        documents contain an error, the <code>ResultList</code> is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectTargetedSentimentResult withResultList(BatchDetectTargetedSentimentItemResult... resultList) {
        if (this.resultList == null) {
            setResultList(new java.util.ArrayList<BatchDetectTargetedSentimentItemResult>(resultList.length));
        }
        for (BatchDetectTargetedSentimentItemResult ele : resultList) {
            this.resultList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing the results of the operation. The results are sorted in ascending order by the
     * <code>Index</code> field and match the order of the documents in the input list. If all of the documents contain
     * an error, the <code>ResultList</code> is empty.
     * </p>
     * 
     * @param resultList
     *        A list of objects containing the results of the operation. The results are sorted in ascending order by
     *        the <code>Index</code> field and match the order of the documents in the input list. If all of the
     *        documents contain an error, the <code>ResultList</code> is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectTargetedSentimentResult withResultList(java.util.Collection<BatchDetectTargetedSentimentItemResult> resultList) {
        setResultList(resultList);
        return this;
    }

    /**
     * <p>
     * List of errors that the operation can return.
     * </p>
     * 
     * @return List of errors that the operation can return.
     */

    public java.util.List<BatchItemError> getErrorList() {
        return errorList;
    }

    /**
     * <p>
     * List of errors that the operation can return.
     * </p>
     * 
     * @param errorList
     *        List of errors that the operation can return.
     */

    public void setErrorList(java.util.Collection<BatchItemError> errorList) {
        if (errorList == null) {
            this.errorList = null;
            return;
        }

        this.errorList = new java.util.ArrayList<BatchItemError>(errorList);
    }

    /**
     * <p>
     * List of errors that the operation can return.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorList(java.util.Collection)} or {@link #withErrorList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorList
     *        List of errors that the operation can return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectTargetedSentimentResult withErrorList(BatchItemError... errorList) {
        if (this.errorList == null) {
            setErrorList(new java.util.ArrayList<BatchItemError>(errorList.length));
        }
        for (BatchItemError ele : errorList) {
            this.errorList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of errors that the operation can return.
     * </p>
     * 
     * @param errorList
     *        List of errors that the operation can return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectTargetedSentimentResult withErrorList(java.util.Collection<BatchItemError> errorList) {
        setErrorList(errorList);
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
        if (getResultList() != null)
            sb.append("ResultList: ").append(getResultList()).append(",");
        if (getErrorList() != null)
            sb.append("ErrorList: ").append(getErrorList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectTargetedSentimentResult == false)
            return false;
        BatchDetectTargetedSentimentResult other = (BatchDetectTargetedSentimentResult) obj;
        if (other.getResultList() == null ^ this.getResultList() == null)
            return false;
        if (other.getResultList() != null && other.getResultList().equals(this.getResultList()) == false)
            return false;
        if (other.getErrorList() == null ^ this.getErrorList() == null)
            return false;
        if (other.getErrorList() != null && other.getErrorList().equals(this.getErrorList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultList() == null) ? 0 : getResultList().hashCode());
        hashCode = prime * hashCode + ((getErrorList() == null) ? 0 : getErrorList().hashCode());
        return hashCode;
    }

    @Override
    public BatchDetectTargetedSentimentResult clone() {
        try {
            return (BatchDetectTargetedSentimentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
