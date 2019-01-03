/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code><a>DefineAnalysisScheme</a></code> operation. Specifies the name of the
 * domain you want to update and the analysis scheme configuration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefineAnalysisSchemeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String domainName;

    private AnalysisScheme analysisScheme;

    /**
     * @param domainName
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @param domainName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefineAnalysisSchemeRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * @param analysisScheme
     */

    public void setAnalysisScheme(AnalysisScheme analysisScheme) {
        this.analysisScheme = analysisScheme;
    }

    /**
     * @return
     */

    public AnalysisScheme getAnalysisScheme() {
        return this.analysisScheme;
    }

    /**
     * @param analysisScheme
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefineAnalysisSchemeRequest withAnalysisScheme(AnalysisScheme analysisScheme) {
        setAnalysisScheme(analysisScheme);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getAnalysisScheme() != null)
            sb.append("AnalysisScheme: ").append(getAnalysisScheme());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefineAnalysisSchemeRequest == false)
            return false;
        DefineAnalysisSchemeRequest other = (DefineAnalysisSchemeRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAnalysisScheme() == null ^ this.getAnalysisScheme() == null)
            return false;
        if (other.getAnalysisScheme() != null && other.getAnalysisScheme().equals(this.getAnalysisScheme()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAnalysisScheme() == null) ? 0 : getAnalysisScheme().hashCode());
        return hashCode;
    }

    @Override
    public DefineAnalysisSchemeRequest clone() {
        return (DefineAnalysisSchemeRequest) super.clone();
    }

}
