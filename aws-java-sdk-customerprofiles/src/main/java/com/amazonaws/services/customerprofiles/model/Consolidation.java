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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The matching criteria to be used during the auto-merging process.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/Consolidation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Consolidation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of matching criteria.
     * </p>
     */
    private java.util.List<java.util.List<String>> matchingAttributesList;

    /**
     * <p>
     * A list of matching criteria.
     * </p>
     * 
     * @return A list of matching criteria.
     */

    public java.util.List<java.util.List<String>> getMatchingAttributesList() {
        return matchingAttributesList;
    }

    /**
     * <p>
     * A list of matching criteria.
     * </p>
     * 
     * @param matchingAttributesList
     *        A list of matching criteria.
     */

    public void setMatchingAttributesList(java.util.Collection<java.util.List<String>> matchingAttributesList) {
        if (matchingAttributesList == null) {
            this.matchingAttributesList = null;
            return;
        }

        this.matchingAttributesList = new java.util.ArrayList<java.util.List<String>>(matchingAttributesList);
    }

    /**
     * <p>
     * A list of matching criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchingAttributesList(java.util.Collection)} or
     * {@link #withMatchingAttributesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param matchingAttributesList
     *        A list of matching criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Consolidation withMatchingAttributesList(java.util.List<String>... matchingAttributesList) {
        if (this.matchingAttributesList == null) {
            setMatchingAttributesList(new java.util.ArrayList<java.util.List<String>>(matchingAttributesList.length));
        }
        for (java.util.List<String> ele : matchingAttributesList) {
            this.matchingAttributesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of matching criteria.
     * </p>
     * 
     * @param matchingAttributesList
     *        A list of matching criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Consolidation withMatchingAttributesList(java.util.Collection<java.util.List<String>> matchingAttributesList) {
        setMatchingAttributesList(matchingAttributesList);
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
        if (getMatchingAttributesList() != null)
            sb.append("MatchingAttributesList: ").append(getMatchingAttributesList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Consolidation == false)
            return false;
        Consolidation other = (Consolidation) obj;
        if (other.getMatchingAttributesList() == null ^ this.getMatchingAttributesList() == null)
            return false;
        if (other.getMatchingAttributesList() != null && other.getMatchingAttributesList().equals(this.getMatchingAttributesList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchingAttributesList() == null) ? 0 : getMatchingAttributesList().hashCode());
        return hashCode;
    }

    @Override
    public Consolidation clone() {
        try {
            return (Consolidation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ConsolidationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
