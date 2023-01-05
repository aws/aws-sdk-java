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
 * <p>
 * The Multi-Region Access Point access control policy.
 * </p>
 * <p>
 * When you update the policy, the update is first listed as the proposed policy. After the update is finished and all
 * Regions have been updated, the proposed policy is listed as the established policy. If both policies have the same
 * version number, the proposed policy is the established policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/MultiRegionAccessPointPolicyDocument"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiRegionAccessPointPolicyDocument implements Serializable, Cloneable {

    /**
     * <p>
     * The last established policy for the Multi-Region Access Point.
     * </p>
     */
    private EstablishedMultiRegionAccessPointPolicy established;
    /**
     * <p>
     * The proposed policy for the Multi-Region Access Point.
     * </p>
     */
    private ProposedMultiRegionAccessPointPolicy proposed;

    /**
     * <p>
     * The last established policy for the Multi-Region Access Point.
     * </p>
     * 
     * @param established
     *        The last established policy for the Multi-Region Access Point.
     */

    public void setEstablished(EstablishedMultiRegionAccessPointPolicy established) {
        this.established = established;
    }

    /**
     * <p>
     * The last established policy for the Multi-Region Access Point.
     * </p>
     * 
     * @return The last established policy for the Multi-Region Access Point.
     */

    public EstablishedMultiRegionAccessPointPolicy getEstablished() {
        return this.established;
    }

    /**
     * <p>
     * The last established policy for the Multi-Region Access Point.
     * </p>
     * 
     * @param established
     *        The last established policy for the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointPolicyDocument withEstablished(EstablishedMultiRegionAccessPointPolicy established) {
        setEstablished(established);
        return this;
    }

    /**
     * <p>
     * The proposed policy for the Multi-Region Access Point.
     * </p>
     * 
     * @param proposed
     *        The proposed policy for the Multi-Region Access Point.
     */

    public void setProposed(ProposedMultiRegionAccessPointPolicy proposed) {
        this.proposed = proposed;
    }

    /**
     * <p>
     * The proposed policy for the Multi-Region Access Point.
     * </p>
     * 
     * @return The proposed policy for the Multi-Region Access Point.
     */

    public ProposedMultiRegionAccessPointPolicy getProposed() {
        return this.proposed;
    }

    /**
     * <p>
     * The proposed policy for the Multi-Region Access Point.
     * </p>
     * 
     * @param proposed
     *        The proposed policy for the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointPolicyDocument withProposed(ProposedMultiRegionAccessPointPolicy proposed) {
        setProposed(proposed);
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
            sb.append("Established: ").append(getEstablished()).append(",");
        if (getProposed() != null)
            sb.append("Proposed: ").append(getProposed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiRegionAccessPointPolicyDocument == false)
            return false;
        MultiRegionAccessPointPolicyDocument other = (MultiRegionAccessPointPolicyDocument) obj;
        if (other.getEstablished() == null ^ this.getEstablished() == null)
            return false;
        if (other.getEstablished() != null && other.getEstablished().equals(this.getEstablished()) == false)
            return false;
        if (other.getProposed() == null ^ this.getProposed() == null)
            return false;
        if (other.getProposed() != null && other.getProposed().equals(this.getProposed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEstablished() == null) ? 0 : getEstablished().hashCode());
        hashCode = prime * hashCode + ((getProposed() == null) ? 0 : getProposed().hashCode());
        return hashCode;
    }

    @Override
    public MultiRegionAccessPointPolicyDocument clone() {
        try {
            return (MultiRegionAccessPointPolicyDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
