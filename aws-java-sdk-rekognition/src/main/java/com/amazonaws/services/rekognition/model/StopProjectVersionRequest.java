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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopProjectVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version that you want to delete.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:StopProjectVersion</code> action.
     * </p>
     */
    private String projectVersionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version that you want to delete.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:StopProjectVersion</code> action.
     * </p>
     * 
     * @param projectVersionArn
     *        The Amazon Resource Name (ARN) of the model version that you want to delete.</p>
     *        <p>
     *        This operation requires permissions to perform the <code>rekognition:StopProjectVersion</code> action.
     */

    public void setProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version that you want to delete.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:StopProjectVersion</code> action.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model version that you want to delete.</p>
     *         <p>
     *         This operation requires permissions to perform the <code>rekognition:StopProjectVersion</code> action.
     */

    public String getProjectVersionArn() {
        return this.projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version that you want to delete.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:StopProjectVersion</code> action.
     * </p>
     * 
     * @param projectVersionArn
     *        The Amazon Resource Name (ARN) of the model version that you want to delete.</p>
     *        <p>
     *        This operation requires permissions to perform the <code>rekognition:StopProjectVersion</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopProjectVersionRequest withProjectVersionArn(String projectVersionArn) {
        setProjectVersionArn(projectVersionArn);
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
        if (getProjectVersionArn() != null)
            sb.append("ProjectVersionArn: ").append(getProjectVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopProjectVersionRequest == false)
            return false;
        StopProjectVersionRequest other = (StopProjectVersionRequest) obj;
        if (other.getProjectVersionArn() == null ^ this.getProjectVersionArn() == null)
            return false;
        if (other.getProjectVersionArn() != null && other.getProjectVersionArn().equals(this.getProjectVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectVersionArn() == null) ? 0 : getProjectVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public StopProjectVersionRequest clone() {
        return (StopProjectVersionRequest) super.clone();
    }

}
