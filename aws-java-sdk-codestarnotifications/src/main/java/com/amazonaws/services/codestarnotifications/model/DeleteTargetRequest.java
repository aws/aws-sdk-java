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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DeleteTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic to delete.
     * </p>
     */
    private String targetAddress;
    /**
     * <p>
     * A Boolean value that can be used to delete all associations with this SNS topic. The default value is FALSE. If
     * set to TRUE, all associations between that target and every notification rule in your AWS account are deleted.
     * </p>
     */
    private Boolean forceUnsubscribeAll;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic to delete.
     * </p>
     * 
     * @param targetAddress
     *        The Amazon Resource Name (ARN) of the SNS topic to delete.
     */

    public void setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SNS topic to delete.
     */

    public String getTargetAddress() {
        return this.targetAddress;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic to delete.
     * </p>
     * 
     * @param targetAddress
     *        The Amazon Resource Name (ARN) of the SNS topic to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTargetRequest withTargetAddress(String targetAddress) {
        setTargetAddress(targetAddress);
        return this;
    }

    /**
     * <p>
     * A Boolean value that can be used to delete all associations with this SNS topic. The default value is FALSE. If
     * set to TRUE, all associations between that target and every notification rule in your AWS account are deleted.
     * </p>
     * 
     * @param forceUnsubscribeAll
     *        A Boolean value that can be used to delete all associations with this SNS topic. The default value is
     *        FALSE. If set to TRUE, all associations between that target and every notification rule in your AWS
     *        account are deleted.
     */

    public void setForceUnsubscribeAll(Boolean forceUnsubscribeAll) {
        this.forceUnsubscribeAll = forceUnsubscribeAll;
    }

    /**
     * <p>
     * A Boolean value that can be used to delete all associations with this SNS topic. The default value is FALSE. If
     * set to TRUE, all associations between that target and every notification rule in your AWS account are deleted.
     * </p>
     * 
     * @return A Boolean value that can be used to delete all associations with this SNS topic. The default value is
     *         FALSE. If set to TRUE, all associations between that target and every notification rule in your AWS
     *         account are deleted.
     */

    public Boolean getForceUnsubscribeAll() {
        return this.forceUnsubscribeAll;
    }

    /**
     * <p>
     * A Boolean value that can be used to delete all associations with this SNS topic. The default value is FALSE. If
     * set to TRUE, all associations between that target and every notification rule in your AWS account are deleted.
     * </p>
     * 
     * @param forceUnsubscribeAll
     *        A Boolean value that can be used to delete all associations with this SNS topic. The default value is
     *        FALSE. If set to TRUE, all associations between that target and every notification rule in your AWS
     *        account are deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTargetRequest withForceUnsubscribeAll(Boolean forceUnsubscribeAll) {
        setForceUnsubscribeAll(forceUnsubscribeAll);
        return this;
    }

    /**
     * <p>
     * A Boolean value that can be used to delete all associations with this SNS topic. The default value is FALSE. If
     * set to TRUE, all associations between that target and every notification rule in your AWS account are deleted.
     * </p>
     * 
     * @return A Boolean value that can be used to delete all associations with this SNS topic. The default value is
     *         FALSE. If set to TRUE, all associations between that target and every notification rule in your AWS
     *         account are deleted.
     */

    public Boolean isForceUnsubscribeAll() {
        return this.forceUnsubscribeAll;
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
        if (getTargetAddress() != null)
            sb.append("TargetAddress: ").append("***Sensitive Data Redacted***").append(",");
        if (getForceUnsubscribeAll() != null)
            sb.append("ForceUnsubscribeAll: ").append(getForceUnsubscribeAll());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTargetRequest == false)
            return false;
        DeleteTargetRequest other = (DeleteTargetRequest) obj;
        if (other.getTargetAddress() == null ^ this.getTargetAddress() == null)
            return false;
        if (other.getTargetAddress() != null && other.getTargetAddress().equals(this.getTargetAddress()) == false)
            return false;
        if (other.getForceUnsubscribeAll() == null ^ this.getForceUnsubscribeAll() == null)
            return false;
        if (other.getForceUnsubscribeAll() != null && other.getForceUnsubscribeAll().equals(this.getForceUnsubscribeAll()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetAddress() == null) ? 0 : getTargetAddress().hashCode());
        hashCode = prime * hashCode + ((getForceUnsubscribeAll() == null) ? 0 : getForceUnsubscribeAll().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTargetRequest clone() {
        return (DeleteTargetRequest) super.clone();
    }

}
