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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelDomainConfigChangeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String domainName;
    /**
     * <p>
     * When set to <code>True</code>, returns the list of change IDs and properties that will be cancelled without
     * actually cancelling the change.
     * </p>
     */
    private Boolean dryRun;

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

    public CancelDomainConfigChangeRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * When set to <code>True</code>, returns the list of change IDs and properties that will be cancelled without
     * actually cancelling the change.
     * </p>
     * 
     * @param dryRun
     *        When set to <code>True</code>, returns the list of change IDs and properties that will be cancelled
     *        without actually cancelling the change.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * When set to <code>True</code>, returns the list of change IDs and properties that will be cancelled without
     * actually cancelling the change.
     * </p>
     * 
     * @return When set to <code>True</code>, returns the list of change IDs and properties that will be cancelled
     *         without actually cancelling the change.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * When set to <code>True</code>, returns the list of change IDs and properties that will be cancelled without
     * actually cancelling the change.
     * </p>
     * 
     * @param dryRun
     *        When set to <code>True</code>, returns the list of change IDs and properties that will be cancelled
     *        without actually cancelling the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelDomainConfigChangeRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * When set to <code>True</code>, returns the list of change IDs and properties that will be cancelled without
     * actually cancelling the change.
     * </p>
     * 
     * @return When set to <code>True</code>, returns the list of change IDs and properties that will be cancelled
     *         without actually cancelling the change.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelDomainConfigChangeRequest == false)
            return false;
        CancelDomainConfigChangeRequest other = (CancelDomainConfigChangeRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public CancelDomainConfigChangeRequest clone() {
        return (CancelDomainConfigChangeRequest) super.clone();
    }

}
