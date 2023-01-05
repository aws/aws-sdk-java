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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointPolicyStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMultiRegionAccessPointPolicyStatusResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements Serializable, Cloneable {

    private PolicyStatus established;

    /**
     * @param established
     */

    public void setEstablished(PolicyStatus established) {
        this.established = established;
    }

    /**
     * @return
     */

    public PolicyStatus getEstablished() {
        return this.established;
    }

    /**
     * @param established
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMultiRegionAccessPointPolicyStatusResult withEstablished(PolicyStatus established) {
        setEstablished(established);
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
        if (getEstablished() != null)
            sb.append("Established: ").append(getEstablished());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMultiRegionAccessPointPolicyStatusResult == false)
            return false;
        GetMultiRegionAccessPointPolicyStatusResult other = (GetMultiRegionAccessPointPolicyStatusResult) obj;
        if (other.getEstablished() == null ^ this.getEstablished() == null)
            return false;
        if (other.getEstablished() != null && other.getEstablished().equals(this.getEstablished()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEstablished() == null) ? 0 : getEstablished().hashCode());
        return hashCode;
    }

    @Override
    public GetMultiRegionAccessPointPolicyStatusResult clone() {
        try {
            return (GetMultiRegionAccessPointPolicyStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
