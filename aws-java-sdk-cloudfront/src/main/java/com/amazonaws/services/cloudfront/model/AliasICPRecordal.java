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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * AWS services in China customers must file for an Internet Content Provider (ICP) recordal if they want to serve
 * content publicly on an alternate domain name, also known as a CNAME, that they've added to CloudFront.
 * AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions. The status is returned in
 * the CloudFront response; you can't configure it yourself.
 * </p>
 * <p>
 * For more information about ICP recordals, see <a
 * href="https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"> Signup, Accounts, and
 * Credentials</a> in <i>Getting Started with AWS services in China</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2019-03-26/AliasICPRecordal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AliasICPRecordal implements Serializable, Cloneable {

    /**
     * <p>
     * A domain name associated with a distribution.
     * </p>
     */
    private String cNAME;
    /**
     * <p>
     * The Internet Content Provider (ICP) recordal status for a CNAME. The ICPRecordalStatus is set to APPROVED for all
     * CNAMEs (aliases) in regions outside of China.
     * </p>
     * <p>
     * The status values returned are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>APPROVED</b> indicates that the associated CNAME has a valid ICP recordal number. Multiple CNAMEs can be
     * associated with a distribution, and CNAMEs can correspond to different ICP recordals. To be marked as APPROVED,
     * that is, valid to use with China region, a CNAME must have one ICP recordal number associated with it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUSPENDED</b> indicates that the associated CNAME does not have a valid ICP recordal number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b> indicates that CloudFront can't determine the ICP recordal status of the CNAME associated with the
     * distribution because there was an error in trying to determine the status. You can try again to see if the error
     * is resolved in which case CloudFront returns an APPROVED or SUSPENDED status.
     * </p>
     * </li>
     * </ul>
     */
    private String iCPRecordalStatus;

    /**
     * <p>
     * A domain name associated with a distribution.
     * </p>
     * 
     * @param cNAME
     *        A domain name associated with a distribution.
     */

    public void setCNAME(String cNAME) {
        this.cNAME = cNAME;
    }

    /**
     * <p>
     * A domain name associated with a distribution.
     * </p>
     * 
     * @return A domain name associated with a distribution.
     */

    public String getCNAME() {
        return this.cNAME;
    }

    /**
     * <p>
     * A domain name associated with a distribution.
     * </p>
     * 
     * @param cNAME
     *        A domain name associated with a distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AliasICPRecordal withCNAME(String cNAME) {
        setCNAME(cNAME);
        return this;
    }

    /**
     * <p>
     * The Internet Content Provider (ICP) recordal status for a CNAME. The ICPRecordalStatus is set to APPROVED for all
     * CNAMEs (aliases) in regions outside of China.
     * </p>
     * <p>
     * The status values returned are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>APPROVED</b> indicates that the associated CNAME has a valid ICP recordal number. Multiple CNAMEs can be
     * associated with a distribution, and CNAMEs can correspond to different ICP recordals. To be marked as APPROVED,
     * that is, valid to use with China region, a CNAME must have one ICP recordal number associated with it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUSPENDED</b> indicates that the associated CNAME does not have a valid ICP recordal number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b> indicates that CloudFront can't determine the ICP recordal status of the CNAME associated with the
     * distribution because there was an error in trying to determine the status. You can try again to see if the error
     * is resolved in which case CloudFront returns an APPROVED or SUSPENDED status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param iCPRecordalStatus
     *        The Internet Content Provider (ICP) recordal status for a CNAME. The ICPRecordalStatus is set to APPROVED
     *        for all CNAMEs (aliases) in regions outside of China. </p>
     *        <p>
     *        The status values returned are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>APPROVED</b> indicates that the associated CNAME has a valid ICP recordal number. Multiple CNAMEs can
     *        be associated with a distribution, and CNAMEs can correspond to different ICP recordals. To be marked as
     *        APPROVED, that is, valid to use with China region, a CNAME must have one ICP recordal number associated
     *        with it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUSPENDED</b> indicates that the associated CNAME does not have a valid ICP recordal number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING</b> indicates that CloudFront can't determine the ICP recordal status of the CNAME associated
     *        with the distribution because there was an error in trying to determine the status. You can try again to
     *        see if the error is resolved in which case CloudFront returns an APPROVED or SUSPENDED status.
     *        </p>
     *        </li>
     * @see ICPRecordalStatus
     */

    public void setICPRecordalStatus(String iCPRecordalStatus) {
        this.iCPRecordalStatus = iCPRecordalStatus;
    }

    /**
     * <p>
     * The Internet Content Provider (ICP) recordal status for a CNAME. The ICPRecordalStatus is set to APPROVED for all
     * CNAMEs (aliases) in regions outside of China.
     * </p>
     * <p>
     * The status values returned are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>APPROVED</b> indicates that the associated CNAME has a valid ICP recordal number. Multiple CNAMEs can be
     * associated with a distribution, and CNAMEs can correspond to different ICP recordals. To be marked as APPROVED,
     * that is, valid to use with China region, a CNAME must have one ICP recordal number associated with it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUSPENDED</b> indicates that the associated CNAME does not have a valid ICP recordal number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b> indicates that CloudFront can't determine the ICP recordal status of the CNAME associated with the
     * distribution because there was an error in trying to determine the status. You can try again to see if the error
     * is resolved in which case CloudFront returns an APPROVED or SUSPENDED status.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Internet Content Provider (ICP) recordal status for a CNAME. The ICPRecordalStatus is set to APPROVED
     *         for all CNAMEs (aliases) in regions outside of China. </p>
     *         <p>
     *         The status values returned are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>APPROVED</b> indicates that the associated CNAME has a valid ICP recordal number. Multiple CNAMEs can
     *         be associated with a distribution, and CNAMEs can correspond to different ICP recordals. To be marked as
     *         APPROVED, that is, valid to use with China region, a CNAME must have one ICP recordal number associated
     *         with it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SUSPENDED</b> indicates that the associated CNAME does not have a valid ICP recordal number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PENDING</b> indicates that CloudFront can't determine the ICP recordal status of the CNAME associated
     *         with the distribution because there was an error in trying to determine the status. You can try again to
     *         see if the error is resolved in which case CloudFront returns an APPROVED or SUSPENDED status.
     *         </p>
     *         </li>
     * @see ICPRecordalStatus
     */

    public String getICPRecordalStatus() {
        return this.iCPRecordalStatus;
    }

    /**
     * <p>
     * The Internet Content Provider (ICP) recordal status for a CNAME. The ICPRecordalStatus is set to APPROVED for all
     * CNAMEs (aliases) in regions outside of China.
     * </p>
     * <p>
     * The status values returned are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>APPROVED</b> indicates that the associated CNAME has a valid ICP recordal number. Multiple CNAMEs can be
     * associated with a distribution, and CNAMEs can correspond to different ICP recordals. To be marked as APPROVED,
     * that is, valid to use with China region, a CNAME must have one ICP recordal number associated with it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUSPENDED</b> indicates that the associated CNAME does not have a valid ICP recordal number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b> indicates that CloudFront can't determine the ICP recordal status of the CNAME associated with the
     * distribution because there was an error in trying to determine the status. You can try again to see if the error
     * is resolved in which case CloudFront returns an APPROVED or SUSPENDED status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param iCPRecordalStatus
     *        The Internet Content Provider (ICP) recordal status for a CNAME. The ICPRecordalStatus is set to APPROVED
     *        for all CNAMEs (aliases) in regions outside of China. </p>
     *        <p>
     *        The status values returned are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>APPROVED</b> indicates that the associated CNAME has a valid ICP recordal number. Multiple CNAMEs can
     *        be associated with a distribution, and CNAMEs can correspond to different ICP recordals. To be marked as
     *        APPROVED, that is, valid to use with China region, a CNAME must have one ICP recordal number associated
     *        with it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUSPENDED</b> indicates that the associated CNAME does not have a valid ICP recordal number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING</b> indicates that CloudFront can't determine the ICP recordal status of the CNAME associated
     *        with the distribution because there was an error in trying to determine the status. You can try again to
     *        see if the error is resolved in which case CloudFront returns an APPROVED or SUSPENDED status.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ICPRecordalStatus
     */

    public AliasICPRecordal withICPRecordalStatus(String iCPRecordalStatus) {
        setICPRecordalStatus(iCPRecordalStatus);
        return this;
    }

    /**
     * <p>
     * The Internet Content Provider (ICP) recordal status for a CNAME. The ICPRecordalStatus is set to APPROVED for all
     * CNAMEs (aliases) in regions outside of China.
     * </p>
     * <p>
     * The status values returned are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>APPROVED</b> indicates that the associated CNAME has a valid ICP recordal number. Multiple CNAMEs can be
     * associated with a distribution, and CNAMEs can correspond to different ICP recordals. To be marked as APPROVED,
     * that is, valid to use with China region, a CNAME must have one ICP recordal number associated with it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUSPENDED</b> indicates that the associated CNAME does not have a valid ICP recordal number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b> indicates that CloudFront can't determine the ICP recordal status of the CNAME associated with the
     * distribution because there was an error in trying to determine the status. You can try again to see if the error
     * is resolved in which case CloudFront returns an APPROVED or SUSPENDED status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param iCPRecordalStatus
     *        The Internet Content Provider (ICP) recordal status for a CNAME. The ICPRecordalStatus is set to APPROVED
     *        for all CNAMEs (aliases) in regions outside of China. </p>
     *        <p>
     *        The status values returned are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>APPROVED</b> indicates that the associated CNAME has a valid ICP recordal number. Multiple CNAMEs can
     *        be associated with a distribution, and CNAMEs can correspond to different ICP recordals. To be marked as
     *        APPROVED, that is, valid to use with China region, a CNAME must have one ICP recordal number associated
     *        with it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUSPENDED</b> indicates that the associated CNAME does not have a valid ICP recordal number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING</b> indicates that CloudFront can't determine the ICP recordal status of the CNAME associated
     *        with the distribution because there was an error in trying to determine the status. You can try again to
     *        see if the error is resolved in which case CloudFront returns an APPROVED or SUSPENDED status.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ICPRecordalStatus
     */

    public AliasICPRecordal withICPRecordalStatus(ICPRecordalStatus iCPRecordalStatus) {
        this.iCPRecordalStatus = iCPRecordalStatus.toString();
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
        if (getCNAME() != null)
            sb.append("CNAME: ").append(getCNAME()).append(",");
        if (getICPRecordalStatus() != null)
            sb.append("ICPRecordalStatus: ").append(getICPRecordalStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AliasICPRecordal == false)
            return false;
        AliasICPRecordal other = (AliasICPRecordal) obj;
        if (other.getCNAME() == null ^ this.getCNAME() == null)
            return false;
        if (other.getCNAME() != null && other.getCNAME().equals(this.getCNAME()) == false)
            return false;
        if (other.getICPRecordalStatus() == null ^ this.getICPRecordalStatus() == null)
            return false;
        if (other.getICPRecordalStatus() != null && other.getICPRecordalStatus().equals(this.getICPRecordalStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCNAME() == null) ? 0 : getCNAME().hashCode());
        hashCode = prime * hashCode + ((getICPRecordalStatus() == null) ? 0 : getICPRecordalStatus().hashCode());
        return hashCode;
    }

    @Override
    public AliasICPRecordal clone() {
        try {
            return (AliasICPRecordal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
