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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains details about a saved CloudWatch Logs Insights query definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/QueryDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the query definition.
     * </p>
     */
    private String queryDefinitionId;
    /**
     * <p>
     * The name of the query definition.
     * </p>
     */
    private String name;
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
     * The date that the query definition was most recently modified.
     * </p>
     */
    private Long lastModified;
    /**
     * <p>
     * If this query definition contains a list of log groups that it is limited to, that list appears here.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> logGroupNames;

    /**
     * <p>
     * The unique ID of the query definition.
     * </p>
     * 
     * @param queryDefinitionId
     *        The unique ID of the query definition.
     */

    public void setQueryDefinitionId(String queryDefinitionId) {
        this.queryDefinitionId = queryDefinitionId;
    }

    /**
     * <p>
     * The unique ID of the query definition.
     * </p>
     * 
     * @return The unique ID of the query definition.
     */

    public String getQueryDefinitionId() {
        return this.queryDefinitionId;
    }

    /**
     * <p>
     * The unique ID of the query definition.
     * </p>
     * 
     * @param queryDefinitionId
     *        The unique ID of the query definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryDefinition withQueryDefinitionId(String queryDefinitionId) {
        setQueryDefinitionId(queryDefinitionId);
        return this;
    }

    /**
     * <p>
     * The name of the query definition.
     * </p>
     * 
     * @param name
     *        The name of the query definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the query definition.
     * </p>
     * 
     * @return The name of the query definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the query definition.
     * </p>
     * 
     * @param name
     *        The name of the query definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryDefinition withName(String name) {
        setName(name);
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

    public QueryDefinition withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The date that the query definition was most recently modified.
     * </p>
     * 
     * @param lastModified
     *        The date that the query definition was most recently modified.
     */

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date that the query definition was most recently modified.
     * </p>
     * 
     * @return The date that the query definition was most recently modified.
     */

    public Long getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date that the query definition was most recently modified.
     * </p>
     * 
     * @param lastModified
     *        The date that the query definition was most recently modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryDefinition withLastModified(Long lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * If this query definition contains a list of log groups that it is limited to, that list appears here.
     * </p>
     * 
     * @return If this query definition contains a list of log groups that it is limited to, that list appears here.
     */

    public java.util.List<String> getLogGroupNames() {
        if (logGroupNames == null) {
            logGroupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logGroupNames;
    }

    /**
     * <p>
     * If this query definition contains a list of log groups that it is limited to, that list appears here.
     * </p>
     * 
     * @param logGroupNames
     *        If this query definition contains a list of log groups that it is limited to, that list appears here.
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
     * If this query definition contains a list of log groups that it is limited to, that list appears here.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogGroupNames(java.util.Collection)} or {@link #withLogGroupNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param logGroupNames
     *        If this query definition contains a list of log groups that it is limited to, that list appears here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryDefinition withLogGroupNames(String... logGroupNames) {
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
     * If this query definition contains a list of log groups that it is limited to, that list appears here.
     * </p>
     * 
     * @param logGroupNames
     *        If this query definition contains a list of log groups that it is limited to, that list appears here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryDefinition withLogGroupNames(java.util.Collection<String> logGroupNames) {
        setLogGroupNames(logGroupNames);
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
            sb.append("QueryDefinitionId: ").append(getQueryDefinitionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getLogGroupNames() != null)
            sb.append("LogGroupNames: ").append(getLogGroupNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryDefinition == false)
            return false;
        QueryDefinition other = (QueryDefinition) obj;
        if (other.getQueryDefinitionId() == null ^ this.getQueryDefinitionId() == null)
            return false;
        if (other.getQueryDefinitionId() != null && other.getQueryDefinitionId().equals(this.getQueryDefinitionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getLogGroupNames() == null ^ this.getLogGroupNames() == null)
            return false;
        if (other.getLogGroupNames() != null && other.getLogGroupNames().equals(this.getLogGroupNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryDefinitionId() == null) ? 0 : getQueryDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getLogGroupNames() == null) ? 0 : getLogGroupNames().hashCode());
        return hashCode;
    }

    @Override
    public QueryDefinition clone() {
        try {
            return (QueryDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.QueryDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
