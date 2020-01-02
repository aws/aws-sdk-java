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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfirmTopicRuleDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token used to confirm ownership or access to the topic rule confirmation URL.
     * </p>
     */
    private String confirmationToken;

    /**
     * <p>
     * The token used to confirm ownership or access to the topic rule confirmation URL.
     * </p>
     * 
     * @param confirmationToken
     *        The token used to confirm ownership or access to the topic rule confirmation URL.
     */

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    /**
     * <p>
     * The token used to confirm ownership or access to the topic rule confirmation URL.
     * </p>
     * 
     * @return The token used to confirm ownership or access to the topic rule confirmation URL.
     */

    public String getConfirmationToken() {
        return this.confirmationToken;
    }

    /**
     * <p>
     * The token used to confirm ownership or access to the topic rule confirmation URL.
     * </p>
     * 
     * @param confirmationToken
     *        The token used to confirm ownership or access to the topic rule confirmation URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmTopicRuleDestinationRequest withConfirmationToken(String confirmationToken) {
        setConfirmationToken(confirmationToken);
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
        if (getConfirmationToken() != null)
            sb.append("ConfirmationToken: ").append(getConfirmationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmTopicRuleDestinationRequest == false)
            return false;
        ConfirmTopicRuleDestinationRequest other = (ConfirmTopicRuleDestinationRequest) obj;
        if (other.getConfirmationToken() == null ^ this.getConfirmationToken() == null)
            return false;
        if (other.getConfirmationToken() != null && other.getConfirmationToken().equals(this.getConfirmationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfirmationToken() == null) ? 0 : getConfirmationToken().hashCode());
        return hashCode;
    }

    @Override
    public ConfirmTopicRuleDestinationRequest clone() {
        return (ConfirmTopicRuleDestinationRequest) super.clone();
    }

}
