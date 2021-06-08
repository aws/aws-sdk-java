/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/CreateEventIntegration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventIntegrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event integration.
     * </p>
     */
    private String eventIntegrationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event integration.
     * </p>
     * 
     * @param eventIntegrationArn
     *        The Amazon Resource Name (ARN) of the event integration.
     */

    public void setEventIntegrationArn(String eventIntegrationArn) {
        this.eventIntegrationArn = eventIntegrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event integration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the event integration.
     */

    public String getEventIntegrationArn() {
        return this.eventIntegrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event integration.
     * </p>
     * 
     * @param eventIntegrationArn
     *        The Amazon Resource Name (ARN) of the event integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventIntegrationResult withEventIntegrationArn(String eventIntegrationArn) {
        setEventIntegrationArn(eventIntegrationArn);
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
        if (getEventIntegrationArn() != null)
            sb.append("EventIntegrationArn: ").append(getEventIntegrationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventIntegrationResult == false)
            return false;
        CreateEventIntegrationResult other = (CreateEventIntegrationResult) obj;
        if (other.getEventIntegrationArn() == null ^ this.getEventIntegrationArn() == null)
            return false;
        if (other.getEventIntegrationArn() != null && other.getEventIntegrationArn().equals(this.getEventIntegrationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventIntegrationArn() == null) ? 0 : getEventIntegrationArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventIntegrationResult clone() {
        try {
            return (CreateEventIntegrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
