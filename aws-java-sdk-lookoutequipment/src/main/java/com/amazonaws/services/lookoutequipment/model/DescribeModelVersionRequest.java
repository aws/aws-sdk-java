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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeModelVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the machine learning model that this version belongs to.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The version of the machine learning model.
     * </p>
     */
    private Long modelVersion;

    /**
     * <p>
     * The name of the machine learning model that this version belongs to.
     * </p>
     * 
     * @param modelName
     *        The name of the machine learning model that this version belongs to.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the machine learning model that this version belongs to.
     * </p>
     * 
     * @return The name of the machine learning model that this version belongs to.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the machine learning model that this version belongs to.
     * </p>
     * 
     * @param modelName
     *        The name of the machine learning model that this version belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The version of the machine learning model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the machine learning model.
     */

    public void setModelVersion(Long modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the machine learning model.
     * </p>
     * 
     * @return The version of the machine learning model.
     */

    public Long getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the machine learning model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the machine learning model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionRequest withModelVersion(Long modelVersion) {
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
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

        if (obj instanceof DescribeModelVersionRequest == false)
            return false;
        DescribeModelVersionRequest other = (DescribeModelVersionRequest) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
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

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelVersionRequest clone() {
        return (DescribeModelVersionRequest) super.clone();
    }

}
