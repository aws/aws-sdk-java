/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    /** subscription definition Id */
    private String subscriptionDefinitionId;
    /** subscription definition version Id */
    private String subscriptionDefinitionVersionId;

    /**
     * subscription definition Id
     * 
     * @param subscriptionDefinitionId
     *        subscription definition Id
     */

    public void setSubscriptionDefinitionId(String subscriptionDefinitionId) {
        this.subscriptionDefinitionId = subscriptionDefinitionId;
    }

    /**
     * subscription definition Id
     * 
     * @return subscription definition Id
     */

    public String getSubscriptionDefinitionId() {
        return this.subscriptionDefinitionId;
    }

    /**
     * subscription definition Id
     * 
     * @param subscriptionDefinitionId
     *        subscription definition Id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionDefinitionVersionRequest withSubscriptionDefinitionId(String subscriptionDefinitionId) {
        setSubscriptionDefinitionId(subscriptionDefinitionId);
        return this;
    }

    /**
     * subscription definition version Id
     * 
     * @param subscriptionDefinitionVersionId
     *        subscription definition version Id
     */

    public void setSubscriptionDefinitionVersionId(String subscriptionDefinitionVersionId) {
        this.subscriptionDefinitionVersionId = subscriptionDefinitionVersionId;
    }

    /**
     * subscription definition version Id
     * 
     * @return subscription definition version Id
     */

    public String getSubscriptionDefinitionVersionId() {
        return this.subscriptionDefinitionVersionId;
    }

    /**
     * subscription definition version Id
     * 
     * @param subscriptionDefinitionVersionId
     *        subscription definition version Id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionDefinitionVersionRequest withSubscriptionDefinitionVersionId(String subscriptionDefinitionVersionId) {
        setSubscriptionDefinitionVersionId(subscriptionDefinitionVersionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
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

        hashCode = prime * hashCode + ((getSubscriptionDefinitionId() == null) ? 0 : getSubscriptionDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionDefinitionVersionId() == null) ? 0 : getSubscriptionDefinitionVersionId().hashCode());
        return hashCode;
    }

    @Override
    public GetSubscriptionDefinitionVersionRequest clone() {
        return (GetSubscriptionDefinitionVersionRequest) super.clone();
    }

}
