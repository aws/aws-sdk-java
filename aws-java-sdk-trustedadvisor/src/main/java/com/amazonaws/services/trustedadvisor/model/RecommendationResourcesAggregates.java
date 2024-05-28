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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Aggregation of Recommendation Resources
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/RecommendationResourcesAggregates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationResourcesAggregates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of AWS resources that were flagged to have errors according to the Trusted Advisor check
     * </p>
     */
    private Long errorCount;
    /**
     * <p>
     * The number of AWS resources that were flagged to be OK according to the Trusted Advisor check
     * </p>
     */
    private Long okCount;
    /**
     * <p>
     * The number of AWS resources that were flagged to have warning according to the Trusted Advisor check
     * </p>
     */
    private Long warningCount;

    /**
     * <p>
     * The number of AWS resources that were flagged to have errors according to the Trusted Advisor check
     * </p>
     * 
     * @param errorCount
     *        The number of AWS resources that were flagged to have errors according to the Trusted Advisor check
     */

    public void setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged to have errors according to the Trusted Advisor check
     * </p>
     * 
     * @return The number of AWS resources that were flagged to have errors according to the Trusted Advisor check
     */

    public Long getErrorCount() {
        return this.errorCount;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged to have errors according to the Trusted Advisor check
     * </p>
     * 
     * @param errorCount
     *        The number of AWS resources that were flagged to have errors according to the Trusted Advisor check
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationResourcesAggregates withErrorCount(Long errorCount) {
        setErrorCount(errorCount);
        return this;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged to be OK according to the Trusted Advisor check
     * </p>
     * 
     * @param okCount
     *        The number of AWS resources that were flagged to be OK according to the Trusted Advisor check
     */

    public void setOkCount(Long okCount) {
        this.okCount = okCount;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged to be OK according to the Trusted Advisor check
     * </p>
     * 
     * @return The number of AWS resources that were flagged to be OK according to the Trusted Advisor check
     */

    public Long getOkCount() {
        return this.okCount;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged to be OK according to the Trusted Advisor check
     * </p>
     * 
     * @param okCount
     *        The number of AWS resources that were flagged to be OK according to the Trusted Advisor check
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationResourcesAggregates withOkCount(Long okCount) {
        setOkCount(okCount);
        return this;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged to have warning according to the Trusted Advisor check
     * </p>
     * 
     * @param warningCount
     *        The number of AWS resources that were flagged to have warning according to the Trusted Advisor check
     */

    public void setWarningCount(Long warningCount) {
        this.warningCount = warningCount;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged to have warning according to the Trusted Advisor check
     * </p>
     * 
     * @return The number of AWS resources that were flagged to have warning according to the Trusted Advisor check
     */

    public Long getWarningCount() {
        return this.warningCount;
    }

    /**
     * <p>
     * The number of AWS resources that were flagged to have warning according to the Trusted Advisor check
     * </p>
     * 
     * @param warningCount
     *        The number of AWS resources that were flagged to have warning according to the Trusted Advisor check
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationResourcesAggregates withWarningCount(Long warningCount) {
        setWarningCount(warningCount);
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
        if (getErrorCount() != null)
            sb.append("ErrorCount: ").append(getErrorCount()).append(",");
        if (getOkCount() != null)
            sb.append("OkCount: ").append(getOkCount()).append(",");
        if (getWarningCount() != null)
            sb.append("WarningCount: ").append(getWarningCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationResourcesAggregates == false)
            return false;
        RecommendationResourcesAggregates other = (RecommendationResourcesAggregates) obj;
        if (other.getErrorCount() == null ^ this.getErrorCount() == null)
            return false;
        if (other.getErrorCount() != null && other.getErrorCount().equals(this.getErrorCount()) == false)
            return false;
        if (other.getOkCount() == null ^ this.getOkCount() == null)
            return false;
        if (other.getOkCount() != null && other.getOkCount().equals(this.getOkCount()) == false)
            return false;
        if (other.getWarningCount() == null ^ this.getWarningCount() == null)
            return false;
        if (other.getWarningCount() != null && other.getWarningCount().equals(this.getWarningCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCount() == null) ? 0 : getErrorCount().hashCode());
        hashCode = prime * hashCode + ((getOkCount() == null) ? 0 : getOkCount().hashCode());
        hashCode = prime * hashCode + ((getWarningCount() == null) ? 0 : getWarningCount().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationResourcesAggregates clone() {
        try {
            return (RecommendationResourcesAggregates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.trustedadvisor.model.transform.RecommendationResourcesAggregatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
