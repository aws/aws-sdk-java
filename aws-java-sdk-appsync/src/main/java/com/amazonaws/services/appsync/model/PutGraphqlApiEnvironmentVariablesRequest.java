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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/PutGraphqlApiEnvironmentVariables"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutGraphqlApiEnvironmentVariablesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the API to which the environmental variable list will be written.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The list of environmental variables to add to the API.
     * </p>
     * <p>
     * When creating an environmental variable key-value pair, it must follow the additional constraints below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys must begin with a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys must be at least two characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys can only contain letters, numbers, and the underscore character (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values can be up to 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can configure up to 50 key-value pairs in a GraphQL API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a list of environmental variables by adding it to the <code>environmentVariables</code> payload as
     * a list in the format <code>{"key1":"value1","key2":"value2", …}</code>. Note that each call of the
     * <code>PutGraphqlApiEnvironmentVariables</code> action will result in the overwriting of the existing
     * environmental variable list of that API. This means the existing environmental variables will be lost. To avoid
     * this, you must include all existing and new environmental variables in the list each time you call this action.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;

    /**
     * <p>
     * The ID of the API to which the environmental variable list will be written.
     * </p>
     * 
     * @param apiId
     *        The ID of the API to which the environmental variable list will be written.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The ID of the API to which the environmental variable list will be written.
     * </p>
     * 
     * @return The ID of the API to which the environmental variable list will be written.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The ID of the API to which the environmental variable list will be written.
     * </p>
     * 
     * @param apiId
     *        The ID of the API to which the environmental variable list will be written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGraphqlApiEnvironmentVariablesRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The list of environmental variables to add to the API.
     * </p>
     * <p>
     * When creating an environmental variable key-value pair, it must follow the additional constraints below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys must begin with a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys must be at least two characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys can only contain letters, numbers, and the underscore character (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values can be up to 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can configure up to 50 key-value pairs in a GraphQL API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a list of environmental variables by adding it to the <code>environmentVariables</code> payload as
     * a list in the format <code>{"key1":"value1","key2":"value2", …}</code>. Note that each call of the
     * <code>PutGraphqlApiEnvironmentVariables</code> action will result in the overwriting of the existing
     * environmental variable list of that API. This means the existing environmental variables will be lost. To avoid
     * this, you must include all existing and new environmental variables in the list each time you call this action.
     * </p>
     * 
     * @return The list of environmental variables to add to the API.</p>
     *         <p>
     *         When creating an environmental variable key-value pair, it must follow the additional constraints below:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Keys must begin with a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Keys must be at least two characters long.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Keys can only contain letters, numbers, and the underscore character (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Values can be up to 512 characters long.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can configure up to 50 key-value pairs in a GraphQL API.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can create a list of environmental variables by adding it to the <code>environmentVariables</code>
     *         payload as a list in the format <code>{"key1":"value1","key2":"value2", …}</code>. Note that each call of
     *         the <code>PutGraphqlApiEnvironmentVariables</code> action will result in the overwriting of the existing
     *         environmental variable list of that API. This means the existing environmental variables will be lost. To
     *         avoid this, you must include all existing and new environmental variables in the list each time you call
     *         this action.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * The list of environmental variables to add to the API.
     * </p>
     * <p>
     * When creating an environmental variable key-value pair, it must follow the additional constraints below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys must begin with a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys must be at least two characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys can only contain letters, numbers, and the underscore character (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values can be up to 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can configure up to 50 key-value pairs in a GraphQL API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a list of environmental variables by adding it to the <code>environmentVariables</code> payload as
     * a list in the format <code>{"key1":"value1","key2":"value2", …}</code>. Note that each call of the
     * <code>PutGraphqlApiEnvironmentVariables</code> action will result in the overwriting of the existing
     * environmental variable list of that API. This means the existing environmental variables will be lost. To avoid
     * this, you must include all existing and new environmental variables in the list each time you call this action.
     * </p>
     * 
     * @param environmentVariables
     *        The list of environmental variables to add to the API.</p>
     *        <p>
     *        When creating an environmental variable key-value pair, it must follow the additional constraints below:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Keys must begin with a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys must be at least two characters long.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys can only contain letters, numbers, and the underscore character (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Values can be up to 512 characters long.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can configure up to 50 key-value pairs in a GraphQL API.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can create a list of environmental variables by adding it to the <code>environmentVariables</code>
     *        payload as a list in the format <code>{"key1":"value1","key2":"value2", …}</code>. Note that each call of
     *        the <code>PutGraphqlApiEnvironmentVariables</code> action will result in the overwriting of the existing
     *        environmental variable list of that API. This means the existing environmental variables will be lost. To
     *        avoid this, you must include all existing and new environmental variables in the list each time you call
     *        this action.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * The list of environmental variables to add to the API.
     * </p>
     * <p>
     * When creating an environmental variable key-value pair, it must follow the additional constraints below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys must begin with a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys must be at least two characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys can only contain letters, numbers, and the underscore character (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values can be up to 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can configure up to 50 key-value pairs in a GraphQL API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a list of environmental variables by adding it to the <code>environmentVariables</code> payload as
     * a list in the format <code>{"key1":"value1","key2":"value2", …}</code>. Note that each call of the
     * <code>PutGraphqlApiEnvironmentVariables</code> action will result in the overwriting of the existing
     * environmental variable list of that API. This means the existing environmental variables will be lost. To avoid
     * this, you must include all existing and new environmental variables in the list each time you call this action.
     * </p>
     * 
     * @param environmentVariables
     *        The list of environmental variables to add to the API.</p>
     *        <p>
     *        When creating an environmental variable key-value pair, it must follow the additional constraints below:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Keys must begin with a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys must be at least two characters long.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys can only contain letters, numbers, and the underscore character (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Values can be up to 512 characters long.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can configure up to 50 key-value pairs in a GraphQL API.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can create a list of environmental variables by adding it to the <code>environmentVariables</code>
     *        payload as a list in the format <code>{"key1":"value1","key2":"value2", …}</code>. Note that each call of
     *        the <code>PutGraphqlApiEnvironmentVariables</code> action will result in the overwriting of the existing
     *        environmental variable list of that API. This means the existing environmental variables will be lost. To
     *        avoid this, you must include all existing and new environmental variables in the list each time you call
     *        this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGraphqlApiEnvironmentVariablesRequest withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Add a single EnvironmentVariables entry
     *
     * @see PutGraphqlApiEnvironmentVariablesRequest#withEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutGraphqlApiEnvironmentVariablesRequest addEnvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGraphqlApiEnvironmentVariablesRequest clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutGraphqlApiEnvironmentVariablesRequest == false)
            return false;
        PutGraphqlApiEnvironmentVariablesRequest other = (PutGraphqlApiEnvironmentVariablesRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        return hashCode;
    }

    @Override
    public PutGraphqlApiEnvironmentVariablesRequest clone() {
        return (PutGraphqlApiEnvironmentVariablesRequest) super.clone();
    }

}
