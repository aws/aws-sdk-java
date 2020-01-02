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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteEventTracker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEventTrackerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event tracker to delete.
     * </p>
     */
    private String eventTrackerArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event tracker to delete.
     * </p>
     * 
     * @param eventTrackerArn
     *        The Amazon Resource Name (ARN) of the event tracker to delete.
     */

    public void setEventTrackerArn(String eventTrackerArn) {
        this.eventTrackerArn = eventTrackerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event tracker to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the event tracker to delete.
     */

    public String getEventTrackerArn() {
        return this.eventTrackerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event tracker to delete.
     * </p>
     * 
     * @param eventTrackerArn
     *        The Amazon Resource Name (ARN) of the event tracker to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEventTrackerRequest withEventTrackerArn(String eventTrackerArn) {
        setEventTrackerArn(eventTrackerArn);
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
        if (getEventTrackerArn() != null)
            sb.append("EventTrackerArn: ").append(getEventTrackerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEventTrackerRequest == false)
            return false;
        DeleteEventTrackerRequest other = (DeleteEventTrackerRequest) obj;
        if (other.getEventTrackerArn() == null ^ this.getEventTrackerArn() == null)
            return false;
        if (other.getEventTrackerArn() != null && other.getEventTrackerArn().equals(this.getEventTrackerArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTrackerArn() == null) ? 0 : getEventTrackerArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEventTrackerRequest clone() {
        return (DeleteEventTrackerRequest) super.clone();
    }

}
