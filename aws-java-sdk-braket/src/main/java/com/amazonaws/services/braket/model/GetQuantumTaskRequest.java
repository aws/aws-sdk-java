/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetQuantumTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQuantumTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     */
    private java.util.List<String> additionalAttributeNames;
    /**
     * <p>
     * The ARN of the task to retrieve.
     * </p>
     */
    private String quantumTaskArn;

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     * 
     * @return A list of attributes to return information for.
     * @see QuantumTaskAdditionalAttributeName
     */

    public java.util.List<String> getAdditionalAttributeNames() {
        return additionalAttributeNames;
    }

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     * 
     * @param additionalAttributeNames
     *        A list of attributes to return information for.
     * @see QuantumTaskAdditionalAttributeName
     */

    public void setAdditionalAttributeNames(java.util.Collection<String> additionalAttributeNames) {
        if (additionalAttributeNames == null) {
            this.additionalAttributeNames = null;
            return;
        }

        this.additionalAttributeNames = new java.util.ArrayList<String>(additionalAttributeNames);
    }

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAttributeNames(java.util.Collection)} or
     * {@link #withAdditionalAttributeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalAttributeNames
     *        A list of attributes to return information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuantumTaskAdditionalAttributeName
     */

    public GetQuantumTaskRequest withAdditionalAttributeNames(String... additionalAttributeNames) {
        if (this.additionalAttributeNames == null) {
            setAdditionalAttributeNames(new java.util.ArrayList<String>(additionalAttributeNames.length));
        }
        for (String ele : additionalAttributeNames) {
            this.additionalAttributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     * 
     * @param additionalAttributeNames
     *        A list of attributes to return information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuantumTaskAdditionalAttributeName
     */

    public GetQuantumTaskRequest withAdditionalAttributeNames(java.util.Collection<String> additionalAttributeNames) {
        setAdditionalAttributeNames(additionalAttributeNames);
        return this;
    }

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     * 
     * @param additionalAttributeNames
     *        A list of attributes to return information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuantumTaskAdditionalAttributeName
     */

    public GetQuantumTaskRequest withAdditionalAttributeNames(QuantumTaskAdditionalAttributeName... additionalAttributeNames) {
        java.util.ArrayList<String> additionalAttributeNamesCopy = new java.util.ArrayList<String>(additionalAttributeNames.length);
        for (QuantumTaskAdditionalAttributeName value : additionalAttributeNames) {
            additionalAttributeNamesCopy.add(value.toString());
        }
        if (getAdditionalAttributeNames() == null) {
            setAdditionalAttributeNames(additionalAttributeNamesCopy);
        } else {
            getAdditionalAttributeNames().addAll(additionalAttributeNamesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of the task to retrieve.
     * </p>
     * 
     * @param quantumTaskArn
     *        The ARN of the task to retrieve.
     */

    public void setQuantumTaskArn(String quantumTaskArn) {
        this.quantumTaskArn = quantumTaskArn;
    }

    /**
     * <p>
     * The ARN of the task to retrieve.
     * </p>
     * 
     * @return The ARN of the task to retrieve.
     */

    public String getQuantumTaskArn() {
        return this.quantumTaskArn;
    }

    /**
     * <p>
     * The ARN of the task to retrieve.
     * </p>
     * 
     * @param quantumTaskArn
     *        The ARN of the task to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskRequest withQuantumTaskArn(String quantumTaskArn) {
        setQuantumTaskArn(quantumTaskArn);
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
        if (getAdditionalAttributeNames() != null)
            sb.append("AdditionalAttributeNames: ").append(getAdditionalAttributeNames()).append(",");
        if (getQuantumTaskArn() != null)
            sb.append("QuantumTaskArn: ").append(getQuantumTaskArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQuantumTaskRequest == false)
            return false;
        GetQuantumTaskRequest other = (GetQuantumTaskRequest) obj;
        if (other.getAdditionalAttributeNames() == null ^ this.getAdditionalAttributeNames() == null)
            return false;
        if (other.getAdditionalAttributeNames() != null && other.getAdditionalAttributeNames().equals(this.getAdditionalAttributeNames()) == false)
            return false;
        if (other.getQuantumTaskArn() == null ^ this.getQuantumTaskArn() == null)
            return false;
        if (other.getQuantumTaskArn() != null && other.getQuantumTaskArn().equals(this.getQuantumTaskArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalAttributeNames() == null) ? 0 : getAdditionalAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getQuantumTaskArn() == null) ? 0 : getQuantumTaskArn().hashCode());
        return hashCode;
    }

    @Override
    public GetQuantumTaskRequest clone() {
        return (GetQuantumTaskRequest) super.clone();
    }

}
