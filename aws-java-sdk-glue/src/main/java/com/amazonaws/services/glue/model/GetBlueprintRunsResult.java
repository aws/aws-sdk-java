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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetBlueprintRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBlueprintRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of <code>BlueprintRun</code> objects.
     * </p>
     */
    private java.util.List<BlueprintRun> blueprintRuns;
    /**
     * <p>
     * A continuation token, if not all blueprint runs have been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list of <code>BlueprintRun</code> objects.
     * </p>
     * 
     * @return Returns a list of <code>BlueprintRun</code> objects.
     */

    public java.util.List<BlueprintRun> getBlueprintRuns() {
        return blueprintRuns;
    }

    /**
     * <p>
     * Returns a list of <code>BlueprintRun</code> objects.
     * </p>
     * 
     * @param blueprintRuns
     *        Returns a list of <code>BlueprintRun</code> objects.
     */

    public void setBlueprintRuns(java.util.Collection<BlueprintRun> blueprintRuns) {
        if (blueprintRuns == null) {
            this.blueprintRuns = null;
            return;
        }

        this.blueprintRuns = new java.util.ArrayList<BlueprintRun>(blueprintRuns);
    }

    /**
     * <p>
     * Returns a list of <code>BlueprintRun</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlueprintRuns(java.util.Collection)} or {@link #withBlueprintRuns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param blueprintRuns
     *        Returns a list of <code>BlueprintRun</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintRunsResult withBlueprintRuns(BlueprintRun... blueprintRuns) {
        if (this.blueprintRuns == null) {
            setBlueprintRuns(new java.util.ArrayList<BlueprintRun>(blueprintRuns.length));
        }
        for (BlueprintRun ele : blueprintRuns) {
            this.blueprintRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of <code>BlueprintRun</code> objects.
     * </p>
     * 
     * @param blueprintRuns
     *        Returns a list of <code>BlueprintRun</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintRunsResult withBlueprintRuns(java.util.Collection<BlueprintRun> blueprintRuns) {
        setBlueprintRuns(blueprintRuns);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all blueprint runs have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all blueprint runs have been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all blueprint runs have been returned.
     * </p>
     * 
     * @return A continuation token, if not all blueprint runs have been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all blueprint runs have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all blueprint runs have been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintRunsResult withNextToken(String nextToken) {
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
        if (getBlueprintRuns() != null)
            sb.append("BlueprintRuns: ").append(getBlueprintRuns()).append(",");
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

        if (obj instanceof GetBlueprintRunsResult == false)
            return false;
        GetBlueprintRunsResult other = (GetBlueprintRunsResult) obj;
        if (other.getBlueprintRuns() == null ^ this.getBlueprintRuns() == null)
            return false;
        if (other.getBlueprintRuns() != null && other.getBlueprintRuns().equals(this.getBlueprintRuns()) == false)
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

        hashCode = prime * hashCode + ((getBlueprintRuns() == null) ? 0 : getBlueprintRuns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetBlueprintRunsResult clone() {
        try {
            return (GetBlueprintRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
