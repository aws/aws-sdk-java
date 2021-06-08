/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/GetScreenData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetScreenDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workbook that contains the screen.
     * </p>
     */
    private String workbookId;
    /**
     * <p>
     * The ID of the app that contains the screem.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The ID of the screen.
     * </p>
     */
    private String screenId;
    /**
     * <p>
     * Variables are optional and are needed only if the screen requires them to render correctly. Variables are
     * specified as a map where the key is the name of the variable as defined on the screen. The value is an object
     * which currently has only one property, rawValue, which holds the value of the variable to be passed to the
     * screen.
     * </p>
     */
    private java.util.Map<String, VariableValue> variables;
    /**
     * <p>
     * The number of results to be returned on a single page. Specify a number between 1 and 100. The maximum value is
     * 100.
     * </p>
     * <p>
     * This parameter is optional. If you don't specify this parameter, the default page size is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will
     * throw ValidationException.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the workbook that contains the screen.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook that contains the screen.
     */

    public void setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
    }

    /**
     * <p>
     * The ID of the workbook that contains the screen.
     * </p>
     * 
     * @return The ID of the workbook that contains the screen.
     */

    public String getWorkbookId() {
        return this.workbookId;
    }

    /**
     * <p>
     * The ID of the workbook that contains the screen.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook that contains the screen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataRequest withWorkbookId(String workbookId) {
        setWorkbookId(workbookId);
        return this;
    }

    /**
     * <p>
     * The ID of the app that contains the screem.
     * </p>
     * 
     * @param appId
     *        The ID of the app that contains the screem.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The ID of the app that contains the screem.
     * </p>
     * 
     * @return The ID of the app that contains the screem.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The ID of the app that contains the screem.
     * </p>
     * 
     * @param appId
     *        The ID of the app that contains the screem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The ID of the screen.
     * </p>
     * 
     * @param screenId
     *        The ID of the screen.
     */

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    /**
     * <p>
     * The ID of the screen.
     * </p>
     * 
     * @return The ID of the screen.
     */

    public String getScreenId() {
        return this.screenId;
    }

    /**
     * <p>
     * The ID of the screen.
     * </p>
     * 
     * @param screenId
     *        The ID of the screen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataRequest withScreenId(String screenId) {
        setScreenId(screenId);
        return this;
    }

    /**
     * <p>
     * Variables are optional and are needed only if the screen requires them to render correctly. Variables are
     * specified as a map where the key is the name of the variable as defined on the screen. The value is an object
     * which currently has only one property, rawValue, which holds the value of the variable to be passed to the
     * screen.
     * </p>
     * 
     * @return Variables are optional and are needed only if the screen requires them to render correctly. Variables are
     *         specified as a map where the key is the name of the variable as defined on the screen. The value is an
     *         object which currently has only one property, rawValue, which holds the value of the variable to be
     *         passed to the screen.
     */

    public java.util.Map<String, VariableValue> getVariables() {
        return variables;
    }

    /**
     * <p>
     * Variables are optional and are needed only if the screen requires them to render correctly. Variables are
     * specified as a map where the key is the name of the variable as defined on the screen. The value is an object
     * which currently has only one property, rawValue, which holds the value of the variable to be passed to the
     * screen.
     * </p>
     * 
     * @param variables
     *        Variables are optional and are needed only if the screen requires them to render correctly. Variables are
     *        specified as a map where the key is the name of the variable as defined on the screen. The value is an
     *        object which currently has only one property, rawValue, which holds the value of the variable to be passed
     *        to the screen.
     */

    public void setVariables(java.util.Map<String, VariableValue> variables) {
        this.variables = variables;
    }

    /**
     * <p>
     * Variables are optional and are needed only if the screen requires them to render correctly. Variables are
     * specified as a map where the key is the name of the variable as defined on the screen. The value is an object
     * which currently has only one property, rawValue, which holds the value of the variable to be passed to the
     * screen.
     * </p>
     * 
     * @param variables
     *        Variables are optional and are needed only if the screen requires them to render correctly. Variables are
     *        specified as a map where the key is the name of the variable as defined on the screen. The value is an
     *        object which currently has only one property, rawValue, which holds the value of the variable to be passed
     *        to the screen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataRequest withVariables(java.util.Map<String, VariableValue> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * Add a single Variables entry
     *
     * @see GetScreenDataRequest#withVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataRequest addVariablesEntry(String key, VariableValue value) {
        if (null == this.variables) {
            this.variables = new java.util.HashMap<String, VariableValue>();
        }
        if (this.variables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.variables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Variables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataRequest clearVariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * The number of results to be returned on a single page. Specify a number between 1 and 100. The maximum value is
     * 100.
     * </p>
     * <p>
     * This parameter is optional. If you don't specify this parameter, the default page size is 100.
     * </p>
     * 
     * @param maxResults
     *        The number of results to be returned on a single page. Specify a number between 1 and 100. The maximum
     *        value is 100. </p>
     *        <p>
     *        This parameter is optional. If you don't specify this parameter, the default page size is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of results to be returned on a single page. Specify a number between 1 and 100. The maximum value is
     * 100.
     * </p>
     * <p>
     * This parameter is optional. If you don't specify this parameter, the default page size is 100.
     * </p>
     * 
     * @return The number of results to be returned on a single page. Specify a number between 1 and 100. The maximum
     *         value is 100. </p>
     *         <p>
     *         This parameter is optional. If you don't specify this parameter, the default page size is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of results to be returned on a single page. Specify a number between 1 and 100. The maximum value is
     * 100.
     * </p>
     * <p>
     * This parameter is optional. If you don't specify this parameter, the default page size is 100.
     * </p>
     * 
     * @param maxResults
     *        The number of results to be returned on a single page. Specify a number between 1 and 100. The maximum
     *        value is 100. </p>
     *        <p>
     *        This parameter is optional. If you don't specify this parameter, the default page size is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will
     * throw ValidationException.
     * </p>
     * 
     * @param nextToken
     *        This parameter is optional. If a nextToken is not specified, the API returns the first page of data. </p>
     *        <p>
     *        Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the
     *        API will throw ValidationException.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will
     * throw ValidationException.
     * </p>
     * 
     * @return This parameter is optional. If a nextToken is not specified, the API returns the first page of data. </p>
     *         <p>
     *         Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the
     *         API will throw ValidationException.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will
     * throw ValidationException.
     * </p>
     * 
     * @param nextToken
     *        This parameter is optional. If a nextToken is not specified, the API returns the first page of data. </p>
     *        <p>
     *        Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the
     *        API will throw ValidationException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getWorkbookId() != null)
            sb.append("WorkbookId: ").append(getWorkbookId()).append(",");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getScreenId() != null)
            sb.append("ScreenId: ").append(getScreenId()).append(",");
        if (getVariables() != null)
            sb.append("Variables: ").append("***Sensitive Data Redacted***").append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetScreenDataRequest == false)
            return false;
        GetScreenDataRequest other = (GetScreenDataRequest) obj;
        if (other.getWorkbookId() == null ^ this.getWorkbookId() == null)
            return false;
        if (other.getWorkbookId() != null && other.getWorkbookId().equals(this.getWorkbookId()) == false)
            return false;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getScreenId() == null ^ this.getScreenId() == null)
            return false;
        if (other.getScreenId() != null && other.getScreenId().equals(this.getScreenId()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkbookId() == null) ? 0 : getWorkbookId().hashCode());
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getScreenId() == null) ? 0 : getScreenId().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetScreenDataRequest clone() {
        return (GetScreenDataRequest) super.clone();
    }

}
