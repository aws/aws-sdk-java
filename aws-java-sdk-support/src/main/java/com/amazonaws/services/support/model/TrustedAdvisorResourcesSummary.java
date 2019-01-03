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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about AWS resources that were analyzed in a call to Trusted Advisor
 * <a>DescribeTrustedAdvisorCheckSummaries</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/TrustedAdvisorResourcesSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustedAdvisorResourcesSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of AWS resources that were analyzed by the Trusted Advisor check.
     * </p>
     */
    private Long resourcesProcessed;
    /**
     * <p>
     * The number of AWS resources that were flagged (listed) by the Trusted Advisor check.
     * </p>
     */
    private Long resourcesFlagged;
    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because information was unavailable.
     * </p>
     */
    private Long resourcesIgnored;
    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because they were marked as suppressed by the user.
     * </p>
     */
    private Long resourcesSuppressed;

    /**
     * <p>
     * The number of AWS resources that were analyzed by the Trusted Advisor check.
     * </p>
     * 
     * @param resourcesProcessed
     *        The number of AWS resources that were analyzed by the Trusted Advisor check.
     */

    public void setResourcesProcessed(Long resourcesProcessed) {
        this.resourcesProcessed = resourcesProcessed;
    }

    /**
     * <p>
     * The number of AWS resources that were analyzed by the Trusted Advisor check.
     * </p>
     * 
     * @return The number of AWS resources that were analyzed by the Trusted Advisor check.
     */

    public Long getResourcesProcessed() {
        return this.resourcesProcessed;
    }

    /**
     * <p>
     * The number of AWS resources that were analyzed by the Trusted Advisor check.
     * </p>
     * 
     * @param resourcesProcessed
     *        The number of AWS resources that were analyzed by the Trusted Advisor check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorResourcesSummary withResourcesProcessed(Long resourcesProcessed) {
        setResourcesProcessed(resourcesProcessed);
        return this;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged (listed) by the Trusted Advisor check.
     * </p>
     * 
     * @param resourcesFlagged
     *        The number of AWS resources that were flagged (listed) by the Trusted Advisor check.
     */

    public void setResourcesFlagged(Long resourcesFlagged) {
        this.resourcesFlagged = resourcesFlagged;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged (listed) by the Trusted Advisor check.
     * </p>
     * 
     * @return The number of AWS resources that were flagged (listed) by the Trusted Advisor check.
     */

    public Long getResourcesFlagged() {
        return this.resourcesFlagged;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged (listed) by the Trusted Advisor check.
     * </p>
     * 
     * @param resourcesFlagged
     *        The number of AWS resources that were flagged (listed) by the Trusted Advisor check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorResourcesSummary withResourcesFlagged(Long resourcesFlagged) {
        setResourcesFlagged(resourcesFlagged);
        return this;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because information was unavailable.
     * </p>
     * 
     * @param resourcesIgnored
     *        The number of AWS resources ignored by Trusted Advisor because information was unavailable.
     */

    public void setResourcesIgnored(Long resourcesIgnored) {
        this.resourcesIgnored = resourcesIgnored;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because information was unavailable.
     * </p>
     * 
     * @return The number of AWS resources ignored by Trusted Advisor because information was unavailable.
     */

    public Long getResourcesIgnored() {
        return this.resourcesIgnored;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because information was unavailable.
     * </p>
     * 
     * @param resourcesIgnored
     *        The number of AWS resources ignored by Trusted Advisor because information was unavailable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorResourcesSummary withResourcesIgnored(Long resourcesIgnored) {
        setResourcesIgnored(resourcesIgnored);
        return this;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because they were marked as suppressed by the user.
     * </p>
     * 
     * @param resourcesSuppressed
     *        The number of AWS resources ignored by Trusted Advisor because they were marked as suppressed by the user.
     */

    public void setResourcesSuppressed(Long resourcesSuppressed) {
        this.resourcesSuppressed = resourcesSuppressed;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because they were marked as suppressed by the user.
     * </p>
     * 
     * @return The number of AWS resources ignored by Trusted Advisor because they were marked as suppressed by the
     *         user.
     */

    public Long getResourcesSuppressed() {
        return this.resourcesSuppressed;
    }

    /**
     * <p>
     * The number of AWS resources ignored by Trusted Advisor because they were marked as suppressed by the user.
     * </p>
     * 
     * @param resourcesSuppressed
     *        The number of AWS resources ignored by Trusted Advisor because they were marked as suppressed by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorResourcesSummary withResourcesSuppressed(Long resourcesSuppressed) {
        setResourcesSuppressed(resourcesSuppressed);
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
        if (getResourcesProcessed() != null)
            sb.append("ResourcesProcessed: ").append(getResourcesProcessed()).append(",");
        if (getResourcesFlagged() != null)
            sb.append("ResourcesFlagged: ").append(getResourcesFlagged()).append(",");
        if (getResourcesIgnored() != null)
            sb.append("ResourcesIgnored: ").append(getResourcesIgnored()).append(",");
        if (getResourcesSuppressed() != null)
            sb.append("ResourcesSuppressed: ").append(getResourcesSuppressed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorResourcesSummary == false)
            return false;
        TrustedAdvisorResourcesSummary other = (TrustedAdvisorResourcesSummary) obj;
        if (other.getResourcesProcessed() == null ^ this.getResourcesProcessed() == null)
            return false;
        if (other.getResourcesProcessed() != null && other.getResourcesProcessed().equals(this.getResourcesProcessed()) == false)
            return false;
        if (other.getResourcesFlagged() == null ^ this.getResourcesFlagged() == null)
            return false;
        if (other.getResourcesFlagged() != null && other.getResourcesFlagged().equals(this.getResourcesFlagged()) == false)
            return false;
        if (other.getResourcesIgnored() == null ^ this.getResourcesIgnored() == null)
            return false;
        if (other.getResourcesIgnored() != null && other.getResourcesIgnored().equals(this.getResourcesIgnored()) == false)
            return false;
        if (other.getResourcesSuppressed() == null ^ this.getResourcesSuppressed() == null)
            return false;
        if (other.getResourcesSuppressed() != null && other.getResourcesSuppressed().equals(this.getResourcesSuppressed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourcesProcessed() == null) ? 0 : getResourcesProcessed().hashCode());
        hashCode = prime * hashCode + ((getResourcesFlagged() == null) ? 0 : getResourcesFlagged().hashCode());
        hashCode = prime * hashCode + ((getResourcesIgnored() == null) ? 0 : getResourcesIgnored().hashCode());
        hashCode = prime * hashCode + ((getResourcesSuppressed() == null) ? 0 : getResourcesSuppressed().hashCode());
        return hashCode;
    }

    @Override
    public TrustedAdvisorResourcesSummary clone() {
        try {
            return (TrustedAdvisorResourcesSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.TrustedAdvisorResourcesSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
