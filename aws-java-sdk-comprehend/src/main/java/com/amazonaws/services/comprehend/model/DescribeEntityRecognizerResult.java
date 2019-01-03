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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeEntityRecognizer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEntityRecognizerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes information associated with an entity recognizer.
     * </p>
     */
    private EntityRecognizerProperties entityRecognizerProperties;

    /**
     * <p>
     * Describes information associated with an entity recognizer.
     * </p>
     * 
     * @param entityRecognizerProperties
     *        Describes information associated with an entity recognizer.
     */

    public void setEntityRecognizerProperties(EntityRecognizerProperties entityRecognizerProperties) {
        this.entityRecognizerProperties = entityRecognizerProperties;
    }

    /**
     * <p>
     * Describes information associated with an entity recognizer.
     * </p>
     * 
     * @return Describes information associated with an entity recognizer.
     */

    public EntityRecognizerProperties getEntityRecognizerProperties() {
        return this.entityRecognizerProperties;
    }

    /**
     * <p>
     * Describes information associated with an entity recognizer.
     * </p>
     * 
     * @param entityRecognizerProperties
     *        Describes information associated with an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityRecognizerResult withEntityRecognizerProperties(EntityRecognizerProperties entityRecognizerProperties) {
        setEntityRecognizerProperties(entityRecognizerProperties);
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
        if (getEntityRecognizerProperties() != null)
            sb.append("EntityRecognizerProperties: ").append(getEntityRecognizerProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEntityRecognizerResult == false)
            return false;
        DescribeEntityRecognizerResult other = (DescribeEntityRecognizerResult) obj;
        if (other.getEntityRecognizerProperties() == null ^ this.getEntityRecognizerProperties() == null)
            return false;
        if (other.getEntityRecognizerProperties() != null && other.getEntityRecognizerProperties().equals(this.getEntityRecognizerProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityRecognizerProperties() == null) ? 0 : getEntityRecognizerProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEntityRecognizerResult clone() {
        try {
            return (DescribeEntityRecognizerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
