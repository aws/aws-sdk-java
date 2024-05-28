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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary counts of each Proton resource types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ResourceCountsSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceCountsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that need a major template version
     * update.
     * </p>
     */
    private Integer behindMajor;
    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that need a minor template version
     * update.
     * </p>
     */
    private Integer behindMinor;
    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that failed to deploy.
     * </p>
     */
    private Integer failed;
    /**
     * <p>
     * The total number of resources of this type in the Amazon Web Services account.
     * </p>
     */
    private Integer total;
    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that are up-to-date with their template.
     * </p>
     */
    private Integer upToDate;

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that need a major template version
     * update.
     * </p>
     * 
     * @param behindMajor
     *        The number of resources of this type in the Amazon Web Services account that need a major template version
     *        update.
     */

    public void setBehindMajor(Integer behindMajor) {
        this.behindMajor = behindMajor;
    }

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that need a major template version
     * update.
     * </p>
     * 
     * @return The number of resources of this type in the Amazon Web Services account that need a major template
     *         version update.
     */

    public Integer getBehindMajor() {
        return this.behindMajor;
    }

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that need a major template version
     * update.
     * </p>
     * 
     * @param behindMajor
     *        The number of resources of this type in the Amazon Web Services account that need a major template version
     *        update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCountsSummary withBehindMajor(Integer behindMajor) {
        setBehindMajor(behindMajor);
        return this;
    }

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that need a minor template version
     * update.
     * </p>
     * 
     * @param behindMinor
     *        The number of resources of this type in the Amazon Web Services account that need a minor template version
     *        update.
     */

    public void setBehindMinor(Integer behindMinor) {
        this.behindMinor = behindMinor;
    }

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that need a minor template version
     * update.
     * </p>
     * 
     * @return The number of resources of this type in the Amazon Web Services account that need a minor template
     *         version update.
     */

    public Integer getBehindMinor() {
        return this.behindMinor;
    }

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that need a minor template version
     * update.
     * </p>
     * 
     * @param behindMinor
     *        The number of resources of this type in the Amazon Web Services account that need a minor template version
     *        update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCountsSummary withBehindMinor(Integer behindMinor) {
        setBehindMinor(behindMinor);
        return this;
    }

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that failed to deploy.
     * </p>
     * 
     * @param failed
     *        The number of resources of this type in the Amazon Web Services account that failed to deploy.
     */

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that failed to deploy.
     * </p>
     * 
     * @return The number of resources of this type in the Amazon Web Services account that failed to deploy.
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that failed to deploy.
     * </p>
     * 
     * @param failed
     *        The number of resources of this type in the Amazon Web Services account that failed to deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCountsSummary withFailed(Integer failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * The total number of resources of this type in the Amazon Web Services account.
     * </p>
     * 
     * @param total
     *        The total number of resources of this type in the Amazon Web Services account.
     */

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * The total number of resources of this type in the Amazon Web Services account.
     * </p>
     * 
     * @return The total number of resources of this type in the Amazon Web Services account.
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total number of resources of this type in the Amazon Web Services account.
     * </p>
     * 
     * @param total
     *        The total number of resources of this type in the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCountsSummary withTotal(Integer total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that are up-to-date with their template.
     * </p>
     * 
     * @param upToDate
     *        The number of resources of this type in the Amazon Web Services account that are up-to-date with their
     *        template.
     */

    public void setUpToDate(Integer upToDate) {
        this.upToDate = upToDate;
    }

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that are up-to-date with their template.
     * </p>
     * 
     * @return The number of resources of this type in the Amazon Web Services account that are up-to-date with their
     *         template.
     */

    public Integer getUpToDate() {
        return this.upToDate;
    }

    /**
     * <p>
     * The number of resources of this type in the Amazon Web Services account that are up-to-date with their template.
     * </p>
     * 
     * @param upToDate
     *        The number of resources of this type in the Amazon Web Services account that are up-to-date with their
     *        template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCountsSummary withUpToDate(Integer upToDate) {
        setUpToDate(upToDate);
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
        if (getBehindMajor() != null)
            sb.append("BehindMajor: ").append(getBehindMajor()).append(",");
        if (getBehindMinor() != null)
            sb.append("BehindMinor: ").append(getBehindMinor()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getUpToDate() != null)
            sb.append("UpToDate: ").append(getUpToDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceCountsSummary == false)
            return false;
        ResourceCountsSummary other = (ResourceCountsSummary) obj;
        if (other.getBehindMajor() == null ^ this.getBehindMajor() == null)
            return false;
        if (other.getBehindMajor() != null && other.getBehindMajor().equals(this.getBehindMajor()) == false)
            return false;
        if (other.getBehindMinor() == null ^ this.getBehindMinor() == null)
            return false;
        if (other.getBehindMinor() != null && other.getBehindMinor().equals(this.getBehindMinor()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getUpToDate() == null ^ this.getUpToDate() == null)
            return false;
        if (other.getUpToDate() != null && other.getUpToDate().equals(this.getUpToDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBehindMajor() == null) ? 0 : getBehindMajor().hashCode());
        hashCode = prime * hashCode + ((getBehindMinor() == null) ? 0 : getBehindMinor().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getUpToDate() == null) ? 0 : getUpToDate().hashCode());
        return hashCode;
    }

    @Override
    public ResourceCountsSummary clone() {
        try {
            return (ResourceCountsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ResourceCountsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
