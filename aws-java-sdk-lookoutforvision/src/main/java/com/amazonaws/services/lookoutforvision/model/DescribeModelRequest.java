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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The project that contains the version of a model that you want to describe.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The version of the model that you want to describe.
     * </p>
     */
    private String modelVersion;

    /**
     * <p>
     * The project that contains the version of a model that you want to describe.
     * </p>
     * 
     * @param projectName
     *        The project that contains the version of a model that you want to describe.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The project that contains the version of a model that you want to describe.
     * </p>
     * 
     * @return The project that contains the version of a model that you want to describe.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The project that contains the version of a model that you want to describe.
     * </p>
     * 
     * @param projectName
     *        The project that contains the version of a model that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The version of the model that you want to describe.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model that you want to describe.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model that you want to describe.
     * </p>
     * 
     * @return The version of the model that you want to describe.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model that you want to describe.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelRequest withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelRequest == false)
            return false;
        DescribeModelRequest other = (DescribeModelRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelRequest clone() {
        return (DescribeModelRequest) super.clone();
    }

}
