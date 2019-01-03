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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckRefreshStatuses"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustedAdvisorCheckRefreshStatusesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b> Specifying the check ID of a check that
     * is automatically refreshed causes an <code>InvalidParameterValue</code> error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> checkIds;

    /**
     * <p>
     * The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b> Specifying the check ID of a check that
     * is automatically refreshed causes an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b> Specifying the check ID of a
     *         check that is automatically refreshed causes an <code>InvalidParameterValue</code> error.
     */

    public java.util.List<String> getCheckIds() {
        if (checkIds == null) {
            checkIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return checkIds;
    }

    /**
     * <p>
     * The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b> Specifying the check ID of a check that
     * is automatically refreshed causes an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param checkIds
     *        The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b> Specifying the check ID of a
     *        check that is automatically refreshed causes an <code>InvalidParameterValue</code> error.
     */

    public void setCheckIds(java.util.Collection<String> checkIds) {
        if (checkIds == null) {
            this.checkIds = null;
            return;
        }

        this.checkIds = new com.amazonaws.internal.SdkInternalList<String>(checkIds);
    }

    /**
     * <p>
     * The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b> Specifying the check ID of a check that
     * is automatically refreshed causes an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCheckIds(java.util.Collection)} or {@link #withCheckIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param checkIds
     *        The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b> Specifying the check ID of a
     *        check that is automatically refreshed causes an <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedAdvisorCheckRefreshStatusesRequest withCheckIds(String... checkIds) {
        if (this.checkIds == null) {
            setCheckIds(new com.amazonaws.internal.SdkInternalList<String>(checkIds.length));
        }
        for (String ele : checkIds) {
            this.checkIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b> Specifying the check ID of a check that
     * is automatically refreshed causes an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param checkIds
     *        The IDs of the Trusted Advisor checks to get the status of. <b>Note:</b> Specifying the check ID of a
     *        check that is automatically refreshed causes an <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedAdvisorCheckRefreshStatusesRequest withCheckIds(java.util.Collection<String> checkIds) {
        setCheckIds(checkIds);
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
        if (getCheckIds() != null)
            sb.append("CheckIds: ").append(getCheckIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustedAdvisorCheckRefreshStatusesRequest == false)
            return false;
        DescribeTrustedAdvisorCheckRefreshStatusesRequest other = (DescribeTrustedAdvisorCheckRefreshStatusesRequest) obj;
        if (other.getCheckIds() == null ^ this.getCheckIds() == null)
            return false;
        if (other.getCheckIds() != null && other.getCheckIds().equals(this.getCheckIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckIds() == null) ? 0 : getCheckIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrustedAdvisorCheckRefreshStatusesRequest clone() {
        return (DescribeTrustedAdvisorCheckRefreshStatusesRequest) super.clone();
    }

}
