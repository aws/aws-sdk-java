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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/Subscribe" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscribeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule for which you want to create the association.
     * </p>
     */
    private String arn;

    private Target target;
    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule for which you want to create the association.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the notification rule for which you want to create the association.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule for which you want to create the association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the notification rule for which you want to create the association.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule for which you want to create the association.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the notification rule for which you want to create the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param target
     */

    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * @return
     */

    public Target getTarget() {
        return this.target;
    }

    /**
     * @param target
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeRequest withTarget(Target target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param clientRequestToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param clientRequestToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribeRequest == false)
            return false;
        SubscribeRequest other = (SubscribeRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public SubscribeRequest clone() {
        return (SubscribeRequest) super.clone();
    }

}
