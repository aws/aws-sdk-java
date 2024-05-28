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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListLogSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLogSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of log sources in your organization that send data to the data lake.
     * </p>
     */
    private java.util.List<LogSource> sources;

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. You can repeat the call using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @return If nextToken is returned, there are more results available. You can repeat the call using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. You can repeat the call using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of log sources in your organization that send data to the data lake.
     * </p>
     * 
     * @return The list of log sources in your organization that send data to the data lake.
     */

    public java.util.List<LogSource> getSources() {
        return sources;
    }

    /**
     * <p>
     * The list of log sources in your organization that send data to the data lake.
     * </p>
     * 
     * @param sources
     *        The list of log sources in your organization that send data to the data lake.
     */

    public void setSources(java.util.Collection<LogSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<LogSource>(sources);
    }

    /**
     * <p>
     * The list of log sources in your organization that send data to the data lake.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The list of log sources in your organization that send data to the data lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesResult withSources(LogSource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<LogSource>(sources.length));
        }
        for (LogSource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of log sources in your organization that send data to the data lake.
     * </p>
     * 
     * @param sources
     *        The list of log sources in your organization that send data to the data lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesResult withSources(java.util.Collection<LogSource> sources) {
        setSources(sources);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLogSourcesResult == false)
            return false;
        ListLogSourcesResult other = (ListLogSourcesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public ListLogSourcesResult clone() {
        try {
            return (ListLogSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
