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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetArchiveRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArchiveRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ArchiveRuleSummary archiveRule;

    /**
     * @param archiveRule
     */

    public void setArchiveRule(ArchiveRuleSummary archiveRule) {
        this.archiveRule = archiveRule;
    }

    /**
     * @return
     */

    public ArchiveRuleSummary getArchiveRule() {
        return this.archiveRule;
    }

    /**
     * @param archiveRule
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveRuleResult withArchiveRule(ArchiveRuleSummary archiveRule) {
        setArchiveRule(archiveRule);
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
        if (getArchiveRule() != null)
            sb.append("ArchiveRule: ").append(getArchiveRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetArchiveRuleResult == false)
            return false;
        GetArchiveRuleResult other = (GetArchiveRuleResult) obj;
        if (other.getArchiveRule() == null ^ this.getArchiveRule() == null)
            return false;
        if (other.getArchiveRule() != null && other.getArchiveRule().equals(this.getArchiveRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveRule() == null) ? 0 : getArchiveRule().hashCode());
        return hashCode;
    }

    @Override
    public GetArchiveRuleResult clone() {
        try {
            return (GetArchiveRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
