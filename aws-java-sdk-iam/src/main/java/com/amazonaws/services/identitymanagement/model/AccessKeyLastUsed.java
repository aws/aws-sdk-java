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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about the last time an AWS access key was used since IAM began tracking this information on
 * April 22, 2015.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetAccessKeyLastUsed</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/AccessKeyLastUsed" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessKeyLastUsed implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the access key
     * was most recently used. This field is null in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date lastUsedDate;
    /**
     * <p>
     * The name of the AWS service with which this access key was most recently used. The value of this field is "N/A"
     * in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM started tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     */
    private String serviceName;
    /**
     * <p>
     * The AWS region where this access key was most recently used. The value for this field is "N/A" in the following
     * situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about AWS regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a> in the Amazon Web
     * Services General Reference.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the access key
     * was most recently used. This field is null in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastUsedDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        access key was most recently used. This field is null in the following situations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The user does not have an access key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An access key exists but has not been used since IAM began tracking this information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        There is no sign-in data associated with the user
     *        </p>
     *        </li>
     */

    public void setLastUsedDate(java.util.Date lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the access key
     * was most recently used. This field is null in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         access key was most recently used. This field is null in the following situations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The user does not have an access key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An access key exists but has not been used since IAM began tracking this information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is no sign-in data associated with the user
     *         </p>
     *         </li>
     */

    public java.util.Date getLastUsedDate() {
        return this.lastUsedDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the access key
     * was most recently used. This field is null in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastUsedDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        access key was most recently used. This field is null in the following situations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The user does not have an access key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An access key exists but has not been used since IAM began tracking this information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        There is no sign-in data associated with the user
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKeyLastUsed withLastUsedDate(java.util.Date lastUsedDate) {
        setLastUsedDate(lastUsedDate);
        return this;
    }

    /**
     * <p>
     * The name of the AWS service with which this access key was most recently used. The value of this field is "N/A"
     * in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM started tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * 
     * @param serviceName
     *        The name of the AWS service with which this access key was most recently used. The value of this field is
     *        "N/A" in the following situations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The user does not have an access key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An access key exists but has not been used since IAM started tracking this information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        There is no sign-in data associated with the user
     *        </p>
     *        </li>
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the AWS service with which this access key was most recently used. The value of this field is "N/A"
     * in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM started tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the AWS service with which this access key was most recently used. The value of this field is
     *         "N/A" in the following situations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The user does not have an access key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An access key exists but has not been used since IAM started tracking this information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is no sign-in data associated with the user
     *         </p>
     *         </li>
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the AWS service with which this access key was most recently used. The value of this field is "N/A"
     * in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM started tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * 
     * @param serviceName
     *        The name of the AWS service with which this access key was most recently used. The value of this field is
     *        "N/A" in the following situations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The user does not have an access key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An access key exists but has not been used since IAM started tracking this information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        There is no sign-in data associated with the user
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKeyLastUsed withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The AWS region where this access key was most recently used. The value for this field is "N/A" in the following
     * situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about AWS regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a> in the Amazon Web
     * Services General Reference.
     * </p>
     * 
     * @param region
     *        The AWS region where this access key was most recently used. The value for this field is "N/A" in the
     *        following situations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The user does not have an access key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An access key exists but has not been used since IAM began tracking this information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        There is no sign-in data associated with the user
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about AWS regions, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a> in the Amazon
     *        Web Services General Reference.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS region where this access key was most recently used. The value for this field is "N/A" in the following
     * situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about AWS regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a> in the Amazon Web
     * Services General Reference.
     * </p>
     * 
     * @return The AWS region where this access key was most recently used. The value for this field is "N/A" in the
     *         following situations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The user does not have an access key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An access key exists but has not been used since IAM began tracking this information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is no sign-in data associated with the user
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about AWS regions, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a> in the Amazon
     *         Web Services General Reference.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS region where this access key was most recently used. The value for this field is "N/A" in the following
     * situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about AWS regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a> in the Amazon Web
     * Services General Reference.
     * </p>
     * 
     * @param region
     *        The AWS region where this access key was most recently used. The value for this field is "N/A" in the
     *        following situations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The user does not have an access key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An access key exists but has not been used since IAM began tracking this information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        There is no sign-in data associated with the user
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about AWS regions, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a> in the Amazon
     *        Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKeyLastUsed withRegion(String region) {
        setRegion(region);
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
        if (getLastUsedDate() != null)
            sb.append("LastUsedDate: ").append(getLastUsedDate()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessKeyLastUsed == false)
            return false;
        AccessKeyLastUsed other = (AccessKeyLastUsed) obj;
        if (other.getLastUsedDate() == null ^ this.getLastUsedDate() == null)
            return false;
        if (other.getLastUsedDate() != null && other.getLastUsedDate().equals(this.getLastUsedDate()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastUsedDate() == null) ? 0 : getLastUsedDate().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public AccessKeyLastUsed clone() {
        try {
            return (AccessKeyLastUsed) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
