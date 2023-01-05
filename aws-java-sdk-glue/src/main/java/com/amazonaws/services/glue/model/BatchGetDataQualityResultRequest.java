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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetDataQualityResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDataQualityResultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of unique result IDs for the data quality results.
     * </p>
     */
    private java.util.List<String> resultIds;

    /**
     * <p>
     * A list of unique result IDs for the data quality results.
     * </p>
     * 
     * @return A list of unique result IDs for the data quality results.
     */

    public java.util.List<String> getResultIds() {
        return resultIds;
    }

    /**
     * <p>
     * A list of unique result IDs for the data quality results.
     * </p>
     * 
     * @param resultIds
     *        A list of unique result IDs for the data quality results.
     */

    public void setResultIds(java.util.Collection<String> resultIds) {
        if (resultIds == null) {
            this.resultIds = null;
            return;
        }

        this.resultIds = new java.util.ArrayList<String>(resultIds);
    }

    /**
     * <p>
     * A list of unique result IDs for the data quality results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultIds(java.util.Collection)} or {@link #withResultIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resultIds
     *        A list of unique result IDs for the data quality results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDataQualityResultRequest withResultIds(String... resultIds) {
        if (this.resultIds == null) {
            setResultIds(new java.util.ArrayList<String>(resultIds.length));
        }
        for (String ele : resultIds) {
            this.resultIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of unique result IDs for the data quality results.
     * </p>
     * 
     * @param resultIds
     *        A list of unique result IDs for the data quality results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDataQualityResultRequest withResultIds(java.util.Collection<String> resultIds) {
        setResultIds(resultIds);
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
        if (getResultIds() != null)
            sb.append("ResultIds: ").append(getResultIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDataQualityResultRequest == false)
            return false;
        BatchGetDataQualityResultRequest other = (BatchGetDataQualityResultRequest) obj;
        if (other.getResultIds() == null ^ this.getResultIds() == null)
            return false;
        if (other.getResultIds() != null && other.getResultIds().equals(this.getResultIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultIds() == null) ? 0 : getResultIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDataQualityResultRequest clone() {
        return (BatchGetDataQualityResultRequest) super.clone();
    }

}
