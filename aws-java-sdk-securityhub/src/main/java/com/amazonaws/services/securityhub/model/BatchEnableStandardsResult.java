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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchEnableStandardsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the standards subscriptions that were enabled.
     * </p>
     */
    private java.util.List<StandardsSubscription> standardsSubscriptions;

    /**
     * <p>
     * The details of the standards subscriptions that were enabled.
     * </p>
     * 
     * @return The details of the standards subscriptions that were enabled.
     */

    public java.util.List<StandardsSubscription> getStandardsSubscriptions() {
        return standardsSubscriptions;
    }

    /**
     * <p>
     * The details of the standards subscriptions that were enabled.
     * </p>
     * 
     * @param standardsSubscriptions
     *        The details of the standards subscriptions that were enabled.
     */

    public void setStandardsSubscriptions(java.util.Collection<StandardsSubscription> standardsSubscriptions) {
        if (standardsSubscriptions == null) {
            this.standardsSubscriptions = null;
            return;
        }

        this.standardsSubscriptions = new java.util.ArrayList<StandardsSubscription>(standardsSubscriptions);
    }

    /**
     * <p>
     * The details of the standards subscriptions that were enabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandardsSubscriptions(java.util.Collection)} or
     * {@link #withStandardsSubscriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param standardsSubscriptions
     *        The details of the standards subscriptions that were enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEnableStandardsResult withStandardsSubscriptions(StandardsSubscription... standardsSubscriptions) {
        if (this.standardsSubscriptions == null) {
            setStandardsSubscriptions(new java.util.ArrayList<StandardsSubscription>(standardsSubscriptions.length));
        }
        for (StandardsSubscription ele : standardsSubscriptions) {
            this.standardsSubscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the standards subscriptions that were enabled.
     * </p>
     * 
     * @param standardsSubscriptions
     *        The details of the standards subscriptions that were enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEnableStandardsResult withStandardsSubscriptions(java.util.Collection<StandardsSubscription> standardsSubscriptions) {
        setStandardsSubscriptions(standardsSubscriptions);
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
        if (getStandardsSubscriptions() != null)
            sb.append("StandardsSubscriptions: ").append(getStandardsSubscriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchEnableStandardsResult == false)
            return false;
        BatchEnableStandardsResult other = (BatchEnableStandardsResult) obj;
        if (other.getStandardsSubscriptions() == null ^ this.getStandardsSubscriptions() == null)
            return false;
        if (other.getStandardsSubscriptions() != null && other.getStandardsSubscriptions().equals(this.getStandardsSubscriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsSubscriptions() == null) ? 0 : getStandardsSubscriptions().hashCode());
        return hashCode;
    }

    @Override
    public BatchEnableStandardsResult clone() {
        try {
            return (BatchEnableStandardsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
