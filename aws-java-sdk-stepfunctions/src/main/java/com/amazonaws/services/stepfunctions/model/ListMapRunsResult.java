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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListMapRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMapRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array that lists information related to a Map Run, such as the Amazon Resource Name (ARN) of the Map Run and
     * the ARN of the state machine that started the Map Run.
     * </p>
     */
    private java.util.List<MapRunListItem> mapRuns;
    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array that lists information related to a Map Run, such as the Amazon Resource Name (ARN) of the Map Run and
     * the ARN of the state machine that started the Map Run.
     * </p>
     * 
     * @return An array that lists information related to a Map Run, such as the Amazon Resource Name (ARN) of the Map
     *         Run and the ARN of the state machine that started the Map Run.
     */

    public java.util.List<MapRunListItem> getMapRuns() {
        return mapRuns;
    }

    /**
     * <p>
     * An array that lists information related to a Map Run, such as the Amazon Resource Name (ARN) of the Map Run and
     * the ARN of the state machine that started the Map Run.
     * </p>
     * 
     * @param mapRuns
     *        An array that lists information related to a Map Run, such as the Amazon Resource Name (ARN) of the Map
     *        Run and the ARN of the state machine that started the Map Run.
     */

    public void setMapRuns(java.util.Collection<MapRunListItem> mapRuns) {
        if (mapRuns == null) {
            this.mapRuns = null;
            return;
        }

        this.mapRuns = new java.util.ArrayList<MapRunListItem>(mapRuns);
    }

    /**
     * <p>
     * An array that lists information related to a Map Run, such as the Amazon Resource Name (ARN) of the Map Run and
     * the ARN of the state machine that started the Map Run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMapRuns(java.util.Collection)} or {@link #withMapRuns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param mapRuns
     *        An array that lists information related to a Map Run, such as the Amazon Resource Name (ARN) of the Map
     *        Run and the ARN of the state machine that started the Map Run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMapRunsResult withMapRuns(MapRunListItem... mapRuns) {
        if (this.mapRuns == null) {
            setMapRuns(new java.util.ArrayList<MapRunListItem>(mapRuns.length));
        }
        for (MapRunListItem ele : mapRuns) {
            this.mapRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists information related to a Map Run, such as the Amazon Resource Name (ARN) of the Map Run and
     * the ARN of the state machine that started the Map Run.
     * </p>
     * 
     * @param mapRuns
     *        An array that lists information related to a Map Run, such as the Amazon Resource Name (ARN) of the Map
     *        Run and the ARN of the state machine that started the Map Run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMapRunsResult withMapRuns(java.util.Collection<MapRunListItem> mapRuns) {
        setMapRuns(mapRuns);
        return this;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken</i> error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * 
     * @return If <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *         24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken</i> error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken</i> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMapRunsResult withNextToken(String nextToken) {
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
        if (getMapRuns() != null)
            sb.append("MapRuns: ").append(getMapRuns()).append(",");
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

        if (obj instanceof ListMapRunsResult == false)
            return false;
        ListMapRunsResult other = (ListMapRunsResult) obj;
        if (other.getMapRuns() == null ^ this.getMapRuns() == null)
            return false;
        if (other.getMapRuns() != null && other.getMapRuns().equals(this.getMapRuns()) == false)
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

        hashCode = prime * hashCode + ((getMapRuns() == null) ? 0 : getMapRuns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMapRunsResult clone() {
        try {
            return (ListMapRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
