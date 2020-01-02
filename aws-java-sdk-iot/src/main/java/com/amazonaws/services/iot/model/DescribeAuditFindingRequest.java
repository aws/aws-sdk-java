/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAuditFindingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for a single audit finding. You can use this identifier to apply mitigation actions to the
     * finding.
     * </p>
     */
    private String findingId;

    /**
     * <p>
     * A unique identifier for a single audit finding. You can use this identifier to apply mitigation actions to the
     * finding.
     * </p>
     * 
     * @param findingId
     *        A unique identifier for a single audit finding. You can use this identifier to apply mitigation actions to
     *        the finding.
     */

    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * A unique identifier for a single audit finding. You can use this identifier to apply mitigation actions to the
     * finding.
     * </p>
     * 
     * @return A unique identifier for a single audit finding. You can use this identifier to apply mitigation actions
     *         to the finding.
     */

    public String getFindingId() {
        return this.findingId;
    }

    /**
     * <p>
     * A unique identifier for a single audit finding. You can use this identifier to apply mitigation actions to the
     * finding.
     * </p>
     * 
     * @param findingId
     *        A unique identifier for a single audit finding. You can use this identifier to apply mitigation actions to
     *        the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditFindingRequest withFindingId(String findingId) {
        setFindingId(findingId);
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
        if (getFindingId() != null)
            sb.append("FindingId: ").append(getFindingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAuditFindingRequest == false)
            return false;
        DescribeAuditFindingRequest other = (DescribeAuditFindingRequest) obj;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAuditFindingRequest clone() {
        return (DescribeAuditFindingRequest) super.clone();
    }

}
