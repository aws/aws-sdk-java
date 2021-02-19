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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for processing job outputs in Amazon SageMaker Feature Store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProcessingFeatureStoreOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingFeatureStoreOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon SageMaker FeatureGroup to use as the destination for processing job output. Note that your
     * processing script is responsible for putting records into your Feature Store.
     * </p>
     */
    private String featureGroupName;

    /**
     * <p>
     * The name of the Amazon SageMaker FeatureGroup to use as the destination for processing job output. Note that your
     * processing script is responsible for putting records into your Feature Store.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the Amazon SageMaker FeatureGroup to use as the destination for processing job output. Note
     *        that your processing script is responsible for putting records into your Feature Store.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker FeatureGroup to use as the destination for processing job output. Note that your
     * processing script is responsible for putting records into your Feature Store.
     * </p>
     * 
     * @return The name of the Amazon SageMaker FeatureGroup to use as the destination for processing job output. Note
     *         that your processing script is responsible for putting records into your Feature Store.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker FeatureGroup to use as the destination for processing job output. Note that your
     * processing script is responsible for putting records into your Feature Store.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the Amazon SageMaker FeatureGroup to use as the destination for processing job output. Note
     *        that your processing script is responsible for putting records into your Feature Store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingFeatureStoreOutput withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
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
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingFeatureStoreOutput == false)
            return false;
        ProcessingFeatureStoreOutput other = (ProcessingFeatureStoreOutput) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        return hashCode;
    }

    @Override
    public ProcessingFeatureStoreOutput clone() {
        try {
            return (ProcessingFeatureStoreOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProcessingFeatureStoreOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
