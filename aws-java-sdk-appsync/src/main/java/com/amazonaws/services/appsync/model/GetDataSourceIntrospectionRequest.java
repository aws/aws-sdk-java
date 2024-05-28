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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetDataSourceIntrospection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSourceIntrospectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The introspection ID. Each introspection contains a unique ID that can be used to reference the instrospection
     * record.
     * </p>
     */
    private String introspectionId;
    /**
     * <p>
     * A boolean flag that determines whether SDL should be generated for introspected types or not. If set to
     * <code>true</code>, each model will contain an <code>sdl</code> property that contains the SDL for that type. The
     * SDL only contains the type data and no additional metadata or directives.
     * </p>
     */
    private Boolean includeModelsSDL;
    /**
     * <p>
     * Determines the number of types to be returned in a single response before paginating. This value is typically
     * taken from <code>nextToken</code> value from the previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of introspected types that will be returned in a single response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The introspection ID. Each introspection contains a unique ID that can be used to reference the instrospection
     * record.
     * </p>
     * 
     * @param introspectionId
     *        The introspection ID. Each introspection contains a unique ID that can be used to reference the
     *        instrospection record.
     */

    public void setIntrospectionId(String introspectionId) {
        this.introspectionId = introspectionId;
    }

    /**
     * <p>
     * The introspection ID. Each introspection contains a unique ID that can be used to reference the instrospection
     * record.
     * </p>
     * 
     * @return The introspection ID. Each introspection contains a unique ID that can be used to reference the
     *         instrospection record.
     */

    public String getIntrospectionId() {
        return this.introspectionId;
    }

    /**
     * <p>
     * The introspection ID. Each introspection contains a unique ID that can be used to reference the instrospection
     * record.
     * </p>
     * 
     * @param introspectionId
     *        The introspection ID. Each introspection contains a unique ID that can be used to reference the
     *        instrospection record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceIntrospectionRequest withIntrospectionId(String introspectionId) {
        setIntrospectionId(introspectionId);
        return this;
    }

    /**
     * <p>
     * A boolean flag that determines whether SDL should be generated for introspected types or not. If set to
     * <code>true</code>, each model will contain an <code>sdl</code> property that contains the SDL for that type. The
     * SDL only contains the type data and no additional metadata or directives.
     * </p>
     * 
     * @param includeModelsSDL
     *        A boolean flag that determines whether SDL should be generated for introspected types or not. If set to
     *        <code>true</code>, each model will contain an <code>sdl</code> property that contains the SDL for that
     *        type. The SDL only contains the type data and no additional metadata or directives.
     */

    public void setIncludeModelsSDL(Boolean includeModelsSDL) {
        this.includeModelsSDL = includeModelsSDL;
    }

    /**
     * <p>
     * A boolean flag that determines whether SDL should be generated for introspected types or not. If set to
     * <code>true</code>, each model will contain an <code>sdl</code> property that contains the SDL for that type. The
     * SDL only contains the type data and no additional metadata or directives.
     * </p>
     * 
     * @return A boolean flag that determines whether SDL should be generated for introspected types or not. If set to
     *         <code>true</code>, each model will contain an <code>sdl</code> property that contains the SDL for that
     *         type. The SDL only contains the type data and no additional metadata or directives.
     */

    public Boolean getIncludeModelsSDL() {
        return this.includeModelsSDL;
    }

    /**
     * <p>
     * A boolean flag that determines whether SDL should be generated for introspected types or not. If set to
     * <code>true</code>, each model will contain an <code>sdl</code> property that contains the SDL for that type. The
     * SDL only contains the type data and no additional metadata or directives.
     * </p>
     * 
     * @param includeModelsSDL
     *        A boolean flag that determines whether SDL should be generated for introspected types or not. If set to
     *        <code>true</code>, each model will contain an <code>sdl</code> property that contains the SDL for that
     *        type. The SDL only contains the type data and no additional metadata or directives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceIntrospectionRequest withIncludeModelsSDL(Boolean includeModelsSDL) {
        setIncludeModelsSDL(includeModelsSDL);
        return this;
    }

    /**
     * <p>
     * A boolean flag that determines whether SDL should be generated for introspected types or not. If set to
     * <code>true</code>, each model will contain an <code>sdl</code> property that contains the SDL for that type. The
     * SDL only contains the type data and no additional metadata or directives.
     * </p>
     * 
     * @return A boolean flag that determines whether SDL should be generated for introspected types or not. If set to
     *         <code>true</code>, each model will contain an <code>sdl</code> property that contains the SDL for that
     *         type. The SDL only contains the type data and no additional metadata or directives.
     */

    public Boolean isIncludeModelsSDL() {
        return this.includeModelsSDL;
    }

    /**
     * <p>
     * Determines the number of types to be returned in a single response before paginating. This value is typically
     * taken from <code>nextToken</code> value from the previous response.
     * </p>
     * 
     * @param nextToken
     *        Determines the number of types to be returned in a single response before paginating. This value is
     *        typically taken from <code>nextToken</code> value from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Determines the number of types to be returned in a single response before paginating. This value is typically
     * taken from <code>nextToken</code> value from the previous response.
     * </p>
     * 
     * @return Determines the number of types to be returned in a single response before paginating. This value is
     *         typically taken from <code>nextToken</code> value from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Determines the number of types to be returned in a single response before paginating. This value is typically
     * taken from <code>nextToken</code> value from the previous response.
     * </p>
     * 
     * @param nextToken
     *        Determines the number of types to be returned in a single response before paginating. This value is
     *        typically taken from <code>nextToken</code> value from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceIntrospectionRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of introspected types that will be returned in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of introspected types that will be returned in a single response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of introspected types that will be returned in a single response.
     * </p>
     * 
     * @return The maximum number of introspected types that will be returned in a single response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of introspected types that will be returned in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of introspected types that will be returned in a single response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceIntrospectionRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getIntrospectionId() != null)
            sb.append("IntrospectionId: ").append(getIntrospectionId()).append(",");
        if (getIncludeModelsSDL() != null)
            sb.append("IncludeModelsSDL: ").append(getIncludeModelsSDL()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataSourceIntrospectionRequest == false)
            return false;
        GetDataSourceIntrospectionRequest other = (GetDataSourceIntrospectionRequest) obj;
        if (other.getIntrospectionId() == null ^ this.getIntrospectionId() == null)
            return false;
        if (other.getIntrospectionId() != null && other.getIntrospectionId().equals(this.getIntrospectionId()) == false)
            return false;
        if (other.getIncludeModelsSDL() == null ^ this.getIncludeModelsSDL() == null)
            return false;
        if (other.getIncludeModelsSDL() != null && other.getIncludeModelsSDL().equals(this.getIncludeModelsSDL()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntrospectionId() == null) ? 0 : getIntrospectionId().hashCode());
        hashCode = prime * hashCode + ((getIncludeModelsSDL() == null) ? 0 : getIncludeModelsSDL().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetDataSourceIntrospectionRequest clone() {
        return (GetDataSourceIntrospectionRequest) super.clone();
    }

}
