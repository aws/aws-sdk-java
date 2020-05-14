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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/UnarchiveFindings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnarchiveFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the findings to reactivate.
     * </p>
     */
    private java.util.List<String> findingIds;

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the findings to reactivate.
     * </p>
     * 
     * @return An array of strings that lists the unique identifiers for the findings to reactivate.
     */

    public java.util.List<String> getFindingIds() {
        return findingIds;
    }

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the findings to reactivate.
     * </p>
     * 
     * @param findingIds
     *        An array of strings that lists the unique identifiers for the findings to reactivate.
     */

    public void setFindingIds(java.util.Collection<String> findingIds) {
        if (findingIds == null) {
            this.findingIds = null;
            return;
        }

        this.findingIds = new java.util.ArrayList<String>(findingIds);
    }

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the findings to reactivate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingIds(java.util.Collection)} or {@link #withFindingIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param findingIds
     *        An array of strings that lists the unique identifiers for the findings to reactivate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnarchiveFindingsRequest withFindingIds(String... findingIds) {
        if (this.findingIds == null) {
            setFindingIds(new java.util.ArrayList<String>(findingIds.length));
        }
        for (String ele : findingIds) {
            this.findingIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the findings to reactivate.
     * </p>
     * 
     * @param findingIds
     *        An array of strings that lists the unique identifiers for the findings to reactivate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnarchiveFindingsRequest withFindingIds(java.util.Collection<String> findingIds) {
        setFindingIds(findingIds);
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
        if (getFindingIds() != null)
            sb.append("FindingIds: ").append(getFindingIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnarchiveFindingsRequest == false)
            return false;
        UnarchiveFindingsRequest other = (UnarchiveFindingsRequest) obj;
        if (other.getFindingIds() == null ^ this.getFindingIds() == null)
            return false;
        if (other.getFindingIds() != null && other.getFindingIds().equals(this.getFindingIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingIds() == null) ? 0 : getFindingIds().hashCode());
        return hashCode;
    }

    @Override
    public UnarchiveFindingsRequest clone() {
        return (UnarchiveFindingsRequest) super.clone();
    }

}
