/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetOutcomes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOutcomesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The outcomes.
     * </p>
     */
    private java.util.List<Outcome> outcomes;
    /**
     * <p>
     * The next page token for subsequent requests.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The outcomes.
     * </p>
     * 
     * @return The outcomes.
     */

    public java.util.List<Outcome> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     * 
     * @param outcomes
     *        The outcomes.
     */

    public void setOutcomes(java.util.Collection<Outcome> outcomes) {
        if (outcomes == null) {
            this.outcomes = null;
            return;
        }

        this.outcomes = new java.util.ArrayList<Outcome>(outcomes);
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutcomes(java.util.Collection)} or {@link #withOutcomes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outcomes
     *        The outcomes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOutcomesResult withOutcomes(Outcome... outcomes) {
        if (this.outcomes == null) {
            setOutcomes(new java.util.ArrayList<Outcome>(outcomes.length));
        }
        for (Outcome ele : outcomes) {
            this.outcomes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     * 
     * @param outcomes
     *        The outcomes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOutcomesResult withOutcomes(java.util.Collection<Outcome> outcomes) {
        setOutcomes(outcomes);
        return this;
    }

    /**
     * <p>
     * The next page token for subsequent requests.
     * </p>
     * 
     * @param nextToken
     *        The next page token for subsequent requests.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token for subsequent requests.
     * </p>
     * 
     * @return The next page token for subsequent requests.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next page token for subsequent requests.
     * </p>
     * 
     * @param nextToken
     *        The next page token for subsequent requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOutcomesResult withNextToken(String nextToken) {
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
        if (getOutcomes() != null)
            sb.append("Outcomes: ").append(getOutcomes()).append(",");
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

        if (obj instanceof GetOutcomesResult == false)
            return false;
        GetOutcomesResult other = (GetOutcomesResult) obj;
        if (other.getOutcomes() == null ^ this.getOutcomes() == null)
            return false;
        if (other.getOutcomes() != null && other.getOutcomes().equals(this.getOutcomes()) == false)
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

        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetOutcomesResult clone() {
        try {
            return (GetOutcomesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
