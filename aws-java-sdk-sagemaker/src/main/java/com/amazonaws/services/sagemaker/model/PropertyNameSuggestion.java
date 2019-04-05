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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A property name returned from a <code>GetSearchSuggestions</code> call that specifies a value in the
 * <code>PropertyNameQuery</code> field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PropertyNameSuggestion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyNameSuggestion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A suggested property name based on what you entered in the search textbox in the Amazon SageMaker console.
     * </p>
     */
    private String propertyName;

    /**
     * <p>
     * A suggested property name based on what you entered in the search textbox in the Amazon SageMaker console.
     * </p>
     * 
     * @param propertyName
     *        A suggested property name based on what you entered in the search textbox in the Amazon SageMaker console.
     */

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * <p>
     * A suggested property name based on what you entered in the search textbox in the Amazon SageMaker console.
     * </p>
     * 
     * @return A suggested property name based on what you entered in the search textbox in the Amazon SageMaker
     *         console.
     */

    public String getPropertyName() {
        return this.propertyName;
    }

    /**
     * <p>
     * A suggested property name based on what you entered in the search textbox in the Amazon SageMaker console.
     * </p>
     * 
     * @param propertyName
     *        A suggested property name based on what you entered in the search textbox in the Amazon SageMaker console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyNameSuggestion withPropertyName(String propertyName) {
        setPropertyName(propertyName);
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
        if (getPropertyName() != null)
            sb.append("PropertyName: ").append(getPropertyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyNameSuggestion == false)
            return false;
        PropertyNameSuggestion other = (PropertyNameSuggestion) obj;
        if (other.getPropertyName() == null ^ this.getPropertyName() == null)
            return false;
        if (other.getPropertyName() != null && other.getPropertyName().equals(this.getPropertyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        return hashCode;
    }

    @Override
    public PropertyNameSuggestion clone() {
        try {
            return (PropertyNameSuggestion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PropertyNameSuggestionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
