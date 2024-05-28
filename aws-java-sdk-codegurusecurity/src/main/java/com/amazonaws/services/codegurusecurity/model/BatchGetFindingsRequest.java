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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/BatchGetFindings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of finding identifiers. Each identifier consists of a <code>scanName</code> and a <code>findingId</code>.
     * You retrieve the <code>findingId</code> when you call <code>GetFindings</code>.
     * </p>
     */
    private java.util.List<FindingIdentifier> findingIdentifiers;

    /**
     * <p>
     * A list of finding identifiers. Each identifier consists of a <code>scanName</code> and a <code>findingId</code>.
     * You retrieve the <code>findingId</code> when you call <code>GetFindings</code>.
     * </p>
     * 
     * @return A list of finding identifiers. Each identifier consists of a <code>scanName</code> and a
     *         <code>findingId</code>. You retrieve the <code>findingId</code> when you call <code>GetFindings</code>.
     */

    public java.util.List<FindingIdentifier> getFindingIdentifiers() {
        return findingIdentifiers;
    }

    /**
     * <p>
     * A list of finding identifiers. Each identifier consists of a <code>scanName</code> and a <code>findingId</code>.
     * You retrieve the <code>findingId</code> when you call <code>GetFindings</code>.
     * </p>
     * 
     * @param findingIdentifiers
     *        A list of finding identifiers. Each identifier consists of a <code>scanName</code> and a
     *        <code>findingId</code>. You retrieve the <code>findingId</code> when you call <code>GetFindings</code>.
     */

    public void setFindingIdentifiers(java.util.Collection<FindingIdentifier> findingIdentifiers) {
        if (findingIdentifiers == null) {
            this.findingIdentifiers = null;
            return;
        }

        this.findingIdentifiers = new java.util.ArrayList<FindingIdentifier>(findingIdentifiers);
    }

    /**
     * <p>
     * A list of finding identifiers. Each identifier consists of a <code>scanName</code> and a <code>findingId</code>.
     * You retrieve the <code>findingId</code> when you call <code>GetFindings</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingIdentifiers(java.util.Collection)} or {@link #withFindingIdentifiers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param findingIdentifiers
     *        A list of finding identifiers. Each identifier consists of a <code>scanName</code> and a
     *        <code>findingId</code>. You retrieve the <code>findingId</code> when you call <code>GetFindings</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingsRequest withFindingIdentifiers(FindingIdentifier... findingIdentifiers) {
        if (this.findingIdentifiers == null) {
            setFindingIdentifiers(new java.util.ArrayList<FindingIdentifier>(findingIdentifiers.length));
        }
        for (FindingIdentifier ele : findingIdentifiers) {
            this.findingIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of finding identifiers. Each identifier consists of a <code>scanName</code> and a <code>findingId</code>.
     * You retrieve the <code>findingId</code> when you call <code>GetFindings</code>.
     * </p>
     * 
     * @param findingIdentifiers
     *        A list of finding identifiers. Each identifier consists of a <code>scanName</code> and a
     *        <code>findingId</code>. You retrieve the <code>findingId</code> when you call <code>GetFindings</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingsRequest withFindingIdentifiers(java.util.Collection<FindingIdentifier> findingIdentifiers) {
        setFindingIdentifiers(findingIdentifiers);
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
        if (getFindingIdentifiers() != null)
            sb.append("FindingIdentifiers: ").append(getFindingIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetFindingsRequest == false)
            return false;
        BatchGetFindingsRequest other = (BatchGetFindingsRequest) obj;
        if (other.getFindingIdentifiers() == null ^ this.getFindingIdentifiers() == null)
            return false;
        if (other.getFindingIdentifiers() != null && other.getFindingIdentifiers().equals(this.getFindingIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingIdentifiers() == null) ? 0 : getFindingIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetFindingsRequest clone() {
        return (BatchGetFindingsRequest) super.clone();
    }

}
