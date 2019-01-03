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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoutingProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select
     * Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in
     * the Overview section of your instance settings. For example, the instance ID is the set of characters at the end
     * of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of routing profiles to return in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select
     * Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in
     * the Overview section of your instance settings. For example, the instance ID is the set of characters at the end
     * of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * 
     * @param instanceId
     *        The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and
     *        select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is
     *        displayed in the Overview section of your instance settings. For example, the instance ID is the set of
     *        characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select
     * Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in
     * the Overview section of your instance settings. For example, the instance ID is the set of characters at the end
     * of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * 
     * @return The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console
     *         and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID
     *         is displayed in the Overview section of your instance settings. For example, the instance ID is the set
     *         of characters at the end of the instance ARN, after instance/, such as
     *         10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select
     * Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in
     * the Overview section of your instance settings. For example, the instance ID is the set of characters at the end
     * of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * 
     * @param instanceId
     *        The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and
     *        select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is
     *        displayed in the Overview section of your instance settings. For example, the instance ID is the set of
     *        characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingProfilesRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingProfilesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of routing profiles to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of routing profiles to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of routing profiles to return in the response.
     * </p>
     * 
     * @return The maximum number of routing profiles to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of routing profiles to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of routing profiles to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingProfilesRequest withMaxResults(Integer maxResults) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
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

        if (obj instanceof ListRoutingProfilesRequest == false)
            return false;
        ListRoutingProfilesRequest other = (ListRoutingProfilesRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListRoutingProfilesRequest clone() {
        return (ListRoutingProfilesRequest) super.clone();
    }

}
