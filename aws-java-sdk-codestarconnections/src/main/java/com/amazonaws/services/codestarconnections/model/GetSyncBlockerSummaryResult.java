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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetSyncBlockerSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSyncBlockerSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of sync blockers for a specified resource.
     * </p>
     */
    private SyncBlockerSummary syncBlockerSummary;

    /**
     * <p>
     * The list of sync blockers for a specified resource.
     * </p>
     * 
     * @param syncBlockerSummary
     *        The list of sync blockers for a specified resource.
     */

    public void setSyncBlockerSummary(SyncBlockerSummary syncBlockerSummary) {
        this.syncBlockerSummary = syncBlockerSummary;
    }

    /**
     * <p>
     * The list of sync blockers for a specified resource.
     * </p>
     * 
     * @return The list of sync blockers for a specified resource.
     */

    public SyncBlockerSummary getSyncBlockerSummary() {
        return this.syncBlockerSummary;
    }

    /**
     * <p>
     * The list of sync blockers for a specified resource.
     * </p>
     * 
     * @param syncBlockerSummary
     *        The list of sync blockers for a specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSyncBlockerSummaryResult withSyncBlockerSummary(SyncBlockerSummary syncBlockerSummary) {
        setSyncBlockerSummary(syncBlockerSummary);
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
        if (getSyncBlockerSummary() != null)
            sb.append("SyncBlockerSummary: ").append(getSyncBlockerSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSyncBlockerSummaryResult == false)
            return false;
        GetSyncBlockerSummaryResult other = (GetSyncBlockerSummaryResult) obj;
        if (other.getSyncBlockerSummary() == null ^ this.getSyncBlockerSummary() == null)
            return false;
        if (other.getSyncBlockerSummary() != null && other.getSyncBlockerSummary().equals(this.getSyncBlockerSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncBlockerSummary() == null) ? 0 : getSyncBlockerSummary().hashCode());
        return hashCode;
    }

    @Override
    public GetSyncBlockerSummaryResult clone() {
        try {
            return (GetSyncBlockerSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
