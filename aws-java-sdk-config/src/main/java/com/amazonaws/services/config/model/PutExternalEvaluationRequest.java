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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutExternalEvaluation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutExternalEvaluationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String configRuleName;

    private ExternalEvaluation externalEvaluation;

    /**
     * @param configRuleName
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * @return
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * @param configRuleName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutExternalEvaluationRequest withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * @param externalEvaluation
     */

    public void setExternalEvaluation(ExternalEvaluation externalEvaluation) {
        this.externalEvaluation = externalEvaluation;
    }

    /**
     * @return
     */

    public ExternalEvaluation getExternalEvaluation() {
        return this.externalEvaluation;
    }

    /**
     * @param externalEvaluation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutExternalEvaluationRequest withExternalEvaluation(ExternalEvaluation externalEvaluation) {
        setExternalEvaluation(externalEvaluation);
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
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: ").append(getConfigRuleName()).append(",");
        if (getExternalEvaluation() != null)
            sb.append("ExternalEvaluation: ").append(getExternalEvaluation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutExternalEvaluationRequest == false)
            return false;
        PutExternalEvaluationRequest other = (PutExternalEvaluationRequest) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getExternalEvaluation() == null ^ this.getExternalEvaluation() == null)
            return false;
        if (other.getExternalEvaluation() != null && other.getExternalEvaluation().equals(this.getExternalEvaluation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getExternalEvaluation() == null) ? 0 : getExternalEvaluation().hashCode());
        return hashCode;
    }

    @Override
    public PutExternalEvaluationRequest clone() {
        return (PutExternalEvaluationRequest) super.clone();
    }

}
