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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppVersionResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * The version of the application.
     * </p>
     */
    private String appVersion;
    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier for a specific resolution.
     * </p>
     */
    private String resolutionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *         about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *         Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionResourcesRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersion
     *        The version of the application.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @return The version of the application.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersion
     *        The version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionResourcesRequest withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @return The maximum number of results to include in the response. If more results exist than the specified
     *         <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *         retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Null, or the token from a previous call to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @return Null, or the token from a previous call to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Null, or the token from a previous call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionResourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier for a specific resolution.
     * </p>
     * 
     * @param resolutionId
     *        The identifier for a specific resolution.
     */

    public void setResolutionId(String resolutionId) {
        this.resolutionId = resolutionId;
    }

    /**
     * <p>
     * The identifier for a specific resolution.
     * </p>
     * 
     * @return The identifier for a specific resolution.
     */

    public String getResolutionId() {
        return this.resolutionId;
    }

    /**
     * <p>
     * The identifier for a specific resolution.
     * </p>
     * 
     * @param resolutionId
     *        The identifier for a specific resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionResourcesRequest withResolutionId(String resolutionId) {
        setResolutionId(resolutionId);
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResolutionId() != null)
            sb.append("ResolutionId: ").append(getResolutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppVersionResourcesRequest == false)
            return false;
        ListAppVersionResourcesRequest other = (ListAppVersionResourcesRequest) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResolutionId() == null ^ this.getResolutionId() == null)
            return false;
        if (other.getResolutionId() != null && other.getResolutionId().equals(this.getResolutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResolutionId() == null) ? 0 : getResolutionId().hashCode());
        return hashCode;
    }

    @Override
    public ListAppVersionResourcesRequest clone() {
        return (ListAppVersionResourcesRequest) super.clone();
    }

}
