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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDisableStandards" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisableStandardsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARNS of the standards subscriptions that you want to disable.
     * </p>
     */
    private java.util.List<String> standardsSubscriptionArns;

    /**
     * <p>
     * The ARNS of the standards subscriptions that you want to disable.
     * </p>
     * 
     * @return The ARNS of the standards subscriptions that you want to disable.
     */

    public java.util.List<String> getStandardsSubscriptionArns() {
        return standardsSubscriptionArns;
    }

    /**
     * <p>
     * The ARNS of the standards subscriptions that you want to disable.
     * </p>
     * 
     * @param standardsSubscriptionArns
     *        The ARNS of the standards subscriptions that you want to disable.
     */

    public void setStandardsSubscriptionArns(java.util.Collection<String> standardsSubscriptionArns) {
        if (standardsSubscriptionArns == null) {
            this.standardsSubscriptionArns = null;
            return;
        }

        this.standardsSubscriptionArns = new java.util.ArrayList<String>(standardsSubscriptionArns);
    }

    /**
     * <p>
     * The ARNS of the standards subscriptions that you want to disable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandardsSubscriptionArns(java.util.Collection)} or
     * {@link #withStandardsSubscriptionArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param standardsSubscriptionArns
     *        The ARNS of the standards subscriptions that you want to disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisableStandardsRequest withStandardsSubscriptionArns(String... standardsSubscriptionArns) {
        if (this.standardsSubscriptionArns == null) {
            setStandardsSubscriptionArns(new java.util.ArrayList<String>(standardsSubscriptionArns.length));
        }
        for (String ele : standardsSubscriptionArns) {
            this.standardsSubscriptionArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNS of the standards subscriptions that you want to disable.
     * </p>
     * 
     * @param standardsSubscriptionArns
     *        The ARNS of the standards subscriptions that you want to disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisableStandardsRequest withStandardsSubscriptionArns(java.util.Collection<String> standardsSubscriptionArns) {
        setStandardsSubscriptionArns(standardsSubscriptionArns);
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
        if (getStandardsSubscriptionArns() != null)
            sb.append("StandardsSubscriptionArns: ").append(getStandardsSubscriptionArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisableStandardsRequest == false)
            return false;
        BatchDisableStandardsRequest other = (BatchDisableStandardsRequest) obj;
        if (other.getStandardsSubscriptionArns() == null ^ this.getStandardsSubscriptionArns() == null)
            return false;
        if (other.getStandardsSubscriptionArns() != null && other.getStandardsSubscriptionArns().equals(this.getStandardsSubscriptionArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsSubscriptionArns() == null) ? 0 : getStandardsSubscriptionArns().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisableStandardsRequest clone() {
        return (BatchDisableStandardsRequest) super.clone();
    }

}
