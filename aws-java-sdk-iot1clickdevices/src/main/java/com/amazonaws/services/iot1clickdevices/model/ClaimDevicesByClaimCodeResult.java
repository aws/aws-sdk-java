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
package com.amazonaws.services.iot1clickdevices.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ClaimDevicesByClaimCode" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClaimDevicesByClaimCodeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The claim code provided by the device manufacturer.
     * </p>
     */
    private String claimCode;
    /**
     * <p>
     * The total number of devices associated with the claim code that has been processed in the claim request.
     * </p>
     */
    private Integer total;

    /**
     * <p>
     * The claim code provided by the device manufacturer.
     * </p>
     * 
     * @param claimCode
     *        The claim code provided by the device manufacturer.
     */

    public void setClaimCode(String claimCode) {
        this.claimCode = claimCode;
    }

    /**
     * <p>
     * The claim code provided by the device manufacturer.
     * </p>
     * 
     * @return The claim code provided by the device manufacturer.
     */

    public String getClaimCode() {
        return this.claimCode;
    }

    /**
     * <p>
     * The claim code provided by the device manufacturer.
     * </p>
     * 
     * @param claimCode
     *        The claim code provided by the device manufacturer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimDevicesByClaimCodeResult withClaimCode(String claimCode) {
        setClaimCode(claimCode);
        return this;
    }

    /**
     * <p>
     * The total number of devices associated with the claim code that has been processed in the claim request.
     * </p>
     * 
     * @param total
     *        The total number of devices associated with the claim code that has been processed in the claim request.
     */

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * The total number of devices associated with the claim code that has been processed in the claim request.
     * </p>
     * 
     * @return The total number of devices associated with the claim code that has been processed in the claim request.
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total number of devices associated with the claim code that has been processed in the claim request.
     * </p>
     * 
     * @param total
     *        The total number of devices associated with the claim code that has been processed in the claim request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimDevicesByClaimCodeResult withTotal(Integer total) {
        setTotal(total);
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
        if (getClaimCode() != null)
            sb.append("ClaimCode: ").append(getClaimCode()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClaimDevicesByClaimCodeResult == false)
            return false;
        ClaimDevicesByClaimCodeResult other = (ClaimDevicesByClaimCodeResult) obj;
        if (other.getClaimCode() == null ^ this.getClaimCode() == null)
            return false;
        if (other.getClaimCode() != null && other.getClaimCode().equals(this.getClaimCode()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClaimCode() == null) ? 0 : getClaimCode().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public ClaimDevicesByClaimCodeResult clone() {
        try {
            return (ClaimDevicesByClaimCodeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
