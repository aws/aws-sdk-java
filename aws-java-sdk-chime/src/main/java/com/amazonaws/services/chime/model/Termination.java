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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Termination settings enable your SIP hosts to make outbound calls using your Amazon Chime Voice Connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/Termination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Termination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The limit on calls per second. Max value based on account service limit. Default value of 1.
     * </p>
     */
    private Integer cpsLimit;
    /**
     * <p>
     * The default caller ID phone number.
     * </p>
     */
    private String defaultPhoneNumber;
    /**
     * <p>
     * The countries to which calls are allowed.
     * </p>
     */
    private java.util.List<String> callingRegions;
    /**
     * <p>
     * The IP addresses allowed to make calls, in CIDR format.
     * </p>
     */
    private java.util.List<String> cidrAllowedList;
    /**
     * <p>
     * When termination settings are disabled, outbound calls can not be made.
     * </p>
     */
    private Boolean disabled;

    /**
     * <p>
     * The limit on calls per second. Max value based on account service limit. Default value of 1.
     * </p>
     * 
     * @param cpsLimit
     *        The limit on calls per second. Max value based on account service limit. Default value of 1.
     */

    public void setCpsLimit(Integer cpsLimit) {
        this.cpsLimit = cpsLimit;
    }

    /**
     * <p>
     * The limit on calls per second. Max value based on account service limit. Default value of 1.
     * </p>
     * 
     * @return The limit on calls per second. Max value based on account service limit. Default value of 1.
     */

    public Integer getCpsLimit() {
        return this.cpsLimit;
    }

    /**
     * <p>
     * The limit on calls per second. Max value based on account service limit. Default value of 1.
     * </p>
     * 
     * @param cpsLimit
     *        The limit on calls per second. Max value based on account service limit. Default value of 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Termination withCpsLimit(Integer cpsLimit) {
        setCpsLimit(cpsLimit);
        return this;
    }

    /**
     * <p>
     * The default caller ID phone number.
     * </p>
     * 
     * @param defaultPhoneNumber
     *        The default caller ID phone number.
     */

    public void setDefaultPhoneNumber(String defaultPhoneNumber) {
        this.defaultPhoneNumber = defaultPhoneNumber;
    }

    /**
     * <p>
     * The default caller ID phone number.
     * </p>
     * 
     * @return The default caller ID phone number.
     */

    public String getDefaultPhoneNumber() {
        return this.defaultPhoneNumber;
    }

    /**
     * <p>
     * The default caller ID phone number.
     * </p>
     * 
     * @param defaultPhoneNumber
     *        The default caller ID phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Termination withDefaultPhoneNumber(String defaultPhoneNumber) {
        setDefaultPhoneNumber(defaultPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The countries to which calls are allowed.
     * </p>
     * 
     * @return The countries to which calls are allowed.
     */

    public java.util.List<String> getCallingRegions() {
        return callingRegions;
    }

    /**
     * <p>
     * The countries to which calls are allowed.
     * </p>
     * 
     * @param callingRegions
     *        The countries to which calls are allowed.
     */

    public void setCallingRegions(java.util.Collection<String> callingRegions) {
        if (callingRegions == null) {
            this.callingRegions = null;
            return;
        }

        this.callingRegions = new java.util.ArrayList<String>(callingRegions);
    }

    /**
     * <p>
     * The countries to which calls are allowed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCallingRegions(java.util.Collection)} or {@link #withCallingRegions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param callingRegions
     *        The countries to which calls are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Termination withCallingRegions(String... callingRegions) {
        if (this.callingRegions == null) {
            setCallingRegions(new java.util.ArrayList<String>(callingRegions.length));
        }
        for (String ele : callingRegions) {
            this.callingRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The countries to which calls are allowed.
     * </p>
     * 
     * @param callingRegions
     *        The countries to which calls are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Termination withCallingRegions(java.util.Collection<String> callingRegions) {
        setCallingRegions(callingRegions);
        return this;
    }

    /**
     * <p>
     * The IP addresses allowed to make calls, in CIDR format.
     * </p>
     * 
     * @return The IP addresses allowed to make calls, in CIDR format.
     */

    public java.util.List<String> getCidrAllowedList() {
        return cidrAllowedList;
    }

    /**
     * <p>
     * The IP addresses allowed to make calls, in CIDR format.
     * </p>
     * 
     * @param cidrAllowedList
     *        The IP addresses allowed to make calls, in CIDR format.
     */

    public void setCidrAllowedList(java.util.Collection<String> cidrAllowedList) {
        if (cidrAllowedList == null) {
            this.cidrAllowedList = null;
            return;
        }

        this.cidrAllowedList = new java.util.ArrayList<String>(cidrAllowedList);
    }

    /**
     * <p>
     * The IP addresses allowed to make calls, in CIDR format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrAllowedList(java.util.Collection)} or {@link #withCidrAllowedList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param cidrAllowedList
     *        The IP addresses allowed to make calls, in CIDR format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Termination withCidrAllowedList(String... cidrAllowedList) {
        if (this.cidrAllowedList == null) {
            setCidrAllowedList(new java.util.ArrayList<String>(cidrAllowedList.length));
        }
        for (String ele : cidrAllowedList) {
            this.cidrAllowedList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses allowed to make calls, in CIDR format.
     * </p>
     * 
     * @param cidrAllowedList
     *        The IP addresses allowed to make calls, in CIDR format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Termination withCidrAllowedList(java.util.Collection<String> cidrAllowedList) {
        setCidrAllowedList(cidrAllowedList);
        return this;
    }

    /**
     * <p>
     * When termination settings are disabled, outbound calls can not be made.
     * </p>
     * 
     * @param disabled
     *        When termination settings are disabled, outbound calls can not be made.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * When termination settings are disabled, outbound calls can not be made.
     * </p>
     * 
     * @return When termination settings are disabled, outbound calls can not be made.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * When termination settings are disabled, outbound calls can not be made.
     * </p>
     * 
     * @param disabled
     *        When termination settings are disabled, outbound calls can not be made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Termination withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * When termination settings are disabled, outbound calls can not be made.
     * </p>
     * 
     * @return When termination settings are disabled, outbound calls can not be made.
     */

    public Boolean isDisabled() {
        return this.disabled;
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
        if (getCpsLimit() != null)
            sb.append("CpsLimit: ").append(getCpsLimit()).append(",");
        if (getDefaultPhoneNumber() != null)
            sb.append("DefaultPhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getCallingRegions() != null)
            sb.append("CallingRegions: ").append(getCallingRegions()).append(",");
        if (getCidrAllowedList() != null)
            sb.append("CidrAllowedList: ").append(getCidrAllowedList()).append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Termination == false)
            return false;
        Termination other = (Termination) obj;
        if (other.getCpsLimit() == null ^ this.getCpsLimit() == null)
            return false;
        if (other.getCpsLimit() != null && other.getCpsLimit().equals(this.getCpsLimit()) == false)
            return false;
        if (other.getDefaultPhoneNumber() == null ^ this.getDefaultPhoneNumber() == null)
            return false;
        if (other.getDefaultPhoneNumber() != null && other.getDefaultPhoneNumber().equals(this.getDefaultPhoneNumber()) == false)
            return false;
        if (other.getCallingRegions() == null ^ this.getCallingRegions() == null)
            return false;
        if (other.getCallingRegions() != null && other.getCallingRegions().equals(this.getCallingRegions()) == false)
            return false;
        if (other.getCidrAllowedList() == null ^ this.getCidrAllowedList() == null)
            return false;
        if (other.getCidrAllowedList() != null && other.getCidrAllowedList().equals(this.getCidrAllowedList()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpsLimit() == null) ? 0 : getCpsLimit().hashCode());
        hashCode = prime * hashCode + ((getDefaultPhoneNumber() == null) ? 0 : getDefaultPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getCallingRegions() == null) ? 0 : getCallingRegions().hashCode());
        hashCode = prime * hashCode + ((getCidrAllowedList() == null) ? 0 : getCidrAllowedList().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        return hashCode;
    }

    @Override
    public Termination clone() {
        try {
            return (Termination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.TerminationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
