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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParametersByPath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParametersByPathRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A
     * parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy:
     * <code>/Finance/Prod/IAD/WinServ2016/license33</code>
     * </p>
     */
    private String path;
    /**
     * <p>
     * Retrieve all parameters within a hierarchy.
     * </p>
     * <important>
     * <p>
     * If a user has access to a path, then the user can access all levels of that path. For example, if a user has
     * permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has
     * explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath
     * API action recursively for <code>/a</code> and view <code>/a/b</code>.
     * </p>
     * </important>
     */
    private Boolean recursive;
    /**
     * <p>
     * Filters to limit the request results.
     * </p>
     * <note>
     * <p>
     * You can't filter using the parameter name.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<ParameterStringFilter> parameterFilters;
    /**
     * <p>
     * Retrieve all parameters in a hierarchy with their value decrypted.
     * </p>
     */
    private Boolean withDecryption;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A
     * parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy:
     * <code>/Finance/Prod/IAD/WinServ2016/license33</code>
     * </p>
     * 
     * @param path
     *        The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter
     *        name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy:
     *        <code>/Finance/Prod/IAD/WinServ2016/license33</code>
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A
     * parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy:
     * <code>/Finance/Prod/IAD/WinServ2016/license33</code>
     * </p>
     * 
     * @return The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter
     *         name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy:
     *         <code>/Finance/Prod/IAD/WinServ2016/license33</code>
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A
     * parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy:
     * <code>/Finance/Prod/IAD/WinServ2016/license33</code>
     * </p>
     * 
     * @param path
     *        The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter
     *        name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy:
     *        <code>/Finance/Prod/IAD/WinServ2016/license33</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersByPathRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Retrieve all parameters within a hierarchy.
     * </p>
     * <important>
     * <p>
     * If a user has access to a path, then the user can access all levels of that path. For example, if a user has
     * permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has
     * explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath
     * API action recursively for <code>/a</code> and view <code>/a/b</code>.
     * </p>
     * </important>
     * 
     * @param recursive
     *        Retrieve all parameters within a hierarchy.</p> <important>
     *        <p>
     *        If a user has access to a path, then the user can access all levels of that path. For example, if a user
     *        has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a
     *        user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the
     *        GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.
     *        </p>
     */

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    /**
     * <p>
     * Retrieve all parameters within a hierarchy.
     * </p>
     * <important>
     * <p>
     * If a user has access to a path, then the user can access all levels of that path. For example, if a user has
     * permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has
     * explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath
     * API action recursively for <code>/a</code> and view <code>/a/b</code>.
     * </p>
     * </important>
     * 
     * @return Retrieve all parameters within a hierarchy.</p> <important>
     *         <p>
     *         If a user has access to a path, then the user can access all levels of that path. For example, if a user
     *         has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a
     *         user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the
     *         GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.
     *         </p>
     */

    public Boolean getRecursive() {
        return this.recursive;
    }

    /**
     * <p>
     * Retrieve all parameters within a hierarchy.
     * </p>
     * <important>
     * <p>
     * If a user has access to a path, then the user can access all levels of that path. For example, if a user has
     * permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has
     * explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath
     * API action recursively for <code>/a</code> and view <code>/a/b</code>.
     * </p>
     * </important>
     * 
     * @param recursive
     *        Retrieve all parameters within a hierarchy.</p> <important>
     *        <p>
     *        If a user has access to a path, then the user can access all levels of that path. For example, if a user
     *        has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a
     *        user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the
     *        GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersByPathRequest withRecursive(Boolean recursive) {
        setRecursive(recursive);
        return this;
    }

    /**
     * <p>
     * Retrieve all parameters within a hierarchy.
     * </p>
     * <important>
     * <p>
     * If a user has access to a path, then the user can access all levels of that path. For example, if a user has
     * permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has
     * explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath
     * API action recursively for <code>/a</code> and view <code>/a/b</code>.
     * </p>
     * </important>
     * 
     * @return Retrieve all parameters within a hierarchy.</p> <important>
     *         <p>
     *         If a user has access to a path, then the user can access all levels of that path. For example, if a user
     *         has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a
     *         user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the
     *         GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.
     *         </p>
     */

    public Boolean isRecursive() {
        return this.recursive;
    }

    /**
     * <p>
     * Filters to limit the request results.
     * </p>
     * <note>
     * <p>
     * You can't filter using the parameter name.
     * </p>
     * </note>
     * 
     * @return Filters to limit the request results.</p> <note>
     *         <p>
     *         You can't filter using the parameter name.
     *         </p>
     */

    public java.util.List<ParameterStringFilter> getParameterFilters() {
        if (parameterFilters == null) {
            parameterFilters = new com.amazonaws.internal.SdkInternalList<ParameterStringFilter>();
        }
        return parameterFilters;
    }

    /**
     * <p>
     * Filters to limit the request results.
     * </p>
     * <note>
     * <p>
     * You can't filter using the parameter name.
     * </p>
     * </note>
     * 
     * @param parameterFilters
     *        Filters to limit the request results.</p> <note>
     *        <p>
     *        You can't filter using the parameter name.
     *        </p>
     */

    public void setParameterFilters(java.util.Collection<ParameterStringFilter> parameterFilters) {
        if (parameterFilters == null) {
            this.parameterFilters = null;
            return;
        }

        this.parameterFilters = new com.amazonaws.internal.SdkInternalList<ParameterStringFilter>(parameterFilters);
    }

    /**
     * <p>
     * Filters to limit the request results.
     * </p>
     * <note>
     * <p>
     * You can't filter using the parameter name.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterFilters(java.util.Collection)} or {@link #withParameterFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param parameterFilters
     *        Filters to limit the request results.</p> <note>
     *        <p>
     *        You can't filter using the parameter name.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersByPathRequest withParameterFilters(ParameterStringFilter... parameterFilters) {
        if (this.parameterFilters == null) {
            setParameterFilters(new com.amazonaws.internal.SdkInternalList<ParameterStringFilter>(parameterFilters.length));
        }
        for (ParameterStringFilter ele : parameterFilters) {
            this.parameterFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters to limit the request results.
     * </p>
     * <note>
     * <p>
     * You can't filter using the parameter name.
     * </p>
     * </note>
     * 
     * @param parameterFilters
     *        Filters to limit the request results.</p> <note>
     *        <p>
     *        You can't filter using the parameter name.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersByPathRequest withParameterFilters(java.util.Collection<ParameterStringFilter> parameterFilters) {
        setParameterFilters(parameterFilters);
        return this;
    }

    /**
     * <p>
     * Retrieve all parameters in a hierarchy with their value decrypted.
     * </p>
     * 
     * @param withDecryption
     *        Retrieve all parameters in a hierarchy with their value decrypted.
     */

    public void setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
    }

    /**
     * <p>
     * Retrieve all parameters in a hierarchy with their value decrypted.
     * </p>
     * 
     * @return Retrieve all parameters in a hierarchy with their value decrypted.
     */

    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

    /**
     * <p>
     * Retrieve all parameters in a hierarchy with their value decrypted.
     * </p>
     * 
     * @param withDecryption
     *        Retrieve all parameters in a hierarchy with their value decrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersByPathRequest withWithDecryption(Boolean withDecryption) {
        setWithDecryption(withDecryption);
        return this;
    }

    /**
     * <p>
     * Retrieve all parameters in a hierarchy with their value decrypted.
     * </p>
     * 
     * @return Retrieve all parameters in a hierarchy with their value decrypted.
     */

    public Boolean isWithDecryption() {
        return this.withDecryption;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersByPathRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersByPathRequest withNextToken(String nextToken) {
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRecursive() != null)
            sb.append("Recursive: ").append(getRecursive()).append(",");
        if (getParameterFilters() != null)
            sb.append("ParameterFilters: ").append(getParameterFilters()).append(",");
        if (getWithDecryption() != null)
            sb.append("WithDecryption: ").append(getWithDecryption()).append(",");
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

        if (obj instanceof GetParametersByPathRequest == false)
            return false;
        GetParametersByPathRequest other = (GetParametersByPathRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRecursive() == null ^ this.getRecursive() == null)
            return false;
        if (other.getRecursive() != null && other.getRecursive().equals(this.getRecursive()) == false)
            return false;
        if (other.getParameterFilters() == null ^ this.getParameterFilters() == null)
            return false;
        if (other.getParameterFilters() != null && other.getParameterFilters().equals(this.getParameterFilters()) == false)
            return false;
        if (other.getWithDecryption() == null ^ this.getWithDecryption() == null)
            return false;
        if (other.getWithDecryption() != null && other.getWithDecryption().equals(this.getWithDecryption()) == false)
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

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRecursive() == null) ? 0 : getRecursive().hashCode());
        hashCode = prime * hashCode + ((getParameterFilters() == null) ? 0 : getParameterFilters().hashCode());
        hashCode = prime * hashCode + ((getWithDecryption() == null) ? 0 : getWithDecryption().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetParametersByPathRequest clone() {
        return (GetParametersByPathRequest) super.clone();
    }

}
