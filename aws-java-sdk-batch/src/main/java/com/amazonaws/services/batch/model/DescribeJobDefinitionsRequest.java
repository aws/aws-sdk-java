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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobDefinitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
     * </p>
     */
    private java.util.List<String> jobDefinitions;
    /**
     * <p>
     * The maximum number of results returned by <code>DescribeJobDefinitions</code> in paginated output. When this
     * parameter is used, <code>DescribeJobDefinitions</code> only returns <code>maxResults</code> results in a single
     * page along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     * seen by sending another <code>DescribeJobDefinitions</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>DescribeJobDefinitions</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name of the job definition to describe.
     * </p>
     */
    private String jobDefinitionName;
    /**
     * <p>
     * The status with which to filter job definitions.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeJobDefinitions</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * A list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @return A list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
     */

    public java.util.List<String> getJobDefinitions() {
        return jobDefinitions;
    }

    /**
     * <p>
     * A list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @param jobDefinitions
     *        A list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
     */

    public void setJobDefinitions(java.util.Collection<String> jobDefinitions) {
        if (jobDefinitions == null) {
            this.jobDefinitions = null;
            return;
        }

        this.jobDefinitions = new java.util.ArrayList<String>(jobDefinitions);
    }

    /**
     * <p>
     * A list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobDefinitions(java.util.Collection)} or {@link #withJobDefinitions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param jobDefinitions
     *        A list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobDefinitionsRequest withJobDefinitions(String... jobDefinitions) {
        if (this.jobDefinitions == null) {
            setJobDefinitions(new java.util.ArrayList<String>(jobDefinitions.length));
        }
        for (String ele : jobDefinitions) {
            this.jobDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @param jobDefinitions
     *        A list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobDefinitionsRequest withJobDefinitions(java.util.Collection<String> jobDefinitions) {
        setJobDefinitions(jobDefinitions);
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>DescribeJobDefinitions</code> in paginated output. When this
     * parameter is used, <code>DescribeJobDefinitions</code> only returns <code>maxResults</code> results in a single
     * page along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     * seen by sending another <code>DescribeJobDefinitions</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>DescribeJobDefinitions</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>DescribeJobDefinitions</code> in paginated output. When
     *        this parameter is used, <code>DescribeJobDefinitions</code> only returns <code>maxResults</code> results
     *        in a single page along with a <code>nextToken</code> response element. The remaining results of the
     *        initial request can be seen by sending another <code>DescribeJobDefinitions</code> request with the
     *        returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used,
     *        then <code>DescribeJobDefinitions</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>DescribeJobDefinitions</code> in paginated output. When this
     * parameter is used, <code>DescribeJobDefinitions</code> only returns <code>maxResults</code> results in a single
     * page along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     * seen by sending another <code>DescribeJobDefinitions</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>DescribeJobDefinitions</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of results returned by <code>DescribeJobDefinitions</code> in paginated output. When
     *         this parameter is used, <code>DescribeJobDefinitions</code> only returns <code>maxResults</code> results
     *         in a single page along with a <code>nextToken</code> response element. The remaining results of the
     *         initial request can be seen by sending another <code>DescribeJobDefinitions</code> request with the
     *         returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not
     *         used, then <code>DescribeJobDefinitions</code> returns up to 100 results and a <code>nextToken</code>
     *         value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>DescribeJobDefinitions</code> in paginated output. When this
     * parameter is used, <code>DescribeJobDefinitions</code> only returns <code>maxResults</code> results in a single
     * page along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     * seen by sending another <code>DescribeJobDefinitions</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>DescribeJobDefinitions</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>DescribeJobDefinitions</code> in paginated output. When
     *        this parameter is used, <code>DescribeJobDefinitions</code> only returns <code>maxResults</code> results
     *        in a single page along with a <code>nextToken</code> response element. The remaining results of the
     *        initial request can be seen by sending another <code>DescribeJobDefinitions</code> request with the
     *        returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used,
     *        then <code>DescribeJobDefinitions</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobDefinitionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name of the job definition to describe.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the job definition to describe.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name of the job definition to describe.
     * </p>
     * 
     * @return The name of the job definition to describe.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name of the job definition to describe.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the job definition to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobDefinitionsRequest withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
        return this;
    }

    /**
     * <p>
     * The status with which to filter job definitions.
     * </p>
     * 
     * @param status
     *        The status with which to filter job definitions.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status with which to filter job definitions.
     * </p>
     * 
     * @return The status with which to filter job definitions.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status with which to filter job definitions.
     * </p>
     * 
     * @param status
     *        The status with which to filter job definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobDefinitionsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeJobDefinitions</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>DescribeJobDefinitions</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     *        This value is <code>null</code> when there are no more results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeJobDefinitions</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>DescribeJobDefinitions</code>
     *         request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     *         This value is <code>null</code> when there are no more results to return.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeJobDefinitions</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>DescribeJobDefinitions</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     *        This value is <code>null</code> when there are no more results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobDefinitionsRequest withNextToken(String nextToken) {
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
        if (getJobDefinitions() != null)
            sb.append("JobDefinitions: ").append(getJobDefinitions()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getJobDefinitionName() != null)
            sb.append("JobDefinitionName: ").append(getJobDefinitionName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof DescribeJobDefinitionsRequest == false)
            return false;
        DescribeJobDefinitionsRequest other = (DescribeJobDefinitionsRequest) obj;
        if (other.getJobDefinitions() == null ^ this.getJobDefinitions() == null)
            return false;
        if (other.getJobDefinitions() != null && other.getJobDefinitions().equals(this.getJobDefinitions()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getJobDefinitionName() == null ^ this.getJobDefinitionName() == null)
            return false;
        if (other.getJobDefinitionName() != null && other.getJobDefinitionName().equals(this.getJobDefinitionName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getJobDefinitions() == null) ? 0 : getJobDefinitions().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getJobDefinitionName() == null) ? 0 : getJobDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobDefinitionsRequest clone() {
        return (DescribeJobDefinitionsRequest) super.clone();
    }

}
