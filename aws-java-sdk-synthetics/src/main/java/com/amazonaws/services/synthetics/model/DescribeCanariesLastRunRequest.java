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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeCanariesLastRun" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCanariesLastRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specify this parameter to limit how many runs are returned each time you use the <code>DescribeLastRun</code>
     * operation. If you omit this parameter, the default of 100 is used.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Use this parameter to return only canaries that match the names that you specify here. You can specify as many as
     * five canary names.
     * </p>
     * <p>
     * If you specify this parameter, the operation is successful only if you have authorization to view all the
     * canaries that you specify in your request. If you do not have permission to view any of the canaries, the request
     * fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     */
    private java.util.List<String> names;

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that indicates that there is more data available. You can use this token in a subsequent
     *         <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCanariesLastRunRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specify this parameter to limit how many runs are returned each time you use the <code>DescribeLastRun</code>
     * operation. If you omit this parameter, the default of 100 is used.
     * </p>
     * 
     * @param maxResults
     *        Specify this parameter to limit how many runs are returned each time you use the
     *        <code>DescribeLastRun</code> operation. If you omit this parameter, the default of 100 is used.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specify this parameter to limit how many runs are returned each time you use the <code>DescribeLastRun</code>
     * operation. If you omit this parameter, the default of 100 is used.
     * </p>
     * 
     * @return Specify this parameter to limit how many runs are returned each time you use the
     *         <code>DescribeLastRun</code> operation. If you omit this parameter, the default of 100 is used.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specify this parameter to limit how many runs are returned each time you use the <code>DescribeLastRun</code>
     * operation. If you omit this parameter, the default of 100 is used.
     * </p>
     * 
     * @param maxResults
     *        Specify this parameter to limit how many runs are returned each time you use the
     *        <code>DescribeLastRun</code> operation. If you omit this parameter, the default of 100 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCanariesLastRunRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Use this parameter to return only canaries that match the names that you specify here. You can specify as many as
     * five canary names.
     * </p>
     * <p>
     * If you specify this parameter, the operation is successful only if you have authorization to view all the
     * canaries that you specify in your request. If you do not have permission to view any of the canaries, the request
     * fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * 
     * @return Use this parameter to return only canaries that match the names that you specify here. You can specify as
     *         many as five canary names.</p>
     *         <p>
     *         If you specify this parameter, the operation is successful only if you have authorization to view all the
     *         canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     *         request fails with a 403 response.
     *         </p>
     *         <p>
     *         You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has
     *         an IAM policy that restricts which canaries that you are allowed to view. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html"
     *         > Limiting a user to viewing specific canaries</a>.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * Use this parameter to return only canaries that match the names that you specify here. You can specify as many as
     * five canary names.
     * </p>
     * <p>
     * If you specify this parameter, the operation is successful only if you have authorization to view all the
     * canaries that you specify in your request. If you do not have permission to view any of the canaries, the request
     * fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * 
     * @param names
     *        Use this parameter to return only canaries that match the names that you specify here. You can specify as
     *        many as five canary names.</p>
     *        <p>
     *        If you specify this parameter, the operation is successful only if you have authorization to view all the
     *        canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     *        request fails with a 403 response.
     *        </p>
     *        <p>
     *        You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has
     *        an IAM policy that restricts which canaries that you are allowed to view. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html"
     *        > Limiting a user to viewing specific canaries</a>.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * Use this parameter to return only canaries that match the names that you specify here. You can specify as many as
     * five canary names.
     * </p>
     * <p>
     * If you specify this parameter, the operation is successful only if you have authorization to view all the
     * canaries that you specify in your request. If you do not have permission to view any of the canaries, the request
     * fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        Use this parameter to return only canaries that match the names that you specify here. You can specify as
     *        many as five canary names.</p>
     *        <p>
     *        If you specify this parameter, the operation is successful only if you have authorization to view all the
     *        canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     *        request fails with a 403 response.
     *        </p>
     *        <p>
     *        You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has
     *        an IAM policy that restricts which canaries that you are allowed to view. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html"
     *        > Limiting a user to viewing specific canaries</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCanariesLastRunRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Use this parameter to return only canaries that match the names that you specify here. You can specify as many as
     * five canary names.
     * </p>
     * <p>
     * If you specify this parameter, the operation is successful only if you have authorization to view all the
     * canaries that you specify in your request. If you do not have permission to view any of the canaries, the request
     * fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * 
     * @param names
     *        Use this parameter to return only canaries that match the names that you specify here. You can specify as
     *        many as five canary names.</p>
     *        <p>
     *        If you specify this parameter, the operation is successful only if you have authorization to view all the
     *        canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     *        request fails with a 403 response.
     *        </p>
     *        <p>
     *        You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has
     *        an IAM policy that restricts which canaries that you are allowed to view. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html"
     *        > Limiting a user to viewing specific canaries</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCanariesLastRunRequest withNames(java.util.Collection<String> names) {
        setNames(names);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNames() != null)
            sb.append("Names: ").append(getNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCanariesLastRunRequest == false)
            return false;
        DescribeCanariesLastRunRequest other = (DescribeCanariesLastRunRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCanariesLastRunRequest clone() {
        return (DescribeCanariesLastRunRequest) super.clone();
    }

}
