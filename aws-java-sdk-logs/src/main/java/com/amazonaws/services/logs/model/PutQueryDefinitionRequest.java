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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutQueryDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutQueryDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the query definition. If you are saving a lot of query definitions, we recommend that you name them so
     * that you can easily find the ones you want by using the first part of the name as a filter in the
     * <code>queryDefinitionNamePrefix</code> parameter of <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If you are updating a query definition, use this parameter to specify the ID of the query definition that you
     * want to update. You can use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.
     * </p>
     * <p>
     * If you are creating a query definition, do not specify this parameter. CloudWatch generates a unique ID for the
     * new query definition and include it in the response to this operation.
     * </p>
     */
    private String queryDefinitionId;
    /**
     * <p>
     * Use this parameter to include specific log groups as part of your query definition.
     * </p>
     * <p>
     * If you are updating a query definition and you omit this parameter, then the updated definition will contain no
     * log groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> logGroupNames;
    /**
     * <p>
     * The query string to use for this definition. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     */
    private String queryString;

    /**
     * <p>
     * A name for the query definition. If you are saving a lot of query definitions, we recommend that you name them so
     * that you can easily find the ones you want by using the first part of the name as a filter in the
     * <code>queryDefinitionNamePrefix</code> parameter of <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a>.
     * </p>
     * 
     * @param name
     *        A name for the query definition. If you are saving a lot of query definitions, we recommend that you name
     *        them so that you can easily find the ones you want by using the first part of the name as a filter in the
     *        <code>queryDefinitionNamePrefix</code> parameter of <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     *        >DescribeQueryDefinitions</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the query definition. If you are saving a lot of query definitions, we recommend that you name them so
     * that you can easily find the ones you want by using the first part of the name as a filter in the
     * <code>queryDefinitionNamePrefix</code> parameter of <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a>.
     * </p>
     * 
     * @return A name for the query definition. If you are saving a lot of query definitions, we recommend that you name
     *         them so that you can easily find the ones you want by using the first part of the name as a filter in the
     *         <code>queryDefinitionNamePrefix</code> parameter of <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     *         >DescribeQueryDefinitions</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the query definition. If you are saving a lot of query definitions, we recommend that you name them so
     * that you can easily find the ones you want by using the first part of the name as a filter in the
     * <code>queryDefinitionNamePrefix</code> parameter of <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a>.
     * </p>
     * 
     * @param name
     *        A name for the query definition. If you are saving a lot of query definitions, we recommend that you name
     *        them so that you can easily find the ones you want by using the first part of the name as a filter in the
     *        <code>queryDefinitionNamePrefix</code> parameter of <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     *        >DescribeQueryDefinitions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutQueryDefinitionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If you are updating a query definition, use this parameter to specify the ID of the query definition that you
     * want to update. You can use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.
     * </p>
     * <p>
     * If you are creating a query definition, do not specify this parameter. CloudWatch generates a unique ID for the
     * new query definition and include it in the response to this operation.
     * </p>
     * 
     * @param queryDefinitionId
     *        If you are updating a query definition, use this parameter to specify the ID of the query definition that
     *        you want to update. You can use <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     *        >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.</p>
     *        <p>
     *        If you are creating a query definition, do not specify this parameter. CloudWatch generates a unique ID
     *        for the new query definition and include it in the response to this operation.
     */

    public void setQueryDefinitionId(String queryDefinitionId) {
        this.queryDefinitionId = queryDefinitionId;
    }

    /**
     * <p>
     * If you are updating a query definition, use this parameter to specify the ID of the query definition that you
     * want to update. You can use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.
     * </p>
     * <p>
     * If you are creating a query definition, do not specify this parameter. CloudWatch generates a unique ID for the
     * new query definition and include it in the response to this operation.
     * </p>
     * 
     * @return If you are updating a query definition, use this parameter to specify the ID of the query definition that
     *         you want to update. You can use <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     *         >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.</p>
     *         <p>
     *         If you are creating a query definition, do not specify this parameter. CloudWatch generates a unique ID
     *         for the new query definition and include it in the response to this operation.
     */

    public String getQueryDefinitionId() {
        return this.queryDefinitionId;
    }

    /**
     * <p>
     * If you are updating a query definition, use this parameter to specify the ID of the query definition that you
     * want to update. You can use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     * >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.
     * </p>
     * <p>
     * If you are creating a query definition, do not specify this parameter. CloudWatch generates a unique ID for the
     * new query definition and include it in the response to this operation.
     * </p>
     * 
     * @param queryDefinitionId
     *        If you are updating a query definition, use this parameter to specify the ID of the query definition that
     *        you want to update. You can use <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeQueryDefinitions.html"
     *        >DescribeQueryDefinitions</a> to retrieve the IDs of your saved query definitions.</p>
     *        <p>
     *        If you are creating a query definition, do not specify this parameter. CloudWatch generates a unique ID
     *        for the new query definition and include it in the response to this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutQueryDefinitionRequest withQueryDefinitionId(String queryDefinitionId) {
        setQueryDefinitionId(queryDefinitionId);
        return this;
    }

    /**
     * <p>
     * Use this parameter to include specific log groups as part of your query definition.
     * </p>
     * <p>
     * If you are updating a query definition and you omit this parameter, then the updated definition will contain no
     * log groups.
     * </p>
     * 
     * @return Use this parameter to include specific log groups as part of your query definition.</p>
     *         <p>
     *         If you are updating a query definition and you omit this parameter, then the updated definition will
     *         contain no log groups.
     */

    public java.util.List<String> getLogGroupNames() {
        if (logGroupNames == null) {
            logGroupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logGroupNames;
    }

    /**
     * <p>
     * Use this parameter to include specific log groups as part of your query definition.
     * </p>
     * <p>
     * If you are updating a query definition and you omit this parameter, then the updated definition will contain no
     * log groups.
     * </p>
     * 
     * @param logGroupNames
     *        Use this parameter to include specific log groups as part of your query definition.</p>
     *        <p>
     *        If you are updating a query definition and you omit this parameter, then the updated definition will
     *        contain no log groups.
     */

    public void setLogGroupNames(java.util.Collection<String> logGroupNames) {
        if (logGroupNames == null) {
            this.logGroupNames = null;
            return;
        }

        this.logGroupNames = new com.amazonaws.internal.SdkInternalList<String>(logGroupNames);
    }

    /**
     * <p>
     * Use this parameter to include specific log groups as part of your query definition.
     * </p>
     * <p>
     * If you are updating a query definition and you omit this parameter, then the updated definition will contain no
     * log groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogGroupNames(java.util.Collection)} or {@link #withLogGroupNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param logGroupNames
     *        Use this parameter to include specific log groups as part of your query definition.</p>
     *        <p>
     *        If you are updating a query definition and you omit this parameter, then the updated definition will
     *        contain no log groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutQueryDefinitionRequest withLogGroupNames(String... logGroupNames) {
        if (this.logGroupNames == null) {
            setLogGroupNames(new com.amazonaws.internal.SdkInternalList<String>(logGroupNames.length));
        }
        for (String ele : logGroupNames) {
            this.logGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Use this parameter to include specific log groups as part of your query definition.
     * </p>
     * <p>
     * If you are updating a query definition and you omit this parameter, then the updated definition will contain no
     * log groups.
     * </p>
     * 
     * @param logGroupNames
     *        Use this parameter to include specific log groups as part of your query definition.</p>
     *        <p>
     *        If you are updating a query definition and you omit this parameter, then the updated definition will
     *        contain no log groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutQueryDefinitionRequest withLogGroupNames(java.util.Collection<String> logGroupNames) {
        setLogGroupNames(logGroupNames);
        return this;
    }

    /**
     * <p>
     * The query string to use for this definition. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     * 
     * @param queryString
     *        The query string to use for this definition. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs
     *        Insights Query Syntax</a>.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string to use for this definition. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     * 
     * @return The query string to use for this definition. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs
     *         Insights Query Syntax</a>.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query string to use for this definition. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     * 
     * @param queryString
     *        The query string to use for this definition. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs
     *        Insights Query Syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutQueryDefinitionRequest withQueryString(String queryString) {
        setQueryString(queryString);
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
        if (getQueryDefinitionId() != null)
            sb.append("QueryDefinitionId: ").append(getQueryDefinitionId()).append(",");
        if (getLogGroupNames() != null)
            sb.append("LogGroupNames: ").append(getLogGroupNames()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutQueryDefinitionRequest == false)
            return false;
        PutQueryDefinitionRequest other = (PutQueryDefinitionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQueryDefinitionId() == null ^ this.getQueryDefinitionId() == null)
            return false;
        if (other.getQueryDefinitionId() != null && other.getQueryDefinitionId().equals(this.getQueryDefinitionId()) == false)
            return false;
        if (other.getLogGroupNames() == null ^ this.getLogGroupNames() == null)
            return false;
        if (other.getLogGroupNames() != null && other.getLogGroupNames().equals(this.getLogGroupNames()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQueryDefinitionId() == null) ? 0 : getQueryDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getLogGroupNames() == null) ? 0 : getLogGroupNames().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        return hashCode;
    }

    @Override
    public PutQueryDefinitionRequest clone() {
        return (PutQueryDefinitionRequest) super.clone();
    }

}
