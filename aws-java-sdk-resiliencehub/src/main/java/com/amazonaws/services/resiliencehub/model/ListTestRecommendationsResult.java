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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListTestRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The test recommendations for the Resilience Hub application.
     * </p>
     */
    private java.util.List<TestRecommendation> testRecommendations;

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRecommendationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The test recommendations for the Resilience Hub application.
     * </p>
     * 
     * @return The test recommendations for the Resilience Hub application.
     */

    public java.util.List<TestRecommendation> getTestRecommendations() {
        return testRecommendations;
    }

    /**
     * <p>
     * The test recommendations for the Resilience Hub application.
     * </p>
     * 
     * @param testRecommendations
     *        The test recommendations for the Resilience Hub application.
     */

    public void setTestRecommendations(java.util.Collection<TestRecommendation> testRecommendations) {
        if (testRecommendations == null) {
            this.testRecommendations = null;
            return;
        }

        this.testRecommendations = new java.util.ArrayList<TestRecommendation>(testRecommendations);
    }

    /**
     * <p>
     * The test recommendations for the Resilience Hub application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestRecommendations(java.util.Collection)} or {@link #withTestRecommendations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param testRecommendations
     *        The test recommendations for the Resilience Hub application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRecommendationsResult withTestRecommendations(TestRecommendation... testRecommendations) {
        if (this.testRecommendations == null) {
            setTestRecommendations(new java.util.ArrayList<TestRecommendation>(testRecommendations.length));
        }
        for (TestRecommendation ele : testRecommendations) {
            this.testRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The test recommendations for the Resilience Hub application.
     * </p>
     * 
     * @param testRecommendations
     *        The test recommendations for the Resilience Hub application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRecommendationsResult withTestRecommendations(java.util.Collection<TestRecommendation> testRecommendations) {
        setTestRecommendations(testRecommendations);
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
        if (getTestRecommendations() != null)
            sb.append("TestRecommendations: ").append(getTestRecommendations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTestRecommendationsResult == false)
            return false;
        ListTestRecommendationsResult other = (ListTestRecommendationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTestRecommendations() == null ^ this.getTestRecommendations() == null)
            return false;
        if (other.getTestRecommendations() != null && other.getTestRecommendations().equals(this.getTestRecommendations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTestRecommendations() == null) ? 0 : getTestRecommendations().hashCode());
        return hashCode;
    }

    @Override
    public ListTestRecommendationsResult clone() {
        try {
            return (ListTestRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
