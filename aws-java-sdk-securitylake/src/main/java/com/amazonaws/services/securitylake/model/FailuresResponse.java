/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Response element for actions that make changes, namely create, update, or delete actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/FailuresResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailuresResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of all failures.
     * </p>
     */
    private java.util.List<Failures> failures;
    /**
     * <p>
     * List of Amazon Web Services Regions where the failure occurred.
     * </p>
     */
    private String region;

    /**
     * <p>
     * List of all failures.
     * </p>
     * 
     * @return List of all failures.
     */

    public java.util.List<Failures> getFailures() {
        return failures;
    }

    /**
     * <p>
     * List of all failures.
     * </p>
     * 
     * @param failures
     *        List of all failures.
     */

    public void setFailures(java.util.Collection<Failures> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<Failures>(failures);
    }

    /**
     * <p>
     * List of all failures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        List of all failures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailuresResponse withFailures(Failures... failures) {
        if (this.failures == null) {
            setFailures(new java.util.ArrayList<Failures>(failures.length));
        }
        for (Failures ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of all failures.
     * </p>
     * 
     * @param failures
     *        List of all failures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailuresResponse withFailures(java.util.Collection<Failures> failures) {
        setFailures(failures);
        return this;
    }

    /**
     * <p>
     * List of Amazon Web Services Regions where the failure occurred.
     * </p>
     * 
     * @param region
     *        List of Amazon Web Services Regions where the failure occurred.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * List of Amazon Web Services Regions where the failure occurred.
     * </p>
     * 
     * @return List of Amazon Web Services Regions where the failure occurred.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * List of Amazon Web Services Regions where the failure occurred.
     * </p>
     * 
     * @param region
     *        List of Amazon Web Services Regions where the failure occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailuresResponse withRegion(String region) {
        setRegion(region);
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
        if (getFailures() != null)
            sb.append("Failures: ").append(getFailures()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailuresResponse == false)
            return false;
        FailuresResponse other = (FailuresResponse) obj;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public FailuresResponse clone() {
        try {
            return (FailuresResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.FailuresResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
