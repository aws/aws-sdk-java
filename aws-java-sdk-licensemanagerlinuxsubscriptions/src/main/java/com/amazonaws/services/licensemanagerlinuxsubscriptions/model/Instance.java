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
package com.amazonaws.services.licensemanagerlinuxsubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details discovered information about a running instance using Linux subscriptions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/Instance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Instance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account ID which owns the instance.
     * </p>
     */
    private String accountID;
    /**
     * <p>
     * The AMI ID used to launch the instance.
     * </p>
     */
    private String amiId;
    /**
     * <p>
     * The instance ID of the resource.
     * </p>
     */
    private String instanceID;
    /**
     * <p>
     * The instance type of the resource.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The time in which the last discovery updated the instance details.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * The product code for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     * >Usage operation values</a> in the <i>License Manager User Guide</i> .
     * </p>
     */
    private java.util.List<String> productCode;
    /**
     * <p>
     * The Region the instance is running in.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The status of the instance.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the subscription being used by the instance.
     * </p>
     */
    private String subscriptionName;
    /**
     * <p>
     * The usage operation of the instance. For more information, see For more information, see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     * >Usage operation values</a> in the <i>License Manager User Guide</i>.
     * </p>
     */
    private String usageOperation;

    /**
     * <p>
     * The account ID which owns the instance.
     * </p>
     * 
     * @param accountID
     *        The account ID which owns the instance.
     */

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * <p>
     * The account ID which owns the instance.
     * </p>
     * 
     * @return The account ID which owns the instance.
     */

    public String getAccountID() {
        return this.accountID;
    }

    /**
     * <p>
     * The account ID which owns the instance.
     * </p>
     * 
     * @param accountID
     *        The account ID which owns the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withAccountID(String accountID) {
        setAccountID(accountID);
        return this;
    }

    /**
     * <p>
     * The AMI ID used to launch the instance.
     * </p>
     * 
     * @param amiId
     *        The AMI ID used to launch the instance.
     */

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * The AMI ID used to launch the instance.
     * </p>
     * 
     * @return The AMI ID used to launch the instance.
     */

    public String getAmiId() {
        return this.amiId;
    }

    /**
     * <p>
     * The AMI ID used to launch the instance.
     * </p>
     * 
     * @param amiId
     *        The AMI ID used to launch the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withAmiId(String amiId) {
        setAmiId(amiId);
        return this;
    }

    /**
     * <p>
     * The instance ID of the resource.
     * </p>
     * 
     * @param instanceID
     *        The instance ID of the resource.
     */

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    /**
     * <p>
     * The instance ID of the resource.
     * </p>
     * 
     * @return The instance ID of the resource.
     */

    public String getInstanceID() {
        return this.instanceID;
    }

    /**
     * <p>
     * The instance ID of the resource.
     * </p>
     * 
     * @param instanceID
     *        The instance ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceID(String instanceID) {
        setInstanceID(instanceID);
        return this;
    }

    /**
     * <p>
     * The instance type of the resource.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the resource.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the resource.
     * </p>
     * 
     * @return The instance type of the resource.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the resource.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The time in which the last discovery updated the instance details.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time in which the last discovery updated the instance details.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time in which the last discovery updated the instance details.
     * </p>
     * 
     * @return The time in which the last discovery updated the instance details.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time in which the last discovery updated the instance details.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time in which the last discovery updated the instance details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The product code for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     * >Usage operation values</a> in the <i>License Manager User Guide</i> .
     * </p>
     * 
     * @return The product code for the instance. For more information, see <a
     *         href="https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     *         >Usage operation values</a> in the <i>License Manager User Guide</i> .
     */

    public java.util.List<String> getProductCode() {
        return productCode;
    }

    /**
     * <p>
     * The product code for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     * >Usage operation values</a> in the <i>License Manager User Guide</i> .
     * </p>
     * 
     * @param productCode
     *        The product code for the instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     *        >Usage operation values</a> in the <i>License Manager User Guide</i> .
     */

    public void setProductCode(java.util.Collection<String> productCode) {
        if (productCode == null) {
            this.productCode = null;
            return;
        }

        this.productCode = new java.util.ArrayList<String>(productCode);
    }

    /**
     * <p>
     * The product code for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     * >Usage operation values</a> in the <i>License Manager User Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductCode(java.util.Collection)} or {@link #withProductCode(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productCode
     *        The product code for the instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     *        >Usage operation values</a> in the <i>License Manager User Guide</i> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withProductCode(String... productCode) {
        if (this.productCode == null) {
            setProductCode(new java.util.ArrayList<String>(productCode.length));
        }
        for (String ele : productCode) {
            this.productCode.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The product code for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     * >Usage operation values</a> in the <i>License Manager User Guide</i> .
     * </p>
     * 
     * @param productCode
     *        The product code for the instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     *        >Usage operation values</a> in the <i>License Manager User Guide</i> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withProductCode(java.util.Collection<String> productCode) {
        setProductCode(productCode);
        return this;
    }

    /**
     * <p>
     * The Region the instance is running in.
     * </p>
     * 
     * @param region
     *        The Region the instance is running in.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region the instance is running in.
     * </p>
     * 
     * @return The Region the instance is running in.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Region the instance is running in.
     * </p>
     * 
     * @param region
     *        The Region the instance is running in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The status of the instance.
     * </p>
     * 
     * @param status
     *        The status of the instance.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the instance.
     * </p>
     * 
     * @return The status of the instance.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the instance.
     * </p>
     * 
     * @param status
     *        The status of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The name of the subscription being used by the instance.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the subscription being used by the instance.
     */

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    /**
     * <p>
     * The name of the subscription being used by the instance.
     * </p>
     * 
     * @return The name of the subscription being used by the instance.
     */

    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * <p>
     * The name of the subscription being used by the instance.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the subscription being used by the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withSubscriptionName(String subscriptionName) {
        setSubscriptionName(subscriptionName);
        return this;
    }

    /**
     * <p>
     * The usage operation of the instance. For more information, see For more information, see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     * >Usage operation values</a> in the <i>License Manager User Guide</i>.
     * </p>
     * 
     * @param usageOperation
     *        The usage operation of the instance. For more information, see For more information, see <a href=
     *        "https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     *        >Usage operation values</a> in the <i>License Manager User Guide</i>.
     */

    public void setUsageOperation(String usageOperation) {
        this.usageOperation = usageOperation;
    }

    /**
     * <p>
     * The usage operation of the instance. For more information, see For more information, see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     * >Usage operation values</a> in the <i>License Manager User Guide</i>.
     * </p>
     * 
     * @return The usage operation of the instance. For more information, see For more information, see <a
     *         href="https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     *         >Usage operation values</a> in the <i>License Manager User Guide</i>.
     */

    public String getUsageOperation() {
        return this.usageOperation;
    }

    /**
     * <p>
     * The usage operation of the instance. For more information, see For more information, see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     * >Usage operation values</a> in the <i>License Manager User Guide</i>.
     * </p>
     * 
     * @param usageOperation
     *        The usage operation of the instance. For more information, see For more information, see <a href=
     *        "https://docs.aws.amazon.com/license-manager/latest/userguide/linux-subscriptions-usage-operation.html"
     *        >Usage operation values</a> in the <i>License Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withUsageOperation(String usageOperation) {
        setUsageOperation(usageOperation);
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
        if (getAccountID() != null)
            sb.append("AccountID: ").append(getAccountID()).append(",");
        if (getAmiId() != null)
            sb.append("AmiId: ").append(getAmiId()).append(",");
        if (getInstanceID() != null)
            sb.append("InstanceID: ").append(getInstanceID()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getProductCode() != null)
            sb.append("ProductCode: ").append(getProductCode()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubscriptionName() != null)
            sb.append("SubscriptionName: ").append(getSubscriptionName()).append(",");
        if (getUsageOperation() != null)
            sb.append("UsageOperation: ").append(getUsageOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;
        if (other.getAccountID() == null ^ this.getAccountID() == null)
            return false;
        if (other.getAccountID() != null && other.getAccountID().equals(this.getAccountID()) == false)
            return false;
        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getInstanceID() == null ^ this.getInstanceID() == null)
            return false;
        if (other.getInstanceID() != null && other.getInstanceID().equals(this.getInstanceID()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null)
            return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false)
            return false;
        if (other.getUsageOperation() == null ^ this.getUsageOperation() == null)
            return false;
        if (other.getUsageOperation() != null && other.getUsageOperation().equals(this.getUsageOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountID() == null) ? 0 : getAccountID().hashCode());
        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode());
        hashCode = prime * hashCode + ((getInstanceID() == null) ? 0 : getInstanceID().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode());
        hashCode = prime * hashCode + ((getUsageOperation() == null) ? 0 : getUsageOperation().hashCode());
        return hashCode;
    }

    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanagerlinuxsubscriptions.model.transform.InstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
