/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListGatewayInstances" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGatewayInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A list of instance summaries. */
    private java.util.List<ListedGatewayInstance> instances;
    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListInstances
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListInstances request a second time and specify the NextToken
     * value.
     */
    private String nextToken;

    /**
     * A list of instance summaries.
     * 
     * @return A list of instance summaries.
     */

    public java.util.List<ListedGatewayInstance> getInstances() {
        return instances;
    }

    /**
     * A list of instance summaries.
     * 
     * @param instances
     *        A list of instance summaries.
     */

    public void setInstances(java.util.Collection<ListedGatewayInstance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<ListedGatewayInstance>(instances);
    }

    /**
     * A list of instance summaries.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        A list of instance summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayInstancesResult withInstances(ListedGatewayInstance... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<ListedGatewayInstance>(instances.length));
        }
        for (ListedGatewayInstance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * A list of instance summaries.
     * 
     * @param instances
     *        A list of instance summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayInstancesResult withInstances(java.util.Collection<ListedGatewayInstance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListInstances
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListInstances request a second time and specify the NextToken
     * value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        ListInstances request with MaxResults set at 5. The service returns the first batch of results (up to 5)
     *        and a NextToken value. To see the next batch of results, you can submit the ListInstances request a second
     *        time and specify the NextToken value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListInstances
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListInstances request a second time and specify the NextToken
     * value.
     * 
     * @return The token that identifies which batch of results that you want to see. For example, you submit a
     *         ListInstances request with MaxResults set at 5. The service returns the first batch of results (up to 5)
     *         and a NextToken value. To see the next batch of results, you can submit the ListInstances request a
     *         second time and specify the NextToken value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListInstances
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListInstances request a second time and specify the NextToken
     * value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        ListInstances request with MaxResults set at 5. The service returns the first batch of results (up to 5)
     *        and a NextToken value. To see the next batch of results, you can submit the ListInstances request a second
     *        time and specify the NextToken value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayInstancesResult withNextToken(String nextToken) {
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
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
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

        if (obj instanceof ListGatewayInstancesResult == false)
            return false;
        ListGatewayInstancesResult other = (ListGatewayInstancesResult) obj;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
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

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGatewayInstancesResult clone() {
        try {
            return (ListGatewayInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
