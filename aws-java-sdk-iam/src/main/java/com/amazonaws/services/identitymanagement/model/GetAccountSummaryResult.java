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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>GetAccountSummary</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetAccountSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A set of key–value pairs containing information about IAM entity usage and IAM quotas.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, Integer> summaryMap;

    /**
     * <p>
     * A set of key–value pairs containing information about IAM entity usage and IAM quotas.
     * </p>
     * 
     * @return A set of key–value pairs containing information about IAM entity usage and IAM quotas.
     */

    public java.util.Map<String, Integer> getSummaryMap() {
        if (summaryMap == null) {
            summaryMap = new com.amazonaws.internal.SdkInternalMap<String, Integer>();
        }
        return summaryMap;
    }

    /**
     * <p>
     * A set of key–value pairs containing information about IAM entity usage and IAM quotas.
     * </p>
     * 
     * @param summaryMap
     *        A set of key–value pairs containing information about IAM entity usage and IAM quotas.
     */

    public void setSummaryMap(java.util.Map<String, Integer> summaryMap) {
        this.summaryMap = summaryMap == null ? null : new com.amazonaws.internal.SdkInternalMap<String, Integer>(summaryMap);
    }

    /**
     * <p>
     * A set of key–value pairs containing information about IAM entity usage and IAM quotas.
     * </p>
     * 
     * @param summaryMap
     *        A set of key–value pairs containing information about IAM entity usage and IAM quotas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountSummaryResult withSummaryMap(java.util.Map<String, Integer> summaryMap) {
        setSummaryMap(summaryMap);
        return this;
    }

    public GetAccountSummaryResult addSummaryMapEntry(String key, Integer value) {
        if (null == this.summaryMap) {
            this.summaryMap = new com.amazonaws.internal.SdkInternalMap<String, Integer>();
        }
        if (this.summaryMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.summaryMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SummaryMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountSummaryResult clearSummaryMapEntries() {
        this.summaryMap = null;
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
        if (getSummaryMap() != null)
            sb.append("SummaryMap: ").append(getSummaryMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountSummaryResult == false)
            return false;
        GetAccountSummaryResult other = (GetAccountSummaryResult) obj;
        if (other.getSummaryMap() == null ^ this.getSummaryMap() == null)
            return false;
        if (other.getSummaryMap() != null && other.getSummaryMap().equals(this.getSummaryMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaryMap() == null) ? 0 : getSummaryMap().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountSummaryResult clone() {
        try {
            return (GetAccountSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
