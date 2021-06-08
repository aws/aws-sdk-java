/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Target SIP media application and other details, such as priority and AWS Region, to be specified in the SIP rule.
 * Only one SIP rule per AWS Region can be provided.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SipRuleTargetApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SipRuleTargetApplication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     */
    private String sipMediaApplicationId;
    /**
     * <p>
     * Priority of the SIP media application in the target list.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The AWS Region of the target application.
     * </p>
     */
    private String awsRegion;

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     * 
     * @param sipMediaApplicationId
     *        The SIP media application ID.
     */

    public void setSipMediaApplicationId(String sipMediaApplicationId) {
        this.sipMediaApplicationId = sipMediaApplicationId;
    }

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     * 
     * @return The SIP media application ID.
     */

    public String getSipMediaApplicationId() {
        return this.sipMediaApplicationId;
    }

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     * 
     * @param sipMediaApplicationId
     *        The SIP media application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRuleTargetApplication withSipMediaApplicationId(String sipMediaApplicationId) {
        setSipMediaApplicationId(sipMediaApplicationId);
        return this;
    }

    /**
     * <p>
     * Priority of the SIP media application in the target list.
     * </p>
     * 
     * @param priority
     *        Priority of the SIP media application in the target list.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Priority of the SIP media application in the target list.
     * </p>
     * 
     * @return Priority of the SIP media application in the target list.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * Priority of the SIP media application in the target list.
     * </p>
     * 
     * @param priority
     *        Priority of the SIP media application in the target list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRuleTargetApplication withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The AWS Region of the target application.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region of the target application.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The AWS Region of the target application.
     * </p>
     * 
     * @return The AWS Region of the target application.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The AWS Region of the target application.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region of the target application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRuleTargetApplication withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
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
        if (getSipMediaApplicationId() != null)
            sb.append("SipMediaApplicationId: ").append(getSipMediaApplicationId()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SipRuleTargetApplication == false)
            return false;
        SipRuleTargetApplication other = (SipRuleTargetApplication) obj;
        if (other.getSipMediaApplicationId() == null ^ this.getSipMediaApplicationId() == null)
            return false;
        if (other.getSipMediaApplicationId() != null && other.getSipMediaApplicationId().equals(this.getSipMediaApplicationId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipMediaApplicationId() == null) ? 0 : getSipMediaApplicationId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        return hashCode;
    }

    @Override
    public SipRuleTargetApplication clone() {
        try {
            return (SipRuleTargetApplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.SipRuleTargetApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
