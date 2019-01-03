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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DeleteEntityRecognizer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEntityRecognizerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     */
    private String entityRecognizerArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * 
     * @param entityRecognizerArn
     *        The Amazon Resource Name (ARN) that identifies the entity recognizer.
     */

    public void setEntityRecognizerArn(String entityRecognizerArn) {
        this.entityRecognizerArn = entityRecognizerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the entity recognizer.
     */

    public String getEntityRecognizerArn() {
        return this.entityRecognizerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * 
     * @param entityRecognizerArn
     *        The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEntityRecognizerRequest withEntityRecognizerArn(String entityRecognizerArn) {
        setEntityRecognizerArn(entityRecognizerArn);
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
        if (getEntityRecognizerArn() != null)
            sb.append("EntityRecognizerArn: ").append(getEntityRecognizerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEntityRecognizerRequest == false)
            return false;
        DeleteEntityRecognizerRequest other = (DeleteEntityRecognizerRequest) obj;
        if (other.getEntityRecognizerArn() == null ^ this.getEntityRecognizerArn() == null)
            return false;
        if (other.getEntityRecognizerArn() != null && other.getEntityRecognizerArn().equals(this.getEntityRecognizerArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityRecognizerArn() == null) ? 0 : getEntityRecognizerArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEntityRecognizerRequest clone() {
        return (DeleteEntityRecognizerRequest) super.clone();
    }

}
