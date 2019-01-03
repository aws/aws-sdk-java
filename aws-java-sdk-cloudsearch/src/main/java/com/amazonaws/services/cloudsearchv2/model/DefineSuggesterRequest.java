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
 * Container for the parameters to the <code><a>DefineSuggester</a></code> operation. Specifies the name of the domain
 * you want to update and the suggester configuration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefineSuggesterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String domainName;

    private Suggester suggester;

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

    public DefineSuggesterRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * @param suggester
     */

    public void setSuggester(Suggester suggester) {
        this.suggester = suggester;
    }

    /**
     * @return
     */

    public Suggester getSuggester() {
        return this.suggester;
    }

    /**
     * @param suggester
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefineSuggesterRequest withSuggester(Suggester suggester) {
        setSuggester(suggester);
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
        if (getSuggester() != null)
            sb.append("Suggester: ").append(getSuggester());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefineSuggesterRequest == false)
            return false;
        DefineSuggesterRequest other = (DefineSuggesterRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getSuggester() == null ^ this.getSuggester() == null)
            return false;
        if (other.getSuggester() != null && other.getSuggester().equals(this.getSuggester()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getSuggester() == null) ? 0 : getSuggester().hashCode());
        return hashCode;
    }

    @Override
    public DefineSuggesterRequest clone() {
        return (DefineSuggesterRequest) super.clone();
    }

}
