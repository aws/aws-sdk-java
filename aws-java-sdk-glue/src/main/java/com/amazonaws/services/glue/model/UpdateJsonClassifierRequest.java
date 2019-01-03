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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a JSON classifier to be updated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateJsonClassifierRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJsonClassifierRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the classifier.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A <code>JsonPath</code> string defining the JSON data for the classifier to classify. AWS Glue supports a subset
     * of JsonPath, as described in <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json">Writing JsonPath
     * Custom Classifiers</a>.
     * </p>
     */
    private String jsonPath;

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @param name
     *        The name of the classifier.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @return The name of the classifier.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @param name
     *        The name of the classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJsonClassifierRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A <code>JsonPath</code> string defining the JSON data for the classifier to classify. AWS Glue supports a subset
     * of JsonPath, as described in <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json">Writing JsonPath
     * Custom Classifiers</a>.
     * </p>
     * 
     * @param jsonPath
     *        A <code>JsonPath</code> string defining the JSON data for the classifier to classify. AWS Glue supports a
     *        subset of JsonPath, as described in <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json">Writing
     *        JsonPath Custom Classifiers</a>.
     */

    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    /**
     * <p>
     * A <code>JsonPath</code> string defining the JSON data for the classifier to classify. AWS Glue supports a subset
     * of JsonPath, as described in <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json">Writing JsonPath
     * Custom Classifiers</a>.
     * </p>
     * 
     * @return A <code>JsonPath</code> string defining the JSON data for the classifier to classify. AWS Glue supports a
     *         subset of JsonPath, as described in <a
     *         href="https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json">Writing
     *         JsonPath Custom Classifiers</a>.
     */

    public String getJsonPath() {
        return this.jsonPath;
    }

    /**
     * <p>
     * A <code>JsonPath</code> string defining the JSON data for the classifier to classify. AWS Glue supports a subset
     * of JsonPath, as described in <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json">Writing JsonPath
     * Custom Classifiers</a>.
     * </p>
     * 
     * @param jsonPath
     *        A <code>JsonPath</code> string defining the JSON data for the classifier to classify. AWS Glue supports a
     *        subset of JsonPath, as described in <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json">Writing
     *        JsonPath Custom Classifiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJsonClassifierRequest withJsonPath(String jsonPath) {
        setJsonPath(jsonPath);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getJsonPath() != null)
            sb.append("JsonPath: ").append(getJsonPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJsonClassifierRequest == false)
            return false;
        UpdateJsonClassifierRequest other = (UpdateJsonClassifierRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getJsonPath() == null ^ this.getJsonPath() == null)
            return false;
        if (other.getJsonPath() != null && other.getJsonPath().equals(this.getJsonPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getJsonPath() == null) ? 0 : getJsonPath().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJsonClassifierRequest clone() {
        try {
            return (UpdateJsonClassifierRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.UpdateJsonClassifierRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
