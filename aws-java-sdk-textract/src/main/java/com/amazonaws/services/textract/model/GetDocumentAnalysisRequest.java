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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetDocumentAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDocumentAnalysisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the text-detection job. The <code>JobId</code> is returned from
     * <code>StartDocumentAnalysis</code>.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value that you can specify is 1,000. If
     * you specify a value greater than 1,000, a maximum of 1,000 results is returned. The default value is 1,000.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous response was incomplete (because there are more blocks to retrieve), Amazon Textract returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of blocks.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A unique identifier for the text-detection job. The <code>JobId</code> is returned from
     * <code>StartDocumentAnalysis</code>.
     * </p>
     * 
     * @param jobId
     *        A unique identifier for the text-detection job. The <code>JobId</code> is returned from
     *        <code>StartDocumentAnalysis</code>.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * A unique identifier for the text-detection job. The <code>JobId</code> is returned from
     * <code>StartDocumentAnalysis</code>.
     * </p>
     * 
     * @return A unique identifier for the text-detection job. The <code>JobId</code> is returned from
     *         <code>StartDocumentAnalysis</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * A unique identifier for the text-detection job. The <code>JobId</code> is returned from
     * <code>StartDocumentAnalysis</code>.
     * </p>
     * 
     * @param jobId
     *        A unique identifier for the text-detection job. The <code>JobId</code> is returned from
     *        <code>StartDocumentAnalysis</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentAnalysisRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value that you can specify is 1,000. If
     * you specify a value greater than 1,000, a maximum of 1,000 results is returned. The default value is 1,000.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per paginated call. The largest value that you can specify is
     *        1,000. If you specify a value greater than 1,000, a maximum of 1,000 results is returned. The default
     *        value is 1,000.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value that you can specify is 1,000. If
     * you specify a value greater than 1,000, a maximum of 1,000 results is returned. The default value is 1,000.
     * </p>
     * 
     * @return The maximum number of results to return per paginated call. The largest value that you can specify is
     *         1,000. If you specify a value greater than 1,000, a maximum of 1,000 results is returned. The default
     *         value is 1,000.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value that you can specify is 1,000. If
     * you specify a value greater than 1,000, a maximum of 1,000 results is returned. The default value is 1,000.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per paginated call. The largest value that you can specify is
     *        1,000. If you specify a value greater than 1,000, a maximum of 1,000 results is returned. The default
     *        value is 1,000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentAnalysisRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more blocks to retrieve), Amazon Textract returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of blocks.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there are more blocks to retrieve), Amazon Textract
     *        returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *        blocks.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more blocks to retrieve), Amazon Textract returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of blocks.
     * </p>
     * 
     * @return If the previous response was incomplete (because there are more blocks to retrieve), Amazon Textract
     *         returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *         blocks.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more blocks to retrieve), Amazon Textract returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of blocks.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there are more blocks to retrieve), Amazon Textract
     *        returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *        blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentAnalysisRequest withNextToken(String nextToken) {
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetDocumentAnalysisRequest == false)
            return false;
        GetDocumentAnalysisRequest other = (GetDocumentAnalysisRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDocumentAnalysisRequest clone() {
        return (GetDocumentAnalysisRequest) super.clone();
    }

}
