/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeTargetedSentimentDetectionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTargetedSentimentDetectionJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An object that contains the properties associated with a targeted sentiment detection job.
     * </p>
     */
    private TargetedSentimentDetectionJobProperties targetedSentimentDetectionJobProperties;

    /**
     * <p>
     * An object that contains the properties associated with a targeted sentiment detection job.
     * </p>
     * 
     * @param targetedSentimentDetectionJobProperties
     *        An object that contains the properties associated with a targeted sentiment detection job.
     */

    public void setTargetedSentimentDetectionJobProperties(TargetedSentimentDetectionJobProperties targetedSentimentDetectionJobProperties) {
        this.targetedSentimentDetectionJobProperties = targetedSentimentDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a targeted sentiment detection job.
     * </p>
     * 
     * @return An object that contains the properties associated with a targeted sentiment detection job.
     */

    public TargetedSentimentDetectionJobProperties getTargetedSentimentDetectionJobProperties() {
        return this.targetedSentimentDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a targeted sentiment detection job.
     * </p>
     * 
     * @param targetedSentimentDetectionJobProperties
     *        An object that contains the properties associated with a targeted sentiment detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTargetedSentimentDetectionJobResult withTargetedSentimentDetectionJobProperties(
            TargetedSentimentDetectionJobProperties targetedSentimentDetectionJobProperties) {
        setTargetedSentimentDetectionJobProperties(targetedSentimentDetectionJobProperties);
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
        if (getTargetedSentimentDetectionJobProperties() != null)
            sb.append("TargetedSentimentDetectionJobProperties: ").append(getTargetedSentimentDetectionJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTargetedSentimentDetectionJobResult == false)
            return false;
        DescribeTargetedSentimentDetectionJobResult other = (DescribeTargetedSentimentDetectionJobResult) obj;
        if (other.getTargetedSentimentDetectionJobProperties() == null ^ this.getTargetedSentimentDetectionJobProperties() == null)
            return false;
        if (other.getTargetedSentimentDetectionJobProperties() != null
                && other.getTargetedSentimentDetectionJobProperties().equals(this.getTargetedSentimentDetectionJobProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetedSentimentDetectionJobProperties() == null) ? 0 : getTargetedSentimentDetectionJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTargetedSentimentDetectionJobResult clone() {
        try {
            return (DescribeTargetedSentimentDetectionJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
