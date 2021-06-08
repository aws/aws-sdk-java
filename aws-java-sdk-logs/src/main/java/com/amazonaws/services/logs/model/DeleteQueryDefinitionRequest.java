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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteQueryDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteQueryDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the query definition that you want to delete. You can use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.
     * </p>
     */
    private String queryDefinitionId;

    /**
     * <p>
     * The ID of the query definition that you want to delete. You can use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.
     * </p>
     * 
     * @param queryDefinitionId
     *        The ID of the query definition that you want to delete. You can use <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     *        >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.
     */

    public void setQueryDefinitionId(String queryDefinitionId) {
        this.queryDefinitionId = queryDefinitionId;
    }

    /**
     * <p>
     * The ID of the query definition that you want to delete. You can use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.
     * </p>
     * 
     * @return The ID of the query definition that you want to delete. You can use <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     *         >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.
     */

    public String getQueryDefinitionId() {
        return this.queryDefinitionId;
    }

    /**
     * <p>
     * The ID of the query definition that you want to delete. You can use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.
     * </p>
     * 
     * @param queryDefinitionId
     *        The ID of the query definition that you want to delete. You can use <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     *        >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueryDefinitionRequest withQueryDefinitionId(String queryDefinitionId) {
        setQueryDefinitionId(queryDefinitionId);
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
        if (getQueryDefinitionId() != null)
            sb.append("QueryDefinitionId: ").append(getQueryDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteQueryDefinitionRequest == false)
            return false;
        DeleteQueryDefinitionRequest other = (DeleteQueryDefinitionRequest) obj;
        if (other.getQueryDefinitionId() == null ^ this.getQueryDefinitionId() == null)
            return false;
        if (other.getQueryDefinitionId() != null && other.getQueryDefinitionId().equals(this.getQueryDefinitionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryDefinitionId() == null) ? 0 : getQueryDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteQueryDefinitionRequest clone() {
        return (DeleteQueryDefinitionRequest) super.clone();
    }

}
