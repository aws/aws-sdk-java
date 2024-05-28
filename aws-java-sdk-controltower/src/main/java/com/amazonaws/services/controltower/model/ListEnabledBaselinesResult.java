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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListEnabledBaselines" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnabledBaselinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Retuens a list of summaries of <code>EnabledBaseline</code> resources.
     * </p>
     */
    private java.util.List<EnabledBaselineSummary> enabledBaselines;
    /**
     * <p>
     * A pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Retuens a list of summaries of <code>EnabledBaseline</code> resources.
     * </p>
     * 
     * @return Retuens a list of summaries of <code>EnabledBaseline</code> resources.
     */

    public java.util.List<EnabledBaselineSummary> getEnabledBaselines() {
        return enabledBaselines;
    }

    /**
     * <p>
     * Retuens a list of summaries of <code>EnabledBaseline</code> resources.
     * </p>
     * 
     * @param enabledBaselines
     *        Retuens a list of summaries of <code>EnabledBaseline</code> resources.
     */

    public void setEnabledBaselines(java.util.Collection<EnabledBaselineSummary> enabledBaselines) {
        if (enabledBaselines == null) {
            this.enabledBaselines = null;
            return;
        }

        this.enabledBaselines = new java.util.ArrayList<EnabledBaselineSummary>(enabledBaselines);
    }

    /**
     * <p>
     * Retuens a list of summaries of <code>EnabledBaseline</code> resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledBaselines(java.util.Collection)} or {@link #withEnabledBaselines(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param enabledBaselines
     *        Retuens a list of summaries of <code>EnabledBaseline</code> resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledBaselinesResult withEnabledBaselines(EnabledBaselineSummary... enabledBaselines) {
        if (this.enabledBaselines == null) {
            setEnabledBaselines(new java.util.ArrayList<EnabledBaselineSummary>(enabledBaselines.length));
        }
        for (EnabledBaselineSummary ele : enabledBaselines) {
            this.enabledBaselines.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Retuens a list of summaries of <code>EnabledBaseline</code> resources.
     * </p>
     * 
     * @param enabledBaselines
     *        Retuens a list of summaries of <code>EnabledBaseline</code> resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledBaselinesResult withEnabledBaselines(java.util.Collection<EnabledBaselineSummary> enabledBaselines) {
        setEnabledBaselines(enabledBaselines);
        return this;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @return A pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledBaselinesResult withNextToken(String nextToken) {
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
        if (getEnabledBaselines() != null)
            sb.append("EnabledBaselines: ").append(getEnabledBaselines()).append(",");
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

        if (obj instanceof ListEnabledBaselinesResult == false)
            return false;
        ListEnabledBaselinesResult other = (ListEnabledBaselinesResult) obj;
        if (other.getEnabledBaselines() == null ^ this.getEnabledBaselines() == null)
            return false;
        if (other.getEnabledBaselines() != null && other.getEnabledBaselines().equals(this.getEnabledBaselines()) == false)
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

        hashCode = prime * hashCode + ((getEnabledBaselines() == null) ? 0 : getEnabledBaselines().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnabledBaselinesResult clone() {
        try {
            return (ListEnabledBaselinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
