/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProjectVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that contains the models you want to describe.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * A list of model version names that you want to describe. You can add up to 10 model version names to the list. If
     * you don't specify a value, all model descriptions are returned.
     * </p>
     */
    private java.util.List<String> versionNames;
    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that contains the models you want to describe.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project that contains the models you want to describe.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that contains the models you want to describe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project that contains the models you want to describe.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that contains the models you want to describe.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project that contains the models you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectVersionsRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * A list of model version names that you want to describe. You can add up to 10 model version names to the list. If
     * you don't specify a value, all model descriptions are returned.
     * </p>
     * 
     * @return A list of model version names that you want to describe. You can add up to 10 model version names to the
     *         list. If you don't specify a value, all model descriptions are returned.
     */

    public java.util.List<String> getVersionNames() {
        return versionNames;
    }

    /**
     * <p>
     * A list of model version names that you want to describe. You can add up to 10 model version names to the list. If
     * you don't specify a value, all model descriptions are returned.
     * </p>
     * 
     * @param versionNames
     *        A list of model version names that you want to describe. You can add up to 10 model version names to the
     *        list. If you don't specify a value, all model descriptions are returned.
     */

    public void setVersionNames(java.util.Collection<String> versionNames) {
        if (versionNames == null) {
            this.versionNames = null;
            return;
        }

        this.versionNames = new java.util.ArrayList<String>(versionNames);
    }

    /**
     * <p>
     * A list of model version names that you want to describe. You can add up to 10 model version names to the list. If
     * you don't specify a value, all model descriptions are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersionNames(java.util.Collection)} or {@link #withVersionNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param versionNames
     *        A list of model version names that you want to describe. You can add up to 10 model version names to the
     *        list. If you don't specify a value, all model descriptions are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectVersionsRequest withVersionNames(String... versionNames) {
        if (this.versionNames == null) {
            setVersionNames(new java.util.ArrayList<String>(versionNames.length));
        }
        for (String ele : versionNames) {
            this.versionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of model version names that you want to describe. You can add up to 10 model version names to the list. If
     * you don't specify a value, all model descriptions are returned.
     * </p>
     * 
     * @param versionNames
     *        A list of model version names that you want to describe. You can add up to 10 model version names to the
     *        list. If you don't specify a value, all model descriptions are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectVersionsRequest withVersionNames(java.util.Collection<String> versionNames) {
        setVersionNames(versionNames);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *        Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *        the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *         Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *         the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *        Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *        the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per paginated call. The largest value you can specify is 100. If
     *        you specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     * 
     * @return The maximum number of results to return per paginated call. The largest value you can specify is 100. If
     *         you specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per paginated call. The largest value you can specify is 100. If
     *        you specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectVersionsRequest withMaxResults(Integer maxResults) {
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getVersionNames() != null)
            sb.append("VersionNames: ").append(getVersionNames()).append(",");
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

        if (obj instanceof DescribeProjectVersionsRequest == false)
            return false;
        DescribeProjectVersionsRequest other = (DescribeProjectVersionsRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getVersionNames() == null ^ this.getVersionNames() == null)
            return false;
        if (other.getVersionNames() != null && other.getVersionNames().equals(this.getVersionNames()) == false)
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

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getVersionNames() == null) ? 0 : getVersionNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProjectVersionsRequest clone() {
        return (DescribeProjectVersionsRequest) super.clone();
    }

}
