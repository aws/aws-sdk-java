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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response to the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListArchiveRules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListArchiveRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of archive rules created for the specified analyzer.
     * </p>
     */
    private java.util.List<ArchiveRuleSummary> archiveRules;
    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of archive rules created for the specified analyzer.
     * </p>
     * 
     * @return A list of archive rules created for the specified analyzer.
     */

    public java.util.List<ArchiveRuleSummary> getArchiveRules() {
        return archiveRules;
    }

    /**
     * <p>
     * A list of archive rules created for the specified analyzer.
     * </p>
     * 
     * @param archiveRules
     *        A list of archive rules created for the specified analyzer.
     */

    public void setArchiveRules(java.util.Collection<ArchiveRuleSummary> archiveRules) {
        if (archiveRules == null) {
            this.archiveRules = null;
            return;
        }

        this.archiveRules = new java.util.ArrayList<ArchiveRuleSummary>(archiveRules);
    }

    /**
     * <p>
     * A list of archive rules created for the specified analyzer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArchiveRules(java.util.Collection)} or {@link #withArchiveRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param archiveRules
     *        A list of archive rules created for the specified analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArchiveRulesResult withArchiveRules(ArchiveRuleSummary... archiveRules) {
        if (this.archiveRules == null) {
            setArchiveRules(new java.util.ArrayList<ArchiveRuleSummary>(archiveRules.length));
        }
        for (ArchiveRuleSummary ele : archiveRules) {
            this.archiveRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of archive rules created for the specified analyzer.
     * </p>
     * 
     * @param archiveRules
     *        A list of archive rules created for the specified analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArchiveRulesResult withArchiveRules(java.util.Collection<ArchiveRuleSummary> archiveRules) {
        setArchiveRules(archiveRules);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArchiveRulesResult withNextToken(String nextToken) {
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
        if (getArchiveRules() != null)
            sb.append("ArchiveRules: ").append(getArchiveRules()).append(",");
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

        if (obj instanceof ListArchiveRulesResult == false)
            return false;
        ListArchiveRulesResult other = (ListArchiveRulesResult) obj;
        if (other.getArchiveRules() == null ^ this.getArchiveRules() == null)
            return false;
        if (other.getArchiveRules() != null && other.getArchiveRules().equals(this.getArchiveRules()) == false)
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

        hashCode = prime * hashCode + ((getArchiveRules() == null) ? 0 : getArchiveRules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListArchiveRulesResult clone() {
        try {
            return (ListArchiveRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
