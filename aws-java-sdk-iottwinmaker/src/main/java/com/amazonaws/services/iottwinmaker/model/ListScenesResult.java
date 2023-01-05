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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListScenes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScenesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects that contain information about the scenes.
     * </p>
     */
    private java.util.List<SceneSummary> sceneSummaries;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects that contain information about the scenes.
     * </p>
     * 
     * @return A list of objects that contain information about the scenes.
     */

    public java.util.List<SceneSummary> getSceneSummaries() {
        return sceneSummaries;
    }

    /**
     * <p>
     * A list of objects that contain information about the scenes.
     * </p>
     * 
     * @param sceneSummaries
     *        A list of objects that contain information about the scenes.
     */

    public void setSceneSummaries(java.util.Collection<SceneSummary> sceneSummaries) {
        if (sceneSummaries == null) {
            this.sceneSummaries = null;
            return;
        }

        this.sceneSummaries = new java.util.ArrayList<SceneSummary>(sceneSummaries);
    }

    /**
     * <p>
     * A list of objects that contain information about the scenes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSceneSummaries(java.util.Collection)} or {@link #withSceneSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sceneSummaries
     *        A list of objects that contain information about the scenes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScenesResult withSceneSummaries(SceneSummary... sceneSummaries) {
        if (this.sceneSummaries == null) {
            setSceneSummaries(new java.util.ArrayList<SceneSummary>(sceneSummaries.length));
        }
        for (SceneSummary ele : sceneSummaries) {
            this.sceneSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain information about the scenes.
     * </p>
     * 
     * @param sceneSummaries
     *        A list of objects that contain information about the scenes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScenesResult withSceneSummaries(java.util.Collection<SceneSummary> sceneSummaries) {
        setSceneSummaries(sceneSummaries);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScenesResult withNextToken(String nextToken) {
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
        if (getSceneSummaries() != null)
            sb.append("SceneSummaries: ").append(getSceneSummaries()).append(",");
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

        if (obj instanceof ListScenesResult == false)
            return false;
        ListScenesResult other = (ListScenesResult) obj;
        if (other.getSceneSummaries() == null ^ this.getSceneSummaries() == null)
            return false;
        if (other.getSceneSummaries() != null && other.getSceneSummaries().equals(this.getSceneSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSceneSummaries() == null) ? 0 : getSceneSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListScenesResult clone() {
        try {
            return (ListScenesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
