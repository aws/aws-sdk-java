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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataQualityResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataQualityResultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique result ID for the data quality result.
     * </p>
     */
    private String resultId;

    /**
     * <p>
     * A unique result ID for the data quality result.
     * </p>
     * 
     * @param resultId
     *        A unique result ID for the data quality result.
     */

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    /**
     * <p>
     * A unique result ID for the data quality result.
     * </p>
     * 
     * @return A unique result ID for the data quality result.
     */

    public String getResultId() {
        return this.resultId;
    }

    /**
     * <p>
     * A unique result ID for the data quality result.
     * </p>
     * 
     * @param resultId
     *        A unique result ID for the data quality result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityResultRequest withResultId(String resultId) {
        setResultId(resultId);
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
        if (getResultId() != null)
            sb.append("ResultId: ").append(getResultId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataQualityResultRequest == false)
            return false;
        GetDataQualityResultRequest other = (GetDataQualityResultRequest) obj;
        if (other.getResultId() == null ^ this.getResultId() == null)
            return false;
        if (other.getResultId() != null && other.getResultId().equals(this.getResultId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultId() == null) ? 0 : getResultId().hashCode());
        return hashCode;
    }

    @Override
    public GetDataQualityResultRequest clone() {
        return (GetDataQualityResultRequest) super.clone();
    }

}
