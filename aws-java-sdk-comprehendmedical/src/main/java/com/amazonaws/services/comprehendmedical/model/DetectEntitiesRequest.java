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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A UTF-8 text string containing the clinical content being examined for entities. Each string must contain fewer
     * than 20,000 bytes of characters.
     * </p>
     */
    private String text;

    /**
     * <p>
     * A UTF-8 text string containing the clinical content being examined for entities. Each string must contain fewer
     * than 20,000 bytes of characters.
     * </p>
     * 
     * @param text
     *        A UTF-8 text string containing the clinical content being examined for entities. Each string must contain
     *        fewer than 20,000 bytes of characters.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * A UTF-8 text string containing the clinical content being examined for entities. Each string must contain fewer
     * than 20,000 bytes of characters.
     * </p>
     * 
     * @return A UTF-8 text string containing the clinical content being examined for entities. Each string must contain
     *         fewer than 20,000 bytes of characters.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * A UTF-8 text string containing the clinical content being examined for entities. Each string must contain fewer
     * than 20,000 bytes of characters.
     * </p>
     * 
     * @param text
     *        A UTF-8 text string containing the clinical content being examined for entities. Each string must contain
     *        fewer than 20,000 bytes of characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectEntitiesRequest withText(String text) {
        setText(text);
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
        if (getText() != null)
            sb.append("Text: ").append(getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectEntitiesRequest == false)
            return false;
        DetectEntitiesRequest other = (DetectEntitiesRequest) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public DetectEntitiesRequest clone() {
        return (DetectEntitiesRequest) super.clone();
    }

}
