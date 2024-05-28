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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an unused access analyzer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UnusedAccessConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnusedAccessConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specified access age in days for which to generate findings for unused access. For example, if you specify 90
     * days, the analyzer will generate findings for IAM entities within the accounts of the selected organization for
     * any access that hasn't been used in 90 or more days since the analyzer's last scan. You can choose a value
     * between 1 and 180 days.
     * </p>
     */
    private Integer unusedAccessAge;

    /**
     * <p>
     * The specified access age in days for which to generate findings for unused access. For example, if you specify 90
     * days, the analyzer will generate findings for IAM entities within the accounts of the selected organization for
     * any access that hasn't been used in 90 or more days since the analyzer's last scan. You can choose a value
     * between 1 and 180 days.
     * </p>
     * 
     * @param unusedAccessAge
     *        The specified access age in days for which to generate findings for unused access. For example, if you
     *        specify 90 days, the analyzer will generate findings for IAM entities within the accounts of the selected
     *        organization for any access that hasn't been used in 90 or more days since the analyzer's last scan. You
     *        can choose a value between 1 and 180 days.
     */

    public void setUnusedAccessAge(Integer unusedAccessAge) {
        this.unusedAccessAge = unusedAccessAge;
    }

    /**
     * <p>
     * The specified access age in days for which to generate findings for unused access. For example, if you specify 90
     * days, the analyzer will generate findings for IAM entities within the accounts of the selected organization for
     * any access that hasn't been used in 90 or more days since the analyzer's last scan. You can choose a value
     * between 1 and 180 days.
     * </p>
     * 
     * @return The specified access age in days for which to generate findings for unused access. For example, if you
     *         specify 90 days, the analyzer will generate findings for IAM entities within the accounts of the selected
     *         organization for any access that hasn't been used in 90 or more days since the analyzer's last scan. You
     *         can choose a value between 1 and 180 days.
     */

    public Integer getUnusedAccessAge() {
        return this.unusedAccessAge;
    }

    /**
     * <p>
     * The specified access age in days for which to generate findings for unused access. For example, if you specify 90
     * days, the analyzer will generate findings for IAM entities within the accounts of the selected organization for
     * any access that hasn't been used in 90 or more days since the analyzer's last scan. You can choose a value
     * between 1 and 180 days.
     * </p>
     * 
     * @param unusedAccessAge
     *        The specified access age in days for which to generate findings for unused access. For example, if you
     *        specify 90 days, the analyzer will generate findings for IAM entities within the accounts of the selected
     *        organization for any access that hasn't been used in 90 or more days since the analyzer's last scan. You
     *        can choose a value between 1 and 180 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnusedAccessConfiguration withUnusedAccessAge(Integer unusedAccessAge) {
        setUnusedAccessAge(unusedAccessAge);
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
        if (getUnusedAccessAge() != null)
            sb.append("UnusedAccessAge: ").append(getUnusedAccessAge());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnusedAccessConfiguration == false)
            return false;
        UnusedAccessConfiguration other = (UnusedAccessConfiguration) obj;
        if (other.getUnusedAccessAge() == null ^ this.getUnusedAccessAge() == null)
            return false;
        if (other.getUnusedAccessAge() != null && other.getUnusedAccessAge().equals(this.getUnusedAccessAge()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnusedAccessAge() == null) ? 0 : getUnusedAccessAge().hashCode());
        return hashCode;
    }

    @Override
    public UnusedAccessConfiguration clone() {
        try {
            return (UnusedAccessConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.UnusedAccessConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
