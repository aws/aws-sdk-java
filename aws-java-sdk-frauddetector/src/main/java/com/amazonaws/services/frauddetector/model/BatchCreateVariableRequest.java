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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchCreateVariable" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateVariableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of variables for the batch create variable request.
     * </p>
     */
    private java.util.List<VariableEntry> variableEntries;

    /**
     * <p>
     * The list of variables for the batch create variable request.
     * </p>
     * 
     * @return The list of variables for the batch create variable request.
     */

    public java.util.List<VariableEntry> getVariableEntries() {
        return variableEntries;
    }

    /**
     * <p>
     * The list of variables for the batch create variable request.
     * </p>
     * 
     * @param variableEntries
     *        The list of variables for the batch create variable request.
     */

    public void setVariableEntries(java.util.Collection<VariableEntry> variableEntries) {
        if (variableEntries == null) {
            this.variableEntries = null;
            return;
        }

        this.variableEntries = new java.util.ArrayList<VariableEntry>(variableEntries);
    }

    /**
     * <p>
     * The list of variables for the batch create variable request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariableEntries(java.util.Collection)} or {@link #withVariableEntries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param variableEntries
     *        The list of variables for the batch create variable request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateVariableRequest withVariableEntries(VariableEntry... variableEntries) {
        if (this.variableEntries == null) {
            setVariableEntries(new java.util.ArrayList<VariableEntry>(variableEntries.length));
        }
        for (VariableEntry ele : variableEntries) {
            this.variableEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of variables for the batch create variable request.
     * </p>
     * 
     * @param variableEntries
     *        The list of variables for the batch create variable request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateVariableRequest withVariableEntries(java.util.Collection<VariableEntry> variableEntries) {
        setVariableEntries(variableEntries);
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
        if (getVariableEntries() != null)
            sb.append("VariableEntries: ").append(getVariableEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateVariableRequest == false)
            return false;
        BatchCreateVariableRequest other = (BatchCreateVariableRequest) obj;
        if (other.getVariableEntries() == null ^ this.getVariableEntries() == null)
            return false;
        if (other.getVariableEntries() != null && other.getVariableEntries().equals(this.getVariableEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariableEntries() == null) ? 0 : getVariableEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateVariableRequest clone() {
        return (BatchCreateVariableRequest) super.clone();
    }

}
