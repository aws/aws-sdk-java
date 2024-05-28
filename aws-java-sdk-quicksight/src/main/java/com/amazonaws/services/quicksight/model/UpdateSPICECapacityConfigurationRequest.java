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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateSPICECapacityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSPICECapacityConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the SPICE configuration that you want to update.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * Determines how SPICE capacity can be purchased. The following options are available.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MANUAL</code>: SPICE capacity can only be purchased manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO_PURCHASE</code>: Extra SPICE capacity is automatically purchased on your behalf as needed. SPICE
     * capacity can also be purchased manually with this option.
     * </p>
     * </li>
     * </ul>
     */
    private String purchaseMode;

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the SPICE configuration that you want to update.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the SPICE configuration that you want to update.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the SPICE configuration that you want to update.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that contains the SPICE configuration that you want to update.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the SPICE configuration that you want to update.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the SPICE configuration that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSPICECapacityConfigurationRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * Determines how SPICE capacity can be purchased. The following options are available.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MANUAL</code>: SPICE capacity can only be purchased manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO_PURCHASE</code>: Extra SPICE capacity is automatically purchased on your behalf as needed. SPICE
     * capacity can also be purchased manually with this option.
     * </p>
     * </li>
     * </ul>
     * 
     * @param purchaseMode
     *        Determines how SPICE capacity can be purchased. The following options are available. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MANUAL</code>: SPICE capacity can only be purchased manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO_PURCHASE</code>: Extra SPICE capacity is automatically purchased on your behalf as needed.
     *        SPICE capacity can also be purchased manually with this option.
     *        </p>
     *        </li>
     * @see PurchaseMode
     */

    public void setPurchaseMode(String purchaseMode) {
        this.purchaseMode = purchaseMode;
    }

    /**
     * <p>
     * Determines how SPICE capacity can be purchased. The following options are available.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MANUAL</code>: SPICE capacity can only be purchased manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO_PURCHASE</code>: Extra SPICE capacity is automatically purchased on your behalf as needed. SPICE
     * capacity can also be purchased manually with this option.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines how SPICE capacity can be purchased. The following options are available. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MANUAL</code>: SPICE capacity can only be purchased manually.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTO_PURCHASE</code>: Extra SPICE capacity is automatically purchased on your behalf as needed.
     *         SPICE capacity can also be purchased manually with this option.
     *         </p>
     *         </li>
     * @see PurchaseMode
     */

    public String getPurchaseMode() {
        return this.purchaseMode;
    }

    /**
     * <p>
     * Determines how SPICE capacity can be purchased. The following options are available.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MANUAL</code>: SPICE capacity can only be purchased manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO_PURCHASE</code>: Extra SPICE capacity is automatically purchased on your behalf as needed. SPICE
     * capacity can also be purchased manually with this option.
     * </p>
     * </li>
     * </ul>
     * 
     * @param purchaseMode
     *        Determines how SPICE capacity can be purchased. The following options are available. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MANUAL</code>: SPICE capacity can only be purchased manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO_PURCHASE</code>: Extra SPICE capacity is automatically purchased on your behalf as needed.
     *        SPICE capacity can also be purchased manually with this option.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PurchaseMode
     */

    public UpdateSPICECapacityConfigurationRequest withPurchaseMode(String purchaseMode) {
        setPurchaseMode(purchaseMode);
        return this;
    }

    /**
     * <p>
     * Determines how SPICE capacity can be purchased. The following options are available.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MANUAL</code>: SPICE capacity can only be purchased manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO_PURCHASE</code>: Extra SPICE capacity is automatically purchased on your behalf as needed. SPICE
     * capacity can also be purchased manually with this option.
     * </p>
     * </li>
     * </ul>
     * 
     * @param purchaseMode
     *        Determines how SPICE capacity can be purchased. The following options are available. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MANUAL</code>: SPICE capacity can only be purchased manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO_PURCHASE</code>: Extra SPICE capacity is automatically purchased on your behalf as needed.
     *        SPICE capacity can also be purchased manually with this option.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PurchaseMode
     */

    public UpdateSPICECapacityConfigurationRequest withPurchaseMode(PurchaseMode purchaseMode) {
        this.purchaseMode = purchaseMode.toString();
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getPurchaseMode() != null)
            sb.append("PurchaseMode: ").append(getPurchaseMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSPICECapacityConfigurationRequest == false)
            return false;
        UpdateSPICECapacityConfigurationRequest other = (UpdateSPICECapacityConfigurationRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getPurchaseMode() == null ^ this.getPurchaseMode() == null)
            return false;
        if (other.getPurchaseMode() != null && other.getPurchaseMode().equals(this.getPurchaseMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getPurchaseMode() == null) ? 0 : getPurchaseMode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSPICECapacityConfigurationRequest clone() {
        return (UpdateSPICECapacityConfigurationRequest) super.clone();
    }

}
