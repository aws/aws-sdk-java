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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The set of parameters for this mitigation action. You can specify only one type of parameter (in other words, you can
 * apply only one action for each defined mitigation action).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MitigationActionParams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
     * </p>
     */
    private UpdateDeviceCertificateParams updateDeviceCertificateParams;
    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
     * </p>
     */
    private UpdateCACertificateParams updateCACertificateParams;
    /**
     * <p>
     * Parameters to define a mitigation action that moves devices associated with a certificate to one or more
     * specified thing groups, typically for quarantine.
     * </p>
     */
    private AddThingsToThingGroupParams addThingsToThingGroupParams;
    /**
     * <p>
     * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
     * </p>
     */
    private ReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams;
    /**
     * <p>
     * Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
     * </p>
     */
    private EnableIoTLoggingParams enableIoTLoggingParams;
    /**
     * <p>
     * Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom
     * actions in response to the Amazon SNS messages.
     * </p>
     */
    private PublishFindingToSnsParams publishFindingToSnsParams;

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
     * </p>
     * 
     * @param updateDeviceCertificateParams
     *        Parameters to define a mitigation action that changes the state of the device certificate to inactive.
     */

    public void setUpdateDeviceCertificateParams(UpdateDeviceCertificateParams updateDeviceCertificateParams) {
        this.updateDeviceCertificateParams = updateDeviceCertificateParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
     * </p>
     * 
     * @return Parameters to define a mitigation action that changes the state of the device certificate to inactive.
     */

    public UpdateDeviceCertificateParams getUpdateDeviceCertificateParams() {
        return this.updateDeviceCertificateParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
     * </p>
     * 
     * @param updateDeviceCertificateParams
     *        Parameters to define a mitigation action that changes the state of the device certificate to inactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MitigationActionParams withUpdateDeviceCertificateParams(UpdateDeviceCertificateParams updateDeviceCertificateParams) {
        setUpdateDeviceCertificateParams(updateDeviceCertificateParams);
        return this;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
     * </p>
     * 
     * @param updateCACertificateParams
     *        Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
     */

    public void setUpdateCACertificateParams(UpdateCACertificateParams updateCACertificateParams) {
        this.updateCACertificateParams = updateCACertificateParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
     * </p>
     * 
     * @return Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
     */

    public UpdateCACertificateParams getUpdateCACertificateParams() {
        return this.updateCACertificateParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
     * </p>
     * 
     * @param updateCACertificateParams
     *        Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MitigationActionParams withUpdateCACertificateParams(UpdateCACertificateParams updateCACertificateParams) {
        setUpdateCACertificateParams(updateCACertificateParams);
        return this;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that moves devices associated with a certificate to one or more
     * specified thing groups, typically for quarantine.
     * </p>
     * 
     * @param addThingsToThingGroupParams
     *        Parameters to define a mitigation action that moves devices associated with a certificate to one or more
     *        specified thing groups, typically for quarantine.
     */

    public void setAddThingsToThingGroupParams(AddThingsToThingGroupParams addThingsToThingGroupParams) {
        this.addThingsToThingGroupParams = addThingsToThingGroupParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that moves devices associated with a certificate to one or more
     * specified thing groups, typically for quarantine.
     * </p>
     * 
     * @return Parameters to define a mitigation action that moves devices associated with a certificate to one or more
     *         specified thing groups, typically for quarantine.
     */

    public AddThingsToThingGroupParams getAddThingsToThingGroupParams() {
        return this.addThingsToThingGroupParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that moves devices associated with a certificate to one or more
     * specified thing groups, typically for quarantine.
     * </p>
     * 
     * @param addThingsToThingGroupParams
     *        Parameters to define a mitigation action that moves devices associated with a certificate to one or more
     *        specified thing groups, typically for quarantine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MitigationActionParams withAddThingsToThingGroupParams(AddThingsToThingGroupParams addThingsToThingGroupParams) {
        setAddThingsToThingGroupParams(addThingsToThingGroupParams);
        return this;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
     * </p>
     * 
     * @param replaceDefaultPolicyVersionParams
     *        Parameters to define a mitigation action that adds a blank policy to restrict permissions.
     */

    public void setReplaceDefaultPolicyVersionParams(ReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams) {
        this.replaceDefaultPolicyVersionParams = replaceDefaultPolicyVersionParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
     * </p>
     * 
     * @return Parameters to define a mitigation action that adds a blank policy to restrict permissions.
     */

    public ReplaceDefaultPolicyVersionParams getReplaceDefaultPolicyVersionParams() {
        return this.replaceDefaultPolicyVersionParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
     * </p>
     * 
     * @param replaceDefaultPolicyVersionParams
     *        Parameters to define a mitigation action that adds a blank policy to restrict permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MitigationActionParams withReplaceDefaultPolicyVersionParams(ReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams) {
        setReplaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams);
        return this;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
     * </p>
     * 
     * @param enableIoTLoggingParams
     *        Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
     */

    public void setEnableIoTLoggingParams(EnableIoTLoggingParams enableIoTLoggingParams) {
        this.enableIoTLoggingParams = enableIoTLoggingParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
     * </p>
     * 
     * @return Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
     */

    public EnableIoTLoggingParams getEnableIoTLoggingParams() {
        return this.enableIoTLoggingParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
     * </p>
     * 
     * @param enableIoTLoggingParams
     *        Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MitigationActionParams withEnableIoTLoggingParams(EnableIoTLoggingParams enableIoTLoggingParams) {
        setEnableIoTLoggingParams(enableIoTLoggingParams);
        return this;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom
     * actions in response to the Amazon SNS messages.
     * </p>
     * 
     * @param publishFindingToSnsParams
     *        Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own
     *        custom actions in response to the Amazon SNS messages.
     */

    public void setPublishFindingToSnsParams(PublishFindingToSnsParams publishFindingToSnsParams) {
        this.publishFindingToSnsParams = publishFindingToSnsParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom
     * actions in response to the Amazon SNS messages.
     * </p>
     * 
     * @return Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your
     *         own custom actions in response to the Amazon SNS messages.
     */

    public PublishFindingToSnsParams getPublishFindingToSnsParams() {
        return this.publishFindingToSnsParams;
    }

    /**
     * <p>
     * Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom
     * actions in response to the Amazon SNS messages.
     * </p>
     * 
     * @param publishFindingToSnsParams
     *        Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own
     *        custom actions in response to the Amazon SNS messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MitigationActionParams withPublishFindingToSnsParams(PublishFindingToSnsParams publishFindingToSnsParams) {
        setPublishFindingToSnsParams(publishFindingToSnsParams);
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
        if (getUpdateDeviceCertificateParams() != null)
            sb.append("UpdateDeviceCertificateParams: ").append(getUpdateDeviceCertificateParams()).append(",");
        if (getUpdateCACertificateParams() != null)
            sb.append("UpdateCACertificateParams: ").append(getUpdateCACertificateParams()).append(",");
        if (getAddThingsToThingGroupParams() != null)
            sb.append("AddThingsToThingGroupParams: ").append(getAddThingsToThingGroupParams()).append(",");
        if (getReplaceDefaultPolicyVersionParams() != null)
            sb.append("ReplaceDefaultPolicyVersionParams: ").append(getReplaceDefaultPolicyVersionParams()).append(",");
        if (getEnableIoTLoggingParams() != null)
            sb.append("EnableIoTLoggingParams: ").append(getEnableIoTLoggingParams()).append(",");
        if (getPublishFindingToSnsParams() != null)
            sb.append("PublishFindingToSnsParams: ").append(getPublishFindingToSnsParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MitigationActionParams == false)
            return false;
        MitigationActionParams other = (MitigationActionParams) obj;
        if (other.getUpdateDeviceCertificateParams() == null ^ this.getUpdateDeviceCertificateParams() == null)
            return false;
        if (other.getUpdateDeviceCertificateParams() != null
                && other.getUpdateDeviceCertificateParams().equals(this.getUpdateDeviceCertificateParams()) == false)
            return false;
        if (other.getUpdateCACertificateParams() == null ^ this.getUpdateCACertificateParams() == null)
            return false;
        if (other.getUpdateCACertificateParams() != null && other.getUpdateCACertificateParams().equals(this.getUpdateCACertificateParams()) == false)
            return false;
        if (other.getAddThingsToThingGroupParams() == null ^ this.getAddThingsToThingGroupParams() == null)
            return false;
        if (other.getAddThingsToThingGroupParams() != null && other.getAddThingsToThingGroupParams().equals(this.getAddThingsToThingGroupParams()) == false)
            return false;
        if (other.getReplaceDefaultPolicyVersionParams() == null ^ this.getReplaceDefaultPolicyVersionParams() == null)
            return false;
        if (other.getReplaceDefaultPolicyVersionParams() != null
                && other.getReplaceDefaultPolicyVersionParams().equals(this.getReplaceDefaultPolicyVersionParams()) == false)
            return false;
        if (other.getEnableIoTLoggingParams() == null ^ this.getEnableIoTLoggingParams() == null)
            return false;
        if (other.getEnableIoTLoggingParams() != null && other.getEnableIoTLoggingParams().equals(this.getEnableIoTLoggingParams()) == false)
            return false;
        if (other.getPublishFindingToSnsParams() == null ^ this.getPublishFindingToSnsParams() == null)
            return false;
        if (other.getPublishFindingToSnsParams() != null && other.getPublishFindingToSnsParams().equals(this.getPublishFindingToSnsParams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateDeviceCertificateParams() == null) ? 0 : getUpdateDeviceCertificateParams().hashCode());
        hashCode = prime * hashCode + ((getUpdateCACertificateParams() == null) ? 0 : getUpdateCACertificateParams().hashCode());
        hashCode = prime * hashCode + ((getAddThingsToThingGroupParams() == null) ? 0 : getAddThingsToThingGroupParams().hashCode());
        hashCode = prime * hashCode + ((getReplaceDefaultPolicyVersionParams() == null) ? 0 : getReplaceDefaultPolicyVersionParams().hashCode());
        hashCode = prime * hashCode + ((getEnableIoTLoggingParams() == null) ? 0 : getEnableIoTLoggingParams().hashCode());
        hashCode = prime * hashCode + ((getPublishFindingToSnsParams() == null) ? 0 : getPublishFindingToSnsParams().hashCode());
        return hashCode;
    }

    @Override
    public MitigationActionParams clone() {
        try {
            return (MitigationActionParams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.MitigationActionParamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
