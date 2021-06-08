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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains finding details that are specific to control-based findings. Only returned for findings generated from
 * controls.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Compliance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Compliance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * The valid values for <code>Status</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code> - Standards check passed for all evaluated resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - Some information is missing or this check is not supported for your configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standards check failed for at least one evaluated resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage, API error, or because the
     * result of the AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation result was
     * <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub automatically archives the finding.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * For a control, the industry or regulatory framework requirements that are related to the control. The check for
     * that control is aligned with these requirements.
     * </p>
     */
    private java.util.List<String> relatedRequirements;
    /**
     * <p>
     * For findings generated from controls, a list of reasons behind the value of <code>Status</code>. For the list of
     * status reason codes and their meanings, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     */
    private java.util.List<StatusReason> statusReasons;

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * The valid values for <code>Status</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code> - Standards check passed for all evaluated resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - Some information is missing or this check is not supported for your configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standards check failed for at least one evaluated resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage, API error, or because the
     * result of the AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation result was
     * <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub automatically archives the finding.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param status
     *        The result of a standards check.</p>
     *        <p>
     *        The valid values for <code>Status</code> are as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASSED</code> - Standards check passed for all evaluated resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARNING</code> - Some information is missing or this check is not supported for your configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Standards check failed for at least one evaluated resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage, API error, or because
     *        the result of the AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation
     *        result was <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub automatically archives the
     *        finding.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see ComplianceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * The valid values for <code>Status</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code> - Standards check passed for all evaluated resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - Some information is missing or this check is not supported for your configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standards check failed for at least one evaluated resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage, API error, or because the
     * result of the AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation result was
     * <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub automatically archives the finding.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The result of a standards check.</p>
     *         <p>
     *         The valid values for <code>Status</code> are as follows.
     *         </p>
     *         <ul>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PASSED</code> - Standards check passed for all evaluated resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WARNING</code> - Some information is missing or this check is not supported for your configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Standards check failed for at least one evaluated resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage, API error, or because
     *         the result of the AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation
     *         result was <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub automatically archives the
     *         finding.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see ComplianceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * The valid values for <code>Status</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code> - Standards check passed for all evaluated resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - Some information is missing or this check is not supported for your configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standards check failed for at least one evaluated resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage, API error, or because the
     * result of the AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation result was
     * <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub automatically archives the finding.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param status
     *        The result of a standards check.</p>
     *        <p>
     *        The valid values for <code>Status</code> are as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASSED</code> - Standards check passed for all evaluated resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARNING</code> - Some information is missing or this check is not supported for your configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Standards check failed for at least one evaluated resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage, API error, or because
     *        the result of the AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation
     *        result was <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub automatically archives the
     *        finding.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public Compliance withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * The valid values for <code>Status</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code> - Standards check passed for all evaluated resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - Some information is missing or this check is not supported for your configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standards check failed for at least one evaluated resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage, API error, or because the
     * result of the AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation result was
     * <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub automatically archives the finding.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param status
     *        The result of a standards check.</p>
     *        <p>
     *        The valid values for <code>Status</code> are as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASSED</code> - Standards check passed for all evaluated resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARNING</code> - Some information is missing or this check is not supported for your configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Standards check failed for at least one evaluated resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage, API error, or because
     *        the result of the AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation
     *        result was <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub automatically archives the
     *        finding.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public Compliance withStatus(ComplianceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * For a control, the industry or regulatory framework requirements that are related to the control. The check for
     * that control is aligned with these requirements.
     * </p>
     * 
     * @return For a control, the industry or regulatory framework requirements that are related to the control. The
     *         check for that control is aligned with these requirements.
     */

    public java.util.List<String> getRelatedRequirements() {
        return relatedRequirements;
    }

    /**
     * <p>
     * For a control, the industry or regulatory framework requirements that are related to the control. The check for
     * that control is aligned with these requirements.
     * </p>
     * 
     * @param relatedRequirements
     *        For a control, the industry or regulatory framework requirements that are related to the control. The
     *        check for that control is aligned with these requirements.
     */

    public void setRelatedRequirements(java.util.Collection<String> relatedRequirements) {
        if (relatedRequirements == null) {
            this.relatedRequirements = null;
            return;
        }

        this.relatedRequirements = new java.util.ArrayList<String>(relatedRequirements);
    }

    /**
     * <p>
     * For a control, the industry or regulatory framework requirements that are related to the control. The check for
     * that control is aligned with these requirements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedRequirements(java.util.Collection)} or {@link #withRelatedRequirements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param relatedRequirements
     *        For a control, the industry or regulatory framework requirements that are related to the control. The
     *        check for that control is aligned with these requirements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compliance withRelatedRequirements(String... relatedRequirements) {
        if (this.relatedRequirements == null) {
            setRelatedRequirements(new java.util.ArrayList<String>(relatedRequirements.length));
        }
        for (String ele : relatedRequirements) {
            this.relatedRequirements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a control, the industry or regulatory framework requirements that are related to the control. The check for
     * that control is aligned with these requirements.
     * </p>
     * 
     * @param relatedRequirements
     *        For a control, the industry or regulatory framework requirements that are related to the control. The
     *        check for that control is aligned with these requirements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compliance withRelatedRequirements(java.util.Collection<String> relatedRequirements) {
        setRelatedRequirements(relatedRequirements);
        return this;
    }

    /**
     * <p>
     * For findings generated from controls, a list of reasons behind the value of <code>Status</code>. For the list of
     * status reason codes and their meanings, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @return For findings generated from controls, a list of reasons behind the value of <code>Status</code>. For the
     *         list of status reason codes and their meanings, see <a href=
     *         "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     *         >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     */

    public java.util.List<StatusReason> getStatusReasons() {
        return statusReasons;
    }

    /**
     * <p>
     * For findings generated from controls, a list of reasons behind the value of <code>Status</code>. For the list of
     * status reason codes and their meanings, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param statusReasons
     *        For findings generated from controls, a list of reasons behind the value of <code>Status</code>. For the
     *        list of status reason codes and their meanings, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     *        >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     */

    public void setStatusReasons(java.util.Collection<StatusReason> statusReasons) {
        if (statusReasons == null) {
            this.statusReasons = null;
            return;
        }

        this.statusReasons = new java.util.ArrayList<StatusReason>(statusReasons);
    }

    /**
     * <p>
     * For findings generated from controls, a list of reasons behind the value of <code>Status</code>. For the list of
     * status reason codes and their meanings, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusReasons(java.util.Collection)} or {@link #withStatusReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param statusReasons
     *        For findings generated from controls, a list of reasons behind the value of <code>Status</code>. For the
     *        list of status reason codes and their meanings, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     *        >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compliance withStatusReasons(StatusReason... statusReasons) {
        if (this.statusReasons == null) {
            setStatusReasons(new java.util.ArrayList<StatusReason>(statusReasons.length));
        }
        for (StatusReason ele : statusReasons) {
            this.statusReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For findings generated from controls, a list of reasons behind the value of <code>Status</code>. For the list of
     * status reason codes and their meanings, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param statusReasons
     *        For findings generated from controls, a list of reasons behind the value of <code>Status</code>. For the
     *        list of status reason codes and their meanings, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     *        >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compliance withStatusReasons(java.util.Collection<StatusReason> statusReasons) {
        setStatusReasons(statusReasons);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRelatedRequirements() != null)
            sb.append("RelatedRequirements: ").append(getRelatedRequirements()).append(",");
        if (getStatusReasons() != null)
            sb.append("StatusReasons: ").append(getStatusReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Compliance == false)
            return false;
        Compliance other = (Compliance) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRelatedRequirements() == null ^ this.getRelatedRequirements() == null)
            return false;
        if (other.getRelatedRequirements() != null && other.getRelatedRequirements().equals(this.getRelatedRequirements()) == false)
            return false;
        if (other.getStatusReasons() == null ^ this.getStatusReasons() == null)
            return false;
        if (other.getStatusReasons() != null && other.getStatusReasons().equals(this.getStatusReasons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRelatedRequirements() == null) ? 0 : getRelatedRequirements().hashCode());
        hashCode = prime * hashCode + ((getStatusReasons() == null) ? 0 : getStatusReasons().hashCode());
        return hashCode;
    }

    @Override
    public Compliance clone() {
        try {
            return (Compliance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ComplianceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
