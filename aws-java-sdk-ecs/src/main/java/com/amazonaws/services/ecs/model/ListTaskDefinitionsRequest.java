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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListTaskDefinitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTaskDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The full family name with which to filter the <code>ListTaskDefinitions</code> results. Specifying a
     * <code>familyPrefix</code> limits the listed task definitions to task definition revisions that belong to that
     * family.
     * </p>
     */
    private String familyPrefix;
    /**
     * <p>
     * The task definition status with which to filter the <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this parameter to <code>INACTIVE</code>, you can view
     * task definitions that are <code>INACTIVE</code> as long as an active task or service still references them. If
     * you paginate the resulting output, be sure to keep the <code>status</code> value constant in each subsequent
     * request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code> and <code>DESC</code>. By default (
     * <code>ASC</code>), task definitions are listed lexicographically by family name and in ascending numerical order
     * by revision so that the newest task definitions in a family are listed last. Setting this parameter to
     * <code>DESC</code> reverses the sort order on family name and revision so that the newest task definitions in a
     * family are listed first.
     * </p>
     */
    private String sort;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTaskDefinitions</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
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
     * The maximum number of task definition results returned by <code>ListTaskDefinitions</code> in paginated output.
     * When this parameter is used, <code>ListTaskDefinitions</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListTaskDefinitions</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then <code>ListTaskDefinitions</code>
     * returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The full family name with which to filter the <code>ListTaskDefinitions</code> results. Specifying a
     * <code>familyPrefix</code> limits the listed task definitions to task definition revisions that belong to that
     * family.
     * </p>
     * 
     * @param familyPrefix
     *        The full family name with which to filter the <code>ListTaskDefinitions</code> results. Specifying a
     *        <code>familyPrefix</code> limits the listed task definitions to task definition revisions that belong to
     *        that family.
     */

    public void setFamilyPrefix(String familyPrefix) {
        this.familyPrefix = familyPrefix;
    }

    /**
     * <p>
     * The full family name with which to filter the <code>ListTaskDefinitions</code> results. Specifying a
     * <code>familyPrefix</code> limits the listed task definitions to task definition revisions that belong to that
     * family.
     * </p>
     * 
     * @return The full family name with which to filter the <code>ListTaskDefinitions</code> results. Specifying a
     *         <code>familyPrefix</code> limits the listed task definitions to task definition revisions that belong to
     *         that family.
     */

    public String getFamilyPrefix() {
        return this.familyPrefix;
    }

    /**
     * <p>
     * The full family name with which to filter the <code>ListTaskDefinitions</code> results. Specifying a
     * <code>familyPrefix</code> limits the listed task definitions to task definition revisions that belong to that
     * family.
     * </p>
     * 
     * @param familyPrefix
     *        The full family name with which to filter the <code>ListTaskDefinitions</code> results. Specifying a
     *        <code>familyPrefix</code> limits the listed task definitions to task definition revisions that belong to
     *        that family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskDefinitionsRequest withFamilyPrefix(String familyPrefix) {
        setFamilyPrefix(familyPrefix);
        return this;
    }

    /**
     * <p>
     * The task definition status with which to filter the <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this parameter to <code>INACTIVE</code>, you can view
     * task definitions that are <code>INACTIVE</code> as long as an active task or service still references them. If
     * you paginate the resulting output, be sure to keep the <code>status</code> value constant in each subsequent
     * request.
     * </p>
     * 
     * @param status
     *        The task definition status with which to filter the <code>ListTaskDefinitions</code> results. By default,
     *        only <code>ACTIVE</code> task definitions are listed. By setting this parameter to <code>INACTIVE</code>,
     *        you can view task definitions that are <code>INACTIVE</code> as long as an active task or service still
     *        references them. If you paginate the resulting output, be sure to keep the <code>status</code> value
     *        constant in each subsequent request.
     * @see TaskDefinitionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The task definition status with which to filter the <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this parameter to <code>INACTIVE</code>, you can view
     * task definitions that are <code>INACTIVE</code> as long as an active task or service still references them. If
     * you paginate the resulting output, be sure to keep the <code>status</code> value constant in each subsequent
     * request.
     * </p>
     * 
     * @return The task definition status with which to filter the <code>ListTaskDefinitions</code> results. By default,
     *         only <code>ACTIVE</code> task definitions are listed. By setting this parameter to <code>INACTIVE</code>,
     *         you can view task definitions that are <code>INACTIVE</code> as long as an active task or service still
     *         references them. If you paginate the resulting output, be sure to keep the <code>status</code> value
     *         constant in each subsequent request.
     * @see TaskDefinitionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The task definition status with which to filter the <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this parameter to <code>INACTIVE</code>, you can view
     * task definitions that are <code>INACTIVE</code> as long as an active task or service still references them. If
     * you paginate the resulting output, be sure to keep the <code>status</code> value constant in each subsequent
     * request.
     * </p>
     * 
     * @param status
     *        The task definition status with which to filter the <code>ListTaskDefinitions</code> results. By default,
     *        only <code>ACTIVE</code> task definitions are listed. By setting this parameter to <code>INACTIVE</code>,
     *        you can view task definitions that are <code>INACTIVE</code> as long as an active task or service still
     *        references them. If you paginate the resulting output, be sure to keep the <code>status</code> value
     *        constant in each subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskDefinitionStatus
     */

    public ListTaskDefinitionsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The task definition status with which to filter the <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this parameter to <code>INACTIVE</code>, you can view
     * task definitions that are <code>INACTIVE</code> as long as an active task or service still references them. If
     * you paginate the resulting output, be sure to keep the <code>status</code> value constant in each subsequent
     * request.
     * </p>
     * 
     * @param status
     *        The task definition status with which to filter the <code>ListTaskDefinitions</code> results. By default,
     *        only <code>ACTIVE</code> task definitions are listed. By setting this parameter to <code>INACTIVE</code>,
     *        you can view task definitions that are <code>INACTIVE</code> as long as an active task or service still
     *        references them. If you paginate the resulting output, be sure to keep the <code>status</code> value
     *        constant in each subsequent request.
     * @see TaskDefinitionStatus
     */

    public void setStatus(TaskDefinitionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The task definition status with which to filter the <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this parameter to <code>INACTIVE</code>, you can view
     * task definitions that are <code>INACTIVE</code> as long as an active task or service still references them. If
     * you paginate the resulting output, be sure to keep the <code>status</code> value constant in each subsequent
     * request.
     * </p>
     * 
     * @param status
     *        The task definition status with which to filter the <code>ListTaskDefinitions</code> results. By default,
     *        only <code>ACTIVE</code> task definitions are listed. By setting this parameter to <code>INACTIVE</code>,
     *        you can view task definitions that are <code>INACTIVE</code> as long as an active task or service still
     *        references them. If you paginate the resulting output, be sure to keep the <code>status</code> value
     *        constant in each subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskDefinitionStatus
     */

    public ListTaskDefinitionsRequest withStatus(TaskDefinitionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code> and <code>DESC</code>. By default (
     * <code>ASC</code>), task definitions are listed lexicographically by family name and in ascending numerical order
     * by revision so that the newest task definitions in a family are listed last. Setting this parameter to
     * <code>DESC</code> reverses the sort order on family name and revision so that the newest task definitions in a
     * family are listed first.
     * </p>
     * 
     * @param sort
     *        The order in which to sort the results. Valid values are <code>ASC</code> and <code>DESC</code>. By
     *        default (<code>ASC</code>), task definitions are listed lexicographically by family name and in ascending
     *        numerical order by revision so that the newest task definitions in a family are listed last. Setting this
     *        parameter to <code>DESC</code> reverses the sort order on family name and revision so that the newest task
     *        definitions in a family are listed first.
     * @see SortOrder
     */

    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code> and <code>DESC</code>. By default (
     * <code>ASC</code>), task definitions are listed lexicographically by family name and in ascending numerical order
     * by revision so that the newest task definitions in a family are listed last. Setting this parameter to
     * <code>DESC</code> reverses the sort order on family name and revision so that the newest task definitions in a
     * family are listed first.
     * </p>
     * 
     * @return The order in which to sort the results. Valid values are <code>ASC</code> and <code>DESC</code>. By
     *         default (<code>ASC</code>), task definitions are listed lexicographically by family name and in ascending
     *         numerical order by revision so that the newest task definitions in a family are listed last. Setting this
     *         parameter to <code>DESC</code> reverses the sort order on family name and revision so that the newest
     *         task definitions in a family are listed first.
     * @see SortOrder
     */

    public String getSort() {
        return this.sort;
    }

    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code> and <code>DESC</code>. By default (
     * <code>ASC</code>), task definitions are listed lexicographically by family name and in ascending numerical order
     * by revision so that the newest task definitions in a family are listed last. Setting this parameter to
     * <code>DESC</code> reverses the sort order on family name and revision so that the newest task definitions in a
     * family are listed first.
     * </p>
     * 
     * @param sort
     *        The order in which to sort the results. Valid values are <code>ASC</code> and <code>DESC</code>. By
     *        default (<code>ASC</code>), task definitions are listed lexicographically by family name and in ascending
     *        numerical order by revision so that the newest task definitions in a family are listed last. Setting this
     *        parameter to <code>DESC</code> reverses the sort order on family name and revision so that the newest task
     *        definitions in a family are listed first.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListTaskDefinitionsRequest withSort(String sort) {
        setSort(sort);
        return this;
    }

    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code> and <code>DESC</code>. By default (
     * <code>ASC</code>), task definitions are listed lexicographically by family name and in ascending numerical order
     * by revision so that the newest task definitions in a family are listed last. Setting this parameter to
     * <code>DESC</code> reverses the sort order on family name and revision so that the newest task definitions in a
     * family are listed first.
     * </p>
     * 
     * @param sort
     *        The order in which to sort the results. Valid values are <code>ASC</code> and <code>DESC</code>. By
     *        default (<code>ASC</code>), task definitions are listed lexicographically by family name and in ascending
     *        numerical order by revision so that the newest task definitions in a family are listed last. Setting this
     *        parameter to <code>DESC</code> reverses the sort order on family name and revision so that the newest task
     *        definitions in a family are listed first.
     * @see SortOrder
     */

    public void setSort(SortOrder sort) {
        withSort(sort);
    }

    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code> and <code>DESC</code>. By default (
     * <code>ASC</code>), task definitions are listed lexicographically by family name and in ascending numerical order
     * by revision so that the newest task definitions in a family are listed last. Setting this parameter to
     * <code>DESC</code> reverses the sort order on family name and revision so that the newest task definitions in a
     * family are listed first.
     * </p>
     * 
     * @param sort
     *        The order in which to sort the results. Valid values are <code>ASC</code> and <code>DESC</code>. By
     *        default (<code>ASC</code>), task definitions are listed lexicographically by family name and in ascending
     *        numerical order by revision so that the newest task definitions in a family are listed last. Setting this
     *        parameter to <code>DESC</code> reverses the sort order on family name and revision so that the newest task
     *        definitions in a family are listed first.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListTaskDefinitionsRequest withSort(SortOrder sort) {
        this.sort = sort.toString();
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTaskDefinitions</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListTaskDefinitions</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code>
     *        value.</p> <note>
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
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTaskDefinitions</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListTaskDefinitions</code>
     *         request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that returned the <code>nextToken</code>
     *         value.</p> <note>
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
     * The <code>nextToken</code> value returned from a previous paginated <code>ListTaskDefinitions</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListTaskDefinitions</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code>
     *        value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskDefinitionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of task definition results returned by <code>ListTaskDefinitions</code> in paginated output.
     * When this parameter is used, <code>ListTaskDefinitions</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListTaskDefinitions</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then <code>ListTaskDefinitions</code>
     * returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of task definition results returned by <code>ListTaskDefinitions</code> in paginated
     *        output. When this parameter is used, <code>ListTaskDefinitions</code> only returns <code>maxResults</code>
     *        results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>ListTaskDefinitions</code> request with the
     *        returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used,
     *        then <code>ListTaskDefinitions</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of task definition results returned by <code>ListTaskDefinitions</code> in paginated output.
     * When this parameter is used, <code>ListTaskDefinitions</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListTaskDefinitions</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then <code>ListTaskDefinitions</code>
     * returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of task definition results returned by <code>ListTaskDefinitions</code> in paginated
     *         output. When this parameter is used, <code>ListTaskDefinitions</code> only returns
     *         <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>ListTaskDefinitions</code> request with the returned <code>nextToken</code> value. This value can
     *         be between 1 and 100. If this parameter is not used, then <code>ListTaskDefinitions</code> returns up to
     *         100 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of task definition results returned by <code>ListTaskDefinitions</code> in paginated output.
     * When this parameter is used, <code>ListTaskDefinitions</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListTaskDefinitions</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 100. If this parameter is not used, then <code>ListTaskDefinitions</code>
     * returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of task definition results returned by <code>ListTaskDefinitions</code> in paginated
     *        output. When this parameter is used, <code>ListTaskDefinitions</code> only returns <code>maxResults</code>
     *        results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>ListTaskDefinitions</code> request with the
     *        returned <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used,
     *        then <code>ListTaskDefinitions</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskDefinitionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getFamilyPrefix() != null)
            sb.append("FamilyPrefix: ").append(getFamilyPrefix()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTaskDefinitionsRequest == false)
            return false;
        ListTaskDefinitionsRequest other = (ListTaskDefinitionsRequest) obj;
        if (other.getFamilyPrefix() == null ^ this.getFamilyPrefix() == null)
            return false;
        if (other.getFamilyPrefix() != null && other.getFamilyPrefix().equals(this.getFamilyPrefix()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFamilyPrefix() == null) ? 0 : getFamilyPrefix().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTaskDefinitionsRequest clone() {
        return (ListTaskDefinitionsRequest) super.clone();
    }

}
