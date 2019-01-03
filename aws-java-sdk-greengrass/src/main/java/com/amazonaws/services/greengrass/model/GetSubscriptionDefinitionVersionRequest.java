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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetSubscriptionDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSubscriptionDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The token for the next set of results, or ''null'' if there are no additional results. */
    private String nextToken;
    /** The ID of the subscription definition. */
    private String subscriptionDefinitionId;
    /** The ID of the subscription definition version. */
    private String subscriptionDefinitionVersionId;

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @return The token for the next set of results, or ''null'' if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionDefinitionVersionRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * The ID of the subscription definition.
     * 
     * @param subscriptionDefinitionId
     *        The ID of the subscription definition.
     */

    public void setSubscriptionDefinitionId(String subscriptionDefinitionId) {
        this.subscriptionDefinitionId = subscriptionDefinitionId;
    }

    /**
     * The ID of the subscription definition.
     * 
     * @return The ID of the subscription definition.
     */

    public String getSubscriptionDefinitionId() {
        return this.subscriptionDefinitionId;
    }

    /**
     * The ID of the subscription definition.
     * 
     * @param subscriptionDefinitionId
     *        The ID of the subscription definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionDefinitionVersionRequest withSubscriptionDefinitionId(String subscriptionDefinitionId) {
        setSubscriptionDefinitionId(subscriptionDefinitionId);
        return this;
    }

    /**
     * The ID of the subscription definition version.
     * 
     * @param subscriptionDefinitionVersionId
     *        The ID of the subscription definition version.
     */

    public void setSubscriptionDefinitionVersionId(String subscriptionDefinitionVersionId) {
        this.subscriptionDefinitionVersionId = subscriptionDefinitionVersionId;
    }

    /**
     * The ID of the subscription definition version.
     * 
     * @return The ID of the subscription definition version.
     */

    public String getSubscriptionDefinitionVersionId() {
        return this.subscriptionDefinitionVersionId;
    }

    /**
     * The ID of the subscription definition version.
     * 
     * @param subscriptionDefinitionVersionId
     *        The ID of the subscription definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionDefinitionVersionRequest withSubscriptionDefinitionVersionId(String subscriptionDefinitionVersionId) {
        setSubscriptionDefinitionVersionId(subscriptionDefinitionVersionId);
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
        if (getSubscriptionDefinitionId() != null)
            sb.append("SubscriptionDefinitionId: ").append(getSubscriptionDefinitionId()).append(",");
        if (getSubscriptionDefinitionVersionId() != null)
            sb.append("SubscriptionDefinitionVersionId: ").append(getSubscriptionDefinitionVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSubscriptionDefinitionVersionRequest == false)
            return false;
        GetSubscriptionDefinitionVersionRequest other = (GetSubscriptionDefinitionVersionRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSubscriptionDefinitionId() == null ^ this.getSubscriptionDefinitionId() == null)
            return false;
        if (other.getSubscriptionDefinitionId() != null && other.getSubscriptionDefinitionId().equals(this.getSubscriptionDefinitionId()) == false)
            return false;
        if (other.getSubscriptionDefinitionVersionId() == null ^ this.getSubscriptionDefinitionVersionId() == null)
            return false;
        if (other.getSubscriptionDefinitionVersionId() != null
                && other.getSubscriptionDefinitionVersionId().equals(this.getSubscriptionDefinitionVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionDefinitionId() == null) ? 0 : getSubscriptionDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionDefinitionVersionId() == null) ? 0 : getSubscriptionDefinitionVersionId().hashCode());
        return hashCode;
    }

    @Override
    public GetSubscriptionDefinitionVersionRequest clone() {
        return (GetSubscriptionDefinitionVersionRequest) super.clone();
    }

}
