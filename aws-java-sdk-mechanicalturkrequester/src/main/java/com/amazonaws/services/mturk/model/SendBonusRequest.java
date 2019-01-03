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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/SendBonus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendBonusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Worker being paid the bonus.
     * </p>
     */
    private String workerId;
    /**
     * <p>
     * The Bonus amount is a US Dollar amount specified using a string (for example, "5" represents $5.00 USD and
     * "101.42" represents $101.42 USD). Do not include currency symbols or currency codes.
     * </p>
     */
    private String bonusAmount;
    /**
     * <p>
     * The ID of the assignment for which this bonus is paid.
     * </p>
     */
    private String assignmentId;
    /**
     * <p>
     * A message that explains the reason for the bonus payment. The Worker receiving the bonus can see this message.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * A unique identifier for this request, which allows you to retry the call on error without granting multiple
     * bonuses. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded
     * on the server. If the bonus already exists in the system from a previous call using the same UniqueRequestToken,
     * subsequent calls will return an error with a message containing the request ID.
     * </p>
     */
    private String uniqueRequestToken;

    /**
     * <p>
     * The ID of the Worker being paid the bonus.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker being paid the bonus.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The ID of the Worker being paid the bonus.
     * </p>
     * 
     * @return The ID of the Worker being paid the bonus.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The ID of the Worker being paid the bonus.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker being paid the bonus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBonusRequest withWorkerId(String workerId) {
        setWorkerId(workerId);
        return this;
    }

    /**
     * <p>
     * The Bonus amount is a US Dollar amount specified using a string (for example, "5" represents $5.00 USD and
     * "101.42" represents $101.42 USD). Do not include currency symbols or currency codes.
     * </p>
     * 
     * @param bonusAmount
     *        The Bonus amount is a US Dollar amount specified using a string (for example, "5" represents $5.00 USD and
     *        "101.42" represents $101.42 USD). Do not include currency symbols or currency codes.
     */

    public void setBonusAmount(String bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    /**
     * <p>
     * The Bonus amount is a US Dollar amount specified using a string (for example, "5" represents $5.00 USD and
     * "101.42" represents $101.42 USD). Do not include currency symbols or currency codes.
     * </p>
     * 
     * @return The Bonus amount is a US Dollar amount specified using a string (for example, "5" represents $5.00 USD
     *         and "101.42" represents $101.42 USD). Do not include currency symbols or currency codes.
     */

    public String getBonusAmount() {
        return this.bonusAmount;
    }

    /**
     * <p>
     * The Bonus amount is a US Dollar amount specified using a string (for example, "5" represents $5.00 USD and
     * "101.42" represents $101.42 USD). Do not include currency symbols or currency codes.
     * </p>
     * 
     * @param bonusAmount
     *        The Bonus amount is a US Dollar amount specified using a string (for example, "5" represents $5.00 USD and
     *        "101.42" represents $101.42 USD). Do not include currency symbols or currency codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBonusRequest withBonusAmount(String bonusAmount) {
        setBonusAmount(bonusAmount);
        return this;
    }

    /**
     * <p>
     * The ID of the assignment for which this bonus is paid.
     * </p>
     * 
     * @param assignmentId
     *        The ID of the assignment for which this bonus is paid.
     */

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * <p>
     * The ID of the assignment for which this bonus is paid.
     * </p>
     * 
     * @return The ID of the assignment for which this bonus is paid.
     */

    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * <p>
     * The ID of the assignment for which this bonus is paid.
     * </p>
     * 
     * @param assignmentId
     *        The ID of the assignment for which this bonus is paid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBonusRequest withAssignmentId(String assignmentId) {
        setAssignmentId(assignmentId);
        return this;
    }

    /**
     * <p>
     * A message that explains the reason for the bonus payment. The Worker receiving the bonus can see this message.
     * </p>
     * 
     * @param reason
     *        A message that explains the reason for the bonus payment. The Worker receiving the bonus can see this
     *        message.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A message that explains the reason for the bonus payment. The Worker receiving the bonus can see this message.
     * </p>
     * 
     * @return A message that explains the reason for the bonus payment. The Worker receiving the bonus can see this
     *         message.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A message that explains the reason for the bonus payment. The Worker receiving the bonus can see this message.
     * </p>
     * 
     * @param reason
     *        A message that explains the reason for the bonus payment. The Worker receiving the bonus can see this
     *        message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBonusRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this request, which allows you to retry the call on error without granting multiple
     * bonuses. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded
     * on the server. If the bonus already exists in the system from a previous call using the same UniqueRequestToken,
     * subsequent calls will return an error with a message containing the request ID.
     * </p>
     * 
     * @param uniqueRequestToken
     *        A unique identifier for this request, which allows you to retry the call on error without granting
     *        multiple bonuses. This is useful in cases such as network timeouts where it is unclear whether or not the
     *        call succeeded on the server. If the bonus already exists in the system from a previous call using the
     *        same UniqueRequestToken, subsequent calls will return an error with a message containing the request ID.
     */

    public void setUniqueRequestToken(String uniqueRequestToken) {
        this.uniqueRequestToken = uniqueRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this request, which allows you to retry the call on error without granting multiple
     * bonuses. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded
     * on the server. If the bonus already exists in the system from a previous call using the same UniqueRequestToken,
     * subsequent calls will return an error with a message containing the request ID.
     * </p>
     * 
     * @return A unique identifier for this request, which allows you to retry the call on error without granting
     *         multiple bonuses. This is useful in cases such as network timeouts where it is unclear whether or not the
     *         call succeeded on the server. If the bonus already exists in the system from a previous call using the
     *         same UniqueRequestToken, subsequent calls will return an error with a message containing the request ID.
     */

    public String getUniqueRequestToken() {
        return this.uniqueRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this request, which allows you to retry the call on error without granting multiple
     * bonuses. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded
     * on the server. If the bonus already exists in the system from a previous call using the same UniqueRequestToken,
     * subsequent calls will return an error with a message containing the request ID.
     * </p>
     * 
     * @param uniqueRequestToken
     *        A unique identifier for this request, which allows you to retry the call on error without granting
     *        multiple bonuses. This is useful in cases such as network timeouts where it is unclear whether or not the
     *        call succeeded on the server. If the bonus already exists in the system from a previous call using the
     *        same UniqueRequestToken, subsequent calls will return an error with a message containing the request ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBonusRequest withUniqueRequestToken(String uniqueRequestToken) {
        setUniqueRequestToken(uniqueRequestToken);
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
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId()).append(",");
        if (getBonusAmount() != null)
            sb.append("BonusAmount: ").append(getBonusAmount()).append(",");
        if (getAssignmentId() != null)
            sb.append("AssignmentId: ").append(getAssignmentId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getUniqueRequestToken() != null)
            sb.append("UniqueRequestToken: ").append(getUniqueRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendBonusRequest == false)
            return false;
        SendBonusRequest other = (SendBonusRequest) obj;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        if (other.getBonusAmount() == null ^ this.getBonusAmount() == null)
            return false;
        if (other.getBonusAmount() != null && other.getBonusAmount().equals(this.getBonusAmount()) == false)
            return false;
        if (other.getAssignmentId() == null ^ this.getAssignmentId() == null)
            return false;
        if (other.getAssignmentId() != null && other.getAssignmentId().equals(this.getAssignmentId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getUniqueRequestToken() == null ^ this.getUniqueRequestToken() == null)
            return false;
        if (other.getUniqueRequestToken() != null && other.getUniqueRequestToken().equals(this.getUniqueRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        hashCode = prime * hashCode + ((getBonusAmount() == null) ? 0 : getBonusAmount().hashCode());
        hashCode = prime * hashCode + ((getAssignmentId() == null) ? 0 : getAssignmentId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getUniqueRequestToken() == null) ? 0 : getUniqueRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public SendBonusRequest clone() {
        return (SendBonusRequest) super.clone();
    }

}
