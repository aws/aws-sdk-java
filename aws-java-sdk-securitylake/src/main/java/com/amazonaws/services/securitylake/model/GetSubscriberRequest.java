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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetSubscriber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSubscriberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A value created by Amazon Security Lake that uniquely identifies your <code>GetSubscriber</code> API request.
     * </p>
     */
    private String subscriberId;

    /**
     * <p>
     * A value created by Amazon Security Lake that uniquely identifies your <code>GetSubscriber</code> API request.
     * </p>
     * 
     * @param subscriberId
     *        A value created by Amazon Security Lake that uniquely identifies your <code>GetSubscriber</code> API
     *        request.
     */

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    /**
     * <p>
     * A value created by Amazon Security Lake that uniquely identifies your <code>GetSubscriber</code> API request.
     * </p>
     * 
     * @return A value created by Amazon Security Lake that uniquely identifies your <code>GetSubscriber</code> API
     *         request.
     */

    public String getSubscriberId() {
        return this.subscriberId;
    }

    /**
     * <p>
     * A value created by Amazon Security Lake that uniquely identifies your <code>GetSubscriber</code> API request.
     * </p>
     * 
     * @param subscriberId
     *        A value created by Amazon Security Lake that uniquely identifies your <code>GetSubscriber</code> API
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriberRequest withSubscriberId(String subscriberId) {
        setSubscriberId(subscriberId);
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
        if (getSubscriberId() != null)
            sb.append("SubscriberId: ").append(getSubscriberId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSubscriberRequest == false)
            return false;
        GetSubscriberRequest other = (GetSubscriberRequest) obj;
        if (other.getSubscriberId() == null ^ this.getSubscriberId() == null)
            return false;
        if (other.getSubscriberId() != null && other.getSubscriberId().equals(this.getSubscriberId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriberId() == null) ? 0 : getSubscriberId().hashCode());
        return hashCode;
    }

    @Override
    public GetSubscriberRequest clone() {
        return (GetSubscriberRequest) super.clone();
    }

}
