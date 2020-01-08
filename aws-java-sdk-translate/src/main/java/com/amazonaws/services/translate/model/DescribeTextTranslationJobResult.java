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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/DescribeTextTranslationJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTextTranslationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains the properties associated with an asynchronous batch translation job.
     * </p>
     */
    private TextTranslationJobProperties textTranslationJobProperties;

    /**
     * <p>
     * An object that contains the properties associated with an asynchronous batch translation job.
     * </p>
     * 
     * @param textTranslationJobProperties
     *        An object that contains the properties associated with an asynchronous batch translation job.
     */

    public void setTextTranslationJobProperties(TextTranslationJobProperties textTranslationJobProperties) {
        this.textTranslationJobProperties = textTranslationJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with an asynchronous batch translation job.
     * </p>
     * 
     * @return An object that contains the properties associated with an asynchronous batch translation job.
     */

    public TextTranslationJobProperties getTextTranslationJobProperties() {
        return this.textTranslationJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with an asynchronous batch translation job.
     * </p>
     * 
     * @param textTranslationJobProperties
     *        An object that contains the properties associated with an asynchronous batch translation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTextTranslationJobResult withTextTranslationJobProperties(TextTranslationJobProperties textTranslationJobProperties) {
        setTextTranslationJobProperties(textTranslationJobProperties);
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
        if (getTextTranslationJobProperties() != null)
            sb.append("TextTranslationJobProperties: ").append(getTextTranslationJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTextTranslationJobResult == false)
            return false;
        DescribeTextTranslationJobResult other = (DescribeTextTranslationJobResult) obj;
        if (other.getTextTranslationJobProperties() == null ^ this.getTextTranslationJobProperties() == null)
            return false;
        if (other.getTextTranslationJobProperties() != null && other.getTextTranslationJobProperties().equals(this.getTextTranslationJobProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextTranslationJobProperties() == null) ? 0 : getTextTranslationJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTextTranslationJobResult clone() {
        try {
            return (DescribeTextTranslationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
