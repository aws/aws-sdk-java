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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteActivityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the activity to delete.
     * </p>
     */
    private String activityArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the activity to delete.
     * </p>
     * 
     * @param activityArn
     *        The Amazon Resource Name (ARN) of the activity to delete.
     */

    public void setActivityArn(String activityArn) {
        this.activityArn = activityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the activity to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the activity to delete.
     */

    public String getActivityArn() {
        return this.activityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the activity to delete.
     * </p>
     * 
     * @param activityArn
     *        The Amazon Resource Name (ARN) of the activity to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteActivityRequest withActivityArn(String activityArn) {
        setActivityArn(activityArn);
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
        if (getActivityArn() != null)
            sb.append("ActivityArn: ").append(getActivityArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteActivityRequest == false)
            return false;
        DeleteActivityRequest other = (DeleteActivityRequest) obj;
        if (other.getActivityArn() == null ^ this.getActivityArn() == null)
            return false;
        if (other.getActivityArn() != null && other.getActivityArn().equals(this.getActivityArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivityArn() == null) ? 0 : getActivityArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteActivityRequest clone() {
        return (DeleteActivityRequest) super.clone();
    }

}
