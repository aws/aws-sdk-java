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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeKeyPhrasesDetectionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKeyPhrasesDetectionJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An object that contains the properties associated with a key phrases detection job.
     * </p>
     */
    private KeyPhrasesDetectionJobProperties keyPhrasesDetectionJobProperties;

    /**
     * <p>
     * An object that contains the properties associated with a key phrases detection job.
     * </p>
     * 
     * @param keyPhrasesDetectionJobProperties
     *        An object that contains the properties associated with a key phrases detection job.
     */

    public void setKeyPhrasesDetectionJobProperties(KeyPhrasesDetectionJobProperties keyPhrasesDetectionJobProperties) {
        this.keyPhrasesDetectionJobProperties = keyPhrasesDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a key phrases detection job.
     * </p>
     * 
     * @return An object that contains the properties associated with a key phrases detection job.
     */

    public KeyPhrasesDetectionJobProperties getKeyPhrasesDetectionJobProperties() {
        return this.keyPhrasesDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a key phrases detection job.
     * </p>
     * 
     * @param keyPhrasesDetectionJobProperties
     *        An object that contains the properties associated with a key phrases detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyPhrasesDetectionJobResult withKeyPhrasesDetectionJobProperties(KeyPhrasesDetectionJobProperties keyPhrasesDetectionJobProperties) {
        setKeyPhrasesDetectionJobProperties(keyPhrasesDetectionJobProperties);
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
        if (getKeyPhrasesDetectionJobProperties() != null)
            sb.append("KeyPhrasesDetectionJobProperties: ").append(getKeyPhrasesDetectionJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeyPhrasesDetectionJobResult == false)
            return false;
        DescribeKeyPhrasesDetectionJobResult other = (DescribeKeyPhrasesDetectionJobResult) obj;
        if (other.getKeyPhrasesDetectionJobProperties() == null ^ this.getKeyPhrasesDetectionJobProperties() == null)
            return false;
        if (other.getKeyPhrasesDetectionJobProperties() != null
                && other.getKeyPhrasesDetectionJobProperties().equals(this.getKeyPhrasesDetectionJobProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPhrasesDetectionJobProperties() == null) ? 0 : getKeyPhrasesDetectionJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeKeyPhrasesDetectionJobResult clone() {
        try {
            return (DescribeKeyPhrasesDetectionJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
