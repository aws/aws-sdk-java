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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the model version that was created. Use <code>DescribeProjectVersion</code> to get the current status
     * of the training operation.
     * </p>
     */
    private String projectVersionArn;

    /**
     * <p>
     * The ARN of the model version that was created. Use <code>DescribeProjectVersion</code> to get the current status
     * of the training operation.
     * </p>
     * 
     * @param projectVersionArn
     *        The ARN of the model version that was created. Use <code>DescribeProjectVersion</code> to get the current
     *        status of the training operation.
     */

    public void setProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version that was created. Use <code>DescribeProjectVersion</code> to get the current status
     * of the training operation.
     * </p>
     * 
     * @return The ARN of the model version that was created. Use <code>DescribeProjectVersion</code> to get the current
     *         status of the training operation.
     */

    public String getProjectVersionArn() {
        return this.projectVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version that was created. Use <code>DescribeProjectVersion</code> to get the current status
     * of the training operation.
     * </p>
     * 
     * @param projectVersionArn
     *        The ARN of the model version that was created. Use <code>DescribeProjectVersion</code> to get the current
     *        status of the training operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionResult withProjectVersionArn(String projectVersionArn) {
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

        if (obj instanceof CreateProjectVersionResult == false)
            return false;
        CreateProjectVersionResult other = (CreateProjectVersionResult) obj;
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
    public CreateProjectVersionResult clone() {
        try {
            return (CreateProjectVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
