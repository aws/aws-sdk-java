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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceSyncBlockerSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceSyncBlockerSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The detailed data of the requested service sync blocker summary.
     * </p>
     */
    private ServiceSyncBlockerSummary serviceSyncBlockerSummary;

    /**
     * <p>
     * The detailed data of the requested service sync blocker summary.
     * </p>
     * 
     * @param serviceSyncBlockerSummary
     *        The detailed data of the requested service sync blocker summary.
     */

    public void setServiceSyncBlockerSummary(ServiceSyncBlockerSummary serviceSyncBlockerSummary) {
        this.serviceSyncBlockerSummary = serviceSyncBlockerSummary;
    }

    /**
     * <p>
     * The detailed data of the requested service sync blocker summary.
     * </p>
     * 
     * @return The detailed data of the requested service sync blocker summary.
     */

    public ServiceSyncBlockerSummary getServiceSyncBlockerSummary() {
        return this.serviceSyncBlockerSummary;
    }

    /**
     * <p>
     * The detailed data of the requested service sync blocker summary.
     * </p>
     * 
     * @param serviceSyncBlockerSummary
     *        The detailed data of the requested service sync blocker summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSyncBlockerSummaryResult withServiceSyncBlockerSummary(ServiceSyncBlockerSummary serviceSyncBlockerSummary) {
        setServiceSyncBlockerSummary(serviceSyncBlockerSummary);
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
        if (getServiceSyncBlockerSummary() != null)
            sb.append("ServiceSyncBlockerSummary: ").append(getServiceSyncBlockerSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceSyncBlockerSummaryResult == false)
            return false;
        GetServiceSyncBlockerSummaryResult other = (GetServiceSyncBlockerSummaryResult) obj;
        if (other.getServiceSyncBlockerSummary() == null ^ this.getServiceSyncBlockerSummary() == null)
            return false;
        if (other.getServiceSyncBlockerSummary() != null && other.getServiceSyncBlockerSummary().equals(this.getServiceSyncBlockerSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceSyncBlockerSummary() == null) ? 0 : getServiceSyncBlockerSummary().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceSyncBlockerSummaryResult clone() {
        try {
            return (GetServiceSyncBlockerSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
