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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRemediationConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRemediationConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of remediation configuration objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RemediationConfiguration> remediationConfigurations;

    /**
     * <p>
     * A list of remediation configuration objects.
     * </p>
     * 
     * @return A list of remediation configuration objects.
     */

    public java.util.List<RemediationConfiguration> getRemediationConfigurations() {
        if (remediationConfigurations == null) {
            remediationConfigurations = new com.amazonaws.internal.SdkInternalList<RemediationConfiguration>();
        }
        return remediationConfigurations;
    }

    /**
     * <p>
     * A list of remediation configuration objects.
     * </p>
     * 
     * @param remediationConfigurations
     *        A list of remediation configuration objects.
     */

    public void setRemediationConfigurations(java.util.Collection<RemediationConfiguration> remediationConfigurations) {
        if (remediationConfigurations == null) {
            this.remediationConfigurations = null;
            return;
        }

        this.remediationConfigurations = new com.amazonaws.internal.SdkInternalList<RemediationConfiguration>(remediationConfigurations);
    }

    /**
     * <p>
     * A list of remediation configuration objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemediationConfigurations(java.util.Collection)} or
     * {@link #withRemediationConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param remediationConfigurations
     *        A list of remediation configuration objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRemediationConfigurationsRequest withRemediationConfigurations(RemediationConfiguration... remediationConfigurations) {
        if (this.remediationConfigurations == null) {
            setRemediationConfigurations(new com.amazonaws.internal.SdkInternalList<RemediationConfiguration>(remediationConfigurations.length));
        }
        for (RemediationConfiguration ele : remediationConfigurations) {
            this.remediationConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of remediation configuration objects.
     * </p>
     * 
     * @param remediationConfigurations
     *        A list of remediation configuration objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRemediationConfigurationsRequest withRemediationConfigurations(java.util.Collection<RemediationConfiguration> remediationConfigurations) {
        setRemediationConfigurations(remediationConfigurations);
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
        if (getRemediationConfigurations() != null)
            sb.append("RemediationConfigurations: ").append(getRemediationConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRemediationConfigurationsRequest == false)
            return false;
        PutRemediationConfigurationsRequest other = (PutRemediationConfigurationsRequest) obj;
        if (other.getRemediationConfigurations() == null ^ this.getRemediationConfigurations() == null)
            return false;
        if (other.getRemediationConfigurations() != null && other.getRemediationConfigurations().equals(this.getRemediationConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRemediationConfigurations() == null) ? 0 : getRemediationConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public PutRemediationConfigurationsRequest clone() {
        return (PutRemediationConfigurationsRequest) super.clone();
    }

}
