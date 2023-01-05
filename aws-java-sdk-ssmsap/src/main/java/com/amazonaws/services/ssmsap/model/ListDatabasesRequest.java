/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListDatabases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatabasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private String applicationId;
    /** <p/> */
    private String componentId;
    /** <p/> */
    private String nextToken;
    /** <p/> */
    private Integer maxResults;

    /**
     * <p/>
     * 
     * @param applicationId
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p/>
     * 
     * @param applicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param componentId
     */

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getComponentId() {
        return this.componentId;
    }

    /**
     * <p/>
     * 
     * @param componentId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesRequest withComponentId(String componentId) {
        setComponentId(componentId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p/>
     * 
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p/>
     * 
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p/>
     * 
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatabasesRequest withMaxResults(Integer maxResults) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getComponentId() != null)
            sb.append("ComponentId: ").append(getComponentId()).append(",");
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

        if (obj instanceof ListDatabasesRequest == false)
            return false;
        ListDatabasesRequest other = (ListDatabasesRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getComponentId() == null ^ this.getComponentId() == null)
            return false;
        if (other.getComponentId() != null && other.getComponentId().equals(this.getComponentId()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListDatabasesRequest clone() {
        return (ListDatabasesRequest) super.clone();
    }

}
