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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/BatchGetSecretValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetSecretValueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of secret values.
     * </p>
     */
    private java.util.List<SecretValueEntry> secretValues;
    /**
     * <p>
     * Secrets Manager includes this value if there's more output available than what is included in the current
     * response. This can occur even when the response includes no values at all, such as when you ask for a filtered
     * view of a long list. To get the next results, call <code>BatchGetSecretValue</code> again with this value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of errors Secrets Manager encountered while attempting to retrieve individual secrets.
     * </p>
     */
    private java.util.List<APIErrorType> errors;

    /**
     * <p>
     * A list of secret values.
     * </p>
     * 
     * @return A list of secret values.
     */

    public java.util.List<SecretValueEntry> getSecretValues() {
        return secretValues;
    }

    /**
     * <p>
     * A list of secret values.
     * </p>
     * 
     * @param secretValues
     *        A list of secret values.
     */

    public void setSecretValues(java.util.Collection<SecretValueEntry> secretValues) {
        if (secretValues == null) {
            this.secretValues = null;
            return;
        }

        this.secretValues = new java.util.ArrayList<SecretValueEntry>(secretValues);
    }

    /**
     * <p>
     * A list of secret values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecretValues(java.util.Collection)} or {@link #withSecretValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param secretValues
     *        A list of secret values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecretValueResult withSecretValues(SecretValueEntry... secretValues) {
        if (this.secretValues == null) {
            setSecretValues(new java.util.ArrayList<SecretValueEntry>(secretValues.length));
        }
        for (SecretValueEntry ele : secretValues) {
            this.secretValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of secret values.
     * </p>
     * 
     * @param secretValues
     *        A list of secret values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecretValueResult withSecretValues(java.util.Collection<SecretValueEntry> secretValues) {
        setSecretValues(secretValues);
        return this;
    }

    /**
     * <p>
     * Secrets Manager includes this value if there's more output available than what is included in the current
     * response. This can occur even when the response includes no values at all, such as when you ask for a filtered
     * view of a long list. To get the next results, call <code>BatchGetSecretValue</code> again with this value.
     * </p>
     * 
     * @param nextToken
     *        Secrets Manager includes this value if there's more output available than what is included in the current
     *        response. This can occur even when the response includes no values at all, such as when you ask for a
     *        filtered view of a long list. To get the next results, call <code>BatchGetSecretValue</code> again with
     *        this value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Secrets Manager includes this value if there's more output available than what is included in the current
     * response. This can occur even when the response includes no values at all, such as when you ask for a filtered
     * view of a long list. To get the next results, call <code>BatchGetSecretValue</code> again with this value.
     * </p>
     * 
     * @return Secrets Manager includes this value if there's more output available than what is included in the current
     *         response. This can occur even when the response includes no values at all, such as when you ask for a
     *         filtered view of a long list. To get the next results, call <code>BatchGetSecretValue</code> again with
     *         this value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Secrets Manager includes this value if there's more output available than what is included in the current
     * response. This can occur even when the response includes no values at all, such as when you ask for a filtered
     * view of a long list. To get the next results, call <code>BatchGetSecretValue</code> again with this value.
     * </p>
     * 
     * @param nextToken
     *        Secrets Manager includes this value if there's more output available than what is included in the current
     *        response. This can occur even when the response includes no values at all, such as when you ask for a
     *        filtered view of a long list. To get the next results, call <code>BatchGetSecretValue</code> again with
     *        this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecretValueResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of errors Secrets Manager encountered while attempting to retrieve individual secrets.
     * </p>
     * 
     * @return A list of errors Secrets Manager encountered while attempting to retrieve individual secrets.
     */

    public java.util.List<APIErrorType> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of errors Secrets Manager encountered while attempting to retrieve individual secrets.
     * </p>
     * 
     * @param errors
     *        A list of errors Secrets Manager encountered while attempting to retrieve individual secrets.
     */

    public void setErrors(java.util.Collection<APIErrorType> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<APIErrorType>(errors);
    }

    /**
     * <p>
     * A list of errors Secrets Manager encountered while attempting to retrieve individual secrets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of errors Secrets Manager encountered while attempting to retrieve individual secrets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecretValueResult withErrors(APIErrorType... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<APIErrorType>(errors.length));
        }
        for (APIErrorType ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors Secrets Manager encountered while attempting to retrieve individual secrets.
     * </p>
     * 
     * @param errors
     *        A list of errors Secrets Manager encountered while attempting to retrieve individual secrets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecretValueResult withErrors(java.util.Collection<APIErrorType> errors) {
        setErrors(errors);
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
        if (getSecretValues() != null)
            sb.append("SecretValues: ").append(getSecretValues()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetSecretValueResult == false)
            return false;
        BatchGetSecretValueResult other = (BatchGetSecretValueResult) obj;
        if (other.getSecretValues() == null ^ this.getSecretValues() == null)
            return false;
        if (other.getSecretValues() != null && other.getSecretValues().equals(this.getSecretValues()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretValues() == null) ? 0 : getSecretValues().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetSecretValueResult clone() {
        try {
            return (BatchGetSecretValueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
