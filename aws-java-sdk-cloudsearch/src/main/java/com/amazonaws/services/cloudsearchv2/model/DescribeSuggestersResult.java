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

/**
 * <p>
 * The result of a <code>DescribeSuggesters</code> request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSuggestersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The suggesters configured for the domain specified in the request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SuggesterStatus> suggesters;

    /**
     * <p>
     * The suggesters configured for the domain specified in the request.
     * </p>
     * 
     * @return The suggesters configured for the domain specified in the request.
     */

    public java.util.List<SuggesterStatus> getSuggesters() {
        if (suggesters == null) {
            suggesters = new com.amazonaws.internal.SdkInternalList<SuggesterStatus>();
        }
        return suggesters;
    }

    /**
     * <p>
     * The suggesters configured for the domain specified in the request.
     * </p>
     * 
     * @param suggesters
     *        The suggesters configured for the domain specified in the request.
     */

    public void setSuggesters(java.util.Collection<SuggesterStatus> suggesters) {
        if (suggesters == null) {
            this.suggesters = null;
            return;
        }

        this.suggesters = new com.amazonaws.internal.SdkInternalList<SuggesterStatus>(suggesters);
    }

    /**
     * <p>
     * The suggesters configured for the domain specified in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuggesters(java.util.Collection)} or {@link #withSuggesters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param suggesters
     *        The suggesters configured for the domain specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSuggestersResult withSuggesters(SuggesterStatus... suggesters) {
        if (this.suggesters == null) {
            setSuggesters(new com.amazonaws.internal.SdkInternalList<SuggesterStatus>(suggesters.length));
        }
        for (SuggesterStatus ele : suggesters) {
            this.suggesters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The suggesters configured for the domain specified in the request.
     * </p>
     * 
     * @param suggesters
     *        The suggesters configured for the domain specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSuggestersResult withSuggesters(java.util.Collection<SuggesterStatus> suggesters) {
        setSuggesters(suggesters);
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
        if (getSuggesters() != null)
            sb.append("Suggesters: ").append(getSuggesters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSuggestersResult == false)
            return false;
        DescribeSuggestersResult other = (DescribeSuggestersResult) obj;
        if (other.getSuggesters() == null ^ this.getSuggesters() == null)
            return false;
        if (other.getSuggesters() != null && other.getSuggesters().equals(this.getSuggesters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuggesters() == null) ? 0 : getSuggesters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSuggestersResult clone() {
        try {
            return (DescribeSuggestersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
